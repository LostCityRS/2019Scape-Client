package com.jagex.core.io;

import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ua")
public class SocketStreamReader implements Runnable {

	@ObfuscatedName("ua.e")
	public Thread thread;

	@ObfuscatedName("ua.n")
	public InputStream inputStream;

	@ObfuscatedName("ua.m")
	public int bufLimit;

	@ObfuscatedName("ua.k")
	public byte[] buf;

	@ObfuscatedName("ua.f")
	public int bufPos = 0;

	@ObfuscatedName("ua.w")
	public int bufLen = 0;

	@ObfuscatedName("ua.l")
	public IOException ioerror;

	public SocketStreamReader(InputStream inputStream, int limit) {
		this.inputStream = inputStream;
		this.bufLimit = limit + 1;
		this.buf = new byte[this.bufLimit];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	public void run() {
		while (true) {
			int available;
			synchronized (this) {
				while (true) {
					if (this.ioerror != null) {
						return;
					}
					if (this.bufPos == 0) {
						available = this.bufLimit - this.bufLen - 1;
					} else if (this.bufPos <= this.bufLen) {
						available = this.bufLimit - this.bufLen;
					} else {
						available = this.bufPos - this.bufLen - 1;
					}
					if (available > 0) {
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException exception) {
					}
				}
			}
			int read;
			try {
				read = this.inputStream.read(this.buf, this.bufLen, available);
				if (read == -1) {
					throw new EOFException();
				}
			} catch (IOException exception) {
				IOException var6 = exception;
				synchronized (this) {
					this.ioerror = var6;
					return;
				}
			}
			synchronized (this) {
				this.bufLen = (this.bufLen + read) % this.bufLimit;
			}
		}
	}

	@ObfuscatedName("ua.e(II)Z")
	public boolean hasAvailable(int amount) throws IOException {
		if (amount == 0) {
			return true;
		} else if (amount > 0 && amount < this.bufLimit) {
			synchronized (this) {
				int available;
				if (this.bufPos <= this.bufLen) {
					available = this.bufLen - this.bufPos;
				} else {
					available = this.bufLen + (this.bufLimit - this.bufPos);
				}
				if (available >= amount) {
					return true;
				} else if (this.ioerror == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.ioerror.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ua.n(I)I")
	public int available() throws IOException {
		synchronized (this) {
			int available;
			if (this.bufPos <= this.bufLen) {
				available = this.bufLen - this.bufPos;
			} else {
				available = this.bufLen + (this.bufLimit - this.bufPos);
			}
			if (available <= 0 && this.ioerror != null) {
				throw new IOException(this.ioerror.toString());
			}
			this.notifyAll();
			return available;
		}
	}

	@ObfuscatedName("ua.m([BIII)I")
	public int read(byte[] bytes, int off, int len) throws IOException {
		if (len < 0 || off < 0 || off + len > bytes.length) {
			throw new IOException();
		}
		synchronized (this) {
			int available;
			if (this.bufPos <= this.bufLen) {
				available = this.bufLen - this.bufPos;
			} else {
				available = this.bufLen + (this.bufLimit - this.bufPos);
			}
			if (len > available) {
				len = available;
			}
			if (len == 0 && this.ioerror != null) {
				throw new IOException(this.ioerror.toString());
			}
			if (this.bufPos + len <= this.bufLimit) {
				System.arraycopy(this.buf, this.bufPos, bytes, off, len);
			} else {
				int remaining = this.bufLimit - this.bufPos;
				System.arraycopy(this.buf, this.bufPos, bytes, off, remaining);
				System.arraycopy(this.buf, 0, bytes, off + remaining, len - remaining);
			}
			this.bufPos = (this.bufPos + len) % this.bufLimit;
			this.notifyAll();
			return len;
		}
	}

	@ObfuscatedName("ua.k(I)V")
	public void closeGracefully() {
		synchronized (this) {
			if (this.ioerror == null) {
				this.ioerror = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.thread.join();
		} catch (InterruptedException exception) {
		}
	}

	@ObfuscatedName("ua.f(I)V")
	public void closeForcefully() {
		this.inputStream = new BrokenInputStream();
	}
}

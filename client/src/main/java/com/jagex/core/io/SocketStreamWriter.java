package com.jagex.core.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("ug")
public class SocketStreamWriter implements Runnable {

	@ObfuscatedName("ug.e")
	public Thread thread;

	@ObfuscatedName("ug.n")
	public OutputStream outputStream;

	@ObfuscatedName("ug.m")
	public int bufLimit;

	@ObfuscatedName("ug.k")
	public byte[] buf;

	@ObfuscatedName("ug.f")
	public int bufLen = 0;

	@ObfuscatedName("ug.w")
	public int bufPos = 0;

	@ObfuscatedName("ug.l")
	public IOException ioerror;

	@ObfuscatedName("ug.u")
	public boolean closed;

	public SocketStreamWriter(OutputStream outputStream, int limit) {
		this.outputStream = outputStream;
		this.bufLimit = limit + 1;
		this.buf = new byte[this.bufLimit];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("ug.e(B)Z")
	public boolean isClosed() {
		if (!this.closed) {
			return false;
		}
		try {
			this.outputStream.close();
			if (this.ioerror == null) {
				this.ioerror = new IOException("");
			}
		} catch (IOException var2) {
			if (this.ioerror == null) {
				this.ioerror = new IOException(var2);
			}
		}
		return true;
	}

	public void run() {
		do {
			int available;
			synchronized (this) {
				while (true) {
					if (this.ioerror != null) {
						return;
					}
					if (this.bufLen <= this.bufPos) {
						available = this.bufPos - this.bufLen;
					} else {
						available = this.bufPos + (this.bufLimit - this.bufLen);
					}
					if (available > 0) {
						break;
					}
					try {
						this.outputStream.flush();
					} catch (IOException exception) {
						this.ioerror = exception;
						return;
					}
					if (this.isClosed()) {
						return;
					}
					try {
						this.wait();
					} catch (InterruptedException exception) {
					}
				}
			}
			try {
				if (this.bufLen + available <= this.bufLimit) {
					this.outputStream.write(this.buf, this.bufLen, available);
				} else {
					int var6 = this.bufLimit - this.bufLen;
					this.outputStream.write(this.buf, this.bufLen, var6);
					this.outputStream.write(this.buf, 0, available - var6);
				}
			} catch (IOException exception) {
				IOException var7 = exception;
				synchronized (this) {
					this.ioerror = var7;
					return;
				}
			}
			synchronized (this) {
				this.bufLen = (this.bufLen + available) % this.bufLimit;
			}
		} while (!this.isClosed());
	}

	@ObfuscatedName("ug.n([BIIB)V")
	public void write(byte[] bytes, int off, int len) throws IOException {
		if (len < 0 || off < 0 || off + len > bytes.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.ioerror != null) {
				throw new IOException(this.ioerror.toString());
			}
			int available;
			if (this.bufLen <= this.bufPos) {
				available = this.bufLen + (this.bufLimit - this.bufPos) - 1;
			} else {
				available = this.bufLen - this.bufPos - 1;
			}
			if (available < len) {
				throw new IOException("");
			}
			if (this.bufPos + len <= this.bufLimit) {
				System.arraycopy(bytes, off, this.buf, this.bufPos, len);
			} else {
				int remaining = this.bufLimit - this.bufPos;
				System.arraycopy(bytes, off, this.buf, this.bufPos, remaining);
				System.arraycopy(bytes, off + remaining, this.buf, 0, len - remaining);
			}
			this.bufPos = (this.bufPos + len) % this.bufLimit;
			this.notifyAll();
		}
	}

	@ObfuscatedName("ug.m(B)V")
	public void closeGracefully() {
		synchronized (this) {
			this.closed = true;
			this.notifyAll();
		}
		try {
			this.thread.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("ug.k(I)V")
	public void closeForcefully() {
		this.outputStream = new BrokenOutputStream();
	}
}

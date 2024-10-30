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

	public SocketStreamReader(InputStream arg0, int arg1) {
		this.inputStream = arg0;
		this.bufLimit = arg1 + 1;
		this.buf = new byte[this.bufLimit];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	public void run() {
		while (true) {
			int var2;
			synchronized (this) {
				while (true) {
					if (this.ioerror != null) {
						return;
					}
					if (this.bufPos == 0) {
						var2 = this.bufLimit - this.bufLen - 1;
					} else if (this.bufPos <= this.bufLen) {
						var2 = this.bufLimit - this.bufLen;
					} else {
						var2 = this.bufPos - this.bufLen - 1;
					}
					if (var2 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException var13) {
					}
				}
			}
			int var5;
			try {
				var5 = this.inputStream.read(this.buf, this.bufLen, var2);
				if (var5 == -1) {
					throw new EOFException();
				}
			} catch (IOException var14) {
				IOException var6 = var14;
				synchronized (this) {
					this.ioerror = var6;
					return;
				}
			}
			synchronized (this) {
				this.bufLen = (this.bufLen + var5) % this.bufLimit;
			}
		}
	}

	@ObfuscatedName("ua.e(II)Z")
	public boolean hasAvailable(int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.bufLimit) {
			synchronized (this) {
				int var3;
				if (this.bufPos <= this.bufLen) {
					var3 = this.bufLen - this.bufPos;
				} else {
					var3 = this.bufLen + (this.bufLimit - this.bufPos);
				}
				if (var3 >= arg0) {
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
			int var2;
			if (this.bufPos <= this.bufLen) {
				var2 = this.bufLen - this.bufPos;
			} else {
				var2 = this.bufLen + (this.bufLimit - this.bufPos);
			}
			if (var2 <= 0 && this.ioerror != null) {
				throw new IOException(this.ioerror.toString());
			}
			this.notifyAll();
			return var2;
		}
	}

	@ObfuscatedName("ua.m([BIII)I")
	public int read(byte[] arg0, int arg1, int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			int var5;
			if (this.bufPos <= this.bufLen) {
				var5 = this.bufLen - this.bufPos;
			} else {
				var5 = this.bufLen + (this.bufLimit - this.bufPos);
			}
			if (arg2 > var5) {
				arg2 = var5;
			}
			if (arg2 == 0 && this.ioerror != null) {
				throw new IOException(this.ioerror.toString());
			}
			if (this.bufPos + arg2 <= this.bufLimit) {
				System.arraycopy(this.buf, this.bufPos, arg0, arg1, arg2);
			} else {
				int var6 = this.bufLimit - this.bufPos;
				System.arraycopy(this.buf, this.bufPos, arg0, arg1, var6);
				System.arraycopy(this.buf, 0, arg0, arg1 + var6, arg2 - var6);
			}
			this.bufPos = (this.bufPos + arg2) % this.bufLimit;
			this.notifyAll();
			return arg2;
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
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("ua.f(I)V")
	public void closeForcefully() {
		this.inputStream = new BrokenInputStream();
	}
}

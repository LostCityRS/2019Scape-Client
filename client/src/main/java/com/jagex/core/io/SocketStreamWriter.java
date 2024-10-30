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

	public SocketStreamWriter(OutputStream arg0, int arg1) {
		this.outputStream = arg0;
		this.bufLimit = arg1 + 1;
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
			int var2;
			synchronized (this) {
				while (true) {
					if (this.ioerror != null) {
						return;
					}
					if (this.bufLen <= this.bufPos) {
						var2 = this.bufPos - this.bufLen;
					} else {
						var2 = this.bufPos + (this.bufLimit - this.bufLen);
					}
					if (var2 > 0) {
						break;
					}
					try {
						this.outputStream.flush();
					} catch (IOException var15) {
						this.ioerror = var15;
						return;
					}
					if (this.isClosed()) {
						return;
					}
					try {
						this.wait();
					} catch (InterruptedException var16) {
					}
				}
			}
			try {
				if (this.bufLen + var2 <= this.bufLimit) {
					this.outputStream.write(this.buf, this.bufLen, var2);
				} else {
					int var6 = this.bufLimit - this.bufLen;
					this.outputStream.write(this.buf, this.bufLen, var6);
					this.outputStream.write(this.buf, 0, var2 - var6);
				}
			} catch (IOException var14) {
				IOException var7 = var14;
				synchronized (this) {
					this.ioerror = var7;
					return;
				}
			}
			synchronized (this) {
				this.bufLen = (this.bufLen + var2) % this.bufLimit;
			}
		} while (!this.isClosed());
	}

	@ObfuscatedName("ug.n([BIIB)V")
	public void write(byte[] arg0, int arg1, int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.ioerror != null) {
				throw new IOException(this.ioerror.toString());
			}
			int var5;
			if (this.bufLen <= this.bufPos) {
				var5 = this.bufLen + (this.bufLimit - this.bufPos) - 1;
			} else {
				var5 = this.bufLen - this.bufPos - 1;
			}
			if (var5 < arg2) {
				throw new IOException("");
			}
			if (this.bufPos + arg2 <= this.bufLimit) {
				System.arraycopy(arg0, arg1, this.buf, this.bufPos, arg2);
			} else {
				int var6 = this.bufLimit - this.bufPos;
				System.arraycopy(arg0, arg1, this.buf, this.bufPos, var6);
				System.arraycopy(arg0, arg1 + var6, this.buf, 0, arg2 - var6);
			}
			this.bufPos = (this.bufPos + arg2) % this.bufLimit;
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

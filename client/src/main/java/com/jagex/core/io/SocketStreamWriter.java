package com.jagex.core.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("ug")
public class SocketStreamWriter implements Runnable {

	@ObfuscatedName("ug.e")
	public Thread field7097;

	@ObfuscatedName("ug.n")
	public OutputStream field7093;

	@ObfuscatedName("ug.m")
	public int field7094;

	@ObfuscatedName("ug.k")
	public byte[] field7095;

	@ObfuscatedName("ug.f")
	public int field7099 = 0;

	@ObfuscatedName("ug.w")
	public int field7098 = 0;

	@ObfuscatedName("ug.l")
	public IOException field7096;

	@ObfuscatedName("ug.u")
	public boolean field7092;

	public SocketStreamWriter(OutputStream arg0, int arg1) {
		this.field7093 = arg0;
		this.field7094 = arg1 + 1;
		this.field7095 = new byte[this.field7094];
		this.field7097 = new Thread(this);
		this.field7097.setDaemon(true);
		this.field7097.start();
	}

	@ObfuscatedName("ug.e(B)Z")
	public boolean method9051() {
		if (!this.field7092) {
			return false;
		}
		try {
			this.field7093.close();
			if (this.field7096 == null) {
				this.field7096 = new IOException("");
			}
		} catch (IOException var2) {
			if (this.field7096 == null) {
				this.field7096 = new IOException(var2);
			}
		}
		return true;
	}

	public void run() {
		do {
			int var2;
			synchronized (this) {
				while (true) {
					if (this.field7096 != null) {
						return;
					}
					if (this.field7099 <= this.field7098) {
						var2 = this.field7098 - this.field7099;
					} else {
						var2 = this.field7098 + (this.field7094 - this.field7099);
					}
					if (var2 > 0) {
						break;
					}
					try {
						this.field7093.flush();
					} catch (IOException var15) {
						this.field7096 = var15;
						return;
					}
					if (this.method9051()) {
						return;
					}
					try {
						this.wait();
					} catch (InterruptedException var16) {
					}
				}
			}
			try {
				if (this.field7099 + var2 <= this.field7094) {
					this.field7093.write(this.field7095, this.field7099, var2);
				} else {
					int var6 = this.field7094 - this.field7099;
					this.field7093.write(this.field7095, this.field7099, var6);
					this.field7093.write(this.field7095, 0, var2 - var6);
				}
			} catch (IOException var14) {
				IOException var7 = var14;
				synchronized (this) {
					this.field7096 = var7;
					return;
				}
			}
			synchronized (this) {
				this.field7099 = (this.field7099 + var2) % this.field7094;
			}
		} while (!this.method9051());
	}

	@ObfuscatedName("ug.n([BIIB)V")
	public void method9054(byte[] arg0, int arg1, int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.field7096 != null) {
				throw new IOException(this.field7096.toString());
			}
			int var5;
			if (this.field7099 <= this.field7098) {
				var5 = this.field7099 + (this.field7094 - this.field7098) - 1;
			} else {
				var5 = this.field7099 - this.field7098 - 1;
			}
			if (var5 < arg2) {
				throw new IOException("");
			}
			if (this.field7098 + arg2 <= this.field7094) {
				System.arraycopy(arg0, arg1, this.field7095, this.field7098, arg2);
			} else {
				int var6 = this.field7094 - this.field7098;
				System.arraycopy(arg0, arg1, this.field7095, this.field7098, var6);
				System.arraycopy(arg0, arg1 + var6, this.field7095, 0, arg2 - var6);
			}
			this.field7098 = (this.field7098 + arg2) % this.field7094;
			this.notifyAll();
		}
	}

	@ObfuscatedName("ug.m(B)V")
	public void method9055() {
		synchronized (this) {
			this.field7092 = true;
			this.notifyAll();
		}
		try {
			this.field7097.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("ug.k(I)V")
	public void method9056() {
		this.field7093 = new BrokenOutputStream();
	}
}

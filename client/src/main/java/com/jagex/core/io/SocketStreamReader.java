package com.jagex.core.io;

import com.jagex.core.io.BrokenInputStream;
import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ua")
public class SocketStreamReader implements Runnable {

	@ObfuscatedName("ua.e")
	public Thread field7081;

	@ObfuscatedName("ua.n")
	public InputStream field7080;

	@ObfuscatedName("ua.m")
	public int field7079;

	@ObfuscatedName("ua.k")
	public byte[] field7078;

	@ObfuscatedName("ua.f")
	public int field7082 = 0;

	@ObfuscatedName("ua.w")
	public int field7083 = 0;

	@ObfuscatedName("ua.l")
	public IOException field7084;

	public SocketStreamReader(InputStream arg0, int arg1) {
		this.field7080 = arg0;
		this.field7079 = arg1 + 1;
		this.field7078 = new byte[this.field7079];
		this.field7081 = new Thread(this);
		this.field7081.setDaemon(true);
		this.field7081.start();
	}

	public void run() {
		while (true) {
			int var2;
			synchronized (this) {
				while (true) {
					if (this.field7084 != null) {
						return;
					}
					if (this.field7082 == 0) {
						var2 = this.field7079 - this.field7083 - 1;
					} else if (this.field7082 <= this.field7083) {
						var2 = this.field7079 - this.field7083;
					} else {
						var2 = this.field7082 - this.field7083 - 1;
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
				var5 = this.field7080.read(this.field7078, this.field7083, var2);
				if (var5 == -1) {
					throw new EOFException();
				}
			} catch (IOException var14) {
				IOException var6 = var14;
				synchronized (this) {
					this.field7084 = var6;
					return;
				}
			}
			synchronized (this) {
				this.field7083 = (this.field7083 + var5) % this.field7079;
			}
		}
	}

	@ObfuscatedName("ua.e(II)Z")
	public boolean method8991(int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.field7079) {
			synchronized (this) {
				int var3;
				if (this.field7082 <= this.field7083) {
					var3 = this.field7083 - this.field7082;
				} else {
					var3 = this.field7083 + (this.field7079 - this.field7082);
				}
				if (var3 >= arg0) {
					return true;
				} else if (this.field7084 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.field7084.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ua.n(I)I")
	public int method8983() throws IOException {
		synchronized (this) {
			int var2;
			if (this.field7082 <= this.field7083) {
				var2 = this.field7083 - this.field7082;
			} else {
				var2 = this.field7083 + (this.field7079 - this.field7082);
			}
			if (var2 <= 0 && this.field7084 != null) {
				throw new IOException(this.field7084.toString());
			}
			this.notifyAll();
			return var2;
		}
	}

	@ObfuscatedName("ua.m([BIII)I")
	public int method8988(byte[] arg0, int arg1, int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			int var5;
			if (this.field7082 <= this.field7083) {
				var5 = this.field7083 - this.field7082;
			} else {
				var5 = this.field7083 + (this.field7079 - this.field7082);
			}
			if (arg2 > var5) {
				arg2 = var5;
			}
			if (arg2 == 0 && this.field7084 != null) {
				throw new IOException(this.field7084.toString());
			}
			if (this.field7082 + arg2 <= this.field7079) {
				System.arraycopy(this.field7078, this.field7082, arg0, arg1, arg2);
			} else {
				int var6 = this.field7079 - this.field7082;
				System.arraycopy(this.field7078, this.field7082, arg0, arg1, var6);
				System.arraycopy(this.field7078, 0, arg0, arg1 + var6, arg2 - var6);
			}
			this.field7082 = (this.field7082 + arg2) % this.field7079;
			this.notifyAll();
			return arg2;
		}
	}

	@ObfuscatedName("ua.k(I)V")
	public void method8984() {
		synchronized (this) {
			if (this.field7084 == null) {
				this.field7084 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.field7081.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("ua.f(I)V")
	public void method8999() {
		this.field7080 = new BrokenInputStream();
	}
}

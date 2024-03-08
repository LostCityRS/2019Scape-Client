package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pf")
public class class446 implements Runnable {

	@ObfuscatedName("pf.e")
	public class720 field4438 = new class720();

	@ObfuscatedName("pf.n")
	public int field4437 = 0;

	@ObfuscatedName("pf.m")
	public boolean field4439 = false;

	@ObfuscatedName("pf.k")
	public Thread field4440 = new Thread(this);

	public class446() {
		this.field4440.setDaemon(true);
		this.field4440.start();
		this.field4440.setPriority(1);
	}

	@ObfuscatedName("pf.e(ILuf;S)Latf;")
	public class1228 method6997(int arg0, class560 arg1) {
		class1228 var3 = new class1228();
		var3.field12559 = 1;
		class720 var4 = this.field4438;
		synchronized (this.field4438) {
			class1228 var5 = (class1228) this.field4438.method14317();
			while (true) {
				if (var5 == null) {
					break;
				}
				if (var5.field11440 == (long) arg0 && var5.field12556 == arg1 && var5.field12559 == 2) {
					var3.field12557 = var5.field12557;
					var3.field12344 = false;
					return var3;
				}
				var5 = (class1228) this.field4438.method14324();
			}
		}
		var3.field12557 = arg1.method9010(arg0);
		var3.field12344 = false;
		var3.field12342 = true;
		return var3;
	}

	@ObfuscatedName("pf.n(I[BLuf;I)Latf;")
	public class1228 method6988(int arg0, byte[] arg1, class560 arg2) {
		class1228 var4 = new class1228();
		var4.field12559 = 2;
		var4.field11440 = arg0;
		var4.field12557 = arg1;
		var4.field12556 = arg2;
		var4.field12342 = false;
		this.method6987(var4);
		return var4;
	}

	@ObfuscatedName("pf.m(ILuf;B)Latf;")
	public class1228 method6996(int arg0, class560 arg1) {
		class1228 var3 = new class1228();
		var3.field12559 = 3;
		var3.field11440 = arg0;
		var3.field12556 = arg1;
		var3.field12342 = false;
		this.method6987(var3);
		return var3;
	}

	@ObfuscatedName("pf.k(Latf;I)V")
	public void method6987(class1228 arg0) {
		class720 var2 = this.field4438;
		synchronized (this.field4438) {
			this.field4438.method14339(arg0);
			this.field4437++;
			this.field4438.notifyAll();
		}
	}

	public void run() {
		while (!this.field4439) {
			class720 var1 = this.field4438;
			class1228 var2;
			synchronized (this.field4438) {
				var2 = (class1228) this.field4438.method14315();
				if (var2 == null) {
					try {
						this.field4438.wait();
					} catch (InterruptedException var7) {
					}
					continue;
				}
				this.field4437--;
			}
			try {
				if (var2.field12559 == 2) {
					var2.field12556.method9011((int) var2.field11440, var2.field12557, var2.field12557.length);
				} else if (var2.field12559 == 3) {
					var2.field12557 = var2.field12556.method9010((int) var2.field11440);
				}
			} catch (Exception var6) {
				class1211.method9845(null, var6);
			}
			var2.field12344 = false;
		}
	}

	@ObfuscatedName("pf.f(I)I")
	public int method6991() {
		class720 var1 = this.field4438;
		synchronized (this.field4438) {
			return this.field4437;
		}
	}

	@ObfuscatedName("pf.w(I)V")
	public void method6992() {
		this.field4439 = true;
		class720 var1 = this.field4438;
		synchronized (this.field4438) {
			this.field4438.notifyAll();
		}
		try {
			this.field4440.join();
		} catch (InterruptedException var4) {
		}
		this.field4440 = null;
	}
}

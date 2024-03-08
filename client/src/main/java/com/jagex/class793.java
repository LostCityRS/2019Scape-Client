package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("adb")
public class class793 implements class53, class757 {

	@ObfuscatedName("adb.e")
	public class463[][] field9185;

	@ObfuscatedName("adb.n")
	public Object[][] field9186;

	@ObfuscatedName("adb.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method15192(arg0, var2);
		}
	}

	@ObfuscatedName("adb.u(Lalw;IS)V")
	public void method15192(class997 arg0, int arg1) {
		if (arg1 != 1) {
			return;
		}
		int var3 = arg0.method17904();
		if (this.field9185 == null) {
			this.field9185 = new class463[var3][];
		}
		for (int var4 = arg0.method17904(); var4 != 255; var4 = arg0.method17904()) {
			int var5 = var4 & 0x7F;
			boolean var6 = (var4 & 0x80) != 0;
			class463[] var7 = new class463[arg0.method17904()];
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] = (class463) class686.method1897(class463.method7293(), arg0.method18123());
			}
			this.field9185[var5] = var7;
			if (var6) {
				if (this.field9186 == null) {
					this.field9186 = new Object[this.field9185.length][];
				}
				this.field9186[var5] = class791.method18719(arg0, var7);
			}
		}
	}

	@ObfuscatedName("adb.n(I)V")
	public void method975() {
	}

	@ObfuscatedName("adb.z(IB)V")
	public void method2998(int arg0) {
	}
}

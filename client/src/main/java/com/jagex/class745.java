package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("abc")
public class class745 implements class53, class757 {

	@ObfuscatedName("abc.e")
	public Object[][] field8734;

	@ObfuscatedName("abc.n")
	public class463[][] field8733;

	@ObfuscatedName("abc.m")
	public int field8735;

	@ObfuscatedName("abc.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method14710(arg0, var2);
		}
	}

	@ObfuscatedName("abc.u(II)[Ljava/lang/Object;")
	public Object[] method14711(int arg0) {
		return this.field8734 == null ? null : this.field8734[arg0];
	}

	@ObfuscatedName("abc.p(Lalw;II)V")
	public void method14710(class997 arg0, int arg1) {
		if (arg1 == 3) {
			int var3 = arg0.method17904();
			if (this.field8734 == null) {
				this.field8734 = new Object[var3][];
				this.field8733 = new class463[var3][];
			}
			for (int var4 = arg0.method17904(); var4 != 255; var4 = arg0.method17904()) {
				int var5 = arg0.method17904();
				class463[] var6 = new class463[var5];
				for (int var7 = 0; var7 < var5; var7++) {
					var6[var7] = (class463) class686.method1897(class463.method7293(), arg0.method18123());
				}
				this.field8734[var4] = class791.method18719(arg0, var6);
				this.field8733[var4] = var6;
			}
		} else if (arg1 == 4) {
			this.field8735 = arg0.method18087();
		}
	}

	@ObfuscatedName("abc.n(I)V")
	public void method975() {
	}

	@ObfuscatedName("abc.z(IB)V")
	public void method2998(int arg0) {
	}
}

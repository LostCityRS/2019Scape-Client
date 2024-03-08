package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("adx")
public class class809 extends class986 implements class53, class757 {

	@ObfuscatedName("adx.k")
	public class729 field9261;

	@ObfuscatedName("adx.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method15295(arg0, var2);
		}
	}

	@ObfuscatedName("adx.u(Lalw;IS)V")
	public void method15295(class997 arg0, int arg1) {
		if (arg1 != 249) {
			return;
		}
		int var3 = arg0.method17904();
		if (this.field9261 == null) {
			int var4 = class783.method16657(var3);
			this.field9261 = new class729(var4);
		}
		for (int var5 = 0; var5 < var3; var5++) {
			boolean var6 = arg0.method17904() == 1;
			int var7 = arg0.method17908();
			class532 var8;
			if (var6) {
				var8 = new class984(arg0.method17918());
			} else {
				var8 = new class988(arg0.method17910());
			}
			this.field9261.method14501(var8, (long) var7);
		}
	}

	@ObfuscatedName("adx.p(IIB)I")
	public int method15296(int arg0, int arg1) {
		if (this.field9261 == null) {
			return arg1;
		} else {
			class988 var3 = (class988) this.field9261.method14495((long) arg0);
			return var3 == null ? arg1 : var3.field11442;
		}
	}

	@ObfuscatedName("adx.d(ILjava/lang/String;I)Ljava/lang/String;")
	public String method15297(int arg0, String arg1) {
		if (this.field9261 == null) {
			return arg1;
		} else {
			class984 var3 = (class984) this.field9261.method14495((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("adx.z(IB)V")
	public void method2998(int arg0) {
	}

	@ObfuscatedName("adx.n(I)V")
	public void method975() {
	}
}

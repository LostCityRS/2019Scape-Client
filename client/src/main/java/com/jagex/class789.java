package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("adp")
public class class789 implements class53, class757 {

	@ObfuscatedName("adp.e")
	public class463 field9173;

	@ObfuscatedName("adp.n")
	public int field9172;

	@ObfuscatedName("adp.m")
	public String field9171;

	@ObfuscatedName("adp.k")
	public boolean field9174 = true;

	@ObfuscatedName("adp.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method15151(arg0, var2);
		}
	}

	@ObfuscatedName("adp.u(Lalw;II)V")
	public void method15151(class997 arg0, int arg1) {
		if (arg1 == 1) {
			char var3 = Statics.method9576(arg0.method17905());
			this.field9173 = Statics.method7300(var3);
		} else if (arg1 == 2) {
			this.field9172 = arg0.method17910();
		} else if (arg1 == 4) {
			this.field9174 = false;
		} else if (arg1 == 5) {
			this.field9171 = arg0.method17918();
		} else if (arg1 == 101) {
			this.field9173 = (class463) class686.method1897(class463.method7293(), arg0.method18123());
		}
	}

	@ObfuscatedName("adp.p(I)Z")
	public boolean method15152() {
		return class463.field4634 == this.field9173;
	}

	@ObfuscatedName("adp.n(I)V")
	public void method975() {
	}

	@ObfuscatedName("adp.z(IB)V")
	public void method2998(int arg0) {
	}
}

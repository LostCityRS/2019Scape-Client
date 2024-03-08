package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("kh")
public class class305 implements class50 {

	@ObfuscatedName("kh.e")
	public int field3081;

	@ObfuscatedName("kh.n")
	public class306 field3077;

	@ObfuscatedName("kh.m")
	public class149 field3076;

	@ObfuscatedName("kh.k")
	public int field3074;

	@ObfuscatedName("kh.f")
	public int field3078;

	@ObfuscatedName("kh.w")
	public String field3079;

	@ObfuscatedName("kh.l")
	public class455 field3080;

	@ObfuscatedName("kh.u")
	public int field3075 = -1;

	@ObfuscatedName("kh.z")
	public static int[] field3082 = new int[32];

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field3082[var1] = var0 - 1;
			var0 += var0;
		}
	}

	public class305(int arg0, class306 arg1) {
		this.field3081 = arg0;
		this.field3077 = arg1;
	}

	@ObfuscatedName("kh.e(Lalw;B)V")
	public void method976(class997 arg0) {
		this.method5190(arg0, false);
	}

	@ObfuscatedName("kh.u(Lalw;ZI)V")
	public void method5190(class997 arg0, boolean arg1) {
		while (true) {
			int var3 = arg0.method17904();
			if (var3 == 0) {
				return;
			}
			this.method5184(arg0, var3, arg1);
		}
	}

	@ObfuscatedName("kh.n(I)V")
	public void method975() {
	}

	@ObfuscatedName("kh.z(Lalw;IZI)V")
	public void method5184(class997 arg0, int arg1, boolean arg2) {
		class304 var4 = (class304) class686.method1897(Statics.method1624(), arg1);
		switch(var4.field3072) {
			case 7:
				this.field3074 = arg0.method17904();
				this.field3078 = arg0.method17904();
			case 9:
			default:
				break;
			case 14:
				int var5 = arg0.method17904();
				this.field3080 = (class455) class686.method1897(class455.method7216(), var5);
				if (this.field3080 == null) {
					throw new IllegalStateException("");
				}
				this.field3075 = arg0.method17927();
				if (this.field3077 != null) {
					class51 var6 = (class51) this.field3077.field3083.get(this.field3080);
					if (var6 != null) {
						this.field3076 = (class149) var6.method962(this.field3075);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
		}
	}

	@ObfuscatedName("kh.p(II)I")
	public int method5181(int arg0) {
		int var2 = field3082[this.field3078 - this.field3074];
		return arg0 >> this.field3074 & var2;
	}

	@ObfuscatedName("kh.d(III)I")
	public int method5183(int arg0, int arg1) throws class1110 {
		int var3 = field3082[this.field3078 - this.field3074];
		if (arg1 < 0 || arg1 > var3) {
			throw new class1110(this.field3079 == null ? Integer.toString(this.field3081) : this.field3079, arg1, var3);
		}
		int var4 = var3 << this.field3074;
		return arg0 & ~var4 | arg1 << this.field3074 & var4;
	}
}

package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ix")
public class class252 {

	@ObfuscatedName("ix.e")
	public class729 field2653;

	@ObfuscatedName("ix.n")
	public class977[] field2652;

	@ObfuscatedName("ix.m")
	public final class251 field2654;

	public class252(int arg0, class251 arg1) {
		int var3;
		for (var3 = 1; var3 < arg0; var3 += var3) {
		}
		this.field2653 = new class729(var3);
		this.field2652 = new class977[var3];
		this.field2654 = arg1;
	}

	@ObfuscatedName("ix.e(II)Lakw;")
	public class977 method4470(int arg0) {
		return arg0 >= this.field2652.length ? null : this.field2652[arg0];
	}

	@ObfuscatedName("ix.n(Ljava/lang/String;B)Lakw;")
	public class977 method4464(String arg0) {
		long var2 = this.field2654.method4074(arg0);
		for (class977 var4 = (class977) this.field2653.method14495(var2); var4 != null; var4 = (class977) this.field2653.method14496()) {
			if (var4.field11387.equals(arg0)) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("ix.m(II)V")
	public void method4468(int arg0) {
		class977 var2 = this.method4470(arg0);
		if (var2 != null) {
			var2.method8440();
			this.field2652[var2.field11388] = null;
		}
	}

	@ObfuscatedName("ix.k(ILjava/lang/String;Lakw;B)V")
	public void method4475(int arg0, String arg1, class977 arg2) {
		class977 var4 = this.method4464(arg1);
		if (var4 != null && var4.field11388 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method4468(arg0);
		if (arg0 >= this.field2652.length) {
			int var5;
			for (var5 = this.field2652.length; var5 <= arg0; var5 += var5) {
			}
			this.field2653 = new class729(var5);
			for (int var6 = 0; var6 < this.field2652.length; var6++) {
				class977 var7 = this.field2652[var6];
				if (var7 != null) {
					this.field2653.method14501(var7, var7.field6760);
				}
			}
			class977[] var8 = new class977[var5];
			for (int var9 = 0; var9 < this.field2652.length; var9++) {
				var8[var9] = this.field2652[var9];
			}
			this.field2652 = var8;
		}
		arg2.field11388 = arg0;
		arg2.field11387 = arg1;
		this.field2653.method14501(arg2, this.field2654.method4074(arg1));
		this.field2652[arg0] = arg2;
	}
}

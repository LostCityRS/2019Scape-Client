package com.jagex.game.config.defaults;

import deob.ObfuscatedName;

@ObfuscatedName("vs")
public class BindingType {

	@ObfuscatedName("vs.e")
	public static final BindingType field7417 = new BindingType(0);

	@ObfuscatedName("vs.n")
	public static final BindingType field7416 = new BindingType(1);

	@ObfuscatedName("vs.m")
	public static final BindingType field7418 = new BindingType(2);

	@ObfuscatedName("vs.k")
	public final int field7419;

	@ObfuscatedName("ey.e(B)[Lvs;")
	public static BindingType[] method2675() {
		return new BindingType[] { field7417, field7416, field7418 };
	}

	public BindingType(int arg0) {
		this.field7419 = arg0;
	}

	@ObfuscatedName("iw.n(II)Lvs;")
	public static BindingType method4512(int arg0) {
		BindingType[] var1 = method2675();
		for (int var2 = 0; var2 < var1.length; var2++) {
			BindingType var3 = var1[var2];
			if (var3.field7419 == arg0) {
				return var3;
			}
		}
		return null;
	}
}

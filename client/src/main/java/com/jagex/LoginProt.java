package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("nu")
public class LoginProt {

	@ObfuscatedName("nu.e")
	public static final LoginProt field3821 = new LoginProt(14, 0);

	@ObfuscatedName("nu.n")
	public static final LoginProt field3820 = new LoginProt(15, -1);

	@ObfuscatedName("nu.m")
	public static final LoginProt field3811 = new LoginProt(16, -2);

	@ObfuscatedName("nu.k")
	public static final LoginProt field3810 = new LoginProt(19, -2);

	@ObfuscatedName("nu.f")
	public static final LoginProt field3813 = new LoginProt(23, 4);

	@ObfuscatedName("nu.w")
	public static final LoginProt field3814 = new LoginProt(24, -1);

	@ObfuscatedName("nu.l")
	public static final LoginProt field3816 = new LoginProt(26, 0);

	@ObfuscatedName("nu.u")
	public static final LoginProt field3809 = new LoginProt(27, 0);

	@ObfuscatedName("nu.z")
	public static final LoginProt field3815 = new LoginProt(28, -2);

	@ObfuscatedName("nu.p")
	public static final LoginProt field3817 = new LoginProt(29, -2);

	@ObfuscatedName("nu.d")
	public static final LoginProt field3819 = new LoginProt(30, -2);

	@ObfuscatedName("nu.c")
	public static final LoginProt field3818 = new LoginProt(31, 4);

	@ObfuscatedName("nu.r")
	public final int field3812;

	@ObfuscatedName("nu.v")
	public static final LoginProt[] field3822 = new LoginProt[32];

	static {
		LoginProt[] var0 = method14992();
		for (int var1 = 0; var1 < var0.length; var1++) {
			field3822[var0[var1].field3812] = var0[var1];
		}
	}

	@ObfuscatedName("acb.e(I)[Lnu;")
	public static LoginProt[] method14992() {
		return new LoginProt[] { field3809, field3818, field3820, field3810, field3819, field3814, field3817, field3816, field3813, field3815, field3811, field3821 };
	}

	public LoginProt(int arg0, int arg1) {
		this.field3812 = arg0;
	}
}

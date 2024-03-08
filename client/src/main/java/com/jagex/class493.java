package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("re")
public class class493 {

	@ObfuscatedName("re.e")
	public final int field5015;

	@ObfuscatedName("re.n")
	public final int field5013;

	@ObfuscatedName("re.m")
	public final int field5014;

	@ObfuscatedName("re.k")
	public final int field5012;

	public class493() {
		this.field5015 = (int) (Math.random() * 4.0D) + 32;
		this.field5013 = (int) (Math.random() * 2.0D) + 3;
		this.field5014 = (int) (Math.random() * 3.0D) + 16;
		if (Statics.field688.field11538.method18426() == 1) {
			this.field5012 = (int) (Math.random() * 6.0D);
		} else {
			this.field5012 = (int) (Math.random() * 12.0D);
		}
	}

	public class493(int arg0, int arg1, int arg2, int arg3) {
		this.field5015 = arg0;
		this.field5013 = arg1;
		this.field5014 = arg2;
		this.field5012 = arg3;
	}
}

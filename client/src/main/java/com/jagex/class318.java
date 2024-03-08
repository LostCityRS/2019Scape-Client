package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("kv")
public class class318 {

	@ObfuscatedName("kv.e")
	public static final class318 field3186 = new class318();

	@ObfuscatedName("kv.n")
	public static final class318 field3184 = new class318();

	@ObfuscatedName("kv.m")
	public static final class318 field3185 = new class318();

	@ObfuscatedName("zk.e(I)[Lkv;")
	public static class318[] method13948() {
		return new class318[] { field3186, field3184, field3185 };
	}

	@ObfuscatedName("kv.n(III)I")
	public int method5382(int arg0, int arg1) {
		int var3 = Statics.field6586 > arg1 ? Statics.field6586 : arg1;
		if (field3186 == this) {
			return 0;
		} else if (field3185 == this) {
			return var3 - arg0;
		} else if (field3184 == this) {
			return (var3 - arg0) / 2;
		} else {
			return 0;
		}
	}
}

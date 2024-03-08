package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ky")
public class class316 {

	@ObfuscatedName("ky.e")
	public static final class316 field3181 = new class316();

	@ObfuscatedName("ky.n")
	public static final class316 field3180 = new class316();

	@ObfuscatedName("ky.m")
	public static final class316 field3179 = new class316();

	@ObfuscatedName("ev.e(I)[Lky;")
	public static class316[] method2774() {
		return new class316[] { field3181, field3180, field3179 };
	}

	@ObfuscatedName("ky.n(IIS)I")
	public int method5375(int arg0, int arg1) {
		int var3 = Statics.field6600 > arg1 ? Statics.field6600 : arg1;
		if (field3181 == this) {
			return 0;
		} else if (field3179 == this) {
			return var3 - arg0;
		} else if (field3180 == this) {
			return (var3 - arg0) / 2;
		} else {
			return 0;
		}
	}
}

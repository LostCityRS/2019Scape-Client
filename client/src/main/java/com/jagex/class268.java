package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("jd")
public class class268 {

	@ObfuscatedName("jd.e")
	public static final class268 field2829 = new class268(0);

	@ObfuscatedName("jd.n")
	public static final class268 field2828 = new class268(1);

	@ObfuscatedName("jd.m")
	public int field2827;

	public class268(int arg0) {
		this.field2827 = arg0;
	}

	@ObfuscatedName("ir.e(II)Ljd;")
	public static class268 method4461(int arg0) {
		if (field2829.field2827 == arg0) {
			return field2829;
		} else if (field2828.field2827 == arg0) {
			return field2828;
		} else {
			return null;
		}
	}
}

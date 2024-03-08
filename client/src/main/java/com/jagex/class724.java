package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aaj")
public class class724 {

	@ObfuscatedName("aaj.e")
	public static final class724 field8528 = new class724(0);

	@ObfuscatedName("aaj.n")
	public static final class724 field8527 = new class724(1);

	@ObfuscatedName("aaj.m")
	public static final class724 field8529 = new class724(2);

	@ObfuscatedName("aaj.k")
	public final int field8530;

	@ObfuscatedName("ix.e(I)[Laaj;")
	public static class724[] method4481() {
		return new class724[] { field8529, field8527, field8528 };
	}

	public class724(int arg0) {
		this.field8530 = arg0;
	}

	@ObfuscatedName("fk.n(IB)Laaj;")
	public static class724 method3374(int arg0) {
		class724[] var1 = method4481();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class724 var3 = var1[var2];
			if (var3.field8530 == arg0) {
				return var3;
			}
		}
		return null;
	}
}

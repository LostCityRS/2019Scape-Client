package com.jagex.audio;

import deob.ObfuscatedName;

@ObfuscatedName("fj")
public class BussType {

	@ObfuscatedName("fj.e")
	public static final BussType field1815 = new BussType(1);

	@ObfuscatedName("fj.n")
	public static final BussType field1812 = new BussType(0);

	@ObfuscatedName("fj.m")
	public static final BussType field1814 = new BussType(5);

	@ObfuscatedName("fj.k")
	public static final BussType field1817 = new BussType(3);

	@ObfuscatedName("fj.f")
	public static final BussType field1816 = new BussType(2);

	@ObfuscatedName("fj.w")
	public static final BussType field1813 = new BussType(4);

	@ObfuscatedName("fj.l")
	public final int field1818;

	public BussType(int arg0) {
		this.field1818 = arg0;
	}

	@ObfuscatedName("fj.e(I)I")
	public int method3047() {
		return field1815 == this ? -1 : this.field1818 | 0x1000000;
	}
}

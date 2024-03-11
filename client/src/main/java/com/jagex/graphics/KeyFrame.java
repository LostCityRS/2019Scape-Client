package com.jagex.graphics;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("ey")
public class KeyFrame {

	@ObfuscatedName("ey.e")
	public int field1663;

	@ObfuscatedName("ey.n")
	public float field1660;

	@ObfuscatedName("ey.m")
	public float field1661 = Float.MAX_VALUE;

	@ObfuscatedName("ey.k")
	public float field1662 = Float.MAX_VALUE;

	@ObfuscatedName("ey.f")
	public float field1664 = Float.MAX_VALUE;

	@ObfuscatedName("ey.w")
	public float field1659 = Float.MAX_VALUE;

	@ObfuscatedName("ey.l")
	public KeyFrame field1665;

	@ObfuscatedName("ey.e(Lalw;II)V")
	public void method2673(Packet arg0, int arg1) {
		this.field1663 = arg0.g2s();
		this.field1660 = arg0.gFloat();
		this.field1661 = arg0.gFloat();
		this.field1662 = arg0.gFloat();
		this.field1664 = arg0.gFloat();
		this.field1659 = arg0.gFloat();
	}
}

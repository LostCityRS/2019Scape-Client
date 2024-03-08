package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("akb")
public class class995 extends class532 {

	@ObfuscatedName("akb.k")
	public final class102 field11488;

	@ObfuscatedName("akb.f")
	public final class379 field11483;

	@ObfuscatedName("akb.w")
	public int field11484;

	@ObfuscatedName("akb.l")
	public int field11481;

	@ObfuscatedName("akb.u")
	public int field11482;

	@ObfuscatedName("akb.z")
	public float field11486;

	@ObfuscatedName("akb.p")
	public float field11487;

	@ObfuscatedName("akb.d")
	public static float[] field11485 = new float[3];

	public class995(class102 arg0, class634 arg1) {
		this.field11488 = arg0;
		this.field11483 = this.field11488.method1509(Statics.field12041);
		this.method17872();
	}

	@ObfuscatedName("akb.e(I)V")
	public void method17872() {
		this.field11484 = this.field11488.field1226;
		this.field11481 = this.field11488.field1229;
		this.field11482 = this.field11488.field1227;
		if (this.field11488.field1231 != null) {
			this.field11488.field1231.method6616((float) this.field11483.field3551, (float) this.field11483.field3552, (float) this.field11483.field3553, field11485);
		}
		this.field11486 = field11485[0];
		this.field11487 = field11485[2];
	}
}

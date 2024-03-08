package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("afn")
public class class863 extends CutsceneAction {

	@ObfuscatedName("afn.n")
	public final int field10267;

	@ObfuscatedName("afn.m")
	public final int field10266;

	public class863(Packet arg0) {
		super(arg0);
		this.field10267 = arg0.g2();
		this.field10266 = arg0.g2();
	}

	@ObfuscatedName("afn.n(I)V")
	public void method2890() {
		Statics.field1721[this.field10267].method2870().method16491(this.field10266, true);
	}
}

package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agw")
public class class878 extends CutsceneAction {

	@ObfuscatedName("agw.n")
	public final int field10320;

	public class878(Packet arg0) {
		super(arg0);
		this.field10320 = arg0.g2();
	}

	@ObfuscatedName("agw.n(I)V")
	public void method2890() {
		Statics.field7317[this.field10320].method2848();
	}
}

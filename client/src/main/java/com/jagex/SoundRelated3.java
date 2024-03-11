package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qb")
public class SoundRelated3 {

	// $FF: synthetic field
	public final SoundRelated2 this$0;

	@ObfuscatedName("qb.e")
	public Packet field4873;

	@ObfuscatedName("qb.n")
	public boolean field4871;

	@ObfuscatedName("qb.m")
	public int field4872;

	@ObfuscatedName("qb.k")
	public int field4870;

	public SoundRelated3(SoundRelated2 arg0, Packet arg1, boolean arg2) {
		this.this$0 = arg0;
		this.field4873 = arg1;
		this.field4871 = arg2;
		this.field4872 = -1;
		this.field4870 = -1;
	}

	@ObfuscatedName("qb.e(I)V")
	public void method7369() {
		if (this.field4873 != null && !this.field4871) {
			this.field4873.release();
		}
		this.field4872 = -1;
		this.field4870 = -1;
	}
}

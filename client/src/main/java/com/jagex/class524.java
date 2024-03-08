package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("sj")
public class class524 {

	// $FF: synthetic field
	public final class519 this$0;

	@ObfuscatedName("sj.e")
	public class522[] field6718;

	@ObfuscatedName("sj.n")
	public int field6716;

	@ObfuscatedName("sj.m")
	public int field6717;

	@ObfuscatedName("sj.k")
	public int field6715;

	public class524(class519 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("sj.e(III)V")
	public void method8345(int arg0, int arg1) {
		if (this.field6718 != null && this.field6716 == arg1 && this.field6717 == arg0) {
			return;
		}
		this.field6717 = arg0;
		this.field6715 = (0x1 << arg0) - 1;
		this.field6716 = arg1;
		int var3 = 0x1 << this.field6717 + this.field6716;
		this.field6718 = new class522[var3];
		for (int var4 = 0; var4 < var3; var4++) {
			this.field6718[var4] = new class522(this);
		}
	}

	@ObfuscatedName("sj.n(I)V")
	public void method8352() {
		int var1 = 0x1 << this.field6717 + this.field6716;
		for (int var2 = 0; var2 < var1; var2++) {
			this.field6718[var2].method8331();
		}
	}

	@ObfuscatedName("sj.m(IBI)Lsa;")
	public class522 method8347(int arg0, byte arg1) {
		return this.field6718[((arg1 & 0xFF) >>> 8 - this.field6716) + ((arg0 & this.field6715) << this.field6716)];
	}
}

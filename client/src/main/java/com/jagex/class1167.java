package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("arf")
public class class1167 extends class980 {

	// $FF: synthetic field
	public final class311 this$0;

	@ObfuscatedName("arf.k")
	public String field12255;

	@ObfuscatedName("arf.f")
	public byte field12254;

	@ObfuscatedName("arf.w")
	public byte field12256;

	public class1167(class311 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("arf.e(Lalw;I)V")
	public void method17757(class997 arg0) {
		this.field12255 = arg0.method17917();
		if (this.field12255 != null) {
			arg0.method17904();
			this.field12254 = arg0.method17905();
			this.field12256 = arg0.method17905();
		}
	}

	@ObfuscatedName("arf.n(Lakr;S)V")
	public void method17753(class979 arg0) {
		arg0.field11396 = this.field12255;
		if (this.field12255 != null) {
			arg0.field11391 = this.field12254;
			arg0.field11398 = this.field12256;
		}
	}
}

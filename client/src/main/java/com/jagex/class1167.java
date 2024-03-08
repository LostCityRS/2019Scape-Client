package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("arf")
public class class1167 extends class980 {

	// $FF: synthetic field
	public final ClanChannelDelta this$0;

	@ObfuscatedName("arf.k")
	public String field12255;

	@ObfuscatedName("arf.f")
	public byte field12254;

	@ObfuscatedName("arf.w")
	public byte field12256;

	public class1167(ClanChannelDelta arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("arf.e(Lalw;I)V")
	public void method17757(Packet arg0) {
		this.field12255 = arg0.fastgstr();
		if (this.field12255 != null) {
			arg0.g1();
			this.field12254 = arg0.g1b();
			this.field12256 = arg0.g1b();
		}
	}

	@ObfuscatedName("arf.n(Lakr;S)V")
	public void method17753(ClanChannel arg0) {
		arg0.field11396 = this.field12255;
		if (this.field12255 != null) {
			arg0.field11391 = this.field12254;
			arg0.field11398 = this.field12256;
		}
	}
}

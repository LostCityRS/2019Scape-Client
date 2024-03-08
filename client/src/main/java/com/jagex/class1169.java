package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("arv")
public class class1169 extends class980 {

	// $FF: synthetic field
	public final ClanChannelDelta this$0;

	@ObfuscatedName("arv.k")
	public int field12263;

	@ObfuscatedName("arv.f")
	public byte field12261;

	@ObfuscatedName("arv.w")
	public int field12262;

	@ObfuscatedName("arv.l")
	public String field12260;

	public class1169(ClanChannelDelta arg0) {
		this.this$0 = arg0;
		this.field12263 = -1;
	}

	@ObfuscatedName("arv.e(Lalw;I)V")
	public void method17757(Packet arg0) {
		arg0.g1();
		this.field12263 = arg0.g2();
		this.field12261 = arg0.g1b();
		this.field12262 = arg0.g2();
		arg0.g8();
		this.field12260 = arg0.gjstr();
		arg0.g1();
	}

	@ObfuscatedName("arv.n(Lakr;S)V")
	public void method17753(ClanChannel arg0) {
		class308 var2 = arg0.field11392[this.field12263];
		var2.field3089 = this.field12261;
		var2.field3088 = this.field12262;
		var2.field3087 = this.field12260;
	}
}

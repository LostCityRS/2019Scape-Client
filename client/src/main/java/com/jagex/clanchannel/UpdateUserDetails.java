package com.jagex.clanchannel;

import com.jagex.ClanChannel;
import com.jagex.Packet;
import com.jagex.ClanChannelUser;
import deob.ObfuscatedName;

@ObfuscatedName("arh")
public class UpdateUserDetails extends ClanChannelDeltaEntry {

	// $FF: synthetic field
	public final ClanChannelDelta this$0;

	@ObfuscatedName("arh.k")
	public int field12252;

	@ObfuscatedName("arh.f")
	public byte field12250;

	@ObfuscatedName("arh.w")
	public int field12249;

	@ObfuscatedName("arh.l")
	public String field12251;

	public UpdateUserDetails(ClanChannelDelta arg0) {
		this.this$0 = arg0;
		this.field12252 = -1;
	}

	@ObfuscatedName("arh.e(Lalw;I)V")
	public void method17757(Packet arg0) {
		this.field12252 = arg0.g2();
		this.field12250 = arg0.g1b();
		this.field12249 = arg0.g2();
		arg0.g8();
		this.field12251 = arg0.gjstr();
	}

	@ObfuscatedName("arh.n(Lakr;S)V")
	public void method17753(ClanChannel arg0) {
		ClanChannelUser var2 = arg0.field11392[this.field12252];
		var2.field3089 = this.field12250;
		var2.field3088 = this.field12249;
		var2.field3087 = this.field12251;
	}
}

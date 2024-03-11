package com.jagex.clanchannel;

import com.jagex.ClanChannel;
import com.jagex.Packet;
import com.jagex.ClanChannelUser;
import deob.ObfuscatedName;

@ObfuscatedName("arz")
public class AddUser extends ClanChannelDeltaEntry {

	// $FF: synthetic field
	public final ClanChannelDelta this$0;

	@ObfuscatedName("arz.k")
	public String field12258;

	@ObfuscatedName("arz.f")
	public int field12257;

	@ObfuscatedName("arz.w")
	public byte field12259;

	public AddUser(ClanChannelDelta arg0) {
		this.this$0 = arg0;
		this.field12258 = null;
	}

	@ObfuscatedName("arz.e(Lalw;I)V")
	public void method17757(Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1;
			arg0.g8();
		}
		this.field12258 = arg0.fastgstr();
		this.field12257 = arg0.g2();
		this.field12259 = arg0.g1b();
		arg0.g8();
	}

	@ObfuscatedName("arz.n(Lakr;S)V")
	public void method17753(ClanChannel arg0) {
		ClanChannelUser var2 = new ClanChannelUser();
		var2.field3087 = this.field12258;
		var2.field3088 = this.field12257;
		var2.field3089 = this.field12259;
		arg0.method17734(var2);
	}
}

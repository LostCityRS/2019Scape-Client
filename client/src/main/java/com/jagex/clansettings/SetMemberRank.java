package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.clansettings.ClanSettingsDelta;
import com.jagex.class309;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("arp")
public class SetMemberRank extends class978 {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("arp.k")
	public int field12222;

	@ObfuscatedName("arp.f")
	public byte field12223;

	public SetMemberRank(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
		this.field12222 = -1;
	}

	@ObfuscatedName("arp.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12222 = arg0.g2();
		this.field12223 = arg0.g1b();
	}

	@ObfuscatedName("arp.n(Lkr;I)V")
	public void method17727(class309 arg0) {
		arg0.method5267(this.field12222, this.field12223);
	}
}

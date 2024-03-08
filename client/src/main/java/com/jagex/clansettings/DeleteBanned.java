package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.ClanSettings;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("arb")
public class DeleteBanned extends class978 {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("arb.k")
	public int field12244;

	public DeleteBanned(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
		this.field12244 = -1;
	}

	@ObfuscatedName("arb.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12244 = arg0.g2();
	}

	@ObfuscatedName("arb.n(Lkr;I)V")
	public void method17727(ClanSettings arg0) {
		arg0.method5266(this.field12244);
	}
}

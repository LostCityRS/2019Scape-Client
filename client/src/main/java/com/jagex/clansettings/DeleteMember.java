package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.ClanSettings;
import com.jagex.ClanSettingsDeltaEntry;
import deob.ObfuscatedName;

@ObfuscatedName("ari")
public class DeleteMember extends ClanSettingsDeltaEntry {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("ari.k")
	public int field12224;

	public DeleteMember(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
		this.field12224 = -1;
	}

	@ObfuscatedName("ari.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12224 = arg0.g2();
	}

	@ObfuscatedName("ari.n(Lkr;I)V")
	public void method17727(ClanSettings arg0) {
		arg0.method5263(this.field12224);
	}
}

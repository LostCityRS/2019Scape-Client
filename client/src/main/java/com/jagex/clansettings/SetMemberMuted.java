package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.ClanSettings;
import com.jagex.ClanSettingsDeltaEntry;
import deob.ObfuscatedName;

@ObfuscatedName("arx")
public class SetMemberMuted extends ClanSettingsDeltaEntry {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("arx.k")
	public int field12218;

	@ObfuscatedName("arx.f")
	public boolean field12219;

	public SetMemberMuted(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
		this.field12218 = -1;
	}

	@ObfuscatedName("arx.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12218 = arg0.g2();
		this.field12219 = arg0.g1() == 1;
	}

	@ObfuscatedName("arx.n(Lkr;I)V")
	public void method17727(ClanSettings arg0) {
		arg0.method5303(this.field12218, this.field12219);
	}
}

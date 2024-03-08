package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.ClanSettings;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("art")
public class SetExtraSettingInt extends class978 {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("art.k")
	public int field12242;

	@ObfuscatedName("art.f")
	public int field12243;

	public SetExtraSettingInt(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("art.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12242 = arg0.g4s();
		this.field12243 = arg0.g4s();
	}

	@ObfuscatedName("art.n(Lkr;I)V")
	public void method17727(ClanSettings arg0) {
		arg0.method5270(this.field12242, this.field12243);
	}
}

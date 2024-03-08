package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.clansettings.ClanSettingsDelta;
import com.jagex.class309;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("arl")
public class SetClanName extends class978 {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("arl.k")
	public String field12232;

	public SetClanName(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("arl.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12232 = arg0.gjstr();
		arg0.g4s();
	}

	@ObfuscatedName("arl.n(Lkr;I)V")
	public void method17727(class309 arg0) {
		arg0.field3093 = this.field12232;
	}
}

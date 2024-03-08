package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.clansettings.ClanSettingsDelta;
import com.jagex.class309;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("aro")
public class SetExtraSettingString extends class978 {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("aro.k")
	public int field12231;

	@ObfuscatedName("aro.f")
	public String field12230;

	public SetExtraSettingString(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("aro.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12231 = arg0.g4s();
		this.field12230 = arg0.gjstr();
	}

	@ObfuscatedName("aro.n(Lkr;I)V")
	public void method17727(class309 arg0) {
		arg0.method5273(this.field12231, this.field12230);
	}
}

package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.clansettings.ClanSettingsDelta;
import com.jagex.class309;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("ari")
public class DeleteMember extends class978 {

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
	public void method17727(class309 arg0) {
		arg0.method5263(this.field12224);
	}
}

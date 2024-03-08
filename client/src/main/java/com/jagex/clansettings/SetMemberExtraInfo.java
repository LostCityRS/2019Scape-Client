package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.clansettings.ClanSettingsDelta;
import com.jagex.class309;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("ary")
public class SetMemberExtraInfo extends class978 {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("ary.k")
	public int field12229;

	@ObfuscatedName("ary.f")
	public int field12226;

	@ObfuscatedName("ary.w")
	public int field12227;

	@ObfuscatedName("ary.l")
	public int field12228;

	public SetMemberExtraInfo(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
		this.field12229 = -1;
	}

	@ObfuscatedName("ary.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12229 = arg0.g2();
		this.field12226 = arg0.g4s();
		this.field12227 = arg0.g1();
		this.field12228 = arg0.g1();
	}

	@ObfuscatedName("ary.n(Lkr;I)V")
	public void method17727(class309 arg0) {
		arg0.method5269(this.field12229, this.field12226, this.field12227, this.field12228);
	}
}

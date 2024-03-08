package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.clansettings.ClanSettingsDelta;
import com.jagex.class309;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("arj")
public class UpdateBaseSettings extends class978 {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("arj.k")
	public boolean field12237;

	@ObfuscatedName("arj.f")
	public byte field12235;

	@ObfuscatedName("arj.w")
	public byte field12234;

	@ObfuscatedName("arj.l")
	public byte field12233;

	@ObfuscatedName("arj.u")
	public byte field12236;

	public UpdateBaseSettings(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("arj.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12237 = arg0.g1() == 1;
		this.field12235 = arg0.g1b();
		this.field12234 = arg0.g1b();
		this.field12233 = arg0.g1b();
		this.field12236 = arg0.g1b();
	}

	@ObfuscatedName("arj.n(Lkr;I)V")
	public void method17727(class309 arg0) {
		arg0.field3097 = this.field12237;
		arg0.field3098 = this.field12235;
		arg0.field3090 = this.field12234;
		arg0.field3100 = this.field12233;
		arg0.field3117 = this.field12236;
	}
}

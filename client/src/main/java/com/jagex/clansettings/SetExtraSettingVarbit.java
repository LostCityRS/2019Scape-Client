package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.ClanSettings;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("arw")
public class SetExtraSettingVarbit extends class978 {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("arw.k")
	public int field12245;

	@ObfuscatedName("arw.f")
	public int field12246;

	@ObfuscatedName("arw.w")
	public int field12247;

	@ObfuscatedName("arw.l")
	public int field12248;

	public SetExtraSettingVarbit(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("arw.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12245 = arg0.g4s();
		this.field12248 = arg0.g4s();
		this.field12246 = arg0.g1();
		this.field12247 = arg0.g1();
	}

	@ObfuscatedName("arw.n(Lkr;I)V")
	public void method17727(ClanSettings arg0) {
		arg0.method5271(this.field12245, this.field12248, this.field12246, this.field12247);
	}
}

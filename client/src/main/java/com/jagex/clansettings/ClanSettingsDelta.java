package com.jagex.clansettings;

import com.jagex.*;
import deob.ObfuscatedName;

@ObfuscatedName("kd")
public class ClanSettingsDelta {

	@ObfuscatedName("kd.e")
	public long field3133;

	@ObfuscatedName("kd.n")
	public int field3123 = -1;

	@ObfuscatedName("kd.m")
	public IterableQueue field3136 = new IterableQueue();

	public ClanSettingsDelta(Packet arg0) {
		this.method5331(arg0);
	}

	@ObfuscatedName("kd.e(Lalw;B)V")
	public void method5331(Packet arg0) {
		this.field3133 = arg0.g8();
		this.field3123 = arg0.g4s();
		for (int var2 = arg0.g1(); var2 != 0; var2 = arg0.g1()) {
			class978 var3;
			if (var2 == 3) {
				var3 = new AddBanned(this);
			} else if (var2 == 1) {
				var3 = new AddMemberV1(this);
			} else if (var2 == 13) {
				var3 = new AddMemberV2(this);
			} else if (var2 == 4) {
				var3 = new UpdateBaseSettings(this);
			} else if (var2 == 6) {
				var3 = new DeleteBanned(this);
			} else if (var2 == 5) {
				var3 = new DeleteMember(this);
			} else if (var2 == 2) {
				var3 = new SetMemberRank(this);
			} else if (var2 == 7) {
				var3 = new SetMemberExtraInfo(this);
			} else if (var2 == 14) {
				var3 = new SetMemberMuted(this);
			} else if (var2 == 8) {
				var3 = new SetExtraSettingInt(this);
			} else if (var2 == 9) {
				var3 = new SetExtraSettingLong(this);
			} else if (var2 == 10) {
				var3 = new SetExtraSettingString(this);
			} else if (var2 == 11) {
				var3 = new SetExtraSettingVarbit(this);
			} else if (var2 == 12) {
				var3 = new SetClanName(this);
			} else {
				throw new RuntimeException("");
			}
			var3.method17726(arg0);
			this.field3136.method14153(var3);
		}
	}

	@ObfuscatedName("kd.n(Lkr;I)V")
	public void method5333(ClanSettings arg0) {
		if (this.field3133 != arg0.field3113 || this.field3123 != arg0.field3094) {
			throw new RuntimeException("");
		}
		for (class978 var2 = (class978) this.field3136.method14191(); var2 != null; var2 = (class978) this.field3136.method14161()) {
			var2.method17727(arg0);
		}
		arg0.field3094++;
	}
}

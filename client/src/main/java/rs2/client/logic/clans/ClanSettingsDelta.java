package rs2.client.logic.clans;

import com.jagex.core.datastruct.IterableQueue;
import com.jagex.core.io.Packet;
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
			ClanSettingsDeltaEntry var3;
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
			this.field3136.pushBack(var3);
		}
	}

	// line 58
	@ObfuscatedName("kd.n(Lkr;I)V")
	public void method5333(ClanSettings arg0) {
		if (this.field3133 != arg0.field3113 || this.field3123 != arg0.field3094) {
			throw new RuntimeException("");
		}
		for (ClanSettingsDeltaEntry var2 = (ClanSettingsDeltaEntry) this.field3136.peekFront(); var2 != null; var2 = (ClanSettingsDeltaEntry) this.field3136.prev()) {
			var2.method17727(arg0);
		}
		arg0.field3094++;
	}

	@ObfuscatedName("aqj")
	public static class AddMemberV1 extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("aqj.k")
		public long field12214;

		@ObfuscatedName("aqj.f")
		public String field12215;

		// line 75
		public AddMemberV1(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.field12214 = -1L;
			this.field12215 = null;
		}

		@ObfuscatedName("aqj.e(Lalw;B)V")
		public void method17726(Packet arg0) {
			if (arg0.g1() != 255) {
				arg0.pos -= 1;
				this.field12214 = arg0.g8();
			}
			this.field12215 = arg0.fastgstr();
		}

		@ObfuscatedName("aqj.n(Lkr;I)V")
		public void method17727(ClanSettings arg0) {
			arg0.method5262(this.field12214, this.field12215, 0);
		}
	}

	@ObfuscatedName("arc")
	public static class AddMemberV2 extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("arc.k")
		public long field12240;

		@ObfuscatedName("arc.f")
		public String field12239;

		@ObfuscatedName("arc.w")
		public int field12238;

		// line 95
		public AddMemberV2(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.field12240 = -1L;
			this.field12239 = null;
			this.field12238 = 0;
		}

		@ObfuscatedName("arc.e(Lalw;B)V")
		public void method17726(Packet arg0) {
			if (arg0.g1() != 255) {
				arg0.pos -= 1;
				this.field12240 = arg0.g8();
			}
			this.field12239 = arg0.fastgstr();
			this.field12238 = arg0.g2();
		}

		@ObfuscatedName("arc.n(Lkr;I)V")
		public void method17727(ClanSettings arg0) {
			arg0.method5262(this.field12240, this.field12239, this.field12238);
		}
	}

	@ObfuscatedName("ari")
	public static class DeleteMember extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("ari.k")
		public int field12224;

		// line 114
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

	@ObfuscatedName("arp")
	public static class SetMemberRank extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("arp.k")
		public int field12222;

		@ObfuscatedName("arp.f")
		public byte field12223;

		// line 129
		public SetMemberRank(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.field12222 = -1;
		}

		@ObfuscatedName("arp.e(Lalw;B)V")
		public void method17726(Packet arg0) {
			this.field12222 = arg0.g2();
			this.field12223 = arg0.g1b();
		}

		@ObfuscatedName("arp.n(Lkr;I)V")
		public void method17727(ClanSettings arg0) {
			arg0.method5267(this.field12222, this.field12223);
		}
	}

	@ObfuscatedName("ary")
	public static class SetMemberExtraInfo extends ClanSettingsDeltaEntry {

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

		// line 147
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
		public void method17727(ClanSettings arg0) {
			arg0.method5269(this.field12229, this.field12226, this.field12227, this.field12228);
		}
	}

	@ObfuscatedName("arx")
	public static class SetMemberMuted extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("arx.k")
		public int field12218;

		@ObfuscatedName("arx.f")
		public boolean field12219;

		// line 165
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

	@ObfuscatedName("are")
	public static class AddBanned extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("are.k")
		public long field12216;

		@ObfuscatedName("are.f")
		public String field12217;

		// line 181
		public AddBanned(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.field12216 = -1L;
			this.field12217 = null;
		}

		@ObfuscatedName("are.e(Lalw;B)V")
		public void method17726(Packet arg0) {
			if (arg0.g1() != 255) {
				arg0.pos -= 1;
				this.field12216 = arg0.g8();
			}
			this.field12217 = arg0.fastgstr();
		}

		@ObfuscatedName("are.n(Lkr;I)V")
		public void method17727(ClanSettings arg0) {
			arg0.method5308(this.field12216, this.field12217);
		}
	}

	@ObfuscatedName("arb")
	public static class DeleteBanned extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("arb.k")
		public int field12244;

		// line 199
		public DeleteBanned(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.field12244 = -1;
		}

		@ObfuscatedName("arb.e(Lalw;B)V")
		public void method17726(Packet arg0) {
			this.field12244 = arg0.g2();
		}

		@ObfuscatedName("arb.n(Lkr;I)V")
		public void method17727(ClanSettings arg0) {
			arg0.method5266(this.field12244);
		}
	}

	@ObfuscatedName("arl")
	public static class SetClanName extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("arl.k")
		public String field12232;

		// line 213
		public SetClanName(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("arl.e(Lalw;B)V")
		public void method17726(Packet arg0) {
			this.field12232 = arg0.gjstr();
			arg0.g4s();
		}

		@ObfuscatedName("arl.n(Lkr;I)V")
		public void method17727(ClanSettings arg0) {
			arg0.clanName = this.field12232;
		}
	}

	@ObfuscatedName("arj")
	public static class UpdateBaseSettings extends ClanSettingsDeltaEntry {

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

		// line 232
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
		public void method17727(ClanSettings arg0) {
			arg0.allowUnaffined = this.field12237;
			arg0.rankTalk = this.field12235;
			arg0.rankKick = this.field12234;
			arg0.rankLootshare = this.field12233;
			arg0.coinshare = this.field12236;
		}
	}

	@ObfuscatedName("art")
	public static class SetExtraSettingInt extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("art.k")
		public int field12242;

		@ObfuscatedName("art.f")
		public int field12243;

		// line 255
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

	@ObfuscatedName("arw")
	public static class SetExtraSettingVarbit extends ClanSettingsDeltaEntry {

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

		// line 273
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

	@ObfuscatedName("arg")
	public static class SetExtraSettingLong extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("arg.k")
		public int field12220;

		@ObfuscatedName("arg.f")
		public long field12221;

		// line 291
		public SetExtraSettingLong(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("arg.e(Lalw;B)V")
		public void method17726(Packet arg0) {
			this.field12220 = arg0.g4s();
			this.field12221 = arg0.g8();
		}

		@ObfuscatedName("arg.n(Lkr;I)V")
		public void method17727(ClanSettings arg0) {
			arg0.method5272(this.field12220, this.field12221);
		}
	}

	@ObfuscatedName("aro")
	public static class SetExtraSettingString extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

		@ObfuscatedName("aro.k")
		public int field12231;

		@ObfuscatedName("aro.f")
		public String field12230;

		// line 307
		public SetExtraSettingString(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("aro.e(Lalw;B)V")
		public void method17726(Packet arg0) {
			this.field12231 = arg0.g4s();
			this.field12230 = arg0.gjstr();
		}

		@ObfuscatedName("aro.n(Lkr;I)V")
		public void method17727(ClanSettings arg0) {
			arg0.method5273(this.field12231, this.field12230);
		}
	}
}

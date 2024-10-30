package rs2.client.logic.clans;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("kd")
public class ClanSettingsDelta {

	@ObfuscatedName("kd.e")
	public long ownerHash;

	@ObfuscatedName("kd.n")
	public int updateNum = -1;

	@ObfuscatedName("kd.m")
	public LinkList queue = new LinkList();

	public ClanSettingsDelta(Packet arg0) {
		this.decode(arg0);
	}

	@ObfuscatedName("kd.e(Lalw;B)V")
	public void decode(Packet arg0) {
		this.ownerHash = arg0.g8();
		this.updateNum = arg0.g4s();
		for (int var2 = arg0.g1(); var2 != 0; var2 = arg0.g1()) {
			ClanSettingsDeltaEntry var3;
			if (var2 == 3) {
				var3 = new ClanSettingsDelta.AddBanned();
			} else if (var2 == 1) {
				var3 = new ClanSettingsDelta.AddMemberV1();
			} else if (var2 == 13) {
				var3 = new ClanSettingsDelta.AddMemberV2();
			} else if (var2 == 4) {
				var3 = new ClanSettingsDelta.UpdateBaseSettings();
			} else if (var2 == 6) {
				var3 = new ClanSettingsDelta.DeleteBanned();
			} else if (var2 == 5) {
				var3 = new ClanSettingsDelta.DeleteMember();
			} else if (var2 == 2) {
				var3 = new ClanSettingsDelta.SetMemberRank();
			} else if (var2 == 7) {
				var3 = new ClanSettingsDelta.SetMemberExtraInfo();
			} else if (var2 == 14) {
				var3 = new ClanSettingsDelta.SetMemberMuted();
			} else if (var2 == 8) {
				var3 = new ClanSettingsDelta.SetExtraSettingInt();
			} else if (var2 == 9) {
				var3 = new ClanSettingsDelta.SetExtraSettingLong();
			} else if (var2 == 10) {
				var3 = new ClanSettingsDelta.SetExtraSettingString();
			} else if (var2 == 11) {
				var3 = new ClanSettingsDelta.SetExtraSettingVarbit();
			} else if (var2 == 12) {
				var3 = new ClanSettingsDelta.SetClanName();
			} else {
				throw new RuntimeException("");
			}
			var3.decode(arg0);
			this.queue.addTail(var3);
		}
	}

	@ObfuscatedName("kd.n(Lkr;I)V")
	public void applyToClanSettings(ClanSettings arg0) {
		if (this.ownerHash != arg0.owner || this.updateNum != arg0.updateNum) {
			throw new RuntimeException("");
		}
		for (ClanSettingsDeltaEntry var2 = (ClanSettingsDeltaEntry) this.queue.head(); var2 != null; var2 = (ClanSettingsDeltaEntry) this.queue.next()) {
			var2.apply(arg0);
		}
		arg0.updateNum++;
	}

	@ObfuscatedName("aqj")
	public class AddMemberV1 extends ClanSettingsDeltaEntry {

		@ObfuscatedName("aqj.k")
		public long userhash = -1L;

		@ObfuscatedName("aqj.f")
		public String displayname = null;

		@ObfuscatedName("aqj.e(Lalw;B)V")
		public void decode(Packet arg0) {
			if (arg0.g1() != 255) {
				arg0.pos--;
				this.userhash = arg0.g8();
			}
			this.displayname = arg0.fastgstr();
		}

		@ObfuscatedName("aqj.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doAddMember(this.userhash, this.displayname, 0);
		}
	}

	@ObfuscatedName("are")
	public class AddBanned extends ClanSettingsDeltaEntry {

		@ObfuscatedName("are.k")
		public long userhash = -1L;

		@ObfuscatedName("are.f")
		public String displayname = null;

		@ObfuscatedName("are.e(Lalw;B)V")
		public void decode(Packet arg0) {
			if (arg0.g1() != 255) {
				arg0.pos--;
				this.userhash = arg0.g8();
			}
			this.displayname = arg0.fastgstr();
		}

		@ObfuscatedName("are.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doAddBanned(this.userhash, this.displayname);
		}
	}

	@ObfuscatedName("arx")
	public class SetMemberMuted extends ClanSettingsDeltaEntry {

		@ObfuscatedName("arx.k")
		public int pos = -1;

		@ObfuscatedName("arx.f")
		public boolean muted;

		@ObfuscatedName("arx.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.pos = arg0.g2();
			this.muted = arg0.g1() == 1;
		}

		@ObfuscatedName("arx.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doSetMemberMuted(this.pos, this.muted);
		}
	}

	@ObfuscatedName("arg")
	public class SetExtraSettingLong extends ClanSettingsDeltaEntry {

		@ObfuscatedName("arg.k")
		public int uid;

		@ObfuscatedName("arg.f")
		public long setting;

		@ObfuscatedName("arg.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.uid = arg0.g4s();
			this.setting = arg0.g8();
		}

		@ObfuscatedName("arg.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doExtraSettingLong(this.uid, this.setting);
		}
	}

	@ObfuscatedName("arp")
	public class SetMemberRank extends ClanSettingsDeltaEntry {

		@ObfuscatedName("arp.k")
		public int pos = -1;

		@ObfuscatedName("arp.f")
		public byte rank;

		@ObfuscatedName("arp.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.pos = arg0.g2();
			this.rank = arg0.g1b();
		}

		@ObfuscatedName("arp.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doSetMemberRank(this.pos, this.rank);
		}
	}

	@ObfuscatedName("ari")
	public class DeleteMember extends ClanSettingsDeltaEntry {

		@ObfuscatedName("ari.k")
		public int pos = -1;

		@ObfuscatedName("ari.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.pos = arg0.g2();
		}

		@ObfuscatedName("ari.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doDeleteMember(this.pos);
		}
	}

	@ObfuscatedName("ary")
	public class SetMemberExtraInfo extends ClanSettingsDeltaEntry {

		@ObfuscatedName("ary.k")
		public int pos = -1;

		@ObfuscatedName("ary.f")
		public int field12226;

		@ObfuscatedName("ary.w")
		public int field12227;

		@ObfuscatedName("ary.l")
		public int field12228;

		@ObfuscatedName("ary.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.pos = arg0.g2();
			this.field12226 = arg0.g4s();
			this.field12227 = arg0.g1();
			this.field12228 = arg0.g1();
		}

		@ObfuscatedName("ary.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doSetMemberExtraInfo(this.pos, this.field12226, this.field12227, this.field12228);
		}
	}

	@ObfuscatedName("aro")
	public class SetExtraSettingString extends ClanSettingsDeltaEntry {

		@ObfuscatedName("aro.k")
		public int uid;

		@ObfuscatedName("aro.f")
		public String setting;

		@ObfuscatedName("aro.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.uid = arg0.g4s();
			this.setting = arg0.gjstr();
		}

		@ObfuscatedName("aro.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doExtraSettingString(this.uid, this.setting);
		}
	}

	@ObfuscatedName("arl")
	public class SetClanName extends ClanSettingsDeltaEntry {

		@ObfuscatedName("arl.k")
		public String clanName;

		@ObfuscatedName("arl.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.clanName = arg0.gjstr();
			arg0.g4s();
		}

		@ObfuscatedName("arl.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.clanName = this.clanName;
		}
	}

	@ObfuscatedName("arj")
	public class UpdateBaseSettings extends ClanSettingsDeltaEntry {

		@ObfuscatedName("arj.k")
		public boolean allowUnaffined;

		@ObfuscatedName("arj.f")
		public byte rankTalk;

		@ObfuscatedName("arj.w")
		public byte rankKick;

		@ObfuscatedName("arj.l")
		public byte rankLootshare;

		@ObfuscatedName("arj.u")
		public byte coinshare;

		@ObfuscatedName("arj.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.allowUnaffined = arg0.g1() == 1;
			this.rankTalk = arg0.g1b();
			this.rankKick = arg0.g1b();
			this.rankLootshare = arg0.g1b();
			this.coinshare = arg0.g1b();
		}

		@ObfuscatedName("arj.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.allowUnaffined = this.allowUnaffined;
			arg0.rankTalk = this.rankTalk;
			arg0.rankKick = this.rankKick;
			arg0.rankLootshare = this.rankLootshare;
			arg0.coinshare = this.coinshare;
		}
	}

	@ObfuscatedName("arc")
	public class AddMemberV2 extends ClanSettingsDeltaEntry {

		@ObfuscatedName("arc.k")
		public long userhash = -1L;

		@ObfuscatedName("arc.f")
		public String displayname = null;

		@ObfuscatedName("arc.w")
		public int joinedRunedays = 0;

		@ObfuscatedName("arc.e(Lalw;B)V")
		public void decode(Packet arg0) {
			if (arg0.g1() != 255) {
				arg0.pos--;
				this.userhash = arg0.g8();
			}
			this.displayname = arg0.fastgstr();
			this.joinedRunedays = arg0.g2();
		}

		@ObfuscatedName("arc.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doAddMember(this.userhash, this.displayname, this.joinedRunedays);
		}
	}

	@ObfuscatedName("art")
	public class SetExtraSettingInt extends ClanSettingsDeltaEntry {

		@ObfuscatedName("art.k")
		public int uid;

		@ObfuscatedName("art.f")
		public int setting;

		@ObfuscatedName("art.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.uid = arg0.g4s();
			this.setting = arg0.g4s();
		}

		@ObfuscatedName("art.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doExtraSettingInt(this.uid, this.setting);
		}
	}

	@ObfuscatedName("arb")
	public class DeleteBanned extends ClanSettingsDeltaEntry {

		@ObfuscatedName("arb.k")
		public int pos = -1;

		@ObfuscatedName("arb.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.pos = arg0.g2();
		}

		@ObfuscatedName("arb.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doDeleteBanned(this.pos);
		}
	}

	@ObfuscatedName("arw")
	public class SetExtraSettingVarbit extends ClanSettingsDeltaEntry {

		@ObfuscatedName("arw.k")
		public int uid;

		@ObfuscatedName("arw.f")
		public int field12246;

		@ObfuscatedName("arw.w")
		public int field12247;

		@ObfuscatedName("arw.l")
		public int field12248;

		@ObfuscatedName("arw.e(Lalw;B)V")
		public void decode(Packet arg0) {
			this.uid = arg0.g4s();
			this.field12248 = arg0.g4s();
			this.field12246 = arg0.g1();
			this.field12247 = arg0.g1();
		}

		@ObfuscatedName("arw.n(Lkr;I)V")
		public void apply(ClanSettings arg0) {
			arg0.doExtraSettingVarbit(this.uid, this.field12248, this.field12246, this.field12247);
		}
	}
}

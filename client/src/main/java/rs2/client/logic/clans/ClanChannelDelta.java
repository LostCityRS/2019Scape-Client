package rs2.client.logic.clans;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("kc")
public class ClanChannelDelta {

	@ObfuscatedName("kc.e")
	public long clanHash;

	@ObfuscatedName("kc.n")
	public long updateNum = -1L;

	@ObfuscatedName("kc.m")
	public LinkList queue = new LinkList();

	public ClanChannelDelta(Packet arg0) {
		this.decode(arg0);
	}

	@ObfuscatedName("kc.e(Lalw;I)V")
	public void decode(Packet arg0) {
		this.clanHash = arg0.g8();
		this.updateNum = arg0.g8();
		for (int var2 = arg0.g1(); var2 != 0; var2 = arg0.g1()) {
			ClanChannelDeltaEntry var3;
			if (var2 == 1) {
				var3 = new ClanChannelDelta.AddUser();
			} else if (var2 == 4) {
				var3 = new ClanChannelDelta.UpdateBaseSettings();
			} else if (var2 == 3) {
				var3 = new ClanChannelDelta.DeleteUser();
			} else if (var2 == 2) {
				var3 = new ClanChannelDelta.UpdateUserDetails();
			} else if (var2 == 5) {
				var3 = new ClanChannelDelta.UpdateUserDetailsV2();
			} else {
				throw new RuntimeException("");
			}
			var3.decode(arg0);
			this.queue.addTail(var3);
		}
	}

	@ObfuscatedName("kc.n(Lakr;B)V")
	public void applyToClanChannel(ClanChannel arg0) {
		if (this.clanHash != arg0.nodeId || this.updateNum != arg0.updateNum) {
			throw new RuntimeException("");
		}
		for (ClanChannelDeltaEntry var2 = (ClanChannelDeltaEntry) this.queue.head(); var2 != null; var2 = (ClanChannelDeltaEntry) this.queue.next()) {
			var2.apply(arg0);
		}
		arg0.updateNum++;
	}

	@ObfuscatedName("arh")
	public class UpdateUserDetails extends ClanChannelDeltaEntry {

		@ObfuscatedName("arh.k")
		public int field12252 = -1;

		@ObfuscatedName("arh.f")
		public byte memberrank;

		@ObfuscatedName("arh.w")
		public int memberworld;

		@ObfuscatedName("arh.l")
		public String membername;

		@ObfuscatedName("arh.e(Lalw;I)V")
		public void decode(Packet arg0) {
			this.field12252 = arg0.g2();
			this.memberrank = arg0.g1b();
			this.memberworld = arg0.g2();
			arg0.g8();
			this.membername = arg0.gjstr();
		}

		@ObfuscatedName("arh.n(Lakr;S)V")
		public void apply(ClanChannel arg0) {
			ClanChannelUser var2 = arg0.channelUsers[this.field12252];
			var2.rank = this.memberrank;
			var2.world = this.memberworld;
			var2.name = this.membername;
		}
	}

	@ObfuscatedName("aru")
	public class DeleteUser extends ClanChannelDeltaEntry {

		@ObfuscatedName("aru.k")
		public int pos = -1;

		@ObfuscatedName("aru.e(Lalw;I)V")
		public void decode(Packet arg0) {
			this.pos = arg0.g2();
			arg0.g1();
			if (arg0.g1() != 255) {
				arg0.pos--;
				arg0.g8();
			}
		}

		@ObfuscatedName("aru.n(Lakr;S)V")
		public void apply(ClanChannel arg0) {
			arg0.doDeleteUser(this.pos);
		}
	}

	@ObfuscatedName("arf")
	public class UpdateBaseSettings extends ClanChannelDeltaEntry {

		@ObfuscatedName("arf.k")
		public String clanName;

		@ObfuscatedName("arf.f")
		public byte rankTalk;

		@ObfuscatedName("arf.w")
		public byte rankKick;

		@ObfuscatedName("arf.e(Lalw;I)V")
		public void decode(Packet arg0) {
			this.clanName = arg0.fastgstr();
			if (this.clanName != null) {
				arg0.g1();
				this.rankTalk = arg0.g1b();
				this.rankKick = arg0.g1b();
			}
		}

		@ObfuscatedName("arf.n(Lakr;S)V")
		public void apply(ClanChannel arg0) {
			arg0.clanName = this.clanName;
			if (this.clanName != null) {
				arg0.rankTalk = this.rankTalk;
				arg0.rankKick = this.rankKick;
			}
		}
	}

	@ObfuscatedName("arz")
	public class AddUser extends ClanChannelDeltaEntry {

		@ObfuscatedName("arz.k")
		public String membername = null;

		@ObfuscatedName("arz.f")
		public int memberworld;

		@ObfuscatedName("arz.w")
		public byte memberrank;

		@ObfuscatedName("arz.e(Lalw;I)V")
		public void decode(Packet arg0) {
			if (arg0.g1() != 255) {
				arg0.pos--;
				arg0.g8();
			}
			this.membername = arg0.fastgstr();
			this.memberworld = arg0.g2();
			this.memberrank = arg0.g1b();
			arg0.g8();
		}

		@ObfuscatedName("arz.n(Lakr;S)V")
		public void apply(ClanChannel arg0) {
			ClanChannelUser var2 = new ClanChannelUser();
			var2.name = this.membername;
			var2.world = this.memberworld;
			var2.rank = this.memberrank;
			arg0.doAddUser(var2);
		}
	}

	@ObfuscatedName("arv")
	public class UpdateUserDetailsV2 extends ClanChannelDeltaEntry {

		@ObfuscatedName("arv.k")
		public int pos = -1;

		@ObfuscatedName("arv.f")
		public byte memberrank;

		@ObfuscatedName("arv.w")
		public int memberworld;

		@ObfuscatedName("arv.l")
		public String membername;

		@ObfuscatedName("arv.e(Lalw;I)V")
		public void decode(Packet arg0) {
			arg0.g1();
			this.pos = arg0.g2();
			this.memberrank = arg0.g1b();
			this.memberworld = arg0.g2();
			arg0.g8();
			this.membername = arg0.gjstr();
			arg0.g1();
		}

		@ObfuscatedName("arv.n(Lakr;S)V")
		public void apply(ClanChannel arg0) {
			ClanChannelUser var2 = arg0.channelUsers[this.pos];
			var2.rank = this.memberrank;
			var2.world = this.memberworld;
			var2.name = this.membername;
		}
	}
}

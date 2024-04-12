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

	public ClanChannelDelta(Packet buf) {
		this.decode(buf);
	}

	@ObfuscatedName("kc.e(Lalw;I)V")
	public void decode(Packet buf) {
		this.clanHash = buf.g8();
		this.updateNum = buf.g8();
		for (int code = buf.g1(); code != 0; code = buf.g1()) {
			ClanChannelDeltaEntry entry;
			if (code == 1) {
				entry = new AddUser(this);
			} else if (code == 4) {
				entry = new UpdateBaseSettings(this);
			} else if (code == 3) {
				entry = new DeleteUser(this);
			} else if (code == 2) {
				entry = new UpdateUserDetails(this);
			} else if (code == 5) {
				entry = new UpdateUserDetailsV2(this);
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			entry.decode(buf);
			this.queue.addTail(entry);
		}
	}

	// line 40
	@ObfuscatedName("kc.n(Lakr;B)V")
	public void applyToClanChannel(ClanChannel clanChannel) {
		if (this.clanHash != clanChannel.nodeId || this.updateNum != clanChannel.updateNum) {
            // throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + dr574.bq + " updateNum:" + dr574.n + " delta.clanHash:" + this.g + " updateNum:" + this.d);
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match!");
		}
		for (ClanChannelDeltaEntry entry = (ClanChannelDeltaEntry) this.queue.head(); entry != null; entry = (ClanChannelDeltaEntry) this.queue.next()) {
			entry.apply(clanChannel);
		}
		clanChannel.updateNum++;
	}

	@ObfuscatedName("arz")
	public static class AddUser extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

		@ObfuscatedName("arz.k")
		public String membername;

		@ObfuscatedName("arz.f")
		public int memberworld;

		@ObfuscatedName("arz.w")
		public byte memberrank;

		// line 58
		public AddUser(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.membername = null;
		}

		@ObfuscatedName("arz.e(Lalw;I)V")
		public void decode(Packet buf) {
			if (buf.g1() != 255) {
				buf.pos -= 1;
				buf.g8();
			}
			this.membername = buf.fastgstr();
			this.memberworld = buf.g2();
			this.memberrank = buf.g1b();
			buf.g8();
		}

		@ObfuscatedName("arz.n(Lakr;S)V")
		public void apply(ClanChannel channel) {
			ClanChannelUser user = new ClanChannelUser();
			user.name = this.membername;
			user.world = this.memberworld;
			user.rank = this.memberrank;
			channel.doAddUser(user);
		}
	}

	@ObfuscatedName("aru")
	public static class DeleteUser extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

		@ObfuscatedName("aru.k")
		public int pos;

		// line 83
		public DeleteUser(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.pos = -1;
		}

		@ObfuscatedName("aru.e(Lalw;I)V")
		public void decode(Packet buf) {
			this.pos = buf.g2();
			buf.g1();
			if (buf.g1() != 255) {
				buf.pos -= 1;
				buf.g8();
			}
		}

		@ObfuscatedName("aru.n(Lakr;S)V")
		public void apply(ClanChannel channel) {
			channel.doDeleteUser(this.pos);
		}
	}

	@ObfuscatedName("arh")
	public static class UpdateUserDetails extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

		@ObfuscatedName("arh.k")
		public int field12252;

		@ObfuscatedName("arh.f")
		public byte memberrank;

		@ObfuscatedName("arh.w")
		public int memberworld;

		@ObfuscatedName("arh.l")
		public String membername;

		// line 105
		public UpdateUserDetails(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.field12252 = -1;
		}

		@ObfuscatedName("arh.e(Lalw;I)V")
		public void decode(Packet buf) {
			this.field12252 = buf.g2();
			this.memberrank = buf.g1b();
			this.memberworld = buf.g2();
			buf.g8();
			this.membername = buf.gjstr();
		}

		@ObfuscatedName("arh.n(Lakr;S)V")
		public void apply(ClanChannel channel) {
			ClanChannelUser var2 = channel.channelUsers[this.field12252];
			var2.rank = this.memberrank;
			var2.world = this.memberworld;
			var2.name = this.membername;
		}
	}

	@ObfuscatedName("arv")
	public static class UpdateUserDetailsV2 extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

		@ObfuscatedName("arv.k")
		public int pos;

		@ObfuscatedName("arv.f")
		public byte memberrank;

		@ObfuscatedName("arv.w")
		public int memberworld;

		@ObfuscatedName("arv.l")
		public String membername;

		// line 129
		public UpdateUserDetailsV2(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.pos = -1;
		}

		@ObfuscatedName("arv.e(Lalw;I)V")
		public void decode(Packet buf) {
			buf.g1();
			this.pos = buf.g2();
			this.memberrank = buf.g1b();
			this.memberworld = buf.g2();
			buf.g8();
			this.membername = buf.gjstr();
			buf.g1();
		}

		@ObfuscatedName("arv.n(Lakr;S)V")
		public void apply(ClanChannel channel) {
			ClanChannelUser user = channel.channelUsers[this.pos];
			user.rank = this.memberrank;
			user.world = this.memberworld;
			user.name = this.membername;
		}
	}

	@ObfuscatedName("arf")
	public static class UpdateBaseSettings extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

		@ObfuscatedName("arf.k")
		public String clanName;

		@ObfuscatedName("arf.f")
		public byte rankTalk;

		@ObfuscatedName("arf.w")
		public byte rankKick;

		// line 154
		public UpdateBaseSettings(ClanChannelDelta arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("arf.e(Lalw;I)V")
		public void decode(Packet buf) {
			this.clanName = buf.fastgstr();
			if (this.clanName != null) {
				buf.g1();
				this.rankTalk = buf.g1b();
				this.rankKick = buf.g1b();
			}
		}

		@ObfuscatedName("arf.n(Lakr;S)V")
		public void apply(ClanChannel channel) {
			channel.clanName = this.clanName;
			if (this.clanName != null) {
				channel.rankTalk = this.rankTalk;
				channel.rankKick = this.rankKick;
			}
		}
	}
}

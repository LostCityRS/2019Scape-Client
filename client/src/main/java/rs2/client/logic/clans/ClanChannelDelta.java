package rs2.client.logic.clans;

import com.jagex.core.datastruct.IterableQueue;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("kc")
public class ClanChannelDelta {

	@ObfuscatedName("kc.e")
	public long field3140;

	@ObfuscatedName("kc.n")
	public long field3146 = -1L;

	@ObfuscatedName("kc.m")
	public IterableQueue field3141 = new IterableQueue();

	public ClanChannelDelta(Packet arg0) {
		this.method5343(arg0);
	}

	@ObfuscatedName("kc.e(Lalw;I)V")
	public void method5343(Packet arg0) {
		this.field3140 = arg0.g8();
		this.field3146 = arg0.g8();
		for (int var2 = arg0.g1(); var2 != 0; var2 = arg0.g1()) {
			ClanChannelDeltaEntry var3;
			if (var2 == 1) {
				var3 = new AddUser(this);
			} else if (var2 == 4) {
				var3 = new UpdateBaseSettings(this);
			} else if (var2 == 3) {
				var3 = new DeleteUser(this);
			} else if (var2 == 2) {
				var3 = new UpdateUserDetails(this);
			} else if (var2 == 5) {
				var3 = new UpdateUserDetailsV2(this);
			} else {
				throw new RuntimeException("");
			}
			var3.method17757(arg0);
			this.field3141.pushBack(var3);
		}
	}

	// line 40
	@ObfuscatedName("kc.n(Lakr;B)V")
	public void method5342(ClanChannel arg0) {
		if (this.field3140 != arg0.nodeId || this.field3146 != arg0.field11395) {
			throw new RuntimeException("");
		}
		for (ClanChannelDeltaEntry var2 = (ClanChannelDeltaEntry) this.field3141.peekFront(); var2 != null; var2 = (ClanChannelDeltaEntry) this.field3141.prev()) {
			var2.method17753(arg0);
		}
		arg0.field11395++;
	}

	@ObfuscatedName("arz")
	public static class AddUser extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

		@ObfuscatedName("arz.k")
		public String field12258;

		@ObfuscatedName("arz.f")
		public int field12257;

		@ObfuscatedName("arz.w")
		public byte field12259;

		// line 58
		public AddUser(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.field12258 = null;
		}

		@ObfuscatedName("arz.e(Lalw;I)V")
		public void method17757(Packet arg0) {
			if (arg0.g1() != 255) {
				arg0.pos -= 1;
				arg0.g8();
			}
			this.field12258 = arg0.fastgstr();
			this.field12257 = arg0.g2();
			this.field12259 = arg0.g1b();
			arg0.g8();
		}

		@ObfuscatedName("arz.n(Lakr;S)V")
		public void method17753(ClanChannel arg0) {
			ClanChannelUser var2 = new ClanChannelUser();
			var2.displayName = this.field12258;
			var2.world = this.field12257;
			var2.rank = this.field12259;
			arg0.method17734(var2);
		}
	}

	@ObfuscatedName("aru")
	public static class DeleteUser extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

		@ObfuscatedName("aru.k")
		public int field12253;

		// line 83
		public DeleteUser(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.field12253 = -1;
		}

		@ObfuscatedName("aru.e(Lalw;I)V")
		public void method17757(Packet arg0) {
			this.field12253 = arg0.g2();
			arg0.g1();
			if (arg0.g1() != 255) {
				arg0.pos -= 1;
				arg0.g8();
			}
		}

		@ObfuscatedName("aru.n(Lakr;S)V")
		public void method17753(ClanChannel arg0) {
			arg0.method17735(this.field12253);
		}
	}

	@ObfuscatedName("arh")
	public static class UpdateUserDetails extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

		@ObfuscatedName("arh.k")
		public int field12252;

		@ObfuscatedName("arh.f")
		public byte field12250;

		@ObfuscatedName("arh.w")
		public int field12249;

		@ObfuscatedName("arh.l")
		public String field12251;

		// line 105
		public UpdateUserDetails(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.field12252 = -1;
		}

		@ObfuscatedName("arh.e(Lalw;I)V")
		public void method17757(Packet arg0) {
			this.field12252 = arg0.g2();
			this.field12250 = arg0.g1b();
			this.field12249 = arg0.g2();
			arg0.g8();
			this.field12251 = arg0.gjstr();
		}

		@ObfuscatedName("arh.n(Lakr;S)V")
		public void method17753(ClanChannel arg0) {
			ClanChannelUser var2 = arg0.channelUsers[this.field12252];
			var2.rank = this.field12250;
			var2.world = this.field12249;
			var2.displayName = this.field12251;
		}
	}

	@ObfuscatedName("arv")
	public static class UpdateUserDetailsV2 extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

		@ObfuscatedName("arv.k")
		public int field12263;

		@ObfuscatedName("arv.f")
		public byte field12261;

		@ObfuscatedName("arv.w")
		public int field12262;

		@ObfuscatedName("arv.l")
		public String field12260;

		// line 129
		public UpdateUserDetailsV2(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.field12263 = -1;
		}

		@ObfuscatedName("arv.e(Lalw;I)V")
		public void method17757(Packet arg0) {
			arg0.g1();
			this.field12263 = arg0.g2();
			this.field12261 = arg0.g1b();
			this.field12262 = arg0.g2();
			arg0.g8();
			this.field12260 = arg0.gjstr();
			arg0.g1();
		}

		@ObfuscatedName("arv.n(Lakr;S)V")
		public void method17753(ClanChannel arg0) {
			ClanChannelUser var2 = arg0.channelUsers[this.field12263];
			var2.rank = this.field12261;
			var2.world = this.field12262;
			var2.displayName = this.field12260;
		}
	}

	@ObfuscatedName("arf")
	public static class UpdateBaseSettings extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

		@ObfuscatedName("arf.k")
		public String field12255;

		@ObfuscatedName("arf.f")
		public byte field12254;

		@ObfuscatedName("arf.w")
		public byte field12256;

		// line 154
		public UpdateBaseSettings(ClanChannelDelta arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("arf.e(Lalw;I)V")
		public void method17757(Packet arg0) {
			this.field12255 = arg0.fastgstr();
			if (this.field12255 != null) {
				arg0.g1();
				this.field12254 = arg0.g1b();
				this.field12256 = arg0.g1b();
			}
		}

		@ObfuscatedName("arf.n(Lakr;S)V")
		public void method17753(ClanChannel arg0) {
			arg0.clanName = this.field12255;
			if (this.field12255 != null) {
				arg0.rankTalk = this.field12254;
				arg0.rankKick = this.field12256;
			}
		}
	}
}

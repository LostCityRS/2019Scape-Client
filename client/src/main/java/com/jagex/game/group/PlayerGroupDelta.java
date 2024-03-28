package com.jagex.game.group;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.VarValue;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.config.vartype.bit.VarBitType;
import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("gx")
public class PlayerGroupDelta {

	@ObfuscatedName("gx.e")
	public final long field1945;

	@ObfuscatedName("gx.n")
	public final PlayerGroupResourceProvider groupResourceProvider;

	@ObfuscatedName("gx.m")
	public int field1944 = -1;

	@ObfuscatedName("gx.k")
	public LinkedList entries = new LinkedList();

	public PlayerGroupDelta(Packet arg0, PlayerGroupResourceProvider arg1) {
		this.groupResourceProvider = arg1;
		this.field1945 = arg0.g8();
		this.field1944 = arg0.g4s();
		for (int index = arg0.g1(); index != 0; index = arg0.g1()) {
			PlayerGroupDeltaEncodingKey playerGroupKey = (PlayerGroupDeltaEncodingKey) SerializableEnums.decode(PlayerGroupDeltaEncodingKey.values(), index);
			Object var5;
			switch(playerGroupKey.index) {
				case 0:
					var5 = new UpdateMemberBase(this, arg0);
					break;
				case 1:
					var5 = new AddMember(this, arg0);
					break;
				case 2:
					var5 = new SetMemberOnline(this, arg0);
					break;
				case 3:
					var5 = new SetVarbitValue(this, arg0);
					break;
				case 4:
					var5 = new SetMemberReady(this, arg0);
					break;
				case 5:
					var5 = new StartGame(this);
					break;
				case 6:
					var5 = new AddBanned(this, arg0);
					break;
				case 7:
					var5 = new SetMemberRank(this, arg0);
					break;
				case 8:
					var5 = new SetVarValue(this, arg0);
					break;
				case 9:
					var5 = new DeleteMember(this, arg0);
					break;
				case 10:
					var5 = new DeleteBanned(this, arg0);
					break;
				case 11:
					var5 = new SetMemberOffline(this, arg0);
					break;
				case 12:
					var5 = new SetMemberTeam(this, arg0);
					break;
				case 13:
					var5 = new SetGameLoading(this);
					break;
				default:
					throw new IllegalStateException("");
			}
			this.entries.add(var5);
		}
	}

	// line 76
	@ObfuscatedName("gx.e(Lgq;I)V")
	public void method3555(PlayerGroup arg0) {
		if (this.field1945 != arg0.hashcode || arg0.method3384() != this.field1944) {
			throw new IllegalStateException("");
		}
		Iterator var2 = this.entries.iterator();
		while (var2.hasNext()) {
			PlayerGroupDeltaEntry var3 = (PlayerGroupDeltaEntry) var2.next();
			var3.apply(arg0);
		}
		arg0.method3413();
	}

	@ObfuscatedName("gt")
	public static class AddMember implements PlayerGroupDeltaEntry2 {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gt.e")
		public final PlayerGroupMember member;

		// line 131
		public AddMember(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			boolean hasUid = buf.g1() != 255;
			if (hasUid) {
				buf.pos -= 1;
			}
			this.member = new PlayerGroupMember(buf, hasUid, true, delta.groupResourceProvider);
		}

		@ObfuscatedName("gt.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			group.doAddMember(this.member);
		}
	}

	@ObfuscatedName("fk")
	public static class DeleteMember implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("fk.e")
		public final int index;

		// line 145
		public DeleteMember(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			this.index = buf.g2();
		}

		@ObfuscatedName("fk.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			PlayerGroupMember member = group.doGetMember(this.index);
			member.uid();
			member.getDisplayName();
			group.doDeleteMember(this.index);
		}
	}

	@ObfuscatedName("go")
	public static class AddBanned implements PlayerGroupDeltaEntry2 {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("go.e")
		public final PlayerGroupBanned banned;

		// line 160
		public AddBanned(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			boolean hasUid = buf.g1() != 255;
			if (hasUid) {
				buf.pos -= 1;
			}
			this.banned = new PlayerGroupBanned(buf, hasUid, true);
		}

		@ObfuscatedName("go.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			group.doAddBanned(this.banned);
		}
	}

	@ObfuscatedName("fr")
	public static class DeleteBanned implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("fr.e")
		public final int index;

		// line 174
		public DeleteBanned(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			this.index = buf.g2();
		}

		@ObfuscatedName("fr.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			PlayerGroupBanned banned = (PlayerGroupBanned) group.getBanned().get(this.index);
			group.doDeleteBanned(this.index);
			banned.getDisplayName();
		}
	}

	@ObfuscatedName("gn")
	public static class SetMemberRank implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gn.e")
		public final int index;

		@ObfuscatedName("gn.n")
		public final int rank;

		// line 189
		public SetMemberRank(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			this.index = buf.g2();
			this.rank = buf.g1();
		}

		@ObfuscatedName("gn.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			group.doSetMemberRank(this.index, this.rank);
			group.doGetMember(this.index).uid();
		}
	}

	@ObfuscatedName("gh")
	public static class SetMemberOnline implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gh.e")
		public final int index;

		@ObfuscatedName("gh.n")
		public final int nodeId;

		// line 204
		public SetMemberOnline(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			this.index = buf.g2();
			this.nodeId = buf.g2();
		}

		@ObfuscatedName("gh.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			group.doSetMemberOnline(this.index, this.nodeId);
			group.doGetMember(this.index).uid();
		}
	}

	@ObfuscatedName("gf")
	public static class SetMemberOffline implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gf.e")
		public final int index;

		// line 218
		public SetMemberOffline(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			this.index = buf.g2();
		}

		@ObfuscatedName("gf.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			group.doSetMemberOffline(this.index);
			group.doGetMember(this.index);
		}
	}

	@ObfuscatedName("fe")
	public static class SetMemberReady implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("fe.e")
		public final int index;

		@ObfuscatedName("fe.n")
		public final boolean loading;

		// line 232
		public SetMemberReady(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			this.index = buf.g2();
			this.loading = buf.g1() == 1;
		}

		@ObfuscatedName("fe.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			group.doSetMemberReady(this.index, this.loading);
			group.doGetMember(this.index).uid();
		}
	}

	@ObfuscatedName("gm")
	public static class SetMemberTeam implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gm.e")
		public final int index;

		@ObfuscatedName("gm.n")
		public final int team;

		// line 247
		public SetMemberTeam(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			this.index = buf.g2();
			this.team = buf.g1();
		}

		@ObfuscatedName("gm.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			group.doSetMemberTeam(this.index, this.team);
			group.doGetMember(this.index).uid();
		}
	}

	@ObfuscatedName("gr")
	public static class SetGameLoading implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		// line 259
		public SetGameLoading(PlayerGroupDelta delta) {
			this.this$0 = delta;
		}

		@ObfuscatedName("gr.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			group.setMembersGameLoading();
		}
	}

	@ObfuscatedName("gk")
	public static class StartGame implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		// line 267
		public StartGame(PlayerGroupDelta delta) {
			this.this$0 = delta;
		}

		@ObfuscatedName("gk.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			group.doSetMembersReady();
		}
	}

	@ObfuscatedName("gp")
	public static class UpdateMemberBase implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gp.e")
		public final int index;

		@ObfuscatedName("gp.n")
		public final PlayerGroupMember member;

		// line 278
		public UpdateMemberBase(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			this.index = buf.g2();
			this.member = new PlayerGroupMember(buf, false, false, delta.groupResourceProvider);
		}

		@ObfuscatedName("gp.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			group.updateMember(this.index, this.member);
		}
	}

	@ObfuscatedName("gc")
	public static class SetVarValue implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gc.e")
		public final VarValue varValue;

		// line 291
		public SetVarValue(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			if (buf.g2() == 65535) {
				this.varValue = null;
			} else {
				buf.pos -= 2;
				this.varValue = delta.groupResourceProvider.getVarPlayerGroupTypeList().decodeVarValue(buf);
			}
		}

		@ObfuscatedName("gc.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			if (this.varValue != null) {
				group.getVarDomain().setVarValue((VarType) this.this$0.groupResourceProvider.getVarPlayerGroupTypeList().list(this.varValue.var), this.varValue.value);
			}
		}
	}

	@ObfuscatedName("gl")
	public static class SetVarbitValue implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gl.e")
		public final int varbitId;

		@ObfuscatedName("gl.n")
		public final int varbitValue;

		// line 309
		public SetVarbitValue(PlayerGroupDelta delta, Packet buf) {
			this.this$0 = delta;
			int varbitId = buf.g2();
			if (varbitId == 65535) {
				this.varbitId = -1;
				this.varbitValue = 0;
			} else {
				this.varbitId = varbitId;
				this.varbitValue = buf.g4s();
			}
		}

		@ObfuscatedName("gl.e(Lgq;B)V")
		public void apply(PlayerGroup group) {
			if (this.varbitId != -1) {
				try {
					group.getVarDomain().setVarbitValue((VarBitType) this.this$0.groupResourceProvider.getVarBitTypeList().list(this.varbitId), this.varbitValue);
				} catch (VarBitOverflowException var3) {
				}
			}
		}
	}
}

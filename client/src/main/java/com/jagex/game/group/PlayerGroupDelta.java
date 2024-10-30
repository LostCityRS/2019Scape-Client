package com.jagex.game.group;

import com.jagex.core.constants.SerializableEnum;
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
		for (int var3 = arg0.g1(); var3 != 0; var3 = arg0.g1()) {
			PlayerGroupDeltaEncodingKey var4 = (PlayerGroupDeltaEncodingKey) SerializableEnums.decode((SerializableEnum[]) PlayerGroupDeltaEncodingKey.values(), var3);
			Object var5;
			switch(var4.index) {
				case 0:
					var5 = new PlayerGroupDelta.UpdateMemberBase(arg0);
					break;
				case 1:
					var5 = new PlayerGroupDelta.AddMember(arg0);
					break;
				case 2:
					var5 = new PlayerGroupDelta.SetMemberOnline(arg0);
					break;
				case 3:
					var5 = new PlayerGroupDelta.SetVarbitValue(arg0);
					break;
				case 4:
					var5 = new PlayerGroupDelta.SetMemberReady(arg0);
					break;
				case 5:
					var5 = new PlayerGroupDelta.StartGame();
					break;
				case 6:
					var5 = new PlayerGroupDelta.AddBanned(arg0);
					break;
				case 7:
					var5 = new PlayerGroupDelta.SetMemberRank(arg0);
					break;
				case 8:
					var5 = new PlayerGroupDelta.SetVarValue(arg0);
					break;
				case 9:
					var5 = new PlayerGroupDelta.DeleteMember(arg0);
					break;
				case 10:
					var5 = new PlayerGroupDelta.DeleteBanned(arg0);
					break;
				case 11:
					var5 = new PlayerGroupDelta.SetMemberOffline(arg0);
					break;
				case 12:
					var5 = new PlayerGroupDelta.SetMemberTeam(arg0);
					break;
				case 13:
					var5 = new PlayerGroupDelta.SetGameLoading();
					break;
				default:
					throw new IllegalStateException("");
			}
			this.entries.add(var5);
		}
	}

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

	@ObfuscatedName("fe")
	public class SetMemberReady implements PlayerGroupDeltaEntry {

		@ObfuscatedName("fe.e")
		public final int index;

		@ObfuscatedName("fe.n")
		public final boolean loading;

		public SetMemberReady(Packet arg1) {
			this.index = arg1.g2();
			this.loading = arg1.g1() == 1;
		}

		@ObfuscatedName("fe.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			arg0.doSetMemberReady(this.index, this.loading);
			arg0.doGetMember(this.index).uid();
		}
	}

	@ObfuscatedName("fk")
	public class DeleteMember implements PlayerGroupDeltaEntry {

		@ObfuscatedName("fk.e")
		public final int index;

		public DeleteMember(Packet arg1) {
			this.index = arg1.g2();
		}

		@ObfuscatedName("fk.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			PlayerGroupMember var2 = arg0.doGetMember(this.index);
			var2.uid();
			var2.getDisplayName();
			arg0.doDeleteMember(this.index);
		}
	}

	@ObfuscatedName("fr")
	public class DeleteBanned implements PlayerGroupDeltaEntry {

		@ObfuscatedName("fr.e")
		public final int index;

		public DeleteBanned(Packet arg1) {
			this.index = arg1.g2();
		}

		@ObfuscatedName("fr.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			PlayerGroupBanned var2 = (PlayerGroupBanned) arg0.getBanned().get(this.index);
			arg0.doDeleteBanned(this.index);
			var2.getDisplayName();
		}
	}

	@ObfuscatedName("gl")
	public class SetVarbitValue implements PlayerGroupDeltaEntry {

		@ObfuscatedName("gl.e")
		public final int varbitId;

		@ObfuscatedName("gl.n")
		public final int varbitValue;

		public SetVarbitValue(Packet arg1) {
			int var3 = arg1.g2();
			if (var3 == 65535) {
				this.varbitId = -1;
				this.varbitValue = 0;
			} else {
				this.varbitId = var3;
				this.varbitValue = arg1.g4s();
			}
		}

		@ObfuscatedName("gl.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			if (this.varbitId != -1) {
				try {
					arg0.getVarDomain().setVarbitValue((VarBitType) PlayerGroupDelta.this.groupResourceProvider.getVarBitTypeList().list(this.varbitId), this.varbitValue);
				} catch (VarBitOverflowException var3) {
				}
			}
		}
	}

	@ObfuscatedName("go")
	public class AddBanned implements PlayerGroupDeltaEntry2 {

		@ObfuscatedName("go.e")
		public final PlayerGroupBanned banned;

		public AddBanned(Packet arg1) {
			boolean var3 = arg1.g1() != 255;
			if (var3) {
				arg1.pos--;
			}
			this.banned = new PlayerGroupBanned(arg1, var3, true);
		}

		@ObfuscatedName("go.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			arg0.doAddBanned(this.banned);
		}
	}

	@ObfuscatedName("gk")
	public class StartGame implements PlayerGroupDeltaEntry {

		@ObfuscatedName("gk.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			arg0.doSetMembersReady();
		}
	}

	@ObfuscatedName("gp")
	public class UpdateMemberBase implements PlayerGroupDeltaEntry {

		@ObfuscatedName("gp.e")
		public final int index;

		@ObfuscatedName("gp.n")
		public final PlayerGroupMember member;

		public UpdateMemberBase(Packet arg1) {
			this.index = arg1.g2();
			this.member = new PlayerGroupMember(arg1, false, false, PlayerGroupDelta.this.groupResourceProvider);
		}

		@ObfuscatedName("gp.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			arg0.updateMember(this.index, this.member);
		}
	}

	@ObfuscatedName("gn")
	public class SetMemberRank implements PlayerGroupDeltaEntry {

		@ObfuscatedName("gn.e")
		public final int index;

		@ObfuscatedName("gn.n")
		public final int rank;

		public SetMemberRank(Packet arg1) {
			this.index = arg1.g2();
			this.rank = arg1.g1();
		}

		@ObfuscatedName("gn.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			arg0.doSetMemberRank(this.index, this.rank);
			arg0.doGetMember(this.index).uid();
		}
	}

	@ObfuscatedName("gc")
	public class SetVarValue implements PlayerGroupDeltaEntry {

		@ObfuscatedName("gc.e")
		public final VarValue varValue;

		public SetVarValue(Packet arg1) {
			if (arg1.g2() == 65535) {
				this.varValue = null;
			} else {
				arg1.pos -= 2;
				this.varValue = PlayerGroupDelta.this.groupResourceProvider.getVarPlayerGroupTypeList().decodeVarValue(arg1);
			}
		}

		@ObfuscatedName("gc.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			if (this.varValue != null) {
				arg0.getVarDomain().setVarValue((VarType) PlayerGroupDelta.this.groupResourceProvider.getVarPlayerGroupTypeList().list(this.varValue.var), this.varValue.value);
			}
		}
	}

	@ObfuscatedName("gf")
	public class SetMemberOffline implements PlayerGroupDeltaEntry {

		@ObfuscatedName("gf.e")
		public final int index;

		public SetMemberOffline(Packet arg1) {
			this.index = arg1.g2();
		}

		@ObfuscatedName("gf.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			arg0.doSetMemberOffline(this.index);
			arg0.doGetMember(this.index);
		}
	}

	@ObfuscatedName("gr")
	public class SetGameLoading implements PlayerGroupDeltaEntry {

		@ObfuscatedName("gr.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			arg0.setMembersGameLoading();
		}
	}

	@ObfuscatedName("gt")
	public class AddMember implements PlayerGroupDeltaEntry2 {

		@ObfuscatedName("gt.e")
		public final PlayerGroupMember member;

		public AddMember(Packet arg1) {
			boolean var3 = arg1.g1() != 255;
			if (var3) {
				arg1.pos--;
			}
			this.member = new PlayerGroupMember(arg1, var3, true, PlayerGroupDelta.this.groupResourceProvider);
		}

		@ObfuscatedName("gt.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			arg0.doAddMember(this.member);
		}
	}

	@ObfuscatedName("gh")
	public class SetMemberOnline implements PlayerGroupDeltaEntry {

		@ObfuscatedName("gh.e")
		public final int index;

		@ObfuscatedName("gh.n")
		public final int nodeId;

		public SetMemberOnline(Packet arg1) {
			this.index = arg1.g2();
			this.nodeId = arg1.g2();
		}

		@ObfuscatedName("gh.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			arg0.doSetMemberOnline(this.index, this.nodeId);
			arg0.doGetMember(this.index).uid();
		}
	}

	@ObfuscatedName("gm")
	public class SetMemberTeam implements PlayerGroupDeltaEntry {

		@ObfuscatedName("gm.e")
		public final int index;

		@ObfuscatedName("gm.n")
		public final int team;

		public SetMemberTeam(Packet arg1) {
			this.index = arg1.g2();
			this.team = arg1.g1();
		}

		@ObfuscatedName("gm.e(Lgq;B)V")
		public void apply(PlayerGroup arg0) {
			arg0.doSetMemberTeam(this.index, this.team);
			arg0.doGetMember(this.index).uid();
		}
	}
}

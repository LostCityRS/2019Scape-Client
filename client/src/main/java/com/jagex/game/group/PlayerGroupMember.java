package com.jagex.game.group;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.VarValue;
import com.jagex.game.config.vartype.VarContainerSparse;
import com.jagex.game.world.entity.PlayerStat;
import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("gy")
public class PlayerGroupMember {

	@ObfuscatedName("gy.m")
	public final long groupUid;

	@ObfuscatedName("gy.k")
	public final PlayerStat[] stats;

	@ObfuscatedName("gy.f")
	public final VarContainerSparse vars;

	@ObfuscatedName("gy.w")
	public boolean members;

	@ObfuscatedName("gy.l")
	public String displayName;

	@ObfuscatedName("gy.u")
	public int nodeId;

	@ObfuscatedName("gy.z")
	public boolean online;

	@ObfuscatedName("gy.p")
	public int rank;

	@ObfuscatedName("gy.d")
	public PlayerGroupMemberStatus status;

	@ObfuscatedName("gy.c")
	public int team;

	@ObfuscatedName("gy.r")
	public VarContainerSparse variables;

	public PlayerGroupMember(Packet arg0, boolean arg1, boolean arg2, PlayerGroupResourceProvider arg3) {
		if (arg1) {
			this.groupUid = arg0.g8();
		} else {
			this.groupUid = -1L;
		}
		if (arg2) {
			this.displayName = arg0.fastgstr();
		}
		int var5 = arg0.g1();
		this.members = (var5 & 0x1) != 0;
		this.online = (var5 & 0x2) != 0;
		this.stats = new PlayerStat[arg3.getSkillDefaults().getSkillCount()];
		int var6 = arg0.g1();
		if (var6 > this.stats.length) {
			throw new IllegalStateException("");
		}
		for (int var7 = 0; var7 < this.stats.length; var7++) {
			PlayerStat var8 = this.stats[var7] = new PlayerStat(arg3.getSkillDefaults().getSkill(var7), true);
			if (var7 < var6) {
				var8.setXP(arg0.g4s());
			} else {
				var8.setXP(0);
			}
			var8.setLevel(var8.getXPLevel());
		}
		int var9 = arg0.g2();
		this.vars = new VarContainerSparse(arg3.getVarPlayerTypeList());
		for (int var10 = 0; var10 < var9; var10++) {
			VarValue var11 = arg3.getVarPlayerTypeList().decodeVarValue(arg0);
			this.vars.setVarValue(var11.var, var11.value);
		}
		this.nodeId = arg0.g2();
		if (this.nodeId == 65535) {
			this.nodeId = -1;
		}
		this.rank = arg0.g1();
		this.status = (PlayerGroupMemberStatus) SerializableEnums.decode((SerializableEnum[]) PlayerGroupMemberStatus.values(), arg0.g1());
		this.team = arg0.g1();
	}

	@ObfuscatedName("gy.e(I)Ljava/lang/String;")
	public String getDisplayName() {
		return this.displayName;
	}

	@ObfuscatedName("gy.n(S)I")
	public int getRank() {
		return this.rank;
	}

	@ObfuscatedName("gy.m(IB)V")
	public void setRank(int arg0) {
		this.rank = arg0;
	}

	@ObfuscatedName("gy.k(B)I")
	public int getNodeId() {
		return this.nodeId;
	}

	@ObfuscatedName("gy.f(II)V")
	public void setNodeId(int arg0) {
		this.nodeId = arg0;
	}

	@ObfuscatedName("gy.w(B)Z")
	public boolean isOnline() {
		return this.online;
	}

	@ObfuscatedName("gy.l(ZB)V")
	public void setOnline(boolean arg0) {
		this.online = arg0;
	}

	@ObfuscatedName("gy.u(S)Lgv;")
	public PlayerGroupMemberStatus getStatus() {
		return this.status;
	}

	@ObfuscatedName("gy.z(Lgv;I)V")
	public void setStatus(PlayerGroupMemberStatus arg0) {
		this.status = arg0;
	}

	@ObfuscatedName("gy.p(B)I")
	public int getTeam() {
		return this.team;
	}

	@ObfuscatedName("gy.d(II)V")
	public void setTeam(int arg0) {
		this.team = arg0;
	}

	@ObfuscatedName("gy.c(I)J")
	public long uid() {
		return this.groupUid;
	}

	@ObfuscatedName("gy.r(I)Z")
	public boolean isMembers() {
		return this.members;
	}

	@ObfuscatedName("gy.v(IB)Lxz;")
	public PlayerStat getStat(int arg0) {
		return this.stats[arg0];
	}

	@ObfuscatedName("gy.o(Lgy;I)V")
	public void update(PlayerGroupMember arg0) {
		for (int var2 = 0; var2 < this.stats.length; var2++) {
			this.stats[var2].setXP(arg0.stats[var2].getXP());
			this.stats[var2].setLevel(this.stats[var2].getXPLevel());
		}
		this.vars.clear();
		Iterator var3 = arg0.vars.iterator();
		while (var3.hasNext()) {
			VarValue var4 = (VarValue) var3.next();
			this.vars.setVarValue(var4.var, var4.value);
		}
		this.members = arg0.members;
	}

	@ObfuscatedName("gy.s(Lgu;B)V")
	public void resetVariables(PlayerGroupResourceProvider arg0) {
		if (this.variables == null) {
			this.variables = new VarContainerSparse(arg0.getVarPlayerTypeList());
		} else {
			this.variables.clear();
		}
	}

	@ObfuscatedName("gy.y(I)Labn;")
	public VarContainerSparse clearVariables() {
		return this.variables;
	}
}

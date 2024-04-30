package com.jagex.game.group;

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

	public PlayerGroupMember(Packet buf, boolean hasUid, boolean hasDisplayName, PlayerGroupResourceProvider groupResourceProvider) {
		if (hasUid) {
			this.groupUid = buf.g8();
		} else {
			this.groupUid = -1L;
		}
		if (hasDisplayName) {
			this.displayName = buf.fastgstr();
		}
		int info = buf.g1();
		this.members = (info & 0x1) != 0;
		this.online = (info & 0x2) != 0;
		this.stats = new PlayerStat[groupResourceProvider.getSkillDefaults().getSkillCount()];
		int var6 = buf.g1();
		if (var6 > this.stats.length) {
			throw new IllegalStateException("");
		}
		for (int index = 0; index < this.stats.length; index++) {
			PlayerStat stat = this.stats[index] = new PlayerStat(groupResourceProvider.getSkillDefaults().getSkill(index), true);
			if (index < var6) {
				stat.setXP(buf.g4s());
			} else {
				stat.setXP(0);
			}
			stat.setLevel(stat.getXPLevel());
		}
		int varsCount = buf.g2();
		this.vars = new VarContainerSparse(groupResourceProvider.getVarPlayerTypeList());
		for (int index = 0; index < varsCount; index++) {
			VarValue varValue = groupResourceProvider.getVarPlayerTypeList().decodeVarValue(buf);
			this.vars.setVarValue(varValue.var, varValue.value);
		}
		this.nodeId = buf.g2();
		if (this.nodeId == 65535) {
			this.nodeId = -1;
		}
		this.rank = buf.g1();
		this.status = (PlayerGroupMemberStatus) SerializableEnums.decode(PlayerGroupMemberStatus.values(), buf.g1());
		this.team = buf.g1();
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
	public void setRank(int rank) {
		this.rank = rank;
	}

	@ObfuscatedName("gy.k(B)I")
	public int getNodeId() {
		return this.nodeId;
	}

	@ObfuscatedName("gy.f(II)V")
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	@ObfuscatedName("gy.w(B)Z")
	public boolean isOnline() {
		return this.online;
	}

	@ObfuscatedName("gy.l(ZB)V")
	public void setOnline(boolean online) {
		this.online = online;
	}

	@ObfuscatedName("gy.u(S)Lgv;")
	public PlayerGroupMemberStatus getStatus() {
		return this.status;
	}

	@ObfuscatedName("gy.z(Lgv;I)V")
	public void setStatus(PlayerGroupMemberStatus status) {
		this.status = status;
	}

	@ObfuscatedName("gy.p(B)I")
	public int getTeam() {
		return this.team;
	}

	@ObfuscatedName("gy.d(II)V")
	public void setTeam(int team) {
		this.team = team;
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
	public PlayerStat getStat(int stat) {
		return this.stats[stat];
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

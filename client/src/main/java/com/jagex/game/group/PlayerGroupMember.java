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
	public final long field1924;

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
	public VarContainerSparse field1934;

	public PlayerGroupMember(Packet buf, boolean arg1, boolean arg2, PlayerGroupResourceProvider arg3) {
		if (arg1) {
			this.field1924 = buf.g8();
		} else {
			this.field1924 = -1L;
		}
		if (arg2) {
			this.displayName = buf.fastgstr();
		}
		int var5 = buf.g1();
		this.members = (var5 & 0x1) != 0;
		this.online = (var5 & 0x2) != 0;
		this.stats = new PlayerStat[arg3.method295().getSkillCount()];
		int var6 = buf.g1();
		if (var6 > this.stats.length) {
			throw new IllegalStateException("");
		}
		for (int var7 = 0; var7 < this.stats.length; var7++) {
			PlayerStat var8 = this.stats[var7] = new PlayerStat(arg3.method295().getSkill(var7), true);
			if (var7 < var6) {
				var8.setXP(buf.g4s());
			} else {
				var8.setXP(0);
			}
			var8.setLevel(var8.getBaseLevel());
		}
		int var9 = buf.g2();
		this.vars = new VarContainerSparse(arg3.method293());
		for (int var10 = 0; var10 < var9; var10++) {
			VarValue var11 = arg3.method293().decodeVarValue(buf);
			this.vars.method14735(var11.field4240, var11.field4239);
		}
		this.nodeId = buf.g2();
		if (this.nodeId == 65535) {
			this.nodeId = -1;
		}
		this.rank = buf.g1();
		this.status = (PlayerGroupMemberStatus) SerializableEnums.decode(PlayerGroupMemberStatus.method3603(), buf.g1());
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
	public long method3499() {
		return this.field1924;
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
	public void method3502(PlayerGroupMember arg0) {
		for (int var2 = 0; var2 < this.stats.length; var2++) {
			this.stats[var2].setXP(arg0.stats[var2].getXP());
			this.stats[var2].setLevel(this.stats[var2].getBaseLevel());
		}
		this.vars.method14749();
		Iterator var3 = arg0.vars.iterator();
		while (var3.hasNext()) {
			VarValue var4 = (VarValue) var3.next();
			this.vars.method14735(var4.field4240, var4.field4239);
		}
		this.members = arg0.members;
	}

	@ObfuscatedName("gy.s(Lgu;B)V")
	public void method3503(PlayerGroupResourceProvider arg0) {
		if (this.field1934 == null) {
			this.field1934 = new VarContainerSparse(arg0.method293());
		} else {
			this.field1934.method14749();
		}
	}

	@ObfuscatedName("gy.y(I)Labn;")
	public VarContainerSparse method3504() {
		return this.field1934;
	}
}

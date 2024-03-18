package com.jagex.game.group;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.VarValue;
import com.jagex.game.config.vartype.SparseVarDomain;
import com.jagex.game.config.vartype.VarContainerSparse;
import com.jagex.game.config.vartype.VarDomain;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("gq")
public class PlayerGroup {

	@ObfuscatedName("gq.f")
	public final long hashcode;

	@ObfuscatedName("gq.w")
	public final long creationTime;

	@ObfuscatedName("gq.l")
	public final String displayName;

	@ObfuscatedName("gq.u")
	public final boolean membersOnly;

	@ObfuscatedName("gq.z")
	public final int maxSize;

	@ObfuscatedName("gq.p")
	public final VarContainerSparse field1899;

	@ObfuscatedName("gq.d")
	public final ArrayList members;

	@ObfuscatedName("gq.c")
	public final ArrayList banned;

	@ObfuscatedName("gq.r")
	public boolean field1910;

	@ObfuscatedName("gq.v")
	public boolean field1911;

	@ObfuscatedName("gq.o")
	public int ownerSlot = -1;

	@ObfuscatedName("gq.s")
	public int field1913;

	public PlayerGroup(long arg0, Packet arg1, boolean arg2, PlayerGroupResourceProvider arg3) {
		this.hashcode = arg0;
		int var6 = arg1.g1();
		if (var6 <= 0 || var6 > 1) {
			throw new IllegalStateException("");
		}
		int var7 = arg1.g1();
		this.membersOnly = (var7 & 0x1) != 0;
		this.field1910 = (var7 & 0x2) != 0;
		this.field1911 = (var7 & 0x4) != 0;
		this.field1913 = arg1.g4s();
		this.creationTime = arg1.g8();
		this.displayName = arg1.gjstr();
		this.maxSize = arg1.g2s();
		arg1.g4s();
		arg1.g8();
		int var8 = arg1.g2();
		this.members = new ArrayList(var8);
		for (int var9 = 0; var9 < var8; var9++) {
			this.members.add(new PlayerGroupMember(arg1, this.field1910, this.field1911, arg3));
		}
		int var10 = arg1.g2();
		this.banned = new ArrayList(var10);
		for (int var11 = 0; var11 < var10; var11++) {
			this.banned.add(new PlayerGroupBanned(arg1, this.field1910, this.field1911));
		}
		this.field1899 = new VarContainerSparse(arg3.method291());
		int var12 = arg1.g2();
		for (int var13 = 0; var13 < var12; var13++) {
			VarValue var14 = arg3.method291().decodeVarValue(arg1);
			this.field1899.method14735(var14.field4240, var14.field4239);
		}
		if (!arg2) {
			arg1.g2();
			arg1.g2();
			arg1.g2();
			arg1.g2();
			arg1.g2();
		}
		this.method3383();
	}

	@ObfuscatedName("gq.e(B)Ljava/util/List;")
	public List getMembers() {
		return Collections.unmodifiableList(this.members);
	}

	@ObfuscatedName("gq.n(B)Ljava/util/List;")
	public List getBanned() {
		return Collections.unmodifiableList(this.banned);
	}

	@ObfuscatedName("gq.m(I)I")
	public int method3384() {
		return this.field1913;
	}

	@ObfuscatedName("gq.k(B)V")
	public void method3413() {
		this.field1913++;
	}

	@ObfuscatedName("gq.f(I)Z")
	public boolean isMembersOnly() {
		return this.membersOnly;
	}

	@ObfuscatedName("gq.w(I)I")
	public int getMaxSize() {
		return this.maxSize;
	}

	@ObfuscatedName("gq.l(I)J")
	public long getCreationTime() {
		return this.creationTime;
	}

	public int hashCode() {
		return (int) this.hashcode;
	}

	@ObfuscatedName("gq.u(I)V")
	public void method3383() {
		int var1 = -1;
		int var2 = -1;
		for (int var3 = 0; var3 < this.members.size(); var3++) {
			PlayerGroupMember var4 = (PlayerGroupMember) this.members.get(var3);
			int var5 = var4.getRank();
			if (var5 > var1) {
				var1 = var5;
				var2 = var3;
			}
		}
		this.ownerSlot = var2;
	}

	@ObfuscatedName("gq.z(B)I")
	public int getOwnerSlot() {
		return this.ownerSlot;
	}

	@ObfuscatedName("gq.p(B)Lgv;")
	public PlayerGroupMemberStatus overallStatus() {
		if (this.members.isEmpty()) {
			return PlayerGroupMemberStatus.field1977;
		}
		PlayerGroupMemberStatus var1 = ((PlayerGroupMember) this.members.get(0)).getStatus();
		switch(var1.index) {
			case 1:
			case 2:
				return var1;
			default:
				Iterator var2 = this.members.iterator();
				PlayerGroupMember var3;
				do {
					if (!var2.hasNext()) {
						return PlayerGroupMemberStatus.field1976;
					}
					var3 = (PlayerGroupMember) var2.next();
				} while (var3.getStatus() != PlayerGroupMemberStatus.field1977);
				return PlayerGroupMemberStatus.field1977;
		}
	}

	@ObfuscatedName("gq.d(II)Lgy;")
	public PlayerGroupMember getMember(int arg0) {
		return arg0 == -1 ? null : (PlayerGroupMember) this.members.get(arg0);
	}

	@ObfuscatedName("gq.c(I)Ljava/lang/String;")
	public String getDisplayName() {
		return this.displayName;
	}

	@ObfuscatedName("gq.r(I)Leh;")
	public VarDomain method3394() {
		return new SparseVarDomain(VarDomainType.PLAYER_GROUP, this.field1899);
	}

	@ObfuscatedName("gq.v(Lgy;B)V")
	public void addMember(PlayerGroupMember arg0) {
		this.members.add(arg0);
		this.method3383();
	}

	@ObfuscatedName("gq.o(II)V")
	public void deleteMember(int arg0) {
		this.members.remove(arg0);
		this.method3383();
	}

	@ObfuscatedName("gq.s(Lga;S)V")
	public void addBanned(PlayerGroupBanned arg0) {
		this.banned.add(arg0);
	}

	@ObfuscatedName("gq.y(II)V")
	public void deleteBanned(int arg0) {
		this.banned.remove(arg0);
	}

	@ObfuscatedName("gq.q(III)V")
	public void setMemberRank(int arg0, int arg1) {
		((PlayerGroupMember) this.members.get(arg0)).setRank(arg1);
		this.method3383();
	}

	@ObfuscatedName("gq.x(III)V")
	public void setMemberOnline(int arg0, int arg1) {
		PlayerGroupMember var3 = (PlayerGroupMember) this.members.get(arg0);
		var3.setNodeId(arg1);
		var3.setOnline(true);
	}

	@ObfuscatedName("gq.b(II)V")
	public void setMemberOffline(int index) {
		PlayerGroupMember member = (PlayerGroupMember) this.members.get(index);
		member.setOnline(false);
	}

	@ObfuscatedName("gq.h(IZS)V")
	public void method3402(int index, boolean arg1) {
		PlayerGroupMember member = (PlayerGroupMember) this.members.get(index);
		member.setStatus(arg1 ? PlayerGroupMemberStatus.field1976 : PlayerGroupMemberStatus.field1977);
	}

	@ObfuscatedName("gq.a(IIB)V")
	public void setMemberTeam(int index, int team) {
		((PlayerGroupMember) this.members.get(index)).setTeam(team);
	}

	@ObfuscatedName("gq.g(I)V")
	public void setAllMembersOnline() {
		Iterator iterator = this.members.iterator();
		while (iterator.hasNext()) {
			PlayerGroupMember member = (PlayerGroupMember) iterator.next();
			member.setStatus(PlayerGroupMemberStatus.ONLINE);
		}
	}

	@ObfuscatedName("gq.i(B)V")
	public void setAllMembersReady() {
		Iterator iterator = this.members.iterator();
		while (iterator.hasNext()) {
			PlayerGroupMember member = (PlayerGroupMember) iterator.next();
			member.setStatus(PlayerGroupMemberStatus.READY);
		}
	}

	@ObfuscatedName("gq.j(ILgy;I)V")
	public void method3403(int index, PlayerGroupMember arg1) {
		PlayerGroupMember member = (PlayerGroupMember) this.members.get(index);
		member.syncMember(arg1);
	}
}

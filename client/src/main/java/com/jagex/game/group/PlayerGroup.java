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
	public final VarContainerSparse vars;

	@ObfuscatedName("gq.d")
	public final ArrayList members;

	@ObfuscatedName("gq.c")
	public final ArrayList banned;

	@ObfuscatedName("gq.r")
	public boolean hasUid;

	@ObfuscatedName("gq.v")
	public boolean hasDisplayName;

	@ObfuscatedName("gq.o")
	public int ownerSlot = -1;

	@ObfuscatedName("gq.s")
	public int field1913;

	public PlayerGroup(long hashcode, Packet buf, boolean arg2, PlayerGroupResourceProvider groupResourceProvider) {
		this.hashcode = hashcode;
		int var6 = buf.g1();
		if (var6 <= 0 || var6 > 1) {
			throw new IllegalStateException("");
		}
		int info = buf.g1();
		this.membersOnly = (info & 0x1) != 0;
		this.hasUid = (info & 0x2) != 0;
		this.hasDisplayName = (info & 0x4) != 0;
		this.field1913 = buf.g4s();
		this.creationTime = buf.g8();
		this.displayName = buf.gjstr();
		this.maxSize = buf.g2s();
		buf.g4s();
		buf.g8();
		int membersCount = buf.g2();
		this.members = new ArrayList(membersCount);
		for (int index = 0; index < membersCount; index++) {
			this.members.add(new PlayerGroupMember(buf, this.hasUid, this.hasDisplayName, groupResourceProvider));
		}
		int bannedCount = buf.g2();
		this.banned = new ArrayList(bannedCount);
		for (int index = 0; index < bannedCount; index++) {
			this.banned.add(new PlayerGroupBanned(buf, this.hasUid, this.hasDisplayName));
		}
		this.vars = new VarContainerSparse(groupResourceProvider.getVarPlayerGroupTypeList());
		int varsCount = buf.g2();
		for (int index = 0; index < varsCount; index++) {
			VarValue var14 = groupResourceProvider.getVarPlayerGroupTypeList().decodeVarValue(buf);
			this.vars.setVarValue(var14.var, var14.value);
		}
		if (!arg2) {
			buf.g2();
			buf.g2();
			buf.g2();
			buf.g2();
			buf.g2();
		}
		this.setOwnerSlot();
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
	public void setOwnerSlot() {
		int previous = -1;
		int highest = -1;
		for (int index = 0; index < this.members.size(); index++) {
			PlayerGroupMember member = (PlayerGroupMember) this.members.get(index);
			int rank = member.getRank();
			if (rank > previous) {
				previous = rank;
				highest = index;
			}
		}
		this.ownerSlot = highest;
	}

	@ObfuscatedName("gq.z(B)I")
	public int getOwnerSlot() {
		return this.ownerSlot;
	}

	@ObfuscatedName("gq.p(B)Lgv;")
	public PlayerGroupMemberStatus overallStatus() {
		if (this.members.isEmpty()) {
			return PlayerGroupMemberStatus.TELEPORTED;
		}
		PlayerGroupMemberStatus status = ((PlayerGroupMember) this.members.get(0)).getStatus();
		switch(status.index) {
			case 1:
			case 2:
				return status;
			default:
				Iterator iterator = this.members.iterator();
				PlayerGroupMember var3;
				do {
					if (!iterator.hasNext()) {
						return PlayerGroupMemberStatus.NOT_READY;
					}
					var3 = (PlayerGroupMember) iterator.next();
				} while (var3.getStatus() != PlayerGroupMemberStatus.TELEPORTED);
				return PlayerGroupMemberStatus.TELEPORTED;
		}
	}

	@ObfuscatedName("gq.d(II)Lgy;")
	public PlayerGroupMember doGetMember(int index) {
		return index == -1 ? null : (PlayerGroupMember) this.members.get(index);
	}

	@ObfuscatedName("gq.c(I)Ljava/lang/String;")
	public String getDisplayName() {
		return this.displayName;
	}

	@ObfuscatedName("gq.r(I)Leh;")
	public VarDomain getVarDomain() {
		return new SparseVarDomain(VarDomainType.PLAYER_GROUP, this.vars);
	}

	@ObfuscatedName("gq.v(Lgy;B)V")
	public void doAddMember(PlayerGroupMember member) {
		this.members.add(member);
		this.setOwnerSlot();
	}

	@ObfuscatedName("gq.o(II)V")
	public void doDeleteMember(int index) {
		this.members.remove(index);
		this.setOwnerSlot();
	}

	@ObfuscatedName("gq.s(Lga;S)V")
	public void doAddBanned(PlayerGroupBanned banned) {
		this.banned.add(banned);
	}

	@ObfuscatedName("gq.y(II)V")
	public void doDeleteBanned(int index) {
		this.banned.remove(index);
	}

	@ObfuscatedName("gq.q(III)V")
	public void doSetMemberRank(int index, int rank) {
		((PlayerGroupMember) this.members.get(index)).setRank(rank);
		this.setOwnerSlot();
	}

	@ObfuscatedName("gq.x(III)V")
	public void doSetMemberOnline(int index, int nodeId) {
		PlayerGroupMember var3 = (PlayerGroupMember) this.members.get(index);
		var3.setNodeId(nodeId);
		var3.setOnline(true);
	}

	@ObfuscatedName("gq.b(II)V")
	public void doSetMemberOffline(int index) {
		PlayerGroupMember member = (PlayerGroupMember) this.members.get(index);
		member.setOnline(false);
	}

	@ObfuscatedName("gq.h(IZS)V")
	public void doSetMemberReady(int index, boolean loading) {
		PlayerGroupMember member = (PlayerGroupMember) this.members.get(index);
		member.setStatus(loading ? PlayerGroupMemberStatus.NOT_READY : PlayerGroupMemberStatus.TELEPORTED);
	}

	@ObfuscatedName("gq.a(IIB)V")
	public void doSetMemberTeam(int index, int team) {
		((PlayerGroupMember) this.members.get(index)).setTeam(team);
	}

	@ObfuscatedName("gq.g(I)V")
	public void setMembersGameLoading() {
		Iterator iterator = this.members.iterator();
		while (iterator.hasNext()) {
			PlayerGroupMember member = (PlayerGroupMember) iterator.next();
			member.setStatus(PlayerGroupMemberStatus.GAME_LOADING);
		}
	}

	@ObfuscatedName("gq.i(B)V")
	public void doSetMembersReady() {
		Iterator iterator = this.members.iterator();
		while (iterator.hasNext()) {
			PlayerGroupMember member = (PlayerGroupMember) iterator.next();
			member.setStatus(PlayerGroupMemberStatus.READY);
		}
	}

	@ObfuscatedName("gq.j(ILgy;I)V")
	public void updateMember(int index, PlayerGroupMember arg1) {
		PlayerGroupMember member = (PlayerGroupMember) this.members.get(index);
		member.update(arg1);
	}
}

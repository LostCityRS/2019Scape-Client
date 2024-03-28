package rs2.client.logic.clans;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.Algorithms;
import deob.ObfuscatedName;

import java.util.BitSet;

@ObfuscatedName("akr")
public class ClanChannel extends Node {

	@ObfuscatedName("akr.k")
	public boolean useUserHashes;

	@ObfuscatedName("akr.f")
	public boolean useDisplayNames = true;

	@ObfuscatedName("akr.w")
	public ClanChannelUser[] channelUsers;

	@ObfuscatedName("akr.l")
	public int userCount = 0;

	@ObfuscatedName("akr.u")
	public int[] sortedUserSlots;

	@ObfuscatedName("akr.z")
	public long updateNum;

	@ObfuscatedName("akr.p")
	public String clanName = null;

	@ObfuscatedName("akr.d")
	public byte rankTalk;

	@ObfuscatedName("akr.c")
	public byte rankKick;

	static {
		new BitSet(65536);
	}

	@ObfuscatedName("akr.e(IB)V")
	public void allocChannelUsers(int num) {
		if (this.channelUsers == null) {
			this.channelUsers = new ClanChannelUser[num];
		} else {
			System.arraycopy(this.channelUsers, 0, this.channelUsers = new ClanChannelUser[num], 0, this.userCount);
		}
	}

	public ClanChannel(Packet buf) {
		this.decode(buf);
	}

	@ObfuscatedName("akr.n(I)[I")
	public int[] getSortedUserSlot() {
		if (this.sortedUserSlots == null) {
			String[] names = new String[this.userCount];
			this.sortedUserSlots = new int[this.userCount];
			int var2 = 0;
			while (var2 < this.userCount) {
				names[var2] = this.channelUsers[var2].name;
				this.sortedUserSlots[var2] = var2++;
			}
			Algorithms.method4054(names, this.sortedUserSlots);
		}
		return this.sortedUserSlots;
	}

	@ObfuscatedName("akr.m(Lkb;I)V")
	public void doAddUser(ClanChannelUser user) {
		if (this.channelUsers == null || this.userCount >= this.channelUsers.length) {
			this.allocChannelUsers(this.userCount + 5);
		}
		this.channelUsers[++this.userCount - 1] = user;
		this.sortedUserSlots = null;
	}

	@ObfuscatedName("akr.k(II)V")
	public void doDeleteUser(int pos) {
		this.userCount--;
		if (this.userCount == 0) {
			this.channelUsers = null;
		} else {
			System.arraycopy(this.channelUsers, pos + 1, this.channelUsers, pos, this.userCount - pos);
		}
		this.sortedUserSlots = null;
	}

	@ObfuscatedName("akr.f(Ljava/lang/String;B)I")
	public int getUserSlot(String name) {
		for (int index = 0; index < this.userCount; index++) {
			if (this.channelUsers[index].name.equalsIgnoreCase(name)) {
				return index;
			}
		}
		return -1;
	}

	@ObfuscatedName("akr.w(Lalw;I)V")
	public void decode(Packet buf) {
		int info = buf.g1();
		if ((info & 0x1) != 0) {
			this.useUserHashes = true;
		}
		if ((info & 0x2) != 0) {
			this.useDisplayNames = true;
		}
		int var3 = 2;
		if ((info & 0x4) != 0) {
			var3 = buf.g1();
		}
		this.nodeId = buf.g8();
		this.updateNum = buf.g8();
		this.clanName = buf.gjstr();
		buf.g1();
		this.rankKick = buf.g1b();
		this.rankTalk = buf.g1b();
		this.userCount = buf.g2();
		if (this.userCount <= 0) {
			return;
		}
		this.channelUsers = new ClanChannelUser[this.userCount];
		for (int index = 0; index < this.userCount; index++) {
			ClanChannelUser user = new ClanChannelUser();
			if (this.useUserHashes) {
				buf.g8();
			}
			if (this.useDisplayNames) {
				user.name = buf.gjstr();
			}
			user.rank = buf.g1b();
			user.world = buf.g2();
			if (var3 >= 3) {
				buf.g1();
			}
			this.channelUsers[index] = user;
		}
	}
}

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
	public void allocChannelUsers(int arg0) {
		if (this.channelUsers == null) {
			this.channelUsers = new ClanChannelUser[arg0];
		} else {
			System.arraycopy(this.channelUsers, 0, this.channelUsers = new ClanChannelUser[arg0], 0, this.userCount);
		}
	}

	public ClanChannel(Packet arg0) {
		this.decode(arg0);
	}

	@ObfuscatedName("akr.n(I)[I")
	public int[] getSortedUserSlot() {
		if (this.sortedUserSlots == null) {
			String[] var1 = new String[this.userCount];
			this.sortedUserSlots = new int[this.userCount];
			int var2 = 0;
			while (var2 < this.userCount) {
				var1[var2] = this.channelUsers[var2].name;
				this.sortedUserSlots[var2] = var2++;
			}
			Algorithms.method4054(var1, this.sortedUserSlots);
		}
		return this.sortedUserSlots;
	}

	@ObfuscatedName("akr.m(Lkb;I)V")
	public void doAddUser(ClanChannelUser arg0) {
		if (this.channelUsers == null || this.userCount >= this.channelUsers.length) {
			this.allocChannelUsers(this.userCount + 5);
		}
		this.channelUsers[++this.userCount - 1] = arg0;
		this.sortedUserSlots = null;
	}

	@ObfuscatedName("akr.k(II)V")
	public void doDeleteUser(int arg0) {
		this.userCount--;
		if (this.userCount == 0) {
			this.channelUsers = null;
		} else {
			System.arraycopy(this.channelUsers, arg0 + 1, this.channelUsers, arg0, this.userCount - arg0);
		}
		this.sortedUserSlots = null;
	}

	@ObfuscatedName("akr.f(Ljava/lang/String;B)I")
	public int getUserSlot(String arg0) {
		for (int var2 = 0; var2 < this.userCount; var2++) {
			if (this.channelUsers[var2].name.equalsIgnoreCase(arg0)) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("akr.w(Lalw;I)V")
	public void decode(Packet arg0) {
		int var2 = arg0.g1();
		if ((var2 & 0x1) != 0) {
			this.useUserHashes = true;
		}
		if ((var2 & 0x2) != 0) {
			this.useDisplayNames = true;
		}
		int var3 = 2;
		if ((var2 & 0x4) != 0) {
			var3 = arg0.g1();
		}
		this.nodeId = arg0.g8();
		this.updateNum = arg0.g8();
		this.clanName = arg0.gjstr();
		arg0.g1();
		this.rankKick = arg0.g1b();
		this.rankTalk = arg0.g1b();
		this.userCount = arg0.g2();
		if (this.userCount <= 0) {
			return;
		}
		this.channelUsers = new ClanChannelUser[this.userCount];
		for (int var4 = 0; var4 < this.userCount; var4++) {
			ClanChannelUser var5 = new ClanChannelUser();
			if (this.useUserHashes) {
				arg0.g8();
			}
			if (this.useDisplayNames) {
				var5.name = arg0.gjstr();
			}
			var5.rank = arg0.g1b();
			var5.world = arg0.g2();
			if (var3 >= 3) {
				arg0.g1();
			}
			this.channelUsers[var4] = var5;
		}
	}
}

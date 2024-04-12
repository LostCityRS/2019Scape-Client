package rs2.client.logic.clans;

import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.Algorithms;
import com.jagex.game.world.entity.ObjectNode;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("kr")
public class ClanSettings {

	@ObfuscatedName("kr.n")
	public boolean useUserHashes;

	@ObfuscatedName("kr.m")
	public boolean useDisplayNames;

	@ObfuscatedName("kr.k")
	public long owner;

	@ObfuscatedName("kr.f")
	public int updateNum = 0;

	@ObfuscatedName("kr.w")
	public String clanName = null;

	@ObfuscatedName("kr.l")
	public int field3096 = 0;

	@ObfuscatedName("kr.u")
	public boolean allowUnaffined;

	@ObfuscatedName("kr.z")
	public byte rankTalk;

	@ObfuscatedName("kr.p")
	public byte rankKick;

	@ObfuscatedName("kr.d")
	public byte rankLootshare;

	@ObfuscatedName("kr.c")
	public byte coinshare;

	@ObfuscatedName("kr.r")
	public int memberCount;

	@ObfuscatedName("kr.v")
	public long[] affinedUserHashes;

	@ObfuscatedName("kr.o")
	public byte[] affinedRanks;

	@ObfuscatedName("kr.s")
	public int[] field3118;

	@ObfuscatedName("kr.y")
	public int[] extra;

	@ObfuscatedName("kr.q")
	public int[] affinedJoinedRunedays;

	@ObfuscatedName("kr.x")
	public boolean[] affinedMutes;

	@ObfuscatedName("kr.b")
	public int currentOwnerSlot = -1;

	@ObfuscatedName("kr.h")
	public int replacementOwnerSlot = -1;

	@ObfuscatedName("kr.a")
	public int bannedCount;

	@ObfuscatedName("kr.g")
	public long[] bannedUserHashes;

	@ObfuscatedName("kr.i")
	public String[] affinedDisplayNames;

	@ObfuscatedName("kr.j")
	public String[] bannedDisplayNames;

	@ObfuscatedName("kr.t")
	public HashTable settingsMap;

	public ClanSettings(Packet buf) {
		this.decode(buf);
	}

	@ObfuscatedName("kr.e(II)V")
	public void allocAffined(int num) {
		if (this.useUserHashes) {
			if (this.affinedUserHashes == null) {
				this.affinedUserHashes = new long[num];
			} else {
				System.arraycopy(this.affinedUserHashes, 0, this.affinedUserHashes = new long[num], 0, this.memberCount);
			}
		}
		if (this.useDisplayNames) {
			if (this.affinedDisplayNames == null) {
				this.affinedDisplayNames = new String[num];
			} else {
				System.arraycopy(this.affinedDisplayNames, 0, this.affinedDisplayNames = new String[num], 0, this.memberCount);
			}
		}
		if (this.affinedRanks == null) {
			this.affinedRanks = new byte[num];
		} else {
			System.arraycopy(this.affinedRanks, 0, this.affinedRanks = new byte[num], 0, this.memberCount);
		}
		if (this.extra == null) {
			this.extra = new int[num];
		} else {
			System.arraycopy(this.extra, 0, this.extra = new int[num], 0, this.memberCount);
		}
		if (this.affinedJoinedRunedays == null) {
			this.affinedJoinedRunedays = new int[num];
		} else {
			System.arraycopy(this.affinedJoinedRunedays, 0, this.affinedJoinedRunedays = new int[num], 0, this.memberCount);
		}
		if (this.affinedMutes == null) {
			this.affinedMutes = new boolean[num];
		} else {
			System.arraycopy(this.affinedMutes, 0, this.affinedMutes = new boolean[num], 0, this.memberCount);
		}
	}

	@ObfuscatedName("kr.n(II)V")
	public void allocBanned(int num) {
		if (this.useUserHashes) {
			if (this.bannedUserHashes == null) {
				this.bannedUserHashes = new long[num];
			} else {
				System.arraycopy(this.bannedUserHashes, 0, this.bannedUserHashes = new long[num], 0, this.bannedCount);
			}
		}
		if (!this.useDisplayNames) {
			return;
		}
		if (this.bannedDisplayNames == null) {
			this.bannedDisplayNames = new String[num];
		} else {
			System.arraycopy(this.bannedDisplayNames, 0, this.bannedDisplayNames = new String[num], 0, this.bannedCount);
		}
	}

	@ObfuscatedName("kr.m(Ljava/lang/String;B)I")
	public int getAffinedSlot(String displayName) {
		if (displayName == null || displayName.length() == 0) {
			return -1;
		}
		for (int var2 = 0; var2 < this.memberCount; var2++) {
			if (this.affinedDisplayNames[var2].equals(displayName)) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("kr.k(IIII)I")
	public int getExtraInfo(int arg0, int arg1, int arg2) {
		int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.extra[arg0] & var4) >>> arg1;
	}

	@ObfuscatedName("kr.f(II)Ljava/lang/Integer;")
	public Integer getSettingInt(int uid) {
		if (this.settingsMap == null) {
			return null;
		} else {
			Node node = this.settingsMap.get((long) uid);
			return node != null && node instanceof IntNode ? Integer.valueOf(((IntNode) node).value) : null;
		}
	}

	@ObfuscatedName("kr.w(II)Ljava/lang/Long;")
	public Long getSettingLong(int uid) {
		if (this.settingsMap == null) {
			return null;
		} else {
			Node node = this.settingsMap.get((long) uid);
			return node != null && node instanceof LongNode ? Long.valueOf(((LongNode) node).value) : null;
		}
	}

	@ObfuscatedName("kr.l(II)Ljava/lang/String;")
	public String getSettingString(int uid) {
		if (this.settingsMap == null) {
			return null;
		} else {
			Node node = this.settingsMap.get((long) uid);
			return node != null && node instanceof ObjectNode ? (String) ((ObjectNode) node).value : null;
		}
	}

	@ObfuscatedName("kr.u(B)[I")
	public int[] getSortedAffinedSlot() {
		if (this.field3118 == null) {
			String[] var1 = new String[this.memberCount];
			this.field3118 = new int[this.memberCount];
			int var2 = 0;
			while (var2 < this.memberCount) {
				var1[var2] = this.affinedDisplayNames[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
				this.field3118[var2] = var2++;
			}
			Algorithms.method4054(var1, this.field3118);
		}
		return this.field3118;
	}

	@ObfuscatedName("kr.z(JLjava/lang/String;IB)V")
	public void doAddMember(long userhash, String displayname, int joinedRunedays) {
		if (displayname != null && displayname.length() == 0) {
			displayname = null;
		}
		if (this.useUserHashes != userhash > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.useUserHashes + " but userhash:" + userhash);
		} else if ((displayname != null) == this.useDisplayNames) {
			if (userhash > 0L && (this.affinedUserHashes == null || this.memberCount >= this.affinedUserHashes.length) || displayname != null && (this.affinedDisplayNames == null || this.memberCount >= this.affinedDisplayNames.length)) {
				this.allocAffined(this.memberCount + 5);
			}
			if (this.affinedUserHashes != null) {
				this.affinedUserHashes[this.memberCount] = userhash;
			}
			if (this.affinedDisplayNames != null) {
				this.affinedDisplayNames[this.memberCount] = displayname;
			}
			if (this.currentOwnerSlot == -1) {
				this.currentOwnerSlot = this.memberCount;
				this.affinedRanks[this.memberCount] = 126;
			} else {
				this.affinedRanks[this.memberCount] = 0;
			}
			this.extra[this.memberCount] = 0;
			this.affinedJoinedRunedays[this.memberCount] = joinedRunedays;
			this.affinedMutes[this.memberCount] = false;
			this.memberCount++;
			this.field3118 = null;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.useDisplayNames + " but displayname:" + displayname);
		}
	}

	@ObfuscatedName("kr.p(II)V")
	public void doDeleteMember(int pos) {
		if (pos < 0 || pos >= this.memberCount) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + pos + " memberCount:" + this.memberCount);
		}
		this.memberCount--;
		this.field3118 = null;
		if (this.memberCount == 0) {
			this.affinedUserHashes = null;
			this.affinedDisplayNames = null;
			this.affinedRanks = null;
			this.extra = null;
			this.affinedJoinedRunedays = null;
			this.affinedMutes = null;
			this.currentOwnerSlot = -1;
			this.replacementOwnerSlot = -1;
			return;
		}
		System.arraycopy(this.affinedRanks, pos + 1, this.affinedRanks, pos, this.memberCount - pos);
		System.arraycopy(this.extra, pos + 1, this.extra, pos, this.memberCount - pos);
		System.arraycopy(this.affinedJoinedRunedays, pos + 1, this.affinedJoinedRunedays, pos, this.memberCount - pos);
		System.arraycopy(this.affinedMutes, pos + 1, this.affinedMutes, pos, this.memberCount - pos);
		if (this.affinedUserHashes != null) {
			System.arraycopy(this.affinedUserHashes, pos + 1, this.affinedUserHashes, pos, this.memberCount - pos);
		}
		if (this.affinedDisplayNames != null) {
			System.arraycopy(this.affinedDisplayNames, pos + 1, this.affinedDisplayNames, pos, this.memberCount - pos);
		}
		this.method5299();
	}

	@ObfuscatedName("kr.d(I)V")
	public void method5299() {
		if (this.memberCount == 0) {
			this.currentOwnerSlot = -1;
			this.replacementOwnerSlot = -1;
			return;
		}
		this.currentOwnerSlot = -1;
		this.replacementOwnerSlot = -1;
		int var1 = 0;
		byte var2 = this.affinedRanks[0];
		for (int var3 = 1; var3 < this.memberCount; var3++) {
			if (this.affinedRanks[var3] > var2) {
				if (var2 == 125) {
					this.replacementOwnerSlot = var1;
				}
				var1 = var3;
				var2 = this.affinedRanks[var3];
			} else if (this.replacementOwnerSlot == -1 && this.affinedRanks[var3] == 125) {
				this.replacementOwnerSlot = var3;
			}
		}
		this.currentOwnerSlot = var1;
		if (this.currentOwnerSlot != -1) {
			this.affinedRanks[this.currentOwnerSlot] = 126;
		}
	}

	@ObfuscatedName("kr.c(JLjava/lang/String;I)V")
	public void doAddBanned(long userhash, String displayname) {
		if (displayname != null && displayname.length() == 0) {
			displayname = null;
		}
		if (this.useUserHashes != userhash > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.useUserHashes + " but userhash:" + userhash);
		} else if ((displayname != null) == this.useDisplayNames) {
			if (userhash > 0L && (this.bannedUserHashes == null || this.bannedCount >= this.bannedUserHashes.length) || displayname != null && (this.bannedDisplayNames == null || this.bannedCount >= this.bannedDisplayNames.length)) {
				this.allocBanned(this.bannedCount + 5);
			}
			if (this.bannedUserHashes != null) {
				this.bannedUserHashes[this.bannedCount] = userhash;
			}
			if (this.bannedDisplayNames != null) {
				this.bannedDisplayNames[this.bannedCount] = displayname;
			}
			this.bannedCount++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.useDisplayNames + " but displayname:" + displayname);
		}
	}

	@ObfuscatedName("kr.r(II)V")
	public void doDeleteBanned(int pos) {
		this.bannedCount--;
		if (this.bannedCount == 0) {
			this.bannedUserHashes = null;
			this.bannedDisplayNames = null;
			return;
		}
		if (this.bannedUserHashes != null) {
			System.arraycopy(this.bannedUserHashes, pos + 1, this.bannedUserHashes, pos, this.bannedCount - pos);
		}
		if (this.bannedDisplayNames != null) {
			System.arraycopy(this.bannedDisplayNames, pos + 1, this.bannedDisplayNames, pos, this.bannedCount - pos);
		}
	}

	@ObfuscatedName("kr.v(IBB)I")
	public int doSetMemberRank(int pos, byte rank) {
		if (rank == 126 || rank == 127) {
			return -1;
		} else if (this.currentOwnerSlot == pos && (this.replacementOwnerSlot == -1 || this.affinedRanks[this.replacementOwnerSlot] < 125)) {
			return -1;
		} else if (this.affinedRanks[pos] == rank) {
			return -1;
		} else {
			this.affinedRanks[pos] = rank;
			this.method5299();
			return pos;
		}
	}

	@ObfuscatedName("kr.o(IZB)I")
	public int doSetMemberMuted(int pos, boolean muted) {
		if (this.affinedMutes[pos] == muted) {
			return -1;
		} else {
			this.affinedMutes[pos] = muted;
			return pos;
		}
	}

	@ObfuscatedName("kr.s(IIIIB)I")
	public int doSetMemberExtraInfo(int pos, int arg1, int arg2, int arg3) {
		int var5 = (0x1 << arg2) - 1;
		int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		int var7 = var6 ^ var5;
		int var8 = arg1 << arg2;
		int var9 = var8 & var7;
		int var10 = this.extra[pos];
		if ((var10 & var7) == var9) {
			return -1;
		} else {
			int var11 = var10 & ~var7;
			this.extra[pos] = var11 | var9;
			return pos;
		}
	}

	@ObfuscatedName("kr.y(III)Z")
	public boolean doExtraSettingInt(int uid, int setting) {
		if (this.settingsMap == null) {
			this.settingsMap = new HashTable(4);
		} else {
			Node node = this.settingsMap.get((long) uid);
			if (node != null) {
				if (node instanceof IntNode) {
					IntNode settingValue = (IntNode) node;
					if (settingValue.value == setting) {
						return false;
					}
					settingValue.value = setting;
					return true;
				}
				node.unlink();
			}
		}
		this.settingsMap.put(new IntNode(setting), (long) uid);
		return true;
	}

	@ObfuscatedName("kr.q(IIIII)Z")
	public boolean doExtraSettingVarbit(int uid, int arg1, int arg2, int arg3) {
		int var5 = (0x1 << arg2) - 1;
		int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		int var7 = var6 ^ var5;
		int var8 = arg1 << arg2;
		int var9 = var8 & var7;
		if (this.settingsMap == null) {
			this.settingsMap = new HashTable(4);
		} else {
			Node node = this.settingsMap.get((long) uid);
			if (node != null) {
				if (node instanceof IntNode) {
					IntNode settingValue = (IntNode) node;
					if ((settingValue.value & var7) == var9) {
						return false;
					}
					settingValue.value &= ~var7;
					settingValue.value |= var9;
					return true;
				}
				node.unlink();
			}
		}
		this.settingsMap.put(new IntNode(var9), (long) uid);
		return true;
	}

	@ObfuscatedName("kr.x(IJ)Z")
	public boolean doExtraSettingLong(int uid, long setting) {
		if (this.settingsMap == null) {
			this.settingsMap = new HashTable(4);
		} else {
			Node node = this.settingsMap.get((long) uid);
			if (node != null) {
				if (node instanceof LongNode) {
					LongNode settingValue = (LongNode) node;
					if (settingValue.value == setting) {
						return false;
					}
					settingValue.value = setting;
					return true;
				}
				node.unlink();
			}
		}
		this.settingsMap.put(new LongNode(setting), (long) uid);
		return true;
	}

	@ObfuscatedName("kr.b(ILjava/lang/String;I)Z")
	public boolean doExtraSettingString(int uid, String setting) {
		if (setting == null) {
			setting = "";
		} else if (setting.length() > 80) {
			setting = setting.substring(0, 80);
		}
		if (this.settingsMap == null) {
			this.settingsMap = new HashTable(4);
		} else {
			Node node = this.settingsMap.get((long) uid);
			if (node != null) {
				if (node instanceof ObjectNode) {
					ObjectNode settingValue = (ObjectNode) node;
					if (settingValue.value instanceof String) {
						if (setting.equals(settingValue.value)) {
							return false;
						}
						settingValue.unlink();
						this.settingsMap.put(new ObjectNode(setting), settingValue.nodeId);
						return true;
					}
				}
				node.unlink();
			}
		}
		this.settingsMap.put(new ObjectNode(setting), (long) uid);
		return true;
	}

	@ObfuscatedName("kr.h(Lalw;B)V")
	public void decode(Packet buf) {
		int version = buf.g1();
		if (version < 1 || version > 6) {
			throw new RuntimeException("Unsupported ClanSettings version: " + version);
		}
		int info = buf.g1();
		if ((info & 0x1) != 0) {
			this.useUserHashes = true;
		}
		if ((info & 0x2) != 0) {
			this.useDisplayNames = true;
		}
		if (!this.useUserHashes) {
			this.affinedUserHashes = null;
			this.bannedUserHashes = null;
		}
		if (!this.useDisplayNames) {
			this.affinedDisplayNames = null;
			this.bannedDisplayNames = null;
		}
		this.updateNum = buf.g4s();
		this.field3096 = buf.g4s();
		if (version <= 3 && this.field3096 != 0) {
			this.field3096 += 16912800;
		}
		this.memberCount = buf.g2();
		this.bannedCount = buf.g1();
		this.clanName = buf.gjstr();
		if (version >= 4) {
			buf.g4s();
		}
		this.allowUnaffined = buf.g1() == 1;
		this.rankTalk = buf.g1b();
		this.rankKick = buf.g1b();
		this.rankLootshare = buf.g1b();
		this.coinshare = buf.g1b();
		if (this.memberCount > 0) {
			if (this.useUserHashes && (this.affinedUserHashes == null || this.affinedUserHashes.length < this.memberCount)) {
				this.affinedUserHashes = new long[this.memberCount];
			}
			if (this.useDisplayNames && (this.affinedDisplayNames == null || this.affinedDisplayNames.length < this.memberCount)) {
				this.affinedDisplayNames = new String[this.memberCount];
			}
			if (this.affinedRanks == null || this.affinedRanks.length < this.memberCount) {
				this.affinedRanks = new byte[this.memberCount];
			}
			if (this.extra == null || this.extra.length < this.memberCount) {
				this.extra = new int[this.memberCount];
			}
			if (this.affinedJoinedRunedays == null || this.affinedJoinedRunedays.length < this.memberCount) {
				this.affinedJoinedRunedays = new int[this.memberCount];
			}
			if (this.affinedMutes == null || this.affinedMutes.length < this.memberCount) {
				this.affinedMutes = new boolean[this.memberCount];
			}
			for (int index = 0; index < this.memberCount; index++) {
				if (this.useUserHashes) {
					this.affinedUserHashes[index] = buf.g8();
				}
				if (this.useDisplayNames) {
					this.affinedDisplayNames[index] = buf.fastgstr();
				}
				this.affinedRanks[index] = buf.g1b();
				if (version >= 2) {
					this.extra[index] = buf.g4s();
				}
				if (version >= 5) {
					this.affinedJoinedRunedays[index] = buf.g2();
				} else {
					this.affinedJoinedRunedays[index] = 0;
				}
				if (version >= 6) {
					this.affinedMutes[index] = buf.g1() == 1;
				} else {
					this.affinedMutes[index] = false;
				}
			}
			this.method5299();
		}
		if (this.bannedCount > 0) {
			if (this.useUserHashes && (this.bannedUserHashes == null || this.bannedUserHashes.length < this.bannedCount)) {
				this.bannedUserHashes = new long[this.bannedCount];
			}
			if (this.useDisplayNames && (this.bannedDisplayNames == null || this.bannedDisplayNames.length < this.bannedCount)) {
				this.bannedDisplayNames = new String[this.bannedCount];
			}
			for (int index = 0; index < this.bannedCount; index++) {
				if (this.useUserHashes) {
					this.bannedUserHashes[index] = buf.g8();
				}
				if (this.useDisplayNames) {
					this.bannedDisplayNames[index] = buf.fastgstr();
				}
			}
		}
		if (version < 3) {
			return;
		}
		int settingsCount = buf.g2();
		if (settingsCount <= 0) {
			return;
		}
		this.settingsMap = new HashTable(settingsCount < 16 ? IntMath.bitceil(settingsCount) : 16);
		while (settingsCount-- > 0) {
			int setting = buf.g4s();
			int uid = setting & 0x3FFFFFFF;
			int type = setting >>> 30;
			if (type == 0) {
				int value = buf.g4s();
				this.settingsMap.put(new IntNode(value), (long) uid);
			} else if (type == 1) {
				long value = buf.g8();
				this.settingsMap.put(new LongNode(value), (long) uid);
			} else if (type == 2) {
				String value = buf.gjstr();
				this.settingsMap.put(new ObjectNode(value), (long) uid);
			}
		}
	}
}

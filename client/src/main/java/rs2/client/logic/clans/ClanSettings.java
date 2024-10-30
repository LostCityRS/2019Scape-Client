package rs2.client.logic.clans;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.IntNode;
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

	public ClanSettings(Packet arg0) {
		this.decode(arg0);
	}

	@ObfuscatedName("kr.e(II)V")
	public void allocAffined(int arg0) {
		if (this.useUserHashes) {
			if (this.affinedUserHashes == null) {
				this.affinedUserHashes = new long[arg0];
			} else {
				System.arraycopy(this.affinedUserHashes, 0, this.affinedUserHashes = new long[arg0], 0, this.memberCount);
			}
		}
		if (this.useDisplayNames) {
			if (this.affinedDisplayNames == null) {
				this.affinedDisplayNames = new String[arg0];
			} else {
				System.arraycopy(this.affinedDisplayNames, 0, this.affinedDisplayNames = new String[arg0], 0, this.memberCount);
			}
		}
		if (this.affinedRanks == null) {
			this.affinedRanks = new byte[arg0];
		} else {
			System.arraycopy(this.affinedRanks, 0, this.affinedRanks = new byte[arg0], 0, this.memberCount);
		}
		if (this.extra == null) {
			this.extra = new int[arg0];
		} else {
			System.arraycopy(this.extra, 0, this.extra = new int[arg0], 0, this.memberCount);
		}
		if (this.affinedJoinedRunedays == null) {
			this.affinedJoinedRunedays = new int[arg0];
		} else {
			System.arraycopy(this.affinedJoinedRunedays, 0, this.affinedJoinedRunedays = new int[arg0], 0, this.memberCount);
		}
		if (this.affinedMutes == null) {
			this.affinedMutes = new boolean[arg0];
		} else {
			System.arraycopy(this.affinedMutes, 0, this.affinedMutes = new boolean[arg0], 0, this.memberCount);
		}
	}

	@ObfuscatedName("kr.n(II)V")
	public void allocBanned(int arg0) {
		if (this.useUserHashes) {
			if (this.bannedUserHashes == null) {
				this.bannedUserHashes = new long[arg0];
			} else {
				System.arraycopy(this.bannedUserHashes, 0, this.bannedUserHashes = new long[arg0], 0, this.bannedCount);
			}
		}
		if (!this.useDisplayNames) {
			return;
		}
		if (this.bannedDisplayNames == null) {
			this.bannedDisplayNames = new String[arg0];
		} else {
			System.arraycopy(this.bannedDisplayNames, 0, this.bannedDisplayNames = new String[arg0], 0, this.bannedCount);
		}
	}

	@ObfuscatedName("kr.m(Ljava/lang/String;B)I")
	public int getAffinedSlot(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (int var2 = 0; var2 < this.memberCount; var2++) {
			if (this.affinedDisplayNames[var2].equals(arg0)) {
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
	public Integer getSettingInt(int arg0) {
		if (this.settingsMap == null) {
			return null;
		} else {
			Node var2 = this.settingsMap.get((long) arg0);
			return var2 != null && var2 instanceof IntNode ? Integer.valueOf(((IntNode) var2).value) : null;
		}
	}

	@ObfuscatedName("kr.w(II)Ljava/lang/Long;")
	public Long getSettingLong(int arg0) {
		if (this.settingsMap == null) {
			return null;
		} else {
			Node var2 = this.settingsMap.get((long) arg0);
			return var2 != null && var2 instanceof LongNode ? Long.valueOf(((LongNode) var2).value) : null;
		}
	}

	@ObfuscatedName("kr.l(II)Ljava/lang/String;")
	public String getSettingString(int arg0) {
		if (this.settingsMap == null) {
			return null;
		} else {
			Node var2 = this.settingsMap.get((long) arg0);
			return var2 != null && var2 instanceof ObjectNode ? (String) ((ObjectNode) var2).value : null;
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
	public void doAddMember(long arg0, String arg1, int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.useUserHashes != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.useDisplayNames) {
			if (arg0 > 0L && (this.affinedUserHashes == null || this.memberCount >= this.affinedUserHashes.length) || arg1 != null && (this.affinedDisplayNames == null || this.memberCount >= this.affinedDisplayNames.length)) {
				this.allocAffined(this.memberCount + 5);
			}
			if (this.affinedUserHashes != null) {
				this.affinedUserHashes[this.memberCount] = arg0;
			}
			if (this.affinedDisplayNames != null) {
				this.affinedDisplayNames[this.memberCount] = arg1;
			}
			if (this.currentOwnerSlot == -1) {
				this.currentOwnerSlot = this.memberCount;
				this.affinedRanks[this.memberCount] = 126;
			} else {
				this.affinedRanks[this.memberCount] = 0;
			}
			this.extra[this.memberCount] = 0;
			this.affinedJoinedRunedays[this.memberCount] = arg2;
			this.affinedMutes[this.memberCount] = false;
			this.memberCount++;
			this.field3118 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("kr.p(II)V")
	public void doDeleteMember(int arg0) {
		if (arg0 < 0 || arg0 >= this.memberCount) {
			throw new RuntimeException("");
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
		System.arraycopy(this.affinedRanks, arg0 + 1, this.affinedRanks, arg0, this.memberCount - arg0);
		System.arraycopy(this.extra, arg0 + 1, this.extra, arg0, this.memberCount - arg0);
		System.arraycopy(this.affinedJoinedRunedays, arg0 + 1, this.affinedJoinedRunedays, arg0, this.memberCount - arg0);
		System.arraycopy(this.affinedMutes, arg0 + 1, this.affinedMutes, arg0, this.memberCount - arg0);
		if (this.affinedUserHashes != null) {
			System.arraycopy(this.affinedUserHashes, arg0 + 1, this.affinedUserHashes, arg0, this.memberCount - arg0);
		}
		if (this.affinedDisplayNames != null) {
			System.arraycopy(this.affinedDisplayNames, arg0 + 1, this.affinedDisplayNames, arg0, this.memberCount - arg0);
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
	public void doAddBanned(long arg0, String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.useUserHashes != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.useDisplayNames) {
			if (arg0 > 0L && (this.bannedUserHashes == null || this.bannedCount >= this.bannedUserHashes.length) || arg1 != null && (this.bannedDisplayNames == null || this.bannedCount >= this.bannedDisplayNames.length)) {
				this.allocBanned(this.bannedCount + 5);
			}
			if (this.bannedUserHashes != null) {
				this.bannedUserHashes[this.bannedCount] = arg0;
			}
			if (this.bannedDisplayNames != null) {
				this.bannedDisplayNames[this.bannedCount] = arg1;
			}
			this.bannedCount++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("kr.r(II)V")
	public void doDeleteBanned(int arg0) {
		this.bannedCount--;
		if (this.bannedCount == 0) {
			this.bannedUserHashes = null;
			this.bannedDisplayNames = null;
			return;
		}
		if (this.bannedUserHashes != null) {
			System.arraycopy(this.bannedUserHashes, arg0 + 1, this.bannedUserHashes, arg0, this.bannedCount - arg0);
		}
		if (this.bannedDisplayNames != null) {
			System.arraycopy(this.bannedDisplayNames, arg0 + 1, this.bannedDisplayNames, arg0, this.bannedCount - arg0);
		}
	}

	@ObfuscatedName("kr.v(IBB)I")
	public int doSetMemberRank(int arg0, byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.currentOwnerSlot == arg0 && (this.replacementOwnerSlot == -1 || this.affinedRanks[this.replacementOwnerSlot] < 125)) {
			return -1;
		} else if (this.affinedRanks[arg0] == arg1) {
			return -1;
		} else {
			this.affinedRanks[arg0] = arg1;
			this.method5299();
			return arg0;
		}
	}

	@ObfuscatedName("kr.o(IZB)I")
	public int doSetMemberMuted(int arg0, boolean arg1) {
		if (this.affinedMutes[arg0] == arg1) {
			return -1;
		} else {
			this.affinedMutes[arg0] = arg1;
			return arg0;
		}
	}

	@ObfuscatedName("kr.s(IIIIB)I")
	public int doSetMemberExtraInfo(int arg0, int arg1, int arg2, int arg3) {
		int var5 = (0x1 << arg2) - 1;
		int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		int var7 = var6 ^ var5;
		int var8 = arg1 << arg2;
		int var9 = var8 & var7;
		int var10 = this.extra[arg0];
		if ((var10 & var7) == var9) {
			return -1;
		} else {
			int var11 = var10 & ~var7;
			this.extra[arg0] = var11 | var9;
			return arg0;
		}
	}

	@ObfuscatedName("kr.y(III)Z")
	public boolean doExtraSettingInt(int arg0, int arg1) {
		if (this.settingsMap == null) {
			this.settingsMap = new HashTable(4);
		} else {
			Node var3 = this.settingsMap.get((long) arg0);
			if (var3 != null) {
				if (var3 instanceof IntNode) {
					IntNode var4 = (IntNode) var3;
					if (var4.value == arg1) {
						return false;
					}
					var4.value = arg1;
					return true;
				}
				var3.unlink();
			}
		}
		this.settingsMap.put(new IntNode(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.q(IIIII)Z")
	public boolean doExtraSettingVarbit(int arg0, int arg1, int arg2, int arg3) {
		int var5 = (0x1 << arg2) - 1;
		int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		int var7 = var6 ^ var5;
		int var8 = arg1 << arg2;
		int var9 = var8 & var7;
		if (this.settingsMap == null) {
			this.settingsMap = new HashTable(4);
		} else {
			Node var10 = this.settingsMap.get((long) arg0);
			if (var10 != null) {
				if (var10 instanceof IntNode) {
					IntNode var11 = (IntNode) var10;
					if ((var11.value & var7) == var9) {
						return false;
					}
					var11.value &= ~var7;
					var11.value |= var9;
					return true;
				}
				var10.unlink();
			}
		}
		this.settingsMap.put(new IntNode(var9), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.x(IJ)Z")
	public boolean doExtraSettingLong(int arg0, long arg1) {
		if (this.settingsMap == null) {
			this.settingsMap = new HashTable(4);
		} else {
			Node var4 = this.settingsMap.get((long) arg0);
			if (var4 != null) {
				if (var4 instanceof LongNode) {
					LongNode var5 = (LongNode) var4;
					if (var5.value == arg1) {
						return false;
					}
					var5.value = arg1;
					return true;
				}
				var4.unlink();
			}
		}
		this.settingsMap.put(new LongNode(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.b(ILjava/lang/String;I)Z")
	public boolean doExtraSettingString(int arg0, String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.settingsMap == null) {
			this.settingsMap = new HashTable(4);
		} else {
			Node var3 = this.settingsMap.get((long) arg0);
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = (ObjectNode) var3;
					if (var4.value instanceof String) {
						if (arg1.equals(var4.value)) {
							return false;
						}
						var4.unlink();
						this.settingsMap.put(new ObjectNode(arg1), var4.nodeId);
						return true;
					}
				}
				var3.unlink();
			}
		}
		this.settingsMap.put(new ObjectNode(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.h(Lalw;B)V")
	public void decode(Packet arg0) {
		int var2 = arg0.g1();
		if (var2 < 1 || var2 > 6) {
			throw new RuntimeException("" + var2);
		}
		int var3 = arg0.g1();
		if ((var3 & 0x1) != 0) {
			this.useUserHashes = true;
		}
		if ((var3 & 0x2) != 0) {
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
		this.updateNum = arg0.g4s();
		this.field3096 = arg0.g4s();
		if (var2 <= 3 && this.field3096 != 0) {
			this.field3096 += 16912800;
		}
		this.memberCount = arg0.g2();
		this.bannedCount = arg0.g1();
		this.clanName = arg0.gjstr();
		if (var2 >= 4) {
			arg0.g4s();
		}
		this.allowUnaffined = arg0.g1() == 1;
		this.rankTalk = arg0.g1b();
		this.rankKick = arg0.g1b();
		this.rankLootshare = arg0.g1b();
		this.coinshare = arg0.g1b();
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
			for (int var4 = 0; var4 < this.memberCount; var4++) {
				if (this.useUserHashes) {
					this.affinedUserHashes[var4] = arg0.g8();
				}
				if (this.useDisplayNames) {
					this.affinedDisplayNames[var4] = arg0.fastgstr();
				}
				this.affinedRanks[var4] = arg0.g1b();
				if (var2 >= 2) {
					this.extra[var4] = arg0.g4s();
				}
				if (var2 >= 5) {
					this.affinedJoinedRunedays[var4] = arg0.g2();
				} else {
					this.affinedJoinedRunedays[var4] = 0;
				}
				if (var2 >= 6) {
					this.affinedMutes[var4] = arg0.g1() == 1;
				} else {
					this.affinedMutes[var4] = false;
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
			for (int var5 = 0; var5 < this.bannedCount; var5++) {
				if (this.useUserHashes) {
					this.bannedUserHashes[var5] = arg0.g8();
				}
				if (this.useDisplayNames) {
					this.bannedDisplayNames[var5] = arg0.fastgstr();
				}
			}
		}
		if (var2 < 3) {
			return;
		}
		int var6 = arg0.g2();
		if (var6 <= 0) {
			return;
		}
		this.settingsMap = new HashTable(var6 < 16 ? IntMath.bitceil(var6) : 16);
		while (var6-- > 0) {
			int var7 = arg0.g4s();
			int var8 = var7 & 0x3FFFFFFF;
			int var9 = var7 >>> 30;
			if (var9 == 0) {
				int var10 = arg0.g4s();
				this.settingsMap.put(new IntNode(var10), (long) var8);
			} else if (var9 == 1) {
				long var11 = arg0.g8();
				this.settingsMap.put(new LongNode(var11), (long) var8);
			} else if (var9 == 2) {
				String var13 = arg0.gjstr();
				this.settingsMap.put(new ObjectNode(var13), (long) var8);
			}
		}
	}
}

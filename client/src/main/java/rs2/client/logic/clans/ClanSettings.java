package rs2.client.logic.clans;

import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.IterableMap;
import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.Algorithms;
import com.jagex.game.world.entity.ObjectWrapper;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("kr")
public class ClanSettings {

	@ObfuscatedName("kr.n")
	public boolean field3091;

	@ObfuscatedName("kr.m")
	public boolean field3092;

	@ObfuscatedName("kr.k")
	public long field3113;

	@ObfuscatedName("kr.f")
	public int field3094 = 0;

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
	public int affinedCount;

	@ObfuscatedName("kr.v")
	public long[] field3103;

	@ObfuscatedName("kr.o")
	public byte[] affinedRanks;

	@ObfuscatedName("kr.s")
	public int[] field3118;

	@ObfuscatedName("kr.y")
	public int[] field3106;

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
	public long[] field3112;

	@ObfuscatedName("kr.i")
	public String[] affinedDisplayNames;

	@ObfuscatedName("kr.j")
	public String[] bannedDisplayNames;

	@ObfuscatedName("kr.t")
	public IterableMap field3115;

	public ClanSettings(Packet arg0) {
		this.method5274(arg0);
	}

	@ObfuscatedName("kr.e(II)V")
	public void method5315(int arg0) {
		if (this.field3091) {
			if (this.field3103 == null) {
				this.field3103 = new long[arg0];
			} else {
				System.arraycopy(this.field3103, 0, this.field3103 = new long[arg0], 0, this.affinedCount);
			}
		}
		if (this.field3092) {
			if (this.affinedDisplayNames == null) {
				this.affinedDisplayNames = new String[arg0];
			} else {
				System.arraycopy(this.affinedDisplayNames, 0, this.affinedDisplayNames = new String[arg0], 0, this.affinedCount);
			}
		}
		if (this.affinedRanks == null) {
			this.affinedRanks = new byte[arg0];
		} else {
			System.arraycopy(this.affinedRanks, 0, this.affinedRanks = new byte[arg0], 0, this.affinedCount);
		}
		if (this.field3106 == null) {
			this.field3106 = new int[arg0];
		} else {
			System.arraycopy(this.field3106, 0, this.field3106 = new int[arg0], 0, this.affinedCount);
		}
		if (this.affinedJoinedRunedays == null) {
			this.affinedJoinedRunedays = new int[arg0];
		} else {
			System.arraycopy(this.affinedJoinedRunedays, 0, this.affinedJoinedRunedays = new int[arg0], 0, this.affinedCount);
		}
		if (this.affinedMutes == null) {
			this.affinedMutes = new boolean[arg0];
		} else {
			System.arraycopy(this.affinedMutes, 0, this.affinedMutes = new boolean[arg0], 0, this.affinedCount);
		}
	}

	@ObfuscatedName("kr.n(II)V")
	public void method5255(int arg0) {
		if (this.field3091) {
			if (this.field3112 == null) {
				this.field3112 = new long[arg0];
			} else {
				System.arraycopy(this.field3112, 0, this.field3112 = new long[arg0], 0, this.bannedCount);
			}
		}
		if (!this.field3092) {
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
		for (int var2 = 0; var2 < this.affinedCount; var2++) {
			if (this.affinedDisplayNames[var2].equals(arg0)) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("kr.k(IIII)I")
	public int getExtraInfo(int arg0, int arg1, int arg2) {
		int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.field3106[arg0] & var4) >>> arg1;
	}

	@ObfuscatedName("kr.f(II)Ljava/lang/Integer;")
	public Integer method5318(int arg0) {
		if (this.field3115 == null) {
			return null;
		} else {
			Node var2 = this.field3115.method14495((long) arg0);
			return var2 != null && var2 instanceof IntWrapper ? Integer.valueOf(((IntWrapper) var2).field11442) : null;
		}
	}

	@ObfuscatedName("kr.w(II)Ljava/lang/Long;")
	public Long method5259(int arg0) {
		if (this.field3115 == null) {
			return null;
		} else {
			Node var2 = this.field3115.method14495((long) arg0);
			return var2 != null && var2 instanceof LongNode ? Long.valueOf(((LongNode) var2).field11441) : null;
		}
	}

	@ObfuscatedName("kr.l(II)Ljava/lang/String;")
	public String method5260(int arg0) {
		if (this.field3115 == null) {
			return null;
		} else {
			Node var2 = this.field3115.method14495((long) arg0);
			return var2 != null && var2 instanceof ObjectWrapper ? (String) ((ObjectWrapper) var2).field11436 : null;
		}
	}

	@ObfuscatedName("kr.u(B)[I")
	public int[] getSortedAffinedSlot() {
		if (this.field3118 == null) {
			String[] var1 = new String[this.affinedCount];
			this.field3118 = new int[this.affinedCount];
			int var2 = 0;
			while (var2 < this.affinedCount) {
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
	public void method5262(long arg0, String arg1, int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.field3091 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.field3092) {
			if (arg0 > 0L && (this.field3103 == null || this.affinedCount >= this.field3103.length) || arg1 != null && (this.affinedDisplayNames == null || this.affinedCount >= this.affinedDisplayNames.length)) {
				this.method5315(this.affinedCount + 5);
			}
			if (this.field3103 != null) {
				this.field3103[this.affinedCount] = arg0;
			}
			if (this.affinedDisplayNames != null) {
				this.affinedDisplayNames[this.affinedCount] = arg1;
			}
			if (this.currentOwnerSlot == -1) {
				this.currentOwnerSlot = this.affinedCount;
				this.affinedRanks[this.affinedCount] = 126;
			} else {
				this.affinedRanks[this.affinedCount] = 0;
			}
			this.field3106[this.affinedCount] = 0;
			this.affinedJoinedRunedays[this.affinedCount] = arg2;
			this.affinedMutes[this.affinedCount] = false;
			this.affinedCount++;
			this.field3118 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("kr.p(II)V")
	public void method5263(int arg0) {
		if (arg0 < 0 || arg0 >= this.affinedCount) {
			throw new RuntimeException("");
		}
		this.affinedCount--;
		this.field3118 = null;
		if (this.affinedCount == 0) {
			this.field3103 = null;
			this.affinedDisplayNames = null;
			this.affinedRanks = null;
			this.field3106 = null;
			this.affinedJoinedRunedays = null;
			this.affinedMutes = null;
			this.currentOwnerSlot = -1;
			this.replacementOwnerSlot = -1;
			return;
		}
		System.arraycopy(this.affinedRanks, arg0 + 1, this.affinedRanks, arg0, this.affinedCount - arg0);
		System.arraycopy(this.field3106, arg0 + 1, this.field3106, arg0, this.affinedCount - arg0);
		System.arraycopy(this.affinedJoinedRunedays, arg0 + 1, this.affinedJoinedRunedays, arg0, this.affinedCount - arg0);
		System.arraycopy(this.affinedMutes, arg0 + 1, this.affinedMutes, arg0, this.affinedCount - arg0);
		if (this.field3103 != null) {
			System.arraycopy(this.field3103, arg0 + 1, this.field3103, arg0, this.affinedCount - arg0);
		}
		if (this.affinedDisplayNames != null) {
			System.arraycopy(this.affinedDisplayNames, arg0 + 1, this.affinedDisplayNames, arg0, this.affinedCount - arg0);
		}
		this.method5299();
	}

	@ObfuscatedName("kr.d(I)V")
	public void method5299() {
		if (this.affinedCount == 0) {
			this.currentOwnerSlot = -1;
			this.replacementOwnerSlot = -1;
			return;
		}
		this.currentOwnerSlot = -1;
		this.replacementOwnerSlot = -1;
		int var1 = 0;
		byte var2 = this.affinedRanks[0];
		for (int var3 = 1; var3 < this.affinedCount; var3++) {
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
	public void method5308(long arg0, String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.field3091 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.field3092) {
			if (arg0 > 0L && (this.field3112 == null || this.bannedCount >= this.field3112.length) || arg1 != null && (this.bannedDisplayNames == null || this.bannedCount >= this.bannedDisplayNames.length)) {
				this.method5255(this.bannedCount + 5);
			}
			if (this.field3112 != null) {
				this.field3112[this.bannedCount] = arg0;
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
	public void method5266(int arg0) {
		this.bannedCount--;
		if (this.bannedCount == 0) {
			this.field3112 = null;
			this.bannedDisplayNames = null;
			return;
		}
		if (this.field3112 != null) {
			System.arraycopy(this.field3112, arg0 + 1, this.field3112, arg0, this.bannedCount - arg0);
		}
		if (this.bannedDisplayNames != null) {
			System.arraycopy(this.bannedDisplayNames, arg0 + 1, this.bannedDisplayNames, arg0, this.bannedCount - arg0);
		}
	}

	@ObfuscatedName("kr.v(IBB)I")
	public int method5267(int arg0, byte arg1) {
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
	public int method5303(int arg0, boolean arg1) {
		if (this.affinedMutes[arg0] == arg1) {
			return -1;
		} else {
			this.affinedMutes[arg0] = arg1;
			return arg0;
		}
	}

	@ObfuscatedName("kr.s(IIIIB)I")
	public int method5269(int arg0, int arg1, int arg2, int arg3) {
		int var5 = (0x1 << arg2) - 1;
		int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		int var7 = var6 ^ var5;
		int var8 = arg1 << arg2;
		int var9 = var8 & var7;
		int var10 = this.field3106[arg0];
		if ((var10 & var7) == var9) {
			return -1;
		} else {
			int var11 = var10 & ~var7;
			this.field3106[arg0] = var11 | var9;
			return arg0;
		}
	}

	@ObfuscatedName("kr.y(III)Z")
	public boolean method5270(int arg0, int arg1) {
		if (this.field3115 == null) {
			this.field3115 = new IterableMap(4);
		} else {
			Node var3 = this.field3115.method14495((long) arg0);
			if (var3 != null) {
				if (var3 instanceof IntWrapper) {
					IntWrapper var4 = (IntWrapper) var3;
					if (var4.field11442 == arg1) {
						return false;
					}
					var4.field11442 = arg1;
					return true;
				}
				var3.method8440();
			}
		}
		this.field3115.method14501(new IntWrapper(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.q(IIIII)Z")
	public boolean method5271(int arg0, int arg1, int arg2, int arg3) {
		int var5 = (0x1 << arg2) - 1;
		int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		int var7 = var6 ^ var5;
		int var8 = arg1 << arg2;
		int var9 = var8 & var7;
		if (this.field3115 == null) {
			this.field3115 = new IterableMap(4);
		} else {
			Node var10 = this.field3115.method14495((long) arg0);
			if (var10 != null) {
				if (var10 instanceof IntWrapper) {
					IntWrapper var11 = (IntWrapper) var10;
					if ((var11.field11442 & var7) == var9) {
						return false;
					}
					var11.field11442 &= ~var7;
					var11.field11442 |= var9;
					return true;
				}
				var10.method8440();
			}
		}
		this.field3115.method14501(new IntWrapper(var9), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.x(IJ)Z")
	public boolean method5272(int arg0, long arg1) {
		if (this.field3115 == null) {
			this.field3115 = new IterableMap(4);
		} else {
			Node var4 = this.field3115.method14495((long) arg0);
			if (var4 != null) {
				if (var4 instanceof LongNode) {
					LongNode var5 = (LongNode) var4;
					if (var5.field11441 == arg1) {
						return false;
					}
					var5.field11441 = arg1;
					return true;
				}
				var4.method8440();
			}
		}
		this.field3115.method14501(new LongNode(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.b(ILjava/lang/String;I)Z")
	public boolean method5273(int arg0, String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.field3115 == null) {
			this.field3115 = new IterableMap(4);
		} else {
			Node var3 = this.field3115.method14495((long) arg0);
			if (var3 != null) {
				if (var3 instanceof ObjectWrapper) {
					ObjectWrapper var4 = (ObjectWrapper) var3;
					if (var4.field11436 instanceof String) {
						if (arg1.equals(var4.field11436)) {
							return false;
						}
						var4.method8440();
						this.field3115.method14501(new ObjectWrapper(arg1), var4.field6760);
						return true;
					}
				}
				var3.method8440();
			}
		}
		this.field3115.method14501(new ObjectWrapper(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.h(Lalw;B)V")
	public void method5274(Packet arg0) {
		int var2 = arg0.g1();
		if (var2 < 1 || var2 > 6) {
			throw new RuntimeException("" + var2);
		}
		int var3 = arg0.g1();
		if ((var3 & 0x1) != 0) {
			this.field3091 = true;
		}
		if ((var3 & 0x2) != 0) {
			this.field3092 = true;
		}
		if (!this.field3091) {
			this.field3103 = null;
			this.field3112 = null;
		}
		if (!this.field3092) {
			this.affinedDisplayNames = null;
			this.bannedDisplayNames = null;
		}
		this.field3094 = arg0.g4s();
		this.field3096 = arg0.g4s();
		if (var2 <= 3 && this.field3096 != 0) {
			this.field3096 += 16912800;
		}
		this.affinedCount = arg0.g2();
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
		if (this.affinedCount > 0) {
			if (this.field3091 && (this.field3103 == null || this.field3103.length < this.affinedCount)) {
				this.field3103 = new long[this.affinedCount];
			}
			if (this.field3092 && (this.affinedDisplayNames == null || this.affinedDisplayNames.length < this.affinedCount)) {
				this.affinedDisplayNames = new String[this.affinedCount];
			}
			if (this.affinedRanks == null || this.affinedRanks.length < this.affinedCount) {
				this.affinedRanks = new byte[this.affinedCount];
			}
			if (this.field3106 == null || this.field3106.length < this.affinedCount) {
				this.field3106 = new int[this.affinedCount];
			}
			if (this.affinedJoinedRunedays == null || this.affinedJoinedRunedays.length < this.affinedCount) {
				this.affinedJoinedRunedays = new int[this.affinedCount];
			}
			if (this.affinedMutes == null || this.affinedMutes.length < this.affinedCount) {
				this.affinedMutes = new boolean[this.affinedCount];
			}
			for (int var4 = 0; var4 < this.affinedCount; var4++) {
				if (this.field3091) {
					this.field3103[var4] = arg0.g8();
				}
				if (this.field3092) {
					this.affinedDisplayNames[var4] = arg0.fastgstr();
				}
				this.affinedRanks[var4] = arg0.g1b();
				if (var2 >= 2) {
					this.field3106[var4] = arg0.g4s();
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
			if (this.field3091 && (this.field3112 == null || this.field3112.length < this.bannedCount)) {
				this.field3112 = new long[this.bannedCount];
			}
			if (this.field3092 && (this.bannedDisplayNames == null || this.bannedDisplayNames.length < this.bannedCount)) {
				this.bannedDisplayNames = new String[this.bannedCount];
			}
			for (int var5 = 0; var5 < this.bannedCount; var5++) {
				if (this.field3091) {
					this.field3112[var5] = arg0.g8();
				}
				if (this.field3092) {
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
		this.field3115 = new IterableMap(var6 < 16 ? IntMath.bitceil(var6) : 16);
		while (var6-- > 0) {
			int var7 = arg0.g4s();
			int var8 = var7 & 0x3FFFFFFF;
			int var9 = var7 >>> 30;
			if (var9 == 0) {
				int var10 = arg0.g4s();
				this.field3115.method14501(new IntWrapper(var10), (long) var8);
			} else if (var9 == 1) {
				long var11 = arg0.g8();
				this.field3115.method14501(new LongNode(var11), (long) var8);
			} else if (var9 == 2) {
				String var13 = arg0.gjstr();
				this.field3115.method14501(new ObjectWrapper(var13), (long) var8);
			}
		}
	}
}

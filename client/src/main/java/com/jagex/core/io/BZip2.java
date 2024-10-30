package com.jagex.core.io;

import deob.ObfuscatedName;

@ObfuscatedName("aad")
public class BZip2 {

	@ObfuscatedName("aad.u")
	public static BZip2.BZip2State state = new BZip2.BZip2State();

	public BZip2() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aad.e([BI[BII)I")
	public static int decompress(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		BZip2.BZip2State var5 = state;
		synchronized (state) {
			state.strmNextIn = arg2;
			state.strmNextInPtr = arg4;
			state.strmNextOut = arg0;
			state.strmNextOutPtr = 0;
			state.strmAvailOut = arg1;
			state.bsLive = 0;
			state.bsBuff = 0;
			state.strmTotalInLo32 = 0;
			state.strmTotalOutLo32 = 0;
			decompress(state);
			int var6 = arg1 - state.strmAvailOut;
			state.strmNextIn = null;
			state.strmNextOut = null;
			return var6;
		}
	}

	@ObfuscatedName("aad.n(Laak;)V")
	public static void unRleObufToOutputFast(BZip2.BZip2State arg0) {
		byte var1 = arg0.stateOutCh;
		int var2 = arg0.stateOutLen;
		int var3 = arg0.nblockused;
		int var4 = arg0.k0;
		int[] var5 = BZip2.BZip2State.tt;
		int var6 = arg0.tPos;
		byte[] var7 = arg0.strmNextOut;
		int var8 = arg0.strmNextOutPtr;
		int var9 = arg0.strmAvailOut;
		int var10 = var9;
		int var11 = arg0.saveNblock + 1;
		label62: while (true) {
			if (var2 > 0) {
				while (true) {
					if (var9 == 0) {
						break label62;
					}
					if (var2 == 1) {
						if (var9 == 0) {
							var2 = 1;
							break label62;
						}
						var7[var8] = var1;
						var8++;
						var9--;
						break;
					}
					var7[var8] = var1;
					var2--;
					var8++;
					var9--;
				}
			}
			while (var3 != var11) {
				var1 = (byte) var4;
				int var12 = var5[var6];
				byte var13 = (byte) var12;
				var6 = var12 >> 8;
				var3++;
				if (var4 == var13) {
					if (var3 != var11) {
						var2 = 2;
						int var15 = var5[var6];
						byte var16 = (byte) var15;
						var6 = var15 >> 8;
						var3++;
						if (var3 != var11) {
							if (var4 == var16) {
								var2 = 3;
								int var17 = var5[var6];
								byte var18 = (byte) var17;
								var6 = var17 >> 8;
								var3++;
								if (var3 != var11) {
									if (var4 == var18) {
										int var19 = var5[var6];
										byte var20 = (byte) var19;
										int var21 = var19 >> 8;
										var3++;
										var2 = (var20 & 0xFF) + 4;
										int var22 = var5[var21];
										var4 = (byte) var22;
										var6 = var22 >> 8;
										var3++;
									} else {
										var4 = var18;
									}
								}
							} else {
								var4 = var16;
							}
						}
						continue label62;
					}
					if (var9 == 0) {
						var2 = 1;
						break label62;
					}
					var7[var8] = var1;
					var8++;
					var9--;
				} else {
					var4 = var13;
					if (var9 == 0) {
						var2 = 1;
						break label62;
					}
					var7[var8] = var1;
					var8++;
					var9--;
				}
			}
			var2 = 0;
			break;
		}
		int var14 = arg0.strmTotalOutLo32;
		arg0.strmTotalOutLo32 += var10 - var9;
		if (arg0.strmTotalOutLo32 < var14) {
		}
		arg0.stateOutCh = var1;
		arg0.stateOutLen = var2;
		arg0.nblockused = var3;
		arg0.k0 = var4;
		BZip2.BZip2State.tt = var5;
		arg0.tPos = var6;
		arg0.strmNextOut = var7;
		arg0.strmNextOutPtr = var8;
		arg0.strmAvailOut = var9;
	}

	@ObfuscatedName("aad.m(Laak;)V")
	public static void decompress(BZip2.BZip2State arg0) {
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		int var19 = 0;
		int[] var20 = null;
		int[] var21 = null;
		int[] var22 = null;
		arg0.blockSize100k = 1;
		if (BZip2.BZip2State.tt == null) {
			BZip2.BZip2State.tt = new int[arg0.blockSize100k * 100000];
		}
		boolean var23 = true;
		while (true) {
			while (var23) {
				byte var24 = getUchar(arg0);
				if (var24 == 23) {
					return;
				}
				byte var25 = getUchar(arg0);
				byte var26 = getUchar(arg0);
				byte var27 = getUchar(arg0);
				byte var28 = getUchar(arg0);
				byte var29 = getUchar(arg0);
				byte var30 = getUchar(arg0);
				byte var31 = getUchar(arg0);
				byte var32 = getUchar(arg0);
				byte var33 = getUchar(arg0);
				byte var34 = getBit(arg0);
				if (var34 != 0) {
				}
				arg0.origPtr = 0;
				byte var35 = getUchar(arg0);
				arg0.origPtr = arg0.origPtr << 8 | var35 & 0xFF;
				byte var36 = getUchar(arg0);
				arg0.origPtr = arg0.origPtr << 8 | var36 & 0xFF;
				byte var37 = getUchar(arg0);
				arg0.origPtr = arg0.origPtr << 8 | var37 & 0xFF;
				for (int var38 = 0; var38 < 16; var38++) {
					byte var39 = getBit(arg0);
					if (var39 == 1) {
						arg0.inUse16[var38] = true;
					} else {
						arg0.inUse16[var38] = false;
					}
				}
				for (int var40 = 0; var40 < 256; var40++) {
					arg0.inUse[var40] = false;
				}
				for (int var41 = 0; var41 < 16; var41++) {
					if (arg0.inUse16[var41]) {
						for (int var42 = 0; var42 < 16; var42++) {
							byte var43 = getBit(arg0);
							if (var43 == 1) {
								arg0.inUse[var41 * 16 + var42] = true;
							}
						}
					}
				}
				makeMapsD(arg0);
				int var44 = arg0.nInUse + 2;
				int var45 = getBits(3, arg0);
				int var46 = getBits(15, arg0);
				for (int var47 = 0; var47 < var46; var47++) {
					int var48 = 0;
					while (true) {
						byte var49 = getBit(arg0);
						if (var49 == 0) {
							arg0.selectorMtf[var47] = (byte) var48;
							break;
						}
						var48++;
					}
				}
				byte[] var50 = new byte[6];
				byte var51 = 0;
				while (var51 < var45) {
					var50[var51] = var51++;
				}
				for (int var52 = 0; var52 < var46; var52++) {
					byte var53 = arg0.selectorMtf[var52];
					byte var54 = var50[var53];
					while (var53 > 0) {
						var50[var53] = var50[var53 - 1];
						var53--;
					}
					var50[0] = var54;
					arg0.selector[var52] = var54;
				}
				for (int var55 = 0; var55 < var45; var55++) {
					int var56 = getBits(5, arg0);
					for (int var57 = 0; var57 < var44; var57++) {
						while (true) {
							byte var58 = getBit(arg0);
							if (var58 == 0) {
								arg0.len[var55][var57] = (byte) var56;
								break;
							}
							byte var59 = getBit(arg0);
							if (var59 == 0) {
								var56++;
							} else {
								var56--;
							}
						}
					}
				}
				for (int var60 = 0; var60 < var45; var60++) {
					byte var61 = 32;
					byte var62 = 0;
					for (int var63 = 0; var63 < var44; var63++) {
						if (arg0.len[var60][var63] > var62) {
							var62 = arg0.len[var60][var63];
						}
						if (arg0.len[var60][var63] < var61) {
							var61 = arg0.len[var60][var63];
						}
					}
					hbCreateDecodeTables(arg0.limit[var60], arg0.base[var60], arg0.perm[var60], arg0.len[var60], var61, var62, var44);
					arg0.minLens[var60] = var61;
				}
				int var64 = arg0.nInUse + 1;
				int var65 = -1;
				byte var66 = 0;
				for (int var67 = 0; var67 <= 255; var67++) {
					arg0.unzftab[var67] = 0;
				}
				int var68 = 4095;
				for (int var69 = 15; var69 >= 0; var69--) {
					for (int var70 = 15; var70 >= 0; var70--) {
						arg0.mtfa[var68] = (byte) (var69 * 16 + var70);
						var68--;
					}
					arg0.mtfbase[var69] = var68 + 1;
				}
				int var71 = 0;
				if (var66 == 0) {
					var65++;
					var66 = 50;
					byte var72 = arg0.selector[var65];
					var19 = arg0.minLens[var72];
					var20 = arg0.limit[var72];
					var22 = arg0.perm[var72];
					var21 = arg0.base[var72];
				}
				int var103 = var66 - 1;
				int var73 = var19;
				int var74;
				byte var102;
				for (var74 = getBits(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var102) {
					var73++;
					var102 = getBit(arg0);
				}
				int var75 = var22[var74 - var21[var73]];
				while (true) {
					while (var64 != var75) {
						if (var75 == 0 || var75 == 1) {
							int var95 = -1;
							int var96 = 1;
							do {
								if (var75 == 0) {
									var95 += var96;
								} else if (var75 == 1) {
									var95 += var96 * 2;
								}
								var96 *= 2;
								if (var103 == 0) {
									var65++;
									var103 = 50;
									byte var97 = arg0.selector[var65];
									var19 = arg0.minLens[var97];
									var20 = arg0.limit[var97];
									var22 = arg0.perm[var97];
									var21 = arg0.base[var97];
								}
								var103--;
								int var98 = var19;
								int var99;
								byte var101;
								for (var99 = getBits(var19, arg0); var99 > var20[var98]; var99 = var99 << 1 | var101) {
									var98++;
									var101 = getBit(arg0);
								}
								var75 = var22[var99 - var21[var98]];
							} while (var75 == 0 || var75 == 1);
							var95++;
							byte var100 = arg0.seqToUnseq[arg0.mtfa[arg0.mtfbase[0]] & 0xFF];
							arg0.unzftab[var100 & 0xFF] += var95;
							while (var95 > 0) {
								BZip2.BZip2State.tt[var71] = var100 & 0xFF;
								var71++;
								var95--;
							}
						} else {
							int var81 = var75 - 1;
							byte var83;
							if (var81 < 16) {
								int var82 = arg0.mtfbase[0];
								var83 = arg0.mtfa[var81 + var82];
								while (var81 > 3) {
									int var84 = var81 + var82;
									arg0.mtfa[var84] = arg0.mtfa[var84 - 1];
									arg0.mtfa[var84 - 1] = arg0.mtfa[var84 - 2];
									arg0.mtfa[var84 - 2] = arg0.mtfa[var84 - 3];
									arg0.mtfa[var84 - 3] = arg0.mtfa[var84 - 4];
									var81 -= 4;
								}
								while (var81 > 0) {
									arg0.mtfa[var81 + var82] = arg0.mtfa[var81 + var82 - 1];
									var81--;
								}
								arg0.mtfa[var82] = var83;
							} else {
								int var85 = var81 / 16;
								int var86 = var81 % 16;
								int var87 = arg0.mtfbase[var85] + var86;
								var83 = arg0.mtfa[var87];
								while (var87 > arg0.mtfbase[var85]) {
									arg0.mtfa[var87] = arg0.mtfa[var87 - 1];
									var87--;
								}
								int var10002 = arg0.mtfbase[var85]++;
								while (var85 > 0) {
									var10002 = arg0.mtfbase[var85]--;
									arg0.mtfa[arg0.mtfbase[var85]] = arg0.mtfa[arg0.mtfbase[var85 - 1] + 16 - 1];
									var85--;
								}
								var10002 = arg0.mtfbase[0]--;
								arg0.mtfa[arg0.mtfbase[0]] = var83;
								if (arg0.mtfbase[0] == 0) {
									int var88 = 4095;
									for (int var89 = 15; var89 >= 0; var89--) {
										for (int var90 = 15; var90 >= 0; var90--) {
											arg0.mtfa[var88] = arg0.mtfa[arg0.mtfbase[var89] + var90];
											var88--;
										}
										arg0.mtfbase[var89] = var88 + 1;
									}
								}
							}
							arg0.unzftab[arg0.seqToUnseq[var83 & 0xFF] & 0xFF]++;
							BZip2.BZip2State.tt[var71] = arg0.seqToUnseq[var83 & 0xFF] & 0xFF;
							var71++;
							if (var103 == 0) {
								var65++;
								var103 = 50;
								byte var91 = arg0.selector[var65];
								var19 = arg0.minLens[var91];
								var20 = arg0.limit[var91];
								var22 = arg0.perm[var91];
								var21 = arg0.base[var91];
							}
							var103--;
							int var92 = var19;
							int var93;
							byte var94;
							for (var93 = getBits(var19, arg0); var93 > var20[var92]; var93 = var93 << 1 | var94) {
								var92++;
								var94 = getBit(arg0);
							}
							var75 = var22[var93 - var21[var92]];
						}
					}
					arg0.stateOutLen = 0;
					arg0.stateOutCh = 0;
					arg0.cftab[0] = 0;
					for (int var76 = 1; var76 <= 256; var76++) {
						arg0.cftab[var76] = arg0.unzftab[var76 - 1];
					}
					for (int var77 = 1; var77 <= 256; var77++) {
						arg0.cftab[var77] += arg0.cftab[var77 - 1];
					}
					for (int var78 = 0; var78 < var71; var78++) {
						byte var79 = (byte) (BZip2.BZip2State.tt[var78] & 0xFF);
						BZip2.BZip2State.tt[arg0.cftab[var79 & 0xFF]] |= var78 << 8;
						arg0.cftab[var79 & 0xFF]++;
					}
					arg0.tPos = BZip2.BZip2State.tt[arg0.origPtr] >> 8;
					arg0.nblockused = 0;
					arg0.tPos = BZip2.BZip2State.tt[arg0.tPos];
					arg0.k0 = (byte) (arg0.tPos & 0xFF);
					arg0.tPos >>= 0x8;
					arg0.nblockused++;
					arg0.saveNblock = var71;
					unRleObufToOutputFast(arg0);
					if (arg0.nblockused == arg0.saveNblock + 1 && arg0.stateOutLen == 0) {
						var23 = true;
						break;
					}
					var23 = false;
					break;
				}
			}
			return;
		}
	}

	@ObfuscatedName("aad.k(Laak;)B")
	public static byte getUchar(BZip2.BZip2State arg0) {
		return (byte) getBits(8, arg0);
	}

	@ObfuscatedName("aad.f(Laak;)B")
	public static byte getBit(BZip2.BZip2State arg0) {
		return (byte) getBits(1, arg0);
	}

	@ObfuscatedName("aad.w(ILaak;)I")
	public static int getBits(int arg0, BZip2.BZip2State arg1) {
		while (arg1.bsLive < arg0) {
			arg1.bsBuff = arg1.bsBuff << 8 | arg1.strmNextIn[arg1.strmNextInPtr] & 0xFF;
			arg1.bsLive += 8;
			arg1.strmNextInPtr++;
			arg1.strmTotalInLo32++;
			if (arg1.strmTotalInLo32 == 0) {
			}
		}
		int var2 = arg1.bsBuff >> arg1.bsLive - arg0 & (0x1 << arg0) - 1;
		arg1.bsLive -= arg0;
		return var2;
	}

	@ObfuscatedName("aad.l(Laak;)V")
	public static void makeMapsD(BZip2.BZip2State arg0) {
		arg0.nInUse = 0;
		for (int var1 = 0; var1 < 256; var1++) {
			if (arg0.inUse[var1]) {
				arg0.seqToUnseq[arg0.nInUse] = (byte) var1;
				arg0.nInUse++;
			}
		}
	}

	@ObfuscatedName("aad.u([I[I[I[BIII)V")
	public static void hbCreateDecodeTables(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		for (int var8 = arg4; var8 <= arg5; var8++) {
			for (int var9 = 0; var9 < arg6; var9++) {
				if (arg3[var9] == var8) {
					arg2[var7] = var9;
					var7++;
				}
			}
		}
		for (int var10 = 0; var10 < 23; var10++) {
			arg1[var10] = 0;
		}
		for (int var11 = 0; var11 < arg6; var11++) {
			arg1[arg3[var11] + 1]++;
		}
		for (int var12 = 1; var12 < 23; var12++) {
			arg1[var12] += arg1[var12 - 1];
		}
		for (int var13 = 0; var13 < 23; var13++) {
			arg0[var13] = 0;
		}
		int var14 = 0;
		for (int var15 = arg4; var15 <= arg5; var15++) {
			int var16 = arg1[var15 + 1] - arg1[var15] + var14;
			arg0[var15] = var16 - 1;
			var14 = var16 << 1;
		}
		for (int var17 = arg4 + 1; var17 <= arg5; var17++) {
			arg1[var17] = (arg0[var17 - 1] + 1 << 1) - arg1[var17];
		}
	}

	@ObfuscatedName("aak")
	public static class BZip2State {

		@ObfuscatedName("aak.e")
		public final int field8452 = 4096;

		@ObfuscatedName("aak.n")
		public final int field8461 = 16;

		@ObfuscatedName("aak.m")
		public final int field8427 = 258;

		@ObfuscatedName("aak.k")
		public final int field8450 = 6;

		@ObfuscatedName("aak.f")
		public final int field8429 = 50;

		@ObfuscatedName("aak.w")
		public final int field8430 = 18002;

		@ObfuscatedName("aak.l")
		public byte[] strmNextIn;

		@ObfuscatedName("aak.u")
		public int strmNextInPtr = 0;

		@ObfuscatedName("aak.z")
		public int strmTotalInLo32;

		@ObfuscatedName("aak.p")
		public byte[] strmNextOut;

		@ObfuscatedName("aak.d")
		public int strmNextOutPtr = 0;

		@ObfuscatedName("aak.c")
		public int strmAvailOut;

		@ObfuscatedName("aak.r")
		public int strmTotalOutLo32;

		@ObfuscatedName("aak.v")
		public byte stateOutCh;

		@ObfuscatedName("aak.o")
		public int stateOutLen;

		@ObfuscatedName("aak.s")
		public int bsBuff;

		@ObfuscatedName("aak.y")
		public int bsLive;

		@ObfuscatedName("aak.q")
		public int blockSize100k;

		@ObfuscatedName("aak.x")
		public int origPtr;

		@ObfuscatedName("aak.b")
		public int tPos;

		@ObfuscatedName("aak.h")
		public int k0;

		@ObfuscatedName("aak.a")
		public int[] unzftab = new int[256];

		@ObfuscatedName("aak.g")
		public int nblockused;

		@ObfuscatedName("aak.i")
		public int[] cftab = new int[257];

		@ObfuscatedName("tb.j")
		public static int[] tt;

		@ObfuscatedName("aak.t")
		public int nInUse;

		@ObfuscatedName("aak.ae")
		public boolean[] inUse = new boolean[256];

		@ObfuscatedName("aak.ag")
		public boolean[] inUse16 = new boolean[16];

		@ObfuscatedName("aak.ah")
		public byte[] seqToUnseq = new byte[256];

		@ObfuscatedName("aak.al")
		public byte[] mtfa = new byte[4096];

		@ObfuscatedName("aak.ac")
		public int[] mtfbase = new int[16];

		@ObfuscatedName("aak.ai")
		public byte[] selector = new byte[18002];

		@ObfuscatedName("aak.aw")
		public byte[] selectorMtf = new byte[18002];

		@ObfuscatedName("aak.as")
		public byte[][] len = new byte[6][258];

		@ObfuscatedName("aak.at")
		public int[][] limit = new int[6][258];

		@ObfuscatedName("aak.ad")
		public int[][] base = new int[6][258];

		@ObfuscatedName("aak.am")
		public int[][] perm = new int[6][258];

		@ObfuscatedName("aak.au")
		public int[] minLens = new int[6];

		@ObfuscatedName("aak.ar")
		public int saveNblock;
	}
}

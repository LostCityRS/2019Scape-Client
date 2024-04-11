package com.jagex.graphics;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("cd")
public class SpriteDataProvider {

	public SpriteDataProvider() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cd.e(Lpy;II)Lde;")
	public static SpriteData method1609(Js5 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getfile(arg1, arg2);
		return var3 == null ? null : method1615(var3)[0];
	}

	@ObfuscatedName("cd.n(Lpy;I)Lde;")
	public static SpriteData get(Js5 arg0, int arg1) {
		byte[] var2 = arg0.fetchFile(arg1);
		return var2 == null ? null : method1615(var2)[0];
	}

	@ObfuscatedName("cd.m(Lpy;II)[Lde;")
	public static SpriteData[] method1608(Js5 js5, int group, int file) {
		byte[] var3 = js5.getfile(group, file);
		return var3 == null ? null : method1615(var3);
	}

	@ObfuscatedName("cd.k([B)[Lde;")
	public static SpriteData[] method1615(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.pos = (arg0.length - 2);
		int var2 = var1.g2();
		int var3 = var2 >> 15;
		int var4 = var2 & 0x7FFF;
		if (var3 == 0) {
			PalettedSpriteData[] var5 = new PalettedSpriteData[var4];
			for (int var6 = 0; var6 < var4; var6++) {
				var5[var6] = new PalettedSpriteData();
			}
			var1.pos = (arg0.length - 7 - var4 * 8);
			int var7 = var1.g2();
			int var8 = var1.g2();
			int var9 = (var1.g1() & 0xFF) + 1;
			for (int var10 = 0; var10 < var4; var10++) {
				var5[var10].field10222 = var1.g2();
			}
			for (int var11 = 0; var11 < var4; var11++) {
				var5[var11].field10224 = var1.g2();
			}
			for (int var12 = 0; var12 < var4; var12++) {
				var5[var12].field10220 = var1.g2();
			}
			for (int var13 = 0; var13 < var4; var13++) {
				var5[var13].field10221 = var1.g2();
			}
			for (int var14 = 0; var14 < var4; var14++) {
				PalettedSpriteData var15 = var5[var14];
				var15.field10223 = var7 - var15.field10220 - var15.field10222;
				var15.field10225 = var8 - var15.field10221 - var15.field10224;
			}
			var1.pos = (arg0.length - 7 - var4 * 8 - (var9 - 1) * 3);
			int[] var16 = new int[var9];
			for (int var17 = 1; var17 < var9; var17++) {
				var16[var17] = var1.g3();
				if (var16[var17] == 0) {
					var16[var17] = 1;
				}
			}
			for (int var18 = 0; var18 < var4; var18++) {
				var5[var18].palette = var16;
			}
			var1.pos = 0;
			for (int var19 = 0; var19 < var4; var19++) {
				PalettedSpriteData var20 = var5[var19];
				int var21 = var20.field10221 * var20.field10220;
				var20.colour = new byte[var21];
				int var22 = var1.g1();
				if ((var22 & 0x2) != 0) {
					boolean var26 = false;
					var20.field10228 = new byte[var21];
					if ((var22 & 0x1) == 0) {
						for (int var27 = 0; var27 < var21; var27++) {
							var20.colour[var27] = var1.g1b();
						}
						for (int var28 = 0; var28 < var21; var28++) {
							byte var29 = var20.field10228[var28] = var1.g1b();
							var26 |= var29 != -1;
						}
					} else {
						for (int var30 = 0; var30 < var20.field10220; var30++) {
							for (int var31 = 0; var31 < var20.field10221; var31++) {
								var20.colour[var20.field10220 * var31 + var30] = var1.g1b();
							}
						}
						for (int var32 = 0; var32 < var20.field10220; var32++) {
							for (int var33 = 0; var33 < var20.field10221; var33++) {
								byte var34 = var20.field10228[var20.field10220 * var33 + var32] = var1.g1b();
								var26 |= var34 != -1;
							}
						}
					}
					if (!var26) {
						var20.field10228 = null;
					}
				} else if ((var22 & 0x1) == 0) {
					for (int var23 = 0; var23 < var21; var23++) {
						var20.colour[var23] = var1.g1b();
					}
				} else {
					for (int var24 = 0; var24 < var20.field10220; var24++) {
						for (int var25 = 0; var25 < var20.field10221; var25++) {
							var20.colour[var20.field10220 * var25 + var24] = var1.g1b();
						}
					}
				}
			}
			return var5;
		} else {
			FullSpriteData[] var35 = new FullSpriteData[var4];
			var1.pos = 0;
			int var36 = var1.g1();
			if (var36 == 0) {
				boolean var37 = var1.g1() == 1;
				int var38 = var1.g2();
				int var39 = var1.g2();
				for (int var40 = 0; var40 < var4; var40++) {
					int[] var41 = new int[var38 * var39];
					for (int var42 = 0; var42 < var38 * var39; var42++) {
						var41[var42] = var1.g3() | 0xFF000000;
						if (var41[var42] == -65281) {
							var41[var42] = 0;
						}
					}
					if (var37) {
						for (int var43 = 0; var43 < var38 * var39; var43++) {
							var41[var43] &= 0xFFFFFF;
							var41[var43] |= var1.g1() << 24;
						}
					}
					var35[var40] = new FullSpriteData(var38, var39, var41);
				}
				return var35;
			} else if (var36 == 1) {
				throw new UnsupportedOperationException();
			} else {
				throw new RuntimeException();
			}
		}
	}
}

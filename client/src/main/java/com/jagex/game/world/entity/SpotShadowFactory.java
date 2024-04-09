package com.jagex.game.world.entity;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.graphics.AnimationNode;
import com.jagex.graphics.Model;
import com.jagex.graphics.ModelUnlit;
import com.jagex.graphics.Toolkit;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

@ObfuscatedName("i")
public class SpotShadowFactory {

	@ObfuscatedName("i.e")
	public static SoftLruHashTable modelCache = new SoftLruHashTable(32);

	@ObfuscatedName("i.n")
	public static int field616;

	public SpotShadowFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jp.e(Ldh;IIIIILdo;IIIILaaq;B)Ldo;")
	public static Model method5102(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Model arg6, int arg7, int arg8, int arg9, int arg10, AnimationNode arg11) {
		if (arg6 == null) {
			return null;
		}
		int var12 = 2055;
		if (arg11 != null) {
			int var13 = var12 | arg11.method14358();
			var12 = var13 & 0xFFFFFDFF;
		}
		long var14 = ((long) arg8 << 48) + ((long) arg7 << 32) + (long) ((arg10 << 24) + (arg9 << 16) + arg5);
		SoftLruHashTable var16 = modelCache;
		Model var17;
		synchronized (modelCache) {
			var17 = (Model) modelCache.get(var14);
		}
		if (var17 == null || arg0.method2394(var17.method1691(), var12) != 0) {
			if (var17 != null) {
				var12 = arg0.method2213(var12, var17.method1691());
			}
			int var19 = arg5 * 3 + 6;
			byte var20 = 3;
			int[] var21 = new int[] { 64, 96, 128 };
			ModelUnlit var22 = new ModelUnlit(var19 * var20 + 1, var19 * var20 * 2 - var19, 0);
			int var23 = var22.method1936(0, 0, 0);
			int[][] var24 = new int[var20][var19];
			for (int var25 = 0; var25 < var20; var25++) {
				int var26 = var21[var25];
				int var27 = var21[var25];
				for (int var28 = 0; var28 < var19; var28++) {
					int var29 = (var28 << 14) / var19;
					int var30 = Trig1.sin[var29] * var26 >> 14;
					int var31 = Trig1.cos[var29] * var27 >> 14;
					var24[var25][var28] = var22.method1936(var30, 0, var31);
				}
			}
			for (int var32 = 0; var32 < var20; var32++) {
				int var33 = (var32 * 256 + 128) / var20;
				int var34 = 256 - var33;
				byte var35 = (byte) (arg9 * var34 + arg10 * var33 >> 8);
				short var36 = (short) (((arg7 & 0x7F) * var34 + (arg8 & 0x7F) * var33 & 0x7F00) + ((arg7 & 0x380) * var34 + (arg8 & 0x380) * var33 & 0x38000) + ((arg7 & 0xFC00) * var34 + (arg8 & 0xFC00) * var33 & 0xFC0000) >> 8);
				for (int var37 = 0; var37 < var19; var37++) {
					if (var32 == 0) {
						var22.method1966(var23, var24[0][(var37 + 1) % var19], var24[0][var37], (byte) 1, (byte) -1, var36, var35, (short) -1);
					} else {
						var22.method1966(var24[var32 - 1][var37], var24[var32 - 1][(var37 + 1) % var19], var24[var32][(var37 + 1) % var19], (byte) 1, (byte) -1, var36, var35, (short) -1);
						var22.method1966(var24[var32 - 1][var37], var24[var32][(var37 + 1) % var19], var24[var32][var37], (byte) 1, (byte) -1, var36, var35, (short) -1);
					}
				}
			}
			var17 = arg0.createModel(var22, var12, field616, 64, 768);
			SoftLruHashTable var38 = modelCache;
			synchronized (modelCache) {
				modelCache.put(var17, var14);
			}
		}
		int var40 = arg6.getMinX();
		int var41 = arg6.getMaxX();
		int var42 = arg6.getMinZ();
		int var43 = arg6.getMaxZ();
		Model var44;
		if (arg11 == null) {
			var44 = var17.method1773((byte) 3, var12, true);
			var44.scale(var41 - var40 >> 1, 128, var43 - var42 >> 1);
			var44.translate(var40 + var41 >> 1, 0, var42 + var43 >> 1);
		} else {
			var44 = var17.method1773((byte) 3, var12, true);
			var44.scale(var41 - var40 >> 1, 128, var43 - var42 >> 1);
			var44.translate(var40 + var41 >> 1, 0, var42 + var43 >> 1);
			arg11.method14361(var44);
		}
		if (arg2 != 0) {
			var44.rotateX(arg2);
		}
		if (arg3 != 0) {
			var44.rotateZ(arg3);
		}
		if (arg4 != 0) {
			var44.translate(0, arg4, 0);
		}
		return var44;
	}

	@ObfuscatedName("fo.n(Ldh;IIIILdo;SBLaaq;I)Ldo;")
	public static Model method3283(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, Model arg5, short arg6, byte arg7, AnimationNode arg8) {
		if (arg5 == null) {
			return null;
		}
		int var9 = 2055;
		if (arg8 != null) {
			int var10 = var9 | arg8.method14358();
			var9 = var10 & 0xFFFFFDFF;
		}
		long var11 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		SoftLruHashTable var13 = modelCache;
		Model var14;
		synchronized (modelCache) {
			var14 = (Model) modelCache.get(var11);
		}
		if (var14 == null || arg0.method2394(var14.method1691(), var9) != 0) {
			if (var14 != null) {
				var9 = arg0.method2213(var9, var14.method1691());
			}
			ModelUnlit var16 = new ModelUnlit(4, 2, 2);
			short var17 = 128;
			int[] var18 = new int[] { var16.method1936(-var17, 0, -var17), var16.method1936(var17, 0, -var17), var16.method1936(var17, 0, var17), var16.method1936(-var17, 0, var17) };
			var16.method1966(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			var16.method1966(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			var16.method1938((short) 1, (short) 2, (short) 0);
			var16.method1938((short) 2, (short) 3, (short) 0);
			var14 = arg0.createModel(var16, var9, field616, 64, 768);
			SoftLruHashTable var19 = modelCache;
			synchronized (modelCache) {
				modelCache.put(var14, var11);
			}
		}
		int var21 = arg5.getMinX();
		int var22 = arg5.getMaxX();
		int var23 = arg5.getMinZ();
		int var24 = arg5.getMaxZ();
		Model var25;
		if (arg8 == null) {
			var25 = var14.method1773((byte) 3, var9, true);
			var25.scale(var22 - var21 >> 1, 128, var24 - var23 >> 1);
			var25.translate(var21 + var22 >> 1, 0, var23 + var24 >> 1);
		} else {
			var25 = var14.method1773((byte) 3, var9, true);
			var25.scale(var22 - var21 >> 1, 128, var24 - var23 >> 1);
			var25.translate(var21 + var22 >> 1, 0, var23 + var24 >> 1);
			arg8.method14361(var25);
		}
		if (arg2 != 0) {
			var25.rotateX(arg2);
		}
		if (arg3 != 0) {
			var25.rotateZ(arg3);
		}
		if (arg4 != 0) {
			var25.translate(0, arg4, 0);
		}
		return var25;
	}

	@ObfuscatedName("ajb.m(II)V")
	public static void resetModelCache(int arg0) {
		field616 = arg0;
		SoftLruHashTable var1 = modelCache;
		synchronized (modelCache) {
			modelCache.reset();
		}
	}

	@ObfuscatedName("ft.k(I)V")
	public static void cacheReset() {
		SoftLruHashTable var0 = modelCache;
		synchronized (modelCache) {
			modelCache.reset();
		}
	}

	@ObfuscatedName("vg.f(IB)V")
	public static void cacheClean(int arg0) {
		SoftLruHashTable var1 = modelCache;
		synchronized (modelCache) {
			modelCache.clean(arg0);
		}
	}

	@ObfuscatedName("kh.w(B)V")
	public static void cacheRemoveSoftReferences() {
		SoftLruHashTable var0 = modelCache;
		synchronized (modelCache) {
			modelCache.clear();
		}
	}
}

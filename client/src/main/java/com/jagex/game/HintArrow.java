package com.jagex.game;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.graphics.Model;
import com.jagex.graphics.ModelUnlit;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("au")
public class HintArrow {

	@ObfuscatedName("au.e")
	public int hintType;

	@ObfuscatedName("au.n")
	public int field751;

	@ObfuscatedName("au.m")
	public int field744;

	@ObfuscatedName("au.k")
	public int field749;

	@ObfuscatedName("au.f")
	public int hintOffsetX;

	@ObfuscatedName("au.w")
	public int hintOffsetZ;

	@ObfuscatedName("au.l")
	public int field742;

	@ObfuscatedName("au.u")
	public int field750 = -1;

	@ObfuscatedName("au.z")
	public int field748;

	@ObfuscatedName("au.p")
	public int field743;

	@ObfuscatedName("au.d")
	public static SoftLruHashTable modelCache = new SoftLruHashTable(4);

	@ObfuscatedName("au.c")
	public static int field753;

	@ObfuscatedName("ka.e(Ldh;IIIIIB)Ldo;")
	public static Model method5210(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var6 = (long) arg5;
		Model var8 = (Model) modelCache.get(var6);
		short var9 = 2055;
		if (var8 == null) {
			ModelUnlit var10 = ModelUnlit.get(Client.modelsJs5, arg5, 0);
			if (var10 == null) {
				return null;
			}
			if (var10.version < 13) {
				var10.scaleByPowerOfTwo(2);
			}
			var8 = arg0.createModel(var10, var9, field753, 64, 768);
			modelCache.put(var8, var6);
		}
		Model var11 = var8.method1773((byte) 6, var9, true);
		if (arg1 != 0) {
			var11.method1693(arg1);
		}
		if (arg2 != 0) {
			var11.rotateX(arg2);
		}
		if (arg3 != 0) {
			var11.rotateZ(arg3);
		}
		if (arg4 != 0) {
			var11.translate(0, arg4, 0);
		}
		return var11;
	}

	@ObfuscatedName("tt.n(II)V")
	public static void resetModelCache(int arg0) {
		field753 = arg0;
		modelCache.reset();
	}

	@ObfuscatedName("du.m(B)V")
	public static void cacheReset() {
		modelCache.reset();
	}

	@ObfuscatedName("xe.k(II)V")
	public static void cacheClean(int arg0) {
		modelCache.clean(arg0);
	}

	@ObfuscatedName("ahd.f(B)V")
	public static void cacheRemoveSoftReferences() {
		modelCache.clear();
	}
}

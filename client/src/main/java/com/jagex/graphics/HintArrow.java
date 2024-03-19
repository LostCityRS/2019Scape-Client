package com.jagex.graphics;

import com.jagex.core.datastruct.WeightedCache;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("au")
public class HintArrow {

	@ObfuscatedName("au.e")
	public int field745;

	@ObfuscatedName("au.n")
	public int field751;

	@ObfuscatedName("au.m")
	public int field744;

	@ObfuscatedName("au.k")
	public int field749;

	@ObfuscatedName("au.f")
	public int field746;

	@ObfuscatedName("au.w")
	public int field747;

	@ObfuscatedName("au.l")
	public int field742;

	@ObfuscatedName("au.u")
	public int field750 = -1;

	@ObfuscatedName("au.z")
	public int field748;

	@ObfuscatedName("au.p")
	public int field743;

	@ObfuscatedName("au.d")
	public static WeightedCache field752 = new WeightedCache(4);

	@ObfuscatedName("au.c")
	public static int field753;

	@ObfuscatedName("ka.e(Ldh;IIIIIB)Ldo;")
	public static Model method5210(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var6 = (long) arg5;
		Model var8 = (Model) field752.get(var6);
		short var9 = 2055;
		if (var8 == null) {
			ModelUnlit var10 = ModelUnlit.get(Client.modelsJs5, arg5, 0);
			if (var10 == null) {
				return null;
			}
			if (var10.field1372 < 13) {
				var10.method1947(2);
			}
			var8 = arg0.createModel(var10, var9, field753, 64, 768);
			field752.put(var8, var6);
		}
		Model var11 = var8.method1773((byte) 6, var9, true);
		if (arg1 != 0) {
			var11.method1693(arg1);
		}
		if (arg2 != 0) {
			var11.method1852(arg2);
		}
		if (arg3 != 0) {
			var11.method1696(arg3);
		}
		if (arg4 != 0) {
			var11.method1805(0, arg4, 0);
		}
		return var11;
	}

	@ObfuscatedName("tt.n(II)V")
	public static void method8643(int arg0) {
		field753 = arg0;
		field752.clear();
	}

	@ObfuscatedName("du.m(B)V")
	public static void method2086() {
		field752.clear();
	}

	@ObfuscatedName("xe.k(II)V")
	public static void method10284(int arg0) {
		field752.update(arg0);
	}

	@ObfuscatedName("ahd.f(B)V")
	public static void method16718() {
		field752.method2928();
	}
}

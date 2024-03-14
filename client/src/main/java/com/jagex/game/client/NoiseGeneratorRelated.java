package com.jagex.game.client;

import com.jagex.core.utils.PrioritizedCache;
import com.jagex.core.utils.PrioritizedCacheMode;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

import java.util.Random;

@ObfuscatedName("acp")
public class NoiseGeneratorRelated {

	@ObfuscatedName("acp.n")
	public static int field9125;

	@ObfuscatedName("acp.m")
	public static int field9126;

	@ObfuscatedName("acp.k")
	public static int[] field9124;

	@ObfuscatedName("acp.f")
	public static int[] field9128;

	@ObfuscatedName("acp.w")
	public static PrioritizedCache field9129 = new PrioritizedCache(16, PrioritizedCacheMode.field4619);

	@ObfuscatedName("acp.c")
	public static int field9130;

	public NoiseGeneratorRelated() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("acp.e(III)V")
	public static void method15026(int arg0, int arg1) {
		if (field9125 != arg0) {
			field9124 = new int[arg0];
			for (int var2 = 0; var2 < arg0; var2++) {
				field9124[var2] = (var2 << 12) / arg0;
			}
			field9125 = arg0;
		}
		if (field9126 == arg1) {
			return;
		}
		if (field9125 == arg1) {
			field9128 = field9124;
		} else {
			field9128 = new int[arg1];
			for (int var3 = 0; var3 < arg1; var3++) {
				field9128[var3] = (var3 << 12) / arg1;
			}
		}
		field9126 = arg1;
	}

	@ObfuscatedName("acp.n(II)[B")
	public static byte[] method15027(int arg0) {
		byte[] var1 = (byte[]) field9129.method7278(arg0);
		if (var1 == null) {
			var1 = new byte[512];
			Random var2 = new Random((long) arg0);
			for (int var3 = 0; var3 < 255; var3++) {
				var1[var3] = (byte) var3;
			}
			for (int var4 = 0; var4 < 255; var4++) {
				int var5 = 255 - var4;
				int var6 = IntMath.method14985(var2, var5);
				byte var7 = var1[var6];
				var1[var6] = var1[var5];
				var1[var5] = var1[511 - var4] = var7;
			}
			field9129.method7279(arg0, var1);
		}
		return var1;
	}
}

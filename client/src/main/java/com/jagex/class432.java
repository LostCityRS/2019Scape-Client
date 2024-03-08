package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jaclib.ping.Ping;

@ObfuscatedName("pm")
public class class432 {

	@ObfuscatedName("pm.n")
	public static int field4332 = 0;

	@ObfuscatedName("pm.m")
	public static int field4333 = 0;

	public class432() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kg.e(I)I")
	public static int method5140() {
		if (field4332 == 0) {
			class775.field8919.method15011(new class433("jaclib"));
			if (class775.field8919.method15010().method6782() != 100) {
				return 1;
			}
			if (!((class433) class775.field8919.method15010()).method6812() && !class280.method6040()) {
				try {
					Statics.field8301.method8050();
					class648.method1427();
					Ping.init();
				} catch (class1111 var21) {
					class576.method18474(class772.field8908, var21.field11894, var21.field11895, var21.getCause());
				} catch (Throwable var22) {
				}
			}
			field4332 = 1;
		}
		if (field4332 == 1) {
			Statics.field4334 = class775.method15007();
			class775.field8944.method15011(new class430(Statics.field1587));
			class775.field8934.method15011(new class433("jaggl"));
			class433 var2 = new class433("jagdx");
			if (!Statics.field2601.startsWith("win")) {
				var2.method6813();
			}
			class775.field8938.method15011(var2);
			class775.field8920.method15011(new class433("sw3d"));
			class775.field8922.method15011(new class433("hw3d"));
			class775.field8921.method15011(new class433("RuneScape-Setup.exe", true));
			class775.field8945.method15011(new class430(Statics.field2900));
			class775.field8924.method15011(new class430(Statics.field10249));
			class775.field8925.method15011(new class430(Statics.field11838));
			class775.field8926.method15011(new class430(Statics.field4475));
			class775.field8927.method15011(new class430(Statics.field8700));
			class775.field8928.method15011(new class430(Statics.field4618));
			class775.field8942.method15011(new class430(Statics.field7537));
			class775.field8930.method15011(new class430(Statics.field8285));
			class775.field8941.method15011(new class430(Statics.field2149));
			class775.field8932.method15011(new class430(Statics.field3611));
			class775.field8933.method15011(new class430(Statics.field7283));
			class775.field8918.method15011(new class430(Statics.field4404));
			class775.field8935.method15011(new class430(Statics.field1935));
			class775.field8936.method15011(new class430(Statics.field6879));
			class775.field8937.method15011(new class430(Statics.field736));
			class775.field8943.method15011(new class429(Statics.field8741, "huffman"));
			class775.field8939.method15011(new class430(Statics.field527));
			class775.field8940.method15011(new class430(Statics.field5010));
			class775.field8916.method15011(new class430(Statics.field7672));
			class775.field8931.method15011(new class431(Statics.field10752, 0));
			for (int var3 = 0; var3 < Statics.field4334.length; var3++) {
				if (Statics.field4334[var3].method15010() == null) {
					throw new RuntimeException();
				}
			}
			int var4 = 0;
			class775[] var5 = Statics.field4334;
			for (int var6 = 0; var6 < var5.length; var6++) {
				class775 var7 = var5[var6];
				int var8 = var7.method15008();
				int var9 = var7.method15010().method6782();
				var4 += var8 * var9 / 100;
			}
			field4333 = var4;
			field4332 = 2;
		}
		if (Statics.field4334 == null) {
			return 100;
		}
		int var10 = 0;
		int var11 = 0;
		boolean var12 = true;
		class775[] var13 = Statics.field4334;
		for (int var14 = 0; var14 < var13.length; var14++) {
			class775 var15 = var13[var14];
			int var16 = var15.method15008();
			int var17 = var15.method15010().method6782();
			if (var17 < 100) {
				var12 = false;
			}
			var10 += var16;
			var11 += var16 * var17 / 100;
		}
		if (var12) {
			Statics.field4334 = null;
		}
		int var18 = var11 - field4333;
		int var19 = var10 - field4333;
		int var20 = var19 > 0 ? var18 * 100 / var19 : 100;
		if (!var12 && var20 > 99) {
			var20 = 99;
		}
		return var20;
	}

	@ObfuscatedName("gb.n(B)V")
	public static void method3670() {
		field4332 = 0;
		field4333 = 0;
	}
}

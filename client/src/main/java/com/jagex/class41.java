package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("as")
public class class41 {

	public class41() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("fm.e(Lkv;Lky;IIIIIIIIII)V")
	public static void method3004(class318 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		Statics.field709 = arg0;
		Statics.field715 = arg1;
		Statics.field711 = arg2;
		Statics.field621 = arg3;
		Statics.field712 = arg4;
		Statics.field592 = arg5;
		Statics.field7091 = arg6;
		Statics.field1921 = arg7;
		Statics.field7424 = arg8;
		Statics.field714 = null;
		Statics.field710 = null;
		Statics.field4963 = null;
		Statics.field627 = arg9;
		Statics.field713 = arg10;
		method16459();
		Statics.field9262 = true;
	}

	@ObfuscatedName("agz.n(I)Z")
	public static boolean method16459() {
		boolean var0 = true;
		if (Statics.field714 == null) {
			if (Statics.field10317.method6889(Statics.field7091)) {
				Statics.field714 = class111.method1607(Statics.field10317, Statics.field7091);
			} else {
				var0 = false;
			}
		}
		if (Statics.field710 == null) {
			if (Statics.field10317.method6889(Statics.field1921)) {
				Statics.field710 = class111.method1607(Statics.field10317, Statics.field1921);
			} else {
				var0 = false;
			}
		}
		if (Statics.field4963 == null) {
			if (Statics.field10317.method6889(Statics.field7424)) {
				Statics.field4963 = class111.method1607(Statics.field10317, Statics.field7424);
			} else {
				var0 = false;
			}
		}
		if (Statics.field8851 == null) {
			if (Statics.field7672.method6889(Statics.field713)) {
				Statics.field8851 = Statics.field7538.method6163(client.field10833, Statics.field713);
			} else {
				var0 = false;
			}
		}
		if (Statics.field716 == null) {
			if (Statics.field10317.method6889(Statics.field713)) {
				Statics.field716 = (class852) class111.method1607(Statics.field10317, Statics.field713);
			} else {
				var0 = false;
			}
		}
		return var0;
	}

	@ObfuscatedName("ae.m(Ljava/lang/String;ZLdh;Leu;Laac;B)V")
	public static void method649(String arg0, boolean arg1, class133 arg2, class140 arg3, class733 arg4) {
		boolean var5 = !Statics.field9262 || method16459();
		if (!var5) {
			return;
		}
		if (Statics.field9262 && var5) {
			class733 var6 = Statics.field8851;
			class140 var7 = arg2.method2207(var6, Statics.field716, true);
			int var8 = var6.method14551(arg0, 250, null);
			int var9 = var6.method14545(arg0, 250, var6.field8566, null);
			int var10 = Statics.field710.method2639();
			int var11 = var10 + 4;
			int var12 = var11 * 2 + var8;
			int var13 = var11 * 2 + var9;
			if (var12 < Statics.field712) {
				var12 = Statics.field712;
			}
			if (var13 < Statics.field592) {
				var13 = Statics.field592;
			}
			int var14 = Statics.field709.method5382(var12, client.field10941) + Statics.field711;
			int var15 = Statics.field715.method5375(var13, client.field10942) + Statics.field621;
			arg2.method2200(Statics.field4963, false).method1449(var14 + Statics.field714.method2639(), var15 + Statics.field714.method2631(), var12 - Statics.field714.method2639() * 2, var13 - Statics.field714.method2631() * 2, 1, -1, 0);
			arg2.method2200(Statics.field714, true).method1439(var14, var15);
			Statics.field714.method2601();
			arg2.method2200(Statics.field714, true).method1439(var12 + var14 - var10, var15);
			Statics.field714.method2602();
			arg2.method2200(Statics.field714, true).method1439(var12 + var14 - var10, var13 + var15 - var10);
			Statics.field714.method2601();
			arg2.method2200(Statics.field714, true).method1439(var14, var13 + var15 - var10);
			Statics.field714.method2602();
			arg2.method2200(Statics.field710, true).method1448(var14, var15 + Statics.field714.method2631(), var10, var13 - Statics.field714.method2631() * 2);
			Statics.field710.method2588();
			arg2.method2200(Statics.field710, true).method1448(var14 + Statics.field714.method2639(), var15, var12 - Statics.field714.method2639() * 2, var10);
			Statics.field710.method2588();
			arg2.method2200(Statics.field710, true).method1448(var12 + var14 - var10, var15 + Statics.field714.method2631(), var10, var13 - Statics.field714.method2631() * 2);
			Statics.field710.method2588();
			arg2.method2200(Statics.field710, true).method1448(var14 + Statics.field714.method2639(), var13 + var15 - var10, var12 - Statics.field714.method2639() * 2, var10);
			Statics.field710.method2588();
			var7.method2720(arg0, var11 + var14, var11 + var15, var12 - var11 * 2, var13 - var11 * 2, Statics.field627 | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0);
			client.method3066(var14, var15, var12, var13);
		} else {
			int var16 = arg4.method14551(arg0, 250, null);
			int var17 = arg4.method14538(arg0, 250, null) * 13;
			byte var18 = 4;
			int var19 = var18 + 6;
			int var20 = var18 + 6;
			arg2.method2354(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18, -16777216, 0);
			arg2.method2179(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18, -1, 0);
			arg3.method2720(arg0, var19, var20, var16, var17, -1, -1, 1, 1, 0, null, null, null, 0, 0);
			client.method3066(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18);
		}
		if (!arg1) {
			return;
		}
		try {
			arg2.method2202();
			arg2.method2115();
		} catch (class1106 var22) {
		}
	}
}

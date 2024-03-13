package com.jagex.graphics;

import com.jagex.game.config.defaults.GraphicsDefaults;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("l")
public class DefaultSprites {

	@ObfuscatedName("l.e")
	public static int field506;

	@ObfuscatedName("l.n")
	public static int field505;

	@ObfuscatedName("l.m")
	public static int field509;

	@ObfuscatedName("l.k")
	public static int field507;

	@ObfuscatedName("l.f")
	public static int field514;

	@ObfuscatedName("l.w")
	public static int field508;

	@ObfuscatedName("adg.l")
	public static int field9210;

	@ObfuscatedName("l.u")
	public static int field504;

	@ObfuscatedName("l.z")
	public static int field511;

	@ObfuscatedName("vc.p")
	public static int field7572;

	@ObfuscatedName("l.d")
	public static int field512;

	@ObfuscatedName("apy.c")
	public static int field11891;

	@ObfuscatedName("arc.r")
	public static int field12241;

	@ObfuscatedName("tw.v")
	public static FontMetrics field6778;

	@ObfuscatedName("is.o")
	public static FontMetrics field2657;

	@ObfuscatedName("afp.s")
	public static FontMetrics field10268;

	@ObfuscatedName("zj.y")
	public static Font field8321;

	@ObfuscatedName("adh.q")
	public static Font field9184;

	@ObfuscatedName("agr.x")
	public static Font field10355;

	@ObfuscatedName("zj.b")
	public static Sprite[] field8323;

	@ObfuscatedName("l.h")
	public static Sprite[] field513;

	@ObfuscatedName("acj.a")
	public static Sprite[] field9149;

	@ObfuscatedName("aoh.g")
	public static int field11888;

	@ObfuscatedName("afh.i")
	public static int field10232;

	@ObfuscatedName("ann.j")
	public static Sprite[] field11793;

	@ObfuscatedName("l.t")
	public static Sprite[] field510;

	@ObfuscatedName("agk.ae")
	public static Sprite[] field10302;

	@ObfuscatedName("uj.ag")
	public static Sprite field7207;

	@ObfuscatedName("gc.ah")
	public static Sprite field1940;

	@ObfuscatedName("sj.al")
	public static Sprite[] field6719;


	public DefaultSprites() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gl.e(Lws;B)V")
	public static void method3470(GraphicsDefaults arg0) {
		field506 = arg0.field7733;
		field505 = arg0.field7746;
		field509 = arg0.field7747;
	}

	@ObfuscatedName("aft.n(Lws;I)V")
	public static void method16430(GraphicsDefaults arg0) {
		field507 = arg0.field7748;
		field514 = arg0.field7715;
		field508 = arg0.field7750;
		field11888 = arg0.field7751;
		field10232 = arg0.field7752;
		field9210 = arg0.field7753;
		field504 = arg0.field7732;
		field511 = arg0.field7755;
		field7572 = arg0.field7756;
		field11891 = arg0.field7720;
		field512 = arg0.field7721;
		field12241 = arg0.field7741;
	}

	@ObfuscatedName("au.m(I)[I")
	public static int[] method845() {
		return new int[] { field506, field505, field509 };
	}

	@ObfuscatedName("qx.k(Ldh;I)V")
	public static void method7114(Renderer arg0) {
		field8321 = (Font) Client.field7538.method6188(Client.field10833, field506, true, true);
		field6778 = Client.field7538.method6163(Client.field10833, field506);
		field9184 = (Font) Client.field7538.method6188(Client.field10833, field505, true, true);
		field2657 = Client.field7538.method6163(Client.field10833, field505);
		field10355 = (Font) Client.field7538.method6188(Client.field10833, field509, true, true);
		field10268 = Client.field7538.method6163(Client.field10833, field509);
	}

	@ObfuscatedName("aej.f(Lpy;I)I")
	public static int method15381(Js5 arg0) {
		int var1 = 0;
		if (arg0.method6889(field507)) {
			var1++;
		}
		if (arg0.method6889(field514)) {
			var1++;
		}
		if (arg0.method6889(field508)) {
			var1++;
		}
		if (arg0.method6889(field9210)) {
			var1++;
		}
		if (arg0.method6889(field504)) {
			var1++;
		}
		if (arg0.method6889(field511)) {
			var1++;
		}
		if (arg0.method6889(field7572)) {
			var1++;
		}
		if (arg0.method6889(field11891)) {
			var1++;
		}
		if (arg0.method6889(field512)) {
			var1++;
		}
		if (arg0.method6889(field12241)) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("kh.l(Ldh;Lpy;I)V")
	public static void method5202(Renderer arg0, Js5 arg1) {
		SpriteData[] var2 = SpriteDataProvider.method1608(arg1, field507, 0);
		field8323 = new Sprite[var2.length];
		for (int var3 = 0; var3 < var2.length; var3++) {
			field8323[var3] = arg0.method2200(var2[var3], true);
		}
		SpriteData[] var4 = SpriteDataProvider.method1608(arg1, field514, 0);
		field513 = new Sprite[var4.length];
		for (int var5 = 0; var5 < var4.length; var5++) {
			field513[var5] = arg0.method2200(var4[var5], true);
		}
		SpriteData[] var6 = SpriteDataProvider.method1608(arg1, field508, 0);
		field9149 = new Sprite[var6.length];
		byte var7 = 25;
		for (int var8 = 0; var8 < var6.length; var8++) {
			var6[var8].method2605(-var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D));
			field9149[var8] = arg0.method2200(var6[var8], true);
		}
		SpriteData[] var9 = SpriteDataProvider.method1608(arg1, field9210, 0);
		field11793 = new Sprite[var9.length];
		for (int var10 = 0; var10 < var9.length; var10++) {
			field11793[var10] = arg0.method2200(var9[var10], true);
		}
		SpriteData[] var11 = SpriteDataProvider.method1608(arg1, field504, 0);
		field510 = new Sprite[var11.length];
		byte var12 = 12;
		for (int var13 = 0; var13 < var11.length; var13++) {
			var11[var13].method2605(-var12 + (int) (Math.random() * (double) var12 * 2.0D), -var12 + (int) (Math.random() * (double) var12 * 2.0D), -var12 + (int) (Math.random() * (double) var12 * 2.0D));
			field510[var13] = arg0.method2200(var11[var13], true);
		}
		SpriteData[] var14 = SpriteDataProvider.method1608(arg1, field511, 0);
		field10302 = new Sprite[var14.length];
		byte var15 = 12;
		for (int var16 = 0; var16 < var14.length; var16++) {
			var14[var16].method2605(-var15 + (int) (Math.random() * (double) var15 * 2.0D), -var15 + (int) (Math.random() * (double) var15 * 2.0D), -var15 + (int) (Math.random() * (double) var15 * 2.0D));
			field10302[var16] = arg0.method2200(var14[var16], true);
		}
		field7207 = arg0.method2200(SpriteDataProvider.method1609(arg1, field11891, 0), true);
		field1940 = arg0.method2200(SpriteDataProvider.method1609(arg1, field512, 0), true);
		SpriteData[] var17 = SpriteDataProvider.method1608(arg1, field12241, 0);
		field6719 = new Sprite[var17.length];
		for (int var18 = 0; var18 < var17.length; var18++) {
			field6719[var18] = arg0.method2200(var17[var18], true);
		}
	}

	@ObfuscatedName("ge.u(I)V")
	public static void method3568() {
		field8321 = null;
		field9184 = null;
		field10355 = null;
		field8323 = null;
		field513 = null;
		field9149 = null;
		field11793 = null;
		field510 = null;
		field10302 = null;
		field7207 = null;
		field1940 = null;
		field6719 = null;
	}
}

package com.jagex.graphics;

import com.jagex.game.config.defaults.GraphicsDefaults;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("l")
public class DefaultSprites {

	@ObfuscatedName("l.e")
	public static int p11_full;

	@ObfuscatedName("l.n")
	public static int p12_full;

	@ObfuscatedName("l.m")
	public static int b12_full;

	@ObfuscatedName("l.k")
	public static int hintarrows;

	@ObfuscatedName("l.f")
	public static int field514;

	@ObfuscatedName("l.w")
	public static int mapflag;

	@ObfuscatedName("adg.l")
	public static int cross;

	@ObfuscatedName("l.u")
	public static int mapdots;

	@ObfuscatedName("l.z")
	public static int field511;

	@ObfuscatedName("vc.p")
	public static int field7572;

	@ObfuscatedName("l.d")
	public static int field512;

	@ObfuscatedName("apy.c")
	public static int compass;

	@ObfuscatedName("arc.r")
	public static int field12241;

	@ObfuscatedName("tw.v")
	public static FontMetrics p11FullMetrics;

	@ObfuscatedName("is.o")
	public static FontMetrics p12FullMetrics;

	@ObfuscatedName("afp.s")
	public static FontMetrics b12FullMetrics;

	@ObfuscatedName("zj.y")
	public static Font p11FullFont;

	@ObfuscatedName("adh.q")
	public static Font p12FullFont;

	@ObfuscatedName("agr.x")
	public static Font b12FullFont;

	@ObfuscatedName("zj.b")
	public static Sprite[] hintarrowSprites;

	@ObfuscatedName("l.h")
	public static Sprite[] field513;

	@ObfuscatedName("acj.a")
	public static Sprite[] mapflagSprites;

	@ObfuscatedName("aoh.g")
	public static int field11888;

	@ObfuscatedName("afh.i")
	public static int field10232;

	@ObfuscatedName("ann.j")
	public static Sprite[] crossSprites;

	@ObfuscatedName("l.t")
	public static Sprite[] mapdotsSprites;

	@ObfuscatedName("agk.ae")
	public static Sprite[] field10302;

	@ObfuscatedName("uj.ag")
	public static Sprite compassSprites;

	@ObfuscatedName("gc.ah")
	public static Sprite field1940;

	@ObfuscatedName("sj.al")
	public static Sprite[] field6719;

	public DefaultSprites() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gl.e(Lws;B)V")
	public static void method3470(GraphicsDefaults arg0) {
		p11_full = arg0.p11_full;
		p12_full = arg0.p12_full;
		b12_full = arg0.b12_full;
	}

	@ObfuscatedName("aft.n(Lws;I)V")
	public static void method16430(GraphicsDefaults arg0) {
		hintarrows = arg0.hintarrows;
		field514 = arg0.field7715;
		mapflag = arg0.mapflag;
		field11888 = arg0.field7751;
		field10232 = arg0.field7752;
		cross = arg0.cross;
		mapdots = arg0.mapdots;
		field511 = arg0.field7755;
		field7572 = arg0.field7756;
		compass = arg0.compass;
		field512 = arg0.field7721;
		field12241 = arg0.field7741;
	}

	@ObfuscatedName("au.m(I)[I")
	public static int[] fonts() {
		return new int[] { p11_full, p12_full, b12_full };
	}

	@ObfuscatedName("qx.k(Ldh;I)V")
	public static void loadFonts(Toolkit arg0) {
		p11FullFont = (Font) Client.fontProvider.getFont(Client.fontFactory, p11_full, true, true);
		p11FullMetrics = Client.fontProvider.getFontMetrics(Client.fontFactory, p11_full);
		p12FullFont = (Font) Client.fontProvider.getFont(Client.fontFactory, p12_full, true, true);
		p12FullMetrics = Client.fontProvider.getFontMetrics(Client.fontFactory, p12_full);
		b12FullFont = (Font) Client.fontProvider.getFont(Client.fontFactory, b12_full, true, true);
		b12FullMetrics = Client.fontProvider.getFontMetrics(Client.fontFactory, b12_full);
	}

	@ObfuscatedName("aej.f(Lpy;I)I")
	public static int getLoadedSpritesCount(Js5 arg0) {
		int var1 = 0;
		if (arg0.loadFile(hintarrows)) {
			var1++;
		}
		if (arg0.loadFile(field514)) {
			var1++;
		}
		if (arg0.loadFile(mapflag)) {
			var1++;
		}
		if (arg0.loadFile(cross)) {
			var1++;
		}
		if (arg0.loadFile(mapdots)) {
			var1++;
		}
		if (arg0.loadFile(field511)) {
			var1++;
		}
		if (arg0.loadFile(field7572)) {
			var1++;
		}
		if (arg0.loadFile(compass)) {
			var1++;
		}
		if (arg0.loadFile(field512)) {
			var1++;
		}
		if (arg0.loadFile(field12241)) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("aam.w(I)I")
	public static int getSpritesCount() {
		return 10;
	}

	@ObfuscatedName("kh.l(Ldh;Lpy;I)V")
	public static void loadSprites(Toolkit arg0, Js5 arg1) {
		SpriteData[] var2 = SpriteDataProvider.method1608(arg1, hintarrows, 0);
		hintarrowSprites = new Sprite[var2.length];
		for (int var3 = 0; var3 < var2.length; var3++) {
			hintarrowSprites[var3] = arg0.createSprite(var2[var3], true);
		}
		SpriteData[] var4 = SpriteDataProvider.method1608(arg1, field514, 0);
		field513 = new Sprite[var4.length];
		for (int var5 = 0; var5 < var4.length; var5++) {
			field513[var5] = arg0.createSprite(var4[var5], true);
		}
		SpriteData[] var6 = SpriteDataProvider.method1608(arg1, mapflag, 0);
		mapflagSprites = new Sprite[var6.length];
		byte var7 = 25;
		for (int var8 = 0; var8 < var6.length; var8++) {
			var6[var8].method2605(-var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D));
			mapflagSprites[var8] = arg0.createSprite(var6[var8], true);
		}
		SpriteData[] var9 = SpriteDataProvider.method1608(arg1, cross, 0);
		crossSprites = new Sprite[var9.length];
		for (int var10 = 0; var10 < var9.length; var10++) {
			crossSprites[var10] = arg0.createSprite(var9[var10], true);
		}
		SpriteData[] var11 = SpriteDataProvider.method1608(arg1, mapdots, 0);
		mapdotsSprites = new Sprite[var11.length];
		byte var12 = 12;
		for (int var13 = 0; var13 < var11.length; var13++) {
			var11[var13].method2605(-var12 + (int) (Math.random() * (double) var12 * 2.0D), -var12 + (int) (Math.random() * (double) var12 * 2.0D), -var12 + (int) (Math.random() * (double) var12 * 2.0D));
			mapdotsSprites[var13] = arg0.createSprite(var11[var13], true);
		}
		SpriteData[] var14 = SpriteDataProvider.method1608(arg1, field511, 0);
		field10302 = new Sprite[var14.length];
		byte var15 = 12;
		for (int var16 = 0; var16 < var14.length; var16++) {
			var14[var16].method2605(-var15 + (int) (Math.random() * (double) var15 * 2.0D), -var15 + (int) (Math.random() * (double) var15 * 2.0D), -var15 + (int) (Math.random() * (double) var15 * 2.0D));
			field10302[var16] = arg0.createSprite(var14[var16], true);
		}
		compassSprites = arg0.createSprite(SpriteDataProvider.method1609(arg1, compass, 0), true);
		field1940 = arg0.createSprite(SpriteDataProvider.method1609(arg1, field512, 0), true);
		SpriteData[] var17 = SpriteDataProvider.method1608(arg1, field12241, 0);
		field6719 = new Sprite[var17.length];
		for (int var18 = 0; var18 < var17.length; var18++) {
			field6719[var18] = arg0.createSprite(var17[var18], true);
		}
	}

	@ObfuscatedName("ge.u(I)V")
	public static void clear() {
		p11FullFont = null;
		p12FullFont = null;
		b12FullFont = null;
		hintarrowSprites = null;
		field513 = null;
		mapflagSprites = null;
		crossSprites = null;
		mapdotsSprites = null;
		field10302 = null;
		compassSprites = null;
		field1940 = null;
		field6719 = null;
	}
}

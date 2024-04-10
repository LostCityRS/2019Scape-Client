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
	public static void method3470(GraphicsDefaults graphics) {
		p11_full = graphics.p11_full;
		p12_full = graphics.p12_full;
		b12_full = graphics.b12_full;
	}

	@ObfuscatedName("aft.n(Lws;I)V")
	public static void method16430(GraphicsDefaults graphics) {
		hintarrows = graphics.hintarrows;
		field514 = graphics.field7715;
		mapflag = graphics.mapflag;
		field11888 = graphics.field7751;
		field10232 = graphics.field7752;
		cross = graphics.cross;
		mapdots = graphics.mapdots;
		field511 = graphics.field7755;
		field7572 = graphics.field7756;
		compass = graphics.compass;
		field512 = graphics.field7721;
		field12241 = graphics.field7741;
	}

	@ObfuscatedName("au.m(I)[I")
	public static int[] fonts() {
		return new int[] {p11_full, p12_full, b12_full};
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
	public static int getLoadedSpritesCount(Js5 spritesJs5) {
		int count = 0;
		if (spritesJs5.loadFile(hintarrows)) {
			count++;
		}
		if (spritesJs5.loadFile(field514)) {
			count++;
		}
		if (spritesJs5.loadFile(mapflag)) {
			count++;
		}
		if (spritesJs5.loadFile(cross)) {
			count++;
		}
		if (spritesJs5.loadFile(mapdots)) {
			count++;
		}
		if (spritesJs5.loadFile(field511)) {
			count++;
		}
		if (spritesJs5.loadFile(field7572)) {
			count++;
		}
		if (spritesJs5.loadFile(compass)) {
			count++;
		}
		if (spritesJs5.loadFile(field512)) {
			count++;
		}
		if (spritesJs5.loadFile(field12241)) {
			count++;
		}
		return count;
	}

	@ObfuscatedName("aam.w(I)I")
	public static int getSpritesCount() {
		return 10;
	}

	@ObfuscatedName("kh.l(Ldh;Lpy;I)V")
	public static void loadSprites(Toolkit toolkit, Js5 spritesJs5) {
		SpriteData[] hintarrows = SpriteDataProvider.method1608(spritesJs5, DefaultSprites.hintarrows, 0);
		DefaultSprites.hintarrowSprites = new Sprite[hintarrows.length];
		for (int var3 = 0; var3 < hintarrows.length; var3++) {
			DefaultSprites.hintarrowSprites[var3] = toolkit.createSprite(hintarrows[var3], true);
		}
		SpriteData[] var4 = SpriteDataProvider.method1608(spritesJs5, field514, 0);
		field513 = new Sprite[var4.length];
		for (int var5 = 0; var5 < var4.length; var5++) {
			field513[var5] = toolkit.createSprite(var4[var5], true);
		}
		SpriteData[] mapflags = SpriteDataProvider.method1608(spritesJs5, DefaultSprites.mapflag, 0);
		DefaultSprites.mapflagSprites = new Sprite[mapflags.length];
		byte var7 = 25;
		for (int var8 = 0; var8 < mapflags.length; var8++) {
			mapflags[var8].method2605(-var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D));
			DefaultSprites.mapflagSprites[var8] = toolkit.createSprite(mapflags[var8], true);
		}
		SpriteData[] crosses = SpriteDataProvider.method1608(spritesJs5, DefaultSprites.cross, 0);
		DefaultSprites.crossSprites = new Sprite[crosses.length];
		for (int var10 = 0; var10 < crosses.length; var10++) {
			DefaultSprites.crossSprites[var10] = toolkit.createSprite(crosses[var10], true);
		}
		SpriteData[] mapdots = SpriteDataProvider.method1608(spritesJs5, DefaultSprites.mapdots, 0);
		DefaultSprites.mapdotsSprites = new Sprite[mapdots.length];
		byte var12 = 12;
		for (int var13 = 0; var13 < mapdots.length; var13++) {
			mapdots[var13].method2605(-var12 + (int) (Math.random() * (double) var12 * 2.0D), -var12 + (int) (Math.random() * (double) var12 * 2.0D), -var12 + (int) (Math.random() * (double) var12 * 2.0D));
			DefaultSprites.mapdotsSprites[var13] = toolkit.createSprite(mapdots[var13], true);
		}
		SpriteData[] var14 = SpriteDataProvider.method1608(spritesJs5, field511, 0);
		field10302 = new Sprite[var14.length];
		byte var15 = 12;
		for (int var16 = 0; var16 < var14.length; var16++) {
			var14[var16].method2605(-var15 + (int) (Math.random() * (double) var15 * 2.0D), -var15 + (int) (Math.random() * (double) var15 * 2.0D), -var15 + (int) (Math.random() * (double) var15 * 2.0D));
			field10302[var16] = toolkit.createSprite(var14[var16], true);
		}
		compassSprites = toolkit.createSprite(SpriteDataProvider.method1609(spritesJs5, compass, 0), true);
		field1940 = toolkit.createSprite(SpriteDataProvider.method1609(spritesJs5, field512, 0), true);
		SpriteData[] var17 = SpriteDataProvider.method1608(spritesJs5, field12241, 0);
		field6719 = new Sprite[var17.length];
		for (int var18 = 0; var18 < var17.length; var18++) {
			field6719[var18] = toolkit.createSprite(var17[var18], true);
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

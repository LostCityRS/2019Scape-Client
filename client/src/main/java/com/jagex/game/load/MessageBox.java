package com.jagex.game.load;

import com.jagex.graphics.*;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("as")
public class MessageBox {

	@ObfuscatedName("as.e")
	public static LoadingScreenAlignmentX field709;

	@ObfuscatedName("as.n")
	public static LoadingScreenAlignmentY field715;

	@ObfuscatedName("as.m")
	public static int field711;

	@ObfuscatedName("j.k")
	public static int field621;

	@ObfuscatedName("as.f")
	public static int field712;

	@ObfuscatedName("x.w")
	public static int field592;

	@ObfuscatedName("uz.l")
	public static int field7091;

	@ObfuscatedName("gp.u")
	public static int field1921;

	@ObfuscatedName("vy.z")
	public static int field7424;

	@ObfuscatedName("as.p")
	public static int field713;

	@ObfuscatedName("as.d")
	public static SpriteData field714;

	@ObfuscatedName("as.c")
	public static SpriteData field710;

	@ObfuscatedName("rk.r")
	public static SpriteData field4963;

	@ObfuscatedName("acm.v")
	public static FontMetrics field8851;

	@ObfuscatedName("as.o")
	public static PalettedSpriteData field716;

	@ObfuscatedName("ae.s")
	public static int field627;

	@ObfuscatedName("adx.y")
	public static boolean field9262;

	public MessageBox() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("fm.e(Lkv;Lky;IIIIIIIIII)V")
	public static void method3004(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field709 = arg0;
		field715 = arg1;
		field711 = arg2;
		field621 = arg3;
		field712 = arg4;
		field592 = arg5;
		field7091 = arg6;
		field1921 = arg7;
		field7424 = arg8;
		field714 = null;
		field710 = null;
		field4963 = null;
		field627 = arg9;
		field713 = arg10;
		method16459();
		field9262 = true;
	}

	@ObfuscatedName("agz.n(I)Z")
	public static boolean method16459() {
		boolean var0 = true;
		if (field714 == null) {
			if (Client.spritesJs5.method6889(field7091)) {
				field714 = SpriteDataProvider.method1607(Client.spritesJs5, field7091);
			} else {
				var0 = false;
			}
		}
		if (field710 == null) {
			if (Client.spritesJs5.method6889(field1921)) {
				field710 = SpriteDataProvider.method1607(Client.spritesJs5, field1921);
			} else {
				var0 = false;
			}
		}
		if (field4963 == null) {
			if (Client.spritesJs5.method6889(field7424)) {
				field4963 = SpriteDataProvider.method1607(Client.spritesJs5, field7424);
			} else {
				var0 = false;
			}
		}
		if (field8851 == null) {
			if (Client.fontmetricsJs5.method6889(field713)) {
				field8851 = Client.field7538.method6163(Client.field10833, field713);
			} else {
				var0 = false;
			}
		}
		if (field716 == null) {
			if (Client.spritesJs5.method6889(field713)) {
				field716 = (PalettedSpriteData) SpriteDataProvider.method1607(Client.spritesJs5, field713);
			} else {
				var0 = false;
			}
		}
		return var0;
	}

	@ObfuscatedName("ae.m(Ljava/lang/String;ZLdh;Leu;Laac;B)V")
	public static void draw(String arg0, boolean arg1, Renderer arg2, Font arg3, FontMetrics arg4) {
		boolean var5 = !field9262 || method16459();
		if (!var5) {
			return;
		}
		if (field9262 && var5) {
			FontMetrics var6 = field8851;
			Font var7 = arg2.createFont(var6, field716, true);
			int var8 = var6.method14551(arg0, 250, null);
			int var9 = var6.method14545(arg0, 250, var6.field8566, null);
			int var10 = field710.getWidth();
			int var11 = var10 + 4;
			int var12 = var11 * 2 + var8;
			int var13 = var11 * 2 + var9;
			if (var12 < field712) {
				var12 = field712;
			}
			if (var13 < field592) {
				var13 = field592;
			}
			int var14 = field709.method5382(var12, Client.field10941) + field711;
			int var15 = field715.method5375(var13, Client.field10942) + field621;
			arg2.createSprite(field4963, false).method1449(var14 + field714.getWidth(), var15 + field714.getHeight(), var12 - field714.getWidth() * 2, var13 - field714.getHeight() * 2, 1, -1, 0);
			arg2.createSprite(field714, true).method1439(var14, var15);
			field714.method2601();
			arg2.createSprite(field714, true).method1439(var12 + var14 - var10, var15);
			field714.method2602();
			arg2.createSprite(field714, true).method1439(var12 + var14 - var10, var13 + var15 - var10);
			field714.method2601();
			arg2.createSprite(field714, true).method1439(var14, var13 + var15 - var10);
			field714.method2602();
			arg2.createSprite(field710, true).method1448(var14, var15 + field714.getHeight(), var10, var13 - field714.getHeight() * 2);
			field710.method2588();
			arg2.createSprite(field710, true).method1448(var14 + field714.getWidth(), var15, var12 - field714.getWidth() * 2, var10);
			field710.method2588();
			arg2.createSprite(field710, true).method1448(var12 + var14 - var10, var15 + field714.getHeight(), var10, var13 - field714.getHeight() * 2);
			field710.method2588();
			arg2.createSprite(field710, true).method1448(var14 + field714.getWidth(), var13 + var15 - var10, var12 - field714.getWidth() * 2, var10);
			field710.method2588();
			var7.method2720(arg0, var11 + var14, var11 + var15, var12 - var11 * 2, var13 - var11 * 2, field627 | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0);
			Client.method3066(var14, var15, var12, var13);
		} else {
			int var16 = arg4.method14551(arg0, 250, null);
			int var17 = arg4.method14538(arg0, 250, null) * 13;
			byte var18 = 4;
			int var19 = var18 + 6;
			int var20 = var18 + 6;
			arg2.fillRectangle(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18, -16777216, 0);
			arg2.drawRectangle(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18, -1, 0);
			arg3.method2720(arg0, var19, var20, var16, var17, -1, -1, 1, 1, 0, null, null, null, 0, 0);
			Client.method3066(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18);
		}
		if (!arg1) {
			return;
		}
		try {
			arg2.method2202();
			arg2.method2115();
		} catch (RendererException var22) {
		}
	}
}

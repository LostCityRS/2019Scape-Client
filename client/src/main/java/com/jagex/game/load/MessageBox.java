package com.jagex.game.load;

import com.jagex.graphics.Font;
import com.jagex.graphics.FontGlyph;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.PalettedSpriteData;
import com.jagex.graphics.RendererException;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.SpriteData;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.graphics.SpriteRelated;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("as")
public class MessageBox {

	@ObfuscatedName("as.e")
	public static LoadingScreenAlignmentX halign;

	@ObfuscatedName("as.n")
	public static LoadingScreenAlignmentY valign;

	@ObfuscatedName("as.m")
	public static int boxX;

	@ObfuscatedName("j.k")
	public static int boxY;

	@ObfuscatedName("as.f")
	public static int minWidth;

	@ObfuscatedName("x.w")
	public static int minHeight;

	@ObfuscatedName("uz.l")
	public static int borderCornerId;

	@ObfuscatedName("gp.u")
	public static int borderLineId;

	@ObfuscatedName("vy.z")
	public static int backgroundId;

	@ObfuscatedName("as.p")
	public static int fontId;

	@ObfuscatedName("as.d")
	public static SpriteData borderCorner;

	@ObfuscatedName("as.c")
	public static SpriteData borderLine;

	@ObfuscatedName("rk.r")
	public static SpriteData background;

	@ObfuscatedName("acm.v")
	public static FontMetrics font1;

	@ObfuscatedName("as.o")
	public static PalettedSpriteData font2;

	@ObfuscatedName("ae.s")
	public static int color;

	@ObfuscatedName("adx.y")
	public static boolean setup;

	public MessageBox() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("fm.e(Lkv;Lky;IIIIIIIIII)V")
	public static void setup(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		halign = arg0;
		valign = arg1;
		boxX = arg2;
		boxY = arg3;
		minWidth = arg4;
		minHeight = arg5;
		borderCornerId = arg6;
		borderLineId = arg7;
		backgroundId = arg8;
		borderCorner = null;
		borderLine = null;
		background = null;
		color = arg9;
		fontId = arg10;
		downloadSprites();
		setup = true;
	}

	@ObfuscatedName("agz.n(I)Z")
	public static boolean downloadSprites() {
		boolean var0 = true;
		if (borderCorner == null) {
			if (Client.spritesJs5.loadFile(borderCornerId)) {
				borderCorner = SpriteDataProvider.get(Client.spritesJs5, borderCornerId);
			} else {
				var0 = false;
			}
		}
		if (borderLine == null) {
			if (Client.spritesJs5.loadFile(borderLineId)) {
				borderLine = SpriteDataProvider.get(Client.spritesJs5, borderLineId);
			} else {
				var0 = false;
			}
		}
		if (background == null) {
			if (Client.spritesJs5.loadFile(backgroundId)) {
				background = SpriteDataProvider.get(Client.spritesJs5, backgroundId);
			} else {
				var0 = false;
			}
		}
		if (font1 == null) {
			if (Client.fontmetricsJs5.loadFile(fontId)) {
				font1 = Client.fontProvider.getFontMetrics(Client.fontFactory, fontId);
			} else {
				var0 = false;
			}
		}
		if (font2 == null) {
			if (Client.spritesJs5.loadFile(fontId)) {
				font2 = (PalettedSpriteData) SpriteDataProvider.get(Client.spritesJs5, fontId);
			} else {
				var0 = false;
			}
		}
		return var0;
	}

	@ObfuscatedName("ae.m(Ljava/lang/String;ZLdh;Leu;Laac;B)V")
	public static void draw(String arg0, boolean arg1, Toolkit arg2, Font arg3, FontMetrics arg4) {
		boolean var5 = !setup || downloadSprites();
		if (!var5) {
			return;
		}
		if (setup && var5) {
			FontMetrics var6 = font1;
			Font var7 = arg2.createFont(var6, font2, true);
			int var8 = var6.parawidth(arg0, 250, null);
			int var9 = var6.paraheight(arg0, 250, var6.field8566, null);
			int var10 = borderLine.getWidth();
			int var11 = var10 + 4;
			int var12 = var11 * 2 + var8;
			int var13 = var11 * 2 + var9;
			if (var12 < minWidth) {
				var12 = minWidth;
			}
			if (var13 < minHeight) {
				var13 = minHeight;
			}
			int var14 = halign.computeX(var12, Client.frameWidth) + boxX;
			int var15 = valign.computeY(var13, Client.frameHeight) + boxY;
			arg2.createSprite(background, false).drawTiledTinted(var14 + borderCorner.getWidth(), var15 + borderCorner.getHeight(), var12 - borderCorner.getWidth() * 2, var13 - borderCorner.getHeight() * 2, 1, -1, 0);
			arg2.createSprite(borderCorner, true).drawSprite(var14, var15);
			borderCorner.flipHorizontally();
			arg2.createSprite(borderCorner, true).drawSprite(var12 + var14 - var10, var15);
			borderCorner.flipVertically();
			arg2.createSprite(borderCorner, true).drawSprite(var12 + var14 - var10, var13 + var15 - var10);
			borderCorner.flipHorizontally();
			arg2.createSprite(borderCorner, true).drawSprite(var14, var13 + var15 - var10);
			borderCorner.flipVertically();
			arg2.createSprite(borderLine, true).drawTiled(var14, var15 + borderCorner.getHeight(), var10, var13 - borderCorner.getHeight() * 2);
			borderLine.rotate();
			arg2.createSprite(borderLine, true).drawTiled(var14 + borderCorner.getWidth(), var15, var12 - borderCorner.getWidth() * 2, var10);
			borderLine.rotate();
			arg2.createSprite(borderLine, true).drawTiled(var12 + var14 - var10, var15 + borderCorner.getHeight(), var10, var13 - borderCorner.getHeight() * 2);
			borderLine.rotate();
			arg2.createSprite(borderLine, true).drawTiled(var14 + borderCorner.getWidth(), var13 + var15 - var10, var12 - borderCorner.getWidth() * 2, var10);
			borderLine.rotate();
			var7.drawStringTaggable(arg0, var11 + var14, var11 + var15, var12 - var11 * 2, var13 - var11 * 2, color | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0);
			Client.requestRedrawAtPoint(var14, var15, var12, var13);
		} else {
			int var16 = arg4.parawidth(arg0, 250, null);
			int var17 = arg4.paraheight(arg0, 250, null) * 13;
			byte var18 = 4;
			int var19 = var18 + 6;
			int var20 = var18 + 6;
			arg2.fillRectangle(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18, -16777216, 0);
			arg2.drawRectangle(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18, -1, 0);
			arg3.drawStringTaggable(arg0, var19, var20, var16, var17, -1, -1, 1, 1, 0, null, null, null, 0, 0);
			Client.requestRedrawAtPoint(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18);
		}
		if (!arg1) {
			return;
		}
		try {
			arg2.flush();
			arg2.method2115();
		} catch (RendererException var22) {
		}
	}
}

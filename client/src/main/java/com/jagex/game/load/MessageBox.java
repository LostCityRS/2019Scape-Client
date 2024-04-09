package com.jagex.game.load;

import com.jagex.graphics.*;
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
	public static void setup(LoadingScreenAlignmentX halign, LoadingScreenAlignmentY valign, int boxX, int boxY, int minWidth, int minHeight, int borderCornerId, int borderLineId, int backgroundId, int color, int fontId) {
		MessageBox.halign = halign;
		MessageBox.valign = valign;
		MessageBox.boxX = boxX;
		MessageBox.boxY = boxY;
		MessageBox.minWidth = minWidth;
		MessageBox.minHeight = minHeight;
		MessageBox.borderCornerId = borderCornerId;
		MessageBox.borderLineId = borderLineId;
		MessageBox.backgroundId = backgroundId;
		MessageBox.borderCorner = null;
		MessageBox.borderLine = null;
		MessageBox.background = null;
		MessageBox.color = color;
		MessageBox.fontId = fontId;
		downloadSprites();
		MessageBox.setup = true;
	}

	@ObfuscatedName("agz.n(I)Z")
	public static boolean downloadSprites() {
		boolean loaded = true;

		if (borderCorner == null) {
			if (Client.spritesJs5.loadFile(borderCornerId)) {
				borderCorner = SpriteDataProvider.get(Client.spritesJs5, borderCornerId);
			} else {
				loaded = false;
			}
		}

		if (borderLine == null) {
			if (Client.spritesJs5.loadFile(borderLineId)) {
				borderLine = SpriteDataProvider.get(Client.spritesJs5, borderLineId);
			} else {
				loaded = false;
			}
		}

		if (background == null) {
			if (Client.spritesJs5.loadFile(backgroundId)) {
				background = SpriteDataProvider.get(Client.spritesJs5, backgroundId);
			} else {
				loaded = false;
			}
		}

		if (font1 == null) {
			if (Client.fontmetricsJs5.loadFile(fontId)) {
				font1 = Client.fontProvider.getFontMetrics(Client.fontFactory, fontId);
			} else {
				loaded = false;
			}
		}

		if (font2 == null) {
			if (Client.spritesJs5.loadFile(fontId)) {
				font2 = (PalettedSpriteData) SpriteDataProvider.get(Client.spritesJs5, fontId);
			} else {
				loaded = false;
			}
		}

		return loaded;
	}

	@ObfuscatedName("ae.m(Ljava/lang/String;ZLdh;Leu;Laac;B)V")
	public static void draw(String text, boolean arg1, Toolkit toolkit, Font font, FontMetrics fontMetrics) {
		boolean loaded = !setup || downloadSprites();
		if (!loaded) {
			return;
		}

		if (setup && loaded) {
			FontMetrics var6 = font1;
			Font var7 = toolkit.createFont(var6, font2, true);

			int width = var6.parawidth(text, 250, null);
			int height = var6.paraheight(text, 250, var6.field8566, null);
			int var10 = borderLine.getWidth();

			int var11 = var10 + 4;
			int var12 = var11 * 2 + width;
			int var13 = var11 * 2 + height;

			if (var12 < minWidth) {
				var12 = minWidth;
			}

			if (var13 < minHeight) {
				var13 = minHeight;
			}

			int var14 = halign.computeX(var12, Client.frameWidth) + boxX;
			int var15 = valign.computeY(var13, Client.frameHeight) + boxY;

			toolkit.createSprite(background, false).drawTiledTinted(var14 + borderCorner.getWidth(), var15 + borderCorner.getHeight(), var12 - borderCorner.getWidth() * 2, var13 - borderCorner.getHeight() * 2, 1, -1, 0);

			toolkit.createSprite(borderCorner, true).drawSprite(var14, var15);
			borderCorner.flipHorizontally();

			toolkit.createSprite(borderCorner, true).drawSprite(var12 + var14 - var10, var15);
			borderCorner.flipVertically();

			toolkit.createSprite(borderCorner, true).drawSprite(var12 + var14 - var10, var13 + var15 - var10);
			borderCorner.flipHorizontally();

			toolkit.createSprite(borderCorner, true).drawSprite(var14, var13 + var15 - var10);
			borderCorner.flipVertically();

			toolkit.createSprite(borderLine, true).drawTiled(var14, var15 + borderCorner.getHeight(), var10, var13 - borderCorner.getHeight() * 2);
			borderLine.rotate();

			toolkit.createSprite(borderLine, true).drawTiled(var14 + borderCorner.getWidth(), var15, var12 - borderCorner.getWidth() * 2, var10);
			borderLine.rotate();

			toolkit.createSprite(borderLine, true).drawTiled(var12 + var14 - var10, var15 + borderCorner.getHeight(), var10, var13 - borderCorner.getHeight() * 2);
			borderLine.rotate();

			toolkit.createSprite(borderLine, true).drawTiled(var14 + borderCorner.getWidth(), var13 + var15 - var10, var12 - borderCorner.getWidth() * 2, var10);
			borderLine.rotate();

			var7.drawStringTaggable(text, var11 + var14, var11 + var15, var12 - var11 * 2, var13 - var11 * 2, color | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0);
			Client.requestRedrawAtPoint(var14, var15, var12, var13);
		} else {
			int width = fontMetrics.parawidth(text, 250, null);
			int height = fontMetrics.paraheight(text, 250, null) * 13;

			byte var18 = 4;
			int var19 = var18 + 6;
			int var20 = var18 + 6;

			toolkit.fillRectangle(var19 - var18, var20 - var18, width + var18 + var18, height + var18 + var18, -16777216, 0);
			toolkit.drawRectangle(var19 - var18, var20 - var18, width + var18 + var18, height + var18 + var18, -1, 0);
			font.drawStringTaggable(text, var19, var20, width, height, -1, -1, 1, 1, 0, null, null, null, 0, 0);
			Client.requestRedrawAtPoint(var19 - var18, var20 - var18, width + var18 + var18, height + var18 + var18);
		}

        if (arg1) {
            try {
                toolkit.flush();
                toolkit.method2115();
            } catch (RendererException var22) {
            }
        }
    }
}

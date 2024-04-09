package com.jagex.graphics.gl;

import com.jagex.game.client.DataType;
import com.jagex.graphics.*;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("afs")
public class GlFont extends Font {

	@ObfuscatedName("afs.o")
	public final GlToolkit field10243;

	@ObfuscatedName("afs.s")
	public final GlTexture_Sub1_Sub1 field10241;

	@ObfuscatedName("afs.y")
	public final GlRenderList field10242;

	@ObfuscatedName("afs.q")
	public final boolean field10240;

	public GlFont(GlToolkit arg0, FontMetrics arg1, SpriteData arg2, boolean arg3) {
		super(arg0, arg1);
		this.field10243 = arg0;
		int[] var5 = new int[this.fontMetrics.field8572 * this.fontMetrics.field8571];
		if (arg3) {
			Object var6 = null;
			byte[] var8;
			if (arg2.isPaletted()) {
				PalettedSpriteData var7 = (PalettedSpriteData) arg2;
				var8 = var7.isTranslucent() ? var7.field10228 : var7.colour;
				if (!var7.isTranslucent()) {
					for (int var9 = 0; var9 < var8.length; var9++) {
						var8[var9] = (byte) (var8[var9] == 0 ? 0 : -1);
					}
				}
			} else {
				FullSpriteData var10 = (FullSpriteData) arg2;
				int[] var11 = var10.method2604(false);
				var8 = new byte[var11.length];
				if (var10.isTranslucent()) {
					for (int var15 = 0; var15 < var8.length; var15++) {
						var8[var15] = (byte) (var5[var15] >> 24 & 0xFF);
					}
				} else {
					for (int var12 = 0; var12 < var8.length; var12++) {
						int var13 = var11[var12];
						byte var14 = (byte) ((var13 & 0xFF) + (var13 >> 16 & 0xFF) * 3 + (var13 >> 8 & 0xFF) * 4 >> 3);
						var8[var12] = var14;
					}
				}
			}
			this.field10241 = GlTexture_Sub1_Sub1.method18932(arg0, TextureFormat.ALPHA, DataType.UNSIGNED_INT_8, this.fontMetrics.field8571, this.fontMetrics.field8572, false, var8, TextureFormat.ALPHA);
			this.field10240 = true;
		} else {
			if (arg2.isPaletted()) {
				PalettedSpriteData var16 = (PalettedSpriteData) arg2;
				int[] var17 = var16.palette;
				byte[] var18 = var16.field10228;
				byte[] var19 = var16.colour;
				if (var18 == null) {
					for (int var21 = 0; var21 < var19.length; var21++) {
						byte var22;
						if ((var22 = var19[var21]) != 0) {
							var5[var21] = var17[var22 & 0xFF] | 0xFF000000;
						}
					}
				} else {
					for (int var20 = 0; var20 < var18.length; var20++) {
						var5[var20] = var18[var20] << 24 | var17[var19[var20] & 0xFF];
					}
				}
			} else {
				FullSpriteData var23 = (FullSpriteData) arg2;
				int[] var24 = var23.method2604(false);
				if (var23.isTranslucent()) {
					for (int var27 = 0; var27 < var5.length; var27++) {
						var5[var27] = var24[var27];
					}
				} else {
					for (int var25 = 0; var25 < var5.length; var25++) {
						int var26 = var24[var25] & 0xFFFFFF;
						var5[var25] = (var26 == 0 ? 0 : 255) << 24 | var26;
					}
				}
			}
			this.field10241 = GlTexture_Sub1_Sub1.method18931(arg0, this.fontMetrics.field8571, this.fontMetrics.field8572, false, var5, 0, 0);
			this.field10240 = false;
		}
		this.field10241.method1082(this.fontMetrics.field8570 != 1);
		this.field10242 = new GlRenderList(arg0, 256);
		float var28 = 1.0F / (float) this.fontMetrics.field8571;
		float var29 = 1.0F / (float) this.fontMetrics.field8572;
		for (int var30 = 0; var30 < 256; var30++) {
			int var31 = arg1.method14558(var30);
			int var32 = arg1.method14529(var30);
			short[] var33 = this.fontMetrics.method14561(var30);
			float var34 = (float) var33[0] * var28;
			float var35 = (float) var33[1] * var29;
			float var36 = (float) (var33[0] + var33[2]) * var28;
			float var37 = (float) (var33[1] + var33[3]) * var29;
			int var38 = this.fontMetrics.method14560(var30);
			this.field10242.method1245(var30);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(var34, 1.0F - var35);
			OpenGL.glVertex2i(0, var38);
			OpenGL.glTexCoord2f(var34, 1.0F - var37);
			OpenGL.glVertex2i(0, var32 + var38);
			OpenGL.glTexCoord2f(var36, 1.0F - var37);
			OpenGL.glVertex2i(var31, var32 + var38);
			OpenGL.glTexCoord2f(var36, 1.0F - var35);
			OpenGL.glVertex2i(var31, var38);
			OpenGL.glEnd();
			this.field10242.method1243();
		}
	}

	@ObfuscatedName("afs.s(CIIIZ)V")
	public void drawChar(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.field10243.method15731();
		this.field10243.method15777(this.field10241);
		if (this.field10240 || arg4) {
			this.field10243.method15810(7681, 8448);
			this.field10243.method15780(0, 34168, 768);
		} else {
			this.field10243.method15810(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.field10242.method1246(arg0);
		OpenGL.glLoadIdentity();
		if (this.field10240 || arg4) {
			this.field10243.method15780(0, 5890, 768);
		}
	}

	@ObfuscatedName("afs.y(CIIIZLch;II)V")
	public void drawChar2(char arg0, int arg1, int arg2, int arg3, boolean arg4, SpriteRelated arg5, int arg6, int arg7) {
		GlSpriteRelated var9 = (GlSpriteRelated) arg5;
		GlTexture_Sub1_Sub1 var10 = var9.field9416;
		this.field10243.method15731();
		this.field10243.method15777(this.field10241);
		if (this.field10240 || arg4) {
			this.field10243.method15810(7681, 8448);
			this.field10243.method15780(0, 34168, 768);
		} else {
			this.field10243.method15810(7681, 7681);
		}
		this.field10243.method15776(1);
		this.field10243.method15777(var10);
		this.field10243.method15810(7681, 8448);
		this.field10243.method15780(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float var11 = var10.field11901 / (float) var10.field11900;
		float var12 = var10.field11898 / (float) var10.field11902;
		OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) -arg6 * var11 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) -arg7 * var12 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.field10242.method1246(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.field10243.method15780(0, 5890, 768);
		this.field10243.method15810(8448, 8448);
		this.field10243.method15777(null);
		this.field10243.method15776(0);
		if (this.field10240 || arg4) {
			this.field10243.method15780(0, 5890, 768);
		}
	}
}

package com.jagex.graphics.gl;

import com.jagex.game.client.DataType;
import com.jagex.graphics.GraphicsDeletable;
import com.jagex.graphics.SpriteRelated;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aei")
public class GlSprite extends Sprite {

	@ObfuscatedName("aei.e")
	public final GlTexture_Sub1_Sub1 field9396;

	@ObfuscatedName("aei.n")
	public final GlToolkit field9399;

	@ObfuscatedName("aei.m")
	public GlTexture_Sub1_Sub1 field9393;

	@ObfuscatedName("aei.k")
	public int field9394 = 0;

	@ObfuscatedName("aei.f")
	public boolean field9395 = false;

	@ObfuscatedName("aei.w")
	public int field9392 = 0;

	@ObfuscatedName("aei.l")
	public int field9391 = 0;

	@ObfuscatedName("aei.u")
	public int field9398 = 0;

	@ObfuscatedName("aei.z")
	public int field9397 = 0;

	public GlSprite(GlToolkit arg0, int arg1, int arg2, boolean arg3) {
		this.field9399 = arg0;
		this.field9396 = GlTexture_Sub1_Sub1.method18934(arg0, arg3 ? TextureFormat.RGBA : TextureFormat.RGB, DataType.UNSIGNED_INT_8, arg1, arg2);
	}

	public GlSprite(GlToolkit arg0, int arg1, int arg2, int arg3, int arg4) {
		this.field9399 = arg0;
		this.field9396 = GlTexture_Sub1_Sub1.method18930(arg0, arg1, arg2, arg3, arg4);
	}

	public GlSprite(GlToolkit arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
		this.field9399 = arg0;
		this.field9396 = GlTexture_Sub1_Sub1.method18931(arg0, arg1, arg2, false, arg3, arg5, arg4);
	}

	@ObfuscatedName("aei.e(IIII)V")
	public void setPadding(int arg0, int arg1, int arg2, int arg3) {
		this.field9391 = arg0;
		this.field9392 = arg1;
		this.field9397 = arg2;
		this.field9398 = arg3;
		this.field9395 = this.field9391 != 0 || this.field9392 != 0 || this.field9397 != 0 || this.field9398 != 0;
	}

	@ObfuscatedName("aei.n([I)V")
	public void method1432(int[] arg0) {
		arg0[0] = this.field9391;
		arg0[1] = this.field9392;
		arg0[2] = this.field9397;
		arg0[3] = this.field9398;
	}

	@ObfuscatedName("aei.m()I")
	public int getWidth() {
		return this.field9396.field11900;
	}

	@ObfuscatedName("aei.k()I")
	public int getX() {
		return this.field9396.field11900 + this.field9391 + this.field9397;
	}

	@ObfuscatedName("aei.f()I")
	public int getHeight() {
		return this.field9396.field11902;
	}

	@ObfuscatedName("aei.w()I")
	public int getY() {
		return this.field9396.field11902 + this.field9392 + this.field9398;
	}

	@ObfuscatedName("aei.l()Ldp;")
	public GraphicsDeletable method1437() {
		return this.field9396.method15317(0);
	}

	@ObfuscatedName("aei.p(IIIIII)V")
	public void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.method15372(arg0, arg1, arg2, arg3, arg4, arg5, false);
	}

	@ObfuscatedName("aei.cl(IIIIIIZ)V")
	public void method15372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		if (!this.field9399.field9981 || arg6) {
			this.field9396.method15315(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		int[] var8 = this.field9399.method2149(arg4, arg5, arg2, arg3);
		if (var8 != null) {
			for (int var9 = 0; var9 < var8.length; var9++) {
				var8[var9] |= 0xFF000000;
			}
			this.method1469(arg0, arg1, arg2, arg3, var8, 0, arg2);
		}
	}

	@ObfuscatedName("aei.d(III)V")
	public void method1441(int arg0, int arg1, int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.field9393 = GlTexture_Sub1_Sub1.method18930(this.field9399, arg0, arg1, this.field9396.field11900, this.field9396.field11902);
		this.field9394 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@ObfuscatedName("aei.u(IIII[III)V")
	public void method1469(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.field9396.method15313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@ObfuscatedName("aei.z(IIII[I[III)V")
	public void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7) {
		this.field9396.method15314(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aei.cg(I)V")
	public void method15370(int arg0) {
		this.field9399.method15776(1);
		this.field9399.method15777(this.field9396);
		this.field9399.method15810(this.field9399.method15779(arg0), 7681);
		this.field9399.method15780(1, 34167, 768);
		this.field9399.method15781(0, 34168, 770);
		this.field9399.method15776(0);
		this.field9399.method15777(this.field9393);
		this.field9399.method15810(34479, 7681);
		this.field9399.method15780(1, 34166, 768);
		if (this.field9394 == 0) {
			this.field9399.method15783(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.field9394 == 1) {
			this.field9399.method15783(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.field9394 == 2) {
			this.field9399.method15783(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.field9394 == 3) {
			this.field9399.method15783(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@ObfuscatedName("aei.ce()V")
	public void method15371() {
		this.field9399.method15776(1);
		this.field9399.method15777(null);
		this.field9399.method15810(8448, 8448);
		this.field9399.method15780(1, 34168, 768);
		this.field9399.method15781(0, 5890, 770);
		this.field9399.method15776(0);
		this.field9399.method15780(1, 34168, 768);
	}

	@ObfuscatedName("aei.r(IIIII)V")
	public void drawSprite(int x, int y, int arg2, int rgb, int arg4) {
		this.field9396.method1082(false);
		this.field9399.method15772();
		this.field9399.method15791(arg4);
		OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
		int var6 = this.field9391 + x;
		int var7 = this.field9392 + y;
		if (this.field9393 == null) {
			this.field9399.method15777(this.field9396);
			this.field9399.method15778(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
			OpenGL.glVertex2i(var6, var7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(var6, this.field9396.field11902 + var7);
			OpenGL.glTexCoord2f(this.field9396.field11901, 0.0F);
			OpenGL.glVertex2i(this.field9396.field11900 + var6, this.field9396.field11902 + var7);
			OpenGL.glTexCoord2f(this.field9396.field11901, this.field9396.field11898);
			OpenGL.glVertex2i(this.field9396.field11900 + var6, var7);
			OpenGL.glEnd();
			return;
		}
		this.method15370(arg2);
		this.field9393.method1082(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9396.field11898);
		OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
		OpenGL.glVertex2i(var6, var7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(var6, this.field9396.field11902 + var7);
		OpenGL.glMultiTexCoord2f(33985, this.field9396.field11901, 0.0F);
		OpenGL.glTexCoord2f(this.field9396.field11901, 0.0F);
		OpenGL.glVertex2i(this.field9396.field11900 + var6, this.field9396.field11902 + var7);
		OpenGL.glMultiTexCoord2f(33985, this.field9396.field11901, this.field9396.field11898);
		OpenGL.glTexCoord2f(this.field9396.field11901, this.field9396.field11898);
		OpenGL.glVertex2i(this.field9396.field11900 + var6, var7);
		OpenGL.glEnd();
		this.method15371();
	}

	@ObfuscatedName("aei.v(IILch;II)V")
	public void method1444(int arg0, int arg1, SpriteRelated arg2, int arg3, int arg4) {
		GlSpriteRelated var6 = (GlSpriteRelated) arg2;
		GlTexture_Sub1_Sub1 var7 = var6.field9416;
		this.field9396.method1082(false);
		this.field9399.method15772();
		this.field9399.method15777(this.field9396);
		this.field9399.method15778(1);
		this.field9399.method15776(1);
		this.field9399.method15777(var7);
		this.field9399.method15810(7681, 8448);
		this.field9399.method15780(0, 34168, 768);
		this.field9399.method15791(1);
		int var8 = this.field9391 + arg0;
		int var9 = this.field9392 + arg1;
		int var10 = this.field9396.field11900 + var8;
		int var11 = this.field9396.field11902 + var9;
		float var12 = var7.field11901 / (float) var7.field11900;
		float var13 = var7.field11898 / (float) var7.field11902;
		float var14 = (float) (var8 - arg3) * var12;
		float var15 = (float) (var10 - arg3) * var12;
		float var16 = var7.field11898 - (float) (var9 - arg4) * var13;
		float var17 = var7.field11898 - (float) (var11 - arg4) * var13;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9396.field11898);
		OpenGL.glMultiTexCoord2f(33985, var14, var16);
		OpenGL.glVertex2i(var8, var9);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14, var17);
		OpenGL.glVertex2i(var8, this.field9396.field11902 + var9);
		OpenGL.glMultiTexCoord2f(33984, this.field9396.field11901, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var15, var17);
		OpenGL.glVertex2i(this.field9396.field11900 + var8, this.field9396.field11902 + var9);
		OpenGL.glMultiTexCoord2f(33984, this.field9396.field11901, this.field9396.field11898);
		OpenGL.glMultiTexCoord2f(33985, var15, var16);
		OpenGL.glVertex2i(this.field9396.field11900 + var8, var9);
		OpenGL.glEnd();
		this.field9399.method15780(0, 5890, 768);
		this.field9399.method15778(0);
		this.field9399.method15777(null);
		this.field9399.method15776(0);
	}

	@ObfuscatedName("aei.y(IIIIIIII)V")
	public void drawTintedScaled(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field9396.method1082((arg7 & 0x1) != 0);
		this.field9399.method15772();
		this.field9399.method15791(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.field9395) {
			float var9 = (float) arg2 / (float) this.getX();
			float var10 = (float) arg3 / (float) this.getY();
			float var11 = (float) this.field9391 * var9 + (float) arg0;
			float var12 = (float) this.field9392 * var10 + (float) arg1;
			float var13 = (float) this.field9396.field11900 * var9 + var11;
			float var14 = (float) this.field9396.field11902 * var10 + var12;
			if (this.field9393 == null) {
				this.field9399.method15777(this.field9396);
				this.field9399.method15778(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glTexCoord2f(this.field9396.field11901, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glTexCoord2f(this.field9396.field11901, this.field9396.field11898);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
			} else {
				this.method15370(arg4);
				this.field9393.method1082(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9396.field11898);
				OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glMultiTexCoord2f(33985, this.field9396.field11901, 0.0F);
				OpenGL.glTexCoord2f(this.field9396.field11901, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glMultiTexCoord2f(33985, this.field9396.field11901, this.field9396.field11898);
				OpenGL.glTexCoord2f(this.field9396.field11901, this.field9396.field11898);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
				this.method15371();
			}
		} else if (this.field9393 == null) {
			this.field9399.method15777(this.field9396);
			this.field9399.method15778(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.field9396.field11901, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.field9396.field11901, this.field9396.field11898);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method15370(arg4);
			this.field9393.method1082(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9396.field11898);
			OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.field9396.field11901, 0.0F);
			OpenGL.glTexCoord2f(this.field9396.field11901, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.field9396.field11901, this.field9396.field11898);
			OpenGL.glTexCoord2f(this.field9396.field11901, this.field9396.field11898);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method15371();
		}
	}

	@ObfuscatedName("aei.x(IIIIIII)V")
	public void drawTiledTinted(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2;
		int var9 = arg1 + arg3;
		this.field9396.method1082(false);
		this.field9399.method15772();
		this.field9399.method15777(this.field9396);
		this.field9399.method15791(arg6);
		this.field9399.method15778(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.field9396.field11899 && !this.field9395 && arg3 >= this.field9396.field11902 && arg2 >= this.field9396.field11900) {
			float var10 = (float) arg3 * this.field9396.field11898 / (float) this.field9396.field11902;
			float var11 = (float) arg2 * this.field9396.field11901 / (float) this.field9396.field11900;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, var10);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, var9);
			OpenGL.glTexCoord2f(var11, 0.0F);
			OpenGL.glVertex2i(var8, var9);
			OpenGL.glTexCoord2f(var11, var10);
			OpenGL.glVertex2i(var8, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.field9391, (float) this.field9392, 0.0F);
		int var12 = this.getX();
		int var13 = this.getY();
		int var14 = this.field9396.field11902 + arg1;
		OpenGL.glBegin(7);
		int var15 = arg1;
		while (var14 <= var9) {
			int var16 = this.field9396.field11900 + arg0;
			int var17 = arg0;
			while (var16 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
				OpenGL.glVertex2i(var17, var15);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var17, var14);
				OpenGL.glTexCoord2f(this.field9396.field11901, 0.0F);
				OpenGL.glVertex2i(var16, var14);
				OpenGL.glTexCoord2f(this.field9396.field11901, this.field9396.field11898);
				OpenGL.glVertex2i(var16, var15);
				var16 += var12;
				var17 += var12;
			}
			if (var17 < var8) {
				float var18 = (float) (var8 - var17) * this.field9396.field11901 / (float) this.field9396.field11900;
				OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
				OpenGL.glVertex2i(var17, var15);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var17, var14);
				OpenGL.glTexCoord2f(var18, 0.0F);
				OpenGL.glVertex2i(var8, var14);
				OpenGL.glTexCoord2f(var18, this.field9396.field11898);
				OpenGL.glVertex2i(var8, var15);
			}
			var15 += var13;
			var14 += var13;
		}
		if (var15 < var9) {
			float var19 = (float) (this.field9396.field11902 - (var9 - var15)) * this.field9396.field11898 / (float) this.field9396.field11902;
			int var20 = this.field9396.field11900 + arg0;
			int var21 = arg0;
			while (var20 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
				OpenGL.glVertex2i(var21, var15);
				OpenGL.glTexCoord2f(0.0F, var19);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(this.field9396.field11901, var19);
				OpenGL.glVertex2i(var20, var9);
				OpenGL.glTexCoord2f(this.field9396.field11901, this.field9396.field11898);
				OpenGL.glVertex2i(var20, var15);
				var20 += var12;
				var21 += var12;
			}
			if (var21 < var8) {
				float var22 = (float) (var8 - var21) * this.field9396.field11901 / (float) this.field9396.field11900;
				OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
				OpenGL.glVertex2i(var21, var15);
				OpenGL.glTexCoord2f(0.0F, var19);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(var22, var19);
				OpenGL.glVertex2i(var8, var9);
				OpenGL.glTexCoord2f(var22, this.field9396.field11898);
				OpenGL.glVertex2i(var8, var15);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@ObfuscatedName("aei.ag(FFFFFFIIII)V")
	public void method1433(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.field9395) {
			float var11 = (float) this.getX();
			float var12 = (float) this.getY();
			float var13 = (arg2 - arg0) / var11;
			float var14 = (arg3 - arg1) / var11;
			float var15 = (arg4 - arg0) / var12;
			float var16 = (arg5 - arg1) / var12;
			float var17 = (float) this.field9392 * var15;
			float var18 = (float) this.field9392 * var16;
			float var19 = (float) this.field9391 * var13;
			float var20 = (float) this.field9391 * var14;
			float var21 = (float) this.field9397 * -var13;
			float var22 = (float) this.field9397 * -var14;
			float var23 = (float) this.field9398 * -var15;
			float var24 = (float) this.field9398 * -var16;
			arg0 = arg0 + var19 + var17;
			arg1 = arg1 + var20 + var18;
			arg2 = arg2 + var21 + var17;
			arg3 = arg3 + var22 + var18;
			arg4 = arg4 + var19 + var23;
			arg5 = arg5 + var20 + var24;
		}
		float var25 = arg2 - arg0 + arg4;
		float var26 = arg5 - arg1 + arg3;
		this.field9396.method1082((arg9 & 0x1) != 0);
		this.field9399.method15772();
		this.field9399.method15777(this.field9396);
		this.field9399.method15791(arg8);
		this.field9399.method15778(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.field9396.field11898);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.field9396.field11901, 0.0F);
		OpenGL.glVertex2f(var25, var26);
		OpenGL.glTexCoord2f(this.field9396.field11901, this.field9396.field11898);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@ObfuscatedName("aei.al(FFFFFFILch;II)V")
	public void method1454(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, SpriteRelated arg7, int arg8, int arg9) {
		GlTexture_Sub1_Sub1 var11 = ((GlSpriteRelated) arg7).field9416;
		if (this.field9395) {
			float var12 = (float) this.getX();
			float var13 = (float) this.getY();
			float var14 = (arg2 - arg0) / var12;
			float var15 = (arg3 - arg1) / var12;
			float var16 = (arg4 - arg0) / var13;
			float var17 = (arg5 - arg1) / var13;
			float var18 = (float) this.field9392 * var16;
			float var19 = (float) this.field9392 * var17;
			float var20 = (float) this.field9391 * var14;
			float var21 = (float) this.field9391 * var15;
			float var22 = (float) this.field9397 * -var14;
			float var23 = (float) this.field9397 * -var15;
			float var24 = (float) this.field9398 * -var16;
			float var25 = (float) this.field9398 * -var17;
			arg0 = arg0 + var20 + var18;
			arg1 = arg1 + var21 + var19;
			arg2 = arg2 + var22 + var18;
			arg3 = arg3 + var23 + var19;
			arg4 = arg4 + var20 + var24;
			arg5 = arg5 + var21 + var25;
		}
		float var26 = arg2 - arg0 + arg4;
		float var27 = arg5 - arg1 + arg3;
		this.field9396.method1082((arg6 & 0x1) != 0);
		this.field9399.method15772();
		this.field9399.method15777(this.field9396);
		this.field9399.method15778(1);
		this.field9399.method15776(1);
		this.field9399.method15777(var11);
		this.field9399.method15810(7681, 8448);
		this.field9399.method15780(0, 34168, 768);
		this.field9399.method15791(1);
		float var28 = var11.field11901 / (float) var11.field11900;
		float var29 = var11.field11898 / (float) var11.field11902;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9396.field11898);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field11898 - (arg1 - (float) arg9) * var29);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field11898 - (arg5 - (float) arg9) * var29);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.field9396.field11901, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field11898 - (var27 - (float) arg9) * var29);
		OpenGL.glVertex2f(var26, var27);
		OpenGL.glMultiTexCoord2f(33984, this.field9396.field11901, this.field9396.field11898);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field11898 - (arg3 - (float) arg9) * var29);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.field9399.method15780(0, 5890, 768);
		this.field9399.method15778(0);
		this.field9399.method15777(null);
		this.field9399.method15776(0);
	}
}

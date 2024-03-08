package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aet")
public class class819 extends class74 {

	@ObfuscatedName("aet.k")
	public final class78 field9302;

	@ObfuscatedName("aet.f")
	public class73 field9300;

	@ObfuscatedName("aet.w")
	public class814 field9303;

	@ObfuscatedName("aet.l")
	public static final float[] field9305 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	public class819(class849 arg0, class78 arg1) {
		super(arg0);
		this.field9302 = arg1;
		this.method15341();
		this.field9303 = new class814(this.field1021, class109.field1270, class135.field1645, 2, new byte[] { 0, -1 }, class109.field1270);
		this.field9303.method15334(false);
	}

	@ObfuscatedName("aet.e()Z")
	public boolean method1252() {
		return true;
	}

	@ObfuscatedName("aet.n(Z)V")
	public void method1263(boolean arg0) {
		if (this.field1021.field9956 > 0) {
			float var2 = -0.5F / (float) this.field1021.field9956;
			this.field1021.method15776(1);
			field9305[0] = 0.0F;
			field9305[1] = 0.0F;
			field9305[2] = var2;
			field9305[3] = this.field1021.field9830 * var2 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, field9305, 0);
			OpenGL.glPopMatrix();
			this.field1021.method15755(0.5F, (float) this.field1021.field9956);
			this.field1021.method15777(this.field9303);
			this.field1021.method15776(0);
		}
		this.field9300.method1246('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@ObfuscatedName("aet.m(Z)V")
	public void method1254(boolean arg0) {
		this.field1021.method15810(260, 8448);
	}

	@ObfuscatedName("aet.k()V")
	public void method1255() {
		this.field9300.method1246('\u0001');
		if (this.field1021.field9956 > 0) {
			this.field1021.method15776(1);
			this.field1021.method15777(null);
			this.field1021.method15755(1.0F, 0.0F);
			this.field1021.method15776(0);
		}
		this.field1021.method15810(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@ObfuscatedName("aet.f(II)V")
	public void method1256(int arg0, int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.field9302.field1040) {
				this.field1021.method15777(this.field9302.field1042);
				field9305[0] = 0.0F;
				field9305[1] = 0.0F;
				field9305[2] = 0.0F;
				field9305[3] = (float) (this.field1021.field9872 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, field9305, 0);
			} else {
				int var3 = this.field1021.field9872 % 4000 * 16 / 4000;
				this.field1021.method15777(this.field9302.field1041[var3]);
			}
		} else if (this.field9302.field1040) {
			this.field1021.method15777(this.field9302.field1042);
			field9305[0] = 0.0F;
			field9305[1] = 0.0F;
			field9305[2] = 0.0F;
			field9305[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, field9305, 0);
		} else {
			this.field1021.method15777(this.field9302.field1041[0]);
		}
	}

	@ObfuscatedName("aet.w(Lbq;I)V")
	public void method1251(class70 arg0, int arg1) {
	}

	@ObfuscatedName("aet.b()V")
	public void method15341() {
		this.field9300 = new class73(this.field1021, 2);
		this.field9300.method1245(0);
		this.field1021.method15776(1);
		this.field1021.method15810(7681, 260);
		this.field1021.method15780(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.field1021.method15776(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.field9302.field1040) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.field9300.method1243();
		this.field9300.method1245(1);
		this.field1021.method15776(1);
		this.field1021.method15810(8448, 8448);
		this.field1021.method15780(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.field1021.method15776(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.field9302.field1040) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.field9300.method1243();
	}
}

package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aeb")
public class class822 extends class74 {

	@ObfuscatedName("aeb.d")
	public class73 field9333;

	@ObfuscatedName("aeb.c")
	public boolean field9335;

	@ObfuscatedName("aeb.r")
	public boolean field9329 = false;

	@ObfuscatedName("aeb.v")
	public class813[] field9338;

	public class822(class849 arg0) {
		super(arg0);
		if (arg0.field9952) {
			byte[][] var2 = new byte[6][16384];
			byte[][] var3 = new byte[6][16384];
			byte[][] var4 = new byte[6][16384];
			int var5 = 0;
			class423 var6 = new class423(0.0F, -1.0F, 0.0F);
			for (int var7 = 0; var7 < 128; var7++) {
				for (int var8 = 0; var8 < 128; var8++) {
					float var9 = (float) var8 * 2.0F / 128.0F - 1.0F;
					float var10 = (float) var7 * 2.0F / 128.0F - 1.0F;
					float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
					float var12 = var9 * var11;
					float var13 = var10 * var11;
					for (int var14 = 0; var14 < 6; var14++) {
						class423 var15;
						if (var14 == 0) {
							var15 = new class423(-var11, -var12, var13);
						} else if (var14 == 1) {
							var15 = new class423(var11, var12, var13);
						} else if (var14 == 2) {
							var15 = new class423(-var12, var13, -var11);
						} else if (var14 == 3) {
							var15 = new class423(-var12, -var13, var11);
						} else if (var14 == 4) {
							var15 = new class423(var12, var11, -var13);
						} else {
							var15 = new class423(var12, -var11, var13);
						}
						float var16 = var15.method6502(var6);
						float var17 = Math.max(0.0F, Math.min(1.0F, var16));
						int var18;
						int var19;
						int var20;
						if (var17 > 0.0F) {
							var18 = Math.min(255, (int) (Math.pow((double) var17, 128.0D) * 400.0D));
							var19 = Math.min(255, (int) (Math.pow((double) var17, 24.0D) * 400.0D));
							var20 = Math.min(255, (int) (Math.pow((double) var17, 5.0D) * 400.0D));
						} else {
							var20 = 0;
							var19 = 0;
							var18 = 0;
						}
						var3[var14][var5] = (byte) var18;
						var4[var14][var5] = (byte) var19;
						var2[var14][var5] = (byte) var20;
					}
					var5++;
				}
			}
			this.field9338 = new class813[3];
			this.field9338[0] = new class813(this.field1021, class109.field1270, class135.field1645, 128, false, var3, class109.field1270);
			this.field9338[1] = new class813(this.field1021, class109.field1270, class135.field1645, 128, false, var4, class109.field1270);
			this.field9338[2] = new class813(this.field1021, class109.field1270, class135.field1645, 128, false, var2, class109.field1270);
			this.method15349();
		}
	}

	@ObfuscatedName("aeb.e()Z")
	public boolean method1252() {
		return true;
	}

	@ObfuscatedName("aeb.b()V")
	public void method15349() {
		this.field9333 = new class73(this.field1021, 2);
		this.field9333.method1245(0);
		this.field1021.method15776(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);
		if (this.field9335) {
			this.field1021.method15810(260, 7681);
			this.field1021.method15780(0, 5890, 770);
			this.field1021.method15781(0, 34167, 770);
		} else {
			this.field1021.method15810(7681, 8448);
			this.field1021.method15780(0, 34168, 768);
			this.field1021.method15776(2);
			this.field1021.method15810(260, 7681);
			this.field1021.method15780(0, 34168, 768);
			this.field1021.method15780(1, 34168, 770);
			this.field1021.method15781(0, 34167, 770);
		}
		this.field1021.method15776(0);
		this.field9333.method1243();
		this.field9333.method1245(1);
		this.field1021.method15776(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.field9335) {
			this.field1021.method15810(8448, 8448);
			this.field1021.method15780(0, 5890, 768);
			this.field1021.method15781(0, 5890, 770);
		} else {
			this.field1021.method15810(8448, 8448);
			this.field1021.method15780(0, 5890, 768);
			this.field1021.method15776(2);
			this.field1021.method15810(8448, 8448);
			this.field1021.method15780(0, 5890, 768);
			this.field1021.method15780(1, 34168, 768);
			this.field1021.method15781(0, 5890, 770);
		}
		this.field1021.method15776(0);
		this.field9333.method1243();
	}

	@ObfuscatedName("aeb.n(Z)V")
	public void method1263(boolean arg0) {
		if (this.field9333 == null || !arg0) {
			this.field1021.method15781(0, 34168, 770);
			return;
		}
		if (!this.field9335) {
			this.field1021.method15776(2);
			this.field1021.method15777(this.field1021.field9974);
			this.field1021.method15776(0);
		}
		this.field9333.method1246('\u0000');
		this.field9329 = true;
	}

	@ObfuscatedName("aeb.m(Z)V")
	public void method1254(boolean arg0) {
		this.field1021.method15810(8448, 7681);
	}

	@ObfuscatedName("aeb.k()V")
	public void method1255() {
		if (this.field9329) {
			if (!this.field9335) {
				this.field1021.method15776(2);
				this.field1021.method15777(null);
			}
			this.field1021.method15776(1);
			this.field1021.method15777(null);
			this.field1021.method15776(0);
			this.field9333.method1246('\u0001');
			this.field9329 = false;
		} else {
			this.field1021.method15781(0, 5890, 770);
		}
		this.field1021.method15810(8448, 8448);
	}

	@ObfuscatedName("aeb.f(II)V")
	public void method1256(int arg0, int arg1) {
		if (this.field9329) {
			this.field1021.method15776(1);
			this.field1021.method15777(this.field9338[arg0 - 1]);
			this.field1021.method15776(0);
		}
	}

	@ObfuscatedName("aeb.w(Lbq;I)V")
	public void method1251(class70 arg0, int arg1) {
		this.field1021.method15777(arg0);
		this.field1021.method15778(arg1);
	}
}

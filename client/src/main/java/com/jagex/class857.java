package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("afs")
public class class857 extends class140 {

	@ObfuscatedName("afs.o")
	public final class849 field10243;

	@ObfuscatedName("afs.s")
	public final class1113 field10241;

	@ObfuscatedName("afs.y")
	public final class73 field10242;

	@ObfuscatedName("afs.q")
	public final boolean field10240;

	public class857(class849 arg0, class733 arg1, class136 arg2, boolean arg3) {
		super(arg0, arg1);
		this.field10243 = arg0;
		int[] var5 = new int[this.field1667.field8572 * this.field1667.field8571];
		if (arg3) {
			Object var6 = null;
			byte[] var8;
			if (arg2.method2587()) {
				class852 var7 = (class852) arg2;
				var8 = var7.method2644() ? var7.field10228 : var7.field10227;
				if (!var7.method2644()) {
					for (int var9 = 0; var9 < var8.length; var9++) {
						var8[var9] = (byte) (var8[var9] == 0 ? 0 : -1);
					}
				}
			} else {
				class851 var10 = (class851) arg2;
				int[] var11 = var10.method2604(false);
				var8 = new byte[var11.length];
				if (var10.method2644()) {
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
			this.field10241 = class1113.method18932(arg0, class109.field1270, class135.field1645, this.field1667.field8571, this.field1667.field8572, false, var8, class109.field1270);
			this.field10240 = true;
		} else {
			if (arg2.method2587()) {
				class852 var16 = (class852) arg2;
				int[] var17 = var16.field10226;
				byte[] var18 = var16.field10228;
				byte[] var19 = var16.field10227;
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
				class851 var23 = (class851) arg2;
				int[] var24 = var23.method2604(false);
				if (var23.method2644()) {
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
			this.field10241 = class1113.method18931(arg0, this.field1667.field8571, this.field1667.field8572, false, var5, 0, 0);
			this.field10240 = false;
		}
		this.field10241.method1082(this.field1667.field8570 != 1);
		this.field10242 = new class73(arg0, 256);
		float var28 = 1.0F / (float) this.field1667.field8571;
		float var29 = 1.0F / (float) this.field1667.field8572;
		for (int var30 = 0; var30 < 256; var30++) {
			int var31 = arg1.method14558(var30);
			int var32 = arg1.method14529(var30);
			short[] var33 = this.field1667.method14561(var30);
			float var34 = (float) var33[0] * var28;
			float var35 = (float) var33[1] * var29;
			float var36 = (float) (var33[0] + var33[2]) * var28;
			float var37 = (float) (var33[1] + var33[3]) * var29;
			int var38 = this.field1667.method14560(var30);
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
	public void method2690(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
	public void method2697(char arg0, int arg1, int arg2, int arg3, boolean arg4, class103 arg5, int arg6, int arg7) {
		class833 var9 = (class833) arg5;
		class1113 var10 = var9.field9416;
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

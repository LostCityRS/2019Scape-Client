package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("bq")
public abstract class class70 {

	@ObfuscatedName("bq.l")
	public final class849 field1006;

	@ObfuscatedName("bq.u")
	public int field1007;

	@ObfuscatedName("bq.z")
	public final int field1009;

	@ObfuscatedName("bq.p")
	public final class109 field1002;

	@ObfuscatedName("bq.d")
	public final class135 field1010;

	@ObfuscatedName("bq.c")
	public boolean field1011;

	@ObfuscatedName("bq.r")
	public boolean field1012 = false;

	@ObfuscatedName("bq.v")
	public final int field1008;

	@ObfuscatedName("bq.o")
	public static final int[] field1014 = new int[1];

	public class70(class849 arg0, int arg1, class109 arg2, class135 arg3, int arg4, boolean arg5) {
		this.field1006 = arg0;
		this.field1009 = arg1;
		this.field1002 = arg2;
		this.field1010 = arg3;
		this.field1011 = arg5;
		this.field1008 = arg4;
		OpenGL.glGenTextures(1, field1014, 0);
		this.field1007 = field1014[0];
		this.method1088(0);
	}

	@ObfuscatedName("bq.e(Z)V")
	public void method1082(boolean arg0) {
		if (this.field1012 != arg0) {
			this.field1012 = arg0;
			this.method1083();
		}
	}

	@ObfuscatedName("bq.n()V")
	public void method1083() {
		this.field1006.method15777(this);
		if (this.field1012) {
			OpenGL.glTexParameteri(this.field1009, 10241, this.field1011 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.field1009, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.field1009, 10241, this.field1011 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.field1009, 10240, 9728);
		}
	}

	@ObfuscatedName("bq.m()Z")
	public boolean method1084() {
		if (!this.field1006.field9985) {
			return false;
		}
		int var1 = this.method1099();
		this.field1006.method15777(this);
		OpenGL.glGenerateMipmapEXT(this.field1009);
		this.field1011 = true;
		this.method1083();
		this.method1088(var1);
		return true;
	}

	@ObfuscatedName("bq.k(Z)V")
	public void method1118(boolean arg0) {
		if (this.field1011 != arg0) {
			int var2 = this.method1099();
			this.field1011 = true;
			this.method1083();
			this.method1088(var2);
		}
	}

	@ObfuscatedName("bq.f()V")
	public void method1089() {
		if (this.field1007 != 0) {
			this.field1006.field9879 -= this.method1099();
			int[] var1 = new int[] { this.field1007 };
			OpenGL.glDeleteTextures(1, var1, 0);
			this.field1007 = 0;
		}
	}

	@ObfuscatedName("bq.w()V")
	public void method1087() {
		if (this.field1007 != 0) {
			this.field1006.method15822(this.field1007, this.method1099());
			this.field1007 = 0;
		}
	}

	public void finalize() throws Throwable {
		this.method1087();
		super.finalize();
	}

	@ObfuscatedName("bq.l(I)V")
	public void method1088(int arg0) {
		this.field1006.field9879 -= arg0;
		this.field1006.field9879 += this.method1099();
	}

	@ObfuscatedName("bq.u()I")
	public int method1099() {
		int var1 = this.field1010.field1652 * this.field1002.field1279 * this.field1008;
		return this.field1011 ? var1 * 4 / 3 : var1;
	}

	@ObfuscatedName("bq.z(IIIIII[I)V")
	public static void method1109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
		if (arg2 > 0 && !class783.method4918(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !class783.method4918(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 == 32993) {
			int var7 = 0;
			int var8 = arg2 < arg3 ? arg2 : arg3;
			int var9 = arg2 >> 1;
			int var10 = arg3 >> 1;
			int[] var11 = arg6;
			int[] var12 = new int[var9 * var10];
			while (true) {
				OpenGL.glTexImage2Di(arg0, var7, arg1, arg2, arg3, 0, arg4, arg5, var11, 0);
				if (var8 <= 1) {
					return;
				}
				int var13 = 0;
				int var14 = 0;
				int var15 = arg2 + var14;
				for (int var16 = 0; var16 < var10; var16++) {
					for (int var17 = 0; var17 < var9; var17++) {
						int var18 = var11[var14++];
						int var19 = var11[var14++];
						int var20 = var11[var15++];
						int var21 = var11[var15++];
						int var22 = var18 >> 24 & 0xFF;
						int var23 = var18 >> 16 & 0xFF;
						int var24 = var18 >> 8 & 0xFF;
						int var25 = var18 & 0xFF;
						int var26 = (var19 >> 24 & 0xFF) + var22;
						int var27 = (var19 >> 16 & 0xFF) + var23;
						int var28 = (var19 >> 8 & 0xFF) + var24;
						int var29 = (var19 & 0xFF) + var25;
						int var30 = (var20 >> 24 & 0xFF) + var26;
						int var31 = (var20 >> 16 & 0xFF) + var27;
						int var32 = (var20 >> 8 & 0xFF) + var28;
						int var33 = (var20 & 0xFF) + var29;
						int var34 = (var21 >> 24 & 0xFF) + var30;
						int var35 = (var21 >> 16 & 0xFF) + var31;
						int var36 = (var21 >> 8 & 0xFF) + var32;
						int var37 = (var21 & 0xFF) + var33;
						var12[var13++] = (var34 & 0x3FC) << 22 | (var35 & 0x3FC) << 14 | (var36 & 0x3FC) << 6 | var37 >> 2 & 0xFF;
					}
					var14 += arg2;
					var15 += arg2;
				}
				int[] var38 = var12;
				var12 = var11;
				var11 = var38;
				arg2 = var9;
				arg3 = var10;
				var9 >>= 0x1;
				var10 >>= 0x1;
				var8 >>= 0x1;
				var7++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("bq.p(IIIILck;[B)V")
	public static void method1107(int arg0, int arg1, int arg2, int arg3, class109 arg4, byte[] arg5) {
		if (arg2 > 0 && !class783.method4918(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || class783.method4918(arg3)) {
			int var6 = arg4.field1279;
			int var7 = 0;
			int var8 = arg2 < arg3 ? arg2 : arg3;
			int var9 = arg2 >> 1;
			int var10 = arg3 >> 1;
			byte[] var11 = arg5;
			byte[] var12 = new byte[var9 * var10 * var6];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, var7, arg1, arg2, arg3, 0, class849.method15899(arg4), 5121, var11, 0);
				if (var8 <= 1) {
					return;
				}
				int var13 = arg2 * var6;
				for (int var14 = 0; var14 < var6; var14++) {
					int var15 = var14;
					int var16 = var14;
					int var17 = var13 + var14;
					for (int var18 = 0; var18 < var10; var18++) {
						for (int var19 = 0; var19 < var9; var19++) {
							byte var20 = var11[var16];
							int var21 = var6 + var16;
							int var22 = var11[var21] + var20;
							var16 = var6 + var21;
							int var23 = var11[var17] + var22;
							int var24 = var6 + var17;
							int var25 = var11[var24] + var23;
							var17 = var6 + var24;
							var12[var15] = (byte) (var25 >> 2);
							var15 += var6;
						}
						var16 += var13;
						var17 += var13;
					}
				}
				byte[] var26 = var12;
				var12 = var11;
				var11 = var26;
				arg2 = var9;
				arg3 = var10;
				var9 >>= 0x1;
				var10 >>= 0x1;
				var8 >>= 0x1;
				var7++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("bq.d(IIIILck;[F)V")
	public static void method1091(int arg0, int arg1, int arg2, int arg3, class109 arg4, float[] arg5) {
		if (arg2 > 0 && !class783.method4918(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || class783.method4918(arg3)) {
			int var6 = arg4.field1279;
			int var7 = 0;
			int var8 = arg2 < arg3 ? arg2 : arg3;
			int var9 = arg2 >> 1;
			int var10 = arg3 >> 1;
			float[] var11 = arg5;
			float[] var12 = new float[var9 * var10 * var6];
			while (true) {
				OpenGL.glTexImage2Df(arg0, var7, arg1, arg2, arg3, 0, class849.method15899(arg4), 5126, var11, 0);
				if (var8 <= 1) {
					return;
				}
				int var13 = arg2 * var6;
				for (int var14 = 0; var14 < var6; var14++) {
					int var15 = var14;
					int var16 = var14;
					int var17 = var13 + var14;
					for (int var18 = 0; var18 < var10; var18++) {
						for (int var19 = 0; var19 < var9; var19++) {
							float var20 = var11[var16];
							int var21 = var6 + var16;
							float var22 = var11[var21] + var20;
							var16 = var6 + var21;
							float var23 = var11[var17] + var22;
							int var24 = var6 + var17;
							float var25 = var11[var24] + var23;
							var17 = var6 + var24;
							var12[var15] = var25 * 0.25F;
							var15 += var6;
						}
						var16 += var13;
						var17 += var13;
					}
				}
				float[] var26 = var12;
				var12 = var11;
				var11 = var26;
				arg2 = var9;
				arg3 = var10;
				var9 >>= 0x1;
				var10 >>= 0x1;
				var8 >>= 0x1;
				var7++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

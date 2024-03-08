package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ci")
public class class90 {

	@ObfuscatedName("ci.e")
	public final class849 field1155;

	@ObfuscatedName("ci.n")
	public final class836 field1151;

	@ObfuscatedName("ci.m")
	public final int field1152;

	@ObfuscatedName("ci.k")
	public final int field1156;

	@ObfuscatedName("ci.f")
	public final byte[] field1154;

	@ObfuscatedName("ci.w")
	public final int field1153;

	@ObfuscatedName("ci.l")
	public final int field1150;

	@ObfuscatedName("ci.u")
	public final int field1157;

	@ObfuscatedName("ci.z")
	public class69[][] field1158;

	public class90(class849 arg0, class836 arg1) {
		this.field1155 = arg0;
		this.field1151 = arg1;
		this.field1152 = (this.field1151.field1235 * this.field1151.field1233 >> this.field1155.field9874) + 2;
		this.field1156 = (this.field1151.field1234 * this.field1151.field1233 >> this.field1155.field9874) + 2;
		this.field1154 = new byte[this.field1156 * this.field1152];
		this.field1157 = this.field1155.field9874 + 7 - this.field1151.field1236;
		this.field1153 = this.field1151.field1235 >> this.field1157;
		this.field1150 = this.field1151.field1234 >> this.field1157;
	}

	@ObfuscatedName("ci.e()V")
	public void method1337() {
		this.field1158 = new class69[this.field1153][this.field1150];
		for (int var1 = 0; var1 < this.field1150; var1++) {
			for (int var2 = 0; var2 < this.field1153; var2++) {
				this.field1158[var2][var1] = new class69(this.field1155, this, this.field1151, var2, var1, this.field1157, var2 * 128 + 1, var1 * 128 + 1);
			}
		}
	}

	@ObfuscatedName("ci.n(III[[ZZ)V")
	public void method1339(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
		this.field1155.method15764(false);
		this.field1155.method15789(false);
		this.field1155.method15774(-2);
		this.field1155.method15778(1);
		this.field1155.method15791(1);
		float var6 = 1.0F / (float) (this.field1155.field9873 * 128);
		if (arg4) {
			for (int var7 = 0; var7 < this.field1150; var7++) {
				int var8 = var7 << this.field1157;
				int var9 = var7 + 1 << this.field1157;
				label128: for (int var10 = 0; var10 < this.field1153; var10++) {
					int var11 = var10 << this.field1157;
					int var12 = var10 + 1 << this.field1157;
					for (int var13 = var11; var13 < var12; var13++) {
						if (var13 - arg0 >= -arg2 && var13 - arg0 <= arg2) {
							for (int var14 = var8; var14 < var9; var14++) {
								if (var14 - arg1 >= -arg2 && var14 - arg1 <= arg2 && arg3[var13 - arg0 + arg2][var14 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(var6, var6, 1.0F);
									OpenGL.glTranslatef((float) -var10 / var6, (float) -var7 / var6, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.field1158[var10][var7].method1067();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (int var15 = 0; var15 < this.field1150; var15++) {
				int var16 = var15 << this.field1157;
				int var17 = var15 + 1 << this.field1157;
				for (int var18 = 0; var18 < this.field1153; var18++) {
					int var19 = 0;
					int var20 = var18 << this.field1157;
					int var21 = var18 + 1 << this.field1157;
					class1189 var22 = this.field1155.field10016;
					var22.field11503 = 0;
					for (int var23 = var16; var23 < var17; var23++) {
						if (var23 - arg1 >= -arg2 && var23 - arg1 <= arg2) {
							int var24 = this.field1151.field1235 * var23 + var20;
							for (int var25 = var20; var25 < var21; var25++) {
								if (var25 - arg0 >= -arg2 && var25 - arg0 <= arg2 && arg3[var25 - arg0 + arg2][var23 - arg1 + arg2]) {
									short[] var26 = this.field1151.field9460[var24];
									if (var26 != null) {
										if (this.field1155.field10017) {
											for (int var27 = 0; var27 < var26.length; var27++) {
												var22.method17945(var26[var27] & 0xFFFF);
												var19++;
											}
										} else {
											for (int var28 = 0; var28 < var26.length; var28++) {
												var22.method17884(var26[var28] & 0xFFFF);
												var19++;
											}
										}
									}
								}
								var24++;
							}
						}
					}
					if (var19 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(var6, var6, 1.0F);
						OpenGL.glTranslatef((float) -var18 / var6, (float) -var15 / var6, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.field1158[var18][var15].method1079(var22.field11502, var19);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@ObfuscatedName("ci.m(Lara;II)V")
	public void method1340(class1175 arg0, int arg1, int arg2) {
		class1222 var4 = (class1222) arg0;
		int var5 = var4.field12540 + 1 + arg1;
		int var6 = var4.field12537 + 1 + arg2;
		int var7 = this.field1152 * var6 + var5;
		int var8 = 0;
		int var9 = var4.field12541;
		int var10 = var4.field12538;
		int var11 = this.field1152 - var10;
		int var12 = 0;
		if (var6 <= 0) {
			int var13 = 1 - var6;
			var9 -= var13;
			var8 += var10 * var13;
			var7 += this.field1152 * var13;
			var6 = 1;
		}
		if (var6 + var9 >= this.field1156) {
			int var14 = var6 + var9 + 1 - this.field1156;
			var9 -= var14;
		}
		if (var5 <= 0) {
			int var15 = 1 - var5;
			var10 -= var15;
			var8 += var15;
			var7 += var15;
			var12 += var15;
			var11 += var15;
			var5 = 1;
		}
		if (var5 + var10 >= this.field1152) {
			int var16 = var5 + var10 + 1 - this.field1152;
			var10 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var10 > 0 && var9 > 0) {
			method1344(this.field1154, var4.field12542, var8, var7, var10, var9, var11, var12);
			this.method1343(var5, var6, var10, var9);
		}
	}

	@ObfuscatedName("ci.k(Lara;II)V")
	public void method1341(class1175 arg0, int arg1, int arg2) {
		class1222 var4 = (class1222) arg0;
		int var5 = var4.field12540 + 1 + arg1;
		int var6 = var4.field12537 + 1 + arg2;
		int var7 = this.field1152 * var6 + var5;
		int var8 = 0;
		int var9 = var4.field12541;
		int var10 = var4.field12538;
		int var11 = this.field1152 - var10;
		int var12 = 0;
		if (var6 <= 0) {
			int var13 = 1 - var6;
			var9 -= var13;
			var8 += var10 * var13;
			var7 += this.field1152 * var13;
			var6 = 1;
		}
		if (var6 + var9 >= this.field1156) {
			int var14 = var6 + var9 + 1 - this.field1156;
			var9 -= var14;
		}
		if (var5 <= 0) {
			int var15 = 1 - var5;
			var10 -= var15;
			var8 += var15;
			var7 += var15;
			var12 += var15;
			var11 += var15;
			var5 = 1;
		}
		if (var5 + var10 >= this.field1152) {
			int var16 = var5 + var10 + 1 - this.field1152;
			var10 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var10 > 0 && var9 > 0) {
			method1345(this.field1154, var4.field12542, var8, var7, var10, var9, var11, var12);
			this.method1343(var5, var6, var10, var9);
		}
	}

	@ObfuscatedName("ci.f(Lara;II)Z")
	public boolean method1349(class1175 arg0, int arg1, int arg2) {
		class1222 var4 = (class1222) arg0;
		int var5 = var4.field12540 + 1 + arg1;
		int var6 = var4.field12537 + 1 + arg2;
		int var7 = this.field1152 * var6 + var5;
		int var8 = var4.field12541;
		int var9 = var4.field12538;
		int var10 = this.field1152 - var9;
		if (var6 <= 0) {
			int var11 = 1 - var6;
			var8 -= var11;
			var7 += this.field1152 * var11;
			var6 = 1;
		}
		if (var6 + var8 >= this.field1156) {
			int var12 = var6 + var8 + 1 - this.field1156;
			var8 -= var12;
		}
		if (var5 <= 0) {
			int var13 = 1 - var5;
			var9 -= var13;
			var7 += var13;
			var10 += var13;
			var5 = 1;
		}
		if (var5 + var9 >= this.field1152) {
			int var14 = var5 + var9 + 1 - this.field1152;
			var9 -= var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			byte var15 = 8;
			int var16 = (var15 - 1) * this.field1152 + var10;
			return method1346(this.field1154, var7, var9, var8, var16, var15);
		} else {
			return false;
		}
	}

	@ObfuscatedName("ci.w(IIII)V")
	public void method1343(int arg0, int arg1, int arg2, int arg3) {
		if (this.field1158 == null) {
			return;
		}
		int var5 = arg0 - 1 >> 7;
		int var6 = arg0 - 1 + arg2 - 1 >> 7;
		int var7 = arg1 - 1 >> 7;
		int var8 = arg1 - 1 + arg3 - 1 >> 7;
		for (int var9 = var5; var9 <= var6; var9++) {
			class69[] var10 = this.field1158[var9];
			for (int var11 = var7; var11 <= var8; var11++) {
				var10[var11].field988 = true;
			}
		}
	}

	@ObfuscatedName("ci.l([B[BIIIIII)V")
	public static final void method1344(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var9 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			int var10001;
			for (int var11 = var8; var11 < 0; var11++) {
				var10001 = arg3++;
				arg0[var10001] += arg1[arg2++];
				int var13 = arg3++;
				arg0[var13] += arg1[arg2++];
				int var14 = arg3++;
				arg0[var14] += arg1[arg2++];
				int var15 = arg3++;
				arg0[var15] += arg1[arg2++];
			}
			for (int var12 = var9; var12 < 0; var12++) {
				var10001 = arg3++;
				arg0[var10001] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("ci.u([B[BIIIIII)V")
	public static final void method1345(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var9 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			int var10001;
			for (int var11 = var8; var11 < 0; var11++) {
				var10001 = arg3++;
				arg0[var10001] -= arg1[arg2++];
				int var13 = arg3++;
				arg0[var13] -= arg1[arg2++];
				int var14 = arg3++;
				arg0[var14] -= arg1[arg2++];
				int var15 = arg3++;
				arg0[var15] -= arg1[arg2++];
			}
			for (int var12 = var9; var12 < 0; var12++) {
				var10001 = arg3++;
				arg0[var10001] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("ci.z([BIIIII)Z")
	public static final boolean method1346(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg2 % arg5;
		int var7;
		if (var6 == 0) {
			var7 = 0;
		} else {
			var7 = arg5 - var6;
		}
		int var8 = -((arg3 + arg5 - 1) / arg5);
		int var9 = -((arg2 + arg5 - 1) / arg5);
		for (int var10 = var8; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			int var12 = arg1 - var7;
			if (arg0[var12 - 1] == 0) {
				return true;
			}
			arg1 = arg4 + var12;
		}
		return false;
	}
}

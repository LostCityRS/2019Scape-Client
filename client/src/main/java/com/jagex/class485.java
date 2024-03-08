package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("rj")
public abstract class class485 implements class356 {

	@ObfuscatedName("rj.f")
	public final class1127 field4980;

	@ObfuscatedName("rj.w")
	public int field4974;

	@ObfuscatedName("rj.l")
	public final int field4979;

	@ObfuscatedName("rj.u")
	public final class109 field4973;

	@ObfuscatedName("rj.z")
	public final class135 field4977;

	@ObfuscatedName("rj.p")
	public boolean field4982;

	@ObfuscatedName("rj.d")
	public class343 field4983 = class343.field3323;

	@ObfuscatedName("rj.c")
	public final int field4984;

	@ObfuscatedName("rj.r")
	public static final int[] field4985 = new int[1];

	public class485(class1127 arg0, int arg1, class109 arg2, class135 arg3, int arg4, boolean arg5) {
		this.field4980 = arg0;
		this.field4979 = arg1;
		this.field4973 = arg2;
		this.field4977 = arg3;
		this.field4982 = arg5;
		this.field4984 = arg4;
		OpenGL.glGenTextures(1, field4985, 0);
		this.field4974 = field4985[0];
		this.method7633();
		this.method7648(0);
	}

	@ObfuscatedName("rj.aj()V")
	public void method5823() {
		if (this.field4974 == 0) {
			throw new IllegalStateException("");
		}
		int var1 = this.field4980.method16037();
		int var2 = this.field4980.field12014[var1];
		if (this.field4979 != var2) {
			if (var2 != 0) {
				OpenGL.glBindTexture(var2, 0);
				OpenGL.glDisable(var2);
			}
			OpenGL.glEnable(this.field4979);
			this.field4980.field12014[var1] = this.field4979;
		}
		OpenGL.glBindTexture(this.field4979, this.field4974);
	}

	@ObfuscatedName("rj.ay(Llt;)V")
	public void method5824(class343 arg0) {
		if (this.field4983 != arg0) {
			this.field4983 = arg0;
			this.method7633();
		}
	}

	@ObfuscatedName("rj.bl()V")
	public void method7633() {
		if (this.field4974 == 0) {
			throw new IllegalStateException("");
		}
		this.field4980.method16092(this);
		if (class343.field3323 == this.field4983) {
			OpenGL.glTexParameteri(this.field4979, 10241, this.field4982 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.field4979, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.field4979, 10241, this.field4982 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.field4979, 10240, 9728);
		}
	}

	@ObfuscatedName("rj.s()Z")
	public boolean method5708() {
		if (this.field4974 == 0) {
			throw new IllegalStateException("");
		}
		int var1 = this.method7637();
		this.field4980.method16092(this);
		if (this.field4980.field12016) {
			OpenGL.glEnable(this.field4979);
		}
		OpenGL.glGenerateMipmapEXT(this.field4979);
		if (this.field4980.field12016) {
			OpenGL.glDisable(this.field4979);
		}
		this.field4982 = true;
		this.method7633();
		this.method7648(var1);
		return true;
	}

	@ObfuscatedName("rj.bk(III[I)V")
	public void method7638(int arg0, int arg1, int arg2, int[] arg3) {
		if (this.field4974 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !class783.method4918(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !class783.method4918(arg2)) {
			throw new IllegalArgumentException("");
		} else if (class109.field1273 == this.field4973) {
			int var5 = 0;
			int var6 = arg1 < arg2 ? arg1 : arg2;
			int var7 = arg1 >> 1;
			int var8 = arg2 >> 1;
			int[] var9 = arg3;
			int[] var10 = new int[var7 * var8];
			while (true) {
				OpenGL.glTexImage2Di(arg0, var5, class1127.method19077(this.field4973, this.field4977), arg1, arg2, 0, 32993, this.field4980.field12027, var9, 0);
				if (var6 <= 1) {
					return;
				}
				int var11 = 0;
				int var12 = 0;
				int var13 = arg1 + var12;
				for (int var14 = 0; var14 < var8; var14++) {
					for (int var15 = 0; var15 < var7; var15++) {
						int var16 = var9[var12++];
						int var17 = var9[var12++];
						int var18 = var9[var13++];
						int var19 = var9[var13++];
						int var20 = var16 >> 24 & 0xFF;
						int var21 = var16 >> 16 & 0xFF;
						int var22 = var16 >> 8 & 0xFF;
						int var23 = var16 & 0xFF;
						int var24 = (var17 >> 24 & 0xFF) + var20;
						int var25 = (var17 >> 16 & 0xFF) + var21;
						int var26 = (var17 >> 8 & 0xFF) + var22;
						int var27 = (var17 & 0xFF) + var23;
						int var28 = (var18 >> 24 & 0xFF) + var24;
						int var29 = (var18 >> 16 & 0xFF) + var25;
						int var30 = (var18 >> 8 & 0xFF) + var26;
						int var31 = (var18 & 0xFF) + var27;
						int var32 = (var19 >> 24 & 0xFF) + var28;
						int var33 = (var19 >> 16 & 0xFF) + var29;
						int var34 = (var19 >> 8 & 0xFF) + var30;
						int var35 = (var19 & 0xFF) + var31;
						var10[var11++] = (var32 & 0x3FC) << 22 | (var33 & 0x3FC) << 14 | (var34 & 0x3FC) << 6 | var35 >> 2 & 0xFF;
					}
					var12 += arg1;
					var13 += arg1;
				}
				int[] var36 = var10;
				var10 = var9;
				var9 = var36;
				arg1 = var7;
				arg2 = var8;
				var7 >>= 0x1;
				var8 >>= 0x1;
				var6 >>= 0x1;
				var5++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("rj.bh(III[B)V")
	public void method7634(int arg0, int arg1, int arg2, byte[] arg3) {
		if (this.field4974 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !class783.method4918(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || class783.method4918(arg2)) {
			int var5 = this.field4973.field1279;
			int var6 = 0;
			int var7 = arg1 < arg2 ? arg1 : arg2;
			int var8 = arg1 >> 1;
			int var9 = arg2 >> 1;
			byte[] var10 = arg3;
			byte[] var11 = new byte[var8 * var9 * var5];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, var6, class1127.method19077(this.field4973, this.field4977), arg1, arg2, 0, class1127.method19085(this.field4973), 5121, var10, 0);
				if (var7 <= 1) {
					return;
				}
				int var12 = arg1 * var5;
				for (int var13 = 0; var13 < var5; var13++) {
					int var14 = var13;
					int var15 = var13;
					int var16 = var12 + var13;
					for (int var17 = 0; var17 < var9; var17++) {
						for (int var18 = 0; var18 < var8; var18++) {
							byte var19 = var10[var15];
							int var20 = var5 + var15;
							int var21 = var10[var20] + var19;
							var15 = var5 + var20;
							int var22 = var10[var16] + var21;
							int var23 = var5 + var16;
							int var24 = var10[var23] + var22;
							var16 = var5 + var23;
							var11[var14] = (byte) (var24 >> 2);
							var14 += var5;
						}
						var15 += var12;
						var16 += var12;
					}
				}
				byte[] var25 = var11;
				var11 = var10;
				var10 = var25;
				arg1 = var8;
				arg2 = var9;
				var8 >>= 0x1;
				var9 >>= 0x1;
				var7 >>= 0x1;
				var6++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("rj.bx(III[F)V")
	public void method7635(int arg0, int arg1, int arg2, float[] arg3) {
		if (this.field4974 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !class783.method4918(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || class783.method4918(arg2)) {
			int var5 = this.field4973.field1279;
			int var6 = 0;
			int var7 = arg1 < arg2 ? arg1 : arg2;
			int var8 = arg1 >> 1;
			int var9 = arg2 >> 1;
			float[] var10 = arg3;
			float[] var11 = new float[var8 * var9 * var5];
			while (true) {
				OpenGL.glTexImage2Df(arg0, var6, class1127.method19077(this.field4973, this.field4977), arg1, arg2, 0, class1127.method19085(this.field4973), 5126, var10, 0);
				if (var7 <= 1) {
					return;
				}
				int var12 = arg1 * var5;
				for (int var13 = 0; var13 < var5; var13++) {
					int var14 = var13;
					int var15 = var13;
					int var16 = var12 + var13;
					for (int var17 = 0; var17 < var9; var17++) {
						for (int var18 = 0; var18 < var8; var18++) {
							float var19 = var10[var15];
							int var20 = var5 + var15;
							float var21 = var10[var20] + var19;
							var15 = var5 + var20;
							float var22 = var10[var16] + var21;
							int var23 = var5 + var16;
							float var24 = var10[var23] + var22;
							var16 = var5 + var23;
							var11[var14] = var24 * 0.25F;
							var14 += var5;
						}
						var15 += var12;
						var16 += var12;
					}
				}
				float[] var25 = var11;
				var11 = var10;
				var10 = var25;
				arg1 = var8;
				arg2 = var9;
				var8 >>= 0x1;
				var9 >>= 0x1;
				var7 >>= 0x1;
				var6++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("rj.bd(I)V")
	public void method7648(int arg0) {
		this.field4980.field10052 -= arg0;
		this.field4980.field10052 += this.method7637();
	}

	@ObfuscatedName("rj.bc()I")
	public int method7637() {
		int var1 = this.field4977.field1652 * this.field4973.field1279 * this.field4984;
		return this.field4982 ? var1 * 4 / 3 : var1;
	}

	@ObfuscatedName("rj.m()V")
	public void method1010() {
		if (this.field4974 != 0) {
			this.field4980.field10052 -= this.method7637();
			int[] var1 = new int[] { this.field4974 };
			OpenGL.glDeleteTextures(1, var1, 0);
			this.field4974 = 0;
		}
	}

	@ObfuscatedName("rj.bi()V")
	public void method7641() {
		if (this.field4974 != 0) {
			this.field4980.method19073(this.field4974, this.method7637());
			this.field4974 = 0;
		}
	}

	public void finalize() throws Throwable {
		this.method7641();
		super.finalize();
	}
}

package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("asj")
public class class1195 extends class1001 {

	@ObfuscatedName("asj.o")
	public short[] field12437;

	@ObfuscatedName("asj.s")
	public short[] field12432;

	@ObfuscatedName("asj.y")
	public byte[] field12439 = new byte[512];

	@ObfuscatedName("asj.q")
	public int field12444 = 0;

	@ObfuscatedName("asj.x")
	public int field12441 = 4;

	@ObfuscatedName("asj.b")
	public int field12440 = 4;

	@ObfuscatedName("asj.h")
	public int field12443 = 4;

	@ObfuscatedName("asj.a")
	public int field12445 = 1638;

	@ObfuscatedName("asj.g")
	public boolean field12438 = true;

	public class1195() {
		super(0, true);
	}

	@ObfuscatedName("asj.e(I[II)V")
	public void method19594(int arg0, int[] arg1) {
		int var3 = this.field12440 * Statics.field9128[arg0];
		if (this.field12443 == 1) {
			short var4 = this.field12437[0];
			int var5 = this.field12432[0] << 12;
			int var6 = this.field12440 * var5 >> 12;
			int var7 = this.field12441 * var5 >> 12;
			int var8 = var3 * var5 >> 12;
			int var9 = var8 >> 12;
			int var10 = var9 + 1;
			if (var10 >= var6) {
				var10 = 0;
			}
			int var11 = var8 & 0xFFF;
			int var12 = class400.field4199[var11];
			int var13 = this.field12439[var9 & 0xFF] & 0xFF;
			int var14 = this.field12439[var10 & 0xFF] & 0xFF;
			if (this.field12438) {
				for (int var15 = 0; var15 < Statics.field9125; var15++) {
					int var16 = this.field12441 * Statics.field9124[var15];
					int var17 = this.method19588(var5 * var16 >> 12, var11, var13, var14, var12, var7);
					int var18 = var4 * var17 >> 12;
					arg1[var15] = (var18 >> 1) + 2048;
				}
			} else {
				for (int var19 = 0; var19 < Statics.field9125; var19++) {
					int var20 = this.field12441 * Statics.field9124[var19];
					int var21 = this.method19588(var5 * var20 >> 12, var11, var13, var14, var12, var7);
					arg1[var19] = var4 * var21 >> 12;
				}
			}
			return;
		}
		short var22 = this.field12437[0];
		if (var22 > 8 || var22 < -8) {
			int var23 = this.field12432[0] << 12;
			int var24 = this.field12440 * var23 >> 12;
			int var25 = this.field12441 * var23 >> 12;
			int var26 = var3 * var23 >> 12;
			int var27 = var26 >> 12;
			int var28 = var27 + 1;
			if (var28 >= var24) {
				var28 = 0;
			}
			int var29 = var26 & 0xFFF;
			int var30 = class400.field4199[var29];
			int var31 = this.field12439[var27 & 0xFF] & 0xFF;
			int var32 = this.field12439[var28 & 0xFF] & 0xFF;
			for (int var33 = 0; var33 < Statics.field9125; var33++) {
				int var34 = this.field12441 * Statics.field9124[var33];
				int var35 = this.method19588(var23 * var34 >> 12, var29, var31, var32, var30, var25);
				arg1[var33] = var22 * var35 >> 12;
			}
		}
		for (int var36 = 1; var36 < this.field12443; var36++) {
			short var37 = this.field12437[var36];
			if (var37 > 8 || var37 < -8) {
				int var38 = this.field12432[var36] << 12;
				int var39 = this.field12440 * var38 >> 12;
				int var40 = this.field12441 * var38 >> 12;
				int var41 = var3 * var38 >> 12;
				int var42 = var41 >> 12;
				int var43 = var42 + 1;
				if (var43 >= var39) {
					var43 = 0;
				}
				int var44 = var41 & 0xFFF;
				int var45 = class400.field4199[var44];
				int var46 = this.field12439[var42 & 0xFF] & 0xFF;
				int var47 = this.field12439[var43 & 0xFF] & 0xFF;
				if (this.field12438 && this.field12443 - 1 == var36) {
					for (int var48 = 0; var48 < Statics.field9125; var48++) {
						int var49 = this.field12441 * Statics.field9124[var48];
						int var50 = this.method19588(var38 * var49 >> 12, var44, var46, var47, var45, var40);
						int var51 = (var37 * var50 >> 12) + arg1[var48];
						arg1[var48] = (var51 >> 1) + 2048;
					}
				} else {
					for (int var52 = 0; var52 < Statics.field9125; var52++) {
						int var53 = this.field12441 * Statics.field9124[var52];
						int var54 = this.method19588(var38 * var53 >> 12, var44, var46, var47, var45, var40);
						arg1[var52] += var37 * var54 >> 12;
					}
				}
			}
		}
	}

	@ObfuscatedName("asj.n(IIIIIIS)I")
	public int method19588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg0 >> 12;
		int var8 = var7 + 1;
		if (var8 >= arg5) {
			var8 = 0;
		}
		int var9 = arg0 & 0xFFF;
		int var10 = var7 & 0xFF;
		int var11 = var8 & 0xFF;
		int var12 = var9 - 4096;
		int var13 = arg1 - 4096;
		int var14 = class400.field4199[var9];
		int var15 = this.field12439[arg2 + var10] & 0x3;
		int var16;
		if (var15 <= 1) {
			var16 = var15 == 0 ? arg1 + var9 : arg1 - var9;
		} else {
			var16 = var15 == 2 ? var9 - arg1 : -var9 - arg1;
		}
		int var17 = this.field12439[arg2 + var11] & 0x3;
		int var18;
		if (var17 <= 1) {
			var18 = var17 == 0 ? arg1 + var12 : arg1 - var12;
		} else {
			var18 = var17 == 2 ? var12 - arg1 : -var12 - arg1;
		}
		int var19 = ((var18 - var16) * var14 >> 12) + var16;
		int var20 = this.field12439[arg3 + var10] & 0x3;
		int var21;
		if (var20 <= 1) {
			var21 = var20 == 0 ? var9 + var13 : var13 - var9;
		} else {
			var21 = var20 == 2 ? var9 - var13 : -var9 - var13;
		}
		int var22 = this.field12439[arg3 + var11] & 0x3;
		int var23;
		if (var22 <= 1) {
			var23 = var22 == 0 ? var12 + var13 : var13 - var12;
		} else {
			var23 = var22 == 2 ? var12 - var13 : -var12 - var13;
		}
		int var24 = ((var23 - var21) * var14 >> 12) + var21;
		return ((var24 - var19) * arg4 >> 12) + var19;
	}

	@ObfuscatedName("asj.m(I)V")
	public void method19589() {
		this.field12439 = class777.method15027(this.field12444);
		this.method19593();
		for (int var1 = this.field12443 - 1; var1 >= 1; var1--) {
			short var2 = this.field12437[var1];
			if (var2 > 8 || var2 < -8) {
				break;
			}
			this.field12443--;
		}
	}

	@ObfuscatedName("asj.k(I)V")
	public void method19593() {
		if (this.field12445 > 0) {
			this.field12437 = new short[this.field12443];
			this.field12432 = new short[this.field12443];
			for (int var1 = 0; var1 < this.field12443; var1++) {
				this.field12437[var1] = (short) (Math.pow((double) ((float) this.field12445 / 4096.0F), (double) var1) * 4096.0D);
				this.field12432[var1] = (short) Math.pow(2.0D, (double) var1);
			}
		} else if (this.field12437 != null && this.field12443 == this.field12437.length) {
			this.field12432 = new short[this.field12443];
			for (int var2 = 0; var2 < this.field12443; var2++) {
				this.field12432[var2] = (short) Math.pow(2.0D, (double) var2);
			}
		}
	}

	@ObfuscatedName("ahx.f(IIIIIFZI)[I")
	public static int[] method16661(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, boolean arg6) {
		int[] var7 = new int[arg0];
		class1195 var8 = new class1195();
		var8.field12444 = arg1;
		var8.field12438 = arg6;
		var8.field12441 = arg2;
		var8.field12440 = arg3;
		var8.field12443 = arg4;
		var8.field12445 = (int) (arg5 * 4096.0F);
		var8.method19589();
		class777.method15026(arg0, 1);
		var8.method19594(0, var7);
		return var7;
	}

	@ObfuscatedName("aw.w(IIIIIIFZI)[[I")
	public static int[][] method749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, boolean arg7) {
		int[][] var8 = new int[arg1][arg0];
		class1195 var9 = new class1195();
		var9.field12438 = arg7;
		var9.field12441 = arg3;
		var9.field12440 = arg4;
		var9.field12443 = arg5;
		var9.field12445 = (int) (arg6 * 4096.0F);
		var9.method19589();
		class777.method15026(arg0, arg1);
		for (int var10 = 0; var10 < arg1; var10++) {
			var9.method19594(var10, var8[var10]);
		}
		return var8;
	}
}

package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afd")
public class class855 extends class140 {

	@ObfuscatedName("afd.o")
	public class848 field10236;

	@ObfuscatedName("afd.s")
	public byte[][] field10237;

	@ObfuscatedName("afd.y")
	public int[] field10235;

	public class855(class848 arg0, class733 arg1, class852 arg2) {
		super(arg0, arg1);
		this.field10236 = arg0;
		this.field10237 = new byte[256][];
		for (int var4 = 0; var4 < 256; var4++) {
			int var5 = this.field1667.method14558(var4);
			int var6 = this.field1667.method14529(var4);
			short[] var7 = this.field1667.method14561(var4);
			short var8 = var7[0];
			short var9 = var7[1];
			byte[] var10 = new byte[var5 * var6];
			for (int var11 = 0; var11 < var6; var11++) {
				for (int var12 = 0; var12 < var5; var12++) {
					var10[var5 * var11 + var12] = arg2.field10227[this.field1667.field8570 * var12 + this.field1667.field8571 * (this.field1667.field8570 * var11 + var9) + var8];
				}
			}
			this.field10237[var4] = var10;
		}
		this.field10235 = arg2.field10226;
	}

	@ObfuscatedName("afd.s(CIIIZ)V")
	public void method2690(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.field10236.field9778 == null) {
			return;
		}
		int var6 = arg2 + this.field1667.method14560(arg0);
		int var7 = this.field1667.method14558(arg0);
		int var8 = this.field1667.method14529(arg0);
		int var9 = this.field10236.field9779;
		int var10 = var6 * var9 + arg1;
		int var11 = var9 - var7;
		int var12 = 0;
		int var13 = 0;
		if (var6 < this.field10236.field9784) {
			int var14 = this.field10236.field9784 - var6;
			var8 -= var14;
			var6 = this.field10236.field9784;
			var13 += var7 * var14;
			var10 += var9 * var14;
		}
		if (var6 + var8 > this.field10236.field9785) {
			var8 -= var6 + var8 - this.field10236.field9785;
		}
		if (arg1 < this.field10236.field9805) {
			int var15 = this.field10236.field9805 - arg1;
			var7 -= var15;
			arg1 = this.field10236.field9805;
			var13 += var15;
			var10 += var15;
			var12 += var15;
			var11 += var15;
		}
		if (arg1 + var7 > this.field10236.field9801) {
			int var16 = arg1 + var7 - this.field10236.field9801;
			var7 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var7 <= 0 || var8 <= 0) {
			return;
		}
		if (arg4) {
			this.method16380(this.field10237[arg0], this.field10236.field9778, arg3, var13, var10, var7, var8, var11, var12);
		} else {
			this.method16383(this.field10237[arg0], this.field10236.field9778, this.field10235, var13, var10, var7, var8, var11, var12);
		}
	}

	@ObfuscatedName("afd.bl([B[I[IIIIIII)V")
	public void method16383(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		boolean var12 = false;
		for (int var13 = -arg6; var13 < 0; var13++) {
			for (int var14 = var10; var14 < 0; var14++) {
				byte var15;
				if ((var15 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var15 & 0xFF];
				}
				byte var16;
				if ((var16 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var16 & 0xFF];
				}
				byte var17;
				if ((var17 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var17 & 0xFF];
				}
				byte var18;
				if ((var18 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var18 & 0xFF];
				}
			}
			for (int var19 = var11; var19 < 0; var19++) {
				byte var20;
				if ((var20 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var20 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("afd.bk([B[IIIIIIII)V")
	public void method16380(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (int var14 = var11; var14 < 0; var14++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("afd.y(CIIIZLch;II)V")
	public void method2697(char arg0, int arg1, int arg2, int arg3, boolean arg4, class103 arg5, int arg6, int arg7) {
		if (this.field10236.field9778 == null) {
			return;
		}
		if (arg5 == null) {
			this.method2690(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		int var9 = arg2 + this.field1667.method14560(arg0);
		int var10 = this.field1667.method14558(arg0);
		int var11 = this.field1667.method14529(arg0);
		int var12 = this.field10236.field9779;
		int var13 = var9 * var12 + arg1;
		int var14 = var12 - var10;
		int var15 = 0;
		int var16 = 0;
		if (var9 < this.field10236.field9784) {
			int var17 = this.field10236.field9784 - var9;
			var11 -= var17;
			var9 = this.field10236.field9784;
			var16 += var10 * var17;
			var13 += var12 * var17;
		}
		if (var9 + var11 > this.field10236.field9785) {
			var11 -= var9 + var11 - this.field10236.field9785;
		}
		if (arg1 < this.field10236.field9805) {
			int var18 = this.field10236.field9805 - arg1;
			var10 -= var18;
			arg1 = this.field10236.field9805;
			var16 += var18;
			var13 += var18;
			var15 += var18;
			var14 += var18;
		}
		if (arg1 + var10 > this.field10236.field9801) {
			int var19 = arg1 + var10 - this.field10236.field9801;
			var10 -= var19;
			var15 += var19;
			var14 += var19;
		}
		if (var10 <= 0 || var11 <= 0) {
			return;
		}
		if (arg4) {
			this.method16379(this.field10237[arg0], this.field10236.field9778, arg3, var16, var13, var10, var11, var14, var15, arg1, var9, this.field1667.method14558(arg0), arg5, arg6, arg7);
		} else {
			this.method16385(this.field10237[arg0], this.field10236.field9778, this.field10235, arg3, var16, var13, var10, var11, var14, var15, arg1, var9, this.field1667.method14558(arg0), arg5, arg6, arg7);
		}
	}

	@ObfuscatedName("afd.bh([B[I[IIIIIIIIIIILch;II)V")
	public void method16385(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class103 arg13, int arg14, int arg15) {
		class832 var17 = (class832) arg13;
		int[] var18 = var17.field9414;
		int[] var19 = var17.field9415;
		int var20 = arg10 - this.field10236.field9805;
		int var21 = arg11;
		if (arg15 > arg11) {
			var21 = arg15;
			arg5 += this.field10236.field9779 * (arg15 - arg11);
			arg4 += (arg15 - arg11) * arg12;
		}
		int var22 = var18.length + arg15 < arg7 + arg11 ? var18.length + arg15 : arg7 + arg11;
		boolean var23 = false;
		for (int var24 = var21; var24 < var22; var24++) {
			int var25 = var18[var24 - arg15] + arg14;
			int var26 = var19[var24 - arg15];
			int var27 = arg6;
			if (var20 > var25) {
				int var28 = var20 - var25;
				if (var28 >= var26) {
					arg4 += arg6 + arg9;
					arg5 += arg6 + arg8;
					continue;
				}
				var26 -= var28;
			} else {
				int var29 = var25 - var20;
				if (var29 >= arg6) {
					arg4 += arg6 + arg9;
					arg5 += arg6 + arg8;
					continue;
				}
				arg4 += var29;
				var27 = arg6 - var29;
				arg5 += var29;
			}
			int var30 = 0;
			if (var27 < var26) {
				var26 = var27;
			} else {
				var30 = var27 - var26;
			}
			for (int var31 = -var26; var31 < 0; var31++) {
				byte var32;
				if ((var32 = arg0[arg4++]) == 0) {
					arg5++;
				} else {
					arg1[arg5++] = arg2[var32 & 0xFF];
				}
			}
			arg4 += arg9 + var30;
			arg5 += arg8 + var30;
		}
	}

	@ObfuscatedName("afd.bx([B[IIIIIIIIIIILch;II)V")
	public void method16379(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class103 arg12, int arg13, int arg14) {
		class832 var16 = (class832) arg12;
		int[] var17 = var16.field9414;
		int[] var18 = var16.field9415;
		int var19 = arg9 - this.field10236.field9805;
		int var20 = arg10;
		if (arg14 > arg10) {
			var20 = arg14;
			arg4 += this.field10236.field9779 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		int var21 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
		for (int var22 = var20; var22 < var21; var22++) {
			int var23 = var17[var22 - arg14] + arg13;
			int var24 = var18[var22 - arg14];
			int var25 = arg5;
			if (var19 > var23) {
				int var26 = var19 - var23;
				if (var26 >= var24) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				var24 -= var26;
			} else {
				int var27 = var23 - var19;
				if (var27 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += var27;
				var25 = arg5 - var27;
				arg4 += var27;
			}
			int var28 = 0;
			if (var25 < var24) {
				var24 = var25;
			} else {
				var28 = var25 - var24;
			}
			for (int var29 = -var24; var29 < 0; var29++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += arg3 + var28;
			arg4 += arg7 + var28;
		}
	}
}

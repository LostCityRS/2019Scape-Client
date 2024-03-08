package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afw")
public class class854 extends class140 {

	@ObfuscatedName("afw.o")
	public class848 field10234;

	@ObfuscatedName("afw.s")
	public byte[][] field10233;

	public class854(class848 arg0, class733 arg1, class852 arg2) {
		super(arg0, arg1);
		this.field10234 = arg0;
		this.field10233 = new byte[256][];
		for (int var4 = 0; var4 < 256; var4++) {
			int var5 = this.field1667.method14558(var4);
			int var6 = this.field1667.method14529(var4);
			short[] var7 = this.field1667.method14561(var4);
			short var8 = var7[0];
			short var9 = var7[1];
			byte[] var10 = new byte[var5 * var6];
			if (arg2.field10228 == null) {
				for (int var13 = 0; var13 < var6; var13++) {
					for (int var14 = 0; var14 < var5; var14++) {
						var10[var5 * var13 + var14] = (byte) (arg2.field10227[this.field1667.field8570 * var14 + this.field1667.field8571 * (this.field1667.field8570 * var13 + var9) + var8] == 0 ? 0 : -1);
					}
				}
			} else {
				for (int var11 = 0; var11 < var6; var11++) {
					for (int var12 = 0; var12 < var5; var12++) {
						var10[var5 * var11 + var12] = arg2.field10228[this.field1667.field8570 * var12 + this.field1667.field8571 * (this.field1667.field8570 * var11 + var9) + var8];
					}
				}
			}
			this.field10233[var4] = var10;
		}
	}

	public class854(class848 arg0, class733 arg1, class851 arg2) {
		super(arg0, arg1);
		this.field10234 = arg0;
		int[] var4 = arg2.method2604(false);
		this.field10233 = new byte[256][];
		for (int var5 = 0; var5 < 256; var5++) {
			int var6 = this.field1667.method14558(var5);
			int var7 = this.field1667.method14529(var5);
			short[] var8 = this.field1667.method14561(var5);
			short var9 = var8[0];
			short var10 = var8[1];
			byte[] var11 = new byte[var6 * var7];
			for (int var12 = 0; var12 < var7; var12++) {
				for (int var13 = 0; var13 < var6; var13++) {
					var11[var6 * var12 + var13] = (byte) (var4[this.field1667.field8570 * var13 + this.field1667.field8571 * (this.field1667.field8570 * var12 + var10) + var9] >> 24 & 0xFF);
				}
			}
			this.field10233[var5] = var11;
		}
	}

	@ObfuscatedName("afw.s(CIIIZ)V")
	public void method2690(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.field10234.field9778 == null) {
			return;
		}
		int var6 = arg2 + this.field1667.method14560(arg0);
		int var7 = this.field1667.method14558(arg0);
		int var8 = this.field1667.method14529(arg0);
		int var9 = this.field10234.field9779;
		int var10 = var6 * var9 + arg1;
		int var11 = var9 - var7;
		int var12 = 0;
		int var13 = 0;
		if (var6 < this.field10234.field9784) {
			int var14 = this.field10234.field9784 - var6;
			var8 -= var14;
			var6 = this.field10234.field9784;
			var13 += var7 * var14;
			var10 += var9 * var14;
		}
		if (var6 + var8 > this.field10234.field9785) {
			var8 -= var6 + var8 - this.field10234.field9785;
		}
		if (arg1 < this.field10234.field9805) {
			int var15 = this.field10234.field9805 - arg1;
			var7 -= var15;
			arg1 = this.field10234.field9805;
			var13 += var15;
			var10 += var15;
			var12 += var15;
			var11 += var15;
		}
		if (arg1 + var7 > this.field10234.field9801) {
			int var16 = arg1 + var7 - this.field10234.field9801;
			var7 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var7 > 0 && var8 > 0) {
			this.method16370(this.field10233[arg0], this.field10234.field9778, arg3, var13, var10, var7, var8, var11, var12);
		}
	}

	@ObfuscatedName("afw.bl([B[IIIIIIII)V")
	public void method16370(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = -arg5; var11 < 0; var11++) {
				int var12 = arg0[arg3++] & 0xFF;
				if (var12 == 0) {
					arg4++;
				} else {
					int var13 = ((arg2 & 0xFF00) * var12 & 0xFF0000) + ((arg2 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
					int var14 = 256 - var12;
					int var15 = arg1[arg4];
					arg1[arg4++] = (((var15 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var14 & 0xFF00FF00) >> 8) + var13;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("afw.y(CIIIZLch;II)V")
	public void method2697(char arg0, int arg1, int arg2, int arg3, boolean arg4, class103 arg5, int arg6, int arg7) {
		if (this.field10234.field9778 == null) {
			return;
		}
		if (arg5 == null) {
			this.method2690(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		int var9 = arg2 + this.field1667.method14560(arg0);
		int var10 = this.field1667.method14558(arg0);
		int var11 = this.field1667.method14529(arg0);
		int var12 = this.field10234.field9779;
		int var13 = var9 * var12 + arg1;
		int var14 = var12 - var10;
		int var15 = 0;
		int var16 = 0;
		if (var9 < this.field10234.field9784) {
			int var17 = this.field10234.field9784 - var9;
			var11 -= var17;
			var9 = this.field10234.field9784;
			var16 += var10 * var17;
			var13 += var12 * var17;
		}
		if (var9 + var11 > this.field10234.field9785) {
			var11 -= var9 + var11 - this.field10234.field9785;
		}
		if (arg1 < this.field10234.field9805) {
			int var18 = this.field10234.field9805 - arg1;
			var10 -= var18;
			arg1 = this.field10234.field9805;
			var16 += var18;
			var13 += var18;
			var15 += var18;
			var14 += var18;
		}
		if (arg1 + var10 > this.field10234.field9801) {
			int var19 = arg1 + var10 - this.field10234.field9801;
			var10 -= var19;
			var15 += var19;
			var14 += var19;
		}
		if (var10 > 0 && var11 > 0) {
			this.method16369(this.field10233[arg0], this.field10234.field9778, arg3, var16, var13, var10, var11, var14, var15, arg1, var9, this.field1667.method14558(arg0), arg5, arg6, arg7);
		}
	}

	@ObfuscatedName("afw.bk([B[IIIIIIIIIIILch;II)V")
	public void method16369(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class103 arg12, int arg13, int arg14) {
		class832 var16 = (class832) arg12;
		int[] var17 = var16.field9414;
		int[] var18 = var16.field9415;
		int var19 = arg9 - this.field10234.field9805;
		int var20 = arg10;
		if (arg14 > arg10) {
			var20 = arg14;
			arg4 += this.field10234.field9779 * (arg14 - arg10);
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
				int var30 = arg0[arg3++] & 0xFF;
				if (var30 == 0) {
					arg4++;
				} else {
					int var31 = ((arg2 & 0xFF00FF) * var30 & 0xFF00FF00) + ((arg2 & 0xFF00) * var30 & 0xFF0000) >> 8;
					int var32 = 256 - var30;
					int var33 = arg1[arg4];
					arg1[arg4++] = (((var33 & 0xFF00) * var32 & 0xFF0000) + ((var33 & 0xFF00FF) * var32 & 0xFF00FF00) >> 8) + var31;
				}
			}
			arg3 += arg8 + var28;
			arg4 += arg7 + var28;
		}
	}
}

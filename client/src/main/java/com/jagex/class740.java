package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("abw")
public class class740 {

	@ObfuscatedName("abw.w")
	public int[] field8710 = new int[3];

	@ObfuscatedName("abw.l")
	public int[] field8708 = new int[3];

	@ObfuscatedName("abw.u")
	public int[] field8709 = new int[2];

	@ObfuscatedName("abw.z")
	public int[] field8713 = new int[2];

	@ObfuscatedName("abw.p")
	public short[] field8714;

	@ObfuscatedName("abw.d")
	public short[] field8715;

	public class740(class738 arg0) {
		this.field8710[0] = arg0.field8654;
		this.field8710[1] = arg0.field8636;
		this.field8710[2] = arg0.field8658;
		this.field8708[0] = arg0.field8656;
		this.field8708[1] = arg0.field8657;
		this.field8708[2] = arg0.field8659;
		this.field8709[0] = arg0.field8667;
		this.field8709[1] = arg0.field8631;
		this.field8713[0] = arg0.field8668;
		this.field8713[1] = arg0.field8669;
		if (arg0.field8622 != null) {
			this.field8714 = new short[arg0.field8622.length];
			System.arraycopy(arg0.field8622, 0, this.field8714, 0, this.field8714.length);
		}
		if (arg0.field8635 != null) {
			this.field8715 = new short[arg0.field8635.length];
			System.arraycopy(arg0.field8635, 0, this.field8715, 0, this.field8715.length);
		}
	}

	@ObfuscatedName("bc.e(Labv;Lalw;I)Labw;")
	public static class740 method1061(class738 arg0, class997 arg1) {
		return method4273(arg0, arg1, 2);
	}

	@ObfuscatedName("ho.n(Labv;Lalw;II)Labw;")
	public static class740 method4273(class738 arg0, class997 arg1, int arg2) {
		class740 var3 = new class740(arg0);
		int var4 = arg1.method17904();
		boolean var5 = (var4 & 0x1) != 0;
		boolean var6 = (var4 & 0x2) != 0;
		boolean var7 = (var4 & 0x4) != 0;
		boolean var8 = (var4 & 0x8) != 0;
		if (var5) {
			if (arg2 <= 1) {
				var3.field8710[0] = arg1.method17906();
				var3.field8708[0] = arg1.method17906();
			} else {
				var3.field8710[0] = arg1.method17927();
				var3.field8708[0] = arg1.method17927();
			}
			if (arg0.field8636 != -1 || arg0.field8657 != -1) {
				if (arg2 <= 1) {
					var3.field8710[1] = arg1.method17906();
					var3.field8708[1] = arg1.method17906();
				} else {
					var3.field8710[1] = arg1.method17927();
					var3.field8708[1] = arg1.method17927();
				}
			}
			if (arg0.field8658 != -1 || arg0.field8659 != -1) {
				if (arg2 <= 1) {
					var3.field8710[2] = arg1.method17906();
					var3.field8708[2] = arg1.method17906();
				} else {
					var3.field8710[2] = arg1.method17927();
					var3.field8708[2] = arg1.method17927();
				}
			}
		}
		if (var6) {
			if (arg2 <= 1) {
				var3.field8709[0] = arg1.method17906();
				var3.field8713[0] = arg1.method17906();
			} else {
				var3.field8709[0] = arg1.method17927();
				var3.field8713[0] = arg1.method17927();
			}
			if (arg0.field8631 != -1 || arg0.field8669 != -1) {
				if (arg2 <= 1) {
					var3.field8709[1] = arg1.method17906();
					var3.field8713[1] = arg1.method17906();
				} else {
					var3.field8709[1] = arg1.method17927();
					var3.field8713[1] = arg1.method17927();
				}
			}
		}
		if (var7) {
			int var9 = arg1.method17906();
			int[] var10 = new int[] { var9 & 0xF, var9 >> 4 & 0xF, var9 >> 8 & 0xF, var9 >> 12 & 0xF };
			for (int var11 = 0; var11 < 4; var11++) {
				if (var10[var11] != 15) {
					var3.field8714[var10[var11]] = (short) arg1.method17906();
				}
			}
		}
		if (var8) {
			int var12 = arg1.method17904();
			int[] var13 = new int[] { var12 & 0xF, var12 >> 4 & 0xF };
			for (int var14 = 0; var14 < 2; var14++) {
				if (var13[var14] != 15) {
					var3.field8715[var13[var14]] = (short) arg1.method17906();
				}
			}
		}
		return var3;
	}
}

package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ia")
public class class259 {

	@ObfuscatedName("ia.e")
	public long field2688;

	@ObfuscatedName("ia.n")
	public int[] field2689;

	@ObfuscatedName("ia.m")
	public float[] field2683;

	@ObfuscatedName("ia.k")
	public int[][] field2686;

	@ObfuscatedName("ia.f")
	public int[][] field2687;

	@ObfuscatedName("ia.w")
	public short[] field2684;

	@ObfuscatedName("ia.l")
	public short[] field2685;

	public class259(long arg0, int[] arg1, float[] arg2, int[][] arg3, int[][] arg4, short[] arg5, short[] arg6) {
		this.field2688 = arg0;
		this.field2689 = arg1;
		this.field2683 = arg2;
		this.field2686 = arg3;
		this.field2687 = arg4;
		this.field2684 = arg5;
		this.field2685 = arg6;
	}

	public class259(class260 arg0, boolean arg1) {
		if (arg1) {
			this.field2689 = new int[arg0.field2752.length];
			this.field2683 = new float[arg0.field2752.length];
			this.field2686 = new int[arg0.field2752.length][3];
			this.field2687 = new int[arg0.field2752.length][3];
			System.arraycopy(arg0.field2752, 0, this.field2689, 0, this.field2689.length);
		} else {
			this.field2689 = new int[arg0.field2701.length];
			this.field2683 = new float[arg0.field2701.length];
			this.field2686 = new int[arg0.field2701.length][3];
			this.field2687 = new int[arg0.field2701.length][3];
			System.arraycopy(arg0.field2701, 0, this.field2689, 0, this.field2689.length);
		}
		if (arg0.field2705 != null) {
			this.field2684 = new short[arg0.field2705.length];
			System.arraycopy(arg0.field2705, 0, this.field2684, 0, this.field2684.length);
		}
		if (arg0.field2708 != null) {
			this.field2685 = new short[arg0.field2708.length];
			System.arraycopy(arg0.field2708, 0, this.field2685, 0, this.field2685.length);
		}
	}

	@ObfuscatedName("ia.e(IIFIIIIIIB)V")
	public void method4528(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		this.method4530(arg0);
		this.field2689[arg0] = arg1;
		this.field2683[arg0] = arg2;
		this.field2686[arg0][0] = arg3;
		this.field2686[arg0][1] = arg4;
		this.field2686[arg0][2] = arg5;
		this.field2687[arg0][0] = arg6;
		this.field2687[arg0][1] = arg7;
		this.field2687[arg0][2] = arg8;
	}

	@ObfuscatedName("ia.n(III)V")
	public void method4529(int arg0, int arg1) {
		this.method4530(arg0);
		this.field2689[arg0] = arg1;
	}

	@ObfuscatedName("ia.m(II)V")
	public void method4530(int arg0) {
		if (arg0 < this.field2689.length) {
			return;
		}
		int[] var2 = new int[arg0 + 1];
		float[] var3 = new float[arg0 + 1];
		int[][] var4 = new int[arg0 + 1][3];
		int[][] var5 = new int[arg0 + 1][3];
		System.arraycopy(this.field2689, 0, var2, 0, this.field2689.length);
		System.arraycopy(this.field2683, 0, var3, 0, this.field2683.length);
		for (int var6 = 0; var6 < this.field2689.length; var6++) {
			System.arraycopy(this.field2686[var6], 0, var4[var6], 0, 3);
			System.arraycopy(this.field2687[var6], 0, var5[var6], 0, 3);
		}
		for (int var7 = this.field2689.length; var7 <= arg0; var7++) {
			var2[var7] = -1;
		}
		this.field2689 = var2;
		this.field2683 = var3;
		this.field2686 = var4;
		this.field2687 = var5;
	}
}

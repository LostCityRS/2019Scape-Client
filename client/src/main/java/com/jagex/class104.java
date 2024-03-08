package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("cb")
public abstract class class104 {

	@ObfuscatedName("cb.e")
	public final int field1235;

	@ObfuscatedName("cb.n")
	public final int field1234;

	@ObfuscatedName("cb.m")
	public final int field1233;

	@ObfuscatedName("cb.k")
	public final int field1236;

	@ObfuscatedName("cb.f")
	public final int[][] field1237;

	public class104(int arg0, int arg1, int arg2, int[][] arg3) {
		this.field1235 = arg0;
		this.field1234 = arg1;
		int var5 = 0;
		while (arg2 > 1) {
			var5++;
			arg2 >>= 0x1;
		}
		this.field1233 = 0x1 << var5;
		this.field1236 = var5;
		this.field1237 = arg3;
	}

	@ObfuscatedName("cb.l(III)I")
	public final int method1527(int arg0, int arg1) {
		int var3 = arg0 >> this.field1236;
		int var4 = arg1 >> this.field1236;
		if (var3 < 0 || var4 < 0 || var3 > this.field1235 - 1 || var4 > this.field1234 - 1) {
			return 0;
		}
		int var5 = arg0 & this.field1233 - 1;
		int var6 = arg1 & this.field1233 - 1;
		int var7 = (this.field1233 - var5) * this.field1237[var3][var4] + this.field1237[var3 + 1][var4] * var5 >> this.field1236;
		int var8 = (this.field1233 - var5) * this.field1237[var3][var4 + 1] + this.field1237[var3 + 1][var4 + 1] * var5 >> this.field1236;
		return (this.field1233 - var6) * var7 + var6 * var8 >> this.field1236;
	}

	@ObfuscatedName("cb.u(III)I")
	public final int method1528(int arg0, int arg1) {
		int var3 = arg0 >> this.field1236;
		int var4 = arg1 >> this.field1236;
		int var5 = Math.min(this.field1235 - 1, Math.max(0, var3));
		int var6 = Math.min(this.field1234 - 1, Math.max(0, var4));
		int var7 = Math.min(this.field1235 - 1, var5 + 1);
		int var8 = Math.min(this.field1234 - 1, var6 + 1);
		int var9 = arg0 & this.field1233 - 1;
		int var10 = arg1 & this.field1233 - 1;
		int var11 = (this.field1233 - var9) * this.field1237[var5][var6] + this.field1237[var7][var6] * var9 >> this.field1236;
		int var12 = (this.field1233 - var9) * this.field1237[var5][var8] + this.field1237[var7][var8] * var9 >> this.field1236;
		return (this.field1233 - var10) * var11 + var10 * var12 >> this.field1236;
	}

	@ObfuscatedName("cb.z(III)I")
	public final int method1529(int arg0, int arg1) {
		return this.field1237[arg0][arg1];
	}

	@ObfuscatedName("cb.p(III)I")
	public final int method1530(int arg0, int arg1) {
		return this.field1237[Math.min(this.field1235 - 1, Math.max(0, arg0))][Math.min(this.field1234 - 1, Math.max(0, arg1))];
	}

	@ObfuscatedName("cb.e(III)V")
	public abstract void method1521(int arg0, int arg1, int arg2);

	@ObfuscatedName("cb.m(II[I[I[I[I[I[I[I[I[I[I[ILdy;Z)V")
	public abstract void method1525(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, class131 arg13, boolean arg14);

	@ObfuscatedName("cb.w(IIIIIII[[Z)V")
	public abstract void method1526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

	@ObfuscatedName("cb.d(IILara;)Lara;")
	public abstract class1175 method1531(int arg0, int arg1, class1175 arg2);

	@ObfuscatedName("cb.c(Lara;IIIIZ)V")
	public abstract void method1532(class1175 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("cb.v(Lara;IIIIZ)Z")
	public abstract boolean method1535(class1175 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("cb.r(Lara;IIIIZ)V")
	public abstract void method1543(class1175 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("cb.f(III[[ZZI)V")
	public abstract void method1548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

	@ObfuscatedName("cb.o(Lakf;[I)V")
	public abstract void method1549(class973 arg0, int[] arg1);

	@ObfuscatedName("cb.k()V")
	public abstract void method1555();

	@ObfuscatedName("cb.n(II[I[I[I[I[I[I[I[ILdy;Z)V")
	public abstract void method1557(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, class131 arg10, boolean arg11);
}

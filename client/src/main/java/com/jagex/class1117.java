package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("apn")
public class class1117 extends class840 {

	@ObfuscatedName("apn.n")
	public class848 field11909;

	@ObfuscatedName("apn.m")
	public class66 field11912;

	@ObfuscatedName("apn.k")
	public class60 field11910;

	@ObfuscatedName("apn.f")
	public int field11911 = 0;

	@ObfuscatedName("apn.w")
	public int field11908 = 0;

	public class1117(class848 arg0) {
		this.field11909 = arg0;
	}

	@ObfuscatedName("apn.e()I")
	public int method1627() {
		return this.field11911;
	}

	@ObfuscatedName("apn.n()I")
	public int method1628() {
		return this.field11908;
	}

	@ObfuscatedName("apn.b(ILdp;)V")
	public void method15439(int arg0, class130 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		class60 var3 = (class60) arg1;
		if (this.field11912 != null && var3 != null && (this.field11912.field971 != var3.field893 || this.field11912.field972 != var3.field892)) {
			throw new RuntimeException();
		}
		this.field11910 = var3;
		if (var3 != null) {
			this.field11911 = var3.field893;
			this.field11908 = var3.field892;
		} else if (this.field11912 == null) {
			this.field11911 = 0;
			this.field11908 = 0;
		}
		if (this.field11909.method2135() == this) {
			this.method1630();
		}
	}

	@ObfuscatedName("apn.x(Ldw;)V")
	public void method15441(class126 arg0) {
		class66 var2 = (class66) arg0;
		if (this.field11910 != null && var2 != null && (this.field11910.field893 != var2.field971 || this.field11910.field892 != var2.field972)) {
			throw new RuntimeException();
		}
		this.field11912 = var2;
		if (var2 != null) {
			this.field11911 = var2.field971;
			this.field11908 = var2.field972;
		} else if (this.field11910 == null) {
			this.field11911 = 0;
			this.field11908 = 0;
		}
		if (this.field11909.method2135() == this) {
			this.method1630();
		}
	}

	@ObfuscatedName("apn.h()Z")
	public boolean method15446() {
		return true;
	}

	@ObfuscatedName("apn.k()Z")
	public boolean method1630() {
		this.field11909.method15662(this.field11911, this.field11908, this.field11910 == null ? null : this.field11910.field891, this.field11912 == null ? null : this.field11912.field973);
		return true;
	}

	@ObfuscatedName("apn.f()Z")
	public boolean method1631() {
		return true;
	}

	@ObfuscatedName("apn.a(IIIIIIZZ)V")
	public void method15440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		int[] var9 = null;
		int[] var10 = null;
		float[] var11 = null;
		float[] var12 = null;
		if (arg6 && this.field11910 != null) {
			var9 = this.field11910.field891;
			var10 = this.field11909.field9778;
		}
		if (arg7 && this.field11912 != null) {
			var11 = this.field11912.field973;
			var12 = this.field11909.field9781;
		}
		method6069(this.field11911, this.field11909.field9779, var9, var10, var11, var12, arg0, arg1, arg4, arg5, arg2, arg3);
	}

	@ObfuscatedName("nr.ac(II[I[I[F[FIIIIIII)V")
	public static void method6069(int arg0, int arg1, int[] arg2, int[] arg3, float[] arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		int var12 = arg0 * arg7 + arg6;
		int var13 = arg1 * arg9 + arg8;
		int var14 = arg0 - arg10;
		int var15 = arg1 - arg10;
		if (arg2 == null) {
			for (int var16 = 0; var16 < arg11; var16++) {
				int var17 = arg10 + var12;
				while (var12 < var17) {
					arg5[var13++] = arg4[var12++];
				}
				var12 += var14;
				var13 += var15;
			}
		} else if (arg4 == null) {
			for (int var18 = 0; var18 < arg11; var18++) {
				int var19 = arg10 + var12;
				while (var12 < var19) {
					arg3[var13++] = arg2[var12++];
				}
				var12 += var14;
				var13 += var15;
			}
		} else {
			for (int var20 = 0; var20 < arg11; var20++) {
				int var21 = arg10 + var12;
				while (var12 < var21) {
					arg3[var13] = arg2[var12];
					arg5[var13++] = arg4[var12++];
				}
				var12 += var14;
				var13 += var15;
			}
		}
	}

	@ObfuscatedName("apn.m()V")
	public void method1629() {
	}
}

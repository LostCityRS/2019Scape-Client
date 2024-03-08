package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("abz")
public class class750 {

	@ObfuscatedName("abz.z")
	public static boolean field8754 = false;

	@ObfuscatedName("abz.c")
	public static class1015[] field8748 = new class1015[0];

	@ObfuscatedName("abz.r")
	public static int field8756 = 1001127;

	@ObfuscatedName("abz.v")
	public static int field8757 = 0;

	@ObfuscatedName("abz.o")
	public static class667 field8750 = null;

	@ObfuscatedName("abz.s")
	public static boolean field8759 = false;

	public class750() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ev.e(I)V")
	public static void method2778() {
		if (!field8759) {
			return;
		}
		if (field8757 < Statics.field7414) {
			field8757 = Statics.field7414;
		}
		while (true) {
			while (field8757 < Statics.field3011) {
				class1015 var0 = class619.method4944(field8757);
				if (var0 != null && var0.field11707 == -1) {
					if (field8750 == null) {
						field8750 = client.field10994.method10589(var0.field11703);
					}
					int var1 = field8750.field8180;
					if (var1 == -1) {
						return;
					}
					var0.field11707 = var1;
					field8757++;
					field8750 = null;
				} else {
					field8757++;
				}
			}
			return;
		}
	}

	@ObfuscatedName("vu.n(ILjava/lang/String;III)Z")
	public static boolean method9401(int arg0, String arg1, int arg2, int arg3) {
		Statics.field8755 = new class749();
		Statics.field8755.field8746 = arg0;
		Statics.field8755.field8745 = arg1;
		Statics.field8755.field8744 = arg2;
		Statics.field8755.field8742 = arg3;
		return true;
	}

	@ObfuscatedName("dy.m(Ljava/lang/String;II)V")
	public static void method2105(String arg0, int arg1) {
		if (Statics.field8751 == null) {
			Statics.field8751 = new class749();
		}
		Statics.field8751.field8745 = arg0;
		Statics.field8751.field8746 = arg1 + 1099;
		Statics.field8751.field8744 = class699.method2912(Statics.field1811, class698.field8346, Statics.field8751.field8746);
		Statics.field8751.field8742 = class699.method10147(Statics.field1811, class698.field8346, Statics.field8751.field8746);
	}

	@ObfuscatedName("xq.k(I)V")
	public static void method10337() {
		if (Statics.field9200.field8746 != -1) {
			method9401(Statics.field9200.field8746, Statics.field9200.field8745, Statics.field9200.field8744, Statics.field9200.field8742);
		}
	}

	@ObfuscatedName("ym.w(I)Lalc;")
	public static class1015 method13782() {
		field8756 = 0;
		return method6048();
	}

	@ObfuscatedName("nn.l(I)Lalc;")
	public static class1015 method6048() {
		return field8756 < field8748.length ? field8748[++field8756 - 1] : null;
	}

	@ObfuscatedName("o.u(I)Lalc;")
	public static class1015 method477() {
		return class619.method4944(Statics.field8755.field8746);
	}

	@ObfuscatedName("kt.z(IZIZB)V")
	public static void method5394(int arg0, boolean arg1, int arg2, boolean arg3) {
		method3107(0, field8748.length - 1, arg0, arg1, arg2, arg3);
		field8757 = 0;
		field8750 = null;
	}

	@ObfuscatedName("fp.p(IIIZIZI)V")
	public static void method3107(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
		if (arg0 >= arg1) {
			return;
		}
		int var6 = (arg0 + arg1) / 2;
		int var7 = arg0;
		class1015 var8 = field8748[var6];
		field8748[var6] = field8748[arg1];
		field8748[arg1] = var8;
		for (int var9 = arg0; var9 < arg1; var9++) {
			if (method3592(field8748[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
				class1015 var10 = field8748[var9];
				field8748[var9] = field8748[var7];
				field8748[var7++] = var10;
			}
		}
		field8748[arg1] = field8748[var7];
		field8748[var7] = var8;
		method3107(arg0, var7 - 1, arg2, arg3, arg4, arg5);
		method3107(var7 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("gh.d(Lalc;Lalc;IZIZI)I")
	public static int method3592(class1015 arg0, class1015 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
		int var6 = method2856(arg0, arg1, arg2, arg3);
		if (var6 != 0) {
			return arg3 ? -var6 : var6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			int var7 = method2856(arg0, arg1, arg4, arg5);
			return arg5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("ef.c(Lalc;Lalc;IZB)I")
	public static int method2856(class1015 arg0, class1015 arg1, int arg2, boolean arg3) {
		if (arg2 == 1) {
			int var4 = arg0.field7641;
			int var5 = arg1.field7641;
			if (!arg3) {
				if (var4 == -1) {
					var4 = 2001;
				}
				if (var5 == -1) {
					var5 = 2001;
				}
			}
			return var4 - var5;
		} else if (arg2 == 2) {
			return class691.method6827(arg0.method18336(), arg1.method18336(), Statics.field1680);
		} else if (arg2 == 3) {
			if (arg0.field11704.equals("-")) {
				if (arg1.field11704.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.field11704.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return class691.method6827(arg0.field11704, arg1.field11704, Statics.field1680);
			}
		} else if (arg2 == 4) {
			return arg0.method9747() ? (arg1.method9747() ? 0 : 1) : (arg1.method9747() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method9750() ? (arg1.method9750() ? 0 : 1) : (arg1.method9750() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method9746() ? (arg1.method9746() ? 0 : 1) : (arg1.method9746() ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method9744() ? (arg1.method9744() ? 0 : 1) : (arg1.method9744() ? -1 : 0);
		} else if (arg2 == 8) {
			int var6 = arg0.field11707;
			int var7 = arg1.field11707;
			if (arg3) {
				if (var6 == 1000) {
					var6 = -1;
				}
				if (var7 == 1000) {
					var7 = -1;
				}
			} else {
				if (var6 == -1) {
					var6 = 1000;
				}
				if (var7 == -1) {
					var7 = 1000;
				}
			}
			return var6 - var7;
		} else {
			return arg0.field11705 - arg1.field11705;
		}
	}
}

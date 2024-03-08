package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("hz")
public class class241 {

	@ObfuscatedName("hz.e")
	public static final Map field2594 = new HashMap();

	@ObfuscatedName("hz.n")
	public static final class729 field2597 = new class729(1024);

	@ObfuscatedName("hz.m")
	public static final class720 field2596 = new class720();

	@ObfuscatedName("hz.k")
	public static int field2595 = 0;

	public class241() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ty.e(B)I")
	public static int method8480() {
		return ++field2595 - 1;
	}

	@ObfuscatedName("af.k(ILjava/lang/String;I)V")
	public static void method1006(int arg0, String arg1) {
		method2664(arg0, 0, "", "", "", arg1, null);
	}

	@ObfuscatedName("dj.f(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnn;I)V")
	public static void method2664(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, class387 arg6) {
		method15054(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6);
	}

	@ObfuscatedName("acj.w(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILnn;I)V")
	public static void method15054(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, String arg6, int arg7, class387 arg8) {
		class242 var9 = (class242) field2594.get(arg0);
		if (var9 == null) {
			var9 = new class242();
			field2594.put(arg0, var9);
		}
		class1179 var10 = var9.method4323(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		field2597.method14501(var10, (long) var10.field12339);
		field2596.method14339(var10);
		client.field11021 = client.field11058;
	}

	@ObfuscatedName("qo.l(III)Lasg;")
	public static class1179 method7310(int arg0, int arg1) {
		class242 var2 = (class242) field2594.get(arg0);
		return var2.method4322(arg1);
	}

	@ObfuscatedName("d.u(II)Lasg;")
	public static class1179 method304(int arg0) {
		return (class1179) field2597.method14495((long) arg0);
	}

	@ObfuscatedName("pg.z(II)I")
	public static int method6970(int arg0) {
		class242 var1 = (class242) field2594.get(arg0);
		return var1 == null ? 0 : var1.method4331();
	}

	@ObfuscatedName("v.p(I)V")
	public static void method329() {
		field2594.clear();
		field2597.method14499();
		field2596.method14316();
		field2595 = 0;
	}

	@ObfuscatedName("agj.d(II)I")
	public static int method16440(int arg0) {
		class1179 var1 = (class1179) field2597.method14495((long) arg0);
		if (var1 == null) {
			return -1;
		} else if (field2596.field8497 == var1.field11438) {
			return -1;
		} else {
			return ((class1179) var1.field11438).field12339;
		}
	}

	@ObfuscatedName("ko.c(II)I")
	public static int method5157(int arg0) {
		class1179 var1 = (class1179) field2597.method14495((long) arg0);
		if (var1 == null) {
			return -1;
		} else if (field2596.field8497 == var1.field11439) {
			return -1;
		} else {
			return ((class1179) var1.field11439).field12339;
		}
	}
}

package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ars")
public class class1171 extends class986 {

	@ObfuscatedName("ars.l")
	public int field12268;

	@ObfuscatedName("ars.u")
	public int field12274;

	@ObfuscatedName("ars.z")
	public int field12267;

	@ObfuscatedName("ars.p")
	public String field12269;

	@ObfuscatedName("ars.ac")
	public static class720 field12289 = new class720();

	@ObfuscatedName("ars.ai")
	public static class720 field12290 = new class720();

	@ObfuscatedName("ars.aw")
	public static class729 field12291 = new class729(16);

	@ObfuscatedName("ars.am")
	public static boolean field12295 = false;

	@ObfuscatedName("jx.e(IJ)Lars;")
	public static class1171 method5072(int arg0, long arg1) {
		field12295 = false;
		class1171 var3 = (class1171) field12291.method14495((long) arg0 << 56 | arg1);
		if (var3 == null) {
			var3 = new class1171(arg0, arg1);
			field12291.method14501(var3, var3.field6760);
			field12295 = true;
		}
		return var3;
	}

	@ObfuscatedName("al.n(I)V")
	public static void method716() {
		field12291.method14499();
		field12290.method14316();
		field12289.method14316();
	}

	@ObfuscatedName("kh.m(B)Lars;")
	public static class1171 method5207() {
		class1171 var0 = (class1171) field12289.method14317();
		if (var0 != null) {
			var0.method8440();
			var0.method17806();
			return var0;
		}
		class1171 var1;
		do {
			var1 = (class1171) field12290.method14317();
			if (var1 == null) {
				return null;
			}
			if (var1.method19345() > class213.method3655()) {
				return null;
			}
			var1.method8440();
			var1.method17806();
		} while ((var1.field11440 & Long.MIN_VALUE) == 0L);
		return var1;
	}

	@ObfuscatedName("gv.k(Lec;I)V")
	public static void method3607(class149 arg0) {
		class1171 var1 = method5072(1, (long) arg0.field1706);
		var1.method19333();
	}

	@ObfuscatedName("zr.f(Lec;B)V")
	public static void method14066(class149 arg0) {
		class1171 var1 = method5072(2, (long) arg0.field1706);
		var1.method19333();
	}

	@ObfuscatedName("agq.w(II)V")
	public static void method16464(int arg0) {
		class1171 var1 = method5072(3, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("wq.l(II)V")
	public static void method9793(int arg0) {
		class1171 var1 = method5072(23, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("yg.z(IB)V")
	public static void method10523(int arg0) {
		class1171 var1 = method5072(5, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("abm.p(IS)V")
	public static void method14870(int arg0) {
		class1171 var1 = method5072(6, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("xq.d(IS)V")
	public static void method10340(int arg0) {
		class1171 var1 = method5072(7, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("ea.c(II)V")
	public static void method2886(int arg0) {
		class1171 var1 = method5072(8, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("pk.r(II)V")
	public static void method6798(int arg0) {
		class1171 var1 = method5072(9, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("abz.v(II)V")
	public static void method14792(int arg0) {
		class1171 var1 = method5072(10, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("afj.y(IB)V")
	public static void method16433(int arg0) {
		class1171 var1 = method5072(11, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("cc.x(II)V")
	public static void method1588(int arg0) {
		class1171 var1 = method5072(12, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("rz.h(IB)V")
	public static void method7714(int arg0) {
		class1171 var1 = method5072(13, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("qc.a(II)V")
	public static void method7247(int arg0) {
		class1171 var1 = method5072(15, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("ana.g(II)V")
	public static void method18682(int arg0) {
		class1171 var1 = method5072(21, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("fu.i(II)V")
	public static void method3026(int arg0) {
		class1171 var1 = method5072(22, (long) arg0);
		var1.method19333();
	}

	@ObfuscatedName("zz.j(I)V")
	public static void method14036() {
		class1171 var0 = method5072(14, 0L);
		var0.method19333();
	}

	@ObfuscatedName("abo.ae(III)V")
	public static void method14614(int arg0, int arg1) {
		class1171 var2 = method5072(17, (long) arg1 << 32 | (long) arg0);
		var2.method19333();
	}

	@ObfuscatedName("df.ag(III)V")
	public static void method2051(int arg0, int arg1) {
		class1171 var2 = method5072(20, (long) arg1 << 32 | (long) arg0);
		var2.method19333();
	}

	@ObfuscatedName("aqe.ah(III)V")
	public static void method19215(int arg0, int arg1) {
		class1171 var2 = method5072(1, (long) arg0);
		var2.method19269();
		var2.field12268 = arg1;
	}

	@ObfuscatedName("alv.al(III)V")
	public static void method18309(int arg0, int arg1) {
		class305 var2 = (class305) Statics.field8736.method962(arg0);
		class1171 var3 = method5072(1, (long) var2.field3076.field1706);
		try {
			if (field12295) {
				var3.field12268 = Statics.field7228.method679(var2.field3076);
			}
			var3.field12268 = var2.method5183(var3.field12268, arg1);
			var3.method19269();
		} catch (class1110 var5) {
			class1211.method9845("" + arg0, var5);
		}
	}

	@ObfuscatedName("zl.ac(ILjava/lang/String;B)V")
	public static void method14051(int arg0, String arg1) {
		class1171 var2 = method5072(2, (long) arg0);
		var2.method19269();
		var2.field12269 = arg1;
	}

	@ObfuscatedName("ea.ai(ILjava/lang/String;B)V")
	public static void method2887(int arg0, String arg1) {
		class1171 var2 = method5072(3, (long) arg0);
		var2.method19269();
		var2.field12269 = arg1;
	}

	@ObfuscatedName("ww.aw(IZB)V")
	public static void method9874(int arg0, boolean arg1) {
		class1171 var2 = method5072(23, (long) arg0);
		var2.method19269();
		var2.field12268 = arg1 ? 1 : 0;
	}

	@ObfuscatedName("ajz.as(IIIII)V")
	public static void method17439(int arg0, int arg1, int arg2, int arg3) {
		class1171 var4 = method5072(4, (long) arg0);
		var4.method19269();
		var4.field12268 = arg1;
		var4.field12274 = arg2;
		var4.field12267 = arg3;
	}

	@ObfuscatedName("fr.ad(III)V")
	public static void method3379(int arg0, int arg1) {
		class1171 var2 = method5072(6, (long) arg0);
		var2.method19269();
		var2.field12268 = arg1;
	}

	@ObfuscatedName("ge.am(III)V")
	public static void method3570(int arg0, int arg1) {
		class1171 var2 = method5072(7, (long) arg0);
		var2.method19269();
		var2.field12268 = arg1;
	}

	@ObfuscatedName("ahp.au(IIIII)V")
	public static void method16746(int arg0, int arg1, int arg2, int arg3) {
		class1171 var4 = method5072(8, (long) arg0);
		var4.method19269();
		var4.field12268 = arg1;
		var4.field12274 = arg2;
		var4.field12267 = arg3;
	}

	@ObfuscatedName("kp.ar(IIIB)V")
	public static void method5369(int arg0, int arg1, int arg2) {
		class1171 var3 = method5072(9, (long) arg0);
		var3.method19269();
		var3.field12268 = arg1;
		var3.field12274 = arg2;
	}

	@ObfuscatedName("iv.aq(IIII)V")
	public static void method4400(int arg0, int arg1, int arg2) {
		class1171 var3 = method5072(11, (long) arg0);
		var3.method19269();
		var3.field12268 = arg1;
		var3.field12274 = arg2;
	}

	@ObfuscatedName("jh.ax(III)V")
	public static void method5081(int arg0, int arg1) {
		class1171 var2 = method5072(12, (long) arg0);
		var2.method19269();
		var2.field12268 = arg1;
	}

	@ObfuscatedName("wu.av(III)V")
	public static void method9637(int arg0, int arg1) {
		class1171 var2 = method5072(13, (long) arg0);
		var2.method19269();
		var2.field12268 = arg1;
	}

	@ObfuscatedName("aha.ao(IIB)V")
	public static void method16659(int arg0, int arg1) {
		class1171 var2 = method5072(15, (long) arg0);
		var2.method19269();
		var2.field12268 = arg1;
	}

	@ObfuscatedName("sp.aj(IZB)V")
	public static void method8279(int arg0, boolean arg1) {
		class1171 var2 = method5072(22, (long) arg0);
		var2.method19269();
		var2.field12268 = arg1 ? 1 : 0;
	}

	@ObfuscatedName("acx.ay(IIB)V")
	public static void method14994(int arg0, int arg1) {
		class1171 var2 = method5072(14, 0L);
		var2.method19269();
		var2.field12268 = arg0;
		var2.field12274 = arg1;
	}

	@ObfuscatedName("aoa.ab(IIIII)V")
	public static void method18895(int arg0, int arg1, int arg2, int arg3) {
		class1171 var4 = method5072(17, (long) arg1 << 32 | (long) arg0);
		var4.method19269();
		var4.field12268 = arg2;
		var4.field12274 = arg3;
	}

	@ObfuscatedName("kt.az(IIIIS)V")
	public static void method5395(int arg0, int arg1, int arg2, int arg3) {
		class1171 var4 = method5072(20, (long) arg1 << 32 | (long) arg0);
		var4.method19269();
		var4.field12268 = arg2;
		var4.field12274 = arg3;
	}

	public class1171(int arg0, long arg1) {
		this.field6760 = (long) arg0 << 56 | arg1;
	}

	@ObfuscatedName("ars.aa(I)V")
	public void method19333() {
		this.field11440 = this.field11440 & Long.MIN_VALUE | class213.method3655() + 500L;
		field12290.method14339(this);
	}

	@ObfuscatedName("ars.af(I)V")
	public void method19269() {
		this.field11440 |= Long.MIN_VALUE;
		if (this.method19345() == 0L) {
			field12289.method14339(this);
		}
	}

	@ObfuscatedName("ars.ak(I)I")
	public int method19276() {
		return (int) (this.field6760 >>> 56 & 0xFFL);
	}

	@ObfuscatedName("ars.an(I)J")
	public long method19271() {
		return this.field6760 & 0xFFFFFFFFFFFFFFL;
	}

	@ObfuscatedName("ars.bf(B)J")
	public long method19345() {
		return this.field11440 & Long.MAX_VALUE;
	}
}

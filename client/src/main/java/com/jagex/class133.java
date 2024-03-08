package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.awt.*;
import java.util.Enumeration;
import java.util.Hashtable;

@ObfuscatedName("dh")
public abstract class class133 {

	@ObfuscatedName("dh.l")
	public static boolean[] field1594 = new boolean[8];

	@ObfuscatedName("dh.u")
	public final int field1595;

	@ObfuscatedName("dh.z")
	public final class143 field1596;

	@ObfuscatedName("dh.p")
	public final class125 field1597;

	@ObfuscatedName("dh.d")
	public final class383 field1598;

	@ObfuscatedName("dh.c")
	public final class381 field1599;

	@ObfuscatedName("dh.g")
	public int field1616 = -1;

	@ObfuscatedName("dh.i")
	public class113 field1614;

	@ObfuscatedName("dh.j")
	public class841 field1612;

	@ObfuscatedName("dh.t")
	public Hashtable field1613 = new Hashtable();

	@ObfuscatedName("dh.ae")
	public final class840[] field1620 = new class840[4];

	@ObfuscatedName("dh.ag")
	public int field1615;

	@ObfuscatedName("dh.ah")
	public int field1588;

	@ObfuscatedName("dh.al")
	public int field1611;

	@ObfuscatedName("dh.ac")
	public int field1618;

	@ObfuscatedName("dh.ai")
	public int field1619;

	@ObfuscatedName("dh.aw")
	public int field1610 = 0;

	@ObfuscatedName("dh.as")
	public float field1602 = 0.0F;

	@ObfuscatedName("aac.e(ILjava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;Lpy;II)Ldh;")
	public static class133 method14575(int arg0, Canvas arg1, class125 arg2, class143 arg3, class383 arg4, class381 arg5, class378 arg6, class442 arg7, int arg8) {
		int var9 = 0;
		int var10 = 0;
		if (arg1 != null) {
			Dimension var11 = arg1.getSize();
			var9 = var11.width;
			var10 = var11.height;
		}
		return Statics.method2180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var9, var10);
	}

	@ObfuscatedName("ai.m(II)Z")
	public static boolean method723(int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@ObfuscatedName("q.k(II)Z")
	public static boolean method551(int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	public class133(class125 arg0, class143 arg1, class383 arg2, class381 arg3, class378 arg4) {
		this.field1597 = arg0;
		this.field1596 = arg1;
		this.field1598 = arg2;
		this.field1599 = arg3;
		int var6 = -1;
		for (int var7 = 0; var7 < 8; var7++) {
			if (!field1594[var7]) {
				field1594[var7] = true;
				var6 = var7;
				break;
			}
		}
		if (var6 == -1) {
			throw new IllegalStateException("");
		}
		this.field1595 = var6;
	}

	@ObfuscatedName("dh.w(I)V")
	public final void method2115() throws class1106 {
		this.method2116(0, 0);
	}

	@ObfuscatedName("dh.z(I)V")
	public void method2578() {
		field1594[this.field1595] = false;
		Enumeration var1 = this.field1613.keys();
		while (var1.hasMoreElements()) {
			Canvas var2 = (Canvas) var1.nextElement();
			class841 var3 = (class841) this.field1613.get(var2);
			var3.method1629();
		}
		this.method2369();
	}

	public void finalize() {
		this.method2578();
	}

	@ObfuscatedName("dh.t([I)V")
	public void method2134(int[] arg0) {
		if (this.field1612 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.field1612.method1627();
			arg0[1] = this.field1612.method1628();
		}
	}

	@ObfuscatedName("dh.ae(B)Ldr;")
	public final class113 method2135() {
		return this.field1614;
	}

	@ObfuscatedName("dh.ag(I)Lafy;")
	public final class841 method2136() {
		return this.field1612;
	}

	@ObfuscatedName("dh.ah(Ljava/awt/Canvas;III)V")
	public final void method2178(Canvas arg0, int arg1, int arg2) {
		if (!this.field1613.containsKey(arg0)) {
			Statics.method6020(arg0);
			this.method2138(arg0, this.method2144(arg0, arg1, arg2));
		}
	}

	@ObfuscatedName("dh.al(Ljava/awt/Canvas;Lafy;B)V")
	public final void method2138(Canvas arg0, class841 arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.field1613.put(arg0, arg1);
	}

	@ObfuscatedName("dh.ac(Ljava/awt/Canvas;I)V")
	public final void method2192(Canvas arg0) {
		if (this.field1613.containsKey(arg0)) {
			class841 var2 = (class841) this.field1613.get(arg0);
			var2.method1629();
			this.field1613.remove(arg0);
		}
	}

	@ObfuscatedName("dh.ai(Ljava/awt/Canvas;B)V")
	public final void method2140(Canvas arg0) {
		class841 var2 = (class841) this.field1613.get(arg0);
		if (var2 == null) {
			throw new RuntimeException();
		} else if (this.field1616 <= 0 && this.field1612 == this.field1614) {
			if (this.field1614 != null) {
				this.field1614.method1631();
			}
			if (this.field1616 < 0) {
				this.field1614 = var2;
			}
			this.field1612 = var2;
			var2.method1630();
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("dh.aw(Ljava/awt/Canvas;III)V")
	public final void method2216(Canvas arg0, int arg1, int arg2) {
		class841 var4 = (class841) this.field1613.get(arg0);
		if (var4 == null) {
			throw new RuntimeException("");
		}
		var4.method15453(arg1, arg2);
	}

	@ObfuscatedName("dh.as(Lafq;B)V")
	public final void method2142(class840 arg0) {
		if (this.field1616 >= 3) {
			throw new RuntimeException();
		}
		if (this.field1616 >= 0) {
			this.field1620[this.field1616].method1631();
		} else {
			this.field1612.method1631();
		}
		this.field1614 = this.field1620[++this.field1616] = arg0;
		arg0.method1630();
	}

	@ObfuscatedName("dh.at(Lafq;I)V")
	public final void method2143(class840 arg0) {
		if (this.field1616 < 0 || this.field1620[this.field1616] != arg0) {
			throw new RuntimeException();
		}
		this.field1620[--this.field1616 + 1] = null;
		arg0.method1631();
		if (this.field1616 >= 0) {
			this.field1614 = this.field1620[this.field1616];
			this.field1620[this.field1616].method1630();
		} else {
			this.field1614 = this.field1612;
			this.field1612.method1630();
		}
	}

	@ObfuscatedName("dh.bf(IIB)V")
	public void method2419(int arg0, int arg1) {
		this.field1615 = arg0;
		this.field1588 = arg1;
		float var3 = (float) this.field1614.method1627() / (float) this.field1614.method1628();
		float var4 = (float) this.field1615 / (float) this.field1588;
		if (var3 < var4) {
			this.field1619 = (int) ((float) this.field1588 * var3);
			this.field1610 = this.field1588;
		} else {
			this.field1619 = this.field1615;
			this.field1610 = (int) ((float) this.field1615 / var3);
		}
		this.field1602 = (float) this.field1619 / (float) this.field1614.method1627();
		this.field1611 = (this.field1615 - this.field1619) / 2;
		this.field1618 = (this.field1588 - this.field1610) / 2;
	}

	@ObfuscatedName("dh.bt(Z)V")
	public void method2170(boolean arg0) {
	}

	@ObfuscatedName("dh.bb(IIIIII)V")
	public final void method2173(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method2179(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@ObfuscatedName("dh.be(IIIIIB)V")
	public final void method2301(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method2354(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@ObfuscatedName("dh.by(IIIII)V")
	public final void method2175(int arg0, int arg1, int arg2, int arg3) {
		this.method2182(arg0, arg1, arg2, arg3, 1);
	}

	@ObfuscatedName("dh.bu(IIIIB)V")
	public final void method2176(int arg0, int arg1, int arg2, int arg3) {
		this.method2433(arg0, arg1, arg2, arg3, 1);
	}

	@ObfuscatedName("dh.bw(IIIII)V")
	public final void method2177(int arg0, int arg1, int arg2, int arg3) {
		this.method2139(arg0, arg1, arg2, arg3, 1);
	}

	@ObfuscatedName("dh.bo(IIIIII)V")
	public final void method2374(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method2185(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@ObfuscatedName("dh.ci(IILou;Loj;I)Z")
	public boolean method2191(int arg0, int arg1, class419 arg2, class416 arg3) {
		return this.method2128(arg0, arg1, 0, 0, arg2, arg3);
	}

	@ObfuscatedName("dh.cx(IIZI)Lcm;")
	public class101 method2365(int arg0, int arg1, boolean arg2) {
		return this.method2197(arg0, arg1, arg2, false);
	}

	@ObfuscatedName("dh.cf([IIIIII)Lcm;")
	public class101 method2199(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		return this.method2188(arg0, arg1, arg2, arg3, arg4, true);
	}

	@ObfuscatedName("dh.cm()V")
	public void method2202() {
	}

	@ObfuscatedName("dh.cq()V")
	public void method2203() {
	}

	@ObfuscatedName("dh.ch()V")
	public void method2204() {
	}

	@ObfuscatedName("dh.da(I)Z")
	public boolean method2215() {
		return true;
	}

	@ObfuscatedName("dh.dw(IIIIIF)Lakf;")
	public class973 method2227(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		return new class973(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("dh.ee(FFFI)V")
	public void method2243(float arg0, float arg1, float arg2) {
		this.method2244(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("dh.ec(IIII[IIII)[I")
	public int[] method2250(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		int[] var8 = new int[arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (int var9 = 0; var9 < arg3; var9++) {
			if (var9 >= arg1) {
				int var14 = (arg1 - 1) * arg2;
				for (int var15 = 0; var15 < arg2; var15++) {
					var8[arg2 * var9 + var15] = var8[var14 + var15];
				}
			} else {
				int var10 = arg6 * var9 + arg5;
				for (int var11 = 0; var11 < arg0; var11++) {
					var8[arg2 * var9 + var11] = arg4[var10 + var11];
				}
				int var12 = arg4[arg0 - 1 + var10];
				for (int var13 = arg0; var13 < arg2; var13++) {
					var8[arg2 * var9 + var13] = var12;
				}
			}
		}
		return var8;
	}

	@ObfuscatedName("dh.ek(IIII[FIIII)[F")
	public float[] method2230(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7) {
		float[] var9 = new float[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (int var10 = 0; var10 < arg3; var10++) {
			if (var10 < arg1) {
				int var11 = arg6 * var10 + arg5;
				for (int var12 = 0; var12 < arg0; var12++) {
					for (int var13 = 0; var13 < arg7; var13++) {
						var9[arg2 * var10 * arg7 + arg7 * var12 + var13] = arg4[arg7 * var12 + var11 + var13];
					}
				}
				float[] var14 = new float[arg7];
				for (int var15 = 0; var15 < arg7; var15++) {
					var14[var15] = arg4[(arg0 - 1) * arg7 + var11 + var15];
				}
				for (int var16 = arg0; var16 < arg2; var16++) {
					for (int var17 = 0; var17 < arg7; var17++) {
						var9[arg2 * var10 * arg7 + arg7 * var16 + var17] = var14[var17];
					}
				}
			} else {
				int var18 = (arg1 - 1) * arg2 * arg7;
				for (int var19 = 0; var19 < arg2; var19++) {
					for (int var20 = 0; var20 < arg7; var20++) {
						var9[arg2 * var10 * arg7 + arg7 * var19 + var20] = var9[arg7 * var19 + var18 + var20];
					}
				}
			}
		}
		return var9;
	}

	@ObfuscatedName("dh.em(IIII[BIIII)[B")
	public byte[] method2256(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
		byte[] var9 = new byte[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (int var10 = 0; var10 < arg3; var10++) {
			if (var10 < arg1) {
				int var11 = arg6 * var10 + arg5;
				for (int var12 = 0; var12 < arg0; var12++) {
					for (int var13 = 0; var13 < arg7; var13++) {
						var9[arg2 * var10 * arg7 + arg7 * var12 + var13] = arg4[arg7 * var12 + var11 + var13];
					}
				}
				byte[] var14 = new byte[arg7];
				for (int var15 = 0; var15 < arg7; var15++) {
					var14[var15] = arg4[(arg0 - 1) * arg7 + var11 + var15];
				}
				for (int var16 = arg0; var16 < arg2; var16++) {
					for (int var17 = 0; var17 < arg7; var17++) {
						var9[arg2 * var10 * arg7 + arg7 * var16 + var17] = var14[var17];
					}
				}
			} else {
				int var18 = (arg1 - 1) * arg2 * arg7;
				for (int var19 = 0; var19 < arg2; var19++) {
					for (int var20 = 0; var20 < arg7; var20++) {
						var9[arg2 * var10 * arg7 + arg7 * var19 + var20] = var9[arg7 * var19 + var18 + var20];
					}
				}
			}
		}
		return var9;
	}

	@ObfuscatedName("dh.df()I")
	public abstract int method2114();

	@ObfuscatedName("dh.l(II)V")
	public abstract void method2116(int arg0, int arg1) throws class1106;

	@ObfuscatedName("dh.u()V")
	public abstract void method2117();

	@ObfuscatedName("dh.d(I)V")
	public abstract void method2120(int arg0);

	@ObfuscatedName("dh.ar(II)Ldw;")
	public abstract class126 method2121(int arg0, int arg1);

	@ObfuscatedName("dh.v()Z")
	public abstract boolean method2123();

	@ObfuscatedName("dh.o()Z")
	public abstract boolean method2124();

	@ObfuscatedName("dh.s()Z")
	public abstract boolean method2125();

	@ObfuscatedName("dh.bl()V")
	public abstract void method2126();

	@ObfuscatedName("dh.q()Z")
	public abstract boolean method2127();

	@ObfuscatedName("dh.cn(IIIILou;Loj;)Z")
	public abstract boolean method2128(int arg0, int arg1, int arg2, int arg3, class419 arg4, class416 arg5);

	@ObfuscatedName("dh.b()Z")
	public abstract boolean method2129();

	@ObfuscatedName("dh.h()Z")
	public abstract boolean method2130();

	@ObfuscatedName("dh.g()Ljava/lang/String;")
	public abstract String method2132();

	@ObfuscatedName("dh.bp(IIIII)V")
	public abstract void method2139(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("dh.x()Z")
	public abstract boolean method2141();

	@ObfuscatedName("dh.ad(Ljava/awt/Canvas;II)Lafy;")
	public abstract class841 method2144(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("dh.am()Lafq;")
	public abstract class840 method2145();

	@ObfuscatedName("dh.au(IILck;Ldg;I)Ldp;")
	public abstract class130 method2146(int arg0, int arg1, class109 arg2, class135 arg3, int arg4);

	@ObfuscatedName("dh.aq(IIII)[I")
	public abstract int[] method2149(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("dh.ax()V")
	public abstract void method2150();

	@ObfuscatedName("dh.dx()Z")
	public abstract boolean method2152();

	@ObfuscatedName("dh.aj()Z")
	public abstract boolean method2153();

	@ObfuscatedName("dh.az()V")
	public abstract void method2156();

	@ObfuscatedName("dh.af(II)J")
	public abstract long method2158(int arg0, int arg1);

	@ObfuscatedName("dh.ak(J)V")
	public abstract void method2159(long arg0);

	@ObfuscatedName("dh.an(II[I[I)V")
	public abstract void method2160(int arg0, int arg1, int[] arg2, int[] arg3);

	@ObfuscatedName("dh.bn(IIII)V")
	public abstract void method2161(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("dh.aa(III)V")
	public abstract void method2163(int arg0, int arg1, int arg2);

	@ObfuscatedName("dh.bh(IIII)V")
	public abstract void method2164(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("dh.bc()V")
	public abstract void method2167();

	@ObfuscatedName("dh.bi(IIII)V")
	public abstract void method2168(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("dh.bq([I)V")
	public abstract void method2171(int[] arg0);

	@ObfuscatedName("dh.dy(IIII)V")
	public abstract void method2172(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("dh.bz(IIIIII)V")
	public abstract void method2179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("dh.bg(IIIII)V")
	public abstract void method2182(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("dh.bs(IIIIIILch;II)V")
	public abstract void method2183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class103 arg6, int arg7, int arg8);

	@ObfuscatedName("dh.bj(IIIIII)V")
	public abstract void method2185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("dh.cl(IIIIIIIII)V")
	public abstract void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("dh.ct([IIIIIZ)Lcm;")
	public abstract class101 method2188(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("dh.ce(IIIIIII)V")
	public abstract void method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("dh.cv(Lou;Led;Loj;)V")
	public abstract void method2193(class419 arg0, class141 arg1, class416 arg2);

	@ObfuscatedName("dh.r()Z")
	public abstract boolean method2194();

	@ObfuscatedName("dh.ca(Lakz;)V")
	public abstract void method2195(class972 arg0);

	@ObfuscatedName("dh.ao()Z")
	public abstract boolean method2196();

	@ObfuscatedName("dh.cw(IIZZ)Lcm;")
	public abstract class101 method2197(int arg0, int arg1, boolean arg2, boolean arg3);

	@ObfuscatedName("dh.dt(Ldm;)V")
	public abstract void method2198(class119 arg0);

	@ObfuscatedName("dh.co(Lde;Z)Lcm;")
	public abstract class101 method2200(class136 arg0, boolean arg1);

	@ObfuscatedName("dh.cb(II[I[I)Lch;")
	public abstract class103 method2205(int arg0, int arg1, int[] arg2, int[] arg3);

	@ObfuscatedName("dh.cs(ILch;II)V")
	public abstract void method2206(int arg0, class103 arg1, int arg2, int arg3);

	@ObfuscatedName("dh.cy(Laac;Lde;Z)Leu;")
	public abstract class140 method2207(class733 arg0, class136 arg1, boolean arg2);

	@ObfuscatedName("dh.cc()Lpq;")
	public abstract class426 method2208();

	@ObfuscatedName("dh.cz()Lou;")
	public abstract class419 method2209();

	@ObfuscatedName("dh.cj(Ldq;IIII)Ldo;")
	public abstract class116 method2211(class120 arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("dh.dd(II)I")
	public abstract int method2213(int arg0, int arg1);

	@ObfuscatedName("dh.dr(II[[I[[IIII)Lcb;")
	public abstract class104 method2214(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("dh.do(Lou;)V")
	public abstract void method2217(class419 arg0);

	@ObfuscatedName("dh.dz()Lou;")
	public abstract class419 method2218();

	@ObfuscatedName("dh.dv(Z)V")
	public abstract void method2219(boolean arg0);

	@ObfuscatedName("dh.dm(Lpq;)V")
	public abstract void method2220(class426 arg0);

	@ObfuscatedName("dh.cp(I)Lakz;")
	public abstract class972 method2221(int arg0);

	@ObfuscatedName("dh.dc(F)V")
	public abstract void method2222(float arg0);

	@ObfuscatedName("dh.di(IFFFFF)V")
	public abstract void method2223(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("dh.dk(I)V")
	public abstract void method2224(int arg0);

	@ObfuscatedName("dh.du(I)Ldz;")
	public abstract class117 method2229(int arg0);

	@ObfuscatedName("dh.db(II)V")
	public abstract void method2233(int arg0, int arg1);

	@ObfuscatedName("dh.dh()Z")
	public abstract boolean method2234();

	@ObfuscatedName("dh.dg(FFFFF)V")
	public abstract void method2236(float arg0, float arg1, float arg2, float arg3, float arg4);

	@ObfuscatedName("dh.de([I)Lcj;")
	public abstract class110 method2237(int[] arg0);

	@ObfuscatedName("dh.dj()Z")
	public abstract boolean method2238();

	@ObfuscatedName("dh.eo(Lcj;FLcj;FLcj;F)V")
	public abstract void method2239(class110 arg0, float arg1, class110 arg2, float arg3, class110 arg4, float arg5);

	@ObfuscatedName("dh.a()Z")
	public abstract boolean method2240();

	@ObfuscatedName("dh.ed()Z")
	public abstract boolean method2242();

	@ObfuscatedName("dh.es(FFFFFF)V")
	public abstract void method2244(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("dh.ei(ILdy;)V")
	public abstract void method2245(int arg0, class131 arg1);

	@ObfuscatedName("dh.el(ILdy;)V")
	public abstract void method2246(int arg0, class131 arg1);

	@ObfuscatedName("dh.ej()V")
	public abstract void method2247();

	@ObfuscatedName("dh.eh(Z)V")
	public abstract void method2253(boolean arg0);

	@ObfuscatedName("dh.bk()V")
	public abstract void method2263();

	@ObfuscatedName("dh.y()Z")
	public abstract boolean method2266();

	@ObfuscatedName("dh.f()Lcz;")
	public abstract class108 method2272();

	@ObfuscatedName("dh.eu()V")
	public abstract void method2273();

	@ObfuscatedName("dh.ey()Z")
	public abstract boolean method2274();

	@ObfuscatedName("dh.ay()Z")
	public abstract boolean method2304();

	@ObfuscatedName("dh.cr(IIIIZ)Lcm;")
	public abstract class101 method2314(int arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("dh.bx([I)V")
	public abstract void method2326(int[] arg0);

	@ObfuscatedName("dh.bd(FF)V")
	public abstract void method2339(float arg0, float arg1);

	@ObfuscatedName("dh.cu(IIIIII)I")
	public abstract int method2348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("dh.bv(IIIIII)V")
	public abstract void method2354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("dh.dq()Lpq;")
	public abstract class426 method2355();

	@ObfuscatedName("dh.ap(III)Ldw;")
	public abstract class126 method2356(int arg0, int arg1, int arg2);

	@ObfuscatedName("dh.av()Z")
	public abstract boolean method2360();

	@ObfuscatedName("dh.p()V")
	public abstract void method2369();

	@ObfuscatedName("dh.cd(II)I")
	public abstract int method2394(int arg0, int arg1);

	@ObfuscatedName("dh.i()[I")
	public abstract int[] method2413();

	@ObfuscatedName("dh.ba(IIIII)V")
	public abstract void method2433(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("dh.dl(Ldz;Ldz;FLdz;)Ldz;")
	public abstract class117 method2435(class117 arg0, class117 arg1, float arg2, class117 arg3);

	@ObfuscatedName("dh.bm(II)V")
	public abstract void method2475(int arg0, int arg1);

	@ObfuscatedName("dh.ds(I[Lakf;)V")
	public abstract void method2491(int arg0, class973[] arg1);

	@ObfuscatedName("dh.ab()I")
	public abstract int method2502();

	@ObfuscatedName("dh.ep(FFF[F)V")
	public abstract void method2507(float arg0, float arg1, float arg2, float[] arg3);

	@ObfuscatedName("dh.dp(Ldz;)V")
	public abstract void method2516(class117 arg0);

	@ObfuscatedName("dh.c()I")
	public abstract int method2520();

	@ObfuscatedName("dh.ev(FFF[F)V")
	public abstract void method2525(float arg0, float arg1, float arg2, float[] arg3);

	@ObfuscatedName("dh.ck(I)V")
	public abstract void method2532(int arg0);

	@ObfuscatedName("dh.cg(IIIIIILch;IIIII)V")
	public abstract void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class103 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

	@ObfuscatedName("dh.br(IIFIIFIIFIIII)V")
	public abstract void method2552(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12);

	@ObfuscatedName("dh.dn(III)V")
	public abstract void method2572(int arg0, int arg1, int arg2);
}

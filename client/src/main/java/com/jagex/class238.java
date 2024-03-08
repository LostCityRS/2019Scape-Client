package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ho")
public abstract class class238 {

	@ObfuscatedName("ho.e")
	public String field2570;

	@ObfuscatedName("ho.n")
	public class234[] field2568;

	@ObfuscatedName("ho.m")
	public class252 field2574;

	@ObfuscatedName("ho.k")
	public class252 field2569;

	@ObfuscatedName("ho.f")
	public int field2567;

	@ObfuscatedName("ho.w")
	public int field2572;

	@ObfuscatedName("ho.l")
	public int field2573 = -1;

	@ObfuscatedName("ho.u")
	public static final class251 field2571 = new class232();

	public class238(class850 arg0, class239 arg1) {
		this.field2570 = arg1.field2577;
		this.field2567 = arg1.field2580.length;
		this.field2574 = new class252(this.field2567, field2571);
		for (int var3 = 0; var3 < this.field2567; var3++) {
			this.field2574.method4475(var3, arg1.field2580[var3].field2586, this.method4165(arg1.field2580[var3]));
		}
		this.field2572 = arg1.field2581.length;
		this.field2569 = new class252(this.field2572, field2571);
		for (int var4 = 0; var4 < this.field2572; var4++) {
			this.field2569.method4475(var4, arg1.field2581[var4].field2586, this.method4165(arg1.field2581[var4]));
		}
		this.field2568 = new class234[arg1.field2582.length];
		for (int var5 = 0; var5 < arg1.field2582.length; var5++) {
			this.field2568[var5] = this.method4156(arg0, arg1.field2582[var5]);
		}
	}

	@ObfuscatedName("ho.k(I)Ljava/lang/String;")
	public String method4186() {
		return this.field2570;
	}

	@ObfuscatedName("ho.w(Ljava/lang/String;I)Lhi;")
	public class234 method4227(String arg0) throws class1213 {
		class234[] var2 = this.field2568;
		for (int var3 = 0; var3 < var2.length; var3++) {
			class234 var4 = var2[var3];
			String var5 = var4.method4082();
			if (var5 != null && var5.equals(arg0)) {
				if (!var4.method4083()) {
					throw new class1213(arg0);
				}
				return var4;
			}
		}
		throw new class1213(arg0);
	}

	@ObfuscatedName("ho.l(B)I")
	public final int method4158() {
		return this.field2568.length;
	}

	@ObfuscatedName("ho.u(II)Lhi;")
	public final class234 method4159(int arg0) {
		return this.field2568[arg0];
	}

	@ObfuscatedName("ho.z(Lhi;I)I")
	public int method4200(class234 arg0) {
		for (int var2 = 0; var2 < this.field2568.length; var2++) {
			if (this.field2568[var2] == arg0) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("ho.p(I)Lhi;")
	public class234 method4217() {
		class234[] var1 = this.field2568;
		for (int var2 = 0; var2 < var1.length; var2++) {
			class234 var3 = var1[var2];
			if (var3.method4083()) {
				return var3;
			}
		}
		return null;
	}

	@ObfuscatedName("ho.c(B)Lhi;")
	public final class234 method4163() {
		return this.field2573 >= 0 ? this.field2568[this.field2573] : null;
	}

	@ObfuscatedName("ho.r(I)I")
	public final int method4212() {
		return this.field2573;
	}

	@ObfuscatedName("ho.o(Laql;FB)V")
	public final void method4268(class1150 arg0, float arg1) {
		this.field2568[this.field2573].method4084(arg0, arg1);
	}

	@ObfuscatedName("ho.s(Laql;FFB)V")
	public final void method4167(class1150 arg0, float arg1, float arg2) {
		this.field2568[this.field2573].method4085(arg0, arg1, arg2);
	}

	@ObfuscatedName("ho.y(Laql;FFFI)V")
	public final void method4218(class1150 arg0, float arg1, float arg2, float arg3) {
		this.field2568[this.field2573].method4108(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ho.q(Laql;FFFFI)V")
	public final void method4169(class1150 arg0, float arg1, float arg2, float arg3, float arg4) {
		this.field2568[this.field2573].method4087(arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ho.x(Laql;Lox;I)V")
	public final void method4246(class1150 arg0, class423 arg1) {
		this.field2568[this.field2573].method4108(arg0, arg1.field4308, arg1.field4311, arg1.field4313);
	}

	@ObfuscatedName("ho.b(Laql;Log;I)V")
	public final void method4171(class1150 arg0, class415 arg1) {
		this.field2568[this.field2573].method4087(arg0, arg1.field4244, arg1.field4243, arg1.field4242, arg1.field4245);
	}

	@ObfuscatedName("ho.h(Laql;[FI)V")
	public final void method4172(class1150 arg0, float[] arg1) {
		this.field2568[this.field2573].method4086(arg0, arg1, arg1.length);
	}

	@ObfuscatedName("ho.a(Laql;IB)V")
	public final void method4173(class1150 arg0, int arg1) {
		float var3 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		float var4 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		float var5 = (float) (arg1 & 0xFF) / 255.0F;
		float var6 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method4169(arg0, var3, var4, var5, var6);
	}

	@ObfuscatedName("ho.g(Laql;Lpq;I)V")
	public final void method4201(class1150 arg0, class426 arg1) {
		this.field2568[this.field2573].method4089(arg0, arg1);
	}

	@ObfuscatedName("ho.i(Laql;Lpq;I)V")
	public final void method4166(class1150 arg0, class426 arg1) {
		this.field2568[this.field2573].method4101(arg0, arg1);
	}

	@ObfuscatedName("ho.j(Laql;ILmq;I)V")
	public final void method4252(class1150 arg0, int arg1, class356 arg2) {
		this.field2568[this.field2573].method4081(arg0, arg1, arg2);
	}

	@ObfuscatedName("ho.t(IFFFI)V")
	public final void method4177(int arg0, float arg1, float arg2, float arg3) {
		this.field2568[this.field2573].method4088(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ho.ae(IFFFFI)V")
	public final void method4178(int arg0, float arg1, float arg2, float arg3, float arg4) {
		this.field2568[this.field2573].method4123(arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ho.ag(ILox;B)V")
	public final void method4179(int arg0, class423 arg1) {
		this.field2568[this.field2573].method4088(arg0, arg1.field4308, arg1.field4311, arg1.field4313);
	}

	@ObfuscatedName("ho.ah(I[FII)V")
	public final void method4180(int arg0, float[] arg1, int arg2) {
		this.field2568[this.field2573].method4093(arg0, arg1, arg2);
	}

	@ObfuscatedName("ho.al(ILpq;I)V")
	public final void method4181(int arg0, class426 arg1) {
		this.field2568[this.field2573].method4094(arg0, arg1);
	}

	@ObfuscatedName("ho.ac(ILpq;I)V")
	public final void method4182(int arg0, class426 arg1) {
		this.field2568[this.field2573].method4095(arg0, arg1);
	}

	@ObfuscatedName("ho.ai(ILpq;I)V")
	public final void method4183(int arg0, class426 arg1) {
		this.field2568[this.field2573].method4096(arg0, arg1);
	}

	@ObfuscatedName("ho.aw(IILmq;B)V")
	public final void method4215(int arg0, int arg1, class356 arg2) {
		this.field2568[this.field2573].method4097(arg0, arg1, arg2);
	}

	@ObfuscatedName("ho.as(Ljava/lang/String;B)Laql;")
	public class1150 method4157(String arg0) throws class1212 {
		class1150 var2 = (class1150) this.field2574.method4464(arg0);
		if (var2 == null) {
			throw new class1212(arg0);
		}
		return var2;
	}

	@ObfuscatedName("ho.at(I)I")
	public int method4190() {
		return this.field2572;
	}

	@ObfuscatedName("ho.ad(IB)Laql;")
	public class1150 method4187(int arg0) {
		return (class1150) this.field2569.method4470(arg0);
	}

	@ObfuscatedName("ho.am(Ljava/lang/String;S)Laql;")
	public class1150 method4188(String arg0) {
		return (class1150) this.field2569.method4464(arg0);
	}

	@ObfuscatedName("ho.au(I)I")
	public int method4189() {
		return this.field2567;
	}

	@ObfuscatedName("ho.ar(II)Laql;")
	public class1150 method4160(int arg0) {
		return (class1150) this.field2574.method4470(arg0);
	}

	@ObfuscatedName("ho.ap()V")
	public void method4191() {
	}

	@ObfuscatedName("ho.f(Lafc;Lhn;)Lhi;")
	public abstract class234 method4156(class850 arg0, class233 arg1);

	@ObfuscatedName("ho.d(Lhi;)Z")
	public abstract boolean method4162(class234 arg0);

	@ObfuscatedName("ho.v(Lhv;)Laql;")
	public abstract class1150 method4165(class240 arg0);

	@ObfuscatedName("ho.m()Z")
	public abstract boolean method4184();

	@ObfuscatedName("ho.n()V")
	public abstract void method4214();

	@ObfuscatedName("ho.e()V")
	public abstract void method4244();
}

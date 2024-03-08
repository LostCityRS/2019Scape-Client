package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ov")
public final class class421 {

	@ObfuscatedName("ov.e")
	public static class421[] field4303 = new class421[0];

	@ObfuscatedName("ov.k")
	public float field4301;

	@ObfuscatedName("ov.f")
	public float field4304;

	@ObfuscatedName("ov.l")
	public float field4305;

	@ObfuscatedName("ov.u")
	public float field4300;

	static {
		new class421();
	}

	@ObfuscatedName("ov.e(I)V")
	public static void method6406(int arg0) {
		Statics.field4306 = arg0;
		field4303 = new class421[arg0];
		Statics.field4302 = 0;
	}

	@ObfuscatedName("ov.n()Lov;")
	public static class421 method6469() {
		class421[] var0 = field4303;
		synchronized (field4303) {
			if (Statics.field4302 == 0) {
				return new class421();
			} else {
				field4303[--Statics.field4302].method6416();
				return field4303[Statics.field4302];
			}
		}
	}

	@ObfuscatedName("ov.m(FFFF)Lov;")
	public static class421 method6411(float arg0, float arg1, float arg2, float arg3) {
		class421[] var4 = field4303;
		synchronized (field4303) {
			if (Statics.field4302 == 0) {
				return new class421(arg0, arg1, arg2, arg3);
			} else {
				field4303[--Statics.field4302].method6448(arg0, arg1, arg2, arg3);
				return field4303[Statics.field4302];
			}
		}
	}

	@ObfuscatedName("ov.k(Lov;)Lov;")
	public static class421 method6443(class421 arg0) {
		class421[] var1 = field4303;
		synchronized (field4303) {
			if (Statics.field4302 == 0) {
				return new class421(arg0);
			} else {
				field4303[--Statics.field4302].method6412(arg0);
				return field4303[Statics.field4302];
			}
		}
	}

	@ObfuscatedName("ov.f()V")
	public void method6407() {
		class421[] var1 = field4303;
		synchronized (field4303) {
			if (Statics.field4302 < Statics.field4306 - 1) {
				field4303[Statics.field4302++] = this;
			}
		}
	}

	public class421() {
		this.method6416();
	}

	public class421(float arg0, float arg1, float arg2, float arg3) {
		this.method6448(arg0, arg1, arg2, arg3);
	}

	public class421(class421 arg0) {
		this.method6412(arg0);
	}

	public class421(float arg0, float arg1, float arg2) {
		this.method6415(arg0, arg1, arg2);
	}

	public class421(class997 arg0) {
		this.field4301 = arg0.method17916();
		this.field4304 = arg0.method17916();
		this.field4305 = arg0.method17916();
		this.field4300 = arg0.method17916();
	}

	@ObfuscatedName("ov.w(Lalw;)V")
	public void method6410(class997 arg0) {
		this.field4301 = arg0.method17916();
		this.field4304 = arg0.method17916();
		this.field4305 = arg0.method17916();
		this.field4300 = arg0.method17916();
	}

	@ObfuscatedName("ov.l(FFFF)V")
	public void method6448(float arg0, float arg1, float arg2, float arg3) {
		this.field4301 = arg0;
		this.field4304 = arg1;
		this.field4305 = arg2;
		this.field4300 = arg3;
	}

	@ObfuscatedName("ov.u(Lov;)V")
	public void method6412(class421 arg0) {
		this.field4301 = arg0.field4301;
		this.field4304 = arg0.field4304;
		this.field4305 = arg0.field4305;
		this.field4300 = arg0.field4300;
	}

	@ObfuscatedName("ov.z(Lox;F)V")
	public void method6413(class423 arg0, float arg1) {
		this.method6414(arg0.field4308, arg0.field4311, arg0.field4313, arg1);
	}

	@ObfuscatedName("ov.p(FFFF)V")
	public void method6414(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) Math.sin((double) (arg3 * 0.5F));
		float var6 = (float) Math.cos((double) (arg3 * 0.5F));
		this.field4301 = arg0 * var5;
		this.field4304 = arg1 * var5;
		this.field4305 = arg2 * var5;
		this.field4300 = var6;
	}

	@ObfuscatedName("ov.d(FFF)V")
	public void method6415(float arg0, float arg1, float arg2) {
		this.method6414(0.0F, 1.0F, 0.0F, arg0);
		class421 var4 = method6469();
		var4.method6414(1.0F, 0.0F, 0.0F, arg1);
		this.method6424(var4);
		var4.method6414(0.0F, 0.0F, 1.0F, arg2);
		this.method6424(var4);
		var4.method6407();
	}

	@ObfuscatedName("ov.c()V")
	public final void method6416() {
		this.field4305 = 0.0F;
		this.field4304 = 0.0F;
		this.field4301 = 0.0F;
		this.field4300 = 1.0F;
	}

	@ObfuscatedName("ov.r()V")
	public final void method6417() {
		this.field4301 = -this.field4301;
		this.field4304 = -this.field4304;
		this.field4305 = -this.field4305;
		this.field4300 = -this.field4300;
	}

	@ObfuscatedName("ov.v()V")
	public final void method6418() {
		this.field4301 = -this.field4301;
		this.field4304 = -this.field4304;
		this.field4305 = -this.field4305;
	}

	@ObfuscatedName("ov.o(Lov;)Lov;")
	public static final class421 method6419(class421 arg0) {
		class421 var1 = method6443(arg0);
		var1.method6418();
		return var1;
	}

	@ObfuscatedName("ov.s()V")
	public final void method6447() {
		float var1 = 1.0F / method6446(this);
		this.field4301 *= var1;
		this.field4304 *= var1;
		this.field4305 *= var1;
		this.field4300 *= var1;
	}

	@ObfuscatedName("ov.y(Lov;)V")
	public final void method6471(class421 arg0) {
		this.field4301 += arg0.field4301;
		this.field4304 += arg0.field4304;
		this.field4305 += arg0.field4305;
		this.field4300 += arg0.field4300;
	}

	@ObfuscatedName("ov.q(Lov;)F")
	public final float method6474(class421 arg0) {
		return this.field4300 * arg0.field4300 + this.field4305 * arg0.field4305 + this.field4304 * arg0.field4304 + this.field4301 * arg0.field4301;
	}

	@ObfuscatedName("ov.x(Lov;Lov;)F")
	public static final float method6422(class421 arg0, class421 arg1) {
		return arg0.method6474(arg1);
	}

	@ObfuscatedName("ov.b(Lov;)F")
	public static final float method6446(class421 arg0) {
		return (float) Math.sqrt((double) method6422(arg0, arg0));
	}

	@ObfuscatedName("ov.h(Lov;)V")
	public final void method6424(class421 arg0) {
		this.method6448(this.field4305 * arg0.field4304 + this.field4301 * arg0.field4300 + this.field4300 * arg0.field4301 - this.field4304 * arg0.field4305, this.field4301 * arg0.field4305 + this.field4300 * arg0.field4304 + (this.field4304 * arg0.field4300 - this.field4305 * arg0.field4301), this.field4300 * arg0.field4305 + (this.field4305 * arg0.field4300 + this.field4304 * arg0.field4301 - this.field4301 * arg0.field4304), this.field4300 * arg0.field4300 - this.field4301 * arg0.field4301 - this.field4304 * arg0.field4304 - this.field4305 * arg0.field4305);
	}

	@ObfuscatedName("ov.a(Lov;Lov;)Lov;")
	public static final class421 method6425(class421 arg0, class421 arg1) {
		class421 var2 = method6443(arg0);
		var2.method6424(arg1);
		return var2;
	}

	@ObfuscatedName("ov.g(F)V")
	public final void method6426(float arg0) {
		this.field4301 *= arg0;
		this.field4304 *= arg0;
		this.field4305 *= arg0;
		this.field4300 *= arg0;
	}

	@ObfuscatedName("ov.i(Lov;F)Lov;")
	public static final class421 method6427(class421 arg0, float arg1) {
		class421 var2 = method6443(arg0);
		var2.method6426(arg1);
		return var2;
	}

	@ObfuscatedName("ov.j(Lov;F)V")
	public final void method6428(class421 arg0, float arg1) {
		if (this.method6474(arg0) < 0.0F) {
			this.method6417();
		}
		this.method6426(1.0F - arg1);
		class421 var3 = method6427(arg0, arg1);
		this.method6471(var3);
		var3.method6407();
		this.method6447();
	}

	public boolean equals(Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof class421) {
			class421 var2 = (class421) arg0;
			return this.field4301 == var2.field4301 && this.field4304 == var2.field4304 && this.field4305 == var2.field4305 && this.field4300 == var2.field4300;
		} else {
			return false;
		}
	}

	public String toString() {
		return this.field4301 + "," + this.field4304 + "," + this.field4305 + "," + this.field4300;
	}
}

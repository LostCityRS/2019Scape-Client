package com.jagex.math;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("ov")
public final class Quaternion {

	@ObfuscatedName("ov.e")
	public static Quaternion[] pool = new Quaternion[0];

	@ObfuscatedName("ov.n")
	public static int poolCapacity;

	@ObfuscatedName("ov.m")
	public static int poolSize;

	@ObfuscatedName("ov.k")
	public float w;

	@ObfuscatedName("ov.f")
	public float x;

	@ObfuscatedName("ov.l")
	public float y;

	@ObfuscatedName("ov.u")
	public float z;

	static {
		new Quaternion();
	}

	@ObfuscatedName("ov.e(I)V")
	public static void init(int arg0) {
		poolCapacity = arg0;
		pool = new Quaternion[arg0];
		poolSize = 0;
	}

	@ObfuscatedName("ov.n()Lov;")
	public static Quaternion create() {
		Quaternion[] var0 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Quaternion();
			} else {
				pool[--poolSize].setToIdentity();
				return pool[poolSize];
			}
		}
	}

	@ObfuscatedName("ov.m(FFFF)Lov;")
	public static Quaternion create(float arg0, float arg1, float arg2, float arg3) {
		Quaternion[] var4 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Quaternion(arg0, arg1, arg2, arg3);
			} else {
				pool[--poolSize].setTo(arg0, arg1, arg2, arg3);
				return pool[poolSize];
			}
		}
	}

	@ObfuscatedName("ov.k(Lov;)Lov;")
	public static Quaternion create(Quaternion arg0) {
		Quaternion[] var1 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Quaternion(arg0);
			} else {
				pool[--poolSize].setTo(arg0);
				return pool[poolSize];
			}
		}
	}

	@ObfuscatedName("ov.f()V")
	public void release() {
		Quaternion[] var1 = pool;
		synchronized (pool) {
			if (poolSize < poolCapacity - 1) {
				pool[poolSize++] = this;
			}
		}
	}

	public Quaternion() {
		this.setToIdentity();
	}

	public Quaternion(float arg0, float arg1, float arg2, float arg3) {
		this.setTo(arg0, arg1, arg2, arg3);
	}

	public Quaternion(Quaternion arg0) {
		this.setTo(arg0);
	}

	public Quaternion(float arg0, float arg1, float arg2) {
		this.setToRotation(arg0, arg1, arg2);
	}

	public Quaternion(Packet arg0) {
		this.w = arg0.gFloat();
		this.x = arg0.gFloat();
		this.y = arg0.gFloat();
		this.z = arg0.gFloat();
	}

	@ObfuscatedName("ov.w(Lalw;)V")
	public void decode(Packet arg0) {
		this.w = arg0.gFloat();
		this.x = arg0.gFloat();
		this.y = arg0.gFloat();
		this.z = arg0.gFloat();
	}

	@ObfuscatedName("ov.l(FFFF)V")
	public void setTo(float arg0, float arg1, float arg2, float arg3) {
		this.w = arg0;
		this.x = arg1;
		this.y = arg2;
		this.z = arg3;
	}

	@ObfuscatedName("ov.u(Lov;)V")
	public void setTo(Quaternion arg0) {
		this.w = arg0.w;
		this.x = arg0.x;
		this.y = arg0.y;
		this.z = arg0.z;
	}

	@ObfuscatedName("ov.z(Lox;F)V")
	public void setToRotation(Vector3 arg0, float arg1) {
		this.setToRotation(arg0.x, arg0.y, arg0.z, arg1);
	}

	@ObfuscatedName("ov.p(FFFF)V")
	public void setToRotation(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) Math.sin((double) (arg3 * 0.5F));
		float var6 = (float) Math.cos((double) (arg3 * 0.5F));
		this.w = arg0 * var5;
		this.x = arg1 * var5;
		this.y = arg2 * var5;
		this.z = var6;
	}

	@ObfuscatedName("ov.d(FFF)V")
	public void setToRotation(float arg0, float arg1, float arg2) {
		this.setToRotation(0.0F, 1.0F, 0.0F, arg0);
		Quaternion var4 = create();
		var4.setToRotation(1.0F, 0.0F, 0.0F, arg1);
		this.multiply(var4);
		var4.setToRotation(0.0F, 0.0F, 1.0F, arg2);
		this.multiply(var4);
		var4.release();
	}

	@ObfuscatedName("ov.c()V")
	public final void setToIdentity() {
		this.y = 0.0F;
		this.x = 0.0F;
		this.w = 0.0F;
		this.z = 1.0F;
	}

	@ObfuscatedName("ov.r()V")
	public final void method6417() {
		this.w = -this.w;
		this.x = -this.x;
		this.y = -this.y;
		this.z = -this.z;
	}

	@ObfuscatedName("ov.v()V")
	public final void opposite() {
		this.w = -this.w;
		this.x = -this.x;
		this.y = -this.y;
	}

	@ObfuscatedName("ov.o(Lov;)Lov;")
	public static final Quaternion opposite(Quaternion arg0) {
		Quaternion var1 = create(arg0);
		var1.opposite();
		return var1;
	}

	@ObfuscatedName("ov.s()V")
	public final void inverse() {
		float var1 = 1.0F / length(this);
		this.w *= var1;
		this.x *= var1;
		this.y *= var1;
		this.z *= var1;
	}

	@ObfuscatedName("ov.y(Lov;)V")
	public final void add(Quaternion arg0) {
		this.w += arg0.w;
		this.x += arg0.x;
		this.y += arg0.y;
		this.z += arg0.z;
	}

	@ObfuscatedName("ov.q(Lov;)F")
	public final float dot(Quaternion arg0) {
		return this.z * arg0.z + this.y * arg0.y + this.x * arg0.x + this.w * arg0.w;
	}

	@ObfuscatedName("ov.x(Lov;Lov;)F")
	public static final float dot(Quaternion arg0, Quaternion arg1) {
		return arg0.dot(arg1);
	}

	@ObfuscatedName("ov.b(Lov;)F")
	public static final float length(Quaternion arg0) {
		return (float) Math.sqrt((double) dot(arg0, arg0));
	}

	@ObfuscatedName("ov.h(Lov;)V")
	public final void multiply(Quaternion arg0) {
		this.setTo(this.y * arg0.x + this.w * arg0.z + this.z * arg0.w - this.x * arg0.y, this.w * arg0.y + this.z * arg0.x + (this.x * arg0.z - this.y * arg0.w), this.z * arg0.y + (this.y * arg0.z + this.x * arg0.w - this.w * arg0.x), this.z * arg0.z - this.w * arg0.w - this.x * arg0.x - this.y * arg0.y);
	}

	@ObfuscatedName("ov.a(Lov;Lov;)Lov;")
	public static final Quaternion multiply(Quaternion arg0, Quaternion arg1) {
		Quaternion var2 = create(arg0);
		var2.multiply(arg1);
		return var2;
	}

	@ObfuscatedName("ov.g(F)V")
	public final void scale(float arg0) {
		this.w *= arg0;
		this.x *= arg0;
		this.y *= arg0;
		this.z *= arg0;
	}

	@ObfuscatedName("ov.i(Lov;F)Lov;")
	public static final Quaternion scale(Quaternion arg0, float arg1) {
		Quaternion var2 = create(arg0);
		var2.scale(arg1);
		return var2;
	}

	@ObfuscatedName("ov.j(Lov;F)V")
	public final void method6428(Quaternion arg0, float arg1) {
		if (this.dot(arg0) < 0.0F) {
			this.method6417();
		}
		this.scale(1.0F - arg1);
		Quaternion var3 = scale(arg0, arg1);
		this.add(var3);
		var3.release();
		this.inverse();
	}

	public boolean equals(Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Quaternion) {
			Quaternion var2 = (Quaternion) arg0;
			return this.w == var2.w && this.x == var2.x && this.y == var2.y && this.z == var2.z;
		} else {
			return false;
		}
	}

	public String toString() {
		return this.w + "," + this.x + "," + this.y + "," + this.z;
	}
}

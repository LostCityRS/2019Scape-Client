package com.jagex.math;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("ox")
public class Vector3 {

	@ObfuscatedName("ox.e")
	public static Vector3[] pool;

    @ObfuscatedName("ox.n")
    public static int poolCapacity;

	@ObfuscatedName("ox.m")
	public static int poolSize;

	@ObfuscatedName("ox.k")
	public float x;

	@ObfuscatedName("ox.f")
	public float y;

	@ObfuscatedName("ox.w")
	public float z;

	static {
		new Vector3(0.0F, 0.0F, 0.0F);
		new Vector3(1.0F, 1.0F, 1.0F);
		pool = new Vector3[0];
	}

	@ObfuscatedName("ox.e(I)V")
	public static void init(int arg0) {
		poolCapacity = arg0;
		pool = new Vector3[arg0];
		poolSize = 0;
	}

	@ObfuscatedName("ox.n()Lox;")
	public static Vector3 create() {
		Vector3[] var0 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Vector3();
			} else {
				pool[--poolSize].reset();
				return pool[poolSize];
			}
		}
	}

	@ObfuscatedName("ox.m(FFF)Lox;")
	public static Vector3 create(float arg0, float arg1, float arg2) {
		Vector3[] var3 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Vector3(arg0, arg1, arg2);
			} else {
				pool[--poolSize].setTo(arg0, arg1, arg2);
				return pool[poolSize];
			}
		}
	}

	@ObfuscatedName("ox.k(Lox;)Lox;")
	public static Vector3 create(Vector3 arg0) {
		Vector3[] var1 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Vector3(arg0);
			} else {
				pool[--poolSize].setTo(arg0);
				return pool[poolSize];
			}
		}
	}

	@ObfuscatedName("ox.f(Lalw;)Lox;")
	public static Vector3 create(Packet arg0) {
		Vector3[] var1 = pool;
		synchronized (pool) {
			if (poolSize == 0) {
				return new Vector3(arg0);
			} else {
				pool[--poolSize].decode(arg0);
				return pool[poolSize];
			}
		}
	}

	@ObfuscatedName("ox.w()V")
	public void release() {
		Vector3[] var1 = pool;
		synchronized (pool) {
			if (poolSize < poolCapacity - 1) {
				pool[poolSize++] = this;
			}
		}
	}

	public Vector3() {
	}

	public Vector3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3(Vector3 vector3) {
		this.x = vector3.x;
		this.y = vector3.y;
		this.z = vector3.z;
	}

	public Vector3(Packet buf) {
		this.x = buf.gFloat();
		this.y = buf.gFloat();
		this.z = buf.gFloat();
	}

	@ObfuscatedName("ox.l(Lalw;)V")
	public void decode(Packet buf) {
		this.x = buf.gFloat();
		this.y = buf.gFloat();
		this.z = buf.gFloat();
	}

	@ObfuscatedName("ox.u(FFF)V")
	public void setTo(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@ObfuscatedName("ox.z(Lox;)V")
	public void setTo(Vector3 vector3) {
		this.setTo(vector3.x, vector3.y, vector3.z);
	}

	@ObfuscatedName("ox.p()V")
	public final void reset() {
		this.z = 0.0F;
		this.y = 0.0F;
		this.x = 0.0F;
	}

	@ObfuscatedName("ox.d(Lox;)Z")
	public boolean isEqualTo(Vector3 other) {
		return this.x == other.x && this.y == other.y && this.z == other.z;
	}

	@ObfuscatedName("ox.c()V")
	public final void negate() {
		this.x = -this.x;
		this.y = -this.y;
		this.z = -this.z;
	}

	@ObfuscatedName("ox.r()V")
	public final void normalise() {
		float var1 = 1.0F / this.length();
		this.x *= var1;
		this.y *= var1;
		this.z *= var1;
	}

	@ObfuscatedName("ox.v(Lox;)V")
	public final void add(Vector3 other) {
		this.x += other.x;
		this.y += other.y;
		this.z += other.z;
	}

	@ObfuscatedName("ox.o(Lox;F)V")
	public final void addScaled(Vector3 other, float factor) {
		this.x += other.x * factor;
		this.y += other.y * factor;
		this.z += other.z * factor;
	}

	@ObfuscatedName("ox.s(Lox;Lox;)Lox;")
	public static final Vector3 add(Vector3 a, Vector3 b) {
		Vector3 var2 = create(a);
		var2.add(b);
		return var2;
	}

	@ObfuscatedName("ox.y(Lox;)V")
	public final void sub(Vector3 other) {
		this.x -= other.x;
		this.y -= other.y;
		this.z -= other.z;
	}

	@ObfuscatedName("ox.q(Lox;Lox;)Lox;")
	public static final Vector3 sub(Vector3 a, Vector3 b) {
		Vector3 var2 = create(a);
		var2.sub(b);
		return var2;
	}

	@ObfuscatedName("ox.x(Lox;)F")
	public final float dot(Vector3 other) {
		return this.z * other.z + this.y * other.y + this.x * other.x;
	}

	@ObfuscatedName("ox.b(Lox;Lox;)F")
	public static final float dot(Vector3 a, Vector3 b) {
		return a.dot(b);
	}

	@ObfuscatedName("ox.h(Lox;)V")
	public final void cross(Vector3 other) {
		this.setTo(this.y * other.z - this.z * other.y, this.z * other.x - this.x * other.z, this.x * other.y - this.y * other.x);
	}

	@ObfuscatedName("ox.a(Lox;Lox;)Lox;")
	public static final Vector3 cross(Vector3 a, Vector3 b) {
		Vector3 var2 = create(a);
		var2.cross(b);
		return var2;
	}

	@ObfuscatedName("ox.g()F")
	public final float length() {
		return (float) Math.sqrt((double) (this.z * this.z + this.y * this.y + this.x * this.x));
	}

	@ObfuscatedName("ox.i()V")
	public final void abs() {
		if (this.x < 0.0F) {
			this.x *= -1.0F;
		}
		if (this.y < 0.0F) {
			this.y *= -1.0F;
		}
		if (this.z < 0.0F) {
			this.z *= -1.0F;
		}
	}

	@ObfuscatedName("ox.j(Lox;)V")
	public final void multiply(Vector3 other) {
		this.x *= other.x;
		this.y *= other.y;
		this.z *= other.z;
	}

	@ObfuscatedName("ox.t(Lox;Lox;)Lox;")
	public static final Vector3 multiply(Vector3 a, Vector3 b) {
		Vector3 var2 = create(a);
		var2.multiply(b);
		return var2;
	}

	@ObfuscatedName("ox.ae(F)V")
	public final void multiply(float arg0) {
		this.x *= arg0;
		this.y *= arg0;
		this.z *= arg0;
	}

	@ObfuscatedName("ox.ag(Lox;)V")
	public final void divide(Vector3 arg0) {
		this.x /= arg0.x;
		this.y /= arg0.y;
		this.z /= arg0.z;
	}

	@ObfuscatedName("ox.ah(Lox;Lox;)Lox;")
	public static final Vector3 divide(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = create(arg0);
		var2.divide(arg1);
		return var2;
	}

	@ObfuscatedName("ox.al(F)V")
	public final void divide(float arg0) {
		this.x /= arg0;
		this.y /= arg0;
		this.z /= arg0;
	}

	@ObfuscatedName("ox.ac(Lox;F)Lox;")
	public static final Vector3 multiply(Vector3 arg0, float arg1) {
		Vector3 var2 = create(arg0);
		var2.multiply(arg1);
		return var2;
	}

	@ObfuscatedName("ox.ai(Lov;)V")
	public final void rotate(Quaternion arg0) {
		Quaternion var2 = Quaternion.create(this.x, this.y, this.z, 0.0F);
		Quaternion var3 = Quaternion.opposite(arg0);
		Quaternion var4 = Quaternion.multiply(var3, var2);
		var4.multiply(arg0);
		this.setTo(var4.w, var4.x, var4.y);
		var2.release();
		var3.release();
		var4.release();
	}

	@ObfuscatedName("ox.aw(Lou;)V")
	public final void method6567(Matrix4x3 arg0) {
		float var2 = this.x;
		float var3 = this.y;
		this.x = this.z * arg0.entry20 + arg0.entry10 * var3 + arg0.entry00 * var2 + arg0.entry30;
		this.y = this.z * arg0.entry21 + arg0.entry11 * var3 + arg0.entry01 * var2 + arg0.entry31;
		this.z = this.z * arg0.entry22 + arg0.entry12 * var3 + arg0.entry02 * var2 + arg0.entry32;
	}

	@ObfuscatedName("ox.as(Lou;)V")
	public final void method6521(Matrix4x3 arg0) {
		float var2 = this.x;
		float var3 = this.y;
		this.x = this.z * arg0.entry20 + arg0.entry10 * var3 + arg0.entry00 * var2;
		this.y = this.z * arg0.entry21 + arg0.entry11 * var3 + arg0.entry01 * var2;
		this.z = this.z * arg0.entry22 + arg0.entry12 * var3 + arg0.entry02 * var2;
	}

	@ObfuscatedName("ox.at(Lox;F)V")
	public final void method6562(Vector3 arg0, float arg1) {
		this.multiply(1.0F - arg1);
		this.add(multiply(arg0, arg1));
	}

	public String toString() {
		return this.x + ", " + this.y + ", " + this.z;
	}
}

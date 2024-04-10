package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.game.client.GameShell;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.*;
import deob.ObfuscatedName;

@ObfuscatedName("ano")
public abstract class LookatSpline extends Lookat {

	@ObfuscatedName("ano.n")
	public Spline[] field11872;

	@ObfuscatedName("ano.m")
	public float[] field11869;

	@ObfuscatedName("ano.k")
	public int field11870 = 0;

	@ObfuscatedName("ano.f")
	public float field11873 = 0.0F;

	@ObfuscatedName("ano.w")
	public float field11871 = 0.0F;

	@ObfuscatedName("ano.l")
	public int[] field11868;

	public LookatSpline(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("ano.q(Lpe;IFI)V")
	public void method18832(Spline arg0, int arg1, float arg2) {
		if (this.field11872 == null) {
			this.field11872 = new Spline[] { arg0 };
			this.field11869 = new float[] { arg2 };
			this.field11868 = new int[] { arg1 };
			return;
		}
		Spline[] var4 = new Spline[this.field11872.length + 1];
		float[] var5 = new float[this.field11872.length + 1];
		int[] var6 = new int[this.field11872.length + 1];
		System.arraycopy(this.field11872, 0, var4, 0, this.field11872.length);
		System.arraycopy(this.field11869, 0, var5, 0, this.field11872.length);
		System.arraycopy(this.field11868, 0, var6, 0, this.field11872.length);
		this.field11872 = var4;
		this.field11869 = var5;
		this.field11868 = var6;
		this.field11872[this.field11872.length - 1] = arg0;
		this.field11869[this.field11869.length - 1] = arg2;
		this.field11868[this.field11868.length - 1] = arg1;
	}

	@ObfuscatedName("ano.e(FB)V")
	public void method14131(float arg0) {
		Spline var2 = this.field11872[this.field11870];
		if (this.field11869[this.field11870] > 0.0F) {
			if (this.field11869[this.field11870] >= arg0) {
				this.field11869[this.field11870] -= arg0;
				return;
			}
			arg0 -= this.field11869[this.field11870];
			this.field11869[this.field11870] = 0.0F;
		}
		float var3 = 1.0F / (float) GameShell.getLogicRate();
		while (arg0 > 0.0F) {
			float var4 = var2.method6764();
			if (this.field11873 >= var4) {
				if (this.field11870 + 1 == this.field11872.length) {
					return;
				}
				if (this.field11869[this.field11870 + 1] >= arg0) {
					this.field11869[this.field11870 + 1] -= arg0;
					return;
				}
				this.field11870++;
				arg0 -= this.field11869[this.field11870];
				this.field11869[this.field11870] = 0.0F;
				this.method18836();
				this.field11873 = 0.0F;
				this.field11871 = 0.0F;
				var2 = this.field11872[this.field11870];
				var4 = var2.method6764();
			}
			while (arg0 > 0.0F && this.field11873 < var4) {
				this.field11871 = this.method18835(var4, this.field11871, Math.min(arg0, var3));
				arg0 -= var3;
				this.method18834(this.field11871, var4);
			}
		}
	}

	@ObfuscatedName("ano.x(FFI)V")
	public void method18834(float arg0, float arg1) {
		this.field11873 += arg0;
		if (this.field11873 > arg1) {
			this.field11873 = arg1;
		}
	}

	@ObfuscatedName("ano.n(I)Z")
	public boolean method14145() {
		return this.field11872 != null;
	}

	@ObfuscatedName("ano.m(I)Lox;")
	public Vector3 method14133() {
		Vector3 var1 = Vector3.create();
		double[] var2 = this.field11872[this.field11870].method6765(this.field11873);
		var1.x = (float) var2[0];
		var1.y = (float) var2[1];
		var1.z = (float) var2[2];
		return var1;
	}

	@ObfuscatedName("ano.a(I)[D")
	public double[] method18837() {
		return this.field11872[this.field11870].method6765(this.field11873);
	}

	@ObfuscatedName("ano.k(I)Lox;")
	public Vector3 method14135() {
		return this.method14133();
	}

	@ObfuscatedName("ano.f(Lju;Lou;IIFB)V")
	public void method14136(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3, float arg4) {
		double[] var6 = this.camera.method4715();
		var6[0] -= arg2;
		var6[2] -= arg3;
		double[] var7 = this.method18837();
		var7[0] -= arg2;
		var7[2] -= arg3;
		var6[1] *= -1.0D;
		var7[1] *= -1.0D;
		Vector3 var8 = Vector3.create();
		var8.x = (float) (var7[0] - var6[0]);
		var8.y = (float) (var7[1] - var6[1]);
		var8.z = (float) (var7[2] - var6[2]);
		var8.normalise();
		Quaternion var9 = new Quaternion();
		var9.setToRotation(var8, arg4);
		Vector3 var10 = Vector3.create(0.0F, 1.0F, 0.0F);
		Vector3 var11 = Vector3.cross(var8, var10);
		Vector3 var12 = Vector3.cross(var11, var8);
		var12.rotate(var9);
		arg1.setToCameraTransform(var6[0], var6[1], var6[2], var7[0], var7[1], var7[2], var12.x, var12.y, var12.z);
		var12.release();
	}

	@ObfuscatedName("ano.w(Lalw;I)V")
	public void decode(Packet buf) {
		this.field11873 = 0.0F;
		this.field11871 = 0.0F;
		this.field11870 = 0;
		int var2 = buf.g1();
		this.field11872 = new Spline[var2];
		this.field11869 = new float[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			this.field11872[var3] = new Spline(buf);
			this.field11869[var3] = buf.gFloat();
		}
		this.method18839(buf, var2);
	}

	@ObfuscatedName("ano.b(FFFI)F")
	public abstract float method18835(float arg0, float arg1, float arg2);

	@ObfuscatedName("ano.h(I)V")
	public abstract void method18836();

	@ObfuscatedName("ano.g(Lalw;IB)V")
	public abstract void method18839(Packet arg0, int arg1);
}

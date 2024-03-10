package com.jagex;

import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

import java.nio.ByteBuffer;

@ObfuscatedName("aiy")
public class Direct3DTexture extends class408 implements GpuTexture {

	@ObfuscatedName("aiy.w")
	public final int field10665;

	@ObfuscatedName("aiy.l")
	public final int field10666;

	@ObfuscatedName("aiy.u")
	public final float field10667;

	@ObfuscatedName("aiy.z")
	public final float field10668;

	@ObfuscatedName("aiy.p")
	public boolean field10669;

	@ObfuscatedName("aiy.d")
	public boolean field10670;

	public Direct3DTexture(Direct3DRenderer arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, 0, 1);
	}

	public Direct3DTexture(Direct3DRenderer arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.field4219.field11975) {
			this.field10665 = arg3;
			this.field10666 = arg4;
			this.field10667 = 1.0F;
			this.field10668 = 1.0F;
		} else {
			this.field10665 = IntMath.method16657(arg3);
			this.field10666 = IntMath.method16657(arg4);
			this.field10667 = (float) arg3 / (float) this.field10665;
			this.field10668 = (float) arg4 / (float) this.field10666;
		}
		this.field4217 = IDirect3DDevice.CreateTexture(this.field4219.device, this.field10665, this.field10666, 0, arg5, Direct3DRenderer.method19011(this.field4221, this.field4218), arg6);
	}

	public Direct3DTexture(Direct3DRenderer arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		super(arg0, TextureFormat.field1273, DataType.UNSIGNED_INT_8, arg3 && arg0.field11976, arg1 * arg2);
		if (this.field4219.field11975) {
			this.field10665 = arg1;
			this.field10666 = arg2;
			this.field10667 = 1.0F;
			this.field10668 = 1.0F;
		} else {
			this.field10665 = IntMath.method16657(arg1);
			this.field10666 = IntMath.method16657(arg2);
			this.field10667 = (float) arg1 / (float) this.field10665;
			this.field10668 = (float) arg2 / (float) this.field10666;
			if (this.field10665 != arg1 || this.field10666 != arg2) {
				arg4 = this.field4219.method2250(arg1, arg2, this.field10665, this.field10666, arg4, arg5, arg6);
				arg5 = 0;
				arg6 = this.field10665;
			}
		}
		if (arg3) {
			this.field4217 = IDirect3DDevice.CreateTexture(this.field4219.device, this.field10665, this.field10666, 0, 1024, 21, 1);
		} else {
			this.field4217 = IDirect3DDevice.CreateTexture(this.field4219.device, this.field10665, this.field10666, 1, 0, 21, 1);
		}
		if (arg6 == 0) {
			arg6 = this.field10665;
		}
		this.field4219.method15961(this.field4221.field1279 * this.field10666 * arg6);
		ByteBuffer var8 = this.field4219.field10071;
		var8.clear();
		var8.asIntBuffer().put(arg4, arg5, this.field10666 * arg6);
		IDirect3DTexture.Upload(this.field4217, 0, 0, 0, this.field10665, this.field10666, this.field4221.field1279 * arg6, 0, this.field4219.field10046);
	}

	public Direct3DTexture(Direct3DRenderer arg0, TextureFormat arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
		super(arg0, arg1, DataType.UNSIGNED_INT_8, arg4 && arg0.field11976, arg2 * arg3);
		if (this.field4219.field11975) {
			this.field10665 = arg2;
			this.field10666 = arg3;
			this.field10667 = 1.0F;
			this.field10668 = 1.0F;
		} else {
			this.field10665 = IntMath.method16657(arg2);
			this.field10666 = IntMath.method16657(arg3);
			this.field10667 = (float) arg2 / (float) this.field10665;
			this.field10668 = (float) arg3 / (float) this.field10666;
			if (this.field10665 != arg2 || this.field10666 != arg3) {
				arg5 = this.field4219.method2256(arg2, arg3, this.field10665, this.field10666, arg5, arg6, arg7, arg1.field1279);
				arg6 = 0;
				arg7 = this.field10665;
			}
		}
		if (arg4) {
			this.field4217 = IDirect3DDevice.CreateTexture(this.field4219.device, this.field10665, this.field10666, 0, 1024, Direct3DRenderer.method19011(this.field4221, DataType.UNSIGNED_INT_8), 1);
		} else {
			this.field4217 = IDirect3DDevice.CreateTexture(this.field4219.device, this.field10665, this.field10666, 1, 0, Direct3DRenderer.method19011(this.field4221, DataType.UNSIGNED_INT_8), 1);
		}
		if (arg7 == 0) {
			arg7 = this.field10665;
		}
		this.field4219.method15961(this.field4221.field1279 * this.field10666 * arg7);
		ByteBuffer var9 = this.field4219.field10071;
		var9.clear();
		if (TextureFormat.field1276 == this.field4221) {
			var9.put(arg5, arg6, this.field10666 * this.field10665 / 2);
			IDirect3DTexture.Upload(this.field4217, 0, 0, 0, this.field10665, this.field10666 / 4, this.field10665 / 4 * 8, 0, this.field4219.field10046);
		} else if (TextureFormat.field1277 == this.field4221) {
			var9.put(arg5, arg6, this.field10666 * this.field10665);
			IDirect3DTexture.Upload(this.field4217, 0, 0, 0, this.field10665, this.field10666 / 4, this.field10665 / 4 * 16, 0, this.field4219.field10046);
		} else {
			var9.put(arg5, arg6, this.field10666 * arg7);
			IDirect3DTexture.Upload(this.field4217, 0, 0, 0, this.field10665, this.field10666, this.field4221.field1279 * arg7, 0, this.field4219.field10046);
		}
	}

	public Direct3DTexture(Direct3DRenderer arg0, TextureFormat arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
		super(arg0, arg1, DataType.UNSIGNED_INT_8, arg4 && arg0.field11976, arg2 * arg3);
		if (this.field4219.field11975) {
			this.field10665 = arg2;
			this.field10666 = arg3;
			this.field10667 = 1.0F;
			this.field10668 = 1.0F;
		} else {
			this.field10665 = IntMath.method16657(arg2);
			this.field10666 = IntMath.method16657(arg3);
			this.field10667 = (float) arg2 / (float) this.field10665;
			this.field10668 = (float) arg3 / (float) this.field10666;
			if (this.field10665 != arg2 || this.field10666 != arg3) {
				arg5 = this.field4219.method2230(arg2, arg3, this.field10665, this.field10666, arg5, arg6, arg7, arg1.field1279);
				arg6 = 0;
				arg7 = this.field10665;
			}
		}
		if (arg4) {
			this.field4217 = IDirect3DDevice.CreateTexture(this.field4219.device, this.field10665, this.field10666, 0, 1024, Direct3DRenderer.method19011(this.field4221, DataType.FLOAT_32), 1);
		} else {
			this.field4217 = IDirect3DDevice.CreateTexture(this.field4219.device, this.field10665, this.field10666, 1, 0, Direct3DRenderer.method19011(this.field4221, DataType.FLOAT_32), 1);
		}
		if (arg7 == 0) {
			arg7 = this.field10665;
		}
		this.field4219.method15961(this.field4221.field1279 * this.field10666 * arg7 * 4);
		ByteBuffer var9 = this.field4219.field10071;
		var9.clear();
		var9.asFloatBuffer().put(arg5, arg6, this.field4221.field1279 * this.field10666 * arg7);
		IDirect3DTexture.Upload(this.field4217, 0, 0, 0, this.field10665, this.field10666, this.field4221.field1279 * arg7 * 4, 0, this.field4219.field10046);
	}

	@ObfuscatedName("aiy.e()I")
	public int method5718() {
		return this.field10665;
	}

	@ObfuscatedName("aiy.n()I")
	public int method5696() {
		return this.field10666;
	}

	@ObfuscatedName("aiy.k(F)F")
	public float method5697(float arg0) {
		return arg0 / (float) this.field10665;
	}

	@ObfuscatedName("aiy.f(F)F")
	public float method5698(float arg0) {
		return arg0 / (float) this.field10666;
	}

	@ObfuscatedName("aiy.v()F")
	public float method5734() {
		return this.field10667;
	}

	@ObfuscatedName("aiy.o()F")
	public float method5707() {
		return this.field10668;
	}

	@ObfuscatedName("aiy.w()Z")
	public boolean method5732() {
		return true;
	}

	@ObfuscatedName("aiy.bl()J")
	public long method6225() {
		return this.field4217;
	}

	@ObfuscatedName("aiy.ay(Llt;)V")
	public void method5824(class343 arg0) {
		super.method5824(arg0);
	}

	@ObfuscatedName("aiy.l(ZZ)V")
	public void method5700(boolean arg0, boolean arg1) {
		this.field10669 = arg0;
		this.field10670 = arg1;
	}

	@ObfuscatedName("aiy.z(IIII[III)V")
	public void method5701(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		if (TextureFormat.field1273 != this.field4221 || DataType.UNSIGNED_INT_8 != this.field4218) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.field4219.method15961(this.field4221.field1279 * arg3 * arg6);
		ByteBuffer var8 = this.field4219.field10071;
		var8.clear();
		var8.asIntBuffer().put(arg4, arg5, arg3 * arg6);
		IDirect3DTexture.Upload(this.field4217, 0, arg0, arg1, arg2, arg3, this.field4221.field1279 * arg6, 0, this.field4219.field10046);
	}

	@ObfuscatedName("aiy.p(IIII[BLck;II)V")
	public void method5712(int arg0, int arg1, int arg2, int arg3, byte[] arg4, TextureFormat arg5, int arg6, int arg7) {
		if (this.field4221 != arg5 || DataType.UNSIGNED_INT_8 != this.field4218) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.field4219.method15961(this.field4221.field1279 * arg3 * arg7);
		ByteBuffer var9 = this.field4219.field10071;
		var9.clear();
		var9.put(arg4, arg6, arg3 * arg7);
		IDirect3DTexture.Upload(this.field4217, 0, arg0, arg1, arg2, arg3, this.field4221.field1279 * arg7, 0, this.field4219.field10046);
	}

	@ObfuscatedName("aiy.d(IIII[II)V")
	public void method5703(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		if (TextureFormat.field1273 != this.field4221 || DataType.UNSIGNED_INT_8 != this.field4218) {
			throw new RuntimeException();
		}
		this.field4219.method15961(arg2 * arg3 * 4);
		ByteBuffer var7 = this.field4219.field10071;
		var7.clear();
		IDirect3DTexture.Download(this.field4217, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.field4219.field10046);
		var7.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@ObfuscatedName("aiy.c(IIII[I[II)V")
	public void method5704(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6) {
		if (TextureFormat.field1273 != this.field4221 || DataType.UNSIGNED_INT_8 != this.field4218) {
			throw new RuntimeException();
		}
		this.method5704(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@ObfuscatedName("aiy.r(IIIIII)V")
	public void method5719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int[] var7 = this.field4219.method2149(arg4, arg5, arg2, arg3);
		if (var7 != null) {
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] |= 0xFF000000;
			}
			this.method5701(arg0, arg1, arg2, arg3, var7, 0, arg2);
		}
	}

	@ObfuscatedName("aiy.aj()V")
	public void method5823() {
		this.field4219.method19002(this);
	}

	@ObfuscatedName("aiy.s()Z")
	public boolean method5708() {
		return false;
	}

	@ObfuscatedName("aiy.m()V")
	public void method1010() {
		super.method1010();
	}
}

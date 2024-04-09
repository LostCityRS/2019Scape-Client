package com.jagex.graphics.dx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.GpuTexture;
import com.jagex.graphics.GpuTextureRelated;
import com.jagex.graphics.TextureFormat;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

import java.nio.ByteBuffer;

@ObfuscatedName("aiy")
public class DxTexture extends DxBaseTexture implements GpuTexture {

	@ObfuscatedName("aiy.w")
	public final int width;

	@ObfuscatedName("aiy.l")
	public final int height;

	@ObfuscatedName("aiy.u")
	public final float field10667;

	@ObfuscatedName("aiy.z")
	public final float field10668;

	@ObfuscatedName("aiy.p")
	public boolean field10669;

	@ObfuscatedName("aiy.d")
	public boolean field10670;

	public DxTexture(DxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, 0, 1);
	}

	public DxTexture(DxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.renderer.field11975) {
			this.width = arg3;
			this.height = arg4;
			this.field10667 = 1.0F;
			this.field10668 = 1.0F;
		} else {
			this.width = IntMath.bitceil(arg3);
			this.height = IntMath.bitceil(arg4);
			this.field10667 = (float) arg3 / (float) this.width;
			this.field10668 = (float) arg4 / (float) this.height;
		}
		this.field4217 = IDirect3DDevice.CreateTexture(this.renderer.device, this.width, this.height, 0, arg5, DxToolkit.getD3DFormat(this.format, this.field4218), arg6);
	}

	public DxTexture(DxToolkit arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		super(arg0, TextureFormat.RGBA, DataType.UNSIGNED_INT_8, arg3 && arg0.field11976, arg1 * arg2);
		if (this.renderer.field11975) {
			this.width = arg1;
			this.height = arg2;
			this.field10667 = 1.0F;
			this.field10668 = 1.0F;
		} else {
			this.width = IntMath.bitceil(arg1);
			this.height = IntMath.bitceil(arg2);
			this.field10667 = (float) arg1 / (float) this.width;
			this.field10668 = (float) arg2 / (float) this.height;
			if (this.width != arg1 || this.height != arg2) {
				arg4 = this.renderer.method2250(arg1, arg2, this.width, this.height, arg4, arg5, arg6);
				arg5 = 0;
				arg6 = this.width;
			}
		}
		if (arg3) {
			this.field4217 = IDirect3DDevice.CreateTexture(this.renderer.device, this.width, this.height, 0, 1024, 21, 1);
		} else {
			this.field4217 = IDirect3DDevice.CreateTexture(this.renderer.device, this.width, this.height, 1, 0, 21, 1);
		}
		if (arg6 == 0) {
			arg6 = this.width;
		}
		this.renderer.ensureTemporaryBufferCapacity(this.format.id * this.height * arg6);
		ByteBuffer var8 = this.renderer.temporaryBuffer;
		var8.clear();
		var8.asIntBuffer().put(arg4, arg5, this.height * arg6);
		IDirect3DTexture.Upload(this.field4217, 0, 0, 0, this.width, this.height, this.format.id * arg6, 0, this.renderer.temporaryBufferAddress);
	}

	public DxTexture(DxToolkit arg0, TextureFormat arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
		super(arg0, arg1, DataType.UNSIGNED_INT_8, arg4 && arg0.field11976, arg2 * arg3);
		if (this.renderer.field11975) {
			this.width = arg2;
			this.height = arg3;
			this.field10667 = 1.0F;
			this.field10668 = 1.0F;
		} else {
			this.width = IntMath.bitceil(arg2);
			this.height = IntMath.bitceil(arg3);
			this.field10667 = (float) arg2 / (float) this.width;
			this.field10668 = (float) arg3 / (float) this.height;
			if (this.width != arg2 || this.height != arg3) {
				arg5 = this.renderer.method2256(arg2, arg3, this.width, this.height, arg5, arg6, arg7, arg1.id);
				arg6 = 0;
				arg7 = this.width;
			}
		}
		if (arg4) {
			this.field4217 = IDirect3DDevice.CreateTexture(this.renderer.device, this.width, this.height, 0, 1024, DxToolkit.getD3DFormat(this.format, DataType.UNSIGNED_INT_8), 1);
		} else {
			this.field4217 = IDirect3DDevice.CreateTexture(this.renderer.device, this.width, this.height, 1, 0, DxToolkit.getD3DFormat(this.format, DataType.UNSIGNED_INT_8), 1);
		}
		if (arg7 == 0) {
			arg7 = this.width;
		}
		this.renderer.ensureTemporaryBufferCapacity(this.format.id * this.height * arg7);
		ByteBuffer var9 = this.renderer.temporaryBuffer;
		var9.clear();
		if (TextureFormat.COMPRESSED_RGBA_S3TC_DXT1 == this.format) {
			var9.put(arg5, arg6, this.height * this.width / 2);
			IDirect3DTexture.Upload(this.field4217, 0, 0, 0, this.width, this.height / 4, this.width / 4 * 8, 0, this.renderer.temporaryBufferAddress);
		} else if (TextureFormat.COMPRESSED_RGBA_S3TC_DXT5 == this.format) {
			var9.put(arg5, arg6, this.height * this.width);
			IDirect3DTexture.Upload(this.field4217, 0, 0, 0, this.width, this.height / 4, this.width / 4 * 16, 0, this.renderer.temporaryBufferAddress);
		} else {
			var9.put(arg5, arg6, this.height * arg7);
			IDirect3DTexture.Upload(this.field4217, 0, 0, 0, this.width, this.height, this.format.id * arg7, 0, this.renderer.temporaryBufferAddress);
		}
	}

	public DxTexture(DxToolkit arg0, TextureFormat arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
		super(arg0, arg1, DataType.UNSIGNED_INT_8, arg4 && arg0.field11976, arg2 * arg3);
		if (this.renderer.field11975) {
			this.width = arg2;
			this.height = arg3;
			this.field10667 = 1.0F;
			this.field10668 = 1.0F;
		} else {
			this.width = IntMath.bitceil(arg2);
			this.height = IntMath.bitceil(arg3);
			this.field10667 = (float) arg2 / (float) this.width;
			this.field10668 = (float) arg3 / (float) this.height;
			if (this.width != arg2 || this.height != arg3) {
				arg5 = this.renderer.method2230(arg2, arg3, this.width, this.height, arg5, arg6, arg7, arg1.id);
				arg6 = 0;
				arg7 = this.width;
			}
		}
		if (arg4) {
			this.field4217 = IDirect3DDevice.CreateTexture(this.renderer.device, this.width, this.height, 0, 1024, DxToolkit.getD3DFormat(this.format, DataType.FLOAT_32), 1);
		} else {
			this.field4217 = IDirect3DDevice.CreateTexture(this.renderer.device, this.width, this.height, 1, 0, DxToolkit.getD3DFormat(this.format, DataType.FLOAT_32), 1);
		}
		if (arg7 == 0) {
			arg7 = this.width;
		}
		this.renderer.ensureTemporaryBufferCapacity(this.format.id * this.height * arg7 * 4);
		ByteBuffer var9 = this.renderer.temporaryBuffer;
		var9.clear();
		var9.asFloatBuffer().put(arg5, arg6, this.format.id * this.height * arg7);
		IDirect3DTexture.Upload(this.field4217, 0, 0, 0, this.width, this.height, this.format.id * arg7 * 4, 0, this.renderer.temporaryBufferAddress);
	}

	@ObfuscatedName("aiy.e()I")
	public int getWidth() {
		return this.width;
	}

	@ObfuscatedName("aiy.n()I")
	public int getHeight() {
		return this.height;
	}

	@ObfuscatedName("aiy.k(F)F")
	public float getU(float arg0) {
		return arg0 / (float) this.width;
	}

	@ObfuscatedName("aiy.f(F)F")
	public float getV(float arg0) {
		return arg0 / (float) this.height;
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
	public void method5824(GpuTextureRelated arg0) {
		super.method5824(arg0);
	}

	@ObfuscatedName("aiy.l(ZZ)V")
	public void setWarp(boolean arg0, boolean arg1) {
		this.field10669 = arg0;
		this.field10670 = arg1;
	}

	@ObfuscatedName("aiy.z(IIII[III)V")
	public void upload(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		if (TextureFormat.RGBA != this.format || DataType.UNSIGNED_INT_8 != this.field4218) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.renderer.ensureTemporaryBufferCapacity(this.format.id * arg3 * arg6);
		ByteBuffer var8 = this.renderer.temporaryBuffer;
		var8.clear();
		var8.asIntBuffer().put(arg4, arg5, arg3 * arg6);
		IDirect3DTexture.Upload(this.field4217, 0, arg0, arg1, arg2, arg3, this.format.id * arg6, 0, this.renderer.temporaryBufferAddress);
	}

	@ObfuscatedName("aiy.p(IIII[BLck;II)V")
	public void upload(int arg0, int arg1, int arg2, int arg3, byte[] arg4, TextureFormat arg5, int arg6, int arg7) {
		if (this.format != arg5 || DataType.UNSIGNED_INT_8 != this.field4218) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.renderer.ensureTemporaryBufferCapacity(this.format.id * arg3 * arg7);
		ByteBuffer var9 = this.renderer.temporaryBuffer;
		var9.clear();
		var9.put(arg4, arg6, arg3 * arg7);
		IDirect3DTexture.Upload(this.field4217, 0, arg0, arg1, arg2, arg3, this.format.id * arg7, 0, this.renderer.temporaryBufferAddress);
	}

	@ObfuscatedName("aiy.d(IIII[II)V")
	public void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		if (TextureFormat.RGBA != this.format || DataType.UNSIGNED_INT_8 != this.field4218) {
			throw new RuntimeException();
		}
		this.renderer.ensureTemporaryBufferCapacity(arg2 * arg3 * 4);
		ByteBuffer var7 = this.renderer.temporaryBuffer;
		var7.clear();
		IDirect3DTexture.Download(this.field4217, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.renderer.temporaryBufferAddress);
		var7.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@ObfuscatedName("aiy.c(IIII[I[II)V")
	public void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6) {
		if (TextureFormat.RGBA != this.format || DataType.UNSIGNED_INT_8 != this.field4218) {
			throw new RuntimeException();
		}
		this.download(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@ObfuscatedName("aiy.r(IIIIII)V")
	public void upload(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int[] var7 = this.renderer.method2149(arg4, arg5, arg2, arg3);
		if (var7 != null) {
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] |= 0xFF000000;
			}
			this.upload(arg0, arg1, arg2, arg3, var7, 0, arg2);
		}
	}

	@ObfuscatedName("aiy.aj()V")
	public void method5823() {
		this.renderer.method19002(this);
	}

	@ObfuscatedName("aiy.s()Z")
	public boolean method5708() {
		return false;
	}

	@ObfuscatedName("aiy.m()V")
	public void delete() {
		super.delete();
	}
}

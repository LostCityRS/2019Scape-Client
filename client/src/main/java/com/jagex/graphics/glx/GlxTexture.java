package com.jagex.graphics.glx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.*;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aig")
public class GlxTexture extends GlxBaseTexture implements Texture2 {

	@ObfuscatedName("aig.v")
	public final int field10671;

	@ObfuscatedName("aig.o")
	public final int field10672;

	@ObfuscatedName("aig.s")
	public final float field10673;

	@ObfuscatedName("aig.y")
	public final float field10674;

	public GlxTexture(GlxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		if (this.field4980.hasTextureNonPowerOfTwo) {
			this.field10671 = arg3;
			this.field10672 = arg4;
			this.field10673 = 1.0F;
			this.field10674 = 1.0F;
		} else {
			this.field10671 = IntMath.bitceil(arg3);
			this.field10672 = IntMath.bitceil(arg4);
			this.field10673 = (float) arg3 / (float) this.field10671;
			this.field10674 = (float) arg4 / (float) this.field10672;
		}
		this.field4980.setTexture(this);
		OpenGL.glTexImage2Dub(this.field4979, 0, GlxToolkit.method19077(this.field4973, this.field4977), arg3, arg4, 0, GlxToolkit.method19085(this.field4973), GlxToolkit.method19076(this.field4977), null, 0);
	}

	public GlxTexture(GlxToolkit arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		super(arg0, 3553, TextureFormat.RGBA, DataType.UNSIGNED_INT_8, arg1 * arg2, arg3);
		if (this.field4980.hasTextureNonPowerOfTwo) {
			this.field10671 = arg1;
			this.field10672 = arg2;
			this.field10673 = 1.0F;
			this.field10674 = 1.0F;
		} else {
			this.field10671 = IntMath.bitceil(arg1);
			this.field10672 = IntMath.bitceil(arg2);
			this.field10673 = (float) arg1 / (float) this.field10671;
			this.field10674 = (float) arg2 / (float) this.field10672;
			if (this.field10671 != arg1 || this.field10672 != arg2) {
				arg4 = this.field4980.method2250(arg1, arg2, this.field10671, this.field10672, arg4, arg5, arg6);
				arg5 = 0;
				arg6 = this.field10671;
			}
		}
		this.field4980.setTexture(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method7638(this.field4979, arg1, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.field4979, 0, 6408, this.field10671, this.field10672, 0, 32993, this.field4980.field12027, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	public GlxTexture(GlxToolkit arg0, TextureFormat arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
		super(arg0, 3553, arg1, DataType.UNSIGNED_INT_8, arg2 * arg3, arg4);
		if (this.field4980.hasTextureNonPowerOfTwo) {
			this.field10671 = arg2;
			this.field10672 = arg3;
			this.field10673 = 1.0F;
			this.field10674 = 1.0F;
		} else {
			this.field10671 = IntMath.bitceil(arg2);
			this.field10672 = IntMath.bitceil(arg3);
			this.field10673 = (float) arg2 / (float) this.field10671;
			this.field10674 = (float) arg3 / (float) this.field10672;
			if (this.field10671 != arg2 || this.field10672 != arg3) {
				arg5 = this.field4980.method2256(arg2, arg3, this.field10671, this.field10672, arg5, arg6, arg7, arg1.id);
				arg6 = 0;
				arg7 = this.field10671;
			}
		}
		this.field4980.setTexture(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method7634(this.field4979, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			if (TextureFormat.COMPRESSED_RGBA_S3TC_DXT1 == this.field4973) {
				OpenGL.glCompressedTexImage2Dub(this.field4979, 0, 33777, arg2, arg3, 0, arg2 * arg3 / 2, arg5, arg6);
			} else if (TextureFormat.COMPRESSED_RGBA_S3TC_DXT5 == this.field4973) {
				OpenGL.glCompressedTexImage2Dub(this.field4979, 0, 33779, arg2, arg3, 0, arg2 * arg3, arg5, arg6);
			} else {
				OpenGL.glTexImage2Dub(this.field4979, 0, GlxToolkit.method19077(this.field4973, this.field4977), arg2, arg3, 0, GlxToolkit.method19085(this.field4973), 5121, arg5, arg6);
			}
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public GlxTexture(GlxToolkit arg0, TextureFormat arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
		super(arg0, 3553, arg1, DataType.FLOAT_32, arg2 * arg3, arg4);
		if (this.field4980.hasTextureNonPowerOfTwo) {
			this.field10671 = arg2;
			this.field10672 = arg3;
			this.field10673 = 1.0F;
			this.field10674 = 1.0F;
		} else {
			this.field10671 = IntMath.bitceil(arg2);
			this.field10672 = IntMath.bitceil(arg3);
			this.field10673 = (float) arg2 / (float) this.field10671;
			this.field10674 = (float) arg3 / (float) this.field10672;
			if (this.field10671 != arg2 || this.field10672 != arg3) {
				arg5 = this.field4980.method2230(arg2, arg3, this.field10671, this.field10672, arg5, arg6, arg7, arg1.id);
				arg6 = 0;
				arg7 = this.field10671;
			}
		}
		this.field4980.setTexture(this);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method7635(this.field4979, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(this.field4979, 0, GlxToolkit.method19077(this.field4973, this.field4977), arg2, arg3, 0, GlxToolkit.method19085(this.field4973), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@ObfuscatedName("aig.e()I")
	public int getWidth() {
		return this.field10671;
	}

	@ObfuscatedName("aig.n()I")
	public int getHeight() {
		return this.field10672;
	}

	@ObfuscatedName("aig.k(F)F")
	public float getU(float arg0) {
		return arg0 / (float) this.field10671;
	}

	@ObfuscatedName("aig.f(F)F")
	public float getV(float arg0) {
		return arg0 / (float) this.field10672;
	}

	@ObfuscatedName("aig.v()F")
	public float method5734() {
		return this.field10673;
	}

	@ObfuscatedName("aig.o()F")
	public float method5707() {
		return this.field10674;
	}

	@ObfuscatedName("aig.w()Z")
	public boolean method5732() {
		return true;
	}

	@ObfuscatedName("aig.l(ZZ)V")
	public void setWarp(boolean arg0, boolean arg1) {
		this.field4980.setTexture(this);
		OpenGL.glTexParameteri(this.field4979, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.field4979, 10243, arg1 ? 10497 : 33071);
	}

	@ObfuscatedName("aig.z(IIII[III)V")
	public void upload(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.field4980.setTexture(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.field4979, 0, arg0, arg1, arg2, arg3, 32993, this.field4980.field12027, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@ObfuscatedName("aig.p(IIII[BLck;II)V")
	public void upload(int arg0, int arg1, int arg2, int arg3, byte[] arg4, TextureFormat arg5, int arg6, int arg7) {
		this.field4980.setTexture(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.field4979, 0, arg0, arg1, arg2, arg3, GlxToolkit.method19085(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@ObfuscatedName("aig.d(IIII[II)V")
	public void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		this.download(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@ObfuscatedName("aig.c(IIII[I[II)V")
	public void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6) {
		int[] var8 = arg5 == null ? new int[this.field10672 * this.field10671] : arg5;
		this.field4980.setTexture(this);
		OpenGL.glGetTexImagei(this.field4979, 0, 32993, 5121, var8, 0);
		for (int var9 = 0; var9 < arg3; var9++) {
			System.arraycopy(var8, this.field10671 * var9, arg4, arg2 * var9 + arg6, arg2);
		}
	}

	@ObfuscatedName("aig.r(IIIIII)V")
	public void upload(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field4980.setTexture(this);
		RenderTarget var7 = this.field4980.getRenderTarget();
		if (var7 != null) {
			int var8 = var7.getHeight() - (arg3 + arg5);
			int var9 = GlxToolkit.method19077(this.field4973, this.field4977);
			OpenGL.glCopyTexImage2D(this.field4979, 0, var9, arg4, var8, arg2, arg3, 0);
		}
	}

	@ObfuscatedName("aig.ak(I)Ldp;")
	public GraphicsDeletable method5828(int arg0) {
		return new GlxSomethingFramebuffer(this, arg0);
	}

	@ObfuscatedName("aig.s()Z")
	public boolean method5708() {
		return super.method5708();
	}

	@ObfuscatedName("aig.aj()V")
	public void method5823() {
		super.method5823();
	}

	@ObfuscatedName("aig.ay(Llt;)V")
	public void method5824(GpuTextureRelated arg0) {
		super.method5824(arg0);
	}

	@ObfuscatedName("aig.m()V")
	public void delete() {
		super.delete();
	}
}

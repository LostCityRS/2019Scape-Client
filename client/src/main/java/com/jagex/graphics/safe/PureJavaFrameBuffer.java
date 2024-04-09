package com.jagex.graphics.safe;

import com.jagex.graphics.EffectInterface;
import com.jagex.graphics.FrameBuffer;
import com.jagex.graphics.GraphicsDeletable;
import deob.ObfuscatedName;

@ObfuscatedName("apn")
public class PureJavaFrameBuffer extends FrameBuffer {

	@ObfuscatedName("apn.n")
	public PureJavaToolkit renderer;

	@ObfuscatedName("apn.m")
	public PureJavaDepthBuffer depthBuffer;

	@ObfuscatedName("apn.k")
	public PureJavaColorBuffer colorBuffer;

	@ObfuscatedName("apn.f")
	public int width = 0;

	@ObfuscatedName("apn.w")
	public int height = 0;

	public PureJavaFrameBuffer(PureJavaToolkit renderer) {
		this.renderer = renderer;
	}

	@ObfuscatedName("apn.e()I")
	public int getWidth() {
		return this.width;
	}

	@ObfuscatedName("apn.n()I")
	public int getHeight() {
		return this.height;
	}

	@ObfuscatedName("apn.b(ILdp;)V")
	public void method15439(int arg0, GraphicsDeletable arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		PureJavaColorBuffer var3 = (PureJavaColorBuffer) arg1;
		if (this.depthBuffer != null && var3 != null && (this.depthBuffer.field971 != var3.field893 || this.depthBuffer.field972 != var3.field892)) {
			throw new RuntimeException();
		}
		this.colorBuffer = var3;
		if (var3 != null) {
			this.width = var3.field893;
			this.height = var3.field892;
		} else if (this.depthBuffer == null) {
			this.width = 0;
			this.height = 0;
		}
		if (this.renderer.getRenderTarget() == this) {
			this.method1630();
		}
	}

	@ObfuscatedName("apn.x(Ldw;)V")
	public void method15441(EffectInterface arg0) {
		PureJavaDepthBuffer var2 = (PureJavaDepthBuffer) arg0;
		if (this.colorBuffer != null && var2 != null && (this.colorBuffer.field893 != var2.field971 || this.colorBuffer.field892 != var2.field972)) {
			throw new RuntimeException();
		}
		this.depthBuffer = var2;
		if (var2 != null) {
			this.width = var2.field971;
			this.height = var2.field972;
		} else if (this.colorBuffer == null) {
			this.width = 0;
			this.height = 0;
		}
		if (this.renderer.getRenderTarget() == this) {
			this.method1630();
		}
	}

	@ObfuscatedName("apn.h()Z")
	public boolean method15446() {
		return true;
	}

	@ObfuscatedName("apn.k()Z")
	public boolean method1630() {
		this.renderer.method15662(this.width, this.height, this.colorBuffer == null ? null : this.colorBuffer.field891, this.depthBuffer == null ? null : this.depthBuffer.field973);
		return true;
	}

	@ObfuscatedName("apn.f()Z")
	public boolean method1631() {
		return true;
	}

	@ObfuscatedName("apn.a(IIIIIIZZ)V")
	public void method15440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		int[] var9 = null;
		int[] var10 = null;
		float[] var11 = null;
		float[] var12 = null;
		if (arg6 && this.colorBuffer != null) {
			var9 = this.colorBuffer.field891;
			var10 = this.renderer.colour;
		}
		if (arg7 && this.depthBuffer != null) {
			var11 = this.depthBuffer.field973;
			var12 = this.renderer.depth;
		}
		method6069(this.width, this.renderer.sizeX, var9, var10, var11, var12, arg0, arg1, arg4, arg5, arg2, arg3);
	}

	@ObfuscatedName("nr.ac(II[I[I[F[FIIIIIII)V")
	public static void method6069(int arg0, int arg1, int[] arg2, int[] arg3, float[] arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		int var12 = arg0 * arg7 + arg6;
		int var13 = arg1 * arg9 + arg8;
		int var14 = arg0 - arg10;
		int var15 = arg1 - arg10;
		if (arg2 == null) {
			for (int var16 = 0; var16 < arg11; var16++) {
				int var17 = arg10 + var12;
				while (var12 < var17) {
					arg5[var13++] = arg4[var12++];
				}
				var12 += var14;
				var13 += var15;
			}
		} else if (arg4 == null) {
			for (int var18 = 0; var18 < arg11; var18++) {
				int var19 = arg10 + var12;
				while (var12 < var19) {
					arg3[var13++] = arg2[var12++];
				}
				var12 += var14;
				var13 += var15;
			}
		} else {
			for (int var20 = 0; var20 < arg11; var20++) {
				int var21 = arg10 + var12;
				while (var12 < var21) {
					arg3[var13] = arg2[var12];
					arg5[var13++] = arg4[var12++];
				}
				var12 += var14;
				var13 += var15;
			}
		}
	}

	@ObfuscatedName("apn.m()V")
	public void method1629() {
	}
}

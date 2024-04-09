package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;
import sun.misc.Unsafe;

import java.nio.ByteBuffer;

@ObfuscatedName("md")
public class GpuRendererRelated6 {

	@ObfuscatedName("md.e")
	public final GpuToolkit field3389;

	@ObfuscatedName("md.n")
	public GpuImageRelated field3391 = GpuImageRelated.field3235;

	@ObfuscatedName("md.m")
	public GpuImageRelated field3383;

	@ObfuscatedName("md.k")
	public int field3387 = 128;

	@ObfuscatedName("md.f")
	public int field3385 = 0;

	@ObfuscatedName("md.w")
	public float[] field3386 = new float[this.field3387 * 16];

	@ObfuscatedName("md.l")
	public GpuTexture[] field3382 = new GpuTexture[this.field3387];

	@ObfuscatedName("md.u")
	public int[] field3388 = new int[this.field3387];

	@ObfuscatedName("md.z")
	public int field3384;

	@ObfuscatedName("md.p")
	public VertexBuffer field3390;

	@ObfuscatedName("md.d")
	public VertexDeclaration field3381;

	@ObfuscatedName("md.c")
	public GpuIndexBuffer field3392;

	@ObfuscatedName("md.r")
	public int[] field3393 = new int[4];

	public GpuRendererRelated6(GpuToolkit arg0, int arg1) {
		this.field3389 = arg0;
		this.field3390 = this.field3389.createVertexBuffer(true);
		this.field3390.allocate(arg1 * 96, 24);
		this.field3381 = this.field3389.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.TEX_COORD_2, VertexDeclarationElementComponent.COLOR }) });
		this.field3392 = this.field3389.createIndexBuffer(false);
		int var3 = arg1 * 6;
		this.field3392.method5831(var3);
		int var4 = var3 * this.field3392.getDataType().field1652;
		ByteBuffer var5 = this.field3389.temporaryBuffer;
		this.field3389.ensureTemporaryBufferCapacity(var4);
		var5.clear();
		for (int var6 = 0; var6 < arg1; var6++) {
			var5.putShort((short) (var6 * 4));
			var5.putShort((short) (var6 * 4 + 2));
			var5.putShort((short) (var6 * 4 + 1));
			var5.putShort((short) (var6 * 4 + 2));
			var5.putShort((short) (var6 * 4 + 3));
			var5.putShort((short) (var6 * 4 + 1));
		}
		this.field3392.upload(0, var3 * this.field3392.getDataType().field1652, this.field3389.temporaryBufferAddress);
		this.field3384 = arg1;
		this.field3385 = 0;
	}

	@ObfuscatedName("md.e()V")
	public void method5795() {
		this.field3390.delete();
		this.field3392.delete();
		this.field3390 = null;
		this.field3392 = null;
		this.field3381 = null;
		this.field3385 = 0;
	}

	@ObfuscatedName("md.n()V")
	public void method5796() {
		if (this.field3385 == 0) {
			return;
		}
		this.field3389.method16080();
		this.field3389.method16054(1);
		this.field3389.setIndices(this.field3392);
		this.field3389.setStreamSource(0, this.field3390);
		this.field3389.setVertexDeclaration(this.field3381);
		BatchedSpriteShader var1 = this.field3389.batchedSpriteShader;
		Unsafe var2 = this.field3389.field10110;
		ByteBuffer var3 = this.field3389.temporaryBuffer;
		var3.clear();
		this.field3389.method16046().setTo(Matrix4x4.IDENTITY);
		this.field3389.method16174(TextureTramsformType.COUNT2);
		int var4 = (this.field3385 + this.field3384 - 1) / this.field3384;
		int var5 = 0;
		int var6 = 0;
		for (int var7 = 0; var7 < var4; var7++) {
			int var8 = Math.min(this.field3384, this.field3385 - var5);
			long var9 = this.field3390.lock(0, var8 * 96);
			int var11 = this.field3384 * var7 + var8;
			for (int var12 = var5; var12 < var11; var12++) {
				for (int var13 = 0; var13 < 4; var13++) {
					var2.putFloat(var9, this.field3386[var6++]);
					long var14 = var9 + 4L;
					var2.putFloat(var14, this.field3386[var6++]);
					long var16 = var14 + 4L;
					var2.putFloat(var16, 0.0F);
					long var18 = var16 + 4L;
					var2.putFloat(var18, this.field3386[var6++]);
					long var20 = var18 + 4L;
					var2.putFloat(var20, this.field3386[var6++]);
					long var22 = var20 + 4L;
					var2.putInt(var22, this.field3388[var12]);
					var9 = var22 + 4L;
				}
			}
			this.field3390.unlock();
			GpuTexture var24 = this.field3382[var5];
			int var25 = 1;
			int var26 = 0;
			for (int var27 = var5 + 1; var27 < var11; var27++) {
				if (this.field3382[var27] == var24) {
					var25++;
				} else {
					var1.field2992 = var24;
					var1.method5047();
					this.field3389.drawIndexedPrimitiveIB(this.field3392, PrimitiveType.TRIANGLELIST, var26 * 4, var25 * 4, var26 * 6, var25 * 2);
					var24 = this.field3382[var27];
					var25 = 1;
					var26 = var27 - var5;
				}
			}
			var1.field2992 = var24;
			var1.method5047();
			this.field3389.drawIndexedPrimitiveIB(this.field3392, PrimitiveType.TRIANGLELIST, var26 * 4, var25 * 4, var26 * 6, var25 * 2);
			var5 += this.field3384;
		}
		this.field3385 = 0;
	}

	@ObfuscatedName("md.m(FFFFFFFFLlz;I)V")
	public void method5797(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, GpuTexture arg8, int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.field3389.method2171(this.field3393);
		int var11 = this.field3393[0];
		int var12 = this.field3393[1];
		int var13 = this.field3393[2];
		int var14 = this.field3393[3];
		if (arg0 > (float) var13 || (arg1 > (float) var14 || (arg2 < (float) var11 || arg3 < (float) var12))) {
			return;
		}
		float var15 = arg2 - arg0;
		float var16 = arg3 - arg1;
		float var17 = arg6 - arg4;
		float var18 = arg7 - arg5;
		if (arg0 < (float) var11) {
			arg4 += ((float) var11 - arg0) / var15 * var17;
			arg0 = var11;
		}
		if (arg1 < (float) var12) {
			arg5 += ((float) var12 - arg1) / var16 * var18;
			arg1 = var12;
		}
		if (arg2 > (float) var13) {
			arg6 -= (arg2 - (float) var13) / var15 * var17;
			arg2 = var13;
		}
		if (arg3 > (float) var14) {
			arg7 -= (arg3 - (float) var14) / var16 * var18;
			arg3 = var14;
		}
		this.method5798();
		float var19 = this.method5799(arg0);
		float var20 = this.method5800(arg1);
		float var21 = this.method5799(arg2);
		float var22 = this.method5800(arg3);
		this.field3386[this.field3385 * 16] = var19;
		this.field3386[this.field3385 * 16 + 1] = var20;
		this.field3386[this.field3385 * 16 + 2] = arg4;
		this.field3386[this.field3385 * 16 + 3] = arg5;
		this.field3386[this.field3385 * 16 + 4] = var21;
		this.field3386[this.field3385 * 16 + 5] = var20;
		this.field3386[this.field3385 * 16 + 6] = arg6;
		this.field3386[this.field3385 * 16 + 7] = arg5;
		this.field3386[this.field3385 * 16 + 8] = var19;
		this.field3386[this.field3385 * 16 + 9] = var22;
		this.field3386[this.field3385 * 16 + 10] = arg4;
		this.field3386[this.field3385 * 16 + 11] = arg7;
		this.field3386[this.field3385 * 16 + 12] = var21;
		this.field3386[this.field3385 * 16 + 13] = var22;
		this.field3386[this.field3385 * 16 + 14] = arg6;
		this.field3386[this.field3385 * 16 + 15] = arg7;
		this.field3382[this.field3385] = arg8;
		if (this.field3389.field10185 == 1) {
			this.field3388[this.field3385] = arg9 & 0xFF00FF00 | (arg9 & 0xFF) << 16 | arg9 >> 16 & 0xFF;
		} else {
			this.field3388[this.field3385] = arg9;
		}
		this.field3385++;
		if (GpuImageRelated.field3234 == this.field3391) {
			this.method5796();
		}
	}

	@ObfuscatedName("md.k(FFFFFFFFFFFFFFFFLlz;I)V")
	public void method5806(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, GpuTexture arg16, int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.field3389.method2171(this.field3393);
		int var19 = this.field3393[0];
		int var20 = this.field3393[1];
		int var21 = this.field3393[2];
		int var22 = this.field3393[3];
		byte var23 = 0;
		int var24 = (arg0 < (float) var19 ? 1 : 0) + (arg2 < (float) var19 ? 1 : 0) + (arg4 < (float) var19 ? 1 : 0) + (arg6 < (float) var19 ? 1 : 0);
		if (var24 == 4) {
			return;
		}
		int var25 = var23 | var24;
		int var26 = (arg0 > (float) var21 ? 1 : 0) + (arg2 > (float) var21 ? 1 : 0) + (arg4 > (float) var21 ? 1 : 0) + (arg6 > (float) var21 ? 1 : 0);
		if (var26 == 4) {
			return;
		}
		int var27 = var25 | var26;
		int var28 = (arg1 < (float) var20 ? 1 : 0) + (arg3 < (float) var20 ? 1 : 0) + (arg5 < (float) var20 ? 1 : 0) + (arg7 < (float) var20 ? 1 : 0);
		if (var28 == 4) {
			return;
		}
		int var29 = var27 | var28;
		int var30 = (arg1 > (float) var22 ? 1 : 0) + (arg3 > (float) var22 ? 1 : 0) + (arg5 > (float) var22 ? 1 : 0) + (arg7 > (float) var22 ? 1 : 0);
		if (var30 == 4) {
			return;
		}
		int var31 = var29 | var30;
		if (var31 != 0) {
			this.method5796();
			this.field3389.method2170(true);
			this.field3389.resetBounds(var19, var20, var21, var22);
		}
		this.method5798();
		float var32 = this.method5799(arg0);
		float var33 = this.method5800(arg1);
		float var34 = this.method5799(arg2);
		float var35 = this.method5800(arg3);
		float var36 = this.method5799(arg4);
		float var37 = this.method5800(arg5);
		float var38 = this.method5799(arg6);
		float var39 = this.method5800(arg7);
		this.field3386[this.field3385 * 16] = var32;
		this.field3386[this.field3385 * 16 + 1] = var33;
		this.field3386[this.field3385 * 16 + 2] = arg8;
		this.field3386[this.field3385 * 16 + 3] = arg9;
		this.field3386[this.field3385 * 16 + 4] = var34;
		this.field3386[this.field3385 * 16 + 5] = var35;
		this.field3386[this.field3385 * 16 + 6] = arg10;
		this.field3386[this.field3385 * 16 + 7] = arg11;
		this.field3386[this.field3385 * 16 + 8] = var36;
		this.field3386[this.field3385 * 16 + 9] = var37;
		this.field3386[this.field3385 * 16 + 10] = arg12;
		this.field3386[this.field3385 * 16 + 11] = arg13;
		this.field3386[this.field3385 * 16 + 12] = var38;
		this.field3386[this.field3385 * 16 + 13] = var39;
		this.field3386[this.field3385 * 16 + 14] = arg14;
		this.field3386[this.field3385 * 16 + 15] = arg15;
		this.field3382[this.field3385] = arg16;
		if (this.field3389.field10185 == 1) {
			this.field3388[this.field3385] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.field3388[this.field3385] = arg17;
		}
		this.field3385++;
		if (GpuImageRelated.field3234 == this.field3391 || var31 > 0) {
			this.method5796();
		}
		if (var31 != 0) {
			this.field3389.method2170(false);
			this.field3389.resetClip();
			this.field3389.resetBounds(var19, var20, var21, var22);
		}
	}

	@ObfuscatedName("md.f()V")
	public void method5798() {
		if (this.field3387 != this.field3385) {
			return;
		}
		this.field3387 *= 2;
		float[] var1 = new float[this.field3387 * 16];
		for (int var2 = 0; var2 < this.field3385 * 16; var2++) {
			var1[var2] = this.field3386[var2];
		}
		this.field3386 = var1;
		GpuTexture[] var3 = new GpuTexture[this.field3387];
		int[] var4 = new int[this.field3387];
		for (int var5 = 0; var5 < this.field3385; var5++) {
			var3[var5] = this.field3382[var5];
			var4[var5] = this.field3388[var5];
		}
		this.field3382 = var3;
		this.field3388 = var4;
	}

	@ObfuscatedName("md.w(F)F")
	public float method5799(float arg0) {
		int var2 = this.field3389.getRenderTarget().getWidth();
		return (arg0 + this.field3389.method15954()) / (float) var2 * 2.0F - 1.0F;
	}

	@ObfuscatedName("md.l(F)F")
	public float method5800(float arg0) {
		int var2 = this.field3389.getRenderTarget().getHeight();
		return (1.0F - (arg0 + this.field3389.method15954()) / (float) var2) * 2.0F - 1.0F;
	}

	@ObfuscatedName("md.u()V")
	public void method5805() {
		this.field3383 = this.field3391;
		this.field3391 = GpuImageRelated.field3236;
	}

	@ObfuscatedName("md.z()V")
	public void method5802() {
		if (this.field3383 != null) {
			this.field3391 = this.field3383;
			this.field3383 = null;
		}
	}

	@ObfuscatedName("md.p()Llm;")
	public GpuImageRelated method5803() {
		return this.field3391;
	}
}

package com.jagex.graphics;

import com.jagex.core.datastruct.DualLink;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.math.IntMath;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

import java.nio.ByteBuffer;

@ObfuscatedName("ld")
public class GpuParticleRenderer {

	@ObfuscatedName("ld.e")
	public VertexBuffer field3333;

	@ObfuscatedName("ld.n")
	public VertexBuffer field3329;

	@ObfuscatedName("ld.m")
	public VertexDeclaration field3326;

	@ObfuscatedName("ld.k")
	public GpuIndexBuffer field3327;

	@ObfuscatedName("ld.f")
	public final int field3328 = 64;

	@ObfuscatedName("ld.w")
	public final int field3338 = 768;

	@ObfuscatedName("ld.l")
	public final int field3330 = 1600;

	@ObfuscatedName("ld.u")
	public final int field3331 = IntMath.ilog(1600);

	@ObfuscatedName("ld.z")
	public final int field3332 = 64;

	@ObfuscatedName("ld.p")
	public int[] field3339 = new int[8191];

	@ObfuscatedName("ld.d")
	public int[] field3324 = new int[1600];

	@ObfuscatedName("ld.c")
	public int[] field3335 = new int[64];

	@ObfuscatedName("ld.r")
	public Particle[][] field3336 = new Particle[1600][64];

	@ObfuscatedName("ld.v")
	public Particle[][] field3337 = new Particle[64][768];

	@ObfuscatedName("ld.o")
	public int field3334 = 0;

	@ObfuscatedName("ld.s")
	public static float field3325;

	public GpuParticleRenderer(GpuToolkit arg0) {
		this.field3326 = arg0.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.COLOR, VertexDeclarationElementComponent.TEX_COORD_2 }), new VertexDeclarationElement(VertexDeclarationElementComponent.NORMAL) });
		this.field3333 = arg0.createVertexBuffer(true);
		this.field3329 = arg0.createVertexBuffer(false);
		this.field3329.allocate(393168, 12);
		this.field3327 = arg0.createIndexBuffer(false);
		this.field3327.method5831(49146);
		ByteBuffer var2 = arg0.temporaryBuffer;
		var2.clear();
		for (int var3 = 0; var3 < 8191; var3++) {
			int var4 = var3 * 4;
			var2.putShort((short) var4);
			var2.putShort((short) (var4 + 1));
			var2.putShort((short) (var4 + 2));
			var2.putShort((short) (var4 + 2));
			var2.putShort((short) (var4 + 3));
			var2.putShort((short) var4);
		}
		this.field3327.upload(0, var2.position(), arg0.temporaryBufferAddress);
		var2.clear();
		for (int var5 = 0; var5 < 8191; var5++) {
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
		}
		this.field3329.upload(0, var2.position(), arg0.temporaryBufferAddress);
	}

	@ObfuscatedName("ld.e(Lafc;)V")
	public void method5755(GpuToolkit arg0) {
		this.field3333.allocate(786336, 24);
	}

	@ObfuscatedName("ld.n()V")
	public void method5756() {
		this.field3333.delete();
	}

	@ObfuscatedName("ld.m(Lafc;Ldm;)V")
	public void method5770(GpuToolkit arg0, ParticleList arg1) {
		arg0.method2219(false);
		field3325 = arg0.field10122;
		float var3 = arg0.field10059.entries[2];
		float var4 = arg0.field10059.entries[6];
		float var5 = arg0.field10059.entries[10];
		float var6 = arg0.field10059.entries[14];
		int var7 = 0;
		int var8 = Integer.MAX_VALUE;
		int var9 = 0;
		DualLink var10 = arg1.list.head;
		for (DualLink var11 = var10.dualPrev; var11 != var10; var11 = var11.dualPrev) {
			Particle var12 = (Particle) var11;
			int var13 = (int) ((float) (var12.z >> 12) * var5 + (float) (var12.y >> 12) * var4 + (float) (var12.x >> 12) * var3 + var6);
			if (var13 > var9) {
				var9 = var13;
			}
			if (var13 < var8) {
				var8 = var13;
			}
			this.field3339[var7++] = var13;
		}
		int var14 = var9 - var8;
		int var15;
		if (var14 + 2 > 1600) {
			var15 = IntMath.ilog(var14) + 1 - this.field3331;
			var14 = (var14 >> var15) + 2;
		} else {
			var15 = 0;
			var14 += 2;
		}
		arg0.setIndices(this.field3327);
		ParticleShader var16 = arg0.particleShader;
		var16.method5038(Matrix4x4.IDENTITY);
		var16.field2987.setToIdentity();
		var16.field2988 = -1;
		boolean var17 = arg0.field10169 > 0;
		if (var17) {
			var16.field2989.method6247(0.0F, 0.0F, 1.0F, -arg0.fogStart);
			var16.field2990.setTo((float) (arg0.fogDensity >> 16 & 0xFF) / 255.0F, (float) (arg0.fogDensity >> 8 & 0xFF) / 255.0F, (float) (arg0.fogDensity >> 0 & 0xFF) / 255.0F);
			var16.field2989.method6265(arg0.field10190);
			var16.field2989.method6252(1.0F / (arg0.fogEnd - arg0.fogStart));
		} else {
			var16.field2989.method6247(0.0F, 0.0F, 0.0F, 0.0F);
			var16.field2990.setTo(0.0F, 0.0F, 0.0F);
		}
		this.method5766(arg0, var10, var14, var8, var15, var16, var17);
		if (field3325 != arg0.field10122) {
			arg0.setSunAmbientIntensity(field3325);
		}
		arg0.method2219(true);
	}

	@ObfuscatedName("ld.k(Lafc;Lajn;IIILjo;Z)V")
	public void method5766(GpuToolkit arg0, DualLink arg1, int arg2, int arg3, int arg4, ParticleShader arg5, boolean arg6) {
		DualLink var8 = arg1.dualPrev;
		int var9 = 0;
		int var10 = -2;
		boolean var11 = true;
		boolean var12 = true;
		while (arg1 != var8) {
			this.field3334 = 0;
			for (int var13 = 0; var13 < arg2; var13++) {
				this.field3324[var13] = 0;
			}
			for (int var14 = 0; var14 < 64; var14++) {
				this.field3335[var14] = 0;
			}
			while (arg1 != var8) {
				Particle var15 = (Particle) var8;
				if (var12) {
					var10 = var15.field12160;
					var11 = var15.field12165;
					var12 = false;
				}
				if (var9 > 0 && (var15.field12160 != var10 || var15.field12165 != var11)) {
					var12 = true;
					break;
				}
				this.method5764(this.field3339[var9++] - arg3 >> arg4, var15);
				var8 = var8.dualPrev;
			}
			arg5.field2991 = null;
			if (var10 >= 0) {
				Material var16 = arg0.materialList.get(var10);
				if (var16.field1330) {
					arg5.field2991 = arg0.field10188.method5639(var16);
				}
				byte var17 = 0;
				if (MaterialAlphaMode.TEST == var16.alphaMode) {
					var17 = var16.alphaThreshold;
				}
				arg0.method16056(var17);
			}
			if (var11 && field3325 != arg0.field10122) {
				arg0.setSunAmbientIntensity(field3325);
			} else if (arg0.field10122 != 1.0F) {
				arg0.setSunAmbientIntensity(1.0F);
			}
			this.method5759(arg0, arg2, arg6);
		}
	}

	@ObfuscatedName("ld.f(ILaqb;)V")
	public void method5764(int arg0, Particle arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.field3324[arg0] < 64) {
			this.field3336[arg0][this.field3324[arg0]++] = arg1;
			return;
		}
		if (this.field3324[arg0] == 64) {
			if (this.field3334 == 64) {
				return;
			}
			this.field3324[arg0] += this.field3334++ + 1;
		}
		this.field3337[this.field3324[arg0] - 64 - 1][this.field3335[this.field3324[arg0] - 64 - 1]++] = arg1;
	}

	@ObfuscatedName("ld.w(Lafc;IZ)V")
	public void method5759(GpuToolkit arg0, int arg1, boolean arg2) {
		int var4 = 0;
		Matrix4x4 var5 = arg0.field10059;
		float var6 = var5.entries[0];
		float var7 = var5.entries[4];
		float var8 = var5.entries[8];
		float var9 = var5.entries[1];
		float var10 = var5.entries[5];
		float var11 = var5.entries[9];
		float var12 = var6 + var9;
		float var13 = var7 + var10;
		float var14 = var8 + var11;
		float var15 = var6 - var9;
		float var16 = var7 - var10;
		float var17 = var8 - var11;
		float var18 = var9 - var6;
		float var19 = var10 - var7;
		float var20 = var11 - var8;
		float[] var21 = new float[3];
		float[] var22 = new float[3];
		arg0.field10066.method6726(arg0.field10035);
		ByteBuffer var23 = arg0.temporaryBuffer;
		var23.clear();
		for (int var24 = arg1 - 1; var24 >= 0; var24--) {
			int var25 = this.field3324[var24] > 64 ? 64 : this.field3324[var24];
			if (var25 > 0) {
				for (int var26 = var25 - 1; var26 >= 0; var26--) {
					Particle var27 = this.field3336[var24][var26];
					int var28 = var27.field12158;
					byte var29 = (byte) (var28 >> 16);
					byte var30 = (byte) (var28 >> 8);
					byte var31 = (byte) var28;
					byte var32 = (byte) (var28 >>> 24);
					if (arg0.field10185 == 0) {
						byte var33 = var29;
						var29 = var31;
						var31 = var33;
					}
					float var34 = (float) (var27.x >> 12);
					float var35 = (float) (var27.y >> 12);
					float var36 = (float) (var27.z >> 12);
					int var37 = var27.field12162 >> 12;
					if (var27.field12156 == 0) {
						var23.putFloat((float) -var37 * var12 + var34);
						var23.putFloat((float) -var37 * var13 + var35);
						var23.putFloat((float) -var37 * var14 + var36);
						var23.put(var29);
						var23.put(var30);
						var23.put(var31);
						var23.put(var32);
						var23.putFloat(0.0F);
						var23.putFloat(0.0F);
						var23.putFloat((float) var37 * var18 + var34);
						var23.putFloat((float) var37 * var19 + var35);
						var23.putFloat((float) var37 * var20 + var36);
						var23.put(var29);
						var23.put(var30);
						var23.put(var31);
						var23.put(var32);
						var23.putFloat(0.0F);
						var23.putFloat(1.0F);
						var23.putFloat((float) var37 * var12 + var34);
						var23.putFloat((float) var37 * var13 + var35);
						var23.putFloat((float) var37 * var14 + var36);
						var23.put(var29);
						var23.put(var30);
						var23.put(var31);
						var23.put(var32);
						var23.putFloat(1.0F);
						var23.putFloat(1.0F);
						var23.putFloat((float) var37 * var15 + var34);
						var23.putFloat((float) var37 * var16 + var35);
						var23.putFloat((float) var37 * var17 + var36);
						var23.put(var29);
						var23.put(var30);
						var23.put(var31);
						var23.put(var32);
						var23.putFloat(1.0F);
						var23.putFloat(0.0F);
					} else {
						arg0.field10039.method6687(var27.field12156, var37, var37, 0.0F, 0.0F, 0.0F);
						arg0.field10039.multiply(arg0.field10066);
						arg0.field10039.method6614(1.0F, 0.0F, 0.0F, var21);
						arg0.field10039.method6614(0.0F, 1.0F, 0.0F, var22);
						var23.putFloat(var34 - var21[0] - var22[0]);
						var23.putFloat(var35 - var21[1] - var22[1]);
						var23.putFloat(var36 - var21[2] - var22[2]);
						var23.put(var29);
						var23.put(var30);
						var23.put(var31);
						var23.put(var32);
						var23.putFloat(0.0F);
						var23.putFloat(0.0F);
						var23.putFloat(var34 - var21[0] + var22[0]);
						var23.putFloat(var35 - var21[1] + var22[1]);
						var23.putFloat(var36 - var21[2] + var22[2]);
						var23.put(var29);
						var23.put(var30);
						var23.put(var31);
						var23.put(var32);
						var23.putFloat(0.0F);
						var23.putFloat(1.0F);
						var23.putFloat(var21[0] + var34 + var22[0]);
						var23.putFloat(var21[1] + var35 + var22[1]);
						var23.putFloat(var21[2] + var36 + var22[2]);
						var23.put(var29);
						var23.put(var30);
						var23.put(var31);
						var23.put(var32);
						var23.putFloat(1.0F);
						var23.putFloat(1.0F);
						var23.putFloat(var21[0] + var34 - var22[0]);
						var23.putFloat(var21[1] + var35 - var22[1]);
						var23.putFloat(var21[2] + var36 - var22[2]);
						var23.put(var29);
						var23.put(var30);
						var23.put(var31);
						var23.put(var32);
						var23.putFloat(1.0F);
						var23.putFloat(0.0F);
					}
					var4++;
				}
				if (this.field3324[var24] > 64) {
					int var38 = this.field3324[var24] - 64 - 1;
					for (int var39 = this.field3335[var38] - 1; var39 >= 0; var39--) {
						Particle var40 = this.field3337[var38][var39];
						int var41 = var40.field12158;
						byte var42 = (byte) (var41 >> 16);
						byte var43 = (byte) (var41 >> 8);
						byte var44 = (byte) var41;
						byte var45 = (byte) (var41 >>> 24);
						float var46 = (float) (var40.x >> 12);
						float var47 = (float) (var40.y >> 12);
						float var48 = (float) (var40.z >> 12);
						int var49 = var40.field12162 >> 12;
						if (arg0.field10185 == 0) {
							byte var50 = var42;
							var42 = var44;
							var44 = var50;
						}
						if (var40.field12156 == 0) {
							var23.putFloat((float) -var49 * var12 + var46);
							var23.putFloat((float) -var49 * var13 + var47);
							var23.putFloat((float) -var49 * var14 + var48);
							var23.put(var42);
							var23.put(var43);
							var23.put(var44);
							var23.put(var45);
							var23.putFloat(0.0F);
							var23.putFloat(0.0F);
							var23.putFloat((float) var49 * var18 + var46);
							var23.putFloat((float) var49 * var19 + var47);
							var23.putFloat((float) var49 * var20 + var48);
							var23.put(var42);
							var23.put(var43);
							var23.put(var44);
							var23.put(var45);
							var23.putFloat(0.0F);
							var23.putFloat(1.0F);
							var23.putFloat((float) var49 * var12 + var46);
							var23.putFloat((float) var49 * var13 + var47);
							var23.putFloat((float) var49 * var14 + var48);
							var23.put(var42);
							var23.put(var43);
							var23.put(var44);
							var23.put(var45);
							var23.putFloat(1.0F);
							var23.putFloat(1.0F);
							var23.putFloat((float) var49 * var15 + var46);
							var23.putFloat((float) var49 * var16 + var47);
							var23.putFloat((float) var49 * var17 + var48);
							var23.put(var42);
							var23.put(var43);
							var23.put(var44);
							var23.put(var45);
							var23.putFloat(1.0F);
							var23.putFloat(0.0F);
						} else {
							arg0.field10039.method6687(var40.field12156, var49, var49, 0.0F, 0.0F, 0.0F);
							arg0.field10039.multiply(arg0.field10066);
							arg0.field10039.method6614(1.0F, 0.0F, 0.0F, var21);
							arg0.field10039.method6614(0.0F, 1.0F, 0.0F, var22);
							var23.putFloat(var46 - var21[0] - var22[0]);
							var23.putFloat(var47 - var21[1] - var22[1]);
							var23.putFloat(var48 - var21[2] - var22[2]);
							var23.put(var42);
							var23.put(var43);
							var23.put(var44);
							var23.put(var45);
							var23.putFloat(0.0F);
							var23.putFloat(0.0F);
							var23.putFloat(var46 - var21[0] + var22[0]);
							var23.putFloat(var47 - var21[1] + var22[1]);
							var23.putFloat(var48 - var21[2] + var22[2]);
							var23.put(var42);
							var23.put(var43);
							var23.put(var44);
							var23.put(var45);
							var23.putFloat(0.0F);
							var23.putFloat(1.0F);
							var23.putFloat(var21[0] + var46 + var22[0]);
							var23.putFloat(var21[1] + var47 + var22[1]);
							var23.putFloat(var21[2] + var48 + var22[2]);
							var23.put(var42);
							var23.put(var43);
							var23.put(var44);
							var23.put(var45);
							var23.putFloat(1.0F);
							var23.putFloat(1.0F);
							var23.putFloat(var21[0] + var46 - var22[0]);
							var23.putFloat(var21[1] + var47 - var22[1]);
							var23.putFloat(var21[2] + var48 - var22[2]);
							var23.put(var42);
							var23.put(var43);
							var23.put(var44);
							var23.put(var45);
							var23.putFloat(1.0F);
							var23.putFloat(0.0F);
						}
						var4++;
					}
				}
			}
		}
		this.field3333.upload(0, var23.position(), arg0.temporaryBufferAddress);
		arg0.setStreamSource(0, this.field3333);
		arg0.setStreamSource(1, this.field3329);
		arg0.setVertexDeclaration(this.field3326);
		ParticleShader var51 = arg0.particleShader;
		var51.method5039(var4, arg2);
	}
}

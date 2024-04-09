package com.jagex.graphics.gl;

import com.jagex.core.datastruct.DualLink;
import com.jagex.graphics.GpuPacket;
import com.jagex.graphics.Particle;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("cu")
public class GlToolkitRelated {

	@ObfuscatedName("cu.e")
	public float[] field1147 = new float[16];

	@ObfuscatedName("cu.n")
	public GpuPacket field1145 = new GpuPacket(786336);

	@ObfuscatedName("cu.m")
	public GlInterfaceRelated field1134;

	@ObfuscatedName("cu.k")
	public GlRelated3 field1135;

	@ObfuscatedName("cu.f")
	public GlRelated3 field1136;

	@ObfuscatedName("cu.w")
	public GlRelated3 field1143;

	@ObfuscatedName("cu.l")
	public final int field1138 = 64;

	@ObfuscatedName("cu.u")
	public final int field1139 = 768;

	@ObfuscatedName("cu.z")
	public final int field1140 = 1600;

	@ObfuscatedName("cu.p")
	public final int field1149 = IntMath.ilog(1600);

	@ObfuscatedName("cu.d")
	public final int field1141 = 64;

	@ObfuscatedName("cu.c")
	public int[] field1132 = new int[8191];

	@ObfuscatedName("cu.r")
	public int[] field1144 = new int[1600];

	@ObfuscatedName("cu.v")
	public int[] field1148 = new int[64];

	@ObfuscatedName("cu.o")
	public Particle[][] field1146 = new Particle[1600][64];

	@ObfuscatedName("cu.s")
	public Particle[][] field1142 = new Particle[64][768];

	@ObfuscatedName("cu.y")
	public int field1133 = 0;

	@ObfuscatedName("cu.q")
	public static float field1137;

	@ObfuscatedName("cu.e(Lafa;)V")
	public void method1323(GlToolkit arg0) {
		this.field1134 = arg0.method15767(24, null, 196584, true);
		this.field1143 = new GlRelated3(this.field1134, 5126, 2, 0);
		this.field1135 = new GlRelated3(this.field1134, 5126, 3, 8);
		this.field1136 = new GlRelated3(this.field1134, 5121, 4, 20);
	}

	@ObfuscatedName("cu.n(Lafa;Ldm;)V")
	public void method1324(GlToolkit arg0, ParticleList arg1) {
		if (arg0.field9903 == null) {
			return;
		}
		this.method1326(arg0);
		float var3 = arg0.field9903.entries[2];
		float var4 = arg0.field9903.entries[6];
		float var5 = arg0.field9903.entries[10];
		float var6 = arg0.field9903.entries[14];
		try {
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
				this.field1132[var7++] = var13;
			}
			int var14 = var9 - var8;
			int var15;
			if (var14 + 2 > 1600) {
				var15 = IntMath.ilog(var14) + 1 - this.field1149;
				var14 = (var14 >> var15) + 2;
			} else {
				var15 = 0;
				var14 += 2;
			}
			DualLink var16 = var10.dualPrev;
			int var17 = 0;
			int var18 = -2;
			boolean var19 = true;
			boolean var20 = true;
			while (var10 != var16) {
				this.field1133 = 0;
				for (int var21 = 0; var21 < var14; var21++) {
					this.field1144[var21] = 0;
				}
				for (int var22 = 0; var22 < 64; var22++) {
					this.field1148[var22] = 0;
				}
				while (var10 != var16) {
					Particle var23 = (Particle) var16;
					if (var20) {
						var18 = var23.field12160;
						var19 = var23.field12165;
						var20 = false;
					}
					if (var17 > 0 && (var23.field12160 != var18 || var23.field12165 != var19)) {
						var20 = true;
						break;
					}
					int var24 = this.field1132[var17++] - var8 >> var15;
					if (var24 < 1600) {
						if (this.field1144[var24] < 64) {
							this.field1146[var24][this.field1144[var24]++] = var23;
						} else {
							label91: {
								if (this.field1144[var24] == 64) {
									if (this.field1133 == 64) {
										break label91;
									}
									this.field1144[var24] += this.field1133++ + 1;
								}
								this.field1142[this.field1144[var24] - 64 - 1][this.field1148[this.field1144[var24] - 64 - 1]++] = var23;
							}
						}
					}
					var16 = var16.dualPrev;
				}
				if (var18 >= 0) {
					arg0.method15774(var18);
				} else {
					arg0.method15774(-1);
				}
				if (var19 && field1137 != arg0.field9946) {
					arg0.setSunAmbientIntensity(field1137);
				} else if (arg0.field9946 != 1.0F) {
					arg0.setSunAmbientIntensity(1.0F);
				}
				this.method1325(arg0, var14);
			}
		} catch (Exception var26) {
		}
		this.method1329(arg0);
	}

	@ObfuscatedName("cu.m(Lafa;I)V")
	public void method1325(GlToolkit arg0, int arg1) {
		OpenGL.glGetFloatv(2982, this.field1147, 0);
		float var3 = this.field1147[0];
		float var4 = this.field1147[4];
		float var5 = this.field1147[8];
		float var6 = this.field1147[1];
		float var7 = this.field1147[5];
		float var8 = this.field1147[9];
		float var9 = var3 + var6;
		float var10 = var4 + var7;
		float var11 = var5 + var8;
		float var12 = var3 - var6;
		float var13 = var4 - var7;
		float var14 = var5 - var8;
		float var15 = var6 - var3;
		float var16 = var7 - var4;
		float var17 = var8 - var5;
		float[] var18 = new float[3];
		float[] var19 = new float[3];
		arg0.field9919.method6726(arg0.field9904);
		this.field1145.pos = 0;
		if (arg0.field10017) {
			for (int var20 = arg1 - 1; var20 >= 0; var20--) {
				int var21 = this.field1144[var20] > 64 ? 64 : this.field1144[var20];
				if (var21 > 0) {
					for (int var22 = var21 - 1; var22 >= 0; var22--) {
						Particle var23 = this.field1146[var20][var22];
						int var24 = var23.field12158;
						byte var25 = (byte) (var24 >> 16);
						byte var26 = (byte) (var24 >> 8);
						byte var27 = (byte) var24;
						byte var28 = (byte) (var24 >>> 24);
						float var29 = (float) (var23.x >> 12);
						float var30 = (float) (var23.y >> 12);
						float var31 = (float) (var23.z >> 12);
						int var32 = var23.field12162 >> 12;
						if (var23.field12156 == 0) {
							this.field1145.method19550(0.0F);
							this.field1145.method19550(0.0F);
							this.field1145.method19550((float) -var32 * var9 + var29);
							this.field1145.method19550((float) -var32 * var10 + var30);
							this.field1145.method19550((float) -var32 * var11 + var31);
							this.field1145.p1(var25);
							this.field1145.p1(var26);
							this.field1145.p1(var27);
							this.field1145.p1(var28);
							this.field1145.method19550(0.0F);
							this.field1145.method19550(1.0F);
							this.field1145.method19550((float) var32 * var15 + var29);
							this.field1145.method19550((float) var32 * var16 + var30);
							this.field1145.method19550((float) var32 * var17 + var31);
							this.field1145.p1(var25);
							this.field1145.p1(var26);
							this.field1145.p1(var27);
							this.field1145.p1(var28);
							this.field1145.method19550(1.0F);
							this.field1145.method19550(1.0F);
							this.field1145.method19550((float) var32 * var9 + var29);
							this.field1145.method19550((float) var32 * var10 + var30);
							this.field1145.method19550((float) var32 * var11 + var31);
							this.field1145.p1(var25);
							this.field1145.p1(var26);
							this.field1145.p1(var27);
							this.field1145.p1(var28);
							this.field1145.method19550(1.0F);
							this.field1145.method19550(0.0F);
							this.field1145.method19550((float) var32 * var12 + var29);
							this.field1145.method19550((float) var32 * var13 + var30);
							this.field1145.method19550((float) var32 * var14 + var31);
							this.field1145.p1(var25);
							this.field1145.p1(var26);
							this.field1145.p1(var27);
							this.field1145.p1(var28);
						} else {
							arg0.field9920.method6687(var23.field12156, var32, var32, 0.0F, 0.0F, 0.0F);
							arg0.field9920.multiply(arg0.field9919);
							arg0.field9920.method6614(1.0F, 0.0F, 0.0F, var18);
							arg0.field9920.method6614(0.0F, 1.0F, 0.0F, var19);
							this.field1145.method19550(0.0F);
							this.field1145.method19550(0.0F);
							this.field1145.method19550(var29 - var18[0] - var19[0]);
							this.field1145.method19550(var30 - var18[1] - var19[1]);
							this.field1145.method19550(var31 - var18[2] - var19[2]);
							this.field1145.p1(var25);
							this.field1145.p1(var26);
							this.field1145.p1(var27);
							this.field1145.p1(var28);
							this.field1145.method19550(0.0F);
							this.field1145.method19550(1.0F);
							this.field1145.method19550(var29 - var18[0] + var19[0]);
							this.field1145.method19550(var30 - var18[1] + var19[1]);
							this.field1145.method19550(var31 - var18[2] + var19[2]);
							this.field1145.p1(var25);
							this.field1145.p1(var26);
							this.field1145.p1(var27);
							this.field1145.p1(var28);
							this.field1145.method19550(1.0F);
							this.field1145.method19550(1.0F);
							this.field1145.method19550(var18[0] + var29 + var19[0]);
							this.field1145.method19550(var18[1] + var30 + var19[1]);
							this.field1145.method19550(var18[2] + var31 + var19[2]);
							this.field1145.p1(var25);
							this.field1145.p1(var26);
							this.field1145.p1(var27);
							this.field1145.p1(var28);
							this.field1145.method19550(1.0F);
							this.field1145.method19550(0.0F);
							this.field1145.method19550(var18[0] + var29 - var19[0]);
							this.field1145.method19550(var18[1] + var30 - var19[1]);
							this.field1145.method19550(var18[2] + var31 - var19[2]);
							this.field1145.p1(var25);
							this.field1145.p1(var26);
							this.field1145.p1(var27);
							this.field1145.p1(var28);
						}
					}
					if (this.field1144[var20] > 64) {
						int var33 = this.field1144[var20] - 64 - 1;
						for (int var34 = this.field1148[var33] - 1; var34 >= 0; var34--) {
							Particle var35 = this.field1142[var33][var34];
							int var36 = var35.field12158;
							byte var37 = (byte) (var36 >> 16);
							byte var38 = (byte) (var36 >> 8);
							byte var39 = (byte) var36;
							byte var40 = (byte) (var36 >>> 24);
							float var41 = (float) (var35.x >> 12);
							float var42 = (float) (var35.y >> 12);
							float var43 = (float) (var35.z >> 12);
							int var44 = var35.field12162 >> 12;
							if (var35.field12156 == 0) {
								this.field1145.method19550(0.0F);
								this.field1145.method19550(0.0F);
								this.field1145.method19550((float) -var44 * var9 + var41);
								this.field1145.method19550((float) -var44 * var10 + var42);
								this.field1145.method19550((float) -var44 * var11 + var43);
								this.field1145.p1(var37);
								this.field1145.p1(var38);
								this.field1145.p1(var39);
								this.field1145.p1(var40);
								this.field1145.method19550(0.0F);
								this.field1145.method19550(1.0F);
								this.field1145.method19550((float) var44 * var15 + var41);
								this.field1145.method19550((float) var44 * var16 + var42);
								this.field1145.method19550((float) var44 * var17 + var43);
								this.field1145.p1(var37);
								this.field1145.p1(var38);
								this.field1145.p1(var39);
								this.field1145.p1(var40);
								this.field1145.method19550(1.0F);
								this.field1145.method19550(1.0F);
								this.field1145.method19550((float) var44 * var9 + var41);
								this.field1145.method19550((float) var44 * var10 + var42);
								this.field1145.method19550((float) var44 * var11 + var43);
								this.field1145.p1(var37);
								this.field1145.p1(var38);
								this.field1145.p1(var39);
								this.field1145.p1(var40);
								this.field1145.method19550(1.0F);
								this.field1145.method19550(0.0F);
								this.field1145.method19550((float) var44 * var12 + var41);
								this.field1145.method19550((float) var44 * var13 + var42);
								this.field1145.method19550((float) var44 * var14 + var43);
								this.field1145.p1(var37);
								this.field1145.p1(var38);
								this.field1145.p1(var39);
								this.field1145.p1(var40);
							} else {
								arg0.field9920.method6687(var35.field12156, var44, var44, 0.0F, 0.0F, 0.0F);
								arg0.field9920.multiply(arg0.field9919);
								arg0.field9920.method6614(1.0F, 0.0F, 0.0F, var18);
								arg0.field9920.method6614(0.0F, 1.0F, 0.0F, var19);
								this.field1145.method19550(0.0F);
								this.field1145.method19550(0.0F);
								this.field1145.method19550(var41 - var18[0] - var19[0]);
								this.field1145.method19550(var42 - var18[1] - var19[1]);
								this.field1145.method19550(var43 - var18[2] - var19[2]);
								this.field1145.p1(var37);
								this.field1145.p1(var38);
								this.field1145.p1(var39);
								this.field1145.p1(var40);
								this.field1145.method19550(0.0F);
								this.field1145.method19550(1.0F);
								this.field1145.method19550(var41 - var18[0] + var19[0]);
								this.field1145.method19550(var42 - var18[1] + var19[1]);
								this.field1145.method19550(var43 - var18[2] + var19[2]);
								this.field1145.p1(var37);
								this.field1145.p1(var38);
								this.field1145.p1(var39);
								this.field1145.p1(var40);
								this.field1145.method19550(1.0F);
								this.field1145.method19550(1.0F);
								this.field1145.method19550(var18[0] + var41 + var19[0]);
								this.field1145.method19550(var18[1] + var42 + var19[1]);
								this.field1145.method19550(var18[2] + var43 + var19[2]);
								this.field1145.p1(var37);
								this.field1145.p1(var38);
								this.field1145.p1(var39);
								this.field1145.p1(var40);
								this.field1145.method19550(1.0F);
								this.field1145.method19550(0.0F);
								this.field1145.method19550(var18[0] + var41 - var19[0]);
								this.field1145.method19550(var18[1] + var42 - var19[1]);
								this.field1145.method19550(var18[2] + var43 - var19[2]);
								this.field1145.p1(var37);
								this.field1145.p1(var38);
								this.field1145.p1(var39);
								this.field1145.p1(var40);
							}
						}
					}
				}
			}
		} else {
			for (int var45 = arg1 - 1; var45 >= 0; var45--) {
				int var46 = this.field1144[var45] > 64 ? 64 : this.field1144[var45];
				if (var46 > 0) {
					for (int var47 = var46 - 1; var47 >= 0; var47--) {
						Particle var48 = this.field1146[var45][var47];
						int var49 = var48.field12158;
						byte var50 = (byte) (var49 >> 16);
						byte var51 = (byte) (var49 >> 8);
						byte var52 = (byte) var49;
						byte var53 = (byte) (var49 >>> 24);
						float var54 = (float) (var48.x >> 12);
						float var55 = (float) (var48.y >> 12);
						float var56 = (float) (var48.z >> 12);
						int var57 = var48.field12162 >> 12;
						if (var48.field12156 == 0) {
							this.field1145.method19553(0.0F);
							this.field1145.method19553(0.0F);
							this.field1145.method19553((float) -var57 * var9 + var54);
							this.field1145.method19553((float) -var57 * var10 + var55);
							this.field1145.method19553((float) -var57 * var11 + var56);
							this.field1145.p1(var50);
							this.field1145.p1(var51);
							this.field1145.p1(var52);
							this.field1145.p1(var53);
							this.field1145.method19553(0.0F);
							this.field1145.method19553(1.0F);
							this.field1145.method19553((float) var57 * var15 + var54);
							this.field1145.method19553((float) var57 * var16 + var55);
							this.field1145.method19553((float) var57 * var17 + var56);
							this.field1145.p1(var50);
							this.field1145.p1(var51);
							this.field1145.p1(var52);
							this.field1145.p1(var53);
							this.field1145.method19553(1.0F);
							this.field1145.method19553(1.0F);
							this.field1145.method19553((float) var57 * var9 + var54);
							this.field1145.method19553((float) var57 * var10 + var55);
							this.field1145.method19553((float) var57 * var11 + var56);
							this.field1145.p1(var50);
							this.field1145.p1(var51);
							this.field1145.p1(var52);
							this.field1145.p1(var53);
							this.field1145.method19553(1.0F);
							this.field1145.method19553(0.0F);
							this.field1145.method19553((float) var57 * var12 + var54);
							this.field1145.method19553((float) var57 * var13 + var55);
							this.field1145.method19553((float) var57 * var14 + var56);
							this.field1145.p1(var50);
							this.field1145.p1(var51);
							this.field1145.p1(var52);
							this.field1145.p1(var53);
						} else {
							arg0.field9920.method6687(var48.field12156, var57, var57, 0.0F, 0.0F, 0.0F);
							arg0.field9920.multiply(arg0.field9919);
							arg0.field9920.method6614(1.0F, 0.0F, 0.0F, var18);
							arg0.field9920.method6614(0.0F, 1.0F, 0.0F, var19);
							this.field1145.method19553(0.0F);
							this.field1145.method19553(0.0F);
							this.field1145.method19553(var54 - var18[0] - var19[0]);
							this.field1145.method19553(var55 - var18[1] - var19[1]);
							this.field1145.method19553(var56 - var18[2] - var19[2]);
							this.field1145.p1(var50);
							this.field1145.p1(var51);
							this.field1145.p1(var52);
							this.field1145.p1(var53);
							this.field1145.method19553(0.0F);
							this.field1145.method19553(1.0F);
							this.field1145.method19553(var54 - var18[0] + var19[0]);
							this.field1145.method19553(var55 - var18[1] + var19[1]);
							this.field1145.method19553(var56 - var18[2] + var19[2]);
							this.field1145.p1(var50);
							this.field1145.p1(var51);
							this.field1145.p1(var52);
							this.field1145.p1(var53);
							this.field1145.method19553(1.0F);
							this.field1145.method19553(1.0F);
							this.field1145.method19553(var18[0] + var54 + var19[0]);
							this.field1145.method19553(var18[1] + var55 + var19[1]);
							this.field1145.method19553(var18[2] + var56 + var19[2]);
							this.field1145.p1(var50);
							this.field1145.p1(var51);
							this.field1145.p1(var52);
							this.field1145.p1(var53);
							this.field1145.method19553(1.0F);
							this.field1145.method19553(0.0F);
							this.field1145.method19553(var18[0] + var54 - var19[0]);
							this.field1145.method19553(var18[1] + var55 - var19[1]);
							this.field1145.method19553(var18[2] + var56 - var19[2]);
							this.field1145.p1(var50);
							this.field1145.p1(var51);
							this.field1145.p1(var52);
							this.field1145.p1(var53);
						}
					}
					if (this.field1144[var45] > 64) {
						int var58 = this.field1144[var45] - 64 - 1;
						for (int var59 = this.field1148[var58] - 1; var59 >= 0; var59--) {
							Particle var60 = this.field1142[var58][var59];
							int var61 = var60.field12158;
							byte var62 = (byte) (var61 >> 16);
							byte var63 = (byte) (var61 >> 8);
							byte var64 = (byte) var61;
							byte var65 = (byte) (var61 >>> 24);
							float var66 = (float) (var60.x >> 12);
							float var67 = (float) (var60.y >> 12);
							float var68 = (float) (var60.z >> 12);
							int var69 = var60.field12162 >> 12;
							if (var60.field12156 == 0) {
								this.field1145.method19553(0.0F);
								this.field1145.method19553(0.0F);
								this.field1145.method19553((float) -var69 * var9 + var66);
								this.field1145.method19553((float) -var69 * var10 + var67);
								this.field1145.method19553((float) -var69 * var11 + var68);
								this.field1145.p1(var62);
								this.field1145.p1(var63);
								this.field1145.p1(var64);
								this.field1145.p1(var65);
								this.field1145.method19553(0.0F);
								this.field1145.method19553(1.0F);
								this.field1145.method19553((float) var69 * var15 + var66);
								this.field1145.method19553((float) var69 * var16 + var67);
								this.field1145.method19553((float) var69 * var17 + var68);
								this.field1145.p1(var62);
								this.field1145.p1(var63);
								this.field1145.p1(var64);
								this.field1145.p1(var65);
								this.field1145.method19553(1.0F);
								this.field1145.method19553(1.0F);
								this.field1145.method19553((float) var69 * var9 + var66);
								this.field1145.method19553((float) var69 * var10 + var67);
								this.field1145.method19553((float) var69 * var11 + var68);
								this.field1145.p1(var62);
								this.field1145.p1(var63);
								this.field1145.p1(var64);
								this.field1145.p1(var65);
								this.field1145.method19553(1.0F);
								this.field1145.method19553(0.0F);
								this.field1145.method19553((float) var69 * var12 + var66);
								this.field1145.method19553((float) var69 * var13 + var67);
								this.field1145.method19553((float) var69 * var14 + var68);
								this.field1145.p1(var62);
								this.field1145.p1(var63);
								this.field1145.p1(var64);
								this.field1145.p1(var65);
							} else {
								arg0.field9920.method6687(var60.field12156, var69, var69, 0.0F, 0.0F, 0.0F);
								arg0.field9920.multiply(arg0.field9919);
								arg0.field9920.method6614(1.0F, 0.0F, 0.0F, var18);
								arg0.field9920.method6614(0.0F, 1.0F, 0.0F, var19);
								this.field1145.method19553(0.0F);
								this.field1145.method19553(0.0F);
								this.field1145.method19553(var66 - var18[0] - var19[0]);
								this.field1145.method19553(var67 - var18[1] - var19[1]);
								this.field1145.method19553(var68 - var18[2] - var19[2]);
								this.field1145.p1(var62);
								this.field1145.p1(var63);
								this.field1145.p1(var64);
								this.field1145.p1(var65);
								this.field1145.method19553(0.0F);
								this.field1145.method19553(1.0F);
								this.field1145.method19553(var66 - var18[0] + var19[0]);
								this.field1145.method19553(var67 - var18[1] + var19[1]);
								this.field1145.method19553(var68 - var18[2] + var19[2]);
								this.field1145.p1(var62);
								this.field1145.p1(var63);
								this.field1145.p1(var64);
								this.field1145.p1(var65);
								this.field1145.method19553(1.0F);
								this.field1145.method19553(1.0F);
								this.field1145.method19553(var18[0] + var66 + var19[0]);
								this.field1145.method19553(var18[1] + var67 + var19[1]);
								this.field1145.method19553(var18[2] + var68 + var19[2]);
								this.field1145.p1(var62);
								this.field1145.p1(var63);
								this.field1145.p1(var64);
								this.field1145.p1(var65);
								this.field1145.method19553(1.0F);
								this.field1145.method19553(0.0F);
								this.field1145.method19553(var18[0] + var66 - var19[0]);
								this.field1145.method19553(var18[1] + var67 - var19[1]);
								this.field1145.method19553(var18[2] + var68 - var19[2]);
								this.field1145.p1(var62);
								this.field1145.p1(var63);
								this.field1145.p1(var64);
								this.field1145.p1(var65);
							}
						}
					}
				}
			}
		}
		if (this.field1145.pos != 0) {
			this.field1134.method1286(24, this.field1145.data, this.field1145.pos);
			arg0.method15809(this.field1135, null, this.field1136, this.field1143);
			arg0.method15801(7, 0, this.field1145.pos / 24);
		}
	}

	@ObfuscatedName("cu.k(Lafa;)V")
	public void method1326(GlToolkit arg0) {
		field1137 = arg0.field9946;
		arg0.method15773();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method15789(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@ObfuscatedName("cu.f(Lafa;)V")
	public void method1329(GlToolkit arg0) {
		arg0.method15789(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (field1137 != arg0.field9946) {
			arg0.setSunAmbientIntensity(field1137);
		}
	}
}

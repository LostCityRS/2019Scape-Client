package com.jagex.graphics.safe;

import com.jagex.core.utils.Algorithms;
import com.jagex.core.utils.ColourUtils;
import com.jagex.game.client.HardShadow;
import com.jagex.game.client.ScreenBoundingBox;
import com.jagex.game.config.BillboardType;
import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEmitterType;
import com.jagex.graphics.*;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

@ObfuscatedName("afi")
public class PureJavaModel extends Model {

	@ObfuscatedName("afi.f")
	public PureJavaToolkit renderer;

	@ObfuscatedName("afi.w")
	public boolean field9533 = false;

	@ObfuscatedName("afi.l")
	public PureJavaToolkitContext field9534;

	@ObfuscatedName("afi.u")
	public PureJavaToolkitContext field9535;

	@ObfuscatedName("afi.z")
	public PureJavaRasteriser rasteriser;

	@ObfuscatedName("afi.p")
	public static int field9547 = 4096;

	@ObfuscatedName("afi.d")
	public static int field9564 = 4096;

	@ObfuscatedName("afi.q")
	public int allowedOperations;

	@ObfuscatedName("afi.x")
	public int field9546;

	@ObfuscatedName("afi.b")
	public int field9600;

	@ObfuscatedName("afi.h")
	public int vertexCount = 0;

	@ObfuscatedName("afi.a")
	public int field9549 = 0;

	@ObfuscatedName("afi.g")
	public int[] vertexX;

	@ObfuscatedName("afi.i")
	public int[] vertexY;

	@ObfuscatedName("afi.j")
	public int[] vertexZ;

	@ObfuscatedName("afi.t")
	public short[] vertexSourceModels;

	@ObfuscatedName("afi.ae")
	public PureJavaVertexNormal[] vertexNormal;

	@ObfuscatedName("afi.ag")
	public PureJavaVertexNormal[] field9555;

	@ObfuscatedName("afi.ah")
	public int faceCount = 0;

	@ObfuscatedName("afi.al")
	public int field9557 = 0;

	@ObfuscatedName("afi.ac")
	public short[] faceVertex1;

	@ObfuscatedName("afi.ai")
	public short[] faceVertex2;

	@ObfuscatedName("afi.aw")
	public short[] faceVertex3;

	@ObfuscatedName("afi.as")
	public float[][] faceVertexU;

	@ObfuscatedName("afi.at")
	public float[][] faceVertexV;

	@ObfuscatedName("afi.ad")
	public int[] field9563;

	@ObfuscatedName("afi.am")
	public int[] field9583;

	@ObfuscatedName("afi.au")
	public int[] field9565;

	@ObfuscatedName("afi.ax")
	public int field9602 = 0;

	@ObfuscatedName("afi.av")
	public PureJavaModelRelated1[] field9570;

	@ObfuscatedName("afi.ao")
	public byte[] faceType;

	@ObfuscatedName("afi.aj")
	public byte[] facePriority;

	@ObfuscatedName("afi.ay")
	public byte[] faceAlpha;

	@ObfuscatedName("afi.ab")
	public short[] field9574;

	@ObfuscatedName("afi.az")
	public short[] faceColour;

	@ObfuscatedName("afi.aa")
	public short[] field9576;

	@ObfuscatedName("afi.af")
	public short[] field9554;

	@ObfuscatedName("afi.ak")
	public int[][] labelVertices;

	@ObfuscatedName("afi.an")
	public int[][] labelFaces;

	@ObfuscatedName("afi.bf")
	public boolean field9580;

	@ObfuscatedName("afi.bl")
	public boolean verticesUpscaled = false;

	@ObfuscatedName("afi.bk")
	public int baseX;

	@ObfuscatedName("afi.bh")
	public int baseY;

	@ObfuscatedName("afi.bx")
	public int baseZ;

	@ObfuscatedName("afi.bd")
	public boolean field9538 = false;

	@ObfuscatedName("afi.bc")
	public ModelParticleEmitter[] emitters;

	@ObfuscatedName("afi.bi")
	public ModelParticleEffector[] effectors;

	@ObfuscatedName("afi.bn")
	public int billboardCount;

	@ObfuscatedName("afi.bt")
	public Billboard[] billboards;

	@ObfuscatedName("afi.bq")
	public BillboardPlacement[] billboardPlacements;

	@ObfuscatedName("afi.bm")
	public int[][] labelBillboards;

	@ObfuscatedName("afi.bb")
	public boolean boundsValid = false;

	@ObfuscatedName("afi.be")
	public short horizontalRadius;

	@ObfuscatedName("afi.by")
	public short radius;

	@ObfuscatedName("afi.bu")
	public short minY;

	@ObfuscatedName("afi.bw")
	public short maxY;

	@ObfuscatedName("afi.bo")
	public short minX;

	@ObfuscatedName("afi.bz")
	public short maxX;

	@ObfuscatedName("afi.bv")
	public short minZ;

	@ObfuscatedName("afi.br")
	public short maxZ;

	@ObfuscatedName("afi.bg")
	public boolean heightValid = false;

	@ObfuscatedName("afi.ba")
	public short height;

	@ObfuscatedName("afi.bp")
	public boolean field9548 = false;

	@ObfuscatedName("afi.bj")
	public boolean field9608 = false;

	@ObfuscatedName("afi.bs")
	public static int field9543 = 0;

	@ObfuscatedName("afi.cl")
	public int[] field9606;

	@ObfuscatedName("afi.cg")
	public float[] field9578;

	@ObfuscatedName("afi.ce")
	public float[] field9607;

	@ObfuscatedName("afi.cu")
	public float[] field9609;

	@ObfuscatedName("afi.ci")
	public float[] field9610;

	@ObfuscatedName("afi.cn")
	public int[] field9579;

	@ObfuscatedName("afi.cv")
	public int[] field9612;

	@ObfuscatedName("afi.cp")
	public int[] field9594;

	@ObfuscatedName("afi.ca")
	public int[] field9614;

	@ObfuscatedName("afi.cx")
	public int[] field9615;

	@ObfuscatedName("afi.cw")
	public int[] field9618;

	@ObfuscatedName("afi.ct")
	public PureJavaModel[] field9617;

	@ObfuscatedName("afi.cf")
	public PureJavaModel[] field9539;

	public PureJavaModel(PureJavaToolkit renderer) {
		this.renderer = renderer;
	}

	public PureJavaModel(PureJavaToolkit renderer, ModelUnlit model, int allowedOperations, int arg3, int arg4, int arg5) {
		this.renderer = renderer;
		this.allowedOperations = allowedOperations;
		this.field9546 = arg3;
		this.field9600 = arg4;
		MaterialList var7 = this.renderer.materialList;
		BillboardTypeList var8 = this.renderer.billboardList;
		this.vertexCount = model.vertexCount;
		this.field9549 = model.field1374;
		this.vertexX = model.vertexX;
		this.vertexY = model.vertexY;
		this.vertexZ = model.vertexZ;
		this.faceCount = model.faceCount;
		this.faceVertex1 = model.faceVertex1;
		this.faceVertex2 = model.faceVertex2;
		this.faceVertex3 = model.faceVertex3;
		this.facePriority = model.facePriority;
		this.faceColour = model.faceColour;
		this.faceAlpha = model.faceTrans;
		this.field9576 = model.field1399;
		this.faceType = model.faceType;
		this.emitters = model.emitters;
		this.effectors = model.effectors;
		this.vertexSourceModels = model.vertexSourceModels;

		this.field9557 = this.faceCount;
		int[] var9 = new int[this.faceCount];
		int var10 = 0;
		while (var10 < this.faceCount) {
			var9[var10] = var10++;
		}

		long[] var11 = new long[this.faceCount];
		boolean var12 = (this.allowedOperations & 0x100) != 0;
		for (int var13 = 0; var13 < this.faceCount; var13++) {
			int var14 = var9[var13];
			Material var15 = null;
			int var16 = 0;
			byte var17 = 0;
			byte var18 = 0;
			byte var19 = 0;

			if (model.billboard != null) {
				boolean var20 = false;
				for (int var21 = 0; var21 < model.billboard.length; var21++) {
					ModelBillboard var22 = model.billboard[var21];
					if (var22.field1654 == var14) {
						BillboardType var23 = var8.get(var22.field1653);
						if (var23.field3456) {
							var20 = true;
						}
						if (var23.field3455 != -1) {
							Material var24 = var7.get(var23.field3455);
							if (MaterialAlphaMode.MULTIPLY == var24.alphaMode) {
								this.field9548 = true;
							}
						}
					}
				}
				if (var20) {
					var11[var13] = Long.MAX_VALUE;
					this.field9557--;
					continue;
				}
			}
			if (model.emitters != null) {
				boolean var25 = false;
				for (int var26 = 0; var26 < model.emitters.length; var26++) {
					ModelParticleEmitter var27 = model.emitters[var26];
					if (var27.field1463 == var14) {
						ParticleEmitterType var28 = this.renderer.emitterTypeList.get(var27.particle);
						if (var28.field3510) {
							var25 = true;
						}
					}
				}
				if (var25) {
					var11[var13] = Long.MAX_VALUE;
					this.field9557--;
					continue;
				}
			}

			short var29 = -1;
			if (model.faceMaterial != null) {
				var29 = model.faceMaterial[var14];
				if (var29 != -1) {
					var15 = var7.get(var29 & 0xFFFF);
					if ((arg5 & 0x40) != 0 && var15.highDetail) {
						var29 = -1;
					} else {
						var18 = var15.effect;
						var19 = var15.effectArg1;
					}
				}
			}

			boolean var30 = this.faceAlpha != null && this.faceAlpha[var14] != 0 || var15 != null && MaterialAlphaMode.MULTIPLY == var15.alphaMode;
			if ((var12 || var30) && this.facePriority != null) {
				var16 += this.facePriority[var14] << 17;
			}

			if (var30) {
				var16 += 65536;
			}

			int var31 = ((var18 & 0xFF) << 8) + var16;
			int var32 = (var19 & 0xFF) + var31;
			int var33 = ((var29 & 0xFFFF) << 16) + var17;
			int var34 = (var13 & 0xFFFF) + var33;
			var11[var13] = ((long) var32 << 32) + (long) var34;
			this.field9548 |= var30;
		}

		Algorithms.quicksortParallel(var11, var9);

		if (model.billboard != null) {
			this.billboardCount = model.billboard.length;
			this.billboards = new Billboard[this.billboardCount];
			this.billboardPlacements = new BillboardPlacement[this.billboardCount];
			for (int var35 = 0; var35 < model.billboard.length; var35++) {
				ModelBillboard var36 = model.billboard[var35];
				BillboardType var37 = var8.get(var36.field1653);
				int var38 = ColourUtils.field8149[model.faceColour[var36.field1654] & 0xFFFF] & 0xFFFFFF;
				int var39 = var38 | 255 - (model.faceTrans == null ? 0 : model.faceTrans[var36.field1654] & 0xFF) << 24;
				this.billboards[var35] = new Billboard(var36.field1654, model.faceVertex1[var36.field1654], model.faceVertex2[var36.field1654], model.faceVertex3[var36.field1654], var37.field3451, var37.field3452, var37.field3455, var37.field3450, var37.field3453, var37.field3456, var36.field1656);
				this.billboardPlacements[var35] = new BillboardPlacement(var39);
			}
		}

		this.faceVertexU = new float[this.faceCount][];
		this.faceVertexV = new float[this.faceCount][];
		ModelRelated1 var40 = this.method1687(model, var9, this.faceCount);
		PureJavaToolkitContext var41 = this.renderer.getContext(Thread.currentThread());
		float[] var42 = var41.field860;
		boolean var43 = false;

		for (int var44 = 0; var44 < this.faceCount; var44++) {
			int var45 = var9[var44];
			short var46 = model.faceMaterial == null ? -1 : model.faceMaterial[var45];
			if (var46 != -1 && (arg5 & 0x40) != 0 && var7.get(var46 & 0xFFFF).highDetail) {
				var46 = -1;
			}
			if (var46 != -1) {
				short var47 = model.faceMapping == null ? -1 : model.faceMapping[var45];
				var43 = true;
				float[] var48 = this.faceVertexU[var45] = new float[3];
				float[] var49 = this.faceVertexV[var45] = new float[3];
				if (var47 == 32766) {
					int var50 = model.faceTextureVertexOffset1[var45] & 0xFF;
					int var51 = model.faceTextureVertexOffset2[var45] & 0xFF;
					int var52 = model.faceTextureVertexOffset3[var45] & 0xFF;
					int var53 = model.vertexTextureVertex[model.faceVertex1[var45]] + var50;
					int var54 = model.vertexTextureVertex[model.faceVertex2[var45]] + var51;
					int var55 = model.vertexTextureVertex[model.faceVertex3[var45]] + var52;
					var48[0] = model.textureVertexU[var53];
					var49[0] = model.textureVertexV[var53];
					var48[1] = model.textureVertexU[var54];
					var49[1] = model.textureVertexV[var54];
					var48[2] = model.textureVertexU[var55];
					var49[2] = model.textureVertexV[var55];
				} else if (var47 == -1) {
					var48[0] = 0.0F;
					var49[0] = 1.0F;
					var48[1] = 1.0F;
					var49[1] = 1.0F;
					var48[2] = 0.0F;
					var49[2] = 0.0F;
				} else {
					int var56 = var47 & 0xFFFF;
					byte var57 = model.textureTriangleType[var56];
					if (var57 == 0) {
						short var58 = this.faceVertex1[var45];
						short var59 = this.faceVertex2[var45];
						short var60 = this.faceVertex3[var45];
						short var61 = model.textureTriangleVertex1[var56];
						short var62 = model.textureTriangleVertex2[var56];
						short var63 = model.textureTriangleVertex3[var56];
						float var64 = (float) this.vertexX[var61];
						float var65 = (float) this.vertexY[var61];
						float var66 = (float) this.vertexZ[var61];
						float var67 = (float) this.vertexX[var62] - var64;
						float var68 = (float) this.vertexY[var62] - var65;
						float var69 = (float) this.vertexZ[var62] - var66;
						float var70 = (float) this.vertexX[var63] - var64;
						float var71 = (float) this.vertexY[var63] - var65;
						float var72 = (float) this.vertexZ[var63] - var66;
						float var73 = (float) this.vertexX[var58] - var64;
						float var74 = (float) this.vertexY[var58] - var65;
						float var75 = (float) this.vertexZ[var58] - var66;
						float var76 = (float) this.vertexX[var59] - var64;
						float var77 = (float) this.vertexY[var59] - var65;
						float var78 = (float) this.vertexZ[var59] - var66;
						float var79 = (float) this.vertexX[var60] - var64;
						float var80 = (float) this.vertexY[var60] - var65;
						float var81 = (float) this.vertexZ[var60] - var66;
						float var82 = var68 * var72 - var69 * var71;
						float var83 = var69 * var70 - var67 * var72;
						float var84 = var67 * var71 - var68 * var70;
						float var85 = var71 * var84 - var72 * var83;
						float var86 = var72 * var82 - var70 * var84;
						float var87 = var70 * var83 - var71 * var82;
						float var88 = 1.0F / (var69 * var87 + var67 * var85 + var68 * var86);
						var48[0] = (var75 * var87 + var73 * var85 + var74 * var86) * var88;
						var48[1] = (var78 * var87 + var76 * var85 + var77 * var86) * var88;
						var48[2] = (var81 * var87 + var79 * var85 + var80 * var86) * var88;
						float var89 = var68 * var84 - var69 * var83;
						float var90 = var69 * var82 - var67 * var84;
						float var91 = var67 * var83 - var68 * var82;
						float var92 = 1.0F / (var72 * var91 + var70 * var89 + var71 * var90);
						var49[0] = (var75 * var91 + var73 * var89 + var74 * var90) * var92;
						var49[1] = (var78 * var91 + var76 * var89 + var77 * var90) * var92;
						var49[2] = (var81 * var91 + var79 * var89 + var80 * var90) * var92;
					} else {
						short var93 = this.faceVertex1[var45];
						short var94 = this.faceVertex2[var45];
						short var95 = this.faceVertex3[var45];
						int var96 = var40.field1688[var56];
						int var97 = var40.field1690[var56];
						int var98 = var40.field1689[var56];
						float[] var99 = var40.field1691[var56];
						byte var100 = model.textureTriangleDirection[var56];
						float var101 = (float) model.textureTriangleSpeed[var56] / 256.0F;
						if (var57 == 1) {
							float var102 = (float) model.textureTriangleScaleZ[var56] / 1024.0F;
							method1684(this.vertexX[var93], this.vertexY[var93], this.vertexZ[var93], var96, var97, var98, var99, var102, var100, var101, var42);
							var48[0] = var42[0];
							var49[0] = var42[1];
							method1684(this.vertexX[var94], this.vertexY[var94], this.vertexZ[var94], var96, var97, var98, var99, var102, var100, var101, var42);
							var48[1] = var42[0];
							var49[1] = var42[1];
							method1684(this.vertexX[var95], this.vertexY[var95], this.vertexZ[var95], var96, var97, var98, var99, var102, var100, var101, var42);
							var48[2] = var42[0];
							var49[2] = var42[1];
							float var103 = var102 / 2.0F;
							if ((var100 & 0x1) == 0) {
								if (var48[1] - var48[0] > var103) {
									var48[1] -= var102;
								} else if (var48[0] - var48[1] > var103) {
									var48[1] += var102;
								}
								if (var48[2] - var48[0] > var103) {
									var48[2] -= var102;
								} else if (var48[0] - var48[2] > var103) {
									var48[2] += var102;
								}
							} else {
								if (var49[1] - var49[0] > var103) {
									var49[1] -= var102;
								} else if (var49[0] - var49[1] > var103) {
									var49[1] += var102;
								}
								if (var49[2] - var49[0] > var103) {
									var49[2] -= var102;
								} else if (var49[0] - var49[2] > var103) {
									var49[2] += var102;
								}
							}
						} else if (var57 == 2) {
							float var104 = (float) model.textureTriangleTranslationU[var56] / 256.0F;
							float var105 = (float) model.textureTriangleTranslationV[var56] / 256.0F;
							int var106 = this.vertexX[var94] - this.vertexX[var93];
							int var107 = this.vertexY[var94] - this.vertexY[var93];
							int var108 = this.vertexZ[var94] - this.vertexZ[var93];
							int var109 = this.vertexX[var95] - this.vertexX[var93];
							int var110 = this.vertexY[var95] - this.vertexY[var93];
							int var111 = this.vertexZ[var95] - this.vertexZ[var93];
							int var112 = var107 * var111 - var108 * var110;
							int var113 = var108 * var109 - var106 * var111;
							int var114 = var106 * var110 - var107 * var109;
							float var115 = 64.0F / (float) model.textureTriangleScaleX[var56];
							float var116 = 64.0F / (float) model.textureTriangleScaleY[var56];
							float var117 = 64.0F / (float) model.textureTriangleScaleZ[var56];
							float var118 = (var99[2] * (float) var114 + var99[0] * (float) var112 + var99[1] * (float) var113) / var115;
							float var119 = (var99[5] * (float) var114 + var99[3] * (float) var112 + var99[4] * (float) var113) / var116;
							float var120 = (var99[8] * (float) var114 + var99[6] * (float) var112 + var99[7] * (float) var113) / var117;
							int var121 = method1685(var118, var119, var120);
							method1708(this.vertexX[var93], this.vertexY[var93], this.vertexZ[var93], var96, var97, var98, var121, var99, var100, var101, var104, var105, var42);
							var48[0] = var42[0];
							var49[0] = var42[1];
							method1708(this.vertexX[var94], this.vertexY[var94], this.vertexZ[var94], var96, var97, var98, var121, var99, var100, var101, var104, var105, var42);
							var48[1] = var42[0];
							var49[1] = var42[1];
							method1708(this.vertexX[var95], this.vertexY[var95], this.vertexZ[var95], var96, var97, var98, var121, var99, var100, var101, var104, var105, var42);
							var48[2] = var42[0];
							var49[2] = var42[1];
						} else if (var57 == 3) {
							method1753(this.vertexX[var93], this.vertexY[var93], this.vertexZ[var93], var96, var97, var98, var99, var100, var101, var42);
							var48[0] = var42[0];
							var49[0] = var42[1];
							method1753(this.vertexX[var94], this.vertexY[var94], this.vertexZ[var94], var96, var97, var98, var99, var100, var101, var42);
							var48[1] = var42[0];
							var49[1] = var42[1];
							method1753(this.vertexX[var95], this.vertexY[var95], this.vertexZ[var95], var96, var97, var98, var99, var100, var101, var42);
							var48[2] = var42[0];
							var49[2] = var42[1];
							if ((var100 & 0x1) == 0) {
								if (var48[1] - var48[0] > 0.5F) {
									var48[1]--;
								} else if (var48[0] - var48[1] > 0.5F) {
									var48[1]++;
								}
								if (var48[2] - var48[0] > 0.5F) {
									var48[2]--;
								} else if (var48[0] - var48[2] > 0.5F) {
									var48[2]++;
								}
							} else {
								if (var49[1] - var49[0] > 0.5F) {
									var49[1]--;
								} else if (var49[0] - var49[1] > 0.5F) {
									var49[1]++;
								}
								if (var49[2] - var49[0] > 0.5F) {
									var49[2]--;
								} else if (var49[0] - var49[2] > 0.5F) {
									var49[2]++;
								}
							}
						}
					}
				}
			}
		}
		if (!var43) {
			this.faceVertexV = null;
			this.faceVertexU = null;
		}
		if (model.vertexLabel != null && (this.allowedOperations & 0x20) != 0) {
			this.labelVertices = model.method1940(true);
		}
		if (model.faceLabel != null && (this.allowedOperations & 0x180) != 0) {
			this.labelFaces = model.method1941();
		}
		if (model.billboard != null && (this.allowedOperations & 0x400) != 0) {
			this.labelBillboards = model.method1963();
		}
		if (model.faceMaterial == null) {
			this.field9574 = null;
		} else {
			this.field9574 = new short[this.faceCount];
			boolean var122 = false;
			for (int var123 = 0; var123 < this.faceCount; var123++) {
				short var124 = model.faceMaterial[var123];
				if (var124 == -1) {
					this.field9574[var123] = -1;
				} else {
					Material var125 = this.renderer.materialList.get(var124 & 0xFFFF);
					if ((arg5 & 0x40) != 0 && var125.highDetail) {
						this.field9574[var123] = -1;
					} else {
						this.field9574[var123] = var124;
						var122 = true;
						if (MaterialAlphaMode.MULTIPLY == var125.alphaMode) {
							this.field9548 = true;
						}
						if (var125.speedU != 0.0F || var125.speedV != 0.0F) {
							this.field9608 = true;
						}
					}
				}
			}
			if (!var122) {
				this.field9574 = null;
			}
		}

		if (this.field9548 || this.billboards != null) {
			this.field9554 = new short[this.faceCount];
			for (int var126 = 0; var126 < this.faceCount; var126++) {
				this.field9554[var126] = (short) var9[var126];
			}
		}
	}

	@ObfuscatedName("afi.hb(Laz;)V")
	public void method15458(PureJavaToolkitContext arg0) {
		this.rasteriser = arg0.rasteriser;
		if (this.field9534 == arg0) {
			return;
		}
		this.field9534 = arg0;
		this.field9606 = this.field9534.field841;
		this.field9578 = this.field9534.field842;
		this.field9607 = this.field9534.field843;
		this.field9609 = this.field9534.field844;
		this.field9610 = this.field9534.field864;
		this.field9579 = this.field9534.field846;
		this.field9612 = this.field9534.field847;
		this.field9594 = this.field9534.field848;
		this.field9614 = this.field9534.field849;
		this.field9615 = this.field9534.field850;
		this.field9618 = this.field9534.field851;
	}

	@ObfuscatedName("afi.hg(Ljava/lang/Thread;)V")
	public void method15545(Thread arg0) {
		PureJavaToolkitContext var2 = this.renderer.getContext(arg0);
		if (this.field9535 != var2) {
			this.field9535 = var2;
			this.field9617 = this.field9535.field830;
			this.field9539 = this.field9535.field862;
		}
	}

	@ObfuscatedName("afi.hd()V")
	public void method15496() {
		if (this.field9602 != 0 || this.vertexNormal != null) {
			return;
		}
		if (this.renderer.threadLocalsCount > 1) {
			synchronized (this) {
				this.method15459();
			}
		} else {
			this.method15459();
		}
	}

	@ObfuscatedName("afi.hx()V")
	public void method15459() {
		this.vertexNormal = new PureJavaVertexNormal[this.field9549];
		for (int var1 = 0; var1 < this.field9549; var1++) {
			this.vertexNormal[var1] = new PureJavaVertexNormal();
		}
		for (int var2 = 0; var2 < this.faceCount; var2++) {
			short var3 = this.faceVertex1[var2];
			short var4 = this.faceVertex2[var2];
			short var5 = this.faceVertex3[var2];
			int var6 = this.vertexX[var4] - this.vertexX[var3];
			int var7 = this.vertexY[var4] - this.vertexY[var3];
			int var8 = this.vertexZ[var4] - this.vertexZ[var3];
			int var9 = this.vertexX[var5] - this.vertexX[var3];
			int var10 = this.vertexY[var5] - this.vertexY[var3];
			int var11 = this.vertexZ[var5] - this.vertexZ[var3];
			int var12 = var7 * var11 - var8 * var10;
			int var13 = var8 * var9 - var6 * var11;
			int var14;
			for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
				var12 >>= 0x1;
				var13 >>= 0x1;
			}
			int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
			if (var15 <= 0) {
				var15 = 1;
			}
			int var16 = var12 * 256 / var15;
			int var17 = var13 * 256 / var15;
			int var18 = var14 * 256 / var15;
			byte var19;
			if (this.faceType == null) {
				var19 = 0;
			} else {
				var19 = this.faceType[var2];
			}
			if (var19 == 0) {
				PureJavaVertexNormal var20 = this.vertexNormal[var3];
				var20.field875 += var16;
				var20.field874 += var17;
				var20.field873 += var18;
				var20.field876++;
				PureJavaVertexNormal var21 = this.vertexNormal[var4];
				var21.field875 += var16;
				var21.field874 += var17;
				var21.field873 += var18;
				var21.field876++;
				PureJavaVertexNormal var22 = this.vertexNormal[var5];
				var22.field875 += var16;
				var22.field874 += var17;
				var22.field873 += var18;
				var22.field876++;
			} else if (var19 == 1) {
				if (this.field9570 == null) {
					this.field9570 = new PureJavaModelRelated1[this.faceCount];
				}
				PureJavaModelRelated1 var23 = this.field9570[var2] = new PureJavaModelRelated1();
				var23.field871 = var16;
				var23.field869 = var17;
				var23.field870 = var18;
			}
		}
	}

	@ObfuscatedName("afi.hq(Z)V")
	public void method15466(boolean arg0) {
		if (this.renderer.threadLocalsCount > 1) {
			synchronized (this) {
				this.method15460(arg0);
			}
		} else {
			this.method15460(arg0);
		}
	}

	@ObfuscatedName("afi.hf(Z)V")
	public void method15460(boolean arg0) {
		if (this.field9602 == 1) {
			this.method15546();
		} else if (this.field9602 == 2) {
			if ((this.allowedOperations & 0x97098) == 0 && this.faceVertexU == null) {
				this.faceColour = null;
			}
			if (arg0) {
				this.faceType = null;
			}
		} else {
			this.method15496();
			int var2 = this.renderer.field9804;
			int var3 = this.renderer.field9787;
			int var4 = this.renderer.field9788;
			int var5 = this.renderer.field9791 >> 8;
			int var6 = 0;
			int var7 = 0;
			if (this.field9600 != 0) {
				var6 = this.renderer.field9783 * 768 / this.field9600;
				var7 = this.renderer.field9790 * 768 / this.field9600;
			}
			if (this.field9563 == null) {
				this.field9563 = new int[this.faceCount];
				this.field9583 = new int[this.faceCount];
				this.field9565 = new int[this.faceCount];
			}
			for (int var8 = 0; var8 < this.faceCount; var8++) {
				byte var9;
				if (this.faceType == null) {
					var9 = 0;
				} else {
					var9 = this.faceType[var8];
				}
				byte var10;
				if (this.faceAlpha == null) {
					var10 = 0;
				} else {
					var10 = this.faceAlpha[var8];
				}
				short var11;
				if (this.field9574 == null) {
					var11 = -1;
				} else {
					var11 = this.field9574[var8];
				}
				if (var10 == -2) {
					var9 = 3;
				}
				if (var10 == -1) {
					var9 = 2;
				}
				if (var11 != -1) {
					int var34 = this.faceColour[var8] & 0xFFFF;
					if (var9 == 0) {
						PureJavaVertexNormal var35;
						if (this.field9555 == null || this.field9555[this.faceVertex1[var8]] == null) {
							var35 = this.vertexNormal[this.faceVertex1[var8]];
						} else {
							var35 = this.field9555[this.faceVertex1[var8]];
						}
						int var36 = (var35.field873 * var4 + var35.field875 * var2 + var35.field874 * var3) / var35.field876 >> 16;
						int var37 = var36 > 256 ? var6 : var7;
						int var38 = this.method15463((var36 * var37 >> 18) + (var5 >> 2));
						this.field9563[var8] = var38 << 24 | this.method15461(var34, var11, var38);
						PureJavaVertexNormal var39;
						if (this.field9555 == null || this.field9555[this.faceVertex2[var8]] == null) {
							var39 = this.vertexNormal[this.faceVertex2[var8]];
						} else {
							var39 = this.field9555[this.faceVertex2[var8]];
						}
						int var40 = (var39.field873 * var4 + var39.field875 * var2 + var39.field874 * var3) / var39.field876 >> 16;
						int var41 = var40 > 256 ? var6 : var7;
						int var42 = this.method15463((var40 * var41 >> 18) + (var5 >> 2));
						this.field9583[var8] = var42 << 24 | this.method15461(var34, var11, var42);
						PureJavaVertexNormal var43;
						if (this.field9555 == null || this.field9555[this.faceVertex3[var8]] == null) {
							var43 = this.vertexNormal[this.faceVertex3[var8]];
						} else {
							var43 = this.field9555[this.faceVertex3[var8]];
						}
						int var44 = (var43.field873 * var4 + var43.field875 * var2 + var43.field874 * var3) / var43.field876 >> 16;
						int var45 = var44 > 256 ? var6 : var7;
						int var46 = this.method15463((var44 * var45 >> 18) + (var5 >> 2));
						this.field9565[var8] = var46 << 24 | this.method15461(var34, var11, var46);
					} else if (var9 == 1) {
						PureJavaModelRelated1 var47 = this.field9570[var8];
						int var48 = var47.field870 * var4 + var47.field871 * var2 + var47.field869 * var3 >> 16;
						int var49 = var48 > 256 ? var6 : var7;
						int var50 = this.method15463((var48 * var49 >> 18) + (var5 >> 2));
						this.field9563[var8] = var50 << 24 | this.method15461(var34, var11, var50);
						this.field9565[var8] = -1;
					} else {
						this.field9565[var8] = -2;
					}
				} else if (var9 == 0) {
					int var12 = this.faceColour[var8] & 0xFFFF;
					int var13 = (var12 & 0x7F) * this.field9546 >> 7;
					short var14 = ColourUtils.method4937(var12 & 0xFFFFFF80 | var13);
					PureJavaVertexNormal var15;
					if (this.field9555 == null || this.field9555[this.faceVertex1[var8]] == null) {
						var15 = this.vertexNormal[this.faceVertex1[var8]];
					} else {
						var15 = this.field9555[this.faceVertex1[var8]];
					}
					int var16 = (var15.field873 * var4 + var15.field875 * var2 + var15.field874 * var3) / var15.field876 >> 16;
					int var17 = var16 > 256 ? var6 : var7;
					int var18 = (var16 * var17 >> 17) + (var5 >> 1);
					this.field9563[var8] = var18 << 17 | ColourUtils.method6807(var14, var18);
					PureJavaVertexNormal var19;
					if (this.field9555 == null || this.field9555[this.faceVertex2[var8]] == null) {
						var19 = this.vertexNormal[this.faceVertex2[var8]];
					} else {
						var19 = this.field9555[this.faceVertex2[var8]];
					}
					int var20 = (var19.field873 * var4 + var19.field875 * var2 + var19.field874 * var3) / var19.field876 >> 16;
					int var21 = var20 > 256 ? var6 : var7;
					int var22 = (var20 * var21 >> 17) + (var5 >> 1);
					this.field9583[var8] = var22 << 17 | ColourUtils.method6807(var14, var22);
					PureJavaVertexNormal var23;
					if (this.field9555 == null || this.field9555[this.faceVertex3[var8]] == null) {
						var23 = this.vertexNormal[this.faceVertex3[var8]];
					} else {
						var23 = this.field9555[this.faceVertex3[var8]];
					}
					int var24 = (var23.field873 * var4 + var23.field875 * var2 + var23.field874 * var3) / var23.field876 >> 16;
					int var25 = var24 > 256 ? var6 : var7;
					int var26 = (var24 * var25 >> 17) + (var5 >> 1);
					this.field9565[var8] = var26 << 17 | ColourUtils.method6807(var14, var26);
				} else if (var9 == 1) {
					int var27 = this.faceColour[var8] & 0xFFFF;
					int var28 = (var27 & 0x7F) * this.field9546 >> 7;
					short var29 = ColourUtils.method4937(var27 & 0xFFFFFF80 | var28);
					PureJavaModelRelated1 var30 = this.field9570[var8];
					int var31 = var30.field870 * var4 + var30.field871 * var2 + var30.field869 * var3 >> 16;
					int var32 = var31 > 256 ? var6 : var7;
					int var33 = (var31 * var32 >> 17) + (var5 >> 1);
					this.field9563[var8] = var33 << 17 | ColourUtils.method6807(var29, var33);
					this.field9565[var8] = -1;
				} else if (var9 == 3) {
					this.field9563[var8] = 128;
					this.field9565[var8] = -1;
				} else {
					this.field9565[var8] = -2;
				}
			}
			this.vertexNormal = null;
			this.field9555 = null;
			this.field9570 = null;
			if ((this.allowedOperations & 0x97098) == 0 && this.faceVertexU == null) {
				this.faceColour = null;
			}
			if (arg0) {
				this.faceType = null;
			}
			this.field9602 = 2;
		}
	}

	@ObfuscatedName("afi.hr(ISI)I")
	public int method15461(int arg0, short arg1, int arg2) {
		int var4 = ColourUtils.field8151[this.method15462(arg0, arg2)];
		Material var5 = this.renderer.materialList.get(arg1 & 0xFFFF);
		int var6 = var5.field1364 & 0xFF;
		if (var6 != 0) {
			int var7 = arg2 * 131586;
			if (var6 == 256) {
				var4 = var7;
			} else {
				int var9 = 256 - var6;
				var4 = ((var4 & 0xFF00FF) * var9 + (var7 & 0xFF00FF) * var6 & 0xFF00FF00) + ((var4 & 0xFF00) * var9 + (var7 & 0xFF00) * var6 & 0xFF0000) >> 8;
			}
		}
		int var10 = var5.field1363 & 0xFF;
		if (var10 != 0) {
			var10 += 256;
			int var11 = (var4 >> 16 & 0xFF) * var10;
			if (var11 > 65535) {
				var11 = 65535;
			}
			int var12 = (var4 >> 8 & 0xFF) * var10;
			if (var12 > 65535) {
				var12 = 65535;
			}
			int var13 = (var4 & 0xFF) * var10;
			if (var13 > 65535) {
				var13 = 65535;
			}
			var4 = (var13 >> 8) + ((var11 & 0xFF00) << 8) + (var12 & 0xFF00);
		}
		return var4;
	}

	@ObfuscatedName("afi.hs(II)I")
	public int method15462(int arg0, int arg1) {
		int var3 = (arg0 & 0x7F) * arg1 >> 7;
		if (var3 < 2) {
			var3 = 2;
		} else if (var3 > 126) {
			var3 = 126;
		}
		return (arg0 & 0xFF80) + var3;
	}

	@ObfuscatedName("afi.hh(I)I")
	public int method15463(int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@ObfuscatedName("afi.hp()V")
	public void method15546() {
		if (this.field9602 == 0) {
			this.method15466(false);
		} else if (this.renderer.threadLocalsCount > 1) {
			synchronized (this) {
				this.method15464();
			}
		} else {
			this.method15464();
		}
	}

	@ObfuscatedName("afi.hy()V")
	public void method15464() {
		for (int var1 = 0; var1 < this.faceCount; var1++) {
			short var2 = this.field9574 == null ? -1 : this.field9574[var1];
			if (var2 == -1) {
				int var3 = this.faceColour[var1] & 0xFFFF;
				int var4 = (var3 & 0x7F) * this.field9546 >> 7;
				short var5 = ColourUtils.method4937(var3 & 0xFFFFFF80 | var4);
				if (this.field9565[var1] == -1) {
					int var6 = this.field9563[var1] & 0xFFFE0000;
					this.field9563[var1] = var6 | ColourUtils.method6807(var5, var6 >> 17);
				} else if (this.field9565[var1] != -2) {
					int var7 = this.field9563[var1] & 0xFFFE0000;
					this.field9563[var1] = var7 | ColourUtils.method6807(var5, var7 >> 17);
					int var8 = this.field9583[var1] & 0xFFFE0000;
					this.field9583[var1] = var8 | ColourUtils.method6807(var5, var8 >> 17);
					int var9 = this.field9565[var1] & 0xFFFE0000;
					this.field9565[var1] = var9 | ColourUtils.method6807(var5, var9 >> 17);
				}
			}
		}
		this.field9602 = 2;
	}

	@ObfuscatedName("afi.bo(Ldo;IIIZ)V")
	public void method1686(Model arg0, int arg1, int arg2, int arg3, boolean arg4) {
		PureJavaModel var6 = (PureJavaModel) arg0;
		if ((this.allowedOperations & 0x10000) != 65536) {
			throw new IllegalStateException("");
		} else if ((var6.allowedOperations & 0x10000) == 65536) {
			this.method15458(this.renderer.getContext(Thread.currentThread()));
			this.calculateBounds();
			this.method15496();
			var6.calculateBounds();
			var6.method15496();
			field9543++;
			int var7 = 0;
			int[] var8 = var6.vertexX;
			int var9 = var6.field9549;
			for (int var10 = 0; var10 < this.field9549; var10++) {
				PureJavaVertexNormal var11 = this.vertexNormal[var10];
				if (var11.field876 != 0) {
					int var12 = this.vertexY[var10] - arg2;
					if (var12 >= var6.minY && var12 <= var6.maxY) {
						int var13 = this.vertexX[var10] - arg1;
						if (var13 >= var6.minX && var13 <= var6.maxX) {
							int var14 = this.vertexZ[var10] - arg3;
							if (var14 >= var6.minZ && var14 <= var6.maxZ) {
								for (int var15 = 0; var15 < var9; var15++) {
									PureJavaVertexNormal var16 = var6.vertexNormal[var15];
									if (var8[var15] == var13 && var6.vertexZ[var15] == var14 && var6.vertexY[var15] == var12 && var16.field876 != 0) {
										if (this.field9555 == null) {
											this.field9555 = new PureJavaVertexNormal[this.field9549];
										}
										if (var6.field9555 == null) {
											var6.field9555 = new PureJavaVertexNormal[var9];
										}
										PureJavaVertexNormal var17 = this.field9555[var10];
										if (var17 == null) {
											var17 = this.field9555[var10] = new PureJavaVertexNormal(var11);
										}
										PureJavaVertexNormal var18 = var6.field9555[var15];
										if (var18 == null) {
											var18 = var6.field9555[var15] = new PureJavaVertexNormal(var16);
										}
										var17.field875 += var16.field875;
										var17.field874 += var16.field874;
										var17.field873 += var16.field873;
										var17.field876 += var16.field876;
										var18.field875 += var11.field875;
										var18.field874 += var11.field874;
										var18.field873 += var11.field873;
										var18.field876 += var11.field876;
										var7++;
										this.field9614[var10] = field9543;
										this.field9615[var15] = field9543;
									}
								}
							}
						}
					}
				}
			}
			if (var7 >= 3 && arg4) {
				for (int var19 = 0; var19 < this.faceCount; var19++) {
					if (this.field9614[this.faceVertex1[var19]] == field9543 && this.field9614[this.faceVertex2[var19]] == field9543 && this.field9614[this.faceVertex3[var19]] == field9543) {
						if (this.faceType == null) {
							this.faceType = new byte[this.faceCount];
						}
						this.faceType[var19] = 2;
					}
				}
				for (int var20 = 0; var20 < var6.faceCount; var20++) {
					if (this.field9615[var6.faceVertex1[var20]] == field9543 && this.field9615[var6.faceVertex2[var20]] == field9543 && this.field9615[var6.faceVertex3[var20]] == field9543) {
						if (var6.faceType == null) {
							var6.faceType = new byte[var6.faceCount];
						}
						var6.faceType[var20] = 2;
					}
				}
			}
		} else {
			throw new IllegalStateException("");
		}
	}

	@ObfuscatedName("afi.l(BIZ)Ldo;")
	public Model method1773(byte arg0, int arg1, boolean arg2) {
		this.method15545(Thread.currentThread());
		boolean var4 = false;
		PureJavaModel var5;
		PureJavaModel var6;
		if (arg0 > 0 && arg0 <= 8) {
			var5 = this.field9539[arg0 - 1];
			var6 = this.field9617[arg0 - 1];
			var4 = true;
		} else {
			var6 = var5 = new PureJavaModel(this.renderer);
		}
		return this.method15465(var6, var5, arg1, var4, arg2);
	}

	@ObfuscatedName("afi.he(Lafi;Lafi;IZZ)Ldo;")
	public Model method15465(PureJavaModel arg0, PureJavaModel arg1, int arg2, boolean arg3, boolean arg4) {
		arg0.boundsValid = this.boundsValid;
		if (this.boundsValid) {
			arg0.maxX = this.maxX;
			arg0.maxY = this.maxY;
			arg0.maxZ = this.maxZ;
			arg0.minX = this.minX;
			arg0.minY = this.minY;
			arg0.minZ = this.minZ;
			arg0.horizontalRadius = this.horizontalRadius;
			arg0.radius = this.radius;
		}
		if (this.heightValid) {
			arg0.height = this.height;
			arg0.heightValid = true;
		} else {
			arg0.heightValid = false;
		}
		arg0.field9546 = this.field9546;
		arg0.field9600 = this.field9600;
		arg0.vertexCount = this.vertexCount;
		arg0.field9549 = this.field9549;
		arg0.faceCount = this.faceCount;
		arg0.billboardCount = this.billboardCount;
		arg0.field9557 = this.field9557;
		if ((arg2 & 0x100) == 0) {
			arg0.field9548 = this.field9548;
		} else {
			arg0.field9548 = true;
		}
		arg0.field9608 = this.field9608;
		boolean var6 = (arg2 & 0x7) == 7 | (arg2 & 0x20) != 0;
		boolean var7 = var6 || (arg2 & 0x1) != 0;
		boolean var8 = var6 || (arg2 & 0x2) != 0;
		boolean var9 = var6 || (arg2 & 0x4) != 0 || (arg2 & 0x10) != 0;
		if (var7 || var8 || var9) {
			if (var7) {
				if (arg1.vertexX == null || arg1.vertexX.length < this.vertexCount) {
					arg0.vertexX = arg1.vertexX = new int[this.vertexCount];
				} else {
					arg0.vertexX = arg1.vertexX;
				}
				for (int var10 = 0; var10 < this.vertexCount; var10++) {
					arg0.vertexX[var10] = this.vertexX[var10];
				}
			} else {
				arg0.vertexX = this.vertexX;
			}
			if (var8) {
				if (arg1.vertexY == null || arg1.vertexY.length < this.vertexCount) {
					arg0.vertexY = arg1.vertexY = new int[this.vertexCount];
				} else {
					arg0.vertexY = arg1.vertexY;
				}
				for (int var11 = 0; var11 < this.vertexCount; var11++) {
					arg0.vertexY[var11] = this.vertexY[var11];
				}
			} else {
				arg0.vertexY = this.vertexY;
			}
			if (var9) {
				if (arg1.vertexZ == null || arg1.vertexZ.length < this.vertexCount) {
					arg0.vertexZ = arg1.vertexZ = new int[this.vertexCount];
				} else {
					arg0.vertexZ = arg1.vertexZ;
				}
				for (int var12 = 0; var12 < this.vertexCount; var12++) {
					arg0.vertexZ[var12] = this.vertexZ[var12];
				}
			} else {
				arg0.vertexZ = this.vertexZ;
			}
		} else {
			arg0.vertexX = this.vertexX;
			arg0.vertexY = this.vertexY;
			arg0.vertexZ = this.vertexZ;
		}
		if ((arg2 & 0x84080) == 0) {
			arg0.faceColour = this.faceColour;
		} else {
			if (arg1.faceColour == null || arg1.faceColour.length < this.faceCount) {
				int var13 = this.faceCount;
				arg0.faceColour = arg1.faceColour = new short[var13];
			} else {
				arg0.faceColour = arg1.faceColour;
			}
			for (int var14 = 0; var14 < this.faceCount; var14++) {
				arg0.faceColour[var14] = this.faceColour[var14];
			}
		}
		if ((arg2 & 0x97018) != 0) {
			arg0.field9602 = 0;
			arg0.field9565 = null;
			arg0.field9583 = null;
			arg0.field9563 = null;
		} else if ((arg2 & 0x80) == 0) {
			if (arg4) {
				this.method15466(false);
			}
			arg0.field9563 = this.field9563;
			arg0.field9583 = this.field9583;
			arg0.field9565 = this.field9565;
			arg0.field9602 = this.field9602;
		} else {
			if (arg4) {
				this.method15466(false);
			}
			if (this.field9563 != null) {
				if (arg1.field9563 == null || arg1.field9563.length < this.faceCount) {
					int var17 = this.faceCount;
					arg0.field9563 = arg1.field9563 = new int[var17];
					arg0.field9583 = arg1.field9583 = new int[var17];
					arg0.field9565 = arg1.field9565 = new int[var17];
				} else {
					arg0.field9563 = arg1.field9563;
					arg0.field9583 = arg1.field9583;
					arg0.field9565 = arg1.field9565;
				}
				for (int var18 = 0; var18 < this.faceCount; var18++) {
					arg0.field9563[var18] = this.field9563[var18];
					arg0.field9583[var18] = this.field9583[var18];
					arg0.field9565[var18] = this.field9565[var18];
				}
			}
			arg0.field9602 = this.field9602;
		}
		if ((arg2 & 0x100) == 0) {
			arg0.faceAlpha = this.faceAlpha;
		} else {
			if (arg1.faceAlpha == null || arg1.faceAlpha.length < this.faceCount) {
				int var19 = this.faceCount;
				arg0.faceAlpha = arg1.faceAlpha = new byte[var19];
			} else {
				arg0.faceAlpha = arg1.faceAlpha;
			}
			if (this.faceAlpha == null) {
				for (int var21 = 0; var21 < this.faceCount; var21++) {
					arg0.faceAlpha[var21] = 0;
				}
			} else {
				for (int var20 = 0; var20 < this.faceCount; var20++) {
					arg0.faceAlpha[var20] = this.faceAlpha[var20];
				}
			}
		}
		if ((arg2 & 0x8) == 0 && (arg2 & 0x10) == 0) {
			if (arg4) {
				this.method15496();
			}
			arg0.vertexNormal = this.vertexNormal;
			arg0.field9570 = this.field9570;
		} else {
			if (arg1.vertexNormal == null || arg1.vertexNormal.length < this.field9549) {
				int var22 = this.field9549;
				arg0.vertexNormal = arg1.vertexNormal = new PureJavaVertexNormal[var22];
			} else {
				arg0.vertexNormal = arg1.vertexNormal;
			}
			if (this.vertexNormal == null) {
				arg0.vertexNormal = null;
			} else {
				for (int var23 = 0; var23 < this.field9549; var23++) {
					arg0.vertexNormal[var23] = new PureJavaVertexNormal(this.vertexNormal[var23]);
				}
			}
			if (this.field9570 == null) {
				arg0.field9570 = null;
			} else {
				if (arg1.field9570 == null || arg1.field9570.length < this.faceCount) {
					int var24 = this.faceCount;
					arg0.field9570 = arg1.field9570 = new PureJavaModelRelated1[var24];
				} else {
					arg0.field9570 = arg1.field9570;
				}
				for (int var25 = 0; var25 < this.faceCount; var25++) {
					arg0.field9570[var25] = this.field9570[var25] == null ? null : new PureJavaModelRelated1(this.field9570[var25]);
				}
			}
		}
		if ((arg2 & 0x8000) == 0) {
			arg0.field9574 = this.field9574;
		} else if (this.field9574 == null) {
			arg0.field9574 = null;
		} else {
			if (arg1.field9574 == null || arg1.field9574.length < this.faceCount) {
				int var26 = this.faceCount;
				arg0.field9574 = arg1.field9574 = new short[var26];
			} else {
				arg0.field9574 = arg1.field9574;
			}
			for (int var27 = 0; var27 < this.faceCount; var27++) {
				arg0.field9574[var27] = this.field9574[var27];
			}
		}
		if ((arg2 & 0x10000) == 0) {
			arg0.faceType = this.faceType;
		} else if (this.faceType == null) {
			arg0.faceType = null;
		} else {
			if (arg1.faceType == null || arg1.faceType.length < this.faceCount) {
				int var28 = arg3 ? this.faceCount + 100 : this.faceCount;
				arg0.faceType = arg1.faceType = new byte[var28];
			} else {
				arg0.faceType = arg1.faceType;
			}
			for (int var29 = 0; var29 < this.faceCount; var29++) {
				arg0.faceType[var29] = this.faceType[var29];
			}
		}
		if ((arg2 & 0xC580) == 0) {
			arg0.billboardPlacements = this.billboardPlacements;
		} else if (arg1.billboardPlacements == null || arg1.billboardPlacements.length < this.billboardCount) {
			int var31 = this.billboardCount;
			arg0.billboardPlacements = arg1.billboardPlacements = new BillboardPlacement[var31];
			for (int var32 = 0; var32 < this.billboardCount; var32++) {
				arg0.billboardPlacements[var32] = this.billboardPlacements[var32].method984();
			}
		} else {
			arg0.billboardPlacements = arg1.billboardPlacements;
			for (int var30 = 0; var30 < this.billboardCount; var30++) {
				arg0.billboardPlacements[var30].method985(this.billboardPlacements[var30]);
			}
		}
		if (this.faceVertexU == null || (arg2 & 0x10) == 0) {
			arg0.faceVertexU = this.faceVertexU;
			arg0.faceVertexV = this.faceVertexV;
		} else {
			if (arg1.faceVertexU == null || arg1.faceVertexU.length < this.faceCount) {
				int var33 = arg3 ? this.faceCount + 100 : this.faceCount;
				arg0.faceVertexU = arg1.faceVertexU = new float[var33][3];
			} else {
				arg0.faceVertexU = arg1.faceVertexU;
			}
			for (int var34 = 0; var34 < this.faceCount; var34++) {
				if (this.faceVertexU[var34] != null) {
					arg0.faceVertexU[var34][0] = this.faceVertexU[var34][0];
					arg0.faceVertexU[var34][1] = this.faceVertexU[var34][1];
					arg0.faceVertexU[var34][2] = this.faceVertexU[var34][2];
				}
			}
			if (arg1.faceVertexV == null || arg1.faceVertexV.length < this.faceCount) {
				int var35 = arg3 ? this.faceCount + 100 : this.faceCount;
				arg0.faceVertexV = arg1.faceVertexV = new float[var35][3];
			} else {
				arg0.faceVertexV = arg1.faceVertexV;
			}
			for (int var36 = 0; var36 < this.faceCount; var36++) {
				if (this.faceVertexV[var36] != null) {
					arg0.faceVertexV[var36][0] = this.faceVertexV[var36][0];
					arg0.faceVertexV[var36][1] = this.faceVertexV[var36][1];
					arg0.faceVertexV[var36][2] = this.faceVertexV[var36][2];
				}
			}
		}
		arg0.labelVertices = this.labelVertices;
		arg0.labelFaces = this.labelFaces;
		arg0.labelBillboards = this.labelBillboards;
		arg0.vertexSourceModels = this.vertexSourceModels;
		arg0.field9576 = this.field9576;
		arg0.facePriority = this.facePriority;
		arg0.faceVertex1 = this.faceVertex1;
		arg0.faceVertex2 = this.faceVertex2;
		arg0.faceVertex3 = this.faceVertex3;
		arg0.emitters = this.emitters;
		arg0.effectors = this.effectors;
		arg0.billboards = this.billboards;
		arg0.field9554 = this.field9554;
		arg0.allowedOperations = arg2;
		return arg0;
	}

	@ObfuscatedName("afi.z()I")
	public int method1691() {
		return this.allowedOperations;
	}

	@ObfuscatedName("afi.u(I)V")
	public void method1690(int arg0) {
		if (this.renderer.threadLocalsCount <= 1) {
			if ((this.allowedOperations & 0x10000) == 65536 && (arg0 & 0x10000) == 0) {
				this.method15466(true);
			}
			this.allowedOperations = arg0;
			return;
		}
		synchronized (this) {
			if ((this.allowedOperations & 0x10000) == 65536 && (arg0 & 0x10000) == 0) {
				this.method15466(true);
			}
			this.allowedOperations = arg0;
		}
	}

	@ObfuscatedName("afi.p()V")
	public void method1816() {
	}

	@ObfuscatedName("afi.d(I)V")
	public void method1693(int arg0) {
		if ((this.allowedOperations & 0x5) != 5) {
			throw new IllegalStateException();
		} else if (arg0 == 4096) {
			this.rotateY90();
		} else if (arg0 == 8192) {
			this.method15468();
		} else if (arg0 == 12288) {
			this.method15469();
		} else {
			int var2 = Trig1.sin[arg0];
			int var3 = Trig1.cos[arg0];
			synchronized (this) {
				for (int var5 = 0; var5 < this.vertexCount; var5++) {
					int var6 = this.vertexZ[var5] * var2 + this.vertexX[var5] * var3 >> 14;
					this.vertexZ[var5] = this.vertexZ[var5] * var3 - this.vertexX[var5] * var2 >> 14;
					this.vertexX[var5] = var6;
				}
				this.method15477();
			}
		}
	}

	@ObfuscatedName("afi.c(I)V")
	public void method1694(int arg0) {
		if ((this.allowedOperations & 0xD) != 13) {
			throw new IllegalStateException();
		} else if (this.vertexNormal == null) {
			this.method1693(arg0);
		} else if (arg0 == 4096) {
			this.method15506();
			return;
		} else if (arg0 == 8192) {
			this.method15471();
			return;
		} else if (arg0 == 12288) {
			this.method15472();
			return;
		} else {
			int var2 = Trig1.sin[arg0];
			int var3 = Trig1.cos[arg0];
			synchronized (this) {
				for (int var5 = 0; var5 < this.field9549; var5++) {
					int var6 = this.vertexZ[var5] * var2 + this.vertexX[var5] * var3 >> 14;
					this.vertexZ[var5] = this.vertexZ[var5] * var3 - this.vertexX[var5] * var2 >> 14;
					this.vertexX[var5] = var6;
					if (this.vertexNormal[var5] != null) {
						int var7 = this.vertexNormal[var5].field875 * var3 + this.vertexNormal[var5].field873 * var2 >> 14;
						this.vertexNormal[var5].field873 = this.vertexNormal[var5].field873 * var3 - this.vertexNormal[var5].field875 * var2 >> 14;
						this.vertexNormal[var5].field875 = var7;
					}
				}
				if (this.field9570 != null) {
					for (int var8 = 0; var8 < this.faceCount; var8++) {
						if (this.field9570[var8] != null) {
							int var9 = this.field9570[var8].field871 * var3 + this.field9570[var8].field870 * var2 >> 14;
							this.field9570[var8].field870 = this.field9570[var8].field870 * var3 - this.field9570[var8].field871 * var2 >> 14;
							this.field9570[var8].field871 = var9;
						}
					}
				}
				for (int var10 = this.field9549; var10 < this.vertexCount; var10++) {
					int var11 = this.vertexZ[var10] * var2 + this.vertexX[var10] * var3 >> 14;
					this.vertexZ[var10] = this.vertexZ[var10] * var3 - this.vertexX[var10] * var2 >> 14;
					this.vertexX[var10] = var11;
				}
				this.field9602 = 0;
				this.boundsValid = false;
			}
		}
	}

	@ObfuscatedName("afi.hn()V")
	public void rotateY90() {
		synchronized (this) {
			for (int var2 = 0; var2 < this.vertexCount; var2++) {
				int var3 = this.vertexX[var2];
				this.vertexX[var2] = this.vertexZ[var2];
				this.vertexZ[var2] = -var3;
			}
			this.method15477();
		}
	}

	@ObfuscatedName("afi.hi()V")
	public void method15468() {
		synchronized (this) {
			for (int var2 = 0; var2 < this.vertexCount; var2++) {
				this.vertexX[var2] = -this.vertexX[var2];
				this.vertexZ[var2] = -this.vertexZ[var2];
			}
			this.method15477();
		}
	}

	@ObfuscatedName("afi.hw()V")
	public void method15469() {
		synchronized (this) {
			for (int var2 = 0; var2 < this.vertexCount; var2++) {
				int var3 = this.vertexZ[var2];
				this.vertexZ[var2] = this.vertexX[var2];
				this.vertexX[var2] = -var3;
			}
			this.method15477();
		}
	}

	@ObfuscatedName("afi.ht()V")
	public void method15506() {
		synchronized (this) {
			for (int var2 = 0; var2 < this.field9549; var2++) {
				int var3 = this.vertexX[var2];
				this.vertexX[var2] = this.vertexZ[var2];
				this.vertexZ[var2] = -var3;
				if (this.vertexNormal[var2] != null) {
					int var4 = this.vertexNormal[var2].field875;
					this.vertexNormal[var2].field875 = this.vertexNormal[var2].field873;
					this.vertexNormal[var2].field873 = -var4;
				}
			}
			if (this.field9570 != null) {
				for (int var5 = 0; var5 < this.faceCount; var5++) {
					if (this.field9570[var5] != null) {
						int var6 = this.field9570[var5].field871;
						this.field9570[var5].field871 = this.field9570[var5].field870;
						this.field9570[var5].field870 = -var6;
					}
				}
			}
			for (int var7 = this.field9549; var7 < this.vertexCount; var7++) {
				int var8 = this.vertexX[var7];
				this.vertexX[var7] = this.vertexZ[var7];
				this.vertexZ[var7] = -var8;
			}
			this.field9602 = 0;
			this.boundsValid = false;
		}
	}

	@ObfuscatedName("afi.hc()V")
	public void method15471() {
		synchronized (this) {
			for (int var2 = 0; var2 < this.field9549; var2++) {
				this.vertexX[var2] = -this.vertexX[var2];
				this.vertexZ[var2] = -this.vertexZ[var2];
				if (this.vertexNormal[var2] != null) {
					this.vertexNormal[var2].field875 = -this.vertexNormal[var2].field875;
					this.vertexNormal[var2].field873 = -this.vertexNormal[var2].field873;
				}
			}
			if (this.field9570 != null) {
				for (int var3 = 0; var3 < this.faceCount; var3++) {
					if (this.field9570[var3] != null) {
						this.field9570[var3].field871 = -this.field9570[var3].field871;
						this.field9570[var3].field870 = -this.field9570[var3].field870;
					}
				}
			}
			for (int var4 = this.field9549; var4 < this.vertexCount; var4++) {
				this.vertexX[var4] = -this.vertexX[var4];
				this.vertexZ[var4] = -this.vertexZ[var4];
			}
			this.field9602 = 0;
			this.boundsValid = false;
		}
	}

	@ObfuscatedName("afi.ho()V")
	public void method15472() {
		synchronized (this) {
			for (int var2 = 0; var2 < this.field9549; var2++) {
				int var3 = this.vertexZ[var2];
				this.vertexZ[var2] = this.vertexX[var2];
				this.vertexX[var2] = -var3;
				if (this.vertexNormal[var2] != null) {
					int var4 = this.vertexNormal[var2].field873;
					this.vertexNormal[var2].field873 = this.vertexNormal[var2].field875;
					this.vertexNormal[var2].field875 = -var4;
				}
			}
			if (this.field9570 != null) {
				for (int var5 = 0; var5 < this.faceCount; var5++) {
					if (this.field9570[var5] != null) {
						int var6 = this.field9570[var5].field870;
						this.field9570[var5].field870 = this.field9570[var5].field871;
						this.field9570[var5].field871 = -var6;
					}
				}
			}
			for (int var7 = this.field9549; var7 < this.vertexCount; var7++) {
				int var8 = this.vertexZ[var7];
				this.vertexZ[var7] = this.vertexX[var7];
				this.vertexX[var7] = -var8;
			}
			this.field9602 = 0;
			this.boundsValid = false;
		}
	}

	@ObfuscatedName("afi.r(I)V")
	public void rotateX(int arg0) {
		if ((this.allowedOperations & 0x6) != 6) {
			throw new IllegalStateException();
		}
		int var2 = Trig1.sin[arg0];
		int var3 = Trig1.cos[arg0];
		synchronized (this) {
			for (int var5 = 0; var5 < this.vertexCount; var5++) {
				int var6 = this.vertexY[var5] * var3 - this.vertexZ[var5] * var2 >> 14;
				this.vertexZ[var5] = this.vertexZ[var5] * var3 + this.vertexY[var5] * var2 >> 14;
				this.vertexY[var5] = var6;
			}
			this.method15477();
		}
	}

	@ObfuscatedName("afi.v(I)V")
	public void rotateZ(int arg0) {
		if ((this.allowedOperations & 0x3) != 3) {
			throw new IllegalStateException();
		}
		int var2 = Trig1.sin[arg0];
		int var3 = Trig1.cos[arg0];
		synchronized (this) {
			for (int var5 = 0; var5 < this.vertexCount; var5++) {
				int var6 = this.vertexY[var5] * var2 + this.vertexX[var5] * var3 >> 14;
				this.vertexY[var5] = this.vertexY[var5] * var3 - this.vertexX[var5] * var2 >> 14;
				this.vertexX[var5] = var6;
			}
			this.method15477();
		}
	}

	@ObfuscatedName("afi.o(III)V")
	public void translate(int arg0, int arg1, int arg2) {
		if (arg0 != 0 && (this.allowedOperations & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (arg1 != 0 && (this.allowedOperations & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (arg2 == 0 || (this.allowedOperations & 0x4) == 4) {
			synchronized (this) {
				for (int var5 = 0; var5 < this.vertexCount; var5++) {
					this.vertexX[var5] += arg0;
					this.vertexY[var5] += arg1;
					this.vertexZ[var5] += arg2;
				}
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("afi.s()V")
	public void method1698() {
		if ((this.allowedOperations & 0x10) != 16) {
			throw new IllegalStateException();
		}
		synchronized (this) {
			for (int var2 = 0; var2 < this.vertexCount; var2++) {
				this.vertexZ[var2] = -this.vertexZ[var2];
			}
			if (this.vertexNormal != null) {
				for (int var3 = 0; var3 < this.field9549; var3++) {
					if (this.vertexNormal[var3] != null) {
						this.vertexNormal[var3].field873 = -this.vertexNormal[var3].field873;
					}
				}
			}
			if (this.field9555 != null) {
				for (int var4 = 0; var4 < this.field9549; var4++) {
					if (this.field9555[var4] != null) {
						this.field9555[var4].field873 = -this.field9555[var4].field873;
					}
				}
			}
			if (this.field9570 != null) {
				for (int var5 = 0; var5 < this.faceCount; var5++) {
					if (this.field9570[var5] != null) {
						this.field9570[var5].field870 = -this.field9570[var5].field870;
					}
				}
			}
			short[] var6 = this.faceVertex1;
			this.faceVertex1 = this.faceVertex3;
			this.faceVertex3 = var6;
			if (this.faceVertexU != null) {
				for (int var7 = 0; var7 < this.faceCount; var7++) {
					if (this.faceVertexU[var7] != null) {
						float var8 = this.faceVertexU[var7][0];
						this.faceVertexU[var7][0] = this.faceVertexU[var7][2];
						this.faceVertexU[var7][2] = var8;
					}
					if (this.faceVertexV[var7] != null) {
						float var9 = this.faceVertexV[var7][0];
						this.faceVertexV[var7][0] = this.faceVertexV[var7][2];
						this.faceVertexV[var7][2] = var9;
					}
				}
			}
			this.boundsValid = false;
			this.field9602 = 0;
		}
	}

	@ObfuscatedName("afi.y(III)V")
	public void scale(int arg0, int arg1, int arg2) {
		if (arg0 != 128 && (this.allowedOperations & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (arg1 != 128 && (this.allowedOperations & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (arg2 == 128 || (this.allowedOperations & 0x4) == 4) {
			synchronized (this) {
				for (int var5 = 0; var5 < this.vertexCount; var5++) {
					this.vertexX[var5] = this.vertexX[var5] * arg0 >> 7;
					this.vertexY[var5] = this.vertexY[var5] * arg1 >> 7;
					this.vertexZ[var5] = this.vertexZ[var5] * arg2 >> 7;
				}
				this.boundsValid = false;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("afi.q(IILcb;Lcb;III)V")
	public void method1700(int arg0, int arg1, FloorModel arg2, FloorModel arg3, int arg4, int arg5, int arg6) {
		if (arg0 == 3) {
			if ((this.allowedOperations & 0x7) != 7) {
				throw new IllegalStateException();
			}
		} else if ((this.allowedOperations & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		int var8 = this.minX + arg4;
		int var9 = this.maxX + arg4;
		int var10 = this.minZ + arg6;
		int var11 = this.maxZ + arg6;
		if (arg0 != 4 && (var8 < 0 || arg2.field1233 + var9 >> arg2.field1236 >= arg2.field1235 || var10 < 0 || arg2.field1233 + var11 >> arg2.field1236 >= arg2.field1234)) {
			return;
		}
		int[][] var12 = arg2.field1237;
		int[][] var13 = null;
		if (arg3 != null) {
			var13 = arg3.field1237;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (var8 < 0 || arg3.field1233 + var9 >> arg3.field1236 >= arg3.field1235 || var10 < 0 || arg3.field1233 + var11 >> arg3.field1236 >= arg3.field1234) {
				return;
			}
		} else {
			int var14 = var8 >> arg2.field1236;
			int var15 = arg2.field1233 - 1 + var9 >> arg2.field1236;
			int var16 = var10 >> arg2.field1236;
			int var17 = arg2.field1233 - 1 + var11 >> arg2.field1236;
			if (var12[var14][var16] == arg5 && var12[var15][var16] == arg5 && var12[var14][var17] == arg5 && var12[var15][var17] == arg5) {
				return;
			}
		}
		synchronized (this) {
			if (arg0 == 1) {
				int var19 = arg2.field1233 - 1;
				for (int var20 = 0; var20 < this.field9549; var20++) {
					int var21 = this.vertexX[var20] + arg4;
					int var22 = this.vertexZ[var20] + arg6;
					int var23 = var21 & var19;
					int var24 = var22 & var19;
					int var25 = var21 >> arg2.field1236;
					int var26 = var22 >> arg2.field1236;
					int var27 = (arg2.field1233 - var23) * var12[var25][var26] + var12[var25 + 1][var26] * var23 >> arg2.field1236;
					int var28 = (arg2.field1233 - var23) * var12[var25][var26 + 1] + var12[var25 + 1][var26 + 1] * var23 >> arg2.field1236;
					int var29 = (arg2.field1233 - var24) * var27 + var24 * var28 >> arg2.field1236;
					this.vertexY[var20] = this.vertexY[var20] + var29 - arg5;
				}
				for (int var30 = this.field9549; var30 < this.vertexCount; var30++) {
					int var31 = this.vertexX[var30] + arg4;
					int var32 = this.vertexZ[var30] + arg6;
					int var33 = var31 & var19;
					int var34 = var32 & var19;
					int var35 = var31 >> arg2.field1236;
					int var36 = var32 >> arg2.field1236;
					if (var35 >= 0 && var35 < var12.length - 1 && var36 >= 0 && var36 < var12[0].length - 1) {
						int var37 = (arg2.field1233 - var33) * var12[var35][var36] + var12[var35 + 1][var36] * var33 >> arg2.field1236;
						int var38 = (arg2.field1233 - var33) * var12[var35][var36 + 1] + var12[var35 + 1][var36 + 1] * var33 >> arg2.field1236;
						int var39 = (arg2.field1233 - var34) * var37 + var34 * var38 >> arg2.field1236;
						this.vertexY[var30] = this.vertexY[var30] + var39 - arg5;
					}
				}
			} else if (arg0 == 2) {
				if (this.minY == 0) {
					return;
				}
				int var40 = arg2.field1233 - 1;
				for (int var41 = 0; var41 < this.field9549; var41++) {
					int var42 = (this.vertexY[var41] << 16) / this.minY;
					if (var42 < arg1) {
						int var43 = this.vertexX[var41] + arg4;
						int var44 = this.vertexZ[var41] + arg6;
						int var45 = var43 & var40;
						int var46 = var44 & var40;
						int var47 = var43 >> arg2.field1236;
						int var48 = var44 >> arg2.field1236;
						int var49 = (arg2.field1233 - var45) * var12[var47][var48] + var12[var47 + 1][var48] * var45 >> arg2.field1236;
						int var50 = (arg2.field1233 - var45) * var12[var47][var48 + 1] + var12[var47 + 1][var48 + 1] * var45 >> arg2.field1236;
						int var51 = (arg2.field1233 - var46) * var49 + var46 * var50 >> arg2.field1236;
						this.vertexY[var41] += (arg1 - var42) * (var51 - arg5) / arg1;
					} else {
						this.vertexY[var41] = this.vertexY[var41];
					}
				}
				for (int var52 = this.field9549; var52 < this.vertexCount; var52++) {
					int var53 = (this.vertexY[var52] << 16) / this.minY;
					if (var53 < arg1) {
						int var54 = this.vertexX[var52] + arg4;
						int var55 = this.vertexZ[var52] + arg6;
						int var56 = var54 & var40;
						int var57 = var55 & var40;
						int var58 = var54 >> arg2.field1236;
						int var59 = var55 >> arg2.field1236;
						if (var58 >= 0 && var58 < arg2.field1235 - 1 && var59 >= 0 && var59 < arg2.field1234 - 1) {
							int var60 = (arg2.field1233 - var56) * var12[var58][var59] + var12[var58 + 1][var59] * var56 >> arg2.field1236;
							int var61 = (arg2.field1233 - var56) * var12[var58][var59 + 1] + var12[var58 + 1][var59 + 1] * var56 >> arg2.field1236;
							int var62 = (arg2.field1233 - var57) * var60 + var57 * var61 >> arg2.field1236;
							this.vertexY[var52] += (arg1 - var53) * (var62 - arg5) / arg1;
						}
					} else {
						this.vertexY[var52] = this.vertexY[var52];
					}
				}
			} else if (arg0 == 3) {
				int var63 = (arg1 & 0xFF) * 16;
				int var64 = (arg1 >> 8 & 0xFF) * 16;
				int var65 = (arg1 >> 16 & 0xFF) << 6;
				int var66 = (arg1 >> 24 & 0xFF) << 6;
				if (arg4 - (var63 >> 1) < 0 || arg2.field1233 + (var63 >> 1) + arg4 >= arg2.field1235 << arg2.field1236 || arg6 - (var64 >> 1) < 0 || arg2.field1233 + (var64 >> 1) + arg6 >= arg2.field1234 << arg2.field1236) {
					return;
				}
				this.method1701(arg2, arg4, arg5, arg6, var63, var64, var65, var66);
			} else if (arg0 == 4) {
				int var67 = arg3.field1233 - 1;
				int var68 = this.maxY - this.minY;
				for (int var69 = 0; var69 < this.field9549; var69++) {
					int var70 = this.vertexX[var69] + arg4;
					int var71 = this.vertexZ[var69] + arg6;
					int var72 = var70 & var67;
					int var73 = var71 & var67;
					int var74 = var70 >> arg3.field1236;
					int var75 = var71 >> arg3.field1236;
					int var76 = (arg3.field1233 - var72) * var13[var74][var75] + var13[var74 + 1][var75] * var72 >> arg3.field1236;
					int var77 = (arg3.field1233 - var72) * var13[var74][var75 + 1] + var13[var74 + 1][var75 + 1] * var72 >> arg3.field1236;
					int var78 = (arg3.field1233 - var73) * var76 + var73 * var77 >> arg3.field1236;
					this.vertexY[var69] = var78 - arg5 + this.vertexY[var69] + var68;
				}
				for (int var79 = this.field9549; var79 < this.vertexCount; var79++) {
					int var80 = this.vertexX[var79] + arg4;
					int var81 = this.vertexZ[var79] + arg6;
					int var82 = var80 & var67;
					int var83 = var81 & var67;
					int var84 = var80 >> arg3.field1236;
					int var85 = var81 >> arg3.field1236;
					if (var84 >= 0 && var84 < arg3.field1235 - 1 && var85 >= 0 && var85 < arg3.field1234 - 1) {
						int var86 = (arg3.field1233 - var82) * var13[var84][var85] + var13[var84 + 1][var85] * var82 >> arg3.field1236;
						int var87 = (arg3.field1233 - var82) * var13[var84][var85 + 1] + var13[var84 + 1][var85 + 1] * var82 >> arg3.field1236;
						int var88 = (arg3.field1233 - var83) * var86 + var83 * var87 >> arg3.field1236;
						this.vertexY[var79] = var88 - arg5 + this.vertexY[var79] + var68;
					}
				}
			} else if (arg0 == 5) {
				int var89 = arg3.field1233 - 1;
				int var90 = this.maxY - this.minY;
				for (int var91 = 0; var91 < this.field9549; var91++) {
					int var92 = this.vertexX[var91] + arg4;
					int var93 = this.vertexZ[var91] + arg6;
					int var94 = var92 & var89;
					int var95 = var93 & var89;
					int var96 = var92 >> arg2.field1236;
					int var97 = var93 >> arg2.field1236;
					int var98 = (arg2.field1233 - var94) * var12[var96][var97] + var12[var96 + 1][var97] * var94 >> arg2.field1236;
					int var99 = (arg2.field1233 - var94) * var12[var96][var97 + 1] + var12[var96 + 1][var97 + 1] * var94 >> arg2.field1236;
					int var100 = (arg2.field1233 - var95) * var98 + var95 * var99 >> arg2.field1236;
					int var101 = (arg3.field1233 - var94) * var13[var96][var97] + var13[var96 + 1][var97] * var94 >> arg3.field1236;
					int var102 = (arg3.field1233 - var94) * var13[var96][var97 + 1] + var13[var96 + 1][var97 + 1] * var94 >> arg3.field1236;
					int var103 = (arg3.field1233 - var95) * var101 + var95 * var102 >> arg3.field1236;
					int var104 = var100 - var103 - arg1;
					this.vertexY[var91] = ((this.vertexY[var91] << 8) / var90 * var104 >> 8) - (arg5 - var100);
				}
				for (int var105 = this.field9549; var105 < this.vertexCount; var105++) {
					int var106 = this.vertexX[var105] + arg4;
					int var107 = this.vertexZ[var105] + arg6;
					int var108 = var106 & var89;
					int var109 = var107 & var89;
					int var110 = var106 >> arg2.field1236;
					int var111 = var107 >> arg2.field1236;
					if (var110 >= 0 && var110 < arg2.field1235 - 1 && var110 < arg3.field1235 - 1 && var111 >= 0 && var111 < arg2.field1234 - 1 && var111 < arg3.field1234 - 1) {
						int var112 = (arg2.field1233 - var108) * var12[var110][var111] + var12[var110 + 1][var111] * var108 >> arg2.field1236;
						int var113 = (arg2.field1233 - var108) * var12[var110][var111 + 1] + var12[var110 + 1][var111 + 1] * var108 >> arg2.field1236;
						int var114 = (arg2.field1233 - var109) * var112 + var109 * var113 >> arg2.field1236;
						int var115 = (arg3.field1233 - var108) * var13[var110][var111] + var13[var110 + 1][var111] * var108 >> arg3.field1236;
						int var116 = (arg3.field1233 - var108) * var13[var110][var111 + 1] + var13[var110 + 1][var111 + 1] * var108 >> arg3.field1236;
						int var117 = (arg3.field1233 - var109) * var115 + var109 * var116 >> arg3.field1236;
						int var118 = var114 - var117 - arg1;
						this.vertexY[var105] = ((this.vertexY[var105] << 8) / var90 * var118 >> 8) - (arg5 - var114);
					}
				}
			}
			this.boundsValid = false;
		}
	}

	@ObfuscatedName("afi.hj()V")
	public void method15477() {
		this.vertexNormal = null;
		this.field9555 = null;
		this.field9570 = null;
		this.boundsValid = false;
	}

	@ObfuscatedName("afi.b()V")
	public void method1702() {
		if (this.renderer.threadLocalsCount <= 1) {
			return;
		}
		synchronized (this) {
			while (this.field1301) {
				try {
					this.wait();
				} catch (InterruptedException var4) {
				}
			}
			this.field1301 = true;
		}
	}

	@ObfuscatedName("afi.h()V")
	public void method1703() {
		if (this.renderer.threadLocalsCount > 1) {
			synchronized (this) {
				this.field1301 = false;
				this.notifyAll();
			}
		}
	}

	@ObfuscatedName("afi.as()Z")
	public boolean method1716() {
		if (this.labelVertices == null) {
			return false;
		} else {
			this.baseX = 0;
			this.baseY = 0;
			this.baseZ = 0;
			return true;
		}
	}

	@ObfuscatedName("afi.ap()V")
	public void method1776() {
		if (this.verticesUpscaled) {
			for (int var1 = 0; var1 < this.vertexCount; var1++) {
				this.vertexX[var1] = this.vertexX[var1] + 7 >> 4;
				this.vertexY[var1] = this.vertexY[var1] + 7 >> 4;
				this.vertexZ[var1] = this.vertexZ[var1] + 7 >> 4;
			}
			this.verticesUpscaled = false;
		}
		if (this.field9580) {
			this.method15546();
			this.field9580 = false;
		}
		this.boundsValid = false;
	}

	@ObfuscatedName("afi.at(I[IIIIIZ)V")
	public void applyTransform(int type, int[] labels, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = labels.length;
		if (type == 0) {
			int x = arg2 << 4;
			int y = arg3 << 4;
			int z = arg4 << 4;
			if (!this.verticesUpscaled) {
				for (int var12 = 0; var12 < this.vertexCount; var12++) {
					this.vertexX[var12] <<= 0x4;
					this.vertexY[var12] <<= 0x4;
					this.vertexZ[var12] <<= 0x4;
				}
				this.verticesUpscaled = true;
			}
			int count = 0;
			this.baseX = 0;
			this.baseY = 0;
			this.baseZ = 0;
			for (int g = 0; g < var8; g++) {
				int label = labels[g];
				if (label < this.labelVertices.length) {
					int[] vertices = this.labelVertices[label];
					for (int i = 0; i < vertices.length; i++) {
						int v = vertices[i];
						this.baseX += this.vertexX[v];
						this.baseY += this.vertexY[v];
						this.baseZ += this.vertexZ[v];
						count++;
					}
				}
			}
			if (count > 0) {
				this.baseX = this.baseX / count + x;
				this.baseY = this.baseY / count + y;
				this.baseZ = this.baseZ / count + z;
			} else {
				this.baseX = x;
				this.baseY = y;
				this.baseZ = z;
			}
		} else if (type == 1) {
			int var19 = arg2 << 4;
			int var20 = arg3 << 4;
			int var21 = arg4 << 4;
			if (!this.verticesUpscaled) {
				for (int var22 = 0; var22 < this.vertexCount; var22++) {
					this.vertexX[var22] <<= 0x4;
					this.vertexY[var22] <<= 0x4;
					this.vertexZ[var22] <<= 0x4;
				}
				this.verticesUpscaled = true;
			}
			for (int var23 = 0; var23 < var8; var23++) {
				int var24 = labels[var23];
				if (var24 < this.labelVertices.length) {
					int[] var25 = this.labelVertices[var24];
					for (int var26 = 0; var26 < var25.length; var26++) {
						int var27 = var25[var26];
						this.vertexX[var27] += var19;
						this.vertexY[var27] += var20;
						this.vertexZ[var27] += var21;
					}
				}
			}
		} else if (type == 2) {
			for (int var28 = 0; var28 < var8; var28++) {
				int var29 = labels[var28];
				if (var29 < this.labelVertices.length) {
					int[] var30 = this.labelVertices[var29];
					if ((arg5 & 0x1) == 0) {
						for (int var31 = 0; var31 < var30.length; var31++) {
							int var32 = var30[var31];
							this.vertexX[var32] -= this.baseX;
							this.vertexY[var32] -= this.baseY;
							this.vertexZ[var32] -= this.baseZ;
							if (arg4 != 0) {
								int var33 = Trig1.sin[arg4];
								int var34 = Trig1.cos[arg4];
								int var35 = this.vertexY[var32] * var33 + this.vertexX[var32] * var34 + 16383 >> 14;
								this.vertexY[var32] = this.vertexY[var32] * var34 - this.vertexX[var32] * var33 + 16383 >> 14;
								this.vertexX[var32] = var35;
							}
							if (arg2 != 0) {
								int var36 = Trig1.sin[arg2];
								int var37 = Trig1.cos[arg2];
								int var38 = this.vertexY[var32] * var37 - this.vertexZ[var32] * var36 + 16383 >> 14;
								this.vertexZ[var32] = this.vertexZ[var32] * var37 + this.vertexY[var32] * var36 + 16383 >> 14;
								this.vertexY[var32] = var38;
							}
							if (arg3 != 0) {
								int var39 = Trig1.sin[arg3];
								int var40 = Trig1.cos[arg3];
								int var41 = this.vertexZ[var32] * var39 + this.vertexX[var32] * var40 + 16383 >> 14;
								this.vertexZ[var32] = this.vertexZ[var32] * var40 - this.vertexX[var32] * var39 + 16383 >> 14;
								this.vertexX[var32] = var41;
							}
							this.vertexX[var32] += this.baseX;
							this.vertexY[var32] += this.baseY;
							this.vertexZ[var32] += this.baseZ;
						}
					} else {
						for (int var42 = 0; var42 < var30.length; var42++) {
							int var43 = var30[var42];
							this.vertexX[var43] -= this.baseX;
							this.vertexY[var43] -= this.baseY;
							this.vertexZ[var43] -= this.baseZ;
							if (arg2 != 0) {
								int var44 = Trig1.sin[arg2];
								int var45 = Trig1.cos[arg2];
								int var46 = this.vertexY[var43] * var45 - this.vertexZ[var43] * var44 + 16383 >> 14;
								this.vertexZ[var43] = this.vertexZ[var43] * var45 + this.vertexY[var43] * var44 + 16383 >> 14;
								this.vertexY[var43] = var46;
							}
							if (arg4 != 0) {
								int var47 = Trig1.sin[arg4];
								int var48 = Trig1.cos[arg4];
								int var49 = this.vertexY[var43] * var47 + this.vertexX[var43] * var48 + 16383 >> 14;
								this.vertexY[var43] = this.vertexY[var43] * var48 - this.vertexX[var43] * var47 + 16383 >> 14;
								this.vertexX[var43] = var49;
							}
							if (arg3 != 0) {
								int var50 = Trig1.sin[arg3];
								int var51 = Trig1.cos[arg3];
								int var52 = this.vertexZ[var43] * var50 + this.vertexX[var43] * var51 + 16383 >> 14;
								this.vertexZ[var43] = this.vertexZ[var43] * var51 - this.vertexX[var43] * var50 + 16383 >> 14;
								this.vertexX[var43] = var52;
							}
							this.vertexX[var43] += this.baseX;
							this.vertexY[var43] += this.baseY;
							this.vertexZ[var43] += this.baseZ;
						}
					}
				}
			}
		} else if (type == 3) {
			for (int var53 = 0; var53 < var8; var53++) {
				int var54 = labels[var53];
				if (var54 < this.labelVertices.length) {
					int[] var55 = this.labelVertices[var54];
					for (int var56 = 0; var56 < var55.length; var56++) {
						int var57 = var55[var56];
						this.vertexX[var57] -= this.baseX;
						this.vertexY[var57] -= this.baseY;
						this.vertexZ[var57] -= this.baseZ;
						this.vertexX[var57] = this.vertexX[var57] * arg2 / 128;
						this.vertexY[var57] = this.vertexY[var57] * arg3 / 128;
						this.vertexZ[var57] = this.vertexZ[var57] * arg4 / 128;
						this.vertexX[var57] += this.baseX;
						this.vertexY[var57] += this.baseY;
						this.vertexZ[var57] += this.baseZ;
					}
				}
			}
		} else if (type == 5) {
			if (this.labelFaces != null && this.faceAlpha != null) {
				for (int var58 = 0; var58 < var8; var58++) {
					int var59 = labels[var58];
					if (var59 < this.labelFaces.length) {
						int[] var60 = this.labelFaces[var59];
						for (int var61 = 0; var61 < var60.length; var61++) {
							int var62 = var60[var61];
							int var63 = (this.faceAlpha[var62] & 0xFF) + arg2 * 8;
							if (var63 < 0) {
								var63 = 0;
							} else if (var63 > 255) {
								var63 = 255;
							}
							this.faceAlpha[var62] = (byte) var63;
						}
					}
				}
				if (this.billboards != null) {
					for (int var64 = 0; var64 < this.billboardCount; var64++) {
						Billboard var65 = this.billboards[var64];
						BillboardPlacement var66 = this.billboardPlacements[var64];
						var66.field819 = var66.field819 & 0xFFFFFF | 255 - (this.faceAlpha[var65.field901] & 0xFF) << 24;
					}
				}
			}
		} else if (type == 7) {
			if (this.labelFaces != null) {
				for (int var67 = 0; var67 < var8; var67++) {
					int var68 = labels[var67];
					if (var68 < this.labelFaces.length) {
						int[] var69 = this.labelFaces[var68];
						for (int var70 = 0; var70 < var69.length; var70++) {
							int var71 = var69[var70];
							int var72 = this.faceColour[var71] & 0xFFFF;
							int var73 = var72 >> 10 & 0x3F;
							int var74 = var72 >> 7 & 0x7;
							int var75 = var72 & 0x7F;
							int var76 = arg2 + var73 & 0x3F;
							int var77 = arg3 + var74;
							if (var77 < 0) {
								var77 = 0;
							} else if (var77 > 7) {
								var77 = 7;
							}
							int var78 = arg4 + var75;
							if (var78 < 0) {
								var78 = 0;
							} else if (var78 > 127) {
								var78 = 127;
							}
							this.faceColour[var71] = (short) (var76 << 10 | var77 << 7 | var78);
						}
						this.field9580 = true;
					}
				}
				if (this.billboards != null) {
					for (int var79 = 0; var79 < this.billboardCount; var79++) {
						Billboard var80 = this.billboards[var79];
						BillboardPlacement var81 = this.billboardPlacements[var79];
						var81.field819 = var81.field819 & 0xFF000000 | ColourUtils.field8149[ColourUtils.method4937(this.faceColour[var80.field901] & 0xFFFF) & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (type == 8) {
			if (this.labelBillboards != null) {
				for (int var82 = 0; var82 < var8; var82++) {
					int var83 = labels[var82];
					if (var83 < this.labelBillboards.length) {
						int[] var84 = this.labelBillboards[var83];
						for (int var85 = 0; var85 < var84.length; var85++) {
							BillboardPlacement var86 = this.billboardPlacements[var84[var85]];
							var86.field822 += arg2;
							var86.field816 += arg3;
						}
					}
				}
			}
		} else if (type == 10) {
			if (this.labelBillboards != null) {
				for (int var87 = 0; var87 < var8; var87++) {
					int var88 = labels[var87];
					if (var88 < this.labelBillboards.length) {
						int[] var89 = this.labelBillboards[var88];
						for (int var90 = 0; var90 < var89.length; var90++) {
							BillboardPlacement var91 = this.billboardPlacements[var89[var90]];
							var91.field813 = (float) arg2 * var91.field813 / 128.0F;
							var91.field814 = (float) arg3 * var91.field814 / 128.0F;
						}
					}
				}
			}
		} else if (type == 9 && this.labelBillboards != null) {
			for (int var92 = 0; var92 < var8; var92++) {
				int var93 = labels[var92];
				if (var93 < this.labelBillboards.length) {
					int[] var94 = this.labelBillboards[var93];
					for (int var95 = 0; var95 < var94.length; var95++) {
						BillboardPlacement var96 = this.billboardPlacements[var94[var95]];
						var96.field817 = var96.field817 + arg2 & 0x3FFF;
					}
				}
			}
		}
	}

	@ObfuscatedName("afi.ad(I[IIIIIZ)V")
	public void method1711(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		if (arg0 != 0) {
			this.applyTransform(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		int var8 = arg2 << 4;
		int var9 = arg3 << 4;
		int var10 = arg4 << 4;
		if (!this.verticesUpscaled) {
			for (int var11 = 0; var11 < this.vertexCount; var11++) {
				this.vertexX[var11] <<= 0x4;
				this.vertexY[var11] <<= 0x4;
				this.vertexZ[var11] <<= 0x4;
			}
			this.verticesUpscaled = true;
		}
		this.baseX = var8;
		this.baseY = var9;
		this.baseZ = var10;
	}

	@ObfuscatedName("afi.au(I[IIIIZI[I)V")
	public void method1720(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		if (arg0 != 0) {
			this.method1719(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		int var9 = arg2 << 4;
		int var10 = arg3 << 4;
		int var11 = arg4 << 4;
		if (!this.verticesUpscaled) {
			for (int var12 = 0; var12 < this.vertexCount; var12++) {
				this.vertexX[var12] <<= 0x4;
				this.vertexY[var12] <<= 0x4;
				this.vertexZ[var12] <<= 0x4;
			}
			this.verticesUpscaled = true;
		}
		this.baseX = var9;
		this.baseY = var10;
		this.baseZ = var11;
	}

	@ObfuscatedName("afi.am(I[IIIIZI[I)V")
	public void method1719(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		if (arg0 == 0) {
			int var10 = arg2 << 4;
			int var11 = arg3 << 4;
			int var12 = arg4 << 4;
			if (!this.verticesUpscaled) {
				for (int var13 = 0; var13 < this.vertexCount; var13++) {
					this.vertexX[var13] <<= 0x4;
					this.vertexY[var13] <<= 0x4;
					this.vertexZ[var13] <<= 0x4;
				}
				this.verticesUpscaled = true;
			}
			int var14 = 0;
			this.baseX = 0;
			this.baseY = 0;
			this.baseZ = 0;
			for (int var15 = 0; var15 < var9; var15++) {
				int var16 = arg1[var15];
				if (var16 < this.labelVertices.length) {
					int[] var17 = this.labelVertices[var16];
					for (int var18 = 0; var18 < var17.length; var18++) {
						int var19 = var17[var18];
						if (this.vertexSourceModels == null || (arg6 & this.vertexSourceModels[var19]) != 0) {
							this.baseX += this.vertexX[var19];
							this.baseY += this.vertexY[var19];
							this.baseZ += this.vertexZ[var19];
							var14++;
						}
					}
				}
			}
			if (var14 > 0) {
				this.baseX = this.baseX / var14 + var10;
				this.baseY = this.baseY / var14 + var11;
				this.baseZ = this.baseZ / var14 + var12;
				this.field9538 = true;
			} else {
				this.baseX = var10;
				this.baseY = var11;
				this.baseZ = var12;
			}
		} else if (arg0 == 1) {
			if (arg7 != null) {
				int var20 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
				int var21 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
				int var22 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
				arg2 = var20;
				arg3 = var21;
				arg4 = var22;
			}
			int var23 = arg2 << 4;
			int var24 = arg3 << 4;
			int var25 = arg4 << 4;
			if (!this.verticesUpscaled) {
				for (int var26 = 0; var26 < this.vertexCount; var26++) {
					this.vertexX[var26] <<= 0x4;
					this.vertexY[var26] <<= 0x4;
					this.vertexZ[var26] <<= 0x4;
				}
				this.verticesUpscaled = true;
			}
			for (int var27 = 0; var27 < var9; var27++) {
				int var28 = arg1[var27];
				if (var28 < this.labelVertices.length) {
					int[] var29 = this.labelVertices[var28];
					for (int var30 = 0; var30 < var29.length; var30++) {
						int var31 = var29[var30];
						if (this.vertexSourceModels == null || (arg6 & this.vertexSourceModels[var31]) != 0) {
							this.vertexX[var31] += var23;
							this.vertexY[var31] += var24;
							this.vertexZ[var31] += var25;
						}
					}
				}
			}
		} else if (arg0 == 2) {
			if (arg7 == null) {
				for (int var93 = 0; var93 < var9; var93++) {
					int var94 = arg1[var93];
					if (var94 < this.labelVertices.length) {
						int[] var95 = this.labelVertices[var94];
						for (int var96 = 0; var96 < var95.length; var96++) {
							int var97 = var95[var96];
							if (this.vertexSourceModels == null || (arg6 & this.vertexSourceModels[var97]) != 0) {
								this.vertexX[var97] -= this.baseX;
								this.vertexY[var97] -= this.baseY;
								this.vertexZ[var97] -= this.baseZ;
								if (arg4 != 0) {
									int var98 = Trig1.sin[arg4];
									int var99 = Trig1.cos[arg4];
									int var100 = this.vertexY[var97] * var98 + this.vertexX[var97] * var99 + 16383 >> 14;
									this.vertexY[var97] = this.vertexY[var97] * var99 - this.vertexX[var97] * var98 + 16383 >> 14;
									this.vertexX[var97] = var100;
								}
								if (arg2 != 0) {
									int var101 = Trig1.sin[arg2];
									int var102 = Trig1.cos[arg2];
									int var103 = this.vertexY[var97] * var102 - this.vertexZ[var97] * var101 + 16383 >> 14;
									this.vertexZ[var97] = this.vertexZ[var97] * var102 + this.vertexY[var97] * var101 + 16383 >> 14;
									this.vertexY[var97] = var103;
								}
								if (arg3 != 0) {
									int var104 = Trig1.sin[arg3];
									int var105 = Trig1.cos[arg3];
									int var106 = this.vertexZ[var97] * var104 + this.vertexX[var97] * var105 + 16383 >> 14;
									this.vertexZ[var97] = this.vertexZ[var97] * var105 - this.vertexX[var97] * var104 + 16383 >> 14;
									this.vertexX[var97] = var106;
								}
								this.vertexX[var97] += this.baseX;
								this.vertexY[var97] += this.baseY;
								this.vertexZ[var97] += this.baseZ;
							}
						}
					}
				}
			} else {
				if (!this.verticesUpscaled) {
					for (int var32 = 0; var32 < this.vertexCount; var32++) {
						this.vertexX[var32] <<= 0x4;
						this.vertexY[var32] <<= 0x4;
						this.vertexZ[var32] <<= 0x4;
					}
					this.verticesUpscaled = true;
				}
				int var33 = arg7[9] << 4;
				int var34 = arg7[10] << 4;
				int var35 = arg7[11] << 4;
				int var36 = arg7[12] << 4;
				int var37 = arg7[13] << 4;
				int var38 = arg7[14] << 4;
				if (this.field9538) {
					int var39 = arg7[6] * this.baseZ + arg7[0] * this.baseX + arg7[3] * this.baseY + 8192 >> 14;
					int var40 = arg7[7] * this.baseZ + arg7[1] * this.baseX + arg7[4] * this.baseY + 8192 >> 14;
					int var41 = arg7[8] * this.baseZ + arg7[2] * this.baseX + arg7[5] * this.baseY + 8192 >> 14;
					int var42 = var36 + var39;
					int var43 = var37 + var40;
					int var44 = var38 + var41;
					this.baseX = var42;
					this.baseY = var43;
					this.baseZ = var44;
					this.field9538 = false;
				}
				int[] var45 = new int[9];
				int var46 = Trig1.cos[arg2];
				int var47 = Trig1.sin[arg2];
				int var48 = Trig1.cos[arg3];
				int var49 = Trig1.sin[arg3];
				int var50 = Trig1.cos[arg4];
				int var51 = Trig1.sin[arg4];
				int var52 = var47 * var50 + 8192 >> 14;
				int var53 = var47 * var51 + 8192 >> 14;
				var45[0] = var48 * var50 + var49 * var53 + 8192 >> 14;
				var45[1] = -var48 * var51 + var49 * var52 + 8192 >> 14;
				var45[2] = var46 * var49 + 8192 >> 14;
				var45[3] = var46 * var51 + 8192 >> 14;
				var45[4] = var46 * var50 + 8192 >> 14;
				var45[5] = -var47;
				var45[6] = -var49 * var50 + var48 * var53 + 8192 >> 14;
				var45[7] = var48 * var52 + var49 * var51 + 8192 >> 14;
				var45[8] = var46 * var48 + 8192 >> 14;
				int var54 = var45[2] * -this.baseZ + var45[0] * -this.baseX + var45[1] * -this.baseY + 8192 >> 14;
				int var55 = var45[5] * -this.baseZ + var45[3] * -this.baseX + var45[4] * -this.baseY + 8192 >> 14;
				int var56 = var45[8] * -this.baseZ + var45[6] * -this.baseX + var45[7] * -this.baseY + 8192 >> 14;
				int var57 = this.baseX + var54;
				int var58 = this.baseY + var55;
				int var59 = this.baseZ + var56;
				int[] var60 = new int[9];
				for (int var61 = 0; var61 < 3; var61++) {
					for (int var62 = 0; var62 < 3; var62++) {
						int var63 = 0;
						for (int var64 = 0; var64 < 3; var64++) {
							var63 += var45[var61 * 3 + var64] * arg7[var62 * 3 + var64];
						}
						var60[var61 * 3 + var62] = var63 + 8192 >> 14;
					}
				}
				int var65 = var45[2] * var38 + var45[0] * var36 + var45[1] * var37 + 8192 >> 14;
				int var66 = var45[5] * var38 + var45[3] * var36 + var45[4] * var37 + 8192 >> 14;
				int var67 = var45[8] * var38 + var45[6] * var36 + var45[7] * var37 + 8192 >> 14;
				int var68 = var57 + var65;
				int var69 = var58 + var66;
				int var70 = var59 + var67;
				int[] var71 = new int[9];
				for (int var72 = 0; var72 < 3; var72++) {
					for (int var73 = 0; var73 < 3; var73++) {
						int var74 = 0;
						for (int var75 = 0; var75 < 3; var75++) {
							var74 += arg7[var72 * 3 + var75] * var60[var75 * 3 + var73];
						}
						var71[var72 * 3 + var73] = var74 + 8192 >> 14;
					}
				}
				int var76 = arg7[2] * var70 + arg7[0] * var68 + arg7[1] * var69 + 8192 >> 14;
				int var77 = arg7[5] * var70 + arg7[3] * var68 + arg7[4] * var69 + 8192 >> 14;
				int var78 = arg7[8] * var70 + arg7[6] * var68 + arg7[7] * var69 + 8192 >> 14;
				int var79 = var33 + var76;
				int var80 = var34 + var77;
				int var81 = var35 + var78;
				for (int var82 = 0; var82 < var9; var82++) {
					int var83 = arg1[var82];
					if (var83 < this.labelVertices.length) {
						int[] var84 = this.labelVertices[var83];
						for (int var85 = 0; var85 < var84.length; var85++) {
							int var86 = var84[var85];
							if (this.vertexSourceModels == null || (arg6 & this.vertexSourceModels[var86]) != 0) {
								int var87 = this.vertexZ[var86] * var71[2] + this.vertexY[var86] * var71[1] + this.vertexX[var86] * var71[0] + 8192 >> 14;
								int var88 = this.vertexZ[var86] * var71[5] + this.vertexY[var86] * var71[4] + this.vertexX[var86] * var71[3] + 8192 >> 14;
								int var89 = this.vertexZ[var86] * var71[8] + this.vertexY[var86] * var71[7] + this.vertexX[var86] * var71[6] + 8192 >> 14;
								int var90 = var79 + var87;
								int var91 = var80 + var88;
								int var92 = var81 + var89;
								this.vertexX[var86] = var90;
								this.vertexY[var86] = var91;
								this.vertexZ[var86] = var92;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (int var158 = 0; var158 < var9; var158++) {
					int var159 = arg1[var158];
					if (var159 < this.labelVertices.length) {
						int[] var160 = this.labelVertices[var159];
						for (int var161 = 0; var161 < var160.length; var161++) {
							int var162 = var160[var161];
							if (this.vertexSourceModels == null || (arg6 & this.vertexSourceModels[var162]) != 0) {
								this.vertexX[var162] -= this.baseX;
								this.vertexY[var162] -= this.baseY;
								this.vertexZ[var162] -= this.baseZ;
								this.vertexX[var162] = this.vertexX[var162] * arg2 / 128;
								this.vertexY[var162] = this.vertexY[var162] * arg3 / 128;
								this.vertexZ[var162] = this.vertexZ[var162] * arg4 / 128;
								this.vertexX[var162] += this.baseX;
								this.vertexY[var162] += this.baseY;
								this.vertexZ[var162] += this.baseZ;
							}
						}
					}
				}
			} else {
				if (!this.verticesUpscaled) {
					for (int var107 = 0; var107 < this.vertexCount; var107++) {
						this.vertexX[var107] <<= 0x4;
						this.vertexY[var107] <<= 0x4;
						this.vertexZ[var107] <<= 0x4;
					}
					this.verticesUpscaled = true;
				}
				int var108 = arg7[9] << 4;
				int var109 = arg7[10] << 4;
				int var110 = arg7[11] << 4;
				int var111 = arg7[12] << 4;
				int var112 = arg7[13] << 4;
				int var113 = arg7[14] << 4;
				if (this.field9538) {
					int var114 = arg7[6] * this.baseZ + arg7[0] * this.baseX + arg7[3] * this.baseY + 8192 >> 14;
					int var115 = arg7[7] * this.baseZ + arg7[1] * this.baseX + arg7[4] * this.baseY + 8192 >> 14;
					int var116 = arg7[8] * this.baseZ + arg7[2] * this.baseX + arg7[5] * this.baseY + 8192 >> 14;
					int var117 = var111 + var114;
					int var118 = var112 + var115;
					int var119 = var113 + var116;
					this.baseX = var117;
					this.baseY = var118;
					this.baseZ = var119;
					this.field9538 = false;
				}
				int var120 = arg2 << 15 >> 7;
				int var121 = arg3 << 15 >> 7;
				int var122 = arg4 << 15 >> 7;
				int var123 = -this.baseX * var120 + 8192 >> 14;
				int var124 = -this.baseY * var121 + 8192 >> 14;
				int var125 = -this.baseZ * var122 + 8192 >> 14;
				int var126 = this.baseX + var123;
				int var127 = this.baseY + var124;
				int var128 = this.baseZ + var125;
				int[] var129 = new int[] { arg7[0] * var120 + 8192 >> 14, arg7[3] * var120 + 8192 >> 14, arg7[6] * var120 + 8192 >> 14, arg7[1] * var121 + 8192 >> 14, arg7[4] * var121 + 8192 >> 14, arg7[7] * var121 + 8192 >> 14, arg7[2] * var122 + 8192 >> 14, arg7[5] * var122 + 8192 >> 14, arg7[8] * var122 + 8192 >> 14 };
				int var130 = var111 * var120 + 8192 >> 14;
				int var131 = var112 * var121 + 8192 >> 14;
				int var132 = var113 * var122 + 8192 >> 14;
				int var133 = var126 + var130;
				int var134 = var127 + var131;
				int var135 = var128 + var132;
				int[] var136 = new int[9];
				for (int var137 = 0; var137 < 3; var137++) {
					for (int var138 = 0; var138 < 3; var138++) {
						int var139 = 0;
						for (int var140 = 0; var140 < 3; var140++) {
							var139 += arg7[var137 * 3 + var140] * var129[var140 * 3 + var138];
						}
						var136[var137 * 3 + var138] = var139 + 8192 >> 14;
					}
				}
				int var141 = arg7[2] * var135 + arg7[0] * var133 + arg7[1] * var134 + 8192 >> 14;
				int var142 = arg7[5] * var135 + arg7[3] * var133 + arg7[4] * var134 + 8192 >> 14;
				int var143 = arg7[8] * var135 + arg7[6] * var133 + arg7[7] * var134 + 8192 >> 14;
				int var144 = var108 + var141;
				int var145 = var109 + var142;
				int var146 = var110 + var143;
				for (int var147 = 0; var147 < var9; var147++) {
					int var148 = arg1[var147];
					if (var148 < this.labelVertices.length) {
						int[] var149 = this.labelVertices[var148];
						for (int var150 = 0; var150 < var149.length; var150++) {
							int var151 = var149[var150];
							if (this.vertexSourceModels == null || (arg6 & this.vertexSourceModels[var151]) != 0) {
								int var152 = this.vertexZ[var151] * var136[2] + this.vertexY[var151] * var136[1] + this.vertexX[var151] * var136[0] + 8192 >> 14;
								int var153 = this.vertexZ[var151] * var136[5] + this.vertexY[var151] * var136[4] + this.vertexX[var151] * var136[3] + 8192 >> 14;
								int var154 = this.vertexZ[var151] * var136[8] + this.vertexY[var151] * var136[7] + this.vertexX[var151] * var136[6] + 8192 >> 14;
								int var155 = var144 + var152;
								int var156 = var145 + var153;
								int var157 = var146 + var154;
								this.vertexX[var151] = var155;
								this.vertexY[var151] = var156;
								this.vertexZ[var151] = var157;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.labelFaces != null && this.faceAlpha != null) {
				for (int var163 = 0; var163 < var9; var163++) {
					int var164 = arg1[var163];
					if (var164 < this.labelFaces.length) {
						int[] var165 = this.labelFaces[var164];
						for (int var166 = 0; var166 < var165.length; var166++) {
							int var167 = var165[var166];
							if (this.field9576 == null || (arg6 & this.field9576[var167]) != 0) {
								int var168 = (this.faceAlpha[var167] & 0xFF) + arg2 * 8;
								if (var168 < 0) {
									var168 = 0;
								} else if (var168 > 255) {
									var168 = 255;
								}
								this.faceAlpha[var167] = (byte) var168;
							}
						}
					}
				}
				if (this.billboards != null) {
					for (int var169 = 0; var169 < this.billboardCount; var169++) {
						Billboard var170 = this.billboards[var169];
						BillboardPlacement var171 = this.billboardPlacements[var169];
						var171.field819 = var171.field819 & 0xFFFFFF | 255 - (this.faceAlpha[var170.field901] & 0xFF) << 24;
					}
				}
			}
		} else if (arg0 == 7) {
			if (this.labelFaces != null) {
				for (int var172 = 0; var172 < var9; var172++) {
					int var173 = arg1[var172];
					if (var173 < this.labelFaces.length) {
						int[] var174 = this.labelFaces[var173];
						for (int var175 = 0; var175 < var174.length; var175++) {
							int var176 = var174[var175];
							if (this.field9576 == null || (arg6 & this.field9576[var176]) != 0) {
								int var177 = this.faceColour[var176] & 0xFFFF;
								int var178 = var177 >> 10 & 0x3F;
								int var179 = var177 >> 7 & 0x7;
								int var180 = var177 & 0x7F;
								int var181 = arg2 + var178 & 0x3F;
								int var182 = arg3 + var179;
								if (var182 < 0) {
									var182 = 0;
								} else if (var182 > 7) {
									var182 = 7;
								}
								int var183 = arg4 + var180;
								if (var183 < 0) {
									var183 = 0;
								} else if (var183 > 127) {
									var183 = 127;
								}
								this.faceColour[var176] = (short) (var181 << 10 | var182 << 7 | var183);
							}
						}
						this.field9580 = true;
					}
				}
				if (this.billboards != null) {
					for (int var184 = 0; var184 < this.billboardCount; var184++) {
						Billboard var185 = this.billboards[var184];
						BillboardPlacement var186 = this.billboardPlacements[var184];
						var186.field819 = var186.field819 & 0xFF000000 | ColourUtils.field8149[ColourUtils.method4937(this.faceColour[var185.field901] & 0xFFFF) & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg0 == 8) {
			if (this.labelBillboards != null) {
				for (int var187 = 0; var187 < var9; var187++) {
					int var188 = arg1[var187];
					if (var188 < this.labelBillboards.length) {
						int[] var189 = this.labelBillboards[var188];
						for (int var190 = 0; var190 < var189.length; var190++) {
							BillboardPlacement var191 = this.billboardPlacements[var189[var190]];
							var191.field822 += arg2;
							var191.field816 += arg3;
						}
					}
				}
			}
		} else if (arg0 == 10) {
			if (this.labelBillboards != null) {
				for (int var192 = 0; var192 < var9; var192++) {
					int var193 = arg1[var192];
					if (var193 < this.labelBillboards.length) {
						int[] var194 = this.labelBillboards[var193];
						for (int var195 = 0; var195 < var194.length; var195++) {
							BillboardPlacement var196 = this.billboardPlacements[var194[var195]];
							var196.field813 = (float) arg2 * var196.field813 / 128.0F;
							var196.field814 = (float) arg3 * var196.field814 / 128.0F;
						}
					}
				}
			}
		} else if (arg0 == 9 && this.labelBillboards != null) {
			for (int var197 = 0; var197 < var9; var197++) {
				int var198 = arg1[var197];
				if (var198 < this.labelBillboards.length) {
					int[] var199 = this.labelBillboards[var198];
					for (int var200 = 0; var200 < var199.length; var200++) {
						BillboardPlacement var201 = this.billboardPlacements[var199[var200]];
						var201.field817 = var201.field817 + arg2 & 0x3FFF;
					}
				}
			}
		}
	}

	@ObfuscatedName("afi.ar(IIII)V")
	public void method1721(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 == 0) {
			int var5 = 0;
			this.baseX = 0;
			this.baseY = 0;
			this.baseZ = 0;
			for (int var6 = 0; var6 < this.vertexCount; var6++) {
				this.baseX += this.vertexX[var6];
				this.baseY += this.vertexY[var6];
				this.baseZ += this.vertexZ[var6];
				var5++;
			}
			if (var5 > 0) {
				this.baseX = this.baseX / var5 + arg1;
				this.baseY = this.baseY / var5 + arg2;
				this.baseZ = this.baseZ / var5 + arg3;
			} else {
				this.baseX = arg1;
				this.baseY = arg2;
				this.baseZ = arg3;
			}
		} else if (arg0 == 1) {
			for (int var7 = 0; var7 < this.vertexCount; var7++) {
				this.vertexX[var7] += arg1;
				this.vertexY[var7] += arg2;
				this.vertexZ[var7] += arg3;
			}
		} else if (arg0 == 2) {
			for (int var8 = 0; var8 < this.vertexCount; var8++) {
				this.vertexX[var8] -= this.baseX;
				this.vertexY[var8] -= this.baseY;
				this.vertexZ[var8] -= this.baseZ;
				if (arg3 != 0) {
					int var9 = Trig1.sin[arg3];
					int var10 = Trig1.cos[arg3];
					int var11 = this.vertexY[var8] * var9 + this.vertexX[var8] * var10 + 16383 >> 14;
					this.vertexY[var8] = this.vertexY[var8] * var10 - this.vertexX[var8] * var9 + 16383 >> 14;
					this.vertexX[var8] = var11;
				}
				if (arg1 != 0) {
					int var12 = Trig1.sin[arg1];
					int var13 = Trig1.cos[arg1];
					int var14 = this.vertexY[var8] * var13 - this.vertexZ[var8] * var12 + 16383 >> 14;
					this.vertexZ[var8] = this.vertexZ[var8] * var13 + this.vertexY[var8] * var12 + 16383 >> 14;
					this.vertexY[var8] = var14;
				}
				if (arg2 != 0) {
					int var15 = Trig1.sin[arg2];
					int var16 = Trig1.cos[arg2];
					int var17 = this.vertexZ[var8] * var15 + this.vertexX[var8] * var16 + 16383 >> 14;
					this.vertexZ[var8] = this.vertexZ[var8] * var16 - this.vertexX[var8] * var15 + 16383 >> 14;
					this.vertexX[var8] = var17;
				}
				this.vertexX[var8] += this.baseX;
				this.vertexY[var8] += this.baseY;
				this.vertexZ[var8] += this.baseZ;
			}
		} else if (arg0 == 3) {
			for (int var18 = 0; var18 < this.vertexCount; var18++) {
				this.vertexX[var18] -= this.baseX;
				this.vertexY[var18] -= this.baseY;
				this.vertexZ[var18] -= this.baseZ;
				this.vertexX[var18] = this.vertexX[var18] * arg1 / 128;
				this.vertexY[var18] = this.vertexY[var18] * arg2 / 128;
				this.vertexZ[var18] = this.vertexZ[var18] * arg3 / 128;
				this.vertexX[var18] += this.baseX;
				this.vertexY[var18] += this.baseY;
				this.vertexZ[var18] += this.baseZ;
			}
		} else if (arg0 == 5) {
			for (int var19 = 0; var19 < this.faceCount; var19++) {
				int var20 = (this.faceAlpha[var19] & 0xFF) + arg1 * 8;
				if (var20 < 0) {
					var20 = 0;
				} else if (var20 > 255) {
					var20 = 255;
				}
				this.faceAlpha[var19] = (byte) var20;
			}
			if (this.billboards != null) {
				for (int var21 = 0; var21 < this.billboardCount; var21++) {
					Billboard var22 = this.billboards[var21];
					BillboardPlacement var23 = this.billboardPlacements[var21];
					var23.field819 = var23.field819 & 0xFFFFFF | 255 - (this.faceAlpha[var22.field901] & 0xFF) << 24;
				}
			}
		} else if (arg0 == 7) {
			for (int var24 = 0; var24 < this.faceCount; var24++) {
				int var25 = this.faceColour[var24] & 0xFFFF;
				int var26 = var25 >> 10 & 0x3F;
				int var27 = var25 >> 7 & 0x7;
				int var28 = var25 & 0x7F;
				int var29 = arg1 + var26 & 0x3F;
				int var30 = arg2 + var27;
				if (var30 < 0) {
					var30 = 0;
				} else if (var30 > 7) {
					var30 = 7;
				}
				int var31 = arg3 + var28;
				if (var31 < 0) {
					var31 = 0;
				} else if (var31 > 127) {
					var31 = 127;
				}
				this.faceColour[var24] = (short) (var29 << 10 | var30 << 7 | var31);
			}
			this.field9580 = true;
			if (this.billboards != null) {
				for (int var32 = 0; var32 < this.billboardCount; var32++) {
					Billboard var33 = this.billboards[var32];
					BillboardPlacement var34 = this.billboardPlacements[var32];
					var34.field819 = var34.field819 & 0xFF000000 | ColourUtils.field8149[ColourUtils.method4937(this.faceColour[var33.field901] & 0xFFFF) & 0xFFFF] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 8) {
			for (int var35 = 0; var35 < this.billboardCount; var35++) {
				BillboardPlacement var36 = this.billboardPlacements[var35];
				var36.field822 += arg1;
				var36.field816 += arg2;
			}
		} else if (arg0 == 10) {
			for (int var37 = 0; var37 < this.billboardCount; var37++) {
				BillboardPlacement var38 = this.billboardPlacements[var37];
				var38.field813 = (float) arg1 * var38.field813 / 128.0F;
				var38.field814 = (float) arg2 * var38.field814 / 128.0F;
			}
		} else if (arg0 == 9) {
			for (int var39 = 0; var39 < this.billboardCount; var39++) {
				BillboardPlacement var40 = this.billboardPlacements[var39];
				var40.field817 = var40.field817 + arg1 & 0x3FFF;
			}
		}
	}

	@ObfuscatedName("afi.aq(Lou;IZ)V")
	public void method1771(Matrix4x3 arg0, int arg1, boolean arg2) {
		if (this.vertexSourceModels == null) {
			return;
		}
		PureJavaToolkitContext var4 = this.renderer.getContext(Thread.currentThread());
		Matrix4x3 var5 = var4.field838;
		var5.setTo(arg0);
		if (arg2) {
			var5.method6300();
		}
		Matrix4x4 var6 = var4.field828;
		var6.setToMatrix4x3(var5);
		float[] var7 = new float[3];
		for (int var8 = 0; var8 < this.field9549; var8++) {
			if ((arg1 & this.vertexSourceModels[var8]) != 0) {
				var6.method6614((float) this.vertexX[var8], (float) this.vertexY[var8], (float) this.vertexZ[var8], var7);
				this.vertexX[var8] = (int) var7[0];
				this.vertexY[var8] = (int) var7[1];
				this.vertexZ[var8] = (int) var7[2];
			}
		}
	}

	@ObfuscatedName("afi.ax(Lou;Led;I)V")
	public void draw(Matrix4x3 arg0, ScreenBoundingBox arg1, int arg2) {
		this.method15478(arg0, arg1, arg2);
	}

	@ObfuscatedName("afi.hv(Lou;Led;I)V")
	public void method15478(Matrix4x3 arg0, ScreenBoundingBox arg1, int arg2) {
		if (this.field9549 < 1) {
			return;
		}
		PureJavaToolkitContext var4 = this.renderer.getContext(Thread.currentThread());
		Matrix4x4 var5 = var4.field828;
		var5.setToMatrix4x3(arg0);
		Matrix4x4 var6 = this.renderer.field9793;
		Matrix4x4 var7 = this.renderer.field9795;
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		boolean var8 = var5.method6613();
		float[] var9 = var4.field845;
		var5.method6614(0.0F, (float) this.minY, 0.0F, var9);
		float var10 = var9[0];
		float var11 = var9[1];
		float var12 = var9[2];
		var5.method6614(0.0F, (float) this.maxY, 0.0F, var9);
		float var13 = var9[0];
		float var14 = var9[1];
		float var15 = var9[2];
		for (int var16 = 0; var16 < 6; var16++) {
			float[] var17 = this.renderer.field9796[var16];
			float var18 = var17[2] * var12 + var17[0] * var10 + var17[1] * var11 + var17[3] + (float) this.horizontalRadius;
			float var19 = var17[2] * var15 + var17[0] * var13 + var17[1] * var14 + var17[3] + (float) this.horizontalRadius;
			if (var18 < 0.0F && var19 < 0.0F) {
				return;
			}
		}
		float var20;
		float var21;
		if (var8) {
			var20 = var6.entries[14];
			var21 = var6.entries[6];
		} else {
			var20 = var5.entries[14] * var6.entries[10] + var5.entries[12] * var6.entries[2] + var5.entries[13] * var6.entries[6] + var6.entries[14];
			var21 = var5.entries[6] * var6.entries[10] + var5.entries[4] * var6.entries[2] + var5.entries[5] * var6.entries[6];
		}
		float var22 = (float) this.minY * var21 + var20;
		float var23 = (float) this.maxY * var21 + var20;
		float var24 = var22 > var23 ? (float) this.horizontalRadius + var22 : (float) this.horizontalRadius + var23;
		float var25 = var7.entries[10] * var24 + var7.entries[14];
		if (this.renderer.threadLocalsCount > 1) {
			synchronized (this) {
				while (this.field9533) {
					try {
						this.wait();
					} catch (InterruptedException var101) {
					}
				}
				this.field9533 = true;
			}
		}
		this.method15458(var4);
		Matrix4x4 var29 = this.field9534.field868;
		var29.setTo(var5);
		var29.multiply(this.renderer.field9803);
		if ((arg2 & 0x2) == 0) {
			this.rasteriser.method1027(false);
		} else {
			this.rasteriser.method1027(true);
		}
		boolean var30 = false;
		this.field9534.field840 = this.rasteriser.field964;
		this.field9534.field854 = this.rasteriser.field942;
		this.field9534.field856 = this.rasteriser.field932;
		this.field9534.field852 = 1.0F / this.rasteriser.field932;
		this.field9534.field853 = this.rasteriser.field934;
		this.field9534.field857 = this.rasteriser.field941;
		this.field9534.field839 = this.rasteriser.field958;
		this.field9534.field835 = this.rasteriser.field945;
		for (int var31 = 0; var31 < this.vertexCount; var31++) {
			int var32 = this.vertexX[var31];
			int var33 = this.vertexY[var31];
			int var34 = this.vertexZ[var31];
			float var35 = var29.entries[8] * (float) var34 + var29.entries[0] * (float) var32 + var29.entries[4] * (float) var33 + var29.entries[12];
			float var36 = var29.entries[9] * (float) var34 + var29.entries[1] * (float) var32 + var29.entries[5] * (float) var33 + var29.entries[13];
			float var37 = var29.entries[10] * (float) var34 + var29.entries[2] * (float) var32 + var29.entries[6] * (float) var33 + var29.entries[14];
			float var38 = var29.entries[11] * (float) var34 + var29.entries[3] * (float) var32 + var29.entries[7] * (float) var33 + var29.entries[15];
			this.field9609[var31] = this.field9534.field856 * var37 / var38 + this.field9534.field839;
			this.field9610[var31] = var38;
			if (var37 >= -var38) {
				this.field9578[var31] = (float) (this.field9534.field840 * var35 / var38 + this.field9534.field853);
				this.field9607[var31] = (float) (this.field9534.field854 * var36 / var38 + this.field9534.field857);
			} else {
				this.field9578[var31] = -5000.0F;
				var30 = true;
			}
			if (this.field9534.field867) {
				this.field9606[var31] = (int) (var5.entries[9] * (float) var34 + var5.entries[1] * (float) var32 + var5.entries[5] * (float) var33 + var5.entries[13]);
			}
		}
		if (this.billboards != null) {
			for (int var39 = 0; var39 < this.billboardCount; var39++) {
				Billboard var40 = this.billboards[var39];
				BillboardPlacement var41 = this.billboardPlacements[var39];
				short var42 = this.faceVertex1[var40.field901];
				short var43 = this.faceVertex2[var40.field901];
				short var44 = this.faceVertex3[var40.field901];
				int var45 = (this.vertexX[var42] + this.vertexX[var43] + this.vertexX[var44]) / 3;
				int var46 = (this.vertexY[var42] + this.vertexY[var43] + this.vertexY[var44]) / 3;
				int var47 = (this.vertexZ[var42] + this.vertexZ[var43] + this.vertexZ[var44]) / 3;
				float var48 = var29.entries[8] * (float) var47 + var29.entries[0] * (float) var45 + var29.entries[4] * (float) var46 + var29.entries[12];
				float var49 = var29.entries[9] * (float) var47 + var29.entries[1] * (float) var45 + var29.entries[5] * (float) var46 + var29.entries[13];
				float var50 = var29.entries[10] * (float) var47 + var29.entries[2] * (float) var45 + var29.entries[6] * (float) var46 + var29.entries[14];
				float var51 = var29.entries[11] * (float) var47 + var29.entries[3] * (float) var45 + var29.entries[7] * (float) var46 + var29.entries[15];
				float var52 = var7.entries[2] * (float) var41.field822 + var7.entries[6] * (float) var41.field816 + var50;
				float var53 = var7.entries[3] * (float) var41.field822 + var7.entries[7] * (float) var41.field816 + var51;
				if (var52 > -var53) {
					float var54 = var7.entries[0] * (float) var41.field822 + var7.entries[4] * (float) var41.field816 + var48;
					float var55 = var7.entries[1] * (float) var41.field822 + var7.entries[5] * (float) var41.field816 + var49;
					float var56 = this.renderer.field9789 * var54 / var53 + this.renderer.field9814;
					float var57 = this.renderer.field9802 * var55 / var53 + this.renderer.field9806;
					float var58 = (float) var40.field896 * var41.field813;
					float var59 = (float) var40.field902 * var41.field814;
					float var60 = var7.entries[4] * var59 + var7.entries[0] * var58 + var54;
					float var61 = var7.entries[5] * var59 + var7.entries[1] * var58 + var55;
					float var62 = var7.entries[7] * var59 + var7.entries[3] * var58 + var53;
					float var63 = this.renderer.field9789 * var60 / var62 + this.renderer.field9814;
					float var64 = this.renderer.field9802 * var61 / var62 + this.renderer.field9806;
					var41.field818 = (int) var56;
					var41.field812 = (int) var57;
					var41.field815 = (var52 - var7.entries[10] * (float) var40.field897) * this.renderer.field9813 / var53 + this.renderer.field9799;
					var41.field820 = (int) (var63 < var56 ? var56 - var63 : var63 - var56);
					var41.field821 = (int) (var64 < var57 ? var57 - var64 : var64 - var57);
				} else {
					var41.field821 = 0;
					var41.field820 = 0;
				}
			}
		}
		if (arg1 != null) {
			boolean var66 = false;
			boolean var67 = true;
			int var68 = this.minX + this.maxX >> 1;
			int var69 = this.minZ + this.maxZ >> 1;
			short var71 = this.minY;
			float var73 = var29.entries[8] * (float) var69 + var29.entries[0] * (float) var68 + var29.entries[4] * (float) var71 + var29.entries[12];
			float var74 = var29.entries[9] * (float) var69 + var29.entries[1] * (float) var68 + var29.entries[5] * (float) var71 + var29.entries[13];
			float var75 = var29.entries[10] * (float) var69 + var29.entries[2] * (float) var68 + var29.entries[6] * (float) var71 + var29.entries[14];
			float var76 = var29.entries[11] * (float) var69 + var29.entries[3] * (float) var68 + var29.entries[7] * (float) var71 + var29.entries[15];
			if (var75 >= -var76) {
				arg1.field1683 = (int) (this.renderer.field9789 * var73 / var76 + this.renderer.field9814);
				arg1.field1684 = (int) (this.renderer.field9802 * var74 / var76 + this.renderer.field9806);
			} else {
				var66 = true;
			}
			short var78 = this.maxY;
			float var80 = var29.entries[8] * (float) var69 + var29.entries[0] * (float) var68 + var29.entries[4] * (float) var78 + var29.entries[12];
			float var81 = var29.entries[9] * (float) var69 + var29.entries[1] * (float) var68 + var29.entries[5] * (float) var78 + var29.entries[13];
			float var82 = var29.entries[10] * (float) var69 + var29.entries[2] * (float) var68 + var29.entries[6] * (float) var78 + var29.entries[14];
			float var83 = var29.entries[11] * (float) var69 + var29.entries[3] * (float) var68 + var29.entries[7] * (float) var78 + var29.entries[15];
			if (var82 >= -var83) {
				arg1.field1682 = (int) (this.renderer.field9789 * var80 / var83 + this.renderer.field9814);
				arg1.field1685 = (int) (this.renderer.field9802 * var81 / var83 + this.renderer.field9806);
			} else {
				var66 = true;
			}
			if (var66) {
				if (var75 < -var76 && var82 < -var83) {
					var67 = false;
				} else if (var75 < -var76) {
					float var84 = (var75 + var76) / (var82 + var83) - 1.0F;
					float var85 = (var80 - var73) * var84 + var73;
					float var86 = (var81 - var74) * var84 + var74;
					float var87 = (var83 - var76) * var84 + var76;
					arg1.field1683 = (int) (this.renderer.field9789 * var85 / var87 + this.renderer.field9814);
					arg1.field1684 = (int) (this.renderer.field9802 * var86 / var87 + this.renderer.field9806);
				} else if (var82 < -var83) {
					float var88 = (var82 + var83) / (var75 + var76) - 1.0F;
					float var89 = (var73 - var80) * var88 + var80;
					float var90 = (var74 - var81) * var88 + var81;
					float var91 = (var76 - var83) * var88 + var83;
					arg1.field1682 = (int) (this.renderer.field9789 * var89 / var91 + this.renderer.field9814);
					arg1.field1685 = (int) (this.renderer.field9802 * var90 / var91 + this.renderer.field9806);
				}
			}
			if (var67) {
				if (var75 / var76 > var82 / var83) {
					float var92 = var7.entries[0] * (float) this.horizontalRadius + var73 + var7.entries[12];
					float var93 = var7.entries[3] * (float) this.horizontalRadius + var76 + var7.entries[15];
					arg1.field1687 = (int) (this.renderer.field9789 * var92 / var93 + (this.renderer.field9814 - (float) arg1.field1683));
				} else {
					float var94 = var7.entries[0] * (float) this.horizontalRadius + var80 + var7.entries[12];
					float var95 = var7.entries[3] * (float) this.horizontalRadius + var83 + var7.entries[15];
					arg1.field1687 = (int) (this.renderer.field9789 * var94 / var95 + (this.renderer.field9814 - (float) arg1.field1682));
				}
				arg1.field1686 = true;
			}
		}
		this.method15466(true);
		this.rasteriser.field933 = (arg2 & 0x1) == 0;
		this.rasteriser.field968 = false;
		try {
			this.method15490(this.renderer.colour != null, this.renderer.depth != null, (arg2 & 0x4) != 0, var30, this.field9534.field826 && var25 > this.field9534.field865 || this.field9534.field867);
		} catch (Exception var102) {
		}
		if (this.billboards != null) {
			for (int var97 = 0; var97 < this.faceCount; var97++) {
				this.field9618[var97] = -1;
			}
		}
		this.rasteriser = null;
		if (this.renderer.threadLocalsCount > 1) {
			synchronized (this) {
				this.field9533 = false;
				this.notifyAll();
			}
		}
	}

	@ObfuscatedName("afi.hz(ZZZZZ)V")
	public final void method15490(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
		if (this.billboards != null) {
			int var6 = 0;
			while (var6 < this.billboardCount) {
				Billboard var7 = this.billboards[var6];
				this.field9618[var7.field901] = var6++;
			}
		}
		if (!this.field9548 && this.billboards == null) {
			for (int var8 = 0; var8 < this.field9557; var8++) {
				this.method15519(arg0, arg1, arg2, var8, arg3, arg4);
			}
			return;
		}
		if ((this.allowedOperations & 0x100) == 0 && this.field9554 != null) {
			for (int var9 = 0; var9 < this.field9557; var9++) {
				short var10 = this.field9554[var9];
				this.method15519(arg0, arg1, arg2, var10, arg3, arg4);
			}
		} else {
			for (int var11 = 0; var11 < this.field9557; var11++) {
				if (!this.method15480(var11) && !this.method15481(var11)) {
					this.method15519(arg0, arg1, arg2, var11, arg3, arg4);
				}
			}
			if (this.facePriority == null) {
				for (int var12 = 0; var12 < this.field9557; var12++) {
					if (this.method15480(var12) || this.method15481(var12)) {
						this.method15519(arg0, arg1, arg2, var12, arg3, arg4);
					}
				}
			} else {
				for (int var13 = 0; var13 < 12; var13++) {
					for (int var14 = 0; var14 < this.field9557; var14++) {
						if (this.facePriority[var14] == var13 && (this.method15480(var14) || this.method15481(var14))) {
							this.method15519(arg0, arg1, arg2, var14, arg3, arg4);
						}
					}
				}
			}
		}
		if (this.billboards != null) {
			this.method15479(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("afi.ij(ZZZ)V")
	public final void method15479(boolean arg0, boolean arg1, boolean arg2) {
		for (int var4 = 0; var4 < this.billboardCount; var4++) {
			Billboard var5 = this.billboards[var4];
			if (var5.field898) {
				BillboardPlacement var6 = this.billboardPlacements[var4];
				this.renderer.method15686(arg0, arg1, arg2, var6.field818, var6.field812, var6.field815, var6.field820, var6.field821, var5.field895, var6.field819, var5.field900, var5.field899);
			}
		}
	}

	@ObfuscatedName("afi.io(I)Z")
	public final boolean method15480(int arg0) {
		if (this.faceAlpha == null) {
			return false;
		} else {
			return this.faceAlpha[arg0] != 0;
		}
	}

	@ObfuscatedName("afi.iq(I)Z")
	public final boolean method15481(int arg0) {
		if (this.field9618 == null) {
			return false;
		} else {
			return this.field9618[arg0] != -1;
		}
	}

	@ObfuscatedName("afi.ig(ZZZIZZ)V")
	public final void method15519(boolean arg0, boolean arg1, boolean arg2, int arg3, boolean arg4, boolean arg5) {
		if (this.field9565[arg3] == -2) {
			return;
		}
		short var7 = this.faceVertex1[arg3];
		short var8 = this.faceVertex2[arg3];
		short var9 = this.faceVertex3[arg3];
		float var10 = this.field9578[var7];
		float var11 = this.field9578[var8];
		float var12 = this.field9578[var9];
		if (arg4 && (var10 == -5000.0F || var11 == -5000.0F || var12 == -5000.0F)) {
			return;
		}
		float var13 = this.field9607[var7];
		float var14 = this.field9607[var8];
		float var15 = this.field9607[var9];
		if (this.field9618[arg3] == -1 && (var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) <= 0.0F) {
			return;
		}
		if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > (float) this.field9534.field835 || var11 > (float) this.field9534.field835 || var12 > (float) this.field9534.field835) {
			this.rasteriser.field936 = true;
		} else {
			this.rasteriser.field936 = false;
		}
		if (arg5) {
			int var16 = this.field9618[arg3];
			if (var16 == -1 || !this.billboards[var16].field898) {
				this.method15484(arg0, arg1, arg2, arg3);
			}
			return;
		}
		int var17 = this.field9618[arg3];
		if (var17 == -1) {
			this.method15483(arg0, arg1, arg2, arg3);
			return;
		}
		Billboard var18 = this.billboards[var17];
		BillboardPlacement var19 = this.billboardPlacements[var17];
		if (!var18.field898) {
			this.method15483(arg0, arg1, arg2, arg3);
		}
		this.renderer.method15686(arg0, arg1, arg2, var19.field818, var19.field812, var19.field815, var19.field820, var19.field821, var18.field895, var19.field819, var18.field900, var18.field899);
	}

	@ObfuscatedName("afi.iv(ZZZI)V")
	public final void method15483(boolean arg0, boolean arg1, boolean arg2, int arg3) {
		short var5 = this.faceVertex1[arg3];
		short var6 = this.faceVertex2[arg3];
		short var7 = this.faceVertex3[arg3];
		boolean var8 = false;
		if (this.field9574 != null && this.field9574[arg3] != -1) {
			var8 = this.renderer.materialList.get(this.field9574[arg3] & 0xFFFF).field1330;
		}
		if (!var8) {
			if (this.faceAlpha == null) {
				this.rasteriser.field935 = 0;
			} else {
				this.rasteriser.field935 = this.faceAlpha[arg3] & 0xFF;
			}
			if (this.field9565[arg3] == -1) {
				this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var5], this.field9607[var6], this.field9607[var7], this.field9578[var5], this.field9578[var6], this.field9578[var7], this.field9609[var5], this.field9609[var6], this.field9609[var7], ColourUtils.field8149[this.field9563[arg3] & 0xFFFF]);
			} else {
				this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var5], this.field9607[var6], this.field9607[var7], this.field9578[var5], this.field9578[var6], this.field9578[var7], this.field9609[var5], this.field9609[var6], this.field9609[var7], (float) (this.field9563[arg3] & 0xFFFF), (float) (this.field9583[arg3] & 0xFFFF), (float) (this.field9565[arg3] & 0xFFFF));
			}
			return;
		}
		int var9 = -16777216;
		if (this.faceAlpha != null) {
			var9 = 255 - (this.faceAlpha[arg3] & 0xFF) << 24;
		}
		if (this.field9565[arg3] == -1) {
			int var10 = var9 | this.field9563[arg3] & 0xFFFFFF;
			this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var5], this.field9607[var6], this.field9607[var7], this.field9578[var5], this.field9578[var6], this.field9578[var7], this.field9609[var5], this.field9609[var6], this.field9609[var7], this.field9610[var5], this.field9610[var6], this.field9610[var7], this.faceVertexU[arg3][0], this.faceVertexU[arg3][1], this.faceVertexU[arg3][2], this.faceVertexV[arg3][0], this.faceVertexV[arg3][1], this.faceVertexV[arg3][2], var10, var10, var10, this.field9534.fadeColour, 0.0F, 0.0F, 0.0F, this.field9574[arg3] & 0xFFFF);
		} else {
			this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var5], this.field9607[var6], this.field9607[var7], this.field9578[var5], this.field9578[var6], this.field9578[var7], this.field9609[var5], this.field9609[var6], this.field9609[var7], this.field9610[var5], this.field9610[var6], this.field9610[var7], this.faceVertexU[arg3][0], this.faceVertexU[arg3][1], this.faceVertexU[arg3][2], this.faceVertexV[arg3][0], this.faceVertexV[arg3][1], this.faceVertexV[arg3][2], var9 | this.field9563[arg3] & 0xFFFFFF, var9 | this.field9583[arg3] & 0xFFFFFF, var9 | this.field9565[arg3] & 0xFFFFFF, this.field9534.fadeColour, 0.0F, 0.0F, 0.0F, this.field9574[arg3] & 0xFFFF);
		}
	}

	@ObfuscatedName("afi.ie(ZZZI)V")
	public final void method15484(boolean arg0, boolean arg1, boolean arg2, int arg3) {
		boolean var5 = false;
		if (this.field9574 != null && this.field9574[arg3] != -1) {
			var5 = this.renderer.materialList.get(this.field9574[arg3] & 0xFFFF).field1330;
		}
		if (this.field9534.field867) {
			short var27 = this.faceVertex1[arg3];
			short var28 = this.faceVertex2[arg3];
			short var29 = this.faceVertex3[arg3];
			float var30 = 0.0F;
			float var31 = 0.0F;
			float var32 = 0.0F;
			if (this.field9606[var27] > this.field9534.field861) {
				var30 = 1.0F;
			} else if (this.field9606[var27] > this.field9534.field832) {
				var30 = (float) (this.field9534.field832 - this.field9606[var27]) * 1.0F / (float) (this.field9534.field832 - this.field9534.field861);
			}
			if (this.field9606[var28] > this.field9534.field861) {
				var31 = 1.0F;
			} else if (this.field9606[var28] > this.field9534.field832) {
				var31 = (float) (this.field9534.field832 - this.field9606[var28]) * 1.0F / (float) (this.field9534.field832 - this.field9534.field861);
			}
			if (this.field9606[var29] > this.field9534.field861) {
				var32 = 1.0F;
			} else if (this.field9606[var29] > this.field9534.field832) {
				var32 = (float) (this.field9534.field832 - this.field9606[var29]) * 1.0F / (float) (this.field9534.field832 - this.field9534.field861);
			}
			if (this.faceAlpha == null) {
				this.rasteriser.field935 = 0;
			} else {
				this.rasteriser.field935 = this.faceAlpha[arg3] & 0xFF;
			}
			if (var5) {
				int var33 = -16777216;
				if (this.faceAlpha != null) {
					var33 = 255 - (this.faceAlpha[arg3] & 0xFF) << 24;
				}
				if (this.field9565[arg3] == -1) {
					int var34 = var33 | this.field9563[arg3] & 0xFFFFFF;
					this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var27], this.field9607[var28], this.field9607[var29], this.field9578[var27], this.field9578[var28], this.field9578[var29], this.field9609[var27], this.field9609[var28], this.field9609[var29], this.field9610[var27], this.field9610[var28], this.field9610[var29], this.faceVertexU[arg3][0], this.faceVertexU[arg3][1], this.faceVertexU[arg3][2], this.faceVertexV[arg3][0], this.faceVertexV[arg3][1], this.faceVertexV[arg3][2], var34, var34, var34, this.field9534.fadeColour, var30 * 255.0F, var31 * 255.0F, var32 * 255.0F, this.field9574[arg3] & 0xFFFF);
				} else {
					this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var27], this.field9607[var28], this.field9607[var29], this.field9578[var27], this.field9578[var28], this.field9578[var29], this.field9609[var27], this.field9609[var28], this.field9609[var29], this.field9610[var27], this.field9610[var28], this.field9610[var29], this.faceVertexU[arg3][0], this.faceVertexU[arg3][1], this.faceVertexU[arg3][2], this.faceVertexV[arg3][0], this.faceVertexV[arg3][1], this.faceVertexV[arg3][2], var33 | this.field9563[arg3] & 0xFFFFFF, var33 | this.field9583[arg3] & 0xFFFFFF, var33 | this.field9565[arg3] & 0xFFFFFF, this.field9534.fadeColour, var30 * 255.0F, var31 * 255.0F, var32 * 255.0F, this.field9574[arg3] & 0xFFFF);
				}
			} else if (this.field9565[arg3] == -1) {
				this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var27], this.field9607[var28], this.field9607[var29], this.field9578[var27], this.field9578[var28], this.field9578[var29], this.field9609[var27], this.field9609[var28], this.field9609[var29], ColourUtils.interpolateColours(ColourUtils.field8149[this.field9563[arg3] & 0xFFFF], this.field9534.fadeColour, var30 * 255.0F), ColourUtils.interpolateColours(ColourUtils.field8149[this.field9563[arg3] & 0xFFFF], this.field9534.fadeColour, var31 * 255.0F), ColourUtils.interpolateColours(ColourUtils.field8149[this.field9563[arg3] & 0xFFFF], this.field9534.fadeColour, var32 * 255.0F));
			} else {
				this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var27], this.field9607[var28], this.field9607[var29], this.field9578[var27], this.field9578[var28], this.field9578[var29], this.field9609[var27], this.field9609[var28], this.field9609[var29], ColourUtils.interpolateColours(ColourUtils.field8149[this.field9563[arg3] & 0xFFFF], this.field9534.fadeColour, var30 * 255.0F), ColourUtils.interpolateColours(ColourUtils.field8149[this.field9583[arg3] & 0xFFFF], this.field9534.fadeColour, var31 * 255.0F), ColourUtils.interpolateColours(ColourUtils.field8149[this.field9565[arg3] & 0xFFFF], this.field9534.fadeColour, var32 * 255.0F));
			}
			return;
		}
		short var6 = this.faceVertex1[arg3];
		short var7 = this.faceVertex2[arg3];
		short var8 = this.faceVertex3[arg3];
		Matrix4x4 var9 = this.renderer.field9795;
		float var10 = var9.entries[10];
		float var11 = var9.entries[14];
		float var12 = var9.entries[11];
		float var13 = var9.entries[15];
		float var14 = var11 * var12 - var10 * var13;
		float var15 = (this.field9609[var6] - this.field9534.field839) * this.field9534.field852;
		float var16 = (this.field9609[var7] - this.field9534.field839) * this.field9534.field852;
		float var17 = (this.field9609[var8] - this.field9534.field839) * this.field9534.field852;
		float var18 = var14 * var15 / (var12 * var15 - var10);
		float var19 = var14 * var16 / (var12 * var16 - var10);
		float var20 = var14 * var17 / (var12 * var17 - var10);
		float var21 = (var18 - this.field9534.field865) / this.field9534.field855;
		if (var21 > 1.0F) {
			var21 = 1.0F;
		} else if (var21 < 0.0F) {
			var21 = 0.0F;
		}
		float var22 = (var19 - this.field9534.field865) / this.field9534.field855;
		if (var22 > 1.0F) {
			var22 = 1.0F;
		} else if (var22 < 0.0F) {
			var22 = 0.0F;
		}
		float var23 = (var20 - this.field9534.field865) / this.field9534.field855;
		if (var23 > 1.0F) {
			var23 = 1.0F;
		} else if (var23 < 0.0F) {
			var23 = 0.0F;
		}
		float var24 = var21 + var22 + var23;
		if (var24 >= 3.0F) {
			return;
		}
		if (var24 <= 0.0F) {
			this.method15483(arg0, arg1, arg2, arg3);
			return;
		}
		if (this.faceAlpha == null) {
			this.rasteriser.field935 = 0;
		} else {
			this.rasteriser.field935 = this.faceAlpha[arg3] & 0xFF;
		}
		if (var5) {
			int var25 = -16777216;
			if (this.faceAlpha != null) {
				var25 = 255 - (this.faceAlpha[arg3] & 0xFF) << 24;
			}
			if (this.field9565[arg3] == -1) {
				int var26 = var25 | this.field9563[arg3] & 0xFFFFFF;
				this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var6], this.field9607[var7], this.field9607[var8], this.field9578[var6], this.field9578[var7], this.field9578[var8], this.field9609[var6], this.field9609[var7], this.field9609[var8], this.field9610[var6], this.field9610[var7], this.field9610[var8], this.faceVertexU[arg3][0], this.faceVertexU[arg3][1], this.faceVertexU[arg3][2], this.faceVertexV[arg3][0], this.faceVertexV[arg3][1], this.faceVertexV[arg3][2], var26, var26, var26, this.field9534.fadeColour, var21 * 255.0F, var22 * 255.0F, var23 * 255.0F, this.field9574[arg3] & 0xFFFF);
			} else {
				this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var6], this.field9607[var7], this.field9607[var8], this.field9578[var6], this.field9578[var7], this.field9578[var8], this.field9609[var6], this.field9609[var7], this.field9609[var8], this.field9610[var6], this.field9610[var7], this.field9610[var8], this.faceVertexU[arg3][0], this.faceVertexU[arg3][1], this.faceVertexU[arg3][2], this.faceVertexV[arg3][0], this.faceVertexV[arg3][1], this.faceVertexV[arg3][2], var25 | this.field9563[arg3] & 0xFFFFFF, var25 | this.field9583[arg3] & 0xFFFFFF, var25 | this.field9565[arg3] & 0xFFFFFF, this.field9534.fadeColour, var21 * 255.0F, var22 * 255.0F, var23 * 255.0F, this.field9574[arg3] & 0xFFFF);
			}
		} else if (this.field9565[arg3] == -1) {
			this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var6], this.field9607[var7], this.field9607[var8], this.field9578[var6], this.field9578[var7], this.field9578[var8], this.field9609[var6], this.field9609[var7], this.field9609[var8], ColourUtils.interpolateColours(ColourUtils.field8149[this.field9563[arg3] & 0xFFFF], this.field9534.fadeColour, var21 * 255.0F), ColourUtils.interpolateColours(ColourUtils.field8149[this.field9563[arg3] & 0xFFFF], this.field9534.fadeColour, var22 * 255.0F), ColourUtils.interpolateColours(ColourUtils.field8149[this.field9563[arg3] & 0xFFFF], this.field9534.fadeColour, var23 * 255.0F));
		} else {
			this.rasteriser.drawTriangle(arg0, arg1, arg2, this.field9607[var6], this.field9607[var7], this.field9607[var8], this.field9578[var6], this.field9578[var7], this.field9578[var8], this.field9609[var6], this.field9609[var7], this.field9609[var8], ColourUtils.interpolateColours(ColourUtils.field8149[this.field9563[arg3] & 0xFFFF], this.field9534.fadeColour, var21 * 255.0F), ColourUtils.interpolateColours(ColourUtils.field8149[this.field9583[arg3] & 0xFFFF], this.field9534.fadeColour, var22 * 255.0F), ColourUtils.interpolateColours(ColourUtils.field8149[this.field9565[arg3] & 0xFFFF], this.field9534.fadeColour, var23 * 255.0F));
		}
	}

	@ObfuscatedName("afi.av(IILou;ZI)Z")
	public boolean method1725(int arg0, int arg1, Matrix4x3 arg2, boolean arg3, int arg4) {
		this.method15458(this.renderer.getContext(Thread.currentThread()));
		Matrix4x4 var6 = this.field9534.field828;
		var6.setToMatrix4x3(arg2);
		Matrix4x4 var7 = this.field9534.field868;
		var7.setTo(var6);
		var7.multiply(this.renderer.field9803);
		boolean var8 = false;
		int var9 = Integer.MAX_VALUE;
		int var10 = Integer.MIN_VALUE;
		int var11 = Integer.MAX_VALUE;
		int var12 = Integer.MIN_VALUE;
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		int var13 = this.maxX - this.minX >> 1;
		int var14 = this.maxY - this.minY >> 1;
		int var15 = this.maxZ - this.minZ >> 1;
		int var16 = this.minX + var13;
		int var17 = this.minY + var14;
		int var18 = this.minZ + var15;
		int var19 = var16 - (var13 << arg4);
		int var20 = var17 - (var14 << arg4);
		int var21 = var18 - (var15 << arg4);
		int var22 = (var13 << arg4) + var16;
		int var23 = (var14 << arg4) + var17;
		int var24 = (var15 << arg4) + var18;
		this.field9579[0] = var19;
		this.field9612[0] = var20;
		this.field9594[0] = var21;
		this.field9579[1] = var22;
		this.field9612[1] = var20;
		this.field9594[1] = var21;
		this.field9579[2] = var19;
		this.field9612[2] = var23;
		this.field9594[2] = var21;
		this.field9579[3] = var22;
		this.field9612[3] = var23;
		this.field9594[3] = var21;
		this.field9579[4] = var19;
		this.field9612[4] = var20;
		this.field9594[4] = var24;
		this.field9579[5] = var22;
		this.field9612[5] = var20;
		this.field9594[5] = var24;
		this.field9579[6] = var19;
		this.field9612[6] = var23;
		this.field9594[6] = var24;
		this.field9579[7] = var22;
		this.field9612[7] = var23;
		this.field9594[7] = var24;
		for (int var25 = 0; var25 < 8; var25++) {
			int var26 = this.field9579[var25];
			int var27 = this.field9612[var25];
			int var28 = this.field9594[var25];
			float var29 = var7.entries[10] * (float) var28 + var7.entries[2] * (float) var26 + var7.entries[6] * (float) var27 + var7.entries[14];
			float var30 = var7.entries[11] * (float) var28 + var7.entries[3] * (float) var26 + var7.entries[7] * (float) var27 + var7.entries[15];
			if (var29 >= -var30) {
				float var31 = var7.entries[8] * (float) var28 + var7.entries[0] * (float) var26 + var7.entries[4] * (float) var27 + var7.entries[12];
				float var32 = var7.entries[9] * (float) var28 + var7.entries[1] * (float) var26 + var7.entries[5] * (float) var27 + var7.entries[13];
				int var33 = (int) (this.renderer.field9789 * var31 / var30 + this.renderer.field9814);
				int var34 = (int) (this.renderer.field9802 * var32 / var30 + this.renderer.field9806);
				if (var33 < var9) {
					var9 = var33;
				}
				if (var33 > var10) {
					var10 = var33;
				}
				if (var34 < var11) {
					var11 = var34;
				}
				if (var34 > var12) {
					var12 = var34;
				}
				var8 = true;
			}
		}
		if (var8 && arg0 > var9 && arg0 < var10 && arg1 > var11 && arg1 < var12) {
			if (arg3) {
				return true;
			}
			for (int var35 = 0; var35 < this.vertexCount; var35++) {
				int var36 = this.vertexX[var35];
				int var37 = this.vertexY[var35];
				int var38 = this.vertexZ[var35];
				float var39 = var7.entries[10] * (float) var38 + var7.entries[2] * (float) var36 + var7.entries[6] * (float) var37 + var7.entries[14];
				float var40 = var7.entries[11] * (float) var38 + var7.entries[3] * (float) var36 + var7.entries[7] * (float) var37 + var7.entries[15];
				if (var39 >= -var40) {
					float var41 = var7.entries[8] * (float) var38 + var7.entries[0] * (float) var36 + var7.entries[4] * (float) var37 + var7.entries[12];
					float var42 = var7.entries[9] * (float) var38 + var7.entries[1] * (float) var36 + var7.entries[5] * (float) var37 + var7.entries[13];
					this.field9578[var35] = (float) (this.renderer.field9789 * var41 / var40 + this.renderer.field9814);
					this.field9607[var35] = (float) (this.renderer.field9802 * var42 / var40 + this.renderer.field9806);
				} else {
					this.field9578[var35] = -999999.0F;
				}
			}
			for (int var43 = 0; var43 < this.field9557; var43++) {
				if (this.field9578[this.faceVertex1[var43]] != -999999.0F && this.field9578[this.faceVertex2[var43]] != -999999.0F && this.field9578[this.faceVertex3[var43]] != -999999.0F && this.pointWithinTriangle(arg0, arg1, this.field9607[this.faceVertex1[var43]], this.field9607[this.faceVertex2[var43]], this.field9607[this.faceVertex3[var43]], this.field9578[this.faceVertex1[var43]], this.field9578[this.faceVertex2[var43]], this.field9578[this.faceVertex3[var43]])) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("afi.iu(IIFFFFFF)Z")
	public boolean pointWithinTriangle(int arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
		if ((float) arg1 < arg2 && (float) arg1 < arg3 && (float) arg1 < arg4) {
			return false;
		} else if ((float) arg1 > arg2 && (float) arg1 > arg3 && (float) arg1 > arg4) {
			return false;
		} else if ((float) arg0 < arg5 && (float) arg0 < arg6 && (float) arg0 < arg7) {
			return false;
		} else {
			return !((float) arg0 > arg5) || !((float) arg0 > arg6) || !((float) arg0 > arg7);
		}
	}

	@ObfuscatedName("afi.by(Lou;)V")
	public void method1689(Matrix4x3 arg0) {
		this.method15458(this.renderer.getContext(Thread.currentThread()));
		Matrix4x4 var2 = this.field9534.field828;
		var2.setToMatrix4x3(arg0);
		if (this.emitters != null) {
			for (int var3 = 0; var3 < this.emitters.length; var3++) {
				ModelParticleEmitter var4 = this.emitters[var3];
				ModelParticleEmitter var5 = var4;
				if (var4.field1465 != null) {
					var5 = var4.field1465;
				}
				var5.field1470 = (int) (var2.entries[8] * (float) this.vertexZ[var4.field1476] + var2.entries[0] * (float) this.vertexX[var4.field1476] + var2.entries[4] * (float) this.vertexY[var4.field1476] + var2.entries[12]);
				var5.field1474 = (int) (var2.entries[9] * (float) this.vertexZ[var4.field1476] + var2.entries[1] * (float) this.vertexX[var4.field1476] + var2.entries[5] * (float) this.vertexY[var4.field1476] + var2.entries[13]);
				var5.field1472 = (int) (var2.entries[10] * (float) this.vertexZ[var4.field1476] + var2.entries[2] * (float) this.vertexX[var4.field1476] + var2.entries[6] * (float) this.vertexY[var4.field1476] + var2.entries[14]);
				var5.field1473 = (int) (var2.entries[8] * (float) this.vertexZ[var4.field1467] + var2.entries[0] * (float) this.vertexX[var4.field1467] + var2.entries[4] * (float) this.vertexY[var4.field1467] + var2.entries[12]);
				var5.field1469 = (int) (var2.entries[9] * (float) this.vertexZ[var4.field1467] + var2.entries[1] * (float) this.vertexX[var4.field1467] + var2.entries[5] * (float) this.vertexY[var4.field1467] + var2.entries[13]);
				var5.field1475 = (int) (var2.entries[10] * (float) this.vertexZ[var4.field1467] + var2.entries[2] * (float) this.vertexX[var4.field1467] + var2.entries[6] * (float) this.vertexY[var4.field1467] + var2.entries[14]);
				var5.field1464 = (int) (var2.entries[8] * (float) this.vertexZ[var4.field1468] + var2.entries[0] * (float) this.vertexX[var4.field1468] + var2.entries[4] * (float) this.vertexY[var4.field1468] + var2.entries[12]);
				var5.field1466 = (int) (var2.entries[9] * (float) this.vertexZ[var4.field1468] + var2.entries[1] * (float) this.vertexX[var4.field1468] + var2.entries[5] * (float) this.vertexY[var4.field1468] + var2.entries[13]);
				var5.field1478 = (int) (var2.entries[10] * (float) this.vertexZ[var4.field1468] + var2.entries[2] * (float) this.vertexX[var4.field1468] + var2.entries[6] * (float) this.vertexY[var4.field1468] + var2.entries[14]);
			}
		}
		if (this.effectors == null) {
			return;
		}
		for (int var6 = 0; var6 < this.effectors.length; var6++) {
			ModelParticleEffector var7 = this.effectors[var6];
			ModelParticleEffector var8 = var7;
			if (var7.field1230 != null) {
				var8 = var7.field1230;
			}
			if (var7.field1231 == null) {
				var7.field1231 = new Matrix4x4(var2);
			} else {
				var7.field1231.setTo(var2);
			}
			var8.field1226 = (int) (var2.entries[8] * (float) this.vertexZ[var7.field1225] + var2.entries[0] * (float) this.vertexX[var7.field1225] + var2.entries[4] * (float) this.vertexY[var7.field1225] + var2.entries[12]);
			var8.field1229 = (int) (var2.entries[9] * (float) this.vertexZ[var7.field1225] + var2.entries[1] * (float) this.vertexX[var7.field1225] + var2.entries[5] * (float) this.vertexY[var7.field1225] + var2.entries[13]);
			var8.field1227 = (int) (var2.entries[10] * (float) this.vertexZ[var7.field1225] + var2.entries[2] * (float) this.vertexX[var7.field1225] + var2.entries[6] * (float) this.vertexY[var7.field1225] + var2.entries[14]);
		}
	}

	@ObfuscatedName("afi.ao(Lara;)Lara;")
	public HardShadow method1726(HardShadow arg0) {
		return null;
	}

	@ObfuscatedName("afi.in()V")
	public void calculateBounds() {
		if (this.boundsValid) {
			return;
		}
		int var1 = 0;
		int var2 = 0;
		int var3 = 32767;
		int var4 = 32767;
		int var5 = 32767;
		int var6 = -32768;
		int var7 = -32768;
		int var8 = -32768;
		for (int var9 = 0; var9 < this.field9549; var9++) {
			int var10 = this.vertexX[var9];
			int var11 = this.vertexY[var9];
			int var12 = this.vertexZ[var9];
			if (var10 < var3) {
				var3 = var10;
			}
			if (var10 > var6) {
				var6 = var10;
			}
			if (var11 < var4) {
				var4 = var11;
			}
			if (var11 > var7) {
				var7 = var11;
			}
			if (var12 < var5) {
				var5 = var12;
			}
			if (var12 > var8) {
				var8 = var12;
			}
			int var13 = var10 * var10 + var12 * var12;
			if (var13 > var1) {
				var1 = var13;
			}
			int var14 = var11 * var11 + var13;
			if (var14 > var2) {
				var2 = var14;
			}
		}
		this.minX = (short) var3;
		this.maxX = (short) var6;
		this.minY = (short) var4;
		this.maxY = (short) var7;
		this.minZ = (short) var5;
		this.maxZ = (short) var8;
		this.horizontalRadius = (short) (Math.sqrt((double) var1) + 0.99D);
		this.radius = (short) (Math.sqrt((double) var2) + 0.99D);
		this.boundsValid = true;
	}

	@ObfuscatedName("afi.bl()V")
	public void method1736() {
		if (this.heightValid) {
			return;
		}
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		this.height = this.minY;
		this.heightValid = true;
	}

	@ObfuscatedName("afi.aj()I")
	public int getHorizontalRadius() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		return this.horizontalRadius;
	}

	@ObfuscatedName("afi.ay()I")
	public int getRadius() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		return this.radius;
	}

	@ObfuscatedName("afi.ab()I")
	public int getMinX() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		return this.minX;
	}

	@ObfuscatedName("afi.az()I")
	public int getMaxX() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		return this.maxX;
	}

	@ObfuscatedName("afi.aa()I")
	public int getMinY() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		return this.minY;
	}

	@ObfuscatedName("afi.af()I")
	public int getMaxY() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		return this.maxY;
	}

	@ObfuscatedName("afi.ak()I")
	public int getMinZ() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		return this.minZ;
	}

	@ObfuscatedName("afi.an()I")
	public int getMaxZ() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		return this.maxZ;
	}

	@ObfuscatedName("afi.bf()I")
	public int getHeight() {
		if (!this.heightValid) {
			this.method1736();
		}
		return this.height;
	}

	@ObfuscatedName("afi.bk(I)V")
	public void method1893(int arg0) {
		if ((this.allowedOperations & 0x1000) != 4096) {
			throw new IllegalStateException();
		}
		this.field9546 = arg0;
		this.field9602 = 0;
	}

	@ObfuscatedName("afi.bh(I)V")
	public void method1738(int arg0) {
		if ((this.allowedOperations & 0x2000) != 8192) {
			throw new IllegalStateException();
		}
		this.field9600 = arg0;
		this.field9602 = 0;
	}

	@ObfuscatedName("afi.bx()I")
	public int method1862() {
		return this.field9546;
	}

	@ObfuscatedName("afi.bd()I")
	public int method1740() {
		return this.field9600;
	}

	@ObfuscatedName("afi.bc()[B")
	public byte[] method1741() {
		return this.faceAlpha;
	}

	@ObfuscatedName("afi.bi(SS)V")
	public void recolor(short arg0, short arg1) {
		for (int var3 = 0; var3 < this.faceCount; var3++) {
			if (this.faceColour[var3] == arg0) {
				this.faceColour[var3] = arg1;
			}
		}
		if (this.billboards != null) {
			for (int var4 = 0; var4 < this.billboardCount; var4++) {
				Billboard var5 = this.billboards[var4];
				BillboardPlacement var6 = this.billboardPlacements[var4];
				var6.field819 = var6.field819 & 0xFF000000 | ColourUtils.field8149[ColourUtils.method4937(this.faceColour[var5.field901]) & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.field9602 == 2) {
			this.field9602 = 1;
		}
	}

	@ObfuscatedName("afi.bn(B[B)V")
	public void method1747(byte arg0, byte[] arg1) {
		if ((this.allowedOperations & 0x100000) == 0) {
			throw new RuntimeException();
		}
		if (this.faceAlpha == null) {
			this.faceAlpha = new byte[this.faceCount];
		}
		if (arg1 == null) {
			for (int var3 = 0; var3 < this.faceCount; var3++) {
				this.faceAlpha[var3] = arg0;
			}
		} else {
			for (int var4 = 0; var4 < this.faceCount; var4++) {
				int var5 = 255 - (255 - (arg1[var4] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.faceAlpha[var4] = (byte) var5;
			}
		}
		if (this.field9602 == 2) {
			this.field9602 = 1;
		}
	}

	@ObfuscatedName("afi.bt(SS)V")
	public void retexture(short arg0, short arg1) {
		if (this.field9574 == null) {
			return;
		}
		if (!this.field9608 && arg1 >= 0) {
			Material var3 = this.renderer.materialList.get(arg1 & 0xFFFF);
			if (var3.speedU != 0.0F || var3.speedV != 0.0F) {
				this.field9608 = true;
			}
		}
		for (int var4 = 0; var4 < this.faceCount; var4++) {
			if (this.field9574[var4] == arg0) {
				this.field9574[var4] = arg1;
			}
		}
	}

	@ObfuscatedName("afi.bq(IIII)V")
	public void method1745(int arg0, int arg1, int arg2, int arg3) {
		if ((this.allowedOperations & 0x80000) != 524288) {
			throw new IllegalStateException();
		}
		for (int var5 = 0; var5 < this.faceCount; var5++) {
			int var6 = this.faceColour[var5] & 0xFFFF;
			int var7 = var6 >> 10 & 0x3F;
			int var8 = var6 >> 7 & 0x7;
			int var9 = var6 & 0x7F;
			if (arg0 != -1) {
				var7 += (arg0 - var7) * arg3 >> 7;
			}
			if (arg1 != -1) {
				var8 += (arg1 - var8) * arg3 >> 7;
			}
			if (arg2 != -1) {
				var9 += (arg2 - var9) * arg3 >> 7;
			}
			this.faceColour[var5] = (short) (var7 << 10 | var8 << 7 | var9);
		}
		if (this.billboards != null) {
			for (int var10 = 0; var10 < this.billboardCount; var10++) {
				Billboard var11 = this.billboards[var10];
				BillboardPlacement var12 = this.billboardPlacements[var10];
				var12.field819 = var12.field819 & 0xFF000000 | ColourUtils.field8149[ColourUtils.method4937(this.faceColour[var11.field901] & 0xFFFF) & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.field9602 == 2) {
			this.field9602 = 1;
		}
	}

	@ObfuscatedName("afi.bu()[Ldu;")
	public ModelParticleEmitter[] method1750() {
		return this.emitters;
	}

	@ObfuscatedName("afi.bw()[Lcq;")
	public ModelParticleEffector[] method1765() {
		return this.effectors;
	}

	@ObfuscatedName("afi.bm()Z")
	public boolean method1746() {
		if (this.field9574 == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.field9574.length; var1++) {
			if (this.field9574[var1] != -1 && !this.renderer.loadMaterialTexture(this.field9574[var1])) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("afi.bb()Z")
	public boolean method1731() {
		return this.field9548;
	}

	@ObfuscatedName("afi.be()Z")
	public boolean method1812() {
		return this.field9608;
	}
}

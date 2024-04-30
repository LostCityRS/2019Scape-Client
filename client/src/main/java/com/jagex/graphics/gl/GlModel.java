package com.jagex.graphics.gl;

import com.jagex.core.utils.GpuByteArrayUtil;
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
import jaclib.memory.Stream;
import jaggl.OpenGL;

@ObfuscatedName("afk")
public class GlModel extends Model {

	@ObfuscatedName("afk.c")
	public final GlToolkit field9626;

	@ObfuscatedName("afk.r")
	public int field9627;

	@ObfuscatedName("afk.v")
	public int field9628;

	@ObfuscatedName("afk.o")
	public byte field9629;

	@ObfuscatedName("afk.s")
	public short field9630;

	@ObfuscatedName("afk.y")
	public short field9631;

	@ObfuscatedName("afk.q")
	public boolean field9632 = false;

	@ObfuscatedName("afk.x")
	public boolean field9633 = false;

	@ObfuscatedName("afk.b")
	public int field9634 = 0;

	@ObfuscatedName("afk.h")
	public int field9635 = 0;

	@ObfuscatedName("afk.a")
	public int[] field9636;

	@ObfuscatedName("afk.g")
	public int[] field9637;

	@ObfuscatedName("afk.i")
	public int[] field9619;

	@ObfuscatedName("afk.j")
	public int[][] field9638;

	@ObfuscatedName("afk.t")
	public short[] field9640;

	@ObfuscatedName("afk.ae")
	public int field9658 = 0;

	@ObfuscatedName("afk.ag")
	public short[] field9681;

	@ObfuscatedName("afk.ah")
	public short[] field9682;

	@ObfuscatedName("afk.al")
	public short[] field9644;

	@ObfuscatedName("afk.ac")
	public byte[] field9690;

	@ObfuscatedName("afk.ai")
	public GlModelRelated1 field9684;

	@ObfuscatedName("afk.aw")
	public float[] field9647;

	@ObfuscatedName("afk.as")
	public float[] field9648;

	@ObfuscatedName("afk.at")
	public int field9670 = 0;

	@ObfuscatedName("afk.ad")
	public int field9650 = 0;

	@ObfuscatedName("afk.am")
	public short[] field9651;

	@ObfuscatedName("afk.au")
	public byte[] field9683;

	@ObfuscatedName("afk.ar")
	public short[] field9653;

	@ObfuscatedName("afk.ap")
	public short[] field9652;

	@ObfuscatedName("afk.aq")
	public short[] field9646;

	@ObfuscatedName("afk.ax")
	public short[] field9685;

	@ObfuscatedName("afk.av")
	public int[][] field9649;

	@ObfuscatedName("afk.ao")
	public short[] field9662;

	@ObfuscatedName("afk.aj")
	public GlRelated3 field9659;

	@ObfuscatedName("afk.ay")
	public GlRelated3 field9665;

	@ObfuscatedName("afk.ab")
	public GlRelated3 field9673;

	@ObfuscatedName("afk.az")
	public GlRelated3 field9664;

	@ObfuscatedName("afk.aa")
	public GlModelBindingRelated field9663;

	@ObfuscatedName("afk.af")
	public GlBinding field9654;

	@ObfuscatedName("afk.ak")
	public GlInterfaceRelated field9655;

	@ObfuscatedName("afk.an")
	public boolean field9666 = true;

	@ObfuscatedName("afk.bf")
	public int field9667;

	@ObfuscatedName("afk.bl")
	public int field9668;

	@ObfuscatedName("afk.bk")
	public boolean field9669 = false;

	@ObfuscatedName("afk.bh")
	public short field9657;

	@ObfuscatedName("afk.bx")
	public short field9674;

	@ObfuscatedName("afk.bd")
	public short field9672;

	@ObfuscatedName("afk.bc")
	public short field9643;

	@ObfuscatedName("afk.bi")
	public short field9671;

	@ObfuscatedName("afk.bn")
	public short field9675;

	@ObfuscatedName("afk.bt")
	public boolean field9676 = false;

	@ObfuscatedName("afk.bq")
	public short field9677;

	@ObfuscatedName("afk.bm")
	public int[] field9678;

	@ObfuscatedName("afk.bb")
	public int[] field9679;

	@ObfuscatedName("afk.be")
	public short[] field9680;

	@ObfuscatedName("afk.by")
	public ModelParticleEmitter[] field9687;

	@ObfuscatedName("afk.bu")
	public ModelParticleEffector[] field9641;

	@ObfuscatedName("afk.bw")
	public int field9660;

	@ObfuscatedName("afk.bo")
	public GlModelRelated2[] field9656;

	@ObfuscatedName("afk.bz")
	public GlModelRelated3[] field9639;

	@ObfuscatedName("afk.bv")
	public int[][] field9686;

	@ObfuscatedName("afk.br")
	public static long[] field9661;

	@ObfuscatedName("afk.bg")
	public static float[] field9688 = new float[2];

	@ObfuscatedName("afk.ba")
	public static final int[] field9689 = new int[8];

	@ObfuscatedName("afk.bp")
	public static final int[] field9642 = new int[8];

	@ObfuscatedName("afk.bj")
	public static final int[] field9691 = new int[8];

	@ObfuscatedName("afk.bs")
	public static int field9692;

	@ObfuscatedName("afk.cl")
	public static int field9693;

	@ObfuscatedName("afk.cg")
	public static int field9694;

	@ObfuscatedName("afk.ce")
	public static boolean field9695;

	public GlModel(GlToolkit arg0) {
		this.field9626 = arg0;
		this.field9659 = new GlRelated3(null, 5126, 3, 0);
		this.field9664 = new GlRelated3(null, 5126, 2, 0);
		this.field9673 = new GlRelated3(null, 5126, 3, 0);
		this.field9665 = new GlRelated3(null, 5121, 4, 0);
		this.field9663 = new GlModelBindingRelated();
	}

	public GlModel(GlToolkit arg0, ModelUnlit arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field9626 = arg0;
		this.field9627 = arg2;
		this.field9628 = arg5;
		if (GlModelFlags.method1178(arg2, arg5)) {
			this.field9659 = new GlRelated3(null, 5126, 3, 0);
		}
		if (GlModelFlags.method1191(arg2, arg5)) {
			this.field9664 = new GlRelated3(null, 5126, 2, 0);
		}
		if (GlModelFlags.method1146(arg2, arg5)) {
			this.field9673 = new GlRelated3(null, 5126, 3, 0);
		}
		if (GlModelFlags.method1123(arg2, arg5)) {
			this.field9665 = new GlRelated3(null, 5121, 4, 0);
		}
		if (GlModelFlags.method1139(arg2, arg5)) {
			this.field9663 = new GlModelBindingRelated();
		}
		MaterialList var7 = arg0.materialList;
		BillboardTypeList var8 = arg0.billboardList;
		int[] var9 = new int[arg1.faceCount];
		this.field9679 = new int[arg1.field1374 + 1];
		for (int var10 = 0; var10 < arg1.faceCount; var10++) {
			if (arg1.faceType == null || arg1.faceType[var10] != 2) {
				if (arg1.faceMaterial != null && arg1.faceMaterial[var10] != -1) {
					Material var11 = var7.get(arg1.faceMaterial[var10] & 0xFFFF);
					if (((this.field9628 & 0x40) == 0 || !var11.highDetail) && var11.field1361) {
						continue;
					}
				}
				int var10003 = this.field9670;
				int var10001 = this.field9670;
				this.field9670 = var10003 + 1;
				var9[var10001] = var10;
				this.field9679[arg1.faceVertex1[var10]]++;
				this.field9679[arg1.faceVertex2[var10]]++;
				this.field9679[arg1.faceVertex3[var10]]++;
			}
		}
		this.field9650 = this.field9670;
		long[] var12 = new long[this.field9670];
		boolean var13 = (this.field9627 & 0x100) != 0;
		for (int var14 = 0; var14 < this.field9670; var14++) {
			int var15 = var9[var14];
			Material var16 = null;
			int var17 = 0;
			byte var18 = 0;
			byte var19 = 0;
			byte var20 = 0;
			if (arg1.billboard != null) {
				boolean var21 = false;
				for (int var22 = 0; var22 < arg1.billboard.length; var22++) {
					ModelBillboard var23 = arg1.billboard[var22];
					if (var23.field1654 == var15) {
						BillboardType var24 = var8.get(var23.field1653);
						if (var24.field3456) {
							var21 = true;
						}
						if (var24.field3455 != -1) {
							Material var25 = var7.get(var24.field3455);
							if (MaterialAlphaMode.MULTIPLY == var25.alphaMode) {
								this.field9632 = true;
							}
						}
					}
				}
				if (var21) {
					var12[var14] = Long.MAX_VALUE;
					this.field9650--;
					continue;
				}
			}
			if (arg1.emitters != null) {
				boolean var26 = false;
				for (int var27 = 0; var27 < arg1.emitters.length; var27++) {
					ModelParticleEmitter var28 = arg1.emitters[var27];
					if (var28.field1463 == var15) {
						ParticleEmitterType var29 = this.field9626.emitterTypeList.get(var28.particle);
						if (var29.field3510) {
							var26 = true;
						}
					}
				}
				if (var26) {
					var12[var14] = Long.MAX_VALUE;
					this.field9650--;
					continue;
				}
			}
			short var30 = -1;
			if (arg1.faceMaterial != null) {
				var30 = arg1.faceMaterial[var15];
				if (var30 != -1) {
					var16 = var7.get(var30 & 0xFFFF);
					if ((this.field9628 & 0x40) != 0 && var16.highDetail) {
						var30 = -1;
						var16 = null;
					} else {
						var19 = var16.effect;
						var20 = var16.effectArg1;
						if (var16.speedU != 0.0F || var16.speedV != 0.0F) {
							this.field9633 = true;
						}
					}
				}
			}
			boolean var31 = arg1.faceTrans != null && arg1.faceTrans[var15] != 0 || var16 != null && MaterialAlphaMode.NONE != var16.alphaMode;
			if ((var13 || var31) && arg1.facePriority != null) {
				var17 += arg1.facePriority[var15] << 17;
			}
			if (var31) {
				var17 += 65536;
			}
			int var32 = ((var19 & 0xFF) << 8) + var17;
			int var33 = (var20 & 0xFF) + var32;
			int var34 = ((var30 & 0xFFFF) << 16) + var18;
			int var35 = (var14 & 0xFFFF) + var34;
			var12[var14] = ((long) var33 << 32) + (long) var35;
			this.field9632 |= var31;
			this.field9633 |= var16 != null && (var16.speedU != 0.0F || var16.speedV != 0.0F);
		}
		Algorithms.quicksortParallel(var12, var9);
		this.field9634 = arg1.vertexCount;
		this.field9635 = arg1.field1374;
		this.field9636 = arg1.vertexX;
		this.field9637 = arg1.vertexY;
		this.field9619 = arg1.vertexZ;
		this.field9640 = arg1.vertexSourceModels;
		GlVertexNormal[] var36 = new GlVertexNormal[this.field9635];
		this.field9687 = arg1.emitters;
		this.field9641 = arg1.effectors;
		if (arg1.billboard != null) {
			this.field9660 = arg1.billboard.length;
			this.field9656 = new GlModelRelated2[this.field9660];
			this.field9639 = new GlModelRelated3[this.field9660];
			for (int var37 = 0; var37 < this.field9660; var37++) {
				ModelBillboard var38 = arg1.billboard[var37];
				BillboardType var39 = var8.get(var38.field1653);
				int var40 = -1;
				for (int var41 = 0; var41 < this.field9670; var41++) {
					if (var38.field1654 == var9[var41]) {
						var40 = var41;
						break;
					}
				}
				if (var40 == -1) {
					throw new RuntimeException();
				}
				int var42 = ColourUtils.field8151[arg1.faceColour[var38.field1654] & 0xFFFF] & 0xFFFFFF;
				int var43 = var42 | 255 - (arg1.faceTrans == null ? 0 : arg1.faceTrans[var38.field1654]) << 24;
				this.field9656[var37] = new GlModelRelated2(var40, arg1.faceVertex1[var38.field1654], arg1.faceVertex2[var38.field1654], arg1.faceVertex3[var38.field1654], var39.field3451, var39.field3452, var39.field3455, var39.field3450, var39.field3453, var39.field3456, var39.field3449, var38.field1656);
				this.field9639[var37] = new GlModelRelated3(var43);
			}
		}
		int var44 = this.field9670 * 3;
		this.field9681 = new short[var44];
		this.field9682 = new short[var44];
		this.field9644 = new short[var44];
		this.field9690 = new byte[var44];
		this.field9647 = new float[var44];
		this.field9648 = new float[var44];
		this.field9651 = new short[this.field9670];
		this.field9683 = new byte[this.field9670];
		this.field9653 = new short[this.field9670];
		this.field9652 = new short[this.field9670];
		this.field9646 = new short[this.field9670];
		this.field9685 = new short[this.field9670];
		if (arg1.field1399 != null) {
			this.field9662 = new short[this.field9670];
		}
		this.field9630 = (short) arg3;
		this.field9631 = (short) arg4;
		this.field9680 = new short[var44];
		field9661 = new long[var44];
		int var45 = 0;
		for (int var46 = 0; var46 < arg1.field1374; var46++) {
			int var47 = this.field9679[var46];
			this.field9679[var46] = var45;
			var45 += var47;
			var36[var46] = new GlVertexNormal();
		}
		this.field9679[arg1.field1374] = var45;
		ModelRelated1 var48 = this.method1687(arg1, var9, this.field9670);
		TriangleNormal[] var49 = new TriangleNormal[arg1.faceCount];
		for (int var50 = 0; var50 < arg1.faceCount; var50++) {
			short var51 = arg1.faceVertex1[var50];
			short var52 = arg1.faceVertex2[var50];
			short var53 = arg1.faceVertex3[var50];
			int var54 = this.field9636[var52] - this.field9636[var51];
			int var55 = this.field9637[var52] - this.field9637[var51];
			int var56 = this.field9619[var52] - this.field9619[var51];
			int var57 = this.field9636[var53] - this.field9636[var51];
			int var58 = this.field9637[var53] - this.field9637[var51];
			int var59 = this.field9619[var53] - this.field9619[var51];
			int var60 = var55 * var59 - var56 * var58;
			int var61 = var56 * var57 - var54 * var59;
			int var62;
			for (var62 = var54 * var58 - var55 * var57; var60 > 8192 || var61 > 8192 || var62 > 8192 || var60 < -8192 || var61 < -8192 || var62 < -8192; var62 >>= 0x1) {
				var60 >>= 0x1;
				var61 >>= 0x1;
			}
			int var63 = (int) Math.sqrt((double) (var62 * var62 + var60 * var60 + var61 * var61));
			if (var63 <= 0) {
				var63 = 1;
			}
			int var64 = var60 * 256 / var63;
			int var65 = var61 * 256 / var63;
			int var66 = var62 * 256 / var63;
			byte var67 = arg1.faceType == null ? 0 : arg1.faceType[var50];
			if (var67 == 0) {
				GlVertexNormal var68 = var36[var51];
				var68.field1115 += var64;
				var68.field1114 += var65;
				var68.field1116 += var66;
				var68.field1117++;
				GlVertexNormal var69 = var36[var52];
				var69.field1115 += var64;
				var69.field1114 += var65;
				var69.field1116 += var66;
				var69.field1117++;
				GlVertexNormal var70 = var36[var53];
				var70.field1115 += var64;
				var70.field1114 += var65;
				var70.field1116 += var66;
				var70.field1117++;
			} else if (var67 == 1) {
				TriangleNormal var71 = var49[var50] = new TriangleNormal();
				var71.field1035 = var64;
				var71.field1033 = var65;
				var71.field1034 = var66;
			}
		}
		for (int var72 = 0; var72 < this.field9670; var72++) {
			int var73 = var9[var72];
			int var74 = arg1.faceColour[var73] & 0xFFFF;
			int var75 = arg1.faceTrans == null ? 0 : arg1.faceTrans[var73] & 0xFF;
			short var76 = arg1.faceMaterial == null ? -1 : arg1.faceMaterial[var73];
			if (var76 != -1 && (this.field9628 & 0x40) != 0 && var7.get(var76).highDetail) {
				var76 = -1;
			}
			float var77 = 0.0F;
			float var78 = 0.0F;
			float var79 = 0.0F;
			float var80 = 0.0F;
			float var81 = 0.0F;
			float var82 = 0.0F;
			long var88;
			long var91;
			long var94;
			if (var76 == -1) {
				var94 = 0L;
				var91 = 0L;
				var88 = 0L;
			} else {
				short var83 = arg1.faceMapping == null ? -1 : arg1.faceMapping[var73];
				if (var83 == 32766) {
					int var84 = arg1.faceTextureVertexOffset1[var73] & 0xFF;
					int var85 = arg1.faceTextureVertexOffset2[var73] & 0xFF;
					int var86 = arg1.faceTextureVertexOffset3[var73] & 0xFF;
					int var87 = arg1.vertexTextureVertex[arg1.faceVertex1[var73]] + var84;
					var88 = var87;
					int var90 = arg1.vertexTextureVertex[arg1.faceVertex2[var73]] + var85;
					var91 = var87;
					int var93 = arg1.vertexTextureVertex[arg1.faceVertex3[var73]] + var86;
					var94 = var87;
					var77 = arg1.textureVertexU[var87];
					var78 = arg1.textureVertexV[var87];
					var79 = arg1.textureVertexU[var90];
					var80 = arg1.textureVertexV[var90];
					var81 = arg1.textureVertexU[var93];
					var82 = arg1.textureVertexV[var93];
				} else if (var83 == -1) {
					var77 = 0.0F;
					var78 = 1.0F;
					var88 = 65535L;
					var79 = 1.0F;
					var80 = 1.0F;
					var91 = 131071L;
					var81 = 0.0F;
					var82 = 0.0F;
					var94 = 196607L;
				} else {
					int var96 = var83 & 0xFFFF;
					int var97 = 0;
					byte var98 = 0;
					byte var99 = 0;
					byte var100 = arg1.textureTriangleType[var96];
					if (var100 == 0) {
						short var101 = arg1.faceVertex1[var73];
						short var102 = arg1.faceVertex2[var73];
						short var103 = arg1.faceVertex3[var73];
						short var104 = arg1.textureTriangleVertex1[var96];
						short var105 = arg1.textureTriangleVertex2[var96];
						short var106 = arg1.textureTriangleVertex3[var96];
						float var107 = (float) arg1.vertexX[var104];
						float var108 = (float) arg1.vertexY[var104];
						float var109 = (float) arg1.vertexZ[var104];
						float var110 = (float) arg1.vertexX[var105] - var107;
						float var111 = (float) arg1.vertexY[var105] - var108;
						float var112 = (float) arg1.vertexZ[var105] - var109;
						float var113 = (float) arg1.vertexX[var106] - var107;
						float var114 = (float) arg1.vertexY[var106] - var108;
						float var115 = (float) arg1.vertexZ[var106] - var109;
						float var116 = (float) arg1.vertexX[var101] - var107;
						float var117 = (float) arg1.vertexY[var101] - var108;
						float var118 = (float) arg1.vertexZ[var101] - var109;
						float var119 = (float) arg1.vertexX[var102] - var107;
						float var120 = (float) arg1.vertexY[var102] - var108;
						float var121 = (float) arg1.vertexZ[var102] - var109;
						float var122 = (float) arg1.vertexX[var103] - var107;
						float var123 = (float) arg1.vertexY[var103] - var108;
						float var124 = (float) arg1.vertexZ[var103] - var109;
						float var125 = var111 * var115 - var112 * var114;
						float var126 = var112 * var113 - var110 * var115;
						float var127 = var110 * var114 - var111 * var113;
						float var128 = var114 * var127 - var115 * var126;
						float var129 = var115 * var125 - var113 * var127;
						float var130 = var113 * var126 - var114 * var125;
						float var131 = 1.0F / (var112 * var130 + var110 * var128 + var111 * var129);
						var77 = (var118 * var130 + var116 * var128 + var117 * var129) * var131;
						var79 = (var121 * var130 + var119 * var128 + var120 * var129) * var131;
						var81 = (var124 * var130 + var122 * var128 + var123 * var129) * var131;
						float var132 = var111 * var127 - var112 * var126;
						float var133 = var112 * var125 - var110 * var127;
						float var134 = var110 * var126 - var111 * var125;
						float var135 = 1.0F / (var115 * var134 + var113 * var132 + var114 * var133);
						var78 = (var118 * var134 + var116 * var132 + var117 * var133) * var135;
						var80 = (var121 * var134 + var119 * var132 + var120 * var133) * var135;
						var82 = (var124 * var134 + var122 * var132 + var123 * var133) * var135;
					} else {
						short var136 = arg1.faceVertex1[var73];
						short var137 = arg1.faceVertex2[var73];
						short var138 = arg1.faceVertex3[var73];
						int var139 = var48.field1688[var96];
						int var140 = var48.field1690[var96];
						int var141 = var48.field1689[var96];
						float[] var142 = var48.field1691[var96];
						byte var143 = arg1.textureTriangleDirection[var96];
						float var144 = (float) arg1.textureTriangleSpeed[var96] / 256.0F;
						if (var100 == 1) {
							float var145 = (float) arg1.textureTriangleScaleZ[var96] / 1024.0F;
							method1684(arg1.vertexX[var136], arg1.vertexY[var136], arg1.vertexZ[var136], var139, var140, var141, var142, var145, var143, var144, field9688);
							var77 = field9688[0];
							var78 = field9688[1];
							method1684(arg1.vertexX[var137], arg1.vertexY[var137], arg1.vertexZ[var137], var139, var140, var141, var142, var145, var143, var144, field9688);
							var79 = field9688[0];
							var80 = field9688[1];
							method1684(arg1.vertexX[var138], arg1.vertexY[var138], arg1.vertexZ[var138], var139, var140, var141, var142, var145, var143, var144, field9688);
							var81 = field9688[0];
							var82 = field9688[1];
							float var146 = var145 / 2.0F;
							if ((var143 & 0x1) == 0) {
								if (var79 - var77 > var146) {
									var79 -= var145;
									var98 = 1;
								} else if (var77 - var79 > var146) {
									var79 += var145;
									var98 = 2;
								}
								if (var81 - var77 > var146) {
									var81 -= var145;
									var99 = 1;
								} else if (var77 - var81 > var146) {
									var81 += var145;
									var99 = 2;
								}
							} else {
								if (var80 - var78 > var146) {
									var80 -= var145;
									var98 = 1;
								} else if (var78 - var80 > var146) {
									var80 += var145;
									var98 = 2;
								}
								if (var82 - var78 > var146) {
									var82 -= var145;
									var99 = 1;
								} else if (var78 - var82 > var146) {
									var82 += var145;
									var99 = 2;
								}
							}
						} else if (var100 == 2) {
							float var147 = (float) arg1.textureTriangleTranslationU[var96] / 256.0F;
							float var148 = (float) arg1.textureTriangleTranslationV[var96] / 256.0F;
							int var149 = arg1.vertexX[var137] - arg1.vertexX[var136];
							int var150 = arg1.vertexY[var137] - arg1.vertexY[var136];
							int var151 = arg1.vertexZ[var137] - arg1.vertexZ[var136];
							int var152 = arg1.vertexX[var138] - arg1.vertexX[var136];
							int var153 = arg1.vertexY[var138] - arg1.vertexY[var136];
							int var154 = arg1.vertexZ[var138] - arg1.vertexZ[var136];
							int var155 = var150 * var154 - var151 * var153;
							int var156 = var151 * var152 - var149 * var154;
							int var157 = var149 * var153 - var150 * var152;
							float var158 = 64.0F / (float) arg1.textureTriangleScaleX[var96];
							float var159 = 64.0F / (float) arg1.textureTriangleScaleY[var96];
							float var160 = 64.0F / (float) arg1.textureTriangleScaleZ[var96];
							float var161 = (var142[2] * (float) var157 + var142[0] * (float) var155 + var142[1] * (float) var156) / var158;
							float var162 = (var142[5] * (float) var157 + var142[3] * (float) var155 + var142[4] * (float) var156) / var159;
							float var163 = (var142[8] * (float) var157 + var142[6] * (float) var155 + var142[7] * (float) var156) / var160;
							var97 = method1685(var161, var162, var163);
							method1708(arg1.vertexX[var136], arg1.vertexY[var136], arg1.vertexZ[var136], var139, var140, var141, var97, var142, var143, var144, var147, var148, field9688);
							var77 = field9688[0];
							var78 = field9688[1];
							method1708(arg1.vertexX[var137], arg1.vertexY[var137], arg1.vertexZ[var137], var139, var140, var141, var97, var142, var143, var144, var147, var148, field9688);
							var79 = field9688[0];
							var80 = field9688[1];
							method1708(arg1.vertexX[var138], arg1.vertexY[var138], arg1.vertexZ[var138], var139, var140, var141, var97, var142, var143, var144, var147, var148, field9688);
							var81 = field9688[0];
							var82 = field9688[1];
						} else if (var100 == 3) {
							method1753(arg1.vertexX[var136], arg1.vertexY[var136], arg1.vertexZ[var136], var139, var140, var141, var142, var143, var144, field9688);
							var77 = field9688[0];
							var78 = field9688[1];
							method1753(arg1.vertexX[var137], arg1.vertexY[var137], arg1.vertexZ[var137], var139, var140, var141, var142, var143, var144, field9688);
							var79 = field9688[0];
							var80 = field9688[1];
							method1753(arg1.vertexX[var138], arg1.vertexY[var138], arg1.vertexZ[var138], var139, var140, var141, var142, var143, var144, field9688);
							var81 = field9688[0];
							var82 = field9688[1];
							if ((var143 & 0x1) == 0) {
								if (var79 - var77 > 0.5F) {
									var79--;
									var98 = 1;
								} else if (var77 - var79 > 0.5F) {
									var79++;
									var98 = 2;
								}
								if (var81 - var77 > 0.5F) {
									var81--;
									var99 = 1;
								} else if (var77 - var81 > 0.5F) {
									var81++;
									var99 = 2;
								}
							} else {
								if (var80 - var78 > 0.5F) {
									var80--;
									var98 = 1;
								} else if (var78 - var80 > 0.5F) {
									var80++;
									var98 = 2;
								}
								if (var82 - var78 > 0.5F) {
									var82--;
									var99 = 1;
								} else if (var78 - var82 > 0.5F) {
									var82++;
									var99 = 2;
								}
							}
						}
					}
					var88 = var97 << 16 | var96;
					var91 = (long) (var98 << 19) | var88;
					var94 = (long) (var99 << 19) | var88;
				}
			}
			byte var164 = arg1.faceType == null ? 0 : arg1.faceType[var73];
			if (var164 == 0) {
				long var165 = (long) ((var74 << 8) + var75);
				short var167 = arg1.faceVertex1[var73];
				short var168 = arg1.faceVertex2[var73];
				short var169 = arg1.faceVertex3[var73];
				GlVertexNormal var170 = var36[var167];
				this.field9653[var72] = this.method15568(arg1, var167, var165 | var88 << 24, var170.field1115, var170.field1114, var170.field1116, var170.field1117, var77, var78);
				GlVertexNormal var171 = var36[var168];
				this.field9652[var72] = this.method15568(arg1, var168, var165 | var91 << 24, var171.field1115, var171.field1114, var171.field1116, var171.field1117, var79, var80);
				GlVertexNormal var172 = var36[var169];
				this.field9646[var72] = this.method15568(arg1, var169, var165 | var94 << 24, var172.field1115, var172.field1114, var172.field1116, var172.field1117, var81, var82);
			} else if (var164 == 1) {
				TriangleNormal var173 = var49[var73];
				long var174 = ((long) (var173.field1034 + 256) << 24) + ((long) (var173.field1035 & Integer.MIN_VALUE) << 9) + ((long) (var173.field1033 + 256) << 32) + (long) (var74 << 8) + (long) var75;
				this.field9653[var72] = this.method15568(arg1, arg1.faceVertex1[var73], var174 | var88 << 41, var173.field1035, var173.field1033, var173.field1034, 0, var77, var78);
				this.field9652[var72] = this.method15568(arg1, arg1.faceVertex2[var73], var174 | var88 << 41, var173.field1035, var173.field1033, var173.field1034, 0, var79, var80);
				this.field9646[var72] = this.method15568(arg1, arg1.faceVertex3[var73], var174 | var88 << 41, var173.field1035, var173.field1033, var173.field1034, 0, var81, var82);
			}
			if (arg1.faceTrans != null) {
				this.field9683[var72] = arg1.faceTrans[var73];
			}
			if (arg1.field1399 != null) {
				this.field9662[var72] = arg1.field1399[var73];
			}
			this.field9651[var72] = arg1.faceColour[var73];
			this.field9685[var72] = var76;
		}
		int var176 = 0;
		short var177 = -10000;
		for (int var178 = 0; var178 < this.field9650; var178++) {
			short var179 = this.field9685[var178];
			if (var177 != var179) {
				var176++;
				var177 = var179;
			}
		}
		this.field9678 = new int[var176 + 1];
		int var180 = 0;
		short var181 = -10000;
		for (int var182 = 0; var182 < this.field9650; var182++) {
			short var183 = this.field9685[var182];
			if (var181 != var183) {
				this.field9678[var180++] = var182;
				var181 = var183;
			}
		}
		this.field9678[var180] = this.field9650;
		field9661 = null;
		this.field9681 = method15569(this.field9681, this.field9658);
		this.field9682 = method15569(this.field9682, this.field9658);
		this.field9644 = method15569(this.field9644, this.field9658);
		this.field9690 = method15565(this.field9690, this.field9658);
		this.field9647 = method15571(this.field9647, this.field9658);
		this.field9648 = method15571(this.field9648, this.field9658);
		if (arg1.vertexLabel != null && GlModelFlags.method1153(arg2, this.field9628)) {
			this.field9638 = arg1.method1940(false);
		}
		if (arg1.billboard != null && GlModelFlags.method1154(arg2, this.field9628)) {
			this.field9686 = arg1.method1963();
		}
		if (arg1.faceLabel != null && GlModelFlags.method1152(arg2, this.field9628)) {
			int var184 = 0;
			int[] var185 = new int[256];
			for (int var186 = 0; var186 < this.field9670; var186++) {
				int var187 = arg1.faceLabel[var9[var186]];
				if (var187 >= 0) {
					int var10002 = var185[var187]++;
					if (var187 > var184) {
						var184 = var187;
					}
				}
			}
			this.field9649 = new int[var184 + 1][];
			for (int var188 = 0; var188 <= var184; var188++) {
				this.field9649[var188] = new int[var185[var188]];
				var185[var188] = 0;
			}
			for (int var189 = 0; var189 < this.field9670; var189++) {
				int var190 = arg1.faceLabel[var9[var189]];
				if (var190 >= 0) {
					this.field9649[var190][var185[var190]++] = var189;
				}
			}
		}
	}

	@ObfuscatedName("afk.hb(Ldq;IJIIIIFF)S")
	public short method15568(ModelUnlit arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
		int var11 = this.field9679[arg1];
		int var12 = this.field9679[arg1 + 1];
		int var13 = 0;
		for (int var14 = var11; var14 < var12; var14++) {
			if (this.field9680[var14] == 0) {
				var13 = var14;
				break;
			}
			int var15 = (this.field9680[var14] & 0xFFFF) - 1;
			if (field9661[var14] == arg2) {
				return (short) var15;
			}
		}
		this.field9680[var13] = (short) (this.field9658 + 1);
		field9661[var13] = arg2;
		this.field9681[this.field9658] = (short) arg3;
		this.field9682[this.field9658] = (short) arg4;
		this.field9644[this.field9658] = (short) arg5;
		this.field9690[this.field9658] = (byte) arg6;
		this.field9647[this.field9658] = arg7;
		this.field9648[this.field9658] = arg8;
		return (short) this.field9658++;
	}

	@ObfuscatedName("afk.hg([BI)[B")
	public static byte[] method15565(byte[] arg0, int arg1) {
		byte[] var2 = new byte[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	@ObfuscatedName("afk.hd([SI)[S")
	public static short[] method15569(short[] arg0, int arg1) {
		short[] var2 = new short[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	@ObfuscatedName("afk.hx([FI)[F")
	public static float[] method15571(float[] arg0, int arg1) {
		float[] var2 = new float[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	@ObfuscatedName("afk.z()I")
	public int method1691() {
		return this.field9627;
	}

	@ObfuscatedName("afk.u(I)V")
	public void method1690(int arg0) {
		this.field9627 = arg0;
		if (this.field9684 != null && (this.field9627 & 0x10000) == 0) {
			this.field9681 = this.field9684.field1191;
			this.field9682 = this.field9684.field1189;
			this.field9644 = this.field9684.field1188;
			this.field9690 = this.field9684.field1190;
			this.field9684 = null;
		}
		this.field9666 = true;
		this.method15551();
	}

	@ObfuscatedName("afk.p()V")
	public void method1816() {
		if (this.field9658 <= 0 || this.field9650 <= 0) {
			return;
		}
		this.method15558(false);
		if ((this.field9629 & 0x10) == 0 && this.field9663.field1109 == null) {
			this.method15553(false);
		}
		this.method15551();
	}

	@ObfuscatedName("afk.l(BIZ)Ldo;")
	public Model method1773(byte arg0, int arg1, boolean arg2) {
		boolean var4 = false;
		GlModel var5;
		GlModel var6;
		if (arg0 > 0 && arg0 <= 8) {
			var5 = this.field9626.field10009[arg0 - 1];
			var6 = this.field9626.field10008[arg0 - 1];
			var4 = true;
		} else {
			var6 = var5 = new GlModel(this.field9626);
		}
		return this.method15550(var6, var5, arg1, var4, arg2);
	}

	@ObfuscatedName("afk.hq(Lafk;Lafk;IZZ)Ldo;")
	public Model method15550(GlModel arg0, GlModel arg1, int arg2, boolean arg3, boolean arg4) {
		arg0.field9629 = 0;
		arg0.field9627 = arg2;
		arg0.field9628 = this.field9628;
		arg0.field9630 = this.field9630;
		arg0.field9631 = this.field9631;
		arg0.field9634 = this.field9634;
		arg0.field9635 = this.field9635;
		arg0.field9658 = this.field9658;
		arg0.field9670 = this.field9670;
		arg0.field9650 = this.field9650;
		arg0.field9660 = this.field9660;
		if ((arg2 & 0x100) == 0) {
			arg0.field9632 = this.field9632;
		} else {
			arg0.field9632 = true;
		}
		arg0.field9633 = this.field9633;
		boolean var6 = GlModelFlags.method1124(arg2, this.field9628);
		boolean var7 = GlModelFlags.method1125(arg2, this.field9628);
		boolean var8 = GlModelFlags.method1126(arg2, this.field9628);
		boolean var9 = var6 | var7 | var8;
		if (var9) {
			if (!var6) {
				arg0.field9636 = this.field9636;
			} else if (arg1.field9636 == null || arg1.field9636.length < this.field9634) {
				arg0.field9636 = arg1.field9636 = new int[this.field9634];
			} else {
				arg0.field9636 = arg1.field9636;
			}
			if (!var7) {
				arg0.field9637 = this.field9637;
			} else if (arg1.field9637 == null || arg1.field9637.length < this.field9634) {
				arg0.field9637 = arg1.field9637 = new int[this.field9634];
			} else {
				arg0.field9637 = arg1.field9637;
			}
			if (!var8) {
				arg0.field9619 = this.field9619;
			} else if (arg1.field9619 == null || arg1.field9619.length < this.field9634) {
				arg0.field9619 = arg1.field9619 = new int[this.field9634];
			} else {
				arg0.field9619 = arg1.field9619;
			}
			for (int var10 = 0; var10 < this.field9634; var10++) {
				if (var6) {
					arg0.field9636[var10] = this.field9636[var10];
				}
				if (var7) {
					arg0.field9637[var10] = this.field9637[var10];
				}
				if (var8) {
					arg0.field9619[var10] = this.field9619[var10];
				}
			}
		} else {
			arg0.field9636 = this.field9636;
			arg0.field9637 = this.field9637;
			arg0.field9619 = this.field9619;
		}
		if (GlModelFlags.method1140(arg2, this.field9628)) {
			if (arg3) {
				arg0.field9629 = (byte) (arg0.field9629 | 0x1);
			}
			arg0.field9659 = arg1.field9659;
			arg0.field9659.field1112 = this.field9659.field1112;
			arg0.field9659.field1111 = this.field9659.field1111;
		} else if (GlModelFlags.method1178(arg2, this.field9628)) {
			arg0.field9659 = this.field9659;
		} else {
			arg0.field9659 = null;
		}
		if (GlModelFlags.method1129(arg2, this.field9628)) {
			if (arg1.field9651 == null || arg1.field9651.length < this.field9670) {
				arg0.field9651 = arg1.field9651 = new short[this.field9670];
			} else {
				arg0.field9651 = arg1.field9651;
			}
			for (int var11 = 0; var11 < this.field9670; var11++) {
				arg0.field9651[var11] = this.field9651[var11];
			}
		} else {
			arg0.field9651 = this.field9651;
		}
		if (GlModelFlags.method1200(arg2, this.field9628)) {
			if (arg1.field9683 == null || arg1.field9683.length < this.field9670) {
				arg0.field9683 = arg1.field9683 = new byte[this.field9670];
			} else {
				arg0.field9683 = arg1.field9683;
			}
			for (int var12 = 0; var12 < this.field9670; var12++) {
				arg0.field9683[var12] = this.field9683[var12];
			}
		} else {
			arg0.field9683 = this.field9683;
		}
		if (GlModelFlags.method1142(arg2, this.field9628)) {
			if (arg3) {
				arg0.field9629 = (byte) (arg0.field9629 | 0x2);
			}
			arg0.field9665 = arg1.field9665;
			arg0.field9665.field1112 = this.field9665.field1112;
			arg0.field9665.field1111 = this.field9665.field1111;
		} else if (GlModelFlags.method1123(arg2, this.field9628)) {
			arg0.field9665 = this.field9665;
		} else {
			arg0.field9665 = null;
		}
		if (GlModelFlags.method1128(arg2, this.field9628)) {
			if (arg1.field9681 == null || arg1.field9681.length < this.field9658) {
				int var13 = this.field9658;
				arg0.field9681 = arg1.field9681 = new short[var13];
				arg0.field9682 = arg1.field9682 = new short[var13];
				arg0.field9644 = arg1.field9644 = new short[var13];
			} else {
				arg0.field9681 = arg1.field9681;
				arg0.field9682 = arg1.field9682;
				arg0.field9644 = arg1.field9644;
			}
			if (this.field9684 == null) {
				for (int var17 = 0; var17 < this.field9658; var17++) {
					arg0.field9681[var17] = this.field9681[var17];
					arg0.field9682[var17] = this.field9682[var17];
					arg0.field9644[var17] = this.field9644[var17];
				}
			} else {
				if (arg1.field9684 == null) {
					arg1.field9684 = new GlModelRelated1();
				}
				GlModelRelated1 var14 = arg0.field9684 = arg1.field9684;
				if (var14.field1191 == null || var14.field1191.length < this.field9658) {
					int var15 = this.field9658;
					var14.field1191 = new short[var15];
					var14.field1189 = new short[var15];
					var14.field1188 = new short[var15];
					var14.field1190 = new byte[var15];
				}
				for (int var16 = 0; var16 < this.field9658; var16++) {
					arg0.field9681[var16] = this.field9681[var16];
					arg0.field9682[var16] = this.field9682[var16];
					arg0.field9644[var16] = this.field9644[var16];
					var14.field1191[var16] = this.field9684.field1191[var16];
					var14.field1189[var16] = this.field9684.field1189[var16];
					var14.field1188[var16] = this.field9684.field1188[var16];
					var14.field1190[var16] = this.field9684.field1190[var16];
				}
			}
			arg0.field9690 = this.field9690;
		} else {
			arg0.field9684 = this.field9684;
			arg0.field9681 = this.field9681;
			arg0.field9682 = this.field9682;
			arg0.field9644 = this.field9644;
			arg0.field9690 = this.field9690;
		}
		if (GlModelFlags.method1171(arg2, this.field9628)) {
			if (arg3) {
				arg0.field9629 = (byte) (arg0.field9629 | 0x4);
			}
			arg0.field9673 = arg1.field9673;
			arg0.field9673.field1112 = this.field9673.field1112;
			arg0.field9673.field1111 = this.field9673.field1111;
		} else if (GlModelFlags.method1146(arg2, this.field9628)) {
			arg0.field9673 = this.field9673;
		} else {
			arg0.field9673 = null;
		}
		if (GlModelFlags.method1131(arg2, this.field9628)) {
			if (arg1.field9647 == null || arg1.field9647.length < this.field9670) {
				int var18 = this.field9658;
				arg0.field9647 = arg1.field9647 = new float[var18];
				arg0.field9648 = arg1.field9648 = new float[var18];
			} else {
				arg0.field9647 = arg1.field9647;
				arg0.field9648 = arg1.field9648;
			}
			for (int var19 = 0; var19 < this.field9658; var19++) {
				arg0.field9647[var19] = this.field9647[var19];
				arg0.field9648[var19] = this.field9648[var19];
			}
		} else {
			arg0.field9647 = this.field9647;
			arg0.field9648 = this.field9648;
		}
		if (GlModelFlags.method1226(arg2, this.field9628)) {
			if (arg3) {
				arg0.field9629 = (byte) (arg0.field9629 | 0x8);
			}
			arg0.field9664 = arg1.field9664;
			arg0.field9664.field1112 = this.field9664.field1112;
			arg0.field9664.field1111 = this.field9664.field1111;
		} else if (GlModelFlags.method1191(arg2, this.field9628)) {
			arg0.field9664 = this.field9664;
		} else {
			arg0.field9664 = null;
		}
		if (GlModelFlags.method1132(arg2, this.field9628)) {
			if (arg1.field9653 == null || arg1.field9653.length < this.field9670) {
				int var20 = this.field9670;
				arg0.field9653 = arg1.field9653 = new short[var20];
				arg0.field9652 = arg1.field9652 = new short[var20];
				arg0.field9646 = arg1.field9646 = new short[var20];
			} else {
				arg0.field9653 = arg1.field9653;
				arg0.field9652 = arg1.field9652;
				arg0.field9646 = arg1.field9646;
			}
			for (int var21 = 0; var21 < this.field9670; var21++) {
				arg0.field9653[var21] = this.field9653[var21];
				arg0.field9652[var21] = this.field9652[var21];
				arg0.field9646[var21] = this.field9646[var21];
			}
		} else {
			arg0.field9653 = this.field9653;
			arg0.field9652 = this.field9652;
			arg0.field9646 = this.field9646;
		}
		if (GlModelFlags.method1144(arg2, this.field9628)) {
			if (arg3) {
				arg0.field9629 = (byte) (arg0.field9629 | 0x10);
			}
			arg0.field9663 = arg1.field9663;
			arg0.field9663.field1109 = this.field9663.field1109;
		} else if (GlModelFlags.method1139(arg2, this.field9628)) {
			arg0.field9663 = this.field9663;
		} else {
			arg0.field9663 = null;
		}
		if (GlModelFlags.method1137(arg2, this.field9628)) {
			if (arg1.field9685 == null || arg1.field9685.length < this.field9670) {
				int var22 = this.field9670;
				arg0.field9685 = arg1.field9685 = new short[var22];
			} else {
				arg0.field9685 = arg1.field9685;
			}
			for (int var23 = 0; var23 < this.field9670; var23++) {
				arg0.field9685[var23] = this.field9685[var23];
			}
		} else {
			arg0.field9685 = this.field9685;
		}
		if (!GlModelFlags.method1134(arg2, this.field9628)) {
			arg0.field9639 = this.field9639;
		} else if (arg1.field9639 == null || arg1.field9639.length < this.field9660) {
			int var25 = this.field9660;
			arg0.field9639 = arg1.field9639 = new GlModelRelated3[var25];
			for (int var26 = 0; var26 < this.field9660; var26++) {
				arg0.field9639[var26] = this.field9639[var26].method1299();
			}
		} else {
			arg0.field9639 = arg1.field9639;
			for (int var24 = 0; var24 < this.field9660; var24++) {
				arg0.field9639[var24].method1298(this.field9639[var24]);
			}
		}
		arg0.field9656 = this.field9656;
		if (this.field9669) {
			arg0.field9667 = this.field9667;
			arg0.field9668 = this.field9668;
			arg0.field9672 = this.field9672;
			arg0.field9643 = this.field9643;
			arg0.field9657 = this.field9657;
			arg0.field9674 = this.field9674;
			arg0.field9671 = this.field9671;
			arg0.field9675 = this.field9675;
			arg0.field9669 = true;
		} else {
			arg0.field9669 = false;
		}
		if (this.field9676) {
			arg0.field9677 = this.field9677;
			arg0.field9676 = true;
		} else {
			arg0.field9676 = false;
		}
		arg0.field9638 = this.field9638;
		arg0.field9649 = this.field9649;
		arg0.field9686 = this.field9686;
		arg0.field9680 = this.field9680;
		arg0.field9679 = this.field9679;
		arg0.field9640 = this.field9640;
		arg0.field9662 = this.field9662;
		arg0.field9678 = this.field9678;
		arg0.field9687 = this.field9687;
		arg0.field9641 = this.field9641;
		return arg0;
	}

	@ObfuscatedName("afk.hf()V")
	public void method15551() {
		if (!this.field9666) {
			return;
		}
		this.field9666 = false;
		if (this.field9687 == null && this.field9641 == null && this.field9656 == null && !GlModelFlags.method1127(this.field9627, this.field9628)) {
			boolean var1 = false;
			boolean var2 = false;
			boolean var3 = false;
			if (this.field9636 != null && !GlModelFlags.method1206(this.field9627, this.field9628)) {
				if (this.field9659 != null && this.field9659.field1111 == null) {
					this.field9666 = true;
				} else {
					if (!this.field9669) {
						this.method15552();
					}
					var1 = true;
				}
			}
			if (this.field9637 != null && !GlModelFlags.method1141(this.field9627, this.field9628)) {
				if (this.field9659 != null && this.field9659.field1111 == null) {
					this.field9666 = true;
				} else {
					if (!this.field9669) {
						this.method15552();
					}
					var2 = true;
				}
			}
			if (this.field9619 != null && !GlModelFlags.method1147(this.field9627, this.field9628)) {
				if (this.field9659 != null && this.field9659.field1111 == null) {
					this.field9666 = true;
				} else {
					if (!this.field9669) {
						this.method15552();
					}
					var3 = true;
				}
			}
			if (var1) {
				this.field9636 = null;
			}
			if (var2) {
				this.field9637 = null;
			}
			if (var3) {
				this.field9619 = null;
			}
		}
		if (this.field9680 != null && this.field9636 == null && this.field9637 == null && this.field9619 == null) {
			this.field9680 = null;
			this.field9679 = null;
		}
		if (this.field9690 != null && !GlModelFlags.method1148(this.field9627, this.field9628)) {
			if (this.field9673 == null) {
				if (this.field9665 != null && this.field9665.field1111 == null) {
					this.field9666 = true;
				} else {
					this.field9644 = null;
					this.field9682 = null;
					this.field9681 = null;
					this.field9690 = null;
				}
			} else if (this.field9673.field1111 == null) {
				this.field9666 = true;
			} else {
				this.field9644 = null;
				this.field9682 = null;
				this.field9681 = null;
				this.field9690 = null;
			}
		}
		if (this.field9651 != null && !GlModelFlags.method1149(this.field9627, this.field9628)) {
			if (this.field9665 != null && this.field9665.field1111 == null) {
				this.field9666 = true;
			} else {
				this.field9651 = null;
			}
		}
		if (this.field9683 != null && !GlModelFlags.method1150(this.field9627, this.field9628)) {
			if (this.field9665 != null && this.field9665.field1111 == null) {
				this.field9666 = true;
			} else {
				this.field9683 = null;
			}
		}
		if (this.field9647 != null && !GlModelFlags.method1151(this.field9627, this.field9628)) {
			if (this.field9664 != null && this.field9664.field1111 == null) {
				this.field9666 = true;
			} else {
				this.field9648 = null;
				this.field9647 = null;
			}
		}
		if (this.field9685 != null && !GlModelFlags.method1156(this.field9627, this.field9628)) {
			if (this.field9665 != null && this.field9665.field1111 == null) {
				this.field9666 = true;
			} else {
				this.field9685 = null;
			}
		}
		if (this.field9653 != null && !GlModelFlags.method1215(this.field9627, this.field9628)) {
			if ((this.field9663 == null || this.field9663.field1109 != null) && (this.field9665 == null || this.field9665.field1111 != null)) {
				this.field9646 = null;
				this.field9652 = null;
				this.field9653 = null;
			} else {
				this.field9666 = true;
			}
		}
		if (this.field9649 != null && !GlModelFlags.method1152(this.field9627, this.field9628)) {
			this.field9649 = null;
			this.field9662 = null;
		}
		if (this.field9638 != null && !GlModelFlags.method1153(this.field9627, this.field9628)) {
			this.field9638 = null;
			this.field9640 = null;
		}
		if (this.field9686 != null && !GlModelFlags.method1154(this.field9627, this.field9628)) {
			this.field9686 = null;
		}
		if (this.field9678 != null && (this.field9627 & 0x800) == 0 && (this.field9627 & 0x40000) == 0) {
			this.field9678 = null;
		}
	}

	@ObfuscatedName("afk.d(I)V")
	public void method1693(int arg0) {
		int var2 = Trig1.sin[arg0];
		int var3 = Trig1.cos[arg0];
		for (int var4 = 0; var4 < this.field9635; var4++) {
			int var5 = this.field9636[var4] * var3 + this.field9619[var4] * var2 >> 14;
			this.field9619[var4] = this.field9619[var4] * var3 - this.field9636[var4] * var2 >> 14;
			this.field9636[var4] = var5;
		}
		if (this.field9659 != null) {
			this.field9659.field1111 = null;
		}
		this.field9669 = false;
	}

	@ObfuscatedName("afk.c(I)V")
	public void method1694(int arg0) {
		int var2 = Trig1.sin[arg0];
		int var3 = Trig1.cos[arg0];
		for (int var4 = 0; var4 < this.field9635; var4++) {
			int var5 = this.field9636[var4] * var3 + this.field9619[var4] * var2 >> 14;
			this.field9619[var4] = this.field9619[var4] * var3 - this.field9636[var4] * var2 >> 14;
			this.field9636[var4] = var5;
		}
		for (int var6 = 0; var6 < this.field9658; var6++) {
			int var7 = this.field9681[var6] * var3 + this.field9644[var6] * var2 >> 14;
			this.field9644[var6] = (short) (this.field9644[var6] * var3 - this.field9681[var6] * var2 >> 14);
			this.field9681[var6] = (short) var7;
		}
		if (this.field9673 == null && this.field9665 != null) {
			this.field9665.field1111 = null;
		}
		if (this.field9673 != null) {
			this.field9673.field1111 = null;
		}
		if (this.field9659 != null) {
			this.field9659.field1111 = null;
		}
		this.field9669 = false;
	}

	@ObfuscatedName("afk.r(I)V")
	public void rotateX(int arg0) {
		int var2 = Trig1.sin[arg0];
		int var3 = Trig1.cos[arg0];
		for (int var4 = 0; var4 < this.field9635; var4++) {
			int var5 = this.field9637[var4] * var3 - this.field9619[var4] * var2 >> 14;
			this.field9619[var4] = this.field9637[var4] * var2 + this.field9619[var4] * var3 >> 14;
			this.field9637[var4] = var5;
		}
		if (this.field9659 != null) {
			this.field9659.field1111 = null;
		}
		this.field9669 = false;
	}

	@ObfuscatedName("afk.v(I)V")
	public void rotateZ(int arg0) {
		int var2 = Trig1.sin[arg0];
		int var3 = Trig1.cos[arg0];
		for (int var4 = 0; var4 < this.field9635; var4++) {
			int var5 = this.field9637[var4] * var2 + this.field9636[var4] * var3 >> 14;
			this.field9637[var4] = this.field9637[var4] * var3 - this.field9636[var4] * var2 >> 14;
			this.field9636[var4] = var5;
		}
		if (this.field9659 != null) {
			this.field9659.field1111 = null;
		}
		this.field9669 = false;
	}

	@ObfuscatedName("afk.o(III)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field9635; var4++) {
			if (arg0 != 0) {
				this.field9636[var4] += arg0;
			}
			if (arg1 != 0) {
				this.field9637[var4] += arg1;
			}
			if (arg2 != 0) {
				this.field9619[var4] += arg2;
			}
		}
		if (this.field9659 != null) {
			this.field9659.field1111 = null;
		}
		this.field9669 = false;
	}

	@ObfuscatedName("afk.s()V")
	public void method1698() {
		for (int var1 = 0; var1 < this.field9635; var1++) {
			this.field9619[var1] = -this.field9619[var1];
		}
		for (int var2 = 0; var2 < this.field9658; var2++) {
			this.field9644[var2] = (short) -this.field9644[var2];
		}
		for (int var3 = 0; var3 < this.field9670; var3++) {
			short var4 = this.field9653[var3];
			this.field9653[var3] = this.field9646[var3];
			this.field9646[var3] = var4;
		}
		if (this.field9673 == null && this.field9665 != null) {
			this.field9665.field1111 = null;
		}
		if (this.field9673 != null) {
			this.field9673.field1111 = null;
		}
		if (this.field9659 != null) {
			this.field9659.field1111 = null;
		}
		if (this.field9663 != null) {
			this.field9663.field1109 = null;
		}
		this.field9669 = false;
	}

	@ObfuscatedName("afk.y(III)V")
	public void scale(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field9635; var4++) {
			if (arg0 != 128) {
				this.field9636[var4] = this.field9636[var4] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.field9637[var4] = this.field9637[var4] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.field9619[var4] = this.field9619[var4] * arg2 >> 7;
			}
		}
		if (this.field9659 != null) {
			this.field9659.field1111 = null;
		}
		this.field9669 = false;
	}

	@ObfuscatedName("afk.q(IILcb;Lcb;III)V")
	public void method1700(int arg0, int arg1, FloorModel arg2, FloorModel arg3, int arg4, int arg5, int arg6) {
		if (!this.field9669) {
			this.method15552();
		}
		int var8 = this.field9672 + arg4;
		int var9 = this.field9643 + arg4;
		int var10 = this.field9671 + arg6;
		int var11 = this.field9675 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var8 < 0 || arg2.field1233 + var9 >> arg2.field1236 >= arg2.field1235 || var10 < 0 || arg2.field1233 + var11 >> arg2.field1236 >= arg2.field1234)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (var8 < 0 || arg3.field1233 + var9 >> arg3.field1236 >= arg3.field1235 || var10 < 0 || arg3.field1233 + var11 >> arg3.field1236 >= arg3.field1234) {
				return;
			}
		} else {
			int var12 = var8 >> arg2.field1236;
			int var13 = arg2.field1233 - 1 + var9 >> arg2.field1236;
			int var14 = var10 >> arg2.field1236;
			int var15 = arg2.field1233 - 1 + var11 >> arg2.field1236;
			if (arg2.getTileHeight(var12, var14) == arg5 && arg2.getTileHeight(var13, var14) == arg5 && arg2.getTileHeight(var12, var15) == arg5 && arg2.getTileHeight(var13, var15) == arg5) {
				return;
			}
		}
		if (arg0 == 1) {
			for (int var16 = 0; var16 < this.field9635; var16++) {
				this.field9637[var16] = this.field9637[var16] + arg2.method1528(this.field9636[var16] + arg4, this.field9619[var16] + arg6) - arg5;
			}
		} else if (arg0 == 2) {
			short var17 = this.field9657;
			if (var17 == 0) {
				return;
			}
			for (int var18 = 0; var18 < this.field9635; var18++) {
				int var19 = (this.field9637[var18] << 16) / var17;
				if (var19 < arg1) {
					this.field9637[var18] += (arg2.method1528(this.field9636[var18] + arg4, this.field9619[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
				}
			}
		} else if (arg0 == 3) {
			int var20 = (arg1 & 0xFF) * 16;
			int var21 = (arg1 >> 8 & 0xFF) * 16;
			int var22 = (arg1 >> 16 & 0xFF) << 6;
			int var23 = (arg1 >> 24 & 0xFF) << 6;
			if (arg4 - (var20 >> 1) < 0 || arg2.field1233 + (var20 >> 1) + arg4 >= arg2.field1235 << arg2.field1236 || arg6 - (var21 >> 1) < 0 || arg2.field1233 + (var21 >> 1) + arg6 >= arg2.field1234 << arg2.field1236) {
				return;
			}
			this.method1701(arg2, arg4, arg5, arg6, var20, var21, var22, var23);
		} else if (arg0 == 4) {
			int var24 = this.field9674 - this.field9657;
			for (int var25 = 0; var25 < this.field9635; var25++) {
				this.field9637[var25] = this.field9637[var25] + (arg3.method1528(this.field9636[var25] + arg4, this.field9619[var25] + arg6) - arg5) + var24;
			}
		} else if (arg0 == 5) {
			int var26 = this.field9674 - this.field9657;
			for (int var27 = 0; var27 < this.field9635; var27++) {
				int var28 = this.field9636[var27] + arg4;
				int var29 = this.field9619[var27] + arg6;
				int var30 = arg2.method1528(var28, var29);
				int var31 = arg3.method1528(var28, var29);
				int var32 = var30 - var31 - arg1;
				this.field9637[var27] = ((this.field9637[var27] << 8) / var26 * var32 >> 8) - (arg5 - var30);
			}
		}
		if (this.field9659 != null) {
			this.field9659.field1111 = null;
		}
		this.field9669 = false;
	}

	@ObfuscatedName("afk.hr()V")
	public void method15552() {
		int var1 = 32767;
		int var2 = 32767;
		int var3 = 32767;
		int var4 = -32768;
		int var5 = -32768;
		int var6 = -32768;
		int var7 = 0;
		int var8 = 0;
		for (int var9 = 0; var9 < this.field9635; var9++) {
			int var10 = this.field9636[var9];
			int var11 = this.field9637[var9];
			int var12 = this.field9619[var9];
			if (var10 < var1) {
				var1 = var10;
			}
			if (var10 > var4) {
				var4 = var10;
			}
			if (var11 < var2) {
				var2 = var11;
			}
			if (var11 > var5) {
				var5 = var11;
			}
			if (var12 < var3) {
				var3 = var12;
			}
			if (var12 > var6) {
				var6 = var12;
			}
			int var13 = var10 * var10 + var12 * var12;
			if (var13 > var7) {
				var7 = var13;
			}
			int var14 = var11 * var11 + var10 * var10 + var12 * var12;
			if (var14 > var8) {
				var8 = var14;
			}
		}
		this.field9672 = (short) var1;
		this.field9643 = (short) var4;
		this.field9657 = (short) var2;
		this.field9674 = (short) var5;
		this.field9671 = (short) var3;
		this.field9675 = (short) var6;
		this.field9668 = (int) (Math.sqrt((double) var7) + 0.99D);
		this.field9667 = (int) (Math.sqrt((double) var8) + 0.99D);
		this.field9669 = true;
	}

	@ObfuscatedName("afk.bl()V")
	public void method1736() {
		if (this.field9676) {
			return;
		}
		if (!this.field9669) {
			this.method15552();
		}
		this.field9677 = this.field9657;
		this.field9676 = true;
	}

	@ObfuscatedName("afk.aj()I")
	public int getHorizontalRadius() {
		if (!this.field9669) {
			this.method15552();
		}
		return this.field9668;
	}

	@ObfuscatedName("afk.ay()I")
	public int getRadius() {
		if (!this.field9669) {
			this.method15552();
		}
		return this.field9667;
	}

	@ObfuscatedName("afk.ab()I")
	public int getMinX() {
		if (!this.field9669) {
			this.method15552();
		}
		return this.field9672;
	}

	@ObfuscatedName("afk.az()I")
	public int getMaxX() {
		if (!this.field9669) {
			this.method15552();
		}
		return this.field9643;
	}

	@ObfuscatedName("afk.aa()I")
	public int getMinY() {
		if (!this.field9669) {
			this.method15552();
		}
		return this.field9657;
	}

	@ObfuscatedName("afk.af()I")
	public int getMaxY() {
		if (!this.field9669) {
			this.method15552();
		}
		return this.field9674;
	}

	@ObfuscatedName("afk.ak()I")
	public int getMinZ() {
		if (!this.field9669) {
			this.method15552();
		}
		return this.field9671;
	}

	@ObfuscatedName("afk.an()I")
	public int getMaxZ() {
		if (!this.field9669) {
			this.method15552();
		}
		return this.field9675;
	}

	@ObfuscatedName("afk.bf()I")
	public int getHeight() {
		if (!this.field9676) {
			this.method1736();
		}
		return this.field9677;
	}

	@ObfuscatedName("afk.bo(Ldo;IIIZ)V")
	public void method1686(Model arg0, int arg1, int arg2, int arg3, boolean arg4) {
		GlModel var6 = (GlModel) arg0;
		if (this.field9670 == 0 || var6.field9670 == 0) {
			return;
		}
		int var7 = var6.field9635;
		int[] var8 = var6.field9636;
		int[] var9 = var6.field9637;
		int[] var10 = var6.field9619;
		short[] var11 = var6.field9681;
		short[] var12 = var6.field9682;
		short[] var13 = var6.field9644;
		byte[] var14 = var6.field9690;
		short[] var15;
		short[] var16;
		short[] var17;
		byte[] var18;
		if (this.field9684 == null) {
			var15 = null;
			var16 = null;
			var17 = null;
			var18 = null;
		} else {
			var15 = this.field9684.field1191;
			var16 = this.field9684.field1189;
			var17 = this.field9684.field1188;
			var18 = this.field9684.field1190;
		}
		short[] var19;
		short[] var20;
		short[] var21;
		byte[] var22;
		if (var6.field9684 == null) {
			var19 = null;
			var20 = null;
			var21 = null;
			var22 = null;
		} else {
			var19 = var6.field9684.field1191;
			var20 = var6.field9684.field1189;
			var21 = var6.field9684.field1188;
			var22 = var6.field9684.field1190;
		}
		int[] var23 = var6.field9679;
		short[] var24 = var6.field9680;
		if (!var6.field9669) {
			var6.method15552();
		}
		short var25 = var6.field9657;
		short var26 = var6.field9674;
		short var27 = var6.field9672;
		short var28 = var6.field9643;
		short var29 = var6.field9671;
		short var30 = var6.field9675;
		for (int var31 = 0; var31 < this.field9635; var31++) {
			int var32 = this.field9637[var31] - arg2;
			if (var32 >= var25 && var32 <= var26) {
				int var33 = this.field9636[var31] - arg1;
				if (var33 >= var27 && var33 <= var28) {
					int var34 = this.field9619[var31] - arg3;
					if (var34 >= var29 && var34 <= var30) {
						int var35 = -1;
						int var36 = this.field9679[var31];
						int var37 = this.field9679[var31 + 1];
						for (int var38 = var36; var38 < var37 && this.field9680[var38] != 0; var38++) {
							var35 = (this.field9680[var38] & 0xFFFF) - 1;
							if (this.field9690[var35] != 0) {
								break;
							}
						}
						if (var35 != -1) {
							for (int var39 = 0; var39 < var7; var39++) {
								if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
									int var40 = -1;
									int var41 = var23[var39];
									int var42 = var23[var39 + 1];
									for (int var43 = var41; var43 < var42 && var24[var43] != 0; var43++) {
										var40 = (var24[var43] & 0xFFFF) - 1;
										if (var14[var40] != 0) {
											break;
										}
									}
									if (var40 != -1) {
										if (var15 == null) {
											this.field9684 = new GlModelRelated1();
											var15 = this.field9684.field1191 = GpuByteArrayUtil.method13987(this.field9681);
											var16 = this.field9684.field1189 = GpuByteArrayUtil.method13987(this.field9682);
											var17 = this.field9684.field1188 = GpuByteArrayUtil.method13987(this.field9644);
											var18 = this.field9684.field1190 = GpuByteArrayUtil.method4405(this.field9690);
										}
										if (var19 == null) {
											GlModelRelated1 var44 = var6.field9684 = new GlModelRelated1();
											var19 = var44.field1191 = GpuByteArrayUtil.method13987(var11);
											var20 = var44.field1189 = GpuByteArrayUtil.method13987(var12);
											var21 = var44.field1188 = GpuByteArrayUtil.method13987(var13);
											var22 = var44.field1190 = GpuByteArrayUtil.method4405(var14);
										}
										short var45 = this.field9681[var35];
										short var46 = this.field9682[var35];
										short var47 = this.field9644[var35];
										byte var48 = this.field9690[var35];
										int var49 = var23[var39];
										int var50 = var23[var39 + 1];
										for (int var51 = var49; var51 < var50; var51++) {
											int var52 = var24[var51] - 1;
											if (var52 == -1) {
												break;
											}
											if (var22[var52] != 0) {
												var19[var52] += var45;
												var20[var52] += var46;
												var21[var52] += var47;
												var22[var52] += var48;
											}
										}
										short var53 = var11[var40];
										short var54 = var12[var40];
										short var55 = var13[var40];
										byte var56 = var14[var40];
										int var57 = this.field9679[var31];
										int var58 = this.field9679[var31 + 1];
										for (int var59 = var57; var59 < var58 && this.field9680[var59] != 0; var59++) {
											int var60 = (this.field9680[var59] & 0xFFFF) - 1;
											if (var18[var60] != 0) {
												var15[var60] += var53;
												var16[var60] += var54;
												var17[var60] += var55;
												var18[var60] += var56;
											}
										}
										if (this.field9673 == null && this.field9665 != null) {
											this.field9665.field1111 = null;
										}
										if (this.field9673 != null) {
											this.field9673.field1111 = null;
										}
										if (var6.field9673 == null && var6.field9665 != null) {
											var6.field9665.field1111 = null;
										}
										if (var6.field9673 != null) {
											var6.field9673.field1111 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("afk.bk(I)V")
	public void method1893(int arg0) {
		this.field9630 = (short) arg0;
		if (this.field9665 != null) {
			this.field9665.field1111 = null;
		}
	}

	@ObfuscatedName("afk.bh(I)V")
	public void method1738(int arg0) {
		this.field9631 = (short) arg0;
		if (this.field9665 != null) {
			this.field9665.field1111 = null;
		}
		if (this.field9673 != null) {
			this.field9673.field1111 = null;
		}
	}

	@ObfuscatedName("afk.bx()I")
	public int method1862() {
		return this.field9630;
	}

	@ObfuscatedName("afk.bd()I")
	public int method1740() {
		return this.field9631;
	}

	@ObfuscatedName("afk.bc()[B")
	public byte[] method1741() {
		return this.field9683;
	}

	@ObfuscatedName("afk.bi(SS)V")
	public void recolor(short arg0, short arg1) {
		for (int var3 = 0; var3 < this.field9670; var3++) {
			if (this.field9651[var3] == arg0) {
				this.field9651[var3] = arg1;
			}
		}
		if (this.field9656 != null) {
			for (int var4 = 0; var4 < this.field9660; var4++) {
				GlModelRelated2 var5 = this.field9656[var4];
				GlModelRelated3 var6 = this.field9639[var4];
				var6.field1054 = var6.field1054 & 0xFF000000 | ColourUtils.field8151[this.field9651[var5.field1192] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.field9665 != null) {
			this.field9665.field1111 = null;
		}
	}

	@ObfuscatedName("afk.bn(B[B)V")
	public void method1747(byte arg0, byte[] arg1) {
		if (arg1 == null) {
			for (int var3 = 0; var3 < this.field9670; var3++) {
				this.field9683[var3] = arg0;
			}
		} else {
			for (int var4 = 0; var4 < this.field9670; var4++) {
				int var5 = 255 - (255 - (arg1[var4] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.field9683[var4] = (byte) var5;
			}
		}
		if (this.field9665 != null) {
			this.field9665.field1111 = null;
		}
	}

	@ObfuscatedName("afk.bt(SS)V")
	public void retexture(short arg0, short arg1) {
		MaterialList var3 = this.field9626.materialList;
		for (int var4 = 0; var4 < this.field9670; var4++) {
			if (this.field9685[var4] == arg0) {
				this.field9685[var4] = arg1;
			}
		}
		byte var5 = 0;
		byte var6 = 0;
		if (arg0 != -1) {
			Material var7 = var3.get(arg0 & 0xFFFF);
			var5 = var7.field1364;
			var6 = var7.field1363;
		}
		byte var8 = 0;
		byte var9 = 0;
		if (arg1 != -1) {
			Material var10 = var3.get(arg1 & 0xFFFF);
			var8 = var10.field1364;
			var9 = var10.field1363;
			if (var10.speedU != 0.0F || var10.speedV != 0.0F) {
				this.field9633 = true;
			}
		}
		if (!(var5 != var8 | var6 != var9)) {
			return;
		}
		if (this.field9656 != null) {
			for (int var11 = 0; var11 < this.field9660; var11++) {
				GlModelRelated2 var12 = this.field9656[var11];
				GlModelRelated3 var13 = this.field9639[var11];
				var13.field1054 = var13.field1054 & 0xFF000000 | ColourUtils.field8151[this.field9651[var12.field1192] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.field9665 != null) {
			this.field9665.field1111 = null;
		}
	}

	@ObfuscatedName("afk.bq(IIII)V")
	public void method1745(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.field9670; var5++) {
			int var6 = this.field9651[var5] & 0xFFFF;
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
			this.field9651[var5] = (short) (var7 << 10 | var8 << 7 | var9);
		}
		if (this.field9656 != null) {
			for (int var10 = 0; var10 < this.field9660; var10++) {
				GlModelRelated2 var11 = this.field9656[var10];
				GlModelRelated3 var12 = this.field9639[var10];
				var12.field1054 = var12.field1054 & 0xFF000000 | ColourUtils.field8151[this.field9651[var11.field1192] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.field9665 != null) {
			this.field9665.field1111 = null;
		}
	}

	@ObfuscatedName("afk.bm()Z")
	public boolean method1746() {
		if (this.field9685 == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.field9685.length; var1++) {
			if (this.field9685[var1] != -1) {
				Material var2 = this.field9626.materialList.get(this.field9685[var1] & 0xFFFF);
				if (var2.field1330 && !this.field9626.field10026.method1397(TextureRelated2.field7586, var2, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@ObfuscatedName("afk.bb()Z")
	public boolean method1731() {
		return this.field9632;
	}

	@ObfuscatedName("afk.be()Z")
	public boolean method1812() {
		return this.field9633;
	}

	@ObfuscatedName("afk.b()V")
	public void method1702() {
	}

	@ObfuscatedName("afk.h()V")
	public void method1703() {
	}

	@ObfuscatedName("afk.as()Z")
	public boolean method1716() {
		if (this.field9638 == null) {
			return false;
		}
		for (int var1 = 0; var1 < this.field9634; var1++) {
			this.field9636[var1] <<= 0x4;
			this.field9637[var1] <<= 0x4;
			this.field9619[var1] <<= 0x4;
		}
		field9692 = 0;
		field9693 = 0;
		field9694 = 0;
		return true;
	}

	@ObfuscatedName("afk.am(I[IIIIZI[I)V")
	public void method1719(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		if (arg0 == 0) {
			int var10 = arg2 << 4;
			int var11 = arg3 << 4;
			int var12 = arg4 << 4;
			int var13 = 0;
			field9692 = 0;
			field9693 = 0;
			field9694 = 0;
			for (int var14 = 0; var14 < var9; var14++) {
				int var15 = arg1[var14];
				if (var15 < this.field9638.length) {
					int[] var16 = this.field9638[var15];
					for (int var17 = 0; var17 < var16.length; var17++) {
						int var18 = var16[var17];
						if (this.field9640 == null || (arg6 & this.field9640[var18]) != 0) {
							field9692 += this.field9636[var18];
							field9693 += this.field9637[var18];
							field9694 += this.field9619[var18];
							var13++;
						}
					}
				}
			}
			if (var13 > 0) {
				field9692 = field9692 / var13 + var10;
				field9693 = field9693 / var13 + var11;
				field9694 = field9694 / var13 + var12;
				field9695 = true;
			} else {
				field9692 = var10;
				field9693 = var11;
				field9694 = var12;
			}
		} else if (arg0 == 1) {
			if (arg7 != null) {
				int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
				int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
				int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
				arg2 = var19;
				arg3 = var20;
				arg4 = var21;
			}
			int var22 = arg2 << 4;
			int var23 = arg3 << 4;
			int var24 = arg4 << 4;
			for (int var25 = 0; var25 < var9; var25++) {
				int var26 = arg1[var25];
				if (var26 < this.field9638.length) {
					int[] var27 = this.field9638[var26];
					for (int var28 = 0; var28 < var27.length; var28++) {
						int var29 = var27[var28];
						if (this.field9640 == null || (arg6 & this.field9640[var29]) != 0) {
							this.field9636[var29] += var22;
							this.field9637[var29] += var23;
							this.field9619[var29] += var24;
						}
					}
				}
			}
		} else if (arg0 == 2) {
			if (arg7 == null) {
				for (int var90 = 0; var90 < var9; var90++) {
					int var91 = arg1[var90];
					if (var91 < this.field9638.length) {
						int[] var92 = this.field9638[var91];
						for (int var93 = 0; var93 < var92.length; var93++) {
							int var94 = var92[var93];
							if (this.field9640 == null || (arg6 & this.field9640[var94]) != 0) {
								this.field9636[var94] -= field9692;
								this.field9637[var94] -= field9693;
								this.field9619[var94] -= field9694;
								if (arg4 != 0) {
									int var95 = Trig1.sin[arg4];
									int var96 = Trig1.cos[arg4];
									int var97 = this.field9637[var94] * var95 + this.field9636[var94] * var96 + 16383 >> 14;
									this.field9637[var94] = this.field9637[var94] * var96 - this.field9636[var94] * var95 + 16383 >> 14;
									this.field9636[var94] = var97;
								}
								if (arg2 != 0) {
									int var98 = Trig1.sin[arg2];
									int var99 = Trig1.cos[arg2];
									int var100 = this.field9637[var94] * var99 - this.field9619[var94] * var98 + 16383 >> 14;
									this.field9619[var94] = this.field9637[var94] * var98 + this.field9619[var94] * var99 + 16383 >> 14;
									this.field9637[var94] = var100;
								}
								if (arg3 != 0) {
									int var101 = Trig1.sin[arg3];
									int var102 = Trig1.cos[arg3];
									int var103 = this.field9636[var94] * var102 + this.field9619[var94] * var101 + 16383 >> 14;
									this.field9619[var94] = this.field9619[var94] * var102 - this.field9636[var94] * var101 + 16383 >> 14;
									this.field9636[var94] = var103;
								}
								this.field9636[var94] += field9692;
								this.field9637[var94] += field9693;
								this.field9619[var94] += field9694;
							}
						}
					}
				}
				if (arg5) {
					for (int var104 = 0; var104 < var9; var104++) {
						int var105 = arg1[var104];
						if (var105 < this.field9638.length) {
							int[] var106 = this.field9638[var105];
							for (int var107 = 0; var107 < var106.length; var107++) {
								int var108 = var106[var107];
								if (this.field9640 == null || (arg6 & this.field9640[var108]) != 0) {
									int var109 = this.field9679[var108];
									int var110 = this.field9679[var108 + 1];
									for (int var111 = var109; var111 < var110 && this.field9680[var111] != 0; var111++) {
										int var112 = (this.field9680[var111] & 0xFFFF) - 1;
										if (arg4 != 0) {
											int var113 = Trig1.sin[arg4];
											int var114 = Trig1.cos[arg4];
											int var115 = this.field9682[var112] * var113 + this.field9681[var112] * var114 + 16383 >> 14;
											this.field9682[var112] = (short) (this.field9682[var112] * var114 - this.field9681[var112] * var113 + 16383 >> 14);
											this.field9681[var112] = (short) var115;
										}
										if (arg2 != 0) {
											int var116 = Trig1.sin[arg2];
											int var117 = Trig1.cos[arg2];
											int var118 = this.field9682[var112] * var117 - this.field9644[var112] * var116 + 16383 >> 14;
											this.field9644[var112] = (short) (this.field9682[var112] * var116 + this.field9644[var112] * var117 + 16383 >> 14);
											this.field9682[var112] = (short) var118;
										}
										if (arg3 != 0) {
											int var119 = Trig1.sin[arg3];
											int var120 = Trig1.cos[arg3];
											int var121 = this.field9681[var112] * var120 + this.field9644[var112] * var119 + 16383 >> 14;
											this.field9644[var112] = (short) (this.field9644[var112] * var120 - this.field9681[var112] * var119 + 16383 >> 14);
											this.field9681[var112] = (short) var121;
										}
									}
								}
							}
						}
					}
					if (this.field9673 == null && this.field9665 != null) {
						this.field9665.field1111 = null;
					}
					if (this.field9673 != null) {
						this.field9673.field1111 = null;
					}
				}
			} else {
				int var30 = arg7[9] << 4;
				int var31 = arg7[10] << 4;
				int var32 = arg7[11] << 4;
				int var33 = arg7[12] << 4;
				int var34 = arg7[13] << 4;
				int var35 = arg7[14] << 4;
				if (field9695) {
					int var36 = arg7[6] * field9694 + arg7[0] * field9692 + arg7[3] * field9693 + 8192 >> 14;
					int var37 = arg7[7] * field9694 + arg7[1] * field9692 + arg7[4] * field9693 + 8192 >> 14;
					int var38 = arg7[8] * field9694 + arg7[2] * field9692 + arg7[5] * field9693 + 8192 >> 14;
					int var39 = var33 + var36;
					int var40 = var34 + var37;
					int var41 = var35 + var38;
					field9692 = var39;
					field9693 = var40;
					field9694 = var41;
					field9695 = false;
				}
				int[] var42 = new int[9];
				int var43 = Trig1.cos[arg2];
				int var44 = Trig1.sin[arg2];
				int var45 = Trig1.cos[arg3];
				int var46 = Trig1.sin[arg3];
				int var47 = Trig1.cos[arg4];
				int var48 = Trig1.sin[arg4];
				int var49 = var44 * var47 + 8192 >> 14;
				int var50 = var44 * var48 + 8192 >> 14;
				var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
				var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
				var42[2] = var43 * var46 + 8192 >> 14;
				var42[3] = var43 * var48 + 8192 >> 14;
				var42[4] = var43 * var47 + 8192 >> 14;
				var42[5] = -var44;
				var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
				var42[7] = var45 * var49 + var46 * var48 + 8192 >> 14;
				var42[8] = var43 * var45 + 8192 >> 14;
				int var51 = var42[2] * -field9694 + var42[0] * -field9692 + var42[1] * -field9693 + 8192 >> 14;
				int var52 = var42[5] * -field9694 + var42[3] * -field9692 + var42[4] * -field9693 + 8192 >> 14;
				int var53 = var42[8] * -field9694 + var42[6] * -field9692 + var42[7] * -field9693 + 8192 >> 14;
				int var54 = field9692 + var51;
				int var55 = field9693 + var52;
				int var56 = field9694 + var53;
				int[] var57 = new int[9];
				for (int var58 = 0; var58 < 3; var58++) {
					for (int var59 = 0; var59 < 3; var59++) {
						int var60 = 0;
						for (int var61 = 0; var61 < 3; var61++) {
							var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
						}
						var57[var58 * 3 + var59] = var60 + 8192 >> 14;
					}
				}
				int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 8192 >> 14;
				int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 8192 >> 14;
				int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 8192 >> 14;
				int var65 = var54 + var62;
				int var66 = var55 + var63;
				int var67 = var56 + var64;
				int[] var68 = new int[9];
				for (int var69 = 0; var69 < 3; var69++) {
					for (int var70 = 0; var70 < 3; var70++) {
						int var71 = 0;
						for (int var72 = 0; var72 < 3; var72++) {
							var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
						}
						var68[var69 * 3 + var70] = var71 + 8192 >> 14;
					}
				}
				int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 8192 >> 14;
				int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 8192 >> 14;
				int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 8192 >> 14;
				int var76 = var30 + var73;
				int var77 = var31 + var74;
				int var78 = var32 + var75;
				for (int var79 = 0; var79 < var9; var79++) {
					int var80 = arg1[var79];
					if (var80 < this.field9638.length) {
						int[] var81 = this.field9638[var80];
						for (int var82 = 0; var82 < var81.length; var82++) {
							int var83 = var81[var82];
							if (this.field9640 == null || (arg6 & this.field9640[var83]) != 0) {
								int var84 = this.field9619[var83] * var68[2] + this.field9637[var83] * var68[1] + this.field9636[var83] * var68[0] + 8192 >> 14;
								int var85 = this.field9619[var83] * var68[5] + this.field9637[var83] * var68[4] + this.field9636[var83] * var68[3] + 8192 >> 14;
								int var86 = this.field9619[var83] * var68[8] + this.field9637[var83] * var68[7] + this.field9636[var83] * var68[6] + 8192 >> 14;
								int var87 = var76 + var84;
								int var88 = var77 + var85;
								int var89 = var78 + var86;
								this.field9636[var83] = var87;
								this.field9637[var83] = var88;
								this.field9619[var83] = var89;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (int var172 = 0; var172 < var9; var172++) {
					int var173 = arg1[var172];
					if (var173 < this.field9638.length) {
						int[] var174 = this.field9638[var173];
						for (int var175 = 0; var175 < var174.length; var175++) {
							int var176 = var174[var175];
							if (this.field9640 == null || (arg6 & this.field9640[var176]) != 0) {
								this.field9636[var176] -= field9692;
								this.field9637[var176] -= field9693;
								this.field9619[var176] -= field9694;
								this.field9636[var176] = this.field9636[var176] * arg2 >> 7;
								this.field9637[var176] = this.field9637[var176] * arg3 >> 7;
								this.field9619[var176] = this.field9619[var176] * arg4 >> 7;
								this.field9636[var176] += field9692;
								this.field9637[var176] += field9693;
								this.field9619[var176] += field9694;
							}
						}
					}
				}
			} else {
				int var122 = arg7[9] << 4;
				int var123 = arg7[10] << 4;
				int var124 = arg7[11] << 4;
				int var125 = arg7[12] << 4;
				int var126 = arg7[13] << 4;
				int var127 = arg7[14] << 4;
				if (field9695) {
					int var128 = arg7[6] * field9694 + arg7[0] * field9692 + arg7[3] * field9693 + 8192 >> 14;
					int var129 = arg7[7] * field9694 + arg7[1] * field9692 + arg7[4] * field9693 + 8192 >> 14;
					int var130 = arg7[8] * field9694 + arg7[2] * field9692 + arg7[5] * field9693 + 8192 >> 14;
					int var131 = var125 + var128;
					int var132 = var126 + var129;
					int var133 = var127 + var130;
					field9692 = var131;
					field9693 = var132;
					field9694 = var133;
					field9695 = false;
				}
				int var134 = arg2 << 15 >> 7;
				int var135 = arg3 << 15 >> 7;
				int var136 = arg4 << 15 >> 7;
				int var137 = -field9692 * var134 + 8192 >> 14;
				int var138 = -field9693 * var135 + 8192 >> 14;
				int var139 = -field9694 * var136 + 8192 >> 14;
				int var140 = field9692 + var137;
				int var141 = field9693 + var138;
				int var142 = field9694 + var139;
				int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
				int var144 = var125 * var134 + 8192 >> 14;
				int var145 = var126 * var135 + 8192 >> 14;
				int var146 = var127 * var136 + 8192 >> 14;
				int var147 = var140 + var144;
				int var148 = var141 + var145;
				int var149 = var142 + var146;
				int[] var150 = new int[9];
				for (int var151 = 0; var151 < 3; var151++) {
					for (int var152 = 0; var152 < 3; var152++) {
						int var153 = 0;
						for (int var154 = 0; var154 < 3; var154++) {
							var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
						}
						var150[var151 * 3 + var152] = var153 + 8192 >> 14;
					}
				}
				int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 8192 >> 14;
				int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 8192 >> 14;
				int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 8192 >> 14;
				int var158 = var122 + var155;
				int var159 = var123 + var156;
				int var160 = var124 + var157;
				for (int var161 = 0; var161 < var9; var161++) {
					int var162 = arg1[var161];
					if (var162 < this.field9638.length) {
						int[] var163 = this.field9638[var162];
						for (int var164 = 0; var164 < var163.length; var164++) {
							int var165 = var163[var164];
							if (this.field9640 == null || (arg6 & this.field9640[var165]) != 0) {
								int var166 = this.field9619[var165] * var150[2] + this.field9637[var165] * var150[1] + this.field9636[var165] * var150[0] + 8192 >> 14;
								int var167 = this.field9619[var165] * var150[5] + this.field9637[var165] * var150[4] + this.field9636[var165] * var150[3] + 8192 >> 14;
								int var168 = this.field9619[var165] * var150[8] + this.field9637[var165] * var150[7] + this.field9636[var165] * var150[6] + 8192 >> 14;
								int var169 = var158 + var166;
								int var170 = var159 + var167;
								int var171 = var160 + var168;
								this.field9636[var165] = var169;
								this.field9637[var165] = var170;
								this.field9619[var165] = var171;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.field9649 != null) {
				for (int var177 = 0; var177 < var9; var177++) {
					int var178 = arg1[var177];
					if (var178 < this.field9649.length) {
						int[] var179 = this.field9649[var178];
						for (int var180 = 0; var180 < var179.length; var180++) {
							int var181 = var179[var180];
							if (this.field9662 == null || (arg6 & this.field9662[var181]) != 0) {
								int var182 = (this.field9683[var181] & 0xFF) + arg2 * 8;
								if (var182 < 0) {
									var182 = 0;
								} else if (var182 > 255) {
									var182 = 255;
								}
								this.field9683[var181] = (byte) var182;
								if (this.field9665 != null) {
									this.field9665.field1111 = null;
								}
							}
						}
					}
				}
				if (this.field9656 != null) {
					for (int var183 = 0; var183 < this.field9660; var183++) {
						GlModelRelated2 var184 = this.field9656[var183];
						GlModelRelated3 var185 = this.field9639[var183];
						var185.field1054 = var185.field1054 & 0xFFFFFF | 255 - (this.field9683[var184.field1192] & 0xFF) << 24;
					}
				}
			}
		} else if (arg0 == 7) {
			if (this.field9649 != null) {
				for (int var186 = 0; var186 < var9; var186++) {
					int var187 = arg1[var186];
					if (var187 < this.field9649.length) {
						int[] var188 = this.field9649[var187];
						for (int var189 = 0; var189 < var188.length; var189++) {
							int var190 = var188[var189];
							if (this.field9662 == null || (arg6 & this.field9662[var190]) != 0) {
								int var191 = this.field9651[var190] & 0xFFFF;
								int var192 = var191 >> 10 & 0x3F;
								int var193 = var191 >> 7 & 0x7;
								int var194 = var191 & 0x7F;
								int var195 = arg2 + var192 & 0x3F;
								int var196 = arg3 / 4 + var193;
								if (var196 < 0) {
									var196 = 0;
								} else if (var196 > 7) {
									var196 = 7;
								}
								int var197 = arg4 + var194;
								if (var197 < 0) {
									var197 = 0;
								} else if (var197 > 127) {
									var197 = 127;
								}
								this.field9651[var190] = (short) (var195 << 10 | var196 << 7 | var197);
								if (this.field9665 != null) {
									this.field9665.field1111 = null;
								}
							}
						}
					}
				}
				if (this.field9656 != null) {
					for (int var198 = 0; var198 < this.field9660; var198++) {
						GlModelRelated2 var199 = this.field9656[var198];
						GlModelRelated3 var200 = this.field9639[var198];
						var200.field1054 = var200.field1054 & 0xFF000000 | ColourUtils.field8151[this.field9651[var199.field1192] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg0 == 8) {
			if (this.field9686 != null) {
				for (int var201 = 0; var201 < var9; var201++) {
					int var202 = arg1[var201];
					if (var202 < this.field9686.length) {
						int[] var203 = this.field9686[var202];
						for (int var204 = 0; var204 < var203.length; var204++) {
							GlModelRelated3 var205 = this.field9639[var203[var204]];
							var205.field1049 += arg2;
							var205.field1052 += arg3;
						}
					}
				}
			}
		} else if (arg0 == 10) {
			if (this.field9686 != null) {
				for (int var206 = 0; var206 < var9; var206++) {
					int var207 = arg1[var206];
					if (var207 < this.field9686.length) {
						int[] var208 = this.field9686[var207];
						for (int var209 = 0; var209 < var208.length; var209++) {
							GlModelRelated3 var210 = this.field9639[var208[var209]];
							var210.field1050 = var210.field1050 * arg2 >> 7;
							var210.field1051 = var210.field1051 * arg3 >> 7;
						}
					}
				}
			}
		} else if (arg0 == 9 && this.field9686 != null) {
			for (int var211 = 0; var211 < var9; var211++) {
				int var212 = arg1[var211];
				if (var212 < this.field9686.length) {
					int[] var213 = this.field9686[var212];
					for (int var214 = 0; var214 < var213.length; var214++) {
						GlModelRelated3 var215 = this.field9639[var213[var214]];
						var215.field1053 = var215.field1053 + arg2 & 0x3FFF;
					}
				}
			}
		}
	}

	@ObfuscatedName("afk.ar(IIII)V")
	public void method1721(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 == 0) {
			int var5 = 0;
			field9692 = 0;
			field9693 = 0;
			field9694 = 0;
			for (int var6 = 0; var6 < this.field9635; var6++) {
				field9692 += this.field9636[var6];
				field9693 += this.field9637[var6];
				field9694 += this.field9619[var6];
				var5++;
			}
			if (var5 > 0) {
				field9692 = field9692 / var5 + arg1;
				field9693 = field9693 / var5 + arg2;
				field9694 = field9694 / var5 + arg3;
			} else {
				field9692 = arg1;
				field9693 = arg2;
				field9694 = arg3;
			}
		} else if (arg0 == 1) {
			for (int var7 = 0; var7 < this.field9635; var7++) {
				this.field9636[var7] += arg1;
				this.field9637[var7] += arg2;
				this.field9619[var7] += arg3;
			}
		} else if (arg0 == 2) {
			for (int var8 = 0; var8 < this.field9635; var8++) {
				this.field9636[var8] -= field9692;
				this.field9637[var8] -= field9693;
				this.field9619[var8] -= field9694;
				if (arg3 != 0) {
					int var9 = Trig1.sin[arg3];
					int var10 = Trig1.cos[arg3];
					int var11 = this.field9637[var8] * var9 + this.field9636[var8] * var10 + 16383 >> 14;
					this.field9637[var8] = this.field9637[var8] * var10 - this.field9636[var8] * var9 + 16383 >> 14;
					this.field9636[var8] = var11;
				}
				if (arg1 != 0) {
					int var12 = Trig1.sin[arg1];
					int var13 = Trig1.cos[arg1];
					int var14 = this.field9637[var8] * var13 - this.field9619[var8] * var12 + 16383 >> 14;
					this.field9619[var8] = this.field9637[var8] * var12 + this.field9619[var8] * var13 + 16383 >> 14;
					this.field9637[var8] = var14;
				}
				if (arg2 != 0) {
					int var15 = Trig1.sin[arg2];
					int var16 = Trig1.cos[arg2];
					int var17 = this.field9636[var8] * var16 + this.field9619[var8] * var15 + 16383 >> 14;
					this.field9619[var8] = this.field9619[var8] * var16 - this.field9636[var8] * var15 + 16383 >> 14;
					this.field9636[var8] = var17;
				}
				this.field9636[var8] += field9692;
				this.field9637[var8] += field9693;
				this.field9619[var8] += field9694;
			}
		} else if (arg0 == 3) {
			for (int var18 = 0; var18 < this.field9635; var18++) {
				this.field9636[var18] -= field9692;
				this.field9637[var18] -= field9693;
				this.field9619[var18] -= field9694;
				this.field9636[var18] = this.field9636[var18] * arg1 / 128;
				this.field9637[var18] = this.field9637[var18] * arg2 / 128;
				this.field9619[var18] = this.field9619[var18] * arg3 / 128;
				this.field9636[var18] += field9692;
				this.field9637[var18] += field9693;
				this.field9619[var18] += field9694;
			}
		} else if (arg0 == 5) {
			for (int var19 = 0; var19 < this.field9670; var19++) {
				int var20 = (this.field9683[var19] & 0xFF) + arg1 * 8;
				if (var20 < 0) {
					var20 = 0;
				} else if (var20 > 255) {
					var20 = 255;
				}
				this.field9683[var19] = (byte) var20;
			}
			if (this.field9665 != null) {
				this.field9665.field1111 = null;
			}
			if (this.field9656 != null) {
				for (int var21 = 0; var21 < this.field9660; var21++) {
					GlModelRelated2 var22 = this.field9656[var21];
					GlModelRelated3 var23 = this.field9639[var21];
					var23.field1054 = var23.field1054 & 0xFFFFFF | 255 - (this.field9683[var22.field1192] & 0xFF) << 24;
				}
			}
		} else if (arg0 == 7) {
			for (int var24 = 0; var24 < this.field9670; var24++) {
				int var25 = this.field9651[var24] & 0xFFFF;
				int var26 = var25 >> 10 & 0x3F;
				int var27 = var25 >> 7 & 0x7;
				int var28 = var25 & 0x7F;
				int var29 = arg1 + var26 & 0x3F;
				int var30 = arg2 / 4 + var27;
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
				this.field9651[var24] = (short) (var29 << 10 | var30 << 7 | var31);
			}
			if (this.field9665 != null) {
				this.field9665.field1111 = null;
			}
			if (this.field9656 != null) {
				for (int var32 = 0; var32 < this.field9660; var32++) {
					GlModelRelated2 var33 = this.field9656[var32];
					GlModelRelated3 var34 = this.field9639[var32];
					var34.field1054 = var34.field1054 & 0xFF000000 | ColourUtils.field8151[this.field9651[var33.field1192] & 0xFFFF] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 8) {
			for (int var35 = 0; var35 < this.field9660; var35++) {
				GlModelRelated3 var36 = this.field9639[var35];
				var36.field1049 += arg1;
				var36.field1052 += arg2;
			}
		} else if (arg0 == 10) {
			for (int var37 = 0; var37 < this.field9660; var37++) {
				GlModelRelated3 var38 = this.field9639[var37];
				var38.field1050 = var38.field1050 * arg1 >> 7;
				var38.field1051 = var38.field1051 * arg2 >> 7;
			}
		} else if (arg0 == 9) {
			for (int var39 = 0; var39 < this.field9660; var39++) {
				GlModelRelated3 var40 = this.field9639[var39];
				var40.field1053 = var40.field1053 + arg1 & 0x3FFF;
			}
		}
	}

	@ObfuscatedName("afk.at(I[IIIIIZ)V")
	public void applyTransform(int type, int[] labels, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = labels.length;
		if (type == 0) {
			int var9 = arg2 << 4;
			int var10 = arg3 << 4;
			int var11 = arg4 << 4;
			int var12 = 0;
			field9692 = 0;
			field9693 = 0;
			field9694 = 0;
			for (int var13 = 0; var13 < var8; var13++) {
				int var14 = labels[var13];
				if (var14 < this.field9638.length) {
					int[] var15 = this.field9638[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						field9692 += this.field9636[var17];
						field9693 += this.field9637[var17];
						field9694 += this.field9619[var17];
						var12++;
					}
				}
			}
			if (var12 > 0) {
				field9692 = field9692 / var12 + var9;
				field9693 = field9693 / var12 + var10;
				field9694 = field9694 / var12 + var11;
			} else {
				field9692 = var9;
				field9693 = var10;
				field9694 = var11;
			}
		} else if (type == 1) {
			int var18 = arg2 << 4;
			int var19 = arg3 << 4;
			int var20 = arg4 << 4;
			for (int var21 = 0; var21 < var8; var21++) {
				int var22 = labels[var21];
				if (var22 < this.field9638.length) {
					int[] var23 = this.field9638[var22];
					for (int var24 = 0; var24 < var23.length; var24++) {
						int var25 = var23[var24];
						this.field9636[var25] += var18;
						this.field9637[var25] += var19;
						this.field9619[var25] += var20;
					}
				}
			}
		} else if (type == 2) {
			for (int var26 = 0; var26 < var8; var26++) {
				int var27 = labels[var26];
				if (var27 < this.field9638.length) {
					int[] var28 = this.field9638[var27];
					if ((arg5 & 0x1) == 0) {
						for (int var29 = 0; var29 < var28.length; var29++) {
							int var30 = var28[var29];
							this.field9636[var30] -= field9692;
							this.field9637[var30] -= field9693;
							this.field9619[var30] -= field9694;
							if (arg4 != 0) {
								int var31 = Trig1.sin[arg4];
								int var32 = Trig1.cos[arg4];
								int var33 = this.field9637[var30] * var31 + this.field9636[var30] * var32 + 16383 >> 14;
								this.field9637[var30] = this.field9637[var30] * var32 - this.field9636[var30] * var31 + 16383 >> 14;
								this.field9636[var30] = var33;
							}
							if (arg2 != 0) {
								int var34 = Trig1.sin[arg2];
								int var35 = Trig1.cos[arg2];
								int var36 = this.field9637[var30] * var35 - this.field9619[var30] * var34 + 16383 >> 14;
								this.field9619[var30] = this.field9637[var30] * var34 + this.field9619[var30] * var35 + 16383 >> 14;
								this.field9637[var30] = var36;
							}
							if (arg3 != 0) {
								int var37 = Trig1.sin[arg3];
								int var38 = Trig1.cos[arg3];
								int var39 = this.field9636[var30] * var38 + this.field9619[var30] * var37 + 16383 >> 14;
								this.field9619[var30] = this.field9619[var30] * var38 - this.field9636[var30] * var37 + 16383 >> 14;
								this.field9636[var30] = var39;
							}
							this.field9636[var30] += field9692;
							this.field9637[var30] += field9693;
							this.field9619[var30] += field9694;
						}
					} else {
						for (int var40 = 0; var40 < var28.length; var40++) {
							int var41 = var28[var40];
							this.field9636[var41] -= field9692;
							this.field9637[var41] -= field9693;
							this.field9619[var41] -= field9694;
							if (arg2 != 0) {
								int var42 = Trig1.sin[arg2];
								int var43 = Trig1.cos[arg2];
								int var44 = this.field9637[var41] * var43 - this.field9619[var41] * var42 + 16383 >> 14;
								this.field9619[var41] = this.field9637[var41] * var42 + this.field9619[var41] * var43 + 16383 >> 14;
								this.field9637[var41] = var44;
							}
							if (arg4 != 0) {
								int var45 = Trig1.sin[arg4];
								int var46 = Trig1.cos[arg4];
								int var47 = this.field9637[var41] * var45 + this.field9636[var41] * var46 + 16383 >> 14;
								this.field9637[var41] = this.field9637[var41] * var46 - this.field9636[var41] * var45 + 16383 >> 14;
								this.field9636[var41] = var47;
							}
							if (arg3 != 0) {
								int var48 = Trig1.sin[arg3];
								int var49 = Trig1.cos[arg3];
								int var50 = this.field9636[var41] * var49 + this.field9619[var41] * var48 + 16383 >> 14;
								this.field9619[var41] = this.field9619[var41] * var49 - this.field9636[var41] * var48 + 16383 >> 14;
								this.field9636[var41] = var50;
							}
							this.field9636[var41] += field9692;
							this.field9637[var41] += field9693;
							this.field9619[var41] += field9694;
						}
					}
				}
			}
			if (arg6) {
				for (int var51 = 0; var51 < var8; var51++) {
					int var52 = labels[var51];
					if (var52 < this.field9638.length) {
						int[] var53 = this.field9638[var52];
						for (int var54 = 0; var54 < var53.length; var54++) {
							int var55 = var53[var54];
							int var56 = this.field9679[var55];
							int var57 = this.field9679[var55 + 1];
							for (int var58 = var56; var58 < var57 && this.field9680[var58] != 0; var58++) {
								int var59 = (this.field9680[var58] & 0xFFFF) - 1;
								if (arg4 != 0) {
									int var60 = Trig1.sin[arg4];
									int var61 = Trig1.cos[arg4];
									int var62 = this.field9682[var59] * var60 + this.field9681[var59] * var61 + 16383 >> 14;
									this.field9682[var59] = (short) (this.field9682[var59] * var61 - this.field9681[var59] * var60 + 16383 >> 14);
									this.field9681[var59] = (short) var62;
								}
								if (arg2 != 0) {
									int var63 = Trig1.sin[arg2];
									int var64 = Trig1.cos[arg2];
									int var65 = this.field9682[var59] * var64 - this.field9644[var59] * var63 + 16383 >> 14;
									this.field9644[var59] = (short) (this.field9682[var59] * var63 + this.field9644[var59] * var64 + 16383 >> 14);
									this.field9682[var59] = (short) var65;
								}
								if (arg3 != 0) {
									int var66 = Trig1.sin[arg3];
									int var67 = Trig1.cos[arg3];
									int var68 = this.field9681[var59] * var67 + this.field9644[var59] * var66 + 16383 >> 14;
									this.field9644[var59] = (short) (this.field9644[var59] * var67 - this.field9681[var59] * var66 + 16383 >> 14);
									this.field9681[var59] = (short) var68;
								}
							}
						}
					}
				}
				if (this.field9673 == null && this.field9665 != null) {
					this.field9665.field1111 = null;
				}
				if (this.field9673 != null) {
					this.field9673.field1111 = null;
				}
			}
		} else if (type == 3) {
			for (int var69 = 0; var69 < var8; var69++) {
				int var70 = labels[var69];
				if (var70 < this.field9638.length) {
					int[] var71 = this.field9638[var70];
					for (int var72 = 0; var72 < var71.length; var72++) {
						int var73 = var71[var72];
						this.field9636[var73] -= field9692;
						this.field9637[var73] -= field9693;
						this.field9619[var73] -= field9694;
						this.field9636[var73] = this.field9636[var73] * arg2 >> 7;
						this.field9637[var73] = this.field9637[var73] * arg3 >> 7;
						this.field9619[var73] = this.field9619[var73] * arg4 >> 7;
						this.field9636[var73] += field9692;
						this.field9637[var73] += field9693;
						this.field9619[var73] += field9694;
					}
				}
			}
		} else if (type == 5) {
			if (this.field9649 != null) {
				for (int var74 = 0; var74 < var8; var74++) {
					int var75 = labels[var74];
					if (var75 < this.field9649.length) {
						int[] var76 = this.field9649[var75];
						for (int var77 = 0; var77 < var76.length; var77++) {
							int var78 = var76[var77];
							int var79 = (this.field9683[var78] & 0xFF) + arg2 * 8;
							if (var79 < 0) {
								var79 = 0;
							} else if (var79 > 255) {
								var79 = 255;
							}
							this.field9683[var78] = (byte) var79;
						}
						if (var76.length > 0 && this.field9665 != null) {
							this.field9665.field1111 = null;
						}
					}
				}
				if (this.field9656 != null) {
					for (int var80 = 0; var80 < this.field9660; var80++) {
						GlModelRelated2 var81 = this.field9656[var80];
						GlModelRelated3 var82 = this.field9639[var80];
						var82.field1054 = var82.field1054 & 0xFFFFFF | 255 - (this.field9683[var81.field1192] & 0xFF) << 24;
					}
				}
			}
		} else if (type == 7) {
			if (this.field9649 != null) {
				for (int var83 = 0; var83 < var8; var83++) {
					int var84 = labels[var83];
					if (var84 < this.field9649.length) {
						int[] var85 = this.field9649[var84];
						for (int var86 = 0; var86 < var85.length; var86++) {
							int var87 = var85[var86];
							int var88 = this.field9651[var87] & 0xFFFF;
							int var89 = var88 >> 10 & 0x3F;
							int var90 = var88 >> 7 & 0x7;
							int var91 = var88 & 0x7F;
							int var92 = arg2 + var89 & 0x3F;
							int var93 = arg3 / 4 + var90;
							if (var93 < 0) {
								var93 = 0;
							} else if (var93 > 7) {
								var93 = 7;
							}
							int var94 = arg4 + var91;
							if (var94 < 0) {
								var94 = 0;
							} else if (var94 > 127) {
								var94 = 127;
							}
							this.field9651[var87] = (short) (var92 << 10 | var93 << 7 | var94);
						}
						if (var85.length > 0 && this.field9665 != null) {
							this.field9665.field1111 = null;
						}
					}
				}
				if (this.field9656 != null) {
					for (int var95 = 0; var95 < this.field9660; var95++) {
						GlModelRelated2 var96 = this.field9656[var95];
						GlModelRelated3 var97 = this.field9639[var95];
						var97.field1054 = var97.field1054 & 0xFF000000 | ColourUtils.field8151[this.field9651[var96.field1192] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (type == 8) {
			if (this.field9686 != null) {
				for (int var98 = 0; var98 < var8; var98++) {
					int var99 = labels[var98];
					if (var99 < this.field9686.length) {
						int[] var100 = this.field9686[var99];
						for (int var101 = 0; var101 < var100.length; var101++) {
							GlModelRelated3 var102 = this.field9639[var100[var101]];
							var102.field1049 += arg2;
							var102.field1052 += arg3;
						}
					}
				}
			}
		} else if (type == 10) {
			if (this.field9686 != null) {
				for (int var103 = 0; var103 < var8; var103++) {
					int var104 = labels[var103];
					if (var104 < this.field9686.length) {
						int[] var105 = this.field9686[var104];
						for (int var106 = 0; var106 < var105.length; var106++) {
							GlModelRelated3 var107 = this.field9639[var105[var106]];
							var107.field1050 = var107.field1050 * arg2 >> 7;
							var107.field1051 = var107.field1051 * arg3 >> 7;
						}
					}
				}
			}
		} else if (type == 9 && this.field9686 != null) {
			for (int var108 = 0; var108 < var8; var108++) {
				int var109 = labels[var108];
				if (var109 < this.field9686.length) {
					int[] var110 = this.field9686[var109];
					for (int var111 = 0; var111 < var110.length; var111++) {
						GlModelRelated3 var112 = this.field9639[var110[var111]];
						var112.field1053 = var112.field1053 + arg2 & 0x3FFF;
					}
				}
			}
		}
	}

	@ObfuscatedName("afk.ad(I[IIIIIZ)V")
	public void method1711(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		if (arg0 != 0) {
			this.applyTransform(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		int var8 = arg2 << 4;
		int var9 = arg3 << 4;
		int var10 = arg4 << 4;
		field9692 = var8;
		field9693 = var9;
		field9694 = var10;
	}

	@ObfuscatedName("afk.au(I[IIIIZI[I)V")
	public void method1720(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		if (arg0 != 0) {
			this.method1719(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		int var9 = arg2 << 4;
		int var10 = arg3 << 4;
		int var11 = arg4 << 4;
		field9692 = var9;
		field9693 = var10;
		field9694 = var11;
	}

	@ObfuscatedName("afk.ap()V")
	public void method1776() {
		for (int var1 = 0; var1 < this.field9634; var1++) {
			this.field9636[var1] = this.field9636[var1] + 7 >> 4;
			this.field9637[var1] = this.field9637[var1] + 7 >> 4;
			this.field9619[var1] = this.field9619[var1] + 7 >> 4;
		}
		if (this.field9659 != null) {
			this.field9659.field1111 = null;
		}
		this.field9669 = false;
	}

	@ObfuscatedName("afk.aq(Lou;IZ)V")
	public void method1771(Matrix4x3 arg0, int arg1, boolean arg2) {
		if (this.field9640 == null) {
			return;
		}
		Matrix4x3 var4 = arg0;
		if (arg2) {
			var4 = this.field9626.field9976;
			var4.method6299(arg0);
		}
		float[] var5 = new float[3];
		for (int var6 = 0; var6 < this.field9635; var6++) {
			if ((arg1 & this.field9640[var6]) != 0) {
				var4.method6295((float) this.field9636[var6], (float) this.field9637[var6], (float) this.field9619[var6], var5);
				this.field9636[var6] = (int) var5[0];
				this.field9637[var6] = (int) var5[1];
				this.field9619[var6] = (int) var5[2];
			}
		}
	}

	@ObfuscatedName("afk.bw()[Lcq;")
	public ModelParticleEffector[] method1765() {
		return this.field9641;
	}

	@ObfuscatedName("afk.bu()[Ldu;")
	public ModelParticleEmitter[] method1750() {
		return this.field9687;
	}

	@ObfuscatedName("afk.by(Lou;)V")
	public void method1689(Matrix4x3 arg0) {
		Matrix4x4 var2 = this.field9626.field9919;
		var2.setToMatrix4x3(arg0);
		if (this.field9687 != null) {
			for (int var3 = 0; var3 < this.field9687.length; var3++) {
				ModelParticleEmitter var4 = this.field9687[var3];
				ModelParticleEmitter var5 = var4;
				if (var4.field1465 != null) {
					var5 = var4.field1465;
				}
				var5.field1470 = (int) (var2.entries[8] * (float) this.field9619[var4.field1476] + var2.entries[0] * (float) this.field9636[var4.field1476] + var2.entries[4] * (float) this.field9637[var4.field1476] + var2.entries[12]);
				var5.field1474 = (int) (var2.entries[9] * (float) this.field9619[var4.field1476] + var2.entries[1] * (float) this.field9636[var4.field1476] + var2.entries[5] * (float) this.field9637[var4.field1476] + var2.entries[13]);
				var5.field1472 = (int) (var2.entries[10] * (float) this.field9619[var4.field1476] + var2.entries[2] * (float) this.field9636[var4.field1476] + var2.entries[6] * (float) this.field9637[var4.field1476] + var2.entries[14]);
				var5.field1473 = (int) (var2.entries[8] * (float) this.field9619[var4.field1467] + var2.entries[0] * (float) this.field9636[var4.field1467] + var2.entries[4] * (float) this.field9637[var4.field1467] + var2.entries[12]);
				var5.field1469 = (int) (var2.entries[9] * (float) this.field9619[var4.field1467] + var2.entries[1] * (float) this.field9636[var4.field1467] + var2.entries[5] * (float) this.field9637[var4.field1467] + var2.entries[13]);
				var5.field1475 = (int) (var2.entries[10] * (float) this.field9619[var4.field1467] + var2.entries[2] * (float) this.field9636[var4.field1467] + var2.entries[6] * (float) this.field9637[var4.field1467] + var2.entries[14]);
				var5.field1464 = (int) (var2.entries[8] * (float) this.field9619[var4.field1468] + var2.entries[0] * (float) this.field9636[var4.field1468] + var2.entries[4] * (float) this.field9637[var4.field1468] + var2.entries[12]);
				var5.field1466 = (int) (var2.entries[9] * (float) this.field9619[var4.field1468] + var2.entries[1] * (float) this.field9636[var4.field1468] + var2.entries[5] * (float) this.field9637[var4.field1468] + var2.entries[13]);
				var5.field1478 = (int) (var2.entries[10] * (float) this.field9619[var4.field1468] + var2.entries[2] * (float) this.field9636[var4.field1468] + var2.entries[6] * (float) this.field9637[var4.field1468] + var2.entries[14]);
			}
		}
		if (this.field9641 == null) {
			return;
		}
		for (int var6 = 0; var6 < this.field9641.length; var6++) {
			ModelParticleEffector var7 = this.field9641[var6];
			ModelParticleEffector var8 = var7;
			if (var7.field1230 != null) {
				var8 = var7.field1230;
			}
			if (var7.field1231 == null) {
				var7.field1231 = new Matrix4x4(var2);
			} else {
				var7.field1231.setTo(var2);
			}
			var8.field1226 = (int) (var2.entries[8] * (float) this.field9619[var7.field1225] + var2.entries[0] * (float) this.field9636[var7.field1225] + var2.entries[4] * (float) this.field9637[var7.field1225] + var2.entries[12]);
			var8.field1229 = (int) (var2.entries[9] * (float) this.field9619[var7.field1225] + var2.entries[1] * (float) this.field9636[var7.field1225] + var2.entries[5] * (float) this.field9637[var7.field1225] + var2.entries[13]);
			var8.field1227 = (int) (var2.entries[10] * (float) this.field9619[var7.field1225] + var2.entries[2] * (float) this.field9636[var7.field1225] + var2.entries[6] * (float) this.field9637[var7.field1225] + var2.entries[14]);
		}
	}

	@ObfuscatedName("afk.av(IILou;ZI)Z")
	public boolean method1725(int arg0, int arg1, Matrix4x3 arg2, boolean arg3, int arg4) {
		Matrix4x4 var6 = this.field9626.field9919;
		var6.setToMatrix4x3(arg2);
		var6.multiply(this.field9626.field10005);
		boolean var7 = false;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;
		int var10 = Integer.MAX_VALUE;
		int var11 = Integer.MIN_VALUE;
		if (!this.field9669) {
			this.method15552();
		}
		int var12 = this.field9643 - this.field9672 >> 1;
		int var13 = this.field9674 - this.field9657 >> 1;
		int var14 = this.field9675 - this.field9671 >> 1;
		int var15 = this.field9672 + var12;
		int var16 = this.field9657 + var13;
		int var17 = this.field9671 + var14;
		int var18 = var15 - (var12 << arg4);
		int var19 = var16 - (var13 << arg4);
		int var20 = var17 - (var14 << arg4);
		int var21 = (var12 << arg4) + var15;
		int var22 = (var13 << arg4) + var16;
		int var23 = (var14 << arg4) + var17;
		field9689[0] = var18;
		field9642[0] = var19;
		field9691[0] = var20;
		field9689[1] = var21;
		field9642[1] = var19;
		field9691[1] = var20;
		field9689[2] = var18;
		field9642[2] = var22;
		field9691[2] = var20;
		field9689[3] = var21;
		field9642[3] = var22;
		field9691[3] = var20;
		field9689[4] = var18;
		field9642[4] = var19;
		field9691[4] = var23;
		field9689[5] = var21;
		field9642[5] = var19;
		field9691[5] = var23;
		field9689[6] = var18;
		field9642[6] = var22;
		field9691[6] = var23;
		field9689[7] = var21;
		field9642[7] = var22;
		field9691[7] = var23;
		for (int var24 = 0; var24 < 8; var24++) {
			int var25 = field9689[var24];
			int var26 = field9642[var24];
			int var27 = field9691[var24];
			float var28 = var6.entries[10] * (float) var27 + var6.entries[2] * (float) var25 + var6.entries[6] * (float) var26 + var6.entries[14];
			float var29 = var6.entries[11] * (float) var27 + var6.entries[3] * (float) var25 + var6.entries[7] * (float) var26 + var6.entries[15];
			if (var28 >= -var29) {
				float var30 = var6.entries[8] * (float) var27 + var6.entries[0] * (float) var25 + var6.entries[4] * (float) var26 + var6.entries[12];
				float var31 = var6.entries[9] * (float) var27 + var6.entries[1] * (float) var25 + var6.entries[5] * (float) var26 + var6.entries[13];
				int var32 = (int) (this.field9626.field9867 * var30 / var29 + this.field9626.field9910);
				int var33 = (int) (this.field9626.field9882 * var31 / var29 + this.field9626.field9912);
				if (var32 < var8) {
					var8 = var32;
				}
				if (var32 > var9) {
					var9 = var32;
				}
				if (var33 < var10) {
					var10 = var33;
				}
				if (var33 > var11) {
					var11 = var33;
				}
				var7 = true;
			}
		}
		if (var7 && arg0 > var8 && arg0 < var9 && arg1 > var10 && arg1 < var11) {
			if (arg3) {
				return true;
			}
			if (this.field9626.field9993.length < this.field9658) {
				this.field9626.field9993 = new int[this.field9658];
				this.field9626.field9913 = new int[this.field9658];
			}
			int[] var34 = this.field9626.field9993;
			int[] var35 = this.field9626.field9913;
			for (int var36 = 0; var36 < this.field9635; var36++) {
				int var37 = this.field9636[var36];
				int var38 = this.field9637[var36];
				int var39 = this.field9619[var36];
				float var40 = var6.entries[10] * (float) var39 + var6.entries[2] * (float) var37 + var6.entries[6] * (float) var38 + var6.entries[14];
				float var41 = var6.entries[11] * (float) var39 + var6.entries[3] * (float) var37 + var6.entries[7] * (float) var38 + var6.entries[15];
				if (var40 >= -var41) {
					float var42 = var6.entries[8] * (float) var39 + var6.entries[0] * (float) var37 + var6.entries[4] * (float) var38 + var6.entries[12];
					float var43 = var6.entries[9] * (float) var39 + var6.entries[1] * (float) var37 + var6.entries[5] * (float) var38 + var6.entries[13];
					int var44 = this.field9679[var36];
					int var45 = this.field9679[var36 + 1];
					for (int var46 = var44; var46 < var45 && this.field9680[var46] != 0; var46++) {
						int var47 = (this.field9680[var46] & 0xFFFF) - 1;
						var34[var47] = (int) (this.field9626.field9867 * var42 / var41 + this.field9626.field9910);
						var35[var47] = (int) (this.field9626.field9882 * var43 / var41 + this.field9626.field9912);
					}
				} else {
					int var48 = this.field9679[var36];
					int var49 = this.field9679[var36 + 1];
					for (int var50 = var48; var50 < var49 && this.field9680[var50] != 0; var50++) {
						int var51 = (this.field9680[var50] & 0xFFFF) - 1;
						var34[var51] = -999999;
					}
				}
			}
			for (int var52 = 0; var52 < this.field9670; var52++) {
				if (var34[this.field9653[var52] & 0xFFFF] != -999999 && var34[this.field9652[var52] & 0xFFFF] != -999999 && var34[this.field9646[var52] & 0xFFFF] != -999999 && this.method15554(arg0, arg1, var35[this.field9653[var52] & 0xFFFF], var35[this.field9652[var52] & 0xFFFF], var35[this.field9646[var52] & 0xFFFF], var34[this.field9653[var52] & 0xFFFF], var34[this.field9652[var52] & 0xFFFF], var34[this.field9646[var52] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("afk.hs(IIIIIIII)Z")
	public boolean method15554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@ObfuscatedName("afk.ao(Lara;)Lara;")
	public HardShadow method1726(HardShadow arg0) {
		if (this.field9658 == 0) {
			return null;
		}
		if (!this.field9669) {
			this.method15552();
		}
		int var2;
		int var3;
		if (this.field9626.field9915 > 0) {
			var2 = this.field9672 - (this.field9626.field9915 * this.field9674 >> 8) >> this.field9626.field9874;
			var3 = this.field9643 - (this.field9626.field9915 * this.field9657 >> 8) >> this.field9626.field9874;
		} else {
			var2 = this.field9672 - (this.field9626.field9915 * this.field9657 >> 8) >> this.field9626.field9874;
			var3 = this.field9643 - (this.field9626.field9915 * this.field9674 >> 8) >> this.field9626.field9874;
		}
		int var4;
		int var5;
		if (this.field9626.field9953 > 0) {
			var4 = this.field9671 - (this.field9626.field9953 * this.field9674 >> 8) >> this.field9626.field9874;
			var5 = this.field9675 - (this.field9626.field9953 * this.field9657 >> 8) >> this.field9626.field9874;
		} else {
			var4 = this.field9671 - (this.field9626.field9953 * this.field9657 >> 8) >> this.field9626.field9874;
			var5 = this.field9675 - (this.field9626.field9953 * this.field9674 >> 8) >> this.field9626.field9874;
		}
		int var6 = var3 - var2 + 1;
		int var7 = var5 - var4 + 1;
		GlHardShadow var8 = (GlHardShadow) arg0;
		GlHardShadow var9;
		if (var8 != null && var8.method19687(var6, var7)) {
			var9 = var8;
			var8.method19693();
		} else {
			var9 = new GlHardShadow(this.field9626, var6, var7);
		}
		var9.method19686(var2, var4, var3, var5);
		this.method15555(var9);
		return var9;
	}

	@ObfuscatedName("afk.hh(Latk;)V")
	public void method15555(GlHardShadow arg0) {
		if (this.field9626.field9993.length < this.field9658) {
			this.field9626.field9993 = new int[this.field9658];
			this.field9626.field9913 = new int[this.field9658];
		}
		int[] var2 = this.field9626.field9993;
		int[] var3 = this.field9626.field9913;
		for (int var4 = 0; var4 < this.field9635; var4++) {
			int var5 = (this.field9636[var4] - (this.field9637[var4] * this.field9626.field9915 >> 8) >> this.field9626.field9874) - arg0.field12540;
			int var6 = (this.field9619[var4] - (this.field9637[var4] * this.field9626.field9953 >> 8) >> this.field9626.field9874) - arg0.field12537;
			int var7 = this.field9679[var4];
			int var8 = this.field9679[var4 + 1];
			for (int var9 = var7; var9 < var8 && this.field9680[var9] != 0; var9++) {
				int var10 = (this.field9680[var9] & 0xFFFF) - 1;
				var2[var10] = var5;
				var3[var10] = var6;
			}
		}
		for (int var11 = 0; var11 < this.field9650; var11++) {
			if (this.field9683 == null || this.field9683[var11] <= 128) {
				int var12 = this.field9653[var11] & 0xFFFF;
				int var13 = this.field9652[var11] & 0xFFFF;
				int var14 = this.field9646[var11] & 0xFFFF;
				int var15 = var2[var12];
				int var16 = var2[var13];
				int var17 = var2[var14];
				int var18 = var3[var12];
				int var19 = var3[var13];
				int var20 = var3[var14];
				if ((var15 - var16) * (var19 - var20) - (var17 - var16) * (var19 - var18) > 0) {
					arg0.method19689(var18, var19, var20, var15, var16, var17);
				}
			}
		}
	}

	@ObfuscatedName("afk.ax(Lou;Led;I)V")
	public void draw(Matrix4x3 arg0, ScreenBoundingBox arg1, int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.field9658 == 0) {
			return;
		}
		Matrix4x4 var4 = this.field9626.field9939;
		Matrix4x4 var5 = this.field9626.field9919;
		Matrix4x4 var6 = this.field9626.field9920;
		var5.setToMatrix4x3(arg0);
		var6.setTo(var5);
		var6.multiply(this.field9626.field10005);
		if (!this.field9669) {
			this.method15552();
		}
		float[] var7 = this.field9626.field9857;
		var5.method6614(0.0F, (float) this.field9657, 0.0F, var7);
		float var8 = var7[0];
		float var9 = var7[1];
		float var10 = var7[2];
		var5.method6614(0.0F, (float) this.field9674, 0.0F, var7);
		float var11 = var7[0];
		float var12 = var7[1];
		float var13 = var7[2];
		for (int var14 = 0; var14 < 6; var14++) {
			float[] var15 = this.field9626.field10015[var14];
			float var16 = var15[2] * var10 + var15[0] * var8 + var15[1] * var9 + var15[3] + (float) this.field9668;
			float var17 = var15[2] * var13 + var15[0] * var11 + var15[1] * var12 + var15[3] + (float) this.field9668;
			if (var16 < 0.0F && var17 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			boolean var18 = false;
			boolean var19 = true;
			int var20 = this.field9672 + this.field9643 >> 1;
			int var21 = this.field9675 + this.field9671 >> 1;
			short var23 = this.field9657;
			float var25 = var6.entries[8] * (float) var21 + var6.entries[0] * (float) var20 + var6.entries[4] * (float) var23 + var6.entries[12];
			float var26 = var6.entries[9] * (float) var21 + var6.entries[1] * (float) var20 + var6.entries[5] * (float) var23 + var6.entries[13];
			float var27 = var6.entries[10] * (float) var21 + var6.entries[2] * (float) var20 + var6.entries[6] * (float) var23 + var6.entries[14];
			float var28 = var6.entries[11] * (float) var21 + var6.entries[3] * (float) var20 + var6.entries[7] * (float) var23 + var6.entries[15];
			if (var27 >= -var28) {
				arg1.field1683 = (int) (this.field9626.field9867 * var25 / var28 + this.field9626.field9910);
				arg1.field1684 = (int) (this.field9626.field9882 * var26 / var28 + this.field9626.field9912);
			} else {
				var18 = true;
			}
			short var30 = this.field9674;
			float var32 = var6.entries[8] * (float) var21 + var6.entries[0] * (float) var20 + var6.entries[4] * (float) var30 + var6.entries[12];
			float var33 = var6.entries[9] * (float) var21 + var6.entries[1] * (float) var20 + var6.entries[5] * (float) var30 + var6.entries[13];
			float var34 = var6.entries[10] * (float) var21 + var6.entries[2] * (float) var20 + var6.entries[6] * (float) var30 + var6.entries[14];
			float var35 = var6.entries[11] * (float) var21 + var6.entries[3] * (float) var20 + var6.entries[7] * (float) var30 + var6.entries[15];
			if (var34 >= -var35) {
				arg1.field1682 = (int) (this.field9626.field9867 * var32 / var35 + this.field9626.field9910);
				arg1.field1685 = (int) (this.field9626.field9882 * var33 / var35 + this.field9626.field9912);
			} else {
				var18 = true;
			}
			if (var18) {
				if (var27 < -var28 && var34 < -var35) {
					var19 = false;
				} else if (var27 < -var28) {
					float var36 = (var27 + var28) / (var34 + var35) - 1.0F;
					float var37 = (var32 - var25) * var36 + var25;
					float var38 = (var33 - var26) * var36 + var26;
					float var39 = (var35 - var28) * var36 + var28;
					arg1.field1683 = (int) (this.field9626.field9867 * var37 / var39 + this.field9626.field9910);
					arg1.field1684 = (int) (this.field9626.field9882 * var38 / var39 + this.field9626.field9912);
				} else if (var34 < -var35) {
					float var40 = (var34 + var35) / (var27 + var28) - 1.0F;
					float var41 = (var25 - var32) * var40 + var32;
					float var42 = (var26 - var33) * var40 + var33;
					float var43 = (var28 - var35) * var40 + var35;
					arg1.field1682 = (int) (this.field9626.field9867 * var41 / var43 + this.field9626.field9910);
					arg1.field1685 = (int) (this.field9626.field9882 * var42 / var43 + this.field9626.field9912);
				}
			}
			if (var19) {
				if (var27 / var28 > var34 / var35) {
					float var44 = var4.entries[0] * (float) this.field9668 + var25 + var4.entries[12];
					float var45 = var4.entries[3] * (float) this.field9668 + var28 + var4.entries[15];
					arg1.field1687 = (int) (this.field9626.field9867 * var44 / var45 + (this.field9626.field9910 - (float) arg1.field1683));
				} else {
					float var46 = var4.entries[0] * (float) this.field9668 + var32 + var4.entries[12];
					float var47 = var4.entries[3] * (float) this.field9668 + var35 + var4.entries[15];
					arg1.field1687 = (int) (this.field9626.field9867 * var46 / var47 + (this.field9626.field9910 - (float) arg1.field1682));
				}
				arg1.field1686 = true;
			}
		}
		this.field9626.method15773();
		this.field9626.method15818(var5);
		this.method15556();
		this.field9626.method15745();
		var5.multiply(this.field9626.field9903);
		this.method15557(var5);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@ObfuscatedName("afk.hp()V")
	public void method15556() {
		if (this.field9650 == 0) {
			return;
		}
		if (this.field9629 != 0) {
			this.method15558(true);
		}
		this.method15558(false);
		if (this.field9663 != null) {
			if (this.field9663.field1109 == null) {
				this.method15553((this.field9629 & 0x10) != 0);
			}
			if (this.field9663.field1109 != null) {
				this.field9626.method15764(this.field9673 != null);
				this.field9626.method15809(this.field9659, this.field9673, this.field9665, this.field9664);
				int var1 = this.field9678.length - 1;
				for (int var2 = 0; var2 < var1; var2++) {
					int var3 = this.field9678[var2];
					int var4 = this.field9678[var2 + 1];
					int var5 = this.field9685[var3] == -1 ? -1 : this.field9685[var3] & 0xFFFF;
					this.field9626.method15775(var5, this.field9673 != null);
					this.field9626.method15921(this.field9663.field1109, 4, var3 * 3, (var4 - var3) * 3);
				}
			}
		}
		this.method15551();
	}

	@ObfuscatedName("afk.hy(Lpq;)V")
	public void method15557(Matrix4x4 arg0) {
		if (this.field9656 == null) {
			return;
		}
		Matrix4x4 var2 = this.field9626.field9842;
		this.field9626.method15744();
		this.field9626.method2219(!this.field9632);
		this.field9626.method15764(false);
		this.field9626.method15809(this.field9626.field9918, null, null, this.field9626.field10012);
		for (int var3 = 0; var3 < this.field9660; var3++) {
			GlModelRelated2 var4 = this.field9656[var3];
			GlModelRelated3 var5 = this.field9639[var3];
			if (!var4.field1200 || !this.field9626.isBloomEnabled()) {
				float var6 = (float) (this.field9636[var4.field1199] + this.field9636[var4.field1193] + this.field9636[var4.field1195]) * 0.3333333F;
				float var7 = (float) (this.field9637[var4.field1199] + this.field9637[var4.field1193] + this.field9637[var4.field1195]) * 0.3333333F;
				float var8 = (float) (this.field9619[var4.field1199] + this.field9619[var4.field1193] + this.field9619[var4.field1195]) * 0.3333333F;
				float var9 = arg0.entries[8] * var8 + arg0.entries[0] * var6 + arg0.entries[4] * var7 + arg0.entries[12];
				float var10 = arg0.entries[9] * var8 + arg0.entries[1] * var6 + arg0.entries[5] * var7 + arg0.entries[13];
				float var11 = arg0.entries[10] * var8 + arg0.entries[2] * var6 + arg0.entries[6] * var7 + arg0.entries[14];
				float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field1201;
				var2.method6687(var5.field1053, var4.field1198 * var5.field1050 >> 7, var4.field1197 * var5.field1051 >> 7, (float) var5.field1049 + var9 - var9 * var12, (float) var5.field1052 + var10 - var10 * var12, var11 - var11 * var12);
				this.field9626.method15928(var2);
				int var13 = var5.field1054;
				OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
				this.field9626.method15774(var4.field1196);
				this.field9626.method15791(var4.field1194);
				this.field9626.method15801(7, 0, 4);
			}
		}
		this.field9626.method2219(true);
		this.field9626.method15745();
	}

	@ObfuscatedName("afk.he(Z)V")
	public void method15553(boolean arg0) {
		if (this.field9626.field10016.data.length < this.field9650 * 6) {
			this.field9626.field10016 = new GpuPacket((this.field9650 + 100) * 6);
		} else {
			this.field9626.field10016.pos = 0;
		}
		GpuPacket var2 = this.field9626.field10016;
		if (this.field9626.field10017) {
			for (int var3 = 0; var3 < this.field9650; var3++) {
				var2.p2(this.field9653[var3]);
				var2.p2(this.field9652[var3]);
				var2.p2(this.field9646[var3]);
			}
		} else {
			for (int var4 = 0; var4 < this.field9650; var4++) {
				var2.ip2(this.field9653[var4]);
				var2.ip2(this.field9652[var4]);
				var2.ip2(this.field9646[var4]);
			}
		}
		if (var2.pos == 0) {
			return;
		}
		if (arg0) {
			if (this.field9654 == null) {
				this.field9654 = this.field9626.method15766(5123, var2.data, var2.pos, true);
			} else {
				this.field9654.method1410(5123, var2.data, var2.pos);
			}
			this.field9663.field1109 = this.field9654;
		} else {
			this.field9663.field1109 = this.field9626.method15766(5123, var2.data, var2.pos, false);
		}
		if (!arg0) {
			this.field9666 = true;
		}
	}

	@ObfuscatedName("afk.hn(Z)V")
	public void method15558(boolean arg0) {
		boolean var2 = this.field9665 != null && this.field9665.field1111 == null;
		boolean var3 = this.field9673 != null && this.field9673.field1111 == null;
		boolean var4 = this.field9659 != null && this.field9659.field1111 == null;
		boolean var5 = this.field9664 != null && this.field9664.field1111 == null;
		if (arg0) {
			var2 &= (this.field9629 & 0x2) != 0;
			var3 &= (this.field9629 & 0x4) != 0;
			var4 &= (this.field9629 & 0x1) != 0;
			var5 &= (this.field9629 & 0x8) != 0;
		}
		byte var6 = 0;
		byte var7 = 0;
		byte var8 = 0;
		byte var9 = 0;
		byte var10 = 0;
		if (var4) {
			var7 = var6;
			var6 = (byte) (var6 + 12);
		}
		if (var2) {
			var8 = var6;
			var6 = (byte) (var6 + 4);
		}
		if (var3) {
			var9 = var6;
			var6 = (byte) (var6 + 12);
		}
		if (var5) {
			var10 = var6;
			var6 = (byte) (var6 + 8);
		}
		if (var6 == 0) {
			return;
		}
		if (this.field9626.field10016.data.length < this.field9658 * var6) {
			this.field9626.field10016 = new GpuPacket((this.field9658 + 100) * var6);
		} else {
			this.field9626.field10016.pos = 0;
		}
		GpuPacket var11 = this.field9626.field10016;
		if (var4) {
			if (this.field9626.field10017) {
				for (int var12 = 0; var12 < this.field9635; var12++) {
					int var13 = Stream.floatToRawIntBits((float) this.field9636[var12]);
					int var14 = Stream.floatToRawIntBits((float) this.field9637[var12]);
					int var15 = Stream.floatToRawIntBits((float) this.field9619[var12]);
					int var16 = this.field9679[var12];
					int var17 = this.field9679[var12 + 1];
					for (int var18 = var16; var18 < var17 && this.field9680[var18] != 0; var18++) {
						int var19 = (this.field9680[var18] & 0xFFFF) - 1;
						var11.pos = var6 * var19;
						var11.p4(var13);
						var11.p4(var14);
						var11.p4(var15);
					}
				}
			} else {
				for (int var20 = 0; var20 < this.field9635; var20++) {
					int var21 = Stream.floatToRawIntBits((float) this.field9636[var20]);
					int var22 = Stream.floatToRawIntBits((float) this.field9637[var20]);
					int var23 = Stream.floatToRawIntBits((float) this.field9619[var20]);
					int var24 = this.field9679[var20];
					int var25 = this.field9679[var20 + 1];
					for (int var26 = var24; var26 < var25 && this.field9680[var26] != 0; var26++) {
						int var27 = (this.field9680[var26] & 0xFFFF) - 1;
						var11.pos = var6 * var27;
						var11.ip4(var21);
						var11.ip4(var22);
						var11.ip4(var23);
					}
				}
			}
		}
		if (var2) {
			if (this.field9673 == null) {
				short[] var28;
				short[] var29;
				short[] var30;
				byte[] var31;
				if (this.field9684 == null) {
					var28 = this.field9681;
					var29 = this.field9682;
					var30 = this.field9644;
					var31 = this.field9690;
				} else {
					var28 = this.field9684.field1191;
					var29 = this.field9684.field1189;
					var30 = this.field9684.field1188;
					var31 = this.field9684.field1190;
				}
				float var32 = this.field9626.field9870[0];
				float var33 = this.field9626.field9870[1];
				float var34 = this.field9626.field9870[2];
				float var35 = this.field9626.field9946;
				float var36 = this.field9626.field9947 * 768.0F / (float) this.field9631;
				float var37 = this.field9626.field9948 * 768.0F / (float) this.field9631;
				for (int var38 = 0; var38 < this.field9670; var38++) {
					int var39 = this.method15548(this.field9651[var38], this.field9685[var38], this.field9630, this.field9683[var38]);
					float var40 = (float) (var39 >>> 24) * this.field9626.field9863;
					float var41 = (float) (var39 >> 16 & 0xFF) * this.field9626.field9944;
					float var42 = (float) (var39 >> 8 & 0xFF) * this.field9626.field9945;
					int var43 = this.field9653[var38] & 0xFFFF;
					short var44 = (short) var31[var43];
					float var45;
					if (var44 == 0) {
						var45 = ((float) var30[var43] * var34 + (float) var28[var43] * var32 + (float) var29[var43] * var33) * 0.0026041667F;
					} else {
						var45 = ((float) var30[var43] * var34 + (float) var28[var43] * var32 + (float) var29[var43] * var33) / (float) (var44 * 256);
					}
					float var46 = var35 + var45 * (var45 < 0.0F ? var37 : var36);
					int var47 = (int) (var40 * var46);
					if (var47 < 0) {
						var47 = 0;
					} else if (var47 > 255) {
						var47 = 255;
					}
					int var48 = (int) (var41 * var46);
					if (var48 < 0) {
						var48 = 0;
					} else if (var48 > 255) {
						var48 = 255;
					}
					int var49 = (int) (var42 * var46);
					if (var49 < 0) {
						var49 = 0;
					} else if (var49 > 255) {
						var49 = 255;
					}
					var11.pos = (var6 * var43 + var8);
					var11.p1(var47);
					var11.p1(var48);
					var11.p1(var49);
					var11.p1(255 - (this.field9683[var38] & 0xFF));
					int var50 = this.field9652[var38] & 0xFFFF;
					short var51 = (short) var31[var50];
					float var52;
					if (var51 == 0) {
						var52 = ((float) var30[var50] * var34 + (float) var28[var50] * var32 + (float) var29[var50] * var33) * 0.0026041667F;
					} else {
						var52 = ((float) var30[var50] * var34 + (float) var28[var50] * var32 + (float) var29[var50] * var33) / (float) (var51 * 256);
					}
					float var53 = var35 + var52 * (var52 < 0.0F ? var37 : var36);
					int var54 = (int) (var40 * var53);
					if (var54 < 0) {
						var54 = 0;
					} else if (var54 > 255) {
						var54 = 255;
					}
					int var55 = (int) (var41 * var53);
					if (var55 < 0) {
						var55 = 0;
					} else if (var55 > 255) {
						var55 = 255;
					}
					int var56 = (int) (var42 * var53);
					if (var56 < 0) {
						var56 = 0;
					} else if (var56 > 255) {
						var56 = 255;
					}
					var11.pos = (var6 * var50 + var8);
					var11.p1(var54);
					var11.p1(var55);
					var11.p1(var56);
					var11.p1(255 - (this.field9683[var38] & 0xFF));
					int var57 = this.field9646[var38] & 0xFFFF;
					short var58 = (short) var31[var57];
					float var59;
					if (var58 == 0) {
						var59 = ((float) var30[var57] * var34 + (float) var28[var57] * var32 + (float) var29[var57] * var33) * 0.0026041667F;
					} else {
						var59 = ((float) var30[var57] * var34 + (float) var28[var57] * var32 + (float) var29[var57] * var33) / (float) (var58 * 256);
					}
					float var60 = var35 + var59 * (var59 < 0.0F ? var37 : var36);
					int var61 = (int) (var40 * var60);
					if (var61 < 0) {
						var61 = 0;
					} else if (var61 > 255) {
						var61 = 255;
					}
					int var62 = (int) (var41 * var60);
					if (var62 < 0) {
						var62 = 0;
					} else if (var62 > 255) {
						var62 = 255;
					}
					int var63 = (int) (var42 * var60);
					if (var63 < 0) {
						var63 = 0;
					} else if (var63 > 255) {
						var63 = 255;
					}
					var11.pos = (var6 * var57 + var8);
					var11.p1(var61);
					var11.p1(var62);
					var11.p1(var63);
					var11.p1(255 - (this.field9683[var38] & 0xFF));
				}
			} else {
				for (int var64 = 0; var64 < this.field9670; var64++) {
					int var65 = this.method15548(this.field9651[var64], this.field9685[var64], this.field9630, this.field9683[var64]);
					var11.pos = ((this.field9653[var64] & 0xFFFF) * var6 + var8);
					var11.p4(var65);
					var11.pos = ((this.field9652[var64] & 0xFFFF) * var6 + var8);
					var11.p4(var65);
					var11.pos = ((this.field9646[var64] & 0xFFFF) * var6 + var8);
					var11.p4(var65);
				}
			}
		}
		if (var3) {
			short[] var66;
			short[] var67;
			short[] var68;
			byte[] var69;
			if (this.field9684 == null) {
				var66 = this.field9681;
				var67 = this.field9682;
				var68 = this.field9644;
				var69 = this.field9690;
			} else {
				var66 = this.field9684.field1191;
				var67 = this.field9684.field1189;
				var68 = this.field9684.field1188;
				var69 = this.field9684.field1190;
			}
			float var70 = 3.0F / (float) this.field9631;
			float var71 = 3.0F / (float) (this.field9631 / 2 + this.field9631);
			var11.pos = var9;
			if (this.field9626.field10017) {
				for (int var72 = 0; var72 < this.field9658; var72++) {
					int var73 = var69[var72] & 0xFF;
					if (var73 == 0) {
						var11.method19550((float) var66[var72] * var71);
						var11.method19550((float) var67[var72] * var71);
						var11.method19550((float) var68[var72] * var71);
					} else {
						float var74 = var70 / (float) var73;
						var11.method19550((float) var66[var72] * var74);
						var11.method19550((float) var67[var72] * var74);
						var11.method19550((float) var68[var72] * var74);
					}
					var11.pos += (var6 - 12);
				}
			} else {
				for (int var75 = 0; var75 < this.field9658; var75++) {
					int var76 = var69[var75] & 0xFF;
					if (var76 == 0) {
						var11.method19553((float) var66[var75] * var71);
						var11.method19553((float) var67[var75] * var71);
						var11.method19553((float) var68[var75] * var71);
					} else {
						float var77 = var70 / (float) var76;
						var11.method19553((float) var66[var75] * var77);
						var11.method19553((float) var67[var75] * var77);
						var11.method19553((float) var68[var75] * var77);
					}
					var11.pos += (var6 - 12);
				}
			}
		}
		if (var5) {
			var11.pos = var10;
			if (this.field9626.field10017) {
				for (int var78 = 0; var78 < this.field9658; var78++) {
					var11.method19550(this.field9647[var78]);
					var11.method19550(this.field9648[var78]);
					var11.pos += (var6 - 8);
				}
			} else {
				for (int var79 = 0; var79 < this.field9658; var79++) {
					var11.method19553(this.field9647[var79]);
					var11.method19553(this.field9648[var79]);
					var11.pos += (var6 - 8);
				}
			}
		}
		var11.pos = this.field9658 * var6;
		GlInterfaceRelated var80;
		if (arg0) {
			if (this.field9655 == null) {
				this.field9655 = this.field9626.method15767(var6, var11.data, var11.pos, true);
			} else {
				this.field9655.method1286(var6, var11.data, var11.pos);
			}
			var80 = this.field9655;
			this.field9629 = 0;
		} else {
			var80 = this.field9626.method15767(var6, var11.data, var11.pos, false);
			this.field9666 = true;
		}
		if (var4) {
			this.field9659.field1111 = var80;
			this.field9659.field1112 = var7;
		}
		if (var5) {
			this.field9664.field1111 = var80;
			this.field9664.field1112 = var10;
		}
		if (var2) {
			this.field9665.field1111 = var80;
			this.field9665.field1112 = var8;
		}
		if (var3) {
			this.field9673.field1111 = var80;
			this.field9673.field1112 = var9;
		}
	}

	@ObfuscatedName("afk.hi(ISIB)I")
	public int method15548(int arg0, short arg1, int arg2, byte arg3) {
		int var5 = ColourUtils.field8151[method15559(arg0, arg2)];
		if (arg1 != -1) {
			Material var6 = this.field9626.materialList.get(arg1 & 0xFFFF);
			int var7 = var6.field1364 & 0xFF;
			if (var7 != 0) {
				int var8;
				if (arg2 < 0) {
					var8 = 0;
				} else if (arg2 > 127) {
					var8 = 16777215;
				} else {
					var8 = arg2 * 131586;
				}
				if (var7 == 256) {
					var5 = var8;
				} else {
					int var10 = 256 - var7;
					var5 = ((var5 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((var5 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
				}
			}
			int var11 = var6.field1363 & 0xFF;
			if (var11 != 0) {
				var11 += 256;
				int var12 = (var5 >> 16 & 0xFF) * var11;
				if (var12 > 65535) {
					var12 = 65535;
				}
				int var13 = (var5 >> 8 & 0xFF) * var11;
				if (var13 > 65535) {
					var13 = 65535;
				}
				int var14 = (var5 & 0xFF) * var11;
				if (var14 > 65535) {
					var14 = 65535;
				}
				var5 = (var14 >> 8) + ((var12 & 0xFF00) << 8) + (var13 & 0xFF00);
			}
		}
		return var5 << 8 | 255 - (arg3 & 0xFF);
	}

	@ObfuscatedName("afk.hw(II)I")
	public static final int method15559(int arg0, int arg1) {
		int var2 = (arg0 & 0x7F) * arg1 >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}
}

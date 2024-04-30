package com.jagex.graphics;

import com.jagex.core.utils.GpuByteArrayUtil;
import com.jagex.core.utils.Algorithms;
import com.jagex.core.utils.ColourUtils;
import com.jagex.game.client.HardShadow;
import com.jagex.game.client.ScreenBoundingBox;
import com.jagex.game.config.BillboardType;
import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEmitterType;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Trig1;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import sun.misc.Unsafe;

import java.nio.ByteBuffer;

@ObfuscatedName("afo")
public class GpuModel extends Model {

	@ObfuscatedName("afo.l")
	public final GpuToolkit field9730;

	@ObfuscatedName("afo.u")
	public int field9725;

	@ObfuscatedName("afo.z")
	public int field9700;

	@ObfuscatedName("afo.p")
	public short field9701;

	@ObfuscatedName("afo.d")
	public short field9749;

	@ObfuscatedName("afo.c")
	public int field9703;

	@ObfuscatedName("afo.r")
	public int field9704;

	@ObfuscatedName("afo.v")
	public int[] field9705;

	@ObfuscatedName("afo.o")
	public int[] field9767;

	@ObfuscatedName("afo.s")
	public int[] field9712;

	@ObfuscatedName("afo.y")
	public int[][] field9702;

	@ObfuscatedName("afo.q")
	public short[] field9709;

	@ObfuscatedName("afo.x")
	public int field9710;

	@ObfuscatedName("afo.b")
	public short[] field9711;

	@ObfuscatedName("afo.h")
	public short[] field9698;

	@ObfuscatedName("afo.a")
	public short[] field9723;

	@ObfuscatedName("afo.g")
	public short[] field9714;

	@ObfuscatedName("afo.i")
	public short[] field9715;

	@ObfuscatedName("afo.j")
	public byte[] field9747;

	@ObfuscatedName("afo.t")
	public float[] field9707;

	@ObfuscatedName("afo.ae")
	public float[] field9724;

	@ObfuscatedName("afo.ag")
	public GpuModelRelated3 field9771;

	@ObfuscatedName("afo.ah")
	public int field9716;

	@ObfuscatedName("afo.al")
	public int field9721;

	@ObfuscatedName("afo.ac")
	public short[] field9722;

	@ObfuscatedName("afo.ai")
	public byte[] field9745;

	@ObfuscatedName("afo.aw")
	public short[] field9713;

	@ObfuscatedName("afo.as")
	public short[] field9762;

	@ObfuscatedName("afo.at")
	public short[] field9726;

	@ObfuscatedName("afo.ad")
	public short[] field9717;

	@ObfuscatedName("afo.am")
	public int[][] field9728;

	@ObfuscatedName("afo.au")
	public short[] field9759;

	@ObfuscatedName("afo.ar")
	public GpuModelRelated field9756;

	@ObfuscatedName("afo.ap")
	public GpuModelRelated4 field9731;

	@ObfuscatedName("afo.aq")
	public GpuModelRelated4 field9732;

	@ObfuscatedName("afo.ax")
	public GpuModelRelated4 field9733;

	@ObfuscatedName("afo.av")
	public GpuModelRelated4 field9734;

	@ObfuscatedName("afo.ao")
	public boolean field9735;

	@ObfuscatedName("afo.aj")
	public boolean field9736;

	@ObfuscatedName("afo.ay")
	public boolean field9737;

	@ObfuscatedName("afo.ab")
	public boolean field9699;

	@ObfuscatedName("afo.az")
	public int field9729;

	@ObfuscatedName("afo.aa")
	public int field9740;

	@ObfuscatedName("afo.af")
	public boolean field9718;

	@ObfuscatedName("afo.ak")
	public int field9742;

	@ObfuscatedName("afo.an")
	public int field9743;

	@ObfuscatedName("afo.bf")
	public int field9744;

	@ObfuscatedName("afo.bl")
	public int field9719;

	@ObfuscatedName("afo.bk")
	public int field9708;

	@ObfuscatedName("afo.bh")
	public int field9696;

	@ObfuscatedName("afo.bx")
	public boolean field9748;

	@ObfuscatedName("afo.bd")
	public int field9760;

	@ObfuscatedName("afo.bc")
	public int[] field9750;

	@ObfuscatedName("afo.bi")
	public int[] field9741;

	@ObfuscatedName("afo.bn")
	public int[] field9752;

	@ObfuscatedName("afo.bt")
	public int[] field9753;

	@ObfuscatedName("afo.bq")
	public short[] field9754;

	@ObfuscatedName("afo.bm")
	public ModelParticleEmitter[] field9755;

	@ObfuscatedName("afo.bb")
	public ModelParticleEffector[] field9738;

	@ObfuscatedName("afo.be")
	public int field9746;

	@ObfuscatedName("afo.by")
	public GpuModelRelated2[] field9758;

	@ObfuscatedName("afo.bu")
	public GpuModelRelated5[] field9757;

	@ObfuscatedName("afo.bw")
	public int[][] field9751;

	@ObfuscatedName("afo.bo")
	public long[] field9761;

	@ObfuscatedName("afo.bz")
	public float[] field9720;

	@ObfuscatedName("afo.bv")
	public int[] field9763;

	@ObfuscatedName("afo.br")
	public int[] field9764;

	@ObfuscatedName("afo.bg")
	public final int[] field9765;

	@ObfuscatedName("afo.ba")
	public final int[] field9766;

	@ObfuscatedName("afo.bp")
	public final int[] field9739;

	@ObfuscatedName("afo.bj")
	public int field9768;

	@ObfuscatedName("afo.bs")
	public int field9769;

	@ObfuscatedName("afo.cl")
	public int field9770;

	@ObfuscatedName("afo.cg")
	public boolean field9706;

	@ObfuscatedName("afo.ce")
	public static GpuModelUnknown field9772;

	public GpuModel(GpuToolkit arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		this.field9703 = 0;
		this.field9704 = 0;
		this.field9710 = 0;
		this.field9716 = 0;
		this.field9721 = 0;
		this.field9735 = false;
		this.field9736 = true;
		this.field9737 = false;
		this.field9699 = false;
		this.field9718 = false;
		this.field9748 = false;
		this.field9720 = new float[2];
		this.field9763 = new int[1];
		this.field9764 = new int[1];
		this.field9765 = new int[8];
		this.field9766 = new int[8];
		this.field9739 = new int[8];
		this.field9730 = arg0;
		this.field9725 = arg1;
		this.field9700 = arg2;
		this.field9735 = arg4;
		if (arg3 || GpuModelFlags.method5438(this.field9725, this.field9700)) {
			this.field9731 = new GpuModelRelated4(GpuModelFlags.method5452(this.field9725, this.field9700));
		}
		if (arg3 || GpuModelFlags.method5450(this.field9725, this.field9700)) {
			this.field9734 = new GpuModelRelated4(GpuModelFlags.method5491(this.field9725, this.field9700));
		}
		if (arg3 || GpuModelFlags.method5449(this.field9725, this.field9700)) {
			this.field9732 = new GpuModelRelated4(GpuModelFlags.method5454(this.field9725, this.field9700));
		}
		if (arg3 || GpuModelFlags.method5448(this.field9725, this.field9700)) {
			this.field9733 = new GpuModelRelated4(GpuModelFlags.method5527(this.field9725, this.field9700));
		}
		if (arg3 || GpuModelFlags.method5451(this.field9725, this.field9700)) {
			this.field9756 = new GpuModelRelated(GpuModelFlags.method5456(this.field9725, this.field9700));
		}
		if (arg3 && arg4) {
			this.field9731.field3356 = this.field9731.field3359 = this.field9730.createVertexBuffer(this.field9735);
			this.field9734.field3356 = this.field9734.field3359 = this.field9730.createVertexBuffer(this.field9735);
			this.field9732.field3356 = this.field9732.field3359 = this.field9730.createVertexBuffer(this.field9735);
			this.field9733.field3356 = this.field9733.field3359 = this.field9730.createVertexBuffer(this.field9735);
		}
	}

	public GpuModel(GpuToolkit arg0, ModelUnlit arg1, int arg2, int arg3, int arg4, int arg5) {
		this(arg0, arg2, arg5, true, false);
		MaterialList var7 = arg0.materialList;
		BillboardTypeList var8 = arg0.billboardList;
		int[] var9 = new int[arg1.faceCount];
		this.field9753 = new int[arg1.field1374 + 1];
		for (int var10 = 0; var10 < arg1.faceCount; var10++) {
			if (arg1.faceType == null || arg1.faceType[var10] != 2) {
				if (arg1.faceMaterial != null && arg1.faceMaterial[var10] != -1) {
					Material var11 = var7.get(arg1.faceMaterial[var10] & 0xFFFF);
					if (((this.field9700 & 0x40) == 0 || !var11.highDetail) && var11.field1361) {
						continue;
					}
				}
				int var10003 = this.field9716;
				int var10001 = this.field9716;
				this.field9716 = (var10003 + 1);
				var9[var10001] = var10;
				this.field9753[arg1.faceVertex1[var10]]++;
				this.field9753[arg1.faceVertex2[var10]]++;
				this.field9753[arg1.faceVertex3[var10]]++;
			}
		}
		this.field9721 = this.field9716;
		long[] var12 = new long[this.field9716];
		boolean var13 = (this.field9725 & 0x100) != 0;
		for (int var14 = 0; var14 < this.field9716; var14++) {
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
								this.field9737 = true;
							}
						}
					}
				}
				if (var21) {
					var12[var14] = Long.MAX_VALUE;
					this.field9721--;
					continue;
				}
			}
			if (arg1.emitters != null) {
				boolean var26 = false;
				for (int var27 = 0; var27 < arg1.emitters.length; var27++) {
					ModelParticleEmitter var28 = arg1.emitters[var27];
					if (var28.field1463 == var15) {
						ParticleEmitterType var29 = this.field9730.emitterTypeList.get(var28.particle);
						if (var29.field3510) {
							var26 = true;
						}
					}
				}
				if (var26) {
					var12[var14] = Long.MAX_VALUE;
					this.field9721--;
					continue;
				}
			}
			short var30 = -1;
			if (arg1.faceMaterial != null) {
				var30 = arg1.faceMaterial[var15];
				if (var30 != -1) {
					var16 = var7.get(var30 & 0xFFFF);
					if ((this.field9700 & 0x40) != 0 && var16.highDetail) {
						var30 = -1;
						var16 = null;
					} else {
						var19 = var16.effect;
						var20 = var16.effectArg1;
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
			this.field9737 |= var31;
			this.field9699 |= var16 != null && (var16.speedU != 0.0F || var16.speedV != 0.0F);
		}
		Algorithms.quicksortParallel(var12, var9);
		this.field9703 = arg1.vertexCount;
		this.field9704 = arg1.field1374;
		this.field9705 = arg1.vertexX;
		this.field9767 = arg1.vertexY;
		this.field9712 = arg1.vertexZ;
		this.field9709 = arg1.vertexSourceModels;
		GpuVertexNormal[] var36 = new GpuVertexNormal[this.field9704];
		this.field9755 = arg1.emitters;
		this.field9738 = arg1.effectors;
		if (arg1.billboard != null) {
			this.field9746 = arg1.billboard.length;
			this.field9758 = new GpuModelRelated2[this.field9746];
			this.field9757 = new GpuModelRelated5[this.field9746];
			for (int var37 = 0; var37 < this.field9746; var37++) {
				ModelBillboard var38 = arg1.billboard[var37];
				BillboardType var39 = var8.get(var38.field1653);
				int var40 = -1;
				for (int var41 = 0; var41 < this.field9716; var41++) {
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
				this.field9758[var37] = new GpuModelRelated2(var40, arg1.faceVertex1[var38.field1654], arg1.faceVertex2[var38.field1654], arg1.faceVertex3[var38.field1654], var39.field3451, var39.field3452, var39.field3455, var39.field3450, var39.field3453, var39.field3456, var39.field3449, var38.field1656);
				this.field9757[var37] = new GpuModelRelated5(var43);
			}
		}
		int var44 = this.field9716 * 3;
		this.field9711 = new short[var44];
		this.field9698 = new short[var44];
		this.field9723 = new short[var44];
		this.field9714 = new short[var44];
		this.field9715 = new short[var44];
		this.field9747 = new byte[var44];
		this.field9707 = new float[var44];
		this.field9724 = new float[var44];
		this.field9722 = new short[this.field9716];
		this.field9745 = new byte[this.field9716];
		this.field9713 = new short[this.field9716];
		this.field9762 = new short[this.field9716];
		this.field9726 = new short[this.field9716];
		this.field9717 = new short[this.field9716];
		if (arg1.field1399 != null) {
			this.field9759 = new short[this.field9716];
		}
		this.field9701 = (short) arg3;
		this.field9749 = (short) arg4;
		this.field9754 = new short[var44];
		this.field9761 = new long[var44];
		int var45 = 0;
		for (int var46 = 0; var46 < arg1.field1374; var46++) {
			int var47 = this.field9753[var46];
			this.field9753[var46] = var45;
			var45 += var47;
			var36[var46] = new GpuVertexNormal();
		}
		this.field9753[arg1.field1374] = var45;
		ModelRelated1 var48 = this.method1687(arg1, var9, this.field9716);
		GpuTriangleNormal[] var49 = new GpuTriangleNormal[arg1.faceCount];
		for (int var50 = 0; var50 < arg1.faceCount; var50++) {
			short var51 = arg1.faceVertex1[var50];
			short var52 = arg1.faceVertex2[var50];
			short var53 = arg1.faceVertex3[var50];
			int var54 = this.field9705[var52] - this.field9705[var51];
			int var55 = this.field9767[var52] - this.field9767[var51];
			int var56 = this.field9712[var52] - this.field9712[var51];
			int var57 = this.field9705[var53] - this.field9705[var51];
			int var58 = this.field9767[var53] - this.field9767[var51];
			int var59 = this.field9712[var53] - this.field9712[var51];
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
				GpuVertexNormal var68 = var36[var51];
				var68.field3379 += var64;
				var68.field3377 += var65;
				var68.field3378 += var66;
				var68.field3380++;
				GpuVertexNormal var69 = var36[var52];
				var69.field3379 += var64;
				var69.field3377 += var65;
				var69.field3378 += var66;
				var69.field3380++;
				GpuVertexNormal var70 = var36[var53];
				var70.field3379 += var64;
				var70.field3377 += var65;
				var70.field3378 += var66;
				var70.field3380++;
			} else if (var67 == 1) {
				GpuTriangleNormal var71 = var49[var50] = new GpuTriangleNormal();
				var71.field3351 = var64;
				var71.field3352 = var65;
				var71.field3353 = var66;
			}
		}
		for (int var72 = 0; var72 < this.field9716; var72++) {
			int var73 = var9[var72];
			int var74 = arg1.faceColour[var73] & 0xFFFF;
			int var75 = arg1.faceTrans == null ? 0 : arg1.faceTrans[var73] & 0xFF;
			short var76 = arg1.faceMaterial == null ? -1 : arg1.faceMaterial[var73];
			if (var76 != -1 && (this.field9700 & 0x40) != 0 && var7.get(var76).highDetail) {
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
							method1684(arg1.vertexX[var136], arg1.vertexY[var136], arg1.vertexZ[var136], var139, var140, var141, var142, var145, var143, var144, this.field9720);
							var77 = this.field9720[0];
							var78 = this.field9720[1];
							method1684(arg1.vertexX[var137], arg1.vertexY[var137], arg1.vertexZ[var137], var139, var140, var141, var142, var145, var143, var144, this.field9720);
							var79 = this.field9720[0];
							var80 = this.field9720[1];
							method1684(arg1.vertexX[var138], arg1.vertexY[var138], arg1.vertexZ[var138], var139, var140, var141, var142, var145, var143, var144, this.field9720);
							var81 = this.field9720[0];
							var82 = this.field9720[1];
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
							method1708(arg1.vertexX[var136], arg1.vertexY[var136], arg1.vertexZ[var136], var139, var140, var141, var97, var142, var143, var144, var147, var148, this.field9720);
							var77 = this.field9720[0];
							var78 = this.field9720[1];
							method1708(arg1.vertexX[var137], arg1.vertexY[var137], arg1.vertexZ[var137], var139, var140, var141, var97, var142, var143, var144, var147, var148, this.field9720);
							var79 = this.field9720[0];
							var80 = this.field9720[1];
							method1708(arg1.vertexX[var138], arg1.vertexY[var138], arg1.vertexZ[var138], var139, var140, var141, var97, var142, var143, var144, var147, var148, this.field9720);
							var81 = this.field9720[0];
							var82 = this.field9720[1];
						} else if (var100 == 3) {
							method1753(arg1.vertexX[var136], arg1.vertexY[var136], arg1.vertexZ[var136], var139, var140, var141, var142, var143, var144, this.field9720);
							var77 = this.field9720[0];
							var78 = this.field9720[1];
							method1753(arg1.vertexX[var137], arg1.vertexY[var137], arg1.vertexZ[var137], var139, var140, var141, var142, var143, var144, this.field9720);
							var79 = this.field9720[0];
							var80 = this.field9720[1];
							method1753(arg1.vertexX[var138], arg1.vertexY[var138], arg1.vertexZ[var138], var139, var140, var141, var142, var143, var144, this.field9720);
							var81 = this.field9720[0];
							var82 = this.field9720[1];
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
				GpuVertexNormal var170 = var36[var167];
				this.field9713[var72] = this.method15592(arg1, var167, var72, var165 | var88 << 24, var170.field3379, var170.field3377, var170.field3378, var170.field3380, var77, var78);
				GpuVertexNormal var171 = var36[var168];
				this.field9762[var72] = this.method15592(arg1, var168, var72, var165 | var91 << 24, var171.field3379, var171.field3377, var171.field3378, var171.field3380, var79, var80);
				GpuVertexNormal var172 = var36[var169];
				this.field9726[var72] = this.method15592(arg1, var169, var72, var165 | var94 << 24, var172.field3379, var172.field3377, var172.field3378, var172.field3380, var81, var82);
			} else if (var164 == 1) {
				GpuTriangleNormal var173 = var49[var73];
				long var174 = ((long) (var173.field3353 + 256) << 24) + ((long) (var173.field3351 & Integer.MIN_VALUE) << 9) + ((long) (var173.field3352 + 256) << 32) + (long) (var74 << 8) + (long) var75;
				this.field9713[var72] = this.method15592(arg1, arg1.faceVertex1[var73], var72, var174 | var88 << 41, var173.field3351, var173.field3352, var173.field3353, 0, var77, var78);
				this.field9762[var72] = this.method15592(arg1, arg1.faceVertex2[var73], var72, var174 | var88 << 41, var173.field3351, var173.field3352, var173.field3353, 0, var79, var80);
				this.field9726[var72] = this.method15592(arg1, arg1.faceVertex3[var73], var72, var174 | var88 << 41, var173.field3351, var173.field3352, var173.field3353, 0, var81, var82);
			}
			if (arg1.faceTrans != null) {
				this.field9745[var72] = arg1.faceTrans[var73];
			}
			if (arg1.field1399 != null) {
				this.field9759[var72] = arg1.field1399[var73];
			}
			this.field9722[var72] = arg1.faceColour[var73];
			this.field9717[var72] = var76;
		}
		if (this.field9721 > 0) {
			int var176 = 1;
			short var177 = this.field9717[0];
			for (int var178 = 0; var178 < this.field9721; var178++) {
				short var179 = this.field9717[var178];
				if (var177 != var179) {
					var176++;
					var177 = var179;
				}
			}
			this.field9741 = new int[var176];
			this.field9752 = new int[var176];
			this.field9750 = new int[var176 + 1];
			this.field9750[0] = 0;
			int var180 = this.field9710;
			int var181 = 0;
			int var182 = 0;
			short var183 = this.field9717[0];
			for (int var184 = 0; var184 < this.field9721; var184++) {
				short var185 = this.field9717[var184];
				if (var183 != var185) {
					this.field9741[var182] = var180;
					this.field9752[var182] = var181 - var180 + 1;
					var182++;
					this.field9750[var182] = var184;
					var180 = this.field9710;
					var181 = 0;
					var183 = var185;
				}
				int var186 = this.field9713[var184] & 0xFFFF;
				if (var186 < var180) {
					var180 = var186;
				}
				if (var186 > var181) {
					var181 = var186;
				}
				int var187 = this.field9762[var184] & 0xFFFF;
				if (var187 < var180) {
					var180 = var187;
				}
				if (var187 > var181) {
					var181 = var187;
				}
				int var188 = this.field9726[var184] & 0xFFFF;
				if (var188 < var180) {
					var180 = var188;
				}
				if (var188 > var181) {
					var181 = var188;
				}
			}
			this.field9741[var182] = var180;
			this.field9752[var182] = var181 - var180 + 1;
			var182++;
			this.field9750[var182] = this.field9721;
		}
		this.field9761 = null;
		this.field9711 = method15610(this.field9711, this.field9710);
		this.field9698 = method15610(this.field9698, this.field9710);
		this.field9723 = method15610(this.field9723, this.field9710);
		this.field9714 = method15610(this.field9714, this.field9710);
		this.field9715 = method15610(this.field9715, this.field9710);
		this.field9747 = method15591(this.field9747, this.field9710);
		this.field9707 = method15633(this.field9707, this.field9710);
		this.field9724 = method15633(this.field9724, this.field9710);
		if (arg1.vertexLabel != null && GpuModelFlags.method5465(arg2, this.field9700)) {
			this.field9702 = arg1.method1940(false);
		}
		if (arg1.billboard != null && GpuModelFlags.method5466(arg2, this.field9700)) {
			this.field9751 = arg1.method1963();
		}
		if (arg1.faceLabel != null && GpuModelFlags.method5496(arg2, this.field9700)) {
			int var189 = 0;
			int[] var190 = new int[256];
			for (int var191 = 0; var191 < this.field9716; var191++) {
				int var192 = arg1.faceLabel[var9[var191]];
				if (var192 >= 0) {
					int var10002 = var190[var192]++;
					if (var192 > var189) {
						var189 = var192;
					}
				}
			}
			this.field9728 = new int[var189 + 1][];
			for (int var193 = 0; var193 <= var189; var193++) {
				this.field9728[var193] = new int[var190[var193]];
				var190[var193] = 0;
			}
			for (int var194 = 0; var194 < this.field9716; var194++) {
				int var195 = arg1.faceLabel[var9[var194]];
				if (var195 >= 0) {
					this.field9728[var195][var190[var195]++] = var194;
				}
			}
		}
	}

	@ObfuscatedName("afo.hb(Ldq;IIJIIIIFF)S")
	public short method15592(ModelUnlit arg0, int arg1, int arg2, long arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9) {
		int var12 = this.field9753[arg1];
		int var13 = this.field9753[arg1 + 1];
		int var14 = 0;
		for (int var15 = var12; var15 < var13; var15++) {
			if (this.field9754[var15] == 0) {
				var14 = var15;
				break;
			}
			int var16 = (this.field9754[var15] & 0xFFFF) - 1;
			if (this.field9761[var15] == arg3) {
				return (short) var16;
			}
		}
		this.field9754[var14] = (short) (this.field9710 + 1);
		this.field9761[var14] = arg3;
		this.field9698[this.field9710] = (short) arg2;
		this.field9711[this.field9710] = (short) arg1;
		this.field9723[this.field9710] = (short) arg4;
		this.field9714[this.field9710] = (short) arg5;
		this.field9715[this.field9710] = (short) arg6;
		this.field9747[this.field9710] = (byte) arg7;
		this.field9707[this.field9710] = arg8;
		this.field9724[this.field9710] = arg9;
		return (short) this.field9710++;
	}

	@ObfuscatedName("afo.hg([BI)[B")
	public static byte[] method15591(byte[] arg0, int arg1) {
		byte[] var2 = new byte[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	@ObfuscatedName("afo.hd([SI)[S")
	public static short[] method15610(short[] arg0, int arg1) {
		short[] var2 = new short[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	@ObfuscatedName("afo.hx([FI)[F")
	public static float[] method15633(float[] arg0, int arg1) {
		float[] var2 = new float[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	@ObfuscatedName("afo.z()I")
	public int method1691() {
		return this.field9725;
	}

	@ObfuscatedName("afo.u(I)V")
	public void method1690(int arg0) {
		if (this.field9731 != null) {
			this.field9731.field3357 = GpuModelFlags.method5452(arg0, this.field9700);
		}
		if (this.field9734 != null) {
			this.field9734.field3357 = GpuModelFlags.method5491(arg0, this.field9700);
		}
		if (this.field9732 != null) {
			this.field9732.field3357 = GpuModelFlags.method5454(arg0, this.field9700);
		}
		if (this.field9733 != null) {
			this.field9733.field3357 = GpuModelFlags.method5527(arg0, this.field9700);
		}
		this.field9725 = arg0;
		if (this.field9771 != null && (this.field9725 & 0x10000) == 0) {
			this.field9723 = this.field9771.field3408;
			this.field9714 = this.field9771.field3407;
			this.field9715 = this.field9771.field3409;
			this.field9747 = this.field9771.field3410;
			this.field9771 = null;
		}
		this.field9736 = true;
		this.method15630();
	}

	@ObfuscatedName("afo.p()V")
	public void method1816() {
		if (this.field9710 > 0 && this.field9721 > 0) {
			this.method15614();
			this.method15607();
			this.method15630();
		}
	}

	@ObfuscatedName("afo.l(BIZ)Ldo;")
	public Model method1773(byte arg0, int arg1, boolean arg2) {
		boolean var4 = false;
		GpuModel var5;
		GpuModel var6;
		if (arg0 > 0 && arg0 <= 8) {
			var5 = this.field9730.field10207[arg0 - 1];
			var6 = this.field9730.field10058[arg0 - 1];
			var4 = true;
		} else {
			var6 = var5 = new GpuModel(this.field9730, 0, 0, true, false);
		}
		return this.method15593(var6, var5, arg1, var4, arg2);
	}

	@ObfuscatedName("afo.hq(Lafo;Lafo;IZZ)Ldo;")
	public Model method15593(GpuModel arg0, GpuModel arg1, int arg2, boolean arg3, boolean arg4) {
		arg0.field9725 = arg2;
		arg0.field9700 = this.field9700;
		arg0.field9701 = this.field9701;
		arg0.field9749 = this.field9749;
		arg0.field9703 = this.field9703;
		arg0.field9704 = this.field9704;
		arg0.field9710 = this.field9710;
		arg0.field9716 = this.field9716;
		arg0.field9721 = this.field9721;
		arg0.field9746 = this.field9746;
		if ((arg2 & 0x100) == 0) {
			arg0.field9737 = this.field9737;
		} else {
			arg0.field9737 = true;
		}
		arg0.field9699 = this.field9699;
		boolean var6 = GpuModelFlags.method5435(arg2, this.field9700);
		boolean var7 = GpuModelFlags.method5436(arg2, this.field9700);
		boolean var8 = GpuModelFlags.method5437(arg2, this.field9700);
		boolean var9 = var6 | var7 | var8;
		if (var9) {
			if (!var6) {
				arg0.field9705 = this.field9705;
			} else if (arg1.field9705 == null || arg1.field9705.length < this.field9703) {
				arg0.field9705 = arg1.field9705 = new int[this.field9703];
			} else {
				arg0.field9705 = arg1.field9705;
			}
			if (!var7) {
				arg0.field9767 = this.field9767;
			} else if (arg1.field9767 == null || arg1.field9767.length < this.field9703) {
				arg0.field9767 = arg1.field9767 = new int[this.field9703];
			} else {
				arg0.field9767 = arg1.field9767;
			}
			if (!var8) {
				arg0.field9712 = this.field9712;
			} else if (arg1.field9712 == null || arg1.field9712.length < this.field9703) {
				arg0.field9712 = arg1.field9712 = new int[this.field9703];
			} else {
				arg0.field9712 = arg1.field9712;
			}
			for (int var10 = 0; var10 < this.field9703; var10++) {
				if (var6) {
					arg0.field9705[var10] = this.field9705[var10];
				}
				if (var7) {
					arg0.field9767[var10] = this.field9767[var10];
				}
				if (var8) {
					arg0.field9712[var10] = this.field9712[var10];
				}
			}
		} else {
			arg0.field9705 = this.field9705;
			arg0.field9767 = this.field9767;
			arg0.field9712 = this.field9712;
		}
		if (GpuModelFlags.method5452(arg2, this.field9700)) {
			arg0.field9731 = arg1.field9731;
			arg0.field9731.field3359 = this.field9731.field3359;
			arg0.field9731.field3358 = this.field9731.field3358;
			arg0.field9731.field3357 = true;
		} else if (GpuModelFlags.method5438(arg2, this.field9700)) {
			arg0.field9731 = this.field9731;
		} else {
			arg0.field9731 = null;
		}
		if (GpuModelFlags.method5471(arg2, this.field9700)) {
			if (arg1.field9722 == null || arg1.field9722.length < this.field9716) {
				arg0.field9722 = arg1.field9722 = new short[this.field9716];
			} else {
				arg0.field9722 = arg1.field9722;
			}
			for (int var11 = 0; var11 < this.field9716; var11++) {
				arg0.field9722[var11] = this.field9722[var11];
			}
		} else {
			arg0.field9722 = this.field9722;
		}
		if (GpuModelFlags.method5458(arg2, this.field9700)) {
			if (arg1.field9745 == null || arg1.field9745.length < this.field9716) {
				arg0.field9745 = arg1.field9745 = new byte[this.field9716];
			} else {
				arg0.field9745 = arg1.field9745;
			}
			for (int var12 = 0; var12 < this.field9716; var12++) {
				arg0.field9745[var12] = this.field9745[var12];
			}
		} else {
			arg0.field9745 = this.field9745;
		}
		if (GpuModelFlags.method5454(arg2, this.field9700)) {
			arg0.field9732 = arg1.field9732;
			arg0.field9732.field3359 = this.field9732.field3359;
			arg0.field9732.field3358 = this.field9732.field3358;
			arg0.field9732.field3357 = true;
		} else if (GpuModelFlags.method5449(arg2, this.field9700)) {
			arg0.field9732 = this.field9732;
		} else {
			arg0.field9732 = null;
		}
		if (GpuModelFlags.method5439(arg2, this.field9700)) {
			if (arg1.field9723 == null || arg1.field9723.length < this.field9710) {
				int var13 = this.field9710;
				arg0.field9723 = arg1.field9723 = new short[var13];
				arg0.field9714 = arg1.field9714 = new short[var13];
				arg0.field9715 = arg1.field9715 = new short[var13];
			} else {
				arg0.field9723 = arg1.field9723;
				arg0.field9714 = arg1.field9714;
				arg0.field9715 = arg1.field9715;
			}
			if (this.field9771 == null) {
				arg0.field9771 = null;
				for (int var17 = 0; var17 < this.field9710; var17++) {
					arg0.field9723[var17] = this.field9723[var17];
					arg0.field9714[var17] = this.field9714[var17];
					arg0.field9715[var17] = this.field9715[var17];
				}
			} else {
				if (arg1.field9771 == null) {
					arg1.field9771 = new GpuModelRelated3();
				}
				GpuModelRelated3 var14 = arg0.field9771 = arg1.field9771;
				if (var14.field3408 == null || var14.field3408.length < this.field9710) {
					int var15 = this.field9710;
					var14.field3408 = new short[var15];
					var14.field3407 = new short[var15];
					var14.field3409 = new short[var15];
					var14.field3410 = new byte[var15];
				}
				for (int var16 = 0; var16 < this.field9710; var16++) {
					arg0.field9723[var16] = this.field9723[var16];
					arg0.field9714[var16] = this.field9714[var16];
					arg0.field9715[var16] = this.field9715[var16];
					var14.field3408[var16] = this.field9771.field3408[var16];
					var14.field3407[var16] = this.field9771.field3407[var16];
					var14.field3409[var16] = this.field9771.field3409[var16];
					var14.field3410[var16] = this.field9771.field3410[var16];
				}
			}
			arg0.field9747 = this.field9747;
		} else {
			arg0.field9771 = this.field9771;
			arg0.field9723 = this.field9723;
			arg0.field9714 = this.field9714;
			arg0.field9715 = this.field9715;
			arg0.field9747 = this.field9747;
		}
		if (GpuModelFlags.method5527(arg2, this.field9700)) {
			arg0.field9733 = arg1.field9733;
			arg0.field9733.field3359 = this.field9733.field3359;
			arg0.field9733.field3358 = this.field9733.field3358;
			arg0.field9733.field3357 = true;
		} else if (GpuModelFlags.method5448(arg2, this.field9700)) {
			arg0.field9733 = this.field9733;
		} else {
			arg0.field9733 = null;
		}
		if (GpuModelFlags.method5514(arg2, this.field9700)) {
			if (arg1.field9707 == null || arg1.field9707.length < this.field9716) {
				int var18 = this.field9710;
				arg0.field9707 = arg1.field9707 = new float[var18];
				arg0.field9724 = arg1.field9724 = new float[var18];
			} else {
				arg0.field9707 = arg1.field9707;
				arg0.field9724 = arg1.field9724;
			}
			for (int var19 = 0; var19 < this.field9710; var19++) {
				arg0.field9707[var19] = this.field9707[var19];
				arg0.field9724[var19] = this.field9724[var19];
			}
		} else {
			arg0.field9707 = this.field9707;
			arg0.field9724 = this.field9724;
		}
		if (GpuModelFlags.method5491(arg2, this.field9700)) {
			arg0.field9734 = arg1.field9734;
			arg0.field9734.field3359 = this.field9734.field3359;
			arg0.field9734.field3358 = this.field9734.field3358;
			arg0.field9734.field3357 = true;
		} else if (GpuModelFlags.method5450(arg2, this.field9700)) {
			arg0.field9734 = this.field9734;
		} else {
			arg0.field9734 = null;
		}
		if (GpuModelFlags.method5443(arg2, this.field9700)) {
			if (arg1.field9713 == null || arg1.field9713.length < this.field9716) {
				int var20 = this.field9716;
				arg0.field9713 = arg1.field9713 = new short[var20];
				arg0.field9762 = arg1.field9762 = new short[var20];
				arg0.field9726 = arg1.field9726 = new short[var20];
			} else {
				arg0.field9713 = arg1.field9713;
				arg0.field9762 = arg1.field9762;
				arg0.field9726 = arg1.field9726;
			}
			for (int var21 = 0; var21 < this.field9716; var21++) {
				arg0.field9713[var21] = this.field9713[var21];
				arg0.field9762[var21] = this.field9762[var21];
				arg0.field9726[var21] = this.field9726[var21];
			}
		} else {
			arg0.field9713 = this.field9713;
			arg0.field9762 = this.field9762;
			arg0.field9726 = this.field9726;
		}
		if (GpuModelFlags.method5456(arg2, this.field9700)) {
			arg0.field9756 = arg1.field9756;
			arg0.field9756.field3239 = this.field9756.field3239;
			arg0.field9756.field3238 = this.field9756.field3238;
			arg0.field9756.field3240 = true;
		} else if (GpuModelFlags.method5451(arg2, this.field9700)) {
			arg0.field9756 = this.field9756;
		} else {
			arg0.field9756 = null;
		}
		if (GpuModelFlags.method5434(arg2, this.field9700)) {
			if (arg1.field9717 == null || arg1.field9717.length < this.field9716) {
				int var22 = this.field9716;
				arg0.field9717 = arg1.field9717 = new short[var22];
			} else {
				arg0.field9717 = arg1.field9717;
			}
			for (int var23 = 0; var23 < this.field9716; var23++) {
				arg0.field9717[var23] = this.field9717[var23];
			}
		} else {
			arg0.field9717 = this.field9717;
		}
		if (!GpuModelFlags.method5445(arg2, this.field9700)) {
			arg0.field9757 = this.field9757;
		} else if (arg1.field9757 == null || arg1.field9757.length < this.field9746) {
			int var25 = this.field9746;
			arg0.field9757 = arg1.field9757 = new GpuModelRelated5[var25];
			for (int var26 = 0; var26 < this.field9746; var26++) {
				arg0.field9757[var26] = this.field9757[var26].method5688();
			}
		} else {
			arg0.field9757 = arg1.field9757;
			for (int var24 = 0; var24 < this.field9746; var24++) {
				arg0.field9757[var24].method5687(this.field9757[var24]);
			}
		}
		arg0.field9758 = this.field9758;
		if (this.field9718) {
			arg0.field9729 = this.field9729;
			arg0.field9740 = this.field9740;
			arg0.field9744 = this.field9744;
			arg0.field9719 = this.field9719;
			arg0.field9742 = this.field9742;
			arg0.field9743 = this.field9743;
			arg0.field9708 = this.field9708;
			arg0.field9696 = this.field9696;
			arg0.field9718 = true;
		} else {
			arg0.field9718 = false;
		}
		if (this.field9748) {
			arg0.field9760 = this.field9760;
			arg0.field9748 = true;
		} else {
			arg0.field9748 = false;
		}
		arg0.field9702 = this.field9702;
		arg0.field9728 = this.field9728;
		arg0.field9751 = this.field9751;
		arg0.field9754 = this.field9754;
		arg0.field9753 = this.field9753;
		arg0.field9711 = this.field9711;
		arg0.field9698 = this.field9698;
		arg0.field9709 = this.field9709;
		arg0.field9759 = this.field9759;
		arg0.field9750 = this.field9750;
		arg0.field9752 = this.field9752;
		arg0.field9741 = this.field9741;
		arg0.field9755 = this.field9755;
		arg0.field9738 = this.field9738;
		return arg0;
	}

	@ObfuscatedName("afo.hf()V")
	public void method15630() {
		if (!this.field9736) {
			return;
		}
		this.field9736 = false;
		if (this.field9755 == null && this.field9738 == null && this.field9758 == null && !GpuModelFlags.method5530(this.field9725, this.field9700)) {
			boolean var1 = false;
			boolean var2 = false;
			boolean var3 = false;
			if (this.field9705 != null && !GpuModelFlags.method5529(this.field9725, this.field9700)) {
				if (this.field9731 == null || this.field9731.method5787()) {
					if (!this.field9718) {
						this.method15613();
					}
					var1 = true;
				} else {
					this.field9736 = true;
				}
			}
			if (this.field9767 != null && !GpuModelFlags.method5532(this.field9725, this.field9700)) {
				if (this.field9731 == null || this.field9731.method5787()) {
					if (!this.field9718) {
						this.method15613();
					}
					var2 = true;
				} else {
					this.field9736 = true;
				}
			}
			if (this.field9712 != null && !GpuModelFlags.method5459(this.field9725, this.field9700)) {
				if (this.field9731 == null || this.field9731.method5787()) {
					if (!this.field9718) {
						this.method15613();
					}
					var3 = true;
				} else {
					this.field9736 = true;
				}
			}
			if (var1) {
				this.field9705 = null;
			}
			if (var2) {
				this.field9767 = null;
			}
			if (var3) {
				this.field9712 = null;
			}
		}
		if (this.field9754 != null && this.field9705 == null && this.field9767 == null && this.field9712 == null) {
			this.field9754 = null;
			this.field9753 = null;
		}
		if (this.field9747 != null && !GpuModelFlags.method5460(this.field9725, this.field9700)) {
			label211: {
				label210: {
					if ((this.field9700 & 0x37) == 0) {
						if (this.field9732 != null && !this.field9732.method5787()) {
							break label210;
						}
					} else if (this.field9733 != null && !this.field9733.method5787()) {
						break label210;
					}
					this.field9715 = null;
					this.field9714 = null;
					this.field9723 = null;
					this.field9747 = null;
					break label211;
				}
				this.field9736 = true;
			}
		}
		if (this.field9722 != null && !GpuModelFlags.method5461(this.field9725, this.field9700)) {
			if (this.field9732 == null || this.field9732.method5787()) {
				this.field9722 = null;
			} else {
				this.field9736 = true;
			}
		}
		if (this.field9745 != null && !GpuModelFlags.method5462(this.field9725, this.field9700)) {
			if (this.field9732 == null || this.field9732.method5787()) {
				this.field9745 = null;
			} else {
				this.field9736 = true;
			}
		}
		if (this.field9707 != null && !GpuModelFlags.method5463(this.field9725, this.field9700)) {
			if (this.field9734 == null || this.field9734.method5787()) {
				this.field9724 = null;
				this.field9707 = null;
			} else {
				this.field9736 = true;
			}
		}
		if (this.field9717 != null && !GpuModelFlags.method5468(this.field9725, this.field9700)) {
			if (this.field9732 == null || this.field9732.method5787()) {
				this.field9717 = null;
			} else {
				this.field9736 = true;
			}
		}
		if (this.field9713 != null && !GpuModelFlags.method5486(this.field9725, this.field9700)) {
			if ((this.field9756 == null || this.field9756.method5544()) && (this.field9732 == null || this.field9732.method5787())) {
				this.field9726 = null;
				this.field9762 = null;
				this.field9713 = null;
			} else {
				this.field9736 = true;
			}
		}
		if (this.field9711 != null) {
			if (this.field9731 == null || this.field9731.method5787()) {
				this.field9711 = null;
			} else {
				this.field9736 = true;
			}
		}
		if (this.field9698 != null) {
			if (this.field9732 == null || this.field9732.method5787()) {
				this.field9698 = null;
			} else {
				this.field9736 = true;
			}
		}
		if (this.field9728 != null && !GpuModelFlags.method5496(this.field9725, this.field9700)) {
			this.field9728 = null;
			this.field9759 = null;
		}
		if (this.field9702 != null && !GpuModelFlags.method5465(this.field9725, this.field9700)) {
			this.field9702 = null;
			this.field9709 = null;
		}
		if (this.field9751 != null && !GpuModelFlags.method5466(this.field9725, this.field9700)) {
			this.field9751 = null;
		}
		if (this.field9750 != null && (this.field9725 & 0x800) == 0 && (this.field9725 & 0x40000) == 0) {
			this.field9750 = null;
			this.field9752 = null;
			this.field9741 = null;
		}
	}

	@ObfuscatedName("afo.hr()V")
	public void method15598() {
		if (this.field9731 != null) {
			this.field9731.field3358 = false;
		}
	}

	@ObfuscatedName("afo.hs()V")
	public void method15596() {
		if (this.field9732 != null) {
			this.field9732.field3358 = false;
		}
	}

	@ObfuscatedName("afo.hh()V")
	public void method15599() {
		if ((this.field9700 & 0x37) == 0) {
			if (this.field9732 != null) {
				this.field9732.field3358 = false;
			}
		} else if (this.field9733 != null) {
			this.field9733.field3358 = false;
		}
	}

	@ObfuscatedName("afo.hp()V")
	public void method15615() {
		if (this.field9756 != null) {
			this.field9756.field3238 = false;
		}
	}

	@ObfuscatedName("afo.d(I)V")
	public void method1693(int arg0) {
		int var2 = Trig1.sin[arg0];
		int var3 = Trig1.cos[arg0];
		for (int var4 = 0; var4 < this.field9704; var4++) {
			int var5 = this.field9712[var4] * var2 + this.field9705[var4] * var3 >> 14;
			this.field9712[var4] = this.field9712[var4] * var3 - this.field9705[var4] * var2 >> 14;
			this.field9705[var4] = var5;
		}
		this.method15598();
		this.field9718 = false;
	}

	@ObfuscatedName("afo.c(I)V")
	public void method1694(int arg0) {
		int var2 = Trig1.sin[arg0];
		int var3 = Trig1.cos[arg0];
		for (int var4 = 0; var4 < this.field9704; var4++) {
			int var5 = this.field9712[var4] * var2 + this.field9705[var4] * var3 >> 14;
			this.field9712[var4] = this.field9712[var4] * var3 - this.field9705[var4] * var2 >> 14;
			this.field9705[var4] = var5;
		}
		for (int var6 = 0; var6 < this.field9710; var6++) {
			int var7 = this.field9723[var6] * var3 + this.field9715[var6] * var2 >> 14;
			this.field9715[var6] = (short) (this.field9715[var6] * var3 - this.field9723[var6] * var2 >> 14);
			this.field9723[var6] = (short) var7;
		}
		this.method15598();
		this.method15599();
		this.field9718 = false;
	}

	@ObfuscatedName("afo.r(I)V")
	public void rotateX(int arg0) {
		int var2 = Trig1.sin[arg0];
		int var3 = Trig1.cos[arg0];
		for (int var4 = 0; var4 < this.field9704; var4++) {
			int var5 = this.field9767[var4] * var3 - this.field9712[var4] * var2 >> 14;
			this.field9712[var4] = this.field9767[var4] * var2 + this.field9712[var4] * var3 >> 14;
			this.field9767[var4] = var5;
		}
		this.method15598();
		this.field9718 = false;
	}

	@ObfuscatedName("afo.v(I)V")
	public void rotateZ(int arg0) {
		int var2 = Trig1.sin[arg0];
		int var3 = Trig1.cos[arg0];
		for (int var4 = 0; var4 < this.field9704; var4++) {
			int var5 = this.field9767[var4] * var2 + this.field9705[var4] * var3 >> 14;
			this.field9767[var4] = this.field9767[var4] * var3 - this.field9705[var4] * var2 >> 14;
			this.field9705[var4] = var5;
		}
		this.method15598();
		this.field9718 = false;
	}

	@ObfuscatedName("afo.o(III)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field9704; var4++) {
			if (arg0 != 0) {
				this.field9705[var4] += arg0;
			}
			if (arg1 != 0) {
				this.field9767[var4] += arg1;
			}
			if (arg2 != 0) {
				this.field9712[var4] += arg2;
			}
		}
		this.method15598();
		this.field9718 = false;
	}

	@ObfuscatedName("afo.s()V")
	public void method1698() {
		for (int var1 = 0; var1 < this.field9704; var1++) {
			this.field9712[var1] = -this.field9712[var1];
		}
		for (int var2 = 0; var2 < this.field9710; var2++) {
			this.field9715[var2] = (short) -this.field9715[var2];
		}
		for (int var3 = 0; var3 < this.field9716; var3++) {
			short var4 = this.field9713[var3];
			this.field9713[var3] = this.field9726[var3];
			this.field9726[var3] = var4;
		}
		this.method15598();
		this.method15599();
		this.method15615();
		this.field9718 = false;
	}

	@ObfuscatedName("afo.y(III)V")
	public void scale(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field9704; var4++) {
			if (arg0 != 128) {
				this.field9705[var4] = this.field9705[var4] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.field9767[var4] = this.field9767[var4] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.field9712[var4] = this.field9712[var4] * arg2 >> 7;
			}
		}
		this.method15598();
		this.field9718 = false;
	}

	@ObfuscatedName("afo.q(IILcb;Lcb;III)V")
	public void method1700(int arg0, int arg1, FloorModel arg2, FloorModel arg3, int arg4, int arg5, int arg6) {
		if (!this.field9718) {
			this.method15613();
		}
		int var8 = this.field9744 + arg4;
		int var9 = this.field9719 + arg4;
		int var10 = this.field9708 + arg6;
		int var11 = this.field9696 + arg6;
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
			for (int var16 = 0; var16 < this.field9704; var16++) {
				this.field9767[var16] = this.field9767[var16] + arg2.method1528(this.field9705[var16] + arg4, this.field9712[var16] + arg6) - arg5;
			}
		} else if (arg0 == 2) {
			int var17 = this.field9742;
			if (var17 == 0) {
				return;
			}
			for (int var18 = 0; var18 < this.field9704; var18++) {
				int var19 = (this.field9767[var18] << 16) / var17;
				if (var19 < arg1) {
					this.field9767[var18] += (arg2.method1528(this.field9705[var18] + arg4, this.field9712[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
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
			int var24 = this.field9743 - this.field9742;
			for (int var25 = 0; var25 < this.field9704; var25++) {
				this.field9767[var25] = this.field9767[var25] + (arg3.method1528(this.field9705[var25] + arg4, this.field9712[var25] + arg6) - arg5) + var24;
			}
		} else if (arg0 == 5) {
			int var26 = this.field9743 - this.field9742;
			for (int var27 = 0; var27 < this.field9704; var27++) {
				int var28 = this.field9705[var27] + arg4;
				int var29 = this.field9712[var27] + arg6;
				int var30 = arg2.method1528(var28, var29);
				int var31 = arg3.method1528(var28, var29);
				int var32 = var30 - var31 - arg1;
				this.field9767[var27] = ((this.field9767[var27] << 8) / var26 * var32 >> 8) - (arg5 - var30);
			}
		}
		this.method15598();
		this.field9718 = false;
	}

	@ObfuscatedName("afo.hy()V")
	public void method15613() {
		int var1 = 32767;
		int var2 = 32767;
		int var3 = 32767;
		int var4 = -32768;
		int var5 = -32768;
		int var6 = -32768;
		int var7 = 0;
		int var8 = 0;
		for (int var9 = 0; var9 < this.field9704; var9++) {
			int var10 = this.field9705[var9];
			int var11 = this.field9767[var9];
			int var12 = this.field9712[var9];
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
		this.field9744 = var1;
		this.field9719 = var4;
		this.field9742 = var2;
		this.field9743 = var5;
		this.field9708 = var3;
		this.field9696 = var6;
		this.field9740 = (int) (Math.sqrt((double) var7) + 0.99D);
		this.field9729 = (int) (Math.sqrt((double) var8) + 0.99D);
		this.field9718 = true;
	}

	@ObfuscatedName("afo.bl()V")
	public void method1736() {
		if (this.field9748) {
			return;
		}
		if (!this.field9718) {
			this.method15613();
		}
		this.field9760 = this.field9742;
		this.field9748 = true;
	}

	@ObfuscatedName("afo.aj()I")
	public int getHorizontalRadius() {
		if (!this.field9718) {
			this.method15613();
		}
		return this.field9740;
	}

	@ObfuscatedName("afo.ay()I")
	public int getRadius() {
		if (!this.field9718) {
			this.method15613();
		}
		return this.field9729;
	}

	@ObfuscatedName("afo.ab()I")
	public int getMinX() {
		if (!this.field9718) {
			this.method15613();
		}
		return this.field9744;
	}

	@ObfuscatedName("afo.az()I")
	public int getMaxX() {
		if (!this.field9718) {
			this.method15613();
		}
		return this.field9719;
	}

	@ObfuscatedName("afo.aa()I")
	public int getMinY() {
		if (!this.field9718) {
			this.method15613();
		}
		return this.field9742;
	}

	@ObfuscatedName("afo.af()I")
	public int getMaxY() {
		if (!this.field9718) {
			this.method15613();
		}
		return this.field9743;
	}

	@ObfuscatedName("afo.ak()I")
	public int getMinZ() {
		if (!this.field9718) {
			this.method15613();
		}
		return this.field9708;
	}

	@ObfuscatedName("afo.an()I")
	public int getMaxZ() {
		if (!this.field9718) {
			this.method15613();
		}
		return this.field9696;
	}

	@ObfuscatedName("afo.bf()I")
	public int getHeight() {
		if (!this.field9748) {
			this.method1736();
		}
		return this.field9760;
	}

	@ObfuscatedName("afo.bo(Ldo;IIIZ)V")
	public void method1686(Model arg0, int arg1, int arg2, int arg3, boolean arg4) {
		GpuModel var6 = (GpuModel) arg0;
		if (this.field9716 == 0 || var6.field9716 == 0) {
			return;
		}
		int var7 = var6.field9704;
		int[] var8 = var6.field9705;
		int[] var9 = var6.field9767;
		int[] var10 = var6.field9712;
		short[] var11 = var6.field9723;
		short[] var12 = var6.field9714;
		short[] var13 = var6.field9715;
		byte[] var14 = var6.field9747;
		short[] var15;
		short[] var16;
		short[] var17;
		byte[] var18;
		if (this.field9771 == null) {
			var15 = null;
			var16 = null;
			var17 = null;
			var18 = null;
		} else {
			var15 = this.field9771.field3408;
			var16 = this.field9771.field3407;
			var17 = this.field9771.field3409;
			var18 = this.field9771.field3410;
		}
		short[] var19;
		short[] var20;
		short[] var21;
		byte[] var22;
		if (var6.field9771 == null) {
			var19 = null;
			var20 = null;
			var21 = null;
			var22 = null;
		} else {
			var19 = var6.field9771.field3408;
			var20 = var6.field9771.field3407;
			var21 = var6.field9771.field3409;
			var22 = var6.field9771.field3410;
		}
		int[] var23 = var6.field9753;
		short[] var24 = var6.field9754;
		if (!var6.field9718) {
			var6.method15613();
		}
		int var25 = var6.field9742;
		int var26 = var6.field9743;
		int var27 = var6.field9744;
		int var28 = var6.field9719;
		int var29 = var6.field9708;
		int var30 = var6.field9696;
		for (int var31 = 0; var31 < this.field9704; var31++) {
			int var32 = this.field9767[var31] - arg2;
			if (var32 >= var25 && var32 <= var26) {
				int var33 = this.field9705[var31] - arg1;
				if (var33 >= var27 && var33 <= var28) {
					int var34 = this.field9712[var31] - arg3;
					if (var34 >= var29 && var34 <= var30) {
						int var35 = -1;
						int var36 = this.field9753[var31];
						int var37 = this.field9753[var31 + 1];
						for (int var38 = var36; var38 < var37 && this.field9754[var38] != 0; var38++) {
							var35 = (this.field9754[var38] & 0xFFFF) - 1;
							if (this.field9747[var35] != 0) {
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
										var40 = var24[var43] - 1 & 0xFFFF;
										if (var14[var40] != 0) {
											break;
										}
									}
									if (var40 != -1) {
										if (var15 == null) {
											this.field9771 = new GpuModelRelated3();
											var15 = this.field9771.field3408 = GpuByteArrayUtil.method13987(this.field9723);
											var16 = this.field9771.field3407 = GpuByteArrayUtil.method13987(this.field9714);
											var17 = this.field9771.field3409 = GpuByteArrayUtil.method13987(this.field9715);
											var18 = this.field9771.field3410 = GpuByteArrayUtil.method4405(this.field9747);
										}
										if (var19 == null) {
											GpuModelRelated3 var44 = var6.field9771 = new GpuModelRelated3();
											var19 = var44.field3408 = GpuByteArrayUtil.method13987(var11);
											var20 = var44.field3407 = GpuByteArrayUtil.method13987(var12);
											var21 = var44.field3409 = GpuByteArrayUtil.method13987(var13);
											var22 = var44.field3410 = GpuByteArrayUtil.method4405(var14);
										}
										short var45 = this.field9723[var35];
										short var46 = this.field9714[var35];
										short var47 = this.field9715[var35];
										byte var48 = this.field9747[var35];
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
										int var57 = this.field9753[var31];
										int var58 = this.field9753[var31 + 1];
										for (int var59 = var57; var59 < var58 && this.field9754[var59] != 0; var59++) {
											int var60 = (this.field9754[var59] & 0xFFFF) - 1;
											if (var18[var60] != 0) {
												var15[var60] += var53;
												var16[var60] += var54;
												var17[var60] += var55;
												var18[var60] += var56;
											}
										}
										var6.method15599();
										this.method15599();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("afo.bk(I)V")
	public void method1893(int arg0) {
		this.field9701 = (short) arg0;
		this.method15596();
	}

	@ObfuscatedName("afo.bh(I)V")
	public void method1738(int arg0) {
		this.field9749 = (short) arg0;
		this.method15598();
		this.method15599();
	}

	@ObfuscatedName("afo.bx()I")
	public int method1862() {
		return this.field9701;
	}

	@ObfuscatedName("afo.bd()I")
	public int method1740() {
		return this.field9749;
	}

	@ObfuscatedName("afo.bc()[B")
	public byte[] method1741() {
		return this.field9745;
	}

	@ObfuscatedName("afo.bi(SS)V")
	public void recolor(short arg0, short arg1) {
		for (int var3 = 0; var3 < this.field9716; var3++) {
			if (this.field9722[var3] == arg0) {
				this.field9722[var3] = arg1;
			}
		}
		if (this.field9758 != null) {
			for (int var4 = 0; var4 < this.field9746; var4++) {
				GpuModelRelated2 var5 = this.field9758[var4];
				GpuModelRelated5 var6 = this.field9757[var4];
				var6.field3297 = var6.field3297 & 0xFF000000 | ColourUtils.field8151[this.field9722[var5.field3345] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method15596();
	}

	@ObfuscatedName("afo.bn(B[B)V")
	public void method1747(byte arg0, byte[] arg1) {
		if (arg1 == null) {
			for (int var3 = 0; var3 < this.field9716; var3++) {
				this.field9745[var3] = arg0;
			}
		} else {
			for (int var4 = 0; var4 < this.field9716; var4++) {
				int var5 = 255 - (255 - (arg1[var4] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.field9745[var4] = (byte) var5;
			}
		}
		this.method15596();
	}

	@ObfuscatedName("afo.bt(SS)V")
	public void retexture(short arg0, short arg1) {
		MaterialList var3 = this.field9730.materialList;
		for (int var4 = 0; var4 < this.field9716; var4++) {
			if (this.field9717[var4] == arg0) {
				this.field9717[var4] = arg1;
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
				this.field9699 = true;
			}
		}
		if (!(var5 != var8 | var6 != var9)) {
			return;
		}
		if (this.field9758 != null) {
			for (int var11 = 0; var11 < this.field9746; var11++) {
				GpuModelRelated2 var12 = this.field9758[var11];
				GpuModelRelated5 var13 = this.field9757[var11];
				var13.field3297 = var13.field3297 & 0xFF000000 | ColourUtils.field8151[this.field9722[var12.field3345] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method15596();
	}

	@ObfuscatedName("afo.bq(IIII)V")
	public void method1745(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.field9716; var5++) {
			int var6 = this.field9722[var5] & 0xFFFF;
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
			this.field9722[var5] = (short) (var7 << 10 | var8 << 7 | var9);
		}
		if (this.field9758 != null) {
			for (int var10 = 0; var10 < this.field9746; var10++) {
				GpuModelRelated2 var11 = this.field9758[var10];
				GpuModelRelated5 var12 = this.field9757[var10];
				var12.field3297 = var12.field3297 & 0xFF000000 | ColourUtils.field8151[this.field9722[var11.field3345] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method15596();
	}

	@ObfuscatedName("afo.bm()Z")
	public boolean method1746() {
		if (this.field9717 == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.field9717.length; var1++) {
			if (this.field9717[var1] != -1 && !this.field9730.field10188.method5642(this.field9730.materialList.get(this.field9717[var1]), -1)) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("afo.bb()Z")
	public boolean method1731() {
		return this.field9737;
	}

	@ObfuscatedName("afo.be()Z")
	public boolean method1812() {
		return this.field9699;
	}

	@ObfuscatedName("afo.b()V")
	public void method1702() {
	}

	@ObfuscatedName("afo.h()V")
	public void method1703() {
	}

	@ObfuscatedName("afo.as()Z")
	public boolean method1716() {
		if (this.field9702 == null) {
			return false;
		}
		for (int var1 = 0; var1 < this.field9703; var1++) {
			this.field9705[var1] <<= 0x4;
			this.field9767[var1] <<= 0x4;
			this.field9712[var1] <<= 0x4;
		}
		this.field9768 = 0;
		this.field9769 = 0;
		this.field9770 = 0;
		return true;
	}

	@ObfuscatedName("afo.am(I[IIIIZI[I)V")
	public void method1719(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		if (arg0 == 0) {
			int var10 = arg2 << 4;
			int var11 = arg3 << 4;
			int var12 = arg4 << 4;
			int var13 = 0;
			this.field9768 = 0;
			this.field9769 = 0;
			this.field9770 = 0;
			for (int var14 = 0; var14 < var9; var14++) {
				int var15 = arg1[var14];
				if (var15 < this.field9702.length) {
					int[] var16 = this.field9702[var15];
					for (int var17 = 0; var17 < var16.length; var17++) {
						int var18 = var16[var17];
						if (this.field9709 == null || (arg6 & this.field9709[var18]) != 0) {
							this.field9768 += this.field9705[var18];
							this.field9769 += this.field9767[var18];
							this.field9770 += this.field9712[var18];
							var13++;
						}
					}
				}
			}
			if (var13 > 0) {
				this.field9768 = this.field9768 / var13 + var10;
				this.field9769 = this.field9769 / var13 + var11;
				this.field9770 = this.field9770 / var13 + var12;
				this.field9706 = true;
			} else {
				this.field9768 = var10;
				this.field9769 = var11;
				this.field9770 = var12;
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
				if (var26 < this.field9702.length) {
					int[] var27 = this.field9702[var26];
					for (int var28 = 0; var28 < var27.length; var28++) {
						int var29 = var27[var28];
						if (this.field9709 == null || (arg6 & this.field9709[var29]) != 0) {
							this.field9705[var29] += var22;
							this.field9767[var29] += var23;
							this.field9712[var29] += var24;
						}
					}
				}
			}
		} else if (arg0 == 2) {
			if (arg7 == null) {
				for (int var90 = 0; var90 < var9; var90++) {
					int var91 = arg1[var90];
					if (var91 < this.field9702.length) {
						int[] var92 = this.field9702[var91];
						for (int var93 = 0; var93 < var92.length; var93++) {
							int var94 = var92[var93];
							if (this.field9709 == null || (arg6 & this.field9709[var94]) != 0) {
								this.field9705[var94] -= this.field9768;
								this.field9767[var94] -= this.field9769;
								this.field9712[var94] -= this.field9770;
								if (arg4 != 0) {
									int var95 = Trig1.sin[arg4];
									int var96 = Trig1.cos[arg4];
									int var97 = this.field9767[var94] * var95 + this.field9705[var94] * var96 + 16383 >> 14;
									this.field9767[var94] = this.field9767[var94] * var96 - this.field9705[var94] * var95 + 16383 >> 14;
									this.field9705[var94] = var97;
								}
								if (arg2 != 0) {
									int var98 = Trig1.sin[arg2];
									int var99 = Trig1.cos[arg2];
									int var100 = this.field9767[var94] * var99 - this.field9712[var94] * var98 + 16383 >> 14;
									this.field9712[var94] = this.field9767[var94] * var98 + this.field9712[var94] * var99 + 16383 >> 14;
									this.field9767[var94] = var100;
								}
								if (arg3 != 0) {
									int var101 = Trig1.sin[arg3];
									int var102 = Trig1.cos[arg3];
									int var103 = this.field9712[var94] * var101 + this.field9705[var94] * var102 + 16383 >> 14;
									this.field9712[var94] = this.field9712[var94] * var102 - this.field9705[var94] * var101 + 16383 >> 14;
									this.field9705[var94] = var103;
								}
								this.field9705[var94] += this.field9768;
								this.field9767[var94] += this.field9769;
								this.field9712[var94] += this.field9770;
							}
						}
					}
				}
				if (arg5) {
					for (int var104 = 0; var104 < var9; var104++) {
						int var105 = arg1[var104];
						if (var105 < this.field9702.length) {
							int[] var106 = this.field9702[var105];
							for (int var107 = 0; var107 < var106.length; var107++) {
								int var108 = var106[var107];
								if (this.field9709 == null || (arg6 & this.field9709[var108]) != 0) {
									int var109 = this.field9753[var108];
									int var110 = this.field9753[var108 + 1];
									for (int var111 = var109; var111 < var110 && this.field9754[var111] != 0; var111++) {
										int var112 = (this.field9754[var111] & 0xFFFF) - 1;
										if (arg4 != 0) {
											int var113 = Trig1.sin[arg4];
											int var114 = Trig1.cos[arg4];
											int var115 = this.field9723[var112] * var114 + this.field9714[var112] * var113 + 16383 >> 14;
											this.field9714[var112] = (short) (this.field9714[var112] * var114 - this.field9723[var112] * var113 + 16383 >> 14);
											this.field9723[var112] = (short) var115;
										}
										if (arg2 != 0) {
											int var116 = Trig1.sin[arg2];
											int var117 = Trig1.cos[arg2];
											int var118 = this.field9714[var112] * var117 - this.field9715[var112] * var116 + 16383 >> 14;
											this.field9715[var112] = (short) (this.field9715[var112] * var117 + this.field9714[var112] * var116 + 16383 >> 14);
											this.field9714[var112] = (short) var118;
										}
										if (arg3 != 0) {
											int var119 = Trig1.sin[arg3];
											int var120 = Trig1.cos[arg3];
											int var121 = this.field9723[var112] * var120 + this.field9715[var112] * var119 + 16383 >> 14;
											this.field9715[var112] = (short) (this.field9715[var112] * var120 - this.field9723[var112] * var119 + 16383 >> 14);
											this.field9723[var112] = (short) var121;
										}
									}
								}
							}
						}
					}
					this.method15599();
				}
			} else {
				int var30 = arg7[9] << 4;
				int var31 = arg7[10] << 4;
				int var32 = arg7[11] << 4;
				int var33 = arg7[12] << 4;
				int var34 = arg7[13] << 4;
				int var35 = arg7[14] << 4;
				if (this.field9706) {
					int var36 = arg7[6] * this.field9770 + arg7[0] * this.field9768 + arg7[3] * this.field9769 + 8192 >> 14;
					int var37 = arg7[7] * this.field9770 + arg7[1] * this.field9768 + arg7[4] * this.field9769 + 8192 >> 14;
					int var38 = arg7[8] * this.field9770 + arg7[2] * this.field9768 + arg7[5] * this.field9769 + 8192 >> 14;
					int var39 = var33 + var36;
					int var40 = var34 + var37;
					int var41 = var35 + var38;
					this.field9768 = var39;
					this.field9769 = var40;
					this.field9770 = var41;
					this.field9706 = false;
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
				int var51 = var42[2] * -this.field9770 + var42[0] * -this.field9768 + var42[1] * -this.field9769 + 8192 >> 14;
				int var52 = var42[5] * -this.field9770 + var42[3] * -this.field9768 + var42[4] * -this.field9769 + 8192 >> 14;
				int var53 = var42[8] * -this.field9770 + var42[6] * -this.field9768 + var42[7] * -this.field9769 + 8192 >> 14;
				int var54 = this.field9768 + var51;
				int var55 = this.field9769 + var52;
				int var56 = this.field9770 + var53;
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
					if (var80 < this.field9702.length) {
						int[] var81 = this.field9702[var80];
						for (int var82 = 0; var82 < var81.length; var82++) {
							int var83 = var81[var82];
							if (this.field9709 == null || (arg6 & this.field9709[var83]) != 0) {
								int var84 = this.field9712[var83] * var68[2] + this.field9767[var83] * var68[1] + this.field9705[var83] * var68[0] + 8192 >> 14;
								int var85 = this.field9712[var83] * var68[5] + this.field9767[var83] * var68[4] + this.field9705[var83] * var68[3] + 8192 >> 14;
								int var86 = this.field9712[var83] * var68[8] + this.field9767[var83] * var68[7] + this.field9705[var83] * var68[6] + 8192 >> 14;
								int var87 = var76 + var84;
								int var88 = var77 + var85;
								int var89 = var78 + var86;
								this.field9705[var83] = var87;
								this.field9767[var83] = var88;
								this.field9712[var83] = var89;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (int var172 = 0; var172 < var9; var172++) {
					int var173 = arg1[var172];
					if (var173 < this.field9702.length) {
						int[] var174 = this.field9702[var173];
						for (int var175 = 0; var175 < var174.length; var175++) {
							int var176 = var174[var175];
							if (this.field9709 == null || (arg6 & this.field9709[var176]) != 0) {
								this.field9705[var176] -= this.field9768;
								this.field9767[var176] -= this.field9769;
								this.field9712[var176] -= this.field9770;
								this.field9705[var176] = this.field9705[var176] * arg2 >> 7;
								this.field9767[var176] = this.field9767[var176] * arg3 >> 7;
								this.field9712[var176] = this.field9712[var176] * arg4 >> 7;
								this.field9705[var176] += this.field9768;
								this.field9767[var176] += this.field9769;
								this.field9712[var176] += this.field9770;
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
				if (this.field9706) {
					int var128 = arg7[6] * this.field9770 + arg7[0] * this.field9768 + arg7[3] * this.field9769 + 8192 >> 14;
					int var129 = arg7[7] * this.field9770 + arg7[1] * this.field9768 + arg7[4] * this.field9769 + 8192 >> 14;
					int var130 = arg7[8] * this.field9770 + arg7[2] * this.field9768 + arg7[5] * this.field9769 + 8192 >> 14;
					int var131 = var125 + var128;
					int var132 = var126 + var129;
					int var133 = var127 + var130;
					this.field9768 = var131;
					this.field9769 = var132;
					this.field9770 = var133;
					this.field9706 = false;
				}
				int var134 = arg2 << 15 >> 7;
				int var135 = arg3 << 15 >> 7;
				int var136 = arg4 << 15 >> 7;
				int var137 = -this.field9768 * var134 + 8192 >> 14;
				int var138 = -this.field9769 * var135 + 8192 >> 14;
				int var139 = -this.field9770 * var136 + 8192 >> 14;
				int var140 = this.field9768 + var137;
				int var141 = this.field9769 + var138;
				int var142 = this.field9770 + var139;
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
					if (var162 < this.field9702.length) {
						int[] var163 = this.field9702[var162];
						for (int var164 = 0; var164 < var163.length; var164++) {
							int var165 = var163[var164];
							if (this.field9709 == null || (arg6 & this.field9709[var165]) != 0) {
								int var166 = this.field9712[var165] * var150[2] + this.field9767[var165] * var150[1] + this.field9705[var165] * var150[0] + 8192 >> 14;
								int var167 = this.field9712[var165] * var150[5] + this.field9767[var165] * var150[4] + this.field9705[var165] * var150[3] + 8192 >> 14;
								int var168 = this.field9712[var165] * var150[8] + this.field9767[var165] * var150[7] + this.field9705[var165] * var150[6] + 8192 >> 14;
								int var169 = var158 + var166;
								int var170 = var159 + var167;
								int var171 = var160 + var168;
								this.field9705[var165] = var169;
								this.field9767[var165] = var170;
								this.field9712[var165] = var171;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.field9728 != null) {
				boolean var177 = false;
				for (int var178 = 0; var178 < var9; var178++) {
					int var179 = arg1[var178];
					if (var179 < this.field9728.length) {
						int[] var180 = this.field9728[var179];
						for (int var181 = 0; var181 < var180.length; var181++) {
							int var182 = var180[var181];
							if (this.field9759 == null || (arg6 & this.field9759[var182]) != 0) {
								int var183 = (this.field9745[var182] & 0xFF) + arg2 * 8;
								if (var183 < 0) {
									var183 = 0;
								} else if (var183 > 255) {
									var183 = 255;
								}
								this.field9745[var182] = (byte) var183;
							}
						}
						var177 |= var180.length > 0;
					}
				}
				if (var177) {
					if (this.field9758 != null) {
						for (int var184 = 0; var184 < this.field9746; var184++) {
							GpuModelRelated2 var185 = this.field9758[var184];
							GpuModelRelated5 var186 = this.field9757[var184];
							var186.field3297 = var186.field3297 & 0xFFFFFF | 255 - (this.field9745[var185.field3345] & 0xFF) << 24;
						}
					}
					this.method15596();
				}
			}
		} else if (arg0 == 7) {
			if (this.field9728 != null) {
				boolean var187 = false;
				for (int var188 = 0; var188 < var9; var188++) {
					int var189 = arg1[var188];
					if (var189 < this.field9728.length) {
						int[] var190 = this.field9728[var189];
						for (int var191 = 0; var191 < var190.length; var191++) {
							int var192 = var190[var191];
							if (this.field9759 == null || (arg6 & this.field9759[var192]) != 0) {
								int var193 = this.field9722[var192] & 0xFFFF;
								int var194 = var193 >> 10 & 0x3F;
								int var195 = var193 >> 7 & 0x7;
								int var196 = var193 & 0x7F;
								int var197 = arg2 + var194 & 0x3F;
								int var198 = arg3 / 4 + var195;
								if (var198 < 0) {
									var198 = 0;
								} else if (var198 > 7) {
									var198 = 7;
								}
								int var199 = arg4 + var196;
								if (var199 < 0) {
									var199 = 0;
								} else if (var199 > 127) {
									var199 = 127;
								}
								this.field9722[var192] = (short) (var197 << 10 | var198 << 7 | var199);
							}
						}
						var187 |= var190.length > 0;
					}
				}
				if (var187) {
					if (this.field9758 != null) {
						for (int var200 = 0; var200 < this.field9746; var200++) {
							GpuModelRelated2 var201 = this.field9758[var200];
							GpuModelRelated5 var202 = this.field9757[var200];
							var202.field3297 = var202.field3297 & 0xFF000000 | ColourUtils.field8151[this.field9722[var201.field3345] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method15596();
				}
			}
		} else if (arg0 == 8) {
			if (this.field9751 != null) {
				for (int var203 = 0; var203 < var9; var203++) {
					int var204 = arg1[var203];
					if (var204 < this.field9751.length) {
						int[] var205 = this.field9751[var204];
						for (int var206 = 0; var206 < var205.length; var206++) {
							GpuModelRelated5 var207 = this.field9757[var205[var206]];
							var207.field3299 += arg2;
							var207.field3298 += arg3;
						}
					}
				}
			}
		} else if (arg0 == 10) {
			if (this.field9751 != null) {
				for (int var208 = 0; var208 < var9; var208++) {
					int var209 = arg1[var208];
					if (var209 < this.field9751.length) {
						int[] var210 = this.field9751[var209];
						for (int var211 = 0; var211 < var210.length; var211++) {
							GpuModelRelated5 var212 = this.field9757[var210[var211]];
							var212.field3294 = var212.field3294 * arg2 >> 7;
							var212.field3296 = var212.field3296 * arg3 >> 7;
						}
					}
				}
			}
		} else if (arg0 == 9 && this.field9751 != null) {
			for (int var213 = 0; var213 < var9; var213++) {
				int var214 = arg1[var213];
				if (var214 < this.field9751.length) {
					int[] var215 = this.field9751[var214];
					for (int var216 = 0; var216 < var215.length; var216++) {
						GpuModelRelated5 var217 = this.field9757[var215[var216]];
						var217.field3295 = var217.field3295 + arg2 & 0x3FFF;
					}
				}
			}
		}
	}

	@ObfuscatedName("afo.ar(IIII)V")
	public void method1721(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 == 0) {
			int var5 = 0;
			this.field9768 = 0;
			this.field9769 = 0;
			this.field9770 = 0;
			for (int var6 = 0; var6 < this.field9704; var6++) {
				this.field9768 += this.field9705[var6];
				this.field9769 += this.field9767[var6];
				this.field9770 += this.field9712[var6];
				var5++;
			}
			if (var5 > 0) {
				this.field9768 = this.field9768 / var5 + arg1;
				this.field9769 = this.field9769 / var5 + arg2;
				this.field9770 = this.field9770 / var5 + arg3;
			} else {
				this.field9768 = arg1;
				this.field9769 = arg2;
				this.field9770 = arg3;
			}
		} else if (arg0 == 1) {
			for (int var7 = 0; var7 < this.field9704; var7++) {
				this.field9705[var7] += arg1;
				this.field9767[var7] += arg2;
				this.field9712[var7] += arg3;
			}
		} else if (arg0 == 2) {
			for (int var8 = 0; var8 < this.field9704; var8++) {
				this.field9705[var8] -= this.field9768;
				this.field9767[var8] -= this.field9769;
				this.field9712[var8] -= this.field9770;
				if (arg3 != 0) {
					int var9 = Trig1.sin[arg3];
					int var10 = Trig1.cos[arg3];
					int var11 = this.field9767[var8] * var9 + this.field9705[var8] * var10 + 16383 >> 14;
					this.field9767[var8] = this.field9767[var8] * var10 - this.field9705[var8] * var9 + 16383 >> 14;
					this.field9705[var8] = var11;
				}
				if (arg1 != 0) {
					int var12 = Trig1.sin[arg1];
					int var13 = Trig1.cos[arg1];
					int var14 = this.field9767[var8] * var13 - this.field9712[var8] * var12 + 16383 >> 14;
					this.field9712[var8] = this.field9767[var8] * var12 + this.field9712[var8] * var13 + 16383 >> 14;
					this.field9767[var8] = var14;
				}
				if (arg2 != 0) {
					int var15 = Trig1.sin[arg2];
					int var16 = Trig1.cos[arg2];
					int var17 = this.field9712[var8] * var15 + this.field9705[var8] * var16 + 16383 >> 14;
					this.field9712[var8] = this.field9712[var8] * var16 - this.field9705[var8] * var15 + 16383 >> 14;
					this.field9705[var8] = var17;
				}
				this.field9705[var8] += this.field9768;
				this.field9767[var8] += this.field9769;
				this.field9712[var8] += this.field9770;
			}
		} else if (arg0 == 3) {
			for (int var18 = 0; var18 < this.field9704; var18++) {
				this.field9705[var18] -= this.field9768;
				this.field9767[var18] -= this.field9769;
				this.field9712[var18] -= this.field9770;
				this.field9705[var18] = this.field9705[var18] * arg1 / 128;
				this.field9767[var18] = this.field9767[var18] * arg2 / 128;
				this.field9712[var18] = this.field9712[var18] * arg3 / 128;
				this.field9705[var18] += this.field9768;
				this.field9767[var18] += this.field9769;
				this.field9712[var18] += this.field9770;
			}
		} else if (arg0 == 5) {
			for (int var19 = 0; var19 < this.field9716; var19++) {
				int var20 = (this.field9745[var19] & 0xFF) + arg1 * 8;
				if (var20 < 0) {
					var20 = 0;
				} else if (var20 > 255) {
					var20 = 255;
				}
				this.field9745[var19] = (byte) var20;
			}
			if (this.field9758 != null) {
				for (int var21 = 0; var21 < this.field9746; var21++) {
					GpuModelRelated2 var22 = this.field9758[var21];
					GpuModelRelated5 var23 = this.field9757[var21];
					var23.field3297 = var23.field3297 & 0xFFFFFF | 255 - (this.field9745[var22.field3345] & 0xFF) << 24;
				}
			}
			this.method15596();
		} else if (arg0 == 7) {
			for (int var24 = 0; var24 < this.field9716; var24++) {
				int var25 = this.field9722[var24] & 0xFFFF;
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
				this.field9722[var24] = (short) (var29 << 10 | var30 << 7 | var31);
			}
			if (this.field9758 != null) {
				for (int var32 = 0; var32 < this.field9746; var32++) {
					GpuModelRelated2 var33 = this.field9758[var32];
					GpuModelRelated5 var34 = this.field9757[var32];
					var34.field3297 = var34.field3297 & 0xFF000000 | ColourUtils.field8151[this.field9722[var33.field3345] & 0xFFFF] & 0xFFFFFF;
				}
			}
			this.method15596();
		} else if (arg0 == 8) {
			for (int var35 = 0; var35 < this.field9746; var35++) {
				GpuModelRelated5 var36 = this.field9757[var35];
				var36.field3299 += arg1;
				var36.field3298 += arg2;
			}
		} else if (arg0 == 10) {
			for (int var37 = 0; var37 < this.field9746; var37++) {
				GpuModelRelated5 var38 = this.field9757[var37];
				var38.field3294 = var38.field3294 * arg1 >> 7;
				var38.field3296 = var38.field3296 * arg2 >> 7;
			}
		} else if (arg0 == 9) {
			for (int var39 = 0; var39 < this.field9746; var39++) {
				GpuModelRelated5 var40 = this.field9757[var39];
				var40.field3295 = var40.field3295 + arg1 & 0x3FFF;
			}
		}
	}

	@ObfuscatedName("afo.at(I[IIIIIZ)V")
	public void applyTransform(int type, int[] labels, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = labels.length;
		if (type == 0) {
			int var9 = arg2 << 4;
			int var10 = arg3 << 4;
			int var11 = arg4 << 4;
			int var12 = 0;
			this.field9768 = 0;
			this.field9769 = 0;
			this.field9770 = 0;
			for (int var13 = 0; var13 < var8; var13++) {
				int var14 = labels[var13];
				if (var14 < this.field9702.length) {
					int[] var15 = this.field9702[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						this.field9768 += this.field9705[var17];
						this.field9769 += this.field9767[var17];
						this.field9770 += this.field9712[var17];
						var12++;
					}
				}
			}
			if (var12 > 0) {
				this.field9768 = this.field9768 / var12 + var9;
				this.field9769 = this.field9769 / var12 + var10;
				this.field9770 = this.field9770 / var12 + var11;
			} else {
				this.field9768 = var9;
				this.field9769 = var10;
				this.field9770 = var11;
			}
		} else if (type == 1) {
			int var18 = arg2 << 4;
			int var19 = arg3 << 4;
			int var20 = arg4 << 4;
			for (int var21 = 0; var21 < var8; var21++) {
				int var22 = labels[var21];
				if (var22 < this.field9702.length) {
					int[] var23 = this.field9702[var22];
					for (int var24 = 0; var24 < var23.length; var24++) {
						int var25 = var23[var24];
						this.field9705[var25] += var18;
						this.field9767[var25] += var19;
						this.field9712[var25] += var20;
					}
				}
			}
		} else if (type == 2) {
			for (int var26 = 0; var26 < var8; var26++) {
				int var27 = labels[var26];
				if (var27 < this.field9702.length) {
					int[] var28 = this.field9702[var27];
					if ((arg5 & 0x1) == 0) {
						for (int var29 = 0; var29 < var28.length; var29++) {
							int var30 = var28[var29];
							this.field9705[var30] -= this.field9768;
							this.field9767[var30] -= this.field9769;
							this.field9712[var30] -= this.field9770;
							if (arg4 != 0) {
								int var31 = Trig1.sin[arg4];
								int var32 = Trig1.cos[arg4];
								int var33 = this.field9767[var30] * var31 + this.field9705[var30] * var32 + 16383 >> 14;
								this.field9767[var30] = this.field9767[var30] * var32 - this.field9705[var30] * var31 + 16383 >> 14;
								this.field9705[var30] = var33;
							}
							if (arg2 != 0) {
								int var34 = Trig1.sin[arg2];
								int var35 = Trig1.cos[arg2];
								int var36 = this.field9767[var30] * var35 - this.field9712[var30] * var34 + 16383 >> 14;
								this.field9712[var30] = this.field9767[var30] * var34 + this.field9712[var30] * var35 + 16383 >> 14;
								this.field9767[var30] = var36;
							}
							if (arg3 != 0) {
								int var37 = Trig1.sin[arg3];
								int var38 = Trig1.cos[arg3];
								int var39 = this.field9712[var30] * var37 + this.field9705[var30] * var38 + 16383 >> 14;
								this.field9712[var30] = this.field9712[var30] * var38 - this.field9705[var30] * var37 + 16383 >> 14;
								this.field9705[var30] = var39;
							}
							this.field9705[var30] += this.field9768;
							this.field9767[var30] += this.field9769;
							this.field9712[var30] += this.field9770;
						}
					} else {
						for (int var40 = 0; var40 < var28.length; var40++) {
							int var41 = var28[var40];
							this.field9705[var41] -= this.field9768;
							this.field9767[var41] -= this.field9769;
							this.field9712[var41] -= this.field9770;
							if (arg2 != 0) {
								int var42 = Trig1.sin[arg2];
								int var43 = Trig1.cos[arg2];
								int var44 = this.field9767[var41] * var43 - this.field9712[var41] * var42 + 16383 >> 14;
								this.field9712[var41] = this.field9767[var41] * var42 + this.field9712[var41] * var43 + 16383 >> 14;
								this.field9767[var41] = var44;
							}
							if (arg4 != 0) {
								int var45 = Trig1.sin[arg4];
								int var46 = Trig1.cos[arg4];
								int var47 = this.field9767[var41] * var45 + this.field9705[var41] * var46 + 16383 >> 14;
								this.field9767[var41] = this.field9767[var41] * var46 - this.field9705[var41] * var45 + 16383 >> 14;
								this.field9705[var41] = var47;
							}
							if (arg3 != 0) {
								int var48 = Trig1.sin[arg3];
								int var49 = Trig1.cos[arg3];
								int var50 = this.field9712[var41] * var48 + this.field9705[var41] * var49 + 16383 >> 14;
								this.field9712[var41] = this.field9712[var41] * var49 - this.field9705[var41] * var48 + 16383 >> 14;
								this.field9705[var41] = var50;
							}
							this.field9705[var41] += this.field9768;
							this.field9767[var41] += this.field9769;
							this.field9712[var41] += this.field9770;
						}
					}
				}
			}
			if (arg6) {
				for (int var51 = 0; var51 < var8; var51++) {
					int var52 = labels[var51];
					if (var52 < this.field9702.length) {
						int[] var53 = this.field9702[var52];
						for (int var54 = 0; var54 < var53.length; var54++) {
							int var55 = var53[var54];
							int var56 = this.field9753[var55];
							int var57 = this.field9753[var55 + 1];
							for (int var58 = var56; var58 < var57 && this.field9754[var58] != 0; var58++) {
								int var59 = (this.field9754[var58] & 0xFFFF) - 1;
								if (arg4 != 0) {
									int var60 = Trig1.sin[arg4];
									int var61 = Trig1.cos[arg4];
									int var62 = this.field9723[var59] * var61 + this.field9714[var59] * var60 + 16383 >> 14;
									this.field9714[var59] = (short) (this.field9714[var59] * var61 - this.field9723[var59] * var60 + 16383 >> 14);
									this.field9723[var59] = (short) var62;
								}
								if (arg2 != 0) {
									int var63 = Trig1.sin[arg2];
									int var64 = Trig1.cos[arg2];
									int var65 = this.field9714[var59] * var64 - this.field9715[var59] * var63 + 16383 >> 14;
									this.field9715[var59] = (short) (this.field9715[var59] * var64 + this.field9714[var59] * var63 + 16383 >> 14);
									this.field9714[var59] = (short) var65;
								}
								if (arg3 != 0) {
									int var66 = Trig1.sin[arg3];
									int var67 = Trig1.cos[arg3];
									int var68 = this.field9723[var59] * var67 + this.field9715[var59] * var66 + 16383 >> 14;
									this.field9715[var59] = (short) (this.field9715[var59] * var67 - this.field9723[var59] * var66 + 16383 >> 14);
									this.field9723[var59] = (short) var68;
								}
							}
						}
					}
				}
				this.method15599();
			}
		} else if (type == 3) {
			for (int var69 = 0; var69 < var8; var69++) {
				int var70 = labels[var69];
				if (var70 < this.field9702.length) {
					int[] var71 = this.field9702[var70];
					for (int var72 = 0; var72 < var71.length; var72++) {
						int var73 = var71[var72];
						this.field9705[var73] -= this.field9768;
						this.field9767[var73] -= this.field9769;
						this.field9712[var73] -= this.field9770;
						this.field9705[var73] = this.field9705[var73] * arg2 >> 7;
						this.field9767[var73] = this.field9767[var73] * arg3 >> 7;
						this.field9712[var73] = this.field9712[var73] * arg4 >> 7;
						this.field9705[var73] += this.field9768;
						this.field9767[var73] += this.field9769;
						this.field9712[var73] += this.field9770;
					}
				}
			}
		} else if (type == 5) {
			if (this.field9728 != null) {
				boolean var74 = false;
				for (int var75 = 0; var75 < var8; var75++) {
					int var76 = labels[var75];
					if (var76 < this.field9728.length) {
						int[] var77 = this.field9728[var76];
						for (int var78 = 0; var78 < var77.length; var78++) {
							int var79 = var77[var78];
							int var80 = (this.field9745[var79] & 0xFF) + arg2 * 8;
							if (var80 < 0) {
								var80 = 0;
							} else if (var80 > 255) {
								var80 = 255;
							}
							this.field9745[var79] = (byte) var80;
						}
						var74 |= var77.length > 0;
					}
				}
				if (var74) {
					if (this.field9758 != null) {
						for (int var81 = 0; var81 < this.field9746; var81++) {
							GpuModelRelated2 var82 = this.field9758[var81];
							GpuModelRelated5 var83 = this.field9757[var81];
							var83.field3297 = var83.field3297 & 0xFFFFFF | 255 - (this.field9745[var82.field3345] & 0xFF) << 24;
						}
					}
					this.method15596();
				}
			}
		} else if (type == 7) {
			if (this.field9728 != null) {
				boolean var84 = false;
				for (int var85 = 0; var85 < var8; var85++) {
					int var86 = labels[var85];
					if (var86 < this.field9728.length) {
						int[] var87 = this.field9728[var86];
						for (int var88 = 0; var88 < var87.length; var88++) {
							int var89 = var87[var88];
							int var90 = this.field9722[var89] & 0xFFFF;
							int var91 = var90 >> 10 & 0x3F;
							int var92 = var90 >> 7 & 0x7;
							int var93 = var90 & 0x7F;
							int var94 = arg2 + var91 & 0x3F;
							int var95 = arg3 / 4 + var92;
							if (var95 < 0) {
								var95 = 0;
							} else if (var95 > 7) {
								var95 = 7;
							}
							int var96 = arg4 + var93;
							if (var96 < 0) {
								var96 = 0;
							} else if (var96 > 127) {
								var96 = 127;
							}
							this.field9722[var89] = (short) (var94 << 10 | var95 << 7 | var96);
						}
						var84 |= var87.length > 0;
					}
				}
				if (var84) {
					if (this.field9758 != null) {
						for (int var97 = 0; var97 < this.field9746; var97++) {
							GpuModelRelated2 var98 = this.field9758[var97];
							GpuModelRelated5 var99 = this.field9757[var97];
							var99.field3297 = var99.field3297 & 0xFF000000 | ColourUtils.field8151[this.field9722[var98.field3345] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method15596();
				}
			}
		} else if (type == 8) {
			if (this.field9751 != null) {
				for (int var100 = 0; var100 < var8; var100++) {
					int var101 = labels[var100];
					if (var101 < this.field9751.length) {
						int[] var102 = this.field9751[var101];
						for (int var103 = 0; var103 < var102.length; var103++) {
							GpuModelRelated5 var104 = this.field9757[var102[var103]];
							var104.field3299 += arg2;
							var104.field3298 += arg3;
						}
					}
				}
			}
		} else if (type == 10) {
			if (this.field9751 != null) {
				for (int var105 = 0; var105 < var8; var105++) {
					int var106 = labels[var105];
					if (var106 < this.field9751.length) {
						int[] var107 = this.field9751[var106];
						for (int var108 = 0; var108 < var107.length; var108++) {
							GpuModelRelated5 var109 = this.field9757[var107[var108]];
							var109.field3294 = var109.field3294 * arg2 >> 7;
							var109.field3296 = var109.field3296 * arg3 >> 7;
						}
					}
				}
			}
		} else if (type == 9 && this.field9751 != null) {
			for (int var110 = 0; var110 < var8; var110++) {
				int var111 = labels[var110];
				if (var111 < this.field9751.length) {
					int[] var112 = this.field9751[var111];
					for (int var113 = 0; var113 < var112.length; var113++) {
						GpuModelRelated5 var114 = this.field9757[var112[var113]];
						var114.field3295 = var114.field3295 + arg2 & 0x3FFF;
					}
				}
			}
		}
	}

	@ObfuscatedName("afo.ad(I[IIIIIZ)V")
	public void method1711(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		if (arg0 != 0) {
			this.applyTransform(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			return;
		}
		int var8 = arg2 << 4;
		int var9 = arg3 << 4;
		int var10 = arg4 << 4;
		this.field9768 = var8;
		this.field9769 = var9;
		this.field9770 = var10;
	}

	@ObfuscatedName("afo.au(I[IIIIZI[I)V")
	public void method1720(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		if (arg0 != 0) {
			this.method1719(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		int var9 = arg2 << 4;
		int var10 = arg3 << 4;
		int var11 = arg4 << 4;
		this.field9768 = var9;
		this.field9769 = var10;
		this.field9770 = var11;
	}

	@ObfuscatedName("afo.ap()V")
	public void method1776() {
		for (int var1 = 0; var1 < this.field9703; var1++) {
			this.field9705[var1] = this.field9705[var1] + 7 >> 4;
			this.field9767[var1] = this.field9767[var1] + 7 >> 4;
			this.field9712[var1] = this.field9712[var1] + 7 >> 4;
		}
		this.method15598();
		this.field9718 = false;
	}

	@ObfuscatedName("afo.aq(Lou;IZ)V")
	public void method1771(Matrix4x3 arg0, int arg1, boolean arg2) {
		if (this.field9709 == null) {
			return;
		}
		Matrix4x3 var4 = arg0;
		if (arg2) {
			var4 = this.field9730.field10065;
			var4.method6299(arg0);
		}
		float[] var5 = new float[3];
		for (int var6 = 0; var6 < this.field9704; var6++) {
			if ((arg1 & this.field9709[var6]) != 0) {
				var4.method6295((float) this.field9705[var6], (float) this.field9767[var6], (float) this.field9712[var6], var5);
				this.field9705[var6] = (int) var5[0];
				this.field9767[var6] = (int) var5[1];
				this.field9712[var6] = (int) var5[2];
			}
		}
	}

	@ObfuscatedName("afo.bw()[Lcq;")
	public ModelParticleEffector[] method1765() {
		return this.field9738;
	}

	@ObfuscatedName("afo.bu()[Ldu;")
	public ModelParticleEmitter[] method1750() {
		return this.field9755;
	}

	@ObfuscatedName("afo.by(Lou;)V")
	public void method1689(Matrix4x3 arg0) {
		Matrix4x4 var2 = this.field9730.field10066;
		var2.setToMatrix4x3(arg0);
		if (this.field9755 != null) {
			for (int var3 = 0; var3 < this.field9755.length; var3++) {
				ModelParticleEmitter var4 = this.field9755[var3];
				ModelParticleEmitter var5 = var4;
				if (var4.field1465 != null) {
					var5 = var4.field1465;
				}
				var5.field1470 = (int) (var2.entries[8] * (float) this.field9712[var4.field1476] + var2.entries[0] * (float) this.field9705[var4.field1476] + var2.entries[4] * (float) this.field9767[var4.field1476] + var2.entries[12]);
				var5.field1474 = (int) (var2.entries[9] * (float) this.field9712[var4.field1476] + var2.entries[1] * (float) this.field9705[var4.field1476] + var2.entries[5] * (float) this.field9767[var4.field1476] + var2.entries[13]);
				var5.field1472 = (int) (var2.entries[10] * (float) this.field9712[var4.field1476] + var2.entries[2] * (float) this.field9705[var4.field1476] + var2.entries[6] * (float) this.field9767[var4.field1476] + var2.entries[14]);
				var5.field1473 = (int) (var2.entries[8] * (float) this.field9712[var4.field1467] + var2.entries[0] * (float) this.field9705[var4.field1467] + var2.entries[4] * (float) this.field9767[var4.field1467] + var2.entries[12]);
				var5.field1469 = (int) (var2.entries[9] * (float) this.field9712[var4.field1467] + var2.entries[1] * (float) this.field9705[var4.field1467] + var2.entries[5] * (float) this.field9767[var4.field1467] + var2.entries[13]);
				var5.field1475 = (int) (var2.entries[10] * (float) this.field9712[var4.field1467] + var2.entries[2] * (float) this.field9705[var4.field1467] + var2.entries[6] * (float) this.field9767[var4.field1467] + var2.entries[14]);
				var5.field1464 = (int) (var2.entries[8] * (float) this.field9712[var4.field1468] + var2.entries[0] * (float) this.field9705[var4.field1468] + var2.entries[4] * (float) this.field9767[var4.field1468] + var2.entries[12]);
				var5.field1466 = (int) (var2.entries[9] * (float) this.field9712[var4.field1468] + var2.entries[1] * (float) this.field9705[var4.field1468] + var2.entries[5] * (float) this.field9767[var4.field1468] + var2.entries[13]);
				var5.field1478 = (int) (var2.entries[10] * (float) this.field9712[var4.field1468] + var2.entries[2] * (float) this.field9705[var4.field1468] + var2.entries[6] * (float) this.field9767[var4.field1468] + var2.entries[14]);
			}
		}
		if (this.field9738 == null) {
			return;
		}
		for (int var6 = 0; var6 < this.field9738.length; var6++) {
			ModelParticleEffector var7 = this.field9738[var6];
			ModelParticleEffector var8 = var7;
			if (var7.field1230 != null) {
				var8 = var7.field1230;
			}
			if (var7.field1231 == null) {
				var7.field1231 = new Matrix4x4(var2);
			} else {
				var7.field1231.setTo(var2);
			}
			var8.field1226 = (int) (var2.entries[8] * (float) this.field9712[var7.field1225] + var2.entries[0] * (float) this.field9705[var7.field1225] + var2.entries[4] * (float) this.field9767[var7.field1225] + var2.entries[12]);
			var8.field1229 = (int) (var2.entries[9] * (float) this.field9712[var7.field1225] + var2.entries[1] * (float) this.field9705[var7.field1225] + var2.entries[5] * (float) this.field9767[var7.field1225] + var2.entries[13]);
			var8.field1227 = (int) (var2.entries[10] * (float) this.field9712[var7.field1225] + var2.entries[2] * (float) this.field9705[var7.field1225] + var2.entries[6] * (float) this.field9767[var7.field1225] + var2.entries[14]);
		}
	}

	@ObfuscatedName("afo.av(IILou;ZI)Z")
	public boolean method1725(int arg0, int arg1, Matrix4x3 arg2, boolean arg3, int arg4) {
		return this.method15590(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@ObfuscatedName("afo.he(IIIILou;ZI)Z")
	public boolean method15590(int arg0, int arg1, int arg2, int arg3, Matrix4x3 arg4, boolean arg5, int arg6) {
		Matrix4x4 var8 = this.field9730.field10066;
		var8.setToMatrix4x3(arg4);
		var8.multiply(this.field9730.field10145);
		boolean var9 = false;
		float var10 = Float.MAX_VALUE;
		float var11 = -3.4028235E38F;
		float var12 = Float.MAX_VALUE;
		float var13 = -3.4028235E38F;
		if (!this.field9718) {
			this.method15613();
		}
		int var14 = this.field9719 - this.field9744 >> 1;
		int var15 = this.field9743 - this.field9742 >> 1;
		int var16 = this.field9696 - this.field9708 >> 1;
		int var17 = this.field9744 + var14;
		int var18 = this.field9742 + var15;
		int var19 = this.field9708 + var16;
		int var20 = var17 - (var14 << arg6);
		int var21 = var18 - (var15 << arg6);
		int var22 = var19 - (var16 << arg6);
		int var23 = (var14 << arg6) + var17;
		int var24 = (var15 << arg6) + var18;
		int var25 = (var16 << arg6) + var19;
		this.field9765[0] = var20;
		this.field9766[0] = var21;
		this.field9739[0] = var22;
		this.field9765[1] = var23;
		this.field9766[1] = var21;
		this.field9739[1] = var22;
		this.field9765[2] = var20;
		this.field9766[2] = var24;
		this.field9739[2] = var22;
		this.field9765[3] = var23;
		this.field9766[3] = var24;
		this.field9739[3] = var22;
		this.field9765[4] = var20;
		this.field9766[4] = var21;
		this.field9739[4] = var25;
		this.field9765[5] = var23;
		this.field9766[5] = var21;
		this.field9739[5] = var25;
		this.field9765[6] = var20;
		this.field9766[6] = var24;
		this.field9739[6] = var25;
		this.field9765[7] = var23;
		this.field9766[7] = var24;
		this.field9739[7] = var25;
		for (int var26 = 0; var26 < 8; var26++) {
			float var27 = (float) this.field9765[var26];
			float var28 = (float) this.field9766[var26];
			float var29 = (float) this.field9739[var26];
			float var30 = var8.entries[10] * var29 + var8.entries[2] * var27 + var8.entries[6] * var28 + var8.entries[14];
			float var31 = var8.entries[11] * var29 + var8.entries[3] * var27 + var8.entries[7] * var28 + var8.entries[15];
			if (var30 >= -var31) {
				float var32 = var8.entries[8] * var29 + var8.entries[0] * var27 + var8.entries[4] * var28 + var8.entries[12];
				float var33 = var8.entries[9] * var29 + var8.entries[1] * var27 + var8.entries[5] * var28 + var8.entries[13];
				float var34 = this.field9730.field10084 * var32 / var31 + this.field9730.field10083;
				float var35 = this.field9730.field10086 * var33 / var31 + this.field9730.field10085;
				if (var34 < var10) {
					var10 = var34;
				}
				if (var34 > var11) {
					var11 = var34;
				}
				if (var35 < var12) {
					var12 = var35;
				}
				if (var35 > var13) {
					var13 = var35;
				}
				var9 = true;
			}
		}
		int var36 = arg0 + arg2;
		int var37 = arg1 + arg3;
		if (var9 && (float) var36 > var10 && (float) arg0 < var11 && (float) var37 > var12 && (float) arg1 < var13) {
			if (arg5) {
				return true;
			}
			if (this.field9763.length < this.field9710) {
				this.field9763 = new int[this.field9710];
				this.field9764 = new int[this.field9710];
			}
			for (int var38 = 0; var38 < this.field9704; var38++) {
				float var39 = (float) this.field9705[var38];
				float var40 = (float) this.field9767[var38];
				float var41 = (float) this.field9712[var38];
				float var42 = var8.entries[10] * var41 + var8.entries[2] * var39 + var8.entries[6] * var40 + var8.entries[14];
				float var43 = var8.entries[11] * var41 + var8.entries[3] * var39 + var8.entries[7] * var40 + var8.entries[15];
				if (var42 >= -var43) {
					float var44 = var8.entries[8] * var41 + var8.entries[0] * var39 + var8.entries[4] * var40 + var8.entries[12];
					float var45 = var8.entries[9] * var41 + var8.entries[1] * var39 + var8.entries[5] * var40 + var8.entries[13];
					int var46 = this.field9753[var38];
					int var47 = this.field9753[var38 + 1];
					for (int var48 = var46; var48 < var47 && this.field9754[var48] != 0; var48++) {
						int var49 = (this.field9754[var48] & 0xFFFF) - 1;
						this.field9763[var49] = (int) (this.field9730.field10084 * var44 / var43 + this.field9730.field10083);
						this.field9764[var49] = (int) (this.field9730.field10086 * var45 / var43 + this.field9730.field10085);
					}
				} else {
					int var50 = this.field9753[var38];
					int var51 = this.field9753[var38 + 1];
					for (int var52 = var50; var52 < var51 && this.field9754[var52] != 0; var52++) {
						int var53 = (this.field9754[var52] & 0xFFFF) - 1;
						this.field9763[var53] = -999999;
					}
				}
			}
			for (int var54 = 0; var54 < this.field9716; var54++) {
				if (this.field9763[this.field9713[var54] & 0xFFFF] != -999999 && this.field9763[this.field9762[var54] & 0xFFFF] != -999999 && this.field9763[this.field9726[var54] & 0xFFFF] != -999999 && this.method15602(arg0, arg1, var36, var37, this.field9764[this.field9713[var54] & 0xFFFF], this.field9764[this.field9762[var54] & 0xFFFF], this.field9764[this.field9726[var54] & 0xFFFF], this.field9763[this.field9713[var54] & 0xFFFF], this.field9763[this.field9762[var54] & 0xFFFF], this.field9763[this.field9726[var54] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("afo.hn(IIIIIIIIII)Z")
	public boolean method15602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@ObfuscatedName("afo.ao(Lara;)Lara;")
	public HardShadow method1726(HardShadow arg0) {
		if (this.field9710 == 0) {
			return null;
		}
		if (!this.field9718) {
			this.method15613();
		}
		int var2;
		int var3;
		if (this.field9730.field10130 > 0) {
			var2 = this.field9744 - (this.field9730.field10130 * this.field9743 >> 8) >> this.field9730.field10129;
			var3 = this.field9719 - (this.field9730.field10130 * this.field9742 >> 8) >> this.field9730.field10129;
		} else {
			var2 = this.field9744 - (this.field9730.field10130 * this.field9742 >> 8) >> this.field9730.field10129;
			var3 = this.field9719 - (this.field9730.field10130 * this.field9743 >> 8) >> this.field9730.field10129;
		}
		int var4;
		int var5;
		if (this.field9730.field10131 > 0) {
			var4 = this.field9708 - (this.field9730.field10131 * this.field9743 >> 8) >> this.field9730.field10129;
			var5 = this.field9696 - (this.field9730.field10131 * this.field9742 >> 8) >> this.field9730.field10129;
		} else {
			var4 = this.field9708 - (this.field9730.field10131 * this.field9742 >> 8) >> this.field9730.field10129;
			var5 = this.field9696 - (this.field9730.field10131 * this.field9743 >> 8) >> this.field9730.field10129;
		}
		int var6 = var3 - var2 + 1;
		int var7 = var5 - var4 + 1;
		GpuHardShadow var8 = (GpuHardShadow) arg0;
		GpuHardShadow var9;
		if (var8 != null && var8.method19709(var6, var7)) {
			var9 = var8;
			var8.method19700();
		} else {
			var9 = new GpuHardShadow(this.field9730, var6, var7);
		}
		var9.method19698(var2, var4, var3, var5);
		this.method15603(var9);
		return var9;
	}

	@ObfuscatedName("afo.hi(Lati;)V")
	public void method15603(GpuHardShadow arg0) {
		if (this.field9763.length < this.field9710) {
			this.field9763 = new int[this.field9710];
			this.field9764 = new int[this.field9710];
		}
		for (int var2 = 0; var2 < this.field9704; var2++) {
			int var3 = (this.field9705[var2] - (this.field9767[var2] * this.field9730.field10130 >> 8) >> this.field9730.field10129) - arg0.field12546;
			int var4 = (this.field9712[var2] - (this.field9767[var2] * this.field9730.field10131 >> 8) >> this.field9730.field10129) - arg0.field12544;
			int var5 = this.field9753[var2];
			int var6 = this.field9753[var2 + 1];
			for (int var7 = var5; var7 < var6 && this.field9754[var7] != 0; var7++) {
				int var8 = (this.field9754[var7] & 0xFFFF) - 1;
				this.field9763[var8] = var3;
				this.field9764[var8] = var4;
			}
		}
		for (int var9 = 0; var9 < this.field9721; var9++) {
			if (this.field9745 == null || this.field9745[var9] <= 128) {
				int var10 = this.field9713[var9] & 0xFFFF;
				int var11 = this.field9762[var9] & 0xFFFF;
				int var12 = this.field9726[var9] & 0xFFFF;
				int var13 = this.field9763[var10];
				int var14 = this.field9763[var11];
				int var15 = this.field9763[var12];
				int var16 = this.field9764[var10];
				int var17 = this.field9764[var11];
				int var18 = this.field9764[var12];
				if ((var13 - var14) * (var17 - var18) - (var15 - var14) * (var17 - var16) > 0) {
					arg0.method19701(var16, var17, var18, var13, var14, var15);
				}
			}
		}
	}

	@ObfuscatedName("afo.ax(Lou;Led;I)V")
	public void draw(Matrix4x3 arg0, ScreenBoundingBox arg1, int arg2) {
		if (field9772 != null) {
			field9772.method5554();
		}
		if (arg1 != null) {
			arg1.field1686 = false;
		}
		if (this.field9710 == 0) {
			return;
		}
		Matrix4x4 var4 = this.field9730.field10076;
		Matrix4x4 var5 = this.field9730.field10066;
		Matrix4x4 var6 = this.field9730.field10039;
		var5.setToMatrix4x3(arg0);
		var6.setTo(var5);
		var6.multiply(this.field9730.field10145);
		if (!this.field9718) {
			this.method15613();
		}
		float[] var7 = this.field9730.field10069;
		var5.method6614(0.0F, (float) this.field9742, 0.0F, var7);
		float var8 = var7[0];
		float var9 = var7[1];
		float var10 = var7[2];
		var5.method6614(0.0F, (float) this.field9743, 0.0F, var7);
		float var11 = var7[0];
		float var12 = var7[1];
		float var13 = var7[2];
		for (int var14 = 0; var14 < 6; var14++) {
			float[] var15 = this.field9730.field10061[var14];
			float var16 = var15[2] * var10 + var15[0] * var8 + var15[1] * var9 + var15[3] + (float) this.field9740;
			float var17 = var15[2] * var13 + var15[0] * var11 + var15[1] * var12 + var15[3] + (float) this.field9740;
			if (var16 < 0.0F && var17 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			boolean var18 = false;
			boolean var19 = true;
			int var20 = this.field9744 + this.field9719 >> 1;
			int var21 = this.field9708 + this.field9696 >> 1;
			int var23 = this.field9742;
			float var25 = var6.entries[8] * (float) var21 + var6.entries[0] * (float) var20 + var6.entries[4] * (float) var23 + var6.entries[12];
			float var26 = var6.entries[9] * (float) var21 + var6.entries[1] * (float) var20 + var6.entries[5] * (float) var23 + var6.entries[13];
			float var27 = var6.entries[10] * (float) var21 + var6.entries[2] * (float) var20 + var6.entries[6] * (float) var23 + var6.entries[14];
			float var28 = var6.entries[11] * (float) var21 + var6.entries[3] * (float) var20 + var6.entries[7] * (float) var23 + var6.entries[15];
			if (var27 >= -var28) {
				arg1.field1683 = (int) (this.field9730.field10084 * var25 / var28 + this.field9730.field10083);
				arg1.field1684 = (int) (this.field9730.field10086 * var26 / var28 + this.field9730.field10085);
			} else {
				var18 = true;
			}
			int var30 = this.field9743;
			float var32 = var6.entries[8] * (float) var21 + var6.entries[0] * (float) var20 + var6.entries[4] * (float) var30 + var6.entries[12];
			float var33 = var6.entries[9] * (float) var21 + var6.entries[1] * (float) var20 + var6.entries[5] * (float) var30 + var6.entries[13];
			float var34 = var6.entries[10] * (float) var21 + var6.entries[2] * (float) var20 + var6.entries[6] * (float) var30 + var6.entries[14];
			float var35 = var6.entries[11] * (float) var21 + var6.entries[3] * (float) var20 + var6.entries[7] * (float) var30 + var6.entries[15];
			if (var34 >= -var35) {
				arg1.field1682 = (int) (this.field9730.field10084 * var32 / var35 + this.field9730.field10083);
				arg1.field1685 = (int) (this.field9730.field10086 * var33 / var35 + this.field9730.field10085);
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
					arg1.field1683 = (int) (this.field9730.field10084 * var37 / var39 + this.field9730.field10083);
					arg1.field1684 = (int) (this.field9730.field10086 * var38 / var39 + this.field9730.field10085);
				} else if (var34 < -var35) {
					float var40 = (var34 + var35) / (var27 + var28) - 1.0F;
					float var41 = (var25 - var32) * var40 + var32;
					float var42 = (var26 - var33) * var40 + var33;
					float var43 = (var28 - var35) * var40 + var35;
					arg1.field1682 = (int) (this.field9730.field10084 * var41 / var43 + this.field9730.field10083);
					arg1.field1685 = (int) (this.field9730.field10086 * var42 / var43 + this.field9730.field10085);
				}
			}
			if (var19) {
				if (var27 / var28 > var34 / var35) {
					float var44 = var4.entries[0] * (float) this.field9740 + var25 + var4.entries[12];
					float var45 = var4.entries[3] * (float) this.field9740 + var28 + var4.entries[15];
					arg1.field1687 = (int) (this.field9730.field10084 * var44 / var45 + (this.field9730.field10083 - (float) arg1.field1683));
				} else {
					float var46 = var4.entries[0] * (float) this.field9740 + var32 + var4.entries[12];
					float var47 = var4.entries[3] * (float) this.field9740 + var35 + var4.entries[15];
					arg1.field1687 = (int) (this.field9730.field10084 * var46 / var47 + (this.field9730.field10083 - (float) arg1.field1682));
				}
				arg1.field1686 = true;
			}
		}
		this.field9730.enableFillMode(arg2);
		this.method15601(arg0);
		this.field9730.enableFillMode(0);
		var5.setToMatrix4x3(arg0);
		var5.multiply(this.field9730.field10059);
		this.method15604(var5);
	}

	@ObfuscatedName("afo.hw(Lou;)V")
	public void method15601(Matrix4x3 arg0) {
		if (this.field9721 == 0 || (!this.method15614() || !this.method15607())) {
			return;
		}
		if (field9772 != null) {
		}
		this.field9730.method16022();
		this.field9730.method16199();
		ModelShader var2 = this.field9730.modelShader;
		this.field9730.setStreamSource(0, this.field9731.field3359);
		this.field9730.setStreamSource(1, this.field9732.field3359);
		this.field9730.setStreamSource(2, this.field9734.field3359);
		this.field9730.setIndices(this.field9756.field3239);
		this.field9730.field10066.setToMatrix4x3(arg0);
		var2.method5018(this.field9730.field10066);
		var2.field2982.setToIdentity();
		if (this.field9730.field10133) {
			WaterFogData var3 = this.field9730.method16053();
			var2.field2979.method6247(0.0F, 1.0F, 0.0F, (float) -this.field9730.field10164);
			var2.field2979.method6252(3.0F / (float) var3.scale);
			var2.field2973.setTo((float) (var3.colour >> 16 & 0xFF) / 255.0F, (float) (var3.colour >> 8 & 0xFF) / 255.0F, (float) (var3.colour >> 0 & 0xFF) / 255.0F);
		} else {
			var2.field2979.method6247(0.0F, 0.0F, 0.0F, 0.0F);
			var2.field2973.setTo(0.0F, 0.0F, 0.0F);
		}
		if (this.field9730.field10169 > 0) {
			var2.field2984.method6247(0.0F, 0.0F, 1.0F, -this.field9730.fogStart);
			var2.field2975.setTo((float) (this.field9730.fogDensity >> 16 & 0xFF) / 255.0F, (float) (this.field9730.fogDensity >> 8 & 0xFF) / 255.0F, (float) (this.field9730.fogDensity >> 0 & 0xFF) / 255.0F);
			this.field9730.field10066.setToMatrix4x3(arg0);
			this.field9730.field10066.method6631();
			var2.field2979.method6265(this.field9730.field10066);
			this.field9730.field10066.setToMatrix4x3(arg0);
			this.field9730.field10066.multiply(this.field9730.field10059);
			this.field9730.field10066.method6631();
			var2.field2984.method6265(this.field9730.field10066);
			var2.field2984.method6252(1.0F / (this.field9730.fogEnd - this.field9730.fogStart));
		} else {
			var2.field2984.method6247(0.0F, 0.0F, 0.0F, 0.0F);
			var2.field2975.setTo(0.0F, 0.0F, 0.0F);
		}
		if ((this.field9700 & 0x37) == 0) {
			this.field9730.setVertexDeclaration(this.field9730.field10184);
			if (this.field9730.lightingEnabled) {
				this.field9730.method16118(false);
			}
			for (int var4 = 0; var4 < this.field9741.length; var4++) {
				int var5 = this.field9750[var4];
				int var6 = this.field9750[var4 + 1];
				short var7 = this.field9717[var5];
				boolean var8 = false;
				byte var9 = 0;
				if (var7 == -1) {
					var2.field2966 = this.field9730.field10140;
					float[] var11 = var2.field2982.entries;
					var2.field2982.entries[13] = 0.0F;
					var11[12] = 0.0F;
				} else {
					Material var10 = this.field9730.materialList.get(var7 & 0xFFFF);
					var2.field2966 = this.field9730.field10188.method5639(var10);
					var8 = !Material.method261(var10.effect);
					var2.field2982.entries[12] = (float) (this.field9730.field10181 % 128000) / 1000.0F * var10.speedU / 64.0F % 1.0F;
					var2.field2982.entries[13] = (float) (this.field9730.field10181 % 128000) / 1000.0F * var10.speedV / 64.0F % 1.0F;
					if (MaterialAlphaMode.TEST == var10.alphaMode) {
						var9 = var10.alphaThreshold;
					}
				}
				this.field9730.method16056(var9);
				var2.field2981 = this.field9741[var4];
				var2.field2983 = this.field9752[var4];
				var2.field2972 = var5 * 3;
				var2.field2962 = var6 - var5;
				var2.method5019(var8);
			}
		} else {
			this.field9730.setStreamSource(3, this.field9733.field3359);
			this.field9730.setVertexDeclaration(this.field9730.field10202);
			Matrix4x3 var12 = this.field9730.field10065;
			var12.setTo(arg0);
			var12.method6300();
			int var13 = 0;
			if (this.field9730.lightingEnabled) {
				this.field9730.method16118(true);
			} else {
				var2.field2976.setTo(this.field9730.field10114[0], this.field9730.field10114[1], this.field9730.field10114[2]);
				var2.field2976.method6521(var12);
				var2.field2977.setTo(this.field9730.field10142 * this.field9730.field10123, this.field9730.field10123 * this.field9730.field10120, this.field9730.field10210 * this.field9730.field10123);
				var2.field2978.setTo(-this.field9730.field10124 * this.field9730.field10142, -this.field9730.field10124 * this.field9730.field10120, -this.field9730.field10124 * this.field9730.field10210);
				var2.field2968.setTo(this.field9730.field10142 * this.field9730.field10122, this.field9730.field10122 * this.field9730.field10120, this.field9730.field10210 * this.field9730.field10122);
				if (this.field9730.field10126 > 0) {
					var13 = this.field9730.field10126;
					Vector3 var14 = this.field9730.field10054;
					for (int var15 = 0; var15 < var13; var15++) {
						Light var16 = this.field9730.field10045[var15];
						int var17 = var16.method17624();
						var14.setTo(var16.field11331);
						var14.method6567(var12);
						var2.field2965[var15 * 4] = var14.x;
						var2.field2965[var15 * 4 + 1] = var14.y;
						var2.field2965[var15 * 4 + 2] = var14.z;
						var2.field2965[var15 * 4 + 3] = 1.0F / (float) (var16.method17608() * var16.method17608());
						float var18 = var16.method17610() / 255.0F;
						var2.field2964[var15 * 4] = (float) (var17 >> 16 & 0xFF) * var18;
						var2.field2964[var15 * 4 + 1] = (float) (var17 >> 8 & 0xFF) * var18;
						var2.field2964[var15 * 4 + 2] = (float) (var17 & 0xFF) * var18;
						var2.field2964[var15 * 4 + 3] = 1.0F;
					}
				}
			}
			for (int var19 = 0; var19 < this.field9741.length; var19++) {
				int var20 = this.field9750[var19];
				int var21 = this.field9750[var19 + 1];
				short var22 = this.field9717[var20];
				byte var23 = 11;
				Material var24 = null;
				byte var25 = 0;
				if (var22 == -1) {
					var2.field2966 = this.field9730.field10140;
					float[] var26 = var2.field2982.entries;
					var2.field2982.entries[13] = 0.0F;
					var26[12] = 0.0F;
				} else {
					var24 = this.field9730.materialList.get(var22 & 0xFFFF);
					var2.field2966 = this.field9730.field10188.method5639(var24);
					var23 = var24.effect;
					var2.method5036(var24.effectArg1);
					var2.field2982.entries[12] = (float) (this.field9730.field10181 % 128000) / 1000.0F * var24.speedU % 1.0F;
					var2.field2982.entries[13] = (float) (this.field9730.field10181 % 128000) / 1000.0F * var24.speedV % 1.0F;
					if (MaterialAlphaMode.TEST == var24.alphaMode) {
						var25 = var24.alphaThreshold;
					}
				}
				this.field9730.method16056(var25);
				var2.field2981 = this.field9741[var19];
				var2.field2983 = this.field9752[var19];
				var2.field2972 = var20 * 3;
				var2.field2962 = var21 - var20;
				switch(var23) {
					case 1:
						var2.field2969.setTo(this.field9730.field10035.entries[12], this.field9730.field10035.entries[13], this.field9730.field10035.entries[14]);
						var2.field2969.method6567(var12);
						var2.method5031(var13);
						break;
					case 2:
					case 3:
					case 4:
					default:
						var2.method5020(var13);
						break;
					case 5:
						if (this.field9730.lightingEnabled) {
							var2.method5020(var13);
						} else {
							WaterfallShader var27 = this.field9730.waterfallShader;
							var27.method19204(var24.effectArg1, var24.field1359);
							var27.worldMatrix.setToMatrix4x3(arg0);
							var27.wvpMatrix.setToMatrix4x3(arg0);
							var27.wvpMatrix.multiply(this.field9730.field10081);
							var27.field12116 = this.field9741[var19];
							var27.field12110 = this.field9752[var19];
							var27.field12115 = var20 * 3;
							var27.field12117 = var21 - var20;
							var27.method19202();
						}
						break;
					case 6:
						var2.method5019(!Material.method261(var23));
						break;
					case 7:
						var2.field2969.setTo(this.field9730.field10035.entries[12], this.field9730.field10035.entries[13], this.field9730.field10035.entries[14]);
						var2.field2969.method6567(var12);
						var2.field2980.setToMatrix4x3(arg0);
						var2.field2967 = this.field9730.getEnvMapSampler();
						var2.method5026(var13);
				}
			}
		}
		this.method15630();
	}

	@ObfuscatedName("afo.ht(Lpq;)V")
	public void method15604(Matrix4x4 arg0) {
		if (this.field9758 == null) {
			return;
		}
		this.field9730.method2219(!this.field9737);
		Matrix4x3 var2 = this.field9730.field10065;
		ParticleShader var3 = this.field9730.particleShader;
		boolean var4 = this.field9730.field10169 > 0;
		if (var4) {
			var3.field2990.setTo((float) (this.field9730.fogDensity >> 16 & 0xFF) / 255.0F, (float) (this.field9730.fogDensity >> 8 & 0xFF) / 255.0F, (float) (this.field9730.fogDensity >> 0 & 0xFF) / 255.0F);
		} else {
			var3.field2990.setTo(0.0F, 0.0F, 0.0F);
		}
		for (int var5 = 0; var5 < this.field9746; var5++) {
			GpuModelRelated2 var6 = this.field9758[var5];
			GpuModelRelated5 var7 = this.field9757[var5];
			if (!var6.field3349 || !this.field9730.isBloomEnabled()) {
				float var8 = (float) (this.field9705[var6.field3348] + this.field9705[var6.field3343] + this.field9705[var6.field3344]) * 0.3333333F;
				float var9 = (float) (this.field9767[var6.field3348] + this.field9767[var6.field3343] + this.field9767[var6.field3344]) * 0.3333333F;
				float var10 = (float) (this.field9712[var6.field3348] + this.field9712[var6.field3343] + this.field9712[var6.field3344]) * 0.3333333F;
				float var11 = arg0.entries[8] * var10 + arg0.entries[0] * var8 + arg0.entries[4] * var9 + arg0.entries[12];
				float var12 = arg0.entries[9] * var10 + arg0.entries[1] * var8 + arg0.entries[5] * var9 + arg0.entries[13];
				float var13 = arg0.entries[10] * var10 + arg0.entries[2] * var8 + arg0.entries[6] * var9 + arg0.entries[14];
				float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var11 * var11 + var12 * var12))) * (float) var6.field3350;
				var2.method6297(var7.field3295, var6.field3346 * var7.field3294 >> 7, var6.field3342 * var7.field3296 >> 7, (float) var7.field3299 + var11 - var11 * var14, (float) var7.field3298 + var12 - var12 * var14, var13 - var13 * var14);
				var2.method6316(this.field9730.field10042);
				this.field9730.field10039.setToMatrix4x3(var2);
				var3.method5038(this.field9730.field10039);
				var3.field2987.setToIdentity();
				var3.field2988 = var7.field3297;
				if (var4) {
					var3.field2985 = 1.0F - (this.field9730.fogEnd - var13) / (this.field9730.fogEnd - this.field9730.fogStart);
				}
				var3.field2991 = null;
				if (var6.field3347 != -1) {
					var3.field2991 = this.field9730.field10188.method5639(this.field9730.materialList.get(var6.field3347 & 0xFFFF));
				}
				var3.method5040(var4);
			}
		}
		this.field9730.method2219(true);
	}

	@ObfuscatedName("afo.hc()Z")
	public boolean method15607() {
		if (this.field9756.field3238) {
			return true;
		}
		if (this.field9756.field3237 == null) {
			this.field9756.field3237 = this.field9730.createIndexBuffer(false);
		}
		GpuIndexBuffer var1 = this.field9756.field3237;
		var1.method5831(this.field9721 * 6);
		Unsafe var2 = this.field9730.field10110;
		if (var2 != null) {
			int var3 = this.field9721 * 6;
			long var4 = var1.lock(0, var3);
			if (var4 == 0L) {
				return false;
			}
			for (int var6 = 0; var6 < this.field9721; var6++) {
				var2.putShort(var4, this.field9713[var6]);
				long var7 = var4 + 2L;
				var2.putShort(var7, this.field9762[var6]);
				long var9 = var7 + 2L;
				var2.putShort(var9, this.field9726[var6]);
				var4 = var9 + 2L;
			}
			var1.unlock();
			this.field9756.field3239 = var1;
			this.field9756.field3238 = true;
			this.field9736 = true;
			return true;
		}
		ByteBuffer var11 = this.field9730.temporaryBuffer;
		var11.clear();
		for (int var12 = 0; var12 < this.field9721; var12++) {
			var11.putShort(this.field9713[var12]);
			var11.putShort(this.field9762[var12]);
			var11.putShort(this.field9726[var12]);
		}
		if (var1.upload(0, var11.position(), this.field9730.temporaryBufferAddress)) {
			this.field9756.field3239 = var1;
			this.field9756.field3238 = true;
			this.field9736 = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("afo.ho()Z")
	public boolean method15614() {
		boolean var1 = !this.field9732.field3358;
		boolean var2 = (this.field9700 & 0x37) != 0 && !this.field9733.field3358;
		boolean var3 = !this.field9731.field3358;
		boolean var4 = !this.field9734.field3358;
		if (!var3 && !var1 && !var2 && !var4) {
			return true;
		}
		boolean var5 = true;
		if (var3 && this.field9711 != null) {
			if (this.field9731.field3356 == null) {
				this.field9731.field3356 = this.field9730.createVertexBuffer(this.field9735);
			}
			VertexBuffer var6 = this.field9731.field3356;
			var6.allocate(this.field9710 * 12, 12);
			Unsafe var7 = this.field9730.field10110;
			if (var7 == null) {
				ByteBuffer var17 = this.field9730.temporaryBuffer;
				var17.clear();
				for (int var18 = 0; var18 < this.field9710; var18++) {
					var17.putFloat((float) this.field9705[this.field9711[var18]]);
					var17.putFloat((float) this.field9767[this.field9711[var18]]);
					var17.putFloat((float) this.field9712[this.field9711[var18]]);
				}
				var6.upload(0, var17.position(), this.field9730.temporaryBufferAddress);
			} else {
				int var8 = this.field9710 * 12;
				long var9 = var6.lock(0, var8);
				for (int var11 = 0; var11 < this.field9710; var11++) {
					short var12 = this.field9711[var11];
					var7.putFloat(var9, (float) this.field9705[var12]);
					long var13 = var9 + 4L;
					var7.putFloat(var13, (float) this.field9767[var12]);
					long var15 = var13 + 4L;
					var7.putFloat(var15, (float) this.field9712[var12]);
					var9 = var15 + 4L;
				}
				var6.unlock();
			}
			this.field9731.field3359 = var6;
			this.field9731.field3358 = true;
		}
		if (var1) {
			if (this.field9732.field3356 == null) {
				this.field9732.field3356 = this.field9730.createVertexBuffer(this.field9735);
			}
			VertexBuffer var19 = this.field9732.field3356;
			var19.allocate(this.field9710 * 4, 4);
			Unsafe var20 = this.field9730.field10110;
			if (var20 == null) {
				ByteBuffer var45 = this.field9730.temporaryBuffer;
				var45.clear();
				if ((this.field9700 & 0x37) == 0) {
					short[] var46;
					short[] var47;
					short[] var48;
					byte[] var49;
					if (this.field9771 == null) {
						var46 = this.field9723;
						var47 = this.field9714;
						var48 = this.field9715;
						var49 = this.field9747;
					} else {
						var46 = this.field9771.field3408;
						var47 = this.field9771.field3407;
						var48 = this.field9771.field3409;
						var49 = this.field9771.field3410;
					}
					float var50 = this.field9730.field10123 * 768.0F / (float) this.field9749;
					float var51 = this.field9730.field10124 * 768.0F / (float) this.field9749;
					for (int var52 = 0; var52 < this.field9710; var52++) {
						short var53 = this.field9698[var52];
						int var54 = this.method15609(this.field9722[var53] & 0xFFFF, this.field9717[var53], this.field9701);
						float var55 = (float) (var54 >> 16 & 0xFF) * this.field9730.field10142;
						float var56 = (float) (var54 >> 8 & 0xFF) * this.field9730.field10120;
						float var57 = (float) (var54 & 0xFF) * this.field9730.field10210;
						byte var58 = var49[var52];
						float var59;
						if (var58 == 0) {
							var59 = (this.field9730.field10114[2] * (float) var48[var52] + this.field9730.field10114[0] * (float) var46[var52] + this.field9730.field10114[1] * (float) var47[var52]) * 0.0026041667F;
						} else {
							var59 = (this.field9730.field10114[2] * (float) var48[var52] + this.field9730.field10114[0] * (float) var46[var52] + this.field9730.field10114[1] * (float) var47[var52]) / ((float) var58 * 256.0F);
						}
						float var60 = this.field9730.field10122 + var59 * (var59 < 0.0F ? var51 : var50);
						int var61 = (int) (var55 * var60);
						if (var61 < 0) {
							var61 = 0;
						} else if (var61 > 255) {
							var61 = 255;
						}
						int var62 = (int) (var56 * var60);
						if (var62 < 0) {
							var62 = 0;
						} else if (var62 > 255) {
							var62 = 255;
						}
						int var63 = (int) (var57 * var60);
						if (var63 < 0) {
							var63 = 0;
						} else if (var63 > 255) {
							var63 = 255;
						}
						var45.putInt(255 - this.field9745[var53] << 24 | var61 << 16 | var62 << 8 | var63);
					}
				} else {
					for (int var64 = 0; var64 < this.field9710; var64++) {
						short var65 = this.field9698[var64];
						int var66 = 255 - this.field9745[var65] << 24 | this.method15609(this.field9722[var65] & 0xFFFF, this.field9717[var65], this.field9701);
						var45.putInt(var66);
					}
				}
				var19.upload(0, var45.position(), this.field9730.temporaryBufferAddress);
			} else {
				int var21 = this.field9710 * 4;
				long var22 = var19.lock(0, var21);
				if ((this.field9700 & 0x37) == 0) {
					short[] var24;
					short[] var25;
					short[] var26;
					byte[] var27;
					if (this.field9771 == null) {
						var24 = this.field9723;
						var25 = this.field9714;
						var26 = this.field9715;
						var27 = this.field9747;
					} else {
						var24 = this.field9771.field3408;
						var25 = this.field9771.field3407;
						var26 = this.field9771.field3409;
						var27 = this.field9771.field3410;
					}
					float var28 = this.field9730.field10123 * 768.0F / (float) this.field9749;
					float var29 = this.field9730.field10124 * 768.0F / (float) this.field9749;
					for (int var30 = 0; var30 < this.field9710; var30++) {
						short var31 = this.field9698[var30];
						int var32 = this.method15609(this.field9722[var31] & 0xFFFF, this.field9717[var31], this.field9701);
						float var33 = (float) (var32 >> 16 & 0xFF) * this.field9730.field10142;
						float var34 = (float) (var32 >> 8 & 0xFF) * this.field9730.field10120;
						float var35 = (float) (var32 & 0xFF) * this.field9730.field10210;
						byte var36 = var27[var30];
						float var37;
						if (var36 == 0) {
							var37 = (this.field9730.field10114[2] * (float) var26[var30] + this.field9730.field10114[0] * (float) var24[var30] + this.field9730.field10114[1] * (float) var25[var30]) * 0.0026041667F;
						} else {
							var37 = (this.field9730.field10114[2] * (float) var26[var30] + this.field9730.field10114[0] * (float) var24[var30] + this.field9730.field10114[1] * (float) var25[var30]) / ((float) var36 * 256.0F);
						}
						float var38 = this.field9730.field10122 + var37 * (var37 < 0.0F ? var29 : var28);
						int var39 = (int) (var33 * var38);
						if (var39 < 0) {
							var39 = 0;
						} else if (var39 > 255) {
							var39 = 255;
						}
						int var40 = (int) (var34 * var38);
						if (var40 < 0) {
							var40 = 0;
						} else if (var40 > 255) {
							var40 = 255;
						}
						int var41 = (int) (var35 * var38);
						if (var41 < 0) {
							var41 = 0;
						} else if (var41 > 255) {
							var41 = 255;
						}
						var20.putInt(var22, 255 - this.field9745[var31] << 24 | var39 << 16 | var40 << 8 | var41);
						var22 += 4L;
					}
				} else {
					for (int var42 = 0; var42 < this.field9710; var42++) {
						short var43 = this.field9698[var42];
						int var44 = 255 - this.field9745[var43] << 24 | this.method15609(this.field9722[var43] & 0xFFFF, this.field9717[var43], this.field9701);
						var20.putInt(var22, var44);
						var22 += 4L;
					}
				}
				var19.unlock();
			}
			this.field9732.field3359 = var19;
			this.field9732.field3358 = true;
		}
		if (var2) {
			if (this.field9733.field3356 == null) {
				this.field9733.field3356 = this.field9730.createVertexBuffer(this.field9735);
			}
			VertexBuffer var67 = this.field9733.field3356;
			var67.allocate(this.field9710 * 12, 12);
			short[] var68;
			short[] var69;
			short[] var70;
			byte[] var71;
			if (this.field9771 == null) {
				var68 = this.field9723;
				var69 = this.field9714;
				var70 = this.field9715;
				var71 = this.field9747;
			} else {
				var68 = this.field9771.field3408;
				var69 = this.field9771.field3407;
				var70 = this.field9771.field3409;
				var71 = this.field9771.field3410;
			}
			Unsafe var72 = this.field9730.field10110;
			if (var72 == null) {
				ByteBuffer var82 = this.field9730.temporaryBuffer;
				var82.clear();
				for (int var83 = 0; var83 < this.field9710; var83++) {
					Vector3 var84 = new Vector3((float) var68[var83], (float) var69[var83], (float) var70[var83]);
					if (var84.length() != 0.0F) {
						if (var71[var83] > 1) {
							var84.divide((float) var71[var83]);
						}
						var84.normalise();
					}
					var82.putFloat(var84.x);
					var82.putFloat(var84.y);
					var82.putFloat(var84.z);
				}
				var67.upload(0, var82.position(), this.field9730.temporaryBufferAddress);
			} else {
				int var73 = this.field9710 * 12;
				long var74 = var67.lock(0, var73);
				for (int var76 = 0; var76 < this.field9710; var76++) {
					Vector3 var77 = new Vector3((float) var68[var76], (float) var69[var76], (float) var70[var76]);
					if (var77.length() != 0.0F) {
						if (var71[var76] > 1) {
							var77.divide((float) var71[var76]);
						}
						var77.normalise();
					}
					var72.putFloat(var74, var77.x);
					long var78 = var74 + 4L;
					var72.putFloat(var78, var77.y);
					long var80 = var78 + 4L;
					var72.putFloat(var80, var77.z);
					var74 = var80 + 4L;
				}
				var67.unlock();
			}
			this.field9733.field3359 = var67;
			this.field9733.field3358 = true;
		}
		if (var4) {
			if (this.field9734.field3356 == null) {
				this.field9734.field3356 = this.field9730.createVertexBuffer(this.field9735);
			}
			VertexBuffer var85 = this.field9734.field3356;
			var85.allocate(this.field9710 * 8, 8);
			Unsafe var86 = this.field9730.field10110;
			if (var86 == null) {
				ByteBuffer var93 = this.field9730.temporaryBuffer;
				var93.clear();
				for (int var94 = 0; var94 < this.field9710; var94++) {
					var93.putFloat(this.field9707[var94]);
					var93.putFloat(this.field9724[var94]);
				}
				var85.upload(0, var93.position(), this.field9730.temporaryBufferAddress);
			} else {
				int var87 = this.field9710 * 8;
				long var88 = var85.lock(0, var87);
				for (int var90 = 0; var90 < this.field9710; var90++) {
					var86.putFloat(var88, this.field9707[var90]);
					long var91 = var88 + 4L;
					var86.putFloat(var91, this.field9724[var90]);
					var88 = var91 + 4L;
				}
				var85.unlock();
			}
			this.field9734.field3359 = var85;
			this.field9734.field3358 = true;
		}
		return var5;
	}

	@ObfuscatedName("afo.hj()V")
	public void method15612() {
		if (this.field9731 != null) {
			this.field9731.method5788();
		}
		if (this.field9734 != null) {
			this.field9734.method5788();
		}
		if (this.field9732 != null) {
			this.field9732.method5788();
		}
		if (this.field9733 != null) {
			this.field9733.method5788();
		}
		if (this.field9756 != null) {
			this.field9756.method5551();
		}
	}

	@ObfuscatedName("afo.hv(II)I")
	public int method15606(int arg0, int arg1) {
		int var3 = (arg0 & 0x7F) * arg1 >> 7;
		if (var3 < 2) {
			var3 = 2;
		} else if (var3 > 126) {
			var3 = 126;
		}
		return (arg0 & 0xFF80) + var3;
	}

	@ObfuscatedName("afo.hz(ISI)I")
	public int method15609(int arg0, short arg1, int arg2) {
		int var4 = this.field9730.field10043[this.method15606(arg0, arg2)];
		if (arg1 != -1) {
			Material var5 = this.field9730.materialList.get(arg1 & 0xFFFF);
			int var6 = var5.field1364 & 0xFF;
			if (var6 != 0) {
				int var7 = arg2 * 131586;
				int var8;
				if (arg2 < 0) {
					var8 = 0;
				} else if (arg2 > 127) {
					var8 = 16777215;
				} else {
					var8 = arg2 * 131586;
				}
				if (var6 == 256) {
					var4 = var8;
				} else {
					int var10 = 256 - var6;
					var4 = ((var4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var6 & 0xFF00FF00) + ((var4 & 0xFF00) * var10 + (var8 & 0xFF00) * var6 & 0xFF0000) >> 8;
				}
			}
			int var11 = var5.field1363 & 0xFF;
			if (var11 != 0) {
				var11 += 256;
				int var12 = (var4 >> 16 & 0xFF) * var11;
				if (var12 > 65535) {
					var12 = 65535;
				}
				int var13 = (var4 >> 8 & 0xFF) * var11;
				if (var13 > 65535) {
					var13 = 65535;
				}
				int var14 = (var4 & 0xFF) * var11;
				if (var14 > 65535) {
					var14 = 65535;
				}
				var4 = (var14 >> 8) + ((var12 & 0xFF00) << 8) + (var13 & 0xFF00);
			}
		}
		return var4 & 0xFFFFFF;
	}
}

package com.jagex.graphics;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.Node;
import com.jagex.core.utils.Algorithms;
import com.jagex.core.utils.ColourUtils;
import com.jagex.game.client.HardShadow;
import com.jagex.math.IntMath;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

import java.nio.ByteBuffer;
import java.util.Iterator;

@ObfuscatedName("aem")
public class GpuFloorModel extends FloorModel {

	@ObfuscatedName("aem.u")
	public final GpuToolkit field9516;

	@ObfuscatedName("aem.z")
	public int field9488;

	@ObfuscatedName("aem.p")
	public int field9489;

	@ObfuscatedName("aem.d")
	public int field9490;

	@ObfuscatedName("aem.c")
	public final int field9491;

	@ObfuscatedName("aem.r")
	public int field9492;

	@ObfuscatedName("aem.v")
	public int field9517;

	@ObfuscatedName("aem.o")
	public short[][] field9494;

	@ObfuscatedName("aem.s")
	public float field9495 = Float.MAX_VALUE;

	@ObfuscatedName("aem.y")
	public float field9512 = -3.4028235E38F;

	@ObfuscatedName("aem.q")
	public GpuFloorModelRelated1[][][] field9507;

	@ObfuscatedName("aem.x")
	public int[][][] field9510;

	@ObfuscatedName("aem.b")
	public int[][][] field9499;

	@ObfuscatedName("aem.h")
	public int[][][] field9506;

	@ObfuscatedName("aem.a")
	public int[][][] field9501;

	@ObfuscatedName("aem.g")
	public int[][][] field9502;

	@ObfuscatedName("aem.i")
	public int[][][] field9503;

	@ObfuscatedName("aem.j")
	public byte[][] field9504;

	@ObfuscatedName("aem.t")
	public FloorHardShadows field9505;

	@ObfuscatedName("aem.ae")
	public LinkList field9485 = new LinkList();

	@ObfuscatedName("aem.ag")
	public Node[] field9496;

	@ObfuscatedName("aem.ah")
	public VertexBuffer field9508;

	@ObfuscatedName("aem.al")
	public VertexBuffer field9509;

	@ObfuscatedName("aem.ac")
	public VertexDeclaration field9493;

	@ObfuscatedName("aem.ai")
	public int field9511;

	@ObfuscatedName("aem.aw")
	public int field9498;

	@ObfuscatedName("aem.as")
	public byte[][] field9514;

	@ObfuscatedName("aem.at")
	public float[][] field9486;

	@ObfuscatedName("aem.ad")
	public float[][] field9515;

	@ObfuscatedName("aem.am")
	public float[][] field9487;

	@ObfuscatedName("aem.au")
	public HashTable field9513;

	@ObfuscatedName("aem.ar")
	public Node[] field9497;

	@ObfuscatedName("aem.ap")
	public int field9519;

	@ObfuscatedName("aem.aq")
	public ByteBuffer field9520;

	@ObfuscatedName("aem.ax")
	public ByteBuffer field9521;

	@ObfuscatedName("aem.av")
	public int field9522;

	@ObfuscatedName("aem.ao")
	public int[] field9523 = new int[1];

	@ObfuscatedName("aem.aj")
	public int[] field9524 = new int[1];

	@ObfuscatedName("aem.ay")
	public int field9525;

	@ObfuscatedName("aem.ab")
	public int[] field9526 = new int[1];

	public GpuFloorModel(GpuToolkit arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.field9516 = arg0;
		this.field9488 = this.field1236 - 2;
		this.field9489 = 0x1 << this.field9488;
		this.field9490 = arg1;
		this.field9491 = arg2;
		this.field9502 = new int[arg3][arg4][];
		this.field9507 = new GpuFloorModelRelated1[arg3][arg4][];
		this.field9506 = new int[arg3][arg4][];
		this.field9501 = new int[arg3][arg4][];
		this.field9510 = new int[arg3][arg4][];
		this.field9499 = new int[arg3][arg4][];
		this.field9494 = new short[arg3 * arg4][];
		this.field9504 = new byte[arg3][arg4];
		this.field9514 = new byte[arg3 + 1][arg4 + 1];
		this.field9486 = new float[this.field1235 + 1][this.field1234 + 1];
		this.field9515 = new float[this.field1235 + 1][this.field1234 + 1];
		this.field9487 = new float[this.field1235 + 1][this.field1234 + 1];
		for (int var9 = 0; var9 <= this.field1234; var9++) {
			for (int var10 = 0; var10 <= this.field1235; var10++) {
				int var11 = this.field1237[var10][var9];
				if ((float) var11 < this.field9495) {
					this.field9495 = var11;
				}
				if ((float) var11 > this.field9512) {
					this.field9512 = var11;
				}
				if (var10 > 0 && var9 > 0 && var10 < this.field1235 && var9 < this.field1234) {
					int var12 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
					int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
					float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
					this.field9486[var10][var9] = (float) var12 * var14;
					this.field9515[var10][var9] = (float) (-arg7 * 2) * var14;
					this.field9487[var10][var9] = (float) var13 * var14;
				}
			}
		}
		this.field9495--;
		this.field9512++;
		this.field9513 = new HashTable(128);
		if ((this.field9491 & 0x10) != 0) {
			this.field9505 = new FloorHardShadows(this.field9516, this);
		}
	}

	@ObfuscatedName("aem.e(III)V")
	public void setLevelShadeMap(int arg0, int arg1, int arg2) {
		int var4 = Math.min(this.field9514.length - 1, Math.max(0, arg0));
		int var5 = Math.min(this.field9514[var4].length - 1, Math.max(0, arg1));
		if ((this.field9514[var4][var5] & 0xFF) < arg2) {
			this.field9514[var4][var5] = (byte) arg2;
		}
	}

	@ObfuscatedName("aem.n(II[I[I[I[I[I[I[I[ILdy;Z)V")
	public void method1557(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, WaterFogData arg10, boolean arg11) {
		MaterialList var13 = this.field9516.materialList;
		if (arg5 != null && this.field9503 == null) {
			this.field9503 = new int[this.field1235][this.field1234][];
		}
		if (arg3 != null && this.field9502 == null) {
			this.field9502 = new int[this.field1235][this.field1234][];
		}
		this.field9506[arg0][arg1] = arg2;
		this.field9501[arg0][arg1] = arg4;
		this.field9510[arg0][arg1] = arg6;
		this.field9499[arg0][arg1] = arg7;
		if (this.field9503 != null) {
			this.field9503[arg0][arg1] = arg5;
		}
		if (this.field9502 != null) {
			this.field9502[arg0][arg1] = arg3;
		}
		GpuFloorModelRelated1[] var14 = this.field9507[arg0][arg1] = new GpuFloorModelRelated1[arg6.length];
		for (int var15 = 0; var15 < arg6.length; var15++) {
			int var16 = arg8[var15];
			int var17 = arg9[var15];
			if ((this.field9491 & 0x20) != 0 && var16 != -1 && var13.get(var16).highDetail) {
				var17 = 128;
				var16 = -1;
			}
			long var18 = (long) arg10.offset << 48 | (long) arg10.scale << 42 | (long) arg10.colour << 28 | (long) (var17 << 14) | (long) var16;
			Node var20;
			for (var20 = this.field9513.get(var18); var20 != null; var20 = this.field9513.nextWithKey()) {
				GpuFloorModelRelated1 var21 = (GpuFloorModelRelated1) var20;
				if (var21.field11402 == var16 && (float) var17 == var21.field11403 && var21.field11404.method2096(arg10)) {
					break;
				}
			}
			if (var20 == null) {
				var14[var15] = new GpuFloorModelRelated1(this, var16, var17, arg10);
				this.field9513.put(var14[var15], var18);
			} else {
				var14[var15] = (GpuFloorModelRelated1) var20;
			}
		}
		if (arg11) {
			this.field9504[arg0][arg1] = (byte) (this.field9504[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.field9498) {
			this.field9498 = arg6.length;
		}
		this.field9511 += arg6.length;
	}

	@ObfuscatedName("aem.m(II[I[I[I[I[I[I[I[I[I[I[ILdy;Z)V")
	public void addTileUnblended(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, WaterFogData arg13, boolean arg14) {
		int var16 = arg9.length;
		int[] var17 = new int[var16 * 3];
		int[] var18 = new int[var16 * 3];
		int[] var19 = new int[var16 * 3];
		int[] var20 = new int[var16 * 3];
		int[] var21 = new int[var16 * 3];
		int[] var22 = new int[var16 * 3];
		int[] var23 = arg3 == null ? null : new int[var16 * 3];
		int[] var24 = arg5 == null ? null : new int[var16 * 3];
		int var25 = 0;
		for (int var26 = 0; var26 < var16; var26++) {
			int var27 = arg6[var26];
			int var28 = arg7[var26];
			int var29 = arg8[var26];
			var17[var25] = arg2[var27];
			var18[var25] = arg4[var27];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
			if (arg3 != null) {
				var23[var25] = arg3[var27];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var27];
			}
			var25++;
			var17[var25] = arg2[var28];
			var18[var25] = arg4[var28];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
			if (arg3 != null) {
				var23[var25] = arg3[var28];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var28];
			}
			var25++;
			var17[var25] = arg2[var29];
			var18[var25] = arg4[var29];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
			if (arg3 != null) {
				var23[var25] = arg3[var29];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var29];
			}
			var25++;
		}
		this.method1557(arg0, arg1, var17, var23, var18, var24, var19, var20, var21, var22, arg13, arg14);
	}

	@ObfuscatedName("aem.k()V")
	public void method1555() {
		if (this.field9511 <= 0) {
			this.field9505 = null;
			this.method15414();
			return;
		}
		byte[][] var1 = new byte[this.field1235 + 1][this.field1234 + 1];
		for (int var2 = 1; var2 < this.field1235; var2++) {
			for (int var3 = 1; var3 < this.field1234; var3++) {
				var1[var2][var3] = (byte) ((this.field9514[var2][var3] >> 1) + (this.field9514[var2][var3 + 1] >> 3) + (this.field9514[var2][var3 - 1] >> 2) + (this.field9514[var2 - 1][var3] >> 2) + (this.field9514[var2 + 1][var3] >> 3));
			}
		}
		this.field9497 = new Node[this.field9513.size()];
		this.field9513.toArray(this.field9497);
		for (int var4 = 0; var4 < this.field9497.length; var4++) {
			((GpuFloorModelRelated1) this.field9497[var4]).method17761(this.field9511);
		}
		this.field9522 = 20;
		if (this.field9503 != null) {
			this.field9522 += 4;
		}
		if ((this.field9491 & 0x7) != 0) {
			this.field9522 += 12;
		}
		this.field9520 = this.field9516.method16151(this.field9511 * 4);
		this.field9521 = this.field9516.method16151(this.field9522 * this.field9511);
		GpuFloorModelRelated1[] var5 = new GpuFloorModelRelated1[this.field9511];
		int var6 = IntMath.method3082(this.field9511 / 4);
		if (var6 < 1) {
			var6 = 1;
		}
		HashTable var7 = new HashTable(var6);
		GpuFloorModelRelated1[] var8 = new GpuFloorModelRelated1[this.field9498];
		for (int var9 = 0; var9 < this.field1235; var9++) {
			for (int var10 = 0; var10 < this.field1234; var10++) {
				this.method15415(var9, var10, var1, var8, var7, var5);
			}
		}
		for (int var11 = 0; var11 < this.field9492; var11++) {
			GpuFloorModelRelated1 var12 = var5[var11];
			if (var12 != null) {
				var12.method17763(var11);
			}
		}
		for (int var13 = 0; var13 < this.field1235; var13++) {
			for (int var14 = 0; var14 < this.field1234; var14++) {
				short[] var15 = this.field9494[this.field1235 * var14 + var13];
				if (var15 != null) {
					int var16 = 0;
					int var17 = 0;
					while (var17 < var15.length) {
						int var18 = var15[var17++] & 0xFFFF;
						int var19 = var15[var17++] & 0xFFFF;
						int var20 = var15[var17++] & 0xFFFF;
						GpuFloorModelRelated1 var21 = var5[var18];
						GpuFloorModelRelated1 var22 = var5[var19];
						GpuFloorModelRelated1 var23 = var5[var20];
						GpuFloorModelRelated1 var24 = null;
						if (var21 != null) {
							var21.method17764(var13, var14, var16);
							var24 = var21;
						}
						if (var22 != null) {
							var22.method17764(var13, var14, var16);
							if (var24 == null || var22.nodeId < var24.nodeId) {
								var24 = var22;
							}
						}
						if (var23 != null) {
							var23.method17764(var13, var14, var16);
							if (var24 == null || var23.nodeId < var24.nodeId) {
								var24 = var23;
							}
						}
						if (var24 != null) {
							if (var21 != null) {
								var24.method17763(var18);
							}
							if (var22 != null) {
								var24.method17763(var19);
							}
							if (var23 != null) {
								var24.method17763(var20);
							}
							var24.method17764(var13, var14, var16);
						}
						var16++;
					}
				}
			}
		}
		this.field9519 = 0;
		for (int var25 = 0; var25 < this.field9497.length; var25++) {
			GpuFloorModelRelated1 var26 = (GpuFloorModelRelated1) this.field9497[var25];
			if (var26.field11406 > 0) {
				this.field9497[this.field9519++] = var26;
			}
		}
		this.field9496 = new Node[this.field9519];
		long[] var27 = new long[this.field9519];
		for (int var28 = 0; var28 < this.field9519; var28++) {
			GpuFloorModelRelated1 var29 = (GpuFloorModelRelated1) this.field9497[var28];
			var27[var28] = var29.nodeId;
			this.field9496[var28] = var29;
		}
		Algorithms.method10210(var27, this.field9496);
		this.method15413();
	}

	@ObfuscatedName("aem.av()V")
	public void method15413() {
		this.field9509 = this.field9516.createVertexBuffer(false);
		this.field9509.allocate(this.field9492 * 4, 4);
		this.field9509.upload(0, this.field9492 * 4, this.field9516.method15963(this.field9520));
		this.field9508 = this.field9516.createVertexBuffer(false);
		this.field9508.allocate(this.field9522 * this.field9492, this.field9522);
		this.field9508.upload(0, this.field9522 * this.field9492, this.field9516.method15963(this.field9521));
		this.field9520.clear();
		this.field9520 = null;
		this.field9521.clear();
		this.field9521 = null;
		if ((this.field9491 & 0x7) == 0) {
			if (this.field9503 == null) {
				this.field9493 = this.field9516.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.TEX_COORD_2 }), new VertexDeclarationElement(VertexDeclarationElementComponent.COLOR) });
			} else {
				this.field9493 = this.field9516.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.TEX_COORD_2, VertexDeclarationElementComponent.TEX_COORD_1 }), new VertexDeclarationElement(VertexDeclarationElementComponent.COLOR) });
			}
		} else if (this.field9503 == null) {
			this.field9493 = this.field9516.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.TEX_COORD_2, VertexDeclarationElementComponent.NORMAL }), new VertexDeclarationElement(VertexDeclarationElementComponent.COLOR) });
		} else {
			this.field9493 = this.field9516.createVertexDeclaration(new VertexDeclarationElement[] { new VertexDeclarationElement(new VertexDeclarationElementComponent[] { VertexDeclarationElementComponent.VERTEX, VertexDeclarationElementComponent.TEX_COORD_2, VertexDeclarationElementComponent.TEX_COORD_1, VertexDeclarationElementComponent.NORMAL }), new VertexDeclarationElement(VertexDeclarationElementComponent.COLOR) });
		}
		for (int var1 = 0; var1 < this.field9519; var1++) {
			GpuFloorModelRelated1 var2 = (GpuFloorModelRelated1) this.field9497[var1];
			var2.method17766(this.field9492);
		}
		if (this.field9505 != null) {
			this.field9505.method5674();
		}
		this.method15414();
	}

	@ObfuscatedName("aem.ao()V")
	public void method15414() {
		if ((this.field9490 & 0x2) == 0) {
			this.field9501 = null;
			this.field9506 = null;
			this.field9510 = null;
		}
		this.field9503 = null;
		this.field9499 = null;
		this.field9502 = null;
		this.field9507 = null;
		this.field9514 = null;
		this.field9513 = null;
		this.field9497 = null;
		this.field9487 = null;
		this.field9515 = null;
		this.field9486 = null;
	}

	@ObfuscatedName("aem.aj(II[[B[Lakh;Laan;[Lakh;)V")
	public void method15415(int arg0, int arg1, byte[][] arg2, GpuFloorModelRelated1[] arg3, HashTable arg4, GpuFloorModelRelated1[] arg5) {
		if (this.field9510[arg0][arg1] == null) {
			return;
		}
		GpuFloorModelRelated1[] var7 = this.field9507[arg0][arg1];
		int[] var8 = this.field9506[arg0][arg1];
		int[] var9 = this.field9501[arg0][arg1];
		int[] var10 = this.field9499[arg0][arg1];
		int[] var11 = this.field9510[arg0][arg1];
		int[] var12 = this.field9502 == null ? null : this.field9502[arg0][arg1];
		int[] var13 = this.field9503 == null ? null : this.field9503[arg0][arg1];
		if (var10 == null) {
			var10 = var11;
		}
		float var14 = this.field9486[arg0][arg1];
		float var15 = this.field9515[arg0][arg1];
		float var16 = this.field9487[arg0][arg1];
		float var17 = this.field9486[arg0][arg1 + 1];
		float var18 = this.field9515[arg0][arg1 + 1];
		float var19 = this.field9487[arg0][arg1 + 1];
		float var20 = this.field9486[arg0 + 1][arg1 + 1];
		float var21 = this.field9515[arg0 + 1][arg1 + 1];
		float var22 = this.field9487[arg0 + 1][arg1 + 1];
		float var23 = this.field9486[arg0 + 1][arg1];
		float var24 = this.field9515[arg0 + 1][arg1];
		float var25 = this.field9487[arg0 + 1][arg1];
		int var26 = arg2[arg0][arg1] & 0xFF;
		int var27 = arg2[arg0][arg1 + 1] & 0xFF;
		int var28 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		int var29 = arg2[arg0 + 1][arg1] & 0xFF;
		int var30 = 0;
		label185: for (int var31 = 0; var31 < var11.length; var31++) {
			GpuFloorModelRelated1 var32 = var7[var31];
			for (int var33 = 0; var33 < var30; var33++) {
				if (arg3[var33] == var32) {
					continue label185;
				}
			}
			arg3[var30++] = var32;
		}
		short[] var34 = this.field9494[this.field1235 * arg1 + arg0] = new short[var11.length];
		for (int var35 = 0; var35 < var11.length; var35++) {
			int var36 = (arg0 << this.field1236) + var8[var35];
			int var37 = (arg1 << this.field1236) + var9[var35];
			int var38 = var36 >> this.field9488;
			int var39 = var37 >> this.field9488;
			int var40 = var11[var35];
			int var41 = var10[var35];
			int var42 = var12 == null ? 0 : var12[var35];
			long var43 = (long) var41 << 48 | (long) var40 << 32 | (long) (var38 << 16) | (long) var39;
			int var45 = var8[var35];
			int var46 = var9[var35];
			byte var47 = 74;
			int var48 = 0;
			float var49 = 1.0F;
			float var50;
			float var51;
			float var52;
			int var53;
			if (var45 == 0 && var46 == 0) {
				var50 = var14;
				var51 = var15;
				var52 = var16;
				var53 = var47 - var26;
			} else if (var45 == 0 && this.field1233 == var46) {
				var50 = var17;
				var51 = var18;
				var52 = var19;
				var53 = var47 - var27;
			} else if (this.field1233 == var45 && this.field1233 == var46) {
				var50 = var20;
				var51 = var21;
				var52 = var22;
				var53 = var47 - var28;
			} else if (this.field1233 == var45 && var46 == 0) {
				var50 = var23;
				var51 = var24;
				var52 = var25;
				var53 = var47 - var29;
			} else {
				float var54 = (float) var45 / (float) this.field1233;
				float var55 = (float) var46 / (float) this.field1233;
				float var56 = (var23 - var14) * var54 + var14;
				float var57 = (var24 - var15) * var54 + var15;
				float var58 = (var25 - var16) * var54 + var16;
				float var59 = (var20 - var17) * var54 + var17;
				float var60 = (var21 - var18) * var54 + var18;
				float var61 = (var22 - var19) * var54 + var19;
				var50 = (var59 - var56) * var55 + var56;
				var51 = (var60 - var57) * var55 + var57;
				var52 = (var61 - var58) * var55 + var58;
				int var62 = ((var29 - var26) * var45 >> this.field1236) + var26;
				int var63 = ((var28 - var27) * var45 >> this.field1236) + var27;
				var53 = var47 - (((var63 - var62) * var46 >> this.field1236) + var62);
			}
			if (var40 != -1) {
				int var64 = (var40 & 0x7F) * var53 >> 7;
				if (var64 < 2) {
					var64 = 2;
				} else if (var64 > 126) {
					var64 = 126;
				}
				var48 = ColourUtils.field8150[var40 & 0xFF80 | var64];
				if ((this.field9491 & 0x7) == 0) {
					float var65 = this.field9516.field10114[2] * var52 + this.field9516.field10114[0] * var50 + this.field9516.field10114[1] * var51;
					var49 = this.field9516.field10122 + var65 * (var65 > 0.0F ? this.field9516.field10123 : this.field9516.field10124);
				}
			}
			Node var66 = null;
			if ((var36 & this.field9489 - 1) == 0 && (var37 & this.field9489 - 1) == 0) {
				var66 = arg4.get(var43);
			}
			int var80;
			if (var66 == null) {
				int var68;
				if (var40 == var41) {
					var68 = var48;
				} else {
					int var67 = (var41 & 0x7F) * var53 >> 7;
					if (var67 < 2) {
						var67 = 2;
					} else if (var67 > 126) {
						var67 = 126;
					}
					var68 = ColourUtils.field8150[var41 & 0xFF80 | var67];
					if ((this.field9491 & 0x7) == 0) {
						float var69 = this.field9516.field10114[2] * var52 + this.field9516.field10114[0] * var50 + this.field9516.field10114[1] * var51;
						float var70 = this.field9516.field10122 + var49 * (var49 > 0.0F ? this.field9516.field10123 : this.field9516.field10124);
						int var71 = var68 >> 16 & 0xFF;
						int var72 = var68 >> 8 & 0xFF;
						int var73 = var68 & 0xFF;
						int var74 = (int) ((float) var71 * var70);
						if (var74 < 0) {
							var74 = 0;
						} else if (var74 > 255) {
							var74 = 255;
						}
						int var75 = (int) ((float) var72 * var70);
						if (var75 < 0) {
							var75 = 0;
						} else if (var75 > 255) {
							var75 = 255;
						}
						int var76 = (int) ((float) var73 * var70);
						if (var76 < 0) {
							var76 = 0;
						} else if (var76 > 255) {
							var76 = 255;
						}
						var68 = var74 << 16 | var75 << 8 | var76;
					}
				}
				this.field9521.putFloat((float) var36);
				this.field9521.putFloat((float) (this.getFineHeight(var36, var37) + var42));
				this.field9521.putFloat((float) var37);
				this.field9521.putFloat((float) var36);
				this.field9521.putFloat((float) var37);
				if (this.field9503 != null) {
					this.field9521.putFloat(var13 == null ? 0.0F : (float) (var13[var35] - 1));
				}
				if ((this.field9491 & 0x7) != 0) {
					this.field9521.putFloat(var50);
					this.field9521.putFloat(var51);
					this.field9521.putFloat(var52);
				}
				if (this.field9516.field10185 == 0) {
					int var77 = var68 & 0xFF00FF00;
					int var78 = var77 | var68 >> 16 & 0xFF;
					int var79 = var78 | (var68 & 0xFF) << 16;
					var68 = var79;
				}
				this.field9520.putInt(var68 | 0xFF000000);
				var80 = this.field9492++;
				var34[var35] = (short) var80;
				if (var40 != -1) {
					arg5[var80] = var7[var35];
				}
				arg4.put(new FloorModelNode(var34[var35]), var43);
			} else {
				var34[var35] = ((FloorModelNode) var66).field11437;
				var80 = var34[var35] & 0xFFFF;
				if (var40 != -1 && var7[var35].nodeId < arg5[var80].nodeId) {
					arg5[var80] = var7[var35];
				}
			}
			for (int var81 = 0; var81 < var30; var81++) {
				arg3[var81].method17762(var80, var48, var53, var49);
			}
			this.field9517++;
		}
	}

	@ObfuscatedName("aem.f(III[[ZZI)V")
	public void method1548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		if (this.field9496 == null) {
			return;
		}
		int var7 = arg2 + arg2 + 1;
		int var8 = var7 * var7;
		if (this.field9526.length < var8) {
			this.field9526 = new int[var8];
		}
		int var9 = arg0 - arg2;
		int var10 = var9;
		if (var9 < 0) {
			var9 = 0;
		}
		int var11 = arg1 - arg2;
		int var12 = var11;
		if (var11 < 0) {
			var11 = 0;
		}
		int var13 = arg0 + arg2;
		if (var13 > this.field1235 - 1) {
			var13 = this.field1235 - 1;
		}
		int var14 = arg1 + arg2;
		if (var14 > this.field1234 - 1) {
			var14 = this.field1234 - 1;
		}
		this.field9525 = 0;
		for (int var15 = var9; var15 <= var13; var15++) {
			boolean[] var16 = arg3[var15 - var10];
			for (int var17 = var11; var17 <= var14; var17++) {
				if (var16[var17 - var12]) {
					this.field9526[this.field9525++] = this.field1235 * var17 + var15;
				}
			}
		}
		ByteBuffer var18 = this.field9516.temporaryBuffer;
		var18.clear();
		for (int var19 = 0; var19 < this.field9496.length; var19++) {
			GpuFloorModelRelated1 var20 = (GpuFloorModelRelated1) this.field9496[var19];
			var20.method17767(this.field9526, this.field9525);
		}
		int var21 = var18.position();
		ModelShader var22 = this.field9516.modelShader;
		this.field9516.method16022();
		if (this.field9516.field10169 > 0) {
			var22.field2975.setTo((float) (this.field9516.fogDensity >> 16 & 0xFF) / 255.0F, (float) (this.field9516.fogDensity >> 8 & 0xFF) / 255.0F, (float) (this.field9516.fogDensity >> 0 & 0xFF) / 255.0F);
			var22.field2984.method6247(0.0F, 0.0F, 1.0F, -this.field9516.fogStart);
			var22.field2984.method6265(this.field9516.field10190);
			var22.field2984.method6252(1.0F / (this.field9516.fogEnd - this.field9516.fogStart));
		} else {
			var22.field2984.method6247(0.0F, 0.0F, 0.0F, 0.0F);
			var22.field2975.setTo(0.0F, 0.0F, 0.0F);
		}
		if (var21 != 0) {
			GpuIndexBuffer var23 = this.field9516.method15988(var21 / 2);
			var23.upload(0, var21, this.field9516.temporaryBufferAddress);
			this.field9516.setStreamSource(0, this.field9508);
			this.field9516.setIndices(var23);
			var22.method5018(Matrix4x4.IDENTITY);
			if ((this.field9491 & 0x7) == 0) {
				int var24 = 0;
				for (int var25 = 0; var25 < this.field9496.length; var25++) {
					GpuFloorModelRelated1 var26 = (GpuFloorModelRelated1) this.field9496[var25];
					if (var26.field11408 != 0) {
						if (this.field9516.field10133) {
							this.field9516.setWaterFog(0, var26.field11404);
							var22.field2979.method6247(0.0F, 1.0F, 0.0F, (float) var26.field11404.offset / 255.0F * (float) var26.field11404.scale + (float) this.field9516.field10164);
							var22.field2979.method6252(1.0F / (float) var26.field11404.scale);
							var22.field2973.setTo((float) (var26.field11404.colour >> 16 & 0xFF) / 255.0F, (float) (var26.field11404.colour >> 8 & 0xFF) / 255.0F, (float) (var26.field11404.colour >> 0 & 0xFF) / 255.0F);
						} else {
							var22.field2979.method6247(0.0F, 0.0F, 0.0F, 0.0F);
							var22.field2973.setTo(0.0F, 0.0F, 0.0F);
						}
						boolean var27 = false;
						if (var26.field11402 == -1) {
							var22.field2966 = this.field9516.field10140;
						} else {
							Material var28 = this.field9516.materialList.get(var26.field11402);
							var22.field2966 = this.field9516.field10188.method5639(var28);
							var27 = !Material.method261(var28.effect);
						}
						this.field9516.setStreamSource(1, var26.field11405);
						this.field9516.setVertexDeclaration(this.field9493);
						var22.field2982.scale(1.0F / var26.field11403, 1.0F / var26.field11403, 1.0F, 1.0F);
						var22.field2981 = var26.field11400;
						var22.field2983 = var26.field11407 - var26.field11400 + 1;
						var22.field2972 = var24;
						var22.field2962 = var26.field11408 / 3;
						var22.method5019(var27);
						var24 += var26.field11408;
					}
				}
			} else {
				var22.field2976.setTo(this.field9516.field10114[0], this.field9516.field10114[1], this.field9516.field10114[2]);
				var22.field2977.setTo(this.field9516.field10142 * this.field9516.field10123, this.field9516.field10123 * this.field9516.field10120, this.field9516.field10210 * this.field9516.field10123);
				var22.field2978.setTo(-this.field9516.field10124 * this.field9516.field10142, -this.field9516.field10124 * this.field9516.field10120, -this.field9516.field10124 * this.field9516.field10210);
				var22.field2968.setTo(this.field9516.field10142 * this.field9516.field10122, this.field9516.field10122 * this.field9516.field10120, this.field9516.field10210 * this.field9516.field10122);
				int var29 = 0;
				for (int var30 = 0; var30 < this.field9496.length; var30++) {
					GpuFloorModelRelated1 var31 = (GpuFloorModelRelated1) this.field9496[var30];
					if (var31.field11408 > 0) {
						if (this.field9516.field10133) {
							this.field9516.setWaterFog(0, var31.field11404);
							float var32 = 0.15F;
							var22.field2979.method6247(0.0F, 1.0F / ((float) var31.field11404.scale * var32), 0.0F, 256.0F / ((float) var31.field11404.scale * var32));
							var22.field2973.setTo((float) (var31.field11404.colour >> 16 & 0xFF) / 255.0F, (float) (var31.field11404.colour >> 8 & 0xFF) / 255.0F, (float) (var31.field11404.colour >> 0 & 0xFF) / 255.0F);
						} else {
							var22.field2979.method6247(0.0F, 0.0F, 0.0F, 0.0F);
							var22.field2973.setTo(0.0F, 0.0F, 0.0F);
						}
						byte var33 = 11;
						if (var31.field11402 == -1) {
							var22.field2966 = this.field9516.field10140;
						} else {
							Material var34 = this.field9516.materialList.get(var31.field11402);
							var33 = var34.effect;
							var22.field2966 = this.field9516.field10188.method5639(var34);
							var22.method5036(var34.effectArg1);
						}
						this.field9516.setStreamSource(1, var31.field11405);
						this.field9516.setVertexDeclaration(this.field9493);
						var22.field2982.scale(1.0F / var31.field11403, 1.0F / var31.field11403, 1.0F, 1.0F);
						var22.field2981 = var31.field11400;
						var22.field2983 = var31.field11407 - var31.field11400 + 1;
						var22.field2972 = var29;
						var22.field2962 = var31.field11408 / 3;
						switch(var33) {
							case 1:
								var22.field2969.setTo(this.field9516.field10035.entries[12], this.field9516.field10035.entries[13], this.field9516.field10035.entries[14]);
								if (this.field9516.field10133) {
									var22.method5024();
								} else {
									var22.method5031(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.field9516.lightingEnabled || (this.field9491 & 0x8) == 0 || !this.field9516.seaWaterShader.method19209()) {
									var22.method5020(0);
								} else {
									EnvMappedWaterShader var35 = this.field9516.seaWaterShader;
									if (var33 == 2) {
										var35 = this.field9516.waterShader;
									}
									var35.wvpMatrix.setTo(this.field9516.field10081);
									var35.texCoordMatrix.scale(1.0F / ((float) var31.field11404.field1576 * var31.field11403), 1.0F / ((float) var31.field11404.field1576 * var31.field11403), 1.0F, 1.0F);
									var35.eyePosAndTime.setTo(this.field9516.field10035.entries[12], this.field9516.field10035.entries[13], this.field9516.field10035.entries[14]);
									Material var36 = this.field9516.materialList.get(var31.field11402);
									var35.field12147 = var36.effectArg1;
									var35.field12145 = var31.field11400;
									var35.field12146 = var31.field11407 - var31.field11400 + 1;
									var35.field12120 = var29;
									var35.field12148 = var31.field11408 / 3;
									var35.heightFogPlane.method6248(var22.field2979);
									var35.heightFogColour.setTo(var22.field2973);
									var35.distanceFogPlane.method6248(var22.field2984);
									var35.distanceFogColour.setTo(var22.field2975);
									var35.method19210();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.field9516.field10133) {
									var22.method5023();
								} else {
									var22.method5020(0);
								}
								break;
							case 6:
								var22.method5019(!Material.method261(var33));
								break;
							case 7:
								var22.field2969.setTo(this.field9516.field10035.entries[12], this.field9516.field10035.entries[13], this.field9516.field10035.entries[14]);
								var22.field2980.setToIdentity();
								var22.field2967 = this.field9516.getEnvMapSampler();
								var22.method5026(0);
						}
						var29 += var31.field11408;
					}
				}
			}
		}
		if (!this.field9485._isEmpty()) {
			this.field9516.method16054(128);
			this.field9516.method16361(false);
			Vector3 var37 = new Vector3(var22.field2975);
			var22.field2975.setTo(0.0F, 0.0F, 0.0F);
			Iterator var38 = this.field9485.iterator();
			while (var38.hasNext()) {
				GpuFloorModelRelated var39 = (GpuFloorModelRelated) var38.next();
				var39.method17783(var22, arg0, arg1, arg2, arg3, arg4);
			}
			var22.field2975.setTo(var37);
		}
		if (this.field9505 == null) {
			return;
		}
		this.field9516.method16054(1);
		this.field9516.setStreamSource(0, this.field9508);
		this.field9516.setStreamSource(1, this.field9509);
		this.field9516.setVertexDeclaration(this.field9493);
		Matrix4x4 var40 = this.field9516.field10066;
		var40.setToIdentity();
		var40.entries[13] = -1.0F;
		var22.method5018(var40);
		this.field9505.method5670(var22, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("aem.w(IIIIIII[[Z)V")
	public void method1526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		if (this.field9511 <= 0) {
			return;
		}
		GpuIndexBuffer var9 = this.field9516.method15988(this.field9517);
		int var10 = 0;
		int var11 = 32767;
		int var12 = -32768;
		ByteBuffer var13 = this.field9516.temporaryBuffer;
		var13.clear();
		for (int var14 = arg4; var14 < arg6; var14++) {
			int var15 = this.field1235 * var14 + arg3;
			for (int var16 = arg3; var16 < arg5; var16++) {
				if (arg7[var16 - arg3][var14 - arg4]) {
					short[] var17 = this.field9494[var15];
					if (var17 != null) {
						for (int var18 = 0; var18 < var17.length; var18++) {
							int var19 = var17[var18] & 0xFFFF;
							if (var19 > var12) {
								var12 = var19;
							}
							if (var19 < var11) {
								var11 = var19;
							}
							var13.putShort((short) var19);
							var10++;
						}
					}
				}
				var15++;
			}
		}
		var9.upload(0, var13.position(), this.field9516.temporaryBufferAddress);
		if (var10 <= 0) {
			return;
		}
		this.field9516.method16022();
		ModelShader var20 = this.field9516.modelShader;
		this.field9516.setStreamSource(0, this.field9508);
		this.field9516.setStreamSource(1, this.field9509);
		this.field9516.setVertexDeclaration(this.field9493);
		this.field9516.setIndices(var9);
		this.field9516.method2217(Matrix4x3.IDENTITY);
		float var21 = (float) this.field9516.getRenderTarget().getWidth();
		float var22 = (float) this.field9516.getRenderTarget().getHeight();
		Matrix4x3 var23 = new Matrix4x3();
		Matrix4x3 var24 = new Matrix4x3();
		var23.method6298(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		var24.setToScale((float) arg2 / ((float) this.field1233 * 256.0F), (float) -arg2 / ((float) this.field1233 * 256.0F), 1.0F / (this.field9512 - this.field9495));
		var24.translate((float) arg0 - (float) (arg2 * arg3) / 256.0F, (float) (arg2 * arg6) / 256.0F + (float) arg1, -this.field9495 / (this.field9512 - this.field9495));
		var24.scale(2.0F / var21, 2.0F / var22, 1.0F);
		var24.translate(-1.0F, -1.0F, 0.0F);
		this.field9516.field10065.method6317(var23, var24);
		this.field9516.field10066.setToMatrix4x3(this.field9516.field10065);
		this.field9516.method2220(this.field9516.field10066);
		var20.method5018(Matrix4x4.IDENTITY);
		var20.field2984.method6247(0.0F, 0.0F, 0.0F, 0.0F);
		var20.field2975.setTo(0.0F, 0.0F, 0.0F);
		var20.field2979.method6247(0.0F, 0.0F, 0.0F, 0.0F);
		var20.field2973.setTo(0.0F, 0.0F, 0.0F);
		var20.field2966 = this.field9516.field10140;
		var20.field2982.setToIdentity();
		var20.field2981 = var11;
		var20.field2983 = var12 - var11 + 1;
		var20.field2972 = 0;
		var20.field2962 = var10 / 3;
		if (this.field9516.field10107) {
			this.field9516.method2219(false);
			var20.method5019(false);
			this.field9516.method2219(true);
		} else {
			var20.method5019(false);
		}
	}

	@ObfuscatedName("aem.d(IILara;)Lara;")
	public HardShadow method1531(int arg0, int arg1, HardShadow arg2) {
		if ((this.field9504[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		int var4 = this.field1233 >> this.field9516.field10129;
		GpuHardShadow var5 = (GpuHardShadow) arg2;
		GpuHardShadow var6;
		if (var5 != null && var5.method19709(var4, var4)) {
			var6 = var5;
			var5.method19700();
		} else {
			var6 = new GpuHardShadow(this.field9516, var4, var4);
		}
		var6.method19698(0, 0, var4, var4);
		this.method15416(var6, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("aem.ay(Lati;II)V")
	public void method15416(GpuHardShadow arg0, int arg1, int arg2) {
		int[] var4 = this.field9506[arg1][arg2];
		int[] var5 = this.field9501[arg1][arg2];
		int var6 = var4.length;
		if (this.field9523.length < var6) {
			this.field9523 = new int[var6];
			this.field9524 = new int[var6];
		}
		for (int var7 = 0; var7 < var6; var7++) {
			this.field9523[var7] = var4[var7] >> this.field9516.field10129;
			this.field9524[var7] = var5[var7] >> this.field9516.field10129;
		}
		int var8 = 0;
		while (var8 < var6) {
			int var9 = this.field9523[var8];
			int var10 = this.field9524[var8++];
			int var11 = this.field9523[var8];
			int var12 = this.field9524[var8++];
			int var13 = this.field9523[var8];
			int var14 = this.field9524[var8++];
			if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
				arg0.method19701(var10, var12, var14, var9, var11, var13);
			}
		}
	}

	@ObfuscatedName("aem.v(Lara;IIIIZ)Z")
	public boolean method1535(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.field9505 == null || arg0 == null) {
			return false;
		} else {
			int var7 = arg1 - (this.field9516.field10130 * arg2 >> 8) >> this.field9516.field10129;
			int var8 = arg3 - (this.field9516.field10131 * arg2 >> 8) >> this.field9516.field10129;
			return this.field9505.method5665(arg0, var7, var8);
		}
	}

	@ObfuscatedName("aem.c(Lara;IIIIZ)V")
	public void method1532(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.field9505 != null && arg0 != null) {
			int var7 = arg1 - (this.field9516.field10130 * arg2 >> 8) >> this.field9516.field10129;
			int var8 = arg3 - (this.field9516.field10131 * arg2 >> 8) >> this.field9516.field10129;
			this.field9505.method5663(arg0, var7, var8);
		}
	}

	@ObfuscatedName("aem.r(Lara;IIIIZ)V")
	public void method1543(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.field9505 != null && arg0 != null) {
			int var7 = arg1 - (this.field9516.field10130 * arg2 >> 8) >> this.field9516.field10129;
			int var8 = arg3 - (this.field9516.field10131 * arg2 >> 8) >> this.field9516.field10129;
			this.field9505.method5676(arg0, var7, var8);
		}
	}

	@ObfuscatedName("aem.o(Lakf;[I)V")
	public void method1549(Light arg0, int[] arg1) {
		this.field9485.addTail(new GpuFloorModelRelated(this.field9516, this, arg0, arg1));
	}
}

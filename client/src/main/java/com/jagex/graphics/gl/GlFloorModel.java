package com.jagex.graphics.gl;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.Node;
import com.jagex.core.utils.Algorithms;
import com.jagex.core.utils.ColourUtils;
import com.jagex.game.client.HardShadow;
import com.jagex.graphics.*;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

@ObfuscatedName("aek")
public class GlFloorModel extends FloorModel {

	@ObfuscatedName("aek.u")
	public final GlToolkit field9453;

	@ObfuscatedName("aek.z")
	public int field9454;

	@ObfuscatedName("aek.p")
	public int field9455;

	@ObfuscatedName("aek.d")
	public int field9481;

	@ObfuscatedName("aek.c")
	public final int field9457;

	@ObfuscatedName("aek.r")
	public int field9466;

	@ObfuscatedName("aek.v")
	public int field9459;

	@ObfuscatedName("aek.o")
	public short[][] field9460;

	@ObfuscatedName("aek.s")
	public GlFloorModelRelated1[][][] field9461;

	@ObfuscatedName("aek.y")
	public int[][][] field9462;

	@ObfuscatedName("aek.q")
	public int[][][] field9463;

	@ObfuscatedName("aek.x")
	public int[][][] field9464;

	@ObfuscatedName("aek.b")
	public int[][][] field9451;

	@ObfuscatedName("aek.h")
	public int[][][] field9473;

	@ObfuscatedName("aek.a")
	public int[][][] field9467;

	@ObfuscatedName("aek.g")
	public byte[][] field9468;

	@ObfuscatedName("aek.i")
	public GlFloorModelRelated3 field9465;

	@ObfuscatedName("aek.j")
	public LinkList field9470 = new LinkList();

	@ObfuscatedName("aek.t")
	public Node[] field9471;

	@ObfuscatedName("aek.ae")
	public GlInterfaceRelated field9472;

	@ObfuscatedName("aek.ag")
	public GlRelated3 field9456;

	@ObfuscatedName("aek.ah")
	public GlRelated3 field9474;

	@ObfuscatedName("aek.al")
	public GlRelated3 field9480;

	@ObfuscatedName("aek.ac")
	public GlRelated3 field9476;

	@ObfuscatedName("aek.ai")
	public int field9477;

	@ObfuscatedName("aek.aw")
	public int field9478;

	@ObfuscatedName("aek.as")
	public byte[][] field9479;

	@ObfuscatedName("aek.at")
	public float[][] field9469;

	@ObfuscatedName("aek.ad")
	public float[][] field9458;

	@ObfuscatedName("aek.am")
	public float[][] field9482;

	@ObfuscatedName("aek.au")
	public HashTable field9483;

	@ObfuscatedName("aek.ar")
	public static final float[] field9484 = new float[16];

	public GlFloorModel(GlToolkit arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.field9453 = arg0;
		this.field9454 = this.field1236 - 2;
		this.field9455 = 0x1 << this.field9454;
		this.field9481 = arg1;
		this.field9457 = arg2;
		this.field9473 = new int[arg3][arg4][];
		this.field9461 = new GlFloorModelRelated1[arg3][arg4][];
		this.field9464 = new int[arg3][arg4][];
		this.field9451 = new int[arg3][arg4][];
		this.field9462 = new int[arg3][arg4][];
		this.field9463 = new int[arg3][arg4][];
		this.field9460 = new short[arg3 * arg4][];
		this.field9468 = new byte[arg3][arg4];
		this.field9479 = new byte[arg3 + 1][arg4 + 1];
		this.field9469 = new float[this.field1235 + 1][this.field1234 + 1];
		this.field9458 = new float[this.field1235 + 1][this.field1234 + 1];
		this.field9482 = new float[this.field1235 + 1][this.field1234 + 1];
		for (int var9 = 1; var9 < this.field1234; var9++) {
			for (int var10 = 1; var10 < this.field1235; var10++) {
				int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
				int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
				float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
				this.field9469[var10][var9] = (float) var11 * var13;
				this.field9458[var10][var9] = (float) (-arg7 * 2) * var13;
				this.field9482[var10][var9] = (float) var12 * var13;
			}
		}
		this.field9483 = new HashTable(128);
		if ((this.field9457 & 0x10) != 0) {
			this.field9465 = new GlFloorModelRelated3(this.field9453, this);
		}
	}

	@ObfuscatedName("aek.e(III)V")
	public void setLevelShadeMap(int arg0, int arg1, int arg2) {
		int var4 = Math.min(this.field9479.length - 1, Math.max(0, arg0));
		int var5 = Math.min(this.field9479[var4].length - 1, Math.max(0, arg1));
		if ((this.field9479[var4][var5] & 0xFF) < arg2) {
			this.field9479[var4][var5] = (byte) arg2;
		}
	}

	@ObfuscatedName("aek.n(II[I[I[I[I[I[I[I[ILdy;Z)V")
	public void method1557(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, WaterFogData arg10, boolean arg11) {
		MaterialList var13 = this.field9453.materialList;
		if (arg5 != null && this.field9467 == null) {
			this.field9467 = new int[this.field1235][this.field1234][];
		}
		if (arg3 != null && this.field9473 == null) {
			this.field9473 = new int[this.field1235][this.field1234][];
		}
		this.field9464[arg0][arg1] = arg2;
		this.field9451[arg0][arg1] = arg4;
		this.field9462[arg0][arg1] = arg6;
		this.field9463[arg0][arg1] = arg7;
		if (this.field9467 != null) {
			this.field9467[arg0][arg1] = arg5;
		}
		if (this.field9473 != null) {
			this.field9473[arg0][arg1] = arg3;
		}
		GlFloorModelRelated1[] var14 = this.field9461[arg0][arg1] = new GlFloorModelRelated1[arg6.length];
		for (int var15 = 0; var15 < arg6.length; var15++) {
			int var16 = arg8[var15];
			int var17 = arg9[var15];
			if ((this.field9457 & 0x20) != 0 && var16 != -1 && var13.get(var16).highDetail) {
				var17 = 128;
				var16 = -1;
			}
			long var18 = (long) arg10.offset << 48 | (long) arg10.scale << 42 | (long) arg10.colour << 28 | (long) (var17 << 14) | (long) var16;
			Node var20;
			for (var20 = this.field9483.get(var18); var20 != null; var20 = this.field9483.nextWithKey()) {
				GlFloorModelRelated1 var21 = (GlFloorModelRelated1) var20;
				if (var21.field11296 == var16 && (float) var17 == var21.field11294 && var21.field11295.method2096(arg10)) {
					break;
				}
			}
			if (var20 == null) {
				var14[var15] = new GlFloorModelRelated1(this, var16, var17, arg10);
				this.field9483.put(var14[var15], var18);
			} else {
				var14[var15] = (GlFloorModelRelated1) var20;
			}
		}
		if (arg11) {
			this.field9468[arg0][arg1] = (byte) (this.field9468[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.field9478) {
			this.field9478 = arg6.length;
		}
		this.field9477 += arg6.length;
	}

	@ObfuscatedName("aek.m(II[I[I[I[I[I[I[I[I[I[I[ILdy;Z)V")
	public void addTileUnblended(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, WaterFogData arg13, boolean arg14) {
		int var16 = arg9.length;
		int[] var17 = new int[var16 * 3];
		int[] var18 = new int[var16 * 3];
		int[] var19 = new int[var16 * 3];
		int[] var20 = arg10 == null ? null : new int[var16 * 3];
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
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
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
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
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
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
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

	@ObfuscatedName("aek.k()V")
	public void method1555() {
		if (this.field9477 > 0) {
			byte[][] var1 = new byte[this.field1235 + 1][this.field1234 + 1];
			for (int var2 = 1; var2 < this.field1235; var2++) {
				for (int var3 = 1; var3 < this.field1234; var3++) {
					var1[var2][var3] = (byte) ((this.field9479[var2][var3] >> 1) + (this.field9479[var2][var3 + 1] >> 3) + (this.field9479[var2][var3 - 1] >> 2) + (this.field9479[var2 - 1][var3] >> 2) + (this.field9479[var2 + 1][var3] >> 3));
				}
			}
			this.field9471 = new Node[this.field9483.size()];
			this.field9483.toArray(this.field9471);
			for (int var4 = 0; var4 < this.field9471.length; var4++) {
				((GlFloorModelRelated1) this.field9471[var4]).method17578(this.field9477);
			}
			int var5 = 24;
			if (this.field9467 != null) {
				var5 += 4;
			}
			if ((this.field9457 & 0x7) != 0) {
				var5 += 12;
			}
			NativeHeapBuffer var6 = this.field9453.field9876.method92(this.field9477 * var5, false);
			Stream var7 = new Stream(var6);
			GlFloorModelRelated1[] var8 = new GlFloorModelRelated1[this.field9477];
			int var9 = IntMath.method3082(this.field9477 / 4);
			if (var9 < 1) {
				var9 = 1;
			}
			HashTable var10 = new HashTable(var9);
			GlFloorModelRelated1[] var11 = new GlFloorModelRelated1[this.field9478];
			for (int var12 = 0; var12 < this.field1235; var12++) {
				for (int var13 = 0; var13 < this.field1234; var13++) {
					if (this.field9462[var12][var13] != null) {
						GlFloorModelRelated1[] var14 = this.field9461[var12][var13];
						int[] var15 = this.field9464[var12][var13];
						int[] var16 = this.field9451[var12][var13];
						int[] var17 = this.field9463[var12][var13];
						int[] var18 = this.field9462[var12][var13];
						int[] var19 = this.field9473 == null ? null : this.field9473[var12][var13];
						int[] var20 = this.field9467 == null ? null : this.field9467[var12][var13];
						if (var17 == null) {
							var17 = var18;
						}
						float var21 = this.field9469[var12][var13];
						float var22 = this.field9458[var12][var13];
						float var23 = this.field9482[var12][var13];
						float var24 = this.field9469[var12][var13 + 1];
						float var25 = this.field9458[var12][var13 + 1];
						float var26 = this.field9482[var12][var13 + 1];
						float var27 = this.field9469[var12 + 1][var13 + 1];
						float var28 = this.field9458[var12 + 1][var13 + 1];
						float var29 = this.field9482[var12 + 1][var13 + 1];
						float var30 = this.field9469[var12 + 1][var13];
						float var31 = this.field9458[var12 + 1][var13];
						float var32 = this.field9482[var12 + 1][var13];
						int var33 = var1[var12][var13] & 0xFF;
						int var34 = var1[var12][var13 + 1] & 0xFF;
						int var35 = var1[var12 + 1][var13 + 1] & 0xFF;
						int var36 = var1[var12 + 1][var13] & 0xFF;
						int var37 = 0;
						label346: for (int var38 = 0; var38 < var18.length; var38++) {
							GlFloorModelRelated1 var39 = var14[var38];
							for (int var40 = 0; var40 < var37; var40++) {
								if (var11[var40] == var39) {
									continue label346;
								}
							}
							var11[var37++] = var39;
						}
						short[] var41 = this.field9460[this.field1235 * var13 + var12] = new short[var18.length];
						for (int var42 = 0; var42 < var18.length; var42++) {
							int var43 = (var12 << this.field1236) + var15[var42];
							int var44 = (var13 << this.field1236) + var16[var42];
							int var45 = var43 >> this.field9454;
							int var46 = var44 >> this.field9454;
							int var47 = var18[var42];
							int var48 = var17[var42];
							int var49 = var19 == null ? 0 : var19[var42];
							long var50 = (long) var48 << 48 | (long) var47 << 32 | (long) (var45 << 16) | (long) var46;
							int var52 = var15[var42];
							int var53 = var16[var42];
							byte var54 = 74;
							int var55 = 0;
							float var56 = 1.0F;
							float var57;
							float var58;
							float var59;
							int var60;
							if (var52 == 0 && var53 == 0) {
								var57 = var21;
								var58 = var22;
								var59 = var23;
								var60 = var54 - var33;
							} else if (var52 == 0 && this.field1233 == var53) {
								var57 = var24;
								var58 = var25;
								var59 = var26;
								var60 = var54 - var34;
							} else if (this.field1233 == var52 && this.field1233 == var53) {
								var57 = var27;
								var58 = var28;
								var59 = var29;
								var60 = var54 - var35;
							} else if (this.field1233 == var52 && var53 == 0) {
								var57 = var30;
								var58 = var31;
								var59 = var32;
								var60 = var54 - var36;
							} else {
								float var61 = (float) var52 / (float) this.field1233;
								float var62 = (float) var53 / (float) this.field1233;
								float var63 = (var30 - var21) * var61 + var21;
								float var64 = (var31 - var22) * var61 + var22;
								float var65 = (var32 - var23) * var61 + var23;
								float var66 = (var27 - var24) * var61 + var24;
								float var67 = (var28 - var25) * var61 + var25;
								float var68 = (var29 - var26) * var61 + var26;
								var57 = (var66 - var63) * var62 + var63;
								var58 = (var67 - var64) * var62 + var64;
								var59 = (var68 - var65) * var62 + var65;
								int var69 = ((var36 - var33) * var52 >> this.field1236) + var33;
								int var70 = ((var35 - var34) * var52 >> this.field1236) + var34;
								var60 = var54 - (((var70 - var69) * var53 >> this.field1236) + var69);
							}
							if (var47 != -1) {
								int var71 = (var47 & 0x7F) * var60 >> 7;
								if (var71 < 2) {
									var71 = 2;
								} else if (var71 > 126) {
									var71 = 126;
								}
								var55 = ColourUtils.field8151[var47 & 0xFF80 | var71];
								if ((this.field9457 & 0x7) == 0) {
									float var72 = this.field9453.field9870[2] * var59 + this.field9453.field9870[0] * var57 + this.field9453.field9870[1] * var58;
									var56 = this.field9453.field9946 + var72 * (var72 > 0.0F ? this.field9453.field9947 : this.field9453.field9948);
								}
							}
							Node var73 = null;
							if ((var43 & this.field9455 - 1) == 0 && (var44 & this.field9455 - 1) == 0) {
								var73 = var10.get(var50);
							}
							int var84;
							if (var73 == null) {
								int var75;
								if (var47 == var48) {
									var75 = var55;
								} else {
									int var74 = (var48 & 0x7F) * var60 >> 7;
									if (var74 < 2) {
										var74 = 2;
									} else if (var74 > 126) {
										var74 = 126;
									}
									var75 = ColourUtils.field8151[var48 & 0xFF80 | var74];
									if ((this.field9457 & 0x7) == 0) {
										float var76 = this.field9453.field9870[2] * var59 + this.field9453.field9870[0] * var57 + this.field9453.field9870[1] * var58;
										float var77 = this.field9453.field9946 + var56 * (var56 > 0.0F ? this.field9453.field9947 : this.field9453.field9948);
										int var78 = var75 >> 16 & 0xFF;
										int var79 = var75 >> 8 & 0xFF;
										int var80 = var75 & 0xFF;
										int var81 = (int) ((float) var78 * var77);
										if (var81 < 0) {
											var81 = 0;
										} else if (var81 > 255) {
											var81 = 255;
										}
										int var82 = (int) ((float) var79 * var77);
										if (var82 < 0) {
											var82 = 0;
										} else if (var82 > 255) {
											var82 = 255;
										}
										int var83 = (int) ((float) var80 * var77);
										if (var83 < 0) {
											var83 = 0;
										} else if (var83 > 255) {
											var83 = 255;
										}
										var75 = var81 << 16 | var82 << 8 | var83;
									}
								}
								if (this.field9453.field10017) {
									var7.method58((float) var43);
									var7.method58((float) (this.getFineHeight(var43, var44) + var49));
									var7.method58((float) var44);
									var7.method57((byte) (var75 >> 16));
									var7.method57((byte) (var75 >> 8));
									var7.method57((byte) var75);
									var7.method57(-1);
									var7.method58((float) var43);
									var7.method58((float) var44);
									if (this.field9467 != null) {
										var7.method58(var20 == null ? 0.0F : (float) (var20[var42] - 1));
									}
									if ((this.field9457 & 0x7) != 0) {
										var7.method58(var57);
										var7.method58(var58);
										var7.method58(var59);
									}
								} else {
									var7.method59((float) var43);
									var7.method59((float) (this.getFineHeight(var43, var44) + var49));
									var7.method59((float) var44);
									var7.method57((byte) (var75 >> 16));
									var7.method57((byte) (var75 >> 8));
									var7.method57((byte) var75);
									var7.method57(-1);
									var7.method59((float) var43);
									var7.method59((float) var44);
									if (this.field9467 != null) {
										var7.method59(var20 == null ? 0.0F : (float) (var20[var42] - 1));
									}
									if ((this.field9457 & 0x7) != 0) {
										var7.method59(var57);
										var7.method59(var58);
										var7.method59(var59);
									}
								}
								var84 = this.field9466++;
								var41[var42] = (short) var84;
								if (var47 != -1) {
									var8[var84] = var14[var42];
								}
								var10.put(new FloorModelNode(var41[var42]), var50);
							} else {
								var41[var42] = ((FloorModelNode) var73).field11437;
								var84 = var41[var42] & 0xFFFF;
								if (var47 != -1 && var14[var42].nodeId < var8[var84].nodeId) {
									var8[var84] = var14[var42];
								}
							}
							for (int var85 = 0; var85 < var37; var85++) {
								var11[var85].method17582(var84, var55, var60, var56);
							}
							this.field9459++;
						}
					}
				}
			}
			for (int var86 = 0; var86 < this.field9466; var86++) {
				GlFloorModelRelated1 var87 = var8[var86];
				if (var87 != null) {
					var87.method17581(var86);
				}
			}
			for (int var88 = 0; var88 < this.field1235; var88++) {
				for (int var89 = 0; var89 < this.field1234; var89++) {
					short[] var90 = this.field9460[this.field1235 * var89 + var88];
					if (var90 != null) {
						int var91 = 0;
						int var92 = 0;
						while (var92 < var90.length) {
							int var93 = var90[var92++] & 0xFFFF;
							int var94 = var90[var92++] & 0xFFFF;
							int var95 = var90[var92++] & 0xFFFF;
							GlFloorModelRelated1 var96 = var8[var93];
							GlFloorModelRelated1 var97 = var8[var94];
							GlFloorModelRelated1 var98 = var8[var95];
							GlFloorModelRelated1 var99 = null;
							if (var96 != null) {
								var96.method17580(var88, var89, var91);
								var99 = var96;
							}
							if (var97 != null) {
								var97.method17580(var88, var89, var91);
								if (var99 == null || var97.nodeId < var99.nodeId) {
									var99 = var97;
								}
							}
							if (var98 != null) {
								var98.method17580(var88, var89, var91);
								if (var99 == null || var98.nodeId < var99.nodeId) {
									var99 = var98;
								}
							}
							if (var99 != null) {
								if (var96 != null) {
									var99.method17581(var93);
								}
								if (var97 != null) {
									var99.method17581(var94);
								}
								if (var98 != null) {
									var99.method17581(var95);
								}
								var99.method17580(var88, var89, var91);
							}
							var91++;
						}
					}
				}
			}
			var7.method60();
			this.field9472 = this.field9453.method15804(var5, var6, var7.method55(), false);
			if (this.field9472 instanceof GlBufferRelated_Sub2) {
				var6.method81();
			}
			this.field9456 = new GlRelated3(this.field9472, 5126, 3, 0);
			this.field9474 = new GlRelated3(this.field9472, 5121, 4, 12);
			byte var100;
			if (this.field9467 == null) {
				this.field9476 = new GlRelated3(this.field9472, 5126, 2, 16);
				var100 = 24;
			} else {
				this.field9476 = new GlRelated3(this.field9472, 5126, 3, 16);
				var100 = 28;
			}
			if ((this.field9457 & 0x7) != 0) {
				this.field9480 = new GlRelated3(this.field9472, 5126, 3, var100);
			}
			long[] var101 = new long[this.field9471.length];
			for (int var102 = 0; var102 < this.field9471.length; var102++) {
				GlFloorModelRelated1 var103 = (GlFloorModelRelated1) this.field9471[var102];
				var101[var102] = var103.nodeId;
				var103.method17597(this.field9466);
			}
			Algorithms.method10210(var101, this.field9471);
			if (this.field9465 != null) {
				this.field9465.method1337();
			}
		} else {
			this.field9465 = null;
		}
		if ((this.field9481 & 0x2) == 0) {
			this.field9451 = null;
			this.field9464 = null;
			this.field9462 = null;
		}
		this.field9467 = null;
		this.field9463 = null;
		this.field9473 = null;
		this.field9461 = null;
		this.field9479 = null;
		this.field9483 = null;
		this.field9482 = null;
		this.field9458 = null;
		this.field9469 = null;
	}

	@ObfuscatedName("aek.f(III[[ZZI)V")
	public void method1548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		this.method15409(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aek.av(III[[ZZI)V")
	public void method15409(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		if (this.field9471 == null) {
			return;
		}
		int var7 = arg2 + arg2 + 1;
		int var8 = var7 * var7;
		if (this.field9453.field10019.length < var8) {
			this.field9453.field10019 = new int[var8];
		}
		if (this.field9453.field10016.data.length < this.field9459 * 2) {
			this.field9453.field10016 = new GpuPacket(this.field9459 * 2);
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
		int var15 = 0;
		int[] var16 = this.field9453.field10019;
		for (int var17 = var9; var17 <= var13; var17++) {
			boolean[] var18 = arg3[var17 - var10];
			for (int var19 = var11; var19 <= var14; var19++) {
				if (var18[var19 - var12]) {
					var16[var15++] = this.field1235 * var19 + var17;
				}
			}
		}
		this.field9453.method15773();
		this.field9453.method15764((this.field9457 & 0x7) != 0);
		for (int var20 = 0; var20 < this.field9471.length; var20++) {
			((GlFloorModelRelated1) this.field9471[var20]).method17583(var16, var15);
		}
		if (!this.field9470._isEmpty()) {
			int var21 = this.field9453.field9955;
			int var22 = this.field9453.field9956;
			this.field9453.setFog(0, var22, this.field9453.field9957);
			this.field9453.method15764(false);
			this.field9453.method15789(false);
			this.field9453.method15791(128);
			this.field9453.method15774(-2);
			this.field9453.method15777(this.field9453.field9974);
			this.field9453.method15810(8448, 7681);
			this.field9453.method15780(0, 34166, 770);
			this.field9453.method15781(0, 34167, 770);
			for (Node var23 = this.field9470.head(); var23 != null; var23 = this.field9470.next()) {
				GlFloorModelRelated5 var24 = (GlFloorModelRelated5) var23;
				var24.method17572(arg0, arg1, arg2, arg3);
			}
			this.field9453.method15780(0, 5890, 768);
			this.field9453.method15781(0, 5890, 770);
			this.field9453.method15777(null);
			this.field9453.setFog(var21, var22, this.field9453.field9957);
		}
		if (this.field9465 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.field9453.method15809(this.field9456, null, null, this.field9476);
		this.field9465.method1339(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@ObfuscatedName("aek.w(IIIIIII[[Z)V")
	public void method1526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		RenderTarget var9 = this.field9453.getRenderTarget();
		if (this.field9477 <= 0 || var9 == null) {
			return;
		}
		this.field9453.method15748();
		this.field9453.method15738(false);
		this.field9453.method15764(false);
		this.field9453.method15788(false);
		this.field9453.method15789(false);
		this.field9453.method15791(0);
		this.field9453.method15774(-2);
		this.field9453.method15777(null);
		field9484[0] = (float) arg2 / ((float) this.field1233 * 128.0F * (float) var9.getWidth());
		field9484[1] = 0.0F;
		field9484[2] = 0.0F;
		field9484[3] = 0.0F;
		field9484[4] = 0.0F;
		field9484[5] = (float) arg2 / ((float) this.field1233 * 128.0F * (float) var9.getHeight());
		field9484[6] = 0.0F;
		field9484[7] = 0.0F;
		field9484[8] = 0.0F;
		field9484[9] = 0.0F;
		field9484[10] = 0.0F;
		field9484[11] = 0.0F;
		field9484[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) var9.getWidth();
		field9484[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) var9.getHeight();
		field9484[14] = 0.0F;
		field9484[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(field9484, 0);
		field9484[0] = 1.0F;
		field9484[1] = 0.0F;
		field9484[2] = 0.0F;
		field9484[3] = 0.0F;
		field9484[4] = 0.0F;
		field9484[5] = 0.0F;
		field9484[6] = 1.0F;
		field9484[7] = 0.0F;
		field9484[8] = 0.0F;
		field9484[9] = 1.0F;
		field9484[10] = 0.0F;
		field9484[11] = 0.0F;
		field9484[12] = 0.0F;
		field9484[13] = 0.0F;
		field9484[14] = 0.0F;
		field9484[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(field9484, 0);
		if ((this.field9457 & 0x7) == 0) {
			this.field9453.method15764(false);
		} else {
			this.field9453.method15764(true);
			this.field9453.method15758();
		}
		this.field9453.method15809(this.field9456, this.field9480, this.field9474, this.field9476);
		if (this.field9453.field10016.data.length < this.field9459 * 2) {
			this.field9453.field10016 = new GpuPacket(this.field9459 * 2);
		} else {
			this.field9453.field10016.pos = 0;
		}
		int var10 = 0;
		GpuPacket var11 = this.field9453.field10016;
		if (this.field9453.field10017) {
			for (int var12 = arg4; var12 < arg6; var12++) {
				int var13 = this.field1235 * var12 + arg3;
				for (int var14 = arg3; var14 < arg5; var14++) {
					if (arg7[var14 - arg3][var12 - arg4]) {
						short[] var15 = this.field9460[var13];
						if (var15 != null) {
							for (int var16 = 0; var16 < var15.length; var16++) {
								var11.p2(var15[var16] & 0xFFFF);
								var10++;
							}
						}
					}
					var13++;
				}
			}
		} else {
			for (int var17 = arg4; var17 < arg6; var17++) {
				int var18 = this.field1235 * var17 + arg3;
				for (int var19 = arg3; var19 < arg5; var19++) {
					if (arg7[var19 - arg3][var17 - arg4]) {
						short[] var20 = this.field9460[var18];
						if (var20 != null) {
							for (int var21 = 0; var21 < var20.length; var21++) {
								var11.ip2(var20[var21] & 0xFFFF);
								var10++;
							}
						}
					}
					var18++;
				}
			}
		}
		if (var10 > 0) {
			GlFloorModelRelated2_Sub1 var22 = new GlFloorModelRelated2_Sub1(this.field9453, 5123, var11.data, var11.pos);
			this.field9453.method15921(var22, 4, 0, var10);
		}
	}

	@ObfuscatedName("aek.d(IILara;)Lara;")
	public HardShadow method1531(int arg0, int arg1, HardShadow arg2) {
		if ((this.field9468[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		int var4 = this.field1233 >> this.field9453.field9874;
		GlHardShadow var5 = (GlHardShadow) arg2;
		GlHardShadow var6;
		if (var5 != null && var5.method19687(var4, var4)) {
			var6 = var5;
			var5.method19693();
		} else {
			var6 = new GlHardShadow(this.field9453, var4, var4);
		}
		var6.method19686(0, 0, var4, var4);
		this.method15412(var6, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("aek.ao(Latk;II)V")
	public void method15412(GlHardShadow arg0, int arg1, int arg2) {
		int[] var4 = this.field9464[arg1][arg2];
		int[] var5 = this.field9451[arg1][arg2];
		int var6 = var4.length;
		if (this.field9453.field9993.length < var6) {
			this.field9453.field9993 = new int[var6];
			this.field9453.field9913 = new int[var6];
		}
		int[] var7 = this.field9453.field9993;
		int[] var8 = this.field9453.field9913;
		for (int var9 = 0; var9 < var6; var9++) {
			var7[var9] = var4[var9] >> this.field9453.field9874;
			var8[var9] = var5[var9] >> this.field9453.field9874;
		}
		int var10 = 0;
		while (var10 < var6) {
			int var11 = var7[var10];
			int var12 = var8[var10++];
			int var13 = var7[var10];
			int var14 = var8[var10++];
			int var15 = var7[var10];
			int var16 = var8[var10++];
			if ((var11 - var13) * (var14 - var16) - (var14 - var12) * (var15 - var13) > 0) {
				arg0.method19689(var12, var14, var16, var11, var13, var15);
			}
		}
	}

	@ObfuscatedName("aek.v(Lara;IIIIZ)Z")
	public boolean method1535(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.field9465 == null || arg0 == null) {
			return false;
		} else {
			int var7 = arg1 - (this.field9453.field9915 * arg2 >> 8) >> this.field9453.field9874;
			int var8 = arg3 - (this.field9453.field9953 * arg2 >> 8) >> this.field9453.field9874;
			return this.field9465.method1349(arg0, var7, var8);
		}
	}

	@ObfuscatedName("aek.c(Lara;IIIIZ)V")
	public void method1532(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.field9465 != null && arg0 != null) {
			int var7 = arg1 - (this.field9453.field9915 * arg2 >> 8) >> this.field9453.field9874;
			int var8 = arg3 - (this.field9453.field9953 * arg2 >> 8) >> this.field9453.field9874;
			this.field9465.method1340(arg0, var7, var8);
		}
	}

	@ObfuscatedName("aek.r(Lara;IIIIZ)V")
	public void method1543(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.field9465 != null && arg0 != null) {
			int var7 = arg1 - (this.field9453.field9915 * arg2 >> 8) >> this.field9453.field9874;
			int var8 = arg3 - (this.field9453.field9953 * arg2 >> 8) >> this.field9453.field9874;
			this.field9465.method1341(arg0, var7, var8);
		}
	}

	@ObfuscatedName("aek.o(Lakf;[I)V")
	public void method1549(Light arg0, int[] arg1) {
		this.field9470.addTail(new GlFloorModelRelated5(this.field9453, this, arg0, arg1));
	}
}

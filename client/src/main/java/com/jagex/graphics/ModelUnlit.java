package com.jagex.graphics;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.Algorithms;
import com.jagex.js5.Js5;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

@ObfuscatedName("dq")
public class ModelUnlit {

	@ObfuscatedName("dq.k")
	public int version = 12;

	@ObfuscatedName("dq.f")
	public int vertexCount = 0;

	@ObfuscatedName("dq.w")
	public int field1374 = 0;

	@ObfuscatedName("dq.l")
	public int[] vertexX;

	@ObfuscatedName("dq.u")
	public float[] textureVertexV;

	@ObfuscatedName("dq.z")
	public int[] vertexY;

	@ObfuscatedName("dq.p")
	public int[] vertexZ;

	@ObfuscatedName("dq.d")
	public int[] vertexTextureVertex;

	@ObfuscatedName("dq.c")
	public int[] vertexLabel;

	@ObfuscatedName("dq.r")
	public short[] vertexSourceModels;

	@ObfuscatedName("dq.v")
	public int faceCount = 0;

	@ObfuscatedName("dq.o")
	public int field1381;

	@ObfuscatedName("dq.s")
	public float[] textureVertexU;

	@ObfuscatedName("dq.y")
	public short[] faceVertex1;

	@ObfuscatedName("dq.q")
	public short[] faceVertex2;

	@ObfuscatedName("dq.x")
	public short[] faceVertex3;

	@ObfuscatedName("dq.b")
	public byte[] faceTextureVertexOffset1;

	@ObfuscatedName("dq.h")
	public byte[] faceTextureVertexOffset2;

	@ObfuscatedName("dq.a")
	public byte[] faceTextureVertexOffset3;

	@ObfuscatedName("dq.g")
	public byte[] faceType;

	@ObfuscatedName("dq.i")
	public byte[] facePriority;

	@ObfuscatedName("dq.j")
	public byte[] faceTrans;

	@ObfuscatedName("dq.t")
	public short[] faceMapping;

	@ObfuscatedName("dq.ae")
	public short[] faceColour;

	@ObfuscatedName("dq.ag")
	public short[] faceMaterial;

	@ObfuscatedName("dq.ah")
	public int[] faceLabel;

	@ObfuscatedName("dq.al")
	public byte field1394 = 0;

	@ObfuscatedName("dq.ac")
	public short[] field1399;

	@ObfuscatedName("dq.as")
	public int field1387 = 0;

	@ObfuscatedName("dq.at")
	public byte[] textureTriangleType;

	@ObfuscatedName("dq.ad")
	public short[] textureTriangleVertex1;

	@ObfuscatedName("dq.am")
	public short[] textureTriangleVertex2;

	@ObfuscatedName("dq.au")
	public short[] textureTriangleVertex3;

	@ObfuscatedName("dq.ar")
	public int[] textureTriangleScaleX;

	@ObfuscatedName("dq.ap")
	public int[] textureTriangleScaleY;

	@ObfuscatedName("dq.aq")
	public int[] textureTriangleScaleZ;

	@ObfuscatedName("dq.ax")
	public int[] textureTriangleSpeed;

	@ObfuscatedName("dq.av")
	public int[] textureTriangleTranslationU;

	@ObfuscatedName("dq.ao")
	public int[] textureTriangleTranslationV;

	@ObfuscatedName("dq.aj")
	public byte[] field1402;

	@ObfuscatedName("dq.ay")
	public byte[] textureTriangleDirection;

	@ObfuscatedName("dq.ab")
	public ModelParticleEmitter[] emitters;

	@ObfuscatedName("dq.az")
	public ModelParticleEffector[] effectors;

	@ObfuscatedName("dq.aa")
	public ModelBillboard[] billboard;

	@ObfuscatedName("dq.e(Lpy;II)Ldq;")
	public static ModelUnlit get(Js5 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getfile(arg1, arg2);
		return var3 == null ? null : new ModelUnlit(var3);
	}

	public ModelUnlit(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		Packet var3 = new Packet(arg0);
		Packet var4 = new Packet(arg0);
		Packet var5 = new Packet(arg0);
		Packet var6 = new Packet(arg0);
		Packet var7 = new Packet(arg0);
		Packet var8 = new Packet(arg0);
		int var9 = var2.g1();
		if (var9 == 1) {
			var2.g1();
			this.version = var2.g1();
			var2.pos = (arg0.length - 26);
			this.vertexCount = var2.g2();
			this.faceCount = var2.g2();
			this.field1387 = var2.g2();
			int var10 = var2.g1();
			boolean var11 = (var10 & 0x1) == 1;
			boolean var12 = (var10 & 0x2) == 2;
			boolean var13 = (var10 & 0x4) == 4;
			boolean var14 = (var10 & 0x10) == 16;
			boolean var15 = (var10 & 0x20) == 32;
			boolean var16 = (var10 & 0x40) == 64;
			boolean var17 = (var10 & 0x80) == 128;
			int var18 = var2.g1();
			int var19 = var2.g1();
			int var20 = var2.g1();
			int var21 = var2.g1();
			int var22 = var2.g1();
			int var23 = var2.g2();
			int var24 = var2.g2();
			int var25 = var2.g2();
			int var26 = var2.g2();
			int var27 = var2.g2();
			int var28 = var2.g2();
			int var29 = var2.g2();
			if (!var14) {
				if (var22 == 1) {
					var28 = this.vertexCount;
				} else {
					var28 = 0;
				}
			}
			if (!var15) {
				if (var20 == 1) {
					var29 = this.faceCount;
				} else {
					var29 = 0;
				}
			}
			int var30 = 0;
			int var31 = 0;
			int var32 = 0;
			if (this.field1387 > 0) {
				this.textureTriangleType = new byte[this.field1387];
				var2.pos = 3;
				for (int var33 = 0; var33 < this.field1387; var33++) {
					byte var34 = this.textureTriangleType[var33] = var2.g1b();
					if (var34 == 0) {
						var30++;
					}
					if (var34 >= 1 && var34 <= 3) {
						var31++;
					}
					if (var34 == 2) {
						var32++;
					}
				}
			}
			int var35 = this.field1387 + 3;
			int var37 = this.vertexCount + var35;
			int var38 = var37;
			if (var11) {
				var37 += this.faceCount;
			}
			int var40 = this.faceCount + var37;
			int var41 = var40;
			if (var18 == 255) {
				var40 += this.faceCount;
			}
			int var43 = var29 + var40;
			int var45 = var28 + var43;
			int var46 = var45;
			if (var19 == 1) {
				var45 += this.faceCount;
			}
			int var48 = var26 + var45;
			int var49 = var48;
			if (var21 == 1) {
				var48 += this.faceCount * 2;
			}
			int var51 = var27 + var48;
			int var53 = this.faceCount * 2 + var51;
			int var55 = var23 + var53;
			int var57 = var24 + var55;
			int var59 = var25 + var57;
			int var61 = var30 * 6 + var59;
			int var63 = var31 * 6 + var61;
			byte var64 = 6;
			if (this.version == 14) {
				var64 = 7;
			} else if (this.version >= 15) {
				var64 = 9;
			}
			int var66 = var31 * var64 + var63;
			int var68 = var31 + var66;
			int var70 = var31 + var68;
			int var72 = var32 * 2 + var31 + var70;
			int var74 = arg0.length;
			int var75 = arg0.length;
			int var76 = arg0.length;
			int var77 = arg0.length;
			if (var17) {
				Packet var78 = new Packet(arg0);
				var78.pos = (arg0.length - 26);
				var78.pos -= arg0[var78.pos - 1];
				this.field1381 = var78.g2();
				int var79 = var78.g2();
				int var80 = var78.g2();
				var74 = var72 + var79;
				var75 = var74 + var80;
				var76 = this.vertexCount + var75;
				var77 = this.field1381 * 2 + var76;
			}
			this.vertexX = new int[this.vertexCount];
			this.vertexY = new int[this.vertexCount];
			this.vertexZ = new int[this.vertexCount];
			this.faceVertex1 = new short[this.faceCount];
			this.faceVertex2 = new short[this.faceCount];
			this.faceVertex3 = new short[this.faceCount];
			if (var22 == 1) {
				this.vertexLabel = new int[this.vertexCount];
			}
			if (var11) {
				this.faceType = new byte[this.faceCount];
			}
			if (var18 == 255) {
				this.facePriority = new byte[this.faceCount];
			} else {
				this.field1394 = (byte) var18;
			}
			if (var19 == 1) {
				this.faceTrans = new byte[this.faceCount];
			}
			if (var20 == 1) {
				this.faceLabel = new int[this.faceCount];
			}
			if (var21 == 1) {
				this.faceMaterial = new short[this.faceCount];
			}
			if (var21 == 1 && (this.field1387 > 0 || this.field1381 > 0)) {
				this.faceMapping = new short[this.faceCount];
			}
			this.faceColour = new short[this.faceCount];
			if (this.field1387 > 0) {
				this.textureTriangleVertex1 = new short[this.field1387];
				this.textureTriangleVertex2 = new short[this.field1387];
				this.textureTriangleVertex3 = new short[this.field1387];
				if (var31 > 0) {
					this.textureTriangleScaleX = new int[var31];
					this.textureTriangleScaleY = new int[var31];
					this.textureTriangleScaleZ = new int[var31];
					this.field1402 = new byte[var31];
					this.textureTriangleDirection = new byte[var31];
					this.textureTriangleSpeed = new int[var31];
				}
				if (var32 > 0) {
					this.textureTriangleTranslationU = new int[var32];
					this.textureTriangleTranslationV = new int[var32];
				}
			}
			var2.pos = var35;
			var3.pos = var53;
			var4.pos = var55;
			var5.pos = var57;
			var6.pos = var43;
			int var81 = 0;
			int var82 = 0;
			int var83 = 0;
			for (int var84 = 0; var84 < this.vertexCount; var84++) {
				int var85 = var2.g1();
				int var86 = 0;
				if ((var85 & 0x1) != 0) {
					var86 = var3.gSmart1or2s();
				}
				int var87 = 0;
				if ((var85 & 0x2) != 0) {
					var87 = var4.gSmart1or2s();
				}
				int var88 = 0;
				if ((var85 & 0x4) != 0) {
					var88 = var5.gSmart1or2s();
				}
				this.vertexX[var84] = var81 + var86;
				this.vertexY[var84] = var82 + var87;
				this.vertexZ[var84] = var83 + var88;
				var81 = this.vertexX[var84];
				var82 = this.vertexY[var84];
				var83 = this.vertexZ[var84];
				if (var22 == 1) {
					if (var14) {
						this.vertexLabel[var84] = var6.gSmart1or2null();
					} else {
						this.vertexLabel[var84] = var6.g1();
						if (this.vertexLabel[var84] == 255) {
							this.vertexLabel[var84] = -1;
						}
					}
				}
			}
			if (this.field1381 > 0) {
				var2.pos = var75;
				var3.pos = var76;
				var4.pos = var77;
				this.vertexTextureVertex = new int[this.vertexCount];
				int var89 = 0;
				int var90 = 0;
				while (var89 < this.vertexCount) {
					this.vertexTextureVertex[var89] = var90;
					var90 += var2.g1();
					var89++;
				}
				this.faceTextureVertexOffset1 = new byte[this.faceCount];
				this.faceTextureVertexOffset2 = new byte[this.faceCount];
				this.faceTextureVertexOffset3 = new byte[this.faceCount];
				this.textureVertexU = new float[this.field1381];
				this.textureVertexV = new float[this.field1381];
				for (int var91 = 0; var91 < this.field1381; var91++) {
					this.textureVertexU[var91] = (float) var3.g2s() / 4096.0F;
					this.textureVertexV[var91] = (float) var4.g2s() / 4096.0F;
				}
			}
			var2.pos = var51;
			var3.pos = var38;
			var4.pos = var41;
			var5.pos = var46;
			var6.pos = var40;
			var7.pos = var49;
			var8.pos = var48;
			for (int var92 = 0; var92 < this.faceCount; var92++) {
				this.faceColour[var92] = (short) var2.g2();
				if (var11) {
					this.faceType[var92] = var3.g1b();
				}
				if (var18 == 255) {
					this.facePriority[var92] = var4.g1b();
				}
				if (var19 == 1) {
					this.faceTrans[var92] = var5.g1b();
				}
				if (var20 == 1) {
					if (var15) {
						this.faceLabel[var92] = var6.gSmart1or2null();
					} else {
						this.faceLabel[var92] = var6.g1();
						if (this.faceLabel[var92] == 255) {
							this.faceLabel[var92] = -1;
						}
					}
				}
				if (var21 == 1) {
					this.faceMaterial[var92] = (short) (var7.g2() - 1);
				}
				if (this.faceMapping != null) {
					if (this.faceMaterial[var92] == -1) {
						this.faceMapping[var92] = -1;
					} else if (this.version >= 16) {
						this.faceMapping[var92] = (short) (var8.gSmart1or2() - 1);
					} else {
						this.faceMapping[var92] = (short) (var8.g1() - 1);
					}
				}
			}
			this.field1374 = -1;
			var2.pos = var45;
			var3.pos = var37;
			var4.pos = var74;
			this.method1949(var2, var3, var4);
			var2.pos = var59;
			var3.pos = var61;
			var4.pos = var63;
			var5.pos = var66;
			var6.pos = var68;
			var7.pos = var70;
			this.method1939(var2, var3, var4, var5, var6, var7);
			var2.pos = var72;
			if (var12) {
				int var93 = var2.g1();
				if (var93 > 0) {
					this.emitters = new ModelParticleEmitter[var93];
					for (int var94 = 0; var94 < var93; var94++) {
						int var95 = var2.g2();
						int var96 = var2.g2();
						byte var97;
						if (var18 == 255) {
							var97 = this.facePriority[var96];
						} else {
							var97 = (byte) var18;
						}
						this.emitters[var94] = new ModelParticleEmitter(var95, var96, this.faceVertex1[var96], this.faceVertex2[var96], this.faceVertex3[var96], var97);
					}
				}
				int var98 = var2.g1();
				if (var98 > 0) {
					this.effectors = new ModelParticleEffector[var98];
					for (int var99 = 0; var99 < var98; var99++) {
						int var100 = var2.g2();
						int var101 = var2.g2();
						this.effectors[var99] = new ModelParticleEffector(var100, var101);
					}
				}
			}
			if (var13) {
				int var102 = var2.g1();
				if (var102 > 0) {
					this.billboard = new ModelBillboard[var102];
					for (int var103 = 0; var103 < var102; var103++) {
						int var104 = var2.g2();
						int var105 = var2.g2();
						int var106;
						if (var16) {
							var106 = var2.gSmart1or2null();
						} else {
							var106 = var2.g1();
							if (var106 == 255) {
								var106 = -1;
							}
						}
						byte var107 = var2.g1b();
						this.billboard[var103] = new ModelBillboard(var104, var105, var106, var107);
					}
				}
			}
		} else {
			System.out.println("" + var9);
		}
	}

	public ModelUnlit(int arg0, int arg1, int arg2) {
		this.vertexX = new int[arg0];
		this.vertexY = new int[arg0];
		this.vertexZ = new int[arg0];
		this.vertexLabel = new int[arg0];
		this.faceVertex1 = new short[arg1];
		this.faceVertex2 = new short[arg1];
		this.faceVertex3 = new short[arg1];
		this.faceType = new byte[arg1];
		this.facePriority = new byte[arg1];
		this.faceTrans = new byte[arg1];
		this.faceMapping = new short[arg1];
		this.faceColour = new short[arg1];
		this.faceMaterial = new short[arg1];
		this.faceLabel = new int[arg1];
		if (arg2 > 0) {
			this.textureTriangleType = new byte[arg2];
			this.textureTriangleVertex1 = new short[arg2];
			this.textureTriangleVertex2 = new short[arg2];
			this.textureTriangleVertex3 = new short[arg2];
			this.textureTriangleScaleX = new int[arg2];
			this.textureTriangleScaleY = new int[arg2];
			this.textureTriangleScaleZ = new int[arg2];
			this.field1402 = new byte[arg2];
			this.textureTriangleDirection = new byte[arg2];
			this.textureTriangleSpeed = new int[arg2];
			this.textureTriangleTranslationU = new int[arg2];
			this.textureTriangleTranslationV = new int[arg2];
		}
	}

	public ModelUnlit(ModelUnlit[] arg0, int arg1) {
		this.vertexCount = 0;
		this.faceCount = 0;
		this.field1387 = 0;
		this.field1381 = 0;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		this.field1394 = -1;
		for (int var12 = 0; var12 < arg1; var12++) {
			ModelUnlit var13 = arg0[var12];
			if (var13 != null) {
				this.vertexCount += var13.vertexCount;
				this.faceCount += var13.faceCount;
				this.field1387 += var13.field1387;
				this.field1381 += var13.field1381;
				if (var13.emitters != null) {
					var3 += var13.emitters.length;
				}
				if (var13.effectors != null) {
					var4 += var13.effectors.length;
				}
				if (var13.billboard != null) {
					var5 += var13.billboard.length;
				}
				var6 |= var13.faceType != null;
				if (var13.facePriority == null) {
					if (this.field1394 == -1) {
						this.field1394 = var13.field1394;
					}
					if (this.field1394 != var13.field1394) {
						var7 = true;
					}
				} else {
					var7 = true;
				}
				var8 |= var13.faceTrans != null;
				var9 |= var13.faceMapping != null;
				var10 |= var13.faceMaterial != null;
				var11 |= var13.faceLabel != null;
			}
		}
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.vertexLabel = new int[this.vertexCount];
		this.vertexSourceModels = new short[this.vertexCount];
		this.faceVertex1 = new short[this.faceCount];
		this.faceVertex2 = new short[this.faceCount];
		this.faceVertex3 = new short[this.faceCount];
		if (var6) {
			this.faceType = new byte[this.faceCount];
		}
		if (var7) {
			this.facePriority = new byte[this.faceCount];
		}
		if (var8) {
			this.faceTrans = new byte[this.faceCount];
		}
		if (var9) {
			this.faceMapping = new short[this.faceCount];
		}
		this.faceColour = new short[this.faceCount];
		if (var10) {
			this.faceMaterial = new short[this.faceCount];
		}
		if (var11) {
			this.faceLabel = new int[this.faceCount];
		}
		this.field1399 = new short[this.faceCount];
		if (this.field1387 > 0) {
			this.textureTriangleType = new byte[this.field1387];
			this.textureTriangleVertex1 = new short[this.field1387];
			this.textureTriangleVertex2 = new short[this.field1387];
			this.textureTriangleVertex3 = new short[this.field1387];
			this.textureTriangleScaleX = new int[this.field1387];
			this.textureTriangleScaleY = new int[this.field1387];
			this.textureTriangleScaleZ = new int[this.field1387];
			this.field1402 = new byte[this.field1387];
			this.textureTriangleDirection = new byte[this.field1387];
			this.textureTriangleSpeed = new int[this.field1387];
			this.textureTriangleTranslationU = new int[this.field1387];
			this.textureTriangleTranslationV = new int[this.field1387];
		}
		if (var5 > 0) {
			this.billboard = new ModelBillboard[var5];
		}
		if (var3 > 0) {
			this.emitters = new ModelParticleEmitter[var3];
		}
		if (var4 > 0) {
			this.effectors = new ModelParticleEffector[var4];
		}
		if (this.field1381 > 0) {
			this.textureVertexU = new float[this.field1381];
			this.textureVertexV = new float[this.field1381];
			this.vertexTextureVertex = new int[this.vertexCount];
			this.faceTextureVertexOffset1 = new byte[this.faceCount];
			this.faceTextureVertexOffset2 = new byte[this.faceCount];
			this.faceTextureVertexOffset3 = new byte[this.faceCount];
		}
		int[] var14 = new int[this.vertexCount];
		int[] var15 = new int[this.field1381];
		int[] var16 = new int[this.vertexCount];
		int[] var17 = new int[this.vertexCount];
		int[] var18 = new int[3];
		this.vertexCount = 0;
		this.faceCount = 0;
		this.field1387 = 0;
		this.field1381 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		for (int var22 = 0; var22 < arg1; var22++) {
			short var23 = (short) (0x1 << var22);
			ModelUnlit var24 = arg0[var22];
			int var25 = this.faceCount;
			if (var24 != null) {
				boolean[] var26 = new boolean[var24.vertexCount];
				if (var24.billboard != null) {
					for (int var27 = 0; var27 < var24.billboard.length; var27++) {
						ModelBillboard var28 = var24.billboard[var27];
						this.billboard[var21++] = var28.method2659(var28.field1654 + this.faceCount);
					}
				}
				for (int var29 = 0; var29 < var24.faceCount; var29++) {
					var18[0] = var24.faceVertex1[var29];
					var18[1] = var24.faceVertex2[var29];
					var18[2] = var24.faceVertex3[var29];
					for (int var30 = 0; var30 < 3; var30++) {
						int var31 = var18[var30];
						int var32 = var24.vertexX[var31];
						int var33 = var24.vertexY[var31];
						int var34 = var24.vertexZ[var31];
						int var35;
						for (var35 = 0; var35 < this.vertexCount; var35++) {
							if (this.vertexX[var35] == var32 && this.vertexY[var35] == var33 && this.vertexZ[var35] == var34) {
								this.vertexSourceModels[var35] |= var23;
								var16[var31] = var35;
								break;
							}
						}
						if (var24.field1381 > 0 && !var26[var31]) {
							int var36 = (var31 < var24.vertexCount - 1 ? var24.vertexTextureVertex[var31 + 1] : var24.field1381) - var24.vertexTextureVertex[var31];
							for (int var37 = 0; var37 < var36; var37++) {
								this.textureVertexU[this.field1381] = var24.textureVertexU[var24.vertexTextureVertex[var31] + var37];
								this.textureVertexV[this.field1381] = var24.textureVertexV[var24.vertexTextureVertex[var31] + var37];
								var15[this.field1381] = var35 << 16 | var14[var35] + var37;
								this.field1381++;
							}
							var17[var31] = var14[var35];
							var14[var35] += var36;
							var26[var31] = true;
						}
						if (var35 >= this.vertexCount) {
							this.vertexX[this.vertexCount] = var32;
							this.vertexY[this.vertexCount] = var33;
							this.vertexZ[this.vertexCount] = var34;
							this.vertexSourceModels[this.vertexCount] = var23;
							this.vertexLabel[this.vertexCount] = var24.vertexLabel == null ? -1 : var24.vertexLabel[var31];
							var16[var31] = this.vertexCount++;
						}
					}
				}
				for (int var38 = 0; var38 < var24.faceCount; var38++) {
					if (var6 && var24.faceType != null) {
						this.faceType[this.faceCount] = var24.faceType[var38];
					}
					if (var7) {
						if (var24.facePriority == null) {
							this.facePriority[this.faceCount] = var24.field1394;
						} else {
							this.facePriority[this.faceCount] = var24.facePriority[var38];
						}
					}
					if (var8 && var24.faceTrans != null) {
						this.faceTrans[this.faceCount] = var24.faceTrans[var38];
					}
					if (var10) {
						if (var24.faceMaterial == null) {
							this.faceMaterial[this.faceCount] = -1;
						} else {
							this.faceMaterial[this.faceCount] = var24.faceMaterial[var38];
						}
					}
					if (var11) {
						if (var24.faceLabel == null) {
							this.faceLabel[this.faceCount] = -1;
						} else {
							this.faceLabel[this.faceCount] = var24.faceLabel[var38];
						}
					}
					if (var24.field1381 > 0) {
						this.faceTextureVertexOffset1[this.faceCount] = (byte) (var17[var24.faceVertex1[var38]] + var24.faceTextureVertexOffset1[var38]);
						this.faceTextureVertexOffset2[this.faceCount] = (byte) (var17[var24.faceVertex2[var38]] + var24.faceTextureVertexOffset2[var38]);
						this.faceTextureVertexOffset3[this.faceCount] = (byte) (var17[var24.faceVertex3[var38]] + var24.faceTextureVertexOffset3[var38]);
					}
					this.faceVertex1[this.faceCount] = (short) var16[var24.faceVertex1[var38]];
					this.faceVertex2[this.faceCount] = (short) var16[var24.faceVertex2[var38]];
					this.faceVertex3[this.faceCount] = (short) var16[var24.faceVertex3[var38]];
					this.field1399[this.faceCount] = var23;
					this.faceColour[this.faceCount] = var24.faceColour[var38];
					this.faceCount++;
				}
				if (var24.emitters != null) {
					for (int var39 = 0; var39 < var24.emitters.length; var39++) {
						int var40 = var16[var24.emitters[var39].field1476];
						int var41 = var16[var24.emitters[var39].field1467];
						int var42 = var16[var24.emitters[var39].field1468];
						this.emitters[var19] = var24.emitters[var39].method2080(var24.emitters[var39].field1463 + var25, var40, var41, var42);
						var19++;
					}
				}
				if (var24.effectors != null) {
					for (int var43 = 0; var43 < var24.effectors.length; var43++) {
						int var44 = var16[var24.effectors[var43].field1225];
						this.effectors[var20] = var24.effectors[var43].method1508(var44);
						var20++;
					}
				}
			}
		}
		this.field1374 = this.vertexCount;
		if (this.field1381 > 0) {
			Algorithms.method14525(var15, this.textureVertexU, this.textureVertexV);
			int var45 = 0;
			int var46 = 0;
			while (var45 < this.vertexCount) {
				this.vertexTextureVertex[var45] = var46;
				var46 += var14[var45];
				var45++;
			}
		}
		int var47 = 0;
		int var48 = 0;
		while (var47 < arg1) {
			short var49 = (short) (0x1 << var47);
			ModelUnlit var50 = arg0[var47];
			if (var50 != null) {
				if (var9) {
					int var51 = 0;
					while (var51 < var50.faceCount) {
						this.faceMapping[var48] = var50.faceMapping == null ? -1 : var50.faceMapping[var51];
						if (this.faceMapping[var48] > -1 && this.faceMapping[var48] < 32766) {
							this.faceMapping[var48] = (short) (this.faceMapping[var48] + this.field1387);
						}
						var51++;
						var48++;
					}
				}
				for (int var52 = 0; var52 < var50.field1387; var52++) {
					byte var53 = this.textureTriangleType[this.field1387] = var50.textureTriangleType[var52];
					if (var53 == 0) {
						this.textureTriangleVertex1[this.field1387] = (short) this.method1933(var50, var50.textureTriangleVertex1[var52], var49);
						this.textureTriangleVertex2[this.field1387] = (short) this.method1933(var50, var50.textureTriangleVertex2[var52], var49);
						this.textureTriangleVertex3[this.field1387] = (short) this.method1933(var50, var50.textureTriangleVertex3[var52], var49);
					} else if (var53 >= 1 && var53 <= 3) {
						this.textureTriangleVertex1[this.field1387] = var50.textureTriangleVertex1[var52];
						this.textureTriangleVertex2[this.field1387] = var50.textureTriangleVertex2[var52];
						this.textureTriangleVertex3[this.field1387] = var50.textureTriangleVertex3[var52];
						this.textureTriangleScaleX[this.field1387] = var50.textureTriangleScaleX[var52];
						this.textureTriangleScaleY[this.field1387] = var50.textureTriangleScaleY[var52];
						this.textureTriangleScaleZ[this.field1387] = var50.textureTriangleScaleZ[var52];
						this.field1402[this.field1387] = var50.field1402[var52];
						this.textureTriangleDirection[this.field1387] = var50.textureTriangleDirection[var52];
						this.textureTriangleSpeed[this.field1387] = var50.textureTriangleSpeed[var52];
					} else if (var53 == 2) {
						this.textureTriangleTranslationU[this.field1387] = var50.textureTriangleTranslationU[var52];
						this.textureTriangleTranslationV[this.field1387] = var50.textureTriangleTranslationV[var52];
					}
					this.field1387++;
				}
			}
			var47++;
		}
	}

	@ObfuscatedName("dq.n(Ldq;IS)I")
	public final int method1933(ModelUnlit arg0, int arg1, short arg2) {
		int var4 = arg0.vertexX[arg1];
		int var5 = arg0.vertexY[arg1];
		int var6 = arg0.vertexZ[arg1];
		for (int var7 = 0; var7 < this.vertexCount; var7++) {
			if (this.vertexX[var7] == var4 && this.vertexY[var7] == var5 && this.vertexZ[var7] == var6) {
				this.vertexSourceModels[var7] |= arg2;
				return var7;
			}
		}
		this.vertexX[this.vertexCount] = var4;
		this.vertexY[this.vertexCount] = var5;
		this.vertexZ[this.vertexCount] = var6;
		this.vertexSourceModels[this.vertexCount] = arg2;
		this.vertexLabel[this.vertexCount] = arg0.vertexLabel == null ? -1 : arg0.vertexLabel[arg1];
		return this.vertexCount++;
	}

	@ObfuscatedName("dq.m(Lalw;Lalw;Lalw;)V")
	public void method1949(Packet arg0, Packet arg1, Packet arg2) {
		short var4 = 0;
		short var5 = 0;
		short var6 = 0;
		short var7 = 0;
		for (int var8 = 0; var8 < this.faceCount; var8++) {
			int var9 = arg1.g1();
			int var10 = var9 & 0x7;
			if (var10 == 1) {
				this.faceVertex1[var8] = var4 = (short) (arg0.gSmart1or2s() + var7);
				this.faceVertex2[var8] = var5 = (short) (arg0.gSmart1or2s() + var4);
				this.faceVertex3[var8] = var6 = (short) (arg0.gSmart1or2s() + var5);
				var7 = var6;
				if (var4 > this.field1374) {
					this.field1374 = var4;
				}
				if (var5 > this.field1374) {
					this.field1374 = var5;
				}
				if (var6 > this.field1374) {
					this.field1374 = var6;
				}
			}
			if (var10 == 2) {
				var5 = var6;
				var6 = (short) (arg0.gSmart1or2s() + var7);
				var7 = var6;
				this.faceVertex1[var8] = var4;
				this.faceVertex2[var8] = var5;
				this.faceVertex3[var8] = var6;
				if (var6 > this.field1374) {
					this.field1374 = var6;
				}
			}
			if (var10 == 3) {
				var4 = var6;
				var6 = (short) (arg0.gSmart1or2s() + var7);
				var7 = var6;
				this.faceVertex1[var8] = var4;
				this.faceVertex2[var8] = var5;
				this.faceVertex3[var8] = var6;
				if (var6 > this.field1374) {
					this.field1374 = var6;
				}
			}
			if (var10 == 4) {
				short var13 = var4;
				var4 = var5;
				var5 = var13;
				var6 = (short) (arg0.gSmart1or2s() + var7);
				var7 = var6;
				this.faceVertex1[var8] = var4;
				this.faceVertex2[var8] = var13;
				this.faceVertex3[var8] = var6;
				if (var6 > this.field1374) {
					this.field1374 = var6;
				}
			}
			if (this.field1381 > 0 && (var9 & 0x8) != 0) {
				this.faceTextureVertexOffset1[var8] = (byte) arg2.g1();
				this.faceTextureVertexOffset2[var8] = (byte) arg2.g1();
				this.faceTextureVertexOffset3[var8] = (byte) arg2.g1();
			}
		}
		this.field1374++;
	}

	@ObfuscatedName("dq.k(Lalw;Lalw;Lalw;Lalw;Lalw;Lalw;)V")
	public void method1939(Packet arg0, Packet arg1, Packet arg2, Packet arg3, Packet arg4, Packet arg5) {
		for (int var7 = 0; var7 < this.field1387; var7++) {
			int var8 = this.textureTriangleType[var7] & 0xFF;
			if (var8 == 0) {
				this.textureTriangleVertex1[var7] = (short) arg0.g2();
				this.textureTriangleVertex2[var7] = (short) arg0.g2();
				this.textureTriangleVertex3[var7] = (short) arg0.g2();
			}
			if (var8 == 1) {
				this.textureTriangleVertex1[var7] = (short) arg1.g2();
				this.textureTriangleVertex2[var7] = (short) arg1.g2();
				this.textureTriangleVertex3[var7] = (short) arg1.g2();
				if (this.version < 15) {
					this.textureTriangleScaleX[var7] = arg2.g2();
					if (this.version < 14) {
						this.textureTriangleScaleY[var7] = arg2.g2();
					} else {
						this.textureTriangleScaleY[var7] = arg2.g3();
					}
					this.textureTriangleScaleZ[var7] = arg2.g2();
				} else {
					this.textureTriangleScaleX[var7] = arg2.g3();
					this.textureTriangleScaleY[var7] = arg2.g3();
					this.textureTriangleScaleZ[var7] = arg2.g3();
				}
				this.field1402[var7] = arg3.g1b();
				this.textureTriangleDirection[var7] = arg4.g1b();
				this.textureTriangleSpeed[var7] = arg5.g1b();
			}
			if (var8 == 2) {
				this.textureTriangleVertex1[var7] = (short) arg1.g2();
				this.textureTriangleVertex2[var7] = (short) arg1.g2();
				this.textureTriangleVertex3[var7] = (short) arg1.g2();
				if (this.version < 15) {
					this.textureTriangleScaleX[var7] = arg2.g2();
					if (this.version < 14) {
						this.textureTriangleScaleY[var7] = arg2.g2();
					} else {
						this.textureTriangleScaleY[var7] = arg2.g3();
					}
					this.textureTriangleScaleZ[var7] = arg2.g2();
				} else {
					this.textureTriangleScaleX[var7] = arg2.g3();
					this.textureTriangleScaleY[var7] = arg2.g3();
					this.textureTriangleScaleZ[var7] = arg2.g3();
				}
				this.field1402[var7] = arg3.g1b();
				this.textureTriangleDirection[var7] = arg4.g1b();
				this.textureTriangleSpeed[var7] = arg5.g1b();
				this.textureTriangleTranslationU[var7] = arg5.g1b();
				this.textureTriangleTranslationV[var7] = arg5.g1b();
			}
			if (var8 == 3) {
				this.textureTriangleVertex1[var7] = (short) arg1.g2();
				this.textureTriangleVertex2[var7] = (short) arg1.g2();
				this.textureTriangleVertex3[var7] = (short) arg1.g2();
				if (this.version < 15) {
					this.textureTriangleScaleX[var7] = arg2.g2();
					if (this.version < 14) {
						this.textureTriangleScaleY[var7] = arg2.g2();
					} else {
						this.textureTriangleScaleY[var7] = arg2.g3();
					}
					this.textureTriangleScaleZ[var7] = arg2.g2();
				} else {
					this.textureTriangleScaleX[var7] = arg2.g3();
					this.textureTriangleScaleY[var7] = arg2.g3();
					this.textureTriangleScaleZ[var7] = arg2.g3();
				}
				this.field1402[var7] = arg3.g1b();
				this.textureTriangleDirection[var7] = arg4.g1b();
				this.textureTriangleSpeed[var7] = arg5.g1b();
			}
		}
	}

	@ObfuscatedName("dq.f(III)I")
	public int method1936(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.vertexCount; var4++) {
			if (this.vertexX[var4] == arg0 && this.vertexY[var4] == arg1 && this.vertexZ[var4] == arg2) {
				return var4;
			}
		}
		this.vertexX[this.vertexCount] = arg0;
		this.vertexY[this.vertexCount] = arg1;
		this.vertexZ[this.vertexCount] = arg2;
		this.field1374 = this.vertexCount + 1;
		return this.vertexCount++;
	}

	@ObfuscatedName("dq.w(IIIBBSBS)I")
	public int method1966(int arg0, int arg1, int arg2, byte arg3, byte arg4, short arg5, byte arg6, short arg7) {
		this.faceVertex1[this.faceCount] = (short) arg0;
		this.faceVertex2[this.faceCount] = (short) arg1;
		this.faceVertex3[this.faceCount] = (short) arg2;
		this.faceType[this.faceCount] = arg3;
		this.faceMapping[this.faceCount] = arg4;
		this.faceColour[this.faceCount] = arg5;
		this.faceTrans[this.faceCount] = arg6;
		this.faceMaterial[this.faceCount] = arg7;
		return this.faceCount++;
	}

	@ObfuscatedName("dq.l(SSS)B")
	public byte method1938(short arg0, short arg1, short arg2) {
		if (this.field1387 >= 255) {
			throw new IllegalStateException();
		}
		this.textureTriangleType[this.field1387] = 0;
		this.textureTriangleVertex1[this.field1387] = arg0;
		this.textureTriangleVertex2[this.field1387] = arg1;
		this.textureTriangleVertex3[this.field1387] = arg2;
		return (byte) this.field1387++;
	}

	@ObfuscatedName("dq.u(SSSSSSBBB)B")
	public byte method1935(short arg0, short arg1, short arg2, short arg3, short arg4, short arg5, byte arg6, byte arg7, byte arg8) {
		if (this.field1387 >= 255) {
			throw new IllegalStateException();
		}
		this.textureTriangleType[this.field1387] = 3;
		this.textureTriangleVertex1[this.field1387] = arg0;
		this.textureTriangleVertex2[this.field1387] = arg1;
		this.textureTriangleVertex3[this.field1387] = arg2;
		this.textureTriangleScaleX[this.field1387] = arg3;
		this.textureTriangleScaleY[this.field1387] = arg4;
		this.textureTriangleScaleZ[this.field1387] = arg5;
		this.field1402[this.field1387] = arg6;
		this.textureTriangleDirection[this.field1387] = arg7;
		this.textureTriangleSpeed[this.field1387] = arg8;
		return (byte) this.field1387++;
	}

	@ObfuscatedName("dq.z(Z)[[I")
	public int[][] method1940(boolean arg0) {
		int[] var2 = new int[800];
		int var3 = 0;
		int var4 = arg0 ? this.vertexCount : this.field1374;
		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = this.vertexLabel[var5];
			if (var6 >= 0) {
				int var10002 = var2[var6]++;
				if (var6 > var3) {
					var3 = var6;
				}
			}
		}
		int[][] var7 = new int[var3 + 1][];
		for (int var8 = 0; var8 <= var3; var8++) {
			var7[var8] = new int[var2[var8]];
			var2[var8] = 0;
		}
		for (int var9 = 0; var9 < var4; var9++) {
			int var10 = this.vertexLabel[var9];
			if (var10 >= 0) {
				var7[var10][var2[var10]++] = var9;
			}
		}
		return var7;
	}

	@ObfuscatedName("dq.p()[[I")
	public int[][] method1941() {
		int[] var1 = new int[256];
		int var2 = 0;
		for (int var3 = 0; var3 < this.faceCount; var3++) {
			int var4 = this.faceLabel[var3];
			if (var4 >= 0) {
				int var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
		}
		int[][] var5 = new int[var2 + 1][];
		for (int var6 = 0; var6 <= var2; var6++) {
			var5[var6] = new int[var1[var6]];
			var1[var6] = 0;
		}
		for (int var7 = 0; var7 < this.faceCount; var7++) {
			int var8 = this.faceLabel[var7];
			if (var8 >= 0) {
				var5[var8][var1[var8]++] = var7;
			}
		}
		return var5;
	}

	@ObfuscatedName("dq.d()[[I")
	public int[][] method1963() {
		int[] var1 = new int[256];
		int var2 = 0;
		for (int var3 = 0; var3 < this.billboard.length; var3++) {
			int var4 = this.billboard[var3].field1655;
			if (var4 >= 0) {
				int var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
		}
		int[][] var5 = new int[var2 + 1][];
		for (int var6 = 0; var6 <= var2; var6++) {
			var5[var6] = new int[var1[var6]];
			var1[var6] = 0;
		}
		for (int var7 = 0; var7 < this.billboard.length; var7++) {
			int var8 = this.billboard[var7].field1655;
			if (var8 >= 0) {
				var5[var8][var1[var8]++] = var7;
			}
		}
		return var5;
	}

	@ObfuscatedName("dq.c(SS)V")
	public void method1943(short arg0, short arg1) {
		for (int var3 = 0; var3 < this.faceCount; var3++) {
			if (this.faceColour[var3] == arg0) {
				this.faceColour[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("dq.r(SS)V")
	public void method1937(short arg0, short arg1) {
		if (this.faceMaterial == null) {
			return;
		}
		for (int var3 = 0; var3 < this.faceCount; var3++) {
			if (this.faceMaterial[var3] == arg0) {
				this.faceMaterial[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("dq.v(III)V")
	public void method1945(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.vertexCount; var4++) {
			this.vertexX[var4] += arg0;
			this.vertexY[var4] += arg1;
			this.vertexZ[var4] += arg2;
		}
	}

	@ObfuscatedName("dq.o(III)V")
	public void method1946(int arg0, int arg1, int arg2) {
		if (arg2 != 0) {
			int var4 = Trig1.sin[arg2];
			int var5 = Trig1.cos[arg2];
			for (int var6 = 0; var6 < this.vertexCount; var6++) {
				int var7 = this.vertexY[var6] * var4 + this.vertexX[var6] * var5 >> 14;
				this.vertexY[var6] = this.vertexY[var6] * var5 - this.vertexX[var6] * var4 >> 14;
				this.vertexX[var6] = var7;
			}
		}
		if (arg0 != 0) {
			int var8 = Trig1.sin[arg0];
			int var9 = Trig1.cos[arg0];
			for (int var10 = 0; var10 < this.vertexCount; var10++) {
				int var11 = this.vertexY[var10] * var9 - this.vertexZ[var10] * var8 >> 14;
				this.vertexZ[var10] = this.vertexZ[var10] * var9 + this.vertexY[var10] * var8 >> 14;
				this.vertexY[var10] = var11;
			}
		}
		if (arg1 == 0) {
			return;
		}
		int var12 = Trig1.sin[arg1];
		int var13 = Trig1.cos[arg1];
		for (int var14 = 0; var14 < this.vertexCount; var14++) {
			int var15 = this.vertexZ[var14] * var12 + this.vertexX[var14] * var13 >> 14;
			this.vertexZ[var14] = this.vertexZ[var14] * var13 - this.vertexX[var14] * var12 >> 14;
			this.vertexX[var14] = var15;
		}
	}

	@ObfuscatedName("dq.s(I)V")
	public void scaleByPowerOfTwo(int arg0) {
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			this.vertexX[var2] <<= arg0;
			this.vertexY[var2] <<= arg0;
			this.vertexZ[var2] <<= arg0;
		}
		if (this.field1387 <= 0 || this.textureTriangleScaleX == null) {
			return;
		}
		for (int var3 = 0; var3 < this.textureTriangleScaleX.length; var3++) {
			this.textureTriangleScaleX[var3] <<= arg0;
			this.textureTriangleScaleY[var3] <<= arg0;
			if (this.textureTriangleType[var3] != 1) {
				this.textureTriangleScaleZ[var3] <<= arg0;
			}
		}
	}

	@ObfuscatedName("dq.y(F)V")
	public void method1948(float arg0) {
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			this.vertexX[var2] = (int) ((float) this.vertexX[var2] * arg0);
			this.vertexY[var2] = (int) ((float) this.vertexY[var2] * arg0);
			this.vertexZ[var2] = (int) ((float) this.vertexZ[var2] * arg0);
		}
		if (this.field1387 <= 0 || this.textureTriangleScaleX == null) {
			return;
		}
		for (int var3 = 0; var3 < this.textureTriangleScaleX.length; var3++) {
			this.textureTriangleScaleX[var3] = (int) ((float) this.textureTriangleScaleX[var3] * arg0);
			this.textureTriangleScaleY[var3] = (int) ((float) this.textureTriangleScaleY[var3] * arg0);
			if (this.textureTriangleType[var3] != 1) {
				this.textureTriangleScaleZ[var3] = (int) ((float) this.textureTriangleScaleZ[var3] * arg0);
			}
		}
	}
}

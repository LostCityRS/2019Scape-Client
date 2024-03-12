package com.jagex.graphics;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.Algorithms;
import com.jagex.js5.Js5;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

@ObfuscatedName("dq")
public class ModelUnlit {

	@ObfuscatedName("dq.k")
	public int field1372 = 12;

	@ObfuscatedName("dq.f")
	public int field1373 = 0;

	@ObfuscatedName("dq.w")
	public int field1374 = 0;

	@ObfuscatedName("dq.l")
	public int[] field1375;

	@ObfuscatedName("dq.u")
	public float[] field1383;

	@ObfuscatedName("dq.z")
	public int[] field1382;

	@ObfuscatedName("dq.p")
	public int[] field1411;

	@ObfuscatedName("dq.d")
	public int[] field1380;

	@ObfuscatedName("dq.c")
	public int[] field1379;

	@ObfuscatedName("dq.r")
	public short[] field1417;

	@ObfuscatedName("dq.v")
	public int field1384 = 0;

	@ObfuscatedName("dq.o")
	public int field1381;

	@ObfuscatedName("dq.s")
	public float[] field1385;

	@ObfuscatedName("dq.y")
	public short[] field1415;

	@ObfuscatedName("dq.q")
	public short[] field1386;

	@ObfuscatedName("dq.x")
	public short[] field1400;

	@ObfuscatedName("dq.b")
	public byte[] field1388;

	@ObfuscatedName("dq.h")
	public byte[] field1389;

	@ObfuscatedName("dq.a")
	public byte[] field1390;

	@ObfuscatedName("dq.g")
	public byte[] field1391;

	@ObfuscatedName("dq.i")
	public byte[] field1392;

	@ObfuscatedName("dq.j")
	public byte[] field1393;

	@ObfuscatedName("dq.t")
	public short[] field1413;

	@ObfuscatedName("dq.ae")
	public short[] field1395;

	@ObfuscatedName("dq.ag")
	public short[] field1396;

	@ObfuscatedName("dq.ah")
	public int[] field1397;

	@ObfuscatedName("dq.al")
	public byte field1394 = 0;

	@ObfuscatedName("dq.ac")
	public short[] field1399;

	@ObfuscatedName("dq.as")
	public int field1387 = 0;

	@ObfuscatedName("dq.at")
	public byte[] field1377;

	@ObfuscatedName("dq.ad")
	public short[] field1404;

	@ObfuscatedName("dq.am")
	public short[] field1405;

	@ObfuscatedName("dq.au")
	public short[] field1406;

	@ObfuscatedName("dq.ar")
	public int[] field1407;

	@ObfuscatedName("dq.ap")
	public int[] field1408;

	@ObfuscatedName("dq.aq")
	public int[] field1409;

	@ObfuscatedName("dq.ax")
	public int[] field1410;

	@ObfuscatedName("dq.av")
	public int[] field1398;

	@ObfuscatedName("dq.ao")
	public int[] field1369;

	@ObfuscatedName("dq.aj")
	public byte[] field1402;

	@ObfuscatedName("dq.ay")
	public byte[] field1414;

	@ObfuscatedName("dq.ab")
	public ModelParticleEmitter[] field1403;

	@ObfuscatedName("dq.az")
	public ModelParticleEffector[] field1416;

	@ObfuscatedName("dq.aa")
	public ModelBillboard[] field1412;

	@ObfuscatedName("dq.e(Lpy;II)Ldq;")
	public static ModelUnlit method1931(Js5 arg0, int arg1, int arg2) {
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
			this.field1372 = var2.g1();
			var2.pos = (arg0.length - 26);
			this.field1373 = var2.g2();
			this.field1384 = var2.g2();
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
					var28 = this.field1373;
				} else {
					var28 = 0;
				}
			}
			if (!var15) {
				if (var20 == 1) {
					var29 = this.field1384;
				} else {
					var29 = 0;
				}
			}
			int var30 = 0;
			int var31 = 0;
			int var32 = 0;
			if (this.field1387 > 0) {
				this.field1377 = new byte[this.field1387];
				var2.pos = 3;
				for (int var33 = 0; var33 < this.field1387; var33++) {
					byte var34 = this.field1377[var33] = var2.g1b();
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
			int var37 = this.field1373 + var35;
			int var38 = var37;
			if (var11) {
				var37 += this.field1384;
			}
			int var40 = this.field1384 + var37;
			int var41 = var40;
			if (var18 == 255) {
				var40 += this.field1384;
			}
			int var43 = var29 + var40;
			int var45 = var28 + var43;
			int var46 = var45;
			if (var19 == 1) {
				var45 += this.field1384;
			}
			int var48 = var26 + var45;
			int var49 = var48;
			if (var21 == 1) {
				var48 += this.field1384 * 2;
			}
			int var51 = var27 + var48;
			int var53 = this.field1384 * 2 + var51;
			int var55 = var23 + var53;
			int var57 = var24 + var55;
			int var59 = var25 + var57;
			int var61 = var30 * 6 + var59;
			int var63 = var31 * 6 + var61;
			byte var64 = 6;
			if (this.field1372 == 14) {
				var64 = 7;
			} else if (this.field1372 >= 15) {
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
				var76 = this.field1373 + var75;
				var77 = this.field1381 * 2 + var76;
			}
			this.field1375 = new int[this.field1373];
			this.field1382 = new int[this.field1373];
			this.field1411 = new int[this.field1373];
			this.field1415 = new short[this.field1384];
			this.field1386 = new short[this.field1384];
			this.field1400 = new short[this.field1384];
			if (var22 == 1) {
				this.field1379 = new int[this.field1373];
			}
			if (var11) {
				this.field1391 = new byte[this.field1384];
			}
			if (var18 == 255) {
				this.field1392 = new byte[this.field1384];
			} else {
				this.field1394 = (byte) var18;
			}
			if (var19 == 1) {
				this.field1393 = new byte[this.field1384];
			}
			if (var20 == 1) {
				this.field1397 = new int[this.field1384];
			}
			if (var21 == 1) {
				this.field1396 = new short[this.field1384];
			}
			if (var21 == 1 && (this.field1387 > 0 || this.field1381 > 0)) {
				this.field1413 = new short[this.field1384];
			}
			this.field1395 = new short[this.field1384];
			if (this.field1387 > 0) {
				this.field1404 = new short[this.field1387];
				this.field1405 = new short[this.field1387];
				this.field1406 = new short[this.field1387];
				if (var31 > 0) {
					this.field1407 = new int[var31];
					this.field1408 = new int[var31];
					this.field1409 = new int[var31];
					this.field1402 = new byte[var31];
					this.field1414 = new byte[var31];
					this.field1410 = new int[var31];
				}
				if (var32 > 0) {
					this.field1398 = new int[var32];
					this.field1369 = new int[var32];
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
			for (int var84 = 0; var84 < this.field1373; var84++) {
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
				this.field1375[var84] = var81 + var86;
				this.field1382[var84] = var82 + var87;
				this.field1411[var84] = var83 + var88;
				var81 = this.field1375[var84];
				var82 = this.field1382[var84];
				var83 = this.field1411[var84];
				if (var22 == 1) {
					if (var14) {
						this.field1379[var84] = var6.gSmart1or2null();
					} else {
						this.field1379[var84] = var6.g1();
						if (this.field1379[var84] == 255) {
							this.field1379[var84] = -1;
						}
					}
				}
			}
			if (this.field1381 > 0) {
				var2.pos = var75;
				var3.pos = var76;
				var4.pos = var77;
				this.field1380 = new int[this.field1373];
				int var89 = 0;
				int var90 = 0;
				while (var89 < this.field1373) {
					this.field1380[var89] = var90;
					var90 += var2.g1();
					var89++;
				}
				this.field1388 = new byte[this.field1384];
				this.field1389 = new byte[this.field1384];
				this.field1390 = new byte[this.field1384];
				this.field1385 = new float[this.field1381];
				this.field1383 = new float[this.field1381];
				for (int var91 = 0; var91 < this.field1381; var91++) {
					this.field1385[var91] = (float) var3.g2s() / 4096.0F;
					this.field1383[var91] = (float) var4.g2s() / 4096.0F;
				}
			}
			var2.pos = var51;
			var3.pos = var38;
			var4.pos = var41;
			var5.pos = var46;
			var6.pos = var40;
			var7.pos = var49;
			var8.pos = var48;
			for (int var92 = 0; var92 < this.field1384; var92++) {
				this.field1395[var92] = (short) var2.g2();
				if (var11) {
					this.field1391[var92] = var3.g1b();
				}
				if (var18 == 255) {
					this.field1392[var92] = var4.g1b();
				}
				if (var19 == 1) {
					this.field1393[var92] = var5.g1b();
				}
				if (var20 == 1) {
					if (var15) {
						this.field1397[var92] = var6.gSmart1or2null();
					} else {
						this.field1397[var92] = var6.g1();
						if (this.field1397[var92] == 255) {
							this.field1397[var92] = -1;
						}
					}
				}
				if (var21 == 1) {
					this.field1396[var92] = (short) (var7.g2() - 1);
				}
				if (this.field1413 != null) {
					if (this.field1396[var92] == -1) {
						this.field1413[var92] = -1;
					} else if (this.field1372 >= 16) {
						this.field1413[var92] = (short) (var8.gSmart1or2() - 1);
					} else {
						this.field1413[var92] = (short) (var8.g1() - 1);
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
					this.field1403 = new ModelParticleEmitter[var93];
					for (int var94 = 0; var94 < var93; var94++) {
						int var95 = var2.g2();
						int var96 = var2.g2();
						byte var97;
						if (var18 == 255) {
							var97 = this.field1392[var96];
						} else {
							var97 = (byte) var18;
						}
						this.field1403[var94] = new ModelParticleEmitter(var95, var96, this.field1415[var96], this.field1386[var96], this.field1400[var96], var97);
					}
				}
				int var98 = var2.g1();
				if (var98 > 0) {
					this.field1416 = new ModelParticleEffector[var98];
					for (int var99 = 0; var99 < var98; var99++) {
						int var100 = var2.g2();
						int var101 = var2.g2();
						this.field1416[var99] = new ModelParticleEffector(var100, var101);
					}
				}
			}
			if (var13) {
				int var102 = var2.g1();
				if (var102 > 0) {
					this.field1412 = new ModelBillboard[var102];
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
						this.field1412[var103] = new ModelBillboard(var104, var105, var106, var107);
					}
				}
			}
		} else {
			System.out.println("" + var9);
		}
	}

	public ModelUnlit(int arg0, int arg1, int arg2) {
		this.field1375 = new int[arg0];
		this.field1382 = new int[arg0];
		this.field1411 = new int[arg0];
		this.field1379 = new int[arg0];
		this.field1415 = new short[arg1];
		this.field1386 = new short[arg1];
		this.field1400 = new short[arg1];
		this.field1391 = new byte[arg1];
		this.field1392 = new byte[arg1];
		this.field1393 = new byte[arg1];
		this.field1413 = new short[arg1];
		this.field1395 = new short[arg1];
		this.field1396 = new short[arg1];
		this.field1397 = new int[arg1];
		if (arg2 > 0) {
			this.field1377 = new byte[arg2];
			this.field1404 = new short[arg2];
			this.field1405 = new short[arg2];
			this.field1406 = new short[arg2];
			this.field1407 = new int[arg2];
			this.field1408 = new int[arg2];
			this.field1409 = new int[arg2];
			this.field1402 = new byte[arg2];
			this.field1414 = new byte[arg2];
			this.field1410 = new int[arg2];
			this.field1398 = new int[arg2];
			this.field1369 = new int[arg2];
		}
	}

	public ModelUnlit(ModelUnlit[] arg0, int arg1) {
		this.field1373 = 0;
		this.field1384 = 0;
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
				this.field1373 += var13.field1373;
				this.field1384 += var13.field1384;
				this.field1387 += var13.field1387;
				this.field1381 += var13.field1381;
				if (var13.field1403 != null) {
					var3 += var13.field1403.length;
				}
				if (var13.field1416 != null) {
					var4 += var13.field1416.length;
				}
				if (var13.field1412 != null) {
					var5 += var13.field1412.length;
				}
				var6 |= var13.field1391 != null;
				if (var13.field1392 == null) {
					if (this.field1394 == -1) {
						this.field1394 = var13.field1394;
					}
					if (this.field1394 != var13.field1394) {
						var7 = true;
					}
				} else {
					var7 = true;
				}
				var8 |= var13.field1393 != null;
				var9 |= var13.field1413 != null;
				var10 |= var13.field1396 != null;
				var11 |= var13.field1397 != null;
			}
		}
		this.field1375 = new int[this.field1373];
		this.field1382 = new int[this.field1373];
		this.field1411 = new int[this.field1373];
		this.field1379 = new int[this.field1373];
		this.field1417 = new short[this.field1373];
		this.field1415 = new short[this.field1384];
		this.field1386 = new short[this.field1384];
		this.field1400 = new short[this.field1384];
		if (var6) {
			this.field1391 = new byte[this.field1384];
		}
		if (var7) {
			this.field1392 = new byte[this.field1384];
		}
		if (var8) {
			this.field1393 = new byte[this.field1384];
		}
		if (var9) {
			this.field1413 = new short[this.field1384];
		}
		this.field1395 = new short[this.field1384];
		if (var10) {
			this.field1396 = new short[this.field1384];
		}
		if (var11) {
			this.field1397 = new int[this.field1384];
		}
		this.field1399 = new short[this.field1384];
		if (this.field1387 > 0) {
			this.field1377 = new byte[this.field1387];
			this.field1404 = new short[this.field1387];
			this.field1405 = new short[this.field1387];
			this.field1406 = new short[this.field1387];
			this.field1407 = new int[this.field1387];
			this.field1408 = new int[this.field1387];
			this.field1409 = new int[this.field1387];
			this.field1402 = new byte[this.field1387];
			this.field1414 = new byte[this.field1387];
			this.field1410 = new int[this.field1387];
			this.field1398 = new int[this.field1387];
			this.field1369 = new int[this.field1387];
		}
		if (var5 > 0) {
			this.field1412 = new ModelBillboard[var5];
		}
		if (var3 > 0) {
			this.field1403 = new ModelParticleEmitter[var3];
		}
		if (var4 > 0) {
			this.field1416 = new ModelParticleEffector[var4];
		}
		if (this.field1381 > 0) {
			this.field1385 = new float[this.field1381];
			this.field1383 = new float[this.field1381];
			this.field1380 = new int[this.field1373];
			this.field1388 = new byte[this.field1384];
			this.field1389 = new byte[this.field1384];
			this.field1390 = new byte[this.field1384];
		}
		int[] var14 = new int[this.field1373];
		int[] var15 = new int[this.field1381];
		int[] var16 = new int[this.field1373];
		int[] var17 = new int[this.field1373];
		int[] var18 = new int[3];
		this.field1373 = 0;
		this.field1384 = 0;
		this.field1387 = 0;
		this.field1381 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		for (int var22 = 0; var22 < arg1; var22++) {
			short var23 = (short) (0x1 << var22);
			ModelUnlit var24 = arg0[var22];
			int var25 = this.field1384;
			if (var24 != null) {
				boolean[] var26 = new boolean[var24.field1373];
				if (var24.field1412 != null) {
					for (int var27 = 0; var27 < var24.field1412.length; var27++) {
						ModelBillboard var28 = var24.field1412[var27];
						this.field1412[var21++] = var28.method2659(var28.field1654 + this.field1384);
					}
				}
				for (int var29 = 0; var29 < var24.field1384; var29++) {
					var18[0] = var24.field1415[var29];
					var18[1] = var24.field1386[var29];
					var18[2] = var24.field1400[var29];
					for (int var30 = 0; var30 < 3; var30++) {
						int var31 = var18[var30];
						int var32 = var24.field1375[var31];
						int var33 = var24.field1382[var31];
						int var34 = var24.field1411[var31];
						int var35;
						for (var35 = 0; var35 < this.field1373; var35++) {
							if (this.field1375[var35] == var32 && this.field1382[var35] == var33 && this.field1411[var35] == var34) {
								this.field1417[var35] |= var23;
								var16[var31] = var35;
								break;
							}
						}
						if (var24.field1381 > 0 && !var26[var31]) {
							int var36 = (var31 < var24.field1373 - 1 ? var24.field1380[var31 + 1] : var24.field1381) - var24.field1380[var31];
							for (int var37 = 0; var37 < var36; var37++) {
								this.field1385[this.field1381] = var24.field1385[var24.field1380[var31] + var37];
								this.field1383[this.field1381] = var24.field1383[var24.field1380[var31] + var37];
								var15[this.field1381] = var35 << 16 | var14[var35] + var37;
								this.field1381++;
							}
							var17[var31] = var14[var35];
							var14[var35] += var36;
							var26[var31] = true;
						}
						if (var35 >= this.field1373) {
							this.field1375[this.field1373] = var32;
							this.field1382[this.field1373] = var33;
							this.field1411[this.field1373] = var34;
							this.field1417[this.field1373] = var23;
							this.field1379[this.field1373] = var24.field1379 == null ? -1 : var24.field1379[var31];
							var16[var31] = this.field1373++;
						}
					}
				}
				for (int var38 = 0; var38 < var24.field1384; var38++) {
					if (var6 && var24.field1391 != null) {
						this.field1391[this.field1384] = var24.field1391[var38];
					}
					if (var7) {
						if (var24.field1392 == null) {
							this.field1392[this.field1384] = var24.field1394;
						} else {
							this.field1392[this.field1384] = var24.field1392[var38];
						}
					}
					if (var8 && var24.field1393 != null) {
						this.field1393[this.field1384] = var24.field1393[var38];
					}
					if (var10) {
						if (var24.field1396 == null) {
							this.field1396[this.field1384] = -1;
						} else {
							this.field1396[this.field1384] = var24.field1396[var38];
						}
					}
					if (var11) {
						if (var24.field1397 == null) {
							this.field1397[this.field1384] = -1;
						} else {
							this.field1397[this.field1384] = var24.field1397[var38];
						}
					}
					if (var24.field1381 > 0) {
						this.field1388[this.field1384] = (byte) (var17[var24.field1415[var38]] + var24.field1388[var38]);
						this.field1389[this.field1384] = (byte) (var17[var24.field1386[var38]] + var24.field1389[var38]);
						this.field1390[this.field1384] = (byte) (var17[var24.field1400[var38]] + var24.field1390[var38]);
					}
					this.field1415[this.field1384] = (short) var16[var24.field1415[var38]];
					this.field1386[this.field1384] = (short) var16[var24.field1386[var38]];
					this.field1400[this.field1384] = (short) var16[var24.field1400[var38]];
					this.field1399[this.field1384] = var23;
					this.field1395[this.field1384] = var24.field1395[var38];
					this.field1384++;
				}
				if (var24.field1403 != null) {
					for (int var39 = 0; var39 < var24.field1403.length; var39++) {
						int var40 = var16[var24.field1403[var39].field1476];
						int var41 = var16[var24.field1403[var39].field1467];
						int var42 = var16[var24.field1403[var39].field1468];
						this.field1403[var19] = var24.field1403[var39].method2080(var24.field1403[var39].field1463 + var25, var40, var41, var42);
						var19++;
					}
				}
				if (var24.field1416 != null) {
					for (int var43 = 0; var43 < var24.field1416.length; var43++) {
						int var44 = var16[var24.field1416[var43].field1225];
						this.field1416[var20] = var24.field1416[var43].method1508(var44);
						var20++;
					}
				}
			}
		}
		this.field1374 = this.field1373;
		if (this.field1381 > 0) {
			Algorithms.method14525(var15, this.field1385, this.field1383);
			int var45 = 0;
			int var46 = 0;
			while (var45 < this.field1373) {
				this.field1380[var45] = var46;
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
					while (var51 < var50.field1384) {
						this.field1413[var48] = var50.field1413 == null ? -1 : var50.field1413[var51];
						if (this.field1413[var48] > -1 && this.field1413[var48] < 32766) {
							this.field1413[var48] = (short) (this.field1413[var48] + this.field1387);
						}
						var51++;
						var48++;
					}
				}
				for (int var52 = 0; var52 < var50.field1387; var52++) {
					byte var53 = this.field1377[this.field1387] = var50.field1377[var52];
					if (var53 == 0) {
						this.field1404[this.field1387] = (short) this.method1933(var50, var50.field1404[var52], var49);
						this.field1405[this.field1387] = (short) this.method1933(var50, var50.field1405[var52], var49);
						this.field1406[this.field1387] = (short) this.method1933(var50, var50.field1406[var52], var49);
					} else if (var53 >= 1 && var53 <= 3) {
						this.field1404[this.field1387] = var50.field1404[var52];
						this.field1405[this.field1387] = var50.field1405[var52];
						this.field1406[this.field1387] = var50.field1406[var52];
						this.field1407[this.field1387] = var50.field1407[var52];
						this.field1408[this.field1387] = var50.field1408[var52];
						this.field1409[this.field1387] = var50.field1409[var52];
						this.field1402[this.field1387] = var50.field1402[var52];
						this.field1414[this.field1387] = var50.field1414[var52];
						this.field1410[this.field1387] = var50.field1410[var52];
					} else if (var53 == 2) {
						this.field1398[this.field1387] = var50.field1398[var52];
						this.field1369[this.field1387] = var50.field1369[var52];
					}
					this.field1387++;
				}
			}
			var47++;
		}
	}

	@ObfuscatedName("dq.n(Ldq;IS)I")
	public final int method1933(ModelUnlit arg0, int arg1, short arg2) {
		int var4 = arg0.field1375[arg1];
		int var5 = arg0.field1382[arg1];
		int var6 = arg0.field1411[arg1];
		for (int var7 = 0; var7 < this.field1373; var7++) {
			if (this.field1375[var7] == var4 && this.field1382[var7] == var5 && this.field1411[var7] == var6) {
				this.field1417[var7] |= arg2;
				return var7;
			}
		}
		this.field1375[this.field1373] = var4;
		this.field1382[this.field1373] = var5;
		this.field1411[this.field1373] = var6;
		this.field1417[this.field1373] = arg2;
		this.field1379[this.field1373] = arg0.field1379 == null ? -1 : arg0.field1379[arg1];
		return this.field1373++;
	}

	@ObfuscatedName("dq.m(Lalw;Lalw;Lalw;)V")
	public void method1949(Packet arg0, Packet arg1, Packet arg2) {
		short var4 = 0;
		short var5 = 0;
		short var6 = 0;
		short var7 = 0;
		for (int var8 = 0; var8 < this.field1384; var8++) {
			int var9 = arg1.g1();
			int var10 = var9 & 0x7;
			if (var10 == 1) {
				this.field1415[var8] = var4 = (short) (arg0.gSmart1or2s() + var7);
				this.field1386[var8] = var5 = (short) (arg0.gSmart1or2s() + var4);
				this.field1400[var8] = var6 = (short) (arg0.gSmart1or2s() + var5);
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
				this.field1415[var8] = var4;
				this.field1386[var8] = var5;
				this.field1400[var8] = var6;
				if (var6 > this.field1374) {
					this.field1374 = var6;
				}
			}
			if (var10 == 3) {
				var4 = var6;
				var6 = (short) (arg0.gSmart1or2s() + var7);
				var7 = var6;
				this.field1415[var8] = var4;
				this.field1386[var8] = var5;
				this.field1400[var8] = var6;
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
				this.field1415[var8] = var4;
				this.field1386[var8] = var13;
				this.field1400[var8] = var6;
				if (var6 > this.field1374) {
					this.field1374 = var6;
				}
			}
			if (this.field1381 > 0 && (var9 & 0x8) != 0) {
				this.field1388[var8] = (byte) arg2.g1();
				this.field1389[var8] = (byte) arg2.g1();
				this.field1390[var8] = (byte) arg2.g1();
			}
		}
		this.field1374++;
	}

	@ObfuscatedName("dq.k(Lalw;Lalw;Lalw;Lalw;Lalw;Lalw;)V")
	public void method1939(Packet arg0, Packet arg1, Packet arg2, Packet arg3, Packet arg4, Packet arg5) {
		for (int var7 = 0; var7 < this.field1387; var7++) {
			int var8 = this.field1377[var7] & 0xFF;
			if (var8 == 0) {
				this.field1404[var7] = (short) arg0.g2();
				this.field1405[var7] = (short) arg0.g2();
				this.field1406[var7] = (short) arg0.g2();
			}
			if (var8 == 1) {
				this.field1404[var7] = (short) arg1.g2();
				this.field1405[var7] = (short) arg1.g2();
				this.field1406[var7] = (short) arg1.g2();
				if (this.field1372 < 15) {
					this.field1407[var7] = arg2.g2();
					if (this.field1372 < 14) {
						this.field1408[var7] = arg2.g2();
					} else {
						this.field1408[var7] = arg2.g3();
					}
					this.field1409[var7] = arg2.g2();
				} else {
					this.field1407[var7] = arg2.g3();
					this.field1408[var7] = arg2.g3();
					this.field1409[var7] = arg2.g3();
				}
				this.field1402[var7] = arg3.g1b();
				this.field1414[var7] = arg4.g1b();
				this.field1410[var7] = arg5.g1b();
			}
			if (var8 == 2) {
				this.field1404[var7] = (short) arg1.g2();
				this.field1405[var7] = (short) arg1.g2();
				this.field1406[var7] = (short) arg1.g2();
				if (this.field1372 < 15) {
					this.field1407[var7] = arg2.g2();
					if (this.field1372 < 14) {
						this.field1408[var7] = arg2.g2();
					} else {
						this.field1408[var7] = arg2.g3();
					}
					this.field1409[var7] = arg2.g2();
				} else {
					this.field1407[var7] = arg2.g3();
					this.field1408[var7] = arg2.g3();
					this.field1409[var7] = arg2.g3();
				}
				this.field1402[var7] = arg3.g1b();
				this.field1414[var7] = arg4.g1b();
				this.field1410[var7] = arg5.g1b();
				this.field1398[var7] = arg5.g1b();
				this.field1369[var7] = arg5.g1b();
			}
			if (var8 == 3) {
				this.field1404[var7] = (short) arg1.g2();
				this.field1405[var7] = (short) arg1.g2();
				this.field1406[var7] = (short) arg1.g2();
				if (this.field1372 < 15) {
					this.field1407[var7] = arg2.g2();
					if (this.field1372 < 14) {
						this.field1408[var7] = arg2.g2();
					} else {
						this.field1408[var7] = arg2.g3();
					}
					this.field1409[var7] = arg2.g2();
				} else {
					this.field1407[var7] = arg2.g3();
					this.field1408[var7] = arg2.g3();
					this.field1409[var7] = arg2.g3();
				}
				this.field1402[var7] = arg3.g1b();
				this.field1414[var7] = arg4.g1b();
				this.field1410[var7] = arg5.g1b();
			}
		}
	}

	@ObfuscatedName("dq.f(III)I")
	public int method1936(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field1373; var4++) {
			if (this.field1375[var4] == arg0 && this.field1382[var4] == arg1 && this.field1411[var4] == arg2) {
				return var4;
			}
		}
		this.field1375[this.field1373] = arg0;
		this.field1382[this.field1373] = arg1;
		this.field1411[this.field1373] = arg2;
		this.field1374 = this.field1373 + 1;
		return this.field1373++;
	}

	@ObfuscatedName("dq.w(IIIBBSBS)I")
	public int method1966(int arg0, int arg1, int arg2, byte arg3, byte arg4, short arg5, byte arg6, short arg7) {
		this.field1415[this.field1384] = (short) arg0;
		this.field1386[this.field1384] = (short) arg1;
		this.field1400[this.field1384] = (short) arg2;
		this.field1391[this.field1384] = arg3;
		this.field1413[this.field1384] = arg4;
		this.field1395[this.field1384] = arg5;
		this.field1393[this.field1384] = arg6;
		this.field1396[this.field1384] = arg7;
		return this.field1384++;
	}

	@ObfuscatedName("dq.l(SSS)B")
	public byte method1938(short arg0, short arg1, short arg2) {
		if (this.field1387 >= 255) {
			throw new IllegalStateException();
		}
		this.field1377[this.field1387] = 0;
		this.field1404[this.field1387] = arg0;
		this.field1405[this.field1387] = arg1;
		this.field1406[this.field1387] = arg2;
		return (byte) this.field1387++;
	}

	@ObfuscatedName("dq.u(SSSSSSBBB)B")
	public byte method1935(short arg0, short arg1, short arg2, short arg3, short arg4, short arg5, byte arg6, byte arg7, byte arg8) {
		if (this.field1387 >= 255) {
			throw new IllegalStateException();
		}
		this.field1377[this.field1387] = 3;
		this.field1404[this.field1387] = arg0;
		this.field1405[this.field1387] = arg1;
		this.field1406[this.field1387] = arg2;
		this.field1407[this.field1387] = arg3;
		this.field1408[this.field1387] = arg4;
		this.field1409[this.field1387] = arg5;
		this.field1402[this.field1387] = arg6;
		this.field1414[this.field1387] = arg7;
		this.field1410[this.field1387] = arg8;
		return (byte) this.field1387++;
	}

	@ObfuscatedName("dq.z(Z)[[I")
	public int[][] method1940(boolean arg0) {
		int[] var2 = new int[800];
		int var3 = 0;
		int var4 = arg0 ? this.field1373 : this.field1374;
		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = this.field1379[var5];
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
			int var10 = this.field1379[var9];
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
		for (int var3 = 0; var3 < this.field1384; var3++) {
			int var4 = this.field1397[var3];
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
		for (int var7 = 0; var7 < this.field1384; var7++) {
			int var8 = this.field1397[var7];
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
		for (int var3 = 0; var3 < this.field1412.length; var3++) {
			int var4 = this.field1412[var3].field1655;
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
		for (int var7 = 0; var7 < this.field1412.length; var7++) {
			int var8 = this.field1412[var7].field1655;
			if (var8 >= 0) {
				var5[var8][var1[var8]++] = var7;
			}
		}
		return var5;
	}

	@ObfuscatedName("dq.c(SS)V")
	public void method1943(short arg0, short arg1) {
		for (int var3 = 0; var3 < this.field1384; var3++) {
			if (this.field1395[var3] == arg0) {
				this.field1395[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("dq.r(SS)V")
	public void method1937(short arg0, short arg1) {
		if (this.field1396 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.field1384; var3++) {
			if (this.field1396[var3] == arg0) {
				this.field1396[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("dq.v(III)V")
	public void method1945(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field1373; var4++) {
			this.field1375[var4] += arg0;
			this.field1382[var4] += arg1;
			this.field1411[var4] += arg2;
		}
	}

	@ObfuscatedName("dq.o(III)V")
	public void method1946(int arg0, int arg1, int arg2) {
		if (arg2 != 0) {
			int var4 = Trig1.field4270[arg2];
			int var5 = Trig1.field4272[arg2];
			for (int var6 = 0; var6 < this.field1373; var6++) {
				int var7 = this.field1382[var6] * var4 + this.field1375[var6] * var5 >> 14;
				this.field1382[var6] = this.field1382[var6] * var5 - this.field1375[var6] * var4 >> 14;
				this.field1375[var6] = var7;
			}
		}
		if (arg0 != 0) {
			int var8 = Trig1.field4270[arg0];
			int var9 = Trig1.field4272[arg0];
			for (int var10 = 0; var10 < this.field1373; var10++) {
				int var11 = this.field1382[var10] * var9 - this.field1411[var10] * var8 >> 14;
				this.field1411[var10] = this.field1411[var10] * var9 + this.field1382[var10] * var8 >> 14;
				this.field1382[var10] = var11;
			}
		}
		if (arg1 == 0) {
			return;
		}
		int var12 = Trig1.field4270[arg1];
		int var13 = Trig1.field4272[arg1];
		for (int var14 = 0; var14 < this.field1373; var14++) {
			int var15 = this.field1411[var14] * var12 + this.field1375[var14] * var13 >> 14;
			this.field1411[var14] = this.field1411[var14] * var13 - this.field1375[var14] * var12 >> 14;
			this.field1375[var14] = var15;
		}
	}

	@ObfuscatedName("dq.s(I)V")
	public void method1947(int arg0) {
		for (int var2 = 0; var2 < this.field1373; var2++) {
			this.field1375[var2] <<= arg0;
			this.field1382[var2] <<= arg0;
			this.field1411[var2] <<= arg0;
		}
		if (this.field1387 <= 0 || this.field1407 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.field1407.length; var3++) {
			this.field1407[var3] <<= arg0;
			this.field1408[var3] <<= arg0;
			if (this.field1377[var3] != 1) {
				this.field1409[var3] <<= arg0;
			}
		}
	}

	@ObfuscatedName("dq.y(F)V")
	public void method1948(float arg0) {
		for (int var2 = 0; var2 < this.field1373; var2++) {
			this.field1375[var2] = (int) ((float) this.field1375[var2] * arg0);
			this.field1382[var2] = (int) ((float) this.field1382[var2] * arg0);
			this.field1411[var2] = (int) ((float) this.field1411[var2] * arg0);
		}
		if (this.field1387 <= 0 || this.field1407 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.field1407.length; var3++) {
			this.field1407[var3] = (int) ((float) this.field1407[var3] * arg0);
			this.field1408[var3] = (int) ((float) this.field1408[var3] * arg0);
			if (this.field1377[var3] != 1) {
				this.field1409[var3] = (int) ((float) this.field1409[var3] * arg0);
			}
		}
	}
}

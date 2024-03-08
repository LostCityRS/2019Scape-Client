package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aef")
public class class831 extends class101 {

	@ObfuscatedName("aef.e")
	public final class850 field9403;

	@ObfuscatedName("aef.n")
	public final class341 field9401;

	@ObfuscatedName("aef.m")
	public final class130 field9402;

	@ObfuscatedName("aef.k")
	public final int field9407;

	@ObfuscatedName("aef.f")
	public final int field9404;

	@ObfuscatedName("aef.w")
	public boolean field9405;

	@ObfuscatedName("aef.l")
	public int field9410;

	@ObfuscatedName("aef.u")
	public int field9408;

	@ObfuscatedName("aef.z")
	public int field9412;

	@ObfuscatedName("aef.p")
	public int field9409;

	@ObfuscatedName("aef.d")
	public final boolean field9400;

	@ObfuscatedName("aef.c")
	public final boolean field9406;

	@ObfuscatedName("aef.r")
	public final boolean field9411;

	@ObfuscatedName("aef.v")
	public final boolean field9413;

	public class831(class850 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		this.field9405 = false;
		this.field9410 = 0;
		this.field9408 = 0;
		this.field9412 = 0;
		this.field9409 = 0;
		this.field9403 = arg0;
		this.field9407 = arg1;
		this.field9404 = arg2;
		if (arg4) {
			class359 var6 = arg0.method16089(arg3 ? class109.field1273 : class109.field1271, class135.field1645, arg1, arg2);
			this.field9402 = var6.method5828(0);
			this.field9401 = var6;
		} else {
			this.field9401 = arg0.method16030(arg3 ? class109.field1273 : class109.field1271, class135.field1645, arg1, arg2);
			this.field9402 = null;
		}
		this.field9401.method5700(true, true);
		this.field9400 = this.field9401.method5718() != arg1;
		this.field9406 = this.field9401.method5696() != arg2;
		this.field9411 = !this.field9400 && this.field9401.method5732();
		this.field9413 = !this.field9406 && this.field9401.method5732();
	}

	public class831(class850 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
		this.field9405 = false;
		this.field9410 = 0;
		this.field9408 = 0;
		this.field9412 = 0;
		this.field9409 = 0;
		this.field9403 = arg0;
		this.field9407 = arg1;
		this.field9404 = arg2;
		this.field9402 = null;
		this.field9401 = arg0.method16033(arg1, arg2, false, arg3, arg4, arg5);
		this.field9401.method5700(true, true);
		this.field9400 = this.field9401.method5718() != arg1;
		this.field9406 = this.field9401.method5696() != arg2;
		this.field9411 = !this.field9400 && this.field9401.method5732();
		this.field9413 = !this.field9406 && this.field9401.method5732();
	}

	public class831(class850 arg0, class341 arg1) {
		this(arg0, arg1, arg1.method5718(), arg1.method5696());
	}

	public class831(class850 arg0, class341 arg1, int arg2, int arg3) {
		this.field9405 = false;
		this.field9410 = 0;
		this.field9408 = 0;
		this.field9412 = 0;
		this.field9409 = 0;
		this.field9403 = arg0;
		this.field9407 = arg2;
		this.field9404 = arg3;
		this.field9401 = arg1;
		this.field9402 = null;
		this.field9400 = this.field9401.method5718() != arg2;
		this.field9406 = this.field9401.method5696() != arg3;
		this.field9411 = !this.field9400 && this.field9401.method5732();
		this.field9413 = !this.field9406 && this.field9401.method5732();
	}

	@ObfuscatedName("aef.p(IIIIII)V")
	public void method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field9401.method5719(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aef.d(III)V")
	public void method1441(int arg0, int arg1, int arg2) {
		int[] var4 = this.field9403.method2149(arg0, arg1, this.field9407, this.field9404);
		int[] var5 = new int[this.field9407 * this.field9404];
		this.field9401.method5703(0, 0, this.field9407, this.field9404, var5, 0);
		if (arg2 == 0) {
			for (int var6 = 0; var6 < this.field9404; var6++) {
				int var7 = this.field9407 * var6;
				for (int var8 = 0; var8 < this.field9407; var8++) {
					var5[var7 + var8] = var5[var7 + var8] & 0xFFFFFF | (var4[var7 + var8] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (int var9 = 0; var9 < this.field9404; var9++) {
				int var10 = this.field9407 * var9;
				for (int var11 = 0; var11 < this.field9407; var11++) {
					var5[var10 + var11] = var5[var10 + var11] & 0xFFFFFF | (var4[var10 + var11] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (int var12 = 0; var12 < this.field9404; var12++) {
				int var13 = this.field9407 * var12;
				for (int var14 = 0; var14 < this.field9407; var14++) {
					var5[var13 + var14] = var5[var13 + var14] & 0xFFFFFF | (var4[var13 + var14] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (int var15 = 0; var15 < this.field9404; var15++) {
				int var16 = this.field9407 * var15;
				for (int var17 = 0; var17 < this.field9407; var17++) {
					var5[var16 + var17] = var5[var16 + var17] & 0xFFFFFF | (var4[var16 + var17] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method1469(0, 0, this.field9407, this.field9404, var5, 0, this.field9407);
	}

	@ObfuscatedName("aef.e(IIII)V")
	public void method1431(int arg0, int arg1, int arg2, int arg3) {
		this.field9408 = arg0;
		this.field9410 = arg1;
		this.field9409 = arg2;
		this.field9412 = arg3;
		this.field9405 = this.field9408 != 0 || this.field9410 != 0 || this.field9409 != 0 || this.field9412 != 0;
	}

	@ObfuscatedName("aef.n([I)V")
	public void method1432(int[] arg0) {
		arg0[0] = this.field9408;
		arg0[1] = this.field9410;
		arg0[2] = this.field9409;
		arg0[3] = this.field9412;
	}

	@ObfuscatedName("aef.m()I")
	public int method1459() {
		return this.field9407;
	}

	@ObfuscatedName("aef.k()I")
	public int method1434() {
		return this.field9408 + this.field9407 + this.field9409;
	}

	@ObfuscatedName("aef.f()I")
	public int method1435() {
		return this.field9404;
	}

	@ObfuscatedName("aef.w()I")
	public int method1436() {
		return this.field9410 + this.field9404 + this.field9412;
	}

	@ObfuscatedName("aef.l()Ldp;")
	public class130 method1437() {
		return this.field9402;
	}

	@ObfuscatedName("aef.u(IIII[III)V")
	public void method1469(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.field9401.method5701(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aef.z(IIII[I[III)V")
	public void method1476(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7) {
		this.field9401.method5704(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aef.r(IIIII)V")
	public void method1443(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.field9403.method16337() != class326.field3236) {
			int var6 = this.field9408 + arg0;
			int var7 = this.field9410 + arg1;
			this.field9403.field10146.method5797((float) var6, (float) var7, (float) (this.field9407 + var6), (float) (this.field9404 + var7), 0.0F, 0.0F, this.field9401.method5734(), this.field9401.method5707(), this.field9401, arg3);
			return;
		}
		this.field9403.method15981();
		this.field9403.method16054(arg4);
		class288 var8 = this.field9403.field10149;
		var8.field2997 = this.field9401;
		var8.method5050(arg2, arg3);
		int var9 = this.field9408 + arg0;
		int var10 = this.field9410 + arg1;
		float var11 = (float) this.field9403.method2135().method1627();
		float var12 = (float) this.field9403.method2135().method1628();
		var8.field2995.method6612((float) this.field9407 * 2.0F / var11, (float) this.field9404 * 2.0F / var12, 1.0F, 1.0F);
		var8.field2995.field4315[12] = ((float) var9 + this.field9403.method15954()) * 2.0F / var11 - 1.0F;
		var8.field2995.field4315[13] = ((float) var10 + this.field9403.method15954()) * 2.0F / var12 - 1.0F;
		var8.field2995.field4315[14] = -1.0F;
		var8.field2998.method6612(this.field9401.method5697((float) this.field9407), this.field9401.method5698((float) this.field9404), 1.0F, 1.0F);
		var8.field3000 = this.field9403.field10197;
		var8.field3001 = 0;
		var8.field2994 = this.field9403.field10055;
		var8.method5051();
	}

	@ObfuscatedName("aef.v(IILch;II)V")
	public void method1444(int arg0, int arg1, class103 arg2, int arg3, int arg4) {
		this.field9403.method15981();
		class288 var6 = this.field9403.field10149;
		var6.field2997 = this.field9401;
		var6.method5050(1, -1);
		int var7 = this.field9408 + arg0;
		int var8 = this.field9410 + arg1;
		float var9 = (float) this.field9403.method2135().method1627();
		float var10 = (float) this.field9403.method2135().method1628();
		var6.field2995.method6612((float) this.field9407 * 2.0F / var9, (float) this.field9404 * 2.0F / var10, 1.0F, 1.0F);
		var6.field2995.field4315[12] = ((float) var7 + this.field9403.method15954()) * 2.0F / var9 - 1.0F;
		var6.field2995.field4315[13] = ((float) var8 + this.field9403.method15954()) * 2.0F / var10 - 1.0F;
		var6.field2995.field4315[14] = -1.0F;
		var6.field2998.method6612(this.field9401.method5697((float) this.field9407), this.field9401.method5698((float) this.field9404), 1.0F, 1.0F);
		var6.field3000 = this.field9403.field10197;
		var6.field3001 = 0;
		var6.field2994 = this.field9403.field10055;
		class341 var11 = ((class834) arg2).field9417;
		var6.field2996 = var11;
		var6.field2999.method6612(var11.method5697((float) this.field9407), var11.method5698((float) this.field9404), 1.0F, 1.0F);
		var6.field2999.field4315[12] = var11.method5697((float) (var7 - arg3));
		var6.field2999.field4315[13] = var11.method5698((float) (var8 - arg4));
		var6.method5054();
	}

	@ObfuscatedName("aef.y(IIIIIIII)V")
	public void method1447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.field9403.method16337() != class326.field3236) {
			if (this.field9405) {
				arg2 = this.field9407 * arg2 / this.method1434();
				arg3 = this.field9404 * arg3 / this.method1436();
				arg0 += this.field9408 * arg2 / this.field9407;
				arg1 += this.field9410 * arg3 / this.field9404;
			}
			this.field9403.field10146.method5797((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.field9401.method5697(0.0F), this.field9401.method5698(0.0F), this.field9401.method5697((float) this.field9407), this.field9401.method5698((float) this.field9404), this.field9401, arg5);
			return;
		}
		this.field9403.method15981();
		this.field9403.method16054(arg6);
		class288 var9 = this.field9403.field10149;
		var9.field2997 = this.field9401;
		var9.method5050(arg4, arg5);
		if (this.field9405) {
			arg2 = this.field9407 * arg2 / this.method1434();
			arg3 = this.field9404 * arg3 / this.method1436();
			arg0 += this.field9408 * arg2 / this.field9407;
			arg1 += this.field9410 * arg3 / this.field9404;
		}
		float var10 = (float) this.field9403.method2135().method1627();
		float var11 = (float) this.field9403.method2135().method1628();
		var9.field2995.method6612((float) arg2 * 2.0F / var10, (float) arg3 * 2.0F / var11, 1.0F, 1.0F);
		var9.field2995.field4315[12] = ((float) arg0 + this.field9403.method15954()) * 2.0F / var10 - 1.0F;
		var9.field2995.field4315[13] = ((float) arg1 + this.field9403.method15954()) * 2.0F / var11 - 1.0F;
		var9.field2995.field4315[14] = -1.0F;
		var9.field2998.method6612(this.field9401.method5697((float) this.field9407), this.field9401.method5698((float) this.field9404), 1.0F, 1.0F);
		var9.field3000 = this.field9403.field10197;
		var9.field3001 = 0;
		var9.field2994 = this.field9403.field10055;
		var9.method5051();
	}

	@ObfuscatedName("aef.x(IIIIIII)V")
	public void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.field9403.method16337() != class326.field3236) {
			int var8 = arg1 + arg3;
			int var9 = arg0 + arg2;
			int var10 = this.method1434();
			int var11 = this.method1436();
			int var12 = this.field9410 + arg1;
			for (int var13 = this.field9404 + var12; var13 <= var8; var13 += var11) {
				int var14 = this.field9408 + arg0;
				for (int var15 = this.field9407 + var14; var15 <= var9; var15 += var10) {
					this.field9403.field10146.method5797((float) var14, (float) var12, (float) (this.field9407 + var14), (float) (this.field9404 + var12), 0.0F, 0.0F, this.field9401.method5734(), this.field9401.method5707(), this.field9401, arg5);
					var14 += var10;
				}
				if (var14 < var9) {
					int var16 = var9 - var14;
					this.field9403.field10146.method5797((float) var14, (float) var12, (float) (var14 + var16), (float) (this.field9404 + var12), 0.0F, 0.0F, (float) var16 / (float) this.field9407 * this.field9401.method5734(), this.field9401.method5707(), this.field9401, arg5);
				}
				var12 += var11;
			}
			if (var12 < var8) {
				int var17 = var8 - var12;
				float var18 = (float) var17 / (float) this.field9404 * this.field9401.method5707();
				int var19 = this.field9408 + arg0;
				for (int var20 = this.field9407 + var19; var20 <= var9; var20 += var10) {
					this.field9403.field10146.method5797((float) var19, (float) var12, (float) (this.field9407 + var19), (float) (var12 + var17), 0.0F, 0.0F, this.field9401.method5734(), var18, this.field9401, arg5);
					var19 += var10;
				}
				if (var19 < var9) {
					int var21 = var9 - var19;
					this.field9403.field10146.method5797((float) var19, (float) var12, (float) (var19 + var21), (float) (var12 + var17), 0.0F, 0.0F, (float) var21 / (float) this.field9407 * this.field9401.method5734(), var18, this.field9401, arg5);
				}
			}
			return;
		}
		this.field9403.method15981();
		this.field9403.method16054(arg6);
		class288 var22 = this.field9403.field10149;
		var22.field2997 = this.field9401;
		var22.method5050(arg4, arg5);
		float var23 = (float) this.field9403.method2135().method1627();
		float var24 = (float) this.field9403.method2135().method1628();
		var22.field3000 = this.field9403.field10197;
		var22.field3001 = 0;
		var22.field2994 = this.field9403.field10055;
		boolean var25 = this.field9413 && this.field9410 == 0 && this.field9412 == 0;
		boolean var26 = this.field9411 && this.field9408 == 0 && this.field9409 == 0;
		if (var26 & var25) {
			var22.field2995.method6612((float) arg2 * 2.0F / var23, (float) arg3 * 2.0F / var24, 1.0F, 1.0F);
			var22.field2995.field4315[12] = ((float) arg0 + this.field9403.method15954()) * 2.0F / var23 - 1.0F;
			var22.field2995.field4315[13] = ((float) arg1 + this.field9403.method15954()) * 2.0F / var24 - 1.0F;
			var22.field2995.field4315[14] = -1.0F;
			var22.field2998.method6612(this.field9401.method5697((float) arg2), this.field9401.method5698((float) arg3), 1.0F, 1.0F);
			var22.method5051();
		} else if (var26) {
			int var27 = arg1 + arg3;
			int var28 = this.method1436();
			var22.field2998.method6612(this.field9401.method5697((float) arg2), this.field9401.method5698((float) this.field9404), 1.0F, 1.0F);
			int var29 = this.field9410 + arg1;
			for (int var30 = this.field9404 + var29; var30 <= var27; var30 += var28) {
				var22.field2995.method6612((float) arg2 * 2.0F / var23, (float) this.field9404 * 2.0F / var24, 1.0F, 1.0F);
				var22.field2995.field4315[12] = ((float) arg0 + this.field9403.method15954()) * 2.0F / var23 - 1.0F;
				var22.field2995.field4315[13] = ((float) var29 + this.field9403.method15954()) * 2.0F / var24 - 1.0F;
				var22.field2995.field4315[14] = -1.0F;
				var22.method5051();
				var29 += var28;
			}
			if (var29 < var27) {
				int var31 = var27 - var29;
				var22.field2998.method6612(this.field9401.method5697((float) arg2), this.field9401.method5698((float) var31), 1.0F, 1.0F);
				var22.field2995.method6612((float) arg2 * 2.0F / var23, (float) var31 * 2.0F / var24, 1.0F, 1.0F);
				var22.field2995.field4315[12] = ((float) arg0 + this.field9403.method15954()) * 2.0F / var23 - 1.0F;
				var22.field2995.field4315[13] = ((float) var29 + this.field9403.method15954()) * 2.0F / var24 - 1.0F;
				var22.field2995.field4315[14] = -1.0F;
				var22.method5051();
			}
		} else if (var25) {
			int var32 = arg0 + arg2;
			int var33 = this.method1434();
			var22.field2998.method6612(this.field9401.method5697((float) this.field9407), this.field9401.method5698((float) arg3), 1.0F, 1.0F);
			int var34 = this.field9408 + arg0;
			for (int var35 = this.field9407 + var34; var35 <= var32; var35 += var33) {
				var22.field2995.method6612((float) this.field9407 * 2.0F / var23, (float) arg3 * 2.0F / var24, 1.0F, 1.0F);
				var22.field2995.field4315[12] = ((float) var34 + this.field9403.method15954()) * 2.0F / var23 - 1.0F;
				var22.field2995.field4315[13] = ((float) arg1 + this.field9403.method15954()) * 2.0F / var24 - 1.0F;
				var22.field2995.field4315[14] = -1.0F;
				var22.method5051();
				var34 += var33;
			}
			if (var34 < var32) {
				int var36 = var32 - var34;
				var22.field2998.method6612(this.field9401.method5697((float) var36), this.field9401.method5698((float) arg3), 1.0F, 1.0F);
				var22.field2995.method6612((float) var36 * 2.0F / var23, (float) arg3 * 2.0F / var24, 1.0F, 1.0F);
				var22.field2995.field4315[12] = ((float) var34 + this.field9403.method15954()) * 2.0F / var23 - 1.0F;
				var22.field2995.field4315[13] = ((float) arg1 + this.field9403.method15954()) * 2.0F / var24 - 1.0F;
				var22.field2995.field4315[14] = -1.0F;
				var22.method5051();
			}
		} else {
			int var37 = arg1 + arg3;
			int var38 = arg0 + arg2;
			int var39 = this.method1434();
			int var40 = this.method1436();
			int var41 = this.field9410 + arg1;
			for (int var42 = this.field9404 + var41; var42 <= var37; var42 += var40) {
				var22.field2998.method6612(this.field9401.method5697((float) this.field9407), this.field9401.method5698((float) this.field9404), 1.0F, 1.0F);
				int var43 = this.field9408 + arg0;
				for (int var44 = this.field9407 + var43; var44 <= var38; var44 += var39) {
					var22.field2995.method6612((float) this.field9407 * 2.0F / var23, (float) this.field9404 * 2.0F / var24, 1.0F, 1.0F);
					var22.field2995.field4315[12] = ((float) var43 + this.field9403.method15954()) * 2.0F / var23 - 1.0F;
					var22.field2995.field4315[13] = ((float) var41 + this.field9403.method15954()) * 2.0F / var24 - 1.0F;
					var22.field2995.field4315[14] = -1.0F;
					var22.method5051();
					var43 += var39;
				}
				if (var43 < var38) {
					int var45 = var38 - var43;
					var22.field2998.method6612(this.field9401.method5697((float) var45), this.field9401.method5698((float) this.field9404), 1.0F, 1.0F);
					var22.field2995.method6612((float) var45 * 2.0F / var23, (float) this.field9404 * 2.0F / var24, 1.0F, 1.0F);
					var22.field2995.field4315[12] = ((float) var43 + this.field9403.method15954()) * 2.0F / var23 - 1.0F;
					var22.field2995.field4315[13] = ((float) var41 + this.field9403.method15954()) * 2.0F / var24 - 1.0F;
					var22.field2995.field4315[14] = -1.0F;
					var22.method5051();
				}
				var41 += var40;
			}
			if (var41 < var37) {
				int var46 = var37 - var41;
				var22.field2998.method6612(this.field9401.method5697((float) this.field9407), this.field9401.method5698((float) var46), 1.0F, 1.0F);
				int var47 = this.field9408 + arg0;
				for (int var48 = this.field9407 + var47; var48 <= var38; var48 += var39) {
					var22.field2995.method6612((float) this.field9407 * 2.0F / var23, (float) var46 * 2.0F / var24, 1.0F, 1.0F);
					var22.field2995.field4315[12] = ((float) var47 + this.field9403.method15954()) * 2.0F / var23 - 1.0F;
					var22.field2995.field4315[13] = ((float) var41 + this.field9403.method15954()) * 2.0F / var24 - 1.0F;
					var22.field2995.field4315[14] = -1.0F;
					var22.method5051();
					var47 += var39;
				}
				if (var47 < var38) {
					int var49 = var38 - var47;
					var22.field2998.method6612(this.field9401.method5697((float) var49), this.field9401.method5698((float) var46), 1.0F, 1.0F);
					var22.field2995.method6612((float) var49 * 2.0F / var23, (float) var46 * 2.0F / var24, 1.0F, 1.0F);
					var22.field2995.field4315[12] = ((float) var47 + this.field9403.method15954()) * 2.0F / var23 - 1.0F;
					var22.field2995.field4315[13] = ((float) var41 + this.field9403.method15954()) * 2.0F / var24 - 1.0F;
					var22.field2995.field4315[14] = -1.0F;
					var22.method5051();
				}
			}
		}
	}

	@ObfuscatedName("aef.ag(FFFFFFIIII)V")
	public void method1433(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.field9403.method16337() != class326.field3236) {
			this.field9403.field10146.method5806(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.field9401.method5734(), 0.0F, 0.0F, this.field9401.method5707(), this.field9401.method5734(), this.field9401.method5707(), this.field9401, arg7);
			return;
		}
		this.field9403.method15981();
		this.field9403.method16054(arg8);
		if (this.field9405) {
			float var11 = (float) this.method1434();
			float var12 = (float) this.method1436();
			float var13 = (arg2 - arg0) / var11;
			float var14 = (arg3 - arg1) / var11;
			float var15 = (arg4 - arg0) / var12;
			float var16 = (arg5 - arg1) / var12;
			float var17 = (float) this.field9410 * var15;
			float var18 = (float) this.field9410 * var16;
			float var19 = (float) this.field9408 * var13;
			float var20 = (float) this.field9408 * var14;
			float var21 = (float) this.field9409 * -var13;
			float var22 = (float) this.field9409 * -var14;
			float var23 = (float) this.field9412 * -var15;
			float var24 = (float) this.field9412 * -var16;
			arg0 = arg0 + var19 + var17;
			arg1 = arg1 + var20 + var18;
			arg2 = arg2 + var21 + var17;
			arg3 = arg3 + var22 + var18;
			arg4 = arg4 + var19 + var23;
			arg5 = arg5 + var20 + var24;
		}
		class288 var25 = this.field9403.field10149;
		var25.field2997 = this.field9401;
		var25.method5050(arg6, arg7);
		float var26 = (float) this.field9403.method2135().method1627();
		float var27 = (float) this.field9403.method2135().method1628();
		var25.field2995.method6603();
		var25.field2995.field4315[0] = (arg2 - arg0) * 2.0F / var26;
		var25.field2995.field4315[1] = (arg3 - arg1) * 2.0F / var27;
		var25.field2995.field4315[4] = (arg4 - arg0) * 2.0F / var26;
		var25.field2995.field4315[5] = (arg5 - arg1) * 2.0F / var27;
		var25.field2995.field4315[12] = (arg0 + this.field9403.method15954()) * 2.0F / var26 - 1.0F;
		var25.field2995.field4315[13] = (arg1 + this.field9403.method15954()) * 2.0F / var27 - 1.0F;
		var25.field2995.field4315[14] = -1.0F;
		var25.field2998.method6612(this.field9401.method5697((float) this.field9407), this.field9401.method5698((float) this.field9404), 1.0F, 1.0F);
		var25.field3000 = this.field9403.field10197;
		var25.field3001 = 0;
		var25.field2994 = this.field9403.field10055;
		var25.method5051();
	}

	@ObfuscatedName("aef.al(FFFFFFILch;II)V")
	public void method1454(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class103 arg7, int arg8, int arg9) {
		this.field9403.method15981();
		class288 var11 = this.field9403.field10149;
		var11.field2997 = this.field9401;
		var11.method5050(1, -1);
		float var12 = (float) this.field9403.method2135().method1627();
		float var13 = (float) this.field9403.method2135().method1628();
		var11.field2995.method6603();
		if (this.field9405) {
			float var14 = (float) this.field9407 / (float) this.method1434();
			float var15 = (float) this.field9404 / (float) this.method1436();
			var11.field2995.field4315[0] = (arg2 - arg0) * var14;
			var11.field2995.field4315[1] = (arg3 - arg1) * var14;
			var11.field2995.field4315[4] = (arg4 - arg0) * var15;
			var11.field2995.field4315[5] = (arg5 - arg1) * var15;
			var11.field2995.field4315[12] = ((float) this.field9408 + arg0) * var14 + this.field9403.method15954();
			var11.field2995.field4315[13] = ((float) this.field9410 + arg1) * var15 + this.field9403.method15954();
		} else {
			var11.field2995.field4315[0] = arg2 - arg0;
			var11.field2995.field4315[1] = arg3 - arg1;
			var11.field2995.field4315[4] = arg4 - arg0;
			var11.field2995.field4315[5] = arg5 - arg1;
			var11.field2995.field4315[12] = arg0 + this.field9403.method15954();
			var11.field2995.field4315[13] = arg1 + this.field9403.method15954();
		}
		class426 var16 = this.field9403.field10066;
		var16.method6603();
		var16.field4315[0] = 2.0F / var12;
		var16.field4315[5] = 2.0F / var13;
		var16.field4315[12] = -1.0F;
		var16.field4315[13] = -1.0F;
		var16.field4315[14] = -1.0F;
		var11.field2995.method6720(var16);
		var11.field2998.method6612(this.field9401.method5697((float) this.field9407), this.field9401.method5698((float) this.field9404), 1.0F, 1.0F);
		var11.field3000 = this.field9403.field10197;
		var11.field3001 = 0;
		var11.field2994 = this.field9403.field10055;
		class341 var17 = ((class834) arg7).field9417;
		var11.field2996 = var17;
		var11.field2999.method6603();
		var11.field2999.field4315[0] = (arg2 - arg0) * var17.method5697(1.0F);
		var11.field2999.field4315[1] = (arg3 - arg1) * var17.method5697(1.0F);
		var11.field2999.field4315[4] = (arg4 - arg0) * var17.method5698(1.0F);
		var11.field2999.field4315[5] = (arg5 - arg1) * var17.method5698(1.0F);
		var11.field2999.field4315[12] = (arg0 - (float) arg8) * var17.method5697(1.0F);
		var11.field2999.field4315[13] = (arg1 - (float) arg9) * var17.method5698(1.0F);
		var11.method5054();
	}
}

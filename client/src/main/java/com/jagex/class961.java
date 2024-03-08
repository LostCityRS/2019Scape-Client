package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ajo")
public class class961 extends class532 {

	@ObfuscatedName("ajo.k")
	public static final class729 field11220 = new class729(32);

	@ObfuscatedName("ajo.f")
	public static final class162 field11221 = new class162(10);

	@ObfuscatedName("ajo.l")
	public int[] field11223 = new int[] { -1 };

	@ObfuscatedName("ajo.u")
	public int[] field11224 = new int[] { 0 };

	@ObfuscatedName("ajo.z")
	public class747[] field11225 = null;

	@ObfuscatedName("aau.e(IIZI)I")
	public static int method14439(int arg0, int arg1, boolean arg2) {
		class961 var3 = Statics.method8358(arg0, arg2);
		if (var3 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < var3.field11223.length) {
			return var3.field11223[arg1];
		} else {
			return -1;
		}
	}

	@ObfuscatedName("aal.n(IIZI)I")
	public static int method14483(int arg0, int arg1, boolean arg2) {
		class961 var3 = Statics.method8358(arg0, arg2);
		if (var3 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < var3.field11224.length) {
			return var3.field11224[arg1];
		} else {
			return 0;
		}
	}

	@ObfuscatedName("adr.m(IIIZB)I")
	public static int method15241(int arg0, int arg1, int arg2, boolean arg3) {
		class305 var4 = (class305) Statics.field8736.method962(arg2);
		class149 var5 = var4.field3076;
		class961 var6 = Statics.method8358(arg0, arg3);
		int var7;
		if (var6 == null || arg1 < 0 || arg1 >= var6.field11224.length || var6.field11225 == null || var6.field11225[arg1] == null) {
			var7 = (Integer) var5.method2782();
		} else {
			var7 = var6.field11225[arg1].method14728(var5.field1706);
		}
		return var4.method5181(var7);
	}

	@ObfuscatedName("na.k(IIZB)I")
	public static int method6002(int arg0, int arg1, boolean arg2) {
		class961 var3 = Statics.method8358(arg0, arg2);
		if (var3 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			int var4 = 0;
			for (int var5 = 0; var5 < var3.field11224.length; var5++) {
				if (var3.field11223[var5] == arg1) {
					var4 += var3.field11224[var5];
				}
			}
			return var4;
		}
	}

	@ObfuscatedName("pu.w(IIZZI)I")
	public static int method7077(int arg0, int arg1, boolean arg2, boolean arg3) {
		class961 var4 = Statics.method8358(arg0, arg3);
		if (var4 == null) {
			return 0;
		}
		int var5 = 0;
		for (int var6 = 0; var6 < var4.field11223.length; var6++) {
			if (var4.field11223[var6] >= 0 && var4.field11223[var6] < Statics.field1842.field8794) {
				class738 var7 = (class738) Statics.field1842.method962(var4.field11223[var6]);
				int var8 = var7.method14677(arg1, ((class789) Statics.field3086.method962(arg1)).field9172);
				if (arg2) {
					var5 += var4.field11224[var6] * var8;
				} else if (var4.field11224[var6] > 0) {
					var5 += var8;
				}
			}
		}
		return var5;
	}

	@ObfuscatedName("pf.l(IZS)I")
	public static int method7007(int arg0, boolean arg1) {
		if (arg1) {
			return 0;
		}
		class961 var2 = Statics.method8358(arg0, arg1);
		if (var2 == null) {
			return ((class810) Statics.field7762.method962(arg0)).field9263;
		}
		int var3 = 0;
		for (int var4 = 0; var4 < var2.field11223.length; var4++) {
			if (var2.field11223[var4] == -1) {
				var3++;
			}
		}
		return var3 + (((class810) Statics.field7762.method962(arg0)).field9263 - var2.field11223.length);
	}

	@ObfuscatedName("hg.z(IIIILabn;ZI)V")
	public static void method3912(int arg0, int arg1, int arg2, int arg3, class747 arg4, boolean arg5) {
		long var6 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		class961 var8 = (class961) field11220.method14495(var6);
		if (var8 == null) {
			var8 = new class961();
			field11220.method14501(var8, var6);
		}
		if (var8.field11223.length <= arg1) {
			int[] var9 = new int[arg1 + 1];
			int[] var10 = new int[arg1 + 1];
			class747[] var11 = null;
			if (var8.field11225 != null) {
				var11 = new class747[arg1 + 1];
			}
			for (int var12 = 0; var12 < var8.field11223.length; var12++) {
				var9[var12] = var8.field11223[var12];
				var10[var12] = var8.field11224[var12];
				if (var8.field11225 != null) {
					var11[var12] = var8.field11225[var12];
				}
			}
			for (int var13 = var8.field11223.length; var13 < arg1; var13++) {
				var9[var13] = -1;
				var10[var13] = 0;
			}
			var8.field11223 = var9;
			var8.field11224 = var10;
			var8.field11225 = var11;
		}
		var8.field11223[arg1] = arg2;
		var8.field11224[arg1] = arg3;
		if (arg4 != null) {
			if (var8.field11225 == null) {
				var8.field11225 = new class747[var8.field11223.length];
			}
			var8.field11225[arg1] = arg4;
		} else if (var8.field11225 != null) {
			var8.field11225[arg1] = null;
		}
	}

	@ObfuscatedName("qe.p(IZB)V")
	public static void method7228(int arg0, boolean arg1) {
		class961 var2 = Statics.method8358(arg0, arg1);
		if (var2 == null) {
			return;
		}
		for (int var3 = 0; var3 < var2.field11223.length; var3++) {
			var2.field11223[var3] = -1;
			var2.field11224[var3] = 0;
		}
		var2.field11225 = null;
	}

	@ObfuscatedName("xj.d(IZB)V")
	public static void method10309(int arg0, boolean arg1) {
		class961 var2 = Statics.method8358(arg0, arg1);
		if (var2 != null) {
			var2.method8440();
		}
	}

	@ObfuscatedName("ei.c(B)V")
	public static void method2752() {
		field11220.method14499();
	}

	@ObfuscatedName("ajo.r([II[IZI)J")
	public long method17471(int[] arg0, int arg1, int[] arg2, boolean arg3) {
		long[] var5 = class997.field11507;
		long var6 = -1L;
		long var8 = var6 >>> 8 ^ var5[(int) ((var6 ^ (long) (arg1 >> 8)) & 0xFFL)];
		long var10 = var8 >>> 8 ^ var5[(int) ((var8 ^ (long) arg1) & 0xFFL)];
		for (int var12 = 0; var12 < arg0.length; var12++) {
			long var13 = var10 >>> 8 ^ var5[(int) ((var10 ^ (long) (arg0[var12] >> 24)) & 0xFFL)];
			long var15 = var13 >>> 8 ^ var5[(int) ((var13 ^ (long) (arg0[var12] >> 16)) & 0xFFL)];
			long var17 = var15 >>> 8 ^ var5[(int) ((var15 ^ (long) (arg0[var12] >> 8)) & 0xFFL)];
			var10 = var17 >>> 8 ^ var5[(int) ((var17 ^ (long) arg0[var12]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (int var19 = 0; var19 < 5; var19++) {
				var10 = var10 >>> 8 ^ var5[(int) ((var10 ^ (long) arg2[var19]) & 0xFFL)];
			}
		}
		return var10 >>> 8 ^ var5[(int) ((var10 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@ObfuscatedName("ajo.v(Ldh;ILaaq;IZLxg;I)Ldo;")
	public final class116 method17475(class133 arg0, int arg1, class721 arg2, int arg3, boolean arg4, class639 arg5) {
		class116 var7 = null;
		int var8 = arg1;
		class584 var9 = null;
		if (arg3 != -1) {
			var9 = (class584) Statics.field11742.method962(arg3);
		}
		int[] var10 = this.field11223;
		if (var9 != null && var9.field7318 != null) {
			var10 = new int[var9.field7318.length];
			for (int var11 = 0; var11 < var9.field7318.length; var11++) {
				int var12 = var9.field7318[var11];
				if (var12 >= 0 && var12 < this.field11223.length) {
					var10[var11] = this.field11223[var12];
				} else {
					var10[var11] = -1;
				}
			}
		}
		if (arg2 != null) {
			var8 = arg1 | arg2.method14358();
		}
		long var13 = this.method17471(var10, arg3, arg5 == null ? null : arg5.field7894, arg4);
		if (field11221 != null) {
			var7 = (class116) field11221.method2930(var13);
		}
		if (var7 == null || arg0.method2394(var7.method1691(), var8) != 0) {
			if (var7 != null) {
				var8 = arg0.method2213(var8, var7.method1691());
			}
			int var15 = var8;
			boolean var16 = false;
			for (int var17 = 0; var17 < var10.length; var17++) {
				if (var10[var17] != -1 && !((class738) Statics.field1842.method962(var10[var17])).method14649(arg4, null)) {
					var16 = true;
				}
			}
			if (var16) {
				return null;
			}
			class120[] var18 = new class120[var10.length];
			for (int var19 = 0; var19 < var10.length; var19++) {
				if (var10[var19] != -1) {
					var18[var19] = ((class738) Statics.field1842.method962(var10[var19])).method14650(arg4, null);
				}
			}
			if (var9 != null && var9.field7357 != null) {
				for (int var20 = 0; var20 < var9.field7357.length; var20++) {
					if (var9.field7357[var20] != null && var18[var20] != null) {
						int var21 = var9.field7357[var20][0];
						int var22 = var9.field7357[var20][1];
						int var23 = var9.field7357[var20][2];
						int var24 = var9.field7357[var20][3];
						int var25 = var9.field7357[var20][4];
						int var26 = var9.field7357[var20][5];
						if (var24 != 0 || var25 != 0 || var26 != 0) {
							var18[var20].method1946(var24, var25, var26);
						}
						if (var21 != 0 || var22 != 0 || var23 != 0) {
							var18[var20].method1945(var21, var22, var23);
						}
					}
				}
			}
			class120 var27 = new class120(var18, var18.length);
			if (arg5 != null) {
				var15 = var8 | 0x4000;
			}
			var7 = arg0.method2211(var27, var15, Statics.field11222, 65, 852);
			if (arg5 != null) {
				int var28 = 0;
				label123: while (true) {
					if (var28 >= 10) {
						int var30 = 0;
						while (true) {
							if (var30 >= 10) {
								break label123;
							}
							for (int var31 = 0; var31 < Statics.field10766[var30].length; var31++) {
								if (arg5.field7895[var30] < Statics.field9259[var30][var31].length) {
									var7.method1744(Statics.field10766[var30][var31], Statics.field9259[var30][var31][arg5.field7895[var30]]);
								}
							}
							var30++;
						}
					}
					for (int var29 = 0; var29 < Statics.field7577[var28].length; var29++) {
						if (arg5.field7894[var28] < Statics.field1434[var28][var29].length) {
							var7.method1859(Statics.field7577[var28][var29], Statics.field1434[var28][var29][arg5.field7894[var28]]);
						}
					}
					var28++;
				}
			}
			if (field11221 != null) {
				var7.method1690(var8);
				field11221.method2921(var7, var13);
			}
		}
		if (arg2 == null) {
			return var7;
		} else {
			class116 var32 = var7.method1773((byte) 1, var8, true);
			arg2.method14359(var32, 0);
			return var32;
		}
	}

	@ObfuscatedName("ku.y(IB)V")
	public static void method5150(int arg0) {
		Statics.field11222 = arg0;
		field11221.method2924();
	}
}

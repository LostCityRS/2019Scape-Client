package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aqk")
public class class1130 extends class892 {

	@ObfuscatedName("aqk.cn")
	public String field12057;

	@ObfuscatedName("aqk.cv")
	public String field12062;

	@ObfuscatedName("aqk.cp")
	public int field12050;

	@ObfuscatedName("aqk.ca")
	public String field12051;

	@ObfuscatedName("aqk.cx")
	public byte field12052 = 0;

	@ObfuscatedName("aqk.cw")
	public class639 field12061;

	@ObfuscatedName("aqk.ct")
	public int[] field12054 = new int[8];

	@ObfuscatedName("aqk.cf")
	public int[] field12055 = new int[8];

	@ObfuscatedName("aqk.co")
	public int field12064 = 0;

	@ObfuscatedName("aqk.cr")
	public int field12072 = 0;

	@ObfuscatedName("aqk.cm")
	public int field12058 = -1;

	@ObfuscatedName("aqk.cq")
	public int field12059 = 0;

	@ObfuscatedName("aqk.ch")
	public int field12056 = -1;

	@ObfuscatedName("aqk.cb")
	public boolean field12053 = false;

	@ObfuscatedName("aqk.cs")
	public int field12060 = 0;

	@ObfuscatedName("aqk.cy")
	public int field12063 = -1;

	@ObfuscatedName("aqk.cc")
	public int field12049 = -1;

	@ObfuscatedName("aqk.cz")
	public int field12065 = -1;

	@ObfuscatedName("aqk.ck")
	public int field12066 = -1;

	@ObfuscatedName("aqk.cj")
	public int field12067 = 0;

	@ObfuscatedName("aqk.cd")
	public int field12068 = 255;

	@ObfuscatedName("aqk.dd")
	public int field12069;

	@ObfuscatedName("aqk.dr")
	public class202 field12070 = class202.field1950;

	@ObfuscatedName("aqk.da")
	public class643 field12071 = class643.field7918;

	@ObfuscatedName("aqk.dt")
	public boolean field12048 = false;

	public class1130(class550 arg0) {
		super(arg0, Statics.field8485);
		this.method19112();
	}

	public class1130(class550 arg0, int arg1) {
		super(arg0, arg1, Statics.field8485);
		this.method19112();
	}

	@ObfuscatedName("aqk.hq(Lalw;BI)V")
	public void method19121(class997 arg0, byte arg1) {
		this.field12052 = arg1;
		int var3 = -1;
		this.field12060 = 0;
		int[] var4 = new int[Statics.field1709.field7766.length];
		class740[] var5 = new class740[Statics.field1709.field7766.length];
		class738[] var6 = new class738[Statics.field1709.field7766.length];
		for (int var7 = 0; var7 < Statics.field1709.field7766.length; var7++) {
			if (Statics.field1709.field7766[var7] != 1) {
				int var8 = arg0.method17904();
				if (var8 == 0) {
					var4[var7] = 0;
				} else {
					int var9 = arg0.method17904();
					int var10 = (var8 << 8) + var9;
					if (var7 == 0 && var10 == 65535) {
						var3 = arg0.method17927();
						this.field12060 = arg0.method17904();
						break;
					}
					if (var10 >= 2048) {
						int var11 = var10 - 2048;
						var4[var7] = var11 | 0x40000000;
						var6[var7] = (class738) Statics.field1842.method962(var11);
						int var12 = var6[var7].field8685;
						if (var12 != 0) {
							this.field12060 = var12;
						}
					} else {
						var4[var7] = var10 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (var3 == -1) {
			int var13 = arg0.method17906();
			int var14 = 0;
			for (int var15 = 0; var15 < Statics.field1709.field7766.length; var15++) {
				if (Statics.field1709.field7766[var15] == 0) {
					if ((var13 & 0x1 << var14) != 0) {
						var5[var15] = class740.method1061(var6[var15], arg0);
					}
					var14++;
				}
			}
		}
		int[] var16 = new int[10];
		for (int var17 = 0; var17 < 10; var17++) {
			int var18 = arg0.method17904();
			if (Statics.field1434.length < 1 || var18 < 0 || var18 >= Statics.field1434[var17][0].length) {
				var18 = 0;
			}
			var16[var17] = var18;
		}
		int[] var19 = new int[10];
		for (int var20 = 0; var20 < 10; var20++) {
			int var21 = arg0.method17904();
			if (Statics.field9259.length < 1 || var21 < 0 || var21 >= Statics.field9259[var20][0].length) {
				var21 = 0;
			}
			var19[var20] = var21;
		}
		this.field12069 = arg0.method17906();
		if (this.field12061 == null) {
			this.field12061 = new class639();
		}
		int var22 = this.field12061.field7892;
		int[] var23 = this.field12061.field7894;
		this.field12061.method10113(this.method16509(), var4, var5, var16, var19, this.field12052 == 1, var3);
		if (var3 != var22) {
			class423 var24 = class423.method6484(this.method10536().field4298);
			var24.field4308 = (this.field10450[0] << 9) + (this.method16546() << 8);
			var24.field4313 = (this.field10448[0] << 9) + (this.method16546() << 8);
			this.method10531(var24);
			var24.method6486();
		}
		if (client.field10945 == this.field10406 && var23 != null) {
			for (int var25 = 0; var25 < var16.length; var25++) {
				if (var16[var25] != var23[var25]) {
					Statics.field1842.method18903();
					break;
				}
			}
		}
		if (this.field10393 != null) {
			this.field10393.method9930();
		}
		if (!this.field10432.method14346() || !this.field10432.field11877) {
			return;
		}
		class584 var26 = this.method16508();
		if (!var26.method9290(this.field10432.method14348())) {
			this.field10432.method14362(-1);
			this.field10432.field11877 = false;
		}
	}

	@ObfuscatedName("aqk.hf(Lalw;I)V")
	public final void method19129(class997 arg0) {
		arg0.field11503 = 0;
		int var2 = arg0.method17904();
		byte var3 = (byte) (var2 & 0x1);
		boolean var4 = (var2 & 0x4) != 0;
		int var5 = super.method16546();
		this.method16502((var2 >> 3 & 0x7) + 1);
		boolean var6 = (var2 & 0x40) != 0;
		class423 var7 = class423.method6484(this.method10536().field4298);
		var7.field4308 += this.method16546() - var5 << 8;
		var7.field4313 += this.method16546() - var5 << 8;
		this.method10531(var7);
		var7.method6486();
		if (var6) {
			this.field12050 = arg0.method18123();
			int var8 = var3 == 0 ? Statics.field7921.field7671 : Statics.field7921.field7670;
			this.field12051 = ((class754) Statics.field8514.method962(var8)).method14849(this.field12050);
		} else {
			this.field12050 = -1;
			this.field12051 = null;
		}
		this.field12071 = (class643) class686.method1897(class643.method10193(), arg0.method17905());
		if (Statics.field1811 == class682.field8273 && client.field10949 >= 2) {
			this.field12071 = class643.field7918;
		}
		this.method19121(arg0, var3);
		this.field12057 = arg0.method17918();
		this.field12062 = this.field12057;
		if (Statics.field4490 == this) {
			Statics.field12492 = this.field12057;
		}
		this.field12064 = arg0.method17904();
		if (var4) {
			this.field12059 = arg0.method17906();
			if (this.field12059 == 65535) {
				this.field12059 = -1;
			}
			this.field12072 = this.field12064;
			this.field12058 = -1;
		} else {
			this.field12059 = 0;
			this.field12072 = arg0.method17904();
			this.field12058 = arg0.method17904();
			if (this.field12058 == 255) {
				this.field12058 = -1;
			}
		}
		int var9 = this.field12067;
		this.field12067 = arg0.method17904();
		if (this.field12067 == 0) {
			Statics.method5142(this);
			return;
		}
		int var10 = this.field12063;
		int var11 = this.field12049;
		int var12 = this.field12065;
		int var13 = this.field12066;
		int var14 = this.field12068;
		this.field12063 = arg0.method17906();
		this.field12049 = arg0.method17906();
		this.field12065 = arg0.method17906();
		this.field12066 = arg0.method17906();
		this.field12068 = arg0.method17904();
		if (this.field12067 != var9 || this.field12063 != var10 || this.field12049 != var11 || this.field12065 != var12 || this.field12066 != var13 || this.field12068 != var14) {
			class975.method10310(this);
		}
	}

	@ObfuscatedName("aqk.hr(Lalw;I)V")
	public void method19111(class997 arg0) {
		arg0.field11503 = 0;
		int var2 = arg0.method17904();
		for (int var3 = 0; var3 < this.field12054.length; var3++) {
			if ((var2 & 0x1 << var3) == 0) {
				this.field12054[var3] = -1;
				this.field12055[var3] = -1;
			} else {
				int var4 = arg0.method17904();
				int var5 = arg0.method17906();
				this.field12054[var3] = var4;
				this.field12055[var3] = var5;
			}
		}
	}

	@ObfuscatedName("aqk.hs(B)V")
	public void method19112() {
		for (int var1 = 0; var1 < this.field12054.length; var1++) {
			this.field12054[var1] = -1;
		}
		for (int var2 = 0; var2 < this.field12055.length; var2++) {
			this.field12055[var2] = -1;
		}
	}

	@ObfuscatedName("aqk.fv(Ldh;B)Luq;")
	public class556 method17371(class133 arg0) {
		return null;
	}

	@ObfuscatedName("aqk.fc(Ldh;I)Ltl;")
	public class552 method17372(class133 arg0) {
		if (this.field12061 == null || !this.method19114(arg0, 2048)) {
			return null;
		}
		class419 var2 = arg0.method2209();
		class419 var3 = this.method10533();
		class420 var4 = this.method10536();
		int var5 = this.field10395.method316();
		class551 var6 = this.field11716.field6928[this.field11717][(int) var4.field4298.field4308 >> 9][(int) var4.field4298.field4313 >> 9];
		if (var6 == null || var6.field6974 == null) {
			this.field10408 = (int) ((float) this.field10408 - (float) this.field10408 / 10.0F);
		} else {
			int var7 = this.field10408 - var6.field6974.field12448;
			this.field10408 = (int) ((float) this.field10408 - (float) var7 / 10.0F);
		}
		var2.method6292(var3);
		var2.method6315(0.0F, (float) (-20 - this.field10408), 0.0F);
		class552 var8 = null;
		this.field10458 = false;
		if (Statics.field688.field11568.method18453() == 1) {
			class584 var9 = this.method16508();
			if (var9.field7346 && (this.field12061.field7892 == -1 || ((class260) Statics.field7961.method962(this.field12061.field7892)).field2710)) {
				class721 var10 = this.field10454.method14346() && this.field10454.method14355() ? this.field10454 : null;
				class1075 var11 = this.field10432.method14346() && (!this.field10432.field11877 || var10 == null) ? this.field10432 : null;
				short var12 = Statics.field11389.field7728;
				byte var13 = Statics.field11389.field7757;
				if (this.field12061.field7892 != -1) {
					var12 = ((class260) Statics.field7961.method962(this.field12061.field7892)).field2741;
					var13 = ((class260) Statics.field7961.method962(this.field12061.field7892)).field2702;
				}
				Object var14 = null;
				class116 var15;
				if (var12 > -1 && Statics.field688.field11538.method18426() == 1) {
					var15 = class31.method3283(arg0, var5, this.field10405, this.field12466, this.field10407, this.field10459[0], var12, var13, var11 == null ? var10 : var11);
				} else {
					var15 = class31.method5102(arg0, var5, this.field10405, this.field12466, this.field10407, 1, this.field10459[0], 0, 0, 160, 240, var11 == null ? var10 : var11);
				}
				if (var15 != null) {
					if (this.field11713 == null || this.field11713.length < this.field10459.length + 1) {
						this.method18363(this.field10459.length + 1);
					}
					var8 = class552.method16749(true);
					this.field10458 = true;
					arg0.method2219(false);
					var15.method1813(var2, this.field11713[this.field10459.length], 0);
					arg0.method2219(true);
				}
			}
		}
		if (Statics.field4490 == this) {
			for (int var16 = client.field10851.length - 1; var16 >= 0; var16--) {
				class45 var17 = client.field10851[var16];
				if (var17 != null && var17.field750 != -1) {
					if (var17.field745 == 1) {
						class984 var18 = (class984) client.field10838.method14495((long) var17.field744);
						if (var18 != null) {
							class1131 var19 = (class1131) var18.field11436;
							class423 var20 = class423.method6528(var19.method10536().field4298, Statics.field4490.method10536().field4298);
							int var21 = (int) var20.field4308;
							int var22 = (int) var20.field4313;
							this.method19113(arg0, var2, this.field10459[0], (long) var21, (long) var22, var17.field750, 92160000L);
						}
					}
					if (var17.field745 == 2) {
						class423 var23 = Statics.field4490.method10536().field4298;
						long var24 = (long) (var17.field746 * 262144 - (int) var23.field4308);
						long var26 = (long) (var17.field747 * 512 - (int) var23.field4313);
						long var28 = (long) (var17.field748 << 9);
						long var30 = var28 * var28;
						this.method19113(arg0, var2, this.field10459[0], var24, var26, var17.field750, var30);
					}
					if (var17.field745 == 10 && var17.field744 >= 0 && var17.field744 < client.field10944.length) {
						class1130 var32 = client.field10944[var17.field744];
						if (var32 != null) {
							class423 var33 = class423.method6528(var32.method10536().field4298, Statics.field4490.method10536().field4298);
							int var34 = (int) var33.field4308;
							int var35 = (int) var33.field4313;
							this.method19113(arg0, var2, this.field10459[0], (long) var34, (long) var35, var17.field750, 92160000L);
						}
					}
				}
			}
		}
		var2.method6292(var3);
		var2.method6315(0.0F, (float) (-5 - this.field10408), 0.0F);
		if (this.field11713 == null || this.field11713.length < this.field10459.length) {
			this.method18363(this.field10459.length);
		}
		if (var8 == null) {
			var8 = class552.method16749(true);
		}
		this.method16576(arg0, this.field10459, var2, false);
		for (int var36 = 0; var36 < this.field10459.length; var36++) {
			if (this.field10459[var36] == null) {
				this.field11713[var36].field1686 = false;
			} else {
				this.field10459[var36].method1813(var2, this.field11713[var36], Statics.field4490 == this ? 1 : 0);
			}
		}
		if (this.field10393 != null) {
			class119 var37 = this.field10393.method9965();
			arg0.method2198(var37);
		}
		for (int var38 = 0; var38 < this.field10459.length; var38++) {
			if (this.field10459[var38] != null) {
				this.field10458 |= this.field10459[var38].method1731();
			}
			this.field10459[var38] = null;
		}
		this.field11715 = client.field10916;
		return var8;
	}

	@ObfuscatedName("aqk.fw(Ldh;I)V")
	public void method17373(class133 arg0) {
		if (this.field12061 == null || !this.field10449 && !this.method19114(arg0, 0)) {
			return;
		}
		class419 var2 = arg0.method2209();
		var2.method6293(this.method10536());
		var2.method6315(0.0F, -5.0F, 0.0F);
		this.method16576(arg0, this.field10459, var2, this.field10449);
		for (int var3 = 0; var3 < this.field10459.length; var3++) {
			this.field10459[var3] = null;
		}
	}

	@ObfuscatedName("aqk.hh(Ldh;Lou;Ldo;JJIJ)V")
	public void method19113(class133 arg0, class419 arg1, class116 arg2, long arg3, long arg4, int arg5, long arg6) {
		long var11 = arg3 * arg3 + arg4 * arg4;
		if (var11 < 262144L || var11 > arg6) {
			return;
		}
		int var13 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.field10395.method316()) & 0x3FFF;
		class116 var14 = Statics.method5210(arg0, var13, this.field10405, this.field12466, this.field10407, arg5);
		if (var14 != null) {
			arg0.method2219(false);
			var14.method1813(arg1, null, 0);
			arg0.method2219(true);
		}
	}

	@ObfuscatedName("aqk.hp(Ldh;IB)Z")
	public boolean method19114(class133 arg0, int arg1) {
		int var3 = arg1;
		class584 var4 = this.method16508();
		class721 var5 = this.field10454.method14346() && !this.field10454.method14355() ? this.field10454 : null;
		class1075 var6 = !this.field10432.method14346() || this.field12053 || this.field10432.field11877 && var5 != null ? null : this.field10432;
		int var7 = var4.field7342;
		int var8 = var4.field7343;
		if (var7 != 0 || var8 != 0 || var4.field7355 != 0 || var4.field7358 != 0) {
			arg1 |= 0x7;
		}
		int var9 = this.field10395.method316();
		boolean var10 = this.field10437 != 0 && client.field10903 >= this.field10446 && client.field10903 < this.field10464;
		if (var10) {
			arg1 |= 0x80000;
		}
		class116 var11 = this.field10459[0] = this.field12061.method10126(arg0, arg1, Statics.field11742, Statics.field2628, Statics.field7961, Statics.field1842, Statics.field7410, Statics.field7410, var5, var6, this.field10398, this.field10442, var9, true, Statics.field1709);
		int var12 = Statics.method18304();
		if (class507.field6616 < 96 && var12 > 50) {
			class43.method7319();
		}
		if (Statics.field1811 != class682.field8273 && var12 < 50) {
			int var13 = 50 - var12;
			while (var13 > client.field10798) {
				Statics.field9166[client.field10798] = new byte[102400];
				client.field10798++;
			}
			while (var13 < client.field10798) {
				client.field10798--;
				Statics.field9166[client.field10798] = null;
			}
		} else if (Statics.field1811 != class682.field8273) {
			Statics.field9166 = new byte[50][];
			client.field10798 = 0;
		}
		if (var11 == null) {
			return false;
		}
		this.field10463 = var11.method1748();
		this.field10420 = var11.method1707();
		var11.method1728();
		this.method16505(var11);
		if (var7 == 0 && var8 == 0) {
			this.method16507(var9, this.method16546() << 9, this.method16546() << 9, 0, 0);
		} else {
			this.method16507(var9, var7, var8, var4.field7344, var4.field7323);
			if (this.field10405 != 0) {
				var11.method1852(this.field10405);
			}
			if (this.field12466 != 0) {
				var11.method1696(this.field12466);
			}
			if (this.field10407 != 0) {
				var11.method1805(0, this.field10407, 0);
			}
		}
		if (var10) {
			var11.method1745(this.field10434, this.field10435, this.field10436, this.field10437 & 0xFF);
		}
		if (!this.field12053) {
			this.method16506(arg0, var4, var3, var7, var8, var9);
		}
		return true;
	}

	@ObfuscatedName("aqk.hy(ZB)Ljava/lang/String;")
	public String method19115(boolean arg0) {
		String var2 = arg0 ? this.field12057 : this.field12062;
		return this.field12051 == null ? var2 : this.field12051.replaceAll(class9.field428, var2);
	}

	@ObfuscatedName("aqk.he(ZI)Ljava/lang/String;")
	public String method19116(boolean arg0) {
		return arg0 ? this.field12057 : this.field12062;
	}

	@ObfuscatedName("aqk.hn(IIBB)V")
	public final void method19117(int arg0, int arg1, byte arg2) {
		if (this.field10454.method14346() && this.field10454.method14347().field1782 == 1) {
			this.field10427 = null;
			this.field10454.method14362(-1);
		}
		for (int var4 = 0; var4 < this.field10422.length; var4++) {
			if (this.field10422[var4].field6657 != -1) {
				class680 var5 = (class680) Statics.field4874.method962(this.field10422[var4].field6657);
				if (var5.field8261 && var5.field8260 != -1 && ((class164) Statics.field8797.method962(var5.field8260)).field1782 == 1) {
					this.field10422[var4].field6659.method14362(-1);
					this.field10422[var4].field6657 = -1;
				}
			}
		}
		this.field12056 = -1;
		if (arg0 < 0 || arg0 >= client.field10855.method7728() || arg1 < 0 || arg1 >= client.field10855.method7758()) {
			this.method19118(arg0, arg1);
		} else if (this.field10450[0] >= 0 && this.field10450[0] < client.field10855.method7728() && this.field10448[0] >= 0 && this.field10448[0] < client.field10855.method7758()) {
			this.method19138(arg0, arg1, arg2);
		} else {
			this.method19118(arg0, arg1);
		}
	}

	@ObfuscatedName("aqk.hi(IIB)V")
	public void method19118(int arg0, int arg1) {
		this.field10400 = 0;
		this.field10396 = 0;
		this.field10453 = 0;
		this.field10450[0] = arg0;
		this.field10448[0] = arg1;
		int var3 = this.method16546();
		class423 var4 = class423.method6484(this.method10536().field4298);
		var4.field4308 = this.field10450[0] * 512 + var3 * 256;
		var4.field4313 = this.field10448[0] * 512 + var3 * 256;
		this.method10531(var4);
		var4.method6486();
		if (Statics.field4490 == this) {
			client.field10855.method7816().method10019();
		}
		if (this.field10393 != null) {
			this.field10393.method9930();
		}
	}

	@ObfuscatedName("aqk.hw(IIBI)V")
	public final void method19138(int arg0, int arg1, byte arg2) {
		if (this.field10400 < this.field10450.length - 1) {
			this.field10400++;
		}
		for (int var4 = this.field10400; var4 > 0; var4--) {
			this.field10450[var4] = this.field10450[var4 - 1];
			this.field10448[var4] = this.field10448[var4 - 1];
			this.field10441[var4] = this.field10441[var4 - 1];
		}
		this.field10450[0] = arg0;
		this.field10448[0] = arg1;
		this.field10441[0] = arg2;
	}

	@ObfuscatedName("aqk.ht(I)Z")
	public final boolean method19119() {
		return this.field12061 != null;
	}

	@ObfuscatedName("aqk.bz(I)I")
	public int method16546() {
		return this.field12061 == null || this.field12061.field7892 == -1 ? super.method16546() : ((class260) Statics.field7961.method962(this.field12061.field7892)).field2699;
	}

	@ObfuscatedName("aqk.bj(S)I")
	public int method16509() {
		return this.field12069;
	}

	@ObfuscatedName("aqk.bs(B)I")
	public int method16486() {
		return -1;
	}

	@ObfuscatedName("aqk.fa(Ldh;IIB)Z")
	public boolean method17375(class133 arg0, int arg1, int arg2) {
		if (this.field12061 == null || !this.method19114(arg0, 131072)) {
			return false;
		}
		class419 var4 = this.method10533();
		boolean var5 = false;
		for (int var6 = 0; var6 < this.field10459.length; var6++) {
			if (this.field10459[var6] != null && this.field10459[var6].field1298 && this.field10459[var6].method1725(arg1, arg2, var4, true, 0)) {
				var5 = true;
				break;
			}
		}
		for (int var7 = 0; var7 < this.field10459.length; var7++) {
			this.field10459[var7] = null;
		}
		return var5;
	}

	@ObfuscatedName("aqk.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("aqk.fq(Ldh;Lalh;IIIZB)V")
	public final void method17377(class133 arg0, class1019 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aqk.ff(B)V")
	public final void method17378() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aqk.cg(I)Z")
	public boolean method16512() {
		return Statics.field11389.field7737;
	}

	@ObfuscatedName("aqk.ce(I)Lsu;")
	public class517 method16513() {
		if (this.field10409 != null) {
			if (this.field10409.field6682 == null) {
				return null;
			}
			if (client.field11050 == 0 || client.field11050 == 3 || client.field11050 == 1 && client.method3060(this.field12062)) {
				return this.field10409;
			}
		}
		return null;
	}

	@ObfuscatedName("aqk.hc(Ljava/lang/String;III)V")
	public void method19124(String arg0, int arg1, int arg2) {
		this.method16510(arg0, arg1, arg2, class507.method6016() * Statics.field11389.field7759);
	}

	@ObfuscatedName("aqk.e(I)Ljl;")
	public class272 method4675() {
		return class272.field2838;
	}

	@ObfuscatedName("aqk.n(I)I")
	public int method4670() {
		return this.field10406;
	}

	@ObfuscatedName("aqk.m(B)Lakt;")
	public class994 method4667() {
		class594 var1 = client.field10855.method7727();
		return class994.method258(this.field11717, (int) this.method10536().field4298.field4308 + var1.field7426 * 512, -((int) this.method10536().field4298.field4311), (int) this.method10536().field4298.field4313 + var1.field7427 * 512);
	}

	@ObfuscatedName("aqk.k(I)Lov;")
	public class421 method4668() {
		class421 var1 = class421.method6469();
		var1.method6415(class417.method6277(this.field10395.field528), 0.0F, 0.0F);
		return var1;
	}

	@ObfuscatedName("aqk.f(B)Lox;")
	public class423 method4666() {
		return class423.method6482();
	}

	@ObfuscatedName("aqk.cx(I)I")
	public int method16578() {
		return -this.field10406 - 1;
	}
}

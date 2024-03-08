package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aqc")
public class class1131 extends class892 {

	@ObfuscatedName("aqc.cn")
	public class260 field12083;

	@ObfuscatedName("aqc.cv")
	public int field12074 = -1;

	@ObfuscatedName("aqc.cp")
	public int field12075 = -1;

	@ObfuscatedName("aqc.ca")
	public class259 field12076;

	@ObfuscatedName("aqc.cx")
	public static int field12077 = 1;

	@ObfuscatedName("aqc.cw")
	public static int field12078 = 1;

	@ObfuscatedName("aqc.ct")
	public int field12079 = -1;

	@ObfuscatedName("aqc.cf")
	public class258 field12080;

	@ObfuscatedName("aqc.co")
	public int field12081;

	@ObfuscatedName("aqc.cr")
	public String field12082;

	@ObfuscatedName("aqc.cm")
	public int[] field12087 = new int[6];

	@ObfuscatedName("aqc.cq")
	public int[] field12084 = new int[6];

	@ObfuscatedName("aqc.ch")
	public int field12073;

	@ObfuscatedName("aqc.cb")
	public int field12086;

	@ObfuscatedName("aqc.cs")
	public int field12088;

	@ObfuscatedName("aqc.cy")
	public int field12089;

	@ObfuscatedName("aqc.cc")
	public int field12090;

	@ObfuscatedName("aqc.cz")
	public boolean field12085;

	public class1131(class550 arg0) {
		super(arg0, Statics.field8135);
		this.method19184();
	}

	public class1131(class550 arg0, int arg1) {
		super(arg0, arg1, Statics.field8135);
		this.method19184();
	}

	@ObfuscatedName("aqc.hq(B)V")
	public void method19155() {
		this.field10433 = 255;
		this.field10438 = client.field10903;
	}

	@ObfuscatedName("aqc.hf(I)V")
	public void method19184() {
		this.field12073 = (int) (Math.random() * 4.0D) + 32;
		this.field12086 = (int) (Math.random() * 2.0D) + 3;
		this.field12088 = (int) (Math.random() * 3.0D) + 16;
		if (Statics.field688.field11538.method18426() == 1) {
			this.field12089 = (int) (Math.random() * 6.0D);
		} else {
			this.field12089 = (int) (Math.random() * 12.0D);
		}
	}

	@ObfuscatedName("aqc.hr(Lif;I)V")
	public void method19156(class260 arg0) {
		this.method19157(arg0, true, true, true);
	}

	@ObfuscatedName("aqc.hs(Lif;ZZZS)V")
	public void method19157(class260 arg0, boolean arg1, boolean arg2, boolean arg3) {
		if (this.field12083 != arg0 && class22.field562 && class22.method8494(this.field10406)) {
			class22.method6031();
		}
		this.field12083 = arg0;
		if (this.field12083 != null) {
			if (arg1) {
				this.field12082 = this.field12083.field2703;
			}
			if (arg2) {
				this.field12081 = this.field12083.field2719;
			}
			if (arg3) {
				this.field12080 = null;
			}
		}
		if (this.field10393 != null) {
			this.field10393.method9930();
		}
	}

	@ObfuscatedName("aqc.fv(Ldh;B)Luq;")
	public class556 method17371(class133 arg0) {
		return null;
	}

	@ObfuscatedName("aqc.fc(Ldh;I)Ltl;")
	public class552 method17372(class133 arg0) {
		if (this.field12083 == null || !this.method19167(arg0, 526336)) {
			return null;
		}
		class419 var2 = this.method10533();
		class420 var3 = this.method10536();
		class419 var4 = arg0.method2209();
		int var5 = this.field10395.method316();
		class551 var6 = this.field11716.field6928[this.field11717][(int) var3.field4298.field4308 >> 9][(int) var3.field4298.field4313 >> 9];
		if (var6 == null || var6.field6974 == null) {
			this.field10408 = (int) ((float) this.field10408 - (float) this.field10408 / 10.0F);
		} else {
			int var7 = this.field10408 - var6.field6974.field12448;
			this.field10408 = (int) ((float) this.field10408 - (float) var7 / 10.0F);
		}
		var4.method6292(var2);
		var4.method6315(0.0F, (float) (-20 - this.field10408), 0.0F);
		class584 var8 = this.method16508();
		class260 var9 = this.field12083.field2735 == null ? this.field12083 : this.field12083.method4547(Statics.field7410, Statics.field7410);
		boolean var10 = var9.field2724 != null;
		this.field10458 = false;
		class552 var11 = null;
		if (Statics.field688.field11568.method18453() == 1 && var9.field2710 && var8.field7346) {
			class721 var12 = this.field10454.method14346() && this.field10454.method14355() ? this.field10454 : null;
			class1075 var13 = this.field10432.method14346() && (!this.field10432.field11877 || var12 == null) ? this.field10432 : null;
			short var14 = Statics.field11389.field7728;
			byte var15 = Statics.field11389.field7757;
			if (this.field12083.field2741 > -1) {
				var14 = this.field12083.field2741;
				var15 = this.field12083.field2702;
			}
			class116 var16;
			if (var14 > -1 && Statics.field688.field11538.method18426() == 1) {
				var16 = class31.method3283(arg0, var5, this.field10405, this.field12466, this.field10407, this.field10459[0], var14, var15, var13 == null ? var12 : var13);
			} else {
				var16 = class31.method5102(arg0, var5, this.field10405, this.field12466, this.field10407, this.field12083.field2699, this.field10459[0], this.field12083.field2737 & 0xFFFF, this.field12083.field2729 & 0xFFFF, this.field12083.field2739 & 0xFF, this.field12083.field2740 & 0xFF, var13 == null ? var12 : var13);
			}
			if (var16 != null) {
				var11 = class552.method16749(this.method19162());
				this.field10458 = true;
				arg0.method2219(false);
				if (var10) {
					var16.method1813(var4, null, 0);
				} else {
					if (this.field11713 == null || this.field11713.length < this.field10459.length + 1) {
						this.method18363(this.field10459.length + 1);
					}
					var16.method1813(var4, this.field11713[this.field10459.length], 0);
				}
				arg0.method2219(true);
			}
		}
		if (var10) {
			if (this.field11713 == null || this.field11713.length > 1) {
				this.method18363(1);
			}
			arg0.method2193(var4, this.field11713[0], var9.field2724);
		} else if (this.field11713 == null || this.field11713.length < this.field10459.length) {
			this.method18363(this.field10459.length);
		}
		if (var11 == null) {
			var11 = class552.method16749(this.method19162());
		}
		this.method16576(arg0, this.field10459, var4, false);
		for (int var17 = 0; var17 < this.field10459.length; var17++) {
			if (this.field10459[var17] != null) {
				if (this.field12083.field2766) {
					this.field10459[var17].method1745(this.field12073, this.field12086, this.field12088, this.field12089);
				}
				if (var10) {
					this.field10459[var17].method1813(var4, null, 0);
				} else {
					this.field10459[var17].method1813(var4, this.field11713[var17], 0);
				}
			} else if (!var10) {
				this.field11713[var17].field1686 = false;
			}
		}
		if (this.field10393 != null) {
			class119 var18 = this.field10393.method9965();
			arg0.method2198(var18);
		}
		for (int var19 = 0; var19 < this.field10459.length; var19++) {
			if (this.field10459[var19] != null) {
				this.field10458 |= this.field10459[var19].method1731();
			}
			this.field10459[var19] = null;
		}
		this.field11715 = client.field10916;
		return var11;
	}

	@ObfuscatedName("aqc.hh(Ldh;II)Z")
	public boolean method19167(class133 arg0, int arg1) {
		int var3 = arg1;
		class584 var4 = this.method16508();
		class721 var5 = this.field10454.method14346() && !this.field10454.method14355() ? this.field10454 : null;
		class1075 var6 = this.field10432.method14346() && (!this.field10432.field11877 || var5 == null) ? this.field10432 : null;
		int var7 = var4.field7342;
		int var8 = var4.field7343;
		if (var7 != 0 || var8 != 0 || var4.field7355 != 0 || var4.field7358 != 0) {
			arg1 |= 0x7;
		}
		boolean var9 = this.field10437 != 0 && client.field10903 >= this.field10446 && client.field10903 < this.field10464;
		if (var9) {
			arg1 |= 0x80000;
		}
		boolean var10 = false;
		if (this.field10433 != 0) {
			class260 var11 = this.field12083.field2735 == null ? this.field12083 : this.field12083.method4547(Statics.field7410, Statics.field7410);
			if (var11 == null || client.field10903 >= this.field10438 + var11.field2765) {
				this.field10433 = 0;
			} else {
				this.field10433 = 255 - (client.field10903 - this.field10438) * 255 / var11.field2765;
				var10 = true;
			}
		}
		if (var10) {
			arg1 |= 0x100;
		}
		int var12 = this.field10395.method316();
		class116 var13 = this.field10459[0] = this.field12083.method4543(arg0, arg1, Statics.field11742, Statics.field7410, Statics.field7410, var5, var6, this.field10398, this.field10442, var12, this.field12076, this.method16509(), false);
		if (var13 == null) {
			return false;
		}
		this.field10463 = var13.method1748();
		this.field10420 = var13.method1707();
		var13.method1728();
		this.method16505(var13);
		if (var7 == 0 && var8 == 0) {
			this.method16507(var12, this.method16546() << 9, this.method16546() << 9, 0, 0);
		} else {
			this.method16507(var12, var7, var8, var4.field7344, var4.field7323);
			if (this.field10405 != 0) {
				this.field10459[0].method1852(this.field10405);
			}
			if (this.field12466 != 0) {
				this.field10459[0].method1696(this.field12466);
			}
			if (this.field10407 != 0) {
				this.field10459[0].method1805(0, this.field10407, 0);
			}
		}
		if (var9) {
			var13.method1745(this.field10434, this.field10435, this.field10436, this.field10437 & 0xFF);
		}
		if (var10) {
			var13.method1747((byte) this.field10433, null);
		}
		this.method16506(arg0, var4, var3, var7, var8, var12);
		return true;
	}

	@ObfuscatedName("aqc.fw(Ldh;I)V")
	public void method17373(class133 arg0) {
		if (this.field12083 == null || !this.field10449 && !this.method19167(arg0, 0)) {
			return;
		}
		class419 var2 = arg0.method2209();
		var2.method6292(this.method10533());
		var2.method6315(0.0F, -5.0F, 0.0F);
		this.method16576(arg0, this.field10459, var2, this.field10449);
		for (int var3 = 0; var3 < this.field10459.length; var3++) {
			this.field10459[var3] = null;
		}
	}

	@ObfuscatedName("aqc.hp(Lzi;II)V")
	public final void method19168(class689 arg0, int arg1) {
		int var3 = this.field10450[0];
		int var4 = this.field10448[0];
		switch(arg0.field8304) {
			case 0:
				var4--;
				break;
			case 1:
				var3--;
				break;
			case 2:
				var3--;
				var4++;
				break;
			case 3:
				var3++;
				break;
			case 4:
				var3--;
				var4--;
				break;
			case 5:
				var3++;
				var4--;
				break;
			case 6:
				var3++;
				var4++;
				break;
			case 7:
				var4++;
		}
		if (this.field10454.method14346() && this.field10454.method14347().field1782 == 1) {
			this.field10427 = null;
			this.field10454.method14362(-1);
		}
		for (int var5 = 0; var5 < this.field10422.length; var5++) {
			if (this.field10422[var5].field6657 != -1) {
				class680 var6 = (class680) Statics.field4874.method962(this.field10422[var5].field6657);
				if (var6.field8261 && var6.field8260 != -1 && ((class164) Statics.field8797.method962(var6.field8260)).field1782 == 1) {
					this.field10422[var5].field6659.method14362(-1);
					this.field10422[var5].field6657 = -1;
				}
			}
		}
		if (this.field10400 < this.field10450.length - 1) {
			this.field10400++;
		}
		for (int var7 = this.field10400; var7 > 0; var7--) {
			this.field10450[var7] = this.field10450[var7 - 1];
			this.field10448[var7] = this.field10448[var7 - 1];
			this.field10441[var7] = this.field10441[var7 - 1];
		}
		this.field10450[0] = var3;
		this.field10448[0] = var4;
		this.field10441[0] = (byte) arg1;
	}

	@ObfuscatedName("aqc.hy(IIIZIB)V")
	public void method19159(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		this.field11717 = this.field11714 = (byte) arg0;
		if (client.field10855.method7793().method7105(arg1, arg2)) {
			this.field11714++;
		}
		if (this.field10454.method14346() && this.field10454.method14347().field1782 == 1) {
			this.field10427 = null;
			this.field10454.method14362(-1);
		}
		for (int var6 = 0; var6 < this.field10422.length; var6++) {
			if (this.field10422[var6].field6657 != -1) {
				class680 var7 = (class680) Statics.field4874.method962(this.field10422[var6].field6657);
				if (var7.field8261 && var7.field8260 != -1 && ((class164) Statics.field8797.method962(var7.field8260)).field1782 == 1) {
					this.field10422[var6].field6659.method14362(-1);
					this.field10422[var6].field6657 = -1;
				}
			}
		}
		if (!arg3) {
			int var8 = arg1 - this.field10450[0];
			int var9 = arg2 - this.field10448[0];
			if (var8 >= -8 && var8 <= 8 && var9 >= -8 && var9 <= 8) {
				if (this.field10400 < this.field10450.length - 1) {
					this.field10400++;
				}
				for (int var10 = this.field10400; var10 > 0; var10--) {
					this.field10450[var10] = this.field10450[var10 - 1];
					this.field10448[var10] = this.field10448[var10 - 1];
					this.field10441[var10] = this.field10441[var10 - 1];
				}
				this.field10450[0] = arg1;
				this.field10448[0] = arg2;
				this.field10441[0] = class690.field8315.field8313;
				return;
			}
		}
		this.field10400 = 0;
		this.field10396 = 0;
		this.field10453 = 0;
		this.field10450[0] = arg1;
		this.field10448[0] = arg2;
		class423 var11 = class423.method6484(this.method10536().field4298);
		var11.field4308 = (this.field10450[0] << 9) + (arg4 << 8);
		var11.field4313 = (this.field10448[0] << 9) + (arg4 << 8);
		this.method10531(var11);
		var11.method6486();
		if (this.field10393 != null) {
			this.field10393.method9930();
		}
	}

	@ObfuscatedName("aqc.he(I)Z")
	public final boolean method19160() {
		return this.field12083 != null;
	}

	@ObfuscatedName("aqc.bj(S)I")
	public int method16509() {
		if (this.field12079 != -1) {
			return this.field12079;
		}
		if (this.field12083.field2735 != null) {
			class260 var1 = this.field12083.method4547(Statics.field7410, Statics.field7410);
			if (var1 != null && var1.field2762 != -1) {
				return var1.field2762;
			}
		}
		return this.field12083.field2762;
	}

	@ObfuscatedName("aqc.bs(B)I")
	public int method16486() {
		if (this.field12083.field2735 != null) {
			class260 var1 = this.field12083.method4547(Statics.field7410, Statics.field7410);
			if (var1 != null && var1.field2706 != -1) {
				return var1.field2706;
			}
		}
		return this.field12083.field2706;
	}

	@ObfuscatedName("aqc.bo(I)I")
	public int method16501() {
		if (this.field12083.field2735 != null) {
			class260 var1 = this.field12083.method4547(Statics.field7410, Statics.field7410);
			if (var1 != null && var1.field2754 != -1) {
				return var1.field2754;
			}
		}
		return this.field12083.field2754 == -1 ? super.method16501() : this.field12083.field2754;
	}

	@ObfuscatedName("aqc.hn(I)Z")
	public boolean method19162() {
		return this.field12085 || this.field12083.field2734;
	}

	@ObfuscatedName("aqc.gp(I)I")
	public int method18371() {
		return this.field12083 == null ? 0 : this.field12083.field2713;
	}

	@ObfuscatedName("aqc.fa(Ldh;IIB)Z")
	public boolean method17375(class133 arg0, int arg1, int arg2) {
		if (this.field12083 == null) {
			return false;
		} else if (this.field12083.field2724 != null) {
			return arg0.method2191(arg1, arg2, this.method10533(), this.field12083.field2724);
		} else if (this.method19167(arg0, 131072)) {
			class419 var4 = this.method10533();
			boolean var5 = false;
			for (int var6 = 0; var6 < this.field10459.length; var6++) {
				if (this.field10459[var6] != null && this.field10459[var6].field1298) {
					boolean var10000;
					label52: {
						label51: {
							if (this.field12083.field2713 <= 0) {
								if (this.field12083.field2759 == -1) {
									if (this.field12083.field2699 != 1) {
										break label51;
									}
								} else if (this.field12083.field2759 != 1) {
									break label51;
								}
							}
							var10000 = true;
							break label52;
						}
						var10000 = false;
					}
					boolean var7 = var10000;
					boolean var8 = this.field10459[var6].method1725(arg1, arg2, var4, var7, this.field12083.field2713);
					if (var8) {
						var5 = true;
						break;
					}
				}
			}
			for (int var9 = 0; var9 < this.field10459.length; var9++) {
				this.field10459[var9] = null;
			}
			return var5;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aqc.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("aqc.fq(Ldh;Lalh;IIIZB)V")
	public final void method17377(class133 arg0, class1019 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aqc.ff(B)V")
	public final void method17378() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aqc.hi(IB)I")
	public int method19163(int arg0) {
		return this.field12087[arg0];
	}

	@ObfuscatedName("aqc.hw(IB)I")
	public int method19164(int arg0) {
		return this.field12084[arg0];
	}

	@ObfuscatedName("aqc.ht(IIIB)V")
	public void method19165(int arg0, int arg1, int arg2) {
		this.field12087[arg0] = arg1;
		this.field12084[arg0] = arg2;
	}

	@ObfuscatedName("aqc.cg(I)Z")
	public boolean method16512() {
		return Statics.field11389.field7735;
	}

	@ObfuscatedName("aqc.ce(I)Lsu;")
	public class517 method16513() {
		return this.field10409 != null && this.field10409.field6682 == null ? null : this.field10409;
	}

	@ObfuscatedName("aqc.hc(Ljava/lang/String;III)V")
	public void method19166(String arg0, int arg1, int arg2) {
		int var4 = class507.method6016() * Statics.field11389.field7754;
		this.method16510(arg0, arg1, arg2, var4);
	}

	@ObfuscatedName("aqc.cx(I)I")
	public int method16578() {
		return this.field10406 + 1;
	}

	@ObfuscatedName("aqc.e(I)Ljl;")
	public class272 method4675() {
		return class272.field2839;
	}

	@ObfuscatedName("aqc.n(I)I")
	public int method4670() {
		return this.field10406;
	}

	@ObfuscatedName("aqc.m(B)Lakt;")
	public class994 method4667() {
		class594 var1 = client.field10855.method7727();
		return class994.method258(this.field11717, (int) this.method10536().field4298.field4308 + var1.field7426 * 512, -((int) this.method10536().field4298.field4311), (int) this.method10536().field4298.field4313 + var1.field7427 * 512);
	}

	@ObfuscatedName("aqc.k(I)Lov;")
	public class421 method4668() {
		class421 var1 = class421.method6469();
		var1.method6415(class417.method6277(this.field10395.field528), 0.0F, 0.0F);
		return var1;
	}

	@ObfuscatedName("aqc.f(B)Lox;")
	public class423 method4666() {
		return class423.method6482();
	}

	@ObfuscatedName("aqc.gc(I)Z")
	public boolean method18359() {
		return this.field12083.field2735 == null || this.field12083.method4547(Statics.field7410, Statics.field7410) != null;
	}
}

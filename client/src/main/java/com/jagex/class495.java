package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

@ObfuscatedName("rl")
public class class495 {

	@ObfuscatedName("rl.e")
	public boolean field5036;

	@ObfuscatedName("rl.n")
	public class496 field5019;

	@ObfuscatedName("rl.m")
	public class496 field5020;

	@ObfuscatedName("rl.k")
	public class254 field5021;

	@ObfuscatedName("rl.f")
	public class938 field5033;

	@ObfuscatedName("rl.w")
	public class938 field5023;

	@ObfuscatedName("rl.l")
	public class594 field5018 = new class594();

	@ObfuscatedName("rl.u")
	public class594 field5025 = new class594();

	@ObfuscatedName("rl.z")
	public int field5022;

	@ObfuscatedName("rl.p")
	public int field5059;

	@ObfuscatedName("rl.d")
	public int field5028;

	@ObfuscatedName("rl.c")
	public int field5043;

	@ObfuscatedName("rl.r")
	public class550 field5030;

	@ObfuscatedName("rl.v")
	public class636 field5062;

	@ObfuscatedName("rl.o")
	public class451 field5032;

	@ObfuscatedName("rl.s")
	public int field5042;

	@ObfuscatedName("rl.y")
	public int field5034;

	@ObfuscatedName("rl.q")
	public class1183 field5035;

	@ObfuscatedName("rl.x")
	public class539 field5058;

	@ObfuscatedName("rl.b")
	public class493 field5050 = new class493(0, 0, 0, 0);

	@ObfuscatedName("rl.h")
	public float field5038;

	@ObfuscatedName("rl.a")
	public class1090 field5039;

	@ObfuscatedName("rl.g")
	public int[][] field5040;

	@ObfuscatedName("rl.i")
	public int[][] field5041;

	@ObfuscatedName("rl.j")
	public byte[][][] field5029;

	@ObfuscatedName("rl.t")
	public class491 field5026;

	@ObfuscatedName("rl.ae")
	public int field5044 = 0;

	@ObfuscatedName("rl.ag")
	public int field5045 = 1;

	@ObfuscatedName("rl.ah")
	public int field5046 = 0;

	@ObfuscatedName("rl.al")
	public int field5047 = 1;

	@ObfuscatedName("rl.ac")
	public int field5048;

	@ObfuscatedName("rl.ai")
	public int field5049 = 0;

	@ObfuscatedName("rl.aw")
	public int[] field5054;

	@ObfuscatedName("rl.as")
	public int[] field5051;

	@ObfuscatedName("rl.at")
	public byte[][] field5052;

	@ObfuscatedName("rl.ad")
	public byte[][] field5053;

	@ObfuscatedName("rl.am")
	public byte[][] field5024;

	@ObfuscatedName("rl.au")
	public byte[][] field5055;

	@ObfuscatedName("rl.ar")
	public byte[][] field5031;

	@ObfuscatedName("rl.ap")
	public int[][][] field5057;

	@ObfuscatedName("rl.aq")
	public boolean field5037 = false;

	@ObfuscatedName("rl.ax")
	public long field5056;

	@ObfuscatedName("rl.av")
	public long field5060 = -1L;

	@ObfuscatedName("rl.ao")
	public HashMap field5061 = new HashMap();

	@ObfuscatedName("rl.aj")
	public int field5027;

	public class495(boolean arg0) {
		this.field5036 = arg0;
	}

	@ObfuscatedName("rl.e(I)Lrc;")
	public class496 method7828() {
		return this.field5019;
	}

	@ObfuscatedName("rl.n(I)Lrg;")
	public class491 method7724() {
		return this.field5026;
	}

	@ObfuscatedName("rl.m(I)I")
	public int method7725() {
		return 100 - this.field5044 * 100 / this.field5045;
	}

	@ObfuscatedName("rl.k(I)I")
	public int method7726() {
		return 100 - this.field5046 * 100 / this.field5047;
	}

	@ObfuscatedName("rl.f(I)Lve;")
	public class594 method7727() {
		return this.field5018;
	}

	@ObfuscatedName("rl.w(I)I")
	public int method7728() {
		return this.field5028;
	}

	@ObfuscatedName("rl.l(S)I")
	public int method7758() {
		return this.field5043;
	}

	@ObfuscatedName("rl.u(I)Ltw;")
	public class539 method7871() {
		return this.field5058;
	}

	@ObfuscatedName("rl.z(B)Lre;")
	public class493 method7722() {
		return this.field5050;
	}

	@ObfuscatedName("rl.p(I)F")
	public float method7732() {
		return this.field5038;
	}

	@ObfuscatedName("rl.d(I)I")
	public int method7760() {
		return this.field5042;
	}

	@ObfuscatedName("rl.c(I)I")
	public int method7734() {
		return this.field5034;
	}

	@ObfuscatedName("rl.r(I)Ltx;")
	public class550 method7743() {
		return this.field5030;
	}

	@ObfuscatedName("rl.v(II)[[B")
	public byte[][] method7736(int arg0) {
		return this.field5023 == null || this.field5023.field4517 == null || this.field5023.field4517[arg0] == null ? (byte[][]) null : this.field5023.field4517[arg0];
	}

	@ObfuscatedName("rl.o(I)Lqx;")
	public class451 method7793() {
		return this.field5032;
	}

	@ObfuscatedName("rl.s(B)Lxu;")
	public class636 method7816() {
		return this.field5062;
	}

	@ObfuscatedName("rl.y(I)Laop;")
	public class1090 method7750() {
		return this.field5039;
	}

	@ObfuscatedName("rl.q(I)[[I")
	public int[][] method7740() {
		return this.field5040;
	}

	@ObfuscatedName("rl.x(B)[[I")
	public int[][] method7858() {
		return this.field5041;
	}

	@ObfuscatedName("rl.b(B)[[[B")
	public byte[][][] method7742() {
		return this.field5029;
	}

	@ObfuscatedName("rl.h([[[BI)V")
	public void method7775(byte[][][] arg0) {
		this.field5029 = arg0;
	}

	@ObfuscatedName("rl.a(I)Laih;")
	public class938 method7744() {
		return this.field5023;
	}

	@ObfuscatedName("rl.g(Laop;I)V")
	public void method7733(class1090 arg0) {
		this.field5039 = arg0;
	}

	@ObfuscatedName("rl.i(B)V")
	public void method7746() {
		this.field5018 = new class594();
		this.field5059 = 0;
		this.field5022 = 0;
	}

	@ObfuscatedName("rl.j(B)V")
	public void method7747() {
		if (this.field5030 != null) {
			Statics.method15000();
			this.field5061 = this.field5030.method8733();
			this.field5030.field6959.method8680();
			this.field5030 = null;
		}
	}

	@ObfuscatedName("rl.t(I)V")
	public void method7729() {
		this.field5026 = class491.field5007;
		this.field5044 = 0;
		this.field5045 = 1;
		this.field5046 = 0;
		this.field5047 = 1;
		this.field5048 = 0;
	}

	@ObfuscatedName("rl.ae(ZI)V")
	public void method7737(boolean arg0) {
		class660 var2 = null;
		if (this.field5062 != null && arg0) {
			var2 = this.field5062.method9981();
		}
		this.field5062 = new class636(Statics.field8198, Statics.field10317, this.field5028 >> 3, this.field5043 >> 3);
		if (var2 != null) {
			this.field5062.method9980(this, var2, 0);
		}
	}

	@ObfuscatedName("rl.ag(I)V")
	public void method7730() {
		this.field5062.method9980(this, null, 0);
	}

	@ObfuscatedName("rl.ah(B)V")
	public void method7820() {
		this.field5042 = 200;
		if (this.field5028 == 0) {
			this.field5034 = 430;
		} else {
			this.field5034 = (int) ((double) (this.field5028) * 34.46D);
		}
		this.field5034 <<= 0x2;
		if (Statics.field8198.method2130()) {
			this.field5034 += 512;
		}
	}

	@ObfuscatedName("rl.al(Lrl;I)V")
	public void method7752(class495 arg0) {
		boolean var2 = arg0.field5036;
		arg0.field5036 = this.field5036;
		this.field5036 = var2;
		class496 var3 = arg0.field5020;
		arg0.field5020 = this.field5020;
		this.field5020 = var3;
		arg0.field5025 = this.field5018;
		this.field5025 = arg0.field5018;
		this.field5062.method9992(arg0.method7816());
	}

	@ObfuscatedName("rl.ac(B)V")
	public void method7753() {
		if (this.field5036) {
			this.method7729();
			this.field5060 = -1L;
			class495 var1 = client.field10855;
			this.field5049 = var1.field5049;
			this.field5054 = var1.field5054;
			this.field5051 = var1.field5051;
			this.field5052 = var1.field5052;
			this.field5053 = var1.field5053;
			this.field5024 = var1.field5024;
			this.field5055 = var1.field5055;
			this.field5031 = var1.field5031;
			this.field5032 = var1.field5032;
			this.field5062 = var1.field5062;
			this.field5057 = var1.field5057;
			this.field5042 = var1.field5042;
			this.field5034 = var1.field5034;
			this.field5035 = var1.field5035;
			this.field5058 = var1.field5058;
			this.field5040 = var1.field5040;
			this.field5041 = var1.field5041;
			this.field5029 = var1.field5029;
			this.field5019 = var1.field5019;
			this.field5021 = var1.field5021;
			this.field5018 = var1.field5018;
			this.field5025 = var1.field5025;
			this.field5022 = var1.field5022;
			this.field5059 = var1.field5059;
			this.field5028 = var1.field5028;
			this.field5043 = var1.field5043;
		} else if (client.field10791 == 4) {
			client.method6972(10);
		} else if (client.field10791 == 13) {
			client.method6972(6);
		} else if (client.field10791 == 15) {
			client.method6972(16);
		} else if (client.field10791 == 18) {
			client.method6972(3);
		} else if (client.field10791 == 0) {
			client.method6972(8);
		}
	}

	@ObfuscatedName("rl.ai(Lrt;I)V")
	public void method7749(class494 arg0) {
		this.field5019 = arg0.field5017;
		if (class496.field5063 == this.field5019) {
			this.method7773();
		} else if (class496.field5071 == this.field5019) {
			this.method7756(arg0.field5016);
		} else if (class496.field5064 == this.field5019) {
			this.method7824();
		} else if (this.field5019.method7887()) {
			this.method7776(arg0.field5016);
		}
	}

	@ObfuscatedName("rl.aw(B)V")
	public void method7773() {
		this.method7791(class254.method3061(Statics.field688.field11520.method18570()));
		int var1 = this.field5018.field7426;
		int var2 = this.field5018.field7427;
		int var3 = (Statics.field7956 >> 12) + (var1 >> 3);
		int var4 = (Statics.field1881 >> 12) + (var2 >> 3);
		Statics.field4490.field11717 = 0;
		Statics.field4826 = 0;
		Statics.field4490.method19118(8, 8);
		byte var5 = 18;
		this.field5054 = new int[var5];
		this.field5051 = new int[var5];
		this.field5052 = new byte[var5][];
		this.field5053 = new byte[var5][];
		this.field5024 = new byte[var5][];
		this.field5055 = new byte[var5][];
		this.field5031 = new byte[var5][];
		int var6 = 0;
		for (int var7 = (var3 - (this.field5028 >> 4)) / 8; var7 <= ((this.field5028 >> 4) + var3) / 8; var7++) {
			for (int var8 = (var4 - (this.field5043 >> 4)) / 8; var8 <= ((this.field5043 >> 4) + var4) / 8; var8++) {
				int var9 = (var7 << 8) + var8;
				if (Statics.field11752.method6883(this.method7795(var7, var8), class453.field4491.field4494)) {
					this.field5054[var6] = var9;
					this.field5051[var6] = this.method7795(var7, var8);
					var6++;
				}
			}
		}
		this.field5049 = var6;
		byte var10;
		if (client.field10791 == 4) {
			var10 = 10;
		} else if (client.field10791 == 15) {
			var10 = 16;
		} else if (client.field10791 == 13) {
			var10 = 6;
		} else if (client.field10791 == 0) {
			var10 = 8;
		} else {
			throw new RuntimeException("" + client.field10791);
		}
		this.method7829(var3, var4, var10, false);
	}

	@ObfuscatedName("rl.as(Lase;I)V")
	public void method7756(class1190 arg0) {
		int var2 = arg0.method17934();
		this.field5027 = arg0.method17904();
		int var3 = arg0.method17990();
		int var4 = arg0.method17904();
		int var5 = arg0.method17934();
		boolean var6 = arg0.method17990() == 1;
		if (!this.field5036) {
			this.method7854();
		}
		this.method7791(class254.method3061(var4));
		this.field5054 = new int[var3];
		this.field5051 = new int[var3];
		this.field5052 = new byte[var3][];
		this.field5053 = new byte[var3][];
		this.field5024 = null;
		this.field5055 = new byte[var3][];
		this.field5031 = new byte[var3][];
		int var7 = 0;
		for (int var8 = (var2 - (this.field5028 >> 4)) / 8; var8 <= ((this.field5028 >> 4) + var2) / 8; var8++) {
			for (int var9 = (var5 - (this.field5043 >> 4)) / 8; var9 <= ((this.field5043 >> 4) + var5) / 8; var9++) {
				if (Statics.field11752.method6883(this.method7795(var8, var9), class453.field4491.field4494)) {
					this.field5054[var7] = (var8 << 8) + var9;
					this.field5051[var7] = this.method7795(var8, var9);
					var7++;
				}
			}
		}
		this.field5049 = var7;
		this.method7829(var2, var5, 3, var6);
	}

	@ObfuscatedName("rl.at(Lase;I)V")
	public void method7776(class1190 arg0) {
		this.field5027 = arg0.method17904();
		int var2 = arg0.method17904();
		int var3 = arg0.method17904();
		if (var3 == 1) {
			this.field5019 = class496.field5066;
		} else if (var3 == 2) {
			this.field5019 = class496.field5067;
		} else if (var3 == 3) {
			this.field5019 = class496.field5068;
		} else if (var3 == 4) {
			this.field5019 = class496.field5069;
		}
		int var4 = arg0.method17906();
		int var5 = arg0.method17948();
		int var6 = arg0.method17940();
		boolean var7 = (var6 & 0x1) != 0;
		if (!this.field5036) {
			this.method7854();
		}
		this.method7791(class254.method3061(var2));
		arg0.method19562();
		HashSet var8 = new HashSet();
		for (int var9 = 0; var9 < 4; var9++) {
			for (int var10 = 0; var10 < this.field5028 >> 3; var10++) {
				for (int var11 = 0; var11 < this.field5043 >> 3; var11++) {
					int var12 = arg0.method19583(1);
					if (var12 == 1) {
						int var13 = arg0.method19583(26);
						this.field5057[var9][var10][var11] = var13;
						int var14 = var13 >> 14 & 0x3FF;
						int var15 = var13 >> 3 & 0x7FF;
						int var16 = var14 >> 3 << 8 | var15 >> 3;
						var8.add(var16);
					} else {
						this.field5057[var9][var10][var11] = -1;
					}
				}
			}
		}
		arg0.method19564();
		int var17 = var8.size();
		this.field5054 = new int[var17];
		this.field5051 = new int[var17];
		this.field5052 = new byte[var17][];
		this.field5053 = new byte[var17][];
		this.field5024 = null;
		this.field5055 = new byte[var17][];
		this.field5031 = new byte[var17][];
		int var18 = 0;
		for (int var19 = 0; var19 < 4; var19++) {
			for (int var20 = 0; var20 < this.field5028 >> 3; var20++) {
				for (int var21 = 0; var21 < this.field5043 >> 3; var21++) {
					int var22 = this.field5057[var19][var20][var21];
					if (var22 != -1) {
						int var23 = var22 >> 14 & 0x3FF;
						int var24 = var22 >> 3 & 0x7FF;
						int var25 = (var23 / 8 << 8) + var24 / 8;
						for (int var26 = 0; var26 < var18; var26++) {
							if (this.field5054[var26] == var25) {
								var25 = -1;
								break;
							}
						}
						if (var25 != -1) {
							int var27 = var25 >> 8 & 0xFF;
							int var28 = var25 & 0xFF;
							if (Statics.field11752.method6883(this.method7795(var27, var28), class453.field4491.field4494)) {
								this.field5054[var18] = var25;
								this.field5051[var18] = this.method7795(var27, var28);
								var18++;
							}
						}
					}
				}
			}
		}
		this.field5049 = var18;
		this.method7829(var4, var5, 3, var7);
	}

	@ObfuscatedName("rl.ad(I)V")
	public void method7824() {
		this.field5020 = this.field5019;
		this.method7791(class254.field2663);
		for (int var1 = 0; var1 < 4; var1++) {
			for (int var2 = 0; var2 < this.field5028 >> 3; var2++) {
				for (int var3 = 0; var3 < this.field5043 >> 3; var3++) {
					this.field5057[var1][var2][var3] = -1;
				}
			}
		}
		for (class974 var4 = (class974) class153.field1712.method14191(); var4 != null; var4 = (class974) class153.field1712.method14161()) {
			int var5 = var4.field11342;
			boolean var6 = (var5 & 0x1) == 1;
			int var7 = var4.field11337 >> 3;
			int var8 = var4.field11338 >> 3;
			int var9 = var4.field11336;
			int var10 = var4.field11341;
			int var11 = var4.field11344;
			int var12 = var4.field11339;
			int var13 = var4.field11340;
			int var14 = var4.field11343;
			int var15 = 0;
			int var16 = 0;
			byte var17 = 1;
			byte var18 = 1;
			if (var5 == 1) {
				var16 = var13 - 1;
				var17 = -1;
			} else if (var5 == 2) {
				var16 = var13 - 1;
				var15 = var14 - 1;
				var17 = -1;
				var18 = -1;
			} else if (var5 == 3) {
				var15 = var14 - 1;
				var17 = 1;
				var18 = -1;
			}
			int var19 = var8;
			while (var19 < var8 + var14) {
				int var20 = var16;
				int var21 = var7;
				while (var21 < var7 + var13) {
					if (var6) {
						this.field5057[var12][var9 + var15][var10 + var20] = (var5 << 1) + (var19 << 3) + (var11 << 24) + (var21 << 14);
					} else {
						this.field5057[var12][var9 + var20][var10 + var15] = (var5 << 1) + (var19 << 3) + (var11 << 24) + (var21 << 14);
					}
					var21++;
					var20 += var17;
				}
				var19++;
				var15 += var18;
			}
		}
		int var22 = client.field10769;
		this.field5054 = new int[var22];
		this.field5051 = new int[var22];
		this.field5052 = new byte[var22][];
		this.field5053 = new byte[var22][];
		this.field5024 = null;
		this.field5055 = new byte[var22][];
		this.field5031 = new byte[var22][];
		int var23 = 0;
		for (class974 var24 = (class974) class153.field1712.method14191(); var24 != null; var24 = (class974) class153.field1712.method14161()) {
			int var25 = var24.field11337 >>> 3;
			int var26 = var24.field11338 >>> 3;
			int var27 = var24.field11340 + var25;
			if ((var27 & 0x7) == 0) {
				var27--;
			}
			int var28 = var27 >>> 3;
			int var29 = var24.field11343 + var26;
			if ((var29 & 0x7) == 0) {
				var29--;
			}
			int var30 = var29 >>> 3;
			for (int var31 = var25 >>> 3; var31 <= var28; var31++) {
				label84: for (int var32 = var26 >>> 3; var32 <= var30; var32++) {
					int var33 = var31 << 8 | var32;
					for (int var34 = 0; var34 < var23; var34++) {
						if (this.field5054[var34] == var33) {
							continue label84;
						}
					}
					if (Statics.field11752.method6883(this.method7795(var31, var32), class453.field4491.field4494)) {
						this.field5054[var23] = var33;
						this.field5051[var23] = this.method7795(var31, var32);
						var23++;
					}
				}
			}
		}
		this.field5049 = var23;
		this.method7829(this.field5028 >> 4, this.field5043 >> 4, 3, false);
	}

	@ObfuscatedName("rl.am(III)I")
	public int method7795(int arg0, int arg1) {
		return arg0 | arg1 << 7;
	}

	@ObfuscatedName("rl.au(Lib;I)V")
	public void method7791(class254 arg0) {
		if (this.field5021 == arg0) {
			return;
		}
		this.field5028 = this.field5043 = arg0.field2665;
		this.field5057 = new int[4][this.field5028 >> 3][this.field5043 >> 3];
		this.field5040 = new int[this.field5028][this.field5043];
		this.field5041 = new int[this.field5028][this.field5043];
		this.field5029 = new byte[4][this.field5028][this.field5043];
		this.field5032 = new class451(4, this.field5028, this.field5043);
		this.method7737(false);
		class42.method829();
		this.field5021 = arg0;
	}

	@ObfuscatedName("rl.ar(I)V")
	public void method7854() {
		if (class496.field5064 == this.field5019 || class496.field5064 == this.field5020) {
			return;
		}
		if (class496.field5066 == this.field5019 || class496.field5068 == this.field5019 || this.field5020 != this.field5019 && (class496.field5071 == this.field5019 || class496.field5071 == this.field5020)) {
			Iterator var1 = client.field10838.iterator();
			while (var1.hasNext()) {
				class984 var2 = (class984) var1.next();
				class975.method10111((class1131) var2.field11436);
			}
			client.field11011 = 0;
			client.field10906 = 0;
			client.field10838.method14499();
		}
		this.field5020 = this.field5019;
	}

	@ObfuscatedName("rl.ap(IIIZB)V")
	public void method7829(int arg0, int arg1, int arg2, boolean arg3) {
		if (client.field10863 == 4) {
			if (this.field5036) {
				throw new IllegalStateException();
			}
			client.field10863 = 3;
			client.field10862 = -1;
		}
		if (!arg3 && this.field5022 == arg0 && this.field5059 == arg1) {
			return;
		}
		this.field5022 = arg0;
		this.field5059 = arg1;
		if (!this.field5036) {
			client.method6972(arg2);
			class41.method649(class776.field9044.method15021(Statics.field1680), true, Statics.field8198, Statics.field9184, Statics.field2657);
		}
		if (this.field5018 == null) {
			this.field5025 = new class594(0, 0, 0);
		} else {
			this.field5025 = this.field5018;
		}
		this.field5018 = new class594(0, (this.field5022 - (this.field5028 >> 4)) * 8, (this.field5059 - (this.field5043 >> 4)) * 8);
		this.field5035 = class541.method8511(this.field5028 / 2 + this.field5018.field7426, this.field5028 / 2 + this.field5018.field7427);
		this.field5058 = null;
		this.field5060 = -1L;
		if (!this.field5036) {
			this.method7762(arg2);
		}
	}

	@ObfuscatedName("rl.aq(II)V")
	public void method7762(int arg0) {
		int var2 = this.field5018.field7426 - this.field5025.field7426;
		int var3 = this.field5018.field7427 - this.field5025.field7427;
		if (arg0 == 3) {
			for (int var4 = 0; var4 < client.field10906; var4++) {
				class984 var5 = client.field10839[var4];
				if (var5 != null) {
					class1131 var6 = (class1131) var5.field11436;
					for (int var7 = 0; var7 < var6.field10450.length; var7++) {
						var6.field10450[var7] -= var2;
						var6.field10448[var7] -= var3;
					}
					class423 var8 = class423.method6484(var6.method10536().field4298);
					var8.field4308 -= var2 * 512;
					var8.field4313 -= var3 * 512;
					var6.method10531(var8);
					var8.method6486();
				}
			}
		} else {
			boolean var9 = false;
			client.field11011 = 0;
			int var10 = this.field5028 - 512;
			int var11 = this.field5043 - 512;
			for (int var12 = 0; var12 < client.field10906; var12++) {
				class984 var13 = client.field10839[var12];
				if (var13 != null) {
					class1131 var14 = (class1131) var13.field11436;
					class423 var15 = class423.method6484(var14.method10536().field4298);
					var15.field4308 -= var2 * 512;
					var15.field4313 -= var3 * 512;
					var14.method10531(var15);
					if ((int) var15.field4308 >= 0 && (int) var15.field4308 <= var10 && (int) var15.field4313 >= 0 && (int) var15.field4313 <= var11) {
						boolean var16 = true;
						for (int var17 = 0; var17 < var14.field10450.length; var17++) {
							var14.field10450[var17] -= var2;
							var14.field10448[var17] -= var3;
							if (var14.field10450[var17] < 0 || var14.field10450[var17] >= this.field5028 || var14.field10448[var17] < 0 || var14.field10448[var17] >= this.field5043) {
								var16 = false;
							}
						}
						if (var16) {
							client.field11036[++client.field11011 - 1] = var14.field10406;
						} else {
							var14.method19156(null);
							var13.method8440();
							var9 = true;
						}
					} else {
						var14.method19156(null);
						var13.method8440();
						var9 = true;
					}
					var15.method6486();
				}
			}
			if (var9) {
				client.field10906 = client.field10838.method14498();
				int var18 = 0;
				Iterator var19 = client.field10838.iterator();
				while (var19.hasNext()) {
					class984 var20 = (class984) var19.next();
					client.field10839[var18++] = var20;
				}
			}
		}
		for (int var21 = 0; var21 < 2048; var21++) {
			class1130 var22 = client.field10944[var21];
			if (var22 != null) {
				for (int var23 = 0; var23 < var22.field10450.length; var23++) {
					var22.field10450[var23] -= var2;
					var22.field10448[var23] -= var3;
				}
				class423 var24 = class423.method6484(var22.method10536().field4298);
				var24.field4308 -= var2 * 512;
				var24.field4313 -= var3 * 512;
				var22.method10531(var24);
				var24.method6486();
			}
		}
		class45[] var25 = client.field10851;
		for (int var26 = 0; var26 < var25.length; var26++) {
			class45 var27 = var25[var26];
			if (var27 != null) {
				var27.field746 = var27.field746 * 262144 - var2 * 512;
				var27.field747 = var27.field747 * 262144 - var3 * 262144;
			}
		}
		for (class962 var28 = (class962) class962.field11237.method14191(); var28 != null; var28 = (class962) class962.field11237.method14161()) {
			var28.field11226 -= var2;
			var28.field11228 -= var3;
			class598 var29 = (class598) this.field5039.method962(var28.field11234);
			int var30;
			int var31;
			if ((var28.field11235 & 0x1) == 0) {
				var30 = var29.field7499;
				var31 = var29.field7492;
			} else {
				var30 = var29.field7492;
				var31 = var29.field7499;
			}
			if (class496.field5069 != this.field5019 && (var28.field11226 + var30 <= 0 || var28.field11228 + var31 <= 0 || var28.field11226 >= this.field5028 || var28.field11228 >= this.field5043)) {
				var28.method8440();
			}
		}
		for (class962 var32 = (class962) class962.field11242.method14191(); var32 != null; var32 = (class962) class962.field11242.method14161()) {
			var32.field11226 -= var2;
			var32.field11228 -= var3;
			class598 var33 = (class598) this.field5039.method962(var32.field11234);
			int var34;
			int var35;
			if ((var32.field11235 & 0x1) == 0) {
				var34 = var33.field7499;
				var35 = var33.field7492;
			} else {
				var34 = var33.field7492;
				var35 = var33.field7499;
			}
			if (class496.field5069 != this.field5019 && (var32.field11226 + var34 <= 0 || var32.field11228 + var35 <= 0 || var32.field11226 >= this.field5028 || var32.field11228 >= this.field5043)) {
				var32.method8440();
			}
		}
		for (class966 var36 = (class966) client.field10964.method14500(); var36 != null; var36 = (class966) client.field10964.method14502()) {
			int var37 = (int) (var36.field6760 >> 28 & 0x3L);
			int var38 = (int) (var36.field6760 & 0x3FFFL);
			int var39 = var38 - this.field5018.field7426;
			int var40 = (int) (var36.field6760 >> 14 & 0x3FFFL);
			int var41 = var40 - this.field5018.field7427;
			if (this.field5030 != null) {
				if (var39 >= 0 && var41 >= 0 && var39 < this.field5028 && var41 < this.field5043 && var39 < this.field5030.field6910 && var41 < this.field5030.field6911) {
					if (this.field5030.field6928 != null) {
						this.field5030.method8742(var37, var39, var41);
					}
				} else if (class496.field5069 != this.field5019) {
					var36.method8440();
				}
			}
		}
		if (class42.field731 != 0) {
			class42.field731 -= var2;
			class42.field718 -= var3;
		}
		class975.method13908(false);
		if (arg0 == 3) {
			client.field10892 -= var2 * 512;
			client.field10893 -= var3 * 512;
			Statics.field8910 -= var2 * 512;
			Statics.field3569 -= var3 * 512;
			if (Statics.field3416 != 4 && Statics.field3416 != 3) {
				client.method4046(client.method14298());
			}
		} else {
			Statics.field8550 = Statics.field8550 * 262144 - var2 * 262144;
			Statics.field8492 = Statics.field8492 * 262144 - var3 * 262144;
			Statics.field6714 -= var2;
			Statics.field2626 -= var3;
			Statics.field7956 -= var2 * 512;
			Statics.field1881 -= var3 * 512;
			if (Math.abs(var2) > this.field5028 || Math.abs(var3) > this.field5043) {
				this.field5062.method10019();
			}
		}
		class22.method5175();
		class42.method5065();
		client.field10966.method14499();
		client.field10965.method14152();
		client.field10864.method14242();
		class633.method3561();
	}

	@ObfuscatedName("rl.ax(I)V")
	public void method7763() {
		this.field5033 = null;
		this.field5023 = null;
		if (this.field5032 != null) {
			this.field5032.method7101();
		}
		if (this.field5062 != null) {
			this.field5062.method9998();
		}
		if (this.field5030 != null) {
			this.field5030.field6959.method8680();
			this.field5030 = null;
		}
	}

	@ObfuscatedName("rl.av(B)Z")
	public boolean method7723() {
		if (!this.field5036) {
			class492.method6969(false);
		}
		if (this.field5060 == -1L) {
			this.field5060 = class213.method3655();
		}
		this.field5044 = 0;
		for (int var1 = 0; var1 < this.field5049; var1++) {
			if (!Statics.field11752.method6927(this.field5051[var1])) {
				this.field5044++;
			}
		}
		if (this.field5058 == null) {
			if (this.field5035 == null || !Statics.field8332.method6904(this.field5035.field12351)) {
				this.field5058 = new class539(0);
			} else if (Statics.field8332.method6886(this.field5035.field12351)) {
				this.field5058 = class539.method6046(Statics.field8332, this.field5035.field12351, client.field10948);
			} else {
				this.field5044++;
			}
		}
		if (this.field5044 > 0) {
			if (this.field5045 < this.field5044) {
				this.field5045 = this.field5044;
			}
			this.field5026 = class491.field5006;
			return false;
		}
		for (int var2 = 0; var2 < this.field5049; var2++) {
			if (this.field5052[var2] == null) {
				this.field5052[var2] = Statics.field11752.method6879(this.field5051[var2], class453.field4491.field4494);
			}
			if (this.field5053[var2] == null) {
				this.field5053[var2] = Statics.field11752.method6879(this.field5051[var2], class453.field4498.field4494);
			}
			if (this.field5055[var2] == null) {
				this.field5055[var2] = Statics.field11752.method6879(this.field5051[var2], class453.field4496.field4494);
			}
			if (this.field5031[var2] == null) {
				this.field5031[var2] = Statics.field11752.method6879(this.field5051[var2], class453.field4492.field4494);
			}
			if (this.field5024 != null && this.field5024[var2] == null) {
				this.field5024[var2] = Statics.field11752.method6879(this.field5051[var2], class453.field4493.field4494);
			}
		}
		int var3 = this.field5046;
		class650 var4 = new class650(-1);
		class650 var5 = new class650(-1);
		this.field5046 = 0;
		for (int var6 = 0; var6 < this.field5049; var6++) {
			byte[] var7 = this.field5053[var6];
			if (var7 != null) {
				int var8 = (this.field5054[var6] >> 8) * 64 - this.field5018.field7426;
				int var9 = (this.field5054[var6] & 0xFF) * 64 - this.field5018.field7427;
				if (this.field5019.method7887()) {
					var8 = 10;
					var9 = 10;
				}
				int var10 = class938.method4526(this.field5039, var7, var8, var9, this.field5028, this.field5043, var5, var4);
				if (var10 > 0) {
					this.field5046 += var10;
				}
			}
			byte[] var11 = this.field5031[var6];
			if (var11 != null) {
				int var12 = (this.field5054[var6] >> 8) * 64 - this.field5018.field7426;
				int var13 = (this.field5054[var6] & 0xFF) * 64 - this.field5018.field7427;
				if (this.field5019.method7887()) {
					var12 = 10;
					var13 = 10;
				}
				int var14 = class938.method4526(this.field5039, var11, var12, var13, this.field5028, this.field5043, var5, var4);
				if (var14 > 0) {
					this.field5046 += var14;
				}
			}
		}
		if (this.field5046 > 0) {
			if (this.field5046 != var3) {
				this.field5048 = client.field10903;
			} else if (this.field5048 != 0 && client.field10903 - this.field5048 == 1000) {
				class576.method5144(var5.field7958, var4.field7958, this.field5046);
				class576.method9189();
			}
			if (this.field5047 < this.field5046) {
				this.field5047 = this.field5046;
			}
			this.field5026 = class491.field5005;
			return false;
		}
		if (!this.field5036 && class491.field5007 != this.field5026) {
			class41.method649(class776.field9044.method15021(Statics.field1680) + class9.field426 + "(100%)", true, Statics.field8198, Statics.field9184, Statics.field2657);
		}
		this.field5026 = class491.field5008;
		if (!this.field5036 && Statics.field1798 != null) {
			Statics.field1798.method3149();
		}
		if (!this.field5036) {
			for (int var15 = 0; var15 < 2048; var15++) {
				class1130 var16 = client.field10944[var15];
				if (var16 != null) {
					var16.field11716 = null;
				}
			}
			for (int var17 = 0; var17 < client.field10839.length; var17++) {
				class984 var18 = client.field10839[var17];
				if (var18 != null) {
					((class1019) var18.field11436).field11716 = null;
				}
			}
		}
		if (!this.field5036) {
			Statics.method14055(true);
		}
		boolean var19 = false;
		if (Statics.field688.field11541.method18522() == 2) {
			for (int var20 = 0; var20 < this.field5049; var20++) {
				if (this.field5031[var20] != null || this.field5055[var20] != null) {
					var19 = true;
					break;
				}
			}
		}
		int var21 = class256.method17395(Statics.field688.field11522.method18688()).field2675 * 8;
		if (Statics.field8198.method2130()) {
			var21++;
		}
		this.method7820();
		this.method7763();
		this.field5030 = new class550(Statics.field8198, 9, 4, this.field5028, this.field5043, var21, var19, Statics.field8198.method2114() > 0);
		this.field5030.method8703(false);
		this.field5030.method8701(client.field11005);
		this.field5030.method8759(this.field5061);
		if (client.field11005 == 0) {
			this.field5030.method8737(null);
		} else {
			this.field5030.method8737(Statics.field8321);
		}
		this.field5050 = new class493();
		this.field5038 = -0.05F + (float) (Math.random() / 10.0D);
		this.field5023 = new class938(this.field5030, this.field5039, 4, this.field5028, this.field5043, false, this.field5032, this.field5062);
		this.field5023.method7136();
		this.field5023.field4515 = Statics.field688.field11529.method18515();
		this.field5023.field4571 = Statics.field688.field11541.method18522() == 2;
		this.field5023.field4542 = Statics.field688.field11528.method18389() == 1;
		this.field5023.field4539 = Statics.field688.field11525.method18651() == 1;
		this.field5023.field4511 = Statics.field688.field11538.method18426() == 1;
		if (this.field5019.method7887()) {
			this.method7767(this.field5023, this.field5052);
		} else {
			this.method7766(this.field5023, this.field5052);
		}
		if (this.field5036) {
			this.method7765(50);
		}
		this.field5062.method9991(this.field5028 >> 4, this.field5043 >> 4);
		this.field5062.method10003(this);
		if (var19) {
			this.field5030.method8703(true);
			this.field5033 = new class938(this.field5030, this.field5039, 1, this.field5028, this.field5043, true, this.field5032, this.field5062);
			this.field5033.method7136();
			this.field5033.field4515 = Statics.field688.field11529.method18515();
			this.field5033.field4571 = Statics.field688.field11541.method18522() == 2;
			this.field5033.field4542 = Statics.field688.field11528.method18389() == 1;
			this.field5033.field4539 = Statics.field688.field11525.method18651() == 1;
			this.field5033.field4511 = Statics.field688.field11538.method18426() == 1;
			if (this.field5019.method7887()) {
				this.method7767(this.field5033, this.field5055);
				if (!this.field5036) {
					class492.method6969(true);
				}
			} else {
				this.method7766(this.field5033, this.field5055);
				if (!this.field5036) {
					class492.method6969(true);
				}
			}
			this.field5033.method7143(0, this.field5023.field4540[0]);
			this.field5033.method7144(Statics.field8198, null);
			this.field5030.method8703(false);
			if (this.field5036) {
				this.method7765(50);
			}
		}
		this.field5023.method7144(Statics.field8198, var19 ? this.field5033.field4540 : (int[][][]) null);
		if (this.field5019.method7887()) {
			if (!this.field5036) {
				class492.method6969(true);
			}
			this.method7769(this.field5023, this.field5053);
		} else {
			if (!this.field5036) {
				class492.method6969(true);
			}
			this.method7768(this.field5023, this.field5053);
			if (this.field5024 != null) {
				this.method7770();
			}
		}
		if (!this.field5036) {
			class492.method6969(true);
		}
		this.field5023.method7200(Statics.field8198, var19 ? this.field5030.field6917[0] : null, null);
		if (this.field5036) {
			this.method7765(75);
		}
		this.field5023.method16877(Statics.field8198, false);
		if (this.field5036) {
			this.method7765(75);
		}
		if (!this.field5036) {
			class492.method6969(true);
		}
		if (var19) {
			this.field5030.method8703(true);
			if (!this.field5036) {
				class492.method6969(true);
			}
			if (this.field5019.method7887()) {
				this.method7769(this.field5033, this.field5031);
			} else {
				this.method7768(this.field5033, this.field5031);
			}
			if (!this.field5036) {
				class492.method6969(true);
			}
			this.field5033.method7200(Statics.field8198, null, this.field5030.field6915[0]);
			this.field5033.method16877(Statics.field8198, true);
			if (!this.field5036) {
				class492.method6969(true);
			}
			this.field5030.method8703(false);
			if (this.field5036) {
				this.method7765(50);
			}
		}
		this.field5023.method7137();
		if (this.field5033 != null) {
			this.field5033.method7137();
		}
		this.field5030.method8875();
		if (this.field5036) {
			class213.method3655();
			while (!Statics.field8198.method2215()) {
				this.method7765(1);
			}
		}
		boolean var22 = false;
		if (this.field5036) {
			class495 var23 = client.field10855;
			this.method7752(var23);
			Statics.field3183.method7678(var23);
			var22 = true;
			class213.method3655();
			Object var24 = client.field10858;
			synchronized (client.field10858) {
				client.field10856 = true;
				try {
					client.field10858.wait();
				} catch (InterruptedException var44) {
				}
			}
			client.field10855 = this;
			var23.method7763();
			this.method7762(3);
			this.method7854();
		} else {
			Statics.field1798.method3149();
			this.field5062.method9997();
			class507.method135();
		}
		for (int var27 = 0; var27 < 4; var27++) {
			for (int var28 = 0; var28 < this.field5028; var28++) {
				for (int var29 = 0; var29 < this.field5043; var29++) {
					client.method7359(var27, var28, var29);
				}
			}
		}
		for (int var30 = 0; var30 < client.field10931.length; var30++) {
			if (client.field10931[var30] != null) {
				client.field10931[var30].method8406();
			}
		}
		client.method3128();
		class962.method5070();
		if (class507.method4419() == class506.field6580 && client.field10849.method939() != null && client.field10791 == 3) {
			class983 var31 = Statics.method1604(class390.field3772, client.field10849.field794);
			var31.field11432.method17886(1057001181);
			client.field10849.method934(var31);
		}
		if (!this.field5019.method7887()) {
			int var32 = (this.field5022 - (this.field5028 >> 4)) / 8;
			int var33 = ((this.field5028 >> 4) + this.field5022) / 8;
			int var34 = (this.field5059 - (this.field5043 >> 4)) / 8;
			int var35 = ((this.field5043 >> 4) + this.field5059) / 8;
			for (int var36 = var32 - 1; var36 <= var33 + 1; var36++) {
				for (int var37 = var34 - 1; var37 <= var35 + 1; var37++) {
					if (var36 < var32 || var36 > var33 || var37 < var34 || var37 > var35) {
						Statics.field11752.method6885(this.method7795(var36, var37));
					}
				}
			}
		}
		long var38 = class213.method3655() - this.field5060;
		if (client.field10791 == 10) {
			client.method6972(4);
		} else if (client.field10791 == 6) {
			client.method6972(13);
		} else if (client.field10791 == 16) {
			client.method6972(15);
		} else if (client.field10791 == 8) {
			client.method6972(0);
		} else {
			client.method6972(18);
			if (client.field10849.method939() != null) {
				class983 var40 = Statics.method1604(class390.field3761, client.field10849.field794);
				var40.field11432.method17886((int) var38);
				client.field10849.method934(var40);
			}
		}
		if (this.field5037) {
			class47.method4285(Long.toString(class213.method3655() - this.field5056));
			this.field5037 = false;
		}
		if (var22) {
			Object var41 = client.field10920;
			synchronized (client.field10920) {
				client.field10920.notify();
			}
		}
		return true;
	}

	@ObfuscatedName("rl.ao(II)V")
	public void method7765(int arg0) {
		try {
			Thread.sleep((long) arg0);
		} catch (InterruptedException var3) {
		}
	}

	@ObfuscatedName("rl.aj(Laih;[[BI)V")
	public void method7766(class938 arg0, byte[][] arg1) {
		int var3 = arg1.length;
		for (int var4 = 0; var4 < var3; var4++) {
			byte[] var5 = arg1[var4];
			if (var5 != null) {
				class997 var6 = new class997(var5);
				int var7 = this.field5054[var4] >> 8;
				int var8 = this.field5054[var4] & 0xFF;
				int var9 = var7 * 64 - this.field5018.field7426;
				int var10 = var8 * 64 - this.field5018.field7427;
				if (!this.field5036 && Statics.field1798 != null) {
					Statics.field1798.method3149();
				}
				arg0.method7170(var6, var9, var10, this.field5018.field7426, this.field5018.field7427);
				arg0.method16872(Statics.field8198, var6, var9, var10);
			}
		}
		for (int var11 = 0; var11 < var3; var11++) {
			int var12 = (this.field5054[var11] >> 8) * 64 - this.field5018.field7426;
			int var13 = (this.field5054[var11] & 0xFF) * 64 - this.field5018.field7427;
			byte[] var14 = arg1[var11];
			if (var14 == null && this.field5059 < 800) {
				if (!this.field5036 && Statics.field1798 != null) {
					Statics.field1798.method3149();
				}
				arg0.method7167(var12, var13, 64, 64);
			}
		}
	}

	@ObfuscatedName("rl.ay(Laih;[[BI)V")
	public void method7767(class938 arg0, byte[][] arg1) {
		for (int var3 = 0; var3 < arg0.field4544; var3++) {
			if (!this.field5036) {
				Statics.field1798.method3149();
			}
			for (int var4 = 0; var4 < this.field5028 >> 3; var4++) {
				for (int var5 = 0; var5 < this.field5043 >> 3; var5++) {
					int var6 = this.field5057[var3][var4][var5];
					if (var6 != -1) {
						int var7 = var6 >> 24 & 0x3;
						if (!arg0.field4549 || var7 == 0) {
							int var8 = var6 >> 1 & 0x3;
							int var9 = var6 >> 14 & 0x3FF;
							int var10 = var6 >> 3 & 0x7FF;
							int var11 = (var9 / 8 << 8) + var10 / 8;
							for (int var12 = 0; var12 < this.field5054.length; var12++) {
								if (this.field5054[var12] == var11 && arg1[var12] != null) {
									class997 var13 = new class997(arg1[var12]);
									arg0.method7161(var13, var3, var4 * 8, var5 * 8, var7, var9, var10, var8);
									arg0.method16875(Statics.field8198, var13, var3, var4 * 8, var5 * 8, var7, var9, var10, var8);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int var14 = 0; var14 < arg0.field4544; var14++) {
			if (!this.field5036) {
				Statics.field1798.method3149();
			}
			for (int var15 = 0; var15 < this.field5028 >> 3; var15++) {
				for (int var16 = 0; var16 < this.field5043 >> 3; var16++) {
					int var17 = this.field5057[var14][var15][var16];
					if (var17 == -1) {
						arg0.method7139(var14, var15 * 8, var16 * 8, 8, 8);
					}
				}
			}
		}
	}

	@ObfuscatedName("rl.ab(Laih;[[BB)V")
	public void method7768(class938 arg0, byte[][] arg1) {
		for (int var3 = 0; var3 < this.field5049; var3++) {
			byte[] var4 = arg1[var3];
			if (var4 != null) {
				int var5 = (this.field5054[var3] >> 8) * 64 - this.field5018.field7426;
				int var6 = (this.field5054[var3] & 0xFF) * 64 - this.field5018.field7427;
				if (!this.field5036) {
					Statics.field1798.method3149();
				}
				arg0.method16888(Statics.field8198, var4, var5, var6);
				if (this.field5036) {
					this.method7765(10);
				}
			}
		}
	}

	@ObfuscatedName("rl.az(Laih;[[BS)V")
	public void method7769(class938 arg0, byte[][] arg1) {
		for (int var3 = 0; var3 < arg0.field4544; var3++) {
			if (!this.field5036) {
				Statics.field1798.method3149();
			}
			for (int var4 = 0; var4 < this.field5028 >> 3; var4++) {
				for (int var5 = 0; var5 < this.field5043 >> 3; var5++) {
					int var6 = this.field5057[var3][var4][var5];
					if (var6 != -1) {
						int var7 = var6 >> 24 & 0x3;
						if (!arg0.field4549 || var7 == 0) {
							int var8 = var6 >> 1 & 0x3;
							int var9 = var6 >> 14 & 0x3FF;
							int var10 = var6 >> 3 & 0x7FF;
							int var11 = (var9 / 8 << 8) + var10 / 8;
							for (int var12 = 0; var12 < this.field5054.length; var12++) {
								if (this.field5054[var12] == var11 && arg1[var12] != null) {
									arg0.method16868(Statics.field8198, arg1[var12], var3, var4 * 8, var5 * 8, var7, (var9 & 0x7) * 8, (var10 & 0x7) * 8, var8);
									break;
								}
							}
						}
					}
					if (this.field5036) {
						this.method7765(5);
					}
				}
			}
		}
	}

	@ObfuscatedName("rl.aa(B)V")
	public void method7770() {
		int var1 = this.field5024.length;
		for (int var2 = 0; var2 < var1; var2++) {
			if (this.field5024[var2] != null) {
				int var3 = -1;
				for (int var4 = 0; var4 < client.field10938; var4++) {
					if (client.field10859[var4] == this.field5054[var2]) {
						var3 = var4;
						break;
					}
				}
				if (var3 == -1) {
					client.field10859[client.field10938] = this.field5054[var2];
					var3 = ++client.field10938 - 1;
				}
				class997 var5 = new class997(this.field5024[var2]);
				int var6 = 0;
				while (var5.field11503 < this.field5024[var2].length && var6 < 511 && client.field11011 < 1023) {
					int var7 = var3 | var6++ << 6;
					int var8 = var5.method17906();
					int var9 = var8 >> 14;
					int var10 = var8 >> 7 & 0x3F;
					int var11 = var8 & 0x3F;
					int var12 = (this.field5054[var2] >> 8) * 64 - this.field5018.field7426 + var10;
					int var13 = (this.field5054[var2] & 0xFF) * 64 - this.field5018.field7427 + var11;
					class260 var14 = (class260) Statics.field7961.method962(var5.method17906());
					class984 var15 = (class984) client.field10838.method14495((long) var7);
					if (var15 == null && (var14.field2743 & 0x1) > 0 && var12 >= 0 && var14.field2699 + var12 < this.field5028 && var13 >= 0 && var14.field2699 + var13 < this.field5043) {
						class1131 var16 = new class1131(this.field5030);
						var16.field10406 = var7;
						class984 var17 = new class984(var16);
						client.field10838.method14501(var17, (long) var7);
						client.field10839[++client.field10906 - 1] = var17;
						client.field11036[++client.field11011 - 1] = var7;
						var16.field10440 = client.field10903;
						var16.method19156(var14);
						var16.method16502(var16.field12083.field2699);
						var16.field10444 = var16.field12083.field2731 << 3;
						var16.method16491(var16.field12083.field2727.method13895().method1303() << 11 & 0x3FFF, true);
						var16.method19159(var9, var12, var13, true, var16.method16546());
					}
				}
			}
		}
	}
}

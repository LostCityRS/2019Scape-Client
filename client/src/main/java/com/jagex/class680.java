package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("yy")
public class class680 implements class53 {

	@ObfuscatedName("yy.n")
	public final class681 field8249;

	@ObfuscatedName("yy.m")
	public final int field8247;

	@ObfuscatedName("yy.k")
	public int field8248;

	@ObfuscatedName("yy.f")
	public int field8260 = -1;

	@ObfuscatedName("yy.w")
	public short[] field8246;

	@ObfuscatedName("yy.l")
	public short[] field8251;

	@ObfuscatedName("yy.u")
	public short[] field8253;

	@ObfuscatedName("yy.z")
	public short[] field8245;

	@ObfuscatedName("yy.p")
	public byte[] field8254;

	@ObfuscatedName("yy.d")
	public byte[] field8255;

	@ObfuscatedName("yy.c")
	public int field8256 = 128;

	@ObfuscatedName("yy.r")
	public int field8257 = 128;

	@ObfuscatedName("yy.v")
	public int field8258 = 0;

	@ObfuscatedName("yy.o")
	public int field8259 = 0;

	@ObfuscatedName("yy.s")
	public int field8252 = 0;

	@ObfuscatedName("yy.y")
	public boolean field8261 = false;

	@ObfuscatedName("yy.q")
	public byte field8262 = 0;

	@ObfuscatedName("yy.x")
	public int field8263 = -1;

	public class680(int arg0, class681 arg1) {
		this.field8247 = arg0;
		this.field8249 = arg1;
	}

	@ObfuscatedName("yy.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method13807(arg0, var2);
		}
	}

	@ObfuscatedName("yy.u(Lalw;II)V")
	public void method13807(class997 arg0, int arg1) {
		if (arg1 == 1) {
			this.field8248 = arg0.method17927();
		} else if (arg1 == 2) {
			this.field8260 = arg0.method17927();
		} else if (arg1 == 4) {
			this.field8256 = arg0.method17906();
		} else if (arg1 == 5) {
			this.field8257 = arg0.method17906();
		} else if (arg1 == 6) {
			this.field8258 = arg0.method17906();
		} else if (arg1 == 7) {
			this.field8259 = arg0.method17904();
		} else if (arg1 == 8) {
			this.field8252 = arg0.method17904();
		} else if (arg1 == 10) {
			this.field8261 = true;
		} else if (arg1 == 9) {
			this.field8262 = 3;
			this.field8263 = 8224;
		} else if (arg1 == 15) {
			this.field8262 = 3;
			this.field8263 = arg0.method17906();
		} else if (arg1 == 16) {
			this.field8262 = 3;
			this.field8263 = arg0.method17910();
		} else if (arg1 == 40) {
			int var3 = arg0.method17904();
			this.field8246 = new short[var3];
			this.field8251 = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field8246[var4] = (short) arg0.method17906();
				this.field8251[var4] = (short) arg0.method17906();
			}
		} else if (arg1 == 41) {
			int var5 = arg0.method17904();
			this.field8253 = new short[var5];
			this.field8245 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field8253[var6] = (short) arg0.method17906();
				this.field8245[var6] = (short) arg0.method17906();
			}
		} else if (arg1 == 44) {
			int var7 = arg0.method17906();
			int var8 = 0;
			for (int var9 = var7; var9 > 0; var9 >>= 0x1) {
				var8++;
			}
			this.field8254 = new byte[var8];
			byte var10 = 0;
			for (int var11 = 0; var11 < var8; var11++) {
				if ((var7 & 0x1 << var11) > 0) {
					this.field8254[var11] = var10++;
				} else {
					this.field8254[var11] = -1;
				}
			}
		} else if (arg1 == 45) {
			int var12 = arg0.method17906();
			int var13 = 0;
			for (int var14 = var12; var14 > 0; var14 >>= 0x1) {
				var13++;
			}
			this.field8255 = new byte[var13];
			byte var15 = 0;
			for (int var16 = 0; var16 < var13; var16++) {
				if ((var12 & 0x1 << var16) > 0) {
					this.field8255[var16] = var15++;
				} else {
					this.field8255[var16] = -1;
				}
			}
		} else if (arg1 == 46) {
		}
	}

	@ObfuscatedName("yy.z(Ldh;ILaaq;BI)Ldo;")
	public final class116 method13817(class133 arg0, int arg1, class721 arg2, byte arg3) {
		return this.method13798(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3);
	}

	@ObfuscatedName("yy.p(Ldh;IIIIILaaq;BI)Ldo;")
	public final class116 method13800(class133 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class721 arg6, byte arg7) {
		return this.field8262 == 3 ? this.method13798(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7) : this.method13798(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7);
	}

	@ObfuscatedName("yy.d(Ldh;IILcb;Lcb;IIILaaq;BB)Ldo;")
	public final class116 method13802(class133 arg0, int arg1, int arg2, class104 arg3, class104 arg4, int arg5, int arg6, int arg7, class721 arg8, byte arg9) {
		return this.method13798(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9);
	}

	@ObfuscatedName("yy.c(Ldh;IZLcb;Lcb;IIIIIIILaaq;BI)Ldo;")
	public final class116 method13798(class133 arg0, int arg1, boolean arg2, class104 arg3, class104 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class721 arg12, byte arg13) {
		int var15 = arg1;
		boolean var16 = arg2 & this.field8262 != 0;
		if (arg12 != null) {
			var15 = arg1 | arg12.method14358();
		}
		if (this.field8257 != 128) {
			var15 |= 0x2;
		}
		if (this.field8256 != 128 || this.field8258 != 0 || arg8 != 0) {
			var15 |= 0x5;
		}
		if (var16) {
			var15 |= 0x7;
		}
		class162 var17 = this.field8249.field8266;
		class116 var18;
		synchronized (this.field8249.field8266) {
			var18 = (class116) this.field8249.field8266.method2930((long) (this.field8247 | arg0.field1595 << 29));
		}
		if (var18 == null || arg0.method2394(var18.method1691(), var15) != 0) {
			if (var18 != null) {
				var15 = arg0.method2213(var15, var18.method1691());
			}
			int var20 = var15;
			if (this.field8246 != null) {
				var20 = var15 | 0x4000;
			}
			if (this.field8253 != null) {
				var20 |= 0x8000;
			}
			class120 var21 = class120.method1931(this.field8249.field8265, this.field8248, 0);
			if (var21 == null) {
				return null;
			}
			if (var21.field1372 < 13) {
				var21.method1947(2);
			}
			var18 = arg0.method2211(var21, var20, this.field8249.field8264, this.field8259 + 64, this.field8252 + 850);
			if (this.field8246 != null) {
				for (int var22 = 0; var22 < this.field8246.length; var22++) {
					var18.method1859(this.field8246[var22], this.field8251[var22]);
				}
			}
			if (this.field8253 != null) {
				for (int var23 = 0; var23 < this.field8253.length; var23++) {
					var18.method1744(this.field8253[var23], this.field8245[var23]);
				}
			}
			var18.method1690(var15);
			class162 var24 = this.field8249.field8266;
			synchronized (this.field8249.field8266) {
				this.field8249.field8266.method2921(var18, (long) (this.field8247 | arg0.field1595 << 29));
			}
		}
		class116 var26 = var18.method1773(arg13, var15, true);
		if (arg12 != null) {
			arg12.method14359(var26, 0);
		}
		if (this.field8256 != 128 || this.field8257 != 128) {
			var26.method1699(this.field8256, this.field8257, this.field8256);
		}
		if (this.field8258 != 0) {
			if (this.field8258 == 90) {
				arg8 += 4096;
			}
			if (this.field8258 == 180) {
				arg8 += 8192;
			}
			if (this.field8258 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			int var27 = arg8 & 0x3FFF;
			var26.method1693(var27);
		}
		if (var16) {
			if (arg3 == null) {
				if (arg9 != 0) {
					var26.method1852(arg9);
				}
				if (arg10 != 0) {
					var26.method1696(arg10);
				}
				if (arg11 != 0) {
					var26.method1805(0, arg11, 0);
				}
			} else {
				var26.method1700(this.field8262, this.field8263, arg3, arg4, arg5, arg6, arg7);
			}
		}
		var26.method1690(arg1);
		return var26;
	}

	@ObfuscatedName("yy.r(B)Z")
	public final boolean method13803() {
		return this.field8248 == -1 ? true : this.field8249.field8265.method6888(this.field8248, 0);
	}

	@ObfuscatedName("yy.n(I)V")
	public void method975() {
	}
}

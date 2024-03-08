package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("hs")
public class class228 implements class53 {

	@ObfuscatedName("hs.e")
	public final class229 field2368;

	@ObfuscatedName("hs.n")
	public final class51 field2412;

	@ObfuscatedName("hs.m")
	public final int field2367;

	@ObfuscatedName("hs.k")
	public int field2400 = -1;

	@ObfuscatedName("hs.f")
	public int field2403 = -1;

	@ObfuscatedName("hs.w")
	public String field2370;

	@ObfuscatedName("hs.l")
	public int field2366;

	@ObfuscatedName("hs.u")
	public int field2372 = -1;

	@ObfuscatedName("hs.z")
	public int field2388 = 0;

	@ObfuscatedName("hs.r")
	public int field2377;

	@ObfuscatedName("hs.v")
	public int field2378;

	@ObfuscatedName("hs.o")
	public boolean field2379 = true;

	@ObfuscatedName("hs.s")
	public boolean field2404 = false;

	@ObfuscatedName("hs.y")
	public String[] field2381 = new String[5];

	@ObfuscatedName("hs.q")
	public String field2382;

	@ObfuscatedName("hs.x")
	public int field2383 = -1;

	@ObfuscatedName("hs.b")
	public int field2386 = -1;

	@ObfuscatedName("hs.h")
	public int field2385 = -1;

	@ObfuscatedName("hs.a")
	public int field2371 = -1;

	@ObfuscatedName("hs.g")
	public int field2387 = -1;

	@ObfuscatedName("hs.i")
	public int field2380;

	@ObfuscatedName("hs.j")
	public int field2389;

	@ObfuscatedName("hs.t")
	public int field2390 = -1;

	@ObfuscatedName("hs.ae")
	public int field2391 = -1;

	@ObfuscatedName("hs.ag")
	public int[] field2392 = null;

	@ObfuscatedName("hs.ah")
	public int[] field2393;

	@ObfuscatedName("hs.al")
	public int field2373 = Integer.MAX_VALUE;

	@ObfuscatedName("hs.ac")
	public int field2395 = Integer.MAX_VALUE;

	@ObfuscatedName("hs.ai")
	public int field2396 = Integer.MIN_VALUE;

	@ObfuscatedName("hs.aw")
	public int field2397 = Integer.MIN_VALUE;

	@ObfuscatedName("hs.as")
	public int field2398;

	@ObfuscatedName("hs.at")
	public int field2399 = -1;

	@ObfuscatedName("hs.ad")
	public int field2369 = -1;

	@ObfuscatedName("hs.am")
	public int field2401 = -1;

	@ObfuscatedName("hs.au")
	public int field2410;

	@ObfuscatedName("hs.ar")
	public int field2394;

	@ObfuscatedName("hs.ap")
	public class230 field2365 = class230.field2417;

	@ObfuscatedName("hs.aq")
	public class231 field2405 = class231.field2424;

	@ObfuscatedName("hs.ax")
	public int[] field2406;

	@ObfuscatedName("hs.av")
	public byte[] field2407;

	@ObfuscatedName("hs.ao")
	public int field2408 = -1;

	@ObfuscatedName("hs.aj")
	public boolean field2409 = true;

	@ObfuscatedName("hs.ay")
	public int field2374 = -1;

	@ObfuscatedName("hs.ab")
	public class729 field2411;

	@ObfuscatedName("hs.az")
	public int field2384 = -1;

	public class228(int arg0, class51 arg1, class229 arg2) {
		this.field2367 = arg0;
		this.field2412 = arg1;
		this.field2368 = arg2;
	}

	@ObfuscatedName("hs.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method4038(arg0, var2);
		}
	}

	@ObfuscatedName("hs.u(Lalw;II)V")
	public void method4038(class997 arg0, int arg1) {
		if (arg1 == 1) {
			this.field2400 = arg0.method17927();
		} else if (arg1 == 2) {
			this.field2403 = arg0.method17927();
		} else if (arg1 == 3) {
			this.field2370 = arg0.method17918();
		} else if (arg1 == 4) {
			this.field2366 = arg0.method17908();
		} else if (arg1 == 5) {
			this.field2372 = arg0.method17908();
		} else if (arg1 == 6) {
			this.field2388 = arg0.method17904();
		} else if (arg1 == 7) {
			int var3 = arg0.method17904();
			if ((var3 & 0x1) == 0) {
				this.field2379 = false;
			}
			if ((var3 & 0x2) == 2) {
				this.field2404 = true;
			}
		} else if (arg1 == 8) {
			arg0.method17904();
		} else if (arg1 == 9) {
			this.field2371 = arg0.method17906();
			if (this.field2371 == 65535) {
				this.field2371 = -1;
			}
			this.field2387 = arg0.method17906();
			if (this.field2387 == 65535) {
				this.field2387 = -1;
			}
			this.field2386 = arg0.method17910();
			this.field2385 = arg0.method17910();
		} else if (arg1 >= 10 && arg1 <= 14) {
			this.field2381[arg1 - 10] = arg0.method17918();
		} else if (arg1 == 15) {
			int var4 = arg0.method17904();
			this.field2393 = new int[var4 * 2];
			for (int var5 = 0; var5 < var4 * 2; var5++) {
				this.field2393[var5] = arg0.method17973();
			}
			this.field2398 = arg0.method17910();
			int var6 = arg0.method17904();
			this.field2406 = new int[var6];
			for (int var7 = 0; var7 < this.field2406.length; var7++) {
				this.field2406[var7] = arg0.method17910();
			}
			this.field2407 = new byte[var4];
			for (int var8 = 0; var8 < var4; var8++) {
				this.field2407[var8] = arg0.method17905();
			}
		} else if (arg1 == 16) {
			this.field2409 = false;
		} else if (arg1 == 17) {
			this.field2382 = arg0.method17918();
		} else if (arg1 == 18) {
			this.field2383 = arg0.method17927();
		} else if (arg1 == 19) {
			this.field2374 = arg0.method17906();
		} else if (arg1 == 20) {
			this.field2390 = arg0.method17906();
			if (this.field2390 == 65535) {
				this.field2390 = -1;
			}
			this.field2391 = arg0.method17906();
			if (this.field2391 == 65535) {
				this.field2391 = -1;
			}
			this.field2380 = arg0.method17910();
			this.field2389 = arg0.method17910();
		} else if (arg1 == 21) {
			this.field2378 = arg0.method17910();
		} else if (arg1 == 22) {
			this.field2377 = arg0.method17910();
		} else if (arg1 == 23) {
			this.field2399 = arg0.method17904();
			this.field2369 = arg0.method17904();
			this.field2401 = arg0.method17904();
		} else if (arg1 == 24) {
			this.field2410 = arg0.method17973();
			this.field2394 = arg0.method17973();
		} else if (arg1 == 25) {
			this.field2384 = arg0.method17927();
		} else if (arg1 == 26 || arg1 == 27) {
			this.field2371 = arg0.method17906();
			if (this.field2371 == 65535) {
				this.field2371 = -1;
			}
			this.field2387 = arg0.method17906();
			if (this.field2387 == 65535) {
				this.field2387 = -1;
			}
			int var15 = -1;
			if (arg1 == 27) {
				var15 = arg0.method17906();
				if (var15 == 65535) {
					var15 = -1;
				}
			}
			int var16 = arg0.method17904();
			this.field2392 = new int[var16 + 2];
			for (int var17 = 0; var17 <= var16; var17++) {
				this.field2392[var17] = arg0.method17906();
				if (this.field2392[var17] == 65535) {
					this.field2392[var17] = -1;
				}
			}
			this.field2392[var16 + 1] = var15;
		} else if (arg1 == 28) {
			this.field2408 = arg0.method17904();
		} else if (arg1 == 29) {
			this.field2365 = (class230) class686.method1897(class230.method13997(), arg0.method17904());
		} else if (arg1 == 30) {
			this.field2405 = (class231) class686.method1897(Statics.method15088(), arg0.method17904());
		} else if (arg1 == 249) {
			int var9 = arg0.method17904();
			if (this.field2411 == null) {
				int var10 = class783.method16657(var9);
				this.field2411 = new class729(var10);
			}
			for (int var11 = 0; var11 < var9; var11++) {
				boolean var12 = arg0.method17904() == 1;
				int var13 = arg0.method17908();
				class532 var14;
				if (var12) {
					var14 = new class984(arg0.method17918());
				} else {
					var14 = new class988(arg0.method17910());
				}
				this.field2411.method14501(var14, (long) var13);
			}
		}
	}

	@ObfuscatedName("hs.n(I)V")
	public void method975() {
		if (this.field2393 == null) {
			return;
		}
		for (int var1 = 0; var1 < this.field2393.length; var1 += 2) {
			if (this.field2393[var1] < this.field2373) {
				this.field2373 = this.field2393[var1];
			} else if (this.field2393[var1] > this.field2396) {
				this.field2396 = this.field2393[var1];
			}
			if (this.field2393[var1 + 1] < this.field2395) {
				this.field2395 = this.field2393[var1 + 1];
			} else if (this.field2393[var1 + 1] > this.field2397) {
				this.field2397 = this.field2393[var1 + 1];
			}
		}
	}

	@ObfuscatedName("hs.z(Lem;Lep;I)Z")
	public boolean method4030(class151 arg0, class147 arg1) {
		boolean var3 = true;
		int var5;
		if (this.field2387 == -1) {
			if (this.field2371 == -1) {
				return true;
			}
			class305 var6 = arg0.method694(this.field2371);
			var5 = arg1.method678(var6);
		} else {
			class149 var4 = arg0.method695(class455.field4594, this.field2387);
			var5 = arg1.method679(var4);
		}
		if (this.field2392 != null) {
			if (var5 < 0 || var5 >= this.field2392.length - 1) {
				int var7 = this.field2392[this.field2392.length - 1];
				if (var7 == -1) {
					return false;
				}
				if (this.field2386 != -1 && this.field2385 != -1 && (var5 < this.field2386 || var5 > this.field2385)) {
					return false;
				}
			}
			if (this.field2392[var5] == -1) {
				return false;
			}
		} else if (var5 < this.field2386 || var5 > this.field2385) {
			return false;
		}
		boolean var8 = false;
		int var10;
		if (this.field2391 == -1) {
			if (this.field2390 == -1) {
				return true;
			}
			class305 var11 = arg0.method694(this.field2390);
			var10 = arg1.method678(var11);
		} else {
			class149 var9 = arg0.method695(class455.field4594, this.field2391);
			var10 = arg1.method679(var9);
		}
		if (var10 >= this.field2380 && var10 <= this.field2389) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("hs.p(Ldh;ZI)Lcm;")
	public class101 method4025(class133 arg0, boolean arg1) {
		int var3 = arg1 ? this.field2403 : this.field2400;
		int var4 = var3 | arg0.field1595 << 29;
		class101 var5 = (class101) this.field2368.field2414.method2930((long) var4);
		if (var5 != null) {
			return var5;
		} else if (this.field2368.field2415.method6889(var3)) {
			class136 var6 = class111.method1609(this.field2368.field2415, var3, 0);
			if (var6 != null) {
				var5 = arg0.method2200(var6, true);
				this.field2368.field2414.method2921(var5, (long) var4);
			}
			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("hs.d(Ldh;B)Lcm;")
	public class101 method4026(class133 arg0) {
		int var2 = this.field2384 | arg0.field1595 << 29;
		class101 var3 = (class101) this.field2368.field2414.method2930((long) var2);
		if (var3 != null) {
			return var3;
		} else if (this.field2368.field2415.method6889(this.field2384)) {
			class136 var4 = class111.method1609(this.field2368.field2415, this.field2384, 0);
			if (var4 != null) {
				var3 = arg0.method2200(var4, true);
				this.field2368.field2414.method2921(var3, (long) var2);
			}
			return var3;
		} else {
			return null;
		}
	}

	@ObfuscatedName("hs.c(Ldh;I)Lcm;")
	public class101 method4027(class133 arg0) {
		class101 var2 = (class101) this.field2368.field2414.method2930((long) (this.field2383 | 0x20000 | arg0.field1595 << 29));
		if (var2 != null) {
			return var2;
		}
		this.field2368.field2415.method6889(this.field2383);
		class136 var3 = class111.method1609(this.field2368.field2415, this.field2383, 0);
		if (var3 != null) {
			var2 = arg0.method2200(var3, true);
			this.field2368.field2414.method2921(var2, (long) (this.field2383 | 0x20000 | arg0.field1595 << 29));
		}
		return var2;
	}

	@ObfuscatedName("hs.r(III)I")
	public int method4028(int arg0, int arg1) {
		if (this.field2411 == null) {
			return arg1;
		} else {
			class988 var3 = (class988) this.field2411.method14495((long) arg0);
			return var3 == null ? arg1 : var3.field11442;
		}
	}

	@ObfuscatedName("hs.v(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4029(int arg0, String arg1) {
		if (this.field2411 == null) {
			return arg1;
		} else {
			class984 var3 = (class984) this.field2411.method14495((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("hs.o(Lem;Lep;S)Lhs;")
	public final class228 method4024(class151 arg0, class147 arg1) {
		int var3 = -1;
		if (this.field2371 != -1) {
			class305 var4 = arg0.method694(this.field2371);
			if (var4 != null) {
				var3 = arg1.method678(var4);
			}
		} else if (this.field2387 != -1) {
			class149 var5 = arg0.method695(class455.field4594, this.field2387);
			if (var5 != null) {
				var3 = arg1.method679(var5);
			}
		}
		if (var3 >= 0 && var3 < this.field2392.length - 1) {
			return this.field2392[var3] == -1 ? null : (class228) this.field2412.method962(this.field2392[var3]);
		} else {
			int var6 = this.field2392[this.field2392.length - 1];
			return var6 == -1 ? null : (class228) this.field2412.method962(var6);
		}
	}
}

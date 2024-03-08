package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vb")
public class class582 implements class53 {

	@ObfuscatedName("vb.e")
	public final class51 field7303;

	@ObfuscatedName("vb.n")
	public final class583 field7307;

	@ObfuscatedName("vb.u")
	public boolean field7294 = false;

	@ObfuscatedName("vb.z")
	public int field7310 = -1;

	@ObfuscatedName("vb.p")
	public int field7296 = 16777215;

	@ObfuscatedName("vb.d")
	public int field7297 = 70;

	@ObfuscatedName("vb.c")
	public int field7295 = -1;

	@ObfuscatedName("vb.r")
	public int field7299 = -1;

	@ObfuscatedName("vb.v")
	public int field7300 = -1;

	@ObfuscatedName("vb.o")
	public int field7301 = -1;

	@ObfuscatedName("vb.s")
	public int field7302 = 0;

	@ObfuscatedName("vb.y")
	public int field7306 = 0;

	@ObfuscatedName("vb.q")
	public int field7304 = -1;

	@ObfuscatedName("vb.x")
	public String field7305 = "";

	@ObfuscatedName("vb.b")
	public int field7309 = -1;

	@ObfuscatedName("vb.h")
	public int field7289 = 0;

	@ObfuscatedName("vb.a")
	public int field7308 = 0;

	@ObfuscatedName("vb.g")
	public int field7288 = 0;

	@ObfuscatedName("vb.i")
	public int[] field7298;

	@ObfuscatedName("vb.j")
	public int field7311 = -1;

	@ObfuscatedName("vb.t")
	public int field7312 = -1;

	@ObfuscatedName("vb.ae")
	public int field7313 = 1;

	@ObfuscatedName("vb.ag")
	public int field7314 = 1;

	public class582(int arg0, class583 arg1, class51 arg2) {
		this.field7307 = arg1;
		this.field7303 = arg2;
	}

	@ObfuscatedName("vb.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method9257(arg0, var2);
		}
	}

	@ObfuscatedName("vb.u(Lalw;II)V")
	public void method9257(class997 arg0, int arg1) {
		if (arg1 == 1) {
			this.field7310 = arg0.method17927();
		} else if (arg1 == 2) {
			this.field7296 = arg0.method17908();
			this.field7294 = true;
		} else if (arg1 == 3) {
			this.field7295 = arg0.method17927();
		} else if (arg1 == 4) {
			this.field7300 = arg0.method17927();
		} else if (arg1 == 5) {
			this.field7299 = arg0.method17927();
		} else if (arg1 == 6) {
			this.field7301 = arg0.method17927();
		} else if (arg1 == 7) {
			this.field7302 = arg0.method17973();
		} else if (arg1 == 8) {
			this.field7305 = arg0.method17919();
		} else if (arg1 == 9) {
			this.field7297 = arg0.method17906();
		} else if (arg1 == 10) {
			this.field7306 = arg0.method17973();
		} else if (arg1 == 11) {
			this.field7304 = 0;
		} else if (arg1 == 12) {
			this.field7309 = arg0.method17904();
		} else if (arg1 == 13) {
			this.field7289 = arg0.method17973();
		} else if (arg1 == 14) {
			this.field7304 = arg0.method17906();
		} else if (arg1 == 16) {
			this.field7308 = arg0.method17973();
			this.field7288 = arg0.method17973();
		} else if (arg1 == 17 || arg1 == 18) {
			this.field7311 = arg0.method17906();
			if (this.field7311 == 65535) {
				this.field7311 = -1;
			}
			this.field7312 = arg0.method17906();
			if (this.field7312 == 65535) {
				this.field7312 = -1;
			}
			int var3 = -1;
			if (arg1 == 18) {
				var3 = arg0.method17906();
				if (var3 == 65535) {
					var3 = -1;
				}
			}
			int var4 = arg0.method17904();
			this.field7298 = new int[var4 + 2];
			for (int var5 = 0; var5 <= var4; var5++) {
				this.field7298[var5] = arg0.method17906();
				if (this.field7298[var5] == 65535) {
					this.field7298[var5] = -1;
				}
			}
			this.field7298[var4 + 1] = var3;
		} else if (arg1 == 19) {
			this.field7313 = arg0.method17906();
		} else if (arg1 == 20) {
			this.field7314 = arg0.method17906();
		}
	}

	@ObfuscatedName("vb.z(Lem;Lep;I)Lvb;")
	public final class582 method9251(class151 arg0, class147 arg1) {
		int var3 = -1;
		if (this.field7298 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.field7311 != -1) {
				class305 var4 = arg0.method694(this.field7311);
				if (var4 != null) {
					var3 = arg1.method678(var4);
				}
			} else if (this.field7312 != -1) {
				class149 var5 = arg0.method695(class455.field4594, this.field7312);
				if (var5 != null) {
					var3 = arg1.method679(var5);
				}
			}
			if (var3 >= 0 && var3 < this.field7298.length - 1) {
				return this.field7298[var3] == -1 ? null : (class582) this.field7303.method962(this.field7298[var3]);
			} else {
				int var6 = this.field7298[this.field7298.length - 1];
				return var6 == -1 ? null : (class582) this.field7303.method962(var6);
			}
		}
	}

	@ObfuscatedName("vb.p(II)Ljava/lang/String;")
	public String method9252(int arg0) {
		String var2 = this.field7305;
		int var3 = this.field7313 * arg0 / this.field7314;
		while (true) {
			int var4 = var2.indexOf("%1");
			if (var4 < 0) {
				return var2;
			}
			var2 = var2.substring(0, var4) + class695.method1898(var3, false) + var2.substring(var4 + 2);
		}
	}

	@ObfuscatedName("vb.d(Ldh;I)Lcm;")
	public class101 method9258(class133 arg0) {
		if (this.field7295 < 0) {
			return null;
		}
		class101 var2 = (class101) this.field7307.field7316.method2930((long) this.field7295);
		if (var2 == null) {
			this.method9256(arg0);
			var2 = (class101) this.field7307.field7316.method2930((long) this.field7295);
		}
		return var2;
	}

	@ObfuscatedName("vb.c(Ldh;I)Lcm;")
	public class101 method9253(class133 arg0) {
		if (this.field7299 < 0) {
			return null;
		}
		class101 var2 = (class101) this.field7307.field7316.method2930((long) this.field7299);
		if (var2 == null) {
			this.method9256(arg0);
			var2 = (class101) this.field7307.field7316.method2930((long) this.field7299);
		}
		return var2;
	}

	@ObfuscatedName("vb.r(Ldh;I)Lcm;")
	public class101 method9254(class133 arg0) {
		if (this.field7300 < 0) {
			return null;
		}
		class101 var2 = (class101) this.field7307.field7316.method2930((long) this.field7300);
		if (var2 == null) {
			this.method9256(arg0);
			var2 = (class101) this.field7307.field7316.method2930((long) this.field7300);
		}
		return var2;
	}

	@ObfuscatedName("vb.v(Ldh;B)Lcm;")
	public class101 method9255(class133 arg0) {
		if (this.field7301 < 0) {
			return null;
		}
		class101 var2 = (class101) this.field7307.field7316.method2930((long) this.field7301);
		if (var2 == null) {
			this.method9256(arg0);
			var2 = (class101) this.field7307.field7316.method2930((long) this.field7301);
		}
		return var2;
	}

	@ObfuscatedName("vb.o(Ldh;I)V")
	public void method9256(class133 arg0) {
		class442 var2 = this.field7307.field7315;
		if (this.field7295 >= 0 && this.field7307.field7316.method2930((long) this.field7295) == null && var2.method6889(this.field7295)) {
			class136 var3 = class111.method1607(var2, this.field7295);
			this.field7307.field7316.method2921(arg0.method2200(var3, true), (long) this.field7295);
		}
		if (this.field7299 >= 0 && this.field7307.field7316.method2930((long) this.field7299) == null && var2.method6889(this.field7299)) {
			class136 var4 = class111.method1607(var2, this.field7299);
			this.field7307.field7316.method2921(arg0.method2200(var4, true), (long) this.field7299);
		}
		if (this.field7300 >= 0 && this.field7307.field7316.method2930((long) this.field7300) == null && var2.method6889(this.field7300)) {
			class136 var5 = class111.method1607(var2, this.field7300);
			this.field7307.field7316.method2921(arg0.method2200(var5, true), (long) this.field7300);
		}
		if (this.field7301 >= 0 && this.field7307.field7316.method2930((long) this.field7301) == null && var2.method6889(this.field7301)) {
			class136 var6 = class111.method1607(var2, this.field7301);
			this.field7307.field7316.method2921(arg0.method2200(var6, true), (long) this.field7301);
		}
	}

	@ObfuscatedName("vb.n(I)V")
	public void method975() {
	}
}

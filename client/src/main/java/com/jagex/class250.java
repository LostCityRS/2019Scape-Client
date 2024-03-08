package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ir")
public class class250 implements class53 {

	@ObfuscatedName("ir.e")
	public class51 field2649;

	@ObfuscatedName("ir.n")
	public String field2633;

	@ObfuscatedName("ir.m")
	public String field2631;

	@ObfuscatedName("ir.k")
	public int[][] field2632;

	@ObfuscatedName("ir.f")
	public int[][] field2630;

	@ObfuscatedName("ir.w")
	public int field2645 = 0;

	@ObfuscatedName("ir.l")
	public int field2639 = 0;

	@ObfuscatedName("ir.u")
	public boolean field2636 = false;

	@ObfuscatedName("ir.z")
	public int field2637;

	@ObfuscatedName("ir.p")
	public int[] field2638;

	@ObfuscatedName("ir.d")
	public int[] field2635;

	@ObfuscatedName("ir.c")
	public int[][] field2640;

	@ObfuscatedName("ir.r")
	public int field2641;

	@ObfuscatedName("ir.v")
	public int[] field2642;

	@ObfuscatedName("ir.o")
	public int[] field2643;

	@ObfuscatedName("ir.s")
	public int[] field2629;

	@ObfuscatedName("ir.y")
	public String[] field2644;

	@ObfuscatedName("ir.q")
	public int[] field2646;

	@ObfuscatedName("ir.x")
	public int[] field2647;

	@ObfuscatedName("ir.b")
	public int[] field2648;

	@ObfuscatedName("ir.h")
	public String[] field2634;

	@ObfuscatedName("ir.a")
	public class729 field2650;

	@ObfuscatedName("ir.g")
	public int field2651 = -1;

	public class250(int arg0, class51 arg1) {
		this.field2649 = arg1;
	}

	@ObfuscatedName("ir.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method4426(arg0, var2);
		}
	}

	@ObfuscatedName("ir.u(Lalw;II)V")
	public void method4426(class997 arg0, int arg1) {
		if (arg1 == 1) {
			this.field2633 = arg0.method17919();
		} else if (arg1 == 2) {
			this.field2631 = arg0.method17919();
		} else if (arg1 == 3) {
			int var3 = arg0.method17904();
			this.field2632 = new int[var3][3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2632[var4][0] = arg0.method17906();
				this.field2632[var4][1] = arg0.method17910();
				this.field2632[var4][2] = arg0.method17910();
			}
		} else if (arg1 == 4) {
			int var5 = arg0.method17904();
			this.field2630 = new int[var5][3];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field2630[var6][0] = arg0.method17906();
				this.field2630[var6][1] = arg0.method17910();
				this.field2630[var6][2] = arg0.method17910();
			}
		} else if (arg1 == 5) {
			arg0.method17906();
		} else if (arg1 == 6) {
			this.field2645 = arg0.method17904();
		} else if (arg1 == 7) {
			this.field2639 = arg0.method17904();
		} else if (arg1 == 8) {
			this.field2636 = true;
		} else if (arg1 == 9) {
			this.field2637 = arg0.method17904();
		} else if (arg1 == 10) {
			int var7 = arg0.method17904();
			this.field2638 = new int[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field2638[var8] = arg0.method17910();
			}
		} else if (arg1 == 12) {
			arg0.method17910();
		} else if (arg1 == 13) {
			int var9 = arg0.method17904();
			this.field2635 = new int[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field2635[var10] = arg0.method17906();
			}
		} else if (arg1 == 14) {
			int var11 = arg0.method17904();
			this.field2640 = new int[var11][2];
			for (int var12 = 0; var12 < var11; var12++) {
				this.field2640[var12][0] = arg0.method17904();
				this.field2640[var12][1] = arg0.method17904();
			}
		} else if (arg1 == 15) {
			this.field2641 = arg0.method17906();
		} else if (arg1 == 17) {
			this.field2651 = arg0.method17927();
		} else if (arg1 == 18) {
			int var13 = arg0.method17904();
			this.field2642 = new int[var13];
			this.field2643 = new int[var13];
			this.field2629 = new int[var13];
			this.field2644 = new String[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				this.field2642[var14] = arg0.method17910();
				this.field2643[var14] = arg0.method17910();
				this.field2629[var14] = arg0.method17910();
				this.field2644[var14] = arg0.method17918();
			}
		} else if (arg1 == 19) {
			int var15 = arg0.method17904();
			this.field2646 = new int[var15];
			this.field2647 = new int[var15];
			this.field2648 = new int[var15];
			this.field2634 = new String[var15];
			for (int var16 = 0; var16 < var15; var16++) {
				this.field2646[var16] = arg0.method17910();
				this.field2647[var16] = arg0.method17910();
				this.field2648[var16] = arg0.method17910();
				this.field2634[var16] = arg0.method17918();
			}
		} else if (arg1 == 249) {
			int var17 = arg0.method17904();
			if (this.field2650 == null) {
				int var18 = class783.method16657(var17);
				this.field2650 = new class729(var18);
			}
			for (int var19 = 0; var19 < var17; var19++) {
				boolean var20 = arg0.method17904() == 1;
				int var21 = arg0.method17908();
				class532 var22;
				if (var20) {
					var22 = new class984(arg0.method17918());
				} else {
					var22 = new class988(arg0.method17910());
				}
				this.field2650.method14501(var22, (long) var21);
			}
		}
	}

	@ObfuscatedName("ir.n(I)V")
	public void method975() {
		if (this.field2631 == null) {
			this.field2631 = this.field2633;
		}
	}

	@ObfuscatedName("ir.z(IIB)I")
	public int method4428(int arg0, int arg1) {
		if (this.field2650 == null) {
			return arg1;
		} else {
			class988 var3 = (class988) this.field2650.method14495((long) arg0);
			return var3 == null ? arg1 : var3.field11442;
		}
	}

	@ObfuscatedName("ir.p(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4437(int arg0, String arg1) {
		if (this.field2650 == null) {
			return arg1;
		} else {
			class984 var3 = (class984) this.field2650.method14495((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("ir.d(Lep;I)Z")
	public boolean method4429(class147 arg0) {
		if (this.field2632 != null) {
			for (int var2 = 0; var2 < this.field2632.length; var2++) {
				class149 var3 = ((class151) arg0).method695(class455.field4594, this.field2632[var2][0]);
				if (arg0.method679(var3) >= this.field2632[var2][1]) {
					return true;
				}
			}
		}
		if (this.field2630 != null) {
			for (int var4 = 0; var4 < this.field2630.length; var4++) {
				class305 var5 = ((class151) arg0).method694(this.field2630[var4][0]);
				if (arg0.method678(var5) >= this.field2630[var4][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("ir.c(Lep;I)Z")
	public boolean method4430(class147 arg0) {
		if (this.field2632 != null) {
			for (int var2 = 0; var2 < this.field2632.length; var2++) {
				class149 var3 = ((class151) arg0).method695(class455.field4594, this.field2632[var2][0]);
				if (arg0.method679(var3) >= this.field2632[var2][2]) {
					return true;
				}
			}
		}
		if (this.field2630 != null) {
			for (int var4 = 0; var4 < this.field2630.length; var4++) {
				class305 var5 = ((class151) arg0).method694(this.field2630[var4][0]);
				if (arg0.method678(var5) >= this.field2630[var4][2]) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("ir.r(Lep;I)Z")
	public boolean method4431(class147 arg0) {
		if (Statics.method5179(arg0, this.field2649) < this.field2641) {
			return false;
		}
		if (this.field2640 != null) {
			for (int var2 = 0; var2 < this.field2640.length; var2++) {
				if (((class644) arg0).method674(this.field2640[var2][0]) < this.field2640[var2][1]) {
					return false;
				}
			}
		}
		if (this.field2635 != null) {
			for (int var3 = 0; var3 < this.field2635.length; var3++) {
				if (!((class250) this.field2649.method962(this.field2635[var3])).method4430(arg0)) {
					return false;
				}
			}
		}
		if (this.field2642 != null) {
			for (int var4 = 0; var4 < this.field2642.length; var4++) {
				class149 var5 = ((class151) arg0).method695(class455.field4594, this.field2642[var4]);
				int var6 = arg0.method679(var5);
				if (var6 < this.field2643[var4] || var6 > this.field2629[var4]) {
					return false;
				}
			}
		}
		if (this.field2646 != null) {
			for (int var7 = 0; var7 < this.field2646.length; var7++) {
				class305 var8 = ((class151) arg0).method694(this.field2646[var7]);
				int var9 = arg0.method678(var8);
				if (var9 < this.field2647[var7] || var9 > this.field2648[var7]) {
					return false;
				}
			}
		}
		return true;
	}

	@ObfuscatedName("ir.v(Lep;I)Z")
	public boolean method4440(class147 arg0) {
		return Statics.method5179(arg0, this.field2649) >= this.field2641;
	}

	@ObfuscatedName("ir.o(Lep;IB)Z")
	public boolean method4433(class147 arg0, int arg1) {
		if (this.field2640 == null || arg1 < 0 || arg1 >= this.field2640.length) {
			return false;
		} else {
			return ((class644) arg0).method674(this.field2640[arg1][0]) >= this.field2640[arg1][1];
		}
	}

	@ObfuscatedName("ir.s(Lep;IB)Z")
	public boolean method4453(class147 arg0, int arg1) {
		if (this.field2635 == null || arg1 < 0 || arg1 >= this.field2635.length) {
			return false;
		} else {
			return ((class250) this.field2649.method962(this.field2635[arg1])).method4430(arg0);
		}
	}

	@ObfuscatedName("ir.y(Lep;II)Z")
	public boolean method4435(class147 arg0, int arg1) {
		if (this.field2642 == null || arg1 < 0 || arg1 >= this.field2642.length) {
			return false;
		} else {
			class149 var3 = ((class151) arg0).method695(class455.field4594, this.field2642[arg1]);
			int var4 = arg0.method679(var3);
			return var4 >= this.field2643[arg1] && var4 <= this.field2629[arg1];
		}
	}

	@ObfuscatedName("ir.q(Lep;II)Z")
	public boolean method4436(class147 arg0, int arg1) {
		if (this.field2646 == null || arg1 < 0 || arg1 >= this.field2646.length) {
			return false;
		} else {
			class305 var3 = ((class151) arg0).method694(this.field2646[arg1]);
			int var4 = arg0.method678(var3);
			return var4 >= this.field2647[arg1] && var4 <= this.field2648[arg1];
		}
	}
}

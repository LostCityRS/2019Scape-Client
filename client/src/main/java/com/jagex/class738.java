package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.util.Arrays;

@ObfuscatedName("abv")
public class class738 implements class53 {

	@ObfuscatedName("abv.w")
	public static short[] field8650 = new short[256];

	@ObfuscatedName("abv.l")
	public class51 field8625;

	@ObfuscatedName("abv.u")
	public class737 field8621;

	@ObfuscatedName("abv.z")
	public int field8627;

	@ObfuscatedName("abv.p")
	public int field8628 = -1;

	@ObfuscatedName("abv.d")
	public int field8655;

	@ObfuscatedName("abv.c")
	public String field8630 = "null";

	@ObfuscatedName("abv.r")
	public short[] field8666;

	@ObfuscatedName("abv.v")
	public short[] field8622;

	@ObfuscatedName("abv.o")
	public byte[] field8633;

	@ObfuscatedName("abv.s")
	public short[] field8634;

	@ObfuscatedName("abv.y")
	public short[] field8635;

	@ObfuscatedName("abv.q")
	public byte[] field8661;

	@ObfuscatedName("abv.x")
	public byte[] field8637;

	@ObfuscatedName("abv.b")
	public int field8638 = 2000;

	@ObfuscatedName("abv.h")
	public int field8639 = 0;

	@ObfuscatedName("abv.a")
	public int field8626 = 0;

	@ObfuscatedName("abv.g")
	public int field8641 = 0;

	@ObfuscatedName("abv.i")
	public int field8695 = 0;

	@ObfuscatedName("abv.j")
	public int field8643 = 0;

	@ObfuscatedName("abv.t")
	public int field8644 = 0;

	@ObfuscatedName("abv.ae")
	public int field8620 = 1;

	@ObfuscatedName("abv.ag")
	public boolean field8684 = false;

	@ObfuscatedName("abv.ah")
	public String[] field8647;

	@ObfuscatedName("abv.al")
	public String[] field8648;

	@ObfuscatedName("abv.ac")
	public int[] field8649;

	@ObfuscatedName("abv.ai")
	public int[] field8619;

	@ObfuscatedName("abv.aw")
	public int field8651 = -1;

	@ObfuscatedName("abv.as")
	public int field8652 = -1;

	@ObfuscatedName("abv.at")
	public int field8653 = -1;

	@ObfuscatedName("abv.ad")
	public int field8654 = -1;

	@ObfuscatedName("abv.am")
	public int field8636 = -1;

	@ObfuscatedName("abv.au")
	public int field8656 = -1;

	@ObfuscatedName("abv.ar")
	public int field8657 = -1;

	@ObfuscatedName("abv.ap")
	public int field8658 = -1;

	@ObfuscatedName("abv.aq")
	public int field8659 = -1;

	@ObfuscatedName("abv.ax")
	public int field8632 = 0;

	@ObfuscatedName("abv.av")
	public int field8640 = 0;

	@ObfuscatedName("abv.ao")
	public int field8660 = 0;

	@ObfuscatedName("abv.aj")
	public int field8670 = 0;

	@ObfuscatedName("abv.ay")
	public int field8664 = 0;

	@ObfuscatedName("abv.ab")
	public int field8665 = 0;

	@ObfuscatedName("abv.az")
	public int field8667 = -1;

	@ObfuscatedName("abv.aa")
	public int field8631 = -1;

	@ObfuscatedName("abv.af")
	public int field8668 = -1;

	@ObfuscatedName("abv.ak")
	public int field8669 = -1;

	@ObfuscatedName("abv.an")
	public int[] field8629;

	@ObfuscatedName("abv.bf")
	public int[] field8671;

	@ObfuscatedName("abv.bl")
	public int field8663 = -1;

	@ObfuscatedName("abv.bk")
	public int field8673 = -1;

	@ObfuscatedName("abv.bh")
	public int field8674 = -1;

	@ObfuscatedName("abv.bx")
	public int field8675 = -1;

	@ObfuscatedName("abv.bd")
	public int field8676 = -1;

	@ObfuscatedName("abv.bc")
	public int field8677 = -1;

	@ObfuscatedName("abv.bi")
	public String field8678 = "null";

	@ObfuscatedName("abv.bn")
	public int field8679 = 0;

	@ObfuscatedName("abv.bt")
	public int field8686 = 128;

	@ObfuscatedName("abv.bq")
	public int field8681 = 128;

	@ObfuscatedName("abv.bm")
	public int field8682 = 128;

	@ObfuscatedName("abv.bb")
	public int field8683 = 0;

	@ObfuscatedName("abv.be")
	public int field8624 = 0;

	@ObfuscatedName("abv.by")
	public int field8685 = 0;

	@ObfuscatedName("abv.bu")
	public boolean field8645 = false;

	@ObfuscatedName("abv.bw")
	public boolean field8687 = false;

	@ObfuscatedName("abv.bo")
	public boolean field8688 = false;

	@ObfuscatedName("abv.bz")
	public int field8689 = 0;

	@ObfuscatedName("abv.bv")
	public class729 field8690;

	@ObfuscatedName("abv.br")
	public int[] field8691;

	@ObfuscatedName("abv.bg")
	public int field8692 = 0;

	@ObfuscatedName("abv.ba")
	public int field8693 = -1;

	@ObfuscatedName("abv.bp")
	public int field8694 = -1;

	@ObfuscatedName("abv.bj")
	public boolean field8680 = false;

	@ObfuscatedName("abv.bs")
	public int field8696;

	@ObfuscatedName("abv.cl")
	public boolean field8697 = false;

	@ObfuscatedName("abv.cg")
	public boolean field8698 = true;

	@ObfuscatedName("abv.ce")
	public static String field8699 = "</col>";

	public class738(int arg0, class51 arg1, class737 arg2) {
		this.field8627 = arg0;
		this.field8625 = arg1;
		this.field8621 = arg2;
		this.field8647 = (String[]) this.field8621.field8617.clone();
		this.field8648 = (String[]) this.field8621.field8616.clone();
	}

	@ObfuscatedName("abv.n(I)V")
	public void method975() {
		if (this.field8663 != -1) {
			this.method14640((class738) this.field8625.method962(this.field8663), (class738) this.field8625.method962(this.field8673), this.field8621.field8618);
		} else if (this.field8675 != -1) {
			this.method14641((class738) this.field8625.method962(this.field8675), (class738) this.field8625.method962(this.field8674), this.field8621.field8618);
		} else if (this.field8694 != -1) {
			this.method14653((class738) this.field8625.method962(this.field8694), (class738) this.field8625.method962(this.field8693), this.field8621.field8618);
		} else if (this.field8677 != -1) {
			this.method14643((class738) this.field8625.method962(this.field8677), (class738) this.field8625.method962(this.field8676), this.field8621.field8618);
		}
		if (this.field8689 != 0) {
			this.field8687 = false;
		}
		if (this.field8621.field8610 || !this.field8684) {
			return;
		}
		this.field8685 = 0;
		this.field8647 = this.field8621.field8617;
		this.field8648 = this.field8621.field8616;
		this.field8645 = false;
		this.field8691 = null;
		this.field8687 = false;
		if (this.field8690 == null) {
			return;
		}
		boolean var1 = false;
		for (class532 var2 = this.field8690.method14500(); var2 != null; var2 = this.field8690.method14502()) {
			class789 var3 = (class789) this.field8621.field8615.method962((int) var2.field6760);
			if (var3.field9174) {
				var2.method8440();
			} else {
				var1 = true;
			}
		}
		if (!var1) {
			this.field8690 = null;
		}
	}

	@ObfuscatedName("abv.e(Lalw;B)V")
	public void method976(class997 arg0) {
		this.field8687 = true;
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method14638(arg0, var2);
		}
	}

	@ObfuscatedName("abv.u(Lalw;II)V")
	public void method14638(class997 arg0, int arg1) {
		if (arg1 == 1) {
			this.field8655 = arg0.method17927();
		} else if (arg1 == 2) {
			this.field8630 = arg0.method17918();
		} else if (arg1 == 4) {
			this.field8638 = arg0.method17906();
		} else if (arg1 == 5) {
			this.field8639 = arg0.method17906();
		} else if (arg1 == 6) {
			this.field8626 = arg0.method17906();
		} else if (arg1 == 7) {
			this.field8695 = arg0.method17906();
			if (this.field8695 > 32767) {
				this.field8695 -= 65536;
			}
		} else if (arg1 == 8) {
			this.field8643 = arg0.method17906();
			if (this.field8643 > 32767) {
				this.field8643 -= 65536;
			}
		} else if (arg1 == 11) {
			this.field8644 = 1;
		} else if (arg1 == 12) {
			this.field8620 = arg0.method17910();
		} else if (arg1 == 13) {
			this.field8651 = arg0.method17904();
		} else if (arg1 == 14) {
			this.field8652 = arg0.method17904();
		} else if (arg1 == 15) {
			this.field8687 = false;
		} else if (arg1 == 16) {
			this.field8684 = true;
		} else if (arg1 == 23) {
			this.field8654 = arg0.method17927();
		} else if (arg1 == 24) {
			this.field8636 = arg0.method17927();
		} else if (arg1 == 25) {
			this.field8656 = arg0.method17927();
		} else if (arg1 == 26) {
			this.field8657 = arg0.method17927();
		} else if (arg1 == 27) {
			this.field8653 = arg0.method17904();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.field8647[arg1 - 30] = arg0.method17918();
		} else if (arg1 >= 35 && arg1 < 40) {
			this.field8648[arg1 - 35] = arg0.method17918();
		} else if (arg1 == 40) {
			int var3 = arg0.method17904();
			this.field8666 = new short[var3];
			this.field8622 = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field8666[var4] = (short) arg0.method17906();
				this.field8622[var4] = (short) arg0.method17906();
			}
		} else if (arg1 == 41) {
			int var5 = arg0.method17904();
			this.field8634 = new short[var5];
			this.field8635 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field8634[var6] = (short) arg0.method17906();
				this.field8635[var6] = (short) arg0.method17906();
			}
		} else if (arg1 == 42) {
			int var7 = arg0.method17904();
			this.field8633 = new byte[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field8633[var8] = arg0.method17905();
			}
		} else if (arg1 == 43) {
			this.field8696 = arg0.method17910();
			this.field8680 = true;
		} else if (arg1 == 44) {
			int var9 = arg0.method17906();
			int var10 = 0;
			for (int var11 = var9; var11 > 0; var11 >>= 0x1) {
				var10++;
			}
			this.field8661 = new byte[var10];
			byte var12 = 0;
			for (int var13 = 0; var13 < var10; var13++) {
				if ((var9 & 0x1 << var13) > 0) {
					this.field8661[var13] = var12++;
				} else {
					this.field8661[var13] = -1;
				}
			}
		} else if (arg1 == 45) {
			int var14 = arg0.method17906();
			int var15 = 0;
			for (int var16 = var14; var16 > 0; var16 >>= 0x1) {
				var15++;
			}
			this.field8637 = new byte[var15];
			byte var17 = 0;
			for (int var18 = 0; var18 < var15; var18++) {
				if ((var14 & 0x1 << var18) > 0) {
					this.field8637[var18] = var17++;
				} else {
					this.field8637[var18] = -1;
				}
			}
		} else if (arg1 == 65) {
			this.field8645 = true;
		} else if (arg1 == 78) {
			this.field8658 = arg0.method17927();
		} else if (arg1 == 79) {
			this.field8659 = arg0.method17927();
		} else if (arg1 == 90) {
			this.field8667 = arg0.method17927();
		} else if (arg1 == 91) {
			this.field8668 = arg0.method17927();
		} else if (arg1 == 92) {
			this.field8631 = arg0.method17927();
		} else if (arg1 == 93) {
			this.field8669 = arg0.method17927();
		} else if (arg1 == 94) {
			this.field8628 = arg0.method17906();
		} else if (arg1 == 95) {
			this.field8641 = arg0.method17906();
		} else if (arg1 == 96) {
			this.field8689 = arg0.method17904();
		} else if (arg1 == 97) {
			this.field8673 = arg0.method17906();
		} else if (arg1 == 98) {
			this.field8663 = arg0.method17906();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.field8629 == null) {
				this.field8629 = new int[10];
				this.field8671 = new int[10];
			}
			this.field8629[arg1 - 100] = arg0.method17906();
			this.field8671[arg1 - 100] = arg0.method17906();
		} else if (arg1 == 110) {
			this.field8686 = arg0.method17906();
		} else if (arg1 == 111) {
			this.field8681 = arg0.method17906();
		} else if (arg1 == 112) {
			this.field8682 = arg0.method17906();
		} else if (arg1 == 113) {
			this.field8683 = arg0.method17905();
		} else if (arg1 == 114) {
			this.field8624 = arg0.method17905() * 5;
		} else if (arg1 == 115) {
			this.field8685 = arg0.method17904();
		} else if (arg1 == 121) {
			this.field8674 = arg0.method17906();
		} else if (arg1 == 122) {
			this.field8675 = arg0.method17906();
		} else if (arg1 == 125) {
			this.field8632 = arg0.method17905() << 2;
			this.field8660 = arg0.method17905() << 2;
			this.field8664 = arg0.method17905() << 2;
		} else if (arg1 == 126) {
			this.field8640 = arg0.method17905() << 2;
			this.field8670 = arg0.method17905() << 2;
			this.field8665 = arg0.method17905() << 2;
		} else if (arg1 == 127 || arg1 == 128 || arg1 == 129 || arg1 == 130) {
			arg0.method17904();
			arg0.method17906();
		} else if (arg1 == 132) {
			int var19 = arg0.method17904();
			this.field8691 = new int[var19];
			for (int var20 = 0; var20 < var19; var20++) {
				this.field8691[var20] = arg0.method17906();
			}
		} else if (arg1 == 134) {
			this.field8692 = arg0.method17904();
		} else if (arg1 == 139) {
			this.field8693 = arg0.method17906();
		} else if (arg1 == 140) {
			this.field8694 = arg0.method17906();
		} else if (arg1 >= 142 && arg1 < 147) {
			if (this.field8649 == null) {
				this.field8649 = new int[6];
				Arrays.fill(this.field8649, -1);
			}
			this.field8649[arg1 - 142] = arg0.method17906();
		} else if (arg1 >= 150 && arg1 < 155) {
			if (this.field8619 == null) {
				this.field8619 = new int[5];
				Arrays.fill(this.field8619, -1);
			}
			this.field8619[arg1 - 150] = arg0.method17906();
		} else if (arg1 != 156) {
			if (arg1 == 157) {
				this.field8697 = true;
			} else if (arg1 == 161) {
				this.field8676 = arg0.method17906();
			} else if (arg1 == 162) {
				this.field8677 = arg0.method17906();
			} else if (arg1 == 163) {
				this.field8679 = arg0.method17906();
			} else if (arg1 == 164) {
				this.field8678 = arg0.method17918();
			} else if (arg1 == 165) {
				this.field8644 = 2;
			} else if (arg1 == 167) {
				this.field8688 = true;
			} else if (arg1 == 168) {
				this.field8698 = false;
			} else if (arg1 == 249) {
				int var21 = arg0.method17904();
				if (this.field8690 == null) {
					int var22 = class783.method16657(var21);
					this.field8690 = new class729(var22);
				}
				for (int var23 = 0; var23 < var21; var23++) {
					boolean var24 = arg0.method17904() == 1;
					int var25 = arg0.method17908();
					class532 var26;
					if (var24) {
						var26 = new class984(arg0.method17918());
					} else {
						var26 = new class988(arg0.method17910());
					}
					this.field8690.method14501(var26, (long) var25);
				}
			}
		}
	}

	@ObfuscatedName("abv.z(Labq;Labv;Labv;Lacz;Lzt;I)V")
	public void method14664(class739 arg0, class738 arg1, class738 arg2, class776 arg3, class687 arg4) {
		this.field8655 = arg1.field8655;
		this.field8638 = arg1.field8638;
		this.field8639 = arg1.field8639;
		this.field8626 = arg1.field8626;
		this.field8641 = arg1.field8641;
		this.field8695 = arg1.field8695;
		this.field8643 = arg1.field8643;
		class738 var6 = class739.field8702 == arg0 ? arg1 : arg2;
		this.field8666 = var6.field8666;
		this.field8622 = var6.field8622;
		this.field8633 = var6.field8633;
		this.field8634 = var6.field8634;
		this.field8635 = var6.field8635;
		this.field8630 = arg2.field8630;
		this.field8684 = arg2.field8684;
		if (class739.field8702 == arg0) {
			this.field8620 = arg2.field8620;
			this.field8644 = 1;
			if (arg2.field8688) {
				this.field8687 = false;
			} else {
				this.field8687 = arg2.field8687;
			}
		} else if (class739.field8701 == arg0) {
			this.field8630 = arg2.field8678;
			this.field8620 = (int) Math.floor((double) (arg2.field8620 / arg2.field8679));
			this.field8644 = 1;
			this.field8645 = arg2.field8645;
			this.field8687 = arg2.field8687;
			this.field8628 = arg1.field8628;
			this.field8649 = arg1.field8649;
			this.field8619 = arg1.field8619;
			this.field8648 = new String[5];
			this.field8648[0] = class776.field8958.method15021(arg4);
			this.field8648[4] = arg3.method15021(arg4);
		} else {
			this.field8620 = 0;
			this.field8644 = arg2.field8644;
			this.field8687 = false;
			this.field8651 = arg2.field8651;
			this.field8652 = arg2.field8652;
			this.field8653 = arg2.field8653;
			this.field8654 = arg2.field8654;
			this.field8636 = arg2.field8636;
			this.field8658 = arg2.field8658;
			this.field8656 = arg2.field8656;
			this.field8657 = arg2.field8657;
			this.field8659 = arg2.field8659;
			this.field8632 = arg2.field8632;
			this.field8640 = arg2.field8640;
			this.field8660 = arg2.field8660;
			this.field8670 = arg2.field8670;
			this.field8664 = arg2.field8664;
			this.field8665 = arg2.field8665;
			this.field8667 = arg2.field8667;
			this.field8631 = arg2.field8631;
			this.field8668 = arg2.field8668;
			this.field8669 = arg2.field8669;
			this.field8628 = arg2.field8628;
			this.field8685 = arg2.field8685;
			this.field8647 = arg2.field8647;
			this.field8690 = arg2.field8690;
			this.field8648 = new String[5];
			if (arg2.field8648 != null) {
				for (int var7 = 0; var7 < 4; var7++) {
					this.field8648[var7] = arg2.field8648[var7];
				}
			}
			this.field8648[4] = arg3.method15021(arg4);
			this.field8698 = false;
		}
	}

	@ObfuscatedName("abv.p(Labv;Labv;Lzt;S)V")
	public void method14640(class738 arg0, class738 arg1, class687 arg2) {
		this.method14664(class739.field8702, arg0, arg1, null, arg2);
	}

	@ObfuscatedName("abv.d(Labv;Labv;Lzt;I)V")
	public void method14641(class738 arg0, class738 arg1, class687 arg2) {
		this.method14664(class739.field8703, arg0, arg1, class776.field8954, arg2);
	}

	@ObfuscatedName("abv.c(Labv;Labv;Lzt;I)V")
	public void method14653(class738 arg0, class738 arg1, class687 arg2) {
		this.method14664(class739.field8704, arg0, arg1, class776.field9000, arg2);
	}

	@ObfuscatedName("abv.r(Labv;Labv;Lzt;I)V")
	public void method14643(class738 arg0, class738 arg1, class687 arg2) {
		this.method14664(class739.field8701, arg0, arg1, class776.field8960, arg2);
	}

	@ObfuscatedName("abv.v(Ldh;IILxg;Laaq;IIIII)Ldo;")
	public final class116 method14644(class133 arg0, int arg1, int arg2, class639 arg3, class721 arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.field8629 != null && arg2 > 1) {
			int var10 = -1;
			for (int var11 = 0; var11 < 10; var11++) {
				if (arg2 >= this.field8671[var11] && this.field8671[var11] != 0) {
					var10 = this.field8629[var11];
				}
			}
			if (var10 != -1) {
				return ((class738) this.field8625.method962(var10)).method14644(arg0, arg1, 1, arg3, arg4, arg5, arg6, arg7, arg8);
			}
		}
		int var12 = arg1;
		if (arg4 != null) {
			var12 = arg1 | arg4.method14358();
		}
		class162 var13 = this.field8621.field8612;
		class116 var14;
		synchronized (this.field8621.field8612) {
			var14 = (class116) this.field8621.field8612.method2930((long) (this.field8627 | arg0.field1595 << 29));
		}
		if (var14 == null || arg0.method2394(var14.method1691(), var12) != 0) {
			if (var14 != null) {
				var12 = arg0.method2213(var12, var14.method1691());
			}
			int var16 = var12;
			if (this.field8634 != null) {
				var16 = var12 | 0x8000;
			}
			if (this.field8666 != null || arg3 != null) {
				var16 |= 0x4000;
			}
			if (this.field8686 != 128) {
				var16 |= 0x1;
			}
			if (this.field8681 != 128) {
				var16 |= 0x2;
			}
			if (this.field8682 != 128) {
				var16 |= 0x4;
			}
			class120 var17 = class120.method1931(this.field8621.field8614, this.field8655, 0);
			if (var17 == null) {
				return null;
			}
			if (var17.field1372 < 13) {
				var17.method1947(2);
			}
			var14 = arg0.method2211(var17, var16, this.field8621.field8611, this.field8683 + 64, this.field8624 + 850);
			if (this.field8686 != 128 || this.field8681 != 128 || this.field8682 != 128) {
				var14.method1699(this.field8686, this.field8681, this.field8682);
			}
			if (this.field8666 != null) {
				for (int var18 = 0; var18 < this.field8666.length; var18++) {
					if (this.field8633 == null || var18 >= this.field8633.length) {
						var14.method1859(this.field8666[var18], this.field8622[var18]);
					} else {
						var14.method1859(this.field8666[var18], field8650[this.field8633[var18] & 0xFF]);
					}
				}
			}
			if (this.field8634 != null) {
				for (int var19 = 0; var19 < this.field8634.length; var19++) {
					var14.method1744(this.field8634[var19], this.field8635[var19]);
				}
			}
			if (arg3 != null) {
				int var20 = 0;
				label133: while (true) {
					if (var20 >= 10) {
						int var22 = 0;
						while (true) {
							if (var22 >= 10) {
								break label133;
							}
							for (int var23 = 0; var23 < Statics.field10766[var22].length; var23++) {
								if (arg3.field7895[var22] < Statics.field9259[var22][var23].length) {
									var14.method1744(Statics.field10766[var22][var23], Statics.field9259[var22][var23][arg3.field7895[var22]]);
								}
							}
							var22++;
						}
					}
					for (int var21 = 0; var21 < Statics.field7577[var20].length; var21++) {
						if (arg3.field7894[var20] < Statics.field1434[var20][var21].length) {
							var14.method1859(Statics.field7577[var20][var21], Statics.field1434[var20][var21][arg3.field7894[var20]]);
						}
					}
					var20++;
				}
			}
			var14.method1690(var12);
			class162 var24 = this.field8621.field8612;
			synchronized (this.field8621.field8612) {
				this.field8621.field8612.method2921(var14, (long) (this.field8627 | arg0.field1595 << 29));
			}
		}
		if (arg4 != null || arg8 != 0) {
			var14 = var14.method1773((byte) 1, var12, true);
			if (arg4 != null) {
				arg4.method14359(var14, 0);
			}
			if (arg8 != 0) {
				var14.method1745(arg5, arg6, arg7, arg8);
			}
		}
		var14.method1690(arg1);
		return var14;
	}

	@ObfuscatedName("abv.o(II)Labv;")
	public class738 method14645(int arg0) {
		if (this.field8629 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field8671[var3] && this.field8671[var3] != 0) {
					var2 = this.field8629[var3];
				}
			}
			if (var2 != -1) {
				return (class738) this.field8625.method962(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("abv.s(Ldh;Ldh;IIIZILeu;Lxg;Lws;B)[I")
	public int[] method14646(class133 arg0, class133 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class140 arg7, class639 arg8, class629 arg9) {
		class120 var11 = class120.method1931(this.field8621.field8614, this.field8655, 0);
		if (var11 == null) {
			return null;
		}
		if (var11.field1372 < 13) {
			var11.method1947(2);
		}
		if (this.field8666 != null) {
			for (int var12 = 0; var12 < this.field8666.length; var12++) {
				if (this.field8633 == null || var12 >= this.field8633.length) {
					var11.method1943(this.field8666[var12], this.field8622[var12]);
				} else {
					var11.method1943(this.field8666[var12], field8650[this.field8633[var12] & 0xFF]);
				}
			}
		}
		if (this.field8634 != null) {
			for (int var13 = 0; var13 < this.field8634.length; var13++) {
				var11.method1937(this.field8634[var13], this.field8635[var13]);
			}
		}
		if (arg8 != null) {
			for (int var14 = 0; var14 < 10; var14++) {
				for (int var15 = 0; var15 < Statics.field7577[var14].length; var15++) {
					if (arg8.field7894[var14] < Statics.field1434[var14][var15].length) {
						var11.method1943(Statics.field7577[var14][var15], Statics.field1434[var14][var15][arg8.field7894[var14]]);
					}
				}
			}
			for (int var16 = 0; var16 < 10; var16++) {
				for (int var17 = 0; var17 < Statics.field10766[var16].length; var17++) {
					if (arg8.field7895[var16] < Statics.field9259[var16][var17].length) {
						var11.method1937(Statics.field10766[var16][var17], Statics.field9259[var16][var17][arg8.field7895[var16]]);
					}
				}
			}
		}
		int var18 = 2048;
		boolean var19 = false;
		if (this.field8686 != 128 || this.field8681 != 128 || this.field8682 != 128) {
			var19 = true;
			var18 |= 0x7;
		}
		class116 var20 = arg0.method2211(var11, var18, 64, this.field8683 + 64, this.field8624 + 768);
		if (!var20.method1746()) {
			return null;
		}
		if (var19) {
			var20.method1699(this.field8686, this.field8681, this.field8682);
		}
		class101 var21 = null;
		if (this.field8663 != -1) {
			var21 = this.field8621.method14617(arg0, arg1, this.field8673, 10, 1, 0, true, true, 0, arg7, arg8, arg9, this.field8625);
			if (var21 == null) {
				return null;
			}
		} else if (this.field8675 != -1) {
			var21 = this.field8621.method14617(arg0, arg1, this.field8674, arg2, arg3, arg4, false, true, 0, arg7, arg8, arg9, this.field8625);
			if (var21 == null) {
				return null;
			}
		} else if (this.field8694 != -1) {
			var21 = this.field8621.method14617(arg0, arg1, this.field8693, arg2, arg3, arg4, false, true, 0, arg7, arg8, arg9, this.field8625);
			if (var21 == null) {
				return null;
			}
		} else if (this.field8677 != -1) {
			var21 = this.field8621.method14617(arg0, arg1, this.field8676, 10, 1, 0, true, true, 0, arg7, arg8, arg9, this.field8625);
			if (var21 == null) {
				return null;
			}
		}
		int var22;
		if (arg5) {
			var22 = (int) ((double) this.field8638 * 1.5D) << 2;
		} else if (arg3 == 2) {
			var22 = (int) ((double) this.field8638 * 1.04D) << 2;
		} else {
			var22 = this.field8638 << 2;
		}
		class426 var23 = arg0.method2355();
		class426 var24 = arg0.method2208();
		var24.method6703(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) arg0.method2135().method1627(), (float) arg0.method2135().method1628());
		arg0.method2220(var24);
		arg0.method2164(0, 0, arg0.method2135().method1627(), arg0.method2135().method1628());
		class419 var25 = new class419();
		arg0.method2217(var25);
		arg0.method2222((float) (Math.random() / 10.0D) + 0.95F);
		arg0.method2223(16777215, (float) (Math.random() / 10.0D) + 0.95F, (float) (Math.random() / 10.0D) + 0.95F, -50.0F, -10.0F, -50.0F);
		class419 var26 = arg0.method2209();
		var26.method6372(0.0F, 0.0F, 1.0F, class417.method6277(-this.field8641 << 3));
		var26.method6307(0.0F, 1.0F, 0.0F, class417.method6277(this.field8626 << 3));
		var26.method6315((float) (this.field8695 << 2), (float) ((class417.field4270[this.field8639 << 3] * var22 >> 14) - var20.method1748() / 2 + (this.field8643 << 2)), (float) ((this.field8643 << 2) + (class417.field4272[this.field8639 << 3] * var22 >> 14)));
		var26.method6307(1.0F, 0.0F, 0.0F, class417.method6277(this.field8639 << 3));
		arg0.method2168(0, 0, 36, 32);
		arg0.method2475(2, 0);
		arg0.method2354(0, 0, 36, 32, 0, 0);
		arg0.method2572(0, -1, 0);
		var20.method1813(var26, null, 1);
		arg0.method2220(var23);
		int[] var27 = arg0.method2149(0, 0, 36, 32);
		if (arg3 >= 1) {
			var27 = this.method14636(var27, -16777214);
			if (arg3 >= 2) {
				var27 = this.method14636(var27, -1);
			}
		}
		if (arg4 != 0) {
			this.method14648(var27, arg4);
		}
		if (this.field8675 != -1) {
			var21.method1439(0, 0);
		} else if (this.field8694 != -1) {
			var21.method1439(0, 0);
		}
		arg0.method2199(var27, 0, 36, 36, 32).method1439(0, 0);
		if (this.field8663 != -1) {
			var21.method1439(0, 0);
		}
		if (this.field8677 != -1) {
			var21.method1439(0, 0);
		}
		if (arg6 == 1 || arg6 == 2 && (this.field8644 == 1 || arg2 != 1) && arg2 != -1) {
			arg7.method2681(method4655(arg2, this.field8621.field8618, arg9), 0, 9, -256, -16777215);
		}
		int[] var28 = arg0.method2149(0, 0, 36, 32);
		for (int var29 = 0; var29 < var28.length; var29++) {
			if ((var28[var29] & 0xFFFFFF) == 0) {
				var28[var29] = 0;
			} else {
				var28[var29] |= 0xFF000000;
			}
		}
		return var28;
	}

	@ObfuscatedName("abv.y([III)[I")
	public int[] method14636(int[] arg0, int arg1) {
		int[] var3 = new int[1152];
		int var4 = 0;
		for (int var5 = 0; var5 < 32; var5++) {
			for (int var6 = 0; var6 < 36; var6++) {
				int var7 = arg0[var4];
				if (var7 == 0) {
					if (var6 > 0 && arg0[var4 - 1] != 0) {
						var7 = arg1;
					} else if (var5 > 0 && arg0[var4 - 36] != 0) {
						var7 = arg1;
					} else if (var6 < 35 && arg0[var4 + 1] != 0) {
						var7 = arg1;
					} else if (var5 < 31 && arg0[var4 + 36] != 0) {
						var7 = arg1;
					}
				}
				var3[var4++] = var7;
			}
		}
		return var3;
	}

	@ObfuscatedName("abv.q([III)V")
	public void method14648(int[] arg0, int arg1) {
		for (int var3 = 31; var3 > 0; var3--) {
			int var4 = var3 * 36;
			for (int var5 = 35; var5 > 0; var5--) {
				if (arg0[var4 + var5] == 0 && arg0[var4 + var5 - 1 - 36] != 0) {
					arg0[var4 + var5] = arg1;
				}
			}
		}
	}

	@ObfuscatedName("jf.x(ILzt;Lws;I)Ljava/lang/String;")
	public static String method4655(int arg0, class687 arg1, class629 arg2) {
		if (arg0 < 100000) {
			return Statics.method5153(arg2.field7742) + arg0 + field8699;
		} else if (arg0 < 10000000) {
			return Statics.method5153(arg2.field7743) + arg0 / 1000 + class776.field9020.method15021(arg1) + field8699;
		} else {
			return Statics.method5153(arg2.field7744) + arg0 / 1000000 + class776.field9013.method15021(arg1) + field8699;
		}
	}

	@ObfuscatedName("abv.h(ZLabw;I)Z")
	public final boolean method14649(boolean arg0, class740 arg1) {
		int var3;
		int var4;
		int var5;
		if (arg0) {
			if (arg1 == null || arg1.field8708 == null) {
				var3 = this.field8656;
				var4 = this.field8657;
				var5 = this.field8659;
			} else {
				var3 = arg1.field8708[0];
				var4 = arg1.field8708[1];
				var5 = arg1.field8708[2];
			}
		} else if (arg1 == null || arg1.field8710 == null) {
			var3 = this.field8654;
			var4 = this.field8636;
			var5 = this.field8658;
		} else {
			var3 = arg1.field8710[0];
			var4 = arg1.field8710[1];
			var5 = arg1.field8710[2];
		}
		if (var3 == -1) {
			return true;
		}
		boolean var6 = true;
		if (!this.field8621.field8614.method6888(var3, 0)) {
			var6 = false;
		}
		if (var4 != -1 && !this.field8621.field8614.method6888(var4, 0)) {
			var6 = false;
		}
		if (var5 != -1 && !this.field8621.field8614.method6888(var5, 0)) {
			var6 = false;
		}
		return var6;
	}

	@ObfuscatedName("abv.a(ZLabw;I)Ldq;")
	public final class120 method14650(boolean arg0, class740 arg1) {
		int var3;
		int var4;
		int var5;
		if (arg0) {
			if (arg1 == null || arg1.field8708 == null) {
				var3 = this.field8656;
				var4 = this.field8657;
				var5 = this.field8659;
			} else {
				var3 = arg1.field8708[0];
				var4 = arg1.field8708[1];
				var5 = arg1.field8708[2];
			}
		} else if (arg1 == null || arg1.field8710 == null) {
			var3 = this.field8654;
			var4 = this.field8636;
			var5 = this.field8658;
		} else {
			var3 = arg1.field8710[0];
			var4 = arg1.field8710[1];
			var5 = arg1.field8710[2];
		}
		if (var3 == -1) {
			return null;
		}
		class120 var6 = class120.method1931(this.field8621.field8614, var3, 0);
		if (var6 == null) {
			return null;
		}
		if (var6.field1372 < 13) {
			var6.method1947(2);
		}
		if (var4 != -1) {
			class120 var7 = class120.method1931(this.field8621.field8614, var4, 0);
			if (var7.field1372 < 13) {
				var7.method1947(2);
			}
			if (var5 == -1) {
				class120[] var10 = new class120[] { var6, var7 };
				var6 = new class120(var10, 2);
			} else {
				class120 var8 = class120.method1931(this.field8621.field8614, var5, 0);
				if (var8.field1372 < 13) {
					var8.method1947(2);
				}
				class120[] var9 = new class120[] { var6, var7, var8 };
				var6 = new class120(var9, 3);
			}
		}
		if (!arg0 && (this.field8632 != 0 || this.field8660 != 0 || this.field8664 != 0)) {
			var6.method1945(this.field8632, this.field8660, this.field8664);
		}
		if (arg0 && (this.field8640 != 0 || this.field8670 != 0 || this.field8665 != 0)) {
			var6.method1945(this.field8640, this.field8670, this.field8665);
		}
		if (this.field8666 != null) {
			short[] var11;
			if (arg1 == null || arg1.field8714 == null) {
				var11 = this.field8622;
			} else {
				var11 = arg1.field8714;
			}
			for (int var12 = 0; var12 < this.field8666.length; var12++) {
				var6.method1943(this.field8666[var12], var11[var12]);
			}
		}
		if (this.field8634 != null) {
			short[] var13;
			if (arg1 == null || arg1.field8715 == null) {
				var13 = this.field8635;
			} else {
				var13 = arg1.field8715;
			}
			for (int var14 = 0; var14 < this.field8634.length; var14++) {
				var6.method1937(this.field8634[var14], var13[var14]);
			}
		}
		return var6;
	}

	@ObfuscatedName("abv.g(ZLabw;I)Z")
	public final boolean method14651(boolean arg0, class740 arg1) {
		int var3;
		int var4;
		if (arg0) {
			if (arg1 == null || arg1.field8713 == null) {
				var3 = this.field8668;
				var4 = this.field8669;
			} else {
				var3 = arg1.field8713[0];
				var4 = arg1.field8713[1];
			}
		} else if (arg1 == null || arg1.field8709 == null) {
			var3 = this.field8667;
			var4 = this.field8631;
		} else {
			var3 = arg1.field8709[0];
			var4 = arg1.field8709[1];
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!this.field8621.field8614.method6888(var3, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !this.field8621.field8614.method6888(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("abv.i(ZLabw;B)Ldq;")
	public final class120 method14652(boolean arg0, class740 arg1) {
		int var3;
		int var4;
		if (arg0) {
			if (arg1 == null || arg1.field8713 == null) {
				var3 = this.field8668;
				var4 = this.field8669;
			} else {
				var3 = arg1.field8713[0];
				var4 = arg1.field8713[1];
			}
		} else if (arg1 == null || arg1.field8709 == null) {
			var3 = this.field8667;
			var4 = this.field8631;
		} else {
			var3 = arg1.field8709[0];
			var4 = arg1.field8709[1];
		}
		if (var3 == -1) {
			return null;
		}
		class120 var5 = class120.method1931(this.field8621.field8614, var3, 0);
		if (var5.field1372 < 13) {
			var5.method1947(2);
		}
		if (var4 != -1) {
			class120 var6 = class120.method1931(this.field8621.field8614, var4, 0);
			if (var6.field1372 < 13) {
				var6.method1947(2);
			}
			class120[] var7 = new class120[] { var5, var6 };
			var5 = new class120(var7, 2);
		}
		if (this.field8666 != null) {
			short[] var8;
			if (arg1 == null || arg1.field8714 == null) {
				var8 = this.field8622;
			} else {
				var8 = arg1.field8714;
			}
			for (int var9 = 0; var9 < this.field8666.length; var9++) {
				var5.method1943(this.field8666[var9], var8[var9]);
			}
		}
		if (this.field8634 != null) {
			short[] var10;
			if (arg1 == null || arg1.field8715 == null) {
				var10 = this.field8635;
			} else {
				var10 = arg1.field8715;
			}
			for (int var11 = 0; var11 < this.field8634.length; var11++) {
				var5.method1937(this.field8634[var11], var10[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("abv.j(III)I")
	public int method14677(int arg0, int arg1) {
		if (this.field8690 == null) {
			return arg1;
		} else {
			class988 var3 = (class988) this.field8690.method14495((long) arg0);
			return var3 == null ? arg1 : var3.field11442;
		}
	}

	@ObfuscatedName("abv.t(ILjava/lang/String;B)Ljava/lang/String;")
	public String method14654(int arg0, String arg1) {
		if (this.field8690 == null) {
			return arg1;
		} else {
			class984 var3 = (class984) this.field8690.method14495((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("abv.ae(II)I")
	public int method14642(int arg0) {
		return this.field8649 == null ? -1 : this.field8649[arg0];
	}

	@ObfuscatedName("abv.ag(II)I")
	public int method14684(int arg0) {
		return this.field8619 == null ? -1 : this.field8619[arg0];
	}
}

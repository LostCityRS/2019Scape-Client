package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("xv")
public class class637 {

	@ObfuscatedName("xv.e")
	public int field7877;

	@ObfuscatedName("xv.n")
	public float field7871;

	@ObfuscatedName("xv.m")
	public float field7861;

	@ObfuscatedName("xv.k")
	public float field7864;

	@ObfuscatedName("xv.f")
	public class423 field7865;

	@ObfuscatedName("xv.w")
	public int field7866;

	@ObfuscatedName("xv.l")
	public int field7867;

	@ObfuscatedName("xv.u")
	public class117 field7868;

	@ObfuscatedName("xv.z")
	public float field7862;

	@ObfuscatedName("xv.p")
	public float field7870;

	@ObfuscatedName("xv.d")
	public float field7874;

	@ObfuscatedName("xv.c")
	public class502 field7863;

	@ObfuscatedName("xv.r")
	public float field7873 = 1.0F;

	@ObfuscatedName("xv.v")
	public float field7869 = 0.0F;

	@ObfuscatedName("xv.o")
	public float field7875 = 1.0F;

	@ObfuscatedName("xv.s")
	public float field7876 = 0.0F;

	@ObfuscatedName("xv.y")
	public float field7872 = 1.0F;

	@ObfuscatedName("xv.q")
	public int[] field7878 = new int[] { -1, -1, -1 };

	@ObfuscatedName("xv.x")
	public float[] field7879 = new float[] { 0.0F, 0.0F, 0.0F };

	public class637() {
		this.method10077();
	}

	public class637(class997 arg0, class636 arg1) {
		this.method10065(arg0, arg1);
	}

	@ObfuscatedName("xv.e(B)V")
	public void method10077() {
		this.field7877 = 16777215;
		this.field7865 = class423.method6483(-50.0F, -60.0F, -50.0F);
		this.field7871 = 1.1523438F;
		this.field7861 = 0.69921875F;
		this.field7864 = 1.2F;
		this.field7866 = 13156520;
		this.field7867 = 0;
		this.field7868 = Statics.field7832;
		this.field7862 = 1.0F;
		this.field7870 = 0.25F;
		this.field7874 = 1.0F;
		this.field7863 = Statics.field7846;
		this.field7873 = 1.0F;
		this.field7869 = 0.0F;
		this.field7875 = 1.0F;
		this.field7876 = 0.0F;
		this.field7872 = 1.0F;
		int[] var1 = this.field7878;
		int[] var2 = this.field7878;
		this.field7878[2] = -1;
		var2[1] = -1;
		var1[0] = -1;
		float[] var3 = this.field7879;
		float[] var4 = this.field7879;
		this.field7879[2] = 0.0F;
		var4[1] = 0.0F;
		var3[0] = 0.0F;
	}

	@ObfuscatedName("xv.n(Lxv;B)V")
	public void method10083(class637 arg0) {
		this.field7877 = arg0.field7877;
		this.field7871 = arg0.field7871;
		this.field7861 = arg0.field7861;
		this.field7864 = arg0.field7864;
		this.field7865.method6492(arg0.field7865);
		this.field7866 = arg0.field7866;
		this.field7867 = arg0.field7867;
		this.field7868 = arg0.field7868;
		this.field7862 = arg0.field7862;
		this.field7870 = arg0.field7870;
		this.field7874 = arg0.field7874;
		this.field7863 = arg0.field7863;
		this.field7873 = arg0.field7873;
		this.field7869 = arg0.field7869;
		this.field7875 = arg0.field7875;
		this.field7876 = arg0.field7876;
		this.field7872 = arg0.field7872;
		this.field7878[0] = arg0.field7878[0];
		this.field7878[1] = arg0.field7878[1];
		this.field7878[2] = arg0.field7878[2];
		this.field7879[0] = arg0.field7879[0];
		this.field7879[1] = arg0.field7879[1];
		this.field7879[2] = arg0.field7879[2];
	}

	@ObfuscatedName("xv.m(Ldh;Lxv;Lxv;FI)V")
	public void method10094(class133 arg0, class637 arg1, class637 arg2, float arg3) {
		this.field7877 = class662.method19201(arg1.field7877, arg2.field7877, arg3 * 255.0F);
		this.field7861 = (arg2.field7861 - arg1.field7861) * arg3 + arg1.field7861;
		this.field7864 = (arg2.field7864 - arg1.field7864) * arg3 + arg1.field7864;
		this.field7871 = (arg2.field7871 - arg1.field7871) * arg3 + arg1.field7871;
		this.field7874 = (arg2.field7874 - arg1.field7874) * arg3 + arg1.field7874;
		this.field7862 = (arg2.field7862 - arg1.field7862) * arg3 + arg1.field7862;
		this.field7870 = (arg2.field7870 - arg1.field7870) * arg3 + arg1.field7870;
		this.field7866 = class662.method19201(arg1.field7866, arg2.field7866, arg3 * 255.0F);
		this.field7867 = (int) ((float) (arg2.field7867 - arg1.field7867) * arg3 + (float) arg1.field7867);
		if (arg1.field7868 != arg2.field7868) {
			this.field7868 = arg0.method2435(arg1.field7868, arg2.field7868, arg3, this.field7868);
		}
		if (arg1.field7863 != arg2.field7863) {
			if (arg1.field7863 == null) {
				this.field7863 = arg2.field7863;
				if (this.field7863 != null) {
					this.field7863.method7941((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.field7863 = arg1.field7863;
				if (this.field7863 != null) {
					this.field7863.method7941((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.field7873 = (arg2.field7873 - arg1.field7873) * arg3 + arg1.field7873;
		this.field7869 = (arg2.field7869 - arg1.field7869) * arg3 + arg1.field7869;
		this.field7875 = (arg2.field7875 - arg1.field7875) * arg3 + arg1.field7875;
		this.field7876 = (arg2.field7876 - arg1.field7876) * arg3 + arg1.field7876;
		this.field7872 = (arg2.field7872 - arg1.field7872) * arg3 + arg1.field7872;
		float var5 = arg1.field7879[1] + arg1.field7879[0] + arg1.field7879[2];
		float var6 = arg2.field7879[0] + arg2.field7879[1] + arg2.field7879[2];
		float var7 = (var6 - var5) * arg3 + var5;
		if (var7 == 0.0F) {
			int[] var8 = this.field7878;
			int[] var9 = this.field7878;
			this.field7878[2] = -1;
			var9[1] = -1;
			var8[0] = -1;
			float[] var10 = this.field7879;
			float[] var11 = this.field7879;
			this.field7879[2] = 0.0F;
			var11[1] = 0.0F;
			var10[0] = 0.0F;
		} else if (arg1.field7878[0] == -1 && arg1.field7878[1] == -1 && arg1.field7878[2] == -1) {
			for (int var12 = 0; var12 < 3; var12++) {
				this.field7878[var12] = arg2.field7878[var12];
				if (this.field7878[var12] == -1) {
					this.field7879[var12] = 0.0F;
				} else {
					this.field7879[var12] = arg2.field7879[var12] * arg3;
				}
			}
		} else if (arg2.field7878[0] == -1 && arg2.field7878[1] == -1 && arg2.field7878[2] == -1) {
			for (int var13 = 0; var13 < 3; var13++) {
				this.field7878[var13] = arg1.field7878[var13];
				if (this.field7878[var13] == -1) {
					this.field7879[var13] = 0.0F;
				} else {
					this.field7879[var13] = (1.0F - arg3) * arg1.field7879[var13];
				}
			}
		} else {
			float var14 = 1.0F - arg3;
			int var15 = 0;
			int[] var16 = new int[] { -1, -1, -1, -1, -1, -1 };
			float[] var17 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			for (int var18 = 0; var18 < 3; var18++) {
				if (arg1.field7878[var18] > -1) {
					var16[var15] = arg1.field7878[var18];
					var17[var15++] = arg1.field7879[var18] * var14;
				}
			}
			int var19 = var15;
			for (int var20 = 0; var20 < 3; var20++) {
				if (arg2.field7878[var20] > -1) {
					float var21 = arg2.field7879[var20] * arg3;
					for (int var22 = 0; var22 < var19; var22++) {
						if (arg2.field7878[var20] == var16[var22]) {
							var17[var22] += var21;
							break;
						}
						if (var19 - 1 == var22) {
							var16[var15] = arg2.field7878[var20];
							var17[var15++] = var21;
						}
					}
				}
			}
			if (var15 > 3) {
				float var23 = 0.0F;
				float var24 = 0.0F;
				for (int var25 = 0; var25 < var15; var25++) {
					var23 += var17[var25];
				}
				class664.method228(var17, var16, 0, var15 - 1);
				for (int var26 = 0; var26 < 3; var26++) {
					var24 += var17[var26];
				}
				float var27 = var23 / var24;
				for (int var28 = 0; var28 < 3; var28++) {
					var17[var28] *= var27;
				}
			}
			for (int var29 = 0; var29 < 3; var29++) {
				this.field7878[var29] = var16[var29];
				this.field7879[var29] = var17[var29];
			}
		}
	}

	@ObfuscatedName("xv.k(Lalw;Lxu;B)V")
	public void method10065(class997 arg0, class636 arg1) {
		int var3 = arg0.method17904();
		if (Statics.field688.field11528.method18389() == 1 && Statics.field8198.method2114() > 0) {
			if ((var3 & class661.field8143.field8144) == 0) {
				this.field7877 = 16777215;
			} else {
				this.field7877 = arg0.method17910();
			}
			if ((var3 & class661.field8139.field8144) == 0) {
				this.field7871 = 1.1523438F;
			} else {
				this.field7871 = (float) arg0.method17906() / 256.0F;
			}
			if ((var3 & class661.field8138.field8144) == 0) {
				this.field7861 = 0.69921875F;
			} else {
				this.field7861 = (float) arg0.method17906() / 256.0F;
			}
			if ((var3 & class661.field8137.field8144) == 0) {
				this.field7864 = 1.2F;
			} else {
				this.field7864 = (float) arg0.method17906() / 256.0F;
			}
		} else {
			if ((var3 & class661.field8143.field8144) != 0) {
				arg0.method17910();
			}
			if ((var3 & class661.field8139.field8144) != 0) {
				arg0.method17906();
			}
			if ((var3 & class661.field8138.field8144) != 0) {
				arg0.method17906();
			}
			if ((var3 & class661.field8137.field8144) != 0) {
				arg0.method17906();
			}
			this.field7877 = 16777215;
			this.field7864 = 1.2F;
			this.field7861 = 0.69921875F;
			this.field7871 = 1.1523438F;
		}
		if ((var3 & class661.field8140.field8144) == 0) {
			this.field7865 = class423.method6483(-50.0F, -60.0F, -50.0F);
		} else {
			this.field7865 = class423.method6483((float) arg0.method17973(), (float) arg0.method17973(), (float) arg0.method17973());
		}
		if ((var3 & class661.field8141.field8144) == 0) {
			this.field7866 = 13156520;
		} else {
			this.field7866 = arg0.method17910();
		}
		if ((var3 & class661.field8142.field8144) == 0) {
			this.field7867 = 0;
		} else {
			this.field7867 = arg0.method17906();
		}
		if ((var3 & class661.field8136.field8144) == 0) {
			this.field7868 = Statics.field7832;
		} else {
			int var4 = arg0.method17906();
			this.field7868 = arg1.method9985(var4);
		}
	}

	@ObfuscatedName("xv.f(Lalw;I)V")
	public void method10067(class997 arg0) {
		this.field7862 = arg0.method17916();
		this.field7870 = arg0.method17916();
		this.field7874 = arg0.method17916();
	}

	@ObfuscatedName("xv.w(Lalw;I)V")
	public void method10068(class997 arg0) {
		this.method10069(arg0, 0);
	}

	@ObfuscatedName("xv.l(Lalw;II)V")
	public void method10069(class997 arg0, int arg1) {
		this.field7878[arg1] = arg0.method17906();
		this.field7879[arg1] = arg0.method17916();
	}

	@ObfuscatedName("xv.u(Lalw;Lxu;I)V")
	public void method10070(class997 arg0, class636 arg1) {
		int var3 = arg0.method17906();
		int var4 = arg0.method17973();
		int var5 = arg0.method17973();
		int var6 = arg0.method17973();
		int var7 = arg0.method17906();
		Statics.field3023 = var7;
		this.field7863 = arg1.method9986(var3, var4, var5, var6);
	}

	@ObfuscatedName("xv.z(Lxv;I)Z")
	public boolean method10071(class637 arg0) {
		return this.field7877 == arg0.field7877 && this.field7871 == arg0.field7871 && this.field7861 == arg0.field7861 && this.field7864 == arg0.field7864 && this.field7870 == arg0.field7870 && this.field7862 == arg0.field7862 && this.field7874 == arg0.field7874 && this.field7866 == arg0.field7866 && this.field7867 == arg0.field7867 && this.field7868 == arg0.field7868 && this.field7863 == arg0.field7863 && this.field7873 == arg0.field7873 && this.field7869 == arg0.field7869 && this.field7875 == arg0.field7875 && this.field7876 == arg0.field7876 && this.field7872 == arg0.field7872 && this.field7878[0] == arg0.field7878[0] && this.field7878[1] == arg0.field7878[1] && this.field7878[2] == arg0.field7878[2] && this.field7879[0] == arg0.field7879[0] && this.field7879[1] == arg0.field7879[1] && this.field7879[2] == arg0.field7879[2];
	}

	@ObfuscatedName("xv.p(Lxu;Lyj;I)V")
	public void method10063(class636 arg0, class660 arg1) {
		if (Statics.field688.field11528.method18389() == 1 && Statics.field8198.method2114() > 0) {
			if (arg1.method10429() != -1) {
				this.field7877 = arg1.method10429();
			}
			if (arg1.method10381() != -1.0F) {
				this.field7871 = arg1.method10381();
			}
			if (arg1.method10392() != -1.0F) {
				this.field7861 = arg1.method10392();
			}
			if (arg1.method10395() != -1.0F) {
				this.field7864 = arg1.method10395();
			}
		}
		if (arg1.method10383() != null) {
			this.field7865.method6492(arg1.method10383());
		}
		if (arg1.method10422() != -1) {
			this.field7866 = arg1.method10422();
		}
		if (arg1.method10385() != -1) {
			this.field7867 = arg1.method10385();
		}
		if (arg1.method10386() != -1.0F) {
			this.field7870 = arg1.method10386();
		}
		if (arg1.method10387() != -1.0F) {
			this.field7874 = arg1.method10387();
		}
		if (arg1.method10388() != -1.0F) {
			this.field7862 = arg1.method10388();
		}
		if (arg1.method10414() != -1) {
			this.field7868 = arg0.method9985(arg1.method10414());
		}
		if (arg1.method10390() != -1) {
			int var3 = arg1.method10390();
			int var4 = arg1.method10391();
			int var5 = arg1.method10430();
			int var6 = arg1.method10393();
			int var7 = arg1.method10394();
			Statics.field3023 = var7;
			this.field7863 = arg0.method9986(var3, var4, var5, var6);
		}
		if (arg1.method10420(0) != -1) {
			this.field7878[0] = arg1.method10420(0);
			this.field7879[0] = arg1.method10378(0);
		}
		if (arg1.method10420(1) != -1) {
			this.field7878[1] = arg1.method10420(1);
			this.field7879[1] = arg1.method10378(1);
		}
		if (arg1.method10420(2) != -1) {
			this.field7878[2] = arg1.method10420(2);
			this.field7879[2] = arg1.method10378(2);
		}
	}

	@ObfuscatedName("xv.d(S)I")
	public int method10073() {
		return this.field7866;
	}

	@ObfuscatedName("xv.c(I)Lsv;")
	public class502 method10074() {
		return this.field7863;
	}
}

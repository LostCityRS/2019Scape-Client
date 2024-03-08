package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;
import java.util.Iterator;

@ObfuscatedName("ahc")
public class class893 extends class274 {

	@ObfuscatedName("ahc.au")
	public int field10465 = 0;

	public class893(class271 arg0) {
		super(class265.field2813, arg0);
	}

	@ObfuscatedName("ahc.fs(B)I")
	public int method16602() {
		this.field10465++;
		if (this.field10465 == 126) {
			this.field10465 = 0;
		}
		return this.field10465;
	}

	@ObfuscatedName("ahc.fz(Lalw;II)V")
	public void method16604(class997 arg0, int arg1) {
		int var3 = arg0.field11503;
		int var4 = arg0.method17904();
		this.method4683(class268.method4461(var4 & 0x1));
		if ((var4 & 0x8) != 0) {
			class263 var5 = class263.method3259(arg0.method17904());
			if (this.field2845 != var5) {
				try {
					this.method4684(var5, true);
				} catch (class1109 var20) {
					var20.printStackTrace();
				}
			}
		}
		if ((var4 & 0x10) != 0) {
			class266 var7 = class266.method1058(arg0.method17904());
			if (this.field2847 != var7) {
				try {
					this.method4688(var7, true);
				} catch (class1109 var19) {
					var19.printStackTrace();
				}
			}
		}
		if ((var4 >> 7 & 0x1) == 1) {
			int var9 = arg0.method17906();
			if ((var9 >> class264.field2810.field2803 & 0x1) == 1) {
				this.field2853.method6490(arg0);
			}
			if ((var9 >> class264.field2797.field2803 & 0x1) == 1) {
				this.field2854.method6490(arg0);
			}
			if ((var9 >> class264.field2809.field2803 & 0x1) == 1) {
				this.field2856.method6490(arg0);
			}
			if ((var9 >> class264.field2799.field2803 & 0x1) == 1) {
				this.field2867.method6490(arg0);
			}
			if ((var9 >> class264.field2798.field2803 & 0x1) == 1) {
				this.field2855 = arg0.method17916();
				this.field2859 = arg0.method17916();
			}
			if ((var9 >> class264.field2801.field2803 & 0x1) == 1) {
				this.field2872 = arg0.method17916();
				this.field2868 = arg0.method17916();
			}
			if ((var9 >> class264.field2802.field2803 & 0x1) == 1) {
				this.field2844 = class269.method16906(arg0.method17904());
			}
			if ((var9 >> class264.field2806.field2803 & 0x1) == 1) {
				this.field2851 = arg0.method17908();
				arg0.method17904();
			}
			if ((var9 >> class264.field2804.field2803 & 0x1) == 1) {
				int var10 = arg0.method17904();
				this.field2862 = (var10 & 0x1) == 1;
				this.field2875 = (var10 & 0x2) == 2;
			}
			if ((var9 >> class264.field2805.field2803 & 0x1) == 1) {
				int var11 = arg0.method17904();
				for (int var12 = 0; var12 < var11; var12++) {
					int var13 = arg0.method17904();
					int var14 = arg0.method17904();
					if (var13 == 0) {
						this.method4703(var14);
					} else {
						class247 var15 = Statics.method5101(arg0.method17904());
						boolean var16 = true;
						Iterator var17 = this.field2878.iterator();
						while (var17.hasNext()) {
							class1180 var18 = (class1180) var17.next();
							if (var18.field12341 == var14) {
								var18.method19434(arg0);
								var16 = false;
								break;
							}
						}
						if (var16) {
							this.method4702(class1180.method19262(var14, var15, arg0));
						}
					}
				}
			}
			if ((var9 >> class264.field2811.field2803 & 0x1) == 1) {
				this.field2876 = arg0.method17906();
				this.field2877 = arg0.method17916();
			}
			if ((var9 >> class264.field2807.field2803 & 0x1) == 1) {
				this.field2842 = class267.method17805(arg0.method17904());
			}
			if ((var9 >> class264.field2808.field2803 & 0x1) == 1) {
				this.field2864.method6490(arg0);
				this.field2865.method6490(arg0);
				this.field2866 = arg0.method17916();
				this.field2843 = arg0.method17916();
			}
			if ((var9 >> class264.field2796.field2803 & 0x1) == 1) {
				arg0.method17916();
			}
			if ((var9 >> class264.field2800.field2803 & 0x1) == 1) {
				this.field2852 = arg0.method17916();
			}
		}
		if (this.field2846 != null && (var4 >> 5 & 0x1) == 1) {
			this.field2846.method14132(arg0);
		}
		if (this.field2863 != null && (var4 >> 6 & 0x1) == 1) {
			this.field2863.method5224(arg0);
		}
		if (arg0.field11503 - var3 != arg1) {
			throw new RuntimeException(arg0.field11503 - var3 + "," + arg1);
		}
	}
}

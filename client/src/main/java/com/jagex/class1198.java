package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asw")
public abstract class class1198 extends class1019 {

	@ObfuscatedName("asw.ae")
	public static final int[] field12454 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("asw.ag")
	public short field12463;

	@ObfuscatedName("asw.ah")
	public int field12464 = 0;

	@ObfuscatedName("asw.al")
	public class973[] field12459 = new class973[4];

	public class1198(class550 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class420 arg7) {
		super(arg0, arg7);
		this.field11717 = (byte) arg4;
		this.field11714 = (byte) arg5;
		this.field12463 = (short) arg6;
		if (arg7 != null) {
			this.method10529(arg7);
		}
		this.method10532((float) arg1, (float) arg2, (float) arg3);
		for (int var9 = 0; var9 < 4; var9++) {
			this.field12459[var9] = null;
		}
	}

	@ObfuscatedName("asw.gy([Lakf;S)I")
	public int method18375(class973[] arg0) {
		if (this.field8176) {
			class423 var2 = this.method10536().field4298;
			int var3 = (int) var2.field4308 >> this.field11716.field6900;
			int var4 = (int) var2.field4313 >> this.field11716.field6900;
			int var5 = 0;
			if (this.field11716.field6902 == var3) {
				var5++;
			} else if (this.field11716.field6902 < var3) {
				var5 += 2;
			}
			if (this.field11716.field6947 == var4) {
				var5 += 3;
			} else if (this.field11716.field6947 > var4) {
				var5 += 6;
			}
			int var6 = field12454[var5];
			if ((this.field12463 & var6) == 0) {
				if (this.field12463 == 1 && var3 > 0) {
					var3--;
				} else if (this.field12463 == 4 && var3 <= this.field11716.field6910) {
					var3++;
				} else if (this.field12463 == 8 && var4 > 0) {
					var4--;
				} else if (this.field12463 == 2 && var4 <= this.field11716.field6911) {
					var4++;
				} else if (this.field12463 == 16 && var3 > 0 && var4 <= this.field11716.field6911) {
					var3--;
					var4++;
				} else if (this.field12463 == 32 && var3 <= this.field11716.field6910 && var4 <= this.field11716.field6911) {
					var3++;
					var4++;
				} else if (this.field12463 == 128 && var3 > 0 && var4 > 0) {
					var3--;
					var4--;
				} else if (this.field12463 == 64 && var3 <= this.field11716.field6910 && var4 > 0) {
					var3++;
					var4--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.field12464 = this.method18362(var3, var4, this.field12459);
			this.field8176 = false;
		}
		for (int var7 = 0; var7 < this.field12464; var7++) {
			arg0[var7] = this.field12459[var7];
		}
		return this.field12464;
	}

	@ObfuscatedName("asw.ga(Ldh;S)Z")
	public boolean method18360(class133 arg0) {
		class423 var2 = this.method10536().field4298;
		return this.field11716.field6930.method8928(this, this.field11714, (int) var2.field4308 >> this.field11716.field6900, (int) var2.field4313 >> this.field11716.field6900);
	}

	@ObfuscatedName("asw.gn(I)Z")
	public boolean method18361() {
		class423 var1 = this.method10536().field4298;
		return this.field11716.field6962[this.field11716.field6942 + (((int) var1.field4308 >> this.field11716.field6900) - this.field11716.field6902)][this.field11716.field6942 + (((int) var1.field4313 >> this.field11716.field6900) - this.field11716.field6947)];
	}
}

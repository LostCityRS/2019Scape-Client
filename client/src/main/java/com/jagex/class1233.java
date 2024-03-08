package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aut")
public class class1233 extends class1199 {

	@ObfuscatedName("aut.x")
	public static class419 field12584 = new class419();

	@ObfuscatedName("aut.b")
	public int field12580;

	@ObfuscatedName("aut.h")
	public int field12570;

	@ObfuscatedName("aut.a")
	public int field12569 = -1;

	@ObfuscatedName("aut.g")
	public int field12572;

	@ObfuscatedName("aut.i")
	public int field12573 = -1;

	@ObfuscatedName("aut.j")
	public int field12583;

	@ObfuscatedName("aut.t")
	public class419 field12571 = null;

	@ObfuscatedName("aut.ae")
	public class419 field12568 = null;

	@ObfuscatedName("aut.ag")
	public class419 field12577 = null;

	@ObfuscatedName("aut.ah")
	public int field12578 = 0;

	@ObfuscatedName("aut.al")
	public int field12579 = 0;

	@ObfuscatedName("aut.ac")
	public boolean field12576 = false;

	@ObfuscatedName("aut.ai")
	public int field12581;

	@ObfuscatedName("aut.aw")
	public int field12582;

	@ObfuscatedName("aut.as")
	public int field12574;

	@ObfuscatedName("aut.at")
	public int field12575;

	public class1233(class550 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.method18363(3);
		this.method19718();
	}

	@ObfuscatedName("aut.e(B)V")
	public void method19718() {
		this.field12581 = (int) (Math.random() * 4.0D) + 32;
		this.field12582 = (int) (Math.random() * 2.0D) + 3;
		this.field12574 = (int) (Math.random() * 3.0D) + 16;
		if (Statics.field688.field11538.method18426() == 1) {
			this.field12575 = (int) (Math.random() * 10.0D);
		} else {
			this.field12575 = (int) (Math.random() * 20.0D);
		}
	}

	@ObfuscatedName("aut.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("aut.bw(S)Z")
	public boolean method16489() {
		return this.field12576;
	}

	@ObfuscatedName("aut.fv(Ldh;B)Luq;")
	public class556 method17371(class133 arg0) {
		return null;
	}

	@ObfuscatedName("aut.by(B)I")
	public int method16523() {
		return -10;
	}

	@ObfuscatedName("aut.fc(Ldh;I)Ltl;")
	public class552 method17372(class133 arg0) {
		class423 var2 = class423.method6484(this.method10536().field4298);
		class557 var3 = this.field11716.method8738(this.field11717, (int) var2.field4308 >> 9, (int) var2.field4313 >> 9);
		class1196 var4 = this.field11716.method8767(this.field11717, (int) var2.field4308 >> 9, (int) var2.field4313 >> 9);
		int var5 = 0;
		while (var3 != null) {
			if (var3.field7057.field12470 && var3.field7057.method16523() < var5) {
				var5 = var3.field7057.method16523();
			}
			var3 = var3.field7058;
		}
		if (var4 != null && var4.field12448 > -var5) {
			var5 = -var4.field12448;
		}
		if (this.field12578 != var5) {
			var2.field4311 += var5 - this.field12578;
			this.method10531(var2);
			this.field12578 = var5;
		}
		class419 var6 = arg0.method2209();
		var6.method6376();
		if (this.field12578 == 0) {
			boolean var7 = false;
			boolean var8 = false;
			boolean var9 = false;
			class104 var10 = this.field11716.field6913[this.field11714];
			int var11 = this.field12579 << 1;
			int var13 = -var11 / 2;
			int var14 = -var11 / 2;
			int var15 = var10.method1527((int) var2.field4308 + var13, (int) var2.field4313 + var14);
			int var16 = var11 / 2;
			int var17 = -var11 / 2;
			int var18 = var10.method1527((int) var2.field4308 + var16, (int) var2.field4313 + var17);
			int var19 = -var11 / 2;
			int var20 = var11 / 2;
			int var21 = var10.method1527((int) var2.field4308 + var19, (int) var2.field4313 + var20);
			int var22 = var11 / 2;
			int var23 = var11 / 2;
			int var24 = var10.method1527((int) var2.field4308 + var22, (int) var2.field4313 + var23);
			int var25 = var15 < var18 ? var15 : var18;
			int var26 = var21 < var24 ? var21 : var24;
			int var27 = var18 < var24 ? var18 : var24;
			int var28 = var15 < var21 ? var15 : var21;
			if (var11 != 0) {
				int var29 = (int) (Math.atan2((double) (var25 - var26), (double) var11) * 2607.5945876176133D) & 0x3FFF;
				if (var29 != 0) {
					var6.method6307(1.0F, 0.0F, 0.0F, class417.method6277(var29));
				}
			}
			if (var11 != 0) {
				int var30 = (int) (Math.atan2((double) (var28 - var27), (double) var11) * 2607.5945876176133D) & 0x3FFF;
				if (var30 != 0) {
					var6.method6307(0.0F, 0.0F, 1.0F, class417.method6277(-var30));
				}
			}
			int var31 = var15 + var24;
			if (var18 + var21 < var31) {
				var31 = var18 + var21;
			}
			int var32 = (var31 >> 1) - (int) var2.field4311;
			if (var32 != 0) {
				var6.method6315(0.0F, (float) var32, 0.0F);
			}
		}
		var2.method6486();
		class423 var33 = this.method10536().field4298;
		var6.method6315(var33.field4308, var33.field4311 - 10.0F, var33.field4313);
		class552 var34 = class552.method16749(true);
		this.field12576 = false;
		this.field12579 = 0;
		if (this.field12573 != -1) {
			class116 var35 = ((class738) Statics.field1842.method962(this.field12573)).method14644(arg0, 526336, this.field12583, null, null, this.field12581, this.field12582, this.field12574, this.field12575);
			if (var35 != null) {
				if (this.field12577 == null) {
					field12584.method6376();
				} else {
					field12584.method6292(this.field12577);
				}
				field12584.method6316(var6);
				var35.method1813(field12584, this.field11713[2], 0);
				this.field12576 |= var35.method1731();
				this.field12579 = var35.method1728();
			}
		}
		if (this.field12569 != -1) {
			class116 var36 = ((class738) Statics.field1842.method962(this.field12569)).method14644(arg0, 526336, this.field12572, null, null, this.field12581, this.field12582, this.field12574, this.field12575);
			if (var36 != null) {
				if (this.field12568 == null) {
					field12584.method6376();
				} else {
					field12584.method6292(this.field12568);
				}
				field12584.method6316(var6);
				var36.method1813(field12584, this.field11713[1], 0);
				this.field12576 |= var36.method1731();
				if (var36.method1728() > this.field12579) {
					this.field12579 = var36.method1728();
				}
			}
		}
		class116 var37 = ((class738) Statics.field1842.method962(this.field12580)).method14644(arg0, 526336, this.field12570, null, null, this.field12581, this.field12582, this.field12574, this.field12575);
		if (var37 != null) {
			if (this.field12571 == null) {
				field12584.method6376();
			} else {
				field12584.method6292(this.field12571);
			}
			field12584.method6316(var6);
			var37.method1813(field12584, this.field11713[0], 0);
			this.field12576 |= var37.method1731();
			if (var37.method1728() > this.field12579) {
				this.field12579 = var37.method1728();
			}
		}
		return var34;
	}

	@ObfuscatedName("ad.n(B)Lou;")
	public static class419 method820() {
		class419 var0 = new class419();
		var0.method6372(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		float var1 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		var0.method6315(var1 - 128.0F, 0.0F, 0.0F);
		var0.method6307(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return var0;
	}

	@ObfuscatedName("aut.fw(Ldh;I)V")
	public void method17373(class133 arg0) {
	}

	@ObfuscatedName("aut.gp(I)I")
	public int method18371() {
		class738 var1 = (class738) Statics.field1842.method962(this.field12580);
		int var2 = var1.field8692;
		if (this.field12569 != -1) {
			class738 var3 = (class738) Statics.field1842.method962(this.field12569);
			if (var3.field8692 > var2) {
				var2 = var3.field8692;
			}
		}
		if (this.field12573 != -1) {
			class738 var4 = (class738) Statics.field1842.method962(this.field12573);
			if (var4.field8692 > var2) {
				var2 = var4.field8692;
			}
		}
		return var2;
	}

	@ObfuscatedName("aut.fa(Ldh;IIB)Z")
	public boolean method17375(class133 arg0, int arg1, int arg2) {
		class419 var4 = arg0.method2209();
		var4.method6293(this.method10536());
		var4.method6315(0.0F, -10.0F, 0.0F);
		class116 var5 = ((class738) Statics.field1842.method962(this.field12580)).method14644(arg0, 131072, this.field12570, null, null, 0, 0, 0, 0);
		if (var5 != null) {
			if (this.field12571 == null) {
				field12584.method6376();
			} else {
				field12584.method6292(this.field12571);
			}
			field12584.method6316(var4);
			if (var5.method1725(arg1, arg2, field12584, true, 0)) {
				return true;
			}
		}
		if (this.field12569 != -1) {
			class116 var6 = ((class738) Statics.field1842.method962(this.field12569)).method14644(arg0, 131072, this.field12572, null, null, 0, 0, 0, 0);
			if (var6 != null) {
				if (this.field12568 == null) {
					field12584.method6376();
				} else {
					field12584.method6292(this.field12568);
				}
				field12584.method6316(var4);
				if (var6.method1725(arg1, arg2, field12584, true, 0)) {
					return true;
				}
			}
		}
		if (this.field12573 != -1) {
			class116 var7 = ((class738) Statics.field1842.method962(this.field12573)).method14644(arg0, 131072, this.field12583, null, null, 0, 0, 0, 0);
			if (var7 != null) {
				if (this.field12577 == null) {
					field12584.method6376();
				} else {
					field12584.method6292(this.field12577);
				}
				field12584.method6316(var4);
				if (var7.method1725(arg1, arg2, field12584, true, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("aut.bo(I)I")
	public int method16501() {
		return this.field12578 - this.method16523();
	}
}

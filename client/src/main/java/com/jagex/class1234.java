package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aue")
public class class1234 extends class1200 {

	@ObfuscatedName("aue.ae")
	public final int field12603;

	@ObfuscatedName("aue.ag")
	public final int field12599;

	@ObfuscatedName("aue.ah")
	public final int field12587;

	@ObfuscatedName("aue.al")
	public final int field12588;

	@ObfuscatedName("aue.ac")
	public final int field12589;

	@ObfuscatedName("aue.ai")
	public final int field12590;

	@ObfuscatedName("aue.aw")
	public final int field12591;

	@ObfuscatedName("aue.as")
	public final int field12605;

	@ObfuscatedName("aue.at")
	public final int field12593;

	@ObfuscatedName("aue.ad")
	public final int field12594;

	@ObfuscatedName("aue.am")
	public final boolean field12595;

	@ObfuscatedName("aue.au")
	public boolean field12596 = false;

	@ObfuscatedName("aue.ar")
	public double field12597;

	@ObfuscatedName("aue.ap")
	public double field12592;

	@ObfuscatedName("aue.aq")
	public double field12598;

	@ObfuscatedName("aue.ax")
	public double field12600;

	@ObfuscatedName("aue.av")
	public double field12601;

	@ObfuscatedName("aue.ao")
	public final class721 field12602;

	@ObfuscatedName("aue.aj")
	public int field12586 = 0;

	@ObfuscatedName("aue.ay")
	public boolean field12604 = false;

	@ObfuscatedName("aue.ab")
	public class634 field12585;

	@ObfuscatedName("aue.az")
	public int field12606 = 0;

	public class1234(class550 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15, int arg16) {
		super(arg0, arg2, arg3, arg4, client.method3660(arg4, arg5, arg2) - arg6, arg5, arg4 >> 9, arg4 >> 9, arg5 >> 9, arg5 >> 9, false, (byte) 0);
		this.field12603 = arg1;
		this.field12588 = arg7;
		this.field12589 = arg8;
		this.field12590 = arg9;
		this.field12591 = arg10;
		this.field12605 = arg11;
		this.field12593 = arg12;
		this.field12599 = arg6;
		this.field12587 = arg13;
		this.field12595 = arg14;
		this.field12596 = false;
		this.field12594 = arg15;
		this.field12606 = arg16;
		int var18 = ((class680) Statics.field4874.method962(this.field12603)).field8260;
		this.field12602 = new class1076(this, false);
		this.field12602.method14362(var18);
		this.method18363(1);
	}

	@ObfuscatedName("aue.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("aue.bw(S)Z")
	public boolean method16489() {
		return this.field12604;
	}

	@ObfuscatedName("aue.by(B)I")
	public int method16523() {
		return this.field12586;
	}

	@ObfuscatedName("aue.e(I)I")
	public int method19724() {
		return this.field12606;
	}

	@ObfuscatedName("aue.fv(Ldh;B)Luq;")
	public class556 method17371(class133 arg0) {
		return null;
	}

	@ObfuscatedName("aue.n(IIIII)V")
	public final void method19725(int arg0, int arg1, int arg2, int arg3) {
		class423 var5 = class423.method6484(this.method10536().field4298);
		if (!this.field12596) {
			float var6 = (float) arg0 - var5.field4308;
			float var7 = (float) arg1 - var5.field4313;
			float var8 = (float) Math.sqrt((double) (var6 * var6 + var7 * var7));
			if (var8 != 0.0F) {
				var5.field4308 += (float) this.field12591 * var6 / var8;
				var5.field4313 += (float) this.field12591 * var7 / var8;
			}
			if (this.field12595) {
				var5.field4311 = client.method3660((int) var5.field4308, (int) var5.field4313, this.field11717) - this.field12599;
			}
			this.method10531(var5);
		}
		double var9 = (double) (this.field12589 + 1 - arg3);
		this.field12597 = (double) ((float) arg0 - var5.field4308) / var9;
		this.field12592 = (double) ((float) arg1 - var5.field4313) / var9;
		this.field12598 = Math.sqrt(this.field12597 * this.field12597 + this.field12592 * this.field12592);
		if (this.field12590 == -1) {
			this.field12600 = (double) ((float) arg2 - var5.field4311) / var9;
		} else {
			if (!this.field12596) {
				this.field12600 = -this.field12598 * Math.tan((double) this.field12590 * 0.02454369D);
			}
			this.field12601 = ((double) ((float) arg2 - var5.field4311) - this.field12600 * var9) * 2.0D / (var9 * var9);
		}
		var5.method6486();
	}

	@ObfuscatedName("aue.m(I)V")
	public void method19729() {
		if (this.field12596 || this.field12605 == 0) {
			return;
		}
		class892 var1 = null;
		if (client.field10863 == 0) {
			var1 = Statics.field1721[this.field12605 - 1].method2870();
		} else if (this.field12605 < 0) {
			int var2 = -this.field12605 - 1;
			if (client.field10945 == var2) {
				var1 = Statics.field4490;
			} else {
				var1 = client.field10944[var2];
			}
		} else {
			int var3 = this.field12605 - 1;
			class984 var4 = (class984) client.field10838.method14495((long) var3);
			if (var4 != null) {
				var1 = (class892) var4.field11436;
			}
		}
		if (var1 == null) {
			return;
		}
		class423 var5 = var1.method10536().field4298;
		this.method10538(var5.field4308, (float) (client.method3660((int) var5.field4308, (int) var5.field4313, this.field11717) - this.field12599), var5.field4313);
		if (this.field12594 < 0) {
			return;
		}
		class584 var6 = var1.method16508();
		int var7 = 0;
		int var8 = 0;
		if (var6.field7357 != null && var6.field7357[this.field12594] != null) {
			var7 += var6.field7357[this.field12594][0];
			var8 += var6.field7357[this.field12594][2];
		}
		if (var6.field7347 != null && var6.field7347[this.field12594] != null) {
			var7 += var6.field7347[this.field12594][0];
			var8 += var6.field7347[this.field12594][2];
		}
		if (var7 == 0 && var8 == 0) {
			return;
		}
		int var9 = var1.field10395.method316();
		int var10 = var9;
		if (var1.field10442 != null && var1.field10442[this.field12594] != -1) {
			var10 = var1.field10442[this.field12594];
		}
		int var11 = var10 - var9 & 0x3FFF;
		int var12 = class417.field4270[var11];
		int var13 = class417.field4272[var11];
		int var14 = var7 * var13 + var8 * var12 >> 14;
		int var15 = var8 * var13 - var7 * var12 >> 14;
		class423 var17 = class423.method6484(this.method10536().field4298);
		var17.field4308 += var14;
		var17.field4313 += var15;
		this.method10531(var17);
		var17.method6486();
	}

	@ObfuscatedName("aue.k(II)V")
	public final void method19732(int arg0) {
		this.field12596 = true;
		class420 var2 = new class420(this.method10536());
		var2.field4298.field4308 = (float) ((double) var2.field4298.field4308 + (double) arg0 * this.field12597);
		var2.field4298.field4313 = (float) ((double) var2.field4298.field4313 + (double) arg0 * this.field12592);
		if (this.field12595) {
			var2.field4298.field4311 = client.method3660((int) var2.field4298.field4308, (int) var2.field4298.field4313, this.field11717) - this.field12599;
		} else if (this.field12590 == -1) {
			var2.field4298.field4311 = (float) ((double) var2.field4298.field4311 + (double) arg0 * this.field12600);
		} else {
			var2.field4298.field4311 = (float) ((double) var2.field4298.field4311 + this.field12601 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field12600);
			this.field12600 += (double) arg0 * this.field12601;
		}
		var2.field4297.method6414(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.field12600, this.field12598));
		class421 var3 = class421.method6469();
		var3.method6414(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.field12597, this.field12592) - 3.1415927F);
		var2.field4297.method6424(var3);
		var3.method6407();
		this.method10534(var2);
		if (this.field12602.method14367(1) && this.field12602.method14375()) {
			this.field12602.method14364();
		}
	}

	@ObfuscatedName("aue.f(Ldh;II)Ldo;")
	public class116 method19727(class133 arg0, int arg1) {
		class680 var3 = (class680) Statics.field4874.method962(this.field12603);
		return var3.method13817(arg0, arg1, this.field12602, (byte) 2);
	}

	@ObfuscatedName("aue.fc(Ldh;I)Ltl;")
	public class552 method17372(class133 arg0) {
		class116 var2 = this.method19727(arg0, 2048);
		if (var2 == null) {
			return null;
		}
		class419 var3 = this.method10533();
		this.method19743(arg0, var2, var3);
		class552 var4 = class552.method16749(false);
		var2.method1813(var3, this.field11713[0], 0);
		if (this.field12585 != null) {
			class119 var5 = this.field12585.method9965();
			arg0.method2198(var5);
		}
		this.field12604 = var2.method1731();
		var2.method1728();
		this.field12586 = var2.method1748();
		return var4;
	}

	@ObfuscatedName("aue.fw(Ldh;I)V")
	public void method17373(class133 arg0) {
		class116 var2 = this.method19727(arg0, 0);
		if (var2 != null) {
			class419 var3 = this.method10533();
			this.field12586 = var2.method1748();
			var2.method1728();
			this.method19743(arg0, var2, var3);
		}
	}

	@ObfuscatedName("aue.bv(I)V")
	public void method16529() {
		class423 var1 = this.method10536().field4298;
		this.field12471 = this.field12472 = (short) (var1.field4308 / 512.0F);
		this.field12468 = this.field12467 = (short) (var1.field4313 / 512.0F);
	}

	@ObfuscatedName("aue.w(Ldh;Ldo;Lou;B)V")
	public void method19743(class133 arg0, class116 arg1, class419 arg2) {
		arg1.method1689(arg2);
		class128[] var4 = arg1.method1750();
		class102[] var5 = arg1.method1765();
		if ((this.field12585 == null || this.field12585.field7804) && (var4 != null || var5 != null)) {
			this.field12585 = class634.method9962(client.field10903, true);
		}
		if (this.field12585 != null) {
			this.field12585.method9936(arg0, (long) client.field10903, var4, var5, false);
			this.field12585.method9963(this.field11717, this.field12471, this.field12472, this.field12468, this.field12467);
		}
	}

	@ObfuscatedName("aue.l(I)V")
	public void method19728() {
		if (this.field12585 != null) {
			this.field12585.method9932();
		}
	}

	@ObfuscatedName("aue.fa(Ldh;IIB)Z")
	public boolean method17375(class133 arg0, int arg1, int arg2) {
		return false;
	}

	@ObfuscatedName("aue.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("aue.fq(Ldh;Lalh;IIIZB)V")
	public final void method17377(class133 arg0, class1019 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("aue.ff(B)V")
	public final void method17378() {
		throw new IllegalStateException();
	}
}

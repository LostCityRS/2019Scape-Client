package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ajy")
public class class946 extends class1200 implements class514 {

	@ObfuscatedName("ajy.c")
	public class516 field11131;

	@ObfuscatedName("ajy.r")
	public boolean field11128;

	@ObfuscatedName("ajy.v")
	public class556 field11129;

	@ObfuscatedName("ajy.o")
	public boolean field11127 = true;

	@ObfuscatedName("ajy.s")
	public final boolean field11130;

	public class946(class550 arg0, class133 arg1, class1090 arg2, class598 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, boolean arg18, class420 arg19) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.field7503 == 1, Statics.method6824(arg14, arg15), arg19);
		this.field11131 = new class516(arg1, arg2, arg3, arg14, arg15, arg5, this, arg9, arg16, arg17);
		this.field11128 = arg3.field7470 != 0 && !arg9;
		this.field11130 = arg18;
		this.method18363(1);
	}

	@ObfuscatedName("ajy.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("ajy.bw(S)Z")
	public boolean method16489() {
		return this.field11127;
	}

	@ObfuscatedName("ajy.by(B)I")
	public int method16523() {
		return this.field11131.method8262();
	}

	@ObfuscatedName("ajy.fv(Ldh;B)Luq;")
	public class556 method17371(class133 arg0) {
		return this.field11129;
	}

	@ObfuscatedName("ajy.bo(I)I")
	public int method16501() {
		return this.field11131.method8236();
	}

	@ObfuscatedName("ajy.fc(Ldh;I)Ltl;")
	public class552 method17372(class133 arg0) {
		class116 var2 = this.field11131.method8238(arg0, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		class419 var3 = this.method10533();
		class552 var4 = class552.method16749(this.field11128);
		this.field11131.method8239(arg0, var2, var3, this.field12471, this.field12472, this.field12468, this.field12467, true);
		class598 var5 = this.field11131.method8237();
		if (var5.field7468 == null) {
			var2.method1813(var3, this.field11713[0], 0);
		} else {
			var2.method1813(var3, null, 0);
			arg0.method2193(var3, this.field11713[0], var5.field7468);
		}
		if (this.field11131.field6680 != null) {
			class119 var6 = this.field11131.field6680.method9965();
			arg0.method2198(var6);
		}
		this.field11127 = var2.method1731() || this.field11131.field6680 != null;
		class420 var7 = this.method10536();
		if (this.field11129 == null) {
			this.field11129 = class1019.method15111((int) var7.field4298.field4308, (int) var7.field4298.field4311, (int) var7.field4298.field4313, var2);
		} else {
			class1019.method8229(this.field11129, (int) var7.field4298.field4308, (int) var7.field4298.field4311, (int) var7.field4298.field4313, var2);
		}
		return var4;
	}

	@ObfuscatedName("ajy.fw(Ldh;I)V")
	public void method17373(class133 arg0) {
		class116 var2 = this.field11131.method8238(arg0, 262144, true, true);
		if (var2 != null) {
			this.field11131.method8239(arg0, var2, this.method10533(), this.field12471, this.field12472, this.field12468, this.field12467, false);
		}
	}

	@ObfuscatedName("ajy.br(Lvp;B)V")
	public void method17369(class597 arg0) {
		this.field11131.method8265(arg0);
	}

	@ObfuscatedName("ajy.fa(Ldh;IIB)Z")
	public boolean method17375(class133 arg0, int arg1, int arg2) {
		class598 var4 = this.field11131.method8237();
		if (var4.field7468 == null) {
			class116 var5 = this.field11131.method8238(arg0, 131072, false, false);
			return var5 == null ? false : var5.method1725(arg1, arg2, this.method10533(), false, 0);
		} else {
			return arg0.method2191(arg1, arg2, this.method10533(), var4.field7468);
		}
	}

	@ObfuscatedName("ajy.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("ajy.fq(Ldh;Lalh;IIIZB)V")
	public final void method17377(class133 arg0, class1019 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajy.ff(B)V")
	public final void method17378() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajy.e(I)I")
	public int method8223() {
		return this.field11131.field6665;
	}

	@ObfuscatedName("ajy.n(I)I")
	public int method8220() {
		return this.field11131.field6666;
	}

	@ObfuscatedName("ajy.m(I)I")
	public int method8204() {
		return this.field11131.field6667;
	}

	@ObfuscatedName("ajy.k(I)V")
	public void method8205() {
	}

	@ObfuscatedName("ajy.w(B)Z")
	public boolean method8207() {
		return this.field11130;
	}

	@ObfuscatedName("ajy.f(I)Z")
	public boolean method8206() {
		return this.field11131.method8240();
	}

	@ObfuscatedName("ajy.l(Ldh;B)V")
	public void method8217(class133 arg0) {
		this.field11131.method8241(arg0);
	}

	@ObfuscatedName("ajy.u(Ldh;B)V")
	public void method8209(class133 arg0) {
		this.field11131.method8242(arg0);
	}
}

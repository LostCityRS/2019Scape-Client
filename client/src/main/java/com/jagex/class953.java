package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ajz")
public class class953 extends class1196 implements class514 {

	@ObfuscatedName("ajz.c")
	public class1090 field11185;

	@ObfuscatedName("ajz.r")
	public class116 field11192;

	@ObfuscatedName("ajz.v")
	public class1175 field11186;

	@ObfuscatedName("ajz.o")
	public class556 field11187;

	@ObfuscatedName("ajz.s")
	public final int field11715;

	@ObfuscatedName("ajz.y")
	public final byte field11189;

	@ObfuscatedName("ajz.q")
	public final boolean field11190;

	@ObfuscatedName("ajz.x")
	public boolean field11191;

	@ObfuscatedName("ajz.b")
	public boolean field11184;

	@ObfuscatedName("ajz.h")
	public boolean field11193;

	@ObfuscatedName("ajz.a")
	public int field11194;

	public class953(class550 arg0, class133 arg1, class1090 arg2, class598 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, boolean arg11, class420 arg12) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.field7448, arg12);
		this.field11185 = arg2;
		this.field11715 = arg3.field7450;
		this.field11190 = arg9;
		this.field11189 = (byte) arg10;
		this.field11191 = arg3.field7470 != 0 && !arg9;
		this.field11184 = arg11;
		this.field11193 = arg1.method2125() && arg3.field7453 && !this.field11190 && Statics.field688.field11529.method18515() != 0;
		this.field11194 = arg7;
		int var14 = 2048;
		if (this.field11184) {
			var14 |= 0x10000;
		}
		if (arg3.field7525) {
			var14 |= 0x80000;
		}
		class746 var15 = this.method17436(arg1, var14, this.field11193);
		if (var15 != null) {
			this.field11192 = (class116) var15.field8737;
			this.field11186 = (class1175) var15.field8738;
			if (this.field11184 || arg3.field7525) {
				this.field11192 = this.field11192.method1773((byte) 0, var14, false);
				if (arg3.field7525) {
					class493 var16 = client.field10855.method7722();
					this.field11192.method1745(var16.field5015, var16.field5013, var16.field5014, var16.field5012);
				}
			}
		}
		this.method18363(1);
	}

	@ObfuscatedName("ajz.bu(B)Z")
	public boolean method16488() {
		if (this.field11192 == null) {
			return true;
		} else {
			return !this.field11192.method1812();
		}
	}

	@ObfuscatedName("ajz.bw(S)Z")
	public boolean method16489() {
		return this.field11192 == null ? false : this.field11192.method1731();
	}

	@ObfuscatedName("ajz.by(B)I")
	public int method16523() {
		return this.field11192 == null ? 0 : this.field11192.method1748();
	}

	@ObfuscatedName("ajz.bz(Ldh;IB)Ldo;")
	public class116 method17435(class133 arg0, int arg1) {
		if (this.field11192 != null && arg0.method2394(this.field11192.method1691(), arg1) == 0) {
			return this.field11192;
		} else {
			class746 var3 = this.method17436(arg0, arg1, false);
			return var3 == null ? null : (class116) var3.field8737;
		}
	}

	@ObfuscatedName("ajz.bv(Ldh;IZI)Labg;")
	public class746 method17436(class133 arg0, int arg1, boolean arg2) {
		class598 var4 = (class598) this.field11185.method962(this.field11715);
		class104 var5;
		class104 var6;
		if (this.field11190) {
			var5 = this.field11716.field6917[this.field11714];
			var6 = this.field11716.field6915[0];
		} else {
			var5 = this.field11716.field6915[this.field11714];
			if (this.field11714 < 3) {
				var6 = this.field11716.field6915[this.field11714 + 1];
			} else {
				var6 = null;
			}
		}
		class423 var7 = this.method10536().field4298;
		return var4.method9475(arg0, arg1, class601.field7566.field7562, this.field11189, var5, var6, (int) var7.field4308, this.field11194, (int) var7.field4313, arg2, null);
	}

	@ObfuscatedName("ajz.fv(Ldh;B)Luq;")
	public class556 method17371(class133 arg0) {
		class423 var2 = this.method10536().field4298;
		if (this.field11187 == null) {
			this.field11187 = class1019.method15111((int) var2.field4308, (int) var2.field4311, (int) var2.field4313, this.method17435(arg0, 0));
		}
		return this.field11187;
	}

	@ObfuscatedName("ajz.fc(Ldh;I)Ltl;")
	public class552 method17372(class133 arg0) {
		if (this.field11192 == null) {
			return null;
		}
		class419 var2 = this.method10533();
		class552 var3 = class552.method16749(this.field11191);
		class416 var4 = ((class598) this.field11185.method962(this.field11715)).field7468;
		if (var4 == null) {
			this.field11192.method1813(var2, this.field11713[0], 0);
		} else {
			this.field11192.method1813(var2, null, 0);
			arg0.method2193(var2, this.field11713[0], var4);
		}
		return var3;
	}

	@ObfuscatedName("ajz.fw(Ldh;I)V")
	public void method17373(class133 arg0) {
	}

	@ObfuscatedName("ajz.fa(Ldh;IIB)Z")
	public boolean method17375(class133 arg0, int arg1, int arg2) {
		class416 var4 = ((class598) this.field11185.method962(this.field11715)).field7468;
		if (var4 != null) {
			return arg0.method2191(arg1, arg2, this.method10533(), var4);
		}
		class116 var5 = this.method17435(arg0, 131072);
		if (var5 == null) {
			return false;
		} else {
			class419 var6 = this.method10533();
			return var5.method1725(arg1, arg2, var6, false, 0);
		}
	}

	@ObfuscatedName("ajz.fp(I)Z")
	public boolean method17379() {
		return this.field11184;
	}

	@ObfuscatedName("ajz.fq(Ldh;Lalh;IIIZB)V")
	public void method17377(class133 arg0, class1019 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof class953) {
			class953 var7 = (class953) arg1;
			if (this.field11192 != null && var7.field11192 != null) {
				this.field11192.method1686(var7.field11192, arg2, arg3, arg4, arg5);
			}
		}
	}

	@ObfuscatedName("ajz.ff(B)V")
	public void method17378() {
		this.field11184 = false;
		if (this.field11192 != null) {
			this.field11192.method1690(this.field11192.method1691() & 0xFFFEFFFF);
		}
	}

	@ObfuscatedName("ajz.e(I)I")
	public int method8223() {
		return this.field11715;
	}

	@ObfuscatedName("ajz.n(I)I")
	public int method8220() {
		return class601.field7566.field7562;
	}

	@ObfuscatedName("ajz.m(I)I")
	public int method8204() {
		return this.field11189;
	}

	@ObfuscatedName("ajz.k(I)V")
	public void method8205() {
		if (this.field11192 != null) {
			this.field11192.method1816();
		}
	}

	@ObfuscatedName("ajz.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajz.f(I)Z")
	public boolean method8206() {
		return this.field11193;
	}

	@ObfuscatedName("ajz.l(Ldh;B)V")
	public void method8217(class133 arg0) {
		Object var2 = null;
		class1175 var4;
		if (this.field11186 == null && this.field11193) {
			class746 var3 = this.method17436(arg0, 262144, true);
			var4 = (class1175) (var3 == null ? null : var3.field8738);
		} else {
			var4 = this.field11186;
			this.field11186 = null;
		}
		class423 var5 = this.method10536().field4298;
		if (var4 != null) {
			this.field11716.method8750(var4, this.field11714, (int) var5.field4308, (int) var5.field4313, null);
		}
	}

	@ObfuscatedName("ajz.u(Ldh;B)V")
	public void method8209(class133 arg0) {
		Object var2 = null;
		class1175 var4;
		if (this.field11186 == null && this.field11193) {
			class746 var3 = this.method17436(arg0, 262144, true);
			var4 = (class1175) (var3 == null ? null : var3.field8738);
		} else {
			var4 = this.field11186;
			this.field11186 = null;
		}
		class423 var5 = this.method10536().field4298;
		if (var4 != null) {
			this.field11716.method8814(var4, this.field11714, (int) var5.field4308, (int) var5.field4313, null);
		}
	}
}

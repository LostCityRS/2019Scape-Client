package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ajk")
public class class949 extends class1197 implements class514 {

	@ObfuscatedName("ajk.c")
	public class1090 field11159;

	@ObfuscatedName("ajk.r")
	public class116 field11150;

	@ObfuscatedName("ajk.v")
	public class1175 field11154;

	@ObfuscatedName("ajk.o")
	public class556 field11149;

	@ObfuscatedName("ajk.s")
	public final int field11715;

	@ObfuscatedName("ajk.y")
	public final byte field11152;

	@ObfuscatedName("ajk.q")
	public final byte field11155;

	@ObfuscatedName("ajk.x")
	public final boolean field11156;

	@ObfuscatedName("ajk.b")
	public boolean field11157;

	@ObfuscatedName("ajk.h")
	public boolean field11158;

	@ObfuscatedName("ajk.a")
	public int field11151;

	public class949(class550 arg0, class133 arg1, class1090 arg2, class598 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, class420 arg14) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11, arg14);
		this.field11159 = arg2;
		this.field11715 = arg3.field7450;
		this.field11156 = arg9;
		this.field11155 = (byte) arg13;
		this.field11152 = (byte) arg12;
		this.field11157 = arg3.field7470 != 0 && !arg9;
		this.field11158 = arg1.method2125() && arg3.field7453 && !this.field11156 && Statics.field688.field11529.method18515() != 0;
		this.field11151 = arg7;
		int var16 = 2048;
		if (arg3.field7525) {
			var16 |= 0x80000;
		}
		class746 var17 = this.method17414(arg1, var16, this.field11158);
		if (var17 != null) {
			this.field11150 = (class116) var17.field8737;
			this.field11154 = (class1175) var17.field8738;
			if (arg3.field7525) {
				this.field11150 = this.field11150.method1773((byte) 0, var16, false);
				if (arg3.field7525) {
					class493 var18 = client.field10855.method7722();
					this.field11150.method1745(var18.field5015, var18.field5013, var18.field5014, var18.field5012);
				}
			}
		}
		this.method18363(1);
	}

	@ObfuscatedName("ajk.bu(B)Z")
	public boolean method16488() {
		if (this.field11150 == null) {
			return true;
		} else {
			return !this.field11150.method1812();
		}
	}

	@ObfuscatedName("ajk.bw(S)Z")
	public boolean method16489() {
		return this.field11150 == null ? false : this.field11150.method1731();
	}

	@ObfuscatedName("ajk.by(B)I")
	public int method16523() {
		return this.field11150 == null ? 0 : this.field11150.method1748();
	}

	@ObfuscatedName("ajk.bz(Ldh;IB)Ldo;")
	public class116 method17411(class133 arg0, int arg1) {
		if (this.field11150 != null && arg0.method2394(this.field11150.method1691(), arg1) == 0) {
			return this.field11150;
		} else {
			class746 var3 = this.method17414(arg0, arg1, false);
			return var3 == null ? null : (class116) var3.field8737;
		}
	}

	@ObfuscatedName("ajk.bv(Ldh;IZI)Labg;")
	public class746 method17414(class133 arg0, int arg1, boolean arg2) {
		class598 var4 = (class598) this.field11159.method962(this.field11715);
		class104 var5;
		class104 var6;
		if (this.field11156) {
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
		return var4.method9475(arg0, arg1, this.field11152, this.field11155, var5, var6, (int) var7.field4308, this.field11151, (int) var7.field4313, arg2, null);
	}

	@ObfuscatedName("ajk.fv(Ldh;B)Luq;")
	public class556 method17371(class133 arg0) {
		class423 var2 = this.method10536().field4298;
		if (this.field11149 == null) {
			this.field11149 = class1019.method15111((int) var2.field4308, (int) var2.field4311, (int) var2.field4313, this.method17411(arg0, 0));
		}
		return this.field11149;
	}

	@ObfuscatedName("ajk.fc(Ldh;I)Ltl;")
	public class552 method17372(class133 arg0) {
		if (this.field11150 == null) {
			return null;
		}
		class419 var2 = arg0.method2209();
		var2.method6292(this.method10533());
		var2.method6315((float) this.field12452, 0.0F, (float) this.field12451);
		class552 var3 = class552.method16749(this.field11157);
		class416 var4 = ((class598) this.field11159.method962(this.field11715)).field7468;
		if (var4 == null) {
			this.field11150.method1813(var2, this.field11713[0], 0);
		} else {
			this.field11150.method1813(var2, null, 0);
			arg0.method2193(var2, this.field11713[0], var4);
		}
		return var3;
	}

	@ObfuscatedName("ajk.fw(Ldh;I)V")
	public void method17373(class133 arg0) {
	}

	@ObfuscatedName("ajk.fa(Ldh;IIB)Z")
	public boolean method17375(class133 arg0, int arg1, int arg2) {
		class416 var4 = ((class598) this.field11159.method962(this.field11715)).field7468;
		if (var4 != null) {
			return arg0.method2191(arg1, arg2, this.method10533(), var4);
		}
		class116 var5 = this.method17411(arg0, 131072);
		if (var5 == null) {
			return false;
		} else {
			class419 var6 = this.method10533();
			return var5.method1725(arg1, arg2, var6, false, 0);
		}
	}

	@ObfuscatedName("ajk.e(I)I")
	public int method8223() {
		return this.field11715;
	}

	@ObfuscatedName("ajk.n(I)I")
	public int method8220() {
		return this.field11152;
	}

	@ObfuscatedName("ajk.m(I)I")
	public int method8204() {
		return this.field11155;
	}

	@ObfuscatedName("ajk.k(I)V")
	public void method8205() {
		if (this.field11150 != null) {
			this.field11150.method1816();
		}
	}

	@ObfuscatedName("ajk.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajk.f(I)Z")
	public boolean method8206() {
		return this.field11158;
	}

	@ObfuscatedName("ajk.l(Ldh;B)V")
	public void method8217(class133 arg0) {
		Object var2 = null;
		class1175 var4;
		if (this.field11154 == null && this.field11158) {
			class746 var3 = this.method17414(arg0, 262144, true);
			var4 = (class1175) (var3 == null ? null : var3.field8738);
		} else {
			var4 = this.field11154;
			this.field11154 = null;
		}
		class423 var5 = this.method10536().field4298;
		if (var4 != null) {
			this.field11716.method8750(var4, this.field11714, (int) var5.field4308, (int) var5.field4313, null);
		}
	}

	@ObfuscatedName("ajk.u(Ldh;B)V")
	public void method8209(class133 arg0) {
		Object var2 = null;
		class1175 var4;
		if (this.field11154 == null && this.field11158) {
			class746 var3 = this.method17414(arg0, 262144, true);
			var4 = (class1175) (var3 == null ? null : var3.field8738);
		} else {
			var4 = this.field11154;
			this.field11154 = null;
		}
		class423 var5 = this.method10536().field4298;
		if (var4 != null) {
			this.field11716.method8814(var4, this.field11714, (int) var5.field4308, (int) var5.field4313, null);
		}
	}
}

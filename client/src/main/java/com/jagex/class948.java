package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ajv")
public class class948 extends class1200 implements class514 {

	@ObfuscatedName("ajv.c")
	public class1090 field11145;

	@ObfuscatedName("ajv.r")
	public class116 field11136;

	@ObfuscatedName("ajv.v")
	public class1175 field11146;

	@ObfuscatedName("ajv.o")
	public class556 field11148;

	@ObfuscatedName("ajv.s")
	public final int field11715;

	@ObfuscatedName("ajv.y")
	public final byte field11137;

	@ObfuscatedName("ajv.q")
	public final byte field11142;

	@ObfuscatedName("ajv.x")
	public final boolean field11143;

	@ObfuscatedName("ajv.b")
	public boolean field11144;

	@ObfuscatedName("ajv.h")
	public boolean field11139;

	@ObfuscatedName("ajv.a")
	public boolean field11141;

	@ObfuscatedName("ajv.g")
	public final boolean field12470;

	@ObfuscatedName("ajv.i")
	public int field11138;

	public class948(class550 arg0, class133 arg1, class1090 arg2, class598 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, boolean arg16, boolean arg17, class420 arg18) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.field7503 == 1, Statics.method14062(arg14, arg15), arg18);
		this.field11145 = arg2;
		this.field11715 = arg3.field7450;
		this.field11714 = (byte) arg5;
		this.field11143 = arg9;
		this.field11137 = (byte) arg14;
		this.field11142 = (byte) arg15;
		this.field11144 = arg3.field7470 != 0 && !arg9;
		this.field11139 = arg16;
		this.field11141 = arg1.method2125() && arg3.field7453 && !this.field11143 && Statics.field688.field11529.method18515() != 0;
		this.field12470 = arg17;
		this.field11138 = arg7;
		int var20 = 2048;
		if (this.field11139) {
			var20 |= 0x10000;
		}
		if (arg3.field7525) {
			var20 |= 0x80000;
		}
		class746 var21 = this.method17400(arg1, var20, this.field11141);
		if (var21 != null) {
			this.field11136 = (class116) var21.field8737;
			this.field11146 = (class1175) var21.field8738;
			if (this.field11139 || arg3.field7525) {
				this.field11136 = this.field11136.method1773((byte) 0, var20, false);
				if (arg3.field7525) {
					class493 var22 = client.field10855.method7722();
					this.field11136.method1745(var22.field5015, var22.field5013, var22.field5014, var22.field5012);
				}
			}
		}
		this.method18363(1);
	}

	@ObfuscatedName("ajv.bu(B)Z")
	public boolean method16488() {
		if (this.field11136 == null) {
			return true;
		} else {
			return !this.field11136.method1812();
		}
	}

	@ObfuscatedName("ajv.bw(S)Z")
	public boolean method16489() {
		return this.field11136 == null ? false : this.field11136.method1731();
	}

	@ObfuscatedName("ajv.by(B)I")
	public int method16523() {
		return this.field11136 == null ? 0 : this.field11136.method1748();
	}

	@ObfuscatedName("ajv.br(Ldh;II)Ldo;")
	public class116 method17399(class133 arg0, int arg1) {
		if (this.field11136 != null && arg0.method2394(this.field11136.method1691(), arg1) == 0) {
			return this.field11136;
		} else {
			class746 var3 = this.method17400(arg0, arg1, false);
			return var3 == null ? null : (class116) var3.field8737;
		}
	}

	@ObfuscatedName("ajv.bg(Ldh;IZI)Labg;")
	public class746 method17400(class133 arg0, int arg1, boolean arg2) {
		class598 var4 = (class598) this.field11145.method962(this.field11715);
		class104 var5;
		class104 var6;
		if (this.field11143) {
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
		return var4.method9475(arg0, arg1, class601.field7564.field7562 == this.field11137 ? class601.field7563.field7562 : this.field11137, class601.field7564.field7562 == this.field11137 ? this.field11142 + 4 : this.field11142, var5, var6, (int) var7.field4308, this.field11138, (int) var7.field4313, arg2, null);
	}

	@ObfuscatedName("ajv.fv(Ldh;B)Luq;")
	public class556 method17371(class133 arg0) {
		class423 var2 = this.method10536().field4298;
		if (this.field11148 == null) {
			this.field11148 = class1019.method15111((int) var2.field4308, (int) var2.field4311, (int) var2.field4313, this.method17399(arg0, 0));
		}
		return this.field11148;
	}

	@ObfuscatedName("ajv.fc(Ldh;I)Ltl;")
	public class552 method17372(class133 arg0) {
		if (this.field11136 == null) {
			return null;
		}
		class419 var2 = this.method10533();
		class552 var3 = class552.method16749(this.field11144);
		class416 var4 = ((class598) this.field11145.method962(this.field11715)).field7468;
		if (var4 == null) {
			this.field11136.method1813(var2, this.field11713[0], 0);
		} else {
			this.field11136.method1813(var2, null, 0);
			arg0.method2193(var2, this.field11713[0], var4);
		}
		return var3;
	}

	@ObfuscatedName("ajv.fw(Ldh;I)V")
	public void method17373(class133 arg0) {
	}

	@ObfuscatedName("ajv.fa(Ldh;IIB)Z")
	public boolean method17375(class133 arg0, int arg1, int arg2) {
		class416 var4 = ((class598) this.field11145.method962(this.field11715)).field7468;
		if (var4 != null) {
			return arg0.method2191(arg1, arg2, this.method10533(), var4);
		}
		class116 var5 = this.method17399(arg0, 131072);
		if (var5 == null) {
			return false;
		} else {
			class419 var6 = this.method10533();
			return var5.method1725(arg1, arg2, var6, false, 0);
		}
	}

	@ObfuscatedName("ajv.fp(I)Z")
	public boolean method17379() {
		return this.field11139;
	}

	@ObfuscatedName("ajv.fq(Ldh;Lalh;IIIZB)V")
	public void method17377(class133 arg0, class1019 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof class950) {
			class950 var7 = (class950) arg1;
			if (this.field11136 != null && var7.field11173 != null) {
				this.field11136.method1686(var7.field11173, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof class948) {
			class948 var8 = (class948) arg1;
			if (this.field11136 != null && var8.field11136 != null) {
				this.field11136.method1686(var8.field11136, arg2, arg3, arg4, arg5);
			}
		}
	}

	@ObfuscatedName("ajv.ff(B)V")
	public void method17378() {
		this.field11139 = false;
		if (this.field11136 != null) {
			this.field11136.method1690(this.field11136.method1691() & 0xFFFEFFFF);
		}
	}

	@ObfuscatedName("ajv.e(I)I")
	public int method8223() {
		return this.field11715;
	}

	@ObfuscatedName("ajv.n(I)I")
	public int method8220() {
		return this.field11137;
	}

	@ObfuscatedName("ajv.m(I)I")
	public int method8204() {
		return this.field11142;
	}

	@ObfuscatedName("ajv.k(I)V")
	public void method8205() {
		if (this.field11136 != null) {
			this.field11136.method1816();
		}
	}

	@ObfuscatedName("ajv.w(B)Z")
	public boolean method8207() {
		return this.field12470;
	}

	@ObfuscatedName("ajv.f(I)Z")
	public boolean method8206() {
		return this.field11141;
	}

	@ObfuscatedName("ajv.l(Ldh;B)V")
	public void method8217(class133 arg0) {
		Object var2 = null;
		class1175 var4;
		if (this.field11146 == null && this.field11141) {
			class746 var3 = this.method17400(arg0, 262144, true);
			var4 = (class1175) (var3 == null ? null : var3.field8738);
		} else {
			var4 = this.field11146;
			this.field11146 = null;
		}
		class423 var5 = this.method10536().field4298;
		if (var4 != null) {
			this.field11716.method8750(var4, this.field11714, (int) var5.field4308, (int) var5.field4313, null);
		}
	}

	@ObfuscatedName("ajv.u(Ldh;B)V")
	public void method8209(class133 arg0) {
		Object var2 = null;
		class1175 var4;
		if (this.field11146 == null && this.field11141) {
			class746 var3 = this.method17400(arg0, 262144, true);
			var4 = (class1175) (var3 == null ? null : var3.field8738);
		} else {
			var4 = this.field11146;
			this.field11146 = null;
		}
		class423 var5 = this.method10536().field4298;
		if (var4 != null) {
			this.field11716.method8814(var4, this.field11714, (int) var5.field4308, (int) var5.field4313, null);
		}
	}

	@ObfuscatedName("ajv.ba(I)I")
	public int method17401() {
		return this.field11136 == null ? 15 : this.field11136.method1727() / 4;
	}
}

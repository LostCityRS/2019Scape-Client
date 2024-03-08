package com.jagex;

import deob.ObfuscatedName;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("oi")
public class class402 implements class731 {

	@ObfuscatedName("oi.e")
	public final Js5 field4200;

	@ObfuscatedName("oi.n")
	public final Js5 field4201;

	@ObfuscatedName("oi.m")
	public final WeightedCache field4202 = new WeightedCache(20);

	@ObfuscatedName("oi.k")
	public final WeightedCache field4203 = new WeightedCache(20);

	@ObfuscatedName("oi.f")
	public final int[] field4204;

	@ObfuscatedName("oi.w")
	public WeightedCache field4205;

	@ObfuscatedName("oi.l")
	public Renderer field4206 = null;

	@ObfuscatedName("oi.u")
	public Map field4207 = null;

	public class402(Renderer arg0, Js5 arg1, Js5 arg2, int[] arg3) {
		this.field4206 = arg0;
		this.field4200 = arg1;
		this.field4201 = arg2;
		this.field4204 = arg3;
		this.field4205 = new WeightedCache(20);
	}

	@ObfuscatedName("oi.e(Loq;I)V")
	public void method6157(class401 arg0) {
		this.field4207 = new HashMap(this.field4204.length);
		for (int var2 = 0; var2 < this.field4204.length; var2++) {
			int var3 = this.field4204[var2];
			class733 var4 = class733.method10677(this.field4201, var3, this);
			byte[] var5 = this.field4200.method6894(var3);
			Object var6 = arg0.method210(var5, var4, true);
			this.field4207.put(var2, new class746(var6, var4));
		}
	}

	@ObfuscatedName("oi.n(S)V")
	public void method6158() {
		this.field4207 = null;
	}

	@ObfuscatedName("oi.m(I)I")
	public int method6179() {
		return this.method6191(false);
	}

	@ObfuscatedName("oi.k(ZI)I")
	public int method6191(boolean arg0) {
		if (this.field4204 == null) {
			return 0;
		} else if (arg0 || this.field4207 == null) {
			int var2 = 0;
			for (int var3 = 0; var3 < this.field4204.length; var3++) {
				int var4 = this.field4204[var3];
				if (this.field4200.method6889(var4)) {
					var2++;
				}
				if (this.field4201.method6889(var4)) {
					var2++;
				}
			}
			return var2;
		} else {
			return this.field4204.length * 2;
		}
	}

	@ObfuscatedName("oi.f(B)I")
	public int method6161() {
		return this.field4204 == null ? 0 : this.field4204.length * 2;
	}

	@ObfuscatedName("oi.w(Loq;IZZI)Ljava/lang/Object;")
	public Object method6188(class401 arg0, int arg1, boolean arg2, boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.field4204 != null) {
			for (int var5 = 0; var5 < this.field4204.length; var5++) {
				if (this.field4204[var5] == arg1) {
					return ((class746) this.field4207.get(var5)).field8737;
				}
			}
		}
		Object var6 = this.field4202.method2930((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (var6 != null) {
			return var6;
		}
		byte[] var7 = this.field4200.method6894(arg1);
		if (var7 == null) {
			return null;
		}
		class733 var8 = this.method6164(arg0, arg1, arg2, false);
		if (var8 == null) {
			return null;
		} else {
			Object var9 = arg0.method210(var7, var8, arg3);
			this.field4202.method2921(var9, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return var9;
		}
	}

	@ObfuscatedName("oi.l(Loq;II)Laac;")
	public class733 method6163(class401 arg0, int arg1) {
		return this.method6164(arg0, arg1, true, true);
	}

	@ObfuscatedName("oi.u(Loq;IZZB)Laac;")
	public class733 method6164(class401 arg0, int arg1, boolean arg2, boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.field4204 != null) {
			for (int var5 = 0; var5 < this.field4204.length; var5++) {
				if (this.field4204[var5] == arg1) {
					return (class733) ((class746) this.field4207.get(var5)).field8738;
				}
			}
		}
		if (arg3) {
			this.field4200.method6889(arg1);
		}
		class733 var6 = (class733) this.field4203.method2930((long) arg1);
		if (var6 != null) {
			return var6;
		}
		class733 var7 = class733.method10677(this.field4201, arg1, this);
		if (var7 == null) {
			return null;
		} else {
			if (arg2) {
				this.field4203.method2921(var7, (long) arg1);
			}
			return var7;
		}
	}

	@ObfuscatedName("oi.z(B)V")
	public void method6165() {
		this.field4203.method2924();
		this.field4202.method2924();
		if (this.field4205 != null) {
			this.field4205.method2924();
		}
	}

	@ObfuscatedName("oi.p(II)V")
	public void method6166(int arg0) {
		this.field4203.method2923(arg0);
		this.field4202.method2923(arg0);
		if (this.field4205 != null) {
			this.field4205.method2923(arg0);
		}
	}

	@ObfuscatedName("oi.d(I)V")
	public void method6167() {
		this.field4203.method2928();
		this.field4202.method2928();
		if (this.field4205 != null) {
			this.field4205.method2928();
		}
	}

	@ObfuscatedName("oi.c(Ldh;II)[Lcm;")
	public Sprite[] method6185(Renderer arg0, int arg1) {
		if (this.field4205 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.field4206;
		} else {
			if (this.field4206 != arg0) {
				this.field4205.method2924();
			}
			this.field4206 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		Sprite[] var3 = (Sprite[]) this.field4205.method2930((long) arg1);
		if (var3 == null) {
			class136[] var4 = class111.method1608(this.field4200, arg1, 0);
			if (var4 != null && var4.length > 0) {
				var3 = new Sprite[var4.length];
				for (int var5 = 0; var5 < var4.length; var5++) {
					var3[var5] = arg0.method2200(var4[var5], true);
				}
				this.field4205.method2921(var3, (long) arg1);
			}
		}
		return var3;
	}

	@ObfuscatedName("oi.r(II)I")
	public int method6160(int arg0) {
		Sprite[] var2 = this.method6185(this.field4206, arg0);
		return var2 == null ? 0 : var2[0].method1434();
	}
}

package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("eb")
public final class class162 {

	@ObfuscatedName("eb.e")
	public int field1758;

	@ObfuscatedName("eb.n")
	public int field1756;

	@ObfuscatedName("eb.m")
	public class729 field1757;

	@ObfuscatedName("eb.k")
	public class720 field1755;

	@ObfuscatedName("eb.f")
	public class161 field1759;

	public class162(int arg0) {
		this(arg0, arg0);
	}

	@ObfuscatedName("eb.e(Len;B)V")
	public void method2943(class161 arg0) {
		this.field1759 = arg0;
	}

	public class162(int arg0, int arg1) {
		this.field1755 = new class720();
		this.field1758 = arg0;
		this.field1756 = arg0;
		int var3;
		for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
		}
		this.field1757 = new class729(var3);
	}

	@ObfuscatedName("eb.n(J)Ljava/lang/Object;")
	public Object method2930(long arg0) {
		class1178 var3 = (class1178) this.field1757.method14495(arg0);
		if (var3 == null) {
			return null;
		}
		Object var4 = var3.method19423();
		if (var4 == null) {
			var3.method8440();
			var3.method17806();
			this.field1756 += var3.field12328;
			return null;
		}
		if (var3.method19424()) {
			class1225 var5 = new class1225(var4, var3.field12328);
			this.field1757.method14501(var5, var3.field6760);
			this.field1755.method14339(var5);
			var5.field11440 = 0L;
			var3.method8440();
			var3.method17806();
		} else {
			this.field1755.method14339(var3);
			var3.field11440 = 0L;
		}
		return var4;
	}

	@ObfuscatedName("eb.m(J)V")
	public void method2957(long arg0) {
		class1178 var3 = (class1178) this.field1757.method14495(arg0);
		this.method2918(var3);
	}

	@ObfuscatedName("eb.k(Lasa;I)V")
	public void method2918(class1178 arg0) {
		if (arg0 != null) {
			arg0.method8440();
			arg0.method17806();
			this.field1756 += arg0.field12328;
		}
	}

	@ObfuscatedName("eb.f(Ljava/lang/Object;J)V")
	public void method2921(Object arg0, long arg1) {
		this.method2922(arg0, arg1, 1);
	}

	@ObfuscatedName("eb.w(Ljava/lang/Object;JII)V")
	public void method2922(Object arg0, long arg1, int arg2) {
		if (arg2 > this.field1758) {
			throw new IllegalStateException();
		}
		this.method2957(arg1);
		this.field1756 -= arg2;
		while (this.field1756 < 0) {
			class1178 var5 = (class1178) this.field1755.method14315();
			if (var5 == null) {
				throw new RuntimeException("");
			}
			if (!var5.method19424()) {
			}
			this.method2918(var5);
			if (this.field1759 != null) {
				this.field1759.method2914(var5.method19423());
			}
		}
		class1225 var6 = new class1225(arg0, arg2);
		this.field1757.method14501(var6, arg1);
		this.field1755.method14339(var6);
		var6.field11440 = 0L;
	}

	@ObfuscatedName("eb.l(IB)V")
	public void method2923(int arg0) {
		for (class1178 var2 = (class1178) this.field1755.method14317(); var2 != null; var2 = (class1178) this.field1755.method14324()) {
			if (var2.method19424()) {
				if (var2.method19423() == null) {
					var2.method8440();
					var2.method17806();
					this.field1756 += var2.field12328;
				}
			} else if (++var2.field11440 > (long) arg0) {
				class1224 var3 = new class1224(var2.method19423(), var2.field12328);
				this.field1757.method14501(var3, var2.field6760);
				class720.method10144(var3, var2);
				var2.method8440();
				var2.method17806();
			}
		}
	}

	@ObfuscatedName("eb.u(B)V")
	public void method2924() {
		this.field1755.method14316();
		this.field1757.method14499();
		this.field1756 = this.field1758;
	}

	@ObfuscatedName("eb.z(I)I")
	public int method2925() {
		return this.field1758;
	}

	@ObfuscatedName("eb.p(B)I")
	public int method2926() {
		return this.field1756;
	}

	@ObfuscatedName("eb.d(B)I")
	public int method2927() {
		int var1 = 0;
		for (class1178 var2 = (class1178) this.field1755.method14317(); var2 != null; var2 = (class1178) this.field1755.method14324()) {
			if (!var2.method19424()) {
				var1++;
			}
		}
		return var1;
	}

	@ObfuscatedName("eb.c(I)V")
	public void method2928() {
		for (class1178 var1 = (class1178) this.field1755.method14317(); var1 != null; var1 = (class1178) this.field1755.method14324()) {
			if (var1.method19424()) {
				var1.method8440();
				var1.method17806();
				this.field1756 += var1.field12328;
			}
		}
	}

	@ObfuscatedName("eb.r(I)Ljava/lang/Object;")
	public Object method2950() {
		class1178 var1 = (class1178) this.field1757.method14500();
		while (var1 != null) {
			Object var2 = var1.method19423();
			if (var2 != null) {
				return var2;
			}
			class1178 var3 = var1;
			var1 = (class1178) this.field1757.method14502();
			var3.method8440();
			var3.method17806();
			this.field1756 += var3.field12328;
		}
		return null;
	}

	@ObfuscatedName("eb.v(I)Ljava/lang/Object;")
	public Object method2937() {
		class1178 var1 = (class1178) this.field1757.method14502();
		while (var1 != null) {
			Object var2 = var1.method19423();
			if (var2 != null) {
				return var2;
			}
			class1178 var3 = var1;
			var1 = (class1178) this.field1757.method14502();
			var3.method8440();
			var3.method17806();
			this.field1756 += var3.field12328;
		}
		return null;
	}
}

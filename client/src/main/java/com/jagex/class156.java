package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ef")
public class class156 {

	@ObfuscatedName("ef.e")
	public final int field1735;

	@ObfuscatedName("ef.n")
	public final class601 field1736;

	@ObfuscatedName("ef.m")
	public int field1740;

	@ObfuscatedName("ef.k")
	public int field1737;

	@ObfuscatedName("ef.f")
	public int field1739;

	@ObfuscatedName("ef.w")
	public int field1738;

	public class156(class997 arg0) {
		this.field1735 = arg0.method17927();
		this.field1736 = (class601) class686.method1897(class601.method606(), arg0.method17904());
	}

	@ObfuscatedName("ef.e(IIIIB)V")
	public void method2847(int arg0, int arg1, int arg2, int arg3) {
		class962.method4653(arg0, arg1, arg2, this.field1736.field7567, this.field1735, this.field1736.field7562, arg3, null);
		this.field1740 = arg0;
		this.field1737 = arg1;
		this.field1739 = arg2;
		this.field1738 = arg3;
	}

	@ObfuscatedName("ef.n(B)V")
	public void method2848() {
		class962.method4653(this.field1740, this.field1737, this.field1739, this.field1736.field7567, -1, this.field1736.field7562, this.field1738, null);
	}

	@ObfuscatedName("ef.m(I)Z")
	public boolean method2849() {
		if (this.field1735 < 0) {
			return true;
		}
		class598 var1 = (class598) Statics.field1897.method962(this.field1735);
		boolean var2 = var1.method9473(this.field1736.field7562);
		int[] var3 = var1.method9484();
		if (var3 != null) {
			int[] var4 = var3;
			for (int var5 = 0; var5 < var4.length; var5++) {
				int var6 = var4[var5];
				var2 &= ((class164) Statics.field8797.method962(var6)).method2991();
			}
		}
		return var2;
	}
}

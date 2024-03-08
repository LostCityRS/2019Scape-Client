package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("arn")
public class class1174 extends class986 {

	@ObfuscatedName("arn.l")
	public final String field12311;

	@ObfuscatedName("arn.u")
	public final class720 field12312;

	@ObfuscatedName("arn.z")
	public int field12310;

	public class1174(String arg0) {
		this.field12311 = arg0;
		this.field12312 = new class720();
	}

	@ObfuscatedName("arn.e(I)I")
	public int method19375() {
		return this.field12312.field8497.field11439 == this.field12312.field8497 ? -1 : ((class1172) this.field12312.field8497.field11439).field12307;
	}

	@ObfuscatedName("arn.n(Larm;I)Z")
	public boolean method19373(class1172 arg0) {
		boolean var2 = true;
		arg0.method17806();
		class1172 var3 = (class1172) this.field12312.method14317();
		while (var3 != null) {
			if (class22.method18853(arg0.field12307, var3.field12307)) {
				Statics.method9574(arg0, var3);
				this.field12310++;
				return !var2;
			}
			var3 = (class1172) this.field12312.method14324();
			var2 = false;
		}
		this.field12312.method14339(arg0);
		this.field12310++;
		return var2;
	}

	@ObfuscatedName("arn.m(Larm;S)Z")
	public boolean method19374(class1172 arg0) {
		int var2 = this.method19375();
		arg0.method17806();
		this.field12310--;
		if (this.field12310 != 0) {
			return var2 != this.method19375();
		}
		this.method8440();
		this.method17806();
		class22.field543--;
		class22.field534.method2921(this, arg0.field12305);
		return false;
	}
}

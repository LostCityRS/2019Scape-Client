package com.jagex.graphics;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.datastruct.DualIterableQueue;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("arn")
public class MinimenuSubmenu extends SecondaryNode {

	@ObfuscatedName("arn.l")
	public final String field12311;

	@ObfuscatedName("arn.u")
	public final DualIterableQueue field12312;

	@ObfuscatedName("arn.z")
	public int field12310;

	public MinimenuSubmenu(String arg0) {
		this.field12311 = arg0;
		this.field12312 = new DualIterableQueue();
	}

	@ObfuscatedName("arn.e(I)I")
	public int method19375() {
		return this.field12312.field8497.field11439 == this.field12312.field8497 ? -1 : ((MinimenuEntry) this.field12312.field8497.field11439).field12307;
	}

	@ObfuscatedName("arn.n(Larm;I)Z")
	public boolean method19373(MinimenuEntry arg0) {
		boolean var2 = true;
		arg0.method17806();
		MinimenuEntry var3 = (MinimenuEntry) this.field12312.method14317();
		while (var3 != null) {
			if (MiniMenu.method18853(arg0.field12307, var3.field12307)) {
				Statics.method9574(arg0, var3);
				this.field12310++;
				return !var2;
			}
			var3 = (MinimenuEntry) this.field12312.method14324();
			var2 = false;
		}
		this.field12312.method14339(arg0);
		this.field12310++;
		return var2;
	}

	@ObfuscatedName("arn.m(Larm;S)Z")
	public boolean method19374(MinimenuEntry arg0) {
		int var2 = this.method19375();
		arg0.method17806();
		this.field12310--;
		if (this.field12310 != 0) {
			return var2 != this.method19375();
		}
		this.method8440();
		this.method17806();
		MiniMenu.field543--;
		MiniMenu.field534.method2921(this, arg0.field12305);
		return false;
	}
}

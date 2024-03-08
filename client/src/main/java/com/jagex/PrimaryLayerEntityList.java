package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("uc")
public class PrimaryLayerEntityList {

	@ObfuscatedName("uc.e")
	public class1200 field7057;

	@ObfuscatedName("uc.n")
	public PrimaryLayerEntityList field7058;

	@ObfuscatedName("uc.m")
	public static int field7059 = 0;

	@ObfuscatedName("j.e(Lash;I)Luc;")
	public static PrimaryLayerEntityList method644(class1200 arg0) {
		PrimaryLayerEntityList var1;
		if (Statics.field7674 == null) {
			var1 = new PrimaryLayerEntityList();
		} else {
			var1 = Statics.field7674;
			Statics.field7674 = Statics.field7674.field7058;
			var1.field7058 = null;
			field7059--;
		}
		var1.field7057 = arg0;
		return var1;
	}

	@ObfuscatedName("uc.n(B)V")
	public void method8973() {
		if (field7059 < 500) {
			this.field7057 = null;
			this.field7058 = Statics.field7674;
			Statics.field7674 = this;
			field7059++;
		}
	}
}

package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("nw")
public class class382 implements BillboardTypeList {

	@ObfuscatedName("nw.e")
	public Js5 field3564;

	@ObfuscatedName("nw.n")
	public WeightedCache field3565 = new WeightedCache(64);

	public class382(Js5 arg0) {
		this.field3564 = arg0;
	}

	@ObfuscatedName("nw.e(II)Lnm;")
	public BillboardType method6015(int arg0) {
		BillboardType var2 = (BillboardType) this.field3565.method2930((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3 = this.field3564.method6879(0, arg0);
		BillboardType var4 = new BillboardType();
		if (var3 != null) {
			var4.method5954(new Packet(var3), arg0);
		}
		this.field3565.method2921(var4, (long) arg0);
		return var4;
	}
}

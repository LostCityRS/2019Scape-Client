package com.jagex.game.config;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("nw")
public class BasicBillboardTypeList implements BillboardTypeList {

	@ObfuscatedName("nw.e")
	public Js5 field3564;

	@ObfuscatedName("nw.n")
	public SoftLruHashTable field3565 = new SoftLruHashTable(64);

	public BasicBillboardTypeList(Js5 arg0) {
		this.field3564 = arg0;
	}

	@ObfuscatedName("nw.e(II)Lnm;")
	public BillboardType get(int arg0) {
		BillboardType var2 = (BillboardType) this.field3565.get((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3 = this.field3564.getfile(0, arg0);
		BillboardType var4 = new BillboardType();
		if (var3 != null) {
			var4.method5954(new Packet(var3), arg0);
		}
		this.field3565.put(var4, (long) arg0);
		return var4;
	}
}

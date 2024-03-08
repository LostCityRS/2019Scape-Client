package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("arp")
public class class1155 extends class978 {

	// $FF: synthetic field
	public final class310 this$0;

	@ObfuscatedName("arp.k")
	public int field12222;

	@ObfuscatedName("arp.f")
	public byte field12223;

	public class1155(class310 arg0) {
		this.this$0 = arg0;
		this.field12222 = -1;
	}

	@ObfuscatedName("arp.e(Lalw;B)V")
	public void method17726(class997 arg0) {
		this.field12222 = arg0.method17906();
		this.field12223 = arg0.method17905();
	}

	@ObfuscatedName("arp.n(Lkr;I)V")
	public void method17727(class309 arg0) {
		arg0.method5267(this.field12222, this.field12223);
	}
}

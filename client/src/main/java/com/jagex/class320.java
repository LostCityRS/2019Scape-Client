package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("li")
public class class320 implements LoadingScreenElementConfig {

	@ObfuscatedName("li.e")
	public final int field3200;

	public class320(int arg0) {
		this.field3200 = arg0;
	}

	@ObfuscatedName("uc.e(Lalw;I)Lli;")
	public static class320 method8975(Packet arg0) {
		int var1 = arg0.gSmart2or4null();
		return new class320(var1);
	}

	@ObfuscatedName("li.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3195;
	}
}

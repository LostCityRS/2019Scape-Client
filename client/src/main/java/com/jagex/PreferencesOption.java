package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zf")
public abstract class PreferencesOption {

	@ObfuscatedName("zf.k")
	public ClientOptions field8417;

	@ObfuscatedName("zf.f")
	public int field8416;

	public PreferencesOption(ClientOptions arg0) {
		this.field8417 = arg0;
		this.field8416 = this.method14069();
	}

	public PreferencesOption(int arg0, ClientOptions arg1) {
		this.field8416 = arg0;
		this.field8417 = arg1;
	}

	@ObfuscatedName("zf.m(IB)V")
	public void method14071(int arg0) {
		if (this.method14070(arg0) != 3) {
			this.method14072(arg0);
		}
	}

	@ObfuscatedName("zf.e(B)I")
	public abstract int method14069();

	@ObfuscatedName("zf.n(II)I")
	public abstract int method14070(int arg0);

	@ObfuscatedName("zf.k(II)V")
	public abstract void method14072(int arg0);
}

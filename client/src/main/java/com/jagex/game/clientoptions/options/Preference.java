package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("zf")
public abstract class Preference {

	@ObfuscatedName("zf.k")
	public ClientOptions options;

	@ObfuscatedName("zf.f")
	public int currentValue;

	public Preference(ClientOptions options) {
		this.options = options;
		this.currentValue = this.defaultValue();
	}

	public Preference(int value, ClientOptions options) {
		this.currentValue = value;
		this.options = options;
	}

	@ObfuscatedName("zf.m(IB)V")
	public void method14071(int arg0) {
		if (this.canSetValue(arg0) != 3) {
			this.setValue(arg0);
		}
	}

	@ObfuscatedName("zf.e(B)I")
	public abstract int defaultValue();

	@ObfuscatedName("zf.n(II)I")
	public abstract int canSetValue(int value);

	@ObfuscatedName("zf.k(II)V")
	public abstract void setValue(int value);
}

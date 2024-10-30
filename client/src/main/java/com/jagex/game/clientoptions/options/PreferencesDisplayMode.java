package com.jagex.game.clientoptions.options;

import com.jagex.game.client.NativeLibraries;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amd")
public class PreferencesDisplayMode extends Preference {

	@ObfuscatedName("amd.w")
	public boolean field11772 = true;

	@ObfuscatedName("amd.l")
	public boolean defaulted = false;

	public PreferencesDisplayMode(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesDisplayMode(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amd.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 5 || this.currentValue == 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amd.e(B)I")
	public int defaultValue() {
		this.defaulted = true;
		return this.options.hardwareInfo().osArchWindows() ? 3 : 1;
	}

	@ObfuscatedName("amd.s(B)Z")
	public boolean canMod() {
		return true;
	}

	@ObfuscatedName("amd.n(II)I")
	public int canSetValue(int arg0) {
		return arg0 == 3 && !NativeLibraries.getLoader().method7900("jagdx") ? 3 : 2;
	}

	@ObfuscatedName("amd.k(II)V")
	public void setValue(int arg0) {
		this.defaulted = false;
		this.currentValue = arg0;
	}

	@ObfuscatedName("amd.y(B)I")
	public int getValue() {
		return this.currentValue;
	}

	@ObfuscatedName("amd.q(I)Z")
	public boolean method18546() {
		return this.field11772;
	}

	@ObfuscatedName("amd.x(ZB)V")
	public void method18544(boolean arg0) {
		this.field11772 = arg0;
	}
}

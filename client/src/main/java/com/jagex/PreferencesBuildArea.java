package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aml")
public class PreferencesBuildArea extends PreferencesOption {

	public PreferencesBuildArea(Preferences arg0) {
		super(arg0);
	}

	public PreferencesBuildArea(int arg0, Preferences arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("aml.o(B)V")
	public void method18568() {
		if (this.field8417.hardwareInfo().unused()) {
			this.field8416 = BuildAreaSize.field2658.field2664;
			return;
		}
		int var1 = this.field8417.hardwareInfo().maxmemory();
		if (var1 < 245) {
			this.field8416 = BuildAreaSize.field2663.field2664;
		}
		if (BuildAreaSize.field2662.field2664 == this.field8416 && var1 < 500) {
			this.field8416 = BuildAreaSize.field2660.field2664;
		}
		if (this.field8416 < BuildAreaSize.field2663.field2664 || this.field8416 > BuildAreaSize.field2661.field2664) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("aml.e(B)I")
	public int method14069() {
		return this.field8417.hardwareInfo().unused() ? BuildAreaSize.field2658.field2664 : BuildAreaSize.field2663.field2664;
	}

	@ObfuscatedName("aml.s(I)Z")
	public boolean method18569() {
		if (this.field8417.hardwareInfo().unused()) {
			return false;
		} else {
			int var1 = this.field8417.hardwareInfo().maxmemory();
			return var1 >= 245;
		}
	}

	@ObfuscatedName("aml.n(II)I")
	public int method14070(int arg0) {
		if (this.field8417.hardwareInfo().unused()) {
			return 3;
		}
		int var2 = this.field8417.hardwareInfo().maxmemory();
		if (var2 < 245) {
			return 3;
		} else if (BuildAreaSize.field2662.field2664 == arg0 && var2 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("aml.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("aml.y(B)I")
	public int method18570() {
		return this.field8416;
	}
}

package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anz")
public class PreferencesUnknown7 extends PreferencesOption {

	public PreferencesUnknown7(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnknown7(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anz.o(I)V")
	public void method18749() {
		int var1 = this.field8417.displayMode.method18545();
		if (var1 != 3 && var1 != 5) {
			this.field8416 = 0;
		}
		if (this.field8417.hardwareInfo().cpucount() < 2) {
			this.field8416 = 0;
		}
		if (this.field8416 != 0 && this.field8416 != 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("anz.e(B)I")
	public int method14069() {
		int var1 = this.field8417.displayMode.method18545();
		return var1 == 3 || var1 == 5 ? 0 : 0;
	}

	@ObfuscatedName("anz.n(II)I")
	public int method14070(int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.field8417.hardwareInfo().cpucount() < 2) {
			return 3;
		} else {
			int var2 = this.field8417.displayMode.method18545();
			return var2 == 3 || var2 == 5 ? 1 : 3;
		}
	}

	@ObfuscatedName("anz.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anz.s(S)I")
	public int method18750() {
		return this.field8416;
	}
}

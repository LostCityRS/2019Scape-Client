package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ank")
public class PreferencesCpuUsage extends PreferencesOption {

	public PreferencesCpuUsage(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesCpuUsage(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ank.o(B)V")
	public void method18729() {
		if (this.field8416 < 0 || this.field8416 > 4) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ank.e(B)I")
	public int method14069() {
		return this.field8417.hardwareInfo().cpucount() > 1 ? 4 : 2;
	}

	@ObfuscatedName("ank.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("ank.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ank.s(B)I")
	public int method18735() {
		return this.field8416;
	}
}

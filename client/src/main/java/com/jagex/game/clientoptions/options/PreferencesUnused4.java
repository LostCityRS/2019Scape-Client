package com.jagex.game.clientoptions.options;

import com.jagex.graphics.AmbientOcclusionValue;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ama")
public class PreferencesUnused4 extends PreferencesOption {

	public PreferencesUnused4(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused4(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ama.o(I)V")
	public void method18401() {
		if (this.field8416 < AmbientOcclusionValue.field2680.getId() || this.field8416 > AmbientOcclusionValue.field2679.getId()) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ama.e(B)I")
	public int method14069() {
		return AmbientOcclusionValue.field2680.getId();
	}

	@ObfuscatedName("ama.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("ama.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ama.s(I)I")
	public int method18400() {
		return this.field8416;
	}
}

package com.jagex.game.runetek5.config.lighttype;

import com.jagex.ConfigRelated;
import com.jagex.core.io.Packet;
import com.jagex.game.runetek5.config.ConfigType;
import deob.ObfuscatedName;

@ObfuscatedName("adl")
public class LightType implements ConfigType, ConfigRelated {

	@ObfuscatedName("adl.e")
	public int field9168 = 0;

	@ObfuscatedName("adl.n")
	public int field9169 = 0;

	@ObfuscatedName("adl.m")
	public int field9167 = 2048;

	@ObfuscatedName("adl.k")
	public int field9170 = 2048;

	@ObfuscatedName("adl.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method15145(arg0, var2);
		}
	}

	@ObfuscatedName("adl.u(Lalw;II)V")
	public void method15145(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field9168 = arg0.g1();
		} else if (arg1 == 2) {
			this.field9170 = arg0.g2();
		} else if (arg1 == 3) {
			this.field9167 = arg0.g2();
		} else if (arg1 == 4) {
			this.field9169 = arg0.g2s();
		}
	}

	@ObfuscatedName("adl.z(IB)V")
	public void method2998(int arg0) {
	}

	@ObfuscatedName("adl.n(I)V")
	public void postDecode() {
	}
}

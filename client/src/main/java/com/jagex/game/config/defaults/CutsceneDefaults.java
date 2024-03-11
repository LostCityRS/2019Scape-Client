package com.jagex.game.config.defaults;

import com.jagex.Binding;
import com.jagex.Bindings;
import com.jagex.Js5;
import com.jagex.Packet;
import com.jagex.game.config.defaults.DefaultsGroup;
import deob.ObfuscatedName;

@ObfuscatedName("wx")
public class CutsceneDefaults {

	@ObfuscatedName("wx.e")
	public Binding field7675;

	public CutsceneDefaults(Js5 arg0) {
		byte[] var2 = arg0.method6894(DefaultsGroup.field7706.field7708);
		if (var2 != null) {
			this.method9847(new Packet(var2));
		}
	}

	@ObfuscatedName("wx.e(Lalw;I)V")
	public void method9847(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field7675 = Bindings.method4055(arg0);
			}
		}
	}
}

package com.jagex.game.config.defaults;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("wx")
public class CutsceneDefaults {

	@ObfuscatedName("wx.e")
	public Binding cancelbinding;

	public CutsceneDefaults(Js5 arg0) {
		byte[] var2 = arg0.fetchFile(DefaultsGroup.CUTSCENE.js5GroupId);
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
				this.cancelbinding = Bindings.method4055(arg0);
			}
		}
	}
}

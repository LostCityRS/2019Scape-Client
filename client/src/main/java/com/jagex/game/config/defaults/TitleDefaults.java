package com.jagex.game.config.defaults;

import com.jagex.js5.Js5;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("wc")
public class TitleDefaults {

	@ObfuscatedName("wc.e")
	public int field7671 = -1;

	@ObfuscatedName("wc.n")
	public int field7670 = -1;

	public TitleDefaults(Js5 arg0) {
		byte[] var2 = arg0.method6894(DefaultsGroup.field7711.field7708);
		this.method9831(new Packet(var2));
	}

	@ObfuscatedName("wc.e(Lalw;I)V")
	public void method9831(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			switch(var2) {
				case 0:
					return;
				case 1:
					this.field7671 = arg0.gSmart2or4null();
					this.field7670 = arg0.gSmart2or4null();
					break;
				default:
					return;
			}
		}
	}
}

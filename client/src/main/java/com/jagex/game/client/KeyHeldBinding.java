package com.jagex.game.client;

import com.jagex.core.io.Packet;
import com.jagex.game.config.defaults.Binding;
import com.jagex.game.shared.framework.input.Keyboard;
import deob.ObfuscatedName;

@ObfuscatedName("vy")
public class KeyHeldBinding implements Binding {

	@ObfuscatedName("vy.e")
	public final int[] field7423;

	public KeyHeldBinding(int[] arg0) {
		this.field7423 = arg0;
	}

	@ObfuscatedName("vy.e(Lakm;[Lut;ILub;I)Z")
	public boolean test(MouseEvent arg0, KeyboardEvent[] arg1, int arg2, Keyboard arg3) {
		int[] var5 = this.field7423;
		for (int var6 = 0; var6 < var5.length; var6++) {
			int var7 = var5[var6];
			if (!arg3.keyheld(var7)) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("nt.k(Lalw;I)Lvy;")
	public static KeyHeldBinding method6037(Packet arg0) {
		int var1 = arg0.g1();
		int[] var2 = new int[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			var2[var3] = arg0.g1();
		}
		return new KeyHeldBinding(var2);
	}
}

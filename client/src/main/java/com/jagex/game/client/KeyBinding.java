package com.jagex.game.client;

import com.jagex.core.io.Packet;
import com.jagex.game.config.defaults.Binding;
import com.jagex.game.shared.framework.input.Keyboard;
import deob.ObfuscatedName;

@ObfuscatedName("va")
public class KeyBinding implements Binding {

	@ObfuscatedName("va.e")
	public final int field7412;

	@ObfuscatedName("va.n")
	public final int field7413;

	public KeyBinding(int arg0, int arg1) {
		this.field7412 = arg0;
		this.field7413 = arg1;
	}

	@ObfuscatedName("va.e(Lakm;[Lut;ILub;I)Z")
	public boolean test(MouseEvent arg0, KeyboardEvent[] arg1, int arg2, Keyboard arg3) {
		for (int var5 = 0; var5 < arg2 && var5 < arg1.length; var5++) {
			KeyboardEvent var6 = arg1[var5];
			if (var6 != null && var6.method9141() == this.field7412 && var6.method9134() == this.field7413) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("fz.k(Lalw;B)Lva;")
	public static KeyBinding method3038(Packet arg0) {
		int var1 = arg0.g1();
		int var2 = arg0.g1();
		return new KeyBinding(var1, var2);
	}
}

package com.jagex.game.client;

import com.jagex.core.io.Packet;
import com.jagex.game.config.defaults.Binding;
import com.jagex.game.shared.framework.input.Keyboard;
import deob.ObfuscatedName;

@ObfuscatedName("vu")
public class MouseBinding implements Binding {

	@ObfuscatedName("vu.e")
	public final int field7408;

	@ObfuscatedName("vu.n")
	public final int field7407;

	@ObfuscatedName("vu.m")
	public final int[] field7409;

	public MouseBinding(int arg0, int arg1, int[] arg2) {
		this.field7408 = arg0;
		this.field7407 = arg1;
		this.field7409 = arg2;
	}

	@ObfuscatedName("vu.e(Lakm;[Lut;ILub;I)Z")
	public boolean test(MouseEvent arg0, KeyboardEvent[] arg1, int arg2, Keyboard arg3) {
		if (arg0 != null) {
			if (this.field7408 != arg0.getButtonAction()) {
				return false;
			}
			if (this.field7407 > arg0.getCount()) {
				return false;
			}
			int[] var5 = this.field7409;
			for (int var6 = 0; var6 < var5.length; var6++) {
				int var7 = var5[var6];
				if (!arg3.keyheld(var7)) {
					return false;
				}
			}
		} else if (this.field7408 != -1) {
			return false;
		}
		return true;
	}

	@ObfuscatedName("wb.k(Lalw;I)Lvu;")
	public static MouseBinding method9770(Packet arg0) {
		int var1 = arg0.g1();
		int var2 = arg0.g1();
		int var3 = arg0.g1();
		int[] var4 = new int[var3];
		for (int var5 = 0; var5 < var3; var5++) {
			var4[var5] = arg0.g1();
		}
		return new MouseBinding(var1, var2, var4);
	}
}

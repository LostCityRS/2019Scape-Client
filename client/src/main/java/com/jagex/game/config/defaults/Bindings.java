package com.jagex.game.config.defaults;

import com.jagex.core.io.Packet;
import com.jagex.game.client.KeyBinding;
import com.jagex.game.client.KeyHeldBinding;
import com.jagex.game.client.MouseBinding;
import deob.ObfuscatedName;

@ObfuscatedName("vi")
public class Bindings {

	public Bindings() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("hh.e(Lalw;I)Lvt;")
	public static Binding method4055(Packet arg0) {
		BindingType var1 = BindingType.method4512(arg0.g1());
		if (BindingType.field7417 == var1) {
			return MouseBinding.method9770(arg0);
		} else if (BindingType.field7416 == var1) {
			return KeyBinding.method3038(arg0);
		} else if (BindingType.field7418 == var1) {
			return KeyHeldBinding.method6037(arg0);
		} else {
			return null;
		}
	}
}

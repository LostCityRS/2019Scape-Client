package com.jagex.game.config.defaults;

import com.jagex.core.io.Packet;
import com.jagex.game.client.KeyHeldBinding;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("wf")
public class MiniMenuDefaults {

	@ObfuscatedName("wf.e")
	public Binding field7667;

	@ObfuscatedName("wf.n")
	public Binding field7660;

	@ObfuscatedName("wf.m")
	public Binding field7666;

	@ObfuscatedName("wf.k")
	public Binding field7662;

	@ObfuscatedName("wf.f")
	public KeyHeldBinding field7663;

	@ObfuscatedName("wf.w")
	public KeyHeldBinding field7664;

	@ObfuscatedName("wf.l")
	public KeyHeldBinding field7659;

	@ObfuscatedName("wf.u")
	public int field7665;

	@ObfuscatedName("wf.z")
	public int field7661;

	@ObfuscatedName("wf.p")
	public boolean field7668;

	public MiniMenuDefaults(Js5 arg0) {
		byte[] var2 = arg0.method6894(DefaultsGroup.field7707.field7708);
		this.method9825(new Packet(var2));
	}

	@ObfuscatedName("wf.e(Lalw;B)V")
	public void method9825(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field7667 = Bindings.method4055(arg0);
			} else if (var2 == 2) {
				this.field7660 = Bindings.method4055(arg0);
			} else if (var2 == 3) {
				this.field7666 = Bindings.method4055(arg0);
			} else if (var2 == 4) {
				this.field7662 = Bindings.method4055(arg0);
			} else if (var2 == 5) {
				this.field7663 = KeyHeldBinding.method6037(arg0);
			} else if (var2 == 6) {
				this.field7664 = KeyHeldBinding.method6037(arg0);
			} else if (var2 == 7) {
				this.field7659 = KeyHeldBinding.method6037(arg0);
			} else if (var2 == 8) {
				Bindings.method4055(arg0);
			} else if (var2 == 9) {
				Bindings.method4055(arg0);
			} else if (var2 == 10) {
				Bindings.method4055(arg0);
			} else if (var2 == 11) {
				this.field7668 = true;
			} else if (var2 == 12) {
				this.field7665 = arg0.g4s();
			} else if (var2 == 13) {
				this.field7661 = arg0.g4s();
			}
		}
	}
}

package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ady")
public class InvType extends class986 implements ConfigType, class757 {

	@ObfuscatedName("ady.k")
	public int field9264 = 0;

	@ObfuscatedName("ady.f")
	public int[] field9266;

	@ObfuscatedName("ady.w")
	public int[] field9265;

	@ObfuscatedName("ady.l")
	public int field9263 = 0;

	@ObfuscatedName("ady.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method15306(arg0, var2);
		}
	}

	@ObfuscatedName("ady.u(Lalw;II)V")
	public void method15306(Packet arg0, int arg1) {
		if (arg1 == 2) {
			this.field9263 = arg0.g2();
		} else if (arg1 == 4) {
			this.field9264 = arg0.g1();
			this.field9266 = new int[this.field9264];
			this.field9265 = new int[this.field9264];
			for (int var3 = 0; var3 < this.field9264; var3++) {
				this.field9266[var3] = arg0.g2();
				this.field9265[var3] = arg0.g2();
			}
		}
	}

	@ObfuscatedName("ady.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("ady.z(IB)V")
	public void method2998(int arg0) {
	}
}

package com.jagex;

import com.jagex.deob.ObfuscatedName;

@ObfuscatedName("ady")
public class class810 extends class986 implements class53, class757 {

	@ObfuscatedName("ady.k")
	public int field9264 = 0;

	@ObfuscatedName("ady.f")
	public int[] field9266;

	@ObfuscatedName("ady.w")
	public int[] field9265;

	@ObfuscatedName("ady.l")
	public int field9263 = 0;

	@ObfuscatedName("ady.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method15306(arg0, var2);
		}
	}

	@ObfuscatedName("ady.u(Lalw;II)V")
	public void method15306(class997 arg0, int arg1) {
		if (arg1 == 2) {
			this.field9263 = arg0.method17906();
		} else if (arg1 == 4) {
			this.field9264 = arg0.method17904();
			this.field9266 = new int[this.field9264];
			this.field9265 = new int[this.field9264];
			for (int var3 = 0; var3 < this.field9264; var3++) {
				this.field9266[var3] = arg0.method17906();
				this.field9265[var3] = arg0.method17906();
			}
		}
	}

	@ObfuscatedName("ady.n(I)V")
	public void method975() {
	}

	@ObfuscatedName("ady.z(IB)V")
	public void method2998(int arg0) {
	}
}

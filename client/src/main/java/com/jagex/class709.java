package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zf")
public abstract class class709 {

	@ObfuscatedName("zf.k")
	public class998 field8417;

	@ObfuscatedName("zf.f")
	public int field8416;

	public class709(class998 arg0) {
		this.field8417 = arg0;
		this.field8416 = this.method14069();
	}

	public class709(int arg0, class998 arg1) {
		this.field8416 = arg0;
		this.field8417 = arg1;
	}

	@ObfuscatedName("zf.m(IB)V")
	public void method14071(int arg0) {
		if (this.method14070(arg0) != 3) {
			this.method14072(arg0);
		}
	}

	@ObfuscatedName("zf.e(B)I")
	public abstract int method14069();

	@ObfuscatedName("zf.n(II)I")
	public abstract int method14070(int arg0);

	@ObfuscatedName("zf.k(II)V")
	public abstract void method14072(int arg0);
}

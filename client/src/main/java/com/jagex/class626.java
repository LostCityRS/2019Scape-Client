package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wh")
public class class626 {

	@ObfuscatedName("wh.r")
	public int field7690;

	@ObfuscatedName("wh.v")
	public int field7691;

	@ObfuscatedName("wh.o")
	public int field7692;

	@ObfuscatedName("wh.s")
	public int field7693;

	@ObfuscatedName("wh.y")
	public int field7694;

	@ObfuscatedName("wh.q")
	public int field7695;

	@ObfuscatedName("wh.x")
	public int field7686;

	@ObfuscatedName("wh.b")
	public int[][] field7697 = new int[3][5];

	public class626(class442 arg0) {
		byte[] var2 = arg0.method6894(class628.field7710.field7708);
		if (var2 == null) {
		}
		this.method9854(new class997(var2));
	}

	@ObfuscatedName("wh.e(Lalw;S)V")
	public void method9854(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field7690 = arg0.method17910();
			} else if (var2 == 2) {
				this.field7691 = arg0.method17910();
			} else if (var2 == 3) {
				this.field7692 = arg0.method17910();
			} else if (var2 == 4) {
				this.field7693 = arg0.method17904();
			} else if (var2 == 5) {
				this.field7694 = arg0.method17904();
			} else if (var2 == 6) {
				this.field7695 = arg0.method17910();
			} else if (var2 == 7) {
				this.field7686 = arg0.method17910();
			} else if (var2 >= 100) {
				var2 -= 100;
				this.field7697[var2 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][var2 >> 3] = arg0.method17906();
			}
		}
	}
}

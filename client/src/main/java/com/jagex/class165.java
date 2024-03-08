package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("fm")
public class class165 implements class53, class757 {

	@ObfuscatedName("fm.e")
	public boolean[] field1793;

	@ObfuscatedName("fm.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method2997(arg0, var2);
		}
	}

	@ObfuscatedName("fm.u(Lalw;II)V")
	public void method2997(class997 arg0, int arg1) {
		if (arg1 == 2) {
			this.field1793 = new boolean[400];
			int var3 = arg0.method18123();
			for (int var4 = 0; var4 < var3; var4++) {
				this.field1793[arg0.method18123()] = true;
			}
		} else if (arg1 == 3) {
			arg0.method17904();
			int var5 = arg0.method18123();
			for (int var6 = 0; var6 < var5; var6++) {
				arg0.method18123();
				arg0.method17904();
			}
		}
	}

	@ObfuscatedName("fm.n(I)V")
	public void method975() {
	}

	@ObfuscatedName("fm.z(IB)V")
	public void method2998(int arg0) {
	}
}

package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wc")
public class class623 {

	@ObfuscatedName("wc.e")
	public int field7671 = -1;

	@ObfuscatedName("wc.n")
	public int field7670 = -1;

	public class623(class442 arg0) {
		byte[] var2 = arg0.method6894(class628.field7711.field7708);
		this.method9831(new class997(var2));
	}

	@ObfuscatedName("wc.e(Lalw;I)V")
	public void method9831(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			switch(var2) {
				case 0:
					return;
				case 1:
					this.field7671 = arg0.method17927();
					this.field7670 = arg0.method17927();
					break;
				default:
					return;
			}
		}
	}
}

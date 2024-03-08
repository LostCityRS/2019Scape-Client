package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("nm")
public class class375 {

	@ObfuscatedName("nm.n")
	public int field3455 = -1;

	@ObfuscatedName("nm.m")
	public int field3451 = 64;

	@ObfuscatedName("nm.k")
	public int field3452 = 64;

	@ObfuscatedName("nm.f")
	public int field3453 = 2;

	@ObfuscatedName("nm.w")
	public int field3450 = 1;

	@ObfuscatedName("nm.l")
	public boolean field3449 = false;

	@ObfuscatedName("nm.u")
	public boolean field3456 = false;

	@ObfuscatedName("nm.e(Lalw;IB)V")
	public void method5954(class997 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method17904();
			if (var3 == 0) {
				return;
			}
			this.method5953(arg0, var3, arg1);
		}
	}

	@ObfuscatedName("nm.n(Lalw;IIB)V")
	public void method5953(class997 arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			this.field3455 = arg0.method17906();
			if (this.field3455 == 65535) {
				this.field3455 = -1;
			}
		} else if (arg1 == 2) {
			this.field3451 = arg0.method17906() + 1;
			this.field3452 = arg0.method17906() + 1;
		} else if (arg1 == 3) {
			arg0.method17905();
		} else if (arg1 == 4) {
			this.field3453 = arg0.method17904();
		} else if (arg1 == 5) {
			this.field3450 = arg0.method17904();
		} else if (arg1 == 6) {
			this.field3449 = true;
		} else if (arg1 == 7) {
			this.field3456 = true;
		}
	}
}

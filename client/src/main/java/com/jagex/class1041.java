package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("amd")
public class class1041 extends class709 {

	@ObfuscatedName("amd.w")
	public boolean field11772 = true;

	@ObfuscatedName("amd.l")
	public boolean field11771 = false;

	public class1041(class998 arg0) {
		super(arg0);
	}

	public class1041(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amd.o(I)V")
	public void method18549() {
		if (this.field8416 < 0 || this.field8416 > 5 || this.field8416 == 2) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amd.e(B)I")
	public int method14069() {
		this.field11771 = true;
		return this.field8417.method18165().method14084() ? 3 : 1;
	}

	@ObfuscatedName("amd.s(B)Z")
	public boolean method18547() {
		return true;
	}

	@ObfuscatedName("amd.n(II)I")
	public int method14070(int arg0) {
		return arg0 == 3 && !Statics.method5134().method7900("jagdx") ? 3 : 2;
	}

	@ObfuscatedName("amd.k(II)V")
	public void method14072(int arg0) {
		this.field11771 = false;
		this.field8416 = arg0;
	}

	@ObfuscatedName("amd.y(B)I")
	public int method18545() {
		return this.field8416;
	}

	@ObfuscatedName("amd.q(I)Z")
	public boolean method18546() {
		return this.field11772;
	}

	@ObfuscatedName("amd.x(ZB)V")
	public void method18544(boolean arg0) {
		this.field11772 = arg0;
	}
}

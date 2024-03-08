package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aml")
public class class1043 extends class709 {

	public class1043(class998 arg0) {
		super(arg0);
	}

	public class1043(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("aml.o(B)V")
	public void method18568() {
		if (this.field8417.method18165().method14090()) {
			this.field8416 = class254.field2658.field2664;
			return;
		}
		int var1 = this.field8417.method18165().method14082();
		if (var1 < 245) {
			this.field8416 = class254.field2663.field2664;
		}
		if (class254.field2662.field2664 == this.field8416 && var1 < 500) {
			this.field8416 = class254.field2660.field2664;
		}
		if (this.field8416 < class254.field2663.field2664 || this.field8416 > class254.field2661.field2664) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("aml.e(B)I")
	public int method14069() {
		return this.field8417.method18165().method14090() ? class254.field2658.field2664 : class254.field2663.field2664;
	}

	@ObfuscatedName("aml.s(I)Z")
	public boolean method18569() {
		if (this.field8417.method18165().method14090()) {
			return false;
		} else {
			int var1 = this.field8417.method18165().method14082();
			return var1 >= 245;
		}
	}

	@ObfuscatedName("aml.n(II)I")
	public int method14070(int arg0) {
		if (this.field8417.method18165().method14090()) {
			return 3;
		}
		int var2 = this.field8417.method18165().method14082();
		if (var2 < 245) {
			return 3;
		} else if (class254.field2662.field2664 == arg0 && var2 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("aml.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("aml.y(B)I")
	public int method18570() {
		return this.field8416;
	}
}

package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aho")
public class class907 extends class295 {

	@ObfuscatedName("aho.l")
	public class101 field10545;

	public class907(class442 arg0, class442 arg1, class913 arg2) {
		super(arg0, arg1, arg2);
	}

	@ObfuscatedName("aho.e(I)V")
	public void method5104() {
		super.method5104();
		this.field10545 = class278.method1589(this.field3028, ((class913) this.field3027).field10576);
	}

	@ObfuscatedName("aho.p(ZIII)V")
	public void method5122(boolean arg0, int arg1, int arg2) {
		int var4 = this.method5123() * this.field3027.field3163 / 10000;
		int[] var5 = new int[4];
		Statics.field8198.method2171(var5);
		Statics.field8198.method2168(arg1, arg2 + 2, arg1 + var4, this.field3027.field3160 + arg2);
		this.field10545.method1448(arg1, arg2 + 2, this.field3027.field3163, this.field3027.field3160);
		Statics.field8198.method2168(var5[0], var5[1], var5[2], var5[3]);
	}

	@ObfuscatedName("aho.z(ZIIS)V")
	public void method5121(boolean arg0, int arg1, int arg2) {
		Statics.field8198.method2179(arg1 - 2, arg2, this.field3027.field3163 + 4, this.field3027.field3160 + 2, ((class913) this.field3027).field10575, 0);
		Statics.field8198.method2179(arg1 - 1, arg2 + 1, this.field3027.field3163 + 2, this.field3027.field3160, 0, 0);
	}

	@ObfuscatedName("aho.m(I)Z")
	public boolean method5106() {
		return super.method5106() ? this.field3028.method6889(((class913) this.field3027).field10576) : false;
	}
}

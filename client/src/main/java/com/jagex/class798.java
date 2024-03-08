package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("adn")
public class class798 {

	@ObfuscatedName("adn.e")
	public class317[] field9212;

	@ObfuscatedName("adn.e(Lalw;I)V")
	public void method15230(class997 arg0) {
		this.field9212 = new class317[arg0.method17904()];
		class319[] var2 = class319.method4482();
		for (int var3 = 0; var3 < this.field9212.length; var3++) {
			this.field9212[var3] = this.method15231(arg0, var2[arg0.method17904()]);
		}
	}

	@ObfuscatedName("adn.n(Lalw;Lkt;I)Lkk;")
	public class317 method15231(class997 arg0, class319 arg1) {
		if (class319.field3190 == arg1) {
			return class312.method17440(arg0);
		} else if (class319.field3188 == arg1) {
			return class914.method13796(arg0);
		} else if (class319.field3191 == arg1) {
			return class313.method6241(arg0);
		} else if (class319.field3192 == arg1) {
			return class915.method16658(arg0);
		} else if (class319.field3194 == arg1) {
			return class322.method6073(arg0);
		} else if (class319.field3189 == arg1) {
			return class913.method5148(arg0);
		} else if (class319.field3193 == arg1) {
			return Statics.method10312(arg0);
		} else if (class319.field3187 == arg1) {
			return Statics.method2836(arg0);
		} else if (class319.field3195 == arg1) {
			return class320.method8975(arg0);
		} else if (class319.field3196 == arg1) {
			return class1137.method6845(arg0);
		} else if (class319.field3197 == arg1) {
			return class315.method15034(arg0);
		} else {
			return null;
		}
	}
}

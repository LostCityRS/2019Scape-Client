package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("adn")
public class LoadingScreenType {

	@ObfuscatedName("adn.e")
	public LoadingScreenElementConfig[] field9212;

	@ObfuscatedName("adn.e(Lalw;I)V")
	public void method15230(Packet arg0) {
		this.field9212 = new LoadingScreenElementConfig[arg0.g1()];
		class319[] var2 = class319.method4482();
		for (int var3 = 0; var3 < this.field9212.length; var3++) {
			this.field9212[var3] = this.method15231(arg0, var2[arg0.g1()]);
		}
	}

	@ObfuscatedName("adn.n(Lalw;Lkt;I)Lkk;")
	public LoadingScreenElementConfig method15231(Packet arg0, class319 arg1) {
		if (class319.field3190 == arg1) {
			return LoadingScreenClearConfig.method17440(arg0);
		} else if (class319.field3188 == arg1) {
			return class914.method13796(arg0);
		} else if (class319.field3191 == arg1) {
			return LoadingScreenNewsDisplayConfig.method6241(arg0);
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

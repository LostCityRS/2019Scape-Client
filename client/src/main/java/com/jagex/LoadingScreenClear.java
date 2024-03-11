package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ko")
public class LoadingScreenClear implements LoadingScreenElement {

	@ObfuscatedName("ko.e")
	public final LoadingScreenClearConfig field3048;

	public LoadingScreenClear(LoadingScreenClearConfig arg0) {
		this.field3048 = arg0;
	}

	@ObfuscatedName("ko.n(ZI)V")
	public void method5105(boolean arg0) {
		if (arg0) {
			Statics.field8198.method2354(0, 0, Statics.canvasWid, Statics.canvasHei, this.field3048.field3147, 0);
		}
	}

	@ObfuscatedName("ko.e(I)V")
	public void method5104() {
	}

	@ObfuscatedName("ko.m(I)Z")
	public boolean method5106() {
		return true;
	}
}

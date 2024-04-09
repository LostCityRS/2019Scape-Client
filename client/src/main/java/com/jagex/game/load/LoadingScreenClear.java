package com.jagex.game.load;

import com.jagex.game.client.GameShell;
import deob.ObfuscatedName;
import rs2.client.Client;

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
			Client.toolkit.fillRectangle(0, 0, GameShell.canvasWid, GameShell.canvasHei, this.field3048.field3147, 0);
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

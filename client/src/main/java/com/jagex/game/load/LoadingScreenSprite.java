package com.jagex.game.load;

import com.jagex.game.client.MainLoadingScreen;
import com.jagex.graphics.Sprite;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("jk")
public class LoadingScreenSprite implements LoadingScreenElement {

	@ObfuscatedName("jk.e")
	public final LoadingScreenSpriteConfig field3019;

	@ObfuscatedName("jk.n")
	public final Js5 field3020;

	@ObfuscatedName("jk.m")
	public Sprite field3021;

	public LoadingScreenSprite(Js5 arg0, LoadingScreenSpriteConfig arg1) {
		this.field3020 = arg0;
		this.field3019 = arg1;
	}

	@ObfuscatedName("jk.e(I)V")
	public void method5104() {
		this.field3021 = MainLoadingScreen.method1589(this.field3020, this.field3019.field3218);
	}

	@ObfuscatedName("jk.n(ZI)V")
	public void method5105(boolean arg0) {
		if (arg0) {
			int var2 = this.field3019.field3215.computeX(this.field3021.getX(), Client.frameWidth) + this.field3019.field3216;
			int var3 = this.field3019.field3214.computeY(this.field3021.getY(), Client.frameHeight) + this.field3019.field3217;
			this.field3021.drawSprite(var2, var3);
		}
	}

	@ObfuscatedName("jk.m(I)Z")
	public boolean method5106() {
		return this.field3020.loadFile(this.field3019.field3218);
	}
}

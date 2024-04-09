package com.jagex.game.load;

import com.jagex.game.client.MainLoadingScreen;
import com.jagex.graphics.Sprite;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ahb")
public class LoadingScreenRelated6 extends LoadingScreenProgressDisplay {

	@ObfuscatedName("ahb.l")
	public Sprite field10543;

	@ObfuscatedName("ahb.u")
	public Sprite field10540;

	@ObfuscatedName("ahb.z")
	public Sprite field10539;

	@ObfuscatedName("ahb.p")
	public Sprite field10542;

	@ObfuscatedName("ahb.d")
	public Sprite field10541;

	@ObfuscatedName("ahb.c")
	public Sprite field10544;

	public LoadingScreenRelated6(Js5 arg0, Js5 arg1, LoadingScreenRelated4 arg2) {
		super(arg0, arg1, arg2);
	}

	@ObfuscatedName("ahb.e(I)V")
	public void method5104() {
		super.method5104();
		LoadingScreenRelated4 var1 = (LoadingScreenRelated4) this.field3027;
		this.field10543 = MainLoadingScreen.method1589(this.field3028, var1.field10569);
		this.field10540 = MainLoadingScreen.method1589(this.field3028, var1.field10570);
		this.field10539 = MainLoadingScreen.method1589(this.field3028, var1.field10572);
		this.field10542 = MainLoadingScreen.method1589(this.field3028, var1.field10573);
		this.field10541 = MainLoadingScreen.method1589(this.field3028, var1.field10571);
		this.field10544 = MainLoadingScreen.method1589(this.field3028, var1.field10574);
	}

	@ObfuscatedName("ahb.z(ZIIS)V")
	public void method5121(boolean arg0, int arg1, int arg2) {
		if (!arg0) {
			return;
		}
		int[] var4 = new int[4];
		Client.toolkit.method2171(var4);
		Client.toolkit.resetBounds(arg1, arg2, this.field3027.field3163 + arg1, this.field3027.field3160 + arg2);
		int var5 = this.field10539.getX();
		int var6 = this.field10539.getY();
		int var7 = this.field10542.getX();
		int var8 = this.field10542.getY();
		this.field10539.drawSprite(arg1, (this.field3027.field3160 - var6) / 2 + arg2);
		this.field10542.drawSprite(this.field3027.field3163 + arg1 - var7, (this.field3027.field3160 - var8) / 2 + arg2);
		Client.toolkit.resetBounds(arg1, arg2, this.field3027.field3163 + arg1, arg2 + this.field10541.getY());
		this.field10541.drawTiled(arg1 + var5, arg2, this.field3027.field3163 - var5 - var7, this.field3027.field3160);
		int var9 = this.field10544.getY();
		Client.toolkit.resetBounds(arg1, this.field3027.field3160 + arg2 - var9, this.field3027.field3163 + arg1, this.field3027.field3160 + arg2);
		this.field10544.drawTiled(arg1 + var5, this.field3027.field3160 + arg2 - var9, this.field3027.field3163 - var5 - var7, this.field3027.field3160);
		Client.toolkit.resetBounds(var4[0], var4[1], var4[2], var4[3]);
	}

	@ObfuscatedName("ahb.p(ZIII)V")
	public void method5122(boolean arg0, int arg1, int arg2) {
		int var4 = arg1 + this.field10539.getX();
		int var5 = this.field3027.field3163 + arg1 - this.field10542.getX();
		int var6 = arg2 + this.field10541.getY();
		int var7 = this.field3027.field3160 + arg2 - this.field10544.getY();
		int var8 = var5 - var4;
		int var9 = var7 - var6;
		int var10 = this.method5123() * var8 / 10000;
		int[] var11 = new int[4];
		Client.toolkit.method2171(var11);
		Client.toolkit.resetBounds(var4, var6, var4 + var10, var7);
		this.method16662(var4, var6, var8, var9);
		Client.toolkit.resetBounds(var4 + var10, var6, var5, var7);
		this.field10540.drawTiled(var4, var6, var8, var9);
		Client.toolkit.resetBounds(var11[0], var11[1], var11[2], var11[3]);
	}

	@ObfuscatedName("ahb.s(IIIII)V")
	public void method16662(int arg0, int arg1, int arg2, int arg3) {
		this.field10543.drawTiled(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ahb.m(I)Z")
	public boolean method5106() {
		if (!super.method5106()) {
			return false;
		}
		LoadingScreenRelated4 var1 = (LoadingScreenRelated4) this.field3027;
		if (!this.field3028.loadFile(var1.field10569)) {
			return false;
		} else if (!this.field3028.loadFile(var1.field10570)) {
			return false;
		} else if (!this.field3028.loadFile(var1.field10572)) {
			return false;
		} else if (!this.field3028.loadFile(var1.field10573)) {
			return false;
		} else if (this.field3028.loadFile(var1.field10571)) {
			return this.field3028.loadFile(var1.field10574);
		} else {
			return false;
		}
	}
}

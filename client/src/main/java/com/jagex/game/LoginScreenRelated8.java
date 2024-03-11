package com.jagex.game;

import com.jagex.client;
import com.jagex.game.loading.LoadingScreenSprite;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aha")
public class LoginScreenRelated8 extends LoadingScreenSprite {

	@ObfuscatedName("aha.k")
	public int field10537 = 0;

	public LoginScreenRelated8(Js5 arg0, LoginScreenRelated3 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("aha.n(ZI)V")
	public void method5105(boolean arg0) {
		int var2 = this.field3019.field3215.method5382(this.field3021.method1434(), client.field10941) + this.field3019.field3216;
		int var3 = this.field3019.field3214.method5375(this.field3021.method1436(), client.field10942) + this.field3019.field3217;
		this.field3021.method1451((float) (var2 + this.field3021.method1434() / 2), (float) (var3 + this.field3021.method1436() / 2), 4096, this.field10537);
		this.field10537 += ((LoginScreenRelated3) this.field3019).field10582;
	}
}

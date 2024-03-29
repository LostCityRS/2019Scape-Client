package rs2.client.login;

import com.jagex.game.load.Loading;
import com.jagex.game.load.LoadingScreenRelated4_Sub1;
import com.jagex.game.load.LoadingScreenRelated6;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aqp")
public class LoginRelated9 extends LoadingScreenRelated6 {

	public LoginRelated9(Js5 arg0, Js5 arg1, LoadingScreenRelated4_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@ObfuscatedName("aqp.s(IIIII)V")
	public void method16662(int arg0, int arg1, int arg2, int arg3) {
		int var5 = this.field10543.getX();
		int var6 = ((LoadingScreenRelated4_Sub1) this.field3027).field12100 * Loading.method3583() / 10 % var5;
		this.field10543.drawTiled(arg0 - var5 + var6, arg1, arg2 + var5 - var6, arg3);
	}
}

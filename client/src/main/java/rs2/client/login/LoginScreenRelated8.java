package rs2.client.login;

import com.jagex.game.load.LoadingScreenSprite;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("aha")
public class LoginScreenRelated8 extends LoadingScreenSprite {

	@ObfuscatedName("aha.k")
	public int field10537 = 0;

	public LoginScreenRelated8(Js5 arg0, LoginScreenRelated3 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("aha.n(ZI)V")
	public void method5105(boolean arg0) {
		int var2 = this.field3019.field3215.computeX(this.field3021.getX(), Client.frameWidth) + this.field3019.field3216;
		int var3 = this.field3019.field3214.computeY(this.field3021.getY(), Client.frameHeight) + this.field3019.field3217;
		this.field3021.method1451((float) (var2 + this.field3021.getX() / 2), (float) (var3 + this.field3021.getY() / 2), 4096, this.field10537);
		this.field10537 += ((LoginScreenRelated3) this.field3019).field10582;
	}
}

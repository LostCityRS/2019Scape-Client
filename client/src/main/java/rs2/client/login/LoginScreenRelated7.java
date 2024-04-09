package rs2.client.login;

import com.jagex.game.load.LoadingScreenProgressDisplay;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ahx")
public class LoginScreenRelated7 extends LoadingScreenProgressDisplay {

	public LoginScreenRelated7(Js5 arg0, Js5 arg1, LoginScreenRelated2 arg2) {
		super(arg0, arg1, arg2);
	}

	@ObfuscatedName("ahx.p(ZIII)V")
	public void method5122(boolean arg0, int arg1, int arg2) {
		int var4 = this.method5123() * this.field3027.field3163 / 10000;
		Client.toolkit.fillRectangle(arg1, arg2 + 2, var4, this.field3027.field3160 - 2, ((LoginScreenRelated2) this.field3027).field10580, 0);
		Client.toolkit.fillRectangle(arg1 + var4, arg2 + 2, this.field3027.field3163 - var4, this.field3027.field3160 - 2, 0, 0);
	}

	@ObfuscatedName("ahx.z(ZIIS)V")
	public void method5121(boolean arg0, int arg1, int arg2) {
		Client.toolkit.drawRectangle(arg1 - 2, arg2, this.field3027.field3163 + 4, this.field3027.field3160 + 2, ((LoginScreenRelated2) this.field3027).field10579, 0);
		Client.toolkit.drawRectangle(arg1 - 1, arg2 + 1, this.field3027.field3163 + 2, this.field3027.field3160, 0, 0);
	}
}

package rs2.client.login;

import com.jagex.game.client.GameShell;
import com.jagex.game.client.MainLoadingScreen;
import com.jagex.game.load.LoadingScreenElement;
import com.jagex.graphics.Sprite;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ku")
public class LoginRelated2 implements LoadingScreenElement {

	@ObfuscatedName("ku.e")
	public final LoginRelated5 field3047;

	@ObfuscatedName("ku.n")
	public final Js5 field3045;

	@ObfuscatedName("ku.m")
	public Sprite field3046;

	public LoginRelated2(Js5 arg0, LoginRelated5 arg1) {
		this.field3045 = arg0;
		this.field3047 = arg1;
	}

	@ObfuscatedName("ku.e(I)V")
	public void method5104() {
		this.field3046 = MainLoadingScreen.method1589(this.field3045, this.field3047.field3200);
	}

	@ObfuscatedName("ku.n(ZI)V")
	public void method5105(boolean arg0) {
		if (!arg0) {
			return;
		}
		int var2 = GameShell.canvasWid > Client.frameWidth ? GameShell.canvasWid : Client.frameWidth;
		int var3 = GameShell.canvasHei > Client.frameHeight ? GameShell.canvasHei : Client.frameHeight;
		int var4 = this.field3046.getX();
		int var5 = this.field3046.getY();
		int var6 = 0;
		int var7 = var2;
		int var8 = var2 * var5 / var4;
		int var9 = (var3 - var8) / 2;
		if (var8 > var3) {
			var9 = 0;
			var8 = var3;
			var7 = var3 * var4 / var5;
			var6 = (var2 - var7) / 2;
		}
		this.field3046.drawTintedScaled(var6, var9, var7, var8);
	}

	@ObfuscatedName("ku.m(I)Z")
	public boolean method5106() {
		return this.field3045.loadFile(this.field3047.field3200);
	}
}

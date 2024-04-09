package rs2.client.login;

import com.jagex.game.load.LoadingScreenElement;
import com.jagex.graphics.Font;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ki")
public class LoginRelated3 implements LoadingScreenElement {

	@ObfuscatedName("ki.e")
	public final LoginRelated6 field3054;

	@ObfuscatedName("ki.n")
	public final Js5 field3053;

	@ObfuscatedName("ki.m")
	public final Js5 field3052;

	@ObfuscatedName("ki.k")
	public Font field3055;

	public LoginRelated3(Js5 arg0, Js5 arg1, LoginRelated6 arg2) {
		this.field3054 = arg2;
		this.field3053 = arg0;
		this.field3052 = arg1;
	}

	@ObfuscatedName("ki.e(I)V")
	public void method5104() {
		FontMetrics var1 = FontMetrics.createFontMetrics(this.field3052, this.field3054.field3211, Client.fontProvider);
		this.field3055 = Client.toolkit.createFont(var1, SpriteDataProvider.get(this.field3053, this.field3054.field3211), true);
	}

	@ObfuscatedName("ki.n(ZI)V")
	public void method5105(boolean arg0) {
		if (arg0) {
			int var2 = this.field3054.field3201.computeX(this.field3054.field3209, Client.frameWidth) + this.field3054.field3204;
			int var3 = this.field3054.field3208.computeY(this.field3054.field3206, Client.frameHeight) + this.field3054.field3205;
			this.field3055.drawStringTaggable(this.field3054.field3203, var2, var3, this.field3054.field3209, this.field3054.field3206, this.field3054.field3212, this.field3054.field3213, this.field3054.field3210, this.field3054.field3207, this.field3054.field3202, null, null, null, 0, 0);
		}
	}

	@ObfuscatedName("ki.m(I)Z")
	public boolean method5106() {
		boolean var1 = true;
		if (!this.field3053.loadFile(this.field3054.field3211)) {
			var1 = false;
		}
		if (!this.field3052.loadFile(this.field3054.field3211)) {
			var1 = false;
		}
		return var1;
	}
}

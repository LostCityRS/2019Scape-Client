package rs2.client.login;

import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.load.Loading;
import com.jagex.game.load.LoadingScreenElement;
import com.jagex.graphics.Font;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("kg")
public class LoginRelated1 implements LoadingScreenElement {

	@ObfuscatedName("kg.e")
	public final LoginRelated4 field3039;

	@ObfuscatedName("kg.n")
	public final Js5 field3042;

	@ObfuscatedName("kg.m")
	public final Js5 field3043;

	@ObfuscatedName("kg.k")
	public Font field3041;

	@ObfuscatedName("kg.f")
	public long field3040 = -1L;

	@ObfuscatedName("kg.w")
	public int field3038;

	public LoginRelated1(Js5 arg0, Js5 arg1, LoginRelated4 arg2) {
		this.field3042 = arg0;
		this.field3043 = arg1;
		this.field3039 = arg2;
	}

	@ObfuscatedName("kg.n(ZI)V")
	public void method5105(boolean arg0) {
		int var2 = this.field3039.field3177.computeX(0, Client.frameWidth) + this.field3039.field3174;
		int var3 = this.field3039.field3172.computeY(0, Client.frameHeight) + this.field3039.field3171;
		String var4;
		switch(this.field3039.field3168) {
			case 0:
				var4 = Loading.field593.method4853();
				break;
			case 1:
				var4 = "" + Loading.field593.method4851() + "%";
				break;
			case 2:
				var4 = Loading.field593.method4852();
				break;
			default:
				var4 = "";
		}
		int var5 = Loading.field593.method4851();
		if (this.field3040 < 0L || var5 == 0 || this.field3038 != var5) {
			this.field3040 = MonotonicTime.get();
			this.field3038 = var5;
		}
		if (this.field3039.field3168 != 1 && MonotonicTime.get() - this.field3040 > 10000L) {
			var4 = var4 + " (" + Loading.field593.method4855().field2920 + ")";
		}
		this.field3041.drawStringCenter(var4, var2, var3, this.field3039.field3176, -1);
	}

	@ObfuscatedName("kg.m(I)Z")
	public boolean method5106() {
		boolean var1 = true;
		if (!this.field3042.loadFile(this.field3039.field3175)) {
			var1 = false;
		}
		if (!this.field3043.loadFile(this.field3039.field3175)) {
			var1 = false;
		}
		return var1;
	}

	@ObfuscatedName("kg.e(I)V")
	public void method5104() {
		FontMetrics var1 = FontMetrics.createFontMetrics(this.field3043, this.field3039.field3175, Client.fontProvider);
		this.field3041 = Client.toolkit.createFont(var1, SpriteDataProvider.get(this.field3042, this.field3039.field3175), true);
	}
}

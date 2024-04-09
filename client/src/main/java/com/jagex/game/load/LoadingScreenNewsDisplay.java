package com.jagex.game.load;

import com.jagex.graphics.DefaultSprites;
import com.jagex.graphics.Font;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("kw")
public class LoadingScreenNewsDisplay implements LoadingScreenElement {

	@ObfuscatedName("kw.e")
	public final LoadingScreenNewsDisplayConfig field3025;

	@ObfuscatedName("kw.n")
	public final LoadingScreenNewsManager field3024;

	public LoadingScreenNewsDisplay(LoadingScreenNewsManager arg0, LoadingScreenNewsDisplayConfig arg1) {
		this.field3025 = arg1;
		this.field3024 = arg0;
	}

	@ObfuscatedName("kw.m(I)Z")
	public boolean method5106() {
		return this.field3024.method5164();
	}

	@ObfuscatedName("kw.e(I)V")
	public void method5104() {
	}

	@ObfuscatedName("kw.n(ZI)V")
	public void method5105(boolean arg0) {
		LoadingScreenNewsEntry var2 = this.field3024.method5160(this.field3025.field3157);
		if (var2 == null) {
			return;
		}
		int var3 = this.field3025.field3155.computeX(this.field3025.field3154, Client.frameWidth) + this.field3025.field3150;
		int var4 = this.field3025.field3149.computeY(this.field3025.field3156, Client.frameHeight) + this.field3025.field3151;
		if (this.field3025.field3158) {
			Client.toolkit.drawRectangle(var3, var4, this.field3025.field3154, this.field3025.field3156, this.field3025.field3148, 0);
		}
		int var5 = var4 + this.method5117(DefaultSprites.b12FullFont, var2.field3032, var3, var4, 5) * 12;
		int var8 = var5 + 8;
		if (this.field3025.field3158) {
			Client.toolkit.drawLine(var3, var8, this.field3025.field3154 + var3 - 1, var8, this.field3025.field3148, 0);
		}
		var5 = var8 + 1;
		int var6 = var5 + this.method5117(DefaultSprites.b12FullFont, var2.field3033, var3, var5, 5) * 12;
		int var9 = var6 + 5;
		int var10000 = var9 + this.method5117(DefaultSprites.b12FullFont, var2.field3034, var3, var9, 5) * 12;
	}

	@ObfuscatedName("kw.z(Leu;Ljava/lang/String;IIII)I")
	public int method5117(Font arg0, String arg1, int arg2, int arg3, int arg4) {
		return arg0.drawStringTaggable(arg1, arg2 + arg4, arg3 + arg4, this.field3025.field3154 - arg4 * 2, this.field3025.field3156 - arg4 * 2, this.field3025.field3152, this.field3025.field3153, 0, 0, 0, null, null, null, 0, 0);
	}
}

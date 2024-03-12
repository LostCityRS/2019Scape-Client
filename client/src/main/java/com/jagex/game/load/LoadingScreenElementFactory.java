package com.jagex.game.load;

import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.login.*;

@ObfuscatedName("kq")
public class LoadingScreenElementFactory {

	@ObfuscatedName("kq.e")
	public final Js5 field3035;

	@ObfuscatedName("kq.n")
	public final Js5 field3036;

	@ObfuscatedName("kq.m")
	public LoadingScreenNewsManager field3037;

	public LoadingScreenElementFactory(Js5 arg0, Js5 arg1) {
		this.field3035 = arg0;
		this.field3036 = arg1;
	}

	@ObfuscatedName("kq.e(Lkk;I)Lkx;")
	public LoadingScreenElement method5137(LoadingScreenElementConfig arg0) {
		if (arg0 == null) {
			return null;
		}
		LoadingScreenElementType var2 = arg0.method5349();
		if (LoadingScreenElementType.field3190 == var2) {
			return new LoadingScreenClear((LoadingScreenClearConfig) arg0);
		} else if (LoadingScreenElementType.field3191 == var2) {
			return new LoadingScreenNewsDisplay(this.method5138(), (LoadingScreenNewsDisplayConfig) arg0);
		} else if (LoadingScreenElementType.field3194 == var2) {
			return new LoadingScreenSprite(this.field3035, (LoadingScreenSpriteConfig) arg0);
		} else if (LoadingScreenElementType.field3192 == var2) {
			return new LoginScreenRelated8(this.field3035, (LoginScreenRelated3) arg0);
		} else if (LoadingScreenElementType.field3188 == var2) {
			return new LoginScreenRelated7(this.field3035, this.field3036, (LoginScreenRelated2) arg0);
		} else if (LoadingScreenElementType.field3189 == var2) {
			return new LoadingScreenRelated5(this.field3035, this.field3036, (LoadingScreenRelated1) arg0);
		} else if (LoadingScreenElementType.field3193 == var2) {
			return new LoadingScreenRelated6(this.field3035, this.field3036, (LoadingScreenRelated4) arg0);
		} else if (LoadingScreenElementType.field3187 == var2) {
			return new LoginRelated3(this.field3035, this.field3036, (LoginRelated6) arg0);
		} else if (LoadingScreenElementType.field3195 == var2) {
			return new LoginRelated2(this.field3035, (LoginRelated5) arg0);
		} else if (LoadingScreenElementType.field3196 == var2) {
			return new LoginRelated9(this.field3035, this.field3036, (LoadingScreenRelated4_Sub1) arg0);
		} else if (LoadingScreenElementType.field3197 == var2) {
			return new LoginRelated1(this.field3035, this.field3036, (LoginRelated4) arg0);
		} else {
			return null;
		}
	}

	@ObfuscatedName("kq.n(I)Lkf;")
	public LoadingScreenNewsManager method5138() {
		if (this.field3037 == null) {
			this.field3037 = new LoadingScreenNewsManager();
		}
		return this.field3037;
	}
}

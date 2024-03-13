package com.jagex.game.load;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.login.*;

@ObfuscatedName("adn")
public class LoadingScreenType {

	@ObfuscatedName("adn.e")
	public LoadingScreenElementConfig[] field9212;

	@ObfuscatedName("adn.e(Lalw;I)V")
	public void method15230(Packet arg0) {
		this.field9212 = new LoadingScreenElementConfig[arg0.g1()];
		LoadingScreenElementType[] var2 = LoadingScreenElementType.method4482();
		for (int var3 = 0; var3 < this.field9212.length; var3++) {
			this.field9212[var3] = this.method15231(arg0, var2[arg0.g1()]);
		}
	}

	@ObfuscatedName("adn.n(Lalw;Lkt;I)Lkk;")
	public LoadingScreenElementConfig method15231(Packet arg0, LoadingScreenElementType arg1) {
		if (LoadingScreenElementType.field3190 == arg1) {
			return LoadingScreenClearConfig.method17440(arg0);
		} else if (LoadingScreenElementType.field3188 == arg1) {
			return LoginScreenRelated2.method13796(arg0);
		} else if (LoadingScreenElementType.field3191 == arg1) {
			return LoadingScreenNewsDisplayConfig.method6241(arg0);
		} else if (LoadingScreenElementType.field3192 == arg1) {
			return LoginScreenRelated3.method16658(arg0);
		} else if (LoadingScreenElementType.field3194 == arg1) {
			return LoadingScreenSpriteConfig.method6073(arg0);
		} else if (LoadingScreenElementType.field3189 == arg1) {
			return LoadingScreenRelated1.method5148(arg0);
		} else if (LoadingScreenElementType.field3193 == arg1) {
			return LoadingScreenProgressDisplayConfig.method10312(arg0);
		} else if (LoadingScreenElementType.field3187 == arg1) {
			return LoginRelated6.method2836(arg0);
		} else if (LoadingScreenElementType.field3195 == arg1) {
			return LoginRelated5.method8975(arg0);
		} else if (LoadingScreenElementType.field3196 == arg1) {
			return LoadingScreenRelated4_Sub1.method6845(arg0);
		} else if (LoadingScreenElementType.field3197 == arg1) {
			return LoginRelated4.method15034(arg0);
		} else {
			return null;
		}
	}
}

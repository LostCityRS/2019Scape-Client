package com.jagex.game.load;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("kj")
public class LoadingScreenClearConfig implements LoadingScreenElementConfig {

	@ObfuscatedName("kj.e")
	public final int field3147;

	public LoadingScreenClearConfig(int arg0) {
		this.field3147 = arg0;
	}

	@ObfuscatedName("ajb.e(Lalw;I)Lkj;")
	public static LoadingScreenClearConfig method17440(Packet arg0) {
		int var1 = arg0.g4s();
		return new LoadingScreenClearConfig(var1);
	}

	@ObfuscatedName("kj.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3190;
	}
}

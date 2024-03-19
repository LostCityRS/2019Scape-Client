package com.jagex.game.client;

import com.jagex.game.config.seqtype.SeqType;
import com.jagex.graphics.AnimationWrapper;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("aou")
public class InterfaceAnimationWrapper extends AnimationWrapper {

	public InterfaceAnimationWrapper() {
		super(true);
	}

	@ObfuscatedName("aou.ag(Lfg;II)V")
	public void method14407(SeqType arg0, int arg1) {
		Client.audioApi.method3181(arg0, arg1);
	}
}

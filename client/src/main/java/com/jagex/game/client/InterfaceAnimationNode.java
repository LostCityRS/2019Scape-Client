package com.jagex.game.client;

import com.jagex.game.config.seqtype.SeqType;
import com.jagex.graphics.AnimationNode;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("aou")
public class InterfaceAnimationNode extends AnimationNode {

	public InterfaceAnimationNode() {
		super(true);
	}

	@ObfuscatedName("aou.ag(Lfg;II)V")
	public void method14407(SeqType arg0, int arg1) {
		Client.audioApi.playSequenceSound(arg0, arg1);
	}
}

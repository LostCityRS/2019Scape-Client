package com.jagex.game.world.entity;

import com.jagex.game.config.seqtype.SeqType;
import com.jagex.graphics.AnimationNode;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.entities.PathingEntity;

@ObfuscatedName("aoy")
public class EntityWalkAnimationNode extends AnimationNode {

	@ObfuscatedName("aoy.q")
	public boolean field11877 = false;

	@ObfuscatedName("aoy.x")
	public PathingEntity field11876;

	public EntityWalkAnimationNode(PathingEntity arg0, boolean arg1) {
		super(arg1);
		this.field11876 = arg0;
	}

	@ObfuscatedName("aoy.ag(Lfg;II)V")
	public void method14407(SeqType arg0, int arg1) {
		if (!this.field11877 || !this.field11876.field10454.hasSeqType() || this.field11876.field10454.method14355()) {
			Client.audioApi.playSequenceSound(arg0, arg1, this.field11876);
		}
	}
}

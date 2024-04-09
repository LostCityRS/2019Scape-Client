package com.jagex.game.world.entity;

import com.jagex.game.config.seqtype.SeqType;
import com.jagex.graphics.AnimationNode;
import com.jagex.graphics.scenegraph.GraphEntity;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("aoi")
public class EntityAnimationNode extends AnimationNode {

	@ObfuscatedName("aoi.q")
	public GraphEntity field11878;

	public EntityAnimationNode(GraphEntity arg0, boolean arg1) {
		super(arg1);
		this.field11878 = arg0;
	}

	@ObfuscatedName("aoi.ag(Lfg;II)V")
	public void method14407(SeqType arg0, int arg1) {
		Client.audioApi.playSequenceSound(arg0, arg1, this.field11878);
	}
}

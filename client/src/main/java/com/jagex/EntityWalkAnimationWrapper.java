package com.jagex;

import com.jagex.game.config.seqtype.SeqType;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aoy")
public class EntityWalkAnimationWrapper extends AnimationWrapper {

	@ObfuscatedName("aoy.q")
	public boolean field11877 = false;

	@ObfuscatedName("aoy.x")
	public PathingEntity field11876;

	public EntityWalkAnimationWrapper(PathingEntity arg0, boolean arg1) {
		super(arg1);
		this.field11876 = arg0;
	}

	@ObfuscatedName("aoy.ag(Lfg;II)V")
	public void method14407(SeqType arg0, int arg1) {
		if (!this.field11877 || !this.field11876.field10454.method14346() || this.field11876.field10454.method14355()) {
			Statics.field1798.method3180(arg0, arg1, this.field11876);
		}
	}
}

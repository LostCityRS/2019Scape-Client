package com.jagex;

import com.jagex.game.config.seqtype.SeqType;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aoi")
public class EntityAnimationWrapper extends AnimationWrapper {

	@ObfuscatedName("aoi.q")
	public GraphEntity field11878;

	public EntityAnimationWrapper(GraphEntity arg0, boolean arg1) {
		super(arg1);
		this.field11878 = arg0;
	}

	@ObfuscatedName("aoi.ag(Lfg;II)V")
	public void method14407(SeqType arg0, int arg1) {
		Statics.field1798.method3180(arg0, arg1, this.field11878);
	}
}

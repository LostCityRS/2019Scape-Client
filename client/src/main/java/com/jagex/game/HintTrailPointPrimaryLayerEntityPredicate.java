package com.jagex.game;

import com.jagex.game.HintTrailPoint;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.game.world.entity.PrimaryLayerEntityPredicate;
import deob.ObfuscatedName;

@ObfuscatedName("tr")
public class HintTrailPointPrimaryLayerEntityPredicate implements PrimaryLayerEntityPredicate {

	@ObfuscatedName("tr.e")
	public final HintTrailPoint field6757;

	public HintTrailPointPrimaryLayerEntityPredicate(HintTrailPoint arg0) {
		this.field6757 = arg0;
	}

	@ObfuscatedName("tr.e(Lash;I)Z")
	public boolean method478(PrimaryLayerEntity arg0) {
		return this.field6757 == arg0;
	}
}

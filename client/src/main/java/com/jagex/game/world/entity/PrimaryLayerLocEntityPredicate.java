package com.jagex.game.world.entity;

import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import deob.ObfuscatedName;

@ObfuscatedName("s")
public final class PrimaryLayerLocEntityPredicate implements PrimaryLayerEntityPredicate {

	@ObfuscatedName("s.e(Lash;I)Z")
	public boolean method478(PrimaryLayerEntity arg0) {
		return arg0 instanceof Location && ((Location) arg0).method8207();
	}
}

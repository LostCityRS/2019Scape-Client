package com.jagex.game.world.entity;

import com.jagex.graphics.AnimationNode;
import deob.ObfuscatedName;
import rs2.client.scene.entities.PathingEntity;

@ObfuscatedName("sl")
public class EntitySpotAnim {

	@ObfuscatedName("sl.e")
	public final AnimationNode field6659;

	@ObfuscatedName("sl.n")
	public int field6657 = -1;

	@ObfuscatedName("sl.m")
	public int field6661;

	@ObfuscatedName("sl.k")
	public int field6660;

	@ObfuscatedName("sl.f")
	public int field6658;

	public EntitySpotAnim(PathingEntity arg0) {
		this.field6659 = new EntityAnimationNode(arg0, false);
	}
}

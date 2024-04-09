package com.jagex.game.world.entity;

import com.jagex.core.datastruct.SecondaryNode;
import deob.ObfuscatedName;
import rs2.client.scene.entities.ProjectileAnimation;

@ObfuscatedName("ark")
public class ProjectileEntityNode extends SecondaryNode {

	@ObfuscatedName("ark.l")
	public ProjectileAnimation field12309;

	public ProjectileEntityNode(ProjectileAnimation arg0) {
		this.field12309 = arg0;
	}
}

package com.jagex.graphics.scenegraph;

import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Light;
import com.jagex.graphics.Toolkit;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("asv")
public abstract class GroundDecorLayerEntity extends GraphEntity {

	@ObfuscatedName("asv.x")
	public short field12448;

	@ObfuscatedName("asv.b")
	public int field12449 = 0;

	@ObfuscatedName("asv.h")
	public Light[] field12447 = new Light[4];

	public GroundDecorLayerEntity(Scene scene, int x, int y, int z, int level, int occludeLevel, int arg6, ScaleRotTrans scaleRotTrans) {
		super(scene, scaleRotTrans);
		this.level = (byte) level;
		this.occludeLevel = (byte) occludeLevel;
		this.field12448 = (short) arg6;
		if (scaleRotTrans != null) {
			this.method10529(scaleRotTrans);
		}
		this.method10532((float) x, (float) y, (float) z);
		for (int var9 = 0; var9 < 4; var9++) {
			this.field12447[var9] = null;
		}
	}

	@ObfuscatedName("asv.gy([Lakf;S)I")
	public int method18375(Light[] arg0) {
		if (this.field8176) {
			Vector3 var2 = this.getTransform().trans;
			this.field12449 = this.method18362((int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size, this.field12447);
			this.field8176 = false;
		}
		for (int var3 = 0; var3 < this.field12449; var3++) {
			arg0[var3] = this.field12447[var3];
		}
		return this.field12449;
	}

	@ObfuscatedName("asv.ga(Ldh;S)Z")
	public boolean isOccluded(Toolkit toolkit) {
		Vector3 var2 = this.getTransform().trans;
		return this.scene.occlusionManager.tileVisible(this.occludeLevel, (int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size);
	}

	@ObfuscatedName("asv.gn(I)Z")
	public boolean isVisible() {
		Vector3 var1 = this.getTransform().trans;
		return this.scene.visibilityMap[this.scene.drawDistance + (((int) var1.x >> this.scene.size) - this.scene.eyeTileX)][this.scene.drawDistance + (((int) var1.z >> this.scene.size) - this.scene.eyeTileZ)];
	}
}

package com.jagex.graphics.scenegraph;

import com.jagex.game.world.entity.PrimaryLayerEntityList;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Light;
import com.jagex.graphics.Toolkit;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("ast")
public abstract class ObjLayerEntity extends GraphEntity {

	public ObjLayerEntity(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(arg0);
		this.level = (byte) arg4;
		this.occludeLevel = (byte) arg5;
		this.method10531(new Vector3((float) arg1, (float) arg2, (float) arg3));
	}

	@ObfuscatedName("ast.gy([Lakf;S)I")
	public int method18375(Light[] arg0) {
		Vector3 var2 = this.getTransform().trans;
		return this.method18362((int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size, arg0);
	}

	@ObfuscatedName("ast.ga(Ldh;S)Z")
	public boolean isOccluded(Toolkit arg0) {
		Vector3 var2 = this.getTransform().trans;
		PrimaryLayerEntityList var3 = this.scene.getEntities(this.occludeLevel, (int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size);
		return var3 != null && var3.field7057.raised ? this.scene.occlusionManager.visible(this.occludeLevel, (int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size, var3.field7057.overlayHeight() + this.overlayHeight()) : this.scene.occlusionManager.tileVisible(this.occludeLevel, (int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size);
	}

	@ObfuscatedName("ast.gn(I)Z")
	public boolean isVisible() {
		Vector3 var1 = this.getTransform().trans;
		return this.scene.visibilityMap[this.scene.drawDistance + (((int) var1.x >> this.scene.size) - this.scene.eyeTileX)][this.scene.drawDistance + (((int) var1.z >> this.scene.size) - this.scene.eyeTileZ)];
	}

	@ObfuscatedName("ast.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("ast.fq(Ldh;Lalh;IIIZB)V")
	public final void mergeNormals(Toolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ast.ff(B)V")
	public final void applyLighting() {
		throw new IllegalStateException();
	}
}

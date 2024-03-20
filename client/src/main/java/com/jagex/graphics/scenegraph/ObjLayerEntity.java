package com.jagex.graphics.scenegraph;

import com.jagex.game.world.entity.PrimaryLayerEntityList;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Light;
import com.jagex.graphics.Renderer;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("ast")
public abstract class ObjLayerEntity extends GraphEntity {

	public ObjLayerEntity(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(arg0);
		this.level = (byte) arg4;
		this.field11714 = (byte) arg5;
		this.method10531(new Vector3((float) arg1, (float) arg2, (float) arg3));
	}

	@ObfuscatedName("ast.gy([Lakf;S)I")
	public int method18375(Light[] arg0) {
		Vector3 var2 = this.getTransform().trans;
		return this.method18362((int) var2.x >> this.field11716.field6900, (int) var2.z >> this.field11716.field6900, arg0);
	}

	@ObfuscatedName("ast.ga(Ldh;S)Z")
	public boolean method18360(Renderer arg0) {
		Vector3 var2 = this.getTransform().trans;
		PrimaryLayerEntityList var3 = this.field11716.getEntities(this.field11714, (int) var2.x >> this.field11716.field6900, (int) var2.z >> this.field11716.field6900);
		return var3 != null && var3.field7057.field12470 ? this.field11716.field6930.method8950(this.field11714, (int) var2.x >> this.field11716.field6900, (int) var2.z >> this.field11716.field6900, var3.field7057.overlayHeight() + this.overlayHeight()) : this.field11716.field6930.method8927(this.field11714, (int) var2.x >> this.field11716.field6900, (int) var2.z >> this.field11716.field6900);
	}

	@ObfuscatedName("ast.gn(I)Z")
	public boolean method18361() {
		Vector3 var1 = this.getTransform().trans;
		return this.field11716.field6962[this.field11716.field6942 + (((int) var1.x >> this.field11716.field6900) - this.field11716.field6902)][this.field11716.field6942 + (((int) var1.z >> this.field11716.field6900) - this.field11716.field6947)];
	}

	@ObfuscatedName("ast.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("ast.fq(Ldh;Lalh;IIIZB)V")
	public final void mergeNormals(Renderer arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ast.ff(B)V")
	public final void applyLighting() {
		throw new IllegalStateException();
	}
}

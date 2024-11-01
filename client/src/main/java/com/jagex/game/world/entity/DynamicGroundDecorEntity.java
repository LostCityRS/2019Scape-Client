package com.jagex.game.world.entity;

import com.jagex.game.client.ScreenBoundingBox;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.GroundDecorLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("ajs")
public class DynamicGroundDecorEntity extends GroundDecorLayerEntity implements Location {

	@ObfuscatedName("ajs.c")
	public DynamicLoc loc;

	@ObfuscatedName("ajs.r")
	public boolean active;

	@ObfuscatedName("ajs.v")
	public EntityBounds field11134;

	@ObfuscatedName("ajs.o")
	public boolean field11135 = true;

	public DynamicGroundDecorEntity(Scene arg0, Toolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, ScaleRotTrans arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.field7448, arg13);
		this.loc = new DynamicLoc(arg1, arg2, arg3, LocShape.GROUND_DECOR.id, arg10, arg5, this, arg9, arg11, arg12);
		this.active = arg3.active != 0 && !arg9;
		this.createEntityBounds(1);
	}

	@ObfuscatedName("ajs.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("ajs.bw(S)Z")
	public boolean method16489() {
		return this.field11135;
	}

	@ObfuscatedName("ajs.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit arg0) {
		return this.field11134;
	}

	@ObfuscatedName("ajs.by(B)I")
	public int overlayHeight() {
		return this.loc.overlayHeight();
	}

	@ObfuscatedName("ajs.bo(I)I")
	public int height() {
		return this.loc.height();
	}

	@ObfuscatedName("ajs.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit arg0) {
		Model var2 = this.loc.getModel(arg0, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.getTransform();
		PickableEntity var5 = PickableEntity.getPickableEntity(this.active);
		int var6 = (int) var4.trans.x >> 9;
		int var7 = (int) var4.trans.z >> 9;
		this.loc.method8239(arg0, var2, var3, var6, var6, var7, var7, true);
		LocType var8 = this.loc.getLocType();
		if (var8.clickbox == null) {
			var2.draw(var3, this.entityBounds[0], 0);
		} else {
			var2.draw(var3, null, 0);
			arg0.method2193(var3, this.entityBounds[0], var8.clickbox);
		}
		if (this.loc.field6680 != null) {
			ParticleList var9 = this.loc.field6680.method9965();
			arg0.drawParticles(var9);
		}
		this.field11135 = var2.method1731() || this.loc.field6680 != null;
		if (this.field11134 == null) {
			this.field11134 = GraphEntity.method15111((int) var4.trans.x, (int) var4.trans.y, (int) var4.trans.z, var2);
		} else {
			GraphEntity.method8229(this.field11134, (int) var4.trans.x, (int) var4.trans.y, (int) var4.trans.z, var2);
		}
		return var5;
	}

	@ObfuscatedName("ajs.fw(Ldh;I)V")
	public void method17373(Toolkit arg0) {
		Model var2 = this.loc.getModel(arg0, 262144, true, true);
		if (var2 != null) {
			Vector3 var3 = this.getTransform().trans;
			int var4 = (int) var3.x >> 9;
			int var5 = (int) var3.z >> 9;
			this.loc.method8239(arg0, var2, this.method10533(), var4, var4, var5, var5, false);
		}
	}

	@ObfuscatedName("ajs.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit arg0, int arg1, int arg2) {
		LocType var4 = this.loc.getLocType();
		if (var4.clickbox == null) {
			Model var5 = this.loc.getModel(arg0, 131072, false, false);
			return var5 == null ? false : var5.method1725(arg1, arg2, this.method10533(), false, 0);
		} else {
			return arg0.pick(arg1, arg2, this.method10533(), var4.clickbox);
		}
	}

	@ObfuscatedName("ajs.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("ajs.fq(Ldh;Lalh;IIIZB)V")
	public final void mergeNormals(Toolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajs.ff(B)V")
	public final void applyLighting() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajs.e(I)I")
	public int getId() {
		return this.loc.id;
	}

	@ObfuscatedName("ajs.n(I)I")
	public int getShape() {
		return this.loc.shape;
	}

	@ObfuscatedName("ajs.m(I)I")
	public int getAngle() {
		return this.loc.angle;
	}

	@ObfuscatedName("ajs.bz(Lvp;I)V")
	public void method17396(LocTypeCustomisation arg0) {
		this.loc.method8265(arg0);
	}

	@ObfuscatedName("ajs.k(I)V")
	public void method8205() {
	}

	@ObfuscatedName("ajs.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajs.f(I)Z")
	public boolean hasShadow() {
		return this.loc.hasShadow();
	}

	@ObfuscatedName("ajs.l(Ldh;B)V")
	public void method8217(Toolkit arg0) {
		this.loc.method8241(arg0);
	}

	@ObfuscatedName("ajs.u(Ldh;B)V")
	public void method8209(Toolkit arg0) {
		this.loc.method8242(arg0);
	}
}

package com.jagex.game.world.entity;

import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import deob.ObfuscatedName;

@ObfuscatedName("ajy")
public class DynamicSceneryEntity extends PrimaryLayerEntity implements Location {

	@ObfuscatedName("ajy.c")
	public DynamicLoc loc;

	@ObfuscatedName("ajy.r")
	public boolean active;

	@ObfuscatedName("ajy.v")
	public EntityBounds field11129;

	@ObfuscatedName("ajy.o")
	public boolean field11127 = true;

	@ObfuscatedName("ajy.s")
	public final boolean field11130;

	public DynamicSceneryEntity(Scene scene, Toolkit toolkit, LocTypeList locTypeList, LocType locType, int level, int occludeLevel, int x, int y, int z, boolean underwater, int minSceneTileX, int maxSceneTileX, int minSceneTileZ, int maxSceneTileZ, int shape, int angle, int arg16, int arg17, boolean arg18, ScaleRotTrans scaleRotTrans) {
		super(scene, level, occludeLevel, x, y, z, minSceneTileX, maxSceneTileX, minSceneTileZ, maxSceneTileZ, locType.raiseobject == 1, method6824(shape, angle), scaleRotTrans);
		this.loc = new DynamicLoc(toolkit, locTypeList, locType, shape, angle, occludeLevel, this, underwater, arg16, arg17);
		this.active = locType.active != 0 && !underwater;
		this.field11130 = arg18;
		this.createEntityBounds(1);
	}

	@ObfuscatedName("pd.bz(III)B")
	public static byte method6824(int arg0, int arg1) {
		if (LocShape.WALL_DIAGONAL.id == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ajy.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("ajy.bw(S)Z")
	public boolean method16489() {
		return this.field11127;
	}

	@ObfuscatedName("ajy.by(B)I")
	public int overlayHeight() {
		return this.loc.overlayHeight();
	}

	@ObfuscatedName("ajy.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit toolkit) {
		return this.field11129;
	}

	@ObfuscatedName("ajy.bo(I)I")
	public int height() {
		return this.loc.height();
	}

	@ObfuscatedName("ajy.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit toolkit) {
		Model var2 = this.loc.getModel(toolkit, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method10533();
		PickableEntity var4 = PickableEntity.getPickableEntity(this.active);
		this.loc.method8239(toolkit, var2, var3, this.minSceneTileX, this.maxSceneTileX, this.minSceneTileZ, this.maxSceneTileZ, true);
		LocType var5 = this.loc.getLocType();
		if (var5.clickbox == null) {
			var2.draw(var3, this.entityBounds[0], 0);
		} else {
			var2.draw(var3, null, 0);
			toolkit.method2193(var3, this.entityBounds[0], var5.clickbox);
		}
		if (this.loc.field6680 != null) {
			ParticleList var6 = this.loc.field6680.method9965();
			toolkit.drawParticles(var6);
		}
		this.field11127 = var2.method1731() || this.loc.field6680 != null;
		ScaleRotTrans var7 = this.getTransform();
		if (this.field11129 == null) {
			this.field11129 = GraphEntity.method15111((int) var7.trans.x, (int) var7.trans.y, (int) var7.trans.z, var2);
		} else {
			GraphEntity.method8229(this.field11129, (int) var7.trans.x, (int) var7.trans.y, (int) var7.trans.z, var2);
		}
		return var4;
	}

	@ObfuscatedName("ajy.fw(Ldh;I)V")
	public void method17373(Toolkit toolkit) {
		Model var2 = this.loc.getModel(toolkit, 262144, true, true);
		if (var2 != null) {
			this.loc.method8239(toolkit, var2, this.method10533(), this.minSceneTileX, this.maxSceneTileX, this.minSceneTileZ, this.maxSceneTileZ, false);
		}
	}

	@ObfuscatedName("ajy.br(Lvp;B)V")
	public void method17369(LocTypeCustomisation arg0) {
		this.loc.method8265(arg0);
	}

	@ObfuscatedName("ajy.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		LocType var4 = this.loc.getLocType();
		if (var4.clickbox == null) {
			Model var5 = this.loc.getModel(toolkit, 131072, false, false);
			return var5 == null ? false : var5.method1725(arg1, arg2, this.method10533(), false, 0);
		} else {
			return toolkit.pick(arg1, arg2, this.method10533(), var4.clickbox);
		}
	}

	@ObfuscatedName("ajy.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("ajy.fq(Ldh;Lalh;IIIZB)V")
	public final void mergeNormals(Toolkit toolkit, GraphEntity entity, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajy.ff(B)V")
	public final void applyLighting() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajy.e(I)I")
	public int getId() {
		return this.loc.id;
	}

	@ObfuscatedName("ajy.n(I)I")
	public int getShape() {
		return this.loc.shape;
	}

	@ObfuscatedName("ajy.m(I)I")
	public int getAngle() {
		return this.loc.angle;
	}

	@ObfuscatedName("ajy.k(I)V")
	public void method8205() {
	}

	@ObfuscatedName("ajy.w(B)Z")
	public boolean method8207() {
		return this.field11130;
	}

	@ObfuscatedName("ajy.f(I)Z")
	public boolean hasShadow() {
		return this.loc.hasShadow();
	}

	@ObfuscatedName("ajy.l(Ldh;B)V")
	public void method8217(Toolkit arg0) {
		this.loc.method8241(arg0);
	}

	@ObfuscatedName("ajy.u(Ldh;B)V")
	public void method8209(Toolkit arg0) {
		this.loc.method8242(arg0);
	}
}

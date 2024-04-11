package com.jagex.game.world.entity;

import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.WallLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import deob.ObfuscatedName;

@ObfuscatedName("ajj")
public class DynamicWallEntity extends WallLayerEntity implements Location {

	@ObfuscatedName("ajj.c")
	public DynamicLoc loc;

	@ObfuscatedName("ajj.r")
	public boolean active;

	@ObfuscatedName("ajj.v")
	public EntityBounds field11181;

	@ObfuscatedName("ajj.o")
	public static final int[] ROTATION_WALL_TYPE = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("ajj.s")
	public static final int[] ROTATION_WALL_CORNER_TYPE = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("ajj.y")
	public boolean field11183 = true;

	public DynamicWallEntity(Scene scene, Toolkit toolkit, LocTypeList locTypeList, LocType locType, int level, int occludeLevel, int x, int y, int z, boolean underwater, int shape, int angle, int arg12, int arg13, ScaleRotTrans scaleRotTrans) {
		super(scene, x, y, z, level, occludeLevel, getType(shape, angle), scaleRotTrans);
		this.loc = new DynamicLoc(toolkit, locTypeList, locType, shape, angle, occludeLevel, this, underwater, arg12, arg13);
		this.active = locType.active != 0 && !underwater;
		this.createEntityBounds(1);
	}

	@ObfuscatedName("ajj.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("ajj.bw(S)Z")
	public boolean method16489() {
		return this.field11183;
	}

	@ObfuscatedName("xm.bz(III)I")
	public static int getType(int arg0, int arg1) {
		return LocShape.WALL_DIAGONAL_CORNER.id == arg0 || LocShape.WALL_SQUARE_CORNER.id == arg0 ? ROTATION_WALL_CORNER_TYPE[arg1 & 0x3] : ROTATION_WALL_TYPE[arg1 & 0x3];
	}

	@ObfuscatedName("ajj.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit toolkit) {
		return this.field11181;
	}

	@ObfuscatedName("ajj.by(B)I")
	public int overlayHeight() {
		return this.loc.overlayHeight();
	}

	@ObfuscatedName("ajj.bo(I)I")
	public int height() {
		return this.loc.height();
	}

	@ObfuscatedName("ajj.bv(Lvp;I)V")
	public void method17429(LocTypeCustomisation arg0) {
		this.loc.method8265(arg0);
	}

	@ObfuscatedName("ajj.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit toolkit) {
		Model var2 = this.loc.getModel(toolkit, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.getTransform();
		PickableEntity var5 = PickableEntity.getPickableEntity(this.active);
		int var6 = (int) var4.trans.x >> 9;
		int var7 = (int) var4.trans.z >> 9;
		this.loc.method8239(toolkit, var2, var3, var6, var6, var7, var7, true);
		LocType var8 = this.loc.getLocType();
		if (var8.clickbox == null) {
			var2.draw(var3, this.entityBounds[0], 0);
		} else {
			var2.draw(var3, null, 0);
			toolkit.method2193(var3, this.entityBounds[0], var8.clickbox);
		}
		if (this.loc.field6680 != null) {
			ParticleList var9 = this.loc.field6680.method9965();
			toolkit.drawParticles(var9);
		}
		this.field11183 = var2.method1731() || this.loc.field6680 != null;
		if (this.field11181 == null) {
			this.field11181 = GraphEntity.method15111((int) var4.trans.x, (int) var4.trans.y, (int) var4.trans.z, var2);
		} else {
			GraphEntity.method8229(this.field11181, (int) var4.trans.x, (int) var4.trans.y, (int) var4.trans.z, var2);
		}
		return var5;
	}

	@ObfuscatedName("ajj.fw(Ldh;I)V")
	public void method17373(Toolkit toolkit) {
		Model var2 = this.loc.getModel(toolkit, 262144, true, true);
		if (var2 == null) {
			return;
		}
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.getTransform();
		int var5 = (int) var4.trans.x >> 9;
		int var6 = (int) var4.trans.z >> 9;
		this.loc.method8239(toolkit, var2, var3, var5, var5, var6, var6, false);
	}

	@ObfuscatedName("ajj.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		LocType var4 = this.loc.getLocType();
		if (var4.clickbox == null) {
			Model var5 = this.loc.getModel(toolkit, 131072, false, false);
			return var5 == null ? false : var5.method1725(arg1, arg2, this.method10533(), false, 0);
		} else {
			return toolkit.pick(arg1, arg2, this.method10533(), var4.clickbox);
		}
	}

	@ObfuscatedName("ajj.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("ajj.fq(Ldh;Lalh;IIIZB)V")
	public final void mergeNormals(Toolkit toolkit, GraphEntity entity, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajj.ff(B)V")
	public final void applyLighting() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajj.e(I)I")
	public int getId() {
		return this.loc.id;
	}

	@ObfuscatedName("ajj.n(I)I")
	public int getShape() {
		return this.loc.shape;
	}

	@ObfuscatedName("ajj.m(I)I")
	public int getAngle() {
		return this.loc.angle;
	}

	@ObfuscatedName("ajj.k(I)V")
	public void method8205() {
	}

	@ObfuscatedName("ajj.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajj.f(I)Z")
	public boolean hasShadow() {
		return this.loc.hasShadow();
	}

	@ObfuscatedName("ajj.l(Ldh;B)V")
	public void method8217(Toolkit arg0) {
		this.loc.method8241(arg0);
	}

	@ObfuscatedName("ajj.u(Ldh;B)V")
	public void method8209(Toolkit arg0) {
		this.loc.method8242(arg0);
	}
}

package com.jagex.game.world.entity;

import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.Model;
import com.jagex.graphics.Renderer;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import deob.ObfuscatedName;

@ObfuscatedName("ajy")
public class DynamicSceneryEntity extends PrimaryLayerEntity implements Location {

	@ObfuscatedName("ajy.c")
	public DynamicLoc field11131;

	@ObfuscatedName("ajy.r")
	public boolean field11128;

	@ObfuscatedName("ajy.v")
	public EntityBounds field11129;

	@ObfuscatedName("ajy.o")
	public boolean field11127 = true;

	@ObfuscatedName("ajy.s")
	public final boolean field11130;

	public DynamicSceneryEntity(Scene arg0, Renderer arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, boolean arg18, ScaleRotTrans arg19) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.raiseobject == 1, method6824(arg14, arg15), arg19);
		this.field11131 = new DynamicLoc(arg1, arg2, arg3, arg14, arg15, arg5, this, arg9, arg16, arg17);
		this.field11128 = arg3.active != 0 && !arg9;
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
		return this.field11131.method8262();
	}

	@ObfuscatedName("ajy.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Renderer renderer) {
		return this.field11129;
	}

	@ObfuscatedName("ajy.bo(I)I")
	public int height() {
		return this.field11131.method8236();
	}

	@ObfuscatedName("ajy.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Renderer renderer) {
		Model var2 = this.field11131.method8238(renderer, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method10533();
		PickableEntity var4 = PickableEntity.getPickableEntity(this.field11128);
		this.field11131.method8239(renderer, var2, var3, this.field12471, this.field12472, this.field12468, this.field12467, true);
		LocType var5 = this.field11131.method8237();
		if (var5.clickbox == null) {
			var2.draw(var3, this.entityBounds[0], 0);
		} else {
			var2.draw(var3, null, 0);
			renderer.method2193(var3, this.entityBounds[0], var5.clickbox);
		}
		if (this.field11131.field6680 != null) {
			ParticleList var6 = this.field11131.field6680.method9965();
			renderer.drawParticles(var6);
		}
		this.field11127 = var2.method1731() || this.field11131.field6680 != null;
		ScaleRotTrans var7 = this.getTransform();
		if (this.field11129 == null) {
			this.field11129 = GraphEntity.method15111((int) var7.trans.x, (int) var7.trans.y, (int) var7.trans.z, var2);
		} else {
			GraphEntity.method8229(this.field11129, (int) var7.trans.x, (int) var7.trans.y, (int) var7.trans.z, var2);
		}
		return var4;
	}

	@ObfuscatedName("ajy.fw(Ldh;I)V")
	public void method17373(Renderer renderer) {
		Model var2 = this.field11131.method8238(renderer, 262144, true, true);
		if (var2 != null) {
			this.field11131.method8239(renderer, var2, this.method10533(), this.field12471, this.field12472, this.field12468, this.field12467, false);
		}
	}

	@ObfuscatedName("ajy.br(Lvp;B)V")
	public void method17369(LocTypeCustomisation arg0) {
		this.field11131.method8265(arg0);
	}

	@ObfuscatedName("ajy.fa(Ldh;IIB)Z")
	public boolean method17375(Renderer renderer, int arg1, int arg2) {
		LocType var4 = this.field11131.method8237();
		if (var4.clickbox == null) {
			Model var5 = this.field11131.method8238(renderer, 131072, false, false);
			return var5 == null ? false : var5.method1725(arg1, arg2, this.method10533(), false, 0);
		} else {
			return renderer.pick(arg1, arg2, this.method10533(), var4.clickbox);
		}
	}

	@ObfuscatedName("ajy.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("ajy.fq(Ldh;Lalh;IIIZB)V")
	public final void mergeNormals(Renderer renderer, GraphEntity entity, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajy.ff(B)V")
	public final void applyLighting() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajy.e(I)I")
	public int method8223() {
		return this.field11131.field6665;
	}

	@ObfuscatedName("ajy.n(I)I")
	public int method8220() {
		return this.field11131.field6666;
	}

	@ObfuscatedName("ajy.m(I)I")
	public int method8204() {
		return this.field11131.field6667;
	}

	@ObfuscatedName("ajy.k(I)V")
	public void method8205() {
	}

	@ObfuscatedName("ajy.w(B)Z")
	public boolean method8207() {
		return this.field11130;
	}

	@ObfuscatedName("ajy.f(I)Z")
	public boolean method8206() {
		return this.field11131.method8240();
	}

	@ObfuscatedName("ajy.l(Ldh;B)V")
	public void method8217(Renderer arg0) {
		this.field11131.method8241(arg0);
	}

	@ObfuscatedName("ajy.u(Ldh;B)V")
	public void method8209(Renderer arg0) {
		this.field11131.method8242(arg0);
	}
}

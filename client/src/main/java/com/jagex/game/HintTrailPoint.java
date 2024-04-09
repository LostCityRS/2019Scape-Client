package com.jagex.game;

import com.jagex.game.world.entity.*;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import deob.ObfuscatedName;

@ObfuscatedName("auu")
public class HintTrailPoint extends PrimaryLayerEntity {

	@ObfuscatedName("auu.ae")
	public HintTrail field12614;

	public HintTrailPoint(Scene arg0, HintTrail arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0, arg2, arg3, arg4, arg5, arg6, arg4 >> 9, arg4 >> 9, arg6 >> 9, arg6 >> 9, false, (byte) 0);
		this.field12614 = arg1;
	}

	@ObfuscatedName("auu.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		return false;
	}

	@ObfuscatedName("auu.fp(I)Z")
	public boolean method17379() {
		return false;
	}

	@ObfuscatedName("auu.bu(B)Z")
	public boolean method16488() {
		return true;
	}

	@ObfuscatedName("auu.bw(S)Z")
	public boolean method16489() {
		return false;
	}

	@ObfuscatedName("auu.fq(Ldh;Lalh;IIIZB)V")
	public void mergeNormals(Toolkit toolkit, GraphEntity entity, int arg2, int arg3, int arg4, boolean arg5) {
	}

	@ObfuscatedName("auu.ff(B)V")
	public void applyLighting() {
	}

	@ObfuscatedName("auu.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit toolkit) {
		if (this.field12614.field6754 == null) {
			return null;
		}
		Matrix4x3 var2 = toolkit.method2209();
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.getTransform();
		var2.setTo(var3);
		Tile var5 = this.scene.levelTiles[this.level][(int) var4.trans.x >> 9][(int) var4.trans.z >> 9];
		if (var5 != null && var5.groundDecoration != null) {
			var2.translate(0.0F, (float) -var5.groundDecoration.field12448, 0.0F);
		}
		this.field12614.field6754.draw(var2, null, 0);
		return null;
	}

	@ObfuscatedName("auu.fw(Ldh;I)V")
	public void method17373(Toolkit toolkit) {
	}

	@ObfuscatedName("auu.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit toolkit) {
		return null;
	}

	@ObfuscatedName("auu.by(B)I")
	public int overlayHeight() {
		return this.field12614.field6754 == null ? 0 : this.field12614.field6754.getMinY();
	}
}

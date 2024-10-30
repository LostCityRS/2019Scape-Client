package com.jagex.graphics.scenegraph;

import com.jagex.game.client.ScreenBoundingBox;
import com.jagex.game.world.entity.EntityBounds;
import com.jagex.game.world.entity.PickableEntity;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Light;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.math.ScaleRotTrans;
import deob.ObfuscatedName;

@ObfuscatedName("alh")
public abstract class GraphEntity extends GraphNode {

	@ObfuscatedName("alh.c")
	public Scene scene;

	@ObfuscatedName("alh.r")
	public GraphEntity field11712;

	@ObfuscatedName("alh.v")
	public byte level;

	@ObfuscatedName("alh.o")
	public byte occludeLevel;

	@ObfuscatedName("alh.s")
	public int field11715;

	@ObfuscatedName("alh.y")
	public ScreenBoundingBox[] entityBounds;

	@ObfuscatedName("alh.q")
	public ScaleRotTrans scaleRotTrans;

	public GraphEntity(Scene arg0) {
		this(arg0, (ScaleRotTrans) null);
	}

	public GraphEntity(Scene arg0, ScaleRotTrans arg1) {
		this.scene = arg0;
		this.scaleRotTrans = arg1;
	}

	@ObfuscatedName("alh.gp(I)I")
	public int getPickSizeShift() {
		return 0;
	}

	@ObfuscatedName("alh.gc(I)Z")
	public boolean method18359() {
		return true;
	}

	@ObfuscatedName("alh.gf(II[Lakf;I)I")
	public int method18362(int arg0, int arg1, Light[] arg2) {
		long var4 = this.scene.field6954[this.level][arg0][arg1];
		long var6 = 0L;
		int var8 = 0;
		while (var6 <= 48L) {
			int var9 = (int) (var4 >> (int) var6 & 0xFFFFL);
			if (var9 <= 0) {
				break;
			}
			arg2[var8++] = this.scene.field6926[var9 - 1].field7003;
			var6 += 16L;
		}
		for (int var10 = var8; var10 < 4; var10++) {
			arg2[var10] = null;
		}
		return var8;
	}

	@ObfuscatedName("acl.gx(IIILdo;I)Luq;")
	public static EntityBounds method15111(int arg0, int arg1, int arg2, Model arg3) {
		return arg3 == null ? null : new EntityBounds(arg0, arg1, arg2, arg3.getHorizontalRadius(), arg3.getMinX(), arg3.getMaxX(), arg3.getMinY(), arg3.getMaxY(), arg3.getMinZ(), arg3.getMaxZ());
	}

	@ObfuscatedName("sl.ge(Luq;IIILdo;I)V")
	public static void method8229(EntityBounds arg0, int arg1, int arg2, int arg3, Model arg4) {
		if (arg4 != null) {
			arg0.method8967(arg1, arg2, arg3, arg4.getHorizontalRadius(), arg4.getMinX(), arg4.getMaxX(), arg4.getMinY(), arg4.getMaxY(), arg4.getMinZ(), arg4.getMaxZ());
		}
	}

	@ObfuscatedName("alh.bo(I)I")
	public int height() {
		return -this.overlayHeight();
	}

	@ObfuscatedName("alh.gg(II)V")
	public void createEntityBounds(int arg0) {
		this.entityBounds = new ScreenBoundingBox[arg0];
		for (int var2 = 0; var2 < this.entityBounds.length; var2++) {
			this.entityBounds[var2] = new ScreenBoundingBox();
		}
	}

	@ObfuscatedName("alh.fa(Ldh;IIB)Z")
	public abstract boolean method17375(Toolkit arg0, int arg1, int arg2);

	@ObfuscatedName("alh.fp(I)Z")
	public abstract boolean method17379();

	@ObfuscatedName("alh.bu(B)Z")
	public abstract boolean method16488();

	@ObfuscatedName("alh.bw(S)Z")
	public abstract boolean method16489();

	@ObfuscatedName("alh.ff(B)V")
	public abstract void applyLighting();

	@ObfuscatedName("alh.fw(Ldh;I)V")
	public abstract void method17373(Toolkit arg0);

	@ObfuscatedName("alh.fq(Ldh;Lalh;IIIZB)V")
	public abstract void mergeNormals(Toolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("alh.ga(Ldh;S)Z")
	public abstract boolean isOccluded(Toolkit arg0);

	@ObfuscatedName("alh.fc(Ldh;I)Ltl;")
	public abstract PickableEntity draw(Toolkit arg0);

	@ObfuscatedName("alh.gn(I)Z")
	public abstract boolean isVisible();

	@ObfuscatedName("alh.by(B)I")
	public abstract int overlayHeight();

	@ObfuscatedName("alh.fv(Ldh;B)Luq;")
	public abstract EntityBounds method17371(Toolkit arg0);

	@ObfuscatedName("alh.gy([Lakf;S)I")
	public abstract int method18375(Light[] arg0);
}

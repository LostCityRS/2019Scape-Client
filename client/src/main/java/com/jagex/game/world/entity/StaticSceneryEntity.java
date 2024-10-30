package com.jagex.game.world.entity;

import com.jagex.core.datastruct.Pair;
import com.jagex.game.client.HardShadow;
import com.jagex.game.client.ScreenBoundingBox;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.FloorModel;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.math.Cuboid;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ajv")
public class StaticSceneryEntity extends PrimaryLayerEntity implements Location {

	@ObfuscatedName("ajv.c")
	public LocTypeList locTypeList;

	@ObfuscatedName("ajv.r")
	public Model model;

	@ObfuscatedName("ajv.v")
	public HardShadow shadow;

	@ObfuscatedName("ajv.o")
	public EntityBounds field11148;

	@ObfuscatedName("ajv.s")
	public final int field11715;

	@ObfuscatedName("ajv.y")
	public final byte shape;

	@ObfuscatedName("ajv.q")
	public final byte angle;

	@ObfuscatedName("ajv.x")
	public final boolean underwater;

	@ObfuscatedName("ajv.b")
	public boolean active;

	@ObfuscatedName("ajv.h")
	public boolean field11139;

	@ObfuscatedName("ajv.a")
	public boolean hasHardShadow;

	@ObfuscatedName("ajv.g")
	public final boolean raised;

	@ObfuscatedName("ajv.i")
	public int field11138;

	public StaticSceneryEntity(Scene arg0, Toolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, boolean arg16, boolean arg17, ScaleRotTrans arg18) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.raiseobject == 1, method14062(arg14, arg15), arg18);
		this.locTypeList = arg2;
		this.field11715 = arg3.id;
		this.occludeLevel = (byte) arg5;
		this.underwater = arg9;
		this.shape = (byte) arg14;
		this.angle = (byte) arg15;
		this.active = arg3.active != 0 && !arg9;
		this.field11139 = arg16;
		this.hasHardShadow = arg1.supportsHardShadows() && arg3.hardshadow && !this.underwater && Client.preferences.sceneryShadows.getValue() != 0;
		this.raised = arg17;
		this.field11138 = arg7;
		int var20 = 2048;
		if (this.field11139) {
			var20 |= 0x10000;
		}
		if (arg3.antimacro) {
			var20 |= 0x80000;
		}
		Pair var21 = this.method17400(arg1, var20, this.hasHardShadow);
		if (var21 != null) {
			this.model = (Model) var21.first;
			this.shadow = (HardShadow) var21.second;
			if (this.field11139 || arg3.antimacro) {
				this.model = this.model.method1773((byte) 0, var20, false);
				if (arg3.antimacro) {
					LocTint var22 = Client.world.method7722();
					this.model.method1745(var22.field5015, var22.field5013, var22.field5014, var22.field5012);
				}
			}
		}
		this.createEntityBounds(1);
	}

	@ObfuscatedName("ajv.bu(B)Z")
	public boolean method16488() {
		if (this.model == null) {
			return true;
		} else {
			return !this.model.method1812();
		}
	}

	@ObfuscatedName("ajv.bw(S)Z")
	public boolean method16489() {
		return this.model == null ? false : this.model.method1731();
	}

	@ObfuscatedName("zg.bz(III)B")
	public static byte method14062(int arg0, int arg1) {
		if (LocShape.WALL_DIAGONAL.id == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ajv.by(B)I")
	public int overlayHeight() {
		return this.model == null ? 0 : this.model.getMinY();
	}

	@ObfuscatedName("ajv.br(Ldh;II)Ldo;")
	public Model method17399(Toolkit arg0, int arg1) {
		if (this.model != null && arg0.method2394(this.model.method1691(), arg1) == 0) {
			return this.model;
		} else {
			Pair var3 = this.method17400(arg0, arg1, false);
			return var3 == null ? null : (Model) var3.first;
		}
	}

	@ObfuscatedName("ajv.bg(Ldh;IZI)Labg;")
	public Pair method17400(Toolkit arg0, int arg1, boolean arg2) {
		LocType var4 = (LocType) this.locTypeList.list(this.field11715);
		FloorModel var5;
		FloorModel var6;
		if (this.underwater) {
			var5 = this.scene.underwaterLevelHeightMaps[this.occludeLevel];
			var6 = this.scene.field6915[0];
		} else {
			var5 = this.scene.field6915[this.occludeLevel];
			if (this.occludeLevel < 3) {
				var6 = this.scene.field6915[this.occludeLevel + 1];
			} else {
				var6 = null;
			}
		}
		Vector3 var7 = this.getTransform().trans;
		return var4.method9475(arg0, arg1, LocShape.CENTREPIECE_DIAGONAL.id == this.shape ? LocShape.CENTREPIECE_STRAIGHT.id : this.shape, LocShape.CENTREPIECE_DIAGONAL.id == this.shape ? this.angle + 4 : this.angle, var5, var6, (int) var7.x, this.field11138, (int) var7.z, arg2, null);
	}

	@ObfuscatedName("ajv.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit arg0) {
		Vector3 var2 = this.getTransform().trans;
		if (this.field11148 == null) {
			this.field11148 = GraphEntity.method15111((int) var2.x, (int) var2.y, (int) var2.z, this.method17399(arg0, 0));
		}
		return this.field11148;
	}

	@ObfuscatedName("ajv.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit arg0) {
		if (this.model == null) {
			return null;
		}
		Matrix4x3 var2 = this.method10533();
		PickableEntity var3 = PickableEntity.getPickableEntity(this.active);
		Cuboid var4 = ((LocType) this.locTypeList.list(this.field11715)).clickbox;
		if (var4 == null) {
			this.model.draw(var2, this.entityBounds[0], 0);
		} else {
			this.model.draw(var2, null, 0);
			arg0.method2193(var2, this.entityBounds[0], var4);
		}
		return var3;
	}

	@ObfuscatedName("ajv.fw(Ldh;I)V")
	public void method17373(Toolkit arg0) {
	}

	@ObfuscatedName("ajv.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit arg0, int arg1, int arg2) {
		Cuboid var4 = ((LocType) this.locTypeList.list(this.field11715)).clickbox;
		if (var4 != null) {
			return arg0.pick(arg1, arg2, this.method10533(), var4);
		}
		Model var5 = this.method17399(arg0, 131072);
		if (var5 == null) {
			return false;
		} else {
			Matrix4x3 var6 = this.method10533();
			return var5.method1725(arg1, arg2, var6, false, 0);
		}
	}

	@ObfuscatedName("ajv.fp(I)Z")
	public boolean method17379() {
		return this.field11139;
	}

	@ObfuscatedName("ajv.fq(Ldh;Lalh;IIIZB)V")
	public void mergeNormals(Toolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof StaticWallEntity) {
			StaticWallEntity var7 = (StaticWallEntity) arg1;
			if (this.model != null && var7.model != null) {
				this.model.method1686(var7.model, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof StaticSceneryEntity) {
			StaticSceneryEntity var8 = (StaticSceneryEntity) arg1;
			if (this.model != null && var8.model != null) {
				this.model.method1686(var8.model, arg2, arg3, arg4, arg5);
			}
		}
	}

	@ObfuscatedName("ajv.ff(B)V")
	public void applyLighting() {
		this.field11139 = false;
		if (this.model != null) {
			this.model.method1690(this.model.method1691() & 0xFFFEFFFF);
		}
	}

	@ObfuscatedName("ajv.e(I)I")
	public int getId() {
		return this.field11715;
	}

	@ObfuscatedName("ajv.n(I)I")
	public int getShape() {
		return this.shape;
	}

	@ObfuscatedName("ajv.m(I)I")
	public int getAngle() {
		return this.angle;
	}

	@ObfuscatedName("ajv.k(I)V")
	public void method8205() {
		if (this.model != null) {
			this.model.method1816();
		}
	}

	@ObfuscatedName("ajv.w(B)Z")
	public boolean method8207() {
		return this.raised;
	}

	@ObfuscatedName("ajv.f(I)Z")
	public boolean hasShadow() {
		return this.hasHardShadow;
	}

	@ObfuscatedName("ajv.l(Ldh;B)V")
	public void method8217(Toolkit arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.shadow == null && this.hasHardShadow) {
			Pair var3 = this.method17400(arg0, 262144, true);
			var4 = (HardShadow) (var3 == null ? null : var3.second);
		} else {
			var4 = this.shadow;
			this.shadow = null;
		}
		Vector3 var5 = this.getTransform().trans;
		if (var4 != null) {
			this.scene.method8750(var4, this.occludeLevel, (int) var5.x, (int) var5.z, null);
		}
	}

	@ObfuscatedName("ajv.u(Ldh;B)V")
	public void method8209(Toolkit arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.shadow == null && this.hasHardShadow) {
			Pair var3 = this.method17400(arg0, 262144, true);
			var4 = (HardShadow) (var3 == null ? null : var3.second);
		} else {
			var4 = this.shadow;
			this.shadow = null;
		}
		Vector3 var5 = this.getTransform().trans;
		if (var4 != null) {
			this.scene.method8814(var4, this.occludeLevel, (int) var5.x, (int) var5.z, null);
		}
	}

	@ObfuscatedName("ajv.ba(I)I")
	public int method17401() {
		return this.model == null ? 15 : this.model.getHorizontalRadius() / 4;
	}
}

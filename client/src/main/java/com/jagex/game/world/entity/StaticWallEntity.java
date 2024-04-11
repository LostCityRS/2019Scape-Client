package com.jagex.game.world.entity;

import com.jagex.core.datastruct.Pair;
import com.jagex.game.client.HardShadow;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.FloorModel;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.WallLayerEntity;
import com.jagex.math.Cuboid;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ajg")
public class StaticWallEntity extends WallLayerEntity implements Location {

	@ObfuscatedName("ajg.c")
	public static final int[] ROTATION_WALL_TYPE = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("ajg.r")
	public static final int[] ROTATION_WALL_CORNER_TYPE = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("ajg.v")
	public LocTypeList locTypeList;

	@ObfuscatedName("ajg.o")
	public Model model;

	@ObfuscatedName("ajg.s")
	public HardShadow shadow;

	@ObfuscatedName("ajg.y")
	public EntityBounds field11165;

	@ObfuscatedName("ajg.q")
	public final int id;

	@ObfuscatedName("ajg.x")
	public final byte angle;

	@ObfuscatedName("ajg.b")
	public final byte shape;

	@ObfuscatedName("ajg.h")
	public final boolean underwater;

	@ObfuscatedName("ajg.a")
	public boolean active;

	@ObfuscatedName("ajg.g")
	public boolean field11171;

	@ObfuscatedName("ajg.i")
	public boolean hasHardShadow;

	@ObfuscatedName("ajg.j")
	public int y;

	public StaticWallEntity(Scene scene, Toolkit toolkit, LocTypeList locTypeList, LocType locType, int level, int occludeLevel, int x, int y, int z, boolean underwater, int shape, int angle, boolean arg12, ScaleRotTrans scaleRotTrans) {
		super(scene, x, y, z, level, occludeLevel, getType(shape, angle), scaleRotTrans);
		this.locTypeList = locTypeList;
		this.id = locType.id;
		this.underwater = underwater;
		this.shape = (byte) shape;
		this.angle = (byte) angle;
		this.active = locType.active != 0 && !underwater;
		this.field11171 = arg12;
		this.hasHardShadow = toolkit.supportsHardShadows() && locType.hardshadow && !this.underwater && Client.preferences.sceneryShadows.getValue() != 0;
		this.y = y;
		int var15 = 2048;
		if (this.field11171) {
			var15 |= 0x10000;
		}
		if (locType.antimacro) {
			var15 |= 0x80000;
		}
		Pair var16 = this.method17420(toolkit, var15, this.hasHardShadow);
		if (var16 != null) {
			this.model = (Model) var16.first;
			this.shadow = (HardShadow) var16.second;
			if (this.field11171 || locType.antimacro) {
				this.model = this.model.method1773((byte) 0, var15, false);
				if (locType.antimacro) {
					LocTint var17 = Client.world.method7722();
					this.model.method1745(var17.field5015, var17.field5013, var17.field5014, var17.field5012);
				}
			}
		}
		this.createEntityBounds(1);
	}

	@ObfuscatedName("ajg.bu(B)Z")
	public boolean method16488() {
		if (this.model == null) {
			return true;
		} else {
			return !this.model.method1812();
		}
	}

	@ObfuscatedName("ajg.bw(S)Z")
	public boolean method16489() {
		return this.model == null ? false : this.model.method1731();
	}

	@ObfuscatedName("ajg.by(B)I")
	public int overlayHeight() {
		return this.model == null ? 0 : this.model.getMinY();
	}

	@ObfuscatedName("cs.bz(III)I")
	public static int getType(int shape, int angle) {
		return LocShape.WALL_DIAGONAL_CORNER.id == shape || LocShape.WALL_SQUARE_CORNER.id == shape ? ROTATION_WALL_CORNER_TYPE[angle & 0x3] : ROTATION_WALL_TYPE[angle & 0x3];
	}

	@ObfuscatedName("ajg.bv(Ldh;II)Ldo;")
	public Model method17419(Toolkit arg0, int arg1) {
		if (this.model != null && arg0.method2394(this.model.method1691(), arg1) == 0) {
			return this.model;
		} else {
			Pair var3 = this.method17420(arg0, arg1, false);
			return var3 == null ? null : (Model) var3.first;
		}
	}

	@ObfuscatedName("ajg.br(Ldh;IZI)Labg;")
	public Pair method17420(Toolkit arg0, int arg1, boolean arg2) {
		LocType var4 = (LocType) this.locTypeList.list(this.id);
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
		return var4.method9475(arg0, arg1, this.shape, this.angle, var5, var6, (int) var7.x, this.y, (int) var7.z, arg2, null);
	}

	@ObfuscatedName("ajg.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit toolkit) {
		Vector3 var2 = this.getTransform().trans;
		if (this.field11165 == null) {
			this.field11165 = GraphEntity.method15111((int) var2.x, (int) var2.y, (int) var2.z, this.method17419(toolkit, 0));
		}
		return this.field11165;
	}

	@ObfuscatedName("ajg.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit toolkit) {
		if (this.model == null) {
			return null;
		}
		Matrix4x3 var2 = this.method10533();
		PickableEntity var3 = PickableEntity.getPickableEntity(this.active);
		Cuboid var4 = ((LocType) this.locTypeList.list(this.id)).clickbox;
		if (var4 == null) {
			this.model.draw(var2, this.entityBounds[0], 0);
		} else {
			this.model.draw(var2, null, 0);
			toolkit.method2193(var2, this.entityBounds[0], var4);
		}
		return var3;
	}

	@ObfuscatedName("ajg.fw(Ldh;I)V")
	public void method17373(Toolkit toolkit) {
	}

	@ObfuscatedName("ajg.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		Cuboid var4 = ((LocType) this.locTypeList.list(this.id)).clickbox;
		if (var4 != null) {
			return toolkit.pick(arg1, arg2, this.method10533(), var4);
		}
		Model var5 = this.method17419(toolkit, 131072);
		if (var5 == null) {
			return false;
		} else {
			Matrix4x3 var6 = this.method10533();
			return var5.method1725(arg1, arg2, var6, false, 0);
		}
	}

	@ObfuscatedName("ajg.fp(I)Z")
	public boolean method17379() {
		return this.field11171;
	}

	@ObfuscatedName("ajg.fq(Ldh;Lalh;IIIZB)V")
	public void mergeNormals(Toolkit toolkit, GraphEntity entity, int arg2, int arg3, int arg4, boolean arg5) {
		if (entity instanceof StaticWallEntity) {
			StaticWallEntity var7 = (StaticWallEntity) entity;
			if (this.model != null && var7.model != null) {
				this.model.method1686(var7.model, arg2, arg3, arg4, arg5);
			}
		} else if (entity instanceof StaticSceneryEntity) {
			StaticSceneryEntity var8 = (StaticSceneryEntity) entity;
			if (this.model != null && var8.model != null) {
				this.model.method1686(var8.model, arg2, arg3, arg4, arg5);
			}
		}
	}

	@ObfuscatedName("ajg.ff(B)V")
	public void applyLighting() {
		this.field11171 = false;
		if (this.model != null) {
			this.model.method1690(this.model.method1691() & 0xFFFEFFFF);
		}
	}

	@ObfuscatedName("ajg.e(I)I")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("ajg.n(I)I")
	public int getShape() {
		return this.shape;
	}

	@ObfuscatedName("ajg.m(I)I")
	public int getAngle() {
		return this.angle;
	}

	@ObfuscatedName("ajg.k(I)V")
	public void method8205() {
		if (this.model != null) {
			this.model.method1816();
		}
	}

	@ObfuscatedName("ajg.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajg.f(I)Z")
	public boolean hasShadow() {
		return this.hasHardShadow;
	}

	@ObfuscatedName("ajg.l(Ldh;B)V")
	public void method8217(Toolkit arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.shadow == null && this.hasHardShadow) {
			Pair var3 = this.method17420(arg0, 262144, true);
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

	@ObfuscatedName("ajg.u(Ldh;B)V")
	public void method8209(Toolkit arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.shadow == null && this.hasHardShadow) {
			Pair var3 = this.method17420(arg0, 262144, true);
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
}

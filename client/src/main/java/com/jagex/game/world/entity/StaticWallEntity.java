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

	public StaticWallEntity(Scene arg0, Toolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, boolean arg12, ScaleRotTrans arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, getType(arg10, arg11), arg13);
		this.locTypeList = arg2;
		this.id = arg3.id;
		this.underwater = arg9;
		this.shape = (byte) arg10;
		this.angle = (byte) arg11;
		this.active = arg3.active != 0 && !arg9;
		this.field11171 = arg12;
		this.hasHardShadow = arg1.supportsHardShadows() && arg3.hardshadow && !this.underwater && Client.preferences.sceneryShadows.getValue() != 0;
		this.y = arg7;
		int var15 = 2048;
		if (this.field11171) {
			var15 |= 0x10000;
		}
		if (arg3.antimacro) {
			var15 |= 0x80000;
		}
		Pair var16 = this.method17420(arg1, var15, this.hasHardShadow);
		if (var16 != null) {
			this.model = (Model) var16.first;
			this.shadow = (HardShadow) var16.second;
			if (this.field11171 || arg3.antimacro) {
				this.model = this.model.method1773((byte) 0, var15, false);
				if (arg3.antimacro) {
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
	public static int getType(int arg0, int arg1) {
		return LocShape.WALL_DIAGONAL_CORNER.id == arg0 || LocShape.WALL_SQUARE_CORNER.id == arg0 ? ROTATION_WALL_CORNER_TYPE[arg1 & 0x3] : ROTATION_WALL_TYPE[arg1 & 0x3];
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
	public EntityBounds method17371(Toolkit arg0) {
		Vector3 var2 = this.getTransform().trans;
		if (this.field11165 == null) {
			this.field11165 = GraphEntity.method15111((int) var2.x, (int) var2.y, (int) var2.z, this.method17419(arg0, 0));
		}
		return this.field11165;
	}

	@ObfuscatedName("ajg.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit arg0) {
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
			arg0.method2193(var2, this.entityBounds[0], var4);
		}
		return var3;
	}

	@ObfuscatedName("ajg.fw(Ldh;I)V")
	public void method17373(Toolkit arg0) {
	}

	@ObfuscatedName("ajg.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit arg0, int arg1, int arg2) {
		Cuboid var4 = ((LocType) this.locTypeList.list(this.id)).clickbox;
		if (var4 != null) {
			return arg0.pick(arg1, arg2, this.method10533(), var4);
		}
		Model var5 = this.method17419(arg0, 131072);
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

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
import com.jagex.graphics.scenegraph.GroundDecorLayerEntity;
import com.jagex.math.Cuboid;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ajz")
public class StaticGroundDecorEntity extends GroundDecorLayerEntity implements Location {

	@ObfuscatedName("ajz.c")
	public LocTypeList locTypeList;

	@ObfuscatedName("ajz.r")
	public Model model;

	@ObfuscatedName("ajz.v")
	public HardShadow shadow;

	@ObfuscatedName("ajz.o")
	public EntityBounds field11187;

	@ObfuscatedName("ajz.s")
	public final int field11715;

	@ObfuscatedName("ajz.y")
	public final byte angle;

	@ObfuscatedName("ajz.q")
	public final boolean underwater;

	@ObfuscatedName("ajz.x")
	public boolean active;

	@ObfuscatedName("ajz.b")
	public boolean field11184;

	@ObfuscatedName("ajz.h")
	public boolean hasHardShadow;

	@ObfuscatedName("ajz.a")
	public int y;

	public StaticGroundDecorEntity(Scene arg0, Toolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, boolean arg11, ScaleRotTrans arg12) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.field7448, arg12);
		this.locTypeList = arg2;
		this.field11715 = arg3.id;
		this.underwater = arg9;
		this.angle = (byte) arg10;
		this.active = arg3.active != 0 && !arg9;
		this.field11184 = arg11;
		this.hasHardShadow = arg1.supportsHardShadows() && arg3.hardshadow && !this.underwater && Client.preferences.sceneryShadows.getValue() != 0;
		this.y = arg7;
		int var14 = 2048;
		if (this.field11184) {
			var14 |= 0x10000;
		}
		if (arg3.antimacro) {
			var14 |= 0x80000;
		}
		Pair var15 = this.method17436(arg1, var14, this.hasHardShadow);
		if (var15 != null) {
			this.model = (Model) var15.first;
			this.shadow = (HardShadow) var15.second;
			if (this.field11184 || arg3.antimacro) {
				this.model = this.model.method1773((byte) 0, var14, false);
				if (arg3.antimacro) {
					LocTint var16 = Client.world.method7722();
					this.model.method1745(var16.field5015, var16.field5013, var16.field5014, var16.field5012);
				}
			}
		}
		this.createEntityBounds(1);
	}

	@ObfuscatedName("ajz.bu(B)Z")
	public boolean method16488() {
		if (this.model == null) {
			return true;
		} else {
			return !this.model.method1812();
		}
	}

	@ObfuscatedName("ajz.bw(S)Z")
	public boolean method16489() {
		return this.model == null ? false : this.model.method1731();
	}

	@ObfuscatedName("ajz.by(B)I")
	public int overlayHeight() {
		return this.model == null ? 0 : this.model.getMinY();
	}

	@ObfuscatedName("ajz.bz(Ldh;IB)Ldo;")
	public Model method17435(Toolkit arg0, int arg1) {
		if (this.model != null && arg0.method2394(this.model.method1691(), arg1) == 0) {
			return this.model;
		} else {
			Pair var3 = this.method17436(arg0, arg1, false);
			return var3 == null ? null : (Model) var3.first;
		}
	}

	@ObfuscatedName("ajz.bv(Ldh;IZI)Labg;")
	public Pair method17436(Toolkit arg0, int arg1, boolean arg2) {
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
		return var4.method9475(arg0, arg1, LocShape.GROUND_DECOR.id, this.angle, var5, var6, (int) var7.x, this.y, (int) var7.z, arg2, null);
	}

	@ObfuscatedName("ajz.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit arg0) {
		Vector3 var2 = this.getTransform().trans;
		if (this.field11187 == null) {
			this.field11187 = GraphEntity.method15111((int) var2.x, (int) var2.y, (int) var2.z, this.method17435(arg0, 0));
		}
		return this.field11187;
	}

	@ObfuscatedName("ajz.fc(Ldh;I)Ltl;")
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

	@ObfuscatedName("ajz.fw(Ldh;I)V")
	public void method17373(Toolkit arg0) {
	}

	@ObfuscatedName("ajz.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit arg0, int arg1, int arg2) {
		Cuboid var4 = ((LocType) this.locTypeList.list(this.field11715)).clickbox;
		if (var4 != null) {
			return arg0.pick(arg1, arg2, this.method10533(), var4);
		}
		Model var5 = this.method17435(arg0, 131072);
		if (var5 == null) {
			return false;
		} else {
			Matrix4x3 var6 = this.method10533();
			return var5.method1725(arg1, arg2, var6, false, 0);
		}
	}

	@ObfuscatedName("ajz.fp(I)Z")
	public boolean method17379() {
		return this.field11184;
	}

	@ObfuscatedName("ajz.fq(Ldh;Lalh;IIIZB)V")
	public void mergeNormals(Toolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof StaticGroundDecorEntity) {
			StaticGroundDecorEntity var7 = (StaticGroundDecorEntity) arg1;
			if (this.model != null && var7.model != null) {
				this.model.method1686(var7.model, arg2, arg3, arg4, arg5);
			}
		}
	}

	@ObfuscatedName("ajz.ff(B)V")
	public void applyLighting() {
		this.field11184 = false;
		if (this.model != null) {
			this.model.method1690(this.model.method1691() & 0xFFFEFFFF);
		}
	}

	@ObfuscatedName("ajz.e(I)I")
	public int getId() {
		return this.field11715;
	}

	@ObfuscatedName("ajz.n(I)I")
	public int getShape() {
		return LocShape.GROUND_DECOR.id;
	}

	@ObfuscatedName("ajz.m(I)I")
	public int getAngle() {
		return this.angle;
	}

	@ObfuscatedName("ajz.k(I)V")
	public void method8205() {
		if (this.model != null) {
			this.model.method1816();
		}
	}

	@ObfuscatedName("ajz.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajz.f(I)Z")
	public boolean hasShadow() {
		return this.hasHardShadow;
	}

	@ObfuscatedName("ajz.l(Ldh;B)V")
	public void method8217(Toolkit arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.shadow == null && this.hasHardShadow) {
			Pair var3 = this.method17436(arg0, 262144, true);
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

	@ObfuscatedName("ajz.u(Ldh;B)V")
	public void method8209(Toolkit arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.shadow == null && this.hasHardShadow) {
			Pair var3 = this.method17436(arg0, 262144, true);
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

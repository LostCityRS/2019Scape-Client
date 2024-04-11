package com.jagex.game.world.entity;

import com.jagex.core.datastruct.Pair;
import com.jagex.game.client.HardShadow;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.FloorModel;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.WallDecorLayerEntity;
import com.jagex.math.Cuboid;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ajk")
public class StaticWallDecorEntity extends WallDecorLayerEntity implements Location {

	@ObfuscatedName("ajk.c")
	public LocTypeList locTypeList;

	@ObfuscatedName("ajk.r")
	public Model model;

	@ObfuscatedName("ajk.v")
	public HardShadow shadow;

	@ObfuscatedName("ajk.o")
	public EntityBounds field11149;

	@ObfuscatedName("ajk.s")
	public final int id;

	@ObfuscatedName("ajk.y")
	public final byte shape;

	@ObfuscatedName("ajk.q")
	public final byte angle;

	@ObfuscatedName("ajk.x")
	public final boolean field11156;

	@ObfuscatedName("ajk.b")
	public boolean active;

	@ObfuscatedName("ajk.h")
	public boolean hasHardShadow;

	@ObfuscatedName("ajk.a")
	public int field11151;

	public StaticWallDecorEntity(Scene scene, Toolkit toolkit, LocTypeList locTypeList, LocType locType, int level, int occludeLevel, int arg6, int arg7, int arg8, boolean underwater, int arg10, int arg11, int shape, int angle, ScaleRotTrans arg14) {
		super(scene, arg6, arg7, arg8, level, occludeLevel, arg10, arg11, arg14);
		this.locTypeList = locTypeList;
		this.id = locType.id;
		this.field11156 = underwater;
		this.angle = (byte) angle;
		this.shape = (byte) shape;
		this.active = locType.active != 0 && !underwater;
		this.hasHardShadow = toolkit.supportsHardShadows() && locType.hardshadow && !this.field11156 && Client.preferences.sceneryShadows.getValue() != 0;
		this.field11151 = arg7;
		int var16 = 2048;
		if (locType.antimacro) {
			var16 |= 0x80000;
		}
		Pair var17 = this.method17414(toolkit, var16, this.hasHardShadow);
		if (var17 != null) {
			this.model = (Model) var17.first;
			this.shadow = (HardShadow) var17.second;
			if (locType.antimacro) {
				this.model = this.model.method1773((byte) 0, var16, false);
				if (locType.antimacro) {
					LocTint var18 = Client.world.method7722();
					this.model.method1745(var18.field5015, var18.field5013, var18.field5014, var18.field5012);
				}
			}
		}
		this.createEntityBounds(1);
	}

	@ObfuscatedName("ajk.bu(B)Z")
	public boolean method16488() {
		if (this.model == null) {
			return true;
		} else {
			return !this.model.method1812();
		}
	}

	@ObfuscatedName("ajk.bw(S)Z")
	public boolean method16489() {
		return this.model == null ? false : this.model.method1731();
	}

	@ObfuscatedName("ajk.by(B)I")
	public int overlayHeight() {
		return this.model == null ? 0 : this.model.getMinY();
	}

	@ObfuscatedName("ajk.bz(Ldh;IB)Ldo;")
	public Model method17411(Toolkit arg0, int arg1) {
		if (this.model != null && arg0.method2394(this.model.method1691(), arg1) == 0) {
			return this.model;
		} else {
			Pair var3 = this.method17414(arg0, arg1, false);
			return var3 == null ? null : (Model) var3.first;
		}
	}

	@ObfuscatedName("ajk.bv(Ldh;IZI)Labg;")
	public Pair method17414(Toolkit arg0, int arg1, boolean arg2) {
		LocType var4 = (LocType) this.locTypeList.list(this.id);
		FloorModel var5;
		FloorModel var6;
		if (this.field11156) {
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
		return var4.method9475(arg0, arg1, this.shape, this.angle, var5, var6, (int) var7.x, this.field11151, (int) var7.z, arg2, null);
	}

	@ObfuscatedName("ajk.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Toolkit toolkit) {
		Vector3 var2 = this.getTransform().trans;
		if (this.field11149 == null) {
			this.field11149 = GraphEntity.method15111((int) var2.x, (int) var2.y, (int) var2.z, this.method17411(toolkit, 0));
		}
		return this.field11149;
	}

	@ObfuscatedName("ajk.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Toolkit toolkit) {
		if (this.model == null) {
			return null;
		}
		Matrix4x3 var2 = toolkit.method2209();
		var2.setTo(this.method10533());
		var2.translate((float) this.field12452, 0.0F, (float) this.field12451);
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

	@ObfuscatedName("ajk.fw(Ldh;I)V")
	public void method17373(Toolkit toolkit) {
	}

	@ObfuscatedName("ajk.fa(Ldh;IIB)Z")
	public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		Cuboid var4 = ((LocType) this.locTypeList.list(this.id)).clickbox;
		if (var4 != null) {
			return toolkit.pick(arg1, arg2, this.method10533(), var4);
		}
		Model var5 = this.method17411(toolkit, 131072);
		if (var5 == null) {
			return false;
		} else {
			Matrix4x3 var6 = this.method10533();
			return var5.method1725(arg1, arg2, var6, false, 0);
		}
	}

	@ObfuscatedName("ajk.e(I)I")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("ajk.n(I)I")
	public int getShape() {
		return this.shape;
	}

	@ObfuscatedName("ajk.m(I)I")
	public int getAngle() {
		return this.angle;
	}

	@ObfuscatedName("ajk.k(I)V")
	public void method8205() {
		if (this.model != null) {
			this.model.method1816();
		}
	}

	@ObfuscatedName("ajk.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajk.f(I)Z")
	public boolean hasShadow() {
		return this.hasHardShadow;
	}

	@ObfuscatedName("ajk.l(Ldh;B)V")
	public void method8217(Toolkit arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.shadow == null && this.hasHardShadow) {
			Pair var3 = this.method17414(arg0, 262144, true);
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

	@ObfuscatedName("ajk.u(Ldh;B)V")
	public void method8209(Toolkit arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.shadow == null && this.hasHardShadow) {
			Pair var3 = this.method17414(arg0, 262144, true);
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

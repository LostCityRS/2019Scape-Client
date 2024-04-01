package com.jagex.game.world.entity;

import com.jagex.core.datastruct.Pair;
import com.jagex.game.client.HardShadow;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.FloorModel;
import com.jagex.graphics.Model;
import com.jagex.graphics.Renderer;
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
	public LocTypeList field11159;

	@ObfuscatedName("ajk.r")
	public Model field11150;

	@ObfuscatedName("ajk.v")
	public HardShadow field11154;

	@ObfuscatedName("ajk.o")
	public EntityBounds field11149;

	@ObfuscatedName("ajk.s")
	public final int field11715;

	@ObfuscatedName("ajk.y")
	public final byte field11152;

	@ObfuscatedName("ajk.q")
	public final byte field11155;

	@ObfuscatedName("ajk.x")
	public final boolean field11156;

	@ObfuscatedName("ajk.b")
	public boolean field11157;

	@ObfuscatedName("ajk.h")
	public boolean field11158;

	@ObfuscatedName("ajk.a")
	public int field11151;

	public StaticWallDecorEntity(Scene arg0, Renderer arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, ScaleRotTrans arg14) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11, arg14);
		this.field11159 = arg2;
		this.field11715 = arg3.id;
		this.field11156 = arg9;
		this.field11155 = (byte) arg13;
		this.field11152 = (byte) arg12;
		this.field11157 = arg3.active != 0 && !arg9;
		this.field11158 = arg1.supportsHardShadows() && arg3.hardshadow && !this.field11156 && Client.preferences.sceneryShadows.getValue() != 0;
		this.field11151 = arg7;
		int var16 = 2048;
		if (arg3.antimacro) {
			var16 |= 0x80000;
		}
		Pair var17 = this.method17414(arg1, var16, this.field11158);
		if (var17 != null) {
			this.field11150 = (Model) var17.first;
			this.field11154 = (HardShadow) var17.second;
			if (arg3.antimacro) {
				this.field11150 = this.field11150.method1773((byte) 0, var16, false);
				if (arg3.antimacro) {
					LocTint var18 = Client.world.method7722();
					this.field11150.method1745(var18.field5015, var18.field5013, var18.field5014, var18.field5012);
				}
			}
		}
		this.createEntityBounds(1);
	}

	@ObfuscatedName("ajk.bu(B)Z")
	public boolean method16488() {
		if (this.field11150 == null) {
			return true;
		} else {
			return !this.field11150.method1812();
		}
	}

	@ObfuscatedName("ajk.bw(S)Z")
	public boolean method16489() {
		return this.field11150 == null ? false : this.field11150.method1731();
	}

	@ObfuscatedName("ajk.by(B)I")
	public int overlayHeight() {
		return this.field11150 == null ? 0 : this.field11150.getMinY();
	}

	@ObfuscatedName("ajk.bz(Ldh;IB)Ldo;")
	public Model method17411(Renderer arg0, int arg1) {
		if (this.field11150 != null && arg0.method2394(this.field11150.method1691(), arg1) == 0) {
			return this.field11150;
		} else {
			Pair var3 = this.method17414(arg0, arg1, false);
			return var3 == null ? null : (Model) var3.first;
		}
	}

	@ObfuscatedName("ajk.bv(Ldh;IZI)Labg;")
	public Pair method17414(Renderer arg0, int arg1, boolean arg2) {
		LocType var4 = (LocType) this.field11159.list(this.field11715);
		FloorModel var5;
		FloorModel var6;
		if (this.field11156) {
			var5 = this.scene.field6917[this.field11714];
			var6 = this.scene.field6915[0];
		} else {
			var5 = this.scene.field6915[this.field11714];
			if (this.field11714 < 3) {
				var6 = this.scene.field6915[this.field11714 + 1];
			} else {
				var6 = null;
			}
		}
		Vector3 var7 = this.getTransform().trans;
		return var4.method9475(arg0, arg1, this.field11152, this.field11155, var5, var6, (int) var7.x, this.field11151, (int) var7.z, arg2, null);
	}

	@ObfuscatedName("ajk.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Renderer renderer) {
		Vector3 var2 = this.getTransform().trans;
		if (this.field11149 == null) {
			this.field11149 = GraphEntity.method15111((int) var2.x, (int) var2.y, (int) var2.z, this.method17411(renderer, 0));
		}
		return this.field11149;
	}

	@ObfuscatedName("ajk.fc(Ldh;I)Ltl;")
	public PickableEntity draw(Renderer renderer) {
		if (this.field11150 == null) {
			return null;
		}
		Matrix4x3 var2 = renderer.method2209();
		var2.setTo(this.method10533());
		var2.translate((float) this.field12452, 0.0F, (float) this.field12451);
		PickableEntity var3 = PickableEntity.getPickableEntity(this.field11157);
		Cuboid var4 = ((LocType) this.field11159.list(this.field11715)).clickbox;
		if (var4 == null) {
			this.field11150.draw(var2, this.entityBounds[0], 0);
		} else {
			this.field11150.draw(var2, null, 0);
			renderer.method2193(var2, this.entityBounds[0], var4);
		}
		return var3;
	}

	@ObfuscatedName("ajk.fw(Ldh;I)V")
	public void method17373(Renderer renderer) {
	}

	@ObfuscatedName("ajk.fa(Ldh;IIB)Z")
	public boolean method17375(Renderer renderer, int arg1, int arg2) {
		Cuboid var4 = ((LocType) this.field11159.list(this.field11715)).clickbox;
		if (var4 != null) {
			return renderer.pick(arg1, arg2, this.method10533(), var4);
		}
		Model var5 = this.method17411(renderer, 131072);
		if (var5 == null) {
			return false;
		} else {
			Matrix4x3 var6 = this.method10533();
			return var5.method1725(arg1, arg2, var6, false, 0);
		}
	}

	@ObfuscatedName("ajk.e(I)I")
	public int method8223() {
		return this.field11715;
	}

	@ObfuscatedName("ajk.n(I)I")
	public int method8220() {
		return this.field11152;
	}

	@ObfuscatedName("ajk.m(I)I")
	public int method8204() {
		return this.field11155;
	}

	@ObfuscatedName("ajk.k(I)V")
	public void method8205() {
		if (this.field11150 != null) {
			this.field11150.method1816();
		}
	}

	@ObfuscatedName("ajk.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajk.f(I)Z")
	public boolean method8206() {
		return this.field11158;
	}

	@ObfuscatedName("ajk.l(Ldh;B)V")
	public void method8217(Renderer arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.field11154 == null && this.field11158) {
			Pair var3 = this.method17414(arg0, 262144, true);
			var4 = (HardShadow) (var3 == null ? null : var3.second);
		} else {
			var4 = this.field11154;
			this.field11154 = null;
		}
		Vector3 var5 = this.getTransform().trans;
		if (var4 != null) {
			this.scene.method8750(var4, this.field11714, (int) var5.x, (int) var5.z, null);
		}
	}

	@ObfuscatedName("ajk.u(Ldh;B)V")
	public void method8209(Renderer arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.field11154 == null && this.field11158) {
			Pair var3 = this.method17414(arg0, 262144, true);
			var4 = (HardShadow) (var3 == null ? null : var3.second);
		} else {
			var4 = this.field11154;
			this.field11154 = null;
		}
		Vector3 var5 = this.getTransform().trans;
		if (var4 != null) {
			this.scene.method8814(var4, this.field11714, (int) var5.x, (int) var5.z, null);
		}
	}
}

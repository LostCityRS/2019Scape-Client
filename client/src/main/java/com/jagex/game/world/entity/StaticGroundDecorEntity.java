package com.jagex.game.world.entity;

import com.jagex.game.client.HardShadow;
import com.jagex.client;
import com.jagex.core.datastruct.Pair;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.FloorModel;
import com.jagex.graphics.Model;
import com.jagex.graphics.Renderer;
import com.jagex.math.Cuboid;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ajz")
public class StaticGroundDecorEntity extends GroundDecorLayerEntity implements Location {

	@ObfuscatedName("ajz.c")
	public LocTypeList field11185;

	@ObfuscatedName("ajz.r")
	public Model field11192;

	@ObfuscatedName("ajz.v")
	public HardShadow field11186;

	@ObfuscatedName("ajz.o")
	public EntityBounds field11187;

	@ObfuscatedName("ajz.s")
	public final int field11715;

	@ObfuscatedName("ajz.y")
	public final byte field11189;

	@ObfuscatedName("ajz.q")
	public final boolean field11190;

	@ObfuscatedName("ajz.x")
	public boolean field11191;

	@ObfuscatedName("ajz.b")
	public boolean field11184;

	@ObfuscatedName("ajz.h")
	public boolean field11193;

	@ObfuscatedName("ajz.a")
	public int field11194;

	public StaticGroundDecorEntity(Scene arg0, Renderer arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, boolean arg11, ScaleRotTrans arg12) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.field7448, arg12);
		this.field11185 = arg2;
		this.field11715 = arg3.field7450;
		this.field11190 = arg9;
		this.field11189 = (byte) arg10;
		this.field11191 = arg3.field7470 != 0 && !arg9;
		this.field11184 = arg11;
		this.field11193 = arg1.method2125() && arg3.field7453 && !this.field11190 && Statics.field688.sceneryShadows.method18515() != 0;
		this.field11194 = arg7;
		int var14 = 2048;
		if (this.field11184) {
			var14 |= 0x10000;
		}
		if (arg3.field7525) {
			var14 |= 0x80000;
		}
		Pair var15 = this.method17436(arg1, var14, this.field11193);
		if (var15 != null) {
			this.field11192 = (Model) var15.field8737;
			this.field11186 = (HardShadow) var15.field8738;
			if (this.field11184 || arg3.field7525) {
				this.field11192 = this.field11192.method1773((byte) 0, var14, false);
				if (arg3.field7525) {
					LocTint var16 = client.world.method7722();
					this.field11192.method1745(var16.field5015, var16.field5013, var16.field5014, var16.field5012);
				}
			}
		}
		this.method18363(1);
	}

	@ObfuscatedName("ajz.bu(B)Z")
	public boolean method16488() {
		if (this.field11192 == null) {
			return true;
		} else {
			return !this.field11192.method1812();
		}
	}

	@ObfuscatedName("ajz.bw(S)Z")
	public boolean method16489() {
		return this.field11192 == null ? false : this.field11192.method1731();
	}

	@ObfuscatedName("ajz.by(B)I")
	public int method16523() {
		return this.field11192 == null ? 0 : this.field11192.method1748();
	}

	@ObfuscatedName("ajz.bz(Ldh;IB)Ldo;")
	public Model method17435(Renderer arg0, int arg1) {
		if (this.field11192 != null && arg0.method2394(this.field11192.method1691(), arg1) == 0) {
			return this.field11192;
		} else {
			Pair var3 = this.method17436(arg0, arg1, false);
			return var3 == null ? null : (Model) var3.field8737;
		}
	}

	@ObfuscatedName("ajz.bv(Ldh;IZI)Labg;")
	public Pair method17436(Renderer arg0, int arg1, boolean arg2) {
		LocType var4 = (LocType) this.field11185.get(this.field11715);
		FloorModel var5;
		FloorModel var6;
		if (this.field11190) {
			var5 = this.field11716.field6917[this.field11714];
			var6 = this.field11716.field6915[0];
		} else {
			var5 = this.field11716.field6915[this.field11714];
			if (this.field11714 < 3) {
				var6 = this.field11716.field6915[this.field11714 + 1];
			} else {
				var6 = null;
			}
		}
		Vector3 var7 = this.method10536().field4298;
		return var4.method9475(arg0, arg1, LocShape.field7566.field7562, this.field11189, var5, var6, (int) var7.field4308, this.field11194, (int) var7.field4313, arg2, null);
	}

	@ObfuscatedName("ajz.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Renderer arg0) {
		Vector3 var2 = this.method10536().field4298;
		if (this.field11187 == null) {
			this.field11187 = GraphEntity.method15111((int) var2.field4308, (int) var2.field4311, (int) var2.field4313, this.method17435(arg0, 0));
		}
		return this.field11187;
	}

	@ObfuscatedName("ajz.fc(Ldh;I)Ltl;")
	public PickableEntity method17372(Renderer arg0) {
		if (this.field11192 == null) {
			return null;
		}
		Matrix4x3 var2 = this.method10533();
		PickableEntity var3 = PickableEntity.method16749(this.field11191);
		Cuboid var4 = ((LocType) this.field11185.get(this.field11715)).field7468;
		if (var4 == null) {
			this.field11192.method1813(var2, this.field11713[0], 0);
		} else {
			this.field11192.method1813(var2, null, 0);
			arg0.method2193(var2, this.field11713[0], var4);
		}
		return var3;
	}

	@ObfuscatedName("ajz.fw(Ldh;I)V")
	public void method17373(Renderer arg0) {
	}

	@ObfuscatedName("ajz.fa(Ldh;IIB)Z")
	public boolean method17375(Renderer arg0, int arg1, int arg2) {
		Cuboid var4 = ((LocType) this.field11185.get(this.field11715)).field7468;
		if (var4 != null) {
			return arg0.method2191(arg1, arg2, this.method10533(), var4);
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
	public void method17377(Renderer arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof StaticGroundDecorEntity) {
			StaticGroundDecorEntity var7 = (StaticGroundDecorEntity) arg1;
			if (this.field11192 != null && var7.field11192 != null) {
				this.field11192.method1686(var7.field11192, arg2, arg3, arg4, arg5);
			}
		}
	}

	@ObfuscatedName("ajz.ff(B)V")
	public void method17378() {
		this.field11184 = false;
		if (this.field11192 != null) {
			this.field11192.method1690(this.field11192.method1691() & 0xFFFEFFFF);
		}
	}

	@ObfuscatedName("ajz.e(I)I")
	public int method8223() {
		return this.field11715;
	}

	@ObfuscatedName("ajz.n(I)I")
	public int method8220() {
		return LocShape.field7566.field7562;
	}

	@ObfuscatedName("ajz.m(I)I")
	public int method8204() {
		return this.field11189;
	}

	@ObfuscatedName("ajz.k(I)V")
	public void method8205() {
		if (this.field11192 != null) {
			this.field11192.method1816();
		}
	}

	@ObfuscatedName("ajz.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajz.f(I)Z")
	public boolean method8206() {
		return this.field11193;
	}

	@ObfuscatedName("ajz.l(Ldh;B)V")
	public void method8217(Renderer arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.field11186 == null && this.field11193) {
			Pair var3 = this.method17436(arg0, 262144, true);
			var4 = (HardShadow) (var3 == null ? null : var3.field8738);
		} else {
			var4 = this.field11186;
			this.field11186 = null;
		}
		Vector3 var5 = this.method10536().field4298;
		if (var4 != null) {
			this.field11716.method8750(var4, this.field11714, (int) var5.field4308, (int) var5.field4313, null);
		}
	}

	@ObfuscatedName("ajz.u(Ldh;B)V")
	public void method8209(Renderer arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.field11186 == null && this.field11193) {
			Pair var3 = this.method17436(arg0, 262144, true);
			var4 = (HardShadow) (var3 == null ? null : var3.field8738);
		} else {
			var4 = this.field11186;
			this.field11186 = null;
		}
		Vector3 var5 = this.method10536().field4298;
		if (var4 != null) {
			this.field11716.method8814(var4, this.field11714, (int) var5.field4308, (int) var5.field4313, null);
		}
	}
}

package com.jagex.game.world.entity;

import com.jagex.core.datastruct.Pair;
import com.jagex.game.client.HardShadow;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.FloorModel;
import com.jagex.graphics.Model;
import com.jagex.graphics.Renderer;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.WallLayerEntity;
import com.jagex.math.Cuboid;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import deob.Statics;
import rs2.client.Client;

@ObfuscatedName("ajg")
public class StaticWallEntity extends WallLayerEntity implements Location {

	@ObfuscatedName("ajg.c")
	public static final int[] field11164 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("ajg.r")
	public static final int[] field11160 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("ajg.v")
	public LocTypeList field11162;

	@ObfuscatedName("ajg.o")
	public Model field11173;

	@ObfuscatedName("ajg.s")
	public HardShadow field11163;

	@ObfuscatedName("ajg.y")
	public EntityBounds field11165;

	@ObfuscatedName("ajg.q")
	public final int field11166;

	@ObfuscatedName("ajg.x")
	public final byte field11161;

	@ObfuscatedName("ajg.b")
	public final byte field11167;

	@ObfuscatedName("ajg.h")
	public final boolean field11169;

	@ObfuscatedName("ajg.a")
	public boolean field11170;

	@ObfuscatedName("ajg.g")
	public boolean field11171;

	@ObfuscatedName("ajg.i")
	public boolean field11172;

	@ObfuscatedName("ajg.j")
	public int field12460;

	public StaticWallEntity(Scene arg0, Renderer arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, boolean arg12, ScaleRotTrans arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, method1575(arg10, arg11), arg13);
		this.field11162 = arg2;
		this.field11166 = arg3.field7450;
		this.field11169 = arg9;
		this.field11167 = (byte) arg10;
		this.field11161 = (byte) arg11;
		this.field11170 = arg3.field7470 != 0 && !arg9;
		this.field11171 = arg12;
		this.field11172 = arg1.method2125() && arg3.field7453 && !this.field11169 && Statics.field688.sceneryShadows.method18515() != 0;
		this.field12460 = arg7;
		int var15 = 2048;
		if (this.field11171) {
			var15 |= 0x10000;
		}
		if (arg3.field7525) {
			var15 |= 0x80000;
		}
		Pair var16 = this.method17420(arg1, var15, this.field11172);
		if (var16 != null) {
			this.field11173 = (Model) var16.field8737;
			this.field11163 = (HardShadow) var16.field8738;
			if (this.field11171 || arg3.field7525) {
				this.field11173 = this.field11173.method1773((byte) 0, var15, false);
				if (arg3.field7525) {
					LocTint var17 = Client.world.method7722();
					this.field11173.method1745(var17.field5015, var17.field5013, var17.field5014, var17.field5012);
				}
			}
		}
		this.method18363(1);
	}

	@ObfuscatedName("ajg.bu(B)Z")
	public boolean method16488() {
		if (this.field11173 == null) {
			return true;
		} else {
			return !this.field11173.method1812();
		}
	}

	@ObfuscatedName("ajg.bw(S)Z")
	public boolean method16489() {
		return this.field11173 == null ? false : this.field11173.method1731();
	}

	@ObfuscatedName("ajg.by(B)I")
	public int method16523() {
		return this.field11173 == null ? 0 : this.field11173.method1748();
	}

	@ObfuscatedName("cs.bz(III)I")
	public static int method1575(int arg0, int arg1) {
		return LocShape.field7551.field7562 == arg0 || LocShape.field7546.field7562 == arg0 ? field11160[arg1 & 0x3] : field11164[arg1 & 0x3];
	}

	@ObfuscatedName("ajg.bv(Ldh;II)Ldo;")
	public Model method17419(Renderer arg0, int arg1) {
		if (this.field11173 != null && arg0.method2394(this.field11173.method1691(), arg1) == 0) {
			return this.field11173;
		} else {
			Pair var3 = this.method17420(arg0, arg1, false);
			return var3 == null ? null : (Model) var3.field8737;
		}
	}

	@ObfuscatedName("ajg.br(Ldh;IZI)Labg;")
	public Pair method17420(Renderer arg0, int arg1, boolean arg2) {
		LocType var4 = (LocType) this.field11162.list(this.field11166);
		FloorModel var5;
		FloorModel var6;
		if (this.field11169) {
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
		return var4.method9475(arg0, arg1, this.field11167, this.field11161, var5, var6, (int) var7.field4308, this.field12460, (int) var7.field4313, arg2, null);
	}

	@ObfuscatedName("ajg.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Renderer arg0) {
		Vector3 var2 = this.method10536().field4298;
		if (this.field11165 == null) {
			this.field11165 = GraphEntity.method15111((int) var2.field4308, (int) var2.field4311, (int) var2.field4313, this.method17419(arg0, 0));
		}
		return this.field11165;
	}

	@ObfuscatedName("ajg.fc(Ldh;I)Ltl;")
	public PickableEntity method17372(Renderer arg0) {
		if (this.field11173 == null) {
			return null;
		}
		Matrix4x3 var2 = this.method10533();
		PickableEntity var3 = PickableEntity.method16749(this.field11170);
		Cuboid var4 = ((LocType) this.field11162.list(this.field11166)).field7468;
		if (var4 == null) {
			this.field11173.method1813(var2, this.field11713[0], 0);
		} else {
			this.field11173.method1813(var2, null, 0);
			arg0.method2193(var2, this.field11713[0], var4);
		}
		return var3;
	}

	@ObfuscatedName("ajg.fw(Ldh;I)V")
	public void method17373(Renderer arg0) {
	}

	@ObfuscatedName("ajg.fa(Ldh;IIB)Z")
	public boolean method17375(Renderer arg0, int arg1, int arg2) {
		Cuboid var4 = ((LocType) this.field11162.list(this.field11166)).field7468;
		if (var4 != null) {
			return arg0.method2191(arg1, arg2, this.method10533(), var4);
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
	public void method17377(Renderer arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof StaticWallEntity) {
			StaticWallEntity var7 = (StaticWallEntity) arg1;
			if (this.field11173 != null && var7.field11173 != null) {
				this.field11173.method1686(var7.field11173, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof StaticSceneryEntity) {
			StaticSceneryEntity var8 = (StaticSceneryEntity) arg1;
			if (this.field11173 != null && var8.field11136 != null) {
				this.field11173.method1686(var8.field11136, arg2, arg3, arg4, arg5);
			}
		}
	}

	@ObfuscatedName("ajg.ff(B)V")
	public void method17378() {
		this.field11171 = false;
		if (this.field11173 != null) {
			this.field11173.method1690(this.field11173.method1691() & 0xFFFEFFFF);
		}
	}

	@ObfuscatedName("ajg.e(I)I")
	public int method8223() {
		return this.field11166;
	}

	@ObfuscatedName("ajg.n(I)I")
	public int method8220() {
		return this.field11167;
	}

	@ObfuscatedName("ajg.m(I)I")
	public int method8204() {
		return this.field11161;
	}

	@ObfuscatedName("ajg.k(I)V")
	public void method8205() {
		if (this.field11173 != null) {
			this.field11173.method1816();
		}
	}

	@ObfuscatedName("ajg.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajg.f(I)Z")
	public boolean method8206() {
		return this.field11172;
	}

	@ObfuscatedName("ajg.l(Ldh;B)V")
	public void method8217(Renderer arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.field11163 == null && this.field11172) {
			Pair var3 = this.method17420(arg0, 262144, true);
			var4 = (HardShadow) (var3 == null ? null : var3.field8738);
		} else {
			var4 = this.field11163;
			this.field11163 = null;
		}
		Vector3 var5 = this.method10536().field4298;
		if (var4 != null) {
			this.field11716.method8750(var4, this.field11714, (int) var5.field4308, (int) var5.field4313, null);
		}
	}

	@ObfuscatedName("ajg.u(Ldh;B)V")
	public void method8209(Renderer arg0) {
		Object var2 = null;
		HardShadow var4;
		if (this.field11163 == null && this.field11172) {
			Pair var3 = this.method17420(arg0, 262144, true);
			var4 = (HardShadow) (var3 == null ? null : var3.field8738);
		} else {
			var4 = this.field11163;
			this.field11163 = null;
		}
		Vector3 var5 = this.method10536().field4298;
		if (var4 != null) {
			this.field11716.method8814(var4, this.field11714, (int) var5.field4308, (int) var5.field4313, null);
		}
	}
}

package com.jagex;

import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import deob.ObfuscatedName;

@ObfuscatedName("ajj")
public class DynamicWallEntity extends WallLayerEntity implements Location {

	@ObfuscatedName("ajj.c")
	public DynamicLoc field11179;

	@ObfuscatedName("ajj.r")
	public boolean field11178;

	@ObfuscatedName("ajj.v")
	public EntityBounds field11181;

	@ObfuscatedName("ajj.o")
	public static final int[] field11180 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("ajj.s")
	public static final int[] field11182 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("ajj.y")
	public boolean field11183 = true;

	public DynamicWallEntity(Scene arg0, Renderer arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, ScaleRotTrans arg14) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, method9908(arg10, arg11), arg14);
		this.field11179 = new DynamicLoc(arg1, arg2, arg3, arg10, arg11, arg5, this, arg9, arg12, arg13);
		this.field11178 = arg3.field7470 != 0 && !arg9;
		this.method18363(1);
	}

	@ObfuscatedName("ajj.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("ajj.bw(S)Z")
	public boolean method16489() {
		return this.field11183;
	}

	@ObfuscatedName("xm.bz(III)I")
	public static int method9908(int arg0, int arg1) {
		return LocShape.field7551.field7562 == arg0 || LocShape.field7546.field7562 == arg0 ? field11182[arg1 & 0x3] : field11180[arg1 & 0x3];
	}

	@ObfuscatedName("ajj.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Renderer arg0) {
		return this.field11181;
	}

	@ObfuscatedName("ajj.by(B)I")
	public int method16523() {
		return this.field11179.method8262();
	}

	@ObfuscatedName("ajj.bo(I)I")
	public int method16501() {
		return this.field11179.method8236();
	}

	@ObfuscatedName("ajj.bv(Lvp;I)V")
	public void method17429(LocTypeCustomisation arg0) {
		this.field11179.method8265(arg0);
	}

	@ObfuscatedName("ajj.fc(Ldh;I)Ltl;")
	public PickableEntity method17372(Renderer arg0) {
		Model var2 = this.field11179.method8238(arg0, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.method10536();
		PickableEntity var5 = PickableEntity.method16749(this.field11178);
		int var6 = (int) var4.field4298.field4308 >> 9;
		int var7 = (int) var4.field4298.field4313 >> 9;
		this.field11179.method8239(arg0, var2, var3, var6, var6, var7, var7, true);
		LocType var8 = this.field11179.method8237();
		if (var8.field7468 == null) {
			var2.method1813(var3, this.field11713[0], 0);
		} else {
			var2.method1813(var3, null, 0);
			arg0.method2193(var3, this.field11713[0], var8.field7468);
		}
		if (this.field11179.field6680 != null) {
			ParticleList var9 = this.field11179.field6680.method9965();
			arg0.method2198(var9);
		}
		this.field11183 = var2.method1731() || this.field11179.field6680 != null;
		if (this.field11181 == null) {
			this.field11181 = GraphEntity.method15111((int) var4.field4298.field4308, (int) var4.field4298.field4311, (int) var4.field4298.field4313, var2);
		} else {
			GraphEntity.method8229(this.field11181, (int) var4.field4298.field4308, (int) var4.field4298.field4311, (int) var4.field4298.field4313, var2);
		}
		return var5;
	}

	@ObfuscatedName("ajj.fw(Ldh;I)V")
	public void method17373(Renderer arg0) {
		Model var2 = this.field11179.method8238(arg0, 262144, true, true);
		if (var2 == null) {
			return;
		}
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.method10536();
		int var5 = (int) var4.field4298.field4308 >> 9;
		int var6 = (int) var4.field4298.field4313 >> 9;
		this.field11179.method8239(arg0, var2, var3, var5, var5, var6, var6, false);
	}

	@ObfuscatedName("ajj.fa(Ldh;IIB)Z")
	public boolean method17375(Renderer arg0, int arg1, int arg2) {
		LocType var4 = this.field11179.method8237();
		if (var4.field7468 == null) {
			Model var5 = this.field11179.method8238(arg0, 131072, false, false);
			return var5 == null ? false : var5.method1725(arg1, arg2, this.method10533(), false, 0);
		} else {
			return arg0.method2191(arg1, arg2, this.method10533(), var4.field7468);
		}
	}

	@ObfuscatedName("ajj.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("ajj.fq(Ldh;Lalh;IIIZB)V")
	public final void method17377(Renderer arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajj.ff(B)V")
	public final void method17378() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajj.e(I)I")
	public int method8223() {
		return this.field11179.field6665;
	}

	@ObfuscatedName("ajj.n(I)I")
	public int method8220() {
		return this.field11179.field6666;
	}

	@ObfuscatedName("ajj.m(I)I")
	public int method8204() {
		return this.field11179.field6667;
	}

	@ObfuscatedName("ajj.k(I)V")
	public void method8205() {
	}

	@ObfuscatedName("ajj.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajj.f(I)Z")
	public boolean method8206() {
		return this.field11179.method8240();
	}

	@ObfuscatedName("ajj.l(Ldh;B)V")
	public void method8217(Renderer arg0) {
		this.field11179.method8241(arg0);
	}

	@ObfuscatedName("ajj.u(Ldh;B)V")
	public void method8209(Renderer arg0) {
		this.field11179.method8242(arg0);
	}
}

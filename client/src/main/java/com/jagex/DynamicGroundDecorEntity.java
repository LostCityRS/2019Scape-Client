package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajs")
public class DynamicGroundDecorEntity extends GroundDecorLayerEntity implements Location {

	@ObfuscatedName("ajs.c")
	public DynamicLoc field11133;

	@ObfuscatedName("ajs.r")
	public boolean field11132;

	@ObfuscatedName("ajs.v")
	public EntityBounds field11134;

	@ObfuscatedName("ajs.o")
	public boolean field11135 = true;

	public DynamicGroundDecorEntity(Scene arg0, Renderer arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, ScaleRotTrans arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.field7448, arg13);
		this.field11133 = new DynamicLoc(arg1, arg2, arg3, LocShape.field7566.field7562, arg10, arg5, this, arg9, arg11, arg12);
		this.field11132 = arg3.field7470 != 0 && !arg9;
		this.method18363(1);
	}

	@ObfuscatedName("ajs.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("ajs.bw(S)Z")
	public boolean method16489() {
		return this.field11135;
	}

	@ObfuscatedName("ajs.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Renderer arg0) {
		return this.field11134;
	}

	@ObfuscatedName("ajs.by(B)I")
	public int method16523() {
		return this.field11133.method8262();
	}

	@ObfuscatedName("ajs.bo(I)I")
	public int method16501() {
		return this.field11133.method8236();
	}

	@ObfuscatedName("ajs.fc(Ldh;I)Ltl;")
	public PickableEntity method17372(Renderer arg0) {
		Model var2 = this.field11133.method8238(arg0, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.method10536();
		PickableEntity var5 = PickableEntity.method16749(this.field11132);
		int var6 = (int) var4.field4298.field4308 >> 9;
		int var7 = (int) var4.field4298.field4313 >> 9;
		this.field11133.method8239(arg0, var2, var3, var6, var6, var7, var7, true);
		LocType var8 = this.field11133.method8237();
		if (var8.field7468 == null) {
			var2.method1813(var3, this.field11713[0], 0);
		} else {
			var2.method1813(var3, null, 0);
			arg0.method2193(var3, this.field11713[0], var8.field7468);
		}
		if (this.field11133.field6680 != null) {
			ParticleList var9 = this.field11133.field6680.method9965();
			arg0.method2198(var9);
		}
		this.field11135 = var2.method1731() || this.field11133.field6680 != null;
		if (this.field11134 == null) {
			this.field11134 = GraphEntity.method15111((int) var4.field4298.field4308, (int) var4.field4298.field4311, (int) var4.field4298.field4313, var2);
		} else {
			GraphEntity.method8229(this.field11134, (int) var4.field4298.field4308, (int) var4.field4298.field4311, (int) var4.field4298.field4313, var2);
		}
		return var5;
	}

	@ObfuscatedName("ajs.fw(Ldh;I)V")
	public void method17373(Renderer arg0) {
		Model var2 = this.field11133.method8238(arg0, 262144, true, true);
		if (var2 != null) {
			Vector3 var3 = this.method10536().field4298;
			int var4 = (int) var3.field4308 >> 9;
			int var5 = (int) var3.field4313 >> 9;
			this.field11133.method8239(arg0, var2, this.method10533(), var4, var4, var5, var5, false);
		}
	}

	@ObfuscatedName("ajs.fa(Ldh;IIB)Z")
	public boolean method17375(Renderer arg0, int arg1, int arg2) {
		LocType var4 = this.field11133.method8237();
		if (var4.field7468 == null) {
			Model var5 = this.field11133.method8238(arg0, 131072, false, false);
			return var5 == null ? false : var5.method1725(arg1, arg2, this.method10533(), false, 0);
		} else {
			return arg0.method2191(arg1, arg2, this.method10533(), var4.field7468);
		}
	}

	@ObfuscatedName("ajs.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("ajs.fq(Ldh;Lalh;IIIZB)V")
	public final void method17377(Renderer arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajs.ff(B)V")
	public final void method17378() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ajs.e(I)I")
	public int method8223() {
		return this.field11133.field6665;
	}

	@ObfuscatedName("ajs.n(I)I")
	public int method8220() {
		return this.field11133.field6666;
	}

	@ObfuscatedName("ajs.m(I)I")
	public int method8204() {
		return this.field11133.field6667;
	}

	@ObfuscatedName("ajs.bz(Lvp;I)V")
	public void method17396(LocTypeCustomisation arg0) {
		this.field11133.method8265(arg0);
	}

	@ObfuscatedName("ajs.k(I)V")
	public void method8205() {
	}

	@ObfuscatedName("ajs.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajs.f(I)Z")
	public boolean method8206() {
		return this.field11133.method8240();
	}

	@ObfuscatedName("ajs.l(Ldh;B)V")
	public void method8217(Renderer arg0) {
		this.field11133.method8241(arg0);
	}

	@ObfuscatedName("ajs.u(Ldh;B)V")
	public void method8209(Renderer arg0) {
		this.field11133.method8242(arg0);
	}
}

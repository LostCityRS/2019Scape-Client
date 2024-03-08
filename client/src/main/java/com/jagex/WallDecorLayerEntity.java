package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asm")
public abstract class WallDecorLayerEntity extends GraphEntity {

	@ObfuscatedName("asm.x")
	public short field12452;

	@ObfuscatedName("asm.b")
	public short field12451;

	@ObfuscatedName("asm.h")
	public int field12450 = 0;

	@ObfuscatedName("asm.a")
	public Light[] field12453 = new Light[4];

	public WallDecorLayerEntity(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ScaleRotTrans arg8) {
		super(arg0, arg8);
		this.field11717 = (byte) arg4;
		this.field11714 = (byte) arg5;
		this.field12452 = (short) arg6;
		this.field12451 = (short) arg7;
		if (arg8 != null) {
			this.method10529(arg8);
		}
		this.method10532((float) arg1, (float) arg2, (float) arg3);
		for (int var10 = 0; var10 < 4; var10++) {
			this.field12453[var10] = null;
		}
	}

	@ObfuscatedName("asm.gy([Lakf;S)I")
	public int method18375(Light[] arg0) {
		if (this.field8176) {
			Vector3 var2 = this.method10536().field4298;
			this.field12450 = this.method18362((int) var2.field4308 >> this.field11716.field6900, (int) var2.field4313 >> this.field11716.field6900, this.field12453);
			this.field8176 = false;
		}
		for (int var3 = 0; var3 < this.field12450; var3++) {
			arg0[var3] = this.field12453[var3];
		}
		return this.field12450;
	}

	@ObfuscatedName("asm.ga(Ldh;S)Z")
	public boolean method18360(Renderer arg0) {
		Vector3 var2 = this.method10536().field4298;
		return this.field11716.field6930.method8950(this.field11714, (int) var2.field4308 >> this.field11716.field6900, (int) var2.field4313 >> this.field11716.field6900, this.method16523());
	}

	@ObfuscatedName("asm.gn(I)Z")
	public boolean method18361() {
		Vector3 var1 = this.method10536().field4298;
		return this.field11716.field6962[this.field11716.field6942 + (((int) var1.field4308 >> this.field11716.field6900) - this.field11716.field6902)][this.field11716.field6942 + (((int) var1.field4313 >> this.field11716.field6900) - this.field11716.field6947)];
	}

	@ObfuscatedName("asm.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("asm.fq(Ldh;Lalh;IIIZB)V")
	public final void method17377(Renderer arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("asm.ff(B)V")
	public final void method17378() {
		throw new IllegalStateException();
	}
}

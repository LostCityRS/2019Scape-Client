package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asv")
public abstract class class1196 extends class1019 {

	@ObfuscatedName("asv.x")
	public short field12448;

	@ObfuscatedName("asv.b")
	public int field12449 = 0;

	@ObfuscatedName("asv.h")
	public class973[] field12447 = new class973[4];

	public class1196(class550 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class420 arg7) {
		super(arg0, arg7);
		this.field11717 = (byte) arg4;
		this.field11714 = (byte) arg5;
		this.field12448 = (short) arg6;
		if (arg7 != null) {
			this.method10529(arg7);
		}
		this.method10532((float) arg1, (float) arg2, (float) arg3);
		for (int var9 = 0; var9 < 4; var9++) {
			this.field12447[var9] = null;
		}
	}

	@ObfuscatedName("asv.gy([Lakf;S)I")
	public int method18375(class973[] arg0) {
		if (this.field8176) {
			class423 var2 = this.method10536().field4298;
			this.field12449 = this.method18362((int) var2.field4308 >> this.field11716.field6900, (int) var2.field4313 >> this.field11716.field6900, this.field12447);
			this.field8176 = false;
		}
		for (int var3 = 0; var3 < this.field12449; var3++) {
			arg0[var3] = this.field12447[var3];
		}
		return this.field12449;
	}

	@ObfuscatedName("asv.ga(Ldh;S)Z")
	public boolean method18360(class133 arg0) {
		class423 var2 = this.method10536().field4298;
		return this.field11716.field6930.method8927(this.field11714, (int) var2.field4308 >> this.field11716.field6900, (int) var2.field4313 >> this.field11716.field6900);
	}

	@ObfuscatedName("asv.gn(I)Z")
	public boolean method18361() {
		class423 var1 = this.method10536().field4298;
		return this.field11716.field6962[this.field11716.field6942 + (((int) var1.field4308 >> this.field11716.field6900) - this.field11716.field6902)][this.field11716.field6942 + (((int) var1.field4313 >> this.field11716.field6900) - this.field11716.field6947)];
	}
}

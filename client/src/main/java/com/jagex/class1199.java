package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ast")
public abstract class class1199 extends class1019 {

	public class1199(class550 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(arg0);
		this.field11717 = (byte) arg4;
		this.field11714 = (byte) arg5;
		this.method10531(new class423((float) arg1, (float) arg2, (float) arg3));
	}

	@ObfuscatedName("ast.gy([Lakf;S)I")
	public int method18375(class973[] arg0) {
		class423 var2 = this.method10536().field4298;
		return this.method18362((int) var2.field4308 >> this.field11716.field6900, (int) var2.field4313 >> this.field11716.field6900, arg0);
	}

	@ObfuscatedName("ast.ga(Ldh;S)Z")
	public boolean method18360(class133 arg0) {
		class423 var2 = this.method10536().field4298;
		class557 var3 = this.field11716.method8738(this.field11714, (int) var2.field4308 >> this.field11716.field6900, (int) var2.field4313 >> this.field11716.field6900);
		return var3 != null && var3.field7057.field12470 ? this.field11716.field6930.method8950(this.field11714, (int) var2.field4308 >> this.field11716.field6900, (int) var2.field4313 >> this.field11716.field6900, var3.field7057.method16523() + this.method16523()) : this.field11716.field6930.method8927(this.field11714, (int) var2.field4308 >> this.field11716.field6900, (int) var2.field4313 >> this.field11716.field6900);
	}

	@ObfuscatedName("ast.gn(I)Z")
	public boolean method18361() {
		class423 var1 = this.method10536().field4298;
		return this.field11716.field6962[this.field11716.field6942 + (((int) var1.field4308 >> this.field11716.field6900) - this.field11716.field6902)][this.field11716.field6942 + (((int) var1.field4313 >> this.field11716.field6900) - this.field11716.field6947)];
	}

	@ObfuscatedName("ast.fp(I)Z")
	public final boolean method17379() {
		return false;
	}

	@ObfuscatedName("ast.fq(Ldh;Lalh;IIIZB)V")
	public final void method17377(class133 arg0, class1019 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ast.ff(B)V")
	public final void method17378() {
		throw new IllegalStateException();
	}
}

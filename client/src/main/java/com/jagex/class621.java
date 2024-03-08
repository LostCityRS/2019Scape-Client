package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wm")
public class class621 {

	@ObfuscatedName("wm.e")
	public final int field7655;

	@ObfuscatedName("wm.n")
	public final int field7652;

	@ObfuscatedName("wm.m")
	public boolean field7653;

	@ObfuscatedName("wm.k")
	public final int field7656;

	@ObfuscatedName("wm.f")
	public final int field7651;

	@ObfuscatedName("wm.w")
	public final class627 field7654;

	@ObfuscatedName("wm.l")
	public final int field7657;

	public class621(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, class627 arg5, int arg6) {
		this.field7655 = arg0;
		this.field7652 = arg1;
		this.field7653 = arg2;
		this.field7654 = arg5;
		this.field7657 = arg6;
		if (arg2) {
			this.field7651 = arg4;
			this.field7656 = this.method9803(arg4);
		} else {
			this.field7651 = -1;
			this.field7656 = -1;
		}
	}

	@ObfuscatedName("wm.e(I)I")
	public int method9809() {
		return this.field7655;
	}

	@ObfuscatedName("wm.n(B)Z")
	public boolean method9796() {
		return this.field7653;
	}

	@ObfuscatedName("wm.m(I)I")
	public int method9797() {
		return this.field7656;
	}

	@ObfuscatedName("wm.k(I)I")
	public int method9798() {
		return this.field7651;
	}

	@ObfuscatedName("wm.f(I)Z")
	public boolean method9813() {
		return this.field7656 != -1;
	}

	@ObfuscatedName("wm.w(IB)I")
	public int method9800(int arg0) {
		int var2 = this.field7654.method9863(arg0) + this.field7657;
		return var2 > this.field7652 ? this.field7652 : var2;
	}

	@ObfuscatedName("wm.l(IB)I")
	public int method9794(int arg0) {
		int var2 = arg0 / 10;
		return this.method9800(var2);
	}

	@ObfuscatedName("wm.u(IB)I")
	public int method9802(int arg0) {
		if (arg0 > this.field7652) {
			arg0 = this.field7652;
		}
		return this.field7654.method9867(arg0 - this.field7657);
	}

	@ObfuscatedName("wm.z(II)I")
	public int method9803(int arg0) {
		return this.method9802(arg0) * 10;
	}
}

package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("xz")
public class class642 {

	@ObfuscatedName("xz.n")
	public final class621 field7911;

	@ObfuscatedName("xz.m")
	public final boolean field7915;

	@ObfuscatedName("xz.k")
	public int field7914 = 0;

	@ObfuscatedName("xz.f")
	public int field7913 = 1;

	@ObfuscatedName("xz.w")
	public int field7916 = 1;

	public class642(class621 arg0, boolean arg1) {
		this.field7911 = arg0;
		this.field7915 = arg1;
	}

	@ObfuscatedName("xz.e(I)I")
	public int method10175() {
		return this.field7914;
	}

	@ObfuscatedName("xz.n(Lzu;B)I")
	public int method10163(class697 arg0) {
		if (class697.field8344 == arg0 && this.field7911.method9796() && this.field7911.method9813()) {
			int var2 = this.field7911.method9797();
			if (!this.field7915) {
				var2 /= 10;
			}
			if (this.field7914 > var2) {
				return var2;
			}
		}
		return this.field7914;
	}

	@ObfuscatedName("xz.m(II)V")
	public void method10160(int arg0) {
		this.field7914 = arg0;
		if (this.field7914 < 0) {
			this.field7914 = 0;
		} else if (this.field7915 && this.field7914 > 2000000000) {
			this.field7914 = 2000000000;
		} else if (!this.field7915 && this.field7914 > 200000000) {
			this.field7914 = 200000000;
		}
		this.method10165();
	}

	@ObfuscatedName("xz.k(I)I")
	public int method10161() {
		return this.field7913;
	}

	@ObfuscatedName("xz.f(Lzu;B)I")
	public int method10158(class697 arg0) {
		if (class697.field8344 == arg0 && this.field7911.method9796() && this.field7911.method9813()) {
			int var2 = this.field7911.method9798();
			if (this.field7913 > var2) {
				return var2;
			}
		}
		return this.field7913;
	}

	@ObfuscatedName("xz.w(B)I")
	public int method10169() {
		return this.field7916;
	}

	@ObfuscatedName("xz.l(II)V")
	public void method10164(int arg0) {
		this.field7916 = arg0;
	}

	@ObfuscatedName("xz.u(I)V")
	public void method10165() {
		if (this.field7915) {
			this.field7913 = this.field7911.method9794(this.field7914);
		} else {
			this.field7913 = this.field7911.method9800(this.field7914);
		}
	}
}

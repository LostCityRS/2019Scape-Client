package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aau")
public class class722 {

	@ObfuscatedName("aau.e")
	public int field8515;

	@ObfuscatedName("aau.n")
	public int field8516;

	@ObfuscatedName("aau.m")
	public int field8517;

	@ObfuscatedName("aau.k")
	public class1177 field8520;

	@ObfuscatedName("aau.f")
	public class1177 field8519;

	@ObfuscatedName("aau.w")
	public boolean field8518 = false;

	@ObfuscatedName("aau.e(Laos;Lfg;II[II)Z")
	public final boolean method14431(class1080 arg0, class164 arg1, int arg2, int arg3, int[] arg4) {
		if (this.field8518) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.field8516 = arg4[arg2];
			this.field8520 = arg0.method18864(this.field8516 >> 16);
			this.field8516 &= 0xFFFF;
			if (this.field8520 == null) {
				return false;
			}
			if (arg1.field1772 && arg3 != -1 && arg3 < arg4.length) {
				this.field8517 = arg4[arg3];
				this.field8519 = arg0.method18864(this.field8517 >> 16);
				this.field8517 &= 0xFFFF;
			}
			if (arg1.field1786) {
				this.field8515 |= 0x200;
			}
			if (this.field8520.method19412(this.field8516)) {
				this.field8515 |= 0x80;
			}
			if (this.field8520.method19411(this.field8516)) {
				this.field8515 |= 0x100;
			}
			if (this.field8520.method19409(this.field8516)) {
				this.field8515 |= 0x400;
			}
			if (this.field8519 != null) {
				if (this.field8519.method19412(this.field8517)) {
					this.field8515 |= 0x80;
				}
				if (this.field8519.method19411(this.field8517)) {
					this.field8515 |= 0x100;
				}
				if (this.field8519.method19409(this.field8517)) {
					this.field8515 |= 0x400;
				}
			}
			this.field8515 |= 0x20;
			this.field8518 = true;
			return true;
		}
	}

	@ObfuscatedName("aau.n(I)V")
	public final void method14432() {
		this.field8518 = false;
		this.field8515 = 0;
		this.field8519 = null;
		this.field8520 = null;
	}
}

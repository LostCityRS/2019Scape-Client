package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("kq")
public class class297 {

	@ObfuscatedName("kq.e")
	public final class442 field3035;

	@ObfuscatedName("kq.n")
	public final class442 field3036;

	@ObfuscatedName("kq.m")
	public class301 field3037;

	public class297(class442 arg0, class442 arg1) {
		this.field3035 = arg0;
		this.field3036 = arg1;
	}

	@ObfuscatedName("kq.e(Lkk;I)Lkx;")
	public class302 method5137(class317 arg0) {
		if (arg0 == null) {
			return null;
		}
		class319 var2 = arg0.method5349();
		if (class319.field3190 == var2) {
			return new class300((class312) arg0);
		} else if (class319.field3191 == var2) {
			return new class294(this.method5138(), (class313) arg0);
		} else if (class319.field3194 == var2) {
			return new class293(this.field3035, (class322) arg0);
		} else if (class319.field3192 == var2) {
			return new class904(this.field3035, (class915) arg0);
		} else if (class319.field3188 == var2) {
			return new class905(this.field3035, this.field3036, (class914) arg0);
		} else if (class319.field3189 == var2) {
			return new class907(this.field3035, this.field3036, (class913) arg0);
		} else if (class319.field3193 == var2) {
			return new class906(this.field3035, this.field3036, (class912) arg0);
		} else if (class319.field3187 == var2) {
			return new class303(this.field3035, this.field3036, (class321) arg0);
		} else if (class319.field3195 == var2) {
			return new class299(this.field3035, (class320) arg0);
		} else if (class319.field3196 == var2) {
			return new class1133(this.field3035, this.field3036, (class1137) arg0);
		} else if (class319.field3197 == var2) {
			return new class298(this.field3035, this.field3036, (class315) arg0);
		} else {
			return null;
		}
	}

	@ObfuscatedName("kq.n(I)Lkf;")
	public class301 method5138() {
		if (this.field3037 == null) {
			this.field3037 = new class301();
		}
		return this.field3037;
	}
}

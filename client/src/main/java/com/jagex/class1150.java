package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aql")
public abstract class class1150 extends class977 {

	@ObfuscatedName("aql.w")
	public class236 field12211;

	@ObfuscatedName("aql.l")
	public String field12210;

	@ObfuscatedName("aql.u")
	public String field12209;

	@ObfuscatedName("aql.z")
	public int field12212;

	@ObfuscatedName("aql.p")
	public class236 field12213;

	public class1150(class240 arg0) {
		this.field12211 = arg0.field2592;
		this.field12210 = arg0.field2586;
		this.field12209 = arg0.field2590;
		this.field12212 = arg0.field2588;
		this.field12213 = arg0.field2587;
	}

	public String toString() {
		String var1 = this.field12211.toString() + " " + this.field12210;
		if (this.field12209 != null && !"".equals(this.field12209)) {
			var1 = var1 + " : " + this.field12209;
		}
		return var1;
	}

	@ObfuscatedName("aql.n(I)Ljava/lang/String;")
	public String method19257() {
		return this.field12210;
	}

	@ObfuscatedName("aql.m(I)Lht;")
	public class236 method19247() {
		return this.field12211;
	}

	@ObfuscatedName("aql.k(S)Lht;")
	public class236 method19248() {
		return this.field12213;
	}

	@ObfuscatedName("aql.f(I)I")
	public int method19256() {
		if (class236.field2441 != this.field12211) {
			throw new class1237(this, this.field12211.toString().toLowerCase());
		}
		return this.field12212;
	}

	@ObfuscatedName("aql.e(I)Z")
	public abstract boolean method19245(int arg0);

	@ObfuscatedName("aql.w(I)I")
	public abstract int method19250(int arg0);
}

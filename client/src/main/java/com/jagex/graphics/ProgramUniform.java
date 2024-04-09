package com.jagex.graphics;

import com.jagex.core.datastruct.HashMapValue;
import com.jagex.graphics.glx.GlxError;
import deob.ObfuscatedName;

@ObfuscatedName("aql")
public abstract class ProgramUniform extends HashMapValue {

	@ObfuscatedName("aql.w")
	public UniformType field12211;

	@ObfuscatedName("aql.l")
	public String field12210;

	@ObfuscatedName("aql.u")
	public String field12209;

	@ObfuscatedName("aql.z")
	public int field12212;

	@ObfuscatedName("aql.p")
	public UniformType field12213;

	public ProgramUniform(ProgramUniformData arg0) {
		this.field12211 = arg0.uniformType;
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
	public UniformType getType() {
		return this.field12211;
	}

	@ObfuscatedName("aql.k(S)Lht;")
	public UniformType getElementType() {
		return this.field12213;
	}

	@ObfuscatedName("aql.f(I)I")
	public int getElementCount() {
		if (UniformType.ARRAY != this.field12211) {
			throw new GlxError(this, this.field12211.toString().toLowerCase());
		}
		return this.field12212;
	}

	@ObfuscatedName("aql.e(I)Z")
	public abstract boolean method19245(int arg0);

	@ObfuscatedName("aql.w(I)I")
	public abstract int getLocation(int arg0);
}

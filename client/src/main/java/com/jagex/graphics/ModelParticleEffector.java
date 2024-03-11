package com.jagex.graphics;

import com.jagex.game.config.ParticleEffectorType;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("cq")
public class ModelParticleEffector {

	@ObfuscatedName("cq.e")
	public final int field1228;

	@ObfuscatedName("cq.n")
	public ModelParticleEffector field1230;

	@ObfuscatedName("cq.m")
	public final int field1225;

	@ObfuscatedName("cq.k")
	public int field1226;

	@ObfuscatedName("cq.f")
	public int field1229;

	@ObfuscatedName("cq.w")
	public int field1227;

	@ObfuscatedName("cq.l")
	public Matrix4x4 field1231;

	public ModelParticleEffector(int arg0, int arg1) {
		this.field1228 = arg0;
		this.field1225 = arg1;
	}

	@ObfuscatedName("cq.e(Lnp;B)Lna;")
	public ParticleEffectorType method1509(ParticleEffectorTypeList arg0) {
		return arg0.method5973(this.field1228);
	}

	@ObfuscatedName("cq.n(II)Lcq;")
	public ModelParticleEffector method1508(int arg0) {
		return new ModelParticleEffector(this.field1228, arg0);
	}
}

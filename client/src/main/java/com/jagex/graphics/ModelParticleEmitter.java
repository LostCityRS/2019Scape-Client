package com.jagex.graphics;

import com.jagex.game.config.ParticleEmitterType;
import com.jagex.game.config.ParticleEmitterTypeList;
import deob.ObfuscatedName;

@ObfuscatedName("du")
public class ModelParticleEmitter {

	@ObfuscatedName("du.e")
	public final int particle;

	@ObfuscatedName("du.n")
	public ModelParticleEmitter field1465;

	@ObfuscatedName("du.m")
	public final int field1463;

	@ObfuscatedName("du.k")
	public final int field1476;

	@ObfuscatedName("du.f")
	public final int field1467;

	@ObfuscatedName("du.w")
	public final int field1468;

	@ObfuscatedName("du.l")
	public final byte field1471;

	@ObfuscatedName("du.u")
	public int field1470;

	@ObfuscatedName("du.z")
	public int field1474;

	@ObfuscatedName("du.p")
	public int field1472;

	@ObfuscatedName("du.d")
	public int field1473;

	@ObfuscatedName("du.c")
	public int field1469;

	@ObfuscatedName("du.r")
	public int field1475;

	@ObfuscatedName("du.v")
	public int field1464;

	@ObfuscatedName("du.o")
	public int field1466;

	@ObfuscatedName("du.s")
	public int field1478;

	public ModelParticleEmitter(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
		this.particle = arg0;
		this.field1463 = arg1;
		this.field1476 = arg2;
		this.field1467 = arg3;
		this.field1468 = arg4;
		this.field1471 = arg5;
	}

	@ObfuscatedName("du.e(Lnb;B)Lnj;")
	public ParticleEmitterType method2079(ParticleEmitterTypeList arg0) {
		return arg0.get(this.particle);
	}

	@ObfuscatedName("du.n(IIIIB)Ldu;")
	public ModelParticleEmitter method2080(int arg0, int arg1, int arg2, int arg3) {
		return new ModelParticleEmitter(this.particle, arg0, arg1, arg2, arg3, this.field1471);
	}
}

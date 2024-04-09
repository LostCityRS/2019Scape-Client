package com.jagex.game.config;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("no")
public class BasicParticleEffectorTypeList implements ParticleEffectorTypeList {

	@ObfuscatedName("no.e")
	public Js5 field3536;

	@ObfuscatedName("no.n")
	public SoftLruHashTable field3537 = new SoftLruHashTable(64);

	public BasicParticleEffectorTypeList(Js5 arg0) {
		this.field3536 = arg0;
	}

	@ObfuscatedName("no.e(II)Lna;")
	public ParticleEffectorType method5973(int arg0) {
		ParticleEffectorType var2 = (ParticleEffectorType) this.field3537.get((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3 = this.field3536.getfile(1, arg0);
		ParticleEffectorType var4 = new ParticleEffectorType();
		var4.field3548 = arg0;
		if (var3 != null) {
			var4.method5988(new Packet(var3));
		}
		var4.method5990();
		this.field3537.put(var4, (long) arg0);
		return var4;
	}

	@ObfuscatedName("no.n(I)V")
	public void cacheReset() {
		this.field3537.reset();
	}
}

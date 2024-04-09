package com.jagex.game.config;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ni")
public class BasicParticleEmitterTypeList implements ParticleEmitterTypeList {

	@ObfuscatedName("ni.e")
	public Js5 field3563;

	@ObfuscatedName("ni.n")
	public SoftLruHashTable field3562 = new SoftLruHashTable(64);

	public BasicParticleEmitterTypeList(Js5 arg0) {
		this.field3563 = arg0;
	}

	@ObfuscatedName("ni.e(II)Lnj;")
	public synchronized ParticleEmitterType get(int arg0) {
		ParticleEmitterType var2 = (ParticleEmitterType) this.field3562.get((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3 = this.field3563.getfile(0, arg0);
		ParticleEmitterType var4 = new ParticleEmitterType();
		if (var3 != null) {
			var4.method5960(new Packet(var3));
		}
		var4.method5965();
		this.field3562.put(var4, (long) arg0);
		return var4;
	}

	@ObfuscatedName("ni.n(I)V")
	public void cacheReset() {
		this.field3562.reset();
	}
}

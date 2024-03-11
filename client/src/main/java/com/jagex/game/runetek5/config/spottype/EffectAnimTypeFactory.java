package com.jagex.game.runetek5.config.spottype;

import com.jagex.WeightedCache;
import com.jagex.game.runetek5.config.ConfigTypeFactory;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("yc")
public abstract class EffectAnimTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("yc.e")
	public final Js5 field8265;

	@ObfuscatedName("yc.n")
	public final WeightedCache field8266 = new WeightedCache(60);

	@ObfuscatedName("yc.m")
	public int field8264;

	public EffectAnimTypeFactory(Js5 arg0) {
		this.field8265 = arg0;
	}

	@ObfuscatedName("yc.e(II)V")
	public void method13832(int arg0) {
		this.field8264 = arg0;
		WeightedCache var2 = this.field8266;
		synchronized (this.field8266) {
			this.field8266.method2924();
		}
	}

	@ObfuscatedName("yc.n(B)V")
	public void method13834() {
		WeightedCache var1 = this.field8266;
		synchronized (this.field8266) {
			this.field8266.method2924();
		}
	}

	@ObfuscatedName("yc.m(IB)V")
	public void method13821(int arg0) {
		WeightedCache var2 = this.field8266;
		synchronized (this.field8266) {
			this.field8266.method2923(arg0);
		}
	}

	@ObfuscatedName("yc.k(I)V")
	public void method13822() {
		WeightedCache var1 = this.field8266;
		synchronized (this.field8266) {
			this.field8266.method2928();
		}
	}
}

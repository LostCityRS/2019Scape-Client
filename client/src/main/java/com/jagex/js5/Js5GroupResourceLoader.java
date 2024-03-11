package com.jagex.js5;

import com.jagex.game.client.LoadableResourceType;
import com.jagex.game.client.ResourceLoader;
import deob.ObfuscatedName;

@ObfuscatedName("pk")
public class Js5GroupResourceLoader implements ResourceLoader {

	@ObfuscatedName("pk.e")
	public final Js5 field4329;

	@ObfuscatedName("pk.n")
	public final int field4330;

	public Js5GroupResourceLoader(Js5 arg0, int arg1) {
		this.field4329 = arg0;
		this.field4330 = arg1;
	}

	@ObfuscatedName("pk.e(I)I")
	public int method6782() {
		return this.field4329.method6927(this.field4330) ? 100 : this.field4329.method6892(this.field4330);
	}

	@ObfuscatedName("pk.n(B)Lacv;")
	public LoadableResourceType method6781() {
		return LoadableResourceType.field8912;
	}
}

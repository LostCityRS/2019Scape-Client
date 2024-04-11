package com.jagex.js5;

import com.jagex.game.client.LoadableResourceType;
import com.jagex.game.client.ResourceLoader;
import deob.ObfuscatedName;

@ObfuscatedName("pk")
public class Js5GroupResourceLoader implements ResourceLoader {

	@ObfuscatedName("pk.e")
	public final Js5 js5;

	@ObfuscatedName("pk.n")
	public final int group;

	public Js5GroupResourceLoader(Js5 js5, int group) {
		this.js5 = js5;
		this.group = group;
	}

	@ObfuscatedName("pk.e(I)I")
	public int getPercentageComplete() {
		return this.js5.isGroupReady(this.group) ? 100 : this.js5.getPercentageComplete(this.group);
	}

	@ObfuscatedName("pk.n(B)Lacv;")
	public LoadableResourceType getLoadableResourceType() {
		return LoadableResourceType.JS5_GROUP;
	}
}

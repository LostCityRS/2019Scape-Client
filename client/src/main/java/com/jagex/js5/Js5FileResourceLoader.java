package com.jagex.js5;

import com.jagex.game.client.LoadableResourceType;
import com.jagex.game.client.ResourceLoader;
import deob.ObfuscatedName;

@ObfuscatedName("pb")
public class Js5FileResourceLoader implements ResourceLoader {

	@ObfuscatedName("pb.e")
	public final Js5 js5;

	@ObfuscatedName("pb.n")
	public final String fileName;

	public Js5FileResourceLoader(Js5 js5, String fileName) {
		this.js5 = js5;
		this.fileName = fileName;
	}

	@ObfuscatedName("pb.e(I)I")
	public int getPercentageComplete() {
		return this.js5.method6908(this.fileName) ? 100 : 0;
	}

	@ObfuscatedName("pb.n(B)Lacv;")
	public LoadableResourceType getLoadableResourceType() {
		return LoadableResourceType.JS5_FILE;
	}
}

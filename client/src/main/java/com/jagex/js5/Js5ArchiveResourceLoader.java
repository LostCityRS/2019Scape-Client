package com.jagex.js5;

import com.jagex.game.client.LoadableResourceType;
import com.jagex.game.client.ResourceLoader;
import deob.ObfuscatedName;

@ObfuscatedName("pw")
public class Js5ArchiveResourceLoader implements ResourceLoader {

	@ObfuscatedName("pw.e")
	public final Js5 js5;

	public Js5ArchiveResourceLoader(Js5 js5) {
		this.js5 = js5;
	}

	@ObfuscatedName("pw.e(I)I")
	public int getPercentageComplete() {
		return this.js5.fetchAll() ? 100 : this.js5.getPercentageComplete();
	}

	@ObfuscatedName("pw.n(B)Lacv;")
	public LoadableResourceType getLoadableResourceType() {
		return LoadableResourceType.JS5_ARCHIVE;
	}
}

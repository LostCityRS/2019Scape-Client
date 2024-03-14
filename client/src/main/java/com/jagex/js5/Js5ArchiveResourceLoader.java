package com.jagex.js5;

import com.jagex.game.client.LoadableResourceType;
import com.jagex.game.client.ResourceLoader;
import deob.ObfuscatedName;

@ObfuscatedName("pw")
public class Js5ArchiveResourceLoader implements ResourceLoader {

	@ObfuscatedName("pw.e")
	public final Js5 field4328;

	public Js5ArchiveResourceLoader(Js5 arg0) {
		this.field4328 = arg0;
	}

	@ObfuscatedName("pw.e(I)I")
	public int method6782() {
		return this.field4328.fetchAll() ? 100 : this.field4328.getPercentageComplete();
	}

	@ObfuscatedName("pw.n(B)Lacv;")
	public LoadableResourceType method6781() {
		return LoadableResourceType.field8914;
	}
}

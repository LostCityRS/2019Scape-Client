package com.jagex.game.client;

import deob.ObfuscatedName;

import java.net.URL;

@ObfuscatedName("am")
public class HttpRequest {

	@ObfuscatedName("am.e")
	public final URL field738;

	@ObfuscatedName("am.n")
	public volatile boolean field739;

	@ObfuscatedName("am.m")
	public volatile byte[] field737;

	public HttpRequest(URL arg0) {
		this.field738 = arg0;
	}

	@ObfuscatedName("am.e(I)Z")
	public boolean isComplete() {
		return this.field739;
	}

	@ObfuscatedName("am.n(I)[B")
	public byte[] getData() {
		return this.field737;
	}
}

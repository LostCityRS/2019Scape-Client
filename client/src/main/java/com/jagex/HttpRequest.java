package com.jagex;

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
	public boolean method826() {
		return this.field739;
	}

	@ObfuscatedName("am.n(I)[B")
	public byte[] method821() {
		return this.field737;
	}
}

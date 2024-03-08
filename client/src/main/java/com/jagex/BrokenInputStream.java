package com.jagex;

import deob.ObfuscatedName;

import java.io.InputStream;

@ObfuscatedName("apy")
public class BrokenInputStream extends InputStream {

	public int read() {
		class214.method1571(30000L);
		return -1;
	}
}

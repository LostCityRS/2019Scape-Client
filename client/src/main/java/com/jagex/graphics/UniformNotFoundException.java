package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("atn")
public class UniformNotFoundException extends ShaderException {

	public UniformNotFoundException(String arg0) {
		this(arg0, false);
	}

	public UniformNotFoundException(String arg0, boolean arg1) {
		super(arg0);
	}
}

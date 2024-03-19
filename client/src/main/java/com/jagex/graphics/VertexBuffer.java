package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("lr")
public interface VertexBuffer extends GpuBuffer, DeletableResource {

	@ObfuscatedName("lr.m()V")
	void delete();

	@ObfuscatedName("lr.e(II)Z")
	boolean allocate(int arg0, int arg1);
}

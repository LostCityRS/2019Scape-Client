package com.jagex.graphics;

import com.jagex.game.client.DataType;
import deob.ObfuscatedName;

@ObfuscatedName("ml")
public interface GpuIndexBuffer extends GpuBuffer, DeletableResource {

	@ObfuscatedName("ml.a(I)V")
	void method5831(int arg0);

	@ObfuscatedName("ml.e()Ldg;")
	DataType getDataType();

	@ObfuscatedName("ml.m()V")
	void delete();
}

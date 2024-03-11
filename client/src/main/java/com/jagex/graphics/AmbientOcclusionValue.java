package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("ip")
public class AmbientOcclusionValue implements SerializableEnum {

	@ObfuscatedName("ip.e")
	public static final AmbientOcclusionValue field2680 = new AmbientOcclusionValue(0);

	@ObfuscatedName("ip.n")
	public static final AmbientOcclusionValue field2677 = new AmbientOcclusionValue(1);

	@ObfuscatedName("ip.m")
	public static final AmbientOcclusionValue field2679 = new AmbientOcclusionValue(2);

	@ObfuscatedName("ip.k")
	public final int field2678;

	public AmbientOcclusionValue(int arg0) {
		this.field2678 = arg0;
	}

	@ObfuscatedName("ip.n()I")
	public int getId() {
		return this.field2678;
	}
}

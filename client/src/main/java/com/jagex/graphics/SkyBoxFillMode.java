package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("uw")
public class SkyBoxFillMode implements SerializableEnum {

	@ObfuscatedName("uw.e")
	public static final SkyBoxFillMode field7239 = new SkyBoxFillMode(0);

	@ObfuscatedName("uw.n")
	public static final SkyBoxFillMode field7237 = new SkyBoxFillMode(1);

	@ObfuscatedName("uw.m")
	public int field7238;

	@ObfuscatedName("sa.e(I)[Luw;")
	public static SkyBoxFillMode[] method8341() {
		return new SkyBoxFillMode[] { field7239, field7237 };
	}

	public SkyBoxFillMode(int arg0) {
		this.field7238 = arg0;
	}

	@ObfuscatedName("uw.n()I")
	public int getId() {
		return this.field7238;
	}
}

package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("vn")
public class MaterialAlphaMode implements SerializableEnum {

	@ObfuscatedName("vn.e")
	public static final MaterialAlphaMode field7575 = new MaterialAlphaMode(0);

	@ObfuscatedName("vn.n")
	public static final MaterialAlphaMode TEST = new MaterialAlphaMode(1);

	@ObfuscatedName("vn.m")
	public static final MaterialAlphaMode field7573 = new MaterialAlphaMode(2);

	@ObfuscatedName("vn.k")
	public final int field7576;

	public MaterialAlphaMode(int arg0) {
		this.field7576 = arg0;
	}

	@ObfuscatedName("vn.n()I")
	public int getId() {
		return this.field7576;
	}
}

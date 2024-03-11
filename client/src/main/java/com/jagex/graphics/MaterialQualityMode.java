package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("wn")
public class MaterialQualityMode implements SerializableEnum {

	@ObfuscatedName("wn.e")
	public static final MaterialQualityMode field7590 = new MaterialQualityMode(0);

	@ObfuscatedName("wn.n")
	public static final MaterialQualityMode HD = new MaterialQualityMode(1);

	@ObfuscatedName("wn.m")
	public static final MaterialQualityMode LD = new MaterialQualityMode(2);

	@ObfuscatedName("wn.k")
	public final int field7591;

	@ObfuscatedName("aw.e(B)[Lwn;")
	public static MaterialQualityMode[] method745() {
		return new MaterialQualityMode[] { field7590, HD, LD };
	}

	public MaterialQualityMode(int arg0) {
		this.field7591 = arg0;
	}

	@ObfuscatedName("wn.n()I")
	public int getId() {
		return this.field7591;
	}
}

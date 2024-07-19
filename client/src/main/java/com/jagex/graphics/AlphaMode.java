package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("vn")
public class AlphaMode implements SerializableEnum {

	@ObfuscatedName("vn.e")
	public static final AlphaMode NONE = new AlphaMode(0);

	@ObfuscatedName("vn.n")
	public static final AlphaMode ALPHA_TESTED = new AlphaMode(1);

	@ObfuscatedName("vn.m")
	public static final AlphaMode MULTIPLY = new AlphaMode(2);

	@ObfuscatedName("vn.k")
	public final int field7576;

	public AlphaMode(int arg0) {
		this.field7576 = arg0;
	}

    @ObfuscatedName("tz.e(I)[Lvn;")
    public static AlphaMode[] method8501() {
        return new AlphaMode[] { MULTIPLY, NONE, ALPHA_TESTED};
    }

    @ObfuscatedName("vn.n()I")
	public int getId() {
		return this.field7576;
	}
}

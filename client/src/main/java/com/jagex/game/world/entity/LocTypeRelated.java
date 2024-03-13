package com.jagex.game.world.entity;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("vg")
public class LocTypeRelated implements SerializableEnum {

	@ObfuscatedName("vg.e")
	public static final LocTypeRelated field7438 = new LocTypeRelated(0);

	@ObfuscatedName("vg.n")
	public static final LocTypeRelated field7439 = new LocTypeRelated(1);

	@ObfuscatedName("vg.m")
	public static final LocTypeRelated field7440 = new LocTypeRelated(2);

	@ObfuscatedName("vg.k")
	public final int field7441;

	public LocTypeRelated(int arg0) {
		this.field7441 = arg0;
	}

    @ObfuscatedName("ua.e(S)[Lvg;")
    public static LocTypeRelated[] method9002() {
        return new LocTypeRelated[] {field7440, field7439, field7438};
    }

    @ObfuscatedName("vg.n()I")
	public int getId() {
		return this.field7441;
	}
}

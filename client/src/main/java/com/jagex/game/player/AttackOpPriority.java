package com.jagex.game.player;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("xi")
public class AttackOpPriority implements SerializableEnum {

	@ObfuscatedName("xi.e")
	public static final AttackOpPriority field7906 = new AttackOpPriority(2, 0);

	@ObfuscatedName("xi.n")
	public static final AttackOpPriority field7908 = new AttackOpPriority(1, 1);

	@ObfuscatedName("xi.m")
	public static final AttackOpPriority field7909 = new AttackOpPriority(3, 2);

	@ObfuscatedName("xi.k")
	public static final AttackOpPriority field7907 = new AttackOpPriority(0, 3);

	@ObfuscatedName("xi.f")
	public final int field7905;

	@ObfuscatedName("xi.w")
	public final int field7910;

	@ObfuscatedName("xi.e(I)[Lxi;")
	public static AttackOpPriority[] method10149() {
		return new AttackOpPriority[] { field7907, field7908, field7906, field7909 };
	}

	public AttackOpPriority(int arg0, int arg1) {
		this.field7905 = arg0;
		this.field7910 = arg1;
	}

	@ObfuscatedName("xi.n()I")
	public int getId() {
		return this.field7910;
	}
}

package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("acw")
public class NativeLibraryFailureType implements SerializableEnum {

	@ObfuscatedName("acw.e")
	public static final NativeLibraryFailureType field8907 = new NativeLibraryFailureType(0);

	@ObfuscatedName("acw.n")
	public static final NativeLibraryFailureType field8908 = new NativeLibraryFailureType(1);

	@ObfuscatedName("acw.m")
	public final int serialID;

	public NativeLibraryFailureType(int serialID) {
		this.serialID = serialID;
	}

	@ObfuscatedName("acw.n()I")
	public int getId() {
		return this.serialID;
	}
}

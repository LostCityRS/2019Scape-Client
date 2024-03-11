package com.jagex;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("acw")
public class NativeLibraryFailureType implements SerializableEnum {

	@ObfuscatedName("acw.e")
	public static final NativeLibraryFailureType field8907 = new NativeLibraryFailureType(0);

	@ObfuscatedName("acw.n")
	public static final NativeLibraryFailureType field8908 = new NativeLibraryFailureType(1);

	@ObfuscatedName("acw.m")
	public final int field8909;

	public NativeLibraryFailureType(int arg0) {
		this.field8909 = arg0;
	}

	@ObfuscatedName("acw.n()I")
	public int getId() {
		return this.field8909;
	}
}

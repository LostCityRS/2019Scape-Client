package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("acx")
public class ToolkitType implements SerializableEnum {

	@ObfuscatedName("acx.e")
	public static final ToolkitType field8875 = new ToolkitType(0);

	@ObfuscatedName("acx.n")
	public static final ToolkitType field8873 = new ToolkitType(1);

	@ObfuscatedName("acx.m")
	public static final ToolkitType field8874 = new ToolkitType(2);

	@ObfuscatedName("acx.k")
	public static final ToolkitType field8883 = new ToolkitType(3);

	@ObfuscatedName("acx.f")
	public static final ToolkitType field8876 = new ToolkitType(4);

	@ObfuscatedName("acx.w")
	public static final ToolkitType field8877 = new ToolkitType(5);

	@ObfuscatedName("acx.l")
	public static final ToolkitType field8878 = new ToolkitType(6);

	@ObfuscatedName("acx.u")
	public static final ToolkitType field8879 = new ToolkitType(7);

	@ObfuscatedName("acx.z")
	public static final ToolkitType field8880 = new ToolkitType(8);

	@ObfuscatedName("acx.p")
	public static final ToolkitType field8881 = new ToolkitType(9);

	@ObfuscatedName("acx.d")
	public static final ToolkitType field8882 = new ToolkitType(10);

	@ObfuscatedName("acx.c")
	public static final ToolkitType field8884 = new ToolkitType(11);

	@ObfuscatedName("acx.r")
	public static final ToolkitType field8872 = new ToolkitType(12);

	@ObfuscatedName("acx.v")
	public static final ToolkitType field8885 = new ToolkitType(13);

	@ObfuscatedName("acx.o")
	public final int field8886;

	public ToolkitType(int arg0) {
		this.field8886 = arg0;
	}

	@ObfuscatedName("acx.n()I")
	public int getId() {
		return this.field8886;
	}
}

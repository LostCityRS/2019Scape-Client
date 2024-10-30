package com.jagex.graphics.safe;

import com.jagex.graphics.GraphicsDeletable;
import deob.ObfuscatedName;

@ObfuscatedName("bf")
public class PureJavaColorBuffer implements GraphicsDeletable {

	@ObfuscatedName("bf.e")
	public final int field893;

	@ObfuscatedName("bf.n")
	public final int field892;

	@ObfuscatedName("bf.m")
	public final int[] field891;

	public PureJavaColorBuffer(int arg0, int arg1) {
		this(arg0, arg1, new int[arg0 * arg1]);
	}

	public PureJavaColorBuffer(int arg0, int arg1, int[] arg2) {
		this.field893 = arg0;
		this.field892 = arg1;
		this.field891 = arg2;
	}

	@ObfuscatedName("bf.e()I")
	public int method1015() {
		return this.field893;
	}

	@ObfuscatedName("bf.n()I")
	public int method1009() {
		return this.field892;
	}

	@ObfuscatedName("bf.m()V")
	public void delete() {
	}
}

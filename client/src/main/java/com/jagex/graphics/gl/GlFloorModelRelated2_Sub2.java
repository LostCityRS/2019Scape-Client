package com.jagex.graphics.gl;

import deob.ObfuscatedName;
import jaclib.memory.Buffer;

@ObfuscatedName("aey")
public class GlFloorModelRelated2_Sub2 extends GlFloorModelRelated2 implements GlInterfaceRelated {

	@ObfuscatedName("aey.m")
	public int field9345;

	public GlFloorModelRelated2_Sub2(GlToolkit arg0, int arg1, byte[] arg2, int arg3) {
		super(arg0, arg2, arg3);
		this.field9345 = arg1;
	}

	public GlFloorModelRelated2_Sub2(GlToolkit arg0, int arg1, Buffer arg2) {
		super(arg0, arg2);
		this.field9345 = arg1;
	}

	@ObfuscatedName("aey.e()I")
	public int method1294() {
		return 0;
	}

	@ObfuscatedName("aey.n()I")
	public int method1295() {
		return this.field9345;
	}

	@ObfuscatedName("aey.m()J")
	public long getAddress() {
		return this.field1128.getAddress();
	}

	@ObfuscatedName("aey.k(I[BI)V")
	public void method1286(int arg0, byte[] arg1, int arg2) {
		this.method1313(arg1, arg2);
		this.field9345 = arg0;
	}
}

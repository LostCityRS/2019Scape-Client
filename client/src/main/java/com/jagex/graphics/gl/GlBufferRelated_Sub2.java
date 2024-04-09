package com.jagex.graphics.gl;

import deob.ObfuscatedName;
import jaclib.memory.Buffer;

@ObfuscatedName("aex")
public class GlBufferRelated_Sub2 extends GlBufferRelated implements GlInterfaceRelated {

	@ObfuscatedName("aex.p")
	public int field9346;

	public GlBufferRelated_Sub2(GlToolkit arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.field9346 = arg1;
	}

	public GlBufferRelated_Sub2(GlToolkit arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.field9346 = arg1;
	}

	@ObfuscatedName("aex.e()I")
	public int method1294() {
		return this.field1122;
	}

	@ObfuscatedName("aex.n()I")
	public int method1295() {
		return this.field9346;
	}

	@ObfuscatedName("aex.m()J")
	public long getAddress() {
		return 0L;
	}

	@ObfuscatedName("aex.d()V")
	public void method1311() {
		this.field1123.method15842(this);
	}

	@ObfuscatedName("aex.k(I[BI)V")
	public void method1286(int arg0, byte[] arg1, int arg2) {
		this.method1309(arg1, arg2);
		this.field9346 = arg0;
	}
}

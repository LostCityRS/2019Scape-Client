package com.jagex.graphics.gl;

import deob.ObfuscatedName;
import jaclib.memory.Buffer;

@ObfuscatedName("cl")
public class GlFloorModelRelated2 {

	@ObfuscatedName("cl.e")
	public final GlToolkit field1127;

	@ObfuscatedName("cl.n")
	public Buffer field1128;

	public GlFloorModelRelated2(GlToolkit arg0, byte[] arg1, int arg2) {
		this.field1127 = arg0;
		this.field1128 = this.field1127.field9876.method92(arg2, false);
		if (arg1 != null) {
			this.field1128.method8(arg1, 0, 0, arg2);
		}
	}

	public GlFloorModelRelated2(GlToolkit arg0, Buffer arg1) {
		this.field1127 = arg0;
		this.field1128 = arg1;
	}

	@ObfuscatedName("cl.d([BI)V")
	public void method1313(byte[] arg0, int arg1) {
		if (this.field1128 == null || this.field1128.getSize() < arg1) {
			this.field1128 = this.field1127.field9876.method92(arg1, false);
		}
		this.field1128.method8(arg0, 0, 0, arg1);
	}
}

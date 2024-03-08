package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("mi")
public class class361 {

	// $FF: synthetic field
	public final class850 this$0;

	@ObfuscatedName("mi.e")
	public class330 field3412;

	@ObfuscatedName("mi.n")
	public int field3411;

	public class361(class850 arg0, int arg1) {
		this.this$0 = arg0;
		this.method5836();
		this.method5840(arg1, this.field3411);
	}

	@ObfuscatedName("mi.e()V")
	public void method5836() {
		this.field3412 = this.this$0.method16085(true);
		this.this$0.method16065(new class345[] { new class345(new class339[] { class339.field3310, class339.field3311 }) });
		this.this$0.method16065(new class345[] { new class345(new class339[] { class339.field3310, class339.field3311 }) });
		this.this$0.method16065(new class345[] { new class345(new class339[] { class339.field3310, class339.field3311 }) });
		this.field3411 = 16;
	}

	@ObfuscatedName("mi.n()V")
	public void method5838() {
		this.field3412.method1010();
	}

	@ObfuscatedName("mi.m(II)V")
	public void method5840(int arg0, int arg1) {
		if (!this.field3412.method5553(arg0, arg1)) {
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
		}
	}
}

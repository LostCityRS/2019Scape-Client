package com.jagex;

import deob.ObfuscatedName;
import jaclib.memory.heap.NativeHeap;

@ObfuscatedName("aqg")
public class LegacyOpenGLHeap extends Heap {

	@ObfuscatedName("aqg.k")
	public NativeHeap field12207;

	public LegacyOpenGLHeap(int arg0) {
		this.field12207 = new NativeHeap(arg0);
	}

	@ObfuscatedName("aqg.e()V")
	public void method19237() {
		this.field12207.method93();
	}
}

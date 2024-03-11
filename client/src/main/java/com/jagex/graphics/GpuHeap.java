package com.jagex.graphics;

import com.jagex.core.datastruct.Heap;
import deob.ObfuscatedName;
import jaclib.memory.heap.NativeHeap;

@ObfuscatedName("aqa")
public class GpuHeap extends Heap {

	@ObfuscatedName("aqa.k")
	public NativeHeap field12208;

	public GpuHeap(int arg0) {
		this.field12208 = new NativeHeap(arg0);
	}

	@ObfuscatedName("aqa.e()V")
	public void method19240() {
		this.field12208.method93();
	}
}

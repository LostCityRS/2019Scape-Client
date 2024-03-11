package com.jagex.graphics;

import deob.ObfuscatedName;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@ObfuscatedName("atp")
public class GpuRendererWeakReference extends WeakReference {

	@ObfuscatedName("atp.e")
	public final int field12489;

	@ObfuscatedName("atp.n")
	public GpuRendererWeakReference field12488;

	public GpuRendererWeakReference(Object arg0, ReferenceQueue arg1, int arg2, Object arg3) {
		super(arg0, arg1);
		this.field12489 = arg2;
	}
}

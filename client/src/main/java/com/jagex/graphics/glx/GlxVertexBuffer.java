package com.jagex.graphics.glx;

import com.jagex.graphics.VertexBuffer;
import deob.ObfuscatedName;

@ObfuscatedName("aix")
public class GlxVertexBuffer extends GlxBuffer implements VertexBuffer {

	@ObfuscatedName("aix.d")
	public byte field10619;

	public GlxVertexBuffer(GlxToolkit arg0, boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@ObfuscatedName("aix.k()I")
	public int method5743() {
		return super.method5743();
	}

	@ObfuscatedName("aix.as()I")
	public int method16793() {
		return this.field10619;
	}

	@ObfuscatedName("aix.e(II)Z")
	public boolean allocate(int arg0, int arg1) {
		this.field10619 = (byte) arg1;
		super.method5831(arg0);
		return true;
	}

	@ObfuscatedName("aix.m()V")
	public void delete() {
		super.delete();
	}

	@ObfuscatedName("aix.f(IIJ)Z")
	public boolean upload(int arg0, int arg1, long arg2) {
		return super.upload(arg0, arg1, arg2);
	}

	@ObfuscatedName("aix.w(II)J")
	public long lock(int arg0, int arg1) {
		return super.lock(arg0, arg1);
	}

	@ObfuscatedName("aix.l()V")
	public void unlock() {
		super.unlock();
	}
}

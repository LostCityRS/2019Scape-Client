package com.jagex.graphics.glx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.GpuIndexBuffer;
import deob.ObfuscatedName;

@ObfuscatedName("aid")
public class GlxIndexBuffer extends GlxBuffer implements GpuIndexBuffer {

	@ObfuscatedName("aid.d")
	public DataType field10675;

	public GlxIndexBuffer(GlxToolkit arg0, DataType arg1, boolean arg2) {
		super(arg0, 34963, arg2);
		this.field10675 = arg1;
	}

	@ObfuscatedName("aid.k()I")
	public int method5743() {
		return super.method5743();
	}

	@ObfuscatedName("aid.e()Ldg;")
	public DataType getDataType() {
		return this.field10675;
	}

	@ObfuscatedName("aid.a(I)V")
	public void method5831(int arg0) {
		super.method5831(this.field10675.field1652 * arg0);
	}

	@ObfuscatedName("aid.m()V")
	public void delete() {
		super.delete();
	}

	@ObfuscatedName("aid.f(IIJ)Z")
	public boolean upload(int arg0, int arg1, long arg2) {
		return super.upload(arg0, arg1, arg2);
	}

	@ObfuscatedName("aid.w(II)J")
	public long lock(int arg0, int arg1) {
		return super.lock(arg0, arg1);
	}

	@ObfuscatedName("aid.l()V")
	public void unlock() {
		super.unlock();
	}
}

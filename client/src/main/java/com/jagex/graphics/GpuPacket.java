package com.jagex.graphics;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import jaclib.memory.Stream;

@ObfuscatedName("asb")
public class GpuPacket extends Packet {

	public GpuPacket(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("asb.jg(F)V")
	public void method19550(float arg0) {
		int var2 = Stream.floatToRawIntBits(arg0);
		this.data[(++this.pos) - 1] = (byte) (var2 >> 24);
		this.data[(++this.pos) - 1] = (byte) (var2 >> 16);
		this.data[(++this.pos) - 1] = (byte) (var2 >> 8);
		this.data[(++this.pos) - 1] = (byte) var2;
	}

	@ObfuscatedName("asb.jx(F)V")
	public void method19553(float arg0) {
		int var2 = Stream.floatToRawIntBits(arg0);
		this.data[(++this.pos) - 1] = (byte) var2;
		this.data[(++this.pos) - 1] = (byte) (var2 >> 8);
		this.data[(++this.pos) - 1] = (byte) (var2 >> 16);
		this.data[(++this.pos) - 1] = (byte) (var2 >> 24);
	}
}

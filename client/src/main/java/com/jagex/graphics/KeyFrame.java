package com.jagex.graphics;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("ey")
public class KeyFrame {

	@ObfuscatedName("ey.e")
	public int time;

	@ObfuscatedName("ey.n")
	public float value;

	// incoming and outgoing tangents
	@ObfuscatedName("ey.m")
	public float tanInX = Float.MAX_VALUE;

	@ObfuscatedName("ey.k")
	public float tanInY = Float.MAX_VALUE;

	@ObfuscatedName("ey.f")
	public float tanOutX = Float.MAX_VALUE;

	@ObfuscatedName("ey.w")
	public float tanOutY = Float.MAX_VALUE;

	@ObfuscatedName("ey.l")
	public KeyFrame next;

	@ObfuscatedName("ey.e(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		this.time = arg0.g2s();
		this.value = arg0.gFloat();
		this.tanInX = arg0.gFloat();
		this.tanInY = arg0.gFloat();
		this.tanOutX = arg0.gFloat();
		this.tanOutY = arg0.gFloat();
	}
}

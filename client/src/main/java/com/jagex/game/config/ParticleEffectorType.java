package com.jagex.game.config;

import com.jagex.core.io.Packet;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

@ObfuscatedName("na")
public class ParticleEffectorType {

	@ObfuscatedName("na.p")
	public int field3548;

	@ObfuscatedName("na.d")
	public int field3549;

	@ObfuscatedName("na.c")
	public int field3555;

	@ObfuscatedName("na.r")
	public int field3551;

	@ObfuscatedName("na.v")
	public int field3552;

	@ObfuscatedName("na.o")
	public int field3553;

	@ObfuscatedName("na.s")
	public int field3557;

	@ObfuscatedName("na.y")
	public int field3556;

	@ObfuscatedName("na.q")
	public int field3542 = 0;

	@ObfuscatedName("na.x")
	public int field3561 = 0;

	@ObfuscatedName("na.b")
	public boolean field3558 = false;

	@ObfuscatedName("na.h")
	public int field3559;

	@ObfuscatedName("na.a")
	public long field3560;

	@ObfuscatedName("na.g")
	public int field3554;

	@ObfuscatedName("na.e(Lalw;I)V")
	public void method5988(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method5989(arg0, var2);
		}
	}

	@ObfuscatedName("na.n(Lalw;II)V")
	public void method5989(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field3555 = arg0.g2();
		} else if (arg1 == 2) {
			arg0.g1();
		} else if (arg1 == 3) {
			this.field3551 = arg0.g4s();
			this.field3552 = arg0.g4s();
			this.field3553 = arg0.g4s();
		} else if (arg1 == 4) {
			this.field3557 = arg0.g1();
			this.field3556 = arg0.g4s();
		} else if (arg1 == 6) {
			this.field3549 = arg0.g1();
		} else if (arg1 == 8) {
			this.field3542 = 1;
		} else if (arg1 == 9) {
			this.field3561 = 1;
		} else if (arg1 == 10) {
			this.field3558 = true;
		}
	}

	@ObfuscatedName("na.m(B)V")
	public void method5990() {
		this.field3554 = Trig1.cos[this.field3555 << 3];
		long var1 = (long) this.field3551;
		long var3 = (long) this.field3552;
		long var5 = (long) this.field3553;
		this.field3559 = (int) Math.sqrt((double) (var5 * var5 + var1 * var1 + var3 * var3));
		if (this.field3556 == 0) {
			this.field3556 = 1;
		}
		if (this.field3557 == 0) {
			this.field3560 = 2147483647L;
		} else if (this.field3557 == 1) {
			this.field3560 = this.field3559 * 8 / this.field3556;
			this.field3560 *= this.field3560;
		} else if (this.field3557 == 2) {
			this.field3560 = this.field3559 * 8 / this.field3556;
		}
		if (this.field3558) {
			this.field3559 *= -1;
		}
	}
}

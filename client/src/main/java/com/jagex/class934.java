package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aie")
public class class934 extends class400 {

	@ObfuscatedName("aie.c")
	public byte[] field10705;

	@ObfuscatedName("aie.r")
	public int field10704;

	@ObfuscatedName("aie.v")
	public int field10702;

	@ObfuscatedName("aie.o")
	public int field10703;

	@ObfuscatedName("aie.s")
	public int field10701;

	@ObfuscatedName("aie.y")
	public int field10700;

	@ObfuscatedName("aie.q")
	public final int field10706;

	@ObfuscatedName("aie.x")
	public final int field10707;

	@ObfuscatedName("aie.b")
	public final int field10708;

	public class934(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.field10706 = (int) (arg7 * 4096.0F);
		this.field10707 = (int) (arg6 * 4096.0F);
		this.field10704 = this.field10708 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@ObfuscatedName("aie.n()V")
	public void method6147() {
		this.field10701 = 0;
		this.field10700 = 0;
	}

	@ObfuscatedName("aie.k(II)V")
	public void method6138(int arg0, int arg1) {
		if (arg0 == 0) {
			this.field10703 = this.field10707 - (arg1 < 0 ? -arg1 : arg1);
			this.field10703 = this.field10703 * this.field10703 >> 12;
			this.field10702 = 4096;
			this.field10700 = this.field10703;
			return;
		}
		this.field10702 = this.field10706 * this.field10703 >> 12;
		if (this.field10702 < 0) {
			this.field10702 = 0;
		} else if (this.field10702 > 4096) {
			this.field10702 = 4096;
		}
		this.field10703 = this.field10707 - (arg1 < 0 ? -arg1 : arg1);
		this.field10703 = this.field10703 * this.field10703 >> 12;
		this.field10703 = this.field10703 * this.field10702 >> 12;
		this.field10700 += this.field10704 * this.field10703 >> 12;
		this.field10704 = this.field10708 * this.field10704 >> 12;
	}

	@ObfuscatedName("aie.m()V")
	public void method6143() {
		this.field10704 = this.field10708;
		this.field10700 >>= 0x4;
		if (this.field10700 < 0) {
			this.field10700 = 0;
		} else if (this.field10700 > 255) {
			this.field10700 = 255;
		}
		this.method16813(this.field10701++, (byte) this.field10700);
		this.field10700 = 0;
	}

	@ObfuscatedName("aie.j(IB)V")
	public void method16813(int arg0, byte arg1) {
		this.field10705[arg0] = arg1;
	}
}

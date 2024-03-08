package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aim")
public class class933 extends class400 {

	@ObfuscatedName("aim.c")
	public byte[] field10698;

	@ObfuscatedName("aim.r")
	public int field10697;

	@ObfuscatedName("aim.v")
	public int field10699;

	@ObfuscatedName("aim.o")
	public final int[] field10696 = new int[this.field4198];

	public class933(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (int var7 = 0; var7 < this.field4198; var7++) {
			this.field10696[var7] = (short) (Math.pow((double) arg5, (double) var7) * 4096.0D);
		}
	}

	@ObfuscatedName("aim.n()V")
	public void method6147() {
		this.field10697 = 0;
		this.field10699 = 0;
	}

	@ObfuscatedName("aim.k(II)V")
	public void method6138(int arg0, int arg1) {
		this.field10699 += this.field10696[arg0] * arg1 >> 12;
	}

	@ObfuscatedName("aim.m()V")
	public void method6143() {
		this.field10699 = Math.abs(this.field10699);
		if (this.field10699 >= 4096) {
			this.field10699 = 4095;
		}
		this.method16809(this.field10697++, (byte) (this.field10699 >> 4));
		this.field10699 = 0;
	}

	@ObfuscatedName("aim.j(IB)V")
	public void method16809(int arg0, byte arg1) {
		this.field10698[this.field10697++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}

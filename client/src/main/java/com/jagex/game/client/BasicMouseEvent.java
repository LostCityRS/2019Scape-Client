package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("asf")
public final class BasicMouseEvent extends MouseEvent {

	@ObfuscatedName("asf.c")
	public static BasicMouseEvent[] field12388 = new BasicMouseEvent[0];

	@ObfuscatedName("xn.r")
	public static int field7883;

	@ObfuscatedName("asf.v")
	public static int field12384;

	@ObfuscatedName("asf.o")
	public int field12385;

	@ObfuscatedName("asf.s")
	public int field12386;

	@ObfuscatedName("asf.y")
	public long field12389;

	@ObfuscatedName("asf.q")
	public int field12387;

	@ObfuscatedName("asf.x")
	public int field12383;

	@ObfuscatedName("asf.e(I)I")
	public int getButtonAction() {
		return this.field12385;
	}

	@ObfuscatedName("asf.n(I)I")
	public int getMouseClickX() {
		return this.field12386;
	}

	@ObfuscatedName("asf.m(B)I")
	public int getMouseClickY() {
		return this.field12387;
	}

	@ObfuscatedName("asf.f(B)J")
	public long method17834() {
		return this.field12389;
	}

	@ObfuscatedName("asf.k(I)I")
	public int getCount() {
		return this.field12383;
	}

	@ObfuscatedName("asf.l(B)V")
	public void release() {
		BasicMouseEvent[] var1 = field12388;
		synchronized (field12388) {
			if (field12384 < field7883 - 1) {
				field12388[++field12384 - 1] = this;
			}
		}
	}

	@ObfuscatedName("abe.t(II)V")
	public static void method14915(int arg0) {
		field7883 = arg0;
		field12388 = new BasicMouseEvent[arg0];
		field12384 = 0;
	}

	@ObfuscatedName("tc.ae(IIIJII)Lasf;")
	public static BasicMouseEvent method8438(int arg0, int arg1, int arg2, long arg3, int arg4) {
		BasicMouseEvent[] var6 = field12388;
		synchronized (field12388) {
			BasicMouseEvent var7;
			if (field12384 == 0) {
				var7 = new BasicMouseEvent();
			} else {
				var7 = field12388[--field12384];
			}
			var7.field12385 = arg0;
			var7.field12386 = arg1;
			var7.field12387 = arg2;
			var7.field12389 = arg3;
			var7.field12383 = arg4;
			return var7;
		}
	}
}

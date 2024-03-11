package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("yn")
public class FloorOverlayType implements ConfigType, ConfigRelated {

	@ObfuscatedName("yn.n")
	public int field8152;

	@ObfuscatedName("yn.m")
	public int field8154 = 0;

	@ObfuscatedName("yn.k")
	public int field8155 = 0;

	@ObfuscatedName("yn.f")
	public boolean field8157 = true;

	@ObfuscatedName("yn.w")
	public int field8156 = 0;

	@ObfuscatedName("yn.l")
	public int field8163 = 512;

	@ObfuscatedName("yn.u")
	public boolean field8162 = true;

	@ObfuscatedName("yn.z")
	public int field8160 = 0;

	@ObfuscatedName("yn.p")
	public boolean field8161 = false;

	@ObfuscatedName("yn.d")
	public int field8158 = 1190656;

	@ObfuscatedName("yn.c")
	public int field8159 = 921050624;

	@ObfuscatedName("yn.r")
	public int field8164 = 256;

	@ObfuscatedName("yn.v")
	public int field8165 = 64;

	@ObfuscatedName("yn.o")
	public int field8166 = 0;

	@ObfuscatedName("yn.s")
	public int field8167 = 0;

	@ObfuscatedName("yn.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method10483(arg0, var2);
		}
	}

	@ObfuscatedName("yn.u(Lalw;II)V")
	public void method10483(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field8154 = method9160(arg0.g3());
		} else if (arg1 == 2) {
			this.field8155 = arg0.g1();
		} else if (arg1 == 3) {
			this.field8155 = arg0.g2();
			if (this.field8155 == 65535) {
				this.field8155 = -1;
			}
		} else if (arg1 == 5) {
			this.field8157 = false;
		} else if (arg1 == 7) {
			this.field8156 = method9160(arg0.g3());
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.field8163 = arg0.g2() << 2;
			} else if (arg1 == 10) {
				this.field8162 = false;
			} else if (arg1 == 11) {
				this.field8160 = arg0.g1();
			} else if (arg1 == 12) {
				this.field8161 = true;
			} else if (arg1 == 13) {
				this.field8158 = arg0.g3();
			} else if (arg1 == 14) {
				this.field8159 = arg0.g1() << 2;
			} else if (arg1 == 16) {
				this.field8164 = arg0.g1();
			} else if (arg1 == 20) {
				this.field8165 = arg0.g2();
			} else if (arg1 == 21) {
				this.field8166 = arg0.g1();
			} else if (arg1 == 22) {
				this.field8167 = arg0.g2();
			}
		}
	}

	@ObfuscatedName("yn.n(I)V")
	public void postDecode() {
		this.field8160 = this.field8160 << 8 | this.field8152;
	}

	@ObfuscatedName("uk.p(II)I")
	public static int method9160(int arg0) {
		return arg0 == 16711935 ? -1 : ColourUtils.method10521(arg0);
	}

	@ObfuscatedName("yn.z(IB)V")
	public void method2998(int arg0) {
		this.field8152 = arg0;
	}
}

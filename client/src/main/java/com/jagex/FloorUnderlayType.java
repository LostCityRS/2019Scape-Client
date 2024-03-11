package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aaz")
public class FloorUnderlayType implements ConfigType, ConfigRelated {

	@ObfuscatedName("aaz.e")
	public int field8547 = 0;

	@ObfuscatedName("aaz.n")
	public int field8542 = 0;

	@ObfuscatedName("aaz.m")
	public int field8543 = 512;

	@ObfuscatedName("aaz.k")
	public boolean field8544 = true;

	@ObfuscatedName("aaz.f")
	public boolean field8548 = true;

	@ObfuscatedName("aaz.w")
	public int field8546;

	@ObfuscatedName("aaz.l")
	public int field8541;

	@ObfuscatedName("aaz.u")
	public int field8545;

	@ObfuscatedName("aaz.z")
	public int field8549;

	@ObfuscatedName("aaz.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method14486(arg0, var2);
		}
	}

	@ObfuscatedName("aaz.u(Lalw;IB)V")
	public void method14486(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field8547 = arg0.g3();
			this.method14487(this.field8547);
		} else if (arg1 == 2) {
			this.field8542 = arg0.g2();
			if (this.field8542 == 65535) {
				this.field8542 = -1;
			}
		} else if (arg1 == 3) {
			this.field8543 = arg0.g2() << 2;
		} else if (arg1 == 4) {
			this.field8544 = false;
		} else if (arg1 == 5) {
			this.field8548 = false;
		}
	}

	@ObfuscatedName("aaz.p(II)V")
	public void method14487(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (double) (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}
		if (var6 < var8) {
			var8 = var6;
		}
		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}
		if (var6 > var10) {
			var10 = var6;
		}
		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}
			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}
		double var18 = var12 / 6.0D;
		this.field8541 = (int) (var14 * 256.0D);
		this.field8545 = (int) (var16 * 256.0D);
		if (this.field8541 < 0) {
			this.field8541 = 0;
		} else if (this.field8541 > 255) {
			this.field8541 = 255;
		}
		if (this.field8545 < 0) {
			this.field8545 = 0;
		} else if (this.field8545 > 255) {
			this.field8545 = 255;
		}
		if (var16 > 0.5D) {
			this.field8549 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			this.field8549 = (int) (var14 * var16 * 512.0D);
		}
		if (this.field8549 < 1) {
			this.field8549 = 1;
		}
		this.field8546 = (int) ((double) this.field8549 * var18);
	}

	@ObfuscatedName("aaz.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("aaz.z(IB)V")
	public void method2998(int arg0) {
	}
}

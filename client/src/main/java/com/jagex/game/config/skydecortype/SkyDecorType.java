package com.jagex.game.config.skydecortype;

import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import deob.ObfuscatedName;

@ObfuscatedName("iy")
public class SkyDecorType implements ConfigType, MutableConfig {

	@ObfuscatedName("iy.e")
	public int field2780;

	@ObfuscatedName("iy.n")
	public int field2776 = 0;

	@ObfuscatedName("iy.m")
	public int field2783;

	@ObfuscatedName("iy.k")
	public int field2779;

	@ObfuscatedName("iy.f")
	public int field2777;

	@ObfuscatedName("iy.w")
	public boolean field2781;

	@ObfuscatedName("iy.l")
	public int field2782 = 16777216;

	@ObfuscatedName("iy.u")
	public int field2778;

	@ObfuscatedName("iy.z")
	public int field2784;

	@ObfuscatedName("iy.p")
	public int field2785;

	@ObfuscatedName("iy.d")
	public int field2786;

	@ObfuscatedName("iy.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}
			this.method4593(buf, var2);
		}
	}

	@ObfuscatedName("iy.u(Lalw;IB)V")
	public void method4593(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field2776 = arg0.g2();
		} else if (arg1 == 2) {
			this.field2781 = true;
		} else if (arg1 == 3) {
			this.field2783 = arg0.g2s();
			this.field2779 = arg0.g2s();
			this.field2777 = arg0.g2s();
		} else if (arg1 == 4) {
			this.field2780 = arg0.g1();
		} else if (arg1 == 5) {
			this.field2778 = arg0.gSmart2or4null();
		} else if (arg1 == 6) {
			this.field2782 = arg0.g3();
		} else if (arg1 == 7) {
			this.field2784 = arg0.g2s();
			this.field2785 = arg0.g2s();
			this.field2786 = arg0.g2s();
		}
	}

	@ObfuscatedName("iy.z(IB)V")
	public void setId(int arg0) {
	}

	@ObfuscatedName("iy.n(I)V")
	public void postDecode() {
	}
}

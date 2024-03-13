package com.jagex.game.config.flotype;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.ColourUtils;
import com.jagex.game.client.ConfigRelated;
import com.jagex.game.config.ConfigType;
import deob.ObfuscatedName;

@ObfuscatedName("yn")
public class FloorOverlayType implements ConfigType, ConfigRelated {

	@ObfuscatedName("yn.n")
	public int field8152;

	@ObfuscatedName("yn.m")
	public int rgb = 0;

	@ObfuscatedName("yn.k")
	public int texture = 0;

	@ObfuscatedName("yn.f")
	public boolean occlude = true;

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
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("yn.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			this.rgb = method9160(buf.g3());
		} else if (code == 2) {
			this.texture = buf.g1();
		} else if (code == 3) {
			this.texture = buf.g2();
			if (this.texture == 65535) {
				this.texture = -1;
			}
		} else if (code == 5) {
			this.occlude = false;
		} else if (code == 7) {
			this.field8156 = method9160(buf.g3());
		} else if (code != 8) {
			if (code == 9) {
				this.field8163 = buf.g2() << 2;
			} else if (code == 10) {
				this.field8162 = false;
			} else if (code == 11) {
				this.field8160 = buf.g1();
			} else if (code == 12) {
				this.field8161 = true;
			} else if (code == 13) {
				this.field8158 = buf.g3();
			} else if (code == 14) {
				this.field8159 = buf.g1() << 2;
			} else if (code == 16) {
				this.field8164 = buf.g1();
			} else if (code == 20) {
				this.field8165 = buf.g2();
			} else if (code == 21) {
				this.field8166 = buf.g1();
			} else if (code == 22) {
				this.field8167 = buf.g2();
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

package com.jagex.game.config.flotype;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.ColourUtils;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import deob.ObfuscatedName;

@ObfuscatedName("yn")
public class FloorOverlayType implements ConfigType, MutableConfig {

	@ObfuscatedName("yn.n")
	public int id;

	@ObfuscatedName("yn.m")
	public int rgb = 0;

	@ObfuscatedName("yn.k")
	public int material = -1;

	@ObfuscatedName("yn.f")
	public boolean occlude = true;

	@ObfuscatedName("yn.w")
	public int averagecolour = -1;

	@ObfuscatedName("yn.l")
	public int materialscale = 512;

	@ObfuscatedName("yn.u")
	public boolean hardshadow = true;

	@ObfuscatedName("yn.z")
	public int priority = 0;

	@ObfuscatedName("yn.p")
	public boolean blend = false;

	@ObfuscatedName("yn.d")
	public int waterfogcolour = 0x122b3d;

	@ObfuscatedName("yn.c")
	public int waterfogscale = 512;

	@ObfuscatedName("yn.r")
	public int waterfogoffset = 256;

	@ObfuscatedName("yn.v")
	public int field8165 = 64;

	@ObfuscatedName("yn.o")
	public int field8166 = 0;

	@ObfuscatedName("yn.s")
	public int field8167 = 64;

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
			this.rgb = convertColour(buf.g3());
		} else if (code == 2) {
			this.material = buf.g1();
		} else if (code == 3) {
			this.material = buf.g2();

			if (this.material == 65535) {
				this.material = -1;
			}
		} else if (code == 5) {
			this.occlude = false;
		} else if (code == 7) {
			this.averagecolour = convertColour(buf.g3());
		} else if (code == 8) {
			// empty
		} else if (code == 9) {
			this.materialscale = buf.g2() << 2;
		} else if (code == 10) {
			this.hardshadow = false;
		} else if (code == 11) {
			this.priority = buf.g1();
		} else if (code == 12) {
			this.blend = true;
		} else if (code == 13) {
			this.waterfogcolour = buf.g3();
		} else if (code == 14) {
			this.waterfogscale = buf.g1() << 2;
		} else if (code == 16) {
			this.waterfogoffset = buf.g1();
		} else if (code == 20) {
			this.field8165 = buf.g2();
		} else if (code == 21) {
			this.field8166 = buf.g1();
		} else if (code == 22) {
			this.field8167 = buf.g2();
		}
	}

	@ObfuscatedName("yn.n(I)V")
	public void postDecode() {
		this.priority = this.priority << 8 | this.id;
	}

	@ObfuscatedName("uk.p(II)I")
	public static int convertColour(int color) {
		return color == 0xFF00FF ? -1 : ColourUtils.hslToRgb(color);
	}

	@ObfuscatedName("yn.z(IB)V")
	public void setId(int id) {
		this.id = id;
	}
}

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
	public int rgb = 0 * 592157171;

	@ObfuscatedName("yn.k")
	public int material = -1685253883 * -462296013;

	@ObfuscatedName("yn.f")
	public boolean occlude = true;

	@ObfuscatedName("yn.w")
	public int averagecolour = -690404605 * 1773420629;

	@ObfuscatedName("yn.l")
	public int materialscale = 183582208 * -2047499425;

	@ObfuscatedName("yn.u")
	public boolean hardshadow = true;

	@ObfuscatedName("yn.z")
	public int priority = 1907344776 * -205172655;

	@ObfuscatedName("yn.p")
	public boolean blend = false;

	@ObfuscatedName("yn.d")
	public int waterfogcolour = 1233755641 * 1502845029;

	@ObfuscatedName("yn.c")
	public int waterfogscale = 2059861312;

	@ObfuscatedName("yn.r")
	public int waterfogoffset = -1677496433 * -503537775;

	@ObfuscatedName("yn.v")
	public int field8165 = -535383117 * -129782971;

	@ObfuscatedName("yn.o")
	public int field8166 = 0 * -703195503;

	@ObfuscatedName("yn.s")
	public int field8167 = -1934904128 * 1714018651;

	@ObfuscatedName("yn.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("yn.u(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.rgb = colourFudge(arg0.g3());
		} else if (arg1 == 2) {
			this.material = arg0.g1();
		} else if (arg1 == 3) {
			this.material = arg0.g2();
			if (this.material == 65535) {
				this.material = -1;
			}
		} else if (arg1 == 5) {
			this.occlude = false;
		} else if (arg1 == 7) {
			this.averagecolour = colourFudge(arg0.g3());
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.materialscale = arg0.g2() << 2;
			} else if (arg1 == 10) {
				this.hardshadow = false;
			} else if (arg1 == 11) {
				this.priority = arg0.g1();
			} else if (arg1 == 12) {
				this.blend = true;
			} else if (arg1 == 13) {
				this.waterfogcolour = arg0.g3();
			} else if (arg1 == 14) {
				this.waterfogscale = (arg0.g1() << 2) * -2115298315;
			} else if (arg1 == 16) {
				this.waterfogoffset = arg0.g1();
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
		this.priority = this.priority << 8 | this.id;
	}

	@ObfuscatedName("uk.p(II)I")
	public static int colourFudge(int arg0) {
		return arg0 == 16711935 ? -1 : ColourUtils.hslToRgb(arg0);
	}

	@ObfuscatedName("yn.z(IB)V")
	public void setId(int arg0) {
		this.id = arg0;
	}
}

package com.jagex.game.config.flutype;

import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import deob.ObfuscatedName;

@ObfuscatedName("aaz")
public class FloorUnderlayType implements ConfigType, MutableConfig {

	@ObfuscatedName("aaz.e")
	public int colour = 0;

	@ObfuscatedName("aaz.n")
	public int material = 0;

	@ObfuscatedName("aaz.m")
	public int materialscale = 512;

	@ObfuscatedName("aaz.k")
	public boolean hardshadow = true;

	@ObfuscatedName("aaz.f")
	public boolean occlude = true;

	@ObfuscatedName("aaz.w")
	public int hue;

	@ObfuscatedName("aaz.l")
	public int saturation;

	@ObfuscatedName("aaz.u")
	public int lightness;

	@ObfuscatedName("aaz.z")
	public int chroma;

	@ObfuscatedName("aaz.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}

			this.decode(buf, var2);
		}
	}

	@ObfuscatedName("aaz.u(Lalw;IB)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			this.colour = buf.g3();
			this.computeColour(this.colour);
		} else if (code == 2) {
			this.material = buf.g2();

			if (this.material == 65535) {
				this.material = -1;
			}
		} else if (code == 3) {
			this.materialscale = buf.g2() << 2;
		} else if (code == 4) {
			this.hardshadow = false;
		} else if (code == 5) {
			this.occlude = false;
		}
	}

	@ObfuscatedName("aaz.p(II)V")
	public void computeColour(int arg0) {
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
		this.saturation = (int) (var14 * 256.0D);
		this.lightness = (int) (var16 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
		if (var16 > 0.5D) {
			this.chroma = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			this.chroma = (int) (var14 * var16 * 512.0D);
		}
		if (this.chroma < 1) {
			this.chroma = 1;
		}
		this.hue = (int) ((double) this.chroma * var18);
	}

	@ObfuscatedName("aaz.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("aaz.z(IB)V")
	public void setId(int arg0) {
	}
}

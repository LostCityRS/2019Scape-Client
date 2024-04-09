package com.jagex.game.load;

import com.jagex.core.utils.MonotonicTime;
import com.jagex.graphics.Font;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("kz")
public abstract class LoadingScreenProgressDisplay implements LoadingScreenElement {

	@ObfuscatedName("kz.e")
	public final Js5 field3028;

	@ObfuscatedName("kz.n")
	public final Js5 field3026;

	@ObfuscatedName("kz.m")
	public final LoadingScreenProgressDisplayConfig field3027;

	@ObfuscatedName("kz.k")
	public Font field3029;

	@ObfuscatedName("kz.f")
	public int field3030;

	@ObfuscatedName("kz.w")
	public long field3031;

	public LoadingScreenProgressDisplay(Js5 arg0, Js5 arg1, LoadingScreenProgressDisplayConfig arg2) {
		this.field3028 = arg0;
		this.field3026 = arg1;
		this.field3027 = arg2;
	}

	@ObfuscatedName("kz.n(ZI)V")
	public void method5105(boolean arg0) {
		int var2 = this.field3027.field3167.computeX(this.field3027.field3163, Client.frameWidth) + this.field3027.field3161;
		int var3 = this.field3027.field3159.computeY(this.field3027.field3160, Client.frameHeight) + this.field3027.field3162;
		this.method5121(arg0, var2, var3);
		this.method5122(arg0, var2, var3);
		String var4 = Loading.field593.method4852();
		if (MonotonicTime.get() - this.field3031 > 10000L) {
			var4 = var4 + " (" + Loading.field593.method4855().field2920 + ")";
		}
		this.field3029.drawStringCenter(var4, this.field3027.field3163 / 2 + var2, this.field3027.field3165 + this.field3027.field3160 / 2 + var3 + 4, this.field3027.field3164, -1);
	}

	@ObfuscatedName("kz.e(I)V")
	public void method5104() {
		FontMetrics var1 = FontMetrics.createFontMetrics(this.field3026, this.field3027.field3166, Client.fontProvider);
		this.field3029 = Client.toolkit.createFont(var1, SpriteDataProvider.get(this.field3028, this.field3027.field3166), true);
	}

	@ObfuscatedName("kz.m(I)Z")
	public boolean method5106() {
		boolean var1 = true;
		if (!this.field3028.loadFile(this.field3027.field3166)) {
			var1 = false;
		}
		if (!this.field3026.loadFile(this.field3027.field3166)) {
			var1 = false;
		}
		return var1;
	}

	@ObfuscatedName("kz.d(B)I")
	public int method5123() {
		int var1 = Loading.field593.method4851();
		int var2 = var1 * 100;
		if (this.field3030 == var1 && var1 != 0) {
			int var3 = Loading.field593.method4874();
			if (var3 > var1) {
				long var4 = this.field3031 - Loading.field593.method4872();
				if (var4 > 0L) {
					long var6 = var4 * 10000L / (long) var1 * (long) (var3 - var1);
					long var8 = (MonotonicTime.get() - this.field3031) * 10000L;
					if (var8 < var6) {
						var2 = (int) ((long) (var3 - var1) * var8 * 100L / var6 + (long) (var1 * 100));
					} else {
						var2 = var3 * 100;
					}
				}
			}
		} else {
			this.field3030 = var1;
			this.field3031 = MonotonicTime.get();
		}
		return var2;
	}

	@ObfuscatedName("kz.z(ZIIS)V")
	public abstract void method5121(boolean arg0, int arg1, int arg2);

	@ObfuscatedName("kz.p(ZIII)V")
	public abstract void method5122(boolean arg0, int arg1, int arg2);
}

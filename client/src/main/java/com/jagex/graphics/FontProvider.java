package com.jagex.graphics;

import com.jagex.core.datastruct.Pair;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("oi")
public class FontProvider implements FontIconProvider {

	@ObfuscatedName("oi.e")
	public final Js5 js5Sprites;

	@ObfuscatedName("oi.n")
	public final Js5 js5FontMetrics;

	@ObfuscatedName("oi.m")
	public final SoftLruHashTable fontCache = new SoftLruHashTable(20);

	@ObfuscatedName("oi.k")
	public final SoftLruHashTable fontMetricsCache = new SoftLruHashTable(20);

	@ObfuscatedName("oi.f")
	public final int[] fontIds;

	@ObfuscatedName("oi.w")
	public SoftLruHashTable iconCache;

	@ObfuscatedName("oi.l")
	public Toolkit toolkit = null;

	@ObfuscatedName("oi.u")
	public Map fonts = null;

	public FontProvider(Toolkit arg0, Js5 arg1, Js5 arg2, int[] arg3) {
		this.toolkit = arg0;
		this.js5Sprites = arg1;
		this.js5FontMetrics = arg2;
		this.fontIds = arg3;
		this.iconCache = new SoftLruHashTable(20);
	}

	@ObfuscatedName("oi.e(Loq;I)V")
	public void loadFonts(FontFactory arg0) {
		this.fonts = new HashMap(this.fontIds.length);
		for (int var2 = 0; var2 < this.fontIds.length; var2++) {
			int var3 = this.fontIds[var2];
			FontMetrics var4 = FontMetrics.createFontMetrics(this.js5FontMetrics, var3, this);
			byte[] var5 = this.js5Sprites.fetchFile(var3);
			Object var6 = arg0.createFont(var5, var4, true);
			this.fonts.put(var2, new Pair(var6, var4));
		}
	}

	@ObfuscatedName("oi.n(S)V")
	public void clearFonts() {
		this.fonts = null;
	}

	@ObfuscatedName("oi.m(I)I")
	public int getLoadedFontsCount() {
		return this.getLoadedFontsCount(false);
	}

	@ObfuscatedName("oi.k(ZI)I")
	public int getLoadedFontsCount(boolean arg0) {
		if (this.fontIds == null) {
			return 0;
		} else if (arg0 || this.fonts == null) {
			int var2 = 0;
			for (int var3 = 0; var3 < this.fontIds.length; var3++) {
				int var4 = this.fontIds[var3];
				if (this.js5Sprites.loadFile(var4)) {
					var2++;
				}
				if (this.js5FontMetrics.loadFile(var4)) {
					var2++;
				}
			}
			return var2;
		} else {
			return this.fontIds.length * 2;
		}
	}

	@ObfuscatedName("oi.f(B)I")
	public int getFontsCount() {
		return this.fontIds == null ? 0 : this.fontIds.length * 2;
	}

	@ObfuscatedName("oi.w(Loq;IZZI)Ljava/lang/Object;")
	public Object getFont(FontFactory arg0, int arg1, boolean arg2, boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.fontIds != null) {
			for (int var5 = 0; var5 < this.fontIds.length; var5++) {
				if (this.fontIds[var5] == arg1) {
					return ((Pair) this.fonts.get(var5)).first;
				}
			}
		}
		Object var6 = this.fontCache.get((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (var6 != null) {
			return var6;
		}
		byte[] var7 = this.js5Sprites.fetchFile(arg1);
		if (var7 == null) {
			return null;
		}
		FontMetrics var8 = this.getFontMetrics(arg0, arg1, arg2, false);
		if (var8 == null) {
			return null;
		} else {
			Object var9 = arg0.createFont(var7, var8, arg3);
			this.fontCache.put(var9, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return var9;
		}
	}

	@ObfuscatedName("oi.l(Loq;II)Laac;")
	public FontMetrics getFontMetrics(FontFactory arg0, int arg1) {
		return this.getFontMetrics(arg0, arg1, true, true);
	}

	@ObfuscatedName("oi.u(Loq;IZZB)Laac;")
	public FontMetrics getFontMetrics(FontFactory arg0, int arg1, boolean arg2, boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.fontIds != null) {
			for (int var5 = 0; var5 < this.fontIds.length; var5++) {
				if (this.fontIds[var5] == arg1) {
					return (FontMetrics) ((Pair) this.fonts.get(var5)).second;
				}
			}
		}
		if (arg3) {
			this.js5Sprites.loadFile(arg1);
		}
		FontMetrics var6 = (FontMetrics) this.fontMetricsCache.get((long) arg1);
		if (var6 != null) {
			return var6;
		}
		FontMetrics var7 = FontMetrics.createFontMetrics(this.js5FontMetrics, arg1, this);
		if (var7 == null) {
			return null;
		} else {
			if (arg2) {
				this.fontMetricsCache.put(var7, (long) arg1);
			}
			return var7;
		}
	}

	@ObfuscatedName("oi.z(B)V")
	public void cacheReset() {
		this.fontMetricsCache.reset();
		this.fontCache.reset();
		if (this.iconCache != null) {
			this.iconCache.reset();
		}
	}

	@ObfuscatedName("oi.p(II)V")
	public void cacheClean(int arg0) {
		this.fontMetricsCache.clean(arg0);
		this.fontCache.clean(arg0);
		if (this.iconCache != null) {
			this.iconCache.clean(arg0);
		}
	}

	@ObfuscatedName("oi.d(I)V")
	public void cacheRemoveSoftReferences() {
		this.fontMetricsCache.clear();
		this.fontCache.clear();
		if (this.iconCache != null) {
			this.iconCache.clear();
		}
	}

	@ObfuscatedName("oi.c(Ldh;II)[Lcm;")
	public Sprite[] getIconSprites(Toolkit arg0, int arg1) {
		if (this.iconCache == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.toolkit;
		} else {
			if (this.toolkit != arg0) {
				this.iconCache.reset();
			}
			this.toolkit = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		Sprite[] var3 = (Sprite[]) this.iconCache.get((long) arg1);
		if (var3 == null) {
			SpriteData[] var4 = SpriteDataProvider.method1608(this.js5Sprites, arg1, 0);
			if (var4 != null && var4.length > 0) {
				var3 = new Sprite[var4.length];
				for (int var5 = 0; var5 < var4.length; var5++) {
					var3[var5] = arg0.createSprite(var4[var5], true);
				}
				this.iconCache.put(var3, (long) arg1);
			}
		}
		return var3;
	}

	@ObfuscatedName("oi.r(II)I")
	public int getIconWidth(int arg0) {
		Sprite[] var2 = this.getIconSprites(this.toolkit, arg0);
		return var2 == null ? 0 : var2[0].getX();
	}
}

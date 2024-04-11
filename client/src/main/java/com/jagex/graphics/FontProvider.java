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

	public FontProvider(Toolkit toolkit, Js5 js5Sprites, Js5 js5FontMetrics, int[] fontIds) {
		this.toolkit = toolkit;
		this.js5Sprites = js5Sprites;
		this.js5FontMetrics = js5FontMetrics;
		this.fontIds = fontIds;
		this.iconCache = new SoftLruHashTable(20);
	}

	@ObfuscatedName("oi.e(Loq;I)V")
	public void loadFonts(FontFactory factory) {
		this.fonts = new HashMap(this.fontIds.length);
		for (int index = 0; index < this.fontIds.length; index++) {
			int fontId = this.fontIds[index];
			FontMetrics fontMetrics = FontMetrics.createFontMetrics(this.js5FontMetrics, fontId, this);
			byte[] bytes = this.js5Sprites.fetchFile(fontId);
			Object font = factory.createFont(bytes, fontMetrics, true);
			this.fonts.put(index, new Pair(font, fontMetrics));
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
			int count = 0;
			for (int index = 0; index < this.fontIds.length; index++) {
				int fontId = this.fontIds[index];
				if (this.js5Sprites.loadFile(fontId)) {
					count++;
				}
				if (this.js5FontMetrics.loadFile(fontId)) {
					count++;
				}
			}
			return count;
		} else {
			return this.fontIds.length * 2;
		}
	}

	@ObfuscatedName("oi.f(B)I")
	public int getFontsCount() {
		return this.fontIds == null ? 0 : this.fontIds.length * 2;
	}

	@ObfuscatedName("oi.w(Loq;IZZI)Ljava/lang/Object;")
	public Object getFont(FontFactory factory, int fontId, boolean cache, boolean arg3) {
		if (fontId == -1) {
			return null;
		}
		if (this.fontIds != null) {
			for (int var5 = 0; var5 < this.fontIds.length; var5++) {
				if (this.fontIds[var5] == fontId) {
					return ((Pair) this.fonts.get(var5)).first;
				}
			}
		}
		Object cached = this.fontCache.get((long) (fontId << 1 | (arg3 ? 1 : 0)));
		if (cached != null) {
			return cached;
		}
		byte[] bytes = this.js5Sprites.fetchFile(fontId);
		if (bytes == null) {
			return null;
		}
		FontMetrics fontMetrics = this.getFontMetrics(factory, fontId, cache, false);
		if (fontMetrics == null) {
			return null;
		} else {
			Object font = factory.createFont(bytes, fontMetrics, arg3);
			this.fontCache.put(font, (long) (fontId << 1 | (arg3 ? 1 : 0)));
			return font;
		}
	}

	@ObfuscatedName("oi.l(Loq;II)Laac;")
	public FontMetrics getFontMetrics(FontFactory factory, int fontId) {
		return this.getFontMetrics(factory, fontId, true, true);
	}

	@ObfuscatedName("oi.u(Loq;IZZB)Laac;")
	public FontMetrics getFontMetrics(FontFactory arg0, int fontId, boolean cache, boolean arg3) {
		if (fontId == -1) {
			return null;
		}
		if (this.fontIds != null) {
			for (int var5 = 0; var5 < this.fontIds.length; var5++) {
				if (this.fontIds[var5] == fontId) {
					return (FontMetrics) ((Pair) this.fonts.get(var5)).second;
				}
			}
		}
		if (arg3) {
			this.js5Sprites.loadFile(fontId);
		}
		FontMetrics cached = (FontMetrics) this.fontMetricsCache.get((long) fontId);
		if (cached != null) {
			return cached;
		}
		FontMetrics fontMetrics = FontMetrics.createFontMetrics(this.js5FontMetrics, fontId, this);
		if (fontMetrics == null) {
			return null;
		} else {
			if (cache) {
				this.fontMetricsCache.put(fontMetrics, (long) fontId);
			}
			return fontMetrics;
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
	public Sprite[] getIconSprites(Toolkit toolkit, int id) {
		if (this.iconCache == null) {
			return null;
		}
		if (toolkit == null) {
			toolkit = this.toolkit;
		} else {
			if (this.toolkit != toolkit) {
				this.iconCache.reset();
			}
			this.toolkit = toolkit;
		}
		if (toolkit == null) {
			return null;
		}
		Sprite[] cached = (Sprite[]) this.iconCache.get((long) id);
		if (cached == null) {
			SpriteData[] sprites = SpriteDataProvider.method1608(this.js5Sprites, id, 0);
			if (sprites != null && sprites.length > 0) {
				cached = new Sprite[sprites.length];
				for (int index = 0; index < sprites.length; index++) {
					cached[index] = toolkit.createSprite(sprites[index], true);
				}
				this.iconCache.put(cached, (long) id);
			}
		}
		return cached;
	}

	@ObfuscatedName("oi.r(II)I")
	public int getIconWidth(int id) {
		Sprite[] sprites = this.getIconSprites(this.toolkit, id);
		return sprites == null ? 0 : sprites[0].getX();
	}
}

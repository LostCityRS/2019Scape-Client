package com.jagex.game.config.cursortype;

import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.graphics.SpriteData;
import com.jagex.graphics.SpriteDataProvider;
import deob.ObfuscatedName;

@ObfuscatedName("xj")
public class CursorType implements ConfigType {

	@ObfuscatedName("xj.e")
	public final CursorTypeFactory myList;

	@ObfuscatedName("xj.n")
	public int graphic;

	@ObfuscatedName("xj.m")
	public int hotspotx;

	@ObfuscatedName("xj.k")
	public int hotspoty;

	public CursorType(int id, CursorTypeFactory factory) {
		this.myList = factory;
	}

	@ObfuscatedName("xj.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("xj.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			this.graphic = buf.gSmart2or4null();
		} else if (code == 2) {
			this.hotspotx = buf.g1();
			this.hotspoty = buf.g1();
		}
	}

	@ObfuscatedName("xj.z(I)Lde;")
	public synchronized SpriteData getCursor() {
		SpriteData cached = (SpriteData) this.myList.cursorCache.get((long) this.graphic);
		if (cached != null) {
			return cached;
		}
		SpriteData sprite = SpriteDataProvider.method1609(this.myList.js5, this.graphic, 0);
		if (sprite != null) {
			this.myList.cursorCache.put(sprite, (long) this.graphic);
		}
		return sprite;
	}

	@ObfuscatedName("xj.n(I)V")
	public void postDecode() {
	}
}

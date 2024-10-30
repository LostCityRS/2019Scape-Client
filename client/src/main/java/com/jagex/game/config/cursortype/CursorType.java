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

	public CursorType(int arg0, CursorTypeFactory arg1) {
		this.myList = arg1;
	}

	@ObfuscatedName("xj.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("xj.u(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.graphic = arg0.gSmart2or4s();
		} else if (arg1 == 2) {
			this.hotspotx = arg0.g1();
			this.hotspoty = arg0.g1();
		}
	}

	@ObfuscatedName("xj.z(I)Lde;")
	public synchronized SpriteData getCursor() {
		SpriteData var1 = (SpriteData) this.myList.cursorCache.get((long) this.graphic);
		if (var1 != null) {
			return var1;
		}
		SpriteData var2 = SpriteDataProvider.method1609(this.myList.js5, this.graphic, 0);
		if (var2 != null) {
			this.myList.cursorCache.put(var2, (long) this.graphic);
		}
		return var2;
	}

	@ObfuscatedName("xj.n(I)V")
	public void postDecode() {
	}
}

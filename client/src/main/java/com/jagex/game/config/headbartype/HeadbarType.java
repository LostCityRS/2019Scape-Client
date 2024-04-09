package com.jagex.game.config.headbartype;

import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.SpriteData;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("uk")
public class HeadbarType implements ConfigType {

	@ObfuscatedName("uk.e")
	public final HeadbarTypeFactory factory;

	@ObfuscatedName("uk.m")
	public int showpriority = 255;

	@ObfuscatedName("uk.k")
	public int hidepriority = 255;

	@ObfuscatedName("uk.f")
	public int fadeout = -1;

	@ObfuscatedName("uk.w")
	public int field7220 = 1;

	@ObfuscatedName("uk.l")
	public int sticktime = 70;

	@ObfuscatedName("uk.u")
	public int full = -1;

	@ObfuscatedName("uk.z")
	public int empty = -1;

	@ObfuscatedName("uk.p")
	public int fulllocalpartner = -1;

	@ObfuscatedName("uk.d")
	public int emptylocalpartner = -1;

	@ObfuscatedName("uk.c")
	public int fullglobalpartner = -1;

	@ObfuscatedName("uk.r")
	public int emptyglobalpartner = -1;

	public HeadbarType(int arg0, HeadbarTypeFactory factory) {
		this.factory = factory;
	}

	@ObfuscatedName("uk.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("uk.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			buf.g2();
		} else if (code == 2) {
			this.showpriority = buf.g1();
		} else if (code == 3) {
			this.hidepriority = buf.g1();
		} else if (code == 4) {
			this.fadeout = 0;
		} else if (code == 5) {
			this.sticktime = buf.g2();
		} else if (code == 6) {
			buf.g1();
		} else if (code == 7) {
			this.full = buf.gSmart2or4null();
		} else if (code == 8) {
			this.empty = buf.gSmart2or4null();
		} else if (code == 9) {
			this.fulllocalpartner = buf.gSmart2or4null();
		} else if (code == 10) {
			this.emptylocalpartner = buf.gSmart2or4null();
		} else if (code == 11) {
			this.fadeout = buf.g2();
		} else if (code == 12) {
			this.fullglobalpartner = buf.gSmart2or4null();
		} else if (code == 13) {
			this.emptyglobalpartner = buf.gSmart2or4null();
		}
	}

	@ObfuscatedName("uk.z(Ldh;IB)Lcm;")
	public Sprite getSprite(Toolkit toolkit, int id) {
		if (id < 0) {
			return null;
		}
		Sprite var3 = (Sprite) this.factory.spriteCache.get((long) id);
		if (var3 == null) {
			this.loadSprites(toolkit);
			var3 = (Sprite) this.factory.spriteCache.get((long) id);
		}
		return var3;
	}

	@ObfuscatedName("uk.p(Ldh;II)V")
	public void loadSprite(Toolkit toolkit, int id) {
		Js5 js5 = this.factory.configClient;
		if (id >= 0 && this.factory.spriteCache.get((long) id) == null && js5.loadFile(id)) {
			SpriteData var4 = SpriteDataProvider.get(js5, id);
			this.factory.spriteCache.put(toolkit.createSprite(var4, true), (long) id);
		}
	}

	@ObfuscatedName("uk.d(Ldh;I)V")
	public void loadSprites(Toolkit toolkit) {
		this.loadSprite(toolkit, this.full);
		this.loadSprite(toolkit, this.empty);
		this.loadSprite(toolkit, this.fulllocalpartner);
		this.loadSprite(toolkit, this.emptylocalpartner);
		this.loadSprite(toolkit, this.fullglobalpartner);
		this.loadSprite(toolkit, this.emptyglobalpartner);
	}

	@ObfuscatedName("uk.n(I)V")
	public void postDecode() {
	}
}

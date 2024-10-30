package com.jagex.game.config.headbartype;

import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.SpriteData;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.graphics.Toolkit;
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

	public HeadbarType(int arg0, HeadbarTypeFactory arg1) {
		this.factory = arg1;
	}

	@ObfuscatedName("uk.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("uk.u(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			arg0.g2();
		} else if (arg1 == 2) {
			this.showpriority = arg0.g1();
		} else if (arg1 == 3) {
			this.hidepriority = arg0.g1();
		} else if (arg1 == 4) {
			this.fadeout = 0;
		} else if (arg1 == 5) {
			this.sticktime = arg0.g2();
		} else if (arg1 == 6) {
			arg0.g1();
		} else if (arg1 == 7) {
			this.full = arg0.gSmart2or4s();
		} else if (arg1 == 8) {
			this.empty = arg0.gSmart2or4s();
		} else if (arg1 == 9) {
			this.fulllocalpartner = arg0.gSmart2or4s();
		} else if (arg1 == 10) {
			this.emptylocalpartner = arg0.gSmart2or4s();
		} else if (arg1 == 11) {
			this.fadeout = arg0.g2();
		} else if (arg1 == 12) {
			this.fullglobalpartner = arg0.gSmart2or4s();
		} else if (arg1 == 13) {
			this.emptyglobalpartner = arg0.gSmart2or4s();
		}
	}

	@ObfuscatedName("uk.z(Ldh;IB)Lcm;")
	public Sprite getSprite(Toolkit arg0, int arg1) {
		if (arg1 < 0) {
			return null;
		}
		Sprite var3 = (Sprite) this.factory.spriteCache.get((long) arg1);
		if (var3 == null) {
			this.loadSprites(arg0);
			var3 = (Sprite) this.factory.spriteCache.get((long) arg1);
		}
		return var3;
	}

	@ObfuscatedName("uk.p(Ldh;II)V")
	public void loadSprite(Toolkit arg0, int arg1) {
		Js5 var3 = this.factory.configClient;
		if (arg1 >= 0 && this.factory.spriteCache.get((long) arg1) == null && var3.loadFile(arg1)) {
			SpriteData var4 = SpriteDataProvider.get(var3, arg1);
			this.factory.spriteCache.put(arg0.createSprite(var4, true), (long) arg1);
		}
	}

	@ObfuscatedName("uk.d(Ldh;I)V")
	public void loadSprites(Toolkit arg0) {
		this.loadSprite(arg0, this.full);
		this.loadSprite(arg0, this.empty);
		this.loadSprite(arg0, this.fulllocalpartner);
		this.loadSprite(arg0, this.emptylocalpartner);
		this.loadSprite(arg0, this.fullglobalpartner);
		this.loadSprite(arg0, this.emptyglobalpartner);
	}

	@ObfuscatedName("uk.n(I)V")
	public void postDecode() {
	}
}

package com.jagex.game.config.hitmarktype;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.StringTools;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.SpriteData;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("vb")
public class HitmarkType implements ConfigType {

	@ObfuscatedName("vb.e")
	public final ConfigTypeList myList;

	@ObfuscatedName("vb.n")
	public final HitmarkTypeFactory factory;

	@ObfuscatedName("vb.u")
	public boolean damagecolour_set = false;

	@ObfuscatedName("vb.z")
	public int damagefont = -1;

	@ObfuscatedName("vb.p")
	public int damagecolour = 16777215;

	@ObfuscatedName("vb.d")
	public int sticktime = 70;

	@ObfuscatedName("vb.c")
	public int classgraphic = -1;

	@ObfuscatedName("vb.r")
	public int middlegraphic = -1;

	@ObfuscatedName("vb.v")
	public int leftgraphic = -1;

	@ObfuscatedName("vb.o")
	public int rightgraphic = -1;

	@ObfuscatedName("vb.s")
	public int scrolltooffsetx = 0;

	@ObfuscatedName("vb.y")
	public int scrolltooffsety = 0;

	@ObfuscatedName("vb.q")
	public int fadeat = -1;

	@ObfuscatedName("vb.x")
	public String damageformat = "";

	@ObfuscatedName("vb.b")
	public int replacemode = -1;

	@ObfuscatedName("vb.h")
	public int damageyof = 0;

	@ObfuscatedName("vb.a")
	public int graphicxof = 0;

	@ObfuscatedName("vb.g")
	public int graphicyof = 0;

	@ObfuscatedName("vb.i")
	public int[] multimark;

	@ObfuscatedName("vb.j")
	public int multivarbit = -1;

	@ObfuscatedName("vb.t")
	public int multivarp = -1;

	@ObfuscatedName("vb.ae")
	public int damagescaleto = 1;

	@ObfuscatedName("vb.ag")
	public int damagescalefrom = 1;

	public HitmarkType(int arg0, HitmarkTypeFactory factory, ConfigTypeList hitmarks) {
		this.factory = factory;
		this.myList = hitmarks;
	}

	@ObfuscatedName("vb.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("vb.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			this.damagefont = buf.gSmart2or4null();
		} else if (code == 2) {
			this.damagecolour = buf.g3();
			this.damagecolour_set = true;
		} else if (code == 3) {
			this.classgraphic = buf.gSmart2or4null();
		} else if (code == 4) {
			this.leftgraphic = buf.gSmart2or4null();
		} else if (code == 5) {
			this.middlegraphic = buf.gSmart2or4null();
		} else if (code == 6) {
			this.rightgraphic = buf.gSmart2or4null();
		} else if (code == 7) {
			this.scrolltooffsetx = buf.g2s();
		} else if (code == 8) {
			this.damageformat = buf.gjstr2();
		} else if (code == 9) {
			this.sticktime = buf.g2();
		} else if (code == 10) {
			this.scrolltooffsety = buf.g2s();
		} else if (code == 11) {
			this.fadeat = 0;
		} else if (code == 12) {
			this.replacemode = buf.g1();
		} else if (code == 13) {
			this.damageyof = buf.g2s();
		} else if (code == 14) {
			this.fadeat = buf.g2();
		} else if (code == 16) {
			this.graphicxof = buf.g2s();
			this.graphicyof = buf.g2s();
		} else if (code == 17 || code == 18) {
			this.multivarbit = buf.g2();
			if (this.multivarbit == 65535) {
				this.multivarbit = -1;
			}
			this.multivarp = buf.g2();
			if (this.multivarp == 65535) {
				this.multivarp = -1;
			}
			int defaultId = -1;
			if (code == 18) {
				defaultId = buf.g2();
				if (defaultId == 65535) {
					defaultId = -1;
				}
			}
			int length = buf.g1();
			this.multimark = new int[length + 2];
			for (int index = 0; index <= length; index++) {
				this.multimark[index] = buf.g2();
				if (this.multimark[index] == 65535) {
					this.multimark[index] = -1;
				}
			}
			this.multimark[length + 1] = defaultId;
		} else if (code == 19) {
			this.damagescaleto = buf.g2();
		} else if (code == 20) {
			this.damagescalefrom = buf.g2();
		}
	}

	@ObfuscatedName("vb.z(Lem;Lep;I)Lvb;")
	public final HitmarkType getVisible(VariableTypeProvider varProvider, VarIntDomain varDomain) {
		int i = -1;
		if (this.multimark == null) {
			return this;
		} else if (varProvider == null || varDomain == null) {
			return null;
		} else {
			if (this.multivarbit != -1) {
				VarBitType var4 = varProvider.getVarBitType(this.multivarbit);
				if (var4 != null) {
					i = varDomain.getVarBitValue(var4);
				}
			} else if (this.multivarp != -1) {
				VarType var5 = varProvider.getVarType(VarDomainType.PLAYER, this.multivarp);
				if (var5 != null) {
					i = varDomain.getVarValueInt(var5);
				}
			}
			if (i >= 0 && i < this.multimark.length - 1) {
				return this.multimark[i] == -1 ? null : (HitmarkType) this.myList.list(this.multimark[i]);
			} else {
				int var6 = this.multimark[this.multimark.length - 1];
				return var6 == -1 ? null : (HitmarkType) this.myList.list(var6);
			}
		}
	}

	@ObfuscatedName("vb.p(II)Ljava/lang/String;")
	public String method9252(int arg0) {
		String var2 = this.damageformat;
		int var3 = this.damagescaleto * arg0 / this.damagescalefrom;
		while (true) {
			int var4 = var2.indexOf("%1");
			if (var4 < 0) {
				return var2;
			}
			var2 = var2.substring(0, var4) + StringTools.method1898(var3, false) + var2.substring(var4 + 2);
		}
	}

	@ObfuscatedName("vb.d(Ldh;I)Lcm;")
	public Sprite getSprite(Toolkit toolkit) {
		if (this.classgraphic < 0) {
			return null;
		}
		Sprite sprite = (Sprite) this.factory.spriteCache.get((long) this.classgraphic);
		if (sprite == null) {
			this.loadSprites(toolkit);
			sprite = (Sprite) this.factory.spriteCache.get((long) this.classgraphic);
		}
		return sprite;
	}

	@ObfuscatedName("vb.c(Ldh;I)Lcm;")
	public Sprite getMiddleGraphicSprite(Toolkit toolkit) {
		if (this.middlegraphic < 0) {
			return null;
		}
		Sprite sprite = (Sprite) this.factory.spriteCache.get((long) this.middlegraphic);
		if (sprite == null) {
			this.loadSprites(toolkit);
			sprite = (Sprite) this.factory.spriteCache.get((long) this.middlegraphic);
		}
		return sprite;
	}

	@ObfuscatedName("vb.r(Ldh;I)Lcm;")
	public Sprite getLeftGraphicSprite(Toolkit toolkit) {
		if (this.leftgraphic < 0) {
			return null;
		}
		Sprite sprite = (Sprite) this.factory.spriteCache.get((long) this.leftgraphic);
		if (sprite == null) {
			this.loadSprites(toolkit);
			sprite = (Sprite) this.factory.spriteCache.get((long) this.leftgraphic);
		}
		return sprite;
	}

	@ObfuscatedName("vb.v(Ldh;B)Lcm;")
	public Sprite getRightGraphicSprite(Toolkit toolkit) {
		if (this.rightgraphic < 0) {
			return null;
		}
		Sprite sprite = (Sprite) this.factory.spriteCache.get((long) this.rightgraphic);
		if (sprite == null) {
			this.loadSprites(toolkit);
			sprite = (Sprite) this.factory.spriteCache.get((long) this.rightgraphic);
		}
		return sprite;
	}

	@ObfuscatedName("vb.o(Ldh;I)V")
	public void loadSprites(Toolkit toolkit) {
		Js5 js5 = this.factory.configClient;
		if (this.classgraphic >= 0 && this.factory.spriteCache.get((long) this.classgraphic) == null && js5.loadFile(this.classgraphic)) {
			SpriteData sprite = SpriteDataProvider.get(js5, this.classgraphic);
			this.factory.spriteCache.put(toolkit.createSprite(sprite, true), (long) this.classgraphic);
		}
		if (this.middlegraphic >= 0 && this.factory.spriteCache.get((long) this.middlegraphic) == null && js5.loadFile(this.middlegraphic)) {
			SpriteData sprite = SpriteDataProvider.get(js5, this.middlegraphic);
			this.factory.spriteCache.put(toolkit.createSprite(sprite, true), (long) this.middlegraphic);
		}
		if (this.leftgraphic >= 0 && this.factory.spriteCache.get((long) this.leftgraphic) == null && js5.loadFile(this.leftgraphic)) {
			SpriteData sprite = SpriteDataProvider.get(js5, this.leftgraphic);
			this.factory.spriteCache.put(toolkit.createSprite(sprite, true), (long) this.leftgraphic);
		}
		if (this.rightgraphic >= 0 && this.factory.spriteCache.get((long) this.rightgraphic) == null && js5.loadFile(this.rightgraphic)) {
			SpriteData sprite = SpriteDataProvider.get(js5, this.rightgraphic);
			this.factory.spriteCache.put(toolkit.createSprite(sprite, true), (long) this.rightgraphic);
		}
	}

	@ObfuscatedName("vb.n(I)V")
	public void postDecode() {
	}
}

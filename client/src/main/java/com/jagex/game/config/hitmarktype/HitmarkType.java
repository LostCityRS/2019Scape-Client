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
import com.jagex.graphics.Sprite;
import com.jagex.graphics.SpriteData;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.graphics.Toolkit;
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

	public HitmarkType(int arg0, HitmarkTypeFactory arg1, ConfigTypeList arg2) {
		this.factory = arg1;
		this.myList = arg2;
	}

	@ObfuscatedName("vb.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("vb.u(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.damagefont = arg0.gSmart2or4s();
		} else if (arg1 == 2) {
			this.damagecolour = arg0.g3();
			this.damagecolour_set = true;
		} else if (arg1 == 3) {
			this.classgraphic = arg0.gSmart2or4s();
		} else if (arg1 == 4) {
			this.leftgraphic = arg0.gSmart2or4s();
		} else if (arg1 == 5) {
			this.middlegraphic = arg0.gSmart2or4s();
		} else if (arg1 == 6) {
			this.rightgraphic = arg0.gSmart2or4s();
		} else if (arg1 == 7) {
			this.scrolltooffsetx = arg0.g2s();
		} else if (arg1 == 8) {
			this.damageformat = arg0.gjstr2();
		} else if (arg1 == 9) {
			this.sticktime = arg0.g2();
		} else if (arg1 == 10) {
			this.scrolltooffsety = arg0.g2s();
		} else if (arg1 == 11) {
			this.fadeat = 0;
		} else if (arg1 == 12) {
			this.replacemode = arg0.g1();
		} else if (arg1 == 13) {
			this.damageyof = arg0.g2s();
		} else if (arg1 == 14) {
			this.fadeat = arg0.g2();
		} else if (arg1 == 16) {
			this.graphicxof = arg0.g2s();
			this.graphicyof = arg0.g2s();
		} else if (arg1 == 17 || arg1 == 18) {
			this.multivarbit = arg0.g2();
			if (this.multivarbit == 65535) {
				this.multivarbit = -1;
			}
			this.multivarp = arg0.g2();
			if (this.multivarp == 65535) {
				this.multivarp = -1;
			}
			int var3 = -1;
			if (arg1 == 18) {
				var3 = arg0.g2();
				if (var3 == 65535) {
					var3 = -1;
				}
			}
			int var4 = arg0.g1();
			this.multimark = new int[var4 + 2];
			for (int var5 = 0; var5 <= var4; var5++) {
				this.multimark[var5] = arg0.g2();
				if (this.multimark[var5] == 65535) {
					this.multimark[var5] = -1;
				}
			}
			this.multimark[var4 + 1] = var3;
		} else if (arg1 == 19) {
			this.damagescaleto = arg0.g2();
		} else if (arg1 == 20) {
			this.damagescalefrom = arg0.g2();
		}
	}

	@ObfuscatedName("vb.z(Lem;Lep;I)Lvb;")
	public final HitmarkType getVisible(VariableTypeProvider arg0, VarIntDomain arg1) {
		int var3 = -1;
		if (this.multimark == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.multivarbit != -1) {
				VarBitType var4 = arg0.getVarBitType(this.multivarbit);
				if (var4 != null) {
					var3 = arg1.getVarBitValue(var4);
				}
			} else if (this.multivarp != -1) {
				VarType var5 = arg0.getVarType(VarDomainType.PLAYER, this.multivarp);
				if (var5 != null) {
					var3 = arg1.getVarValueInt(var5);
				}
			}
			if (var3 >= 0 && var3 < this.multimark.length - 1) {
				return this.multimark[var3] == -1 ? null : (HitmarkType) this.myList.list(this.multimark[var3]);
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
	public Sprite getSprite(Toolkit arg0) {
		if (this.classgraphic < 0) {
			return null;
		}
		Sprite var2 = (Sprite) this.factory.spriteCache.get((long) this.classgraphic);
		if (var2 == null) {
			this.loadSprites(arg0);
			var2 = (Sprite) this.factory.spriteCache.get((long) this.classgraphic);
		}
		return var2;
	}

	@ObfuscatedName("vb.c(Ldh;I)Lcm;")
	public Sprite getMiddleGraphicSprite(Toolkit arg0) {
		if (this.middlegraphic < 0) {
			return null;
		}
		Sprite var2 = (Sprite) this.factory.spriteCache.get((long) this.middlegraphic);
		if (var2 == null) {
			this.loadSprites(arg0);
			var2 = (Sprite) this.factory.spriteCache.get((long) this.middlegraphic);
		}
		return var2;
	}

	@ObfuscatedName("vb.r(Ldh;I)Lcm;")
	public Sprite getLeftGraphicSprite(Toolkit arg0) {
		if (this.leftgraphic < 0) {
			return null;
		}
		Sprite var2 = (Sprite) this.factory.spriteCache.get((long) this.leftgraphic);
		if (var2 == null) {
			this.loadSprites(arg0);
			var2 = (Sprite) this.factory.spriteCache.get((long) this.leftgraphic);
		}
		return var2;
	}

	@ObfuscatedName("vb.v(Ldh;B)Lcm;")
	public Sprite getRightGraphicSprite(Toolkit arg0) {
		if (this.rightgraphic < 0) {
			return null;
		}
		Sprite var2 = (Sprite) this.factory.spriteCache.get((long) this.rightgraphic);
		if (var2 == null) {
			this.loadSprites(arg0);
			var2 = (Sprite) this.factory.spriteCache.get((long) this.rightgraphic);
		}
		return var2;
	}

	@ObfuscatedName("vb.o(Ldh;I)V")
	public void loadSprites(Toolkit arg0) {
		Js5 var2 = this.factory.configClient;
		if (this.classgraphic >= 0 && this.factory.spriteCache.get((long) this.classgraphic) == null && var2.loadFile(this.classgraphic)) {
			SpriteData var3 = SpriteDataProvider.get(var2, this.classgraphic);
			this.factory.spriteCache.put(arg0.createSprite(var3, true), (long) this.classgraphic);
		}
		if (this.middlegraphic >= 0 && this.factory.spriteCache.get((long) this.middlegraphic) == null && var2.loadFile(this.middlegraphic)) {
			SpriteData var4 = SpriteDataProvider.get(var2, this.middlegraphic);
			this.factory.spriteCache.put(arg0.createSprite(var4, true), (long) this.middlegraphic);
		}
		if (this.leftgraphic >= 0 && this.factory.spriteCache.get((long) this.leftgraphic) == null && var2.loadFile(this.leftgraphic)) {
			SpriteData var5 = SpriteDataProvider.get(var2, this.leftgraphic);
			this.factory.spriteCache.put(arg0.createSprite(var5, true), (long) this.leftgraphic);
		}
		if (this.rightgraphic >= 0 && this.factory.spriteCache.get((long) this.rightgraphic) == null && var2.loadFile(this.rightgraphic)) {
			SpriteData var6 = SpriteDataProvider.get(var2, this.rightgraphic);
			this.factory.spriteCache.put(arg0.createSprite(var6, true), (long) this.rightgraphic);
		}
	}

	@ObfuscatedName("vb.n(I)V")
	public void postDecode() {
	}
}

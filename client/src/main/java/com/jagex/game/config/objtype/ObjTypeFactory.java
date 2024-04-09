package com.jagex.game.config.objtype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.IconCache;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.client.IconCacheKey;
import com.jagex.game.client.LocalisedText;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.defaults.GraphicsDefaults;
import com.jagex.game.world.entity.PlayerModel;
import com.jagex.graphics.Font;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.Sprite;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("abr")
public abstract class ObjTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("abr.e")
	public final Language languageId;

	@ObfuscatedName("abr.n")
	public boolean allowMembers;

	@ObfuscatedName("abr.m")
	public final Js5 configClient;

	@ObfuscatedName("abr.k")
	public final SoftLruHashTable modelCache = new SoftLruHashTable(50);

	@ObfuscatedName("abr.f")
	public final IconCache iconCache = new IconCache(250);

	@ObfuscatedName("abr.w")
	public final IconCacheKey field8609 = new IconCacheKey();

	@ObfuscatedName("abr.l")
	public final ConfigTypeList paramTL;

	@ObfuscatedName("abr.u")
	public int field8611;

	@ObfuscatedName("abr.z")
	public final String[] defaultops;

	@ObfuscatedName("abr.p")
	public final String[] defaultiops;

	public ObjTypeFactory(ModeGame modeGame, Language language, boolean allowMembers, Js5 configClient, ConfigTypeList list) {
		this.languageId = language;
		this.allowMembers = allowMembers;
		this.configClient = configClient;
		this.paramTL = list;
		if (ModeGame.RUNESCAPE == modeGame) {
			this.defaultops = new String[] { null, null, LocalisedText.TAKE.forLang(this.languageId), null, null, LocalisedText.EXAMINE.forLang(this.languageId) };
		} else {
			this.defaultops = new String[] { null, null, LocalisedText.TAKE.forLang(this.languageId), null, null, null };
		}
		this.defaultiops = new String[] { null, null, null, null, LocalisedText.DROP.forLang(this.languageId) };
	}

	@ObfuscatedName("abr.e(Ldh;IIIIILxg;I)Lcm;")
	public Sprite method14616(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, PlayerModel arg6) {
		this.field8609.field8607 = arg0.field1595;
		this.field8609.field8602 = arg1;
		this.field8609.field8604 = arg2;
		this.field8609.field8605 = arg3;
		this.field8609.field8606 = arg4;
		this.field8609.field8603 = arg5;
		this.field8609.field8608 = arg6 != null;
		return (Sprite) this.iconCache.get(this.field8609);
	}

	@ObfuscatedName("abr.n(Ldh;Ldh;IIIIZZILeu;Lxg;Lws;Lao;I)Lcm;")
	public Sprite method14617(Toolkit arg0, Toolkit arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, Font arg9, PlayerModel arg10, GraphicsDefaults arg11, ConfigTypeList arg12) {
		if (!arg7) {
			Sprite var14 = this.method14616(arg1, arg2, arg3, arg4, arg5, arg8, arg10);
			if (var14 != null) {
				return var14;
			}
		}
		ObjType var15 = (ObjType) arg12.list(arg2);
		if (arg3 > 1 && var15.countobj != null) {
			int var16 = -1;
			for (int var17 = 0; var17 < 10; var17++) {
				if (arg3 >= var15.countco[var17] && var15.countco[var17] != 0) {
					var16 = var15.countobj[var17];
				}
			}
			if (var16 != -1) {
				var15 = (ObjType) arg12.list(var16);
			}
		}
		int[] var18 = var15.method14646(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11);
		if (var18 == null) {
			return null;
		}
		Sprite var19;
		if (arg7) {
			var19 = arg0.createSprite(var18, 0, 36, 36, 32);
		} else {
			var19 = arg1.createSprite(var18, 0, 36, 36, 32);
		}
		if (!arg7) {
			IconCacheKey var20 = new IconCacheKey();
			var20.field8607 = arg1.field1595;
			var20.field8602 = arg2;
			var20.field8604 = arg3;
			var20.field8605 = arg4;
			var20.field8606 = arg5;
			var20.field8603 = arg8;
			var20.field8608 = arg10 != null;
			this.iconCache.put(var19, var20);
		}
		return var19;
	}

	@ObfuscatedName("abr.m(ZB)V")
	public void setAllowMembers(boolean arg0) {
		if (this.allowMembers != arg0) {
			this.allowMembers = arg0;
			this.cacheReset();
		}
	}

	@ObfuscatedName("abr.k(II)V")
	public void resetModelCache(int arg0) {
		this.field8611 = arg0;
		SoftLruHashTable var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
	}

	@ObfuscatedName("abr.f(I)V")
	public void cacheReset() {
		SoftLruHashTable var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
		IconCache var3 = this.iconCache;
		synchronized (this.iconCache) {
			this.iconCache.reset();
		}
	}

	@ObfuscatedName("abr.w(I)V")
	public void resetIconCache() {
		IconCache var1 = this.iconCache;
		synchronized (this.iconCache) {
			this.iconCache.reset();
		}
	}

	@ObfuscatedName("abr.l(IB)V")
	public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clean(arg0);
		}
		IconCache var4 = this.iconCache;
		synchronized (this.iconCache) {
			this.iconCache.clean(arg0);
		}
	}

	@ObfuscatedName("abr.u(I)V")
	public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clear();
		}
		IconCache var3 = this.iconCache;
		synchronized (this.iconCache) {
			this.iconCache.clear();
		}
	}
}

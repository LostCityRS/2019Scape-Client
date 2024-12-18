package com.jagex.game.config.meltype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aoc")
public class MapElementTypeList extends CachingConfigTypeList {

	public MapElementTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.MELTYPE, 128, new BasicMapElementTypeFactory(arg3, 64));
	}

	@ObfuscatedName("aoc.al(III)V")
	public void cacheResize(int arg0, int arg1) {
		super.cacheResize(arg0);
		((MapElementTypeFactory) this.factory).elementCache = new SoftLruHashTable(arg1);
	}

	@ObfuscatedName("aoc.r(I)V")
	public void cacheReset() {
		super.cacheReset();
		((MapElementTypeFactory) this.factory).elementCache.reset();
	}

	@ObfuscatedName("aoc.v(II)V")
	public void cacheClean(int arg0) {
		super.cacheClean(arg0);
		((MapElementTypeFactory) this.factory).elementCache.clean(arg0);
	}

	@ObfuscatedName("aoc.o(I)V")
	public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((MapElementTypeFactory) this.factory).elementCache.clear();
	}
}

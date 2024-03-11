package com.jagex.game.config.meltype;

import com.jagex.*;
import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

@ObfuscatedName("aoc")
public class MapElementTypeList extends CachingConfigTypeList {

	public MapElementTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.MELTYPE, 128, new BasicMapElementTypeFactory(arg3, 64));
	}

	@ObfuscatedName("aoc.al(III)V")
	public void method18871(int arg0, int arg1) {
		super.method14910(arg0);
		((MapElementTypeFactory) this.field8796).field2414 = new WeightedCache(arg1);
	}

	@ObfuscatedName("aoc.r(I)V")
	public void method14895() {
		super.method14895();
		((MapElementTypeFactory) this.field8796).field2414.method2924();
	}

	@ObfuscatedName("aoc.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((MapElementTypeFactory) this.field8796).field2414.method2923(arg0);
	}

	@ObfuscatedName("aoc.o(I)V")
	public void method14899() {
		super.method14899();
		((MapElementTypeFactory) this.field8796).field2414.method2928();
	}
}

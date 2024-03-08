package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aot")
public class EffectAnimTypeList extends class758 {

	public EffectAnimTypeList(ModeGame arg0, Language arg1, class442 arg2, class442 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.SPOTTYPE, 64, new EffectAnimTypeFactory(arg3));
	}

	@ObfuscatedName("aot.al(II)V")
	public void method18896(int arg0) {
		((class681) this.field8796).method13832(arg0);
	}

	@ObfuscatedName("aot.r(I)V")
	public void method14895() {
		super.method14895();
		((class681) this.field8796).method13834();
	}

	@ObfuscatedName("aot.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((class681) this.field8796).method13821(arg0);
	}

	@ObfuscatedName("aot.o(I)V")
	public void method14899() {
		super.method14899();
		((class681) this.field8796).method13822();
	}
}

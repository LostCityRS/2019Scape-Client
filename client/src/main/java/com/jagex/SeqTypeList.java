package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aos")
public class SeqTypeList extends class758 {

	public SeqTypeList(ModeGame arg0, Language arg1, class442 arg2, class442 arg3, class442 arg4, class442 arg5, SeqGroupTypeList arg6) {
		super(arg0, arg1, arg2, Js5ConfigGroup.SEQTYPE, 64, new SeqTypeFactory(arg6, arg3, arg4, arg5));
	}

	@ObfuscatedName("aos.al(II)Larr;")
	public class1177 method18864(int arg0) {
		return ((class166) this.field8796).method3020(arg0);
	}

	@ObfuscatedName("aos.ac(II)Lard;")
	public class1176 method18865(int arg0) {
		return ((class166) this.field8796).method3010(arg0);
	}

	@ObfuscatedName("aos.r(I)V")
	public void method14895() {
		super.method14895();
		((class166) this.field8796).method3011();
	}

	@ObfuscatedName("aos.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((class166) this.field8796).method3012(arg0);
	}

	@ObfuscatedName("aos.o(I)V")
	public void method14899() {
		super.method14899();
		((class166) this.field8796).method3019();
	}
}

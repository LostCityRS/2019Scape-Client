package lzma.sdk.lzma;

import deob.ObfuscatedName;

@ObfuscatedName("tu")
public class Base {

	@ObfuscatedName("va.e(I)I")
	public static final int stateInit() {
		return 0;
	}

	@ObfuscatedName("vv.n(IB)I")
	public static final int stateUpdateChar(int index) {
		if (index < 4) {
			return 0;
		} else if (index < 10) {
			return index - 3;
		} else {
			return index - 6;
		}
	}

	@ObfuscatedName("xc.m(II)I")
	public static final int stateUpdateMatch(int index) {
		return index < 7 ? 7 : 10;
	}

	@ObfuscatedName("rg.k(IS)I")
	public static final int stateUpdateRep(int index) {
		return index < 7 ? 8 : 11;
	}

	@ObfuscatedName("gk.f(IS)I")
	public static final int stateUpdateShortRep(int index) {
		return index < 7 ? 9 : 11;
	}

	@ObfuscatedName("id.w(IB)Z")
	public static final boolean stateIsCharState(int index) {
		return index < 7;
	}

	@ObfuscatedName("qj.l(II)I")
	public static final int getLenToPosState(int len) {
		int var1 = len - 2;
		return var1 < 4 ? var1 : 3;
	}
}

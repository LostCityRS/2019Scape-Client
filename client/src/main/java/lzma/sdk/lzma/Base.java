package lzma.sdk.lzma;

import deob.ObfuscatedName;

@ObfuscatedName("tu")
public class Base {

	public Base() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("va.e(I)I")
	public static final int stateInit() {
		return 0;
	}

	@ObfuscatedName("vv.n(IB)I")
	public static final int stateUpdateChar(int arg0) {
		if (arg0 < 4) {
			return 0;
		} else if (arg0 < 10) {
			return arg0 - 3;
		} else {
			return arg0 - 6;
		}
	}

	@ObfuscatedName("xc.m(II)I")
	public static final int stateUpdateMatch(int arg0) {
		return arg0 < 7 ? 7 : 10;
	}

	@ObfuscatedName("rg.k(IS)I")
	public static final int stateUpdateRep(int arg0) {
		return arg0 < 7 ? 8 : 11;
	}

	@ObfuscatedName("gk.f(IS)I")
	public static final int stateUpdateShortRep(int arg0) {
		return arg0 < 7 ? 9 : 11;
	}

	@ObfuscatedName("id.w(IB)Z")
	public static final boolean stateIsCharState(int arg0) {
		return arg0 < 7;
	}

	@ObfuscatedName("qj.l(II)I")
	public static final int getLenToPosState(int arg0) {
		int var1 = arg0 - 2;
		return var1 < 4 ? var1 : 3;
	}
}

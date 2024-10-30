package jagdx;

import deob.ObfuscatedName;

@ObfuscatedName("jagdx/e")
public class HRESULT {

	@ObfuscatedName("jagdx/e.e")
	private static final int anInt4220 = 2166;

	@ObfuscatedName("jagdx/e.n")
	public static final int anInt4221 = 0;

	@ObfuscatedName("jagdx/e.m")
	public static final int anInt4222 = 0x88760869;

	@ObfuscatedName("jagdx/e.k")
	public static final int anInt4223 = 1;

	public HRESULT() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jagdx/e.e(I)Z")
	public static final boolean FAILED(int arg0) {
		return arg0 < 0;
	}

	@ObfuscatedName("jagdx/e.n(I)Z")
	public static final boolean SUCCEEDED(int arg0) {
		return arg0 >= 0;
	}
}

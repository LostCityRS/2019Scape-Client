package jagdx;

import deob.ObfuscatedName;

@ObfuscatedName("jagdx/e")
public class HRESULT {

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

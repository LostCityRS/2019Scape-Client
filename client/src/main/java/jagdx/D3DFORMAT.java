package jagdx;

import deob.ObfuscatedName;

@ObfuscatedName("jagdx/m")
public class D3DFORMAT {

	@ObfuscatedName("jagdx/m.v")
	public static final int field263 = makeFourCC('D', 'X', 'T', '1');

	@ObfuscatedName("jagdx/m.o")
	public static final int field264 = makeFourCC('D', 'X', 'T', '5');

	public D3DFORMAT() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jagdx/m.e(CCCC)I")
	public static int makeFourCC(char arg0, char arg1, char arg2, char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}
}

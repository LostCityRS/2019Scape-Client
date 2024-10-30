package jagdx;

import deob.ObfuscatedName;

@ObfuscatedName("jagdx/m")
public class D3DFORMAT {

	@ObfuscatedName("jagdx/m.e")
	public static final int D3DFMT_UNKNOWN = 0;

	@ObfuscatedName("jagdx/m.n")
	public static final int D3DFMT_A8R8G8B8 = 21;

	@ObfuscatedName("jagdx/m.m")
	public static final int D3DFMT_X8R8G8B8 = 22;

	@ObfuscatedName("jagdx/m.k")
	public static final int D3DFMT_R5G6B5 = 23;

	@ObfuscatedName("jagdx/m.f")
	public static final int D3DFMT_A8 = 28;

	@ObfuscatedName("jagdx/m.w")
	public static final int D3DFMT_L8 = 50;

	@ObfuscatedName("jagdx/m.l")
	public static final int D3DFMT_A8L8 = 51;

	@ObfuscatedName("jagdx/m.u")
	public static final int D3DFMT_D24X8 = 77;

	@ObfuscatedName("jagdx/m.z")
	public static final int D3DFMT_D16 = 80;

	@ObfuscatedName("jagdx/m.p")
	public static final int D3DFMT_INDEX16 = 101;

	@ObfuscatedName("jagdx/m.d")
	public static final int D3DFMT_INDEX32 = 102;

	@ObfuscatedName("jagdx/m.c")
	public static final int D3DFMT_A16B16G16R16F = 113;

	@ObfuscatedName("jagdx/m.r")
	public static final int D3DFMT_A32B32G32R32F = 116;

	@ObfuscatedName("jagdx/m.v")
	public static final int D3DFMT_DXT1 = makeFourCC('D', 'X', 'T', '1');

	@ObfuscatedName("jagdx/m.o")
	public static final int D3DFMT_DXT5 = makeFourCC('D', 'X', 'T', '5');

	public D3DFORMAT() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jagdx/m.e(CCCC)I")
	public static int makeFourCC(char arg0, char arg1, char arg2, char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}
}

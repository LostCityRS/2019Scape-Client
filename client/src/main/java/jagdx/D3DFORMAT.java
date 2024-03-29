package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/m")
public class D3DFORMAT {

	@OriginalMember(owner = "client!jagdx/m", name = "e", descriptor = "I")
	public static final int D3DFMT_UNKNOWN = 0;

	@OriginalMember(owner = "client!jagdx/m", name = "n", descriptor = "I")
	public static final int D3DFMT_A8R8G8B8 = 21;

	@OriginalMember(owner = "client!jagdx/m", name = "m", descriptor = "I")
	public static final int D3DFMT_X8R8G8B8 = 22;

	@OriginalMember(owner = "client!jagdx/m", name = "k", descriptor = "I")
	public static final int D3DFMT_R5G6B5 = 23;

	@OriginalMember(owner = "client!jagdx/m", name = "f", descriptor = "I")
	public static final int D3DFMT_A8 = 28;

	@OriginalMember(owner = "client!jagdx/m", name = "w", descriptor = "I")
	public static final int D3DFMT_L8 = 50;

	@OriginalMember(owner = "client!jagdx/m", name = "l", descriptor = "I")
	public static final int D3DFMT_A8L8 = 51;

	@OriginalMember(owner = "client!jagdx/m", name = "u", descriptor = "I")
	public static final int D3DFMT_D24X8 = 77;

	@OriginalMember(owner = "client!jagdx/m", name = "z", descriptor = "I")
	public static final int D3DFMT_D16 = 80;

	@OriginalMember(owner = "client!jagdx/m", name = "p", descriptor = "I")
	public static final int D3DFMT_INDEX16 = 101;

	@OriginalMember(owner = "client!jagdx/m", name = "d", descriptor = "I")
	public static final int D3DFMT_INDEX32 = 102;

	@OriginalMember(owner = "client!jagdx/m", name = "c", descriptor = "I")
	public static final int D3DFMT_A16B16G16R16F = 113;

	@OriginalMember(owner = "client!jagdx/m", name = "r", descriptor = "I")
	public static final int D3DFMT_A32B32G32R32F = 116;

	@OriginalMember(owner = "client!jagdx/m", name = "v", descriptor = "I")
	public static final int D3DFMT_DXT1 = makeFourCC('D', 'X', 'T', '1');

	@OriginalMember(owner = "client!jagdx/m", name = "o", descriptor = "I")
	public static final int D3DFMT_DXT5 = makeFourCC('D', 'X', 'T', '5');

	@OriginalMember(owner = "client!jagdx/m", name = "<init>", descriptor = "()V", line = 24)
	public D3DFORMAT() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/m", name = "e", descriptor = "(CCCC)I", line = 29)
	private static int makeFourCC(@OriginalArg(0) char c1, @OriginalArg(1) char c2, @OriginalArg(2) char c3, @OriginalArg(3) char c4) {
		return (c1 & 0xFF) << 0 | (c2 & 0xFF) << 8 | (c3 & 0xFF) << 16 | (c4 & 0xFF) << 24;
	}
}

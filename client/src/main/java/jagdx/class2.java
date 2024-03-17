package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/m")
public class class2 {

	@OriginalMember(owner = "client!jagdx/m", name = "e", descriptor = "I")
	public static final int anInt4338 = 0;

	@OriginalMember(owner = "client!jagdx/m", name = "n", descriptor = "I")
	public static final int anInt4339 = 21;

	@OriginalMember(owner = "client!jagdx/m", name = "m", descriptor = "I")
	public static final int anInt4340 = 22;

	@OriginalMember(owner = "client!jagdx/m", name = "k", descriptor = "I")
	public static final int anInt4341 = 23;

	@OriginalMember(owner = "client!jagdx/m", name = "f", descriptor = "I")
	public static final int anInt4342 = 28;

	@OriginalMember(owner = "client!jagdx/m", name = "w", descriptor = "I")
	public static final int anInt4343 = 50;

	@OriginalMember(owner = "client!jagdx/m", name = "l", descriptor = "I")
	public static final int anInt4344 = 51;

	@OriginalMember(owner = "client!jagdx/m", name = "u", descriptor = "I")
	public static final int anInt4345 = 77;

	@OriginalMember(owner = "client!jagdx/m", name = "z", descriptor = "I")
	public static final int anInt4346 = 80;

	@OriginalMember(owner = "client!jagdx/m", name = "p", descriptor = "I")
	public static final int anInt4347 = 101;

	@OriginalMember(owner = "client!jagdx/m", name = "d", descriptor = "I")
	public static final int anInt4348 = 102;

	@OriginalMember(owner = "client!jagdx/m", name = "c", descriptor = "I")
	public static final int anInt4349 = 113;

	@OriginalMember(owner = "client!jagdx/m", name = "r", descriptor = "I")
	public static final int anInt4350 = 116;

	@OriginalMember(owner = "client!jagdx/m", name = "v", descriptor = "I")
	public static final int field262 = method38('D', 'X', 'T', '1');

	@OriginalMember(owner = "client!jagdx/m", name = "o", descriptor = "I")
	public static final int field263 = method38('D', 'X', 'T', '5');

	@OriginalMember(owner = "client!jagdx/m", name = "<init>", descriptor = "()V", line = 24)
	public class2() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/m", name = "e", descriptor = "(CCCC)I", line = 29)
	private static int method38(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}
}

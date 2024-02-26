package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/e")
public final class e {

	@OriginalMember(owner = "client!jagdx/e", name = "t", descriptor = "I")
	public static final int t = 0;

	@OriginalMember(owner = "client!jagdx/e", name = "f", descriptor = "I")
	public static final int f = 21;

	@OriginalMember(owner = "client!jagdx/e", name = "e", descriptor = "I")
	public static final int e = 22;

	@OriginalMember(owner = "client!jagdx/e", name = "u", descriptor = "I")
	public static final int u = 23;

	@OriginalMember(owner = "client!jagdx/e", name = "l", descriptor = "I")
	public static final int l = 28;

	@OriginalMember(owner = "client!jagdx/e", name = "g", descriptor = "I")
	public static final int g = 50;

	@OriginalMember(owner = "client!jagdx/e", name = "i", descriptor = "I")
	public static final int i = 51;

	@OriginalMember(owner = "client!jagdx/e", name = "m", descriptor = "I")
	public static final int m = 77;

	@OriginalMember(owner = "client!jagdx/e", name = "o", descriptor = "I")
	public static final int o = 80;

	@OriginalMember(owner = "client!jagdx/e", name = "j", descriptor = "I")
	public static final int j = 101;

	@OriginalMember(owner = "client!jagdx/e", name = "a", descriptor = "I")
	public static final int a = 102;

	@OriginalMember(owner = "client!jagdx/e", name = "s", descriptor = "I")
	public static final int s = 113;

	@OriginalMember(owner = "client!jagdx/e", name = "k", descriptor = "I")
	public static final int k = 116;

	@OriginalMember(owner = "client!jagdx/e", name = "x", descriptor = "I")
	public static final int x = t('D', 'X', 'T', '1') * 1529745559;

	@OriginalMember(owner = "client!jagdx/e", name = "w", descriptor = "I")
	public static final int w = t('D', 'X', 'T', '5') * 304945777;

	@OriginalMember(owner = "client!jagdx/e", name = "t", descriptor = "(CCCC)I")
	private static int t(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "f", descriptor = "(CCCC)I")
	private static int f(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "e", descriptor = "(CCCC)I")
	private static int e(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "u", descriptor = "(CCCC)I")
	private static int u(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "<init>", descriptor = "()V")
	private e() throws Throwable {
		throw new Error();
	}
}

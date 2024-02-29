package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/e")
public class e {

	@OriginalMember(owner = "client!jagdx/e", name = "e", descriptor = "I")
	private static final int anInt4220 = 2166;

	@OriginalMember(owner = "client!jagdx/e", name = "n", descriptor = "I")
	public static final int anInt4221 = 0;

	@OriginalMember(owner = "client!jagdx/e", name = "m", descriptor = "I")
	public static final int anInt4222 = -2005530519;

	@OriginalMember(owner = "client!jagdx/e", name = "k", descriptor = "I")
	public static final int anInt4223 = 1;

	@OriginalMember(owner = "client!jagdx/e", name = "<init>", descriptor = "()V", line = 13)
	private e() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/e", name = "e", descriptor = "(I)Z", line = 18)
	public static final boolean method27715(@OriginalArg(0) int arg0) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "m", descriptor = "(I)Z", line = 18)
	public static final boolean method27716(@OriginalArg(0) int arg0) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "n", descriptor = "(I)Z", line = 22)
	public static final boolean method27717(@OriginalArg(0) int arg0) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "k", descriptor = "(I)Z", line = 22)
	public static final boolean method27718(@OriginalArg(0) int arg0) {
		return arg0 >= 0;
	}
}

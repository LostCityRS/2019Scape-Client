package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/e")
public final class e {

	@OriginalMember(owner = "client!jagdx/e", name = "e", descriptor = "I")
	private static final int anInt4380 = 2166;

	@OriginalMember(owner = "client!jagdx/e", name = "n", descriptor = "I")
	public static final int anInt4381 = 0;

	@OriginalMember(owner = "client!jagdx/e", name = "m", descriptor = "I")
	public static final int anInt4382 = -2005530519;

	@OriginalMember(owner = "client!jagdx/e", name = "k", descriptor = "I")
	public static final int anInt4383 = 1;

	@OriginalMember(owner = "client!jagdx/e", name = "e", descriptor = "(I)Z")
	public static boolean method27887(@OriginalArg(0) int arg0) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "n", descriptor = "(I)Z")
	public static boolean method27888(@OriginalArg(0) int arg0) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "m", descriptor = "(I)Z")
	public static boolean method27889(@OriginalArg(0) int arg0) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "k", descriptor = "(I)Z")
	public static boolean method27890(@OriginalArg(0) int arg0) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/e", name = "<init>", descriptor = "()V")
	private e() throws Throwable {
		throw new Error();
	}
}

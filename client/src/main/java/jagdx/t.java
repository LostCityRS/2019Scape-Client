package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/t")
public final class t {

	@OriginalMember(owner = "client!jagdx/t", name = "t", descriptor = "I")
	private static final int t = 2166;

	@OriginalMember(owner = "client!jagdx/t", name = "f", descriptor = "I")
	public static final int f = 0;

	@OriginalMember(owner = "client!jagdx/t", name = "e", descriptor = "I")
	public static final int e = -2005530519;

	@OriginalMember(owner = "client!jagdx/t", name = "u", descriptor = "I")
	public static final int u = 1;

	@OriginalMember(owner = "client!jagdx/t", name = "t", descriptor = "(I)Z")
	public static boolean t(@OriginalArg(0) int arg0) {
		return arg0 < 0;
	}

	@OriginalMember(owner = "client!jagdx/t", name = "f", descriptor = "(I)Z")
	public static boolean f(@OriginalArg(0) int arg0) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/t", name = "e", descriptor = "(I)Z")
	public static boolean e(@OriginalArg(0) int arg0) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/t", name = "u", descriptor = "(I)Z")
	public static boolean u(@OriginalArg(0) int arg0) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/t", name = "l", descriptor = "(I)Z")
	public static boolean l(@OriginalArg(0) int arg0) {
		return arg0 >= 0;
	}

	@OriginalMember(owner = "client!jagdx/t", name = "<init>", descriptor = "()V")
	private t() throws Throwable {
		throw new Error();
	}
}

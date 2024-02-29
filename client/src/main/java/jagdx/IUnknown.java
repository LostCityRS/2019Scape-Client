package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IUnknown")
public class IUnknown {

	@OriginalMember(owner = "client!jagdx/IUnknown", name = "<init>", descriptor = "()V", line = 7)
	IUnknown() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/IUnknown", name = "AddRef", descriptor = "(J)I")
	public static native int AddRef(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/IUnknown", name = "Release", descriptor = "(J)I")
	public static native int Release(@OriginalArg(0) long arg0);
}

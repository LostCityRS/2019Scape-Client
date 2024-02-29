package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DEventQuery")
public class IDirect3DEventQuery extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "<init>", descriptor = "()V", line = 8)
	private IDirect3DEventQuery() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "Issue", descriptor = "(J)I")
	public static native int Issue(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "IsSignaled", descriptor = "(J)I")
	public static native int IsSignaled(@OriginalArg(0) long arg0);
}

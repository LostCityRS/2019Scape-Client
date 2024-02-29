package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "()V", line = 8)
	private IDirect3DSwapChain() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "GetBackBuffer", descriptor = "(JII)J")
	public static native long GetBackBuffer(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(JI)I")
	public static native int Present(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);
}

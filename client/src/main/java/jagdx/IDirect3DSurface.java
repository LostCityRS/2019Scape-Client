package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSurface")
public class IDirect3DSurface extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DSurface", name = "<init>", descriptor = "()V", line = 8)
	private IDirect3DSurface() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DSurface", name = "Upload", descriptor = "(JIIIIIIJ)I")
	public static native int Upload(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7);

	@OriginalMember(owner = "client!jagdx/IDirect3DSurface", name = "Download", descriptor = "(JIIIIIIJ)I")
	public static native int Download(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7);

	@OriginalMember(owner = "client!jagdx/IDirect3DSurface", name = "GetDesc", descriptor = "(JLclient!jagdx/D3DSURFACE_DESC;)I")
	public static native int GetDesc(@OriginalArg(0) long arg0, @OriginalArg(1) D3DSURFACE_DESC arg1);
}

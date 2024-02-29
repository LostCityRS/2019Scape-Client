package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVolumeTexture")
public class IDirect3DVolumeTexture extends IDirect3DBaseTexture {

	@OriginalMember(owner = "client!jagdx/IDirect3DVolumeTexture", name = "<init>", descriptor = "()V", line = 8)
	private IDirect3DVolumeTexture() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DVolumeTexture", name = "Upload", descriptor = "(JIIIIIIIIIJ)I")
	public static native int Upload(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10);

	@OriginalMember(owner = "client!jagdx/IDirect3DVolumeTexture", name = "Download", descriptor = "(JIIIIIIIIIJ)I")
	public static native int Download(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10);
}

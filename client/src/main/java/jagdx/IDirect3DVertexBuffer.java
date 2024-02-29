package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexBuffer")
public class IDirect3DVertexBuffer extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "<init>", descriptor = "()V", line = 8)
	private IDirect3DVertexBuffer() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Lock", descriptor = "(JIII)J")
	public static native long Lock(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Unlock", descriptor = "(J)V")
	public static native void Unlock(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Upload", descriptor = "(JIIIJ)I")
	public static native int Upload(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Download", descriptor = "(JIIIJ)I")
	public static native int Download(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4);
}

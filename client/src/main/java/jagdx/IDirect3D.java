package jagdx;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3D")
public class IDirect3D extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "<init>", descriptor = "()V", line = 10)
	private IDirect3D() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "Direct3DCreate", descriptor = "()J")
	public static native long Direct3DCreate();

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "GetAdapterCount", descriptor = "(J)I")
	public static native int GetAdapterCount(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "GetAdapterIdentifier", descriptor = "(JIILclient!jagdx/D3DADAPTER_IDENTIFIER;)I")
	public static native int GetAdapterIdentifier(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) D3DADAPTER_IDENTIFIER arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "GetDeviceCaps", descriptor = "(JIILclient!jagdx/D3DCAPS;)I")
	public static native int GetDeviceCaps(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) D3DCAPS arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "GetAdapterDisplayMode", descriptor = "(JILclient!jagdx/D3DDISPLAYMODE;)I")
	public static native int GetAdapterDisplayMode(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) D3DDISPLAYMODE arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "CreateDeviceContext", descriptor = "(JIILjava/awt/Component;ILclient!jagdx/D3DPRESENT_PARAMETERS;)J")
	public static native long CreateDeviceContext(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDeviceType", descriptor = "(JIIIIZ)I")
	public static native int CheckDeviceType(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDeviceFormat", descriptor = "(JIIIIII)I")
	public static native int CheckDeviceFormat(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDepthStencilMatch", descriptor = "(JIIIII)I")
	public static native int CheckDepthStencilMatch(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDeviceMultiSampleType", descriptor = "(JIIIZI)I")
	public static native int CheckDeviceMultiSampleType(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);
}

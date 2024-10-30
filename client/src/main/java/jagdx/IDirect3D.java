package jagdx;

import java.awt.Component;

public class IDirect3D extends IUnknown {

	public IDirect3D() throws Throwable {
		throw new Error();
	}

	public static native long Direct3DCreate();

	public static native int GetAdapterCount(long arg0);

	public static native int GetAdapterIdentifier(long arg0, int arg1, int arg2, D3DADAPTER_IDENTIFIER arg3);

	public static native int GetDeviceCaps(long arg0, int arg1, int arg2, D3DCAPS arg3);

	public static native int GetAdapterDisplayMode(long arg0, int arg1, D3DDISPLAYMODE arg2);

	public static native long CreateDeviceContext(long arg0, int arg1, int arg2, Component arg3, int arg4, D3DPRESENT_PARAMETERS arg5);

	public static native int CheckDeviceType(long arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	public static native int CheckDeviceFormat(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	public static native int CheckDepthStencilMatch(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	public static native int CheckDeviceMultiSampleType(long arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);
}

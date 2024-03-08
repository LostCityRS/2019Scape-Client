package jagdx;

public class IDirect3DSurface extends IUnknown {

	public IDirect3DSurface() throws Throwable {
		throw new Error();
	}

	public static native int Upload(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

	public static native int Download(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

	public static native int GetDesc(long arg0, D3DSURFACE_DESC arg1);
}

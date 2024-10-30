package jagdx;

public class IDirect3DTexture extends IDirect3DBaseTexture {

	public IDirect3DTexture() throws Throwable {
		throw new Error();
	}

	public static native long GetSurfaceLevel(long arg0, int arg1);

	public static native int Upload(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

	public static native int Download(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}

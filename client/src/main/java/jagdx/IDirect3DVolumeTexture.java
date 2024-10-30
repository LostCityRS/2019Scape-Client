package jagdx;

public class IDirect3DVolumeTexture extends IDirect3DBaseTexture {

	public IDirect3DVolumeTexture() throws Throwable {
		throw new Error();
	}

	public static native int Upload(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, long arg10);

	public static native int Download(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, long arg10);
}

package jagdx;

public class IDirect3DIndexBuffer extends IUnknown {

	public IDirect3DIndexBuffer() throws Throwable {
		throw new Error();
	}

	public static native long Lock(long arg0, int arg1, int arg2, int arg3);

	public static native void Unlock(long arg0);

	public static native int Upload(long arg0, int arg1, int arg2, int arg3, long arg4);

	public static native int Download(long arg0, int arg1, int arg2, int arg3, long arg4);
}

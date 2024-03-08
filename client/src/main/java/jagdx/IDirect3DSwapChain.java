package jagdx;

public class IDirect3DSwapChain extends IUnknown {

	public IDirect3DSwapChain() throws Throwable {
		throw new Error();
	}

	public static native long GetBackBuffer(long arg0, int arg1, int arg2);

	public static native int Present(long arg0, int arg1);
}

package jagdx;

public class IUnknown {

	public IUnknown() throws Throwable {
		throw new Error();
	}

	public static native int AddRef(long arg0);

	public static native int Release(long arg0);
}

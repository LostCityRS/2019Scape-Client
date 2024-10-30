package jagdx;

public class D3DLIGHT {

	public D3DLIGHT() throws Throwable {
		throw new Error();
	}

	public static native long Create();

	public static native void Destroy(long arg0);

	public static native void SetType(long arg0, int arg1);

	public static native void SetAmbient(long arg0, float arg1, float arg2, float arg3, float arg4);

	public static native void SetSpecular(long arg0, float arg1, float arg2, float arg3, float arg4);

	public static native void SetDiffuse(long arg0, float arg1, float arg2, float arg3, float arg4);

	public static native void SetPosition(long arg0, float arg1, float arg2, float arg3);

	public static native void SetDirection(long arg0, float arg1, float arg2, float arg3);

	public static native void SetAttenuation(long arg0, float arg1, float arg2, float arg3);

	public static native void SetSpotParams(long arg0, float arg1, float arg2, float arg3);

	public static native void SetRange(long arg0, float arg1);
}

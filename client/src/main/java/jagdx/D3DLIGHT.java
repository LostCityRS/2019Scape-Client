package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DLIGHT")
public class D3DLIGHT {

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "<init>", descriptor = "()V", line = 8)
	private D3DLIGHT() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "Create", descriptor = "()J")
	public static native long Create();

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "Destroy", descriptor = "(J)V")
	public static native void Destroy(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetType", descriptor = "(JI)V")
	public static native void SetType(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetAmbient", descriptor = "(JFFFF)V")
	public static native void SetAmbient(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetSpecular", descriptor = "(JFFFF)V")
	public static native void SetSpecular(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetDiffuse", descriptor = "(JFFFF)V")
	public static native void SetDiffuse(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetPosition", descriptor = "(JFFF)V")
	public static native void SetPosition(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetDirection", descriptor = "(JFFF)V")
	public static native void SetDirection(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetAttenuation", descriptor = "(JFFF)V")
	public static native void SetAttenuation(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetSpotParams", descriptor = "(JFFF)V")
	public static native void SetSpotParams(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetRange", descriptor = "(JF)V")
	public static native void SetRange(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1);
}

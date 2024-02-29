package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adu")
public final class Class88_Sub3 extends Class88 {

	@OriginalMember(owner = "client!adu", name = "s", descriptor = "I")
	final int anInt314;

	@OriginalMember(owner = "client!adu", name = "y", descriptor = "I")
	final int anInt313;

	@OriginalMember(owner = "client!adu", name = "q", descriptor = "I")
	final int anInt315;

	@OriginalMember(owner = "client!adu", name = "<init>", descriptor = "(Lclient!afa;Lclient!ck;Lclient!dg;III)V")
	Class88_Sub3(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.anInt314 = arg3;
		this.anInt313 = arg4;
		this.anInt315 = arg5;
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glTexImage3Dub(this.anInt2543, 0, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), this.anInt314, this.anInt313, this.anInt315, 0, Class104_Sub1.method3926(this.aClass206_16), 5121, null, 0);
		this.method18053(true);
	}

	@OriginalMember(owner = "client!adu", name = "<init>", descriptor = "(Lclient!afa;Lclient!ck;Lclient!dg;III[BLclient!ck;)V")
	Class88_Sub3(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) Class206 arg7) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.anInt314 = arg3;
		this.anInt313 = arg4;
		this.anInt315 = arg5;
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt2543, 0, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), this.anInt314, this.anInt313, this.anInt315, 0, Class104_Sub1.method3926(arg7), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method18053(true);
	}

	@OriginalMember(owner = "client!adu", name = "ar", descriptor = "(IIIIIII)V")
	void method1702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glCopyTexSubImage3D(this.anInt2543, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}
}

package jagex3;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class455 {

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)Lclient!dh;")
	public static Class104 method29296(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) int arg7) {
		try {
			Class104_Sub2.method20908();
			Class376.method28227(672839876).method31798("jagdx", (byte) -29);
			return Class104_Sub2_Sub1.method19578(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} catch (@Pc(20) Throwable local20) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)Lclient!dh;")
	public static Class104 method29297(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) int arg7) {
		try {
			Class104_Sub2.method20908();
			Class376.method28227(672839876).method31798("jagdx", (byte) 6);
			return Class104_Sub2_Sub1.method19578(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} catch (@Pc(20) Throwable local20) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	Class455() throws Throwable {
		throw new Error();
	}
}

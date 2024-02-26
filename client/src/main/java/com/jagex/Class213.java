package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class213 {

	@OriginalMember(owner = "client!cr", name = "t", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;I)Lclient!di;")
	public static Class102 method25837(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) int arg6) {
		return new Class102_Sub3(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;I)Lclient!di;")
	public static Class102 method25838(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) int arg6) {
		return new Class102_Sub3(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	Class213() throws Throwable {
		throw new Error();
	}
}

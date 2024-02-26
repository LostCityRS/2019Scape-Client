package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!oe")
public final class Class458 {

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)Lclient!di;")
	public static Class102 method29380(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Class480 arg6, @OriginalArg(7) int arg7) {
		try {
			Class102_Sub1.method21146();
			Class588.method31902(350319923).method31859("jagdx", 1943589537);
			return Class102_Sub1_Sub2.method21533(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} catch (@Pc(20) Throwable local20) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)Lclient!di;")
	public static Class102 method29381(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Class480 arg6, @OriginalArg(7) int arg7) {
		try {
			Class102_Sub1.method21146();
			Class588.method31902(350319923).method31859("jagdx", -1158809190);
			return Class102_Sub1_Sub2.method21533(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} catch (@Pc(20) Throwable local20) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	Class458() throws Throwable {
		throw new Error();
	}
}

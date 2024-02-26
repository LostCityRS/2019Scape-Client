package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!rs")
public final class Class537 {

	@OriginalMember(owner = "client!rs", name = "t", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)Lclient!di;")
	public static Class102 method30878(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Class480 arg6, @OriginalArg(7) int arg7) {
		try {
			Class102_Sub1.method21146();
			Class588.method31902(350319923).method31859("jaggl", 483167842);
			Class6.method23668(arg0, (byte) 85);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class102_Sub1_Sub1 local45 = new Class102_Sub1_Sub1(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method21212();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)Lclient!di;")
	public static Class102 method30879(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Class480 arg6, @OriginalArg(7) int arg7) {
		try {
			Class102_Sub1.method21146();
			Class588.method31902(350319923).method31859("jaggl", -632650042);
			Class6.method23668(arg0, (byte) 29);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class102_Sub1_Sub1 local45 = new Class102_Sub1_Sub1(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method21212();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)Lclient!di;")
	public static Class102 method30880(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Class480 arg6, @OriginalArg(7) int arg7) {
		try {
			Class102_Sub1.method21146();
			Class588.method31902(350319923).method31859("jaggl", 488038470);
			Class6.method23668(arg0, (byte) 93);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class102_Sub1_Sub1 local45 = new Class102_Sub1_Sub1(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method21212();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)Lclient!di;")
	public static Class102 method30881(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Class480 arg6, @OriginalArg(7) int arg7) {
		try {
			Class102_Sub1.method21146();
			Class588.method31902(350319923).method31859("jaggl", 1937513846);
			Class6.method23668(arg0, (byte) 121);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class102_Sub1_Sub1 local45 = new Class102_Sub1_Sub1(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method21212();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	Class537() throws Throwable {
		throw new Error();
	}
}

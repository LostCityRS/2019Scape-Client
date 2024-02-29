package com.jagex;

import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public class Class524 {

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 14)
	Class524() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)Lclient!dh;", line = 20)
	public static Class104 method30372(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) int arg7) {
		try {
			Class104_Sub2.method20906();
			Class376.method28043(672839876).method31617("jaggl", (byte) 69);
			Class451.method28949(arg0, 1881741160);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class104_Sub2_Sub2 local45 = new Class104_Sub2_Sub2(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method20909();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)Lclient!dh;", line = 20)
	public static Class104 method30373(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) int arg7) {
		try {
			Class104_Sub2.method20906();
			Class376.method28043(672839876).method31617("jaggl", (byte) -109);
			Class451.method28949(arg0, 2079791979);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class104_Sub2_Sub2 local45 = new Class104_Sub2_Sub2(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method20909();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)Lclient!dh;", line = 20)
	public static Class104 method30374(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) int arg7) {
		try {
			Class104_Sub2.method20906();
			Class376.method28043(672839876).method31617("jaggl", (byte) -93);
			Class451.method28949(arg0, 2079247823);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class104_Sub2_Sub2 local45 = new Class104_Sub2_Sub2(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method20909();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)Lclient!dh;", line = 20)
	public static Class104 method30375(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) int arg7) {
		try {
			Class104_Sub2.method20906();
			Class376.method28043(672839876).method31617("jaggl", (byte) -4);
			Class451.method28949(arg0, 1763178172);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class104_Sub2_Sub2 local45 = new Class104_Sub2_Sub2(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method20909();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aow")
public final class Class41_Sub18 extends Class41 {

	@OriginalMember(owner = "client!aow", name = "g", descriptor = "Lclient!vr;")
	public static Class621 aClass621_1 = new Class621(-1);

	@OriginalMember(owner = "client!aow", name = "jp", descriptor = "(Lclient!yp;B)V")
	static void method17795(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class586.method31884(local11, local14, arg0, -2020848697);
	}

	@OriginalMember(owner = "client!aow", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;)V")
	public Class41_Sub18(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2) {
		super(arg0, arg1, arg2, Class664.aClass664_104, 64, new Class63(Class621.class));
	}
}

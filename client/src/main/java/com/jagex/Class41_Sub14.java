package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aor")
public final class Class41_Sub14 extends Class41 {

	@OriginalMember(owner = "client!aor", name = "pk", descriptor = "(Lclient!yp;B)V")
	static void method17601(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class114.method8626(local11, local14, arg0, 97906150);
	}

	@OriginalMember(owner = "client!aor", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;Lclient!pf;)V")
	public Class41_Sub14(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) Class480 arg3) {
		super(arg0, arg1, arg2, Class664.aClass664_101, 64, new Class367(arg3));
	}
}

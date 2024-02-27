package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqp")
public final class Class122_Sub1_Sub1 extends Class122_Sub1 {

	@OriginalMember(owner = "client!aqp", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!aqy;)V")
	Class122_Sub1_Sub1(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class125_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqp", name = "x", descriptor = "(IIII)V")
	@Override
	void method20236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass100_31.method18172();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2993 * -1108091727 * Class300.method26809(1577996507) / 10 % local3;
		this.aClass100_31.method18190(arg0 - local3 + local17, arg1, local3 + arg2 - local17, arg3);
	}

	@OriginalMember(owner = "client!aqp", name = "s", descriptor = "(IIIII)V")
	@Override
	void method20233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass100_31.method18172();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2993 * -1108091727 * Class300.method26809(1798470309) / 10 % local3;
		this.aClass100_31.method18190(arg0 - local3 + local17, arg1, local3 + arg2 - local17, arg3);
	}

	@OriginalMember(owner = "client!aqp", name = "y", descriptor = "(IIII)V")
	@Override
	void method20234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass100_31.method18172();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2993 * -1108091727 * Class300.method26809(1362687040) / 10 % local3;
		this.aClass100_31.method18190(arg0 - local3 + local17, arg1, local3 + arg2 - local17, arg3);
	}

	@OriginalMember(owner = "client!aqp", name = "q", descriptor = "(IIII)V")
	@Override
	void method20235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass100_31.method18172();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2993 * -1108091727 * Class300.method26809(1005043723) / 10 % local3;
		this.aClass100_31.method18190(arg0 - local3 + local17, arg1, local3 + arg2 - local17, arg3);
	}
}

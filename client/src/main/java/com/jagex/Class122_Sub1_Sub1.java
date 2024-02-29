package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqp")
public class Class122_Sub1_Sub1 extends Class122_Sub1 {

	@OriginalMember(owner = "client!aqp", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!aqy;)V", line = 9)
	Class122_Sub1_Sub1(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class125_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqp", name = "x", descriptor = "(IIII)V", line = 13)
	@Override
	void method20225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass100_31.method18160();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2993 * -1108091727 * Class300.method26718(1577996507) / 10 % local3;
		this.aClass100_31.method18168(arg0 - local3 + local17, arg1, local3 + arg2 - local17, arg3);
	}

	@OriginalMember(owner = "client!aqp", name = "s", descriptor = "(IIIII)V", line = 13)
	@Override
	void method20222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass100_31.method18160();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2993 * -1108091727 * Class300.method26718(1798470309) / 10 % local3;
		this.aClass100_31.method18168(arg0 - local3 + local17, arg1, local3 + arg2 - local17, arg3);
	}

	@OriginalMember(owner = "client!aqp", name = "y", descriptor = "(IIII)V", line = 13)
	@Override
	void method20223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass100_31.method18160();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2993 * -1108091727 * Class300.method26718(1362687040) / 10 % local3;
		this.aClass100_31.method18168(arg0 - local3 + local17, arg1, local3 + arg2 - local17, arg3);
	}

	@OriginalMember(owner = "client!aqp", name = "q", descriptor = "(IIII)V", line = 13)
	@Override
	void method20224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass100_31.method18160();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2993 * -1108091727 * Class300.method26718(1005043723) / 10 % local3;
		this.aClass100_31.method18168(arg0 - local3 + local17, arg1, local3 + arg2 - local17, arg3);
	}
}

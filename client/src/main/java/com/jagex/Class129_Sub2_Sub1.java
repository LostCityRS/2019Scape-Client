package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aql")
public final class Class129_Sub2_Sub1 extends Class129_Sub2 {

	@OriginalMember(owner = "client!aql", name = "o", descriptor = "(ILjava/lang/String;ZI)V")
	public static void method20293(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!Class501.method30420(-905309715)) {
			return;
		}
		if (arg0 != Class238.anInt3815 * -2038590069) {
			Class238.aLong356 = 959485551111415569L;
		}
		Class238.anInt3815 = arg0 * -304387549;
		Class238.aString153 = arg1;
		Class238.aBoolean770 = arg2;
		Class604.method32148(7, -730377998);
	}

	@OriginalMember(owner = "client!aql", name = "<init>", descriptor = "(Lclient!pf;Lclient!pf;Lclient!aqt;)V")
	Class129_Sub2_Sub1(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class125_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aql", name = "y", descriptor = "(IIII)V")
	@Override
	void method20289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass99_23.method18214();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2912 * -1008965047 * Class590.method31919(1134092680) / 10 % local3;
		this.aClass99_23.method18244(arg0 - local3 + local17, arg1, arg2 + local3 - local17, arg3);
	}

	@OriginalMember(owner = "client!aql", name = "v", descriptor = "(IIII)V")
	@Override
	void method20288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass99_23.method18214();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2912 * -1008965047 * Class590.method31919(-178071505) / 10 % local3;
		this.aClass99_23.method18244(arg0 - local3 + local17, arg1, arg2 + local3 - local17, arg3);
	}

	@OriginalMember(owner = "client!aql", name = "p", descriptor = "(IIIIB)V")
	@Override
	void method20286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(3) int local3 = this.aClass99_23.method18214();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2912 * -1008965047 * Class590.method31919(-1068328601) / 10 % local3;
		this.aClass99_23.method18244(arg0 - local3 + local17, arg1, arg2 + local3 - local17, arg3);
	}

	@OriginalMember(owner = "client!aql", name = "n", descriptor = "(IIII)V")
	@Override
	void method20287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass99_23.method18214();
		@Pc(17) int local17 = ((Class125_Sub2_Sub1) this.aClass125_5).anInt2912 * -1008965047 * Class590.method31919(986642898) / 10 % local3;
		this.aClass99_23.method18244(arg0 - local3 + local17, arg1, arg2 + local3 - local17, arg3);
	}
}

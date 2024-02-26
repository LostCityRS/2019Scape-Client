package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apg")
public final class Class73_Sub2 extends Class73 {

	@OriginalMember(owner = "client!apg", name = "e", descriptor = "(II)Z")
	public static boolean method18060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!apg", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;Z)V")
	public Class73_Sub2(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, Class664.aClass664_80, arg2, new Class63(Class80_Sub1_Sub1.class), arg3);
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoa")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!aoa", name = "ab", descriptor = "(IIIII)V")
	static void method16605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class93_Sub1_Sub11 local9 = Class371.method28187(17, (long) arg1 << 32 | (long) arg0);
		local9.method21813(-64154811);
		local9.anInt3020 = arg2 * 1415359557;
		local9.anInt3025 = arg3 * -302789657;
	}

	@OriginalMember(owner = "client!aoa", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;)V")
	public Class32_Sub1(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2) {
		super(arg0, arg1, arg2, Class667.aClass667_36, 64, new Class52(Class688.class));
	}
}

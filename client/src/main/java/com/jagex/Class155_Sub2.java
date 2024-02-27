package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alz")
final class Class155_Sub2 extends Class155 {

	@OriginalMember(owner = "client!alz", name = "f", descriptor = "(Lclient!alq;I)V")
	static void method15322(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(1) int arg1) {
		arg0.method14871(0, 1494441756);
		@Pc(18) byte local18;
		if (Class553.anInt3419 * 1798078423 >= 96) {
			@Pc(11) int local11 = Class699.method36887(247146236);
			if (local11 <= 100) {
				Class642.method32702((byte) 79);
				local18 = 4;
			} else if (local11 <= 500) {
				Class586.method31822((byte) 79);
				local18 = 3;
			} else if (local11 <= 1003) {
				Class260.method26246(-155783093);
				local18 = 2;
			} else {
				Class238.method25889(true, -2058307396);
				local18 = 1;
			}
			arg0.method14875(0, local11, (short) 832);
		} else {
			Class238.method25889(true, -777147487);
			local18 = 1;
			arg0.method14870(64, 1666227099);
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 45) == 0) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true, -1601759255);
		} else {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0, (byte) 118);
			Class543.method31129(0, false, 1945646779);
		}
		Class106_Sub1.method5148(-312958799);
		arg0.method14869(local18, 155106355);
	}

	@OriginalMember(owner = "client!alz", name = "<init>", descriptor = "(Ljava/lang/String;IZZ)V")
	Class155_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class155_Sub2) null);
	}
}

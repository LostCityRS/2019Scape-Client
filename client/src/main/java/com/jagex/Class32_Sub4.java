package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoe")
public class Class32_Sub4 extends Class32 {

	@OriginalMember(owner = "client!aoe", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;)V", line = 12)
	public Class32_Sub4(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2) {
		super(arg0, arg1, arg2, Class667.aClass667_109, 128, new Class52(Class26.class));
	}

	@OriginalMember(owner = "client!aoe", name = "e", descriptor = "(Lclient!alw;I)Lclient!kp;", line = 29)
	static Class125 method16727(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class390 local6 = Class708.method36753(729910971)[arg0.g1((short) 16384)];
		@Pc(13) Class392 local13 = Class252.method25976(489952079)[arg0.g1((short) 16384)];
		@Pc(17) int local17 = arg0.g2s((byte) -63);
		@Pc(21) int local21 = arg0.g2s((byte) -71);
		@Pc(25) int local25 = arg0.g2(-1434290800);
		@Pc(29) int local29 = arg0.g2(-1434290800);
		@Pc(33) int local33 = arg0.g2s((byte) -70);
		@Pc(37) int local37 = arg0.gSmart2or4null(-760088561);
		@Pc(41) int local41 = arg0.g4(-118643075);
		return new Class125(local6, local13, local17, local21, local25, local29, local33, local37, local41);
	}
}

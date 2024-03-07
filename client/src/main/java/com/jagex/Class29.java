package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abb")
public class Class29 {

	@OriginalMember(owner = "client!abb", name = "n", descriptor = "I")
	public static final int anInt102 = 40000;

	@OriginalMember(owner = "client!abb", name = "m", descriptor = "I")
	public static final int anInt103 = 131072;

	@OriginalMember(owner = "client!abb", name = "e", descriptor = "I")
	public static final int anInt104 = 1700;

	@OriginalMember(owner = "client!abb", name = "<init>", descriptor = "()V", line = 8)
	Class29() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!abb", name = "cn", descriptor = "(Lclient!aop;III)Z", line = 380)
	static final boolean method604(@OriginalArg(0) Class32_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class610 local5 = (Class610) arg0.method18261(arg1, -957686636);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local5.method31977(arg2, (byte) -74);
	}

	@OriginalMember(owner = "client!abb", name = "g", descriptor = "(IIZB)V", line = 868)
	static void method605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		Class690.aBooleanArrayArray15[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!abb", name = "gr", descriptor = "(IIIIIB)V", line = 3741)
	public static final void method606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		Class545.anInt5289 = arg0 * 175543751;
		Class349.anInt4201 = arg1 * -1334968335;
		Class290.anInt3911 = arg2 * -2016383525;
		Class5.anInt14 = arg3 * 1327295285;
		Class174.anInt3297 = arg4 * -618889189;
		if (Class429.anInt4781 * -1453926679 == 3) {
			Class593.method31718((short) 6634);
		}
		if (Class174.anInt3297 * -283420141 >= 100) {
			@Pc(37) int local37 = Class545.anInt5289 * -717754880 + 256;
			@Pc(43) int local43 = Class349.anInt4201 * -970841600 + 256;
			@Pc(55) int local55 = Class305.method26802(local37, local43, Class512.anInt5209 * 1177442423, (byte) -49) - Class290.anInt3911 * -1980774829;
			@Pc(61) int local61 = local37 - Class163.anInt2002 * -1331168249;
			@Pc(67) int local67 = local55 - Class130_Sub2.anInt1117 * 1055108289;
			@Pc(73) int local73 = local43 - Class270.anInt3884 * 466086187;
			@Pc(84) int local84 = (int) Math.sqrt((double) (local73 * local73 + local61 * local61));
			Class620.anInt5644 = ((int) (Math.atan2((double) local67, (double) local84) * 2607.5945876176133D) & 0x3FFF) * -1151839067;
			IsaacRandom.anInt82 = ((int) (Math.atan2((double) local61, (double) local73) * -2607.5945876176133D) & 0x3FFF) * 1056124373;
			Class348.anInt4199 = 0;
			if (Class620.anInt5644 * 607613741 < 1024) {
				Class620.anInt5644 = 1632801792;
			}
			if (Class620.anInt5644 * 607613741 > 3072) {
				Class620.anInt5644 = 603438080;
			}
		}
		Class429.anInt4781 = -2103515459;
		Class444.anInt4895 = 783237131;
		Class175.anInt3306 = 1395810859;
	}
}

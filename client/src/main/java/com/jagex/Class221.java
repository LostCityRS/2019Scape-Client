package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class221 {

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public static final int anInt3618 = 8191;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!aaw;")
	public Class23 aClass23_1 = new Class23();

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(Lclient!dr;FS)F")
	static float method25908(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) short arg2) {
		if (arg0 == null) {
			return 0.0F;
		} else {
			@Pc(8) float local8 = arg1 - arg0.aFloat276;
			return arg0.aFloatArray97[3] + local8 * ((arg0.aFloatArray97[0] * local8 + arg0.aFloatArray97[1]) * local8 + arg0.aFloatArray97[2]);
		}
	}

	@OriginalMember(owner = "client!db", name = "t", descriptor = "(IIIB)I")
	public static int method25909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!db", name = "cy", descriptor = "(Lclient!aod;IIB)Z")
	static boolean method25910(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) Class625 local5 = (Class625) arg0.method18054(arg1, 2112887884);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local5.method32458(arg2, (byte) -35);
	}
}

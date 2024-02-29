package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public class Class434 {

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "[I")
	public int[] anIntArray445;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!asq;")
	public Class93_Sub1_Sub18 aClass93_Sub1_Sub18_1;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public int anInt4807;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "(Lclient!alw;)Lclient!ne;", line = 13)
	public static Class434 method28799(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) Class434 local3 = new Class434();
		local3.anInt4807 = arg0.method22472(-1434290800) * -1924523377;
		local3.aClass93_Sub1_Sub18_1 = Class372.aClass58_2.method1094(local3.anInt4807 * 526894191, -737304293);
		return local3;
	}

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "(Lclient!alw;)Lclient!ne;", line = 13)
	public static Class434 method28800(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) Class434 local3 = new Class434();
		local3.anInt4807 = arg0.method22472(-1434290800) * -1924523377;
		local3.aClass93_Sub1_Sub18_1 = Class372.aClass58_2.method1094(local3.anInt4807 * 526894191, -737304293);
		return local3;
	}

	@OriginalMember(owner = "client!ne", name = "bt", descriptor = "(II)Z", line = 1416)
	static boolean method28801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 44 || arg0 == 45 || arg0 == 46 || arg0 == 47 || arg0 == 48 || arg0 == 49 || arg0 == 50 || arg0 == 51 || arg0 == 52 || arg0 == 53 || arg0 == 15;
	}
}

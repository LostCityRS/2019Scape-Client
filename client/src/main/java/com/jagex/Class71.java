package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acv")
public class Class71 {

	@OriginalMember(owner = "client!acv", name = "e", descriptor = "Lclient!acv;")
	public static final Class71 aClass71_4 = new Class71();

	@OriginalMember(owner = "client!acv", name = "n", descriptor = "Lclient!acv;")
	public static final Class71 aClass71_3 = new Class71();

	@OriginalMember(owner = "client!acv", name = "m", descriptor = "Lclient!acv;")
	public static final Class71 aClass71_2 = new Class71();

	@OriginalMember(owner = "client!acv", name = "k", descriptor = "Lclient!acv;")
	public static final Class71 aClass71_5 = new Class71();

	@OriginalMember(owner = "client!acv", name = "<init>", descriptor = "()V", line = 10)
	Class71() {
	}

	@OriginalMember(owner = "client!acv", name = "l", descriptor = "(IIIIIIILclient!oe;IIB)V", line = 171)
	static final void method1247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30459(-1664407314) - 2 || arg3 > client.aClass532_1.method30466((short) 128) - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30487(-955291898).method30330(arg2, arg3, -662808309)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30481(-1273454175) == null) {
			return;
		}
		client.aClass532_1.method30511(-310507201).method10981(Class694.aClass104_14, arg0, arg1, arg2, arg3, (byte) -82);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(-286073295);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 70);
			client.aClass532_1.method30511(-310507201).method10972(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7, -1401671972);
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55, (byte) 83);
		}
		Class110_Sub15.method20152(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, 1611540913);
	}

	@OriginalMember(owner = "client!acv", name = "ag", descriptor = "(Lclient!yf;I)V", line = 4886)
	static final void method1248(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		if (arg0.anIntArray519[arg0.anInt5891 * -1497248091] == arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1]) {
			arg0.anInt5889 += arg0.anIntArray520[arg0.anInt5889 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!acv", name = "are", descriptor = "(Lclient!yf;I)V", line = 12899)
	static final void method1249(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!acv", name = "azr", descriptor = "(Lclient!yf;B)V", line = 14209)
	static final void method1250(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public class Class224 {

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 7)
	Class224() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)[Lclient!ks;", line = 27)
	static Class387[] method25590(@OriginalArg(0) int arg0) {
		return new Class387[] { Class387.aClass387_11, Class387.aClass387_13, Class387.aClass387_10, Class387.aClass387_1, Class387.aClass387_14, Class387.aClass387_2, Class387.aClass387_5, Class387.aClass387_9, Class387.aClass387_15, Class387.aClass387_8, Class387.aClass387_12, Class387.aClass387_3, Class387.aClass387_6, Class387.aClass387_4, Class387.aClass387_7 };
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(IIB)I", line = 219)
	public static final int method25591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(IIIS)I", line = 1594)
	static final int method25592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(24) int local24 = Class718.method36900(local3, local13, -487228669);
		@Pc(31) int local31 = Class718.method36900(local3 + 1, local13, -1839956947);
		@Pc(38) int local38 = Class718.method36900(local3, local13 + 1, -770218843);
		@Pc(47) int local47 = Class718.method36900(local3 + 1, local13 + 1, -1014061731);
		@Pc(54) int local54 = Class380.method28118(local24, local31, local9, arg2, 2059136904);
		@Pc(61) int local61 = Class380.method28118(local38, local47, local9, arg2, 1546727218);
		return Class380.method28118(local54, local61, local19, arg2, -1339652398);
	}

	@OriginalMember(owner = "client!dd", name = "dt", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5502)
	static final void method25593(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt3996 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * 1268923589;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!dd", name = "mq", descriptor = "(Lclient!yf;B)V", line = 7216)
	static final void method25594(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1118063673);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class160.method14716(local16, local22, arg0, 1598034806);
	}

	@OriginalMember(owner = "client!dd", name = "sy", descriptor = "(Lclient!yf;B)V", line = 8296)
	static final void method25595(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.method25364(local11).method13627((short) -3208);
	}

	@OriginalMember(owner = "client!dd", name = "awc", descriptor = "(Lclient!yf;I)V", line = 13727)
	static final void method25596(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.state * -849002901 == 13) {
			Class50.aBoolean27 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1;
		}
	}
}

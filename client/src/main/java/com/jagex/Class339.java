package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public class Class339 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
	static final int anInt4185 = 100;

	@OriginalMember(owner = "client!ij", name = "bq", descriptor = "Ljava/lang/String;")
	public static String aString179;

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
	int anInt4186;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "[Lclient!asg;")
	Class93_Sub1_Sub15[] aClass93_Sub1_Sub15Array1 = new Class93_Sub1_Sub15[100];

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(Lclient!ig;B)V", line = 14)
	public static void method27473(@OriginalArg(0) Class337 arg0, @OriginalArg(1) byte arg1) {
		Class350.aClass337_1 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 94)
	Class339() {
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;I)Lclient!asg;", line = 97)
	Class93_Sub1_Sub15 method27474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8, @OriginalArg(9) int arg9) {
		@Pc(4) Class93_Sub1_Sub15 local4 = this.aClass93_Sub1_Sub15Array1[99];
		for (@Pc(9) int local9 = this.anInt4186 * 633919245; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass93_Sub1_Sub15Array1[local9] = this.aClass93_Sub1_Sub15Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class93_Sub1_Sub15(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method23969(-1697655605);
			local4.method23976((short) -29725);
			local4.method22733(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, -633541437);
		}
		this.aClass93_Sub1_Sub15Array1[0] = local4;
		if (this.anInt4186 * 633919245 < 100) {
			this.anInt4186 += 755748805;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;)Lclient!asg;", line = 97)
	Class93_Sub1_Sub15 method27475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8) {
		@Pc(4) Class93_Sub1_Sub15 local4 = this.aClass93_Sub1_Sub15Array1[99];
		for (@Pc(9) int local9 = this.anInt4186 * 633919245; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass93_Sub1_Sub15Array1[local9] = this.aClass93_Sub1_Sub15Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class93_Sub1_Sub15(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method23969(-484643838);
			local4.method23976((short) 5295);
			local4.method22733(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, -633541437);
		}
		this.aClass93_Sub1_Sub15Array1[0] = local4;
		if (this.anInt4186 * 633919245 < 100) {
			this.anInt4186 += 755748805;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;)Lclient!asg;", line = 97)
	Class93_Sub1_Sub15 method27476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8) {
		@Pc(4) Class93_Sub1_Sub15 local4 = this.aClass93_Sub1_Sub15Array1[99];
		for (@Pc(9) int local9 = this.anInt4186 * 633919245; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass93_Sub1_Sub15Array1[local9] = this.aClass93_Sub1_Sub15Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class93_Sub1_Sub15(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method23969(-649870588);
			local4.method23976((short) 20014);
			local4.method22733(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, -633541437);
		}
		this.aClass93_Sub1_Sub15Array1[0] = local4;
		if (this.anInt4186 * 633919245 < 100) {
			this.anInt4186 += 755748805;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;)Lclient!asg;", line = 97)
	Class93_Sub1_Sub15 method27477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8) {
		@Pc(4) Class93_Sub1_Sub15 local4 = this.aClass93_Sub1_Sub15Array1[99];
		for (@Pc(9) int local9 = this.anInt4186 * 633919245; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass93_Sub1_Sub15Array1[local9] = this.aClass93_Sub1_Sub15Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class93_Sub1_Sub15(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method23969(-886264237);
			local4.method23976((short) 7991);
			local4.method22733(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, -633541437);
		}
		this.aClass93_Sub1_Sub15Array1[0] = local4;
		if (this.anInt4186 * 633919245 < 100) {
			this.anInt4186 += 755748805;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;)Lclient!asg;", line = 97)
	Class93_Sub1_Sub15 method27478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8) {
		@Pc(4) Class93_Sub1_Sub15 local4 = this.aClass93_Sub1_Sub15Array1[99];
		for (@Pc(9) int local9 = this.anInt4186 * 633919245; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass93_Sub1_Sub15Array1[local9] = this.aClass93_Sub1_Sub15Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class93_Sub1_Sub15(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method23969(-1507249594);
			local4.method23976((short) 22375);
			local4.method22733(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, -633541437);
		}
		this.aClass93_Sub1_Sub15Array1[0] = local4;
		if (this.anInt4186 * 633919245 < 100) {
			this.anInt4186 += 755748805;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "(II)Lclient!asg;", line = 114)
	Class93_Sub1_Sub15 method27479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 0 && arg0 < this.anInt4186 * 633919245 ? this.aClass93_Sub1_Sub15Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "(I)Lclient!asg;", line = 114)
	Class93_Sub1_Sub15 method27480(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4186 * 633919245 ? this.aClass93_Sub1_Sub15Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "(I)Lclient!asg;", line = 114)
	Class93_Sub1_Sub15 method27481(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4186 * 633919245 ? this.aClass93_Sub1_Sub15Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "()I", line = 119)
	int method27482() {
		return this.anInt4186 * 633919245;
	}

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "(B)I", line = 119)
	int method27483(@OriginalArg(0) byte arg0) {
		return this.anInt4186 * 633919245;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "()I", line = 119)
	int method27484() {
		return this.anInt4186 * 633919245;
	}

	@OriginalMember(owner = "client!ij", name = "ef", descriptor = "(ZI)V", line = 908)
	public static void method27485(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class159_Sub1.aBoolean355 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "fz", descriptor = "(Lclient!ax;B)V", line = 2325)
	static void method27486(@OriginalArg(0) Class175 arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_51, arg0.aClass24_2, (byte) 46);
		local5.aPacketBit_1.p1(Class255.method26008(2033898723), (byte) -58);
		local5.aPacketBit_1.p2(client.anInt3408 * -1378711501, 2145519216);
		local5.aPacketBit_1.p2(client.anInt3416 * 2091353777, 2128531004);
		local5.aPacketBit_1.p1(Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16345(-1923223686), (byte) -120);
		arg0.method24356(local5, -2013322142);
	}

	@OriginalMember(owner = "client!ij", name = "aag", descriptor = "(Lclient!yf;I)V", line = 9650)
	static final void method27487(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		Class488.method29824(local13, 1178489549);
	}

	@OriginalMember(owner = "client!ij", name = "ahx", descriptor = "(Lclient!yf;I)V", line = 10885)
	static final void method27488(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class622 local18 = (Class622) Class166_Sub6.aClass32_Sub5_1.method18261(local12, 212419559);
		if (local18.anIntArray497 == null || local18.anIntArray497.length <= 0) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt5669 * -727082723;
			return;
		}
		@Pc(27) int local27 = 0;
		@Pc(32) int local32 = local18.anIntArray496[0];
		for (@Pc(34) int local34 = 1; local34 < local18.anIntArray497.length; local34++) {
			if (local18.anIntArray496[local34] > local32) {
				local27 = local34;
				local32 = local18.anIntArray496[local34];
			}
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anIntArray497[local27];
	}

	@OriginalMember(owner = "client!ij", name = "azx", descriptor = "(Lclient!yf;I)V", line = 14133)
	static final void method27489(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15402((byte) 53) ? 1 : 0;
	}
}

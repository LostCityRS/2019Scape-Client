package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class339 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
	static final int anInt4226 = 100;

	@OriginalMember(owner = "client!ij", name = "bq", descriptor = "Ljava/lang/String;")
	public static String aString185;

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
	int anInt4227;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "[Lclient!asg;")
	Class93_Sub1_Sub15[] aClass93_Sub1_Sub15Array1 = new Class93_Sub1_Sub15[100];

	@OriginalMember(owner = "client!ij", name = "aag", descriptor = "(Lclient!yf;I)V")
	static void method27577(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		Class488.method30004(local13, 1178489549);
	}

	@OriginalMember(owner = "client!ij", name = "ahx", descriptor = "(Lclient!yf;I)V")
	static void method27578(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class622 local18 = (Class622) Class166_Sub6.aClass32_Sub5_1.method18273(local12, 212419559);
		if (local18.anIntArray499 == null || local18.anIntArray499.length <= 0) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt5830 * -727082723;
			return;
		}
		@Pc(27) int local27 = 0;
		@Pc(32) int local32 = local18.anIntArray498[0];
		for (@Pc(34) int local34 = 1; local34 < local18.anIntArray499.length; local34++) {
			if (local18.anIntArray498[local34] > local32) {
				local27 = local34;
				local32 = local18.anIntArray498[local34];
			}
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anIntArray499[local27];
	}

	@OriginalMember(owner = "client!ij", name = "azx", descriptor = "(Lclient!yf;I)V")
	static void method27579(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15413((byte) 53) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ij", name = "fz", descriptor = "(Lclient!ax;B)V")
	static void method27580(@OriginalArg(0) Class175 arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_51, arg0.aClass24_2, (byte) 46);
		local5.aClass93_Sub41_Sub2_1.method22522(Class255.method26101(2033898723), (byte) -58);
		local5.aClass93_Sub41_Sub2_1.method22466(client.anInt3408 * -1378711501, 2145519216);
		local5.aClass93_Sub41_Sub2_1.method22466(client.anInt3416 * 2091353777, 2128531004);
		local5.aClass93_Sub41_Sub2_1.method22522(Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16355(-1923223686), (byte) -120);
		arg0.method24363(local5, -2013322142);
	}

	@OriginalMember(owner = "client!ij", name = "ef", descriptor = "(ZI)V")
	public static void method27581(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class159_Sub1.aBoolean356 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(Lclient!ig;B)V")
	public static void method27582(@OriginalArg(0) Class337 arg0, @OriginalArg(1) byte arg1) {
		Class350.aClass337_1 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	Class339() {
	}

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "(II)Lclient!asg;")
	Class93_Sub1_Sub15 method27566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 0 && arg0 < this.anInt4227 * 633919245 ? this.aClass93_Sub1_Sub15Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;I)Lclient!asg;")
	Class93_Sub1_Sub15 method27567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8, @OriginalArg(9) int arg9) {
		@Pc(4) Class93_Sub1_Sub15 local4 = this.aClass93_Sub1_Sub15Array1[99];
		for (@Pc(9) int local9 = this.anInt4227 * 633919245; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass93_Sub1_Sub15Array1[local9] = this.aClass93_Sub1_Sub15Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class93_Sub1_Sub15(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method23981(-1697655605);
			local4.method23988((short) -29725);
			local4.method22745(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, -633541437);
		}
		this.aClass93_Sub1_Sub15Array1[0] = local4;
		if (this.anInt4227 * 633919245 < 100) {
			this.anInt4227 += 755748805;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;)Lclient!asg;")
	Class93_Sub1_Sub15 method27568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8) {
		@Pc(4) Class93_Sub1_Sub15 local4 = this.aClass93_Sub1_Sub15Array1[99];
		for (@Pc(9) int local9 = this.anInt4227 * 633919245; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass93_Sub1_Sub15Array1[local9] = this.aClass93_Sub1_Sub15Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class93_Sub1_Sub15(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method23981(-484643838);
			local4.method23988((short) 5295);
			local4.method22745(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, -633541437);
		}
		this.aClass93_Sub1_Sub15Array1[0] = local4;
		if (this.anInt4227 * 633919245 < 100) {
			this.anInt4227 += 755748805;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;)Lclient!asg;")
	Class93_Sub1_Sub15 method27569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8) {
		@Pc(4) Class93_Sub1_Sub15 local4 = this.aClass93_Sub1_Sub15Array1[99];
		for (@Pc(9) int local9 = this.anInt4227 * 633919245; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass93_Sub1_Sub15Array1[local9] = this.aClass93_Sub1_Sub15Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class93_Sub1_Sub15(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method23981(-649870588);
			local4.method23988((short) 20014);
			local4.method22745(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, -633541437);
		}
		this.aClass93_Sub1_Sub15Array1[0] = local4;
		if (this.anInt4227 * 633919245 < 100) {
			this.anInt4227 += 755748805;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;)Lclient!asg;")
	Class93_Sub1_Sub15 method27570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8) {
		@Pc(4) Class93_Sub1_Sub15 local4 = this.aClass93_Sub1_Sub15Array1[99];
		for (@Pc(9) int local9 = this.anInt4227 * 633919245; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass93_Sub1_Sub15Array1[local9] = this.aClass93_Sub1_Sub15Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class93_Sub1_Sub15(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method23981(-886264237);
			local4.method23988((short) 7991);
			local4.method22745(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, -633541437);
		}
		this.aClass93_Sub1_Sub15Array1[0] = local4;
		if (this.anInt4227 * 633919245 < 100) {
			this.anInt4227 += 755748805;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "()I")
	int method27571() {
		return this.anInt4227 * 633919245;
	}

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;)Lclient!asg;")
	Class93_Sub1_Sub15 method27572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8) {
		@Pc(4) Class93_Sub1_Sub15 local4 = this.aClass93_Sub1_Sub15Array1[99];
		for (@Pc(9) int local9 = this.anInt4227 * 633919245; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass93_Sub1_Sub15Array1[local9] = this.aClass93_Sub1_Sub15Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class93_Sub1_Sub15(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method23981(-1507249594);
			local4.method23988((short) 22375);
			local4.method22745(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, -633541437);
		}
		this.aClass93_Sub1_Sub15Array1[0] = local4;
		if (this.anInt4227 * 633919245 < 100) {
			this.anInt4227 += 755748805;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "(I)Lclient!asg;")
	Class93_Sub1_Sub15 method27573(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4227 * 633919245 ? this.aClass93_Sub1_Sub15Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "(I)Lclient!asg;")
	Class93_Sub1_Sub15 method27574(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4227 * 633919245 ? this.aClass93_Sub1_Sub15Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "(B)I")
	int method27575(@OriginalArg(0) byte arg0) {
		return this.anInt4227 * 633919245;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "()I")
	int method27576() {
		return this.anInt4227 * 633919245;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afn")
public final class Class104_Sub5 extends Class104 {

	@OriginalMember(owner = "client!afn", name = "w", descriptor = "Lclient!aff;")
	Class102_Sub2 aClass102_Sub2_6;

	@OriginalMember(owner = "client!afn", name = "r", descriptor = "[[B")
	byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!afn", name = "g", descriptor = "(Lclient!yp;I)V")
	static void method6645(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class104.method7687(-1252142059);
	}

	@OriginalMember(owner = "client!afn", name = "em", descriptor = "(IZI)Z")
	public static boolean method6646(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0 == Class159_Sub1.anInt2022 * 781339239) {
			Class159_Sub1.aBoolean409 = arg1;
		} else if (Class159_Sub1.anInt2020 * -606222511 == arg0) {
			Class159_Sub1.aBoolean404 = arg1;
		} else if (Class159_Sub1.anInt2014 * -1592559853 == arg0) {
			Class159_Sub1.aBoolean402 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!afn", name = "<init>", descriptor = "(Lclient!aff;Lclient!aan;Lclient!afs;)V")
	Class104_Sub5(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class109_Sub2 arg2) {
		super(arg0, arg1);
		this.aClass102_Sub2_6 = arg0;
		this.aByteArrayArray11 = new byte[256][];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(21) int local21 = this.aClass15_8.method369(local12, (short) -2984);
			@Pc(27) int local27 = this.aClass15_8.method371(local12, -564079820);
			@Pc(33) short[] local33 = this.aClass15_8.method384(local12, -785866386);
			@Pc(37) short local37 = local33[0];
			@Pc(41) short local41 = local33[1];
			@Pc(46) byte[] local46 = new byte[local27 * local21];
			for (@Pc(48) int local48 = 0; local48 < local27; local48++) {
				for (@Pc(53) int local53 = 0; local53 < local21; local53++) {
					local46[local53 + local48 * local21] = arg2.aByteArray25[this.aClass15_8.anInt50 * -2031443477 * local53 + local37 + this.aClass15_8.anInt49 * 592072939 * (this.aClass15_8.anInt50 * -2031443477 * local48 + local41)];
				}
			}
			this.aByteArrayArray11[local12] = local46;
		}
	}

	@OriginalMember(owner = "client!afn", name = "<init>", descriptor = "(Lclient!aff;Lclient!aan;Lclient!afq;)V")
	Class104_Sub5(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class109_Sub1 arg2) {
		super(arg0, arg1);
		this.aClass102_Sub2_6 = arg0;
		@Pc(10) int[] local10 = arg2.method7117(false);
		this.aByteArrayArray11 = new byte[256][];
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(25) int local25 = this.aClass15_8.method369(local16, (short) -2853);
			@Pc(31) int local31 = this.aClass15_8.method371(local16, -566103056);
			@Pc(37) short[] local37 = this.aClass15_8.method384(local16, -1288485097);
			@Pc(41) short local41 = local37[0];
			@Pc(45) short local45 = local37[1];
			@Pc(50) byte[] local50 = new byte[local31 * local25];
			for (@Pc(52) int local52 = 0; local52 < local31; local52++) {
				for (@Pc(57) int local57 = 0; local57 < local25; local57++) {
					@Pc(88) int local88 = local10[(local52 * -2031443477 * this.aClass15_8.anInt50 + local45) * 592072939 * this.aClass15_8.anInt49 + local41 + local57 * -2031443477 * this.aClass15_8.anInt50];
					@Pc(111) byte local111 = (byte) ((local88 & 0xFF) + (local88 >> 8 & 0xFF) * 4 + (local88 >> 16 & 0xFF) * 3 >> 3);
					local50[local52 * local25 + local57] = local111;
				}
			}
			this.aByteArrayArray11[local16] = local50;
		}
	}

	@OriginalMember(owner = "client!afn", name = "be", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method6631(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg9 - this.aClass102_Sub2_6.anInt637 * 531468375;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass102_Sub2_6.anInt638 * 513500097 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg6 + arg10;
		@Pc(64) int local64 = arg2 >>> 24;
		@Pc(68) int local68 = 255 - local64;
		for (@Pc(70) int local70 = local18; local70 < local60; local70++) {
			@Pc(81) int local81 = arg13 + local5[local70 - arg14];
			@Pc(87) int local87 = local8[local70 - arg14];
			@Pc(89) int local89 = arg5;
			@Pc(96) int local96;
			if (local16 > local81) {
				local96 = local16 - local81;
				if (local96 >= local87) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				local87 -= local96;
			} else {
				local96 = local81 - local16;
				if (local96 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local96;
				local89 = arg5 - local96;
				arg4 += local96;
			}
			local96 = 0;
			if (local89 < local87) {
				local87 = local89;
			} else {
				local96 = local89 - local87;
			}
			for (@Pc(164) int local164 = -local87; local164 < 0; local164++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(189) int local189 = (local64 * (arg2 & 0xFF00FF) & 0xFF00FF00) + ((arg2 & 0xFF00) * local64 & 0xFF0000) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = local189 + (((local193 & 0xFF00) * local68 & 0xFF0000) + (local68 * (local193 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg3 += local96 + arg8;
			arg4 += arg7 + local96;
		}
	}

	@OriginalMember(owner = "client!afn", name = "bz", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method6632(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += (arg14 - arg10) * this.aClass102_Sub2_6.anInt638 * 513500097;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(52) int local52 = arg14 + local5.length < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				local71 -= local80;
			} else {
				local80 = local65 - arg9;
				if (local80 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local80;
				local73 = arg5 - local80;
				arg4 += local80;
			}
			local80 = 0;
			if (local73 < local71) {
				local71 = local73;
			} else {
				local80 = local73 - local71;
			}
			for (@Pc(147) int local147 = 0; local147 < local71; local147++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += arg8 + local80;
			arg4 += local80 + arg7;
		}
	}

	@OriginalMember(owner = "client!afn", name = "r", descriptor = "(CIIIZ)V")
	@Override
	void method7643(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_6.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1284347540);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -2626);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, 1847129001);
		@Pc(30) int local30 = this.aClass102_Sub2_6.anInt638 * 513500097;
		@Pc(36) int local36 = arg1 + local30 * arg2;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_6.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_6.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_6.anInt645 * -1878420243;
			local44 += local18 * local59;
			local36 += local59 * local30;
		}
		if (local24 + arg2 > this.aClass102_Sub2_6.anInt639 * 725126603) {
			local24 -= local24 + arg2 - this.aClass102_Sub2_6.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_6.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_6.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_6.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_6.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_6.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 <= 0 || local24 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6637(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method6634(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afn", name = "bo", descriptor = "([B[IIIIIIII)V")
	void method6633(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			for (local16 = local4; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afn", name = "bk", descriptor = "([B[IIIIIIII)V")
	void method6634(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = (local3 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local3 & 0xFF00FF00) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = local40 + (((local44 & 0xFF00) * local7 & 0xFF0000) + ((local44 & 0xFF00FF) * local7 & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afn", name = "q", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7644(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_6.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1414911485);
		@Pc(29) int local29 = this.aClass15_8.method369(arg0, (short) -22357);
		@Pc(35) int local35 = this.aClass15_8.method371(arg0, -97469788);
		@Pc(41) int local41 = this.aClass102_Sub2_6.anInt638 * 513500097;
		@Pc(47) int local47 = arg1 + local41 * arg2;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass102_Sub2_6.anInt645 * -1878420243) {
			local70 = this.aClass102_Sub2_6.anInt645 * -1878420243 - arg2;
			local35 -= local70;
			arg2 = this.aClass102_Sub2_6.anInt645 * -1878420243;
			local55 += local70 * local29;
			local47 += local41 * local70;
		}
		if (local35 + arg2 > this.aClass102_Sub2_6.anInt639 * 725126603) {
			local35 -= local35 + arg2 - this.aClass102_Sub2_6.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_6.anInt637 * 531468375) {
			local70 = this.aClass102_Sub2_6.anInt637 * 531468375 - arg1;
			local29 -= local70;
			arg1 = this.aClass102_Sub2_6.anInt637 * 531468375;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (arg1 + local29 > this.aClass102_Sub2_6.anInt634 * 469139509) {
			local70 = local29 + arg1 - this.aClass102_Sub2_6.anInt634 * 469139509;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 <= 0 || local35 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6632(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -14175), arg5, arg6, arg7);
		} else {
			this.method6631(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -13599), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afn", name = "bf", descriptor = "([B[IIIIIIII)V")
	void method6635(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = (local3 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local3 & 0xFF00FF00) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = local40 + (((local44 & 0xFF00) * local7 & 0xFF0000) + ((local44 & 0xFF00FF) * local7 & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afn", name = "z", descriptor = "(CIIIZ)V")
	@Override
	void method7647(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_6.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1892635256);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -25378);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, 996124807);
		@Pc(30) int local30 = this.aClass102_Sub2_6.anInt638 * 513500097;
		@Pc(36) int local36 = arg1 + local30 * arg2;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_6.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_6.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_6.anInt645 * -1878420243;
			local44 += local18 * local59;
			local36 += local59 * local30;
		}
		if (local24 + arg2 > this.aClass102_Sub2_6.anInt639 * 725126603) {
			local24 -= local24 + arg2 - this.aClass102_Sub2_6.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_6.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_6.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_6.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_6.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_6.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 <= 0 || local24 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6637(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method6634(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afn", name = "bx", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method6636(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += (arg14 - arg10) * this.aClass102_Sub2_6.anInt638 * 513500097;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(52) int local52 = arg14 + local5.length < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				local71 -= local80;
			} else {
				local80 = local65 - arg9;
				if (local80 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local80;
				local73 = arg5 - local80;
				arg4 += local80;
			}
			local80 = 0;
			if (local73 < local71) {
				local71 = local73;
			} else {
				local80 = local73 - local71;
			}
			for (@Pc(147) int local147 = 0; local147 < local71; local147++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += arg8 + local80;
			arg4 += local80 + arg7;
		}
	}

	@OriginalMember(owner = "client!afn", name = "d", descriptor = "(CIIIZ)V")
	@Override
	void method7646(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_6.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -784485317);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -29714);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, 753145476);
		@Pc(30) int local30 = this.aClass102_Sub2_6.anInt638 * 513500097;
		@Pc(36) int local36 = arg1 + local30 * arg2;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_6.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_6.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_6.anInt645 * -1878420243;
			local44 += local18 * local59;
			local36 += local59 * local30;
		}
		if (local24 + arg2 > this.aClass102_Sub2_6.anInt639 * 725126603) {
			local24 -= local24 + arg2 - this.aClass102_Sub2_6.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_6.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_6.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_6.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_6.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_6.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 <= 0 || local24 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6637(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method6634(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afn", name = "by", descriptor = "([B[IIIIIIII)V")
	void method6637(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			for (local16 = local4; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afn", name = "p", descriptor = "(CIIIZ)V")
	@Override
	void method7648(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_6.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1031103732);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -4527);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, -1348736215);
		@Pc(30) int local30 = this.aClass102_Sub2_6.anInt638 * 513500097;
		@Pc(36) int local36 = arg1 + local30 * arg2;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_6.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_6.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_6.anInt645 * -1878420243;
			local44 += local18 * local59;
			local36 += local59 * local30;
		}
		if (local24 + arg2 > this.aClass102_Sub2_6.anInt639 * 725126603) {
			local24 -= local24 + arg2 - this.aClass102_Sub2_6.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_6.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_6.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_6.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_6.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_6.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 <= 0 || local24 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6637(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method6634(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afn", name = "v", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7649(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_6.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1684660653);
		@Pc(29) int local29 = this.aClass15_8.method369(arg0, (short) -1235);
		@Pc(35) int local35 = this.aClass15_8.method371(arg0, -1557515823);
		@Pc(41) int local41 = this.aClass102_Sub2_6.anInt638 * 513500097;
		@Pc(47) int local47 = arg1 + local41 * arg2;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass102_Sub2_6.anInt645 * -1878420243) {
			local70 = this.aClass102_Sub2_6.anInt645 * -1878420243 - arg2;
			local35 -= local70;
			arg2 = this.aClass102_Sub2_6.anInt645 * -1878420243;
			local55 += local70 * local29;
			local47 += local41 * local70;
		}
		if (local35 + arg2 > this.aClass102_Sub2_6.anInt639 * 725126603) {
			local35 -= local35 + arg2 - this.aClass102_Sub2_6.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_6.anInt637 * 531468375) {
			local70 = this.aClass102_Sub2_6.anInt637 * 531468375 - arg1;
			local29 -= local70;
			arg1 = this.aClass102_Sub2_6.anInt637 * 531468375;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (arg1 + local29 > this.aClass102_Sub2_6.anInt634 * 469139509) {
			local70 = local29 + arg1 - this.aClass102_Sub2_6.anInt634 * 469139509;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 <= 0 || local35 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6632(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -640), arg5, arg6, arg7);
		} else {
			this.method6631(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -26523), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afn", name = "y", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7650(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_6.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1649839904);
		@Pc(29) int local29 = this.aClass15_8.method369(arg0, (short) -16704);
		@Pc(35) int local35 = this.aClass15_8.method371(arg0, 960651158);
		@Pc(41) int local41 = this.aClass102_Sub2_6.anInt638 * 513500097;
		@Pc(47) int local47 = arg1 + local41 * arg2;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass102_Sub2_6.anInt645 * -1878420243) {
			local70 = this.aClass102_Sub2_6.anInt645 * -1878420243 - arg2;
			local35 -= local70;
			arg2 = this.aClass102_Sub2_6.anInt645 * -1878420243;
			local55 += local70 * local29;
			local47 += local41 * local70;
		}
		if (local35 + arg2 > this.aClass102_Sub2_6.anInt639 * 725126603) {
			local35 -= local35 + arg2 - this.aClass102_Sub2_6.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_6.anInt637 * 531468375) {
			local70 = this.aClass102_Sub2_6.anInt637 * 531468375 - arg1;
			local29 -= local70;
			arg1 = this.aClass102_Sub2_6.anInt637 * 531468375;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (arg1 + local29 > this.aClass102_Sub2_6.anInt634 * 469139509) {
			local70 = local29 + arg1 - this.aClass102_Sub2_6.anInt634 * 469139509;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 <= 0 || local35 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6632(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -3014), arg5, arg6, arg7);
		} else {
			this.method6631(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -27797), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afn", name = "n", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7651(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_6.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -2128829683);
		@Pc(29) int local29 = this.aClass15_8.method369(arg0, (short) -25186);
		@Pc(35) int local35 = this.aClass15_8.method371(arg0, 43864556);
		@Pc(41) int local41 = this.aClass102_Sub2_6.anInt638 * 513500097;
		@Pc(47) int local47 = arg1 + local41 * arg2;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass102_Sub2_6.anInt645 * -1878420243) {
			local70 = this.aClass102_Sub2_6.anInt645 * -1878420243 - arg2;
			local35 -= local70;
			arg2 = this.aClass102_Sub2_6.anInt645 * -1878420243;
			local55 += local70 * local29;
			local47 += local41 * local70;
		}
		if (local35 + arg2 > this.aClass102_Sub2_6.anInt639 * 725126603) {
			local35 -= local35 + arg2 - this.aClass102_Sub2_6.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_6.anInt637 * 531468375) {
			local70 = this.aClass102_Sub2_6.anInt637 * 531468375 - arg1;
			local29 -= local70;
			arg1 = this.aClass102_Sub2_6.anInt637 * 531468375;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (arg1 + local29 > this.aClass102_Sub2_6.anInt634 * 469139509) {
			local70 = local29 + arg1 - this.aClass102_Sub2_6.anInt634 * 469139509;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 <= 0 || local35 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6632(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -8179), arg5, arg6, arg7);
		} else {
			this.method6631(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -5206), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afn", name = "bh", descriptor = "([B[IIIIIIII)V")
	void method6638(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			for (local16 = local4; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afn", name = "bv", descriptor = "([B[IIIIIIII)V")
	void method6639(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			for (local16 = local4; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afn", name = "bp", descriptor = "([B[IIIIIIII)V")
	void method6640(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			for (local16 = local4; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afn", name = "bb", descriptor = "([B[IIIIIIII)V")
	void method6641(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			for (local16 = local4; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afn", name = "h", descriptor = "(CIIIZ)V")
	@Override
	void method7645(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_6.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1479190918);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -30437);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, 1691088272);
		@Pc(30) int local30 = this.aClass102_Sub2_6.anInt638 * 513500097;
		@Pc(36) int local36 = arg1 + local30 * arg2;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_6.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_6.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_6.anInt645 * -1878420243;
			local44 += local18 * local59;
			local36 += local59 * local30;
		}
		if (local24 + arg2 > this.aClass102_Sub2_6.anInt639 * 725126603) {
			local24 -= local24 + arg2 - this.aClass102_Sub2_6.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_6.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_6.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_6.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_6.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_6.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 <= 0 || local24 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6637(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method6634(this.aByteArrayArray11[arg0], this.aClass102_Sub2_6.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afn", name = "bc", descriptor = "([B[IIIIIIII)V")
	void method6642(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = (local3 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local3 & 0xFF00FF00) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = local40 + (((local44 & 0xFF00) * local7 & 0xFF0000) + ((local44 & 0xFF00FF) * local7 & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afn", name = "bw", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method6643(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += (arg14 - arg10) * this.aClass102_Sub2_6.anInt638 * 513500097;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(52) int local52 = arg14 + local5.length < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				local71 -= local80;
			} else {
				local80 = local65 - arg9;
				if (local80 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local80;
				local73 = arg5 - local80;
				arg4 += local80;
			}
			local80 = 0;
			if (local73 < local71) {
				local71 = local73;
			} else {
				local80 = local73 - local71;
			}
			for (@Pc(147) int local147 = 0; local147 < local71; local147++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += arg8 + local80;
			arg4 += local80 + arg7;
		}
	}

	@OriginalMember(owner = "client!afn", name = "bi", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method6644(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg9 - this.aClass102_Sub2_6.anInt637 * 531468375;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass102_Sub2_6.anInt638 * 513500097 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg6 + arg10;
		@Pc(64) int local64 = arg2 >>> 24;
		@Pc(68) int local68 = 255 - local64;
		for (@Pc(70) int local70 = local18; local70 < local60; local70++) {
			@Pc(81) int local81 = arg13 + local5[local70 - arg14];
			@Pc(87) int local87 = local8[local70 - arg14];
			@Pc(89) int local89 = arg5;
			@Pc(96) int local96;
			if (local16 > local81) {
				local96 = local16 - local81;
				if (local96 >= local87) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				local87 -= local96;
			} else {
				local96 = local81 - local16;
				if (local96 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local96;
				local89 = arg5 - local96;
				arg4 += local96;
			}
			local96 = 0;
			if (local89 < local87) {
				local87 = local89;
			} else {
				local96 = local89 - local87;
			}
			for (@Pc(164) int local164 = -local87; local164 < 0; local164++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(189) int local189 = (local64 * (arg2 & 0xFF00FF) & 0xFF00FF00) + ((arg2 & 0xFF00) * local64 & 0xFF0000) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = local189 + (((local193 & 0xFF00) * local68 & 0xFF0000) + (local68 * (local193 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg3 += local96 + arg8;
			arg4 += arg7 + local96;
		}
	}
}

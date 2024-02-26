package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afe")
public final class Class104_Sub2 extends Class104 {

	@OriginalMember(owner = "client!afe", name = "fn", descriptor = "Lclient!pf;")
	public static Class480 aClass480_16;

	@OriginalMember(owner = "client!afe", name = "hb", descriptor = "Lclient!aou;")
	public static Class41_Sub16 aClass41_Sub16_1;

	@OriginalMember(owner = "client!afe", name = "w", descriptor = "Lclient!aff;")
	Class102_Sub2 aClass102_Sub2_3;

	@OriginalMember(owner = "client!afe", name = "r", descriptor = "[[B")
	byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!afe", name = "q", descriptor = "[I")
	int[] anIntArray49;

	@OriginalMember(owner = "client!afe", name = "tq", descriptor = "(Lclient!yp;B)V")
	static void method4580(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class108_Sub2.method24060(local11, arg0, -810305285);
	}

	@OriginalMember(owner = "client!afe", name = "m", descriptor = "(IZB)Ljava/lang/String;")
	public static String method4581(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		return arg1 && arg0 >= 0 ? Class69.method1250(arg0, 10, arg1, 2128104651) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!afe", name = "<init>", descriptor = "(Lclient!aff;Lclient!aan;Lclient!afs;)V")
	Class104_Sub2(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class109_Sub2 arg2) {
		super(arg0, arg1);
		this.aClass102_Sub2_3 = arg0;
		this.aByteArrayArray10 = new byte[256][];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(21) int local21 = this.aClass15_8.method369(local12, (short) -31958);
			@Pc(27) int local27 = this.aClass15_8.method371(local12, -89139314);
			@Pc(33) short[] local33 = this.aClass15_8.method384(local12, -878955008);
			@Pc(37) short local37 = local33[0];
			@Pc(41) short local41 = local33[1];
			@Pc(46) byte[] local46 = new byte[local27 * local21];
			for (@Pc(48) int local48 = 0; local48 < local27; local48++) {
				for (@Pc(53) int local53 = 0; local53 < local21; local53++) {
					local46[local53 + local21 * local48] = arg2.aByteArray25[(this.aClass15_8.anInt50 * -2031443477 * local48 + local41) * this.aClass15_8.anInt49 * 592072939 + local37 + local53 * this.aClass15_8.anInt50 * -2031443477];
				}
			}
			this.aByteArrayArray10[local12] = local46;
		}
		this.anIntArray49 = arg2.anIntArray79;
	}

	@OriginalMember(owner = "client!afe", name = "bz", descriptor = "([B[I[IIIIIIIIIIILclient!cg;II)V")
	void method4566(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class98 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg13;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg10 - this.aClass102_Sub2_3.anInt637 * 531468375;
		@Pc(18) int local18 = arg11;
		if (arg15 > arg11) {
			local18 = arg15;
			arg5 += (arg15 - arg11) * 513500097 * this.aClass102_Sub2_3.anInt638;
			arg4 += (arg15 - arg11) * arg12;
		}
		@Pc(60) int local60 = local5.length + arg15 < arg11 + arg7 ? arg15 + local5.length : arg11 + arg7;
		@Pc(62) boolean local62 = false;
		for (@Pc(64) int local64 = local18; local64 < local60; local64++) {
			@Pc(75) int local75 = arg14 + local5[local64 - arg15];
			@Pc(81) int local81 = local8[local64 - arg15];
			@Pc(83) int local83 = arg6;
			@Pc(90) int local90;
			if (local16 > local75) {
				local90 = local16 - local75;
				if (local90 >= local81) {
					arg4 += arg6 + arg9;
					arg5 += arg8 + arg6;
					continue;
				}
				local81 -= local90;
			} else {
				local90 = local75 - local16;
				if (local90 >= arg6) {
					arg4 += arg6 + arg9;
					arg5 += arg6 + arg8;
					continue;
				}
				arg4 += local90;
				local83 = arg6 - local90;
				arg5 += local90;
			}
			local90 = 0;
			if (local83 < local81) {
				local81 = local83;
			} else {
				local90 = local83 - local81;
			}
			for (@Pc(158) int local158 = -local81; local158 < 0; local158++) {
				@Pc(166) byte local166;
				if ((local166 = arg0[arg4++]) == 0) {
					arg5++;
				} else {
					arg1[arg5++] = arg2[local166 & 0xFF];
				}
			}
			arg4 += local90 + arg9;
			arg5 += local90 + arg8;
		}
	}

	@OriginalMember(owner = "client!afe", name = "be", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method4567(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg9 - this.aClass102_Sub2_3.anInt637 * 531468375;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass102_Sub2_3.anInt638 * 513500097 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = local5[local62 - arg14] + arg13;
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				local79 -= local88;
			} else {
				local88 = local73 - local16;
				if (local88 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += local88;
				local81 = arg5 - local88;
				arg4 += local88;
			}
			local88 = 0;
			if (local81 < local79) {
				local79 = local81;
			} else {
				local88 = local81 - local79;
			}
			for (@Pc(156) int local156 = -local79; local156 < 0; local156++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += local88 + arg3;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!afe", name = "bh", descriptor = "([B[I[IIIIIII)V")
	void method4568(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		@Pc(11) boolean local11 = false;
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
			@Pc(18) int local18;
			for (local18 = local4; local18 < 0; local18++) {
				@Pc(26) byte local26;
				if ((local26 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local26 & 0xFF];
				}
				@Pc(44) byte local44;
				if ((local44 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local44 & 0xFF];
				}
				@Pc(62) byte local62;
				if ((local62 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local62 & 0xFF];
				}
				@Pc(80) byte local80;
				if ((local80 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local80 & 0xFF];
				}
			}
			for (local18 = local9; local18 < 0; local18++) {
				@Pc(104) byte local104;
				if ((local104 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local104 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afe", name = "q", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7644(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_3.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, 29003722);
		@Pc(30) int local30 = this.aClass15_8.method369(arg0, (short) -31672);
		@Pc(36) int local36 = this.aClass15_8.method371(arg0, 1077089842);
		@Pc(42) int local42 = this.aClass102_Sub2_3.anInt638 * 513500097;
		@Pc(48) int local48 = arg2 * local42 + arg1;
		@Pc(52) int local52 = local42 - local30;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(71) int local71;
		if (arg2 < this.aClass102_Sub2_3.anInt645 * -1878420243) {
			local71 = this.aClass102_Sub2_3.anInt645 * -1878420243 - arg2;
			local36 -= local71;
			arg2 = this.aClass102_Sub2_3.anInt645 * -1878420243;
			local56 += local30 * local71;
			local48 += local42 * local71;
		}
		if (arg2 + local36 > this.aClass102_Sub2_3.anInt639 * 725126603) {
			local36 -= local36 + arg2 - this.aClass102_Sub2_3.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_3.anInt637 * 531468375) {
			local71 = this.aClass102_Sub2_3.anInt637 * 531468375 - arg1;
			local30 -= local71;
			arg1 = this.aClass102_Sub2_3.anInt637 * 531468375;
			local56 += local71;
			local48 += local71;
			local54 += local71;
			local52 += local71;
		}
		if (arg1 + local30 > this.aClass102_Sub2_3.anInt634 * 469139509) {
			local71 = arg1 + local30 - this.aClass102_Sub2_3.anInt634 * 469139509;
			local30 -= local71;
			local54 += local71;
			local52 += local71;
		}
		if (local30 <= 0 || local36 <= 0) {
			return;
		}
		if (arg4) {
			this.method4567(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass15_8.method369(arg0, (short) -1320), arg5, arg6, arg7);
		} else {
			this.method4566(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, this.anIntArray49, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass15_8.method369(arg0, (short) -27913), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afe", name = "v", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7649(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_3.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -409384681);
		@Pc(30) int local30 = this.aClass15_8.method369(arg0, (short) -20727);
		@Pc(36) int local36 = this.aClass15_8.method371(arg0, 1709813603);
		@Pc(42) int local42 = this.aClass102_Sub2_3.anInt638 * 513500097;
		@Pc(48) int local48 = arg2 * local42 + arg1;
		@Pc(52) int local52 = local42 - local30;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(71) int local71;
		if (arg2 < this.aClass102_Sub2_3.anInt645 * -1878420243) {
			local71 = this.aClass102_Sub2_3.anInt645 * -1878420243 - arg2;
			local36 -= local71;
			arg2 = this.aClass102_Sub2_3.anInt645 * -1878420243;
			local56 += local30 * local71;
			local48 += local42 * local71;
		}
		if (arg2 + local36 > this.aClass102_Sub2_3.anInt639 * 725126603) {
			local36 -= local36 + arg2 - this.aClass102_Sub2_3.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_3.anInt637 * 531468375) {
			local71 = this.aClass102_Sub2_3.anInt637 * 531468375 - arg1;
			local30 -= local71;
			arg1 = this.aClass102_Sub2_3.anInt637 * 531468375;
			local56 += local71;
			local48 += local71;
			local54 += local71;
			local52 += local71;
		}
		if (arg1 + local30 > this.aClass102_Sub2_3.anInt634 * 469139509) {
			local71 = arg1 + local30 - this.aClass102_Sub2_3.anInt634 * 469139509;
			local30 -= local71;
			local54 += local71;
			local52 += local71;
		}
		if (local30 <= 0 || local36 <= 0) {
			return;
		}
		if (arg4) {
			this.method4567(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass15_8.method369(arg0, (short) -5400), arg5, arg6, arg7);
		} else {
			this.method4566(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, this.anIntArray49, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass15_8.method369(arg0, (short) -3298), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afe", name = "bx", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method4569(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg9 - this.aClass102_Sub2_3.anInt637 * 531468375;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass102_Sub2_3.anInt638 * 513500097 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = local5[local62 - arg14] + arg13;
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				local79 -= local88;
			} else {
				local88 = local73 - local16;
				if (local88 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += local88;
				local81 = arg5 - local88;
				arg4 += local88;
			}
			local88 = 0;
			if (local81 < local79) {
				local79 = local81;
			} else {
				local88 = local81 - local79;
			}
			for (@Pc(156) int local156 = -local79; local156 < 0; local156++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += local88 + arg3;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!afe", name = "h", descriptor = "(CIIIZ)V")
	@Override
	void method7645(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_3.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1236982595);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -16400);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, -1618794317);
		@Pc(30) int local30 = this.aClass102_Sub2_3.anInt638 * 513500097;
		@Pc(36) int local36 = local30 * arg2 + arg1;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_3.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_3.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_3.anInt645 * -1878420243;
			local44 += local59 * local18;
			local36 += local30 * local59;
		}
		if (arg2 + local24 > this.aClass102_Sub2_3.anInt639 * 725126603) {
			local24 -= arg2 + local24 - this.aClass102_Sub2_3.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_3.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_3.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_3.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_3.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_3.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 <= 0 || local24 <= 0) {
			return;
		}
		if (arg4) {
			this.method4579(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		} else {
			this.method4570(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, this.anIntArray49, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afe", name = "d", descriptor = "(CIIIZ)V")
	@Override
	void method7646(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_3.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, 275234400);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -9009);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, -517450689);
		@Pc(30) int local30 = this.aClass102_Sub2_3.anInt638 * 513500097;
		@Pc(36) int local36 = local30 * arg2 + arg1;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_3.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_3.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_3.anInt645 * -1878420243;
			local44 += local59 * local18;
			local36 += local30 * local59;
		}
		if (arg2 + local24 > this.aClass102_Sub2_3.anInt639 * 725126603) {
			local24 -= arg2 + local24 - this.aClass102_Sub2_3.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_3.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_3.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_3.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_3.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_3.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 <= 0 || local24 <= 0) {
			return;
		}
		if (arg4) {
			this.method4579(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		} else {
			this.method4570(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, this.anIntArray49, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afe", name = "by", descriptor = "([B[I[IIIIIII)V")
	void method4570(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		@Pc(11) boolean local11 = false;
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
			@Pc(18) int local18;
			for (local18 = local4; local18 < 0; local18++) {
				@Pc(26) byte local26;
				if ((local26 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local26 & 0xFF];
				}
				@Pc(44) byte local44;
				if ((local44 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local44 & 0xFF];
				}
				@Pc(62) byte local62;
				if ((local62 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local62 & 0xFF];
				}
				@Pc(80) byte local80;
				if ((local80 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local80 & 0xFF];
				}
			}
			for (local18 = local9; local18 < 0; local18++) {
				@Pc(104) byte local104;
				if ((local104 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local104 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afe", name = "p", descriptor = "(CIIIZ)V")
	@Override
	void method7648(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_3.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1735825530);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -25127);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, -1188458814);
		@Pc(30) int local30 = this.aClass102_Sub2_3.anInt638 * 513500097;
		@Pc(36) int local36 = local30 * arg2 + arg1;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_3.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_3.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_3.anInt645 * -1878420243;
			local44 += local59 * local18;
			local36 += local30 * local59;
		}
		if (arg2 + local24 > this.aClass102_Sub2_3.anInt639 * 725126603) {
			local24 -= arg2 + local24 - this.aClass102_Sub2_3.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_3.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_3.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_3.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_3.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_3.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 <= 0 || local24 <= 0) {
			return;
		}
		if (arg4) {
			this.method4579(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		} else {
			this.method4570(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, this.anIntArray49, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afe", name = "r", descriptor = "(CIIIZ)V")
	@Override
	void method7643(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_3.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -851141567);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -24478);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, -198975293);
		@Pc(30) int local30 = this.aClass102_Sub2_3.anInt638 * 513500097;
		@Pc(36) int local36 = local30 * arg2 + arg1;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_3.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_3.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_3.anInt645 * -1878420243;
			local44 += local59 * local18;
			local36 += local30 * local59;
		}
		if (arg2 + local24 > this.aClass102_Sub2_3.anInt639 * 725126603) {
			local24 -= arg2 + local24 - this.aClass102_Sub2_3.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_3.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_3.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_3.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_3.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_3.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 <= 0 || local24 <= 0) {
			return;
		}
		if (arg4) {
			this.method4579(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		} else {
			this.method4570(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, this.anIntArray49, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afe", name = "bi", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method4571(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg9 - this.aClass102_Sub2_3.anInt637 * 531468375;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass102_Sub2_3.anInt638 * 513500097 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = local5[local62 - arg14] + arg13;
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				local79 -= local88;
			} else {
				local88 = local73 - local16;
				if (local88 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += local88;
				local81 = arg5 - local88;
				arg4 += local88;
			}
			local88 = 0;
			if (local81 < local79) {
				local79 = local81;
			} else {
				local88 = local81 - local79;
			}
			for (@Pc(156) int local156 = -local79; local156 < 0; local156++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += local88 + arg3;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!afe", name = "bp", descriptor = "([B[IIIIIIII)V")
	void method4572(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afe", name = "y", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7650(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_3.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1360669232);
		@Pc(30) int local30 = this.aClass15_8.method369(arg0, (short) -23514);
		@Pc(36) int local36 = this.aClass15_8.method371(arg0, -1149263764);
		@Pc(42) int local42 = this.aClass102_Sub2_3.anInt638 * 513500097;
		@Pc(48) int local48 = arg2 * local42 + arg1;
		@Pc(52) int local52 = local42 - local30;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(71) int local71;
		if (arg2 < this.aClass102_Sub2_3.anInt645 * -1878420243) {
			local71 = this.aClass102_Sub2_3.anInt645 * -1878420243 - arg2;
			local36 -= local71;
			arg2 = this.aClass102_Sub2_3.anInt645 * -1878420243;
			local56 += local30 * local71;
			local48 += local42 * local71;
		}
		if (arg2 + local36 > this.aClass102_Sub2_3.anInt639 * 725126603) {
			local36 -= local36 + arg2 - this.aClass102_Sub2_3.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_3.anInt637 * 531468375) {
			local71 = this.aClass102_Sub2_3.anInt637 * 531468375 - arg1;
			local30 -= local71;
			arg1 = this.aClass102_Sub2_3.anInt637 * 531468375;
			local56 += local71;
			local48 += local71;
			local54 += local71;
			local52 += local71;
		}
		if (arg1 + local30 > this.aClass102_Sub2_3.anInt634 * 469139509) {
			local71 = arg1 + local30 - this.aClass102_Sub2_3.anInt634 * 469139509;
			local30 -= local71;
			local54 += local71;
			local52 += local71;
		}
		if (local30 <= 0 || local36 <= 0) {
			return;
		}
		if (arg4) {
			this.method4567(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass15_8.method369(arg0, (short) -12473), arg5, arg6, arg7);
		} else {
			this.method4566(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, this.anIntArray49, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass15_8.method369(arg0, (short) -2784), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afe", name = "bv", descriptor = "([B[I[IIIIIII)V")
	void method4573(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		@Pc(11) boolean local11 = false;
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
			@Pc(18) int local18;
			for (local18 = local4; local18 < 0; local18++) {
				@Pc(26) byte local26;
				if ((local26 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local26 & 0xFF];
				}
				@Pc(44) byte local44;
				if ((local44 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local44 & 0xFF];
				}
				@Pc(62) byte local62;
				if ((local62 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local62 & 0xFF];
				}
				@Pc(80) byte local80;
				if ((local80 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local80 & 0xFF];
				}
			}
			for (local18 = local9; local18 < 0; local18++) {
				@Pc(104) byte local104;
				if ((local104 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local104 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afe", name = "z", descriptor = "(CIIIZ)V")
	@Override
	void method7647(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_3.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -745411696);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -11445);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, -1436372124);
		@Pc(30) int local30 = this.aClass102_Sub2_3.anInt638 * 513500097;
		@Pc(36) int local36 = local30 * arg2 + arg1;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_3.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_3.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_3.anInt645 * -1878420243;
			local44 += local59 * local18;
			local36 += local30 * local59;
		}
		if (arg2 + local24 > this.aClass102_Sub2_3.anInt639 * 725126603) {
			local24 -= arg2 + local24 - this.aClass102_Sub2_3.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_3.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_3.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_3.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_3.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_3.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 <= 0 || local24 <= 0) {
			return;
		}
		if (arg4) {
			this.method4579(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		} else {
			this.method4570(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, this.anIntArray49, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afe", name = "bb", descriptor = "([B[IIIIIIII)V")
	void method4574(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afe", name = "bo", descriptor = "([B[I[IIIIIIIIIIILclient!cg;II)V")
	void method4575(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class98 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg13;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg10 - this.aClass102_Sub2_3.anInt637 * 531468375;
		@Pc(18) int local18 = arg11;
		if (arg15 > arg11) {
			local18 = arg15;
			arg5 += (arg15 - arg11) * 513500097 * this.aClass102_Sub2_3.anInt638;
			arg4 += (arg15 - arg11) * arg12;
		}
		@Pc(60) int local60 = local5.length + arg15 < arg11 + arg7 ? arg15 + local5.length : arg11 + arg7;
		@Pc(62) boolean local62 = false;
		for (@Pc(64) int local64 = local18; local64 < local60; local64++) {
			@Pc(75) int local75 = arg14 + local5[local64 - arg15];
			@Pc(81) int local81 = local8[local64 - arg15];
			@Pc(83) int local83 = arg6;
			@Pc(90) int local90;
			if (local16 > local75) {
				local90 = local16 - local75;
				if (local90 >= local81) {
					arg4 += arg6 + arg9;
					arg5 += arg8 + arg6;
					continue;
				}
				local81 -= local90;
			} else {
				local90 = local75 - local16;
				if (local90 >= arg6) {
					arg4 += arg6 + arg9;
					arg5 += arg6 + arg8;
					continue;
				}
				arg4 += local90;
				local83 = arg6 - local90;
				arg5 += local90;
			}
			local90 = 0;
			if (local83 < local81) {
				local81 = local83;
			} else {
				local90 = local83 - local81;
			}
			for (@Pc(158) int local158 = -local81; local158 < 0; local158++) {
				@Pc(166) byte local166;
				if ((local166 = arg0[arg4++]) == 0) {
					arg5++;
				} else {
					arg1[arg5++] = arg2[local166 & 0xFF];
				}
			}
			arg4 += local90 + arg9;
			arg5 += local90 + arg8;
		}
	}

	@OriginalMember(owner = "client!afe", name = "bc", descriptor = "([B[I[IIIIIIIIIIILclient!cg;II)V")
	void method4576(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class98 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg13;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg10 - this.aClass102_Sub2_3.anInt637 * 531468375;
		@Pc(18) int local18 = arg11;
		if (arg15 > arg11) {
			local18 = arg15;
			arg5 += (arg15 - arg11) * 513500097 * this.aClass102_Sub2_3.anInt638;
			arg4 += (arg15 - arg11) * arg12;
		}
		@Pc(60) int local60 = local5.length + arg15 < arg11 + arg7 ? arg15 + local5.length : arg11 + arg7;
		@Pc(62) boolean local62 = false;
		for (@Pc(64) int local64 = local18; local64 < local60; local64++) {
			@Pc(75) int local75 = arg14 + local5[local64 - arg15];
			@Pc(81) int local81 = local8[local64 - arg15];
			@Pc(83) int local83 = arg6;
			@Pc(90) int local90;
			if (local16 > local75) {
				local90 = local16 - local75;
				if (local90 >= local81) {
					arg4 += arg6 + arg9;
					arg5 += arg8 + arg6;
					continue;
				}
				local81 -= local90;
			} else {
				local90 = local75 - local16;
				if (local90 >= arg6) {
					arg4 += arg6 + arg9;
					arg5 += arg6 + arg8;
					continue;
				}
				arg4 += local90;
				local83 = arg6 - local90;
				arg5 += local90;
			}
			local90 = 0;
			if (local83 < local81) {
				local81 = local83;
			} else {
				local90 = local83 - local81;
			}
			for (@Pc(158) int local158 = -local81; local158 < 0; local158++) {
				@Pc(166) byte local166;
				if ((local166 = arg0[arg4++]) == 0) {
					arg5++;
				} else {
					arg1[arg5++] = arg2[local166 & 0xFF];
				}
			}
			arg4 += local90 + arg9;
			arg5 += local90 + arg8;
		}
	}

	@OriginalMember(owner = "client!afe", name = "bf", descriptor = "([B[I[IIIIIIIIIIILclient!cg;II)V")
	void method4577(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class98 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg13;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg10 - this.aClass102_Sub2_3.anInt637 * 531468375;
		@Pc(18) int local18 = arg11;
		if (arg15 > arg11) {
			local18 = arg15;
			arg5 += (arg15 - arg11) * 513500097 * this.aClass102_Sub2_3.anInt638;
			arg4 += (arg15 - arg11) * arg12;
		}
		@Pc(60) int local60 = local5.length + arg15 < arg11 + arg7 ? arg15 + local5.length : arg11 + arg7;
		@Pc(62) boolean local62 = false;
		for (@Pc(64) int local64 = local18; local64 < local60; local64++) {
			@Pc(75) int local75 = arg14 + local5[local64 - arg15];
			@Pc(81) int local81 = local8[local64 - arg15];
			@Pc(83) int local83 = arg6;
			@Pc(90) int local90;
			if (local16 > local75) {
				local90 = local16 - local75;
				if (local90 >= local81) {
					arg4 += arg6 + arg9;
					arg5 += arg8 + arg6;
					continue;
				}
				local81 -= local90;
			} else {
				local90 = local75 - local16;
				if (local90 >= arg6) {
					arg4 += arg6 + arg9;
					arg5 += arg6 + arg8;
					continue;
				}
				arg4 += local90;
				local83 = arg6 - local90;
				arg5 += local90;
			}
			local90 = 0;
			if (local83 < local81) {
				local81 = local83;
			} else {
				local90 = local83 - local81;
			}
			for (@Pc(158) int local158 = -local81; local158 < 0; local158++) {
				@Pc(166) byte local166;
				if ((local166 = arg0[arg4++]) == 0) {
					arg5++;
				} else {
					arg1[arg5++] = arg2[local166 & 0xFF];
				}
			}
			arg4 += local90 + arg9;
			arg5 += local90 + arg8;
		}
	}

	@OriginalMember(owner = "client!afe", name = "bw", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method4578(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg9 - this.aClass102_Sub2_3.anInt637 * 531468375;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass102_Sub2_3.anInt638 * 513500097 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = local5[local62 - arg14] + arg13;
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				local79 -= local88;
			} else {
				local88 = local73 - local16;
				if (local88 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += local88;
				local81 = arg5 - local88;
				arg4 += local88;
			}
			local88 = 0;
			if (local81 < local79) {
				local79 = local81;
			} else {
				local88 = local81 - local79;
			}
			for (@Pc(156) int local156 = -local79; local156 < 0; local156++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += local88 + arg3;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!afe", name = "bk", descriptor = "([B[IIIIIIII)V")
	void method4579(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afe", name = "n", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7651(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_3.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, 101584299);
		@Pc(30) int local30 = this.aClass15_8.method369(arg0, (short) -6065);
		@Pc(36) int local36 = this.aClass15_8.method371(arg0, 474774836);
		@Pc(42) int local42 = this.aClass102_Sub2_3.anInt638 * 513500097;
		@Pc(48) int local48 = arg2 * local42 + arg1;
		@Pc(52) int local52 = local42 - local30;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(71) int local71;
		if (arg2 < this.aClass102_Sub2_3.anInt645 * -1878420243) {
			local71 = this.aClass102_Sub2_3.anInt645 * -1878420243 - arg2;
			local36 -= local71;
			arg2 = this.aClass102_Sub2_3.anInt645 * -1878420243;
			local56 += local30 * local71;
			local48 += local42 * local71;
		}
		if (arg2 + local36 > this.aClass102_Sub2_3.anInt639 * 725126603) {
			local36 -= local36 + arg2 - this.aClass102_Sub2_3.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_3.anInt637 * 531468375) {
			local71 = this.aClass102_Sub2_3.anInt637 * 531468375 - arg1;
			local30 -= local71;
			arg1 = this.aClass102_Sub2_3.anInt637 * 531468375;
			local56 += local71;
			local48 += local71;
			local54 += local71;
			local52 += local71;
		}
		if (arg1 + local30 > this.aClass102_Sub2_3.anInt634 * 469139509) {
			local71 = arg1 + local30 - this.aClass102_Sub2_3.anInt634 * 469139509;
			local30 -= local71;
			local54 += local71;
			local52 += local71;
		}
		if (local30 <= 0 || local36 <= 0) {
			return;
		}
		if (arg4) {
			this.method4567(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass15_8.method369(arg0, (short) -21199), arg5, arg6, arg7);
		} else {
			this.method4566(this.aByteArrayArray10[arg0], this.aClass102_Sub2_3.anIntArray50, this.anIntArray49, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass15_8.method369(arg0, (short) -19732), arg5, arg6, arg7);
		}
	}
}

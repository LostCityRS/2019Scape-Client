package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afy")
public final class Class104_Sub6 extends Class104 {

	@OriginalMember(owner = "client!afy", name = "w", descriptor = "Lclient!aff;")
	Class102_Sub2 aClass102_Sub2_7;

	@OriginalMember(owner = "client!afy", name = "r", descriptor = "[[B")
	byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!afy", name = "bed", descriptor = "(Lclient!yp;I)V")
	static void method7694(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
	}

	@OriginalMember(owner = "client!afy", name = "ayb", descriptor = "(Lclient!yp;I)V")
	static void method7695(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class606.anInt5394 * 1313178877;
	}

	@OriginalMember(owner = "client!afy", name = "e", descriptor = "(B)Lclient!cm;")
	public static Class99 method7696(@OriginalArg(0) byte arg0) {
		return Class622.aClass99_38;
	}

	@OriginalMember(owner = "client!afy", name = "aen", descriptor = "(Lclient!yp;I)V")
	static void method7697(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = Class54.method1096(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], -29238259);
	}

	@OriginalMember(owner = "client!afy", name = "<init>", descriptor = "(Lclient!aff;Lclient!aan;Lclient!afq;)V")
	Class104_Sub6(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class109_Sub1 arg2) {
		super(arg0, arg1);
		this.aClass102_Sub2_7 = arg0;
		@Pc(10) int[] local10 = arg2.method7117(false);
		this.aByteArrayArray12 = new byte[256][];
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(25) int local25 = this.aClass15_8.method369(local16, (short) -22707);
			@Pc(31) int local31 = this.aClass15_8.method371(local16, -1260118138);
			@Pc(37) short[] local37 = this.aClass15_8.method384(local16, -963119694);
			@Pc(41) short local41 = local37[0];
			@Pc(45) short local45 = local37[1];
			@Pc(50) byte[] local50 = new byte[local25 * local31];
			for (@Pc(52) int local52 = 0; local52 < local31; local52++) {
				for (@Pc(57) int local57 = 0; local57 < local25; local57++) {
					local50[local57 + local25 * local52] = (byte) (local10[this.aClass15_8.anInt49 * 592072939 * (local52 * this.aClass15_8.anInt50 * -2031443477 + local45) + local41 + this.aClass15_8.anInt50 * -2031443477 * local57] >> 24 & 0xFF);
				}
			}
			this.aByteArrayArray12[local16] = local50;
		}
	}

	@OriginalMember(owner = "client!afy", name = "<init>", descriptor = "(Lclient!aff;Lclient!aan;Lclient!afs;)V")
	Class104_Sub6(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class109_Sub2 arg2) {
		super(arg0, arg1);
		this.aClass102_Sub2_7 = arg0;
		this.aByteArrayArray12 = new byte[256][];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(21) int local21 = this.aClass15_8.method369(local12, (short) -12615);
			@Pc(27) int local27 = this.aClass15_8.method371(local12, 1948546987);
			@Pc(33) short[] local33 = this.aClass15_8.method384(local12, -993925493);
			@Pc(37) short local37 = local33[0];
			@Pc(41) short local41 = local33[1];
			@Pc(46) byte[] local46 = new byte[local21 * local27];
			@Pc(52) int local52;
			@Pc(57) int local57;
			if (arg2.aByteArray26 == null) {
				for (local52 = 0; local52 < local27; local52++) {
					for (local57 = 0; local57 < local21; local57++) {
						local46[local57 + local52 * local21] = (byte) (arg2.aByteArray25[(local41 + this.aClass15_8.anInt50 * -2031443477 * local52) * 592072939 * this.aClass15_8.anInt49 + local37 + local57 * -2031443477 * this.aClass15_8.anInt50] == 0 ? 0 : -1);
					}
				}
			} else {
				for (local52 = 0; local52 < local27; local52++) {
					for (local57 = 0; local57 < local21; local57++) {
						local46[local57 + local21 * local52] = arg2.aByteArray26[local57 * -2031443477 * this.aClass15_8.anInt50 + local37 + (local41 + local52 * this.aClass15_8.anInt50 * -2031443477) * this.aClass15_8.anInt49 * 592072939];
					}
				}
			}
			this.aByteArrayArray12[local12] = local46;
		}
	}

	@OriginalMember(owner = "client!afy", name = "q", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7644(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_7.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -270567241);
		@Pc(29) int local29 = this.aClass15_8.method369(arg0, (short) -25277);
		@Pc(35) int local35 = this.aClass15_8.method371(arg0, -412326971);
		@Pc(41) int local41 = this.aClass102_Sub2_7.anInt638 * 513500097;
		@Pc(47) int local47 = arg2 * local41 + arg1;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass102_Sub2_7.anInt645 * -1878420243) {
			local70 = this.aClass102_Sub2_7.anInt645 * -1878420243 - arg2;
			local35 -= local70;
			arg2 = this.aClass102_Sub2_7.anInt645 * -1878420243;
			local55 += local29 * local70;
			local47 += local70 * local41;
		}
		if (local35 + arg2 > this.aClass102_Sub2_7.anInt639 * 725126603) {
			local35 -= arg2 + local35 - this.aClass102_Sub2_7.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_7.anInt637 * 531468375) {
			local70 = this.aClass102_Sub2_7.anInt637 * 531468375 - arg1;
			local29 -= local70;
			arg1 = this.aClass102_Sub2_7.anInt637 * 531468375;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (arg1 + local29 > this.aClass102_Sub2_7.anInt634 * 469139509) {
			local70 = arg1 + local29 - this.aClass102_Sub2_7.anInt634 * 469139509;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 > 0 && local35 > 0) {
			this.method7690(this.aByteArrayArray12[arg0], this.aClass102_Sub2_7.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -7178), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afy", name = "r", descriptor = "(CIIIZ)V")
	@Override
	void method7643(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_7.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -472639452);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -24948);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, -1211020464);
		@Pc(30) int local30 = this.aClass102_Sub2_7.anInt638 * 513500097;
		@Pc(36) int local36 = arg1 + local30 * arg2;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_7.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_7.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_7.anInt645 * -1878420243;
			local44 += local18 * local59;
			local36 += local30 * local59;
		}
		if (arg2 + local24 > this.aClass102_Sub2_7.anInt639 * 725126603) {
			local24 -= arg2 + local24 - this.aClass102_Sub2_7.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_7.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_7.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_7.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_7.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_7.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 > 0 && local24 > 0) {
			this.method7689(this.aByteArrayArray12[arg0], this.aClass102_Sub2_7.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afy", name = "by", descriptor = "([B[IIIIIIII)V")
	void method7689(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(37) int local37 = (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local16 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
					local16 = 256 - local16;
					@Pc(45) int local45 = arg1[arg4];
					arg1[arg4++] = ((local16 * (local45 & 0xFF00FF) & 0xFF00FF00) + (local16 * (local45 & 0xFF00) & 0xFF0000) >> 8) + local37;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afy", name = "p", descriptor = "(CIIIZ)V")
	@Override
	void method7648(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_7.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1099491004);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -14983);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, -205723804);
		@Pc(30) int local30 = this.aClass102_Sub2_7.anInt638 * 513500097;
		@Pc(36) int local36 = arg1 + local30 * arg2;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_7.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_7.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_7.anInt645 * -1878420243;
			local44 += local18 * local59;
			local36 += local30 * local59;
		}
		if (arg2 + local24 > this.aClass102_Sub2_7.anInt639 * 725126603) {
			local24 -= arg2 + local24 - this.aClass102_Sub2_7.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_7.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_7.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_7.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_7.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_7.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 > 0 && local24 > 0) {
			this.method7689(this.aByteArrayArray12[arg0], this.aClass102_Sub2_7.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afy", name = "bk", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method7690(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg9 - this.aClass102_Sub2_7.anInt637 * 531468375;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass102_Sub2_7.anInt638 * 513500097 * (arg14 - arg10);
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = local5[local62 - arg14] + arg13;
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				local79 -= local88;
			} else {
				local88 = local73 - local16;
				if (local88 >= arg5) {
					arg3 += arg8 + arg5;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(185) int local185 = (local165 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local165 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
					local165 = 256 - local165;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = local185 + ((local165 * (local193 & 0xFF00FF) & 0xFF00FF00) + ((local193 & 0xFF00) * local165 & 0xFF0000) >> 8);
				}
			}
			arg3 += arg8 + local88;
			arg4 += arg7 + local88;
		}
	}

	@OriginalMember(owner = "client!afy", name = "d", descriptor = "(CIIIZ)V")
	@Override
	void method7646(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_7.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -773343715);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -24100);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, 2014369514);
		@Pc(30) int local30 = this.aClass102_Sub2_7.anInt638 * 513500097;
		@Pc(36) int local36 = arg1 + local30 * arg2;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_7.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_7.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_7.anInt645 * -1878420243;
			local44 += local18 * local59;
			local36 += local30 * local59;
		}
		if (arg2 + local24 > this.aClass102_Sub2_7.anInt639 * 725126603) {
			local24 -= arg2 + local24 - this.aClass102_Sub2_7.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_7.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_7.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_7.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_7.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_7.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 > 0 && local24 > 0) {
			this.method7689(this.aByteArrayArray12[arg0], this.aClass102_Sub2_7.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afy", name = "z", descriptor = "(CIIIZ)V")
	@Override
	void method7647(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_7.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, 297861523);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -21660);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, 552950909);
		@Pc(30) int local30 = this.aClass102_Sub2_7.anInt638 * 513500097;
		@Pc(36) int local36 = arg1 + local30 * arg2;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_7.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_7.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_7.anInt645 * -1878420243;
			local44 += local18 * local59;
			local36 += local30 * local59;
		}
		if (arg2 + local24 > this.aClass102_Sub2_7.anInt639 * 725126603) {
			local24 -= arg2 + local24 - this.aClass102_Sub2_7.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_7.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_7.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_7.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_7.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_7.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 > 0 && local24 > 0) {
			this.method7689(this.aByteArrayArray12[arg0], this.aClass102_Sub2_7.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afy", name = "bh", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method7691(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg9 - this.aClass102_Sub2_7.anInt637 * 531468375;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass102_Sub2_7.anInt638 * 513500097 * (arg14 - arg10);
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = local5[local62 - arg14] + arg13;
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				local79 -= local88;
			} else {
				local88 = local73 - local16;
				if (local88 >= arg5) {
					arg3 += arg8 + arg5;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(185) int local185 = (local165 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local165 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
					local165 = 256 - local165;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = local185 + ((local165 * (local193 & 0xFF00FF) & 0xFF00FF00) + ((local193 & 0xFF00) * local165 & 0xFF0000) >> 8);
				}
			}
			arg3 += arg8 + local88;
			arg4 += arg7 + local88;
		}
	}

	@OriginalMember(owner = "client!afy", name = "v", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7649(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_7.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1574222049);
		@Pc(29) int local29 = this.aClass15_8.method369(arg0, (short) -17527);
		@Pc(35) int local35 = this.aClass15_8.method371(arg0, -334887778);
		@Pc(41) int local41 = this.aClass102_Sub2_7.anInt638 * 513500097;
		@Pc(47) int local47 = arg2 * local41 + arg1;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass102_Sub2_7.anInt645 * -1878420243) {
			local70 = this.aClass102_Sub2_7.anInt645 * -1878420243 - arg2;
			local35 -= local70;
			arg2 = this.aClass102_Sub2_7.anInt645 * -1878420243;
			local55 += local29 * local70;
			local47 += local70 * local41;
		}
		if (local35 + arg2 > this.aClass102_Sub2_7.anInt639 * 725126603) {
			local35 -= arg2 + local35 - this.aClass102_Sub2_7.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_7.anInt637 * 531468375) {
			local70 = this.aClass102_Sub2_7.anInt637 * 531468375 - arg1;
			local29 -= local70;
			arg1 = this.aClass102_Sub2_7.anInt637 * 531468375;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (arg1 + local29 > this.aClass102_Sub2_7.anInt634 * 469139509) {
			local70 = arg1 + local29 - this.aClass102_Sub2_7.anInt634 * 469139509;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 > 0 && local35 > 0) {
			this.method7690(this.aByteArrayArray12[arg0], this.aClass102_Sub2_7.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -16947), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afy", name = "h", descriptor = "(CIIIZ)V")
	@Override
	void method7645(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_7.anIntArray50 == null) {
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1246083606);
		@Pc(18) int local18 = this.aClass15_8.method369(arg0, (short) -27307);
		@Pc(24) int local24 = this.aClass15_8.method371(arg0, 1949266029);
		@Pc(30) int local30 = this.aClass102_Sub2_7.anInt638 * 513500097;
		@Pc(36) int local36 = arg1 + local30 * arg2;
		@Pc(40) int local40 = local30 - local18;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(59) int local59;
		if (arg2 < this.aClass102_Sub2_7.anInt645 * -1878420243) {
			local59 = this.aClass102_Sub2_7.anInt645 * -1878420243 - arg2;
			local24 -= local59;
			arg2 = this.aClass102_Sub2_7.anInt645 * -1878420243;
			local44 += local18 * local59;
			local36 += local30 * local59;
		}
		if (arg2 + local24 > this.aClass102_Sub2_7.anInt639 * 725126603) {
			local24 -= arg2 + local24 - this.aClass102_Sub2_7.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_7.anInt637 * 531468375) {
			local59 = this.aClass102_Sub2_7.anInt637 * 531468375 - arg1;
			local18 -= local59;
			arg1 = this.aClass102_Sub2_7.anInt637 * 531468375;
			local44 += local59;
			local36 += local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 + arg1 > this.aClass102_Sub2_7.anInt634 * 469139509) {
			local59 = arg1 + local18 - this.aClass102_Sub2_7.anInt634 * 469139509;
			local18 -= local59;
			local42 += local59;
			local40 += local59;
		}
		if (local18 > 0 && local24 > 0) {
			this.method7689(this.aByteArrayArray12[arg0], this.aClass102_Sub2_7.anIntArray50, arg3, local44, local36, local18, local24, local40, local42);
		}
	}

	@OriginalMember(owner = "client!afy", name = "n", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7651(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_7.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -574980451);
		@Pc(29) int local29 = this.aClass15_8.method369(arg0, (short) -4758);
		@Pc(35) int local35 = this.aClass15_8.method371(arg0, 1505232736);
		@Pc(41) int local41 = this.aClass102_Sub2_7.anInt638 * 513500097;
		@Pc(47) int local47 = arg2 * local41 + arg1;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass102_Sub2_7.anInt645 * -1878420243) {
			local70 = this.aClass102_Sub2_7.anInt645 * -1878420243 - arg2;
			local35 -= local70;
			arg2 = this.aClass102_Sub2_7.anInt645 * -1878420243;
			local55 += local29 * local70;
			local47 += local70 * local41;
		}
		if (local35 + arg2 > this.aClass102_Sub2_7.anInt639 * 725126603) {
			local35 -= arg2 + local35 - this.aClass102_Sub2_7.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_7.anInt637 * 531468375) {
			local70 = this.aClass102_Sub2_7.anInt637 * 531468375 - arg1;
			local29 -= local70;
			arg1 = this.aClass102_Sub2_7.anInt637 * 531468375;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (arg1 + local29 > this.aClass102_Sub2_7.anInt634 * 469139509) {
			local70 = arg1 + local29 - this.aClass102_Sub2_7.anInt634 * 469139509;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 > 0 && local35 > 0) {
			this.method7690(this.aByteArrayArray12[arg0], this.aClass102_Sub2_7.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -1925), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afy", name = "bz", descriptor = "([B[IIIIIIII)V")
	void method7692(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(37) int local37 = (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local16 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
					local16 = 256 - local16;
					@Pc(45) int local45 = arg1[arg4];
					arg1[arg4++] = ((local16 * (local45 & 0xFF00FF) & 0xFF00FF00) + (local16 * (local45 & 0xFF00) & 0xFF0000) >> 8) + local37;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afy", name = "be", descriptor = "([B[IIIIIIIIIIILclient!cg;II)V")
	void method7693(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class98_Sub2 local2 = (Class98_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray40;
		@Pc(8) int[] local8 = local2.anIntArray39;
		@Pc(16) int local16 = arg9 - this.aClass102_Sub2_7.anInt637 * 531468375;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass102_Sub2_7.anInt638 * 513500097 * (arg14 - arg10);
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = local5[local62 - arg14] + arg13;
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				local79 -= local88;
			} else {
				local88 = local73 - local16;
				if (local88 >= arg5) {
					arg3 += arg8 + arg5;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(185) int local185 = (local165 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local165 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
					local165 = 256 - local165;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = local185 + ((local165 * (local193 & 0xFF00FF) & 0xFF00FF00) + ((local193 & 0xFF00) * local165 & 0xFF0000) >> 8);
				}
			}
			arg3 += arg8 + local88;
			arg4 += arg7 + local88;
		}
	}

	@OriginalMember(owner = "client!afy", name = "y", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7650(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_7.anIntArray50 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7643(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass15_8.method401(arg0, -1719325255);
		@Pc(29) int local29 = this.aClass15_8.method369(arg0, (short) -15562);
		@Pc(35) int local35 = this.aClass15_8.method371(arg0, 1364567420);
		@Pc(41) int local41 = this.aClass102_Sub2_7.anInt638 * 513500097;
		@Pc(47) int local47 = arg2 * local41 + arg1;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass102_Sub2_7.anInt645 * -1878420243) {
			local70 = this.aClass102_Sub2_7.anInt645 * -1878420243 - arg2;
			local35 -= local70;
			arg2 = this.aClass102_Sub2_7.anInt645 * -1878420243;
			local55 += local29 * local70;
			local47 += local70 * local41;
		}
		if (local35 + arg2 > this.aClass102_Sub2_7.anInt639 * 725126603) {
			local35 -= arg2 + local35 - this.aClass102_Sub2_7.anInt639 * 725126603;
		}
		if (arg1 < this.aClass102_Sub2_7.anInt637 * 531468375) {
			local70 = this.aClass102_Sub2_7.anInt637 * 531468375 - arg1;
			local29 -= local70;
			arg1 = this.aClass102_Sub2_7.anInt637 * 531468375;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (arg1 + local29 > this.aClass102_Sub2_7.anInt634 * 469139509) {
			local70 = arg1 + local29 - this.aClass102_Sub2_7.anInt634 * 469139509;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 > 0 && local35 > 0) {
			this.method7690(this.aByteArrayArray12[arg0], this.aClass102_Sub2_7.anIntArray50, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass15_8.method369(arg0, (short) -27348), arg5, arg6, arg7);
		}
	}
}

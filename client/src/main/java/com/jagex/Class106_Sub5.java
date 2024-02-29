package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afw")
public class Class106_Sub5 extends Class106 {

	@OriginalMember(owner = "client!afw", name = "o", descriptor = "Lclient!afg;")
	Class104_Sub3 aClass104_Sub3_7;

	@OriginalMember(owner = "client!afw", name = "s", descriptor = "[[B")
	byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!afw", name = "<init>", descriptor = "(Lclient!afg;Lclient!aac;Lclient!afr;)V", line = 13)
	Class106_Sub5(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class105_Sub2 arg2) {
		super(arg0, arg1);
		this.aClass104_Sub3_7 = arg0;
		this.aByteArrayArray12 = new byte[256][];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(21) int local21 = this.aClass5_10.method45(local12, (byte) 25);
			@Pc(27) int local27 = this.aClass5_10.method46(local12, 1415476369);
			@Pc(33) short[] local33 = this.aClass5_10.method52(local12, 1627310332);
			@Pc(37) short local37 = local33[0];
			@Pc(41) short local41 = local33[1];
			@Pc(46) byte[] local46 = new byte[local21 * local27];
			@Pc(52) int local52;
			@Pc(57) int local57;
			if (arg2.aByteArray26 == null) {
				for (local52 = 0; local52 < local27; local52++) {
					for (local57 = 0; local57 < local21; local57++) {
						local46[local52 * local21 + local57] = (byte) (arg2.aByteArray25[local37 + this.aClass5_10.anInt12 * -2141347013 * (local41 + this.aClass5_10.anInt11 * 286794121 * local52) + local57 * this.aClass5_10.anInt11 * 286794121] == 0 ? 0 : -1);
					}
				}
			} else {
				for (local52 = 0; local52 < local27; local52++) {
					for (local57 = 0; local57 < local21; local57++) {
						local46[local52 * local21 + local57] = arg2.aByteArray26[this.aClass5_10.anInt11 * 286794121 * local57 + (local41 + this.aClass5_10.anInt11 * 286794121 * local52) * this.aClass5_10.anInt12 * -2141347013 + local37];
					}
				}
			}
			this.aByteArrayArray12[local12] = local46;
		}
	}

	@OriginalMember(owner = "client!afw", name = "<init>", descriptor = "(Lclient!afg;Lclient!aac;Lclient!afb;)V", line = 43)
	Class106_Sub5(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class105_Sub1 arg2) {
		super(arg0, arg1);
		this.aClass104_Sub3_7 = arg0;
		@Pc(10) int[] local10 = arg2.method7171(false);
		this.aByteArrayArray12 = new byte[256][];
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(25) int local25 = this.aClass5_10.method45(local16, (byte) 8);
			@Pc(31) int local31 = this.aClass5_10.method46(local16, 1415476369);
			@Pc(37) short[] local37 = this.aClass5_10.method52(local16, 844366736);
			@Pc(41) short local41 = local37[0];
			@Pc(45) short local45 = local37[1];
			@Pc(50) byte[] local50 = new byte[local31 * local25];
			for (@Pc(52) int local52 = 0; local52 < local31; local52++) {
				for (@Pc(57) int local57 = 0; local57 < local25; local57++) {
					local50[local57 + local25 * local52] = (byte) (local10[local57 * this.aClass5_10.anInt11 * 286794121 + local41 + this.aClass5_10.anInt12 * -2141347013 * (this.aClass5_10.anInt11 * 286794121 * local52 + local45)] >> 24 & 0xFF);
				}
			}
			this.aByteArrayArray12[local16] = local50;
		}
	}

	@OriginalMember(owner = "client!afw", name = "s", descriptor = "(CIIIZ)V", line = 64)
	@Override
	void method7576(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_7.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -52);
		@Pc(19) int local19 = this.aClass5_10.method45(arg0, (byte) -57);
		@Pc(25) int local25 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_7.anInt719 * 1808307287;
		@Pc(37) int local37 = local31 * arg2 + arg1;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_7.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_7.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_7.anInt723 * 1059403033;
			local45 += local60 * local19;
			local37 += local31 * local60;
		}
		if (arg2 + local25 > this.aClass104_Sub3_7.anInt724 * 1200487767) {
			local25 -= arg2 + local25 - this.aClass104_Sub3_7.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_7.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_7.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_7.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (arg1 + local19 > this.aClass104_Sub3_7.anInt732 * -1762676505) {
			local60 = arg1 + local19 - this.aClass104_Sub3_7.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 > 0 && local25 > 0) {
			this.method7514(this.aByteArrayArray12[arg0], this.aClass104_Sub3_7.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afw", name = "q", descriptor = "(CIIIZ)V", line = 64)
	@Override
	void method7578(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_7.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -9);
		@Pc(19) int local19 = this.aClass5_10.method45(arg0, (byte) 71);
		@Pc(25) int local25 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_7.anInt719 * 1808307287;
		@Pc(37) int local37 = local31 * arg2 + arg1;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_7.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_7.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_7.anInt723 * 1059403033;
			local45 += local60 * local19;
			local37 += local31 * local60;
		}
		if (arg2 + local25 > this.aClass104_Sub3_7.anInt724 * 1200487767) {
			local25 -= arg2 + local25 - this.aClass104_Sub3_7.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_7.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_7.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_7.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (arg1 + local19 > this.aClass104_Sub3_7.anInt732 * -1762676505) {
			local60 = arg1 + local19 - this.aClass104_Sub3_7.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 > 0 && local25 > 0) {
			this.method7514(this.aByteArrayArray12[arg0], this.aClass104_Sub3_7.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afw", name = "b", descriptor = "(CIIIZ)V", line = 64)
	@Override
	void method7582(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_7.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -85);
		@Pc(19) int local19 = this.aClass5_10.method45(arg0, (byte) -17);
		@Pc(25) int local25 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_7.anInt719 * 1808307287;
		@Pc(37) int local37 = local31 * arg2 + arg1;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_7.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_7.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_7.anInt723 * 1059403033;
			local45 += local60 * local19;
			local37 += local31 * local60;
		}
		if (arg2 + local25 > this.aClass104_Sub3_7.anInt724 * 1200487767) {
			local25 -= arg2 + local25 - this.aClass104_Sub3_7.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_7.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_7.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_7.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (arg1 + local19 > this.aClass104_Sub3_7.anInt732 * -1762676505) {
			local60 = arg1 + local19 - this.aClass104_Sub3_7.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 > 0 && local25 > 0) {
			this.method7514(this.aByteArrayArray12[arg0], this.aClass104_Sub3_7.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afw", name = "x", descriptor = "(CIIIZ)V", line = 64)
	@Override
	void method7575(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_7.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -76);
		@Pc(19) int local19 = this.aClass5_10.method45(arg0, (byte) -33);
		@Pc(25) int local25 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_7.anInt719 * 1808307287;
		@Pc(37) int local37 = local31 * arg2 + arg1;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_7.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_7.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_7.anInt723 * 1059403033;
			local45 += local60 * local19;
			local37 += local31 * local60;
		}
		if (arg2 + local25 > this.aClass104_Sub3_7.anInt724 * 1200487767) {
			local25 -= arg2 + local25 - this.aClass104_Sub3_7.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_7.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_7.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_7.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (arg1 + local19 > this.aClass104_Sub3_7.anInt732 * -1762676505) {
			local60 = arg1 + local19 - this.aClass104_Sub3_7.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 > 0 && local25 > 0) {
			this.method7514(this.aByteArrayArray12[arg0], this.aClass104_Sub3_7.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afw", name = "h", descriptor = "(CIIIZ)V", line = 64)
	@Override
	void method7579(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_7.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -35);
		@Pc(19) int local19 = this.aClass5_10.method45(arg0, (byte) 74);
		@Pc(25) int local25 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_7.anInt719 * 1808307287;
		@Pc(37) int local37 = local31 * arg2 + arg1;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_7.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_7.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_7.anInt723 * 1059403033;
			local45 += local60 * local19;
			local37 += local31 * local60;
		}
		if (arg2 + local25 > this.aClass104_Sub3_7.anInt724 * 1200487767) {
			local25 -= arg2 + local25 - this.aClass104_Sub3_7.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_7.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_7.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_7.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (arg1 + local19 > this.aClass104_Sub3_7.anInt732 * -1762676505) {
			local60 = arg1 + local19 - this.aClass104_Sub3_7.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 > 0 && local25 > 0) {
			this.method7514(this.aByteArrayArray12[arg0], this.aClass104_Sub3_7.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afw", name = "bl", descriptor = "([B[IIIIIIII)V", line = 101)
	void method7514(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(36) int local36 = (local16 * (arg2 & 0xFF00) & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local16 = 256 - local16;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = local36 + ((local16 * (local44 & 0xFF00) & 0xFF0000) + (local16 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afw", name = "bh", descriptor = "([B[IIIIIIII)V", line = 101)
	void method7515(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(36) int local36 = (local16 * (arg2 & 0xFF00) & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local16 = 256 - local16;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = local36 + ((local16 * (local44 & 0xFF00) & 0xFF0000) + (local16 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afw", name = "bx", descriptor = "([B[IIIIIIII)V", line = 101)
	void method7516(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(36) int local36 = (local16 * (arg2 & 0xFF00) & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local16 = 256 - local16;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = local36 + ((local16 * (local44 & 0xFF00) & 0xFF0000) + (local16 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afw", name = "bd", descriptor = "([B[IIIIIIII)V", line = 101)
	void method7517(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(36) int local36 = (local16 * (arg2 & 0xFF00) & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local16 = 256 - local16;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = local36 + ((local16 * (local44 & 0xFF00) & 0xFF0000) + (local16 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afw", name = "a", descriptor = "(CIIIZLclient!ch;II)V", line = 118)
	@Override
	void method7580(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_7.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7576(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -82);
		@Pc(29) int local29 = this.aClass5_10.method45(arg0, (byte) 19);
		@Pc(35) int local35 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(41) int local41 = this.aClass104_Sub3_7.anInt719 * 1808307287;
		@Pc(47) int local47 = arg1 + local41 * arg2;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass104_Sub3_7.anInt723 * 1059403033) {
			local70 = this.aClass104_Sub3_7.anInt723 * 1059403033 - arg2;
			local35 -= local70;
			arg2 = this.aClass104_Sub3_7.anInt723 * 1059403033;
			local55 += local70 * local29;
			local47 += local41 * local70;
		}
		if (arg2 + local35 > this.aClass104_Sub3_7.anInt724 * 1200487767) {
			local35 -= arg2 + local35 - this.aClass104_Sub3_7.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_7.anInt734 * -491763783) {
			local70 = this.aClass104_Sub3_7.anInt734 * -491763783 - arg1;
			local29 -= local70;
			arg1 = this.aClass104_Sub3_7.anInt734 * -491763783;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 + arg1 > this.aClass104_Sub3_7.anInt732 * -1762676505) {
			local70 = arg1 + local29 - this.aClass104_Sub3_7.anInt732 * -1762676505;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 > 0 && local35 > 0) {
			this.method7518(this.aByteArrayArray12[arg0], this.aClass104_Sub3_7.anIntArray46, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass5_10.method45(arg0, (byte) 95), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afw", name = "y", descriptor = "(CIIIZLclient!ch;II)V", line = 118)
	@Override
	void method7577(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_7.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7576(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -46);
		@Pc(29) int local29 = this.aClass5_10.method45(arg0, (byte) -17);
		@Pc(35) int local35 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(41) int local41 = this.aClass104_Sub3_7.anInt719 * 1808307287;
		@Pc(47) int local47 = arg1 + local41 * arg2;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass104_Sub3_7.anInt723 * 1059403033) {
			local70 = this.aClass104_Sub3_7.anInt723 * 1059403033 - arg2;
			local35 -= local70;
			arg2 = this.aClass104_Sub3_7.anInt723 * 1059403033;
			local55 += local70 * local29;
			local47 += local41 * local70;
		}
		if (arg2 + local35 > this.aClass104_Sub3_7.anInt724 * 1200487767) {
			local35 -= arg2 + local35 - this.aClass104_Sub3_7.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_7.anInt734 * -491763783) {
			local70 = this.aClass104_Sub3_7.anInt734 * -491763783 - arg1;
			local29 -= local70;
			arg1 = this.aClass104_Sub3_7.anInt734 * -491763783;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 + arg1 > this.aClass104_Sub3_7.anInt732 * -1762676505) {
			local70 = arg1 + local29 - this.aClass104_Sub3_7.anInt732 * -1762676505;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 > 0 && local35 > 0) {
			this.method7518(this.aByteArrayArray12[arg0], this.aClass104_Sub3_7.anIntArray46, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass5_10.method45(arg0, (byte) -19), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afw", name = "g", descriptor = "(CIIIZLclient!ch;II)V", line = 118)
	@Override
	void method7581(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_7.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7576(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -107);
		@Pc(29) int local29 = this.aClass5_10.method45(arg0, (byte) 42);
		@Pc(35) int local35 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(41) int local41 = this.aClass104_Sub3_7.anInt719 * 1808307287;
		@Pc(47) int local47 = arg1 + local41 * arg2;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass104_Sub3_7.anInt723 * 1059403033) {
			local70 = this.aClass104_Sub3_7.anInt723 * 1059403033 - arg2;
			local35 -= local70;
			arg2 = this.aClass104_Sub3_7.anInt723 * 1059403033;
			local55 += local70 * local29;
			local47 += local41 * local70;
		}
		if (arg2 + local35 > this.aClass104_Sub3_7.anInt724 * 1200487767) {
			local35 -= arg2 + local35 - this.aClass104_Sub3_7.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_7.anInt734 * -491763783) {
			local70 = this.aClass104_Sub3_7.anInt734 * -491763783 - arg1;
			local29 -= local70;
			arg1 = this.aClass104_Sub3_7.anInt734 * -491763783;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 + arg1 > this.aClass104_Sub3_7.anInt732 * -1762676505) {
			local70 = arg1 + local29 - this.aClass104_Sub3_7.anInt732 * -1762676505;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 > 0 && local35 > 0) {
			this.method7518(this.aByteArrayArray12[arg0], this.aClass104_Sub3_7.anIntArray46, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass5_10.method45(arg0, (byte) -102), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afw", name = "i", descriptor = "(CIIIZLclient!ch;II)V", line = 118)
	@Override
	void method7583(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_7.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7576(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -51);
		@Pc(29) int local29 = this.aClass5_10.method45(arg0, (byte) 30);
		@Pc(35) int local35 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(41) int local41 = this.aClass104_Sub3_7.anInt719 * 1808307287;
		@Pc(47) int local47 = arg1 + local41 * arg2;
		@Pc(51) int local51 = local41 - local29;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(70) int local70;
		if (arg2 < this.aClass104_Sub3_7.anInt723 * 1059403033) {
			local70 = this.aClass104_Sub3_7.anInt723 * 1059403033 - arg2;
			local35 -= local70;
			arg2 = this.aClass104_Sub3_7.anInt723 * 1059403033;
			local55 += local70 * local29;
			local47 += local41 * local70;
		}
		if (arg2 + local35 > this.aClass104_Sub3_7.anInt724 * 1200487767) {
			local35 -= arg2 + local35 - this.aClass104_Sub3_7.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_7.anInt734 * -491763783) {
			local70 = this.aClass104_Sub3_7.anInt734 * -491763783 - arg1;
			local29 -= local70;
			arg1 = this.aClass104_Sub3_7.anInt734 * -491763783;
			local55 += local70;
			local47 += local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 + arg1 > this.aClass104_Sub3_7.anInt732 * -1762676505) {
			local70 = arg1 + local29 - this.aClass104_Sub3_7.anInt732 * -1762676505;
			local29 -= local70;
			local53 += local70;
			local51 += local70;
		}
		if (local29 > 0 && local35 > 0) {
			this.method7518(this.aByteArrayArray12[arg0], this.aClass104_Sub3_7.anIntArray46, arg3, local55, local47, local29, local35, local51, local53, arg1, arg2, this.aClass5_10.method45(arg0, (byte) 61), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afw", name = "bk", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 159)
	void method7518(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg9 - this.aClass104_Sub3_7.anInt734 * -491763783;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 1808307287 * this.aClass104_Sub3_7.anInt719;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? arg14 + local5.length : arg6 + arg10;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(186) int local186 = ((arg2 & 0xFF00FF) * local165 & 0xFF00FF00) + ((arg2 & 0xFF00) * local165 & 0xFF0000) >> 8;
					local165 = 256 - local165;
					@Pc(194) int local194 = arg1[arg4];
					arg1[arg4++] = local186 + ((local165 * (local194 & 0xFF00) & 0xFF0000) + ((local194 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8);
				}
			}
			arg3 += local88 + arg8;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!afw", name = "bi", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 159)
	void method7519(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg9 - this.aClass104_Sub3_7.anInt734 * -491763783;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 1808307287 * this.aClass104_Sub3_7.anInt719;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? arg14 + local5.length : arg6 + arg10;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(186) int local186 = ((arg2 & 0xFF00FF) * local165 & 0xFF00FF00) + ((arg2 & 0xFF00) * local165 & 0xFF0000) >> 8;
					local165 = 256 - local165;
					@Pc(194) int local194 = arg1[arg4];
					arg1[arg4++] = local186 + ((local165 * (local194 & 0xFF00) & 0xFF0000) + ((local194 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8);
				}
			}
			arg3 += local88 + arg8;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!afw", name = "bc", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 159)
	void method7520(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg9 - this.aClass104_Sub3_7.anInt734 * -491763783;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 1808307287 * this.aClass104_Sub3_7.anInt719;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? arg14 + local5.length : arg6 + arg10;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(186) int local186 = ((arg2 & 0xFF00FF) * local165 & 0xFF00FF00) + ((arg2 & 0xFF00) * local165 & 0xFF0000) >> 8;
					local165 = 256 - local165;
					@Pc(194) int local194 = arg1[arg4];
					arg1[arg4++] = local186 + ((local165 * (local194 & 0xFF00) & 0xFF0000) + ((local194 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8);
				}
			}
			arg3 += local88 + arg8;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!afw", name = "bn", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 159)
	void method7521(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg9 - this.aClass104_Sub3_7.anInt734 * -491763783;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 1808307287 * this.aClass104_Sub3_7.anInt719;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? arg14 + local5.length : arg6 + arg10;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(186) int local186 = ((arg2 & 0xFF00FF) * local165 & 0xFF00FF00) + ((arg2 & 0xFF00) * local165 & 0xFF0000) >> 8;
					local165 = 256 - local165;
					@Pc(194) int local194 = arg1[arg4];
					arg1[arg4++] = local186 + ((local165 * (local194 & 0xFF00) & 0xFF0000) + ((local194 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8);
				}
			}
			arg3 += local88 + arg8;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!afw", name = "bt", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 159)
	void method7522(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg9 - this.aClass104_Sub3_7.anInt734 * -491763783;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 1808307287 * this.aClass104_Sub3_7.anInt719;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? arg14 + local5.length : arg6 + arg10;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(186) int local186 = ((arg2 & 0xFF00FF) * local165 & 0xFF00FF00) + ((arg2 & 0xFF00) * local165 & 0xFF0000) >> 8;
					local165 = 256 - local165;
					@Pc(194) int local194 = arg1[arg4];
					arg1[arg4++] = local186 + ((local165 * (local194 & 0xFF00) & 0xFF0000) + ((local194 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8);
				}
			}
			arg3 += local88 + arg8;
			arg4 += local88 + arg7;
		}
	}
}

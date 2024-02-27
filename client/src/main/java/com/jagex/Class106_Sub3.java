package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afl")
public final class Class106_Sub3 extends Class106 {

	@OriginalMember(owner = "client!afl", name = "o", descriptor = "Lclient!afg;")
	Class104_Sub3 aClass104_Sub3_6;

	@OriginalMember(owner = "client!afl", name = "s", descriptor = "[[B")
	byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!afl", name = "<init>", descriptor = "(Lclient!afg;Lclient!aac;Lclient!afb;)V")
	Class106_Sub3(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class105_Sub1 arg2) {
		super(arg0, arg1);
		this.aClass104_Sub3_6 = arg0;
		@Pc(10) int[] local10 = arg2.method7171(false);
		this.aByteArrayArray11 = new byte[256][];
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(25) int local25 = this.aClass5_10.method62(local16, (byte) 26);
			@Pc(31) int local31 = this.aClass5_10.method33(local16, 1415476369);
			@Pc(37) short[] local37 = this.aClass5_10.method65(local16, 1539999402);
			@Pc(41) short local41 = local37[0];
			@Pc(45) short local45 = local37[1];
			@Pc(50) byte[] local50 = new byte[local25 * local31];
			for (@Pc(52) int local52 = 0; local52 < local31; local52++) {
				for (@Pc(57) int local57 = 0; local57 < local25; local57++) {
					@Pc(88) int local88 = local10[local57 * this.aClass5_10.anInt11 * 286794121 + (local52 * 286794121 * this.aClass5_10.anInt11 + local45) * -2141347013 * this.aClass5_10.anInt12 + local41];
					@Pc(111) byte local111 = (byte) ((local88 >> 8 & 0xFF) * 4 + (local88 >> 16 & 0xFF) * 3 + (local88 & 0xFF) >> 3);
					local50[local57 + local52 * local25] = local111;
				}
			}
			this.aByteArrayArray11[local16] = local50;
		}
	}

	@OriginalMember(owner = "client!afl", name = "<init>", descriptor = "(Lclient!afg;Lclient!aac;Lclient!afr;)V")
	Class106_Sub3(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class105_Sub2 arg2) {
		super(arg0, arg1);
		this.aClass104_Sub3_6 = arg0;
		this.aByteArrayArray11 = new byte[256][];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(21) int local21 = this.aClass5_10.method62(local12, (byte) 31);
			@Pc(27) int local27 = this.aClass5_10.method33(local12, 1415476369);
			@Pc(33) short[] local33 = this.aClass5_10.method65(local12, 1956415637);
			@Pc(37) short local37 = local33[0];
			@Pc(41) short local41 = local33[1];
			@Pc(46) byte[] local46 = new byte[local21 * local27];
			for (@Pc(48) int local48 = 0; local48 < local27; local48++) {
				for (@Pc(53) int local53 = 0; local53 < local21; local53++) {
					local46[local53 + local21 * local48] = arg2.aByteArray25[local53 * this.aClass5_10.anInt11 * 286794121 + (local48 * this.aClass5_10.anInt11 * 286794121 + local41) * -2141347013 * this.aClass5_10.anInt12 + local37];
				}
			}
			this.aByteArrayArray11[local12] = local46;
		}
	}

	@OriginalMember(owner = "client!afl", name = "bu", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V")
	void method6689(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += (arg14 - arg10) * this.aClass104_Sub3_6.anInt719 * 1808307287;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(52) int local52 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
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

	@OriginalMember(owner = "client!afl", name = "g", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7546(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_6.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7533(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method64(arg0, (byte) -53);
		@Pc(30) int local30 = this.aClass5_10.method62(arg0, (byte) -5);
		@Pc(36) int local36 = this.aClass5_10.method33(arg0, 1415476369);
		@Pc(42) int local42 = this.aClass104_Sub3_6.anInt719 * 1808307287;
		@Pc(48) int local48 = arg2 * local42 + arg1;
		@Pc(52) int local52 = local42 - local30;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(71) int local71;
		if (arg2 < this.aClass104_Sub3_6.anInt723 * 1059403033) {
			local71 = this.aClass104_Sub3_6.anInt723 * 1059403033 - arg2;
			local36 -= local71;
			arg2 = this.aClass104_Sub3_6.anInt723 * 1059403033;
			local56 += local71 * local30;
			local48 += local42 * local71;
		}
		if (arg2 + local36 > this.aClass104_Sub3_6.anInt724 * 1200487767) {
			local36 -= arg2 + local36 - this.aClass104_Sub3_6.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_6.anInt734 * -491763783) {
			local71 = this.aClass104_Sub3_6.anInt734 * -491763783 - arg1;
			local30 -= local71;
			arg1 = this.aClass104_Sub3_6.anInt734 * -491763783;
			local56 += local71;
			local48 += local71;
			local54 += local71;
			local52 += local71;
		}
		if (arg1 + local30 > this.aClass104_Sub3_6.anInt732 * -1762676505) {
			local71 = arg1 + local30 - this.aClass104_Sub3_6.anInt732 * -1762676505;
			local30 -= local71;
			local54 += local71;
			local52 += local71;
		}
		if (local30 <= 0 || local36 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6692(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass5_10.method62(arg0, (byte) 35), arg5, arg6, arg7);
		} else {
			this.method6693(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass5_10.method62(arg0, (byte) -6), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afl", name = "s", descriptor = "(CIIIZ)V")
	@Override
	void method7533(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_6.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method64(arg0, (byte) -40);
		@Pc(19) int local19 = this.aClass5_10.method62(arg0, (byte) -101);
		@Pc(25) int local25 = this.aClass5_10.method33(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_6.anInt719 * 1808307287;
		@Pc(37) int local37 = arg1 + local31 * arg2;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_6.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_6.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_6.anInt723 * 1059403033;
			local45 += local19 * local60;
			local37 += local60 * local31;
		}
		if (local25 + arg2 > this.aClass104_Sub3_6.anInt724 * 1200487767) {
			local25 -= local25 + arg2 - this.aClass104_Sub3_6.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_6.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_6.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_6.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 + arg1 > this.aClass104_Sub3_6.anInt732 * -1762676505) {
			local60 = local19 + arg1 - this.aClass104_Sub3_6.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 <= 0 || local25 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6690(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method6696(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afl", name = "bl", descriptor = "([B[IIIIIIII)V")
	void method6690(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afl", name = "bc", descriptor = "([B[IIIIIIII)V")
	void method6691(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afl", name = "y", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7540(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_6.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7533(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method64(arg0, (byte) -103);
		@Pc(30) int local30 = this.aClass5_10.method62(arg0, (byte) 27);
		@Pc(36) int local36 = this.aClass5_10.method33(arg0, 1415476369);
		@Pc(42) int local42 = this.aClass104_Sub3_6.anInt719 * 1808307287;
		@Pc(48) int local48 = arg2 * local42 + arg1;
		@Pc(52) int local52 = local42 - local30;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(71) int local71;
		if (arg2 < this.aClass104_Sub3_6.anInt723 * 1059403033) {
			local71 = this.aClass104_Sub3_6.anInt723 * 1059403033 - arg2;
			local36 -= local71;
			arg2 = this.aClass104_Sub3_6.anInt723 * 1059403033;
			local56 += local71 * local30;
			local48 += local42 * local71;
		}
		if (arg2 + local36 > this.aClass104_Sub3_6.anInt724 * 1200487767) {
			local36 -= arg2 + local36 - this.aClass104_Sub3_6.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_6.anInt734 * -491763783) {
			local71 = this.aClass104_Sub3_6.anInt734 * -491763783 - arg1;
			local30 -= local71;
			arg1 = this.aClass104_Sub3_6.anInt734 * -491763783;
			local56 += local71;
			local48 += local71;
			local54 += local71;
			local52 += local71;
		}
		if (arg1 + local30 > this.aClass104_Sub3_6.anInt732 * -1762676505) {
			local71 = arg1 + local30 - this.aClass104_Sub3_6.anInt732 * -1762676505;
			local30 -= local71;
			local54 += local71;
			local52 += local71;
		}
		if (local30 <= 0 || local36 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6692(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass5_10.method62(arg0, (byte) -1), arg5, arg6, arg7);
		} else {
			this.method6693(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass5_10.method62(arg0, (byte) -18), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afl", name = "bh", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V")
	void method6692(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += (arg14 - arg10) * this.aClass104_Sub3_6.anInt719 * 1808307287;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(52) int local52 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
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

	@OriginalMember(owner = "client!afl", name = "bx", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V")
	void method6693(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg9 - this.aClass104_Sub3_6.anInt734 * -491763783;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 1808307287 * this.aClass104_Sub3_6.anInt719;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? arg14 + local5.length : arg10 + arg6;
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
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
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
					@Pc(189) int local189 = ((arg2 & 0xFF00FF) * local64 & 0xFF00FF00) + ((arg2 & 0xFF00) * local64 & 0xFF0000) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = (((local193 & 0xFF00) * local68 & 0xFF0000) + (local68 * (local193 & 0xFF00FF) & 0xFF00FF00) >> 8) + local189;
				}
			}
			arg3 += arg8 + local96;
			arg4 += local96 + arg7;
		}
	}

	@OriginalMember(owner = "client!afl", name = "q", descriptor = "(CIIIZ)V")
	@Override
	void method7541(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_6.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method64(arg0, (byte) -100);
		@Pc(19) int local19 = this.aClass5_10.method62(arg0, (byte) 22);
		@Pc(25) int local25 = this.aClass5_10.method33(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_6.anInt719 * 1808307287;
		@Pc(37) int local37 = arg1 + local31 * arg2;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_6.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_6.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_6.anInt723 * 1059403033;
			local45 += local19 * local60;
			local37 += local60 * local31;
		}
		if (local25 + arg2 > this.aClass104_Sub3_6.anInt724 * 1200487767) {
			local25 -= local25 + arg2 - this.aClass104_Sub3_6.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_6.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_6.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_6.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 + arg1 > this.aClass104_Sub3_6.anInt732 * -1762676505) {
			local60 = local19 + arg1 - this.aClass104_Sub3_6.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 <= 0 || local25 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6690(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method6696(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afl", name = "x", descriptor = "(CIIIZ)V")
	@Override
	void method7523(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_6.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method64(arg0, (byte) -13);
		@Pc(19) int local19 = this.aClass5_10.method62(arg0, (byte) 32);
		@Pc(25) int local25 = this.aClass5_10.method33(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_6.anInt719 * 1808307287;
		@Pc(37) int local37 = arg1 + local31 * arg2;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_6.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_6.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_6.anInt723 * 1059403033;
			local45 += local19 * local60;
			local37 += local60 * local31;
		}
		if (local25 + arg2 > this.aClass104_Sub3_6.anInt724 * 1200487767) {
			local25 -= local25 + arg2 - this.aClass104_Sub3_6.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_6.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_6.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_6.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 + arg1 > this.aClass104_Sub3_6.anInt732 * -1762676505) {
			local60 = local19 + arg1 - this.aClass104_Sub3_6.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 <= 0 || local25 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6690(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method6696(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afl", name = "b", descriptor = "(CIIIZ)V")
	@Override
	void method7549(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_6.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method64(arg0, (byte) -80);
		@Pc(19) int local19 = this.aClass5_10.method62(arg0, (byte) 22);
		@Pc(25) int local25 = this.aClass5_10.method33(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_6.anInt719 * 1808307287;
		@Pc(37) int local37 = arg1 + local31 * arg2;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_6.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_6.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_6.anInt723 * 1059403033;
			local45 += local19 * local60;
			local37 += local60 * local31;
		}
		if (local25 + arg2 > this.aClass104_Sub3_6.anInt724 * 1200487767) {
			local25 -= local25 + arg2 - this.aClass104_Sub3_6.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_6.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_6.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_6.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 + arg1 > this.aClass104_Sub3_6.anInt732 * -1762676505) {
			local60 = local19 + arg1 - this.aClass104_Sub3_6.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 <= 0 || local25 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6690(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method6696(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afl", name = "h", descriptor = "(CIIIZ)V")
	@Override
	void method7544(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_6.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method64(arg0, (byte) -58);
		@Pc(19) int local19 = this.aClass5_10.method62(arg0, (byte) -30);
		@Pc(25) int local25 = this.aClass5_10.method33(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_6.anInt719 * 1808307287;
		@Pc(37) int local37 = arg1 + local31 * arg2;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_6.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_6.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_6.anInt723 * 1059403033;
			local45 += local19 * local60;
			local37 += local60 * local31;
		}
		if (local25 + arg2 > this.aClass104_Sub3_6.anInt724 * 1200487767) {
			local25 -= local25 + arg2 - this.aClass104_Sub3_6.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_6.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_6.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_6.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 + arg1 > this.aClass104_Sub3_6.anInt732 * -1762676505) {
			local60 = local19 + arg1 - this.aClass104_Sub3_6.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 <= 0 || local25 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6690(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method6696(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afl", name = "a", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7545(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_6.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7533(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method64(arg0, (byte) -36);
		@Pc(30) int local30 = this.aClass5_10.method62(arg0, (byte) 63);
		@Pc(36) int local36 = this.aClass5_10.method33(arg0, 1415476369);
		@Pc(42) int local42 = this.aClass104_Sub3_6.anInt719 * 1808307287;
		@Pc(48) int local48 = arg2 * local42 + arg1;
		@Pc(52) int local52 = local42 - local30;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(71) int local71;
		if (arg2 < this.aClass104_Sub3_6.anInt723 * 1059403033) {
			local71 = this.aClass104_Sub3_6.anInt723 * 1059403033 - arg2;
			local36 -= local71;
			arg2 = this.aClass104_Sub3_6.anInt723 * 1059403033;
			local56 += local71 * local30;
			local48 += local42 * local71;
		}
		if (arg2 + local36 > this.aClass104_Sub3_6.anInt724 * 1200487767) {
			local36 -= arg2 + local36 - this.aClass104_Sub3_6.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_6.anInt734 * -491763783) {
			local71 = this.aClass104_Sub3_6.anInt734 * -491763783 - arg1;
			local30 -= local71;
			arg1 = this.aClass104_Sub3_6.anInt734 * -491763783;
			local56 += local71;
			local48 += local71;
			local54 += local71;
			local52 += local71;
		}
		if (arg1 + local30 > this.aClass104_Sub3_6.anInt732 * -1762676505) {
			local71 = arg1 + local30 - this.aClass104_Sub3_6.anInt732 * -1762676505;
			local30 -= local71;
			local54 += local71;
			local52 += local71;
		}
		if (local30 <= 0 || local36 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6692(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass5_10.method62(arg0, (byte) 108), arg5, arg6, arg7);
		} else {
			this.method6693(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass5_10.method62(arg0, (byte) 69), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afl", name = "i", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7566(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_6.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7533(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method64(arg0, (byte) -31);
		@Pc(30) int local30 = this.aClass5_10.method62(arg0, (byte) -30);
		@Pc(36) int local36 = this.aClass5_10.method33(arg0, 1415476369);
		@Pc(42) int local42 = this.aClass104_Sub3_6.anInt719 * 1808307287;
		@Pc(48) int local48 = arg2 * local42 + arg1;
		@Pc(52) int local52 = local42 - local30;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(71) int local71;
		if (arg2 < this.aClass104_Sub3_6.anInt723 * 1059403033) {
			local71 = this.aClass104_Sub3_6.anInt723 * 1059403033 - arg2;
			local36 -= local71;
			arg2 = this.aClass104_Sub3_6.anInt723 * 1059403033;
			local56 += local71 * local30;
			local48 += local42 * local71;
		}
		if (arg2 + local36 > this.aClass104_Sub3_6.anInt724 * 1200487767) {
			local36 -= arg2 + local36 - this.aClass104_Sub3_6.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_6.anInt734 * -491763783) {
			local71 = this.aClass104_Sub3_6.anInt734 * -491763783 - arg1;
			local30 -= local71;
			arg1 = this.aClass104_Sub3_6.anInt734 * -491763783;
			local56 += local71;
			local48 += local71;
			local54 += local71;
			local52 += local71;
		}
		if (arg1 + local30 > this.aClass104_Sub3_6.anInt732 * -1762676505) {
			local71 = arg1 + local30 - this.aClass104_Sub3_6.anInt732 * -1762676505;
			local30 -= local71;
			local54 += local71;
			local52 += local71;
		}
		if (local30 <= 0 || local36 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method6692(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass5_10.method62(arg0, (byte) 30), arg5, arg6, arg7);
		} else {
			this.method6693(this.aByteArrayArray11[arg0], this.aClass104_Sub3_6.anIntArray46, arg3, local56, local48, local30, local36, local52, local54, arg1, arg2, this.aClass5_10.method62(arg0, (byte) 77), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afl", name = "bd", descriptor = "([B[IIIIIIII)V")
	void method6694(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afl", name = "bq", descriptor = "([B[IIIIIIII)V")
	void method6695(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = (local3 * (arg2 & 0xFF00) & 0xFF0000) + (local3 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = (((local44 & 0xFF00) * local7 & 0xFF0000) + (local7 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8) + local40;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afl", name = "bk", descriptor = "([B[IIIIIIII)V")
	void method6696(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = (local3 * (arg2 & 0xFF00) & 0xFF0000) + (local3 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = (((local44 & 0xFF00) * local7 & 0xFF0000) + (local7 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8) + local40;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afl", name = "bn", descriptor = "([B[IIIIIIII)V")
	void method6697(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afl", name = "bt", descriptor = "([B[IIIIIIII)V")
	void method6698(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = (local3 * (arg2 & 0xFF00) & 0xFF0000) + (local3 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = (((local44 & 0xFF00) * local7 & 0xFF0000) + (local7 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8) + local40;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afl", name = "bo", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V")
	void method6699(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg9 - this.aClass104_Sub3_6.anInt734 * -491763783;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 1808307287 * this.aClass104_Sub3_6.anInt719;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? arg14 + local5.length : arg10 + arg6;
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
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
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
					@Pc(189) int local189 = ((arg2 & 0xFF00FF) * local64 & 0xFF00FF00) + ((arg2 & 0xFF00) * local64 & 0xFF0000) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = (((local193 & 0xFF00) * local68 & 0xFF0000) + (local68 * (local193 & 0xFF00FF) & 0xFF00FF00) >> 8) + local189;
				}
			}
			arg3 += arg8 + local96;
			arg4 += local96 + arg7;
		}
	}

	@OriginalMember(owner = "client!afl", name = "bb", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V")
	void method6700(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += (arg14 - arg10) * this.aClass104_Sub3_6.anInt719 * 1808307287;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(52) int local52 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
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

	@OriginalMember(owner = "client!afl", name = "be", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V")
	void method6701(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += (arg14 - arg10) * this.aClass104_Sub3_6.anInt719 * 1808307287;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(52) int local52 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
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

	@OriginalMember(owner = "client!afl", name = "by", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V")
	void method6702(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += (arg14 - arg10) * this.aClass104_Sub3_6.anInt719 * 1808307287;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(52) int local52 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
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

	@OriginalMember(owner = "client!afl", name = "bm", descriptor = "([B[IIIIIIII)V")
	void method6703(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = (local3 * (arg2 & 0xFF00) & 0xFF0000) + (local3 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = (((local44 & 0xFF00) * local7 & 0xFF0000) + (local7 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8) + local40;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afl", name = "bw", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V")
	void method6704(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg9 - this.aClass104_Sub3_6.anInt734 * -491763783;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 1808307287 * this.aClass104_Sub3_6.anInt719;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? arg14 + local5.length : arg10 + arg6;
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
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
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
					@Pc(189) int local189 = ((arg2 & 0xFF00FF) * local64 & 0xFF00FF00) + ((arg2 & 0xFF00) * local64 & 0xFF0000) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = (((local193 & 0xFF00) * local68 & 0xFF0000) + (local68 * (local193 & 0xFF00FF) & 0xFF00FF00) >> 8) + local189;
				}
			}
			arg3 += arg8 + local96;
			arg4 += local96 + arg7;
		}
	}

	@OriginalMember(owner = "client!afl", name = "bi", descriptor = "([B[IIIIIIII)V")
	void method6705(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
}

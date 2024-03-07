package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afd")
public class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!afd", name = "o", descriptor = "Lclient!afg;")
	Class104_Sub3 aClass104_Sub3_3;

	@OriginalMember(owner = "client!afd", name = "s", descriptor = "[[B")
	byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!afd", name = "y", descriptor = "[I")
	int[] anIntArray45;

	@OriginalMember(owner = "client!afd", name = "<init>", descriptor = "(Lclient!afg;Lclient!aac;Lclient!afr;)V", line = 14)
	Class106_Sub1(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class105_Sub2 arg2) {
		super(arg0, arg1);
		this.aClass104_Sub3_3 = arg0;
		this.aByteArrayArray10 = new byte[256][];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(21) int local21 = this.aClass5_10.method45(local12, (byte) 83);
			@Pc(27) int local27 = this.aClass5_10.method46(local12, 1415476369);
			@Pc(33) short[] local33 = this.aClass5_10.method52(local12, 202867741);
			@Pc(37) short local37 = local33[0];
			@Pc(41) short local41 = local33[1];
			@Pc(46) byte[] local46 = new byte[local21 * local27];
			for (@Pc(48) int local48 = 0; local48 < local27; local48++) {
				for (@Pc(53) int local53 = 0; local53 < local21; local53++) {
					local46[local53 + local21 * local48] = arg2.aByteArray25[this.aClass5_10.anInt11 * 286794121 * local53 + local37 + (local48 * this.aClass5_10.anInt11 * 286794121 + local41) * -2141347013 * this.aClass5_10.anInt12];
				}
			}
			this.aByteArrayArray10[local12] = local46;
		}
		this.anIntArray45 = arg2.anIntArray82;
	}

	@OriginalMember(owner = "client!afd", name = "s", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method7576(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_3.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -106);
		@Pc(19) int local19 = this.aClass5_10.method45(arg0, (byte) -28);
		@Pc(25) int local25 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_3.anInt719 * 1808307287;
		@Pc(37) int local37 = arg1 + arg2 * local31;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_3.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_3.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_3.anInt723 * 1059403033;
			local45 += local60 * local19;
			local37 += local60 * local31;
		}
		if (arg2 + local25 > this.aClass104_Sub3_3.anInt724 * 1200487767) {
			local25 -= local25 + arg2 - this.aClass104_Sub3_3.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_3.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_3.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_3.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 + arg1 > this.aClass104_Sub3_3.anInt732 * -1762676505) {
			local60 = arg1 + local19 - this.aClass104_Sub3_3.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 <= 0 || local25 <= 0) {
			return;
		}
		if (arg4) {
			this.method5139(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		} else {
			this.method5137(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, this.anIntArray45, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afd", name = "q", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method7578(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_3.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -61);
		@Pc(19) int local19 = this.aClass5_10.method45(arg0, (byte) 71);
		@Pc(25) int local25 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_3.anInt719 * 1808307287;
		@Pc(37) int local37 = arg1 + arg2 * local31;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_3.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_3.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_3.anInt723 * 1059403033;
			local45 += local60 * local19;
			local37 += local60 * local31;
		}
		if (arg2 + local25 > this.aClass104_Sub3_3.anInt724 * 1200487767) {
			local25 -= local25 + arg2 - this.aClass104_Sub3_3.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_3.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_3.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_3.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 + arg1 > this.aClass104_Sub3_3.anInt732 * -1762676505) {
			local60 = arg1 + local19 - this.aClass104_Sub3_3.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 <= 0 || local25 <= 0) {
			return;
		}
		if (arg4) {
			this.method5139(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		} else {
			this.method5137(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, this.anIntArray45, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afd", name = "x", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method7575(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_3.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -100);
		@Pc(19) int local19 = this.aClass5_10.method45(arg0, (byte) 30);
		@Pc(25) int local25 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_3.anInt719 * 1808307287;
		@Pc(37) int local37 = arg1 + arg2 * local31;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_3.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_3.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_3.anInt723 * 1059403033;
			local45 += local60 * local19;
			local37 += local60 * local31;
		}
		if (arg2 + local25 > this.aClass104_Sub3_3.anInt724 * 1200487767) {
			local25 -= local25 + arg2 - this.aClass104_Sub3_3.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_3.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_3.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_3.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 + arg1 > this.aClass104_Sub3_3.anInt732 * -1762676505) {
			local60 = arg1 + local19 - this.aClass104_Sub3_3.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 <= 0 || local25 <= 0) {
			return;
		}
		if (arg4) {
			this.method5139(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		} else {
			this.method5137(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, this.anIntArray45, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afd", name = "b", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method7582(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_3.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -58);
		@Pc(19) int local19 = this.aClass5_10.method45(arg0, (byte) 29);
		@Pc(25) int local25 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_3.anInt719 * 1808307287;
		@Pc(37) int local37 = arg1 + arg2 * local31;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_3.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_3.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_3.anInt723 * 1059403033;
			local45 += local60 * local19;
			local37 += local60 * local31;
		}
		if (arg2 + local25 > this.aClass104_Sub3_3.anInt724 * 1200487767) {
			local25 -= local25 + arg2 - this.aClass104_Sub3_3.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_3.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_3.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_3.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 + arg1 > this.aClass104_Sub3_3.anInt732 * -1762676505) {
			local60 = arg1 + local19 - this.aClass104_Sub3_3.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 <= 0 || local25 <= 0) {
			return;
		}
		if (arg4) {
			this.method5139(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		} else {
			this.method5137(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, this.anIntArray45, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afd", name = "h", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method7579(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_3.anIntArray46 == null) {
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -74);
		@Pc(19) int local19 = this.aClass5_10.method45(arg0, (byte) 23);
		@Pc(25) int local25 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(31) int local31 = this.aClass104_Sub3_3.anInt719 * 1808307287;
		@Pc(37) int local37 = arg1 + arg2 * local31;
		@Pc(41) int local41 = local31 - local19;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(60) int local60;
		if (arg2 < this.aClass104_Sub3_3.anInt723 * 1059403033) {
			local60 = this.aClass104_Sub3_3.anInt723 * 1059403033 - arg2;
			local25 -= local60;
			arg2 = this.aClass104_Sub3_3.anInt723 * 1059403033;
			local45 += local60 * local19;
			local37 += local60 * local31;
		}
		if (arg2 + local25 > this.aClass104_Sub3_3.anInt724 * 1200487767) {
			local25 -= local25 + arg2 - this.aClass104_Sub3_3.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_3.anInt734 * -491763783) {
			local60 = this.aClass104_Sub3_3.anInt734 * -491763783 - arg1;
			local19 -= local60;
			arg1 = this.aClass104_Sub3_3.anInt734 * -491763783;
			local45 += local60;
			local37 += local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 + arg1 > this.aClass104_Sub3_3.anInt732 * -1762676505) {
			local60 = arg1 + local19 - this.aClass104_Sub3_3.anInt732 * -1762676505;
			local19 -= local60;
			local43 += local60;
			local41 += local60;
		}
		if (local19 <= 0 || local25 <= 0) {
			return;
		}
		if (arg4) {
			this.method5139(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, arg3, local45, local37, local19, local25, local41, local43);
		} else {
			this.method5137(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, this.anIntArray45, local45, local37, local19, local25, local41, local43);
		}
	}

	@OriginalMember(owner = "client!afd", name = "n", descriptor = "(I)V", line = 60)
	public static void method5135(@OriginalArg(0) int arg0) {
		@Pc(1) Class38 local1 = null;
		try {
			local1 = Class166_Sub18.method15743("", client.modeGame.aString241, true, 199047110);
			@Pc(12) Packet local12 = Class51.options.encode(149427018);
			local1.method725(local12.data, 0, local12.pos * 212851357, 815855156);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method728(-194140538);
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!afd", name = "bc", descriptor = "([B[I[IIIIIII)V", line = 73)
	void method5136(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afd", name = "bl", descriptor = "([B[I[IIIIIII)V", line = 73)
	void method5137(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afd", name = "bd", descriptor = "([B[I[IIIIIII)V", line = 73)
	void method5138(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afd", name = "bk", descriptor = "([B[IIIIIIII)V", line = 97)
	void method5139(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afd", name = "bt", descriptor = "([B[IIIIIIII)V", line = 97)
	void method5140(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afd", name = "bq", descriptor = "([B[IIIIIIII)V", line = 97)
	void method5141(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afd", name = "bi", descriptor = "([B[IIIIIIII)V", line = 97)
	void method5142(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afd", name = "bn", descriptor = "([B[IIIIIIII)V", line = 97)
	void method5143(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afd", name = "bm", descriptor = "([B[IIIIIIII)V", line = 97)
	void method5144(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afd", name = "d", descriptor = "(J)I", line = 114)
	public static int method5145(@OriginalArg(0) long arg0) {
		Class337.method27454(arg0);
		return Class69.aCalendar1.get(1);
	}

	@OriginalMember(owner = "client!afd", name = "y", descriptor = "(CIIIZLclient!ch;II)V", line = 120)
	@Override
	void method7577(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_3.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7576(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -14);
		@Pc(28) int local28 = this.aClass5_10.method45(arg0, (byte) 51);
		@Pc(34) int local34 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(40) int local40 = this.aClass104_Sub3_3.anInt719 * 1808307287;
		@Pc(46) int local46 = local40 * arg2 + arg1;
		@Pc(50) int local50 = local40 - local28;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		@Pc(69) int local69;
		if (arg2 < this.aClass104_Sub3_3.anInt723 * 1059403033) {
			local69 = this.aClass104_Sub3_3.anInt723 * 1059403033 - arg2;
			local34 -= local69;
			arg2 = this.aClass104_Sub3_3.anInt723 * 1059403033;
			local54 += local69 * local28;
			local46 += local40 * local69;
		}
		if (local34 + arg2 > this.aClass104_Sub3_3.anInt724 * 1200487767) {
			local34 -= local34 + arg2 - this.aClass104_Sub3_3.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_3.anInt734 * -491763783) {
			local69 = this.aClass104_Sub3_3.anInt734 * -491763783 - arg1;
			local28 -= local69;
			arg1 = this.aClass104_Sub3_3.anInt734 * -491763783;
			local54 += local69;
			local46 += local69;
			local52 += local69;
			local50 += local69;
		}
		if (local28 + arg1 > this.aClass104_Sub3_3.anInt732 * -1762676505) {
			local69 = arg1 + local28 - this.aClass104_Sub3_3.anInt732 * -1762676505;
			local28 -= local69;
			local52 += local69;
			local50 += local69;
		}
		if (local28 <= 0 || local34 <= 0) {
			return;
		}
		if (arg4) {
			this.method5147(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, arg3, local54, local46, local28, local34, local50, local52, arg1, arg2, this.aClass5_10.method45(arg0, (byte) -42), arg5, arg6, arg7);
		} else {
			this.method5146(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, this.anIntArray45, arg3, local54, local46, local28, local34, local50, local52, arg1, arg2, this.aClass5_10.method45(arg0, (byte) 113), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afd", name = "a", descriptor = "(CIIIZLclient!ch;II)V", line = 120)
	@Override
	void method7580(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_3.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7576(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -68);
		@Pc(28) int local28 = this.aClass5_10.method45(arg0, (byte) 22);
		@Pc(34) int local34 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(40) int local40 = this.aClass104_Sub3_3.anInt719 * 1808307287;
		@Pc(46) int local46 = local40 * arg2 + arg1;
		@Pc(50) int local50 = local40 - local28;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		@Pc(69) int local69;
		if (arg2 < this.aClass104_Sub3_3.anInt723 * 1059403033) {
			local69 = this.aClass104_Sub3_3.anInt723 * 1059403033 - arg2;
			local34 -= local69;
			arg2 = this.aClass104_Sub3_3.anInt723 * 1059403033;
			local54 += local69 * local28;
			local46 += local40 * local69;
		}
		if (local34 + arg2 > this.aClass104_Sub3_3.anInt724 * 1200487767) {
			local34 -= local34 + arg2 - this.aClass104_Sub3_3.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_3.anInt734 * -491763783) {
			local69 = this.aClass104_Sub3_3.anInt734 * -491763783 - arg1;
			local28 -= local69;
			arg1 = this.aClass104_Sub3_3.anInt734 * -491763783;
			local54 += local69;
			local46 += local69;
			local52 += local69;
			local50 += local69;
		}
		if (local28 + arg1 > this.aClass104_Sub3_3.anInt732 * -1762676505) {
			local69 = arg1 + local28 - this.aClass104_Sub3_3.anInt732 * -1762676505;
			local28 -= local69;
			local52 += local69;
			local50 += local69;
		}
		if (local28 <= 0 || local34 <= 0) {
			return;
		}
		if (arg4) {
			this.method5147(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, arg3, local54, local46, local28, local34, local50, local52, arg1, arg2, this.aClass5_10.method45(arg0, (byte) -15), arg5, arg6, arg7);
		} else {
			this.method5146(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, this.anIntArray45, arg3, local54, local46, local28, local34, local50, local52, arg1, arg2, this.aClass5_10.method45(arg0, (byte) 24), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afd", name = "g", descriptor = "(CIIIZLclient!ch;II)V", line = 120)
	@Override
	void method7581(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_3.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7576(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -29);
		@Pc(28) int local28 = this.aClass5_10.method45(arg0, (byte) -47);
		@Pc(34) int local34 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(40) int local40 = this.aClass104_Sub3_3.anInt719 * 1808307287;
		@Pc(46) int local46 = local40 * arg2 + arg1;
		@Pc(50) int local50 = local40 - local28;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		@Pc(69) int local69;
		if (arg2 < this.aClass104_Sub3_3.anInt723 * 1059403033) {
			local69 = this.aClass104_Sub3_3.anInt723 * 1059403033 - arg2;
			local34 -= local69;
			arg2 = this.aClass104_Sub3_3.anInt723 * 1059403033;
			local54 += local69 * local28;
			local46 += local40 * local69;
		}
		if (local34 + arg2 > this.aClass104_Sub3_3.anInt724 * 1200487767) {
			local34 -= local34 + arg2 - this.aClass104_Sub3_3.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_3.anInt734 * -491763783) {
			local69 = this.aClass104_Sub3_3.anInt734 * -491763783 - arg1;
			local28 -= local69;
			arg1 = this.aClass104_Sub3_3.anInt734 * -491763783;
			local54 += local69;
			local46 += local69;
			local52 += local69;
			local50 += local69;
		}
		if (local28 + arg1 > this.aClass104_Sub3_3.anInt732 * -1762676505) {
			local69 = arg1 + local28 - this.aClass104_Sub3_3.anInt732 * -1762676505;
			local28 -= local69;
			local52 += local69;
			local50 += local69;
		}
		if (local28 <= 0 || local34 <= 0) {
			return;
		}
		if (arg4) {
			this.method5147(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, arg3, local54, local46, local28, local34, local50, local52, arg1, arg2, this.aClass5_10.method45(arg0, (byte) -11), arg5, arg6, arg7);
		} else {
			this.method5146(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, this.anIntArray45, arg3, local54, local46, local28, local34, local50, local52, arg1, arg2, this.aClass5_10.method45(arg0, (byte) -11), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afd", name = "i", descriptor = "(CIIIZLclient!ch;II)V", line = 120)
	@Override
	void method7583(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass104_Sub3_3.anIntArray46 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7576(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg2 += this.aClass5_10.method49(arg0, (byte) -47);
		@Pc(28) int local28 = this.aClass5_10.method45(arg0, (byte) 10);
		@Pc(34) int local34 = this.aClass5_10.method46(arg0, 1415476369);
		@Pc(40) int local40 = this.aClass104_Sub3_3.anInt719 * 1808307287;
		@Pc(46) int local46 = local40 * arg2 + arg1;
		@Pc(50) int local50 = local40 - local28;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		@Pc(69) int local69;
		if (arg2 < this.aClass104_Sub3_3.anInt723 * 1059403033) {
			local69 = this.aClass104_Sub3_3.anInt723 * 1059403033 - arg2;
			local34 -= local69;
			arg2 = this.aClass104_Sub3_3.anInt723 * 1059403033;
			local54 += local69 * local28;
			local46 += local40 * local69;
		}
		if (local34 + arg2 > this.aClass104_Sub3_3.anInt724 * 1200487767) {
			local34 -= local34 + arg2 - this.aClass104_Sub3_3.anInt724 * 1200487767;
		}
		if (arg1 < this.aClass104_Sub3_3.anInt734 * -491763783) {
			local69 = this.aClass104_Sub3_3.anInt734 * -491763783 - arg1;
			local28 -= local69;
			arg1 = this.aClass104_Sub3_3.anInt734 * -491763783;
			local54 += local69;
			local46 += local69;
			local52 += local69;
			local50 += local69;
		}
		if (local28 + arg1 > this.aClass104_Sub3_3.anInt732 * -1762676505) {
			local69 = arg1 + local28 - this.aClass104_Sub3_3.anInt732 * -1762676505;
			local28 -= local69;
			local52 += local69;
			local50 += local69;
		}
		if (local28 <= 0 || local34 <= 0) {
			return;
		}
		if (arg4) {
			this.method5147(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, arg3, local54, local46, local28, local34, local50, local52, arg1, arg2, this.aClass5_10.method45(arg0, (byte) 9), arg5, arg6, arg7);
		} else {
			this.method5146(this.aByteArrayArray10[arg0], this.aClass104_Sub3_3.anIntArray46, this.anIntArray45, arg3, local54, local46, local28, local34, local50, local52, arg1, arg2, this.aClass5_10.method45(arg0, (byte) 83), arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afd", name = "bh", descriptor = "([B[I[IIIIIIIIIIILclient!ch;II)V", line = 162)
	void method5146(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class96 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg13;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg10 - this.aClass104_Sub3_3.anInt734 * -491763783;
		@Pc(18) int local18 = arg11;
		if (arg15 > arg11) {
			local18 = arg15;
			arg5 += this.aClass104_Sub3_3.anInt719 * 1808307287 * (arg15 - arg11);
			arg4 += arg12 * (arg15 - arg11);
		}
		@Pc(60) int local60 = local5.length + arg15 < arg7 + arg11 ? arg15 + local5.length : arg11 + arg7;
		@Pc(62) boolean local62 = false;
		for (@Pc(64) int local64 = local18; local64 < local60; local64++) {
			@Pc(75) int local75 = arg14 + local5[local64 - arg15];
			@Pc(81) int local81 = local8[local64 - arg15];
			@Pc(83) int local83 = arg6;
			@Pc(90) int local90;
			if (local16 > local75) {
				local90 = local16 - local75;
				if (local90 >= local81) {
					arg4 += arg9 + arg6;
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
			arg4 += arg9 + local90;
			arg5 += local90 + arg8;
		}
	}

	@OriginalMember(owner = "client!afd", name = "bx", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 211)
	void method5147(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg9 - this.aClass104_Sub3_3.anInt734 * -491763783;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass104_Sub3_3.anInt719 * 1808307287 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = arg14 + local5.length < arg10 + arg6 ? local5.length + arg14 : arg6 + arg10;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = local5[local62 - arg14] + arg13;
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

	@OriginalMember(owner = "client!afd", name = "bb", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 211)
	void method5148(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class96 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class96_Sub3 local2 = (Class96_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray29;
		@Pc(8) int[] local8 = local2.anIntArray30;
		@Pc(16) int local16 = arg9 - this.aClass104_Sub3_3.anInt734 * -491763783;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass104_Sub3_3.anInt719 * 1808307287 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = arg14 + local5.length < arg10 + arg6 ? local5.length + arg14 : arg6 + arg10;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = local5[local62 - arg14] + arg13;
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

	@OriginalMember(owner = "client!afd", name = "avr", descriptor = "(Lclient!yf;B)V", line = 13461)
	static final void method5149(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}

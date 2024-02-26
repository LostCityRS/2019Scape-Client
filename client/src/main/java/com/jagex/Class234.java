package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class234 {

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
	static int anInt3796;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
	static int anInt3797;

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "I")
	static int anInt3798;

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "[I")
	static int[] anIntArray353;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
	static int anInt3799;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
	static int anInt3800;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
	static int anInt3801;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
	static int anInt3802;

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "()V")
	static void method26090() {
		anInt3799 = 0;
	}

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "([III)V")
	static void method26091(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3799 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray353 == null || anIntArray353.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3799; local16++) {
				local14[local16] = anIntArray353[local16];
			}
			anIntArray353 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray353[anInt3799++] = arg0[local37];
				anIntArray353[anInt3799++] = local48;
				anIntArray353[anInt3799++] = arg0[local16];
				anIntArray353[anInt3799++] = local54;
			} else if (local54 < local48) {
				anIntArray353[anInt3799++] = arg0[local16];
				anIntArray353[anInt3799++] = local54;
				anIntArray353[anInt3799++] = arg0[local37];
				anIntArray353[anInt3799++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "([III)V")
	static void method26092(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3799 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray353 == null || anIntArray353.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3799; local16++) {
				local14[local16] = anIntArray353[local16];
			}
			anIntArray353 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray353[anInt3799++] = arg0[local37];
				anIntArray353[anInt3799++] = local48;
				anIntArray353[anInt3799++] = arg0[local16];
				anIntArray353[anInt3799++] = local54;
			} else if (local54 < local48) {
				anIntArray353[anInt3799++] = arg0[local16];
				anIntArray353[anInt3799++] = local54;
				anIntArray353[anInt3799++] = arg0[local37];
				anIntArray353[anInt3799++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "()V")
	static void method26093() {
		anInt3799 = 0;
	}

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "([III)V")
	static void method26094(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3799 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray353 == null || anIntArray353.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3799; local16++) {
				local14[local16] = anIntArray353[local16];
			}
			anIntArray353 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray353[anInt3799++] = arg0[local37];
				anIntArray353[anInt3799++] = local48;
				anIntArray353[anInt3799++] = arg0[local16];
				anIntArray353[anInt3799++] = local54;
			} else if (local54 < local48) {
				anIntArray353[anInt3799++] = arg0[local16];
				anIntArray353[anInt3799++] = local54;
				anIntArray353[anInt3799++] = arg0[local37];
				anIntArray353[anInt3799++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "(I)V")
	static void method26095(@OriginalArg(0) int arg0) {
		if (anInt3799 < 0) {
			anInt3796 = 0;
			anInt3797 = 0;
			anInt3800 = 0;
			anInt3802 = 2147483646;
			return;
		}
		method26097(0, anInt3799);
		@Pc(17) int local17 = anIntArray353[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3799; local26 += 4) {
			@Pc(35) int local35 = anIntArray353[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray353[local26];
			@Pc(49) int local49 = anIntArray353[local26 + 2];
			@Pc(55) int local55 = anIntArray353[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray353[local26] = local71 + (local17 - local35) * local65;
			anIntArray353[local26 + 2] = local65;
		}
		anInt3800 = local24;
		anInt3797 = local26;
		anInt3796 = local26;
		anInt3802 = local17 - 1;
	}

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "(I)Z")
	static boolean method26096(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt3797;
		@Pc(3) int local3 = anInt3796;
		@Pc(5) int local5 = anInt3802;
		while (local3 >= local1) {
			local5++;
			anInt3802 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(18) int local18 = anInt3800;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3799) {
				local27 = anIntArray353[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray353[local1];
				@Pc(41) int local41 = anIntArray353[local1 + 2];
				@Pc(47) int local47 = anIntArray353[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray353[local1] = local63;
				anIntArray353[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray353[local27 + 3];
				if (local5 >= local35) {
					anIntArray353[local27] = anIntArray353[local18];
					anIntArray353[local27 + 1] = anIntArray353[local18 + 1];
					anIntArray353[local27 + 2] = anIntArray353[local18 + 2];
					anIntArray353[local27 + 3] = anIntArray353[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3799) {
				anInt3799 = 0;
				return false;
			}
			method26098(local18, local1);
			anInt3800 = local18;
			anInt3797 = local1;
			local3 = local18;
		}
		anInt3798 = anIntArray353[local3] >> 16;
		anInt3801 = anIntArray353[local3 + 4] >> 16;
		anIntArray353[local3] += anIntArray353[local3 + 2];
		anIntArray353[local3 + 4] += anIntArray353[local3 + 6];
		local3 += 8;
		anInt3796 = local3;
		return true;
	}

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "(II)V")
	static void method26097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray353[arg0];
		@Pc(17) int local17 = anIntArray353[arg0 + 1];
		@Pc(23) int local23 = anIntArray353[arg0 + 2];
		@Pc(29) int local29 = anIntArray353[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray353[local33 + 1];
			if (local42 < local17) {
				anIntArray353[local7] = anIntArray353[local33];
				anIntArray353[local7 + 1] = local42;
				anIntArray353[local7 + 2] = anIntArray353[local33 + 2];
				anIntArray353[local7 + 3] = anIntArray353[local33 + 3];
				local7 += 4;
				anIntArray353[local33] = anIntArray353[local7];
				anIntArray353[local33 + 1] = anIntArray353[local7 + 1];
				anIntArray353[local33 + 2] = anIntArray353[local7 + 2];
				anIntArray353[local33 + 3] = anIntArray353[local7 + 3];
			}
		}
		anIntArray353[local7] = local11;
		anIntArray353[local7 + 1] = local17;
		anIntArray353[local7 + 2] = local23;
		anIntArray353[local7 + 3] = local29;
		method26097(arg0, local7);
		method26097(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "(II)V")
	static void method26098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray353[local10 - 4];
					@Pc(23) int local23 = anIntArray353[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray353[local10 - 4] = local23;
						anIntArray353[local10] = local19;
						local19 = anIntArray353[local10 - 2];
						anIntArray353[local10 - 2] = anIntArray353[local10 + 2];
						anIntArray353[local10 + 2] = local19;
						local19 = anIntArray353[local10 - 1];
						anIntArray353[local10 - 1] = anIntArray353[local10 + 3];
						anIntArray353[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "(Lclient!di;[II)V")
	public static void method26099(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method26107(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(II)V")
	static void method26100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray353[local10 - 4];
					@Pc(23) int local23 = anIntArray353[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray353[local10 - 4] = local23;
						anIntArray353[local10] = local19;
						local19 = anIntArray353[local10 - 2];
						anIntArray353[local10 - 2] = anIntArray353[local10 + 2];
						anIntArray353[local10 + 2] = local19;
						local19 = anIntArray353[local10 - 1];
						anIntArray353[local10 - 1] = anIntArray353[local10 + 3];
						anIntArray353[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "(Lclient!di;[II[I[I)V")
	public static void method26101(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method26107(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "(Lclient!di;[II[I[I)V")
	public static void method26102(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method26107(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "(Lclient!di;[II[I[I)V")
	public static void method26103(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method26107(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!dv", name = "ax", descriptor = "(II)V")
	static void method26104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray353[local10 - 4];
					@Pc(23) int local23 = anIntArray353[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray353[local10 - 4] = local23;
						anIntArray353[local10] = local19;
						local19 = anIntArray353[local10 - 2];
						anIntArray353[local10 - 2] = anIntArray353[local10 + 2];
						anIntArray353[local10 + 2] = local19;
						local19 = anIntArray353[local10 - 1];
						anIntArray353[local10 - 1] = anIntArray353[local10 + 3];
						anIntArray353[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "()V")
	static void method26105() {
		anInt3799 = 0;
	}

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "(Lclient!di;[II)V")
	public static void method26106(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method26107(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "(Lclient!di;[IIII[I[I)V")
	static void method26107(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(2) int[] local2 = new int[4];
		arg0.method20713(local2);
		if (arg5 != null && local2[3] - local2[1] != arg5.length) {
			throw new IllegalStateException();
		}
		method26093();
		method26094(arg1, arg2, arg3);
		method26095(local2[1]);
		while (true) {
			@Pc(37) int local37;
			@Pc(39) int local39;
			@Pc(41) int local41;
			do {
				if (!method26096(local2[3])) {
					return;
				}
				local37 = anInt3798;
				local39 = anInt3801;
				local41 = anInt3802;
				if (arg5 == null) {
					break;
				}
				@Pc(49) int local49 = local41 - local2[1];
				if (local37 < arg5[local49] + local2[0]) {
					local37 = arg5[local49] + local2[0];
				}
				if (local39 > arg5[local49] + arg6[local49] + local2[0]) {
					local39 = arg5[local49] + arg6[local49] + local2[0];
				}
			} while (local39 - local37 <= 0);
			arg0.method20725(local37, local41, local39 - local37, arg4, 1);
		}
	}

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "(Lclient!di;[II[I[I)V")
	public static void method26108(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method26107(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!dv", name = "z", descriptor = "(I)V")
	static void method26109(@OriginalArg(0) int arg0) {
		if (anInt3799 < 0) {
			anInt3796 = 0;
			anInt3797 = 0;
			anInt3800 = 0;
			anInt3802 = 2147483646;
			return;
		}
		method26097(0, anInt3799);
		@Pc(17) int local17 = anIntArray353[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3799; local26 += 4) {
			@Pc(35) int local35 = anIntArray353[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray353[local26];
			@Pc(49) int local49 = anIntArray353[local26 + 2];
			@Pc(55) int local55 = anIntArray353[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray353[local26] = local71 + (local17 - local35) * local65;
			anIntArray353[local26 + 2] = local65;
		}
		anInt3800 = local24;
		anInt3797 = local26;
		anInt3796 = local26;
		anInt3802 = local17 - 1;
	}

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "(I)Z")
	static boolean method26110(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt3797;
		@Pc(3) int local3 = anInt3796;
		@Pc(5) int local5 = anInt3802;
		while (local3 >= local1) {
			local5++;
			anInt3802 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(18) int local18 = anInt3800;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3799) {
				local27 = anIntArray353[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray353[local1];
				@Pc(41) int local41 = anIntArray353[local1 + 2];
				@Pc(47) int local47 = anIntArray353[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray353[local1] = local63;
				anIntArray353[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray353[local27 + 3];
				if (local5 >= local35) {
					anIntArray353[local27] = anIntArray353[local18];
					anIntArray353[local27 + 1] = anIntArray353[local18 + 1];
					anIntArray353[local27 + 2] = anIntArray353[local18 + 2];
					anIntArray353[local27 + 3] = anIntArray353[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3799) {
				anInt3799 = 0;
				return false;
			}
			method26098(local18, local1);
			anInt3800 = local18;
			anInt3797 = local1;
			local3 = local18;
		}
		anInt3798 = anIntArray353[local3] >> 16;
		anInt3801 = anIntArray353[local3 + 4] >> 16;
		anIntArray353[local3] += anIntArray353[local3 + 2];
		anIntArray353[local3 + 4] += anIntArray353[local3 + 6];
		local3 += 8;
		anInt3796 = local3;
		return true;
	}

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "(I)Z")
	static boolean method26111(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt3797;
		@Pc(3) int local3 = anInt3796;
		@Pc(5) int local5 = anInt3802;
		while (local3 >= local1) {
			local5++;
			anInt3802 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(18) int local18 = anInt3800;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3799) {
				local27 = anIntArray353[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray353[local1];
				@Pc(41) int local41 = anIntArray353[local1 + 2];
				@Pc(47) int local47 = anIntArray353[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray353[local1] = local63;
				anIntArray353[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray353[local27 + 3];
				if (local5 >= local35) {
					anIntArray353[local27] = anIntArray353[local18];
					anIntArray353[local27 + 1] = anIntArray353[local18 + 1];
					anIntArray353[local27 + 2] = anIntArray353[local18 + 2];
					anIntArray353[local27 + 3] = anIntArray353[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3799) {
				anInt3799 = 0;
				return false;
			}
			method26098(local18, local1);
			anInt3800 = local18;
			anInt3797 = local1;
			local3 = local18;
		}
		anInt3798 = anIntArray353[local3] >> 16;
		anInt3801 = anIntArray353[local3 + 4] >> 16;
		anIntArray353[local3] += anIntArray353[local3 + 2];
		anIntArray353[local3 + 4] += anIntArray353[local3 + 6];
		local3 += 8;
		anInt3796 = local3;
		return true;
	}

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "(II)V")
	static void method26112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray353[arg0];
		@Pc(17) int local17 = anIntArray353[arg0 + 1];
		@Pc(23) int local23 = anIntArray353[arg0 + 2];
		@Pc(29) int local29 = anIntArray353[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray353[local33 + 1];
			if (local42 < local17) {
				anIntArray353[local7] = anIntArray353[local33];
				anIntArray353[local7 + 1] = local42;
				anIntArray353[local7 + 2] = anIntArray353[local33 + 2];
				anIntArray353[local7 + 3] = anIntArray353[local33 + 3];
				local7 += 4;
				anIntArray353[local33] = anIntArray353[local7];
				anIntArray353[local33 + 1] = anIntArray353[local7 + 1];
				anIntArray353[local33 + 2] = anIntArray353[local7 + 2];
				anIntArray353[local33 + 3] = anIntArray353[local7 + 3];
			}
		}
		anIntArray353[local7] = local11;
		anIntArray353[local7 + 1] = local17;
		anIntArray353[local7 + 2] = local23;
		anIntArray353[local7 + 3] = local29;
		method26097(arg0, local7);
		method26097(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "(II)V")
	static void method26113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray353[arg0];
		@Pc(17) int local17 = anIntArray353[arg0 + 1];
		@Pc(23) int local23 = anIntArray353[arg0 + 2];
		@Pc(29) int local29 = anIntArray353[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray353[local33 + 1];
			if (local42 < local17) {
				anIntArray353[local7] = anIntArray353[local33];
				anIntArray353[local7 + 1] = local42;
				anIntArray353[local7 + 2] = anIntArray353[local33 + 2];
				anIntArray353[local7 + 3] = anIntArray353[local33 + 3];
				local7 += 4;
				anIntArray353[local33] = anIntArray353[local7];
				anIntArray353[local33 + 1] = anIntArray353[local7 + 1];
				anIntArray353[local33 + 2] = anIntArray353[local7 + 2];
				anIntArray353[local33 + 3] = anIntArray353[local7 + 3];
			}
		}
		anIntArray353[local7] = local11;
		anIntArray353[local7 + 1] = local17;
		anIntArray353[local7 + 2] = local23;
		anIntArray353[local7 + 3] = local29;
		method26097(arg0, local7);
		method26097(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!di;[II[I[I)V")
	public static void method26114(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method26107(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)V")
	static void method26115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray353[local10 - 4];
					@Pc(23) int local23 = anIntArray353[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray353[local10 - 4] = local23;
						anIntArray353[local10] = local19;
						local19 = anIntArray353[local10 - 2];
						anIntArray353[local10 - 2] = anIntArray353[local10 + 2];
						anIntArray353[local10 + 2] = local19;
						local19 = anIntArray353[local10 - 1];
						anIntArray353[local10 - 1] = anIntArray353[local10 + 3];
						anIntArray353[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "()V")
	static void method26116() {
		anInt3799 = 0;
	}

	@OriginalMember(owner = "client!dv", name = "ay", descriptor = "(II)V")
	static void method26117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray353[local10 - 4];
					@Pc(23) int local23 = anIntArray353[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray353[local10 - 4] = local23;
						anIntArray353[local10] = local19;
						local19 = anIntArray353[local10 - 2];
						anIntArray353[local10 - 2] = anIntArray353[local10 + 2];
						anIntArray353[local10 + 2] = local19;
						local19 = anIntArray353[local10 - 1];
						anIntArray353[local10 - 1] = anIntArray353[local10 + 3];
						anIntArray353[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
	Class234() throws Throwable {
		throw new Error();
	}
}

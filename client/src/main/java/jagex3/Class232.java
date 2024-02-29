package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class232 {

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
	static int anInt3786;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
	static int anInt3787;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	static int anInt3788;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
	static int anInt3789;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
	static int anInt3790;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "[I")
	static int[] anIntArray352;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	static int anInt3791;

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
	static int anInt3792;

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "(Lclient!dh;[IIII[I[I)V")
	static void method25790(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(2) int[] local2 = new int[4];
		arg0.method20482(local2);
		if (arg5 != null && local2[3] - local2[1] != arg5.length) {
			throw new IllegalStateException();
		}
		method25794();
		method25795(arg1, arg2, arg3);
		method25812(local2[1]);
		while (true) {
			@Pc(37) int local37;
			@Pc(39) int local39;
			@Pc(41) int local41;
			do {
				if (!method25797(local2[3])) {
					return;
				}
				local37 = anInt3790;
				local39 = anInt3787;
				local41 = anInt3788;
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
			arg0.method20744(local37, local41, local39 - local37, arg4, 1);
		}
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(Lclient!dh;[II)V")
	public static void method25791(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method25793(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "(Lclient!dh;[II[I[I)V")
	public static void method25792(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method25793(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "(Lclient!dh;[IIII[I[I)V")
	static void method25793(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(2) int[] local2 = new int[4];
		arg0.method20482(local2);
		if (arg5 != null && local2[3] - local2[1] != arg5.length) {
			throw new IllegalStateException();
		}
		method25794();
		method25795(arg1, arg2, arg3);
		method25812(local2[1]);
		while (true) {
			@Pc(37) int local37;
			@Pc(39) int local39;
			@Pc(41) int local41;
			do {
				if (!method25797(local2[3])) {
					return;
				}
				local37 = anInt3790;
				local39 = anInt3787;
				local41 = anInt3788;
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
			arg0.method20744(local37, local41, local39 - local37, arg4, 1);
		}
	}

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "()V")
	static void method25794() {
		anInt3789 = 0;
	}

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "([III)V")
	static void method25795(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3789 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray352 == null || anIntArray352.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3789; local16++) {
				local14[local16] = anIntArray352[local16];
			}
			anIntArray352 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray352[anInt3789++] = arg0[local37];
				anIntArray352[anInt3789++] = local48;
				anIntArray352[anInt3789++] = arg0[local16];
				anIntArray352[anInt3789++] = local54;
			} else if (local54 < local48) {
				anIntArray352[anInt3789++] = arg0[local16];
				anIntArray352[anInt3789++] = local54;
				anIntArray352[anInt3789++] = arg0[local37];
				anIntArray352[anInt3789++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "(II)V")
	static void method25796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray352[local10 - 4];
					@Pc(23) int local23 = anIntArray352[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray352[local10 - 4] = local23;
						anIntArray352[local10] = local19;
						local19 = anIntArray352[local10 - 2];
						anIntArray352[local10 - 2] = anIntArray352[local10 + 2];
						anIntArray352[local10 + 2] = local19;
						local19 = anIntArray352[local10 - 1];
						anIntArray352[local10 - 1] = anIntArray352[local10 + 3];
						anIntArray352[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "(I)Z")
	static boolean method25797(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt3791;
		@Pc(3) int local3 = anInt3792;
		@Pc(5) int local5 = anInt3788;
		while (local3 >= local1) {
			local5++;
			anInt3788 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(18) int local18 = anInt3786;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3789) {
				local27 = anIntArray352[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray352[local1];
				@Pc(41) int local41 = anIntArray352[local1 + 2];
				@Pc(47) int local47 = anIntArray352[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray352[local1] = local63;
				anIntArray352[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray352[local27 + 3];
				if (local5 >= local35) {
					anIntArray352[local27] = anIntArray352[local18];
					anIntArray352[local27 + 1] = anIntArray352[local18 + 1];
					anIntArray352[local27 + 2] = anIntArray352[local18 + 2];
					anIntArray352[local27 + 3] = anIntArray352[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3789) {
				anInt3789 = 0;
				return false;
			}
			method25806(local18, local1);
			anInt3786 = local18;
			anInt3791 = local1;
			local3 = local18;
		}
		anInt3790 = anIntArray352[local3] >> 16;
		anInt3787 = anIntArray352[local3 + 4] >> 16;
		anIntArray352[local3] += anIntArray352[local3 + 2];
		anIntArray352[local3 + 4] += anIntArray352[local3 + 6];
		local3 += 8;
		anInt3792 = local3;
		return true;
	}

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "(II)V")
	static void method25798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray352[arg0];
		@Pc(17) int local17 = anIntArray352[arg0 + 1];
		@Pc(23) int local23 = anIntArray352[arg0 + 2];
		@Pc(29) int local29 = anIntArray352[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray352[local33 + 1];
			if (local42 < local17) {
				anIntArray352[local7] = anIntArray352[local33];
				anIntArray352[local7 + 1] = local42;
				anIntArray352[local7 + 2] = anIntArray352[local33 + 2];
				anIntArray352[local7 + 3] = anIntArray352[local33 + 3];
				local7 += 4;
				anIntArray352[local33] = anIntArray352[local7];
				anIntArray352[local33 + 1] = anIntArray352[local7 + 1];
				anIntArray352[local33 + 2] = anIntArray352[local7 + 2];
				anIntArray352[local33 + 3] = anIntArray352[local7 + 3];
			}
		}
		anIntArray352[local7] = local11;
		anIntArray352[local7 + 1] = local17;
		anIntArray352[local7 + 2] = local23;
		anIntArray352[local7 + 3] = local29;
		method25798(arg0, local7);
		method25798(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "(II)V")
	static void method25799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray352[arg0];
		@Pc(17) int local17 = anIntArray352[arg0 + 1];
		@Pc(23) int local23 = anIntArray352[arg0 + 2];
		@Pc(29) int local29 = anIntArray352[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray352[local33 + 1];
			if (local42 < local17) {
				anIntArray352[local7] = anIntArray352[local33];
				anIntArray352[local7 + 1] = local42;
				anIntArray352[local7 + 2] = anIntArray352[local33 + 2];
				anIntArray352[local7 + 3] = anIntArray352[local33 + 3];
				local7 += 4;
				anIntArray352[local33] = anIntArray352[local7];
				anIntArray352[local33 + 1] = anIntArray352[local7 + 1];
				anIntArray352[local33 + 2] = anIntArray352[local7 + 2];
				anIntArray352[local33 + 3] = anIntArray352[local7 + 3];
			}
		}
		anIntArray352[local7] = local11;
		anIntArray352[local7 + 1] = local17;
		anIntArray352[local7 + 2] = local23;
		anIntArray352[local7 + 3] = local29;
		method25798(arg0, local7);
		method25798(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "(Lclient!dh;[II)V")
	public static void method25800(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method25793(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(Lclient!dh;[II)V")
	public static void method25801(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method25793(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "(Lclient!dh;[II[I[I)V")
	public static void method25802(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method25793(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "()V")
	static void method25803() {
		anInt3789 = 0;
	}

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "()V")
	static void method25804() {
		anInt3789 = 0;
	}

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "()V")
	static void method25805() {
		anInt3789 = 0;
	}

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "(II)V")
	static void method25806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray352[local10 - 4];
					@Pc(23) int local23 = anIntArray352[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray352[local10 - 4] = local23;
						anIntArray352[local10] = local19;
						local19 = anIntArray352[local10 - 2];
						anIntArray352[local10 - 2] = anIntArray352[local10 + 2];
						anIntArray352[local10 + 2] = local19;
						local19 = anIntArray352[local10 - 1];
						anIntArray352[local10 - 1] = anIntArray352[local10 + 3];
						anIntArray352[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "()V")
	static void method25807() {
		anInt3789 = 0;
	}

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "([III)V")
	static void method25808(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3789 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray352 == null || anIntArray352.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3789; local16++) {
				local14[local16] = anIntArray352[local16];
			}
			anIntArray352 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray352[anInt3789++] = arg0[local37];
				anIntArray352[anInt3789++] = local48;
				anIntArray352[anInt3789++] = arg0[local16];
				anIntArray352[anInt3789++] = local54;
			} else if (local54 < local48) {
				anIntArray352[anInt3789++] = arg0[local16];
				anIntArray352[anInt3789++] = local54;
				anIntArray352[anInt3789++] = arg0[local37];
				anIntArray352[anInt3789++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!ds", name = "ae", descriptor = "(II)V")
	static void method25809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray352[local10 - 4];
					@Pc(23) int local23 = anIntArray352[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray352[local10 - 4] = local23;
						anIntArray352[local10] = local19;
						local19 = anIntArray352[local10 - 2];
						anIntArray352[local10 - 2] = anIntArray352[local10 + 2];
						anIntArray352[local10 + 2] = local19;
						local19 = anIntArray352[local10 - 1];
						anIntArray352[local10 - 1] = anIntArray352[local10 + 3];
						anIntArray352[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "(I)V")
	static void method25810(@OriginalArg(0) int arg0) {
		if (anInt3789 < 0) {
			anInt3792 = 0;
			anInt3791 = 0;
			anInt3786 = 0;
			anInt3788 = 2147483646;
			return;
		}
		method25798(0, anInt3789);
		@Pc(17) int local17 = anIntArray352[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3789; local26 += 4) {
			@Pc(35) int local35 = anIntArray352[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray352[local26];
			@Pc(49) int local49 = anIntArray352[local26 + 2];
			@Pc(55) int local55 = anIntArray352[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray352[local26] = local71 + (local17 - local35) * local65;
			anIntArray352[local26 + 2] = local65;
		}
		anInt3786 = local24;
		anInt3791 = local26;
		anInt3792 = local26;
		anInt3788 = local17 - 1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	static void method25811(@OriginalArg(0) int arg0) {
		if (anInt3789 < 0) {
			anInt3792 = 0;
			anInt3791 = 0;
			anInt3786 = 0;
			anInt3788 = 2147483646;
			return;
		}
		method25798(0, anInt3789);
		@Pc(17) int local17 = anIntArray352[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3789; local26 += 4) {
			@Pc(35) int local35 = anIntArray352[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray352[local26];
			@Pc(49) int local49 = anIntArray352[local26 + 2];
			@Pc(55) int local55 = anIntArray352[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray352[local26] = local71 + (local17 - local35) * local65;
			anIntArray352[local26 + 2] = local65;
		}
		anInt3786 = local24;
		anInt3791 = local26;
		anInt3792 = local26;
		anInt3788 = local17 - 1;
	}

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "(I)V")
	static void method25812(@OriginalArg(0) int arg0) {
		if (anInt3789 < 0) {
			anInt3792 = 0;
			anInt3791 = 0;
			anInt3786 = 0;
			anInt3788 = 2147483646;
			return;
		}
		method25798(0, anInt3789);
		@Pc(17) int local17 = anIntArray352[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3789; local26 += 4) {
			@Pc(35) int local35 = anIntArray352[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray352[local26];
			@Pc(49) int local49 = anIntArray352[local26 + 2];
			@Pc(55) int local55 = anIntArray352[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray352[local26] = local71 + (local17 - local35) * local65;
			anIntArray352[local26 + 2] = local65;
		}
		anInt3786 = local24;
		anInt3791 = local26;
		anInt3792 = local26;
		anInt3788 = local17 - 1;
	}

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "(II)V")
	static void method25813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray352[arg0];
		@Pc(17) int local17 = anIntArray352[arg0 + 1];
		@Pc(23) int local23 = anIntArray352[arg0 + 2];
		@Pc(29) int local29 = anIntArray352[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray352[local33 + 1];
			if (local42 < local17) {
				anIntArray352[local7] = anIntArray352[local33];
				anIntArray352[local7 + 1] = local42;
				anIntArray352[local7 + 2] = anIntArray352[local33 + 2];
				anIntArray352[local7 + 3] = anIntArray352[local33 + 3];
				local7 += 4;
				anIntArray352[local33] = anIntArray352[local7];
				anIntArray352[local33 + 1] = anIntArray352[local7 + 1];
				anIntArray352[local33 + 2] = anIntArray352[local7 + 2];
				anIntArray352[local33 + 3] = anIntArray352[local7 + 3];
			}
		}
		anIntArray352[local7] = local11;
		anIntArray352[local7 + 1] = local17;
		anIntArray352[local7 + 2] = local23;
		anIntArray352[local7 + 3] = local29;
		method25798(arg0, local7);
		method25798(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "([III)V")
	static void method25814(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3789 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray352 == null || anIntArray352.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3789; local16++) {
				local14[local16] = anIntArray352[local16];
			}
			anIntArray352 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray352[anInt3789++] = arg0[local37];
				anIntArray352[anInt3789++] = local48;
				anIntArray352[anInt3789++] = arg0[local16];
				anIntArray352[anInt3789++] = local54;
			} else if (local54 < local48) {
				anIntArray352[anInt3789++] = arg0[local16];
				anIntArray352[anInt3789++] = local54;
				anIntArray352[anInt3789++] = arg0[local37];
				anIntArray352[anInt3789++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "(II)V")
	static void method25815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray352[local10 - 4];
					@Pc(23) int local23 = anIntArray352[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray352[local10 - 4] = local23;
						anIntArray352[local10] = local19;
						local19 = anIntArray352[local10 - 2];
						anIntArray352[local10 - 2] = anIntArray352[local10 + 2];
						anIntArray352[local10 + 2] = local19;
						local19 = anIntArray352[local10 - 1];
						anIntArray352[local10 - 1] = anIntArray352[local10 + 3];
						anIntArray352[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(Lclient!dh;[II)V")
	public static void method25816(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method25793(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	Class232() throws Throwable {
		throw new Error();
	}
}

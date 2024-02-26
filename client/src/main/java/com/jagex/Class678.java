package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yc")
public final class Class678 {

	@OriginalMember(owner = "client!yc", name = "aq", descriptor = "I")
	static int anInt5742;

	@OriginalMember(owner = "client!yc", name = "y", descriptor = "([I[Ljava/lang/Object;)V")
	public static void method33598(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Class607.method32176(arg0, arg1, 0, arg0.length - 1, -800220381);
	}

	@OriginalMember(owner = "client!yc", name = "k", descriptor = "([I[III)V")
	public static void method33599(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class271.method26702(arg0, arg1, arg2, local10 - 1, -280306393);
		Class271.method26702(arg0, arg1, local10 + 1, arg3, 565187327);
	}

	@OriginalMember(owner = "client!yc", name = "x", descriptor = "([J[I)V")
	public static void method33600(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Class697.method37052(arg0, arg1, 0, arg0.length - 1, (short) -13167);
	}

	@OriginalMember(owner = "client!yc", name = "w", descriptor = "([J[III)V")
	static void method33601(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = local14 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < (long) (local48 & local46) + local14) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) int local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class697.method37052(arg0, arg1, arg2, local10 - 1, (short) 2006);
		Class697.method37052(arg0, arg1, local10 + 1, arg3, (short) -13617);
	}

	@OriginalMember(owner = "client!yc", name = "d", descriptor = "([I[F[F)V")
	public static void method33602(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		Class150.method14522(arg0, arg1, arg2, 0, arg0.length - 1, -1729959424);
	}

	@OriginalMember(owner = "client!yc", name = "q", descriptor = "([F[III)V")
	public static void method33603(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) float local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (arg0[local40] > local14) {
				@Pc(53) float local53 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local53;
				@Pc(67) int local67 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local67;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class594.method31956(arg0, arg1, arg2, local10 - 1, 1065593733);
		Class594.method31956(arg0, arg1, local10 + 1, arg3, 981203865);
	}

	@OriginalMember(owner = "client!yc", name = "h", descriptor = "([I[F[F)V")
	public static void method33604(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		Class150.method14522(arg0, arg1, arg2, 0, arg0.length - 1, -1729959424);
	}

	@OriginalMember(owner = "client!yc", name = "p", descriptor = "([I[F[FII)V")
	static void method33605(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(8) int local8 = (arg4 + arg3) / 2;
		@Pc(10) int local10 = arg3;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg4];
		arg0[arg4] = local14;
		@Pc(28) float local28 = arg1[local8];
		arg1[local8] = arg1[arg4];
		arg1[arg4] = local28;
		@Pc(42) float local42 = arg2[local8];
		arg2[local8] = arg2[arg4];
		arg2[arg4] = local42;
		@Pc(61) int local61 = Long.MAX_VALUE == (long) local14 ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg4; local63++) {
			if (arg0[local63] < local14 + (local63 & local61)) {
				@Pc(79) int local79 = arg0[local63];
				arg0[local63] = arg0[local10];
				arg0[local10] = local79;
				@Pc(93) float local93 = arg1[local63];
				arg1[local63] = arg1[local10];
				arg1[local10] = local93;
				@Pc(107) float local107 = arg2[local63];
				arg2[local63] = arg2[local10];
				arg2[local10] = local107;
				local10++;
			}
		}
		arg0[arg4] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg4] = arg1[local10];
		arg1[local10] = local28;
		arg2[arg4] = arg2[local10];
		arg2[local10] = local42;
		Class150.method14522(arg0, arg1, arg2, arg3, local10 - 1, -1729959424);
		Class150.method14522(arg0, arg1, arg2, local10 + 1, arg4, -1729959424);
	}

	@OriginalMember(owner = "client!yc", name = "z", descriptor = "([I[F[F)V")
	public static void method33606(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		Class150.method14522(arg0, arg1, arg2, 0, arg0.length - 1, -1729959424);
	}

	@OriginalMember(owner = "client!yc", name = "b", descriptor = "([I[Ljava/lang/Object;II)V")
	public static void method33607(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) Object local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class607.method32176(arg0, arg1, arg2, local10 - 1, -1149030113);
		Class607.method32176(arg0, arg1, local10 + 1, arg3, 1729018763);
	}

	@OriginalMember(owner = "client!yc", name = "v", descriptor = "([I[Ljava/lang/Object;)V")
	public static void method33608(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Class607.method32176(arg0, arg1, 0, arg0.length - 1, 1535128033);
	}

	@OriginalMember(owner = "client!yc", name = "ai", descriptor = "([J[Ljava/lang/Object;)V")
	public static void method33609(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Class68.method1248(arg0, arg1, 0, arg0.length - 1, 363301683);
	}

	@OriginalMember(owner = "client!yc", name = "aq", descriptor = "([J[Ljava/lang/Object;II)V")
	static void method33610(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < (long) (local48 & local46) + local14) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) Object local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class68.method1248(arg0, arg1, arg2, local10 - 1, 1220990448);
		Class68.method1248(arg0, arg1, local10 + 1, arg3, 1610735857);
	}

	@OriginalMember(owner = "client!yc", name = "c", descriptor = "([I[Ljava/lang/Object;II)V")
	public static void method33611(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) Object local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class607.method32176(arg0, arg1, arg2, local10 - 1, 1075699434);
		Class607.method32176(arg0, arg1, local10 + 1, arg3, -1133691939);
	}

	@OriginalMember(owner = "client!yc", name = "ax", descriptor = "([I[Ljava/lang/Object;II)V")
	public static void method33612(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) Object local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class607.method32176(arg0, arg1, arg2, local10 - 1, 408945115);
		Class607.method32176(arg0, arg1, local10 + 1, arg3, -201733577);
	}

	@OriginalMember(owner = "client!yc", name = "ay", descriptor = "([J[Ljava/lang/Object;)V")
	public static void method33613(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Class68.method1248(arg0, arg1, 0, arg0.length - 1, 1323243186);
	}

	@OriginalMember(owner = "client!yc", name = "r", descriptor = "([F[III)V")
	public static void method33614(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) float local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (arg0[local40] > local14) {
				@Pc(53) float local53 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local53;
				@Pc(67) int local67 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local67;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class594.method31956(arg0, arg1, arg2, local10 - 1, 1774388827);
		Class594.method31956(arg0, arg1, local10 + 1, arg3, 823537584);
	}

	@OriginalMember(owner = "client!yc", name = "n", descriptor = "([I[Ljava/lang/Object;II)V")
	public static void method33615(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) Object local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class607.method32176(arg0, arg1, arg2, local10 - 1, -1030566807);
		Class607.method32176(arg0, arg1, local10 + 1, arg3, 596394695);
	}

	@OriginalMember(owner = "client!yc", name = "ask", descriptor = "(Lclient!yp;B)V")
	static void method33616(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local12 != Class703.aClass80_Sub37_49.aClass165_Sub35_1.method16584(1984306845)) {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub35_1, local12, (byte) 79);
			Class719.method37291(-446700841);
			client.aBoolean714 = false;
			client.aClass539_1.method30938(154724784);
		}
	}

	@OriginalMember(owner = "client!yc", name = "awz", descriptor = "(Lclient!yp;I)V")
	static void method33617(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class665.method33454(5, local13, local23, "", 800071483);
	}

	@OriginalMember(owner = "client!yc", name = "<init>", descriptor = "()V")
	Class678() throws Throwable {
		throw new Error();
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yg")
public class Class682 {

	@OriginalMember(owner = "client!yg", name = "hb", descriptor = "Lclient!aoa;")
	public static Class32_Sub1 aClass32_Sub1_3;

	@OriginalMember(owner = "client!yg", name = "<init>", descriptor = "()V", line = 4)
	Class682() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yg", name = "r", descriptor = "([Ljava/lang/String;[I)V", line = 9)
	public static void method33246(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Class370.method27992(arg0, arg1, 0, arg0.length - 1, -1719604443);
	}

	@OriginalMember(owner = "client!yg", name = "v", descriptor = "([Ljava/lang/String;[I)V", line = 9)
	public static void method33247(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Class370.method27992(arg0, arg1, 0, arg0.length - 1, -1949764210);
	}

	@OriginalMember(owner = "client!yg", name = "o", descriptor = "([Ljava/lang/String;[I)V", line = 9)
	public static void method33248(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Class370.method27992(arg0, arg1, 0, arg0.length - 1, -2068008915);
	}

	@OriginalMember(owner = "client!yg", name = "s", descriptor = "([Ljava/lang/String;[I)V", line = 9)
	public static void method33249(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Class370.method27992(arg0, arg1, 0, arg0.length - 1, -2072372579);
	}

	@OriginalMember(owner = "client!yg", name = "y", descriptor = "([Ljava/lang/String;[III)V", line = 13)
	static void method33250(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(64) String local64 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local64;
				@Pc(78) int local78 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local78;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class370.method27992(arg0, arg1, arg2, local10 - 1, -2128411285);
		Class370.method27992(arg0, arg1, local10 + 1, arg3, -1687509394);
	}

	@OriginalMember(owner = "client!yg", name = "q", descriptor = "([I[III)V", line = 43)
	public static void method33251(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local14 + (local47 & local45)) {
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
		Class86.method1494(arg0, arg1, arg2, local10 - 1, 1815175593);
		Class86.method1494(arg0, arg1, local10 + 1, arg3, 1815175593);
	}

	@OriginalMember(owner = "client!yg", name = "b", descriptor = "([I[III)V", line = 43)
	public static void method33252(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local14 + (local47 & local45)) {
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
		Class86.method1494(arg0, arg1, arg2, local10 - 1, 1815175593);
		Class86.method1494(arg0, arg1, local10 + 1, arg3, 1815175593);
	}

	@OriginalMember(owner = "client!yg", name = "x", descriptor = "([I[III)V", line = 43)
	public static void method33253(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local14 + (local47 & local45)) {
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
		Class86.method1494(arg0, arg1, arg2, local10 - 1, 1815175593);
		Class86.method1494(arg0, arg1, local10 + 1, arg3, 1815175593);
	}

	@OriginalMember(owner = "client!yg", name = "h", descriptor = "([J[I)V", line = 74)
	public static void method33254(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Class550.method31029(arg0, arg1, 0, arg0.length - 1, -1881491413);
	}

	@OriginalMember(owner = "client!yg", name = "a", descriptor = "([J[I)V", line = 74)
	public static void method33255(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Class550.method31029(arg0, arg1, 0, arg0.length - 1, -1153652072);
	}

	@OriginalMember(owner = "client!yg", name = "g", descriptor = "([J[III)V", line = 78)
	static void method33256(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
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
		Class550.method31029(arg0, arg1, arg2, local10 - 1, -217959184);
		Class550.method31029(arg0, arg1, local10 + 1, arg3, -1364012830);
	}

	@OriginalMember(owner = "client!yg", name = "i", descriptor = "([J[III)V", line = 78)
	static void method33257(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
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
		Class550.method31029(arg0, arg1, arg2, local10 - 1, -1352808701);
		Class550.method31029(arg0, arg1, local10 + 1, arg3, -1209641182);
	}

	@OriginalMember(owner = "client!yg", name = "j", descriptor = "([J[III)V", line = 78)
	static void method33258(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
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
		Class550.method31029(arg0, arg1, arg2, local10 - 1, -1131100612);
		Class550.method31029(arg0, arg1, local10 + 1, arg3, -1430072103);
	}

	@OriginalMember(owner = "client!yg", name = "z", descriptor = "(IB)V", line = 107)
	public static void method33259(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(5, (long) arg0);
		local4.method21885(2147321963);
	}

	@OriginalMember(owner = "client!yg", name = "t", descriptor = "([F[III)V", line = 109)
	public static void method33260(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
		Class630.method32271(arg0, arg1, arg2, local10 - 1, -1903837015);
		Class630.method32271(arg0, arg1, local10 + 1, arg3, -1983157083);
	}

	@OriginalMember(owner = "client!yg", name = "ae", descriptor = "([F[III)V", line = 109)
	public static void method33261(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
		Class630.method32271(arg0, arg1, arg2, local10 - 1, -1736051735);
		Class630.method32271(arg0, arg1, local10 + 1, arg3, -2061980658);
	}

	@OriginalMember(owner = "client!yg", name = "ah", descriptor = "([I[F[F)V", line = 139)
	public static void method33262(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		Class685.method33435(arg0, arg1, arg2, 0, arg0.length - 1, -1599195049);
	}

	@OriginalMember(owner = "client!yg", name = "ag", descriptor = "([I[F[F)V", line = 139)
	public static void method33263(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		Class685.method33435(arg0, arg1, arg2, 0, arg0.length - 1, -1552954774);
	}

	@OriginalMember(owner = "client!yg", name = "al", descriptor = "([I[F[FII)V", line = 143)
	static void method33264(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
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
		@Pc(61) int local61 = (long) local14 == Long.MAX_VALUE ? 0 : 1;
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
		Class685.method33435(arg0, arg1, arg2, arg3, local10 - 1, -1547382101);
		Class685.method33435(arg0, arg1, arg2, local10 + 1, arg4, -1765278376);
	}

	@OriginalMember(owner = "client!yg", name = "ai", descriptor = "([I[F[FII)V", line = 143)
	static void method33265(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
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
		@Pc(61) int local61 = (long) local14 == Long.MAX_VALUE ? 0 : 1;
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
		Class685.method33435(arg0, arg1, arg2, arg3, local10 - 1, -1514119238);
		Class685.method33435(arg0, arg1, arg2, local10 + 1, arg4, -1630252514);
	}

	@OriginalMember(owner = "client!yg", name = "ac", descriptor = "([I[F[FII)V", line = 143)
	static void method33266(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
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
		@Pc(61) int local61 = (long) local14 == Long.MAX_VALUE ? 0 : 1;
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
		Class685.method33435(arg0, arg1, arg2, arg3, local10 - 1, -2118994743);
		Class685.method33435(arg0, arg1, arg2, local10 + 1, arg4, -1595384860);
	}

	@OriginalMember(owner = "client!yg", name = "aw", descriptor = "([I[F[FII)V", line = 143)
	static void method33267(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
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
		@Pc(61) int local61 = (long) local14 == Long.MAX_VALUE ? 0 : 1;
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
		Class685.method33435(arg0, arg1, arg2, arg3, local10 - 1, -1784090527);
		Class685.method33435(arg0, arg1, arg2, local10 + 1, arg4, -2029191397);
	}

	@OriginalMember(owner = "client!yg", name = "as", descriptor = "([I[Ljava/lang/Object;)V", line = 183)
	public static void method33268(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Class350.method27635(arg0, arg1, 0, arg0.length - 1, -350168178);
	}

	@OriginalMember(owner = "client!yg", name = "p", descriptor = "(II)I", line = 184)
	public static int method33269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local40 == local8) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local40 == local17) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		@Pc(143) int local143 = (int) (local54 * 256.0D);
		@Pc(148) int local148 = (int) (local56 * 256.0D);
		@Pc(153) int local153 = (int) (local62 * 256.0D);
		if (local148 < 0) {
			local148 = 0;
		} else if (local148 > 255) {
			local148 = 255;
		}
		if (local153 < 0) {
			local153 = 0;
		} else if (local153 > 255) {
			local153 = 255;
		}
		if (local153 > 243) {
			local148 >>= 0x4;
		} else if (local153 > 217) {
			local148 >>= 0x3;
		} else if (local153 > 192) {
			local148 >>= 0x2;
		} else if (local153 > 179) {
			local148 >>= 0x1;
		}
		return ((local143 >> 2 & 0x3F) << 10) + (local148 >> 5 << 7) + (local153 >> 1);
	}

	@OriginalMember(owner = "client!yg", name = "ad", descriptor = "([I[Ljava/lang/Object;II)V", line = 187)
	public static void method33270(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local14 + (local47 & local45)) {
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
		Class350.method27635(arg0, arg1, arg2, local10 - 1, -2039913917);
		Class350.method27635(arg0, arg1, local10 + 1, arg3, 90953238);
	}

	@OriginalMember(owner = "client!yg", name = "at", descriptor = "([I[Ljava/lang/Object;II)V", line = 187)
	public static void method33271(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local14 + (local47 & local45)) {
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
		Class350.method27635(arg0, arg1, arg2, local10 - 1, -2044885816);
		Class350.method27635(arg0, arg1, local10 + 1, arg3, 1468851737);
	}

	@OriginalMember(owner = "client!yg", name = "am", descriptor = "([J[Ljava/lang/Object;)V", line = 218)
	public static void method33272(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Class681.method33245(arg0, arg1, 0, arg0.length - 1, -2091183613);
	}

	@OriginalMember(owner = "client!yg", name = "au", descriptor = "([J[Ljava/lang/Object;)V", line = 218)
	public static void method33273(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Class681.method33245(arg0, arg1, 0, arg0.length - 1, -2060790941);
	}

	@OriginalMember(owner = "client!yg", name = "ap", descriptor = "([J[Ljava/lang/Object;II)V", line = 222)
	static void method33274(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
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
		Class681.method33245(arg0, arg1, arg2, local10 - 1, -2002699640);
		Class681.method33245(arg0, arg1, local10 + 1, arg3, -1385252800);
	}

	@OriginalMember(owner = "client!yg", name = "ar", descriptor = "([J[Ljava/lang/Object;II)V", line = 222)
	static void method33275(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
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
		Class681.method33245(arg0, arg1, arg2, local10 - 1, -1003786798);
		Class681.method33245(arg0, arg1, local10 + 1, arg3, -885990213);
	}

	@OriginalMember(owner = "client!yg", name = "aq", descriptor = "([J[Ljava/lang/Object;II)V", line = 222)
	static void method33276(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
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
		Class681.method33245(arg0, arg1, arg2, local10 - 1, -1603925978);
		Class681.method33245(arg0, arg1, local10 + 1, arg3, -1932717957);
	}

	@OriginalMember(owner = "client!yg", name = "aak", descriptor = "(Lclient!yf;I)V", line = 9655)
	static final void method33277(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		Class625.method32242(local13, (byte) 1);
	}

	@OriginalMember(owner = "client!yg", name = "alx", descriptor = "(Lclient!yf;S)V", line = 11988)
	static final void method33278(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		System.out.println(arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375]);
	}
}

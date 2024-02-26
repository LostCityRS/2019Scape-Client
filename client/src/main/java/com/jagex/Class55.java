package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Random;

@OriginalClass("client!acd")
public final class Class55 {

	@OriginalMember(owner = "client!acd", name = "t", descriptor = "Ljava/util/Random;")
	static Random aRandom1;

	@OriginalMember(owner = "client!acd", name = "f", descriptor = "Ljava/lang/Object;")
	static final Object anObject3 = new Object();

	@OriginalMember(owner = "client!acd", name = "e", descriptor = "[I")
	static int[] anIntArray25 = new int[33];

	static {
		anIntArray25[0] = 0;
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 1; local14 < 33; local14++) {
			anIntArray25[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!acd", name = "n", descriptor = "(II)I")
	public static int method1098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!acd", name = "s", descriptor = "(I)I")
	public static int method1099(@OriginalArg(0) int arg0) {
		return anIntArray25[arg0];
	}

	@OriginalMember(owner = "client!acd", name = "y", descriptor = "(I)I")
	public static int method1100(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!acd", name = "x", descriptor = "(I)I")
	public static int method1101(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(27) int local27 = (local19 >>> 4) + local19 & 0xF0F0F0F;
		@Pc(33) int local33 = local27 + (local27 >>> 8);
		@Pc(39) int local39 = local33 + (local33 >>> 16);
		return local39 & 0xFF;
	}

	@OriginalMember(owner = "client!acd", name = "w", descriptor = "(III)I")
	public static int method1102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class210.method25806(arg2 - arg1 + 1, 2059800969);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 & ~local11;
	}

	@OriginalMember(owner = "client!acd", name = "r", descriptor = "(III)I")
	public static int method1103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class210.method25806(arg2 - arg1 + 1, -1889379006);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 & ~local11;
	}

	@OriginalMember(owner = "client!acd", name = "p", descriptor = "(I)Z")
	public static boolean method1104(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!acd", name = "h", descriptor = "(I)I")
	public static int method1105(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!acd", name = "k", descriptor = "(I)I")
	public static int method1106(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(27) int local27 = (local19 >>> 4) + local19 & 0xF0F0F0F;
		@Pc(33) int local33 = local27 + (local27 >>> 8);
		@Pc(39) int local39 = local33 + (local33 >>> 16);
		return local39 & 0xFF;
	}

	@OriginalMember(owner = "client!acd", name = "c", descriptor = "(Ljava/util/Random;I)I")
	public static int method1107(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			arg0 = aRandom1;
			if (arg0 == null) {
				@Pc(9) Object local9 = anObject3;
				synchronized (anObject3) {
					if (aRandom1 == null) {
						aRandom1 = new Random();
					}
					arg0 = aRandom1;
				}
			}
		}
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Class523.method30651(arg1, 592772674)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(57) int local57 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(60) int local60;
			do {
				local60 = arg0.nextInt();
			} while (local60 >= local57);
			return Class612.method32229(local60, arg1, -2110774673);
		}
	}

	@OriginalMember(owner = "client!acd", name = "v", descriptor = "(I)Z")
	public static boolean method1108(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!acd", name = "d", descriptor = "(I)I")
	public static int method1109(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!acd", name = "q", descriptor = "(III)I")
	public static int method1110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class210.method25806(arg2 - arg1 + 1, -2084429470);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 | local11;
	}

	@OriginalMember(owner = "client!acd", name = "z", descriptor = "(I)Z")
	public static boolean method1111(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!acd", name = "b", descriptor = "(Ljava/util/Random;I)I")
	public static int method1112(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			arg0 = aRandom1;
			if (arg0 == null) {
				@Pc(9) Object local9 = anObject3;
				synchronized (anObject3) {
					if (aRandom1 == null) {
						aRandom1 = new Random();
					}
					arg0 = aRandom1;
				}
			}
		}
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Class523.method30651(arg1, 1256901671)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(57) int local57 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(60) int local60;
			do {
				local60 = arg0.nextInt();
			} while (local60 >= local57);
			return Class612.method32229(local60, arg1, -1436905519);
		}
	}

	@OriginalMember(owner = "client!acd", name = "nf", descriptor = "(Lclient!yp;I)V")
	static void method1113(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2043226455);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class542.method31171(local16, local22, arg0, 1806019531);
	}

	@OriginalMember(owner = "client!acd", name = "<init>", descriptor = "()V")
	Class55() throws Throwable {
		throw new Error();
	}
}

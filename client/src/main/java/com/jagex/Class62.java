package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acl")
public final class Class62 {

	@OriginalMember(owner = "client!acl", name = "e", descriptor = "Ljava/util/Random;")
	static Random aRandom1;

	@OriginalMember(owner = "client!acl", name = "n", descriptor = "Ljava/lang/Object;")
	static final Object anObject3 = new Object();

	@OriginalMember(owner = "client!acl", name = "m", descriptor = "[I")
	static int[] anIntArray16 = new int[33];

	static {
		anIntArray16[0] = 0;
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 1; local14 < 33; local14++) {
			anIntArray16[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!acl", name = "i", descriptor = "(I)I")
	public static int method1133(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!acl", name = "c", descriptor = "(I)I")
	public static int method1134(@OriginalArg(0) int arg0) {
		return anIntArray16[arg0];
	}

	@OriginalMember(owner = "client!acl", name = "r", descriptor = "(I)I")
	public static int method1135(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(27) int local27 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(33) int local33 = local27 + (local27 >>> 8);
		@Pc(39) int local39 = local33 + (local33 >>> 16);
		return local39 & 0xFF;
	}

	@OriginalMember(owner = "client!acl", name = "v", descriptor = "(I)I")
	public static int method1136(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(27) int local27 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(33) int local33 = local27 + (local27 >>> 8);
		@Pc(39) int local39 = local33 + (local33 >>> 16);
		return local39 & 0xFF;
	}

	@OriginalMember(owner = "client!acl", name = "o", descriptor = "(III)I")
	public static int method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class8.method136(arg2 - arg1 + 1, 1187122022);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 & ~local11;
	}

	@OriginalMember(owner = "client!acl", name = "ah", descriptor = "(Ljava/util/Random;I)I")
	public static int method1138(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			arg0 = aRandom1;
			if (arg0 == null) {
				@Pc(10) Object local10 = anObject3;
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
		} else if (Class364.method28081(arg1, -1431357474)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(57) int local57 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(60) int local60;
			do {
				local60 = arg0.nextInt();
			} while (local60 >= local57);
			return Class580.method31568(local60, arg1, (byte) -91);
		}
	}

	@OriginalMember(owner = "client!acl", name = "y", descriptor = "(III)I")
	public static int method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class8.method136(arg2 - arg1 + 1, -1108709032);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 | local11;
	}

	@OriginalMember(owner = "client!acl", name = "q", descriptor = "(III)I")
	public static int method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class8.method136(arg2 - arg1 + 1, -2111383620);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 | local11;
	}

	@OriginalMember(owner = "client!acl", name = "x", descriptor = "(III)I")
	public static int method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class8.method136(arg2 - arg1 + 1, -1835318713);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 | local11;
	}

	@OriginalMember(owner = "client!acl", name = "al", descriptor = "(Ljava/util/Random;I)I")
	public static int method1142(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			arg0 = aRandom1;
			if (arg0 == null) {
				@Pc(10) Object local10 = anObject3;
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
		} else if (Class364.method28081(arg1, -1356672725)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(57) int local57 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(60) int local60;
			do {
				local60 = arg0.nextInt();
			} while (local60 >= local57);
			return Class580.method31568(local60, arg1, (byte) -66);
		}
	}

	@OriginalMember(owner = "client!acl", name = "h", descriptor = "(I)I")
	public static int method1143(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(27) int local27 = local21 | local21 >>> 8;
		@Pc(33) int local33 = local27 | local27 >>> 16;
		return arg0 & ~local33;
	}

	@OriginalMember(owner = "client!acl", name = "a", descriptor = "(I)Z")
	public static boolean method1144(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!acl", name = "g", descriptor = "(I)I")
	public static int method1145(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!acl", name = "b", descriptor = "(I)I")
	public static int method1146(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!acl", name = "j", descriptor = "(I)I")
	public static int method1147(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!acl", name = "t", descriptor = "(I)I")
	public static int method1148(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!acl", name = "s", descriptor = "(III)I")
	public static int method1149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class8.method136(arg2 - arg1 + 1, 832648567);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 & ~local11;
	}

	@OriginalMember(owner = "client!acl", name = "ag", descriptor = "(II)I")
	public static int method1150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!acl", name = "ae", descriptor = "(II)I")
	public static int method1151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!acl", name = "aps", descriptor = "(Lclient!yf;I)V")
	static void method1152(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class618.method32280((byte) -21).method37101();
	}

	@OriginalMember(owner = "client!acl", name = "ee", descriptor = "(IIIB)V")
	static void method1153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg0 == 1008) {
			Class165.method15332(Class155.aClass155_57, arg1, arg2, -532799195);
		} else if (arg0 == 1009) {
			Class165.method15332(Class155.aClass155_48, arg1, arg2, -532799195);
		} else if (arg0 == 1010) {
			Class165.method15332(Class155.aClass155_56, arg1, arg2, -532799195);
		} else if (arg0 == 1011) {
			Class165.method15332(Class155.aClass155_52, arg1, arg2, -532799195);
		} else if (arg0 == 1012) {
			Class165.method15332(Class155.aClass155_51, arg1, arg2, -532799195);
		}
	}

	@OriginalMember(owner = "client!acl", name = "gx", descriptor = "(IIILclient!do;I)Lclient!uq;")
	static Class600 method1154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) int arg4) {
		return arg3 == null ? null : new Class600(arg0, arg1, arg2, arg3.method6861(), arg3.method6863(), arg3.method6864(), arg3.method6882(), arg3.method6829(), arg3.method6867(), arg3.method6928());
	}

	@OriginalMember(owner = "client!acl", name = "u", descriptor = "(Lclient!uh;IILclient!st;I)V")
	public static void method1155(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface61 arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class681 local2 = Class96.method2324(1074031662);
		local2.anInterface61_1 = arg3;
		Class346.method27658(arg0, arg1, arg2, local2, 1677070776);
		local2.anInterface61_1 = null;
	}

	@OriginalMember(owner = "client!acl", name = "<init>", descriptor = "()V")
	Class62() throws Throwable {
		throw new Error();
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!art")
public final class Class80_Sub1_Sub9 extends Class80_Sub1 {

	@OriginalMember(owner = "client!art", name = "h", descriptor = "I")
	static final int anInt3048 = 8;

	@OriginalMember(owner = "client!art", name = "ay", descriptor = "I")
	static final int anInt3049 = 21;

	@OriginalMember(owner = "client!art", name = "a", descriptor = "I")
	static final int anInt3050 = 1;

	@OriginalMember(owner = "client!art", name = "s", descriptor = "I")
	static final int anInt3051 = 2;

	@OriginalMember(owner = "client!art", name = "k", descriptor = "I")
	static final int anInt3052 = 3;

	@OriginalMember(owner = "client!art", name = "x", descriptor = "I")
	static final int anInt3053 = 4;

	@OriginalMember(owner = "client!art", name = "w", descriptor = "I")
	static final int anInt3054 = 5;

	@OriginalMember(owner = "client!art", name = "p", descriptor = "I")
	static final int anInt3055 = 11;

	@OriginalMember(owner = "client!art", name = "q", descriptor = "I")
	static final int anInt3056 = 7;

	@OriginalMember(owner = "client!art", name = "al", descriptor = "J")
	static final long aLong230 = 500L;

	@OriginalMember(owner = "client!art", name = "d", descriptor = "I")
	static final int anInt3057 = 9;

	@OriginalMember(owner = "client!art", name = "z", descriptor = "I")
	static final int anInt3058 = 10;

	@OriginalMember(owner = "client!art", name = "v", descriptor = "I")
	static final int anInt3059 = 12;

	@OriginalMember(owner = "client!art", name = "c", descriptor = "I")
	static final int anInt3060 = 15;

	@OriginalMember(owner = "client!art", name = "y", descriptor = "I")
	static final int anInt3061 = 13;

	@OriginalMember(owner = "client!art", name = "n", descriptor = "I")
	static final int anInt3062 = 14;

	@OriginalMember(owner = "client!art", name = "r", descriptor = "I")
	static final int anInt3065 = 6;

	@OriginalMember(owner = "client!art", name = "ax", descriptor = "I")
	static final int anInt3066 = 20;

	@OriginalMember(owner = "client!art", name = "ai", descriptor = "I")
	static final int anInt3067 = 22;

	@OriginalMember(owner = "client!art", name = "aq", descriptor = "I")
	static final int anInt3068 = 23;

	@OriginalMember(owner = "client!art", name = "ag", descriptor = "J")
	static final long aLong231 = Long.MAX_VALUE;

	@OriginalMember(owner = "client!art", name = "ab", descriptor = "J")
	static final long aLong232 = Long.MIN_VALUE;

	@OriginalMember(owner = "client!art", name = "b", descriptor = "I")
	static final int anInt3069 = 17;

	@OriginalMember(owner = "client!art", name = "ao", descriptor = "Lclient!aaa;")
	static SecondaryLinkedList aSecondaryLinkedList_11 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!art", name = "aj", descriptor = "Lclient!aaa;")
	static SecondaryLinkedList aSecondaryLinkedList_12 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!art", name = "ac", descriptor = "Lclient!aax;")
	static Class24 aClass24_17 = new Class24(16);

	@OriginalMember(owner = "client!art", name = "ah", descriptor = "Z")
	static boolean aBoolean580 = false;

	@OriginalMember(owner = "client!art", name = "m", descriptor = "I")
	int anInt3047;

	@OriginalMember(owner = "client!art", name = "j", descriptor = "Ljava/lang/String;")
	String aString102;

	@OriginalMember(owner = "client!art", name = "o", descriptor = "I")
	int anInt3063;

	@OriginalMember(owner = "client!art", name = "i", descriptor = "I")
	int anInt3064;

	@OriginalMember(owner = "client!art", name = "bb", descriptor = "(I)V")
	public static void method22077(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(3, (long) arg0);
		local4.method22078(2091556697);
	}

	@OriginalMember(owner = "client!art", name = "be", descriptor = "(Lclient!ea;)V")
	public static void method22079(@OriginalArg(0) Class107 arg0) {
		@Pc(7) Class80_Sub1_Sub9 local7 = Class22.method545(1, (long) (arg0.anInt862 * -1873516487));
		local7.method22078(-655579132);
	}

	@OriginalMember(owner = "client!art", name = "dg", descriptor = "(ILjava/lang/String;)V")
	static void method22082(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(2, (long) arg0);
		local4.method22135(-457826299);
		local4.aString102 = arg1;
	}

	@OriginalMember(owner = "client!art", name = "dn", descriptor = "(ILjava/lang/String;)V")
	static void method22083(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(3, (long) arg0);
		local4.method22135(-457826299);
		local4.aString102 = arg1;
	}

	@OriginalMember(owner = "client!art", name = "ba", descriptor = "(IJ)Lclient!art;")
	static Class80_Sub1_Sub9 method22084(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		aBoolean580 = false;
		@Pc(11) Class80_Sub1_Sub9 local11 = (Class80_Sub1_Sub9) aClass24_17.method560((long) arg0 << 56 | arg1);
		if (local11 == null) {
			local11 = new Class80_Sub1_Sub9(arg0, arg1);
			aClass24_17.method563(local11, local11.aLong338 * 3209506792906532031L);
			aBoolean580 = true;
		}
		return local11;
	}

	@OriginalMember(owner = "client!art", name = "bt", descriptor = "(IJ)Lclient!art;")
	static Class80_Sub1_Sub9 method22085(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		aBoolean580 = false;
		@Pc(11) Class80_Sub1_Sub9 local11 = (Class80_Sub1_Sub9) aClass24_17.method560((long) arg0 << 56 | arg1);
		if (local11 == null) {
			local11 = new Class80_Sub1_Sub9(arg0, arg1);
			aClass24_17.method563(local11, local11.aLong338 * 3209506792906532031L);
			aBoolean580 = true;
		}
		return local11;
	}

	@OriginalMember(owner = "client!art", name = "bm", descriptor = "(I)V")
	public static void method22086(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(8, (long) arg0);
		local4.method22078(-960226945);
	}

	@OriginalMember(owner = "client!art", name = "bj", descriptor = "()V")
	static void method22087() {
		aClass24_17.method564(-1189426717);
		aSecondaryLinkedList_12.method41(-252802305);
		aSecondaryLinkedList_11.method41(-252802305);
	}

	@OriginalMember(owner = "client!art", name = "by", descriptor = "()Lclient!art;")
	static Class80_Sub1_Sub9 method22088() {
		@Pc(4) Class80_Sub1_Sub9 local4 = (Class80_Sub1_Sub9) aSecondaryLinkedList_11.head((byte) -109);
		if (local4 != null) {
			local4.method24395((byte) 101);
			local4.unlinkSecondary(-2147483646);
			return local4;
		}
		do {
			local4 = (Class80_Sub1_Sub9) aSecondaryLinkedList_12.head((byte) 2);
			if (local4 == null) {
				return null;
			}
			if (local4.method22096(-1811389590) > Class303.currentTimeMillis((byte) 46)) {
				return null;
			}
			local4.method24395((byte) 115);
			local4.unlinkSecondary(-2147483647);
		} while ((local4.dualKey * 4203303297430504511L & Long.MIN_VALUE) == 0L);
		return local4;
	}

	@OriginalMember(owner = "client!art", name = "cl", descriptor = "(II)V")
	static void method22089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(1, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "du", descriptor = "(IIII)V")
	static void method22090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(4, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!art", name = "dj", descriptor = "(IIII)V")
	static void method22091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(8, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!art", name = "bh", descriptor = "(Lclient!ea;)V")
	public static void method22092(@OriginalArg(0) Class107 arg0) {
		@Pc(7) Class80_Sub1_Sub9 local7 = Class22.method545(1, (long) (arg0.anInt862 * -1873516487));
		local7.method22078(-822142407);
	}

	@OriginalMember(owner = "client!art", name = "dc", descriptor = "(ILjava/lang/String;)V")
	static void method22093(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(2, (long) arg0);
		local4.method22135(-457826299);
		local4.aString102 = arg1;
	}

	@OriginalMember(owner = "client!art", name = "cv", descriptor = "(I)V")
	public static void method22094(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(9, (long) arg0);
		local4.method22078(-1122367747);
	}

	@OriginalMember(owner = "client!art", name = "cs", descriptor = "(I)V")
	public static void method22095(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(21, (long) arg0);
		local4.method22078(1080383577);
	}

	@OriginalMember(owner = "client!art", name = "bf", descriptor = "(I)V")
	public static void method22097(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(4, (long) arg0);
		local4.method22078(2098139449);
	}

	@OriginalMember(owner = "client!art", name = "ez", descriptor = "(IIII)V")
	static void method22098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(17, (long) arg1 << 32 | (long) arg0);
		local9.method22135(-457826299);
		local9.anInt3064 = arg2 * -1221031713;
		local9.anInt3047 = arg3 * 673180539;
	}

	@OriginalMember(owner = "client!art", name = "cq", descriptor = "(II)V")
	static void method22099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class374 local5 = (Class374) Class664.aClass41_Sub17_2.method18054(arg0, -136351679);
		@Pc(14) Class80_Sub1_Sub9 local14 = Class22.method545(1, (long) (local5.aClass107_1.anInt862 * -1873516487));
		try {
			if (aBoolean580) {
				local14.anInt3064 = Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method36980(local5.aClass107_1, -1591666667) * -1221031713;
			}
			local14.anInt3064 = local5.method28422(local14.anInt3064 * 1216164639, arg1, -1729896227) * -1221031713;
			local14.method22135(-457826299);
		} catch (@Pc(42) Exception_Sub6 local42) {
			Class603.method32133("" + arg0, local42, 839300151);
		}
	}

	@OriginalMember(owner = "client!art", name = "bx", descriptor = "(I)V")
	public static void method22100(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(5, (long) arg0);
		local4.method22078(-286640659);
	}

	@OriginalMember(owner = "client!art", name = "bi", descriptor = "(I)V")
	public static void method22101(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(7, (long) arg0);
		local4.method22078(-1242566188);
	}

	@OriginalMember(owner = "client!art", name = "bu", descriptor = "(I)V")
	public static void method22102(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(8, (long) arg0);
		local4.method22078(-1984129820);
	}

	@OriginalMember(owner = "client!art", name = "bc", descriptor = "(I)V")
	public static void method22103(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(4, (long) arg0);
		local4.method22078(-1155440752);
	}

	@OriginalMember(owner = "client!art", name = "ci", descriptor = "(II)V")
	public static void method22104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(17, (long) arg1 << 32 | (long) arg0);
		local9.method22078(153779009);
	}

	@OriginalMember(owner = "client!art", name = "bd", descriptor = "(I)V")
	public static void method22105(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(9, (long) arg0);
		local4.method22078(928764374);
	}

	@OriginalMember(owner = "client!art", name = "cd", descriptor = "(I)V")
	public static void method22106(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(9, (long) arg0);
		local4.method22078(305653170);
	}

	@OriginalMember(owner = "client!art", name = "dh", descriptor = "(ILjava/lang/String;)V")
	static void method22107(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(2, (long) arg0);
		local4.method22135(-457826299);
		local4.aString102 = arg1;
	}

	@OriginalMember(owner = "client!art", name = "ct", descriptor = "(I)V")
	public static void method22108(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(10, (long) arg0);
		local4.method22078(542914468);
	}

	@OriginalMember(owner = "client!art", name = "cn", descriptor = "(I)V")
	public static void method22109(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(10, (long) arg0);
		local4.method22078(-1988935172);
	}

	@OriginalMember(owner = "client!art", name = "cy", descriptor = "(I)V")
	public static void method22110(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(10, (long) arg0);
		local4.method22078(-43892561);
	}

	@OriginalMember(owner = "client!art", name = "ch", descriptor = "(I)V")
	public static void method22111(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(11, (long) arg0);
		local4.method22078(-23301615);
	}

	@OriginalMember(owner = "client!art", name = "cc", descriptor = "(I)V")
	public static void method22112(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(13, (long) arg0);
		local4.method22078(-711555559);
	}

	@OriginalMember(owner = "client!art", name = "cu", descriptor = "(I)V")
	public static void method22113(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(15, (long) arg0);
		local4.method22078(1436220158);
	}

	@OriginalMember(owner = "client!art", name = "ce", descriptor = "(I)V")
	public static void method22114(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(15, (long) arg0);
		local4.method22078(1261603252);
	}

	@OriginalMember(owner = "client!art", name = "bw", descriptor = "(I)V")
	public static void method22115(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(5, (long) arg0);
		local4.method22078(1457928007);
	}

	@OriginalMember(owner = "client!art", name = "cj", descriptor = "()V")
	static void method22116() {
		@Pc(3) Class80_Sub1_Sub9 local3 = Class22.method545(14, 0L);
		local3.method22078(-1172249167);
	}

	@OriginalMember(owner = "client!art", name = "ck", descriptor = "()V")
	static void method22117() {
		@Pc(3) Class80_Sub1_Sub9 local3 = Class22.method545(14, 0L);
		local3.method22078(208184800);
	}

	@OriginalMember(owner = "client!art", name = "ca", descriptor = "()V")
	static void method22118() {
		@Pc(3) Class80_Sub1_Sub9 local3 = Class22.method545(14, 0L);
		local3.method22078(-166374035);
	}

	@OriginalMember(owner = "client!art", name = "cr", descriptor = "()V")
	static void method22119() {
		@Pc(3) Class80_Sub1_Sub9 local3 = Class22.method545(14, 0L);
		local3.method22078(414997700);
	}

	@OriginalMember(owner = "client!art", name = "bk", descriptor = "()Lclient!art;")
	static Class80_Sub1_Sub9 method22120() {
		@Pc(4) Class80_Sub1_Sub9 local4 = (Class80_Sub1_Sub9) aSecondaryLinkedList_11.head((byte) -16);
		if (local4 != null) {
			local4.method24395((byte) 44);
			local4.unlinkSecondary(-2147483641);
			return local4;
		}
		do {
			local4 = (Class80_Sub1_Sub9) aSecondaryLinkedList_12.head((byte) 2);
			if (local4 == null) {
				return null;
			}
			if (local4.method22096(-1525424001) > Class303.currentTimeMillis((byte) 36)) {
				return null;
			}
			local4.method24395((byte) 123);
			local4.unlinkSecondary(-2147483647);
		} while ((local4.dualKey * 4203303297430504511L & Long.MIN_VALUE) == 0L);
		return local4;
	}

	@OriginalMember(owner = "client!art", name = "cm", descriptor = "(II)V")
	public static void method22121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(17, (long) arg1 << 32 | (long) arg0);
		local9.method22078(-1668114949);
	}

	@OriginalMember(owner = "client!art", name = "cp", descriptor = "(II)V")
	public static void method22122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(20, (long) arg1 << 32 | (long) arg0);
		local9.method22078(411317076);
	}

	@OriginalMember(owner = "client!art", name = "cg", descriptor = "(II)V")
	public static void method22123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(20, (long) arg1 << 32 | (long) arg0);
		local9.method22078(319299984);
	}

	@OriginalMember(owner = "client!art", name = "cb", descriptor = "(II)V")
	public static void method22124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(20, (long) arg1 << 32 | (long) arg0);
		local9.method22078(-1148042390);
	}

	@OriginalMember(owner = "client!art", name = "cw", descriptor = "(II)V")
	static void method22125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(1, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "bo", descriptor = "(I)V")
	public static void method22127(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(23, (long) arg0);
		local4.method22078(908228118);
	}

	@OriginalMember(owner = "client!art", name = "cf", descriptor = "(II)V")
	static void method22128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class374 local5 = (Class374) Class664.aClass41_Sub17_2.method18054(arg0, 1990397041);
		@Pc(14) Class80_Sub1_Sub9 local14 = Class22.method545(1, (long) (local5.aClass107_1.anInt862 * -1873516487));
		try {
			if (aBoolean580) {
				local14.anInt3064 = Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method36980(local5.aClass107_1, -698045825) * -1221031713;
			}
			local14.anInt3064 = local5.method28422(local14.anInt3064 * 1216164639, arg1, 128104709) * -1221031713;
			local14.method22135(-457826299);
		} catch (@Pc(42) Exception_Sub6 local42) {
			Class603.method32133("" + arg0, local42, 839300151);
		}
	}

	@OriginalMember(owner = "client!art", name = "co", descriptor = "(II)V")
	static void method22129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class374 local5 = (Class374) Class664.aClass41_Sub17_2.method18054(arg0, -805972234);
		@Pc(14) Class80_Sub1_Sub9 local14 = Class22.method545(1, (long) (local5.aClass107_1.anInt862 * -1873516487));
		try {
			if (aBoolean580) {
				local14.anInt3064 = Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method36980(local5.aClass107_1, 145920586) * -1221031713;
			}
			local14.anInt3064 = local5.method28422(local14.anInt3064 * 1216164639, arg1, -1968617681) * -1221031713;
			local14.method22135(-457826299);
		} catch (@Pc(42) Exception_Sub6 local42) {
			Class603.method32133("" + arg0, local42, 839300151);
		}
	}

	@OriginalMember(owner = "client!art", name = "cz", descriptor = "(II)V")
	static void method22130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class374 local5 = (Class374) Class664.aClass41_Sub17_2.method18054(arg0, 771204013);
		@Pc(14) Class80_Sub1_Sub9 local14 = Class22.method545(1, (long) (local5.aClass107_1.anInt862 * -1873516487));
		try {
			if (aBoolean580) {
				local14.anInt3064 = Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method36980(local5.aClass107_1, -332800229) * -1221031713;
			}
			local14.anInt3064 = local5.method28422(local14.anInt3064 * 1216164639, arg1, 1503804960) * -1221031713;
			local14.method22135(-457826299);
		} catch (@Pc(42) Exception_Sub6 local42) {
			Class603.method32133("" + arg0, local42, 839300151);
		}
	}

	@OriginalMember(owner = "client!art", name = "ek", descriptor = "(IIII)V")
	static void method22131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(20, (long) arg1 << 32 | (long) arg0);
		local9.method22135(-457826299);
		local9.anInt3064 = arg2 * -1221031713;
		local9.anInt3047 = arg3 * 673180539;
	}

	@OriginalMember(owner = "client!art", name = "bp", descriptor = "(I)V")
	public static void method22132(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(3, (long) arg0);
		local4.method22078(378731129);
	}

	@OriginalMember(owner = "client!art", name = "bv", descriptor = "(Lclient!ea;)V")
	public static void method22133(@OriginalArg(0) Class107 arg0) {
		@Pc(7) Class80_Sub1_Sub9 local7 = Class22.method545(2, (long) (arg0.anInt862 * -1873516487));
		local7.method22078(-1827990285);
	}

	@OriginalMember(owner = "client!art", name = "bz", descriptor = "()Lclient!art;")
	static Class80_Sub1_Sub9 method22134() {
		@Pc(4) Class80_Sub1_Sub9 local4 = (Class80_Sub1_Sub9) aSecondaryLinkedList_11.head((byte) -73);
		if (local4 != null) {
			local4.method24395((byte) 61);
			local4.unlinkSecondary(-2147483646);
			return local4;
		}
		do {
			local4 = (Class80_Sub1_Sub9) aSecondaryLinkedList_12.head((byte) 57);
			if (local4 == null) {
				return null;
			}
			if (local4.method22096(-924603818) > Class303.currentTimeMillis((byte) 122)) {
				return null;
			}
			local4.method24395((byte) 28);
			local4.unlinkSecondary(-2147483640);
		} while ((local4.dualKey * 4203303297430504511L & Long.MIN_VALUE) == 0L);
		return local4;
	}

	@OriginalMember(owner = "client!art", name = "df", descriptor = "(ILjava/lang/String;)V")
	static void method22136(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(3, (long) arg0);
		local4.method22135(-457826299);
		local4.aString102 = arg1;
	}

	@OriginalMember(owner = "client!art", name = "dl", descriptor = "(IZ)V")
	static void method22137(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(23, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = (arg1 ? 1 : 0) * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "db", descriptor = "(IZ)V")
	static void method22138(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(23, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = (arg1 ? 1 : 0) * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "dt", descriptor = "(IZ)V")
	static void method22139(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(23, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = (arg1 ? 1 : 0) * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "dk", descriptor = "(IIII)V")
	static void method22140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(10, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!art", name = "dw", descriptor = "(IIII)V")
	static void method22142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(4, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!art", name = "dr", descriptor = "(II)V")
	static void method22143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(5, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "dx", descriptor = "(II)V")
	static void method22144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(5, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "de", descriptor = "(II)V")
	static void method22145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(5, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "dv", descriptor = "(II)V")
	static void method22146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(5, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "dm", descriptor = "(II)V")
	static void method22147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(5, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "bs", descriptor = "()V")
	static void method22148() {
		aClass24_17.method564(520021420);
		aSecondaryLinkedList_12.method41(-252802305);
		aSecondaryLinkedList_11.method41(-252802305);
	}

	@OriginalMember(owner = "client!art", name = "dy", descriptor = "(III)V")
	static void method22149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(9, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
	}

	@OriginalMember(owner = "client!art", name = "dp", descriptor = "(II)V")
	static void method22150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(6, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "dd", descriptor = "(ILjava/lang/String;)V")
	static void method22151(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(2, (long) arg0);
		local4.method22135(-457826299);
		local4.aString102 = arg1;
	}

	@OriginalMember(owner = "client!art", name = "di", descriptor = "(IIII)V")
	static void method22152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(8, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!art", name = "dz", descriptor = "(IIII)V")
	static void method22153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(8, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!art", name = "bq", descriptor = "(I)V")
	public static void method22154(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(8, (long) arg0);
		local4.method22078(-1049574575);
	}

	@OriginalMember(owner = "client!art", name = "da", descriptor = "(IIII)V")
	static void method22155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(10, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!art", name = "do", descriptor = "(II)V")
	static void method22156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(6, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "ec", descriptor = "(IIII)V")
	static void method22157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(10, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!art", name = "ev", descriptor = "(IIII)V")
	static void method22158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(10, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!art", name = "ed", descriptor = "(II)V")
	static void method22159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(12, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "eo", descriptor = "(II)V")
	static void method22160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(12, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "ep", descriptor = "(II)V")
	static void method22161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(15, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "ew", descriptor = "(IZ)V")
	static void method22162(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(22, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = (arg1 ? 1 : 0) * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "ee", descriptor = "(II)V")
	static void method22163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class80_Sub1_Sub9 local3 = Class22.method545(14, 0L);
		local3.method22135(-457826299);
		local3.anInt3064 = arg0 * -1221031713;
		local3.anInt3047 = arg1 * 673180539;
	}

	@OriginalMember(owner = "client!art", name = "ef", descriptor = "(IIII)V")
	static void method22164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(17, (long) arg1 << 32 | (long) arg0);
		local9.method22135(-457826299);
		local9.anInt3064 = arg2 * -1221031713;
		local9.anInt3047 = arg3 * 673180539;
	}

	@OriginalMember(owner = "client!art", name = "dq", descriptor = "(II)V")
	static void method22165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(6, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!art", name = "ey", descriptor = "(IIII)V")
	static void method22166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(17, (long) arg1 << 32 | (long) arg0);
		local9.method22135(-457826299);
		local9.anInt3064 = arg2 * -1221031713;
		local9.anInt3047 = arg3 * 673180539;
	}

	@OriginalMember(owner = "client!art", name = "cx", descriptor = "(II)V")
	static void method22169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class374 local5 = (Class374) Class664.aClass41_Sub17_2.method18054(arg0, 174563926);
		@Pc(14) Class80_Sub1_Sub9 local14 = Class22.method545(1, (long) (local5.aClass107_1.anInt862 * -1873516487));
		try {
			if (aBoolean580) {
				local14.anInt3064 = Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method36980(local5.aClass107_1, -1117264280) * -1221031713;
			}
			local14.anInt3064 = local5.method28422(local14.anInt3064 * 1216164639, arg1, -702919924) * -1221031713;
			local14.method22135(-457826299);
		} catch (@Pc(42) Exception_Sub6 local42) {
			Class603.method32133("" + arg0, local42, 839300151);
		}
	}

	@OriginalMember(owner = "client!art", name = "ds", descriptor = "(IIII)V")
	static void method22171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(4, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!art", name = "<init>", descriptor = "(IJ)V")
	Class80_Sub1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		this.aLong338 = ((long) arg0 << 56 | arg1) * 6850079459805481791L;
	}

	@OriginalMember(owner = "client!art", name = "aw", descriptor = "(I)V")
	void method22078(@OriginalArg(0) int arg0) {
		this.dualKey = (this.dualKey * 4203303297430504511L & Long.MIN_VALUE | Class303.currentTimeMillis((byte) 81) + 500L) * -4191731634426926145L;
		aSecondaryLinkedList_12.addTail(this, 1599142138);
	}

	@OriginalMember(owner = "client!art", name = "bl", descriptor = "(I)I")
	int method22080(@OriginalArg(0) int arg0) {
		return (int) (this.aLong338 * 3209506792906532031L >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!art", name = "br", descriptor = "(B)J")
	long method22081(@OriginalArg(0) byte arg0) {
		return this.aLong338 * 3209506792906532031L & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!art", name = "bn", descriptor = "(I)J")
	long method22096(@OriginalArg(0) int arg0) {
		return this.dualKey * 4203303297430504511L & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!art", name = "et", descriptor = "()I")
	int method22126() {
		return (int) (this.aLong338 * 3209506792906532031L >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!art", name = "bg", descriptor = "(I)V")
	void method22135(@OriginalArg(0) int arg0) {
		this.dualKey = (this.dualKey * 4203303297430504511L | Long.MIN_VALUE) * -4191731634426926145L;
		if (this.method22096(-106099317) == 0L) {
			aSecondaryLinkedList_11.addTail(this, 1599142138);
		}
	}

	@OriginalMember(owner = "client!art", name = "el", descriptor = "()V")
	void method22141() {
		this.dualKey = (this.dualKey * 4203303297430504511L & Long.MIN_VALUE | Class303.currentTimeMillis((byte) 28) + 500L) * -4191731634426926145L;
		aSecondaryLinkedList_12.addTail(this, 1599142138);
	}

	@OriginalMember(owner = "client!art", name = "ea", descriptor = "()V")
	void method22167() {
		this.dualKey = (this.dualKey * 4203303297430504511L & Long.MIN_VALUE | Class303.currentTimeMillis((byte) 64) + 500L) * -4191731634426926145L;
		aSecondaryLinkedList_12.addTail(this, 1599142138);
	}

	@OriginalMember(owner = "client!art", name = "eh", descriptor = "()V")
	void method22168() {
		this.dualKey = (this.dualKey * 4203303297430504511L & Long.MIN_VALUE | Class303.currentTimeMillis((byte) 33) + 500L) * -4191731634426926145L;
		aSecondaryLinkedList_12.addTail(this, 1599142138);
	}

	@OriginalMember(owner = "client!art", name = "em", descriptor = "()V")
	void method22170() {
		this.dualKey = (this.dualKey * 4203303297430504511L | Long.MIN_VALUE) * -4191731634426926145L;
		if (this.method22096(-194365506) == 0L) {
			aSecondaryLinkedList_11.addTail(this, 1599142138);
		}
	}

	@OriginalMember(owner = "client!art", name = "eu", descriptor = "()J")
	long method22172() {
		return this.aLong338 * 3209506792906532031L & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!art", name = "es", descriptor = "()J")
	long method22173() {
		return this.aLong338 * 3209506792906532031L & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!art", name = "er", descriptor = "()J")
	long method22174() {
		return this.dualKey * 4203303297430504511L & Long.MAX_VALUE;
	}
}

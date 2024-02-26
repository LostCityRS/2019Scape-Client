package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class635 {

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
	public static int anInt5596;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	public static int anInt5597;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	static final int anInt5598 = 1;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "[Lclient!aly;")
	static Class163_Sub1[] aClass163_Sub1Array2;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
	static final int anInt5599 = -1;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
	public static int anInt5600;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
	static final int anInt5601 = 2;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Z")
	static boolean aBoolean959 = false;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "([B)Z")
	public static boolean method32810(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		@Pc(8) int local8 = local4.method23362(-1626601769);
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method23362(-704287976) == 1;
		if (local22) {
			Class499.method30401(local4, (byte) 0);
		}
		Class266.method26655(local4, (byte) -30);
		return true;
	}

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "(I)Lclient!aly;")
	public static Class163_Sub1 method32811(@OriginalArg(0) int arg0) {
		return aBoolean959 && arg0 >= anInt5596 * 828983813 && arg0 <= anInt5600 * 1540152885 ? aClass163_Sub1Array2[arg0 - anInt5596 * 828983813] : null;
	}

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "(Lclient!ald;)V")
	static void method32812(@OriginalArg(0) Class80_Sub36 arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt5597 * 1584731201; local1++) {
			@Pc(10) int local10 = arg0.method23195(2139800636);
			@Pc(14) int local14 = arg0.method23178((byte) -58);
			if (local14 == 65535) {
				local14 = -1;
			}
			if (aClass163_Sub1Array2[local10] != null) {
				aClass163_Sub1Array2[local10].anInt2083 = local14 * 2113710099;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "([B)Z")
	public static boolean method32813(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		@Pc(8) int local8 = local4.method23362(-1749058255);
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method23362(-1216616926) == 1;
		if (local22) {
			Class499.method30401(local4, (byte) -54);
		}
		Class266.method26655(local4, (byte) -92);
		return true;
	}

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "(Lclient!ald;)V")
	static void method32814(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23195(1975172467);
		Class90.aClass644Array1 = new Class644[local3];
		@Pc(8) int local8;
		for (local8 = 0; local8 < local3; local8++) {
			Class90.aClass644Array1[local8] = new Class644();
			Class90.aClass644Array1[local8].anInt5644 = arg0.method23195(1480701271) * -57965287;
			Class90.aClass644Array1[local8].aString234 = arg0.method23186((byte) 12);
		}
		anInt5596 = arg0.method23195(2008487728) * -1098124595;
		anInt5600 = arg0.method23195(1921472348) * -548797411;
		anInt5597 = arg0.method23195(1672462455) * -958334015;
		aClass163_Sub1Array2 = new Class163_Sub1[anInt5600 * 1540152885 - anInt5596 * 828983813 + 1];
		for (local8 = 0; local8 < anInt5597 * 1584731201; local8++) {
			@Pc(75) int local75 = arg0.method23195(1911938255);
			@Pc(83) Class163_Sub1 local83 = aClass163_Sub1Array2[local75] = new Class163_Sub1();
			local83.anInt2080 = arg0.method23362(-1254715258) * -1087879865;
			local83.anInt2081 = arg0.method23182(-804527428) * -1255476189;
			local83.anInt2085 = arg0.method23195(2087317573) * 183586725;
			if (local83.anInt2085 * 1899036717 != 0) {
				local83.aString62 = arg0.method23186((byte) 12);
			}
			local83.anInt2086 = (local75 + anInt5596 * 828983813) * 34241443;
			local83.aString63 = arg0.method23186((byte) 12);
			local83.aString61 = arg0.method23186((byte) 12);
		}
		RuntimeException_Sub1.anInt3204 = arg0.method23182(83080898) * -1854384973;
		aBoolean959 = true;
	}

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "([B)Z")
	public static boolean method32815(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		@Pc(8) int local8 = local4.method23362(48358684);
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method23362(-1105377186) == 1;
		if (local22) {
			Class499.method30401(local4, (byte) -30);
		}
		Class266.method26655(local4, (byte) -101);
		return true;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ald;)V")
	static void method32816(@OriginalArg(0) Class80_Sub36 arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt5597 * 1584731201; local1++) {
			@Pc(10) int local10 = arg0.method23195(1677893977);
			@Pc(14) int local14 = arg0.method23178((byte) -6);
			if (local14 == 65535) {
				local14 = -1;
			}
			if (aClass163_Sub1Array2[local10] != null) {
				aClass163_Sub1Array2[local10].anInt2083 = local14 * 2113710099;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "op", descriptor = "(Lclient!yp;I)V")
	static void method32817(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class144.method11995(local11, local14, arg0, 1778370865);
	}

	@OriginalMember(owner = "client!wf", name = "adb", descriptor = "(Lclient!yp;B)V")
	static void method32818(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass80_Sub32_4.aByte55;
	}

	@OriginalMember(owner = "client!wf", name = "aob", descriptor = "(Lclient!yp;I)V")
	static void method32819(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (!Class160.aClass121_Sub1_2.method9702(2068730857).method27979(-1617893387)) {
			throw new RuntimeException();
		}
		@Pc(14) Class20_Sub4 local14 = (Class20_Sub4) Class160.aClass121_Sub1_2.method9693(2026282360);
		local14.method23097(Class524.aClass485_2, -1, 0.0F, -1517893935);
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!wf", name = "nh", descriptor = "(II)V")
	public static void method32820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = client.aList3.indexOf(arg0);
		if (local4 == -1) {
			client.aList3.add(arg0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "(Ljava/lang/CharSequence;Lclient!adx;I)Ljava/lang/String;")
	public static String method32821(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		}
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		while (local5 < local8 && Class334.method27818(arg0.charAt(local5), (byte) 8)) {
			local5++;
		}
		while (local8 > local5 && Class334.method27818(arg0.charAt(local8 - 1), (byte) 37)) {
			local8--;
		}
		@Pc(36) int local36 = local8 - local5;
		if (local36 < 1 || local36 > Class268.method26682(arg1, (byte) -59)) {
			return null;
		}
		@Pc(51) StringBuilder local51 = new StringBuilder(local36);
		for (@Pc(53) int local53 = local5; local53 < local8; local53++) {
			@Pc(60) char local60 = arg0.charAt(local53);
			if (Class271.method26704(local60, 2143432002)) {
				@Pc(69) char local69 = Class22.method543(local60, -50618199);
				if (local69 != '\u0000') {
					local51.append(local69);
				}
			}
		}
		if (local51.length() == 0) {
			return null;
		} else {
			return local51.toString();
		}
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	Class635() throws Throwable {
		throw new Error();
	}
}

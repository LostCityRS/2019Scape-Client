package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abw")
public final class Class47 {

	@OriginalMember(owner = "client!abw", name = "f", descriptor = "Lclient!abb;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!abw", name = "e", descriptor = "Lclient!abb;")
	public static Class28 aClass28_2;

	@OriginalMember(owner = "client!abw", name = "t", descriptor = "Lclient!abb;")
	public static Class28 aClass28_3;

	@OriginalMember(owner = "client!abw", name = "l", descriptor = "Lclient!abb;")
	public static Class28 aClass28_4;

	@OriginalMember(owner = "client!abw", name = "g", descriptor = "Lclient!abb;")
	public static Class28 aClass28_5;

	@OriginalMember(owner = "client!abw", name = "u", descriptor = "Lclient!abb;")
	public static Class28 aClass28_6;

	@OriginalMember(owner = "client!abw", name = "j", descriptor = "J")
	public static long aLong10;

	@OriginalMember(owner = "client!abw", name = "o", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!abw", name = "s", descriptor = "[Lclient!aly;")
	static Class163_Sub1[] aClass163_Sub1Array1 = new Class163_Sub1[0];

	@OriginalMember(owner = "client!abw", name = "k", descriptor = "I")
	static int anInt180 = -621422592;

	@OriginalMember(owner = "client!abw", name = "x", descriptor = "I")
	static int anInt181 = 0;

	@OriginalMember(owner = "client!abw", name = "w", descriptor = "Lclient!yr;")
	static Class692 aClass692_1 = null;

	@OriginalMember(owner = "client!abw", name = "r", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!abw", name = "ab", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method955() {
		return Class80_Sub28_Sub2.method21750(aClass28_6.anInt89 * 307612145, 2080553471);
	}

	@OriginalMember(owner = "client!abw", name = "x", descriptor = "()V")
	public static void method956() {
		if (!aBoolean29) {
			return;
		}
		if (anInt181 * -1447287333 < Class635.anInt5596 * 828983813) {
			anInt181 = Class635.anInt5596 * 312051103;
		}
		while (true) {
			while (anInt181 * -1447287333 < Class635.anInt5600 * 1540152885) {
				@Pc(27) Class163_Sub1 local27 = Class80_Sub28_Sub2.method21750(anInt181 * -1447287333, 2138956247);
				if (local27 != null && local27.anInt2087 * 1438063139 == -1) {
					if (aClass692_1 == null) {
						aClass692_1 = client.aClass680_1.method33626(local27.aString61, (byte) 38);
					}
					@Pc(55) int local55 = aClass692_1.anInt5782 * -1361729949;
					if (local55 == -1) {
						return;
					}
					local27.anInt2087 = local55 * -965253749;
					anInt181 += -1802154413;
					aClass692_1 = null;
				} else {
					anInt181 += -1802154413;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!abw", name = "w", descriptor = "()V")
	public static void method957() {
		if (!aBoolean29) {
			return;
		}
		if (anInt181 * -1447287333 < Class635.anInt5596 * 828983813) {
			anInt181 = Class635.anInt5596 * 312051103;
		}
		while (true) {
			while (anInt181 * -1447287333 < Class635.anInt5600 * 1540152885) {
				@Pc(27) Class163_Sub1 local27 = Class80_Sub28_Sub2.method21750(anInt181 * -1447287333, 2125407716);
				if (local27 != null && local27.anInt2087 * 1438063139 == -1) {
					if (aClass692_1 == null) {
						aClass692_1 = client.aClass680_1.method33626(local27.aString61, (byte) 102);
					}
					@Pc(55) int local55 = aClass692_1.anInt5782 * -1361729949;
					if (local55 == -1) {
						return;
					}
					local27.anInt2087 = local55 * -965253749;
					anInt181 += -1802154413;
					aClass692_1 = null;
				} else {
					anInt181 += -1802154413;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!abw", name = "ad", descriptor = "(IZIZ)V")
	public static void method958(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Class679.method33624(0, aClass163_Sub1Array1.length - 1, arg0, arg1, arg2, arg3, (byte) 48);
		anInt181 = 0;
		aClass692_1 = null;
	}

	@OriginalMember(owner = "client!abw", name = "q", descriptor = "(Ljava/lang/String;I)V")
	public static void method959(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (aClass28_3 == null) {
			aClass28_3 = new Class28();
		}
		aClass28_3.aString4 = arg0;
		aClass28_3.anInt89 = (arg1 + 1099) * -465041647;
		aClass28_3.anInt90 = Class231.method26036(Class566.aClass697_1, Class720.aClass720_2, aClass28_3.anInt89 * 307612145, (byte) -109) * 902130377;
		aClass28_3.anInt91 = Class351.method28019(Class566.aClass697_1, Class720.aClass720_2, aClass28_3.anInt89 * 307612145, -410898174) * 1383435301;
	}

	@OriginalMember(owner = "client!abw", name = "h", descriptor = "(Ljava/lang/String;I)V")
	public static void method960(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (aClass28_3 == null) {
			aClass28_3 = new Class28();
		}
		aClass28_3.aString4 = arg0;
		aClass28_3.anInt89 = (arg1 + 1099) * -465041647;
		aClass28_3.anInt90 = Class231.method26036(Class566.aClass697_1, Class720.aClass720_2, aClass28_3.anInt89 * 307612145, (byte) -12) * 902130377;
		aClass28_3.anInt91 = Class351.method28019(Class566.aClass697_1, Class720.aClass720_2, aClass28_3.anInt89 * 307612145, -410898174) * 1383435301;
	}

	@OriginalMember(owner = "client!abw", name = "d", descriptor = "(Ljava/lang/String;I)V")
	public static void method961(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (aClass28_3 == null) {
			aClass28_3 = new Class28();
		}
		aClass28_3.aString4 = arg0;
		aClass28_3.anInt89 = (arg1 + 1099) * -465041647;
		aClass28_3.anInt90 = Class231.method26036(Class566.aClass697_1, Class720.aClass720_2, aClass28_3.anInt89 * 307612145, (byte) 95) * 902130377;
		aClass28_3.anInt91 = Class351.method28019(Class566.aClass697_1, Class720.aClass720_2, aClass28_3.anInt89 * 307612145, -410898174) * 1383435301;
	}

	@OriginalMember(owner = "client!abw", name = "ae", descriptor = "(Lclient!aly;Lclient!aly;IZIZ)I")
	static int method962(@OriginalArg(0) Class163_Sub1 arg0, @OriginalArg(1) Class163_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(6) int local6 = Class546.method31207(arg0, arg1, arg2, arg3, -1455033726);
		if (local6 != 0) {
			return arg3 ? -local6 : local6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = Class546.method31207(arg0, arg1, arg4, arg5, -2026508208);
			return arg5 ? -local28 : local28;
		}
	}

	@OriginalMember(owner = "client!abw", name = "p", descriptor = "()V")
	public static void method963() {
		if (aClass28_5.anInt89 * 307612145 != -1) {
			Class503.method30451(aClass28_5.anInt89 * 307612145, aClass28_5.aString4, aClass28_5.anInt90 * -1516712071, aClass28_5.anInt91 * -1614303315, -1333568038);
		}
	}

	@OriginalMember(owner = "client!abw", name = "v", descriptor = "()V")
	public static void method964() {
		if (aClass28_5.anInt89 * 307612145 != -1) {
			Class503.method30451(aClass28_5.anInt89 * 307612145, aClass28_5.aString4, aClass28_5.anInt90 * -1516712071, aClass28_5.anInt91 * -1614303315, -1333568038);
		}
	}

	@OriginalMember(owner = "client!abw", name = "y", descriptor = "()V")
	public static void method965() {
		if (aClass28_5.anInt89 * 307612145 != -1) {
			Class503.method30451(aClass28_5.anInt89 * 307612145, aClass28_5.aString4, aClass28_5.anInt90 * -1516712071, aClass28_5.anInt91 * -1614303315, -1333568038);
		}
	}

	@OriginalMember(owner = "client!abw", name = "n", descriptor = "()V")
	public static void method966() {
		if (aClass28_5.anInt89 * 307612145 != -1) {
			Class503.method30451(aClass28_5.anInt89 * 307612145, aClass28_5.aString4, aClass28_5.anInt90 * -1516712071, aClass28_5.anInt91 * -1614303315, -1333568038);
		}
	}

	@OriginalMember(owner = "client!abw", name = "ax", descriptor = "(Z[B)V")
	public static void method967(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Class650.aClass80_Sub36_17 == null) {
			Class650.aClass80_Sub36_17 = new Class80_Sub36(20000);
		}
		Class650.aClass80_Sub36_17.method23168(arg1, 0, arg1.length, (byte) 18);
		if (!arg0) {
			return;
		}
		Class352.method28062(Class650.aClass80_Sub36_17.aByteArray61, (byte) -48);
		aClass163_Sub1Array1 = new Class163_Sub1[Class635.anInt5597 * 1584731201];
		@Pc(28) int local28 = 0;
		for (@Pc(32) int local32 = Class635.anInt5596 * 828983813; local32 <= Class635.anInt5600 * 1540152885; local32++) {
			@Pc(41) Class163_Sub1 local41 = Class80_Sub28_Sub2.method21750(local32, 2046502028);
			if (local41 != null) {
				aClass163_Sub1Array1[local28++] = local41;
			}
		}
		aBoolean28 = false;
		aLong10 = Class303.method27111((byte) 29) * 6116256794156162355L;
		Class650.aClass80_Sub36_17 = null;
	}

	@OriginalMember(owner = "client!abw", name = "b", descriptor = "()V")
	public static void method968() {
		if (aClass28_5.anInt89 * 307612145 != -1) {
			Class503.method30451(aClass28_5.anInt89 * 307612145, aClass28_5.aString4, aClass28_5.anInt90 * -1516712071, aClass28_5.anInt91 * -1614303315, -1333568038);
		}
	}

	@OriginalMember(owner = "client!abw", name = "z", descriptor = "(Ljava/lang/String;I)V")
	public static void method969(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (aClass28_3 == null) {
			aClass28_3 = new Class28();
		}
		aClass28_3.aString4 = arg0;
		aClass28_3.anInt89 = (arg1 + 1099) * -465041647;
		aClass28_3.anInt90 = Class231.method26036(Class566.aClass697_1, Class720.aClass720_2, aClass28_3.anInt89 * 307612145, (byte) -92) * 902130377;
		aClass28_3.anInt91 = Class351.method28019(Class566.aClass697_1, Class720.aClass720_2, aClass28_3.anInt89 * 307612145, -410898174) * 1383435301;
	}

	@OriginalMember(owner = "client!abw", name = "ay", descriptor = "(Z[B)V")
	public static void method970(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Class650.aClass80_Sub36_17 == null) {
			Class650.aClass80_Sub36_17 = new Class80_Sub36(20000);
		}
		Class650.aClass80_Sub36_17.method23168(arg1, 0, arg1.length, (byte) 51);
		if (!arg0) {
			return;
		}
		Class352.method28062(Class650.aClass80_Sub36_17.aByteArray61, (byte) -24);
		aClass163_Sub1Array1 = new Class163_Sub1[Class635.anInt5597 * 1584731201];
		@Pc(28) int local28 = 0;
		for (@Pc(32) int local32 = Class635.anInt5596 * 828983813; local32 <= Class635.anInt5600 * 1540152885; local32++) {
			@Pc(41) Class163_Sub1 local41 = Class80_Sub28_Sub2.method21750(local32, 2111293358);
			if (local41 != null) {
				aClass163_Sub1Array1[local28++] = local41;
			}
		}
		aBoolean28 = false;
		aLong10 = Class303.method27111((byte) 84) * 6116256794156162355L;
		Class650.aClass80_Sub36_17 = null;
	}

	@OriginalMember(owner = "client!abw", name = "c", descriptor = "()V")
	public static void method971() {
		if (aClass28_5.anInt89 * 307612145 != -1) {
			Class503.method30451(aClass28_5.anInt89 * 307612145, aClass28_5.aString4, aClass28_5.anInt90 * -1516712071, aClass28_5.anInt91 * -1614303315, -1333568038);
		}
	}

	@OriginalMember(owner = "client!abw", name = "k", descriptor = "()V")
	public static void method972() {
		if (!aBoolean29) {
			return;
		}
		if (anInt181 * -1447287333 < Class635.anInt5596 * 828983813) {
			anInt181 = Class635.anInt5596 * 312051103;
		}
		while (true) {
			while (anInt181 * -1447287333 < Class635.anInt5600 * 1540152885) {
				@Pc(27) Class163_Sub1 local27 = Class80_Sub28_Sub2.method21750(anInt181 * -1447287333, 2069539689);
				if (local27 != null && local27.anInt2087 * 1438063139 == -1) {
					if (aClass692_1 == null) {
						aClass692_1 = client.aClass680_1.method33626(local27.aString61, (byte) 16);
					}
					@Pc(55) int local55 = aClass692_1.anInt5782 * -1361729949;
					if (local55 == -1) {
						return;
					}
					local27.anInt2087 = local55 * -965253749;
					anInt181 += -1802154413;
					aClass692_1 = null;
				} else {
					anInt181 += -1802154413;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!abw", name = "ao", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method973() {
		return anInt180 * -1516568149 < aClass163_Sub1Array1.length ? aClass163_Sub1Array1[(anInt180 += 886567171) * -1516568149 - 1] : null;
	}

	@OriginalMember(owner = "client!abw", name = "aj", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method974() {
		return anInt180 * -1516568149 < aClass163_Sub1Array1.length ? aClass163_Sub1Array1[(anInt180 += 886567171) * -1516568149 - 1] : null;
	}

	@OriginalMember(owner = "client!abw", name = "ac", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method975() {
		return anInt180 * -1516568149 < aClass163_Sub1Array1.length ? aClass163_Sub1Array1[(anInt180 += 886567171) * -1516568149 - 1] : null;
	}

	@OriginalMember(owner = "client!abw", name = "ag", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method976() {
		return anInt180 * -1516568149 < aClass163_Sub1Array1.length ? aClass163_Sub1Array1[(anInt180 += 886567171) * -1516568149 - 1] : null;
	}

	@OriginalMember(owner = "client!abw", name = "r", descriptor = "(ILjava/lang/String;II)Z")
	public static boolean method977(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aClass28_6 = new Class28();
		aClass28_6.anInt89 = arg0 * -465041647;
		aClass28_6.aString4 = arg1;
		aClass28_6.anInt90 = arg2 * 902130377;
		aClass28_6.anInt91 = arg3 * 1383435301;
		return true;
	}

	@OriginalMember(owner = "client!abw", name = "ai", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method978() {
		anInt180 = 0;
		return Class549.method31315(1548925147);
	}

	@OriginalMember(owner = "client!abw", name = "ah", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method979() {
		return Class80_Sub28_Sub2.method21750(aClass28_6.anInt89 * 307612145, 2085847495);
	}

	@OriginalMember(owner = "client!abw", name = "af", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method980() {
		return Class80_Sub28_Sub2.method21750(aClass28_6.anInt89 * 307612145, 2063026140);
	}

	@OriginalMember(owner = "client!abw", name = "am", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method981() {
		return Class80_Sub28_Sub2.method21750(aClass28_6.anInt89 * 307612145, 2113429488);
	}

	@OriginalMember(owner = "client!abw", name = "aa", descriptor = "(IIIZIZ)V")
	static void method982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg0) / 2;
		@Pc(10) int local10 = arg0;
		@Pc(14) Class163_Sub1 local14 = aClass163_Sub1Array1[local8];
		aClass163_Sub1Array1[local8] = aClass163_Sub1Array1[arg1];
		aClass163_Sub1Array1[arg1] = local14;
		for (@Pc(26) int local26 = arg0; local26 < arg1; local26++) {
			if (Class596.method31995(aClass163_Sub1Array1[local26], local14, arg2, arg3, arg4, arg5, -997760684) <= 0) {
				@Pc(44) Class163_Sub1 local44 = aClass163_Sub1Array1[local26];
				aClass163_Sub1Array1[local26] = aClass163_Sub1Array1[local10];
				aClass163_Sub1Array1[local10++] = local44;
			}
		}
		aClass163_Sub1Array1[arg1] = aClass163_Sub1Array1[local10];
		aClass163_Sub1Array1[local10] = local14;
		Class679.method33624(arg0, local10 - 1, arg2, arg3, arg4, arg5, (byte) -8);
		Class679.method33624(local10 + 1, arg1, arg2, arg3, arg4, arg5, (byte) 60);
	}

	@OriginalMember(owner = "client!abw", name = "at", descriptor = "(IZIZ)V")
	public static void method983(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Class679.method33624(0, aClass163_Sub1Array1.length - 1, arg0, arg1, arg2, arg3, (byte) 54);
		anInt181 = 0;
		aClass692_1 = null;
	}

	@OriginalMember(owner = "client!abw", name = "al", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method984() {
		return Class80_Sub28_Sub2.method21750(aClass28_6.anInt89 * 307612145, 2082482904);
	}

	@OriginalMember(owner = "client!abw", name = "ak", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method985() {
		return Class80_Sub28_Sub2.method21750(aClass28_6.anInt89 * 307612145, 2047416502);
	}

	@OriginalMember(owner = "client!abw", name = "an", descriptor = "(IZIZ)V")
	public static void method986(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Class679.method33624(0, aClass163_Sub1Array1.length - 1, arg0, arg1, arg2, arg3, (byte) -43);
		anInt181 = 0;
		aClass692_1 = null;
	}

	@OriginalMember(owner = "client!abw", name = "aq", descriptor = "()Lclient!aly;")
	public static Class163_Sub1 method987() {
		anInt180 = 0;
		return Class549.method31315(1534777785);
	}

	@OriginalMember(owner = "client!abw", name = "av", descriptor = "(IZIZ)V")
	public static void method988(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Class679.method33624(0, aClass163_Sub1Array1.length - 1, arg0, arg1, arg2, arg3, (byte) -32);
		anInt181 = 0;
		aClass692_1 = null;
	}

	@OriginalMember(owner = "client!abw", name = "bce", descriptor = "(Lclient!yp;I)V")
	static void method989(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class697.method37055((Class120_Sub1) arg0.anInterface60_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], true, -1403265044);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloatArray95[0];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloatArray95[1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloatArray95[2];
	}

	@OriginalMember(owner = "client!abw", name = "<init>", descriptor = "()V")
	Class47() throws Throwable {
		throw new Error();
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kz")
public final class Class392 {

	@OriginalMember(owner = "client!kz", name = "t", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_11 = new Class392(1);

	@OriginalMember(owner = "client!kz", name = "f", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_2 = new Class392(2);

	@OriginalMember(owner = "client!kz", name = "e", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_3 = new Class392(2);

	@OriginalMember(owner = "client!kz", name = "u", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_4 = new Class392(2);

	@OriginalMember(owner = "client!kz", name = "l", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_5 = new Class392(1);

	@OriginalMember(owner = "client!kz", name = "g", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_6 = new Class392(1);

	@OriginalMember(owner = "client!kz", name = "i", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_1 = new Class392(1);

	@OriginalMember(owner = "client!kz", name = "m", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_8 = new Class392(2);

	@OriginalMember(owner = "client!kz", name = "o", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_7 = new Class392(1);

	@OriginalMember(owner = "client!kz", name = "j", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_10 = new Class392(2);

	@OriginalMember(owner = "client!kz", name = "a", descriptor = "Lclient!kz;")
	public static final Class392 aClass392_9 = new Class392(1);

	@OriginalMember(owner = "client!kz", name = "s", descriptor = "I")
	public final int anInt4562;

	@OriginalMember(owner = "client!kz", name = "f", descriptor = "()[Lclient!kz;")
	public static Class392[] method28678() {
		return new Class392[] { aClass392_11, aClass392_2, aClass392_3, aClass392_4, aClass392_5, aClass392_6, aClass392_1, aClass392_8, aClass392_7, aClass392_10, aClass392_9 };
	}

	@OriginalMember(owner = "client!kz", name = "e", descriptor = "()[Lclient!kz;")
	public static Class392[] method28679() {
		return new Class392[] { aClass392_11, aClass392_2, aClass392_3, aClass392_4, aClass392_5, aClass392_6, aClass392_1, aClass392_8, aClass392_7, aClass392_10, aClass392_9 };
	}

	@OriginalMember(owner = "client!kz", name = "k", descriptor = "(I)V")
	public static void method28680(@OriginalArg(0) int arg0) {
		Class474.method29878(-935193404);
		Class630.aBoolean955 = false;
		Class312.method27468(Class594.anInt5325 * 2014486095, Class103_Sub15.anInt970 * -1540302901, Class427.anInt4636 * 663066865, Class106.anInt2551 * -1646871895, -136798746);
		Class630.aClass80_Sub1_Sub11_4 = null;
		Class686.aClass80_Sub1_Sub11_5 = null;
	}

	@OriginalMember(owner = "client!kz", name = "aat", descriptor = "(Lclient!yp;B)V")
	static void method28681(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.aString148 == null || local12 >= Class274.anInt3924 * -912877411) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class14.aClass164Array1[local12].aString65;
		}
	}

	@OriginalMember(owner = "client!kz", name = "u", descriptor = "(B)V")
	public static void method28682(@OriginalArg(0) byte arg0) {
		if (Class47.aClass28_5.anInt89 * 307612145 != -1) {
			Class503.method30451(Class47.aClass28_5.anInt89 * 307612145, Class47.aClass28_5.aString4, Class47.aClass28_5.anInt90 * -1516712071, Class47.aClass28_5.anInt91 * -1614303315, -1333568038);
		}
	}

	@OriginalMember(owner = "client!kz", name = "fp", descriptor = "(II)Z")
	public static boolean method28683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 10 || arg0 == 17 || arg0 == 7 || arg0 == 0 || arg0 == 12 || arg0 == 8;
	}

	@OriginalMember(owner = "client!kz", name = "mh", descriptor = "(Ljava/lang/String;B)V")
	public static void method28684(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (Class14.aClass164Array1 == null) {
			return;
		}
		@Pc(6) Class75 local6 = Class52.method1074(16777215);
		@Pc(12) Class80_Sub31 local12 = Class623.method32440(Class443.aClass443_30, local6.aClass22_1, -191270971);
		local12.aClass80_Sub36_Sub1_2.method23154(Class350.method28013(arg0, (short) 16383), 1275868335);
		local12.aClass80_Sub36_Sub1_2.method23165(arg0, 1749142642);
		local6.method1325(local12, (byte) -74);
	}

	@OriginalMember(owner = "client!kz", name = "<init>", descriptor = "(I)V")
	Class392(@OriginalArg(0) int arg0) {
		this.anInt4562 = arg0 * -1641801849;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class342 {

	@OriginalMember(owner = "client!im", name = "by", descriptor = "Ljava/lang/String;")
	public static String javaVendor;

	@OriginalMember(owner = "client!im", name = "t", descriptor = "Lclient!im;")
	static final Class342 aClass342_3 = new Class342(0);

	@OriginalMember(owner = "client!im", name = "f", descriptor = "Lclient!im;")
	static final Class342 aClass342_4 = new Class342(1);

	@OriginalMember(owner = "client!im", name = "awl", descriptor = "(Lclient!yp;I)V")
	static void method27941(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (Class709.aClass310Array1[local12] == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
			return;
		}
		@Pc(41) String local41 = Class709.aClass310Array1[local12].aClass327Array2[0].aString182;
		if (local41 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local41.substring(0, local41.indexOf(58));
		}
	}

	@OriginalMember(owner = "client!im", name = "t", descriptor = "(I)[Lclient!ot;")
	public static Class469[] method27942(@OriginalArg(0) int arg0) {
		return new Class469[] { Class469.aClass469_8, Class469.aClass469_34, Class469.aClass469_38, Class469.aClass469_11, Class469.aClass469_31, Class469.aClass469_10, Class469.aClass469_16, Class469.aClass469_41, Class469.aClass469_33, Class469.aClass469_28, Class469.aClass469_1, Class469.aClass469_35, Class469.aClass469_27, Class469.aClass469_39, Class469.aClass469_48, Class469.aClass469_3, Class469.aClass469_23, Class469.aClass469_7, Class469.aClass469_9, Class469.aClass469_21, Class469.aClass469_37, Class469.aClass469_18, Class469.aClass469_12, Class469.aClass469_26, Class469.aClass469_52, Class469.aClass469_4, Class469.aClass469_19, Class469.aClass469_55, Class469.aClass469_5, Class469.aClass469_30, Class469.aClass469_2, Class469.aClass469_13, Class469.aClass469_47, Class469.aClass469_15, Class469.aClass469_46, Class469.aClass469_36, Class469.aClass469_53, Class469.aClass469_29, Class469.aClass469_51, Class469.aClass469_25, Class469.aClass469_43, Class469.aClass469_54, Class469.aClass469_49, Class469.aClass469_45, Class469.aClass469_32, Class469.aClass469_24, Class469.aClass469_44, Class469.aClass469_42, Class469.aClass469_17, Class469.aClass469_50, Class469.aClass469_6, Class469.aClass469_22, Class469.aClass469_20, Class469.aClass469_40, Class469.aClass469_14 };
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(I)V")
	Class342(@OriginalArg(0) int arg0) {
	}
}

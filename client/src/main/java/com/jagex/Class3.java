package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public class Class3 {

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "Lclient!aaa;")
	public static final Class3 aClass3_2 = new Class3("LIVE", 0);

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "Lclient!aaa;")
	public static final Class3 aClass3_1 = new Class3("BUILDLIVE", 3);

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "Lclient!aaa;")
	public static final Class3 aClass3_3 = new Class3("RC", 1);

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lclient!aaa;")
	public static final Class3 aClass3_4 = new Class3("WIP", 2);

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "Lclient!aaa;")
	static final Class3 aClass3_5 = new Class3("INTBETA", 4);

	@OriginalMember(owner = "client!aaa", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString1;

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
	public final int anInt5;

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "()[Lclient!aaa;", line = 14)
	static Class3[] method19() {
		return new Class3[] { aClass3_4, aClass3_1, aClass3_2, aClass3_3, aClass3_5 };
	}

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "()[Lclient!aaa;", line = 14)
	static Class3[] method20() {
		return new Class3[] { aClass3_4, aClass3_1, aClass3_2, aClass3_3, aClass3_5 };
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 17)
	Class3(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString1 = arg0;
		this.anInt5 = arg1 * -1265081543;
	}

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "(I)Lclient!aaa;", line = 24)
	public static Class3 method21(@OriginalArg(0) int arg0) {
		@Pc(2) Class3[] local2 = Class529.method30397((byte) 58);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class3 local12 = local2[local4];
			if (arg0 == local12.anInt5 * 1108974345) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "(B)V", line = 140)
	public static final void method22(@OriginalArg(0) byte arg0) {
		if (Class411.anInt4721 * 327612781 != 7) {
			Class411.aClass175_3.method24367((byte) 47);
			Class594.method31724(1712001575);
			Class680.method33240(1418060216);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "ain", descriptor = "(Lclient!yf;I)V", line = 11380)
	static final void method23(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(38) Class93_Sub1_Sub18 local38 = Class372.aClass58_2.method1094(local13, -737304293);
		if (local38.method22935(local23, (byte) -126).anInt5852 * 1337578489 != 0) {
			throw new RuntimeException("");
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local38.method22939(local23, local33, 2130732003);
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public class Class349 {

	@OriginalMember(owner = "client!iu", name = "ui", descriptor = "I")
	public static int anInt4201;

	@OriginalMember(owner = "client!iu", name = "cy", descriptor = "I")
	public static int anInt4202;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "Lclient!iu;")
	static final Class349 aClass349_7 = new Class349(0);

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "Lclient!iu;")
	static final Class349 aClass349_3 = new Class349(1);

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "Lclient!iu;")
	static final Class349 aClass349_2 = new Class349(2);

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "Lclient!iu;")
	public static final Class349 aClass349_4 = new Class349(3);

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "Lclient!iu;")
	public static final Class349 aClass349_5 = new Class349(4);

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "Lclient!iu;")
	public static final Class349 aClass349_6 = new Class349(5);

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
	int anInt4200;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(I)V", line = 12)
	Class349(@OriginalArg(0) int arg0) {
		this.anInt4200 = arg0 * 1967329225;
	}

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "(Ljava/lang/String;II)Z", line = 58)
	static boolean method27624(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class110.method20138(arg0, arg1, "openjs", (short) 3456);
	}

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "(S)Z", line = 123)
	static boolean method27625(@OriginalArg(0) short arg0) {
		return Class411.anInt4746 * 276097583 == -1 ? Class93_Sub3.method11813(Class411.username, Class411.aString201, (byte) 47) : Class219.method25511(-1544706360);
	}

	@OriginalMember(owner = "client!iu", name = "je", descriptor = "(Lclient!yf;I)V", line = 6649)
	static final void method27626(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!iu", name = "kb", descriptor = "(Lclient!hf;I)Z", line = 11816)
	static boolean method27627(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class93_Sub19 local2 = client.method25364(arg0);
		if (local2.method13636(1926504675) > 0) {
			return true;
		} else if (local2.method13646(2056954753)) {
			return true;
		} else {
			return arg0.aClass312_9 != null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "avm", descriptor = "(Lclient!yf;I)V", line = 13445)
	static final void method27628(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!iu", name = "awd", descriptor = "(Lclient!yf;I)V", line = 13777)
	static final void method27629(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) int local16 = local12 >> 16;
		if (Class166_Sub1.aClass320Array1[local16] == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
			return;
		}
		@Pc(44) String local44 = Class166_Sub1.aClass320Array1[local16].aClass312Array3[local12].aString162;
		if (local44 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local44;
		}
	}
}

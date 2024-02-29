package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public class Class355 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Ljava/lang/String;")
	static String aString184;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	static int anInt4219;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "I")
	int anInt4217;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	int anInt4218;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(Lclient!ash;I)Lclient!uc;", line = 15)
	static Class590 method27697(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class590 local5;
		if (Class650.aClass590_3 == null) {
			local5 = new Class590();
		} else {
			local5 = Class650.aClass590_3;
			Class650.aClass590_3 = Class650.aClass590_3.aClass590_2;
			local5.aClass590_2 = null;
			Class590.anInt5475 -= 879993487;
		}
		local5.aClass132_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 1011)
	Class355() {
	}

	@OriginalMember(owner = "client!j", name = "anm", descriptor = "(Lclient!yf;I)V", line = 12215)
	static final void method27698(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class301.method26730((byte) 0);
	}

	@OriginalMember(owner = "client!j", name = "aua", descriptor = "(Lclient!yf;B)V", line = 13417)
	static final void method27699(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aBoolean595 ? 1 : 0;
	}
}

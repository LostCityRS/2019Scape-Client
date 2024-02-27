package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class355 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Ljava/lang/String;")
	static String aString190;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	static int anInt4260;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "I")
	int anInt4258;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	int anInt4259;

	@OriginalMember(owner = "client!j", name = "anm", descriptor = "(Lclient!yf;I)V")
	static void method27790(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class301.method26823((byte) 0);
	}

	@OriginalMember(owner = "client!j", name = "aua", descriptor = "(Lclient!yf;B)V")
	static void method27791(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aBoolean597 ? 1 : 0;
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(Lclient!ash;I)Lclient!uc;")
	static Class590 method27792(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class590 local5;
		if (Class650.aClass590_3 == null) {
			local5 = new Class590();
		} else {
			local5 = Class650.aClass590_3;
			Class650.aClass590_3 = Class650.aClass590_3.aClass590_2;
			local5.aClass590_2 = null;
			Class590.anInt5636 -= 879993487;
		}
		local5.aClass132_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	Class355() {
	}
}

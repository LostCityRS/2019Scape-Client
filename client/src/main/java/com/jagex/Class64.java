package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!acn")
public class Class64 {

	@OriginalMember(owner = "client!acn", name = "e", descriptor = "I")
	static final int anInt231 = 3;

	@OriginalMember(owner = "client!acn", name = "di", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!acn", name = "<init>", descriptor = "()V", line = 9)
	Class64() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!acn", name = "w", descriptor = "(II)Z", line = 51)
	public static boolean method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!acn", name = "aci", descriptor = "(Lclient!yf;I)V", line = 9973)
	static final void method1164(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class279.aClass386_1 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
			arg0.aClass386_3 = Class279.aClass386_1;
			arg0.aMap26.put(Class138.aClass138_68, Class27.method591(arg0.aClass386_3, -1398644273));
		}
	}
}

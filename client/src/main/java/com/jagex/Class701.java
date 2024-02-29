package com.jagex;

import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zc")
public class Class701 {

	@OriginalMember(owner = "client!zc", name = "m", descriptor = "Lclient!arm;")
	static Class93_Sub1_Sub7 aClass93_Sub1_Sub7_7;

	@OriginalMember(owner = "client!zc", name = "e", descriptor = "Ljava/util/List;")
	static List aList26;

	@OriginalMember(owner = "client!zc", name = "<init>", descriptor = "()V", line = 4)
	Class701() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zc", name = "ajb", descriptor = "(Lclient!yf;I)V", line = 11439)
	static final void method36717(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}

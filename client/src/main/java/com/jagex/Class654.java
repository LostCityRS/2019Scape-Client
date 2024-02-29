package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public class Class654 {

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "I")
	public static final int anInt5806 = 2048;

	@OriginalMember(owner = "client!xa", name = "e", descriptor = "I")
	public static final int anInt5807 = 256;

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "()V", line = 9)
	Class654() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "(Lclient!yu;Lclient!ze;II)I", line = 16)
	public static int method32718(@OriginalArg(0) Class693 arg0, @OriginalArg(1) Class703 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg0 == Class693.aClass693_8 ? 443 : arg2 + 50000;
	}

	@OriginalMember(owner = "client!xa", name = "wy", descriptor = "(Lclient!yf;B)V", line = 9103)
	static final void method32719(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class624.aClass120_1.method8655(local12, (byte) 56);
	}

	@OriginalMember(owner = "client!xa", name = "alz", descriptor = "(Lclient!yf;B)V", line = 11899)
	static final void method32720(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub23_1.method15844(4456625);
	}
}

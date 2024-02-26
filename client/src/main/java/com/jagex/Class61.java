package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!acl")
public final class Class61 {

	@OriginalMember(owner = "client!acl", name = "t", descriptor = "I")
	static final int anInt212 = 3;

	@OriginalMember(owner = "client!acl", name = "py", descriptor = "I")
	public static int anInt213;

	@OriginalMember(owner = "client!acl", name = "xw", descriptor = "Ljava/util/Iterator;")
	static Iterator anIterator1;

	@OriginalMember(owner = "client!acl", name = "bdo", descriptor = "(Lclient!yp;I)V")
	static void method1188(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class480.method30007(Class159_Sub1.anInt2013 * -1973765769, -823046357);
	}

	@OriginalMember(owner = "client!acl", name = "au", descriptor = "(Lclient!yp;I)V")
	static void method1189(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5777 -= 1311199625;
	}

	@OriginalMember(owner = "client!acl", name = "oj", descriptor = "(Lclient!yp;S)V")
	static void method1190(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class498.method30355(local11, local14, arg0, (byte) -20);
	}

	@OriginalMember(owner = "client!acl", name = "<init>", descriptor = "()V")
	Class61() throws Throwable {
		throw new Error();
	}
}

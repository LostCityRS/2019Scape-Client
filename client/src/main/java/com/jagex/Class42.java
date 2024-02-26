package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abr")
public final class Class42 {

	@OriginalMember(owner = "client!abr", name = "t", descriptor = "I")
	public static final int anInt118 = 5;

	@OriginalMember(owner = "client!abr", name = "da", descriptor = "(II)V")
	static void method869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class159_Sub1.anInt2026 = arg0 * 1633656115;
		Class159_Sub1.anInt2018 = -1806870975;
		Class159_Sub1.anInt2019 = -387547399;
		Class156.method15158(-528850327);
	}

	@OriginalMember(owner = "client!abr", name = "<init>", descriptor = "()V")
	Class42() throws Throwable {
		throw new Error();
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adq")
public final class Class87 {

	@OriginalMember(owner = "client!adq", name = "t", descriptor = "J")
	public static final long aLong22 = 94608000L;

	@OriginalMember(owner = "client!adq", name = "gu", descriptor = "(Lclient!yp;I)V")
	static void method1702(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2085482859);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class260.method26469(local16, local22, arg0, -754386039);
	}

	@OriginalMember(owner = "client!adq", name = "<init>", descriptor = "()V")
	Class87() throws Throwable {
		throw new Error();
	}
}

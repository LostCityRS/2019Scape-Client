package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abm")
public final class Class39 {

	@OriginalMember(owner = "client!abm", name = "t", descriptor = "I")
	public static final int anInt113 = 1700;

	@OriginalMember(owner = "client!abm", name = "f", descriptor = "I")
	public static final int anInt114 = 40000;

	@OriginalMember(owner = "client!abm", name = "e", descriptor = "I")
	public static final int anInt115 = 131072;

	@OriginalMember(owner = "client!abm", name = "dh", descriptor = "Lclient!ew;")
	public static Interface23 anInterface23_1;

	@OriginalMember(owner = "client!abm", name = "jn", descriptor = "Lclient!rx;")
	public static Class540 aClass540_1;

	@OriginalMember(owner = "client!abm", name = "axs", descriptor = "(Lclient!yp;I)V")
	static void method825(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class320 local18 = (Class320) Class157.aClass41_Sub13_2.method18054(local12, 2139986440);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt4061 * -1976811059;
	}

	@OriginalMember(owner = "client!abm", name = "<init>", descriptor = "()V")
	Class39() throws Throwable {
		throw new Error();
	}
}

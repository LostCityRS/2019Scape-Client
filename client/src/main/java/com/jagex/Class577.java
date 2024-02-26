package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class577 {

	@OriginalMember(owner = "client!to", name = "f", descriptor = "I")
	static final int anInt5290 = 2048;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "I")
	static final int anInt5291 = 2048;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	public static final int anInt5292 = 16384;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "I")
	public static final int anInt5293 = 16384;

	@OriginalMember(owner = "client!to", name = "adi", descriptor = "(Lclient!yp;B)V")
	static void method31793(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = arg0.aClass80_Sub32_4.aClass382Array1[local12].aString204;
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	Class577() throws Throwable {
		throw new Error();
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oz")
public final class Class473 {

	@OriginalMember(owner = "client!oz", name = "t", descriptor = "[F")
	static final float[] aFloatArray112 = new float[16384];

	@OriginalMember(owner = "client!oz", name = "f", descriptor = "[F")
	static final float[] aFloatArray111 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray112[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray111[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!oz", name = "<init>", descriptor = "()V")
	Class473() throws Throwable {
		throw new Error();
	}
}

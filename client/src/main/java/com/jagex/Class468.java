package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public class Class468 {

	@OriginalMember(owner = "client!or", name = "e", descriptor = "[F")
	static final float[] aFloatArray113 = new float[16384];

	@OriginalMember(owner = "client!or", name = "n", descriptor = "[F")
	static final float[] aFloatArray112 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray113[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray112[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V", line = 15)
	Class468() throws Throwable {
		throw new Error();
	}
}

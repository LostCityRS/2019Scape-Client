package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class247 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ep", name = "this$0", descriptor = "Lclient!dn;")
	final Class105 aClass105_5;

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "[I")
	public int[] anIntArray358;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "[I")
	public int[] anIntArray357;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "[I")
	public int[] anIntArray359;

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "[[F")
	public float[][] aFloatArrayArray24;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!dn;[I[I[I[[F)V")
	Class247(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[][] arg4) {
		this.aClass105_5 = arg0;
		this.anIntArray358 = arg1;
		this.anIntArray357 = arg2;
		this.anIntArray359 = arg3;
		this.aFloatArrayArray24 = arg4;
	}
}

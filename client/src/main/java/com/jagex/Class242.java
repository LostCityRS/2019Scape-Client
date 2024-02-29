package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class Class242 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ee", name = "this$0", descriptor = "Lclient!do;")
	final Class109 this$0;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "[I")
	public int[] anIntArray352;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "[I")
	public int[] anIntArray354;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "[I")
	public int[] anIntArray353;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "[[F")
	public float[][] aFloatArrayArray24;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!do;[I[I[I[[F)V", line = 927)
	Class242(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[][] arg4) {
		this.this$0 = arg0;
		this.anIntArray352 = arg1;
		this.anIntArray354 = arg2;
		this.anIntArray353 = arg3;
		this.aFloatArrayArray24 = arg4;
	}
}

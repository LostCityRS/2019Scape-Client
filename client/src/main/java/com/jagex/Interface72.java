package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xx")
public interface Interface72 {

	@OriginalMember(owner = "client!xx", name = "n", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;")
	String method28956(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!xx", name = "e", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;")
	String method28957(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2);
}

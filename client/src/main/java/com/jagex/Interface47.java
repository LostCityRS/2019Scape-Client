package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public interface Interface47 {

	@OriginalMember(owner = "client!np", name = "t", descriptor = "(II)Lclient!nl;")
	Class441 method29270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(I)Lclient!nl;")
	Class441 method29271(@OriginalArg(0) int arg0);
}

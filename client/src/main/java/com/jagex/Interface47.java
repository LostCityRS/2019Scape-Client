package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public interface Interface47 {

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(II)Lclient!na;")
	Class431 method28875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!np", name = "m", descriptor = "(I)Lclient!na;")
	Class431 method28876(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!np", name = "k", descriptor = "(I)Lclient!na;")
	Class431 method28877(@OriginalArg(0) int arg0);
}
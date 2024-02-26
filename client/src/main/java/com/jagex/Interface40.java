package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public interface Interface40 extends Interface34 {

	@OriginalMember(owner = "client!mg", name = "bt", descriptor = "(I)Lclient!do;")
	Interface18 method11698(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mg", name = "bs", descriptor = "(I)Lclient!do;")
	Interface18 method11699(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mg", name = "bj", descriptor = "(I)Lclient!do;")
	Interface18 method11700(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mg", name = "by", descriptor = "(I)Lclient!do;")
	Interface18 method11701(@OriginalArg(0) int arg0);
}

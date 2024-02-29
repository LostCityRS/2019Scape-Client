package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public interface Interface42 extends Interface38 {

	@OriginalMember(owner = "client!mo", name = "ak", descriptor = "(I)Lclient!dp;")
	Interface18 method11381(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mo", name = "an", descriptor = "(I)Lclient!dp;")
	Interface18 method11382(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mo", name = "bf", descriptor = "(I)Lclient!dp;")
	Interface18 method11383(@OriginalArg(0) int arg0);
}

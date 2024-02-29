package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nx")
public interface Interface48 {

	@OriginalMember(owner = "client!nx", name = "e", descriptor = "(II)Lclient!nm;")
	Class442 method28945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nx", name = "n", descriptor = "(I)Lclient!nm;")
	Class442 method28946(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nx", name = "m", descriptor = "(I)Lclient!nm;")
	Class442 method28947(@OriginalArg(0) int arg0);
}

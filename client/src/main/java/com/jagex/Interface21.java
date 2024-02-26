package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public interface Interface21 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)Lclient!kb;")
	Class374 method28380(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!el", name = "i", descriptor = "(II)Lclient!kb;")
	Class374 method28381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!el", name = "g", descriptor = "(Lclient!qt;II)Lclient!ea;")
	Class107 method28382(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!el", name = "y", descriptor = "(Lclient!qt;I)Lclient!ea;")
	Class107 method28383(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)Lclient!kb;")
	Class374 method28384(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!el", name = "n", descriptor = "(I)Lclient!kb;")
	Class374 method28385(@OriginalArg(0) int arg0);
}

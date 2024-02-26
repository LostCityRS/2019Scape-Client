package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public interface Interface48 {

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "(I)Lclient!nc;")
	Class433 method29222(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "(I)Lclient!nc;")
	Class433 method29223(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "(I)Lclient!nc;")
	Class433 method29224(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "(IB)Lclient!nc;")
	Class433 method29225(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1);
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abs")
public interface Interface4 {

	@OriginalMember(owner = "client!abs", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;")
	Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1);

	@OriginalMember(owner = "client!abs", name = "o", descriptor = "(B)Ljava/lang/Class;")
	Class method27701(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!abs", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;")
	Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1);

	@OriginalMember(owner = "client!abs", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;")
	Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!abs", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;")
	Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1);

	@OriginalMember(owner = "client!abs", name = "x", descriptor = "()Ljava/lang/Class;")
	Class method27705();
}

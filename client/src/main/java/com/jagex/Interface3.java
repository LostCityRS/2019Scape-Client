package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public interface Interface3 {

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "(I)Ljava/lang/Class;")
	Class method28275(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "()Ljava/lang/Class;")
	Class method28277();

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "()Ljava/lang/Class;")
	Class method28278();

	@OriginalMember(owner = "client!aba", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1);

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1);

	@OriginalMember(owner = "client!aba", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1);

	@OriginalMember(owner = "client!aba", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1);
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jy")
public interface Interface31 {

	@OriginalMember(owner = "client!jy", name = "m", descriptor = "(Lclient!jl;I)Lclient!jn;")
	Interface29 method36703(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jy", name = "n", descriptor = "(Lclient!jl;I)Lclient!jn;")
	Interface29 method36704(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jy", name = "e", descriptor = "(Lclient!jl;IB)Lclient!jn;")
	Interface29 method36705(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2);
}

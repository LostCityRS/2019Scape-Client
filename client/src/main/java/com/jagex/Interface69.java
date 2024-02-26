package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public interface Interface69 {

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "(Lclient!wk;)Z")
	boolean method671(@OriginalArg(0) Interface69 arg0);

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "(Lclient!wk;)Z")
	boolean method672(@OriginalArg(0) Interface69 arg0);

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "()J")
	long method673();

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "()J")
	long method674();

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(Lclient!wk;)Z")
	boolean method675(@OriginalArg(0) Interface69 arg0);
}

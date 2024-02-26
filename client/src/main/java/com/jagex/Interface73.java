package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!yb")
public interface Interface73 {

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "(IIII)V")
	void method33341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "(III)V")
	void method33342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "(Z)V")
	void method33343(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!yb", name = "u", descriptor = "(Z)V")
	void method33344(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!yb", name = "l", descriptor = "(III)V")
	void method33345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!yb", name = "t", descriptor = "(ZB)V")
	void method33346(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1);
}

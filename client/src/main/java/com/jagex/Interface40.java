package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public interface Interface40 extends Interface36, Interface34 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	void method29351(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "()V")
	void method30885();

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "()Lclient!dg;")
	Class226 method29352();

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "()V")
	void method30884();

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "()Lclient!dg;")
	Class226 method29353();

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)V")
	void method29354(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)V")
	void method29355(@OriginalArg(0) int arg0);
}

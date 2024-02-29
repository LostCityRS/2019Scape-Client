package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public interface Interface37 extends Interface36, Interface34 {

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "()V")
	void method30885();

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "()V")
	void method30884();

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "(II)Z")
	boolean method29314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(II)Z")
	boolean method29315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}

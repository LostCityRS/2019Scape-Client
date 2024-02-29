package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public interface Interface56 extends Interface18, Interface19 {

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "(I)V")
	void method30892(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
	void method30893(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
	void method30894(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "(I)V")
	void method30895(@OriginalArg(0) int arg0);
}

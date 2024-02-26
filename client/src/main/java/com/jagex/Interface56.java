package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public interface Interface56 extends Interface18, Interface17 {

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "(I)V")
	void method30844(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "(I)V")
	void method30845(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	void method30846(@OriginalArg(0) int arg0);
}

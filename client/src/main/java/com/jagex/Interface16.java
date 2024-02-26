package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public interface Interface16 extends Interface18, Interface17 {

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "(I)V")
	void method25855(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	void method25856(@OriginalArg(0) int arg0);
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public interface Interface41 {

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "()V")
	void method30820();

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "(B)V")
	void method30821(@OriginalArg(0) byte arg0);
}

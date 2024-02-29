package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public interface Interface51 {

	@OriginalMember(owner = "client!os", name = "z", descriptor = "(I)Ljava/lang/Object;")
	Object method1459(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!os", name = "u", descriptor = "(IB)Ljava/lang/Object;")
	Object method1460(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1);
}

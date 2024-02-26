package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ox")
public interface Interface53 {

	@OriginalMember(owner = "client!ox", name = "m", descriptor = "(I)Ljava/lang/Object;")
	Object method1816(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ox", name = "g", descriptor = "(II)Ljava/lang/Object;")
	Object method1817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ox", name = "i", descriptor = "(I)Ljava/lang/Object;")
	Object method1818(@OriginalArg(0) int arg0);
}

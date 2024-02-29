package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aby")
public interface Interface5 {

	@OriginalMember(owner = "client!aby", name = "v", descriptor = "(I)V")
	void method36511(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aby", name = "r", descriptor = "(I)V")
	void method36512(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aby", name = "z", descriptor = "(IB)V")
	void method36513(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1);
}

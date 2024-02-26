package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public interface Interface20 {

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "(Ljava/lang/Object;B)V")
	void method26695(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(Ljava/lang/Object;)V")
	void method26696(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(Ljava/lang/Object;)V")
	void method26697(@OriginalArg(0) Object arg0);
}

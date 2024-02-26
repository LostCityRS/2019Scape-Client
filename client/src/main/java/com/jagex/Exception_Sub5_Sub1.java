package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!att")
public final class Exception_Sub5_Sub1 extends Exception_Sub5 {

	@OriginalMember(owner = "client!att", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Exception_Sub5_Sub1(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atn")
public class Exception_Sub2_Sub1 extends Exception_Sub2 {

	@OriginalMember(owner = "client!atn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 5)
	Exception_Sub2_Sub1(@OriginalArg(0) String arg0) {
		this(arg0, false);
	}

	@OriginalMember(owner = "client!atn", name = "<init>", descriptor = "(Ljava/lang/String;Z)V", line = 9)
	Exception_Sub2_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		super(arg0);
	}
}

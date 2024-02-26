package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atw")
public final class Exception_Sub5_Sub2 extends Exception_Sub5 {

	@OriginalMember(owner = "client!atw", name = "<init>", descriptor = "(Ljava/lang/String;Z)V")
	Exception_Sub5_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		super(arg0);
	}

	@OriginalMember(owner = "client!atw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Exception_Sub5_Sub2(@OriginalArg(0) String arg0) {
		this(arg0, false);
	}
}

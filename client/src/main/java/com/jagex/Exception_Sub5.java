package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apv")
public class Exception_Sub5 extends Exception {

	@OriginalMember(owner = "client!apv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Exception_Sub5(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}

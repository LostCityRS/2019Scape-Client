package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.io.IOException;

@OriginalClass("client!atz")
public final class IOException_Sub1 extends IOException {

	@OriginalMember(owner = "client!atz", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	IOException_Sub1(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}

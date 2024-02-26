package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apq")
public final class Exception_Sub4 extends Exception {

	// $FF: synthetic field
	@OriginalMember(owner = "client!apq", name = "this$0", descriptor = "Lclient!hs;")
	final Class324 aClass324_1;

	@OriginalMember(owner = "client!apq", name = "<init>", descriptor = "(Lclient!hs;II)V")
	Exception_Sub4(@OriginalArg(0) Class324 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super("");
		this.aClass324_1 = arg0;
	}
}

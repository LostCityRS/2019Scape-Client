package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apu")
public final class Exception_Sub6 extends Exception {

	// $FF: synthetic field
	@OriginalMember(owner = "client!apu", name = "this$0", descriptor = "Lclient!hj;")
	final Class314 aClass314_1;

	@OriginalMember(owner = "client!apu", name = "<init>", descriptor = "(Lclient!hj;II)V")
	Exception_Sub6(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super("");
		this.aClass314_1 = arg0;
	}
}

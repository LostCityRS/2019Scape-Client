package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akg")
public class Class93_Sub17 extends Class93 {

	@OriginalMember(owner = "client!akg", name = "k", descriptor = "[I")
	int[] anIntArray176;

	@OriginalMember(owner = "client!akg", name = "f", descriptor = "[B")
	byte[] aByteArray34;

	@OriginalMember(owner = "client!akg", name = "<init>", descriptor = "([I[B)V", line = 1313)
	Class93_Sub17(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1) {
		this.anIntArray176 = arg0;
		this.aByteArray34 = arg1;
	}
}

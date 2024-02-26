package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public final class Class80_Sub11 extends Class80 {

	@OriginalMember(owner = "client!aka", name = "u", descriptor = "[I")
	int[] anIntArray185;

	@OriginalMember(owner = "client!aka", name = "l", descriptor = "[B")
	byte[] aByteArray37;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "([I[B)V")
	Class80_Sub11(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1) {
		this.anIntArray185 = arg0;
		this.aByteArray37 = arg1;
	}
}

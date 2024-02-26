package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akz")
public final class Class80_Sub35 extends Class80 {

	@OriginalMember(owner = "client!akz", name = "u", descriptor = "S")
	public short aShort53;

	@OriginalMember(owner = "client!akz", name = "<init>", descriptor = "(S)V")
	public Class80_Sub35(@OriginalArg(0) short arg0) {
		this.aShort53 = arg0;
	}
}

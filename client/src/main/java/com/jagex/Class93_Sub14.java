package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akd")
public class Class93_Sub14 extends Class93 {

	@OriginalMember(owner = "client!akd", name = "cv", descriptor = "I")
	public static int anInt1527;

	@OriginalMember(owner = "client!akd", name = "k", descriptor = "I")
	public int anInt1526;

	@OriginalMember(owner = "client!akd", name = "<init>", descriptor = "(I)V", line = 6)
	public Class93_Sub14(@OriginalArg(0) int arg0) {
		this.anInt1526 = arg0 * -859706365;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class Class93_Sub11 extends Class93 {

	@OriginalMember(owner = "client!aka", name = "k", descriptor = "J")
	public long aLong67;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(J)V", line = 6)
	public Class93_Sub11(@OriginalArg(0) long arg0) {
		this.aLong67 = arg0 * -3331835497204133987L;
	}
}

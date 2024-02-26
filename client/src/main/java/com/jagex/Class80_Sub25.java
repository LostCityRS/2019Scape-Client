package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ako")
public final class Class80_Sub25 extends Class80 {

	@OriginalMember(owner = "client!ako", name = "x", descriptor = "I")
	public static int anInt1627;

	@OriginalMember(owner = "client!ako", name = "u", descriptor = "J")
	public long aLong111;

	@OriginalMember(owner = "client!ako", name = "<init>", descriptor = "(J)V")
	public Class80_Sub25(@OriginalArg(0) long arg0) {
		this.aLong111 = arg0 * -6811134150962562469L;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajv")
public final class Class147_Sub6 extends Class147 {

	@OriginalMember(owner = "client!ajv", name = "e", descriptor = "I")
	int anInt1499 = (int) (Class303.currentTimeMillis((byte) 8) / 1000L) * 613946433;

	@OriginalMember(owner = "client!ajv", name = "u", descriptor = "Ljava/lang/String;")
	String aString46;

	@OriginalMember(owner = "client!ajv", name = "l", descriptor = "S")
	short aShort49;

	@OriginalMember(owner = "client!ajv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	Class147_Sub6(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString46 = arg0;
		this.aShort49 = (short) arg1;
	}
}

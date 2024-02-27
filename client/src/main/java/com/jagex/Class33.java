package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abf")
public final class Class33 {

	@OriginalMember(owner = "client!abf", name = "e", descriptor = "I")
	public static final int anInt109 = 5;

	@OriginalMember(owner = "client!abf", name = "n", descriptor = "(I)Z")
	public static boolean method677(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub37 local4 = (Class93_Sub37) Class60.aClass22_2.method445((byte) 52);
		return local4 != null;
	}

	@OriginalMember(owner = "client!abf", name = "<init>", descriptor = "()V")
	Class33() throws Throwable {
		throw new Error();
	}
}

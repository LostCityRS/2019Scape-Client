package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aij")
final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!aij", name = "kq", descriptor = "I")
	static int anInt1297;

	@OriginalMember(owner = "client!aij", name = "lf", descriptor = "(Ljava/lang/String;I)I")
	public static int method11097(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(8) int local8 = 0; local8 < client.anInt3519 * 227319795; local8++) {
			if (arg0.equalsIgnoreCase(client.aClass699Array1[local8].aString244)) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!aij", name = "<init>", descriptor = "(Lclient!xl;IZZ)V")
	Class143_Sub1(@OriginalArg(0) Class664 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class143_Sub1) null);
	}

	@OriginalMember(owner = "client!aij", name = "m", descriptor = "(Lclient!ea;)Ljava/lang/Object;")
	@Override
	Object method11828(@OriginalArg(0) Class107 arg0) {
		return Class521.aClass521_49 == arg0.aClass521_6 ? -1 : arg0.aClass521_6.method30625(358115384);
	}

	@OriginalMember(owner = "client!aij", name = "l", descriptor = "(Lclient!ea;B)Ljava/lang/Object;")
	@Override
	Object method11825(@OriginalArg(0) Class107 arg0, @OriginalArg(1) byte arg1) {
		return Class521.aClass521_49 == arg0.aClass521_6 ? -1 : arg0.aClass521_6.method30625(1172834650);
	}
}

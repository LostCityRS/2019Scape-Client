package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class530 {

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "Lclient!ri;")
	static final Class530 aClass530_1 = new Class530();

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Lclient!ri;")
	public static final Class530 aClass530_4 = new Class530();

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!ri;")
	public static final Class530 aClass530_3 = new Class530();

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "Lclient!ri;")
	static final Class530 aClass530_2 = new Class530();

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)V")
	static void method30812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class238.anInt3812 * -1746286503 == 180) {
			Class238.anInt3850 = arg0 * 1436004433;
		} else if (Class238.anInt3812 * -1746286503 == 265) {
			Class238.anInt3846 = arg0 * 1760181679;
		}
	}

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "(IS)Z")
	public static boolean method30813(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		return arg0 >= Class607.aClass607_11.anInt5396 * 1323580581 && arg0 <= Class607.aClass607_6.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!ri", name = "vr", descriptor = "(Lclient!yp;I)V")
	static void method30814(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2064584836);
		@Pc(29) int local29 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(30) int local30 = local29 - 1;
		if (local16.aStringArray24 == null || local30 >= local16.aStringArray24.length || local16.aStringArray24[local30] == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local16.aStringArray24[local30];
		}
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	Class530() {
	}
}

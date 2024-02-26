package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atk")
public final class RuntimeException_Sub3 extends RuntimeException {

	@OriginalMember(owner = "client!atk", name = "zx", descriptor = "(Lclient!yp;I)V")
	static void method23803(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(26) String local26 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (local12 == -1) {
			throw new RuntimeException();
		}
		@Pc(39) Class50 local39 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(local12, 1877849904);
		if (Class521.aClass521_42 != local39.aClass521_1) {
			throw new RuntimeException();
		}
		@Pc(52) int[] local52 = local39.method1019(local26, 1896589581);
		@Pc(54) int local54 = 0;
		if (local52 != null) {
			local54 = local52.length;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local54;
	}

	@OriginalMember(owner = "client!atk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public RuntimeException_Sub3(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}

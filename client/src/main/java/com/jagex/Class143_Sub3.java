package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!air")
final class Class143_Sub3 extends Class143 {

	@OriginalMember(owner = "client!air", name = "gh", descriptor = "Lclient!pf;")
	public static Class480 aClass480_34;

	@OriginalMember(owner = "client!air", name = "vm", descriptor = "(Lclient!yp;B)V")
	static void method11564(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(19) Class80_Sub31 local19 = Class623.method32440(Class443.aClass443_111, client.aClass75_1.aClass22_1, -191270971);
		local19.aPacketBit_2.p1(local13.length() + 1);
		local19.aPacketBit_2.pjstr(local13);
		client.aClass75_1.method1325(local19, (byte) -45);
	}

	@OriginalMember(owner = "client!air", name = "io", descriptor = "(Lclient!yp;I)V")
	static void method11565(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2065584265);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class254.method26400(local16, local22, arg0, (byte) 2);
	}

	@OriginalMember(owner = "client!air", name = "<init>", descriptor = "(Lclient!xl;IZZ)V")
	Class143_Sub3(@OriginalArg(0) Class664 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class143_Sub1) null);
	}

	@OriginalMember(owner = "client!air", name = "l", descriptor = "(Lclient!ea;B)Ljava/lang/Object;")
	@Override
	Object method11825(@OriginalArg(0) Class107 arg0, @OriginalArg(1) byte arg1) {
		return Class521.aClass521_49 == arg0.aClass521_6 ? -1 : arg0.aClass521_6.method30625(350163130);
	}

	@OriginalMember(owner = "client!air", name = "m", descriptor = "(Lclient!ea;)Ljava/lang/Object;")
	@Override
	Object method11828(@OriginalArg(0) Class107 arg0) {
		return Class521.aClass521_49 == arg0.aClass521_6 ? -1 : arg0.aClass521_6.method30625(2131249979);
	}
}

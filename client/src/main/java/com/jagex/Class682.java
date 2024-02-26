package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yg")
public final class Class682 {

	@OriginalMember(owner = "client!yg", name = "u", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray44;

	@OriginalMember(owner = "client!yg", name = "e", descriptor = "[I")
	int[] anIntArray522;

	@OriginalMember(owner = "client!yg", name = "t", descriptor = "Lclient!asw;")
	Class80_Sub1_Sub20 aClass80_Sub1_Sub20_1;

	@OriginalMember(owner = "client!yg", name = "l", descriptor = "[J")
	long[] aLongArray26;

	@OriginalMember(owner = "client!yg", name = "f", descriptor = "I")
	int anInt5750 = 1490014531;

	@OriginalMember(owner = "client!yg", name = "fl", descriptor = "(Lclient!yp;B)V")
	static void method36703(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2120348315);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class476.method29895(local16, local22, arg0, 1896589581);
	}

	@OriginalMember(owner = "client!yg", name = "adx", descriptor = "(Lclient!yp;I)V")
	static void method36704(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass80_Sub32_4.aClass382Array1[local12].aByte146;
	}

	@OriginalMember(owner = "client!yg", name = "bbx", descriptor = "(Lclient!yp;B)V")
	static void method36705(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class120_Sub1_Sub1_Sub1_Sub1 local3 = (Class120_Sub1_Sub1_Sub1_Sub1) arg0.aClass120_Sub1_Sub1_Sub1_4;
		@Pc(6) String local6 = local3.aString72;
		@Pc(9) Class335 local9 = local3.aClass335_1;
		if (local9.anIntArray416 != null) {
			local9 = local9.method27836(Class672.aClass134_1, Class672.aClass134_1, 369964936);
			if (local9 == null) {
				local6 = "";
			} else {
				local6 = local9.aString188;
			}
		}
		if (local6 == null) {
			local6 = "";
		}
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local6;
	}

	@OriginalMember(owner = "client!yg", name = "lc", descriptor = "(I[II)V")
	static void method36706(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!Class71.method18185(arg0, arg1, (byte) 100)) {
			return;
		}
		@Pc(10) Class327[] local10 = Class709.aClass310Array1[arg0].aClass327Array2;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(20) Class327 local20 = local10[local12];
			if (local20 != null && local20.aClass6_6 != null) {
				local20.aClass6_6.method23598((short) -14147);
			}
		}
	}

	@OriginalMember(owner = "client!yg", name = "l", descriptor = "(Z[BI)V")
	public static void method36707(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (Class650.aClass80_Sub36_17 == null) {
			Class650.aClass80_Sub36_17 = new Class80_Sub36(20000);
		}
		Class650.aClass80_Sub36_17.method23168(arg1, 0, arg1.length, (byte) 34);
		if (!arg0) {
			return;
		}
		Class352.method28062(Class650.aClass80_Sub36_17.aByteArray61, (byte) -38);
		Class47.aClass163_Sub1Array1 = new Class163_Sub1[Class635.anInt5597 * 1584731201];
		@Pc(28) int local28 = 0;
		for (@Pc(32) int local32 = Class635.anInt5596 * 828983813; local32 <= Class635.anInt5600 * 1540152885; local32++) {
			@Pc(41) Class163_Sub1 local41 = Class80_Sub28_Sub2.method21750(local32, 2074626166);
			if (local41 != null) {
				Class47.aClass163_Sub1Array1[local28++] = local41;
			}
		}
		Class47.aBoolean28 = false;
		Class47.aLong10 = Class303.method27111((byte) 11) * 6116256794156162355L;
		Class650.aClass80_Sub36_17 = null;
	}

	@OriginalMember(owner = "client!yg", name = "j", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V")
	public static void method36708(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg0.length() > 320 || !Class501.method30420(1350381337)) {
			return;
		}
		client.aClass75_2.method1319((short) 468);
		Class536.method30873(454705082);
		Class238.aString154 = arg0;
		Class238.aString155 = arg1;
		Class238.aString153 = arg2;
		Class238.aBoolean770 = arg3;
		Class604.method32148(17, 326703692);
	}

	@OriginalMember(owner = "client!yg", name = "l", descriptor = "(JII)Ljava/lang/String;")
	public static String method36709(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = Class62.aCalendar1.get(11);
		@Pc(9) int local9 = Class62.aCalendar1.get(12);
		@Pc(13) int local13 = Class62.aCalendar1.get(13);
		return Integer.toString(local5 / 10) + local5 % 10 + ":" + local9 / 10 + local9 % 10 + ":" + local13 / 10 + local13 % 10;
	}

	@OriginalMember(owner = "client!yg", name = "<init>", descriptor = "()V")
	Class682() {
	}
}

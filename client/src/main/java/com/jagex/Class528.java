package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class528 {

	@OriginalMember(owner = "client!re", name = "ia", descriptor = "Lclient!adh;")
	public static Class2_Sub1_Sub1 aClass2_Sub1_Sub1_3;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "([ID)V")
	static void method30715(@OriginalArg(0) int[] arg0, @OriginalArg(1) double arg1) {
		@Pc(5) int local5;
		@Pc(18) int local18;
		if (arg1 != Class111.aDouble3) {
			for (local5 = 0; local5 < 256; local5++) {
				local18 = (int) (Math.pow((double) local5 / 255.0D, arg1) * 255.0D);
				Class111.anIntArray93[local5] = local18 > 255 ? 255 : local18;
			}
			Class111.aDouble3 = arg1;
		}
		for (local5 = 0; local5 < arg0.length; local5++) {
			local18 = Class111.anIntArray93[arg0[local5] >> 16 & 0xFF];
			@Pc(57) int local57 = Class111.anIntArray93[arg0[local5] >> 8 & 0xFF];
			@Pc(67) int local67 = Class111.anIntArray93[arg0[local5] >> 0 & 0xFF];
			arg0[local5] = arg0[local5] & 0xFF000000 | local18 << 16 | local57 << 8 | local67;
		}
	}

	@OriginalMember(owner = "client!re", name = "rl", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method30716(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2122948015) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray40 = Class431.method29089(local13, arg2, 1419991555);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!re", name = "bfa", descriptor = "(Lclient!yp;S)V")
	static void method30717(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(Lclient!pf;I)I")
	public static int method30718(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if (arg0.method29945(Class330.anInt4185 * -1246449819, (byte) 1)) {
			local1++;
		}
		if (arg0.method29945(Class330.anInt4187 * -1030279809, (byte) 1)) {
			local1++;
		}
		if (arg0.method29945(Class430.anInt4639 * 545292705, (byte) 1)) {
			local1++;
		}
		if (arg0.method29945(Class330.anInt4189 * -670137465, (byte) 1)) {
			local1++;
		}
		if (arg0.method29945(Class430.anInt4641 * -151892225, (byte) 1)) {
			local1++;
		}
		if (arg0.method29945(Class80_Sub28_Sub8.anInt3037 * 1866429939, (byte) 1)) {
			local1++;
		}
		if (arg0.method29945(Class330.anInt4188 * -1430580093, (byte) 1)) {
			local1++;
		}
		if (arg0.method29945(Class699.anInt5812 * 1381845589, (byte) 1)) {
			local1++;
		}
		if (arg0.method29945(Class390.anInt4561 * 819940157, (byte) 1)) {
			local1++;
		}
		if (arg0.method29945(Class45.anInt2423 * 2065867053, (byte) 1)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!re", name = "fd", descriptor = "(IZI)V")
	public static void method30719(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		Class552.method31354(arg0, Class60.aClass60_99.method1180(Class512.aClass719_3, -1585419647), arg1, (byte) 56);
	}

	@OriginalMember(owner = "client!re", name = "hf", descriptor = "(IB)V")
	static void method30720(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) int local5 = client.currentCycle - client.anInt3425 * -875622609;
		if (local5 >= 100) {
			Class368.anInt4502 = Class676.method33586(1947851731) * 1633189263;
			Class130_Sub1.anInt1175 = -1464167667;
			Class588.anInt5304 = -503779167;
			return;
		}
		@Pc(35) float local35 = 1.0F - (float) ((100 - local5) * (100 - local5) * (100 - local5)) / 1000000.0F;
		@Pc(188) int local188;
		if (Class676.method33586(123043068) == 3) {
			@Pc(45) Class80_Sub33 local45 = BufferedSocket.aClass121_Sub1_2.method9603(-1628779323).method20519((byte) 0);
			@Pc(49) Class626 local49 = client.aClass539_1.method30893((byte) -20);
			client.anInt3481 = ((int) ((double) BufferedSocket.aClass121_Sub1_2.method9612(1853766937) * 2607.5945876176133D) & 0x3FFF) * -560342087;
			Class664.anInt5692 = ((int) ((double) BufferedSocket.aClass121_Sub1_2.method9648(1845836626) * -2607.5945876176133D) & 0x3FFF) * -399825347;
			Class338.anInt4231 = 0;
			client.anInt3498 = (int) ((float) (Class163.anInt2084 * -1371538825) + (float) ((int) ((double) (client.anInt3439 * -1389306785) / (Math.tan((double) (BufferedSocket.aClass121_Sub1_2.method9623(-233893999) / 2.0F)) * 4.0D)) - Class163.anInt2084 * -1371538825) * local35) * -1095333801;
			Class89.anInt319 = (int) (local35 * (float) (local45.anInt1655 * -1125961095 - local49.anInt5540 * 1854499328 - Class656.anInt5677 * -1992889671) + (float) (Class656.anInt5677 * -1992889671)) * 2068667409;
			Class283.anInt3937 = (int) ((float) (Class614.anInt5428 * 318274561) + local35 * (float) (-(local45.anInt1654 * 2058467157) - Class614.anInt5428 * 318274561)) * 364051605;
			Class102_Sub2.anInt653 = (int) ((float) (local45.anInt1653 * 1944136251 - local49.anInt5537 * 1677025792 - Class597.anInt5363 * -1806504753) * local35 + (float) (Class597.anInt5363 * -1806504753)) * 483037039;
			local188 = -(Class664.anInt5692 * -953671403) - Class118.anInt1027 * 816736115 & 0x3FFF;
			if (local188 > 8192) {
				local188 -= 16384;
			} else if (local188 < -8192) {
				local188 += 16384;
			}
		} else {
			@Pc(201) int local201 = (int) client.aFloat254;
			if (client.anInt3487 * 467081551 >> 8 > local201) {
				local201 = client.anInt3487 * 467081551 >> 8;
			}
			if (client.aBooleanArray21[4] && client.anIntArray330[4] + 128 > local201) {
				local201 = client.anIntArray330[4] + 128;
			}
			@Pc(240) int local240 = (int) client.aFloat255 + client.anInt3471 * 2051687043 & 0x3FFF;
			@Pc(244) Class463 local244 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
			Class616.method32289(Class268.anInt3917 * 1368033245, Class439.method29150((int) local244.aFloat297, (int) local244.aFloat296, Class507.anInt5045 * -1170417853, 1037753497) - client.anInt3486 * 67931827, Class315.anInt4021 * -262576965, local201, local240, (local201 >> 3) * 3 + 600 << 2, arg0, 1926098676);
			Class89.anInt319 = (int) ((float) (Class656.anInt5677 * -1992889671) + local35 * (float) (Class89.anInt319 * 1749751025 - Class656.anInt5677 * -1992889671)) * 2068667409;
			Class283.anInt3937 = (int) ((float) (Class614.anInt5428 * 318274561) + local35 * (float) (Class283.anInt3937 * -1465520451 - Class614.anInt5428 * 318274561)) * 364051605;
			Class102_Sub2.anInt653 = (int) ((float) (Class597.anInt5363 * -1806504753) + local35 * (float) (Class102_Sub2.anInt653 * 1132703631 - Class597.anInt5363 * -1806504753)) * 483037039;
			client.anInt3481 = (int) (local35 * (float) (client.anInt3481 * 1789770377 - Class451.anInt4891 * 554304799) + (float) (Class451.anInt4891 * 554304799)) * -560342087;
			local188 = Class664.anInt5692 * -953671403 - Class118.anInt1027 * 816736115;
			if (local188 > 8192) {
				local188 -= 16384;
			} else if (local188 < -8192) {
				local188 += 16384;
			}
		}
		Class664.anInt5692 = (int) ((float) local188 * local35 + (float) (Class118.anInt1027 * 816736115)) * -399825347;
		Class664.anInt5692 = (Class664.anInt5692 * -953671403 & 0x3FFF) * -399825347;
		client.anInt3498 = (int) ((float) (client.anInt3498 * 1097261927 - Class163.anInt2084 * -1371538825) * local35 + (float) (Class163.anInt2084 * -1371538825)) * -1095333801;
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	Class528() throws Throwable {
		throw new Error();
	}
}

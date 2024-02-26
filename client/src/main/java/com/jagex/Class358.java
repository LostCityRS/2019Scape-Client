package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class358 {

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!jd;")
	static final Class358 aClass358_4 = new Class358(0);

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!jd;")
	public static final Class358 aClass358_3 = new Class358(1);

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public int anInt4487;

	@OriginalMember(owner = "client!jd", name = "cx", descriptor = "(Lclient!yp;I)V")
	static void method28125(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2119061576);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class673.method33568(local16, local22, arg0, (byte) -120);
	}

	@OriginalMember(owner = "client!jd", name = "lf", descriptor = "(Lclient!yp;I)V")
	static void method28126(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2075220476);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class70.method1256(local16, local22, arg0, 1076340348);
	}

	@OriginalMember(owner = "client!jd", name = "ed", descriptor = "(I)I")
	public static int method28127(@OriginalArg(0) int arg0) {
		if ((double) Class159_Sub1.aFloat150 == 2.0D) {
			return 25;
		} else if ((double) Class159_Sub1.aFloat150 == 3.0D) {
			return 37;
		} else if ((double) Class159_Sub1.aFloat150 == 4.0D) {
			return 50;
		} else if ((double) Class159_Sub1.aFloat150 == 6.0D) {
			return 75;
		} else if ((double) Class159_Sub1.aFloat150 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!jd", name = "ajk", descriptor = "(Lclient!yp;B)V")
	static void method28128(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class159.anInt1991 + Class159_Sub1.anInt2026 * 2002101755;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class158.anInt2029 * 2067675511 + Class159.anInt1996;
	}

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "(II)V")
	static void method28129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class101.aClass243_7.method26247(arg0, (byte) 75);
	}

	@OriginalMember(owner = "client!jd", name = "vt", descriptor = "(Lclient!yp;B)V")
	static void method28130(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class80_Sub31 local18 = Class623.method32440(Class443.aClass443_93, client.aClass75_1.aClass22_1, -191270971);
		local18.aPacketBit_2.p2(local12);
		client.aClass75_1.method1325(local18, (byte) -63);
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V")
	Class358(@OriginalArg(0) int arg0) {
		this.anInt4487 = arg0 * 628998293;
	}
}

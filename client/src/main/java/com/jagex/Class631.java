package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class631 {

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
	public static final int anInt5574 = 6;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!wa", name = "auo", descriptor = "(Lclient!yp;I)V")
	static void method32720(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub27_3.method16402((byte) 77);
	}

	@OriginalMember(owner = "client!wa", name = "ig", descriptor = "(Lclient!yp;I)V")
	static void method32721(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class254.method26400(local11, local14, arg0, (byte) 2);
	}

	@OriginalMember(owner = "client!wa", name = "gc", descriptor = "(B)V")
	static void method32722(@OriginalArg(0) byte arg0) {
		Class514.method30571(-1925354276);
		client.aClass539_1.method30912(-1599343761);
		@Pc(6) int local6;
		for (local6 = 0; local6 < client.aClass101Array1.length; local6++) {
			client.aClass101Array1[local6] = null;
		}
		for (local6 = 0; local6 < client.aClass574Array1.length; local6++) {
			client.aClass574Array1[local6] = null;
		}
		Class710.method37161(17050619);
		for (local6 = 0; local6 < 2048; local6++) {
			client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local6] = null;
		}
		client.anInt3453 = 0;
		client.aClass24_18.method564(-1648871833);
		client.anInt3452 = 0;
		client.aClass24_22.method564(-90945247);
		Class151.method14543(Class676.method33586(-240296221), (byte) -98);
		client.anInt3459 = 0;
		Class672.aClass134_1.aClass636_1.method32852((byte) 16);
		Class327.aClass378_1 = null;
		Class453.aClass378_2 = null;
		Class144.aClass80_Sub32_2 = null;
		Class477.aClass80_Sub32_3 = null;
		Class134.aClass305_1 = null;
		client.aBoolean749 = true;
		Class533.aClass692_2 = null;
		Class80.aLong339 = 0L;
		Class392.method28680(1305557302);
		Class451.method29280(-863930962);
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	Class631() throws Throwable {
		throw new Error();
	}
}

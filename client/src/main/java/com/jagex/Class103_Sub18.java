package com.jagex;

import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agp")
public final class Class103_Sub18 extends Class103 {

	@OriginalMember(owner = "client!agp", name = "f", descriptor = "I")
	final int anInt997;

	@OriginalMember(owner = "client!agp", name = "l", descriptor = "[I")
	final int[] anIntArray94;

	@OriginalMember(owner = "client!agp", name = "e", descriptor = "I")
	final int anInt996;

	@OriginalMember(owner = "client!agp", name = "u", descriptor = "I")
	final int anInt998;

	@OriginalMember(owner = "client!agp", name = "hk", descriptor = "(Lclient!yp;I)V")
	static void method8400(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class630.method32716(local11, local14, true, 2, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!agp", name = "zn", descriptor = "(Lclient!yp;B)V")
	static void method8401(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(49) Class50 local49 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(local33, -1714171463);
		if (local49.aClass521_2.method37268() != local13 || local49.aClass521_1.method37268() != local23) {
			throw new RuntimeException(local33 + " " + local43);
		} else if (local23 == Class521.aClass521_42.method37268()) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local49.method1016(local43, -343691795);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local49.method1033(local43, -83186389);
		}
	}

	@OriginalMember(owner = "client!agp", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub18(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt997 = arg0.method23178((byte) -5) * -1417340513;
		this.anIntArray94 = new int[4];
		this.anInt996 = arg0.method23210((byte) 46) * 1370742333;
		Arrays.fill(this.anIntArray94, 0, this.anIntArray94.length, this.anInt996 * 229845269);
		this.anInt998 = arg0.method23182(1354462741) * 339020525;
	}

	@OriginalMember(owner = "client!agp", name = "u", descriptor = "(I)Z")
	@Override
	boolean method19201(@OriginalArg(0) int arg0) {
		@Pc(8) Class261 local8 = (Class261) Class125.aClass41_Sub1_6.method18054(this.anInt996 * 229845269, 1939595836);
		return local8.method26480(1740709047);
	}

	@OriginalMember(owner = "client!agp", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		@Pc(8) Class120_Sub1_Sub1_Sub1 local8 = Class251.aClass254Array1[this.anInt997 * 942654047].method26399((byte) 28);
		if (this.anInt998 * 394846949 == 0) {
			Class302.method27107(local8, this.anIntArray94, 0, false, -2015461947);
		} else {
			Class110_Sub1.method7316(local8, new int[] { this.anInt996 * 229845269 }, new int[] { 0 }, new int[] { this.anInt998 * 394846949 }, 280738967);
		}
	}

	@OriginalMember(owner = "client!agp", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		@Pc(8) Class120_Sub1_Sub1_Sub1 local8 = Class251.aClass254Array1[this.anInt997 * 942654047].method26399((byte) -10);
		if (this.anInt998 * 394846949 == 0) {
			Class302.method27107(local8, this.anIntArray94, 0, false, -1949651121);
		} else {
			Class110_Sub1.method7316(local8, new int[] { this.anInt996 * 229845269 }, new int[] { 0 }, new int[] { this.anInt998 * 394846949 }, 948179628);
		}
	}

	@OriginalMember(owner = "client!agp", name = "i", descriptor = "()Z")
	@Override
	boolean method19199() {
		@Pc(8) Class261 local8 = (Class261) Class125.aClass41_Sub1_6.method18054(this.anInt996 * 229845269, 780967285);
		return local8.method26480(1740709047);
	}

	@OriginalMember(owner = "client!agp", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		@Pc(8) Class120_Sub1_Sub1_Sub1 local8 = Class251.aClass254Array1[this.anInt997 * 942654047].method26399((byte) 102);
		if (this.anInt998 * 394846949 == 0) {
			Class302.method27107(local8, this.anIntArray94, 0, false, -2119857278);
		} else {
			Class110_Sub1.method7316(local8, new int[] { this.anInt996 * 229845269 }, new int[] { 0 }, new int[] { this.anInt998 * 394846949 }, 1828606650);
		}
	}

	@OriginalMember(owner = "client!agp", name = "m", descriptor = "()Z")
	@Override
	boolean method19204() {
		@Pc(8) Class261 local8 = (Class261) Class125.aClass41_Sub1_6.method18054(this.anInt996 * 229845269, 933587531);
		return local8.method26480(1740709047);
	}
}

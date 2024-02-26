package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ark")
public final class Class80_Sub28_Sub6 extends Class80_Sub28 {

	@OriginalMember(owner = "client!ark", name = "l", descriptor = "B")
	byte aByte81;

	@OriginalMember(owner = "client!ark", name = "u", descriptor = "Z")
	boolean aBoolean570;

	@OriginalMember(owner = "client!ark", name = "i", descriptor = "B")
	byte aByte82;

	@OriginalMember(owner = "client!ark", name = "m", descriptor = "B")
	byte aByte83;

	@OriginalMember(owner = "client!ark", name = "g", descriptor = "B")
	byte aByte84;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ark", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_6;

	@OriginalMember(owner = "client!ark", name = "bcd", descriptor = "(Lclient!yp;B)V")
	static void method21914(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < Class626.aClass141_Sub1Array2.length; local5++) {
			if (Class626.aClass141_Sub1Array2[local5] != null && Class626.aClass141_Sub1Array2[local5].method10918(1876608257)) {
				local1 += Class626.aClass141_Sub1Array2[local5].method10922((byte) 36);
				local3 += Class626.aClass141_Sub1Array2[local5].method10940(-856515571);
			}
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local1 == 0 ? 0 : local3 * 100 / local1;
	}

	@OriginalMember(owner = "client!ark", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub6(@OriginalArg(0) Class387 arg0) {
		this.aClass387_6 = arg0;
	}

	@OriginalMember(owner = "client!ark", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean570 = arg0.method23362(362659308) == 1;
		this.aByte81 = arg0.method23177((byte) 23);
		this.aByte84 = arg0.method23177((byte) -116);
		this.aByte82 = arg0.method23177((byte) -1);
		this.aByte83 = arg0.method23177((byte) -43);
	}

	@OriginalMember(owner = "client!ark", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.aBoolean850 = this.aBoolean570;
		arg0.aByte137 = this.aByte81;
		arg0.aByte140 = this.aByte84;
		arg0.aByte139 = this.aByte82;
		arg0.aByte138 = this.aByte83;
	}

	@OriginalMember(owner = "client!ark", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aBoolean570 = arg0.method23362(85422821) == 1;
		this.aByte81 = arg0.method23177((byte) -66);
		this.aByte84 = arg0.method23177((byte) -3);
		this.aByte82 = arg0.method23177((byte) -120);
		this.aByte83 = arg0.method23177((byte) -12);
	}

	@OriginalMember(owner = "client!ark", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aBoolean570 = arg0.method23362(-719787837) == 1;
		this.aByte81 = arg0.method23177((byte) -17);
		this.aByte84 = arg0.method23177((byte) -24);
		this.aByte82 = arg0.method23177((byte) -99);
		this.aByte83 = arg0.method23177((byte) -84);
	}

	@OriginalMember(owner = "client!ark", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aBoolean570 = arg0.method23362(1118770705) == 1;
		this.aByte81 = arg0.method23177((byte) -94);
		this.aByte84 = arg0.method23177((byte) -125);
		this.aByte82 = arg0.method23177((byte) -63);
		this.aByte83 = arg0.method23177((byte) -16);
	}

	@OriginalMember(owner = "client!ark", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.aBoolean850 = this.aBoolean570;
		arg0.aByte137 = this.aByte81;
		arg0.aByte140 = this.aByte84;
		arg0.aByte139 = this.aByte82;
		arg0.aByte138 = this.aByte83;
	}
}

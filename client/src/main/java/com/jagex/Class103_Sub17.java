package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agn")
public abstract class Class103_Sub17 extends Class103 {

	@OriginalMember(owner = "client!agn", name = "f", descriptor = "I")
	final int anInt2750;

	@OriginalMember(owner = "client!agn", name = "e", descriptor = "I")
	final int anInt2749;

	@OriginalMember(owner = "client!agn", name = "u", descriptor = "I")
	final int anInt2751;

	@OriginalMember(owner = "client!agn", name = "by", descriptor = "(II)Z")
	static boolean method19211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9 || arg0 == 10 || arg0 == 11 || arg0 == 12 || arg0 == 13 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!agn", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub17(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt2750 = arg0.g2() * -1879043199;
		this.anInt2749 = arg0.g2() * 1471593521;
		this.anInt2751 = arg0.g1() * -1047450427;
	}

	@OriginalMember(owner = "client!agn", name = "u", descriptor = "(I)Z")
	@Override
	final boolean method19201(@OriginalArg(0) int arg0) {
		@Pc(8) Class684 local8 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.anInt2750 * -1969476479, -2101364935);
		@Pc(12) boolean local12 = local8.method36785(-1689667733);
		@Pc(21) Class261 local21 = (Class261) Class125.aClass41_Sub1_6.method18054(local8.anInt5764 * 319211597, -1826336375);
		return local12 & local21.method26480(1740709047);
	}

	@OriginalMember(owner = "client!agn", name = "m", descriptor = "()Z")
	@Override
	final boolean method19204() {
		@Pc(8) Class684 local8 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.anInt2750 * -1969476479, 1868852548);
		@Pc(12) boolean local12 = local8.method36785(-1045169798);
		@Pc(21) Class261 local21 = (Class261) Class125.aClass41_Sub1_6.method18054(local8.anInt5764 * 319211597, 2130828316);
		return local12 & local21.method26480(1740709047);
	}

	@OriginalMember(owner = "client!agn", name = "i", descriptor = "()Z")
	@Override
	final boolean method19199() {
		@Pc(8) Class684 local8 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.anInt2750 * -1969476479, 1307840431);
		@Pc(12) boolean local12 = local8.method36785(-1969366132);
		@Pc(21) Class261 local21 = (Class261) Class125.aClass41_Sub1_6.method18054(local8.anInt5764 * 319211597, -508741270);
		return local12 & local21.method26480(1740709047);
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agt")
public final class Class103_Sub21 extends Class103 {

	@OriginalMember(owner = "client!agt", name = "f", descriptor = "J")
	final long aLong30;

	@OriginalMember(owner = "client!agt", name = "e", descriptor = "I")
	final int anInt1011;

	@OriginalMember(owner = "client!agt", name = "bw", descriptor = "(III)I")
	static int method8569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 == Class607.aClass607_3.anInt5396 * 1323580581 || Class607.aClass607_5.anInt5396 * 1323580581 == arg0 ? Class120_Sub1_Sub2_Sub1.anIntArray177[arg1 & 0x3] : Class120_Sub1_Sub2_Sub1.anIntArray176[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!agt", name = "sg", descriptor = "(Lclient!yp;I)V")
	static void method8570(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4091 * -13185357;
	}

	@OriginalMember(owner = "client!agt", name = "<init>", descriptor = "(Lclient!ald;Z)V")
	Class103_Sub21(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		super(arg0);
		@Pc(6) int local6 = arg0.g2();
		if (arg1) {
			this.aLong30 = ((long) local6 | 0x100000000L) * -4912055674270598055L;
		} else {
			this.aLong30 = (long) local6 * -4912055674270598055L;
		}
		this.anInt1011 = arg0.g4() * 327107067;
	}

	@OriginalMember(owner = "client!agt", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		@Pc(7) Class80_Sub20 local7 = (Class80_Sub20) Class251.aClass24_25.method560(this.aLong30 * 695806605444434921L);
		if (local7 == null) {
			Class251.aClass24_25.method563(new Class80_Sub20(this.anInt1011 * -1111121613), this.aLong30 * 695806605444434921L);
		} else {
			local7.anInt1588 = this.anInt1011 * 914742485;
		}
	}

	@OriginalMember(owner = "client!agt", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		@Pc(7) Class80_Sub20 local7 = (Class80_Sub20) Class251.aClass24_25.method560(this.aLong30 * 695806605444434921L);
		if (local7 == null) {
			Class251.aClass24_25.method563(new Class80_Sub20(this.anInt1011 * -1111121613), this.aLong30 * 695806605444434921L);
		} else {
			local7.anInt1588 = this.anInt1011 * 914742485;
		}
	}

	@OriginalMember(owner = "client!agt", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		@Pc(7) Class80_Sub20 local7 = (Class80_Sub20) Class251.aClass24_25.method560(this.aLong30 * 695806605444434921L);
		if (local7 == null) {
			Class251.aClass24_25.method563(new Class80_Sub20(this.anInt1011 * -1111121613), this.aLong30 * 695806605444434921L);
		} else {
			local7.anInt1588 = this.anInt1011 * 914742485;
		}
	}
}

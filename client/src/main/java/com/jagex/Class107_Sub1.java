package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afi")
public final class Class107_Sub1 extends Class107 {

	@OriginalMember(owner = "client!afi", name = "pl", descriptor = "I")
	static int anInt682;

	@OriginalMember(owner = "client!afi", name = "ams", descriptor = "(Lclient!yp;I)V")
	static void method5712(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class293.method26958(local13, local23, 1485134830) ? 1 : 0;
	}

	@OriginalMember(owner = "client!afi", name = "<init>", descriptor = "(Lclient!qt;I)V")
	Class107_Sub1(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!afi", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!afi", name = "l", descriptor = "(Lclient!ald;IB)V")
	@Override
	void method7186(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
	}

	@OriginalMember(owner = "client!afi", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!afi", name = "o", descriptor = "(Lclient!ald;I)V")
	@Override
	void method7188(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!afi", name = "m", descriptor = "(Lclient!ald;I)V")
	@Override
	void method7187(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}
}

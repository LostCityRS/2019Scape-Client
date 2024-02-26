package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
final class Class258 implements Interface43 {

	@OriginalMember(owner = "client!fb", name = "rg", descriptor = "I")
	static int anInt3887;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fb", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_2;

	@OriginalMember(owner = "client!fb", name = "sl", descriptor = "(Lclient!yp;I)V")
	static void method26439(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4117 * -706354509;
	}

	@OriginalMember(owner = "client!fb", name = "aku", descriptor = "(Lclient!yp;I)V")
	static void method26440(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class550.method31319(local13, local23 >> 14 & 0x3FFF, local23 & 0x3FFF, false, 714409180);
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class258(@OriginalArg(0) Class263 arg0) {
		this.aClass263_2 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "(I)F")
	@Override
	public float method26841(@OriginalArg(0) int arg0) {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_2.method16402((byte) 3) / 255.0F;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "()F")
	@Override
	public float method26842() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_2.method16402((byte) 83) / 255.0F;
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "()F")
	@Override
	public float method26840() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_2.method16402((byte) -90) / 255.0F;
	}

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "()F")
	@Override
	public float method26843() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_2.method16402((byte) -42) / 255.0F;
	}

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "()F")
	@Override
	public float method26844() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_2.method16402((byte) 66) / 255.0F;
	}
}

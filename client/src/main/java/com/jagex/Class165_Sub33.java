package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ani")
public final class Class165_Sub33 extends Class165 {

	@OriginalMember(owner = "client!ani", name = "g", descriptor = "I")
	static final int anInt2301 = 4;

	@OriginalMember(owner = "client!ani", name = "i", descriptor = "I")
	static final int anInt2302 = 0;

	@OriginalMember(owner = "client!ani", name = "ajg", descriptor = "(Lclient!yp;B)V")
	static void method16546(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(22) Class80_Sub1_Sub12 local22 = Class159.method15338(local12 >> 14 & 0x3FFF, local12 & 0x3FFF);
		if (local22 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local22.anInt3091 * 1774210559;
		}
	}

	@OriginalMember(owner = "client!ani", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub33(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ani", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ani", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 0;
	}

	@OriginalMember(owner = "client!ani", name = "a", descriptor = "(I)V")
	public void method16542(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 19) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ani", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ani", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ani", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 0;
	}

	@OriginalMember(owner = "client!ani", name = "s", descriptor = "(I)I")
	public int method16543(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ani", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!ani", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ani", name = "k", descriptor = "()V")
	public void method16544() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) -2) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ani", name = "x", descriptor = "()I")
	public int method16545() {
		return this.anInt2398 * -229615671;
	}
}

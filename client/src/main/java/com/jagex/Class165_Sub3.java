package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amc")
public final class Class165_Sub3 extends Class165 {

	@OriginalMember(owner = "client!amc", name = "i", descriptor = "I")
	static final int anInt2110 = 1;

	@OriginalMember(owner = "client!amc", name = "g", descriptor = "I")
	static final int anInt2111 = 0;

	@OriginalMember(owner = "client!amc", name = "as", descriptor = "(IIIIB)V")
	static void method15881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(20, (long) arg1 << 32 | (long) arg0);
		local9.method22135(-457826299);
		local9.anInt3064 = arg2 * -1221031713;
		local9.anInt3047 = arg3 * 673180539;
	}

	@OriginalMember(owner = "client!amc", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amc", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub3(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amc", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amc", name = "a", descriptor = "(S)V")
	public void method15879(@OriginalArg(0) short arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 1) {
			this.anInt2398 = this.method16949((byte) 92) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amc", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amc", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "s", descriptor = "(I)I")
	public int method15880(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amc", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amc", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}
}

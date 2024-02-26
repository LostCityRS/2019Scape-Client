package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amt")
public final class Class165_Sub20 extends Class165 {

	@OriginalMember(owner = "client!amt", name = "i", descriptor = "I")
	static final int anInt2218 = 3;

	@OriginalMember(owner = "client!amt", name = "g", descriptor = "I")
	static final int anInt2219 = 0;

	@OriginalMember(owner = "client!amt", name = "abo", descriptor = "(Lclient!yp;I)V")
	static void method16229(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class288) Class134.aClass305_1.method27131((byte) -64).get(local12)).method26908((byte) -12);
	}

	@OriginalMember(owner = "client!amt", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amt", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub20(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amt", name = "k", descriptor = "()V")
	public void method16224() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -54) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amt", name = "s", descriptor = "(I)I")
	public int method16225(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amt", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amt", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!amt", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amt", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amt", name = "a", descriptor = "(I)V")
	public void method16226(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 69) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amt", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 0;
	}

	@OriginalMember(owner = "client!amt", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 0;
	}

	@OriginalMember(owner = "client!amt", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amt", name = "x", descriptor = "()V")
	public void method16227() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 41) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amt", name = "w", descriptor = "()I")
	public int method16228() {
		return this.anInt2398 * -229615671;
	}
}

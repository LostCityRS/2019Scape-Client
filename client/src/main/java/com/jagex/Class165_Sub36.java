package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anl")
public final class Class165_Sub36 extends Class165 {

	@OriginalMember(owner = "client!anl", name = "g", descriptor = "I")
	public static final int anInt2320 = 1;

	@OriginalMember(owner = "client!anl", name = "i", descriptor = "I")
	public static final int anInt2321 = 0;

	@OriginalMember(owner = "client!anl", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anl", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub36(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anl", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anl", name = "a", descriptor = "(S)V")
	public void method16603(@OriginalArg(0) short arg0) {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) -92) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anl", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anl", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anl", name = "r", descriptor = "()I")
	public int method16604() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anl", name = "s", descriptor = "(B)I")
	public int method16605(@OriginalArg(0) byte arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anl", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!anl", name = "k", descriptor = "()V")
	public void method16606() {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) -18) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anl", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anl", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!anl", name = "x", descriptor = "()V")
	public void method16607() {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) -72) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anl", name = "w", descriptor = "()V")
	public void method16608() {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) 55) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anl", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}
}

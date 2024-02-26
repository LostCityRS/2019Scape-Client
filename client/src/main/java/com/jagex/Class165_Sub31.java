package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anf")
public final class Class165_Sub31 extends Class165 {

	@OriginalMember(owner = "client!anf", name = "g", descriptor = "I")
	static final int anInt2288 = 0;

	@OriginalMember(owner = "client!anf", name = "i", descriptor = "I")
	static final int anInt2289 = 1;

	@OriginalMember(owner = "client!anf", name = "m", descriptor = "I")
	static final int anInt2290 = 3;

	@OriginalMember(owner = "client!anf", name = "iz", descriptor = "(Lclient!yp;I)V")
	static void method16480(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!anf", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anf", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub31(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anf", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anf", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anf", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(-679483818), 913643797) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anf", name = "s", descriptor = "(B)I")
	public int method16476(@OriginalArg(0) byte arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anf", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(1875856935), 913643797) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anf", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!anf", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!anf", name = "a", descriptor = "(I)V")
	public void method16477(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 125) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anf", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anf", name = "k", descriptor = "()V")
	public void method16478() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 122) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anf", name = "x", descriptor = "()I")
	public int method16479() {
		return this.anInt2398 * -229615671;
	}
}

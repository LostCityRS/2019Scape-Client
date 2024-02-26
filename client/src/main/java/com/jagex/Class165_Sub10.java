package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amj")
public final class Class165_Sub10 extends Class165 {

	@OriginalMember(owner = "client!amj", name = "i", descriptor = "I")
	public static final int anInt2152 = 1;

	@OriginalMember(owner = "client!amj", name = "g", descriptor = "I")
	public static final int anInt2153 = 0;

	@OriginalMember(owner = "client!amj", name = "m", descriptor = "I")
	public static final int anInt2154 = 2;

	@OriginalMember(owner = "client!amj", name = "o", descriptor = "I")
	public static final int anInt2155 = 3;

	@OriginalMember(owner = "client!amj", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amj", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub10(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amj", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 2;
	}

	@OriginalMember(owner = "client!amj", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amj", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amj", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "r", descriptor = "()I")
	public int method16017() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amj", name = "s", descriptor = "(I)I")
	public int method16018(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amj", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 2;
	}

	@OriginalMember(owner = "client!amj", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "x", descriptor = "()V")
	public void method16019() {
		if (this.aClass80_Sub37_48.aClass165_Sub25_1.method16332(-441029515) == 2 && this.anInt2398 * -229615671 == 2) {
			this.anInt2398 = 251097721;
		}
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 58) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amj", name = "k", descriptor = "()V")
	public void method16020() {
		if (this.aClass80_Sub37_48.aClass165_Sub25_1.method16332(-441029515) == 2 && this.anInt2398 * -229615671 == 2) {
			this.anInt2398 = 251097721;
		}
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -1) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amj", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 2;
	}

	@OriginalMember(owner = "client!amj", name = "w", descriptor = "()I")
	public int method16021() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amj", name = "a", descriptor = "(B)V")
	public void method16022(@OriginalArg(0) byte arg0) {
		if (this.aClass80_Sub37_48.aClass165_Sub25_1.method16332(-441029515) == 2 && this.anInt2398 * -229615671 == 2) {
			this.anInt2398 = 251097721;
		}
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 38) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amj", name = "q", descriptor = "()I")
	public int method16023() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amj", name = "h", descriptor = "()I")
	public int method16024() {
		return this.anInt2398 * -229615671;
	}
}

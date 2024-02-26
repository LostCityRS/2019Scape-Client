package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amr")
public final class Class165_Sub18 extends Class165 {

	@OriginalMember(owner = "client!amr", name = "g", descriptor = "I")
	public static final int anInt2207 = 1;

	@OriginalMember(owner = "client!amr", name = "i", descriptor = "I")
	public static final int anInt2208 = 2;

	@OriginalMember(owner = "client!amr", name = "m", descriptor = "I")
	public static final int anInt2209 = 3;

	@OriginalMember(owner = "client!amr", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amr", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub18(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amr", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return this.aClass80_Sub37_48.method14947(-1816596489).method443(702467065) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amr", name = "a", descriptor = "(I)V")
	public void method16182(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -22) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amr", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return this.aClass80_Sub37_48.method14947(889605750).method443(1704425665) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amr", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amr", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amr", name = "s", descriptor = "(S)I")
	public int method16183(@OriginalArg(0) short arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amr", name = "x", descriptor = "()V")
	public void method16184() {
		if (this.anInt2398 * -229615671 < 1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -98) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amr", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amr", name = "k", descriptor = "()V")
	public void method16185() {
		if (this.anInt2398 * -229615671 < 1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -6) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amr", name = "w", descriptor = "()V")
	public void method16186() {
		if (this.anInt2398 * -229615671 < 1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -100) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amr", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amr", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return this.aClass80_Sub37_48.method14947(-115639625).method443(-1032984535) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amr", name = "r", descriptor = "()V")
	public void method16187() {
		if (this.anInt2398 * -229615671 < 1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 66) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amr", name = "q", descriptor = "()I")
	public int method16188() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amr", name = "h", descriptor = "()I")
	public int method16189() {
		return this.anInt2398 * -229615671;
	}
}

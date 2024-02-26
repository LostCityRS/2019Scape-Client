package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amn")
public final class Class165_Sub14 extends Class165 {

	@OriginalMember(owner = "client!amn", name = "m", descriptor = "I")
	static final int anInt2179 = 30;

	@OriginalMember(owner = "client!amn", name = "i", descriptor = "I")
	static final int anInt2180 = 300;

	@OriginalMember(owner = "client!amn", name = "g", descriptor = "I")
	static final int anInt2181 = 5;

	@OriginalMember(owner = "client!amn", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub14(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amn", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amn", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amn", name = "a", descriptor = "(S)V")
	public void method16102(@OriginalArg(0) short arg0) {
		this.anInt2398 = Math.min(Math.max(this.anInt2398 * -229615671, 5), 300) * 251097721;
	}

	@OriginalMember(owner = "client!amn", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 30;
	}

	@OriginalMember(owner = "client!amn", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amn", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amn", name = "k", descriptor = "()V")
	public void method16103() {
		this.anInt2398 = Math.min(Math.max(this.anInt2398 * -229615671, 5), 300) * 251097721;
	}

	@OriginalMember(owner = "client!amn", name = "s", descriptor = "(B)I")
	public int method16104(@OriginalArg(0) byte arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amn", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 30;
	}

	@OriginalMember(owner = "client!amn", name = "x", descriptor = "()V")
	public void method16105() {
		this.anInt2398 = Math.min(Math.max(this.anInt2398 * -229615671, 5), 300) * 251097721;
	}

	@OriginalMember(owner = "client!amn", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amn", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 30;
	}
}

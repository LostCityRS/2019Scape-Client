package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amw")
public final class Class165_Sub23 extends Class165 {

	@OriginalMember(owner = "client!amw", name = "i", descriptor = "I")
	static final int anInt2238 = 1;

	@OriginalMember(owner = "client!amw", name = "g", descriptor = "I")
	static final int anInt2239 = 0;

	@OriginalMember(owner = "client!amw", name = "m", descriptor = "I")
	static final int anInt2240 = 3;

	@OriginalMember(owner = "client!amw", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amw", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub23(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amw", name = "x", descriptor = "()V")
	public void method16288() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -90) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amw", name = "r", descriptor = "()I")
	public int method16289() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amw", name = "a", descriptor = "(I)V")
	public void method16290(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -104) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amw", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amw", name = "k", descriptor = "()V")
	public void method16291() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 97) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amw", name = "s", descriptor = "(I)I")
	public int method16292(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amw", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!amw", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!amw", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amw", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amw", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amw", name = "w", descriptor = "()I")
	public int method16293() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amw", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}
}

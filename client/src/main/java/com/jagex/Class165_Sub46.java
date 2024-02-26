package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anx")
public final class Class165_Sub46 extends Class165 {

	@OriginalMember(owner = "client!anx", name = "i", descriptor = "I")
	public static final int anInt2393 = 0;

	@OriginalMember(owner = "client!anx", name = "g", descriptor = "I")
	public static final int anInt2394 = 1;

	@OriginalMember(owner = "client!anx", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!anx", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub46(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anx", name = "s", descriptor = "(I)I")
	public int method16910(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anx", name = "k", descriptor = "()V")
	public void method16911() {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) 38) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anx", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anx", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anx", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anx", name = "a", descriptor = "(I)V")
	public void method16912(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) -71) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anx", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!anx", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!anx", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anx", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anx", name = "x", descriptor = "()V")
	public void method16913() {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) 67) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anx", name = "w", descriptor = "()I")
	public int method16914() {
		return this.anInt2398 * -229615671;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!and")
public final class Class165_Sub29 extends Class165 {

	@OriginalMember(owner = "client!and", name = "g", descriptor = "I")
	static final int anInt2273 = -3;

	@OriginalMember(owner = "client!and", name = "i", descriptor = "I")
	static final int anInt2274 = -2;

	@OriginalMember(owner = "client!and", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!and", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub29(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!and", name = "k", descriptor = "()V")
	public void method16440() {
		if (this.anInt2398 * -229615671 < -3) {
			this.anInt2398 = this.method16949((byte) 126) * 251097721;
		}
	}

	@OriginalMember(owner = "client!and", name = "a", descriptor = "(B)V")
	public void method16441(@OriginalArg(0) byte arg0) {
		if (this.anInt2398 * -229615671 < -3) {
			this.anInt2398 = this.method16949((byte) 86) * 251097721;
		}
	}

	@OriginalMember(owner = "client!and", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!and", name = "s", descriptor = "(I)I")
	public int method16442(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!and", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return -2;
	}

	@OriginalMember(owner = "client!and", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return -2;
	}

	@OriginalMember(owner = "client!and", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return -2;
	}

	@OriginalMember(owner = "client!and", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!and", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!and", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!and", name = "x", descriptor = "()V")
	public void method16443() {
		if (this.anInt2398 * -229615671 < -3) {
			this.anInt2398 = this.method16949((byte) -104) * 251097721;
		}
	}
}

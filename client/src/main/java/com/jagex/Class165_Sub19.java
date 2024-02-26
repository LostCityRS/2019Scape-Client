package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ams")
public final class Class165_Sub19 extends Class165 {

	@OriginalMember(owner = "client!ams", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ams", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub19(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ams", name = "k", descriptor = "()V")
	public void method16203() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) -74) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ams", name = "x", descriptor = "()V")
	public void method16204() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) -103) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ams", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ams", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!ams", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ams", name = "s", descriptor = "(I)I")
	public int method16205(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ams", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 3;
	}

	@OriginalMember(owner = "client!ams", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 3;
	}

	@OriginalMember(owner = "client!ams", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ams", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ams", name = "w", descriptor = "()V")
	public void method16206() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 47) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ams", name = "r", descriptor = "()V")
	public void method16207() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) -5) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ams", name = "a", descriptor = "(B)V")
	public void method16208(@OriginalArg(0) byte arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 118) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ams", name = "q", descriptor = "()I")
	public int method16209() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ams", name = "h", descriptor = "()I")
	public int method16210() {
		return this.anInt2398 * -229615671;
	}
}

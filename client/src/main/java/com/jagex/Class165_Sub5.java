package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ame")
public final class Class165_Sub5 extends Class165 {

	@OriginalMember(owner = "client!ame", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ame", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub5(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ame", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ame", name = "a", descriptor = "(I)V")
	public void method15911(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < Class353.aClass353_1.getId() || this.anInt2398 * -229615671 > Class353.aClass353_2.getId()) {
			this.anInt2398 = this.method16949((byte) 95) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ame", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return Class353.aClass353_1.getId();
	}

	@OriginalMember(owner = "client!ame", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ame", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return Class353.aClass353_1.getId();
	}

	@OriginalMember(owner = "client!ame", name = "s", descriptor = "(I)I")
	public int method15912(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ame", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return Class353.aClass353_1.getId();
	}

	@OriginalMember(owner = "client!ame", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ame", name = "r", descriptor = "()I")
	public int method15913() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ame", name = "k", descriptor = "()V")
	public void method15914() {
		if (this.anInt2398 * -229615671 < Class353.aClass353_1.getId() || this.anInt2398 * -229615671 > Class353.aClass353_2.getId()) {
			this.anInt2398 = this.method16949((byte) 21) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ame", name = "x", descriptor = "()V")
	public void method15915() {
		if (this.anInt2398 * -229615671 < Class353.aClass353_1.getId() || this.anInt2398 * -229615671 > Class353.aClass353_2.getId()) {
			this.anInt2398 = this.method16949((byte) 103) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ame", name = "w", descriptor = "()V")
	public void method15916() {
		if (this.anInt2398 * -229615671 < Class353.aClass353_1.getId() || this.anInt2398 * -229615671 > Class353.aClass353_2.getId()) {
			this.anInt2398 = this.method16949((byte) -83) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ame", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ank")
public final class Class165_Sub35 extends Class165 {

	@OriginalMember(owner = "client!ank", name = "i", descriptor = "I")
	public static final int anInt2314 = 0;

	@OriginalMember(owner = "client!ank", name = "g", descriptor = "I")
	public static final int anInt2315 = 1;

	@OriginalMember(owner = "client!ank", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub35(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ank", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ank", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "a", descriptor = "(I)V")
	public void method16581(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) 111) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ank", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "s", descriptor = "(I)Z")
	public boolean method16582(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ank", name = "h", descriptor = "()Z")
	public boolean method16583() {
		return true;
	}

	@OriginalMember(owner = "client!ank", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ank", name = "k", descriptor = "(I)I")
	public int method16584(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ank", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ank", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "w", descriptor = "()V")
	public void method16585() {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) -44) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ank", name = "r", descriptor = "()V")
	public void method16586() {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) 25) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ank", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!ank", name = "q", descriptor = "()Z")
	public boolean method16587() {
		return true;
	}

	@OriginalMember(owner = "client!ank", name = "d", descriptor = "()I")
	public int method16588() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ank", name = "x", descriptor = "()V")
	public void method16589() {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) 26) * 251097721;
		}
	}
}

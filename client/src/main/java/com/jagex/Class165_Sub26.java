package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amz")
public final class Class165_Sub26 extends Class165 {

	@OriginalMember(owner = "client!amz", name = "i", descriptor = "I")
	public static final int anInt2257 = 0;

	@OriginalMember(owner = "client!amz", name = "g", descriptor = "I")
	public static final int anInt2258 = 1;

	@OriginalMember(owner = "client!amz", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amz", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub26(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amz", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!amz", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amz", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amz", name = "s", descriptor = "(B)Z")
	public boolean method16350(@OriginalArg(0) byte arg0) {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!amz", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10 ? 1 : 3;
	}

	@OriginalMember(owner = "client!amz", name = "a", descriptor = "(I)V")
	public void method16351(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub37_48.method14956((short) 16383) != Class722.aClass722_10) {
			this.anInt2398 = 251097721;
		}
		if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) 26) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amz", name = "r", descriptor = "()Z")
	public boolean method16352() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!amz", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!amz", name = "w", descriptor = "()V")
	public void method16353() {
		if (this.aClass80_Sub37_48.method14956((short) 16383) != Class722.aClass722_10) {
			this.anInt2398 = 251097721;
		}
		if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) -25) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amz", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10 ? 1 : 3;
	}

	@OriginalMember(owner = "client!amz", name = "x", descriptor = "()V")
	public void method16354() {
		if (this.aClass80_Sub37_48.method14956((short) 16383) != Class722.aClass722_10) {
			this.anInt2398 = 251097721;
		}
		if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) 65) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amz", name = "k", descriptor = "(I)I")
	public int method16355(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amz", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amz", name = "q", descriptor = "()Z")
	public boolean method16356() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!amz", name = "h", descriptor = "()Z")
	public boolean method16357() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!amz", name = "d", descriptor = "()I")
	public int method16358() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amz", name = "z", descriptor = "()I")
	public int method16359() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amz", name = "p", descriptor = "()I")
	public int method16360() {
		return this.anInt2398 * -229615671;
	}
}

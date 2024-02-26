package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anv")
public final class Class165_Sub44 extends Class165 {

	@OriginalMember(owner = "client!anv", name = "i", descriptor = "I")
	public static final int anInt2375 = 1;

	@OriginalMember(owner = "client!anv", name = "j", descriptor = "I")
	public static final int anInt2376 = 4;

	@OriginalMember(owner = "client!anv", name = "m", descriptor = "I")
	static final int anInt2377 = 2;

	@OriginalMember(owner = "client!anv", name = "o", descriptor = "I")
	public static final int anInt2378 = 3;

	@OriginalMember(owner = "client!anv", name = "g", descriptor = "I")
	public static final int anInt2379 = 0;

	@OriginalMember(owner = "client!anv", name = "a", descriptor = "I")
	public static final int anInt2380 = 5;

	@OriginalMember(owner = "client!anv", name = "f", descriptor = "(Lclient!pf;IILclient!aaf;I)Lclient!aan;")
	public static Class15 method16877(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3, @OriginalArg(4) int arg4) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : new Class15(local5, arg3);
	}

	@OriginalMember(owner = "client!anv", name = "aj", descriptor = "(III)V")
	static void method16878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(1, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!anv", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub44(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anv", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anv", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anv", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 0;
	}

	@OriginalMember(owner = "client!anv", name = "a", descriptor = "(B)V")
	public void method16873(@OriginalArg(0) byte arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 5 || this.anInt2398 * -229615671 == 2) {
			this.anInt2398 = this.method16949((byte) 6) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anv", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!anv", name = "k", descriptor = "()V")
	public void method16874() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 5 || this.anInt2398 * -229615671 == 2) {
			this.anInt2398 = this.method16949((byte) 62) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anv", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anv", name = "s", descriptor = "(I)I")
	public int method16875(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anv", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 0;
	}

	@OriginalMember(owner = "client!anv", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anv", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anv", name = "x", descriptor = "()I")
	public int method16876() {
		return this.anInt2398 * -229615671;
	}
}

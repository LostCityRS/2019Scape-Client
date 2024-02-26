package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anr")
public final class Class165_Sub40 extends Class165 {

	@OriginalMember(owner = "client!anr", name = "g", descriptor = "I")
	public static final int anInt2351 = 0;

	@OriginalMember(owner = "client!anr", name = "i", descriptor = "I")
	static final int anInt2352 = 1;

	@OriginalMember(owner = "client!anr", name = "lp", descriptor = "(Lclient!hx;Lclient!yp;I)V")
	static void method16785(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		arg1.anInt5778 -= 2036747717;
		@Pc(15) int local15 = arg1.anIntArray525[arg1.anInt5778 * 1896589581] - 1;
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class420.method29006(arg0, local15, arg1, 667549095);
	}

	@OriginalMember(owner = "client!anr", name = "a", descriptor = "(I)Lclient!zm;")
	public static Class711 method16786(@OriginalArg(0) int arg0) {
		return Class323.aClass711_1 == null ? Class711.aClass711_6 : Class323.aClass711_1;
	}

	@OriginalMember(owner = "client!anr", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anr", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub40(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anr", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anr", name = "a", descriptor = "(I)V")
	public void method16780(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) 6) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anr", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "w", descriptor = "()I")
	public int method16781() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anr", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "s", descriptor = "(I)I")
	public int method16782(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anr", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anr", name = "k", descriptor = "()V")
	public void method16783() {
		if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) 93) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anr", name = "x", descriptor = "()V")
	public void method16784() {
		if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) 111) * 251097721;
		}
	}
}

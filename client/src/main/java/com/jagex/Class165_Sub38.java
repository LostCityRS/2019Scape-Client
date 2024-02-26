package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anp")
public final class Class165_Sub38 extends Class165 {

	@OriginalMember(owner = "client!anp", name = "i", descriptor = "I")
	public static final int anInt2338 = 3;

	@OriginalMember(owner = "client!anp", name = "m", descriptor = "I")
	public static final int anInt2339 = 2;

	@OriginalMember(owner = "client!anp", name = "g", descriptor = "I")
	public static final int anInt2340 = 4;

	@OriginalMember(owner = "client!anp", name = "o", descriptor = "I")
	public static final int anInt2341 = 1;

	@OriginalMember(owner = "client!anp", name = "j", descriptor = "I")
	public static final int anInt2342 = 0;

	@OriginalMember(owner = "client!anp", name = "cp", descriptor = "Lclient!ed;")
	static Class104 aClass104_12;

	@OriginalMember(owner = "client!anp", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anp", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub38(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anp", name = "a", descriptor = "(S)V")
	public void method16741(@OriginalArg(0) short arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 121) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anp", name = "x", descriptor = "()V")
	public void method16742() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 79) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anp", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "w", descriptor = "()V")
	public void method16743() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 56) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anp", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anp", name = "s", descriptor = "(I)I")
	public int method16744(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anp", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anp", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anp", name = "r", descriptor = "()I")
	public int method16745() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anp", name = "k", descriptor = "()V")
	public void method16746() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 108) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anp", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anp", name = "q", descriptor = "()I")
	public int method16747() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anp", name = "h", descriptor = "()I")
	public int method16748() {
		return this.anInt2398 * -229615671;
	}
}

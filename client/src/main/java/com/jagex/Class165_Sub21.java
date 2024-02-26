package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amu")
public final class Class165_Sub21 extends Class165 {

	@OriginalMember(owner = "client!amu", name = "m", descriptor = "I")
	static final int anInt2224 = 3;

	@OriginalMember(owner = "client!amu", name = "g", descriptor = "I")
	static final int anInt2225 = 0;

	@OriginalMember(owner = "client!amu", name = "i", descriptor = "I")
	static final int anInt2226 = 2;

	@OriginalMember(owner = "client!amu", name = "t", descriptor = "(Lclient!pf;Lclient!pf;Lclient!pf;Lclient!pf;I)V")
	public static void method16249(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) Class480 arg3, @OriginalArg(4) int arg4) {
		Class642.aClass480_131 = arg0;
		Class624.aClass480_128 = arg1;
		Class289.aClass480_90 = arg2;
		Class709.aClass310Array1 = new Class310[Class642.aClass480_131.method29930(-577988558)];
		Class285.aBooleanArray23 = new boolean[Class642.aClass480_131.method29930(1011641370)];
	}

	@OriginalMember(owner = "client!amu", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amu", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub21(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amu", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 2;
	}

	@OriginalMember(owner = "client!amu", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 2;
	}

	@OriginalMember(owner = "client!amu", name = "s", descriptor = "(I)I")
	public int method16243(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amu", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amu", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amu", name = "k", descriptor = "()V")
	public void method16244() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 != 3) {
			this.anInt2398 = this.method16949((byte) -78) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amu", name = "a", descriptor = "(B)V")
	public void method16245(@OriginalArg(0) byte arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 != 3) {
			this.anInt2398 = this.method16949((byte) 118) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amu", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 2;
	}

	@OriginalMember(owner = "client!amu", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amu", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amu", name = "w", descriptor = "()I")
	public int method16246() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amu", name = "x", descriptor = "()V")
	public void method16247() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 != 3) {
			this.anInt2398 = this.method16949((byte) 111) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amu", name = "r", descriptor = "()I")
	public int method16248() {
		return this.anInt2398 * -229615671;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anb")
public final class Class165_Sub27 extends Class165 {

	@OriginalMember(owner = "client!anb", name = "i", descriptor = "I")
	static final int anInt2263 = 255;

	@OriginalMember(owner = "client!anb", name = "g", descriptor = "I")
	static final int anInt2264 = 0;

	@OriginalMember(owner = "client!anb", name = "p", descriptor = "(I)V")
	public static void method16405(@OriginalArg(0) int arg0) {
		Class327.aClass243_75.method26259((byte) 3);
		Class327.aClass243_78.method26259((byte) 3);
		Class327.aClass243_76.method26259((byte) 3);
		Class327.aClass243_77.method26259((byte) 3);
	}

	@OriginalMember(owner = "client!anb", name = "bdz", descriptor = "(Lclient!yp;I)V")
	static void method16406(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class531.aString220.startsWith("win") ? 1 : 0;
	}

	@OriginalMember(owner = "client!anb", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anb", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub27(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anb", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anb", name = "a", descriptor = "(B)V")
	public void method16401(@OriginalArg(0) byte arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 255) {
			this.anInt2398 = this.method16949((byte) -34) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anb", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 127;
	}

	@OriginalMember(owner = "client!anb", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anb", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 127;
	}

	@OriginalMember(owner = "client!anb", name = "s", descriptor = "(B)I")
	public int method16402(@OriginalArg(0) byte arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anb", name = "k", descriptor = "()V")
	public void method16403() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 255) {
			this.anInt2398 = this.method16949((byte) 20) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anb", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 127;
	}

	@OriginalMember(owner = "client!anb", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anb", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anb", name = "x", descriptor = "()I")
	public int method16404() {
		return this.anInt2398 * -229615671;
	}
}

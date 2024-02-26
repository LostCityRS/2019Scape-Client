package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amv")
public final class Class165_Sub22 extends Class165 {

	@OriginalMember(owner = "client!amv", name = "m", descriptor = "I")
	public static final int anInt2231 = 2;

	@OriginalMember(owner = "client!amv", name = "g", descriptor = "I")
	public static final int anInt2232 = 0;

	@OriginalMember(owner = "client!amv", name = "i", descriptor = "I")
	public static final int anInt2233 = 1;

	@OriginalMember(owner = "client!amv", name = "t", descriptor = "(I)[Lclient!va;")
	public static Class607[] method16274(@OriginalArg(0) int arg0) {
		return new Class607[] { Class607.aClass607_5, Class607.aClass607_20, Class607.aClass607_21, Class607.aClass607_22, Class607.aClass607_3, Class607.aClass607_13, Class607.aClass607_17, Class607.aClass607_19, Class607.aClass607_14, Class607.aClass607_2, Class607.aClass607_9, Class607.aClass607_6, Class607.aClass607_11, Class607.aClass607_23, Class607.aClass607_7, Class607.aClass607_24, Class607.aClass607_16, Class607.aClass607_18, Class607.aClass607_4, Class607.aClass607_8, Class607.aClass607_12, Class607.aClass607_10, Class607.aClass607_15 };
	}

	@OriginalMember(owner = "client!amv", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amv", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub22(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amv", name = "h", descriptor = "()I")
	public int method16263() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amv", name = "q", descriptor = "()Z")
	public boolean method16264() {
		return this.aClass80_Sub37_48.aClass165_Sub2_1.method15861(1423795933) != 0;
	}

	@OriginalMember(owner = "client!amv", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amv", name = "s", descriptor = "(B)Z")
	public boolean method16265(@OriginalArg(0) byte arg0) {
		return this.aClass80_Sub37_48.aClass165_Sub2_1.method15861(1423795933) != 0;
	}

	@OriginalMember(owner = "client!amv", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass80_Sub37_48.aClass165_Sub2_1.method15861(1423795933) == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amv", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amv", name = "k", descriptor = "(I)I")
	public int method16266(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amv", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return this.aClass80_Sub37_48.aClass165_Sub2_1.method15861(1423795933) == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amv", name = "a", descriptor = "(I)V")
	public void method16267(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub37_48.aClass165_Sub2_1.method15861(1423795933) == 0) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) -48) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amv", name = "x", descriptor = "()V")
	public void method16268() {
		if (this.aClass80_Sub37_48.aClass165_Sub2_1.method15861(1423795933) == 0) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) -43) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amv", name = "w", descriptor = "()V")
	public void method16269() {
		if (this.aClass80_Sub37_48.aClass165_Sub2_1.method15861(1423795933) == 0) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) 9) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amv", name = "d", descriptor = "()I")
	public int method16270() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amv", name = "z", descriptor = "()I")
	public int method16271() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amv", name = "r", descriptor = "()Z")
	public boolean method16272() {
		return this.aClass80_Sub37_48.aClass165_Sub2_1.method15861(1423795933) != 0;
	}

	@OriginalMember(owner = "client!amv", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "p", descriptor = "()I")
	public int method16273() {
		return this.anInt2398 * -229615671;
	}
}

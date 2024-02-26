package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amm")
public final class Class165_Sub13 extends Class165 {

	@OriginalMember(owner = "client!amm", name = "i", descriptor = "I")
	static final int anInt2171 = 1;

	@OriginalMember(owner = "client!amm", name = "uf", descriptor = "I")
	static int anInt2172;

	@OriginalMember(owner = "client!amm", name = "m", descriptor = "I")
	public static final int anInt2173 = 0;

	@OriginalMember(owner = "client!amm", name = "g", descriptor = "I")
	public static final int anInt2174 = 2;

	@OriginalMember(owner = "client!amm", name = "by", descriptor = "Lclient!cm;")
	public static Class99 aClass99_17;

	@OriginalMember(owner = "client!amm", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amm", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub13(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amm", name = "h", descriptor = "()I")
	public int method16079() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amm", name = "k", descriptor = "(I)I")
	public int method16080(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amm", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!amm", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amm", name = "s", descriptor = "(I)Z")
	public boolean method16081(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amm", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 0 || this.aClass80_Sub37_48.aClass165_Sub41_1.method16802((byte) -85) == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!amm", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amm", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!amm", name = "x", descriptor = "()V")
	public void method16082() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) 76) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amm", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amm", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass80_Sub37_48.aClass165_Sub41_1.method16802((byte) -9) == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!amm", name = "w", descriptor = "()Z")
	public boolean method16083() {
		return true;
	}

	@OriginalMember(owner = "client!amm", name = "r", descriptor = "()Z")
	public boolean method16084() {
		return true;
	}

	@OriginalMember(owner = "client!amm", name = "a", descriptor = "(B)V")
	public void method16085(@OriginalArg(0) byte arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) -36) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amm", name = "q", descriptor = "()I")
	public int method16086() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amm", name = "d", descriptor = "()I")
	public int method16087() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amm", name = "z", descriptor = "()I")
	public int method16088() {
		return this.anInt2398 * -229615671;
	}
}

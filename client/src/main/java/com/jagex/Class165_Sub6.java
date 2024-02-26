package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amf")
public final class Class165_Sub6 extends Class165 {

	@OriginalMember(owner = "client!amf", name = "g", descriptor = "I")
	public static final int anInt2126 = 2;

	@OriginalMember(owner = "client!amf", name = "i", descriptor = "I")
	public static final int anInt2127 = 1;

	@OriginalMember(owner = "client!amf", name = "m", descriptor = "I")
	public static final int anInt2128 = 0;

	@OriginalMember(owner = "client!amf", name = "y", descriptor = "(IB)V")
	public static void method15936(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(13, (long) arg0);
		local4.method22078(1864637236);
	}

	@OriginalMember(owner = "client!amf", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
		Class624.method32448(this.anInt2398 * -229615671, (byte) 57);
	}

	@OriginalMember(owner = "client!amf", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub6(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
		Class624.method32448(this.anInt2398 * -229615671, (byte) 86);
	}

	@OriginalMember(owner = "client!amf", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return this.aClass80_Sub37_48.method14947(1011799615).method441(1905311647) < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!amf", name = "a", descriptor = "(B)V")
	public void method15930(@OriginalArg(0) byte arg0) {
		if (this.aClass80_Sub37_48.method14947(-1374215939).method441(234978256) < 245) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) 81) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amf", name = "r", descriptor = "()I")
	public int method15931() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amf", name = "s", descriptor = "(I)Z")
	public boolean method15932(@OriginalArg(0) int arg0) {
		return this.aClass80_Sub37_48.method14947(-655892118).method441(-396342899) >= 245;
	}

	@OriginalMember(owner = "client!amf", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass80_Sub37_48.method14947(1572757397).method441(-1053196232) < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amf", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
		Class624.method32448(this.anInt2398 * -229615671, (byte) 48);
	}

	@OriginalMember(owner = "client!amf", name = "k", descriptor = "(I)I")
	public int method15933(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amf", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
		Class624.method32448(this.anInt2398 * -229615671, (byte) 43);
	}

	@OriginalMember(owner = "client!amf", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return this.aClass80_Sub37_48.method14947(320819314).method441(2018429961) < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!amf", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return this.aClass80_Sub37_48.method14947(-1070437037).method441(-1557750766) < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amf", name = "x", descriptor = "()V")
	public void method15934() {
		if (this.aClass80_Sub37_48.method14947(-1453151905).method441(244789931) < 245) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) -53) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amf", name = "w", descriptor = "()Z")
	public boolean method15935() {
		return this.aClass80_Sub37_48.method14947(-1835028376).method441(-358483586) >= 245;
	}

	@OriginalMember(owner = "client!amf", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return this.aClass80_Sub37_48.method14947(-1453564483).method441(1867249782) < 245 ? 0 : 2;
	}
}

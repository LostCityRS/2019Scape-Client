package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anh")
public final class Class165_Sub32 extends Class165 {

	@OriginalMember(owner = "client!anh", name = "g", descriptor = "I")
	public static final int anInt2295 = 1;

	@OriginalMember(owner = "client!anh", name = "i", descriptor = "I")
	public static final int anInt2296 = 0;

	@OriginalMember(owner = "client!anh", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub32(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anh", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anh", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!anh", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anh", name = "a", descriptor = "(I)V")
	public void method16520(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 1) {
			this.anInt2398 = this.method16949((byte) -62) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anh", name = "x", descriptor = "()V")
	public void method16521() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 1) {
			this.anInt2398 = this.method16949((byte) 13) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anh", name = "s", descriptor = "(B)Z")
	public boolean method16522(@OriginalArg(0) byte arg0) {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(-368113679), 913643797);
	}

	@OriginalMember(owner = "client!anh", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(-655228889), 913643797) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anh", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!anh", name = "k", descriptor = "(I)I")
	public int method16523(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anh", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anh", name = "h", descriptor = "()I")
	public int method16524() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anh", name = "r", descriptor = "()Z")
	public boolean method16525() {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(1776494197), 913643797);
	}

	@OriginalMember(owner = "client!anh", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anh", name = "w", descriptor = "()V")
	public void method16526() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 1) {
			this.anInt2398 = this.method16949((byte) 43) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anh", name = "q", descriptor = "()Z")
	public boolean method16527() {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(945375021), 913643797);
	}

	@OriginalMember(owner = "client!anh", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(-361260666), 913643797) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anh", name = "d", descriptor = "()I")
	public int method16528() {
		return this.anInt2398 * -229615671;
	}
}

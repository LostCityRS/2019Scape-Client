package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amd")
public final class Class165_Sub4 extends Class165 {

	@OriginalMember(owner = "client!amd", name = "i", descriptor = "I")
	public static final int anInt2116 = 0;

	@OriginalMember(owner = "client!amd", name = "g", descriptor = "I")
	public static final int anInt2117 = 1;

	@OriginalMember(owner = "client!amd", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub4(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amd", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amd", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!amd", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amd", name = "a", descriptor = "(I)V")
	public void method15895(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) 43) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amd", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amd", name = "s", descriptor = "(I)I")
	public int method15896(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amd", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amd", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!amd", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amd", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amd", name = "k", descriptor = "()I")
	public int method15897() {
		return this.anInt2398 * -229615671;
	}
}

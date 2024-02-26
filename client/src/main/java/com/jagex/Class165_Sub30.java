package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ane")
public final class Class165_Sub30 extends Class165 {

	@OriginalMember(owner = "client!ane", name = "g", descriptor = "I")
	public static final int anInt2279 = 0;

	@OriginalMember(owner = "client!ane", name = "o", descriptor = "I")
	public static final int anInt2280 = 3;

	@OriginalMember(owner = "client!ane", name = "m", descriptor = "I")
	public static final int anInt2281 = 2;

	@OriginalMember(owner = "client!ane", name = "i", descriptor = "I")
	public static final int anInt2282 = 1;

	@OriginalMember(owner = "client!ane", name = "j", descriptor = "I")
	public static final int anInt2283 = 4;

	@OriginalMember(owner = "client!ane", name = "g", descriptor = "(Lclient!pf;II)Lclient!asb;")
	static Class80_Sub1_Sub12 method16462(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Packet local8 = new Packet(arg0.method29918(0, arg1, 1896589581));
		return Class165_Sub11.method16048(local8, arg1, -1116075224);
	}

	@OriginalMember(owner = "client!ane", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ane", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub30(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ane", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return this.aClass80_Sub37_48.method14947(-845638318).method442(1256569244) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ane", name = "k", descriptor = "()V")
	public void method16457() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) -34) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ane", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return this.aClass80_Sub37_48.method14947(-1569983799).method442(1256569244) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ane", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ane", name = "s", descriptor = "(I)I")
	public int method16458(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ane", name = "a", descriptor = "(I)V")
	public void method16459(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 9) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ane", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return this.aClass80_Sub37_48.method14947(-1326463349).method442(1256569244) > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ane", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ane", name = "w", descriptor = "()I")
	public int method16460() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ane", name = "x", descriptor = "()I")
	public int method16461() {
		return this.anInt2398 * -229615671;
	}
}

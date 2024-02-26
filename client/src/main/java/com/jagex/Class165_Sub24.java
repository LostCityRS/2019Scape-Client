package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amx")
public final class Class165_Sub24 extends Class165 {

	@OriginalMember(owner = "client!amx", name = "i", descriptor = "I")
	static final int anInt2245 = 0;

	@OriginalMember(owner = "client!amx", name = "g", descriptor = "I")
	static final int anInt2246 = 4;

	@OriginalMember(owner = "client!amx", name = "bj", descriptor = "(II)Z")
	static boolean method16315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 18 || arg0 == 19 || arg0 == 20 || arg0 == 21 || arg0 == 22 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 17;
		}
	}

	@OriginalMember(owner = "client!amx", name = "asd", descriptor = "(Lclient!yp;I)V")
	static void method16316(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 69);
		Class528.method30719(Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-1371500679), false, -1199555487);
		Class719.method37291(-507105596);
	}

	@OriginalMember(owner = "client!amx", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amx", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub24(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amx", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 0;
	}

	@OriginalMember(owner = "client!amx", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amx", name = "h", descriptor = "()I")
	public int method16307() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amx", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amx", name = "a", descriptor = "(I)V")
	public void method16308(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 35) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amx", name = "r", descriptor = "()I")
	public int method16309() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amx", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 0;
	}

	@OriginalMember(owner = "client!amx", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amx", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!amx", name = "k", descriptor = "()V")
	public void method16310() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 5) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amx", name = "x", descriptor = "()V")
	public void method16311() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) -19) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amx", name = "w", descriptor = "()I")
	public int method16312() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amx", name = "s", descriptor = "(I)I")
	public int method16313(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amx", name = "q", descriptor = "()I")
	public int method16314() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amx", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}
}

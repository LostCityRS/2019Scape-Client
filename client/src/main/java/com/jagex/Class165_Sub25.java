package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amy")
public final class Class165_Sub25 extends Class165 {

	@OriginalMember(owner = "client!amy", name = "g", descriptor = "I")
	static final int anInt2251 = 0;

	@OriginalMember(owner = "client!amy", name = "i", descriptor = "I")
	static final int anInt2252 = 2;

	@OriginalMember(owner = "client!amy", name = "g", descriptor = "(IIIIIIFZI)[[I")
	public static int[][] method16336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class80_Sub38_Sub1 local7 = new Class80_Sub38_Sub1();
		local7.aBoolean610 = arg7;
		local7.anInt3132 = arg3 * -1583177347;
		local7.anInt3135 = arg4 * 1696205755;
		local7.anInt3133 = arg5 * -500148975;
		local7.anInt3134 = (int) (arg6 * 4096.0F) * 1727490573;
		local7.method22953(1682321723);
		Class53.method1081(arg0, arg1, 545997838);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method22948(local42, local3[local42], (byte) -4);
		}
		return local3;
	}

	@OriginalMember(owner = "client!amy", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub25(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amy", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amy", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 0;
	}

	@OriginalMember(owner = "client!amy", name = "s", descriptor = "(B)Z")
	public boolean method16330(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amy", name = "a", descriptor = "(I)V")
	public void method16331(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) -16) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amy", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!amy", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amy", name = "k", descriptor = "(I)I")
	public int method16332(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amy", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!amy", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 0;
	}

	@OriginalMember(owner = "client!amy", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amy", name = "r", descriptor = "()I")
	public int method16333() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amy", name = "x", descriptor = "()Z")
	public boolean method16334() {
		return true;
	}

	@OriginalMember(owner = "client!amy", name = "w", descriptor = "()Z")
	public boolean method16335() {
		return true;
	}

	@OriginalMember(owner = "client!amy", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 0;
	}
}

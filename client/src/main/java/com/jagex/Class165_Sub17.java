package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amq")
public final class Class165_Sub17 extends Class165 {

	@OriginalMember(owner = "client!amq", name = "i", descriptor = "I")
	public static final int anInt2201 = 0;

	@OriginalMember(owner = "client!amq", name = "g", descriptor = "I")
	public static final int anInt2202 = 1;

	@OriginalMember(owner = "client!amq", name = "aaj", descriptor = "(Lclient!yp;I)V")
	static void method16168(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class352.method28064(local13, (byte) -126);
	}

	@OriginalMember(owner = "client!amq", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amq", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub17(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amq", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "a", descriptor = "(I)V")
	public void method16162(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 != 1 && this.anInt2398 * -229615671 != 0) {
			this.anInt2398 = this.method16949((byte) -60) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amq", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "s", descriptor = "(I)Z")
	public boolean method16163(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amq", name = "x", descriptor = "()Z")
	public boolean method16164() {
		return true;
	}

	@OriginalMember(owner = "client!amq", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "k", descriptor = "(B)I")
	public int method16165(@OriginalArg(0) byte arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amq", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amq", name = "w", descriptor = "()Z")
	public boolean method16166() {
		return true;
	}

	@OriginalMember(owner = "client!amq", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amq", name = "r", descriptor = "()I")
	public int method16167() {
		return this.anInt2398 * -229615671;
	}
}

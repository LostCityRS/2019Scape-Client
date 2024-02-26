package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class211 {

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	public int anInt3602;

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
	public int anInt3605;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	public int anInt3606;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Lclient!cp;")
	public Class211 aClass211_2;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "Lclient!pm;")
	public Class487 aClass487_96;

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
	public final int anInt3603;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
	public final int anInt3604;

	@OriginalMember(owner = "client!cp", name = "anz", descriptor = "(Lclient!yp;B)V")
	static void method25816(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3486 * 67931827 - client.anInt3499 * 1390966129;
	}

	@OriginalMember(owner = "client!cp", name = "avx", descriptor = "(Lclient!yp;B)V")
	static void method25817(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!cp", name = "axq", descriptor = "(Lclient!yp;B)V")
	static void method25818(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class681.anInt5748 * 1400729963;
	}

	@OriginalMember(owner = "client!cp", name = "bfw", descriptor = "(Lclient!yp;I)V")
	static void method25819(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -825189621;
	}

	@OriginalMember(owner = "client!cp", name = "aiw", descriptor = "(Lclient!yp;I)V")
	static void method25820(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class610.aClass52_2.method1073(local13, 1917788678).anIntArray281[local23];
	}

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "(Lclient!if;I)V")
	public static void method25821(@OriginalArg(0) Class336 arg0, @OriginalArg(1) int arg1) {
		Class338.aClass336_1 = arg0;
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(II)V")
	Class211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3603 = arg0 * -413991383;
		this.anInt3604 = arg1 * 380860191;
	}

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "(I)Lclient!cp;")
	Class211 method25809(@OriginalArg(0) int arg0) {
		return new Class211(this.anInt3603 * -251298279, arg0);
	}

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "(Lclient!nt;I)Lclient!nc;")
	public Class433 method25810(@OriginalArg(0) Interface48 arg0, @OriginalArg(1) int arg1) {
		return arg0.method29225(this.anInt3603 * -251298279, (byte) 57);
	}

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "(IB)Lclient!cp;")
	Class211 method25811(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return new Class211(this.anInt3603 * -251298279, arg0);
	}

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "(Lclient!nt;)Lclient!nc;")
	public Class433 method25812(@OriginalArg(0) Interface48 arg0) {
		return arg0.method29225(this.anInt3603 * -251298279, (byte) -4);
	}

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "(Lclient!nt;)Lclient!nc;")
	public Class433 method25813(@OriginalArg(0) Interface48 arg0) {
		return arg0.method29225(this.anInt3603 * -251298279, (byte) 103);
	}

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "(I)Lclient!cp;")
	Class211 method25814(@OriginalArg(0) int arg0) {
		return new Class211(this.anInt3603 * -251298279, arg0);
	}

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "(Lclient!nt;)Lclient!nc;")
	public Class433 method25815(@OriginalArg(0) Interface48 arg0) {
		return arg0.method29225(this.anInt3603 * -251298279, (byte) 89);
	}
}

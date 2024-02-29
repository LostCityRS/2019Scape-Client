package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public class Class223 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public static final int anInt3632 = 2;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	public static final int anInt3633 = 16;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public static final int anInt3634 = 1;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	public static final int anInt3635 = 8191;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public static final int anInt3636 = 64;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
	public static final int anInt3637 = 2;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	public static final int anInt3638 = 0;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
	public static final int anInt3639 = 16;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public static final int anInt3640 = 0;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public static final int anInt3641 = 32;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
	public static final int anInt3642 = 8;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public static final int anInt3643 = 1023;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "[I")
	public static final int[] anIntArray336 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "[I")
	public static final int[] anIntArray337 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 19)
	Class223() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!dc", name = "do", descriptor = "(Lclient!yf;B)V", line = 5507)
	static final void method25587(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 407948161);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class224.method25593(local16, local22, arg0, -336743888);
	}

	@OriginalMember(owner = "client!dc", name = "sr", descriptor = "(Lclient!yf;I)V", line = 8224)
	static final void method25588(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt3995 * -1566573331;
	}

	@OriginalMember(owner = "client!dc", name = "awz", descriptor = "(Lclient!yf;B)V", line = 13732)
	static final void method25589(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class154_Sub1 local2 = Class454.method28970(1250465674);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local2 == null ? 0 : local2.anInt1650 * 803722663;
	}
}

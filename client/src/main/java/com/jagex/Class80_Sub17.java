package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akg")
public abstract class Class80_Sub17 extends Class80 {

	@OriginalMember(owner = "client!akg", name = "a", descriptor = "I")
	public static final int anInt3157 = 6;

	@OriginalMember(owner = "client!akg", name = "l", descriptor = "I")
	public static final int anInt3158 = 0;

	@OriginalMember(owner = "client!akg", name = "g", descriptor = "I")
	static final int anInt3159 = 1;

	@OriginalMember(owner = "client!akg", name = "i", descriptor = "I")
	public static final int anInt3160 = 2;

	@OriginalMember(owner = "client!akg", name = "u", descriptor = "I")
	public static final int anInt3161 = -1;

	@OriginalMember(owner = "client!akg", name = "o", descriptor = "I")
	static final int anInt3162 = 4;

	@OriginalMember(owner = "client!akg", name = "m", descriptor = "I")
	static final int anInt3163 = 3;

	@OriginalMember(owner = "client!akg", name = "j", descriptor = "I")
	static final int anInt3164 = 5;

	@OriginalMember(owner = "client!akg", name = "n", descriptor = "(I)Z")
	public static boolean method23467(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!akg", name = "c", descriptor = "(I)Z")
	public static boolean method23468(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!akg", name = "b", descriptor = "(I)Z")
	public static boolean method23469(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!akg", name = "di", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method23470(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -442943724;
		arg0.anInt4086 = arg2.anIntArray525[arg2.anInt5778 * 1896589581] * 1818415189;
		arg0.anInt4137 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1] * 1245621571;
		arg0.anInt4138 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 2] * 70623907;
		arg0.anInt4139 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 3] * 1548180053;
		Class296.method26998(arg0, -892943835);
	}

	@OriginalMember(owner = "client!akg", name = "<init>", descriptor = "()V")
	Class80_Sub17() {
	}

	@OriginalMember(owner = "client!akg", name = "f", descriptor = "(I)I")
	public abstract int method23451(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!akg", name = "t", descriptor = "(B)I")
	public abstract int method23452(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!akg", name = "i", descriptor = "(I)V")
	public abstract void method23453(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!akg", name = "e", descriptor = "(I)I")
	public abstract int method23454(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!akg", name = "u", descriptor = "(B)I")
	public abstract int method23455(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!akg", name = "l", descriptor = "(I)J")
	public abstract long method23456(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!akg", name = "j", descriptor = "()I")
	public abstract int method23457();

	@OriginalMember(owner = "client!akg", name = "m", descriptor = "()I")
	public abstract int method23458();

	@OriginalMember(owner = "client!akg", name = "s", descriptor = "()J")
	public abstract long method23459();

	@OriginalMember(owner = "client!akg", name = "a", descriptor = "()I")
	public abstract int method23460();

	@OriginalMember(owner = "client!akg", name = "o", descriptor = "()I")
	public abstract int method23461();

	@OriginalMember(owner = "client!akg", name = "x", descriptor = "()J")
	public abstract long method23462();

	@OriginalMember(owner = "client!akg", name = "z", descriptor = "()J")
	public abstract long method23463();

	@OriginalMember(owner = "client!akg", name = "p", descriptor = "()J")
	public abstract long method23464();

	@OriginalMember(owner = "client!akg", name = "v", descriptor = "()V")
	public abstract void method23465();

	@OriginalMember(owner = "client!akg", name = "y", descriptor = "()I")
	public abstract int method23466();
}

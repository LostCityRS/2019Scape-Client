package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fz")
public final class Class280 {

	@OriginalMember(owner = "client!fz", name = "t", descriptor = "Lclient!fz;")
	static final Class280 aClass280_4 = new Class280();

	@OriginalMember(owner = "client!fz", name = "f", descriptor = "Lclient!fz;")
	static final Class280 aClass280_3 = new Class280();

	@OriginalMember(owner = "client!fz", name = "e", descriptor = "Lclient!fz;")
	static final Class280 aClass280_2 = new Class280();

	@OriginalMember(owner = "client!fz", name = "u", descriptor = "Lclient!fz;")
	static final Class280 aClass280_5 = new Class280();

	@OriginalMember(owner = "client!fz", name = "l", descriptor = "Lclient!fz;")
	static final Class280 aClass280_12 = new Class280();

	@OriginalMember(owner = "client!fz", name = "g", descriptor = "Lclient!fz;")
	static final Class280 aClass280_6 = new Class280();

	@OriginalMember(owner = "client!fz", name = "i", descriptor = "Lclient!fz;")
	static final Class280 aClass280_7 = new Class280();

	@OriginalMember(owner = "client!fz", name = "m", descriptor = "Lclient!fz;")
	static final Class280 aClass280_8 = new Class280();

	@OriginalMember(owner = "client!fz", name = "o", descriptor = "Lclient!fz;")
	public static final Class280 aClass280_9 = new Class280();

	@OriginalMember(owner = "client!fz", name = "j", descriptor = "Lclient!fz;")
	public static final Class280 aClass280_1 = new Class280();

	@OriginalMember(owner = "client!fz", name = "a", descriptor = "Lclient!fz;")
	static final Class280 aClass280_11 = new Class280();

	@OriginalMember(owner = "client!fz", name = "s", descriptor = "Lclient!fz;")
	static final Class280 aClass280_10 = new Class280();

	@OriginalMember(owner = "client!fz", name = "k", descriptor = "Lclient!fz;")
	static final Class280 aClass280_13 = new Class280();

	@OriginalMember(owner = "client!fz", name = "is", descriptor = "([[I[[IIIIIII)Z")
	static boolean method26852(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = arg3; local1 <= arg5; local1++) {
			for (@Pc(6) int local6 = arg4; local6 <= arg6; local6++) {
				if (arg0[local1][local6] == arg2 && arg1[local1][local6] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fz", name = "ez", descriptor = "(I)V")
	public static void method26853(@OriginalArg(0) int arg0) {
		Class159_Sub1.aHashMap4.clear();
		Class159_Sub1.aHashMap5.clear();
	}

	@OriginalMember(owner = "client!fz", name = "<init>", descriptor = "()V")
	Class280() {
	}
}

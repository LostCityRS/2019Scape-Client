package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!acr")
public final class Class67 {

	@OriginalMember(owner = "client!acr", name = "t", descriptor = "Lclient!acr;")
	public static final Class67 aClass67_3 = new Class67();

	@OriginalMember(owner = "client!acr", name = "f", descriptor = "Lclient!acr;")
	public static final Class67 aClass67_2 = new Class67();

	@OriginalMember(owner = "client!acr", name = "e", descriptor = "Lclient!acr;")
	public static final Class67 aClass67_1 = new Class67();

	@OriginalMember(owner = "client!acr", name = "u", descriptor = "Lclient!acr;")
	public static final Class67 aClass67_4 = new Class67();

	@OriginalMember(owner = "client!acr", name = "amo", descriptor = "(Lclient!yp;I)V")
	static void method1241(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class630.anInt5563 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] * 1308040071;
	}

	@OriginalMember(owner = "client!acr", name = "m", descriptor = "(II)Lclient!asf;")
	public static Class80_Sub1_Sub14 method1242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class80_Sub1_Sub14) Class329.aClass24_29.method560((long) arg0);
	}

	@OriginalMember(owner = "client!acr", name = "gv", descriptor = "(IIILclient!dn;B)Lclient!uc;")
	static Class589 method1243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class105 arg3, @OriginalArg(4) byte arg4) {
		return arg3 == null ? null : new Class589(arg0, arg1, arg2, arg3.method7362(), arg3.method7533(), arg3.method7485(), arg3.method7366(), arg3.method7367(), arg3.method7368(), arg3.method7342());
	}

	@OriginalMember(owner = "client!acr", name = "<init>", descriptor = "()V")
	Class67() {
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public abstract class Class106 {

	@OriginalMember(owner = "client!df", name = "ai", descriptor = "I")
	static int anInt2551;

	@OriginalMember(owner = "client!df", name = "hj", descriptor = "Lclient!apc;")
	public static Class73_Sub1 aClass73_Sub1_6;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method18203(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2) {
		Class607.method32176(arg0, arg1, 0, arg0.length - 1, 1753743491);
	}

	@OriginalMember(owner = "client!df", name = "q", descriptor = "(Lclient!yp;S)V")
	static void method18204(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class352) aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2], -102958094)).aStringArray26[arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1]];
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!df", name = "aar", descriptor = "(Lclient!yp;B)V")
	static void method18205(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class111_Sub1.method7796(local13, 531681);
	}

	@OriginalMember(owner = "client!df", name = "ow", descriptor = "(Lclient!yp;B)V")
	static void method18206(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2050378989);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class11.method335(local16, local22, arg0, 718549374);
	}

	@OriginalMember(owner = "client!df", name = "hx", descriptor = "(IIIIIZB)V")
	public static void method18207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		Class28.anInt92 = arg0 * 590007769;
		Class244.anInt3863 = arg1 * -1410331595;
		Class617.anInt5429 = arg2 * -998268115;
		Class166.anInt2402 = arg3 * 343897143;
		Class699.anInt5813 = arg4 * -579288121;
		if (Class368.anInt4502 * -1583611537 == 3) {
			Class373.method28414(1557294448);
		}
		if (arg5 && Class699.anInt5813 * -383382025 >= 100) {
			Class89.anInt319 = Class28.anInt92 * -209063424 + 1297879296;
			Class102_Sub2.anInt653 = Class244.anInt3863 * -1980553728 + -896569600;
			Class283.anInt3937 = (Class439.method29150(Class89.anInt319 * 1749751025, Class102_Sub2.anInt653 * 1132703631, Class507.anInt5045 * -1170417853, 1037753497) - Class617.anInt5429 * -706763611) * 364051605;
		}
		Class368.anInt4502 = -423988277;
		Class130_Sub1.anInt1175 = -1464167667;
		Class588.anInt5304 = -503779167;
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	Class106() {
	}
}

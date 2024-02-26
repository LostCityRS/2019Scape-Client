package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class233 {

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	public static final int anInt3784 = 8191;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	public static final int anInt3785 = 1023;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "I")
	public static final int anInt3786 = 16;

	@OriginalMember(owner = "client!du", name = "x", descriptor = "I")
	public static final int anInt3787 = 2;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "I")
	public static final int anInt3788 = 64;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "I")
	public static final int anInt3789 = 16;

	@OriginalMember(owner = "client!du", name = "u", descriptor = "I")
	public static final int anInt3790 = 32;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "I")
	public static final int anInt3791 = 1;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "I")
	public static final int anInt3792 = 0;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	public static final int anInt3793 = 2;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "I")
	public static final int anInt3794 = 8;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "I")
	public static final int anInt3795 = 0;

	@OriginalMember(owner = "client!du", name = "bj", descriptor = "Lclient!cm;")
	public static Class99 aClass99_28;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "[I")
	public static final int[] anIntArray351 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!du", name = "l", descriptor = "[I")
	public static final int[] anIntArray352 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!du", name = "ma", descriptor = "(Lclient!yp;I)V")
	static void method26086(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 1996007241);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class174.method24633(local16, local22, arg0, 1358331462);
	}

	@OriginalMember(owner = "client!du", name = "vq", descriptor = "(Lclient!yp;I)V")
	static void method26087(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(19) Class80_Sub31 local19 = Class623.method32440(Class443.aClass443_72, client.aClass75_1.aClass22_1, -191270971);
		local19.aClass80_Sub36_Sub1_2.method23154(local13.length() + 1, 1275868335);
		local19.aClass80_Sub36_Sub1_2.method23165(local13, 2045947455);
		client.aClass75_1.method1325(local19, (byte) -85);
	}

	@OriginalMember(owner = "client!du", name = "vg", descriptor = "(Lclient!yp;I)V")
	static void method26088(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class490.aClass263_13.method26512(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], -1270606463);
	}

	@OriginalMember(owner = "client!du", name = "as", descriptor = "(Lclient!yp;I)V")
	static void method26089(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.aLongArray28[arg0.anIntArray526[arg0.anInt5780 * -1336568839]] = arg0.aLongArray27[(arg0.anInt5777 -= 1311199625) * -628853575];
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	Class233() throws Throwable {
		throw new Error();
	}
}

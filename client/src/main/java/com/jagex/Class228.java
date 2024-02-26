package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class228 {

	@OriginalMember(owner = "client!dm", name = "gk", descriptor = "Lclient!pf;")
	public static Class480 aClass480_85;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
	public int anInt3670;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Lclient!dm;")
	public Class228 aClass228_1;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
	public int anInt3675;

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
	public int anInt3676;

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
	public int anInt3677;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
	public int anInt3678;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
	public int anInt3679;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
	public int anInt3680;

	@OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
	public int anInt3682;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
	public int anInt3683;

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
	public final int anInt3681;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
	public final int anInt3671;

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
	public final int anInt3672;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
	public final int anInt3673;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
	public final int anInt3674;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "B")
	final byte aByte122;

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "([BI)Lclient!asw;")
	static Class80_Sub1_Sub20 method25994(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return new Class80_Sub1_Sub20(new Class80_Sub36(arg0), Class297.anInterface21_4);
	}

	@OriginalMember(owner = "client!dm", name = "xr", descriptor = "(Lclient!yp;I)V")
	static void method25995(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class80_Sub33 local15 = Class641.method32900((Class80_Sub33) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997], (byte) -20);
		arg0.anInt5778 -= -442943724;
		local15.anInt1652 += arg0.anIntArray525[arg0.anInt5778 * 1896589581] * 2079387309;
		local15.anInt1655 += arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] * -1348954167;
		local15.anInt1654 += arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2] * -489386499;
		local15.anInt1653 += arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3] * -472506637;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local15;
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIIIB)V")
	Class228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		this.anInt3681 = arg0 * 1780138561;
		this.anInt3671 = arg1 * 1051915627;
		this.anInt3672 = arg2 * -44101153;
		this.anInt3673 = arg3 * -237810237;
		this.anInt3674 = arg4 * -1931673655;
		this.aByte122 = arg5;
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(IIIII)Lclient!dm;")
	Class228 method25986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class228(this.anInt3681 * -1343861311, arg0, arg1, arg2, arg3, this.aByte122);
	}

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "(Lclient!np;I)Lclient!nl;")
	public Class441 method25987(@OriginalArg(0) Interface47 arg0, @OriginalArg(1) int arg1) {
		return arg0.method29270(this.anInt3681 * -1343861311, -1681407132);
	}

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "(IIII)Lclient!dm;")
	Class228 method25988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class228(this.anInt3681 * -1343861311, arg0, arg1, arg2, arg3, this.aByte122);
	}

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "(Lclient!np;)Lclient!nl;")
	public Class441 method25989(@OriginalArg(0) Interface47 arg0) {
		return arg0.method29270(this.anInt3681 * -1343861311, -1681407132);
	}

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "(Lclient!np;)Lclient!nl;")
	public Class441 method25990(@OriginalArg(0) Interface47 arg0) {
		return arg0.method29270(this.anInt3681 * -1343861311, -1681407132);
	}

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "(IIII)Lclient!dm;")
	Class228 method25991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class228(this.anInt3681 * -1343861311, arg0, arg1, arg2, arg3, this.aByte122);
	}

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "(IIII)Lclient!dm;")
	Class228 method25992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class228(this.anInt3681 * -1343861311, arg0, arg1, arg2, arg3, this.aByte122);
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(Lclient!np;)Lclient!nl;")
	public Class441 method25993(@OriginalArg(0) Interface47 arg0) {
		return arg0.method29270(this.anInt3681 * -1343861311, -1681407132);
	}
}

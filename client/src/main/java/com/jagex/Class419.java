package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class419 {

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "Lclient!mk;")
	public static final Class419 aClass419_3 = new Class419();

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!mk;")
	public static final Class419 aClass419_7 = new Class419();

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Lclient!mk;")
	public static final Class419 aClass419_4 = new Class419();

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "Lclient!mk;")
	public static final Class419 aClass419_5 = new Class419();

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "Lclient!mk;")
	public static final Class419 aClass419_8 = new Class419();

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!mk;")
	public static final Class419 aClass419_6 = new Class419();

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "Lclient!mk;")
	public static final Class419 aClass419_2 = new Class419();

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "(IIB)I")
	static int method28998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(35) int local35 = Class103_Sub8.method7864(arg0 + 45365, arg1 + 91923, 4, (byte) 0) - 128 + (Class103_Sub8.method7864(arg0 + 10294, arg1 + 37821, 2, (byte) 0) - 128 >> 1) + (Class103_Sub8.method7864(arg0, arg1, 1, (byte) 0) - 128 >> 2);
		local35 = (int) ((double) local35 * 0.3D) + 35;
		if (local35 < 10) {
			local35 = 10;
		} else if (local35 > 60) {
			local35 = 60;
		}
		return local35;
	}

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "(Lclient!yp;B)V")
	static void method28999(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], -519178361)).method28032(Class672.aClass134_1, -1377827487) ? 1 : 0;
	}

	@OriginalMember(owner = "client!mk", name = "jm", descriptor = "(Lclient!yp;I)V")
	static void method29000(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "(I)I")
	static int method29001(@OriginalArg(0) int arg0) {
		return 13;
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	Class419() {
	}
}

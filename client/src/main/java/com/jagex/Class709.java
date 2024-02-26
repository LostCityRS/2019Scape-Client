package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zk")
public final class Class709 {

	@OriginalMember(owner = "client!zk", name = "p", descriptor = "[Lclient!he;")
	public static Class310[] aClass310Array1;

	@OriginalMember(owner = "client!zk", name = "h", descriptor = "Lclient!ed;")
	public static Class104 aClass104_26;

	@OriginalMember(owner = "client!zk", name = "t", descriptor = "Lclient!zk;")
	static final Class709 aClass709_3 = new Class709();

	@OriginalMember(owner = "client!zk", name = "f", descriptor = "Lclient!zk;")
	public static final Class709 aClass709_2 = new Class709();

	@OriginalMember(owner = "client!zk", name = "e", descriptor = "Lclient!zk;")
	static final Class709 aClass709_1 = new Class709();

	@OriginalMember(owner = "client!zk", name = "ll", descriptor = "(Lclient!hx;Lclient!yp;B)V")
	static void method37152(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) byte arg2) {
		arg1.anInt5778 -= 1815275855;
		@Pc(15) int local15 = arg1.anIntArray525[arg1.anInt5778 * 1896589581] - 1;
		@Pc(25) int local25 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 1];
		@Pc(35) int local35 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 2];
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class696.method37036(arg0, local15, local25, local35, arg1, (short) -12888);
	}

	@OriginalMember(owner = "client!zk", name = "ah", descriptor = "(I)Lclient!arz;")
	public static Class80_Sub1_Sub11 method37153(@OriginalArg(0) int arg0) {
		return Class686.aClass80_Sub1_Sub11_5;
	}

	@OriginalMember(owner = "client!zk", name = "<init>", descriptor = "()V")
	Class709() {
	}
}

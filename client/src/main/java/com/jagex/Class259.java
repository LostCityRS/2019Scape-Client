package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
final class Class259 implements Interface43 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fc", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_3;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "(I)[Lclient!hh;")
	static Class313[] method26446(@OriginalArg(0) int arg0) {
		return new Class313[] { Class313.aClass313_2, Class313.aClass313_3, Class313.aClass313_1 };
	}

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "(Lclient!yp;I)V")
	static void method26447(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2], 406571715)).method28044(Class672.aClass134_1, arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], -1894886911) ? 1 : 0;
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!fc", name = "aqo", descriptor = "(Lclient!yp;B)V")
	static void method26448(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5776 -= -825189621;
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "(IIIIIFZI)[I")
	public static int[] method26449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(6) Class80_Sub38_Sub1 local6 = new Class80_Sub38_Sub1();
		local6.anInt3131 = arg1 * -846140413;
		local6.aBoolean610 = arg6;
		local6.anInt3132 = arg2 * -1583177347;
		local6.anInt3135 = arg3 * 1696205755;
		local6.anInt3133 = arg4 * -500148975;
		local6.anInt3134 = (int) (arg5 * 4096.0F) * 1727490573;
		local6.method22953(164101860);
		Class53.method1081(arg0, 1, 383624850);
		local6.method22948(0, local2, (byte) 114);
		return local2;
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class259(@OriginalArg(0) Class263 arg0) {
		this.aClass263_3 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "()F")
	@Override
	public float method26844() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) -94) / 255.0F;
	}

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "(I)F")
	@Override
	public float method26841(@OriginalArg(0) int arg0) {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) -7) / 255.0F;
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "()F")
	@Override
	public float method26840() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) -87) / 255.0F;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "()F")
	@Override
	public float method26842() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) 26) / 255.0F;
	}

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "()F")
	@Override
	public float method26843() {
		return (float) Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) 26) / 255.0F;
	}
}

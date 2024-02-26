package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahl")
public class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!ahl", name = "ts", descriptor = "Lclient!aaj;")
	public static Class11 aClass11_5;

	@OriginalMember(owner = "client!ahl", name = "j", descriptor = "I")
	public final int anInt2907;

	@OriginalMember(owner = "client!ahl", name = "a", descriptor = "I")
	public final int anInt2909;

	@OriginalMember(owner = "client!ahl", name = "s", descriptor = "I")
	public final int anInt2906;

	@OriginalMember(owner = "client!ahl", name = "k", descriptor = "I")
	public final int anInt2908;

	@OriginalMember(owner = "client!ahl", name = "x", descriptor = "I")
	public final int anInt2910;

	@OriginalMember(owner = "client!ahl", name = "w", descriptor = "I")
	public final int anInt2911;

	@OriginalMember(owner = "client!ahl", name = "jw", descriptor = "(Lclient!ahb;Lclient!ahb;IIIIIIII)V")
	static void method20592(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) Class120_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) int local3 = arg1.method18960(-1827949856);
		if (local3 == -1) {
			return;
		}
		@Pc(9) Class99 local9 = null;
		local9 = (Class99) client.aClass243_68.method26282((long) local3);
		if (local9 == null) {
			@Pc(22) Class109[] local22 = Class212.method25824(Class708.aClass480_136, local3, 0);
			if (local22 == null) {
				return;
			}
			local9 = Class279.aClass102_9.method20906(local22[0], true);
			client.aClass243_68.method26253(local9, (long) local3);
		}
		@Pc(42) Class463 local42 = arg0.method24552().aClass463_61;
		Class66.method1240(arg0.aByte99, (int) local42.aFloat297, (int) local42.aFloat296, arg0.method18966((byte) -95) * 256, 0, false, false, -1150615211);
		@Pc(70) int local70 = (int) ((float) arg3 + client.aFloatArray95[0] - 18.0F);
		@Pc(82) int local82 = (int) ((float) arg4 + client.aFloatArray95[1] - 16.0F - 54.0F);
		@Pc(90) int local90 = local70 + arg2 / 4 * 18;
		@Pc(98) int local98 = local82 + arg2 % 4 * 18;
		local9.method18225(local90, local98);
		if (arg0 == arg1) {
			Class279.aClass102_9.method20715(local90 - 1, local98 - 1, 18, 18, -256, -1068342187);
		}
		@Pc(120) Class147_Sub4 local120 = Class69.method1251((byte) -62);
		local120.aClass120_Sub1_Sub1_Sub1_1 = arg1;
		local120.anInt1487 = local90 * 18364547;
		local120.anInt1488 = local98 * -1048901363;
		local120.anInt1489 = (local90 + 16) * -984902487;
		local120.anInt1490 = (local98 + 16) * -851301061;
		client.aClass5_7.method90(local120, 864007266);
	}

	@OriginalMember(owner = "client!ahl", name = "<init>", descriptor = "(Lclient!ky;Lclient!km;IIIIIIIIIIIII)V")
	Class125_Sub2(@OriginalArg(0) Class391 arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt2907 = arg9 * 376682065;
		this.anInt2909 = arg10 * -66247927;
		this.anInt2906 = arg11 * -775751983;
		this.anInt2908 = arg12 * -1865061903;
		this.anInt2910 = arg13 * 1145448509;
		this.anInt2911 = arg14 * -210618319;
	}

	@OriginalMember(owner = "client!ahl", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return Class392.aClass392_4;
	}

	@OriginalMember(owner = "client!ahl", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return Class392.aClass392_4;
	}
}

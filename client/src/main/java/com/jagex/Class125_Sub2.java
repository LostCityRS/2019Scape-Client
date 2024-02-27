package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahp")
public class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!ahp", name = "p", descriptor = "I")
	public final int anInt2987;

	@OriginalMember(owner = "client!ahp", name = "d", descriptor = "I")
	public final int anInt2988;

	@OriginalMember(owner = "client!ahp", name = "c", descriptor = "I")
	public final int anInt2990;

	@OriginalMember(owner = "client!ahp", name = "r", descriptor = "I")
	public final int anInt2991;

	@OriginalMember(owner = "client!ahp", name = "v", descriptor = "I")
	public final int anInt2989;

	@OriginalMember(owner = "client!ahp", name = "o", descriptor = "I")
	public final int anInt2992;

	@OriginalMember(owner = "client!ahp", name = "awu", descriptor = "(Lclient!yf;I)V")
	static void method21476(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) long local2 = Class305.method26889(195487695);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) (local2 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!ahp", name = "we", descriptor = "(Lclient!yf;I)V")
	static void method21477(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1653542369;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		@Pc(53) int local53 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 4];
		Class274.aClass258_11.method26167(Class275.aClass275_9, local13, local23, local43, Class280.aClass280_7.method26543(-1244463309), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local53, local33, -1068855624);
	}

	@OriginalMember(owner = "client!ahp", name = "au", descriptor = "(IIIII)V")
	static void method21478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(8, (long) arg0);
		local4.method21813(2020440513);
		local4.anInt3020 = arg1 * 1415359557;
		local4.anInt3025 = arg2 * -302789657;
		local4.anInt3019 = arg3 * 1929524779;
	}

	@OriginalMember(owner = "client!ahp", name = "<init>", descriptor = "(Lclient!kv;Lclient!ky;IIIIIIIIIIIII)V")
	Class125_Sub2(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt2987 = arg9 * -25746391;
		this.anInt2988 = arg10 * 1248296779;
		this.anInt2990 = arg11 * -1982073229;
		this.anInt2991 = arg12 * -1983617965;
		this.anInt2989 = arg13 * -1284394369;
		this.anInt2992 = arg14 * -611052463;
	}

	@OriginalMember(owner = "client!ahp", name = "l", descriptor = "()Lclient!kt;")
	@Override
	public Class388 method28760() {
		return Class388.aClass388_7;
	}

	@OriginalMember(owner = "client!ahp", name = "n", descriptor = "(S)Lclient!kt;")
	@Override
	public Class388 method28759(@OriginalArg(0) short arg0) {
		return Class388.aClass388_7;
	}
}

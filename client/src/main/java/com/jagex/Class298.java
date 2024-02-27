package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class298 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gr", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 aClass303_13;

	@OriginalMember(owner = "client!gr", name = "art", descriptor = "(Lclient!yf;B)V")
	static void method26795(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class251.method26066(-1989324515) ? 1 : 0;
	}

	@OriginalMember(owner = "client!gr", name = "mt", descriptor = "(Lclient!yf;I)V")
	static void method26796(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class433.method28972(local11, local14, arg0, (byte) 71);
	}

	@OriginalMember(owner = "client!gr", name = "adk", descriptor = "(Lclient!yf;S)V")
	static void method26797(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1] = arg0.aClass93_Sub28_4.method13823(1809333360)[arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1]];
	}

	@OriginalMember(owner = "client!gr", name = "eu", descriptor = "(Lclient!yf;I)V")
	static void method26798(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -340600993);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class305.method26892(local16, local22, arg0, 2084642459);
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!gx;)V")
	Class298(@OriginalArg(0) Class303 arg0) {
		this.aClass303_13 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "(Lclient!gq;B)V")
	@Override
	public void method26808(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26786(366543944);
	}

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26807(@OriginalArg(0) Class297 arg0) {
		arg0.method26786(667406197);
	}

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26806(@OriginalArg(0) Class297 arg0) {
		arg0.method26786(1484015672);
	}
}

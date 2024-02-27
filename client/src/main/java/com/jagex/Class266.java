package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class266 implements Interface26 {

	@OriginalMember(owner = "client!fk", name = "wv", descriptor = "Lclient!h;")
	public static Class306 aClass306_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fk", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 aClass303_2;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	final int anInt3922;

	@OriginalMember(owner = "client!fk", name = "fh", descriptor = "(Lclient!yf;B)V")
	static void method26319(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -336893798);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class627.method32428(local16, local22, arg0, 681686414);
	}

	@OriginalMember(owner = "client!fk", name = "kc", descriptor = "(Lclient!hf;Lclient!yf;B)V")
	static void method26320(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) byte arg2) {
		arg1.anInt6052 -= -1915563430;
		@Pc(15) int local15 = arg1.anIntArray521[arg1.anInt6052 * -1497248091] - 1;
		@Pc(25) int local25 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 1];
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class561.method31333(arg0, local15, local25, arg1, -2049935470);
	}

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "(IB)Lclient!aaj;")
	public static Class12 method26321(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class12[] local2 = Class352.method27763(-1399000489);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class12 local12 = local2[local4];
			if (arg0 == local12.anInt25 * -1955231941) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fk", name = "axx", descriptor = "(ILclient!hf;Lclient!yf;B)V")
	static void method26322(@OriginalArg(0) int arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		if (arg0 < 1 || arg0 > 10) {
			throw new RuntimeException();
		}
		Class334.method27496(arg0, arg1.anInt3994 * -1549590237, arg1.anInt4011 * 532402067, "", (short) 8426);
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V")
	Class266(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.aClass303_2 = arg0;
		this.anInt3922 = arg1.method22427(-1434290800) * 331868987;
	}

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26807(@OriginalArg(0) Class297 arg0) {
		@Pc(7) Class304 local7 = arg0.method26715(this.anInt3922 * -1290684941, 1151263163);
		local7.method26849(-1942433304);
		local7.method26838(1689751145);
		arg0.method26753(this.anInt3922 * -1290684941, -332433333);
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(Lclient!gq;B)V")
	@Override
	public void method26808(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class304 local7 = arg0.method26715(this.anInt3922 * -1290684941, 607100108);
		local7.method26849(-1942433304);
		local7.method26838(1689751145);
		arg0.method26753(this.anInt3922 * -1290684941, 36518985);
	}

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26806(@OriginalArg(0) Class297 arg0) {
		@Pc(7) Class304 local7 = arg0.method26715(this.anInt3922 * -1290684941, -1894103119);
		local7.method26849(-1942433304);
		local7.method26838(1689751145);
		arg0.method26753(this.anInt3922 * -1290684941, -1007852185);
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public class Class266 implements Interface26 {

	@OriginalMember(owner = "client!fk", name = "wv", descriptor = "Lclient!h;")
	public static Class306 aClass306_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fk", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	final int anInt3881;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "(IB)Lclient!aaj;", line = 20)
	public static Class12 method26226(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class12[] local2 = Class352.method27651(-1399000489);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class12 local12 = local2[local4];
			if (arg0 == local12.anInt25 * -1955231941) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 145)
	Class266(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Packet arg1) {
		this.this$0 = arg0;
		this.anInt3881 = arg1.g2(-1434290800) * 331868987;
	}

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "(Lclient!gq;)V", line = 150)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		@Pc(7) Class304 local7 = arg0.method26646(this.anInt3881 * -1290684941, 1151263163);
		local7.method26776(-1942433304);
		local7.method26744(1689751145);
		arg0.method26661(this.anInt3881 * -1290684941, -332433333);
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(Lclient!gq;B)V", line = 150)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class304 local7 = arg0.method26646(this.anInt3881 * -1290684941, 607100108);
		local7.method26776(-1942433304);
		local7.method26744(1689751145);
		arg0.method26661(this.anInt3881 * -1290684941, 36518985);
	}

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "(Lclient!gq;)V", line = 150)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		@Pc(7) Class304 local7 = arg0.method26646(this.anInt3881 * -1290684941, -1894103119);
		local7.method26776(-1942433304);
		local7.method26744(1689751145);
		arg0.method26661(this.anInt3881 * -1290684941, -1007852185);
	}

	@OriginalMember(owner = "client!fk", name = "fh", descriptor = "(Lclient!yf;B)V", line = 6020)
	static final void method26227(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, -336893798);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class627.method32247(local16, local22, arg0, 681686414);
	}

	@OriginalMember(owner = "client!fk", name = "kc", descriptor = "(Lclient!hf;Lclient!yf;B)V", line = 6862)
	static final void method26228(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) byte arg2) {
		arg1.anInt5891 -= -1915563430;
		@Pc(15) int local15 = arg1.anIntArray519[arg1.anInt5891 * -1497248091] - 1;
		@Pc(25) int local25 = arg1.anIntArray519[arg1.anInt5891 * -1497248091 + 1];
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class561.method31150(arg0, local15, local25, arg1, -2049935470);
	}

	@OriginalMember(owner = "client!fk", name = "axx", descriptor = "(ILclient!hf;Lclient!yf;B)V", line = 13865)
	static final void method26229(@OriginalArg(0) int arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		if (arg0 < 1 || arg0 > 10) {
			throw new RuntimeException();
		}
		Class334.method27403(arg0, arg1.anInt3953 * -1549590237, arg1.anInt3970 * 532402067, "", (short) 8426);
	}
}

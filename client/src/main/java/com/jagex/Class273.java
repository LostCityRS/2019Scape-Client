package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public class Class273 implements Interface26 {

	@OriginalMember(owner = "client!fr", name = "hr", descriptor = "Lclient!aop;")
	public static Class32_Sub14 aClass32_Sub14_8;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fr", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	final int anInt3886;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "(Ljava/lang/String;S)V", line = 123)
	static final void method26325(@OriginalArg(0) String arg0, @OriginalArg(1) short arg1) {
		System.out.println("Error: " + Class618.method32099(arg0, "%0a", "\n", 2079270337));
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 174)
	Class273(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Packet arg1) {
		this.this$0 = arg0;
		this.anInt3886 = arg1.g2(-1434290800) * -24991761;
	}

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "(Lclient!gq;B)V", line = 179)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) Class282 local9 = (Class282) arg0.method26616((byte) -6).get(this.anInt3886 * -659986673);
		arg0.method26668(this.anInt3886 * -659986673, 770776396);
		local9.method26465((byte) 16);
	}

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "(Lclient!gq;)V", line = 179)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		@Pc(9) Class282 local9 = (Class282) arg0.method26616((byte) 83).get(this.anInt3886 * -659986673);
		arg0.method26668(this.anInt3886 * -659986673, 1960601150);
		local9.method26465((byte) 91);
	}

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "(Lclient!gq;)V", line = 179)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		@Pc(9) Class282 local9 = (Class282) arg0.method26616((byte) 65).get(this.anInt3886 * -659986673);
		arg0.method26668(this.anInt3886 * -659986673, 2120866075);
		local9.method26465((byte) 39);
	}

	@OriginalMember(owner = "client!fr", name = "ad", descriptor = "(III)V", line = 233)
	static void method26326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(6, (long) arg0);
		local4.method21886(-1913295376);
		local4.anInt3020 = arg1 * 1415359557;
	}

	@OriginalMember(owner = "client!fr", name = "kg", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6763)
	static final void method26327(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4026 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * -203755659;
		arg0.anInt3986 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * 1834441125;
	}

	@OriginalMember(owner = "client!fr", name = "yr", descriptor = "(Lclient!yf;B)V", line = 9319)
	static final void method26328(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3426 * -1765120027;
	}

	@OriginalMember(owner = "client!fr", name = "avx", descriptor = "(Lclient!yf;B)V", line = 13501)
	static final void method26329(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class273 implements Interface26 {

	@OriginalMember(owner = "client!fr", name = "hr", descriptor = "Lclient!aop;")
	public static Class32_Sub14 aClass32_Sub14_8;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fr", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 aClass303_3;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	final int anInt3927;

	@OriginalMember(owner = "client!fr", name = "kg", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method26418(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4067 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * -203755659;
		arg0.anInt4027 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * 1834441125;
	}

	@OriginalMember(owner = "client!fr", name = "yr", descriptor = "(Lclient!yf;B)V")
	static void method26419(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3426 * -1765120027;
	}

	@OriginalMember(owner = "client!fr", name = "avx", descriptor = "(Lclient!yf;B)V")
	static void method26420(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!fr", name = "ad", descriptor = "(III)V")
	static void method26421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(6, (long) arg0);
		local4.method21813(-1913295376);
		local4.anInt3020 = arg1 * 1415359557;
	}

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "(Ljava/lang/String;S)V")
	static void method26422(@OriginalArg(0) String arg0, @OriginalArg(1) short arg1) {
		System.out.println("Error: " + Class618.method32285(arg0, "%0a", "\n", 2079270337));
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V")
	Class273(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.aClass303_3 = arg0;
		this.anInt3927 = arg1.method22427(-1434290800) * -24991761;
	}

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "(Lclient!gq;B)V")
	@Override
	public void method26808(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) Class282 local9 = (Class282) arg0.method26752((byte) -6).get(this.anInt3927 * -659986673);
		arg0.method26721(this.anInt3927 * -659986673, 770776396);
		local9.method26558((byte) 16);
	}

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26807(@OriginalArg(0) Class297 arg0) {
		@Pc(9) Class282 local9 = (Class282) arg0.method26752((byte) 83).get(this.anInt3927 * -659986673);
		arg0.method26721(this.anInt3927 * -659986673, 1960601150);
		local9.method26558((byte) 91);
	}

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26806(@OriginalArg(0) Class297 arg0) {
		@Pc(9) Class282 local9 = (Class282) arg0.method26752((byte) 65).get(this.anInt3927 * -659986673);
		arg0.method26721(this.anInt3927 * -659986673, 2120866075);
		local9.method26558((byte) 39);
	}
}

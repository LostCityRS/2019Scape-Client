package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public class Class287 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gf", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	final int anInt3901;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "(B)V", line = 74)
	static void method26541(@OriginalArg(0) byte arg0) {
		Class172.anInt3177 = 0;
		Class172.anInt3179 = -2004084007;
		Class172.anInt3174 = 246739717;
	}

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "(I)V", line = 137)
	public static void method26542(@OriginalArg(0) int arg0) {
		Class249.aClass16_24.method225((byte) 74);
		Class249.aClass22_51.method405(-2037259486);
		Class249.aClass255Array1 = null;
		Class249.aClass239Array1 = null;
		Class152.aClass243Array2 = null;
		Class716.aClass250Array1 = null;
		Class249.aClass110Array1 = null;
		Class249.anInt3840 = -1432082549;
		Class249.anInt3841 = 0;
		Class249.anInt3839 = 0;
		Class136.aClass244_1 = null;
		Class249.anInt3843 = -1397359395;
		Class249.anInt3842 = 1512963435;
		if (!Class249.aBoolean664) {
			return;
		}
		client.aShort150 = Class122_Sub3.aShort76;
		client.aShort151 = Class249.aShort163;
		client.aShort155 = Class152_Sub1.aShort99;
		client.aShort156 = Class249.aShort164;
		Class249.aBoolean664 = false;
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 218)
	Class287(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.this$0 = arg0;
		this.anInt3901 = arg1.method22472(-1434290800) * -800998703;
	}

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "(Lclient!gq;)V", line = 223)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		arg0.method26677(this.anInt3901 * -1286939087, -585277842);
		arg0.method26646(this.anInt3901 * -1286939087, -1041335988);
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(Lclient!gq;B)V", line = 223)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26677(this.anInt3901 * -1286939087, -585277842);
		arg0.method26646(this.anInt3901 * -1286939087, 1077553439);
	}

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "(Lclient!gq;)V", line = 223)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		arg0.method26677(this.anInt3901 * -1286939087, -585277842);
		arg0.method26646(this.anInt3901 * -1286939087, 1482814299);
	}

	@OriginalMember(owner = "client!gf", name = "akm", descriptor = "(Lclient!yf;I)V", line = 11741)
	static final void method26543(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (Class159_Sub1.aClass16_16 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			@Pc(20) Class93 local20 = Class159_Sub1.aClass16_16.method214((long) local12);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local20 == null ? 0 : 1;
		}
	}
}

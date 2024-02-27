package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akb")
public final class Class93_Sub12 extends Class93 {

	@OriginalMember(owner = "client!akb", name = "d", descriptor = "[F")
	static float[] aFloatArray42 = new float[3];

	@OriginalMember(owner = "client!akb", name = "l", descriptor = "I")
	int anInt1503;

	@OriginalMember(owner = "client!akb", name = "u", descriptor = "I")
	int anInt1504;

	@OriginalMember(owner = "client!akb", name = "w", descriptor = "I")
	int anInt1505;

	@OriginalMember(owner = "client!akb", name = "z", descriptor = "F")
	float aFloat142;

	@OriginalMember(owner = "client!akb", name = "p", descriptor = "F")
	float aFloat143;

	@OriginalMember(owner = "client!akb", name = "k", descriptor = "Lclient!cq;")
	final Class210 aClass210_1;

	@OriginalMember(owner = "client!akb", name = "f", descriptor = "Lclient!na;")
	final Class431 aClass431_1;

	@OriginalMember(owner = "client!akb", name = "anr", descriptor = "(Lclient!yf;I)V")
	static void method13453(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(21) Class472 local21 = Class472.method29710((float) local13, (float) local13, (float) local13);
		Class65.aClass123_Sub1_2.method9075(local21, -99068587);
		local21.method29713();
	}

	@OriginalMember(owner = "client!akb", name = "el", descriptor = "(B)Lclient!asy;")
	public static Class93_Sub1_Sub20 method13454(@OriginalArg(0) byte arg0) {
		return Class159_Sub1.aClass93_Sub1_Sub20_2;
	}

	@OriginalMember(owner = "client!akb", name = "<init>", descriptor = "(Lclient!cq;Lclient!xy;)V")
	Class93_Sub12(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class674 arg1) {
		this.aClass210_1 = arg0;
		this.aClass431_1 = this.aClass210_1.method25504(Class110_Sub15_Sub2.anInterface47_1, (byte) -35);
		this.method13449(-2088427029);
	}

	@OriginalMember(owner = "client!akb", name = "e", descriptor = "(I)V")
	void method13449(@OriginalArg(0) int arg0) {
		this.anInt1505 = this.aClass210_1.anInt3634 * -54445651;
		this.anInt1503 = this.aClass210_1.anInt3637 * 739263655;
		this.anInt1504 = this.aClass210_1.anInt3635 * 218506863;
		if (this.aClass210_1.aClass489_96 != null) {
			this.aClass210_1.aClass489_96.method30030((float) (this.aClass431_1.anInt4955 * -823033007), (float) (this.aClass431_1.anInt4956 * -1854056089), (float) (this.aClass431_1.anInt4957 * 1279331297), aFloatArray42);
		}
		this.aFloat142 = aFloatArray42[0];
		this.aFloat143 = aFloatArray42[2];
	}

	@OriginalMember(owner = "client!akb", name = "n", descriptor = "()V")
	void method13450() {
		this.anInt1505 = this.aClass210_1.anInt3634 * -54445651;
		this.anInt1503 = this.aClass210_1.anInt3637 * 739263655;
		this.anInt1504 = this.aClass210_1.anInt3635 * 218506863;
		if (this.aClass210_1.aClass489_96 != null) {
			this.aClass210_1.aClass489_96.method30030((float) (this.aClass431_1.anInt4955 * -823033007), (float) (this.aClass431_1.anInt4956 * -1854056089), (float) (this.aClass431_1.anInt4957 * 1279331297), aFloatArray42);
		}
		this.aFloat142 = aFloatArray42[0];
		this.aFloat143 = aFloatArray42[2];
	}

	@OriginalMember(owner = "client!akb", name = "m", descriptor = "()V")
	void method13451() {
		this.anInt1505 = this.aClass210_1.anInt3634 * -54445651;
		this.anInt1503 = this.aClass210_1.anInt3637 * 739263655;
		this.anInt1504 = this.aClass210_1.anInt3635 * 218506863;
		if (this.aClass210_1.aClass489_96 != null) {
			this.aClass210_1.aClass489_96.method30030((float) (this.aClass431_1.anInt4955 * -823033007), (float) (this.aClass431_1.anInt4956 * -1854056089), (float) (this.aClass431_1.anInt4957 * 1279331297), aFloatArray42);
		}
		this.aFloat142 = aFloatArray42[0];
		this.aFloat143 = aFloatArray42[2];
	}

	@OriginalMember(owner = "client!akb", name = "k", descriptor = "()V")
	void method13452() {
		this.anInt1505 = this.aClass210_1.anInt3634 * -54445651;
		this.anInt1503 = this.aClass210_1.anInt3637 * 739263655;
		this.anInt1504 = this.aClass210_1.anInt3635 * 218506863;
		if (this.aClass210_1.aClass489_96 != null) {
			this.aClass210_1.aClass489_96.method30030((float) (this.aClass431_1.anInt4955 * -823033007), (float) (this.aClass431_1.anInt4956 * -1854056089), (float) (this.aClass431_1.anInt4957 * 1279331297), aFloatArray42);
		}
		this.aFloat142 = aFloatArray42[0];
		this.aFloat143 = aFloatArray42[2];
	}
}

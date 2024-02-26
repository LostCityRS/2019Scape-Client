package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class169 {

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "F")
	static final float aFloat222 = 255.0F;

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable5;

	@OriginalMember(owner = "client!ar", name = "u", descriptor = "Z")
	boolean aBoolean552;

	@OriginalMember(owner = "client!ar", name = "aj", descriptor = "F")
	float aFloat225;

	@OriginalMember(owner = "client!ar", name = "aq", descriptor = "F")
	float aFloat226;

	@OriginalMember(owner = "client!ar", name = "ac", descriptor = "F")
	float aFloat229;

	@OriginalMember(owner = "client!ar", name = "ao", descriptor = "F")
	float aFloat231;

	@OriginalMember(owner = "client!ar", name = "ah", descriptor = "I")
	int anInt3020;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "F")
	float aFloat223 = 0.85F;

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "F")
	float aFloat224 = 1.0F - this.aFloat223;

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
	int anInt3017 = 0;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
	int anInt3018 = 0;

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "Z")
	boolean aBoolean553 = false;

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
	int anInt3021 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
	int anInt3019 = 0;

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "Z")
	boolean aBoolean554 = true;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "Lclient!pm;")
	Class487 aClass487_92 = new Class487();

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "Lclient!ov;")
	Class471 aClass471_40 = new Class471();

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "Lclient!ov;")
	Class471 aClass471_41 = new Class471();

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "Lclient!pm;")
	Class487 aClass487_93 = new Class487();

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "Lclient!pm;")
	Class487 aClass487_94 = new Class487();

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "[I")
	int[] anIntArray267 = new int[Class105_Sub1.anInt655];

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "[F")
	float[] aFloatArray72 = new float[Class105_Sub1.anInt655];

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "[F")
	float[] aFloatArray73 = new float[Class105_Sub1.anInt655];

	@OriginalMember(owner = "client!ar", name = "v", descriptor = "[F")
	float[] aFloatArray74 = new float[Class105_Sub1.anInt655];

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "[F")
	float[] aFloatArray71 = new float[Class105_Sub1.anInt655];

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "[I")
	int[] anIntArray268 = new int[8];

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "[I")
	int[] anIntArray269 = new int[8];

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "[I")
	int[] anIntArray273 = new int[8];

	@OriginalMember(owner = "client!ar", name = "ax", descriptor = "[I")
	int[] anIntArray270 = new int[10000];

	@OriginalMember(owner = "client!ar", name = "ay", descriptor = "[I")
	int[] anIntArray272 = new int[10000];

	@OriginalMember(owner = "client!ar", name = "ag", descriptor = "F")
	float aFloat227 = 1.0F;

	@OriginalMember(owner = "client!ar", name = "ab", descriptor = "F")
	float aFloat230 = 0.0F;

	@OriginalMember(owner = "client!ar", name = "al", descriptor = "F")
	float aFloat228 = 1.0F;

	@OriginalMember(owner = "client!ar", name = "af", descriptor = "[F")
	float[] aFloatArray77 = new float[2];

	@OriginalMember(owner = "client!ar", name = "am", descriptor = "[Lclient!afg;")
	Class105_Sub1[] aClass105_Sub1Array3 = new Class105_Sub1[8];

	@OriginalMember(owner = "client!ar", name = "ak", descriptor = "[Lclient!afg;")
	Class105_Sub1[] aClass105_Sub1Array4 = new Class105_Sub1[8];

	@OriginalMember(owner = "client!ar", name = "at", descriptor = "[F")
	float[] aFloatArray75 = new float[64];

	@OriginalMember(owner = "client!ar", name = "ad", descriptor = "[F")
	float[] aFloatArray78 = new float[64];

	@OriginalMember(owner = "client!ar", name = "av", descriptor = "[F")
	float[] aFloatArray79 = new float[64];

	@OriginalMember(owner = "client!ar", name = "an", descriptor = "[F")
	float[] aFloatArray80 = new float[64];

	@OriginalMember(owner = "client!ar", name = "aa", descriptor = "[F")
	float[] aFloatArray81 = new float[64];

	@OriginalMember(owner = "client!ar", name = "ae", descriptor = "[F")
	float[] aFloatArray76 = new float[3];

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "Lclient!aff;")
	Class102_Sub2 aClass102_Sub2_13;

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "Lclient!bt;")
	Class195 aClass195_2;

	@OriginalMember(owner = "client!ar", name = "ai", descriptor = "[I")
	int[] anIntArray271;

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "(Lclient!ald;II)[B")
	public static byte[] method21687(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.data);
		local5.skip((long) (arg0.pos * -1380987821));
		return Class278.method26838(local5, arg1, -2092067622);
	}

	@OriginalMember(owner = "client!ar", name = "aqg", descriptor = "(Lclient!yp;B)V")
	static void method21688(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
	}

	@OriginalMember(owner = "client!ar", name = "bcj", descriptor = "(Lclient!yp;S)V")
	static void method21689(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		Class267.method26665(arg0.aClass120_Sub1_Sub1_Sub1_4, arg0, -73945906);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method21690(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			arg0 = Class55.aRandom1;
			if (arg0 == null) {
				@Pc(9) Object local9 = Class55.anObject3;
				synchronized (Class55.anObject3) {
					if (Class55.aRandom1 == null) {
						Class55.aRandom1 = new Random();
					}
					arg0 = Class55.aRandom1;
				}
			}
		}
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Class523.method30651(arg1, -1632761948)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(57) int local57 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(60) int local60;
			do {
				local60 = arg0.nextInt();
			} while (local60 >= local57);
			return Class612.method32229(local60, arg1, -642336032);
		}
	}

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "(IB)Lclient!is;")
	public static Class347 method21691(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (Class347.aClass347_4.anInt4252 * 1583199675 == arg0) {
			return Class347.aClass347_4;
		} else if (arg0 == Class347.aClass347_3.anInt4252 * 1583199675) {
			return Class347.aClass347_3;
		} else if (Class347.aClass347_5.anInt4252 * 1583199675 == arg0) {
			return Class347.aClass347_5;
		} else if (arg0 == Class347.aClass347_7.anInt4252 * 1583199675) {
			return Class347.aClass347_7;
		} else if (Class347.aClass347_6.anInt4252 * 1583199675 == arg0) {
			return Class347.aClass347_6;
		} else if (Class347.aClass347_8.anInt4252 * 1583199675 == arg0) {
			return Class347.aClass347_8;
		} else if (arg0 == Class347.aClass347_9.anInt4252 * 1583199675) {
			return Class347.aClass347_9;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!aff;)V")
	Class169(@OriginalArg(0) Class102_Sub2 arg0) {
		this.aClass102_Sub2_13 = arg0;
		this.aClass195_2 = new Class195(arg0, this);
		@Pc(150) int local150;
		for (local150 = 0; local150 < 8; local150++) {
			this.aClass105_Sub1Array3[local150] = new Class105_Sub1(this.aClass102_Sub2_13);
			this.aClass105_Sub1Array4[local150] = new Class105_Sub1(this.aClass102_Sub2_13);
		}
		this.anIntArray271 = new int[Class105_Sub1.anInt677];
		for (local150 = 0; local150 < Class105_Sub1.anInt677; local150++) {
			this.anIntArray271[local150] = -1;
		}
	}

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "()V")
	void method21679() {
		this.aClass195_2 = new Class195(this.aClass102_Sub2_13, this);
	}

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "(I)V")
	void method21680(@OriginalArg(0) int arg0) {
		this.aClass195_2 = new Class195(this.aClass102_Sub2_13, this);
	}

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "(Ljava/lang/Runnable;I)V")
	void method21681(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		this.aRunnable5 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "()V")
	void method21682() {
		this.aClass195_2 = new Class195(this.aClass102_Sub2_13, this);
	}

	@OriginalMember(owner = "client!ar", name = "u", descriptor = "()V")
	void method21683() {
		this.aClass195_2 = new Class195(this.aClass102_Sub2_13, this);
	}

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "(Ljava/lang/Runnable;)V")
	void method21684(@OriginalArg(0) Runnable arg0) {
		this.aRunnable5 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "(Ljava/lang/Runnable;)V")
	void method21685(@OriginalArg(0) Runnable arg0) {
		this.aRunnable5 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "(Ljava/lang/Runnable;)V")
	void method21686(@OriginalArg(0) Runnable arg0) {
		this.aRunnable5 = arg0;
	}
}

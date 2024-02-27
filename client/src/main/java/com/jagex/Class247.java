package com.jagex;

import java.io.IOException;
import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
final class Class247 implements Comparator {

	// $FF: synthetic field
	@OriginalMember(owner = "client!el", name = "this$0", descriptor = "Lclient!aiw;")
	final Class146_Sub1 aClass146_Sub1_3;

	@OriginalMember(owner = "client!el", name = "af", descriptor = "(Lclient!yf;B)V")
	static void method26007(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.aLongArray27[(arg0.anInt6055 += -1364417339) * -2000995827 - 1] = arg0.aLongArray26[arg0.anIntArray522[arg0.anInt6050 * -709694321]];
	}

	@OriginalMember(owner = "client!el", name = "kx", descriptor = "(Lclient!yf;S)V")
	static void method26008(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 167649149);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class79.method1453(local16, local22, arg0, (byte) 13);
	}

	@OriginalMember(owner = "client!el", name = "lz", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method26009(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.method26977(1229657527);
	}

	@OriginalMember(owner = "client!el", name = "auj", descriptor = "(Lclient!yf;B)V")
	static void method26010(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16235(-374662973);
	}

	@OriginalMember(owner = "client!el", name = "aej", descriptor = "(Lclient!yf;B)V")
	static void method26011(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class300.method26814(local13, local23, local33, (byte) -13);
	}

	@OriginalMember(owner = "client!el", name = "if", descriptor = "(Lclient!ax;I)Z")
	static boolean method26012(@OriginalArg(0) Class175 arg0, @OriginalArg(1) int arg1) {
		try {
			return Class696.method36832(arg0, (byte) -8);
		} catch (@Pc(4) IOException local4) {
			if (client.anInt3435 * -849002901 == 15) {
				arg0.method24370((byte) 95);
				return false;
			} else {
				Class565.method31435(-2066387364);
				return true;
			}
		} catch (@Pc(19) Exception local19) {
			@Pc(23) Class611 local23 = client.aClass532_1.method30624(1828891152);
			@Pc(99) String local99 = (arg0.aClass453_2 == null ? -1 : arg0.aClass453_2.anInt5195 * 1430738181) + Class430.aString213 + (arg0.aClass453_4 == null ? -1 : arg0.aClass453_4.anInt5195 * 1430738181) + Class430.aString213 + (arg0.aClass453_3 == null ? -1 : arg0.aClass453_3.anInt5195 * 1430738181) + " " + arg0.anInt3301 * 2010044839 + Class430.aString213 + (local23.anInt5784 * 270611681 + Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0]) + Class430.aString213 + (local23.anInt5785 * -1994307635 + Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0]) + " ";
			for (@Pc(101) int local101 = 0; local101 < arg0.anInt3301 * 2010044839 && local101 < 50; local101++) {
				local99 = local99 + arg0.aClass93_Sub41_Sub2_2.aByteArray58[local101] + Class430.aString213;
			}
			Class646.method32791(local99, local19, 1224473706);
			Class642.method32703(false, (short) 17862);
			return true;
		}
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!aiw;)V")
	Class247(@OriginalArg(0) Class146_Sub1 arg0) {
		this.aClass146_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "ro", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method26000(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(Lclient!rq;Lclient!rq;I)I")
	int method26001(@OriginalArg(0) Class535 arg0, @OriginalArg(1) Class535 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) float local3 = arg0.method30863(-1732592269);
		@Pc(7) float local7 = arg1.method30863(85290336);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!el", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method26001((Class535) arg0, (Class535) arg1, -866247073);
	}

	@OriginalMember(owner = "client!el", name = "n", descriptor = "(Lclient!rq;Lclient!rq;)I")
	int method26002(@OriginalArg(0) Class535 arg0, @OriginalArg(1) Class535 arg1) {
		@Pc(3) float local3 = arg0.method30863(-1301690363);
		@Pc(7) float local7 = arg1.method30863(-1888685235);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!el", name = "m", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int method26003(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method26001((Class535) arg0, (Class535) arg1, -866247073);
	}

	@OriginalMember(owner = "client!el", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!el", name = "rp", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method26004(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!el", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method26005(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!el", name = "rq", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method26006(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}
}

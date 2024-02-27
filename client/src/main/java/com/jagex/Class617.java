package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class617 {

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
	public static final int anInt5791 = 2;

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
	public static final int anInt5792 = 9;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
	public static final int anInt5793 = 512;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
	public static final int anInt5794 = 511;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public static final int anInt5795 = 1024;

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
	public static final int anInt5796 = 7;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
	public static final int anInt5797 = 256;

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
	public static final int anInt5798 = 128;

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
	public static final int anInt5799 = 8;

	static {
		Math.sqrt(131072.0D);
	}

	@OriginalMember(owner = "client!vm", name = "ia", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method32272(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4074 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * -570079743;
	}

	@OriginalMember(owner = "client!vm", name = "kk", descriptor = "(Lclient!hf;I[B[BLclient!yf;I)V")
	static void method32273(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class681 arg4, @OriginalArg(5) int arg5) {
		if (arg0.aByteArrayArray14 == null) {
			if (arg2 == null) {
				return;
			}
			arg0.aByteArrayArray14 = new byte[11][];
			arg0.aByteArrayArray15 = new byte[11][];
			arg0.anIntArray375 = new int[11];
			arg0.anIntArray377 = new int[11];
			arg0.anIntArray379 = new int[11];
		}
		arg0.aByteArrayArray14[arg1] = arg2;
		if (arg2 == null) {
			arg0.aBoolean702 = false;
			for (@Pc(42) int local42 = 0; local42 < arg0.aByteArrayArray14.length; local42++) {
				if (arg0.aByteArrayArray14[local42] != null || arg0.anIntArray379[local42] > 0) {
					arg0.aBoolean702 = true;
					break;
				}
			}
		} else {
			arg0.aBoolean702 = true;
		}
		arg0.aByteArrayArray15[arg1] = arg3;
	}

	@OriginalMember(owner = "client!vm", name = "ul", descriptor = "(Lclient!yf;I)V")
	static void method32274(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 711026079);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4023 * -1490598249;
	}

	@OriginalMember(owner = "client!vm", name = "baw", descriptor = "(Lclient!yf;I)V")
	static void method32275(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method16555(local12, 303122570);
	}

	@OriginalMember(owner = "client!vm", name = "afg", descriptor = "(Lclient!yf;I)V")
	static void method32276(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 != null && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1.aBoolean871) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local25;
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local14;
		}
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	Class617() throws Throwable {
		throw new Error();
	}
}

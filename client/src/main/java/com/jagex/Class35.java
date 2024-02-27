package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abh")
public final class Class35 {

	@OriginalMember(owner = "client!abh", name = "n", descriptor = "I")
	public static final int anInt110 = 2;

	@OriginalMember(owner = "client!abh", name = "e", descriptor = "I")
	public static final int anInt111 = 1;

	@OriginalMember(owner = "client!abh", name = "m", descriptor = "I")
	public static final int anInt112 = 3;

	@OriginalMember(owner = "client!abh", name = "k", descriptor = "I")
	public static final int anInt113 = 4;

	@OriginalMember(owner = "client!abh", name = "uy", descriptor = "I")
	static int anInt114;

	@OriginalMember(owner = "client!abh", name = "gu", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method686(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091];
		@Pc(26) String local26 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		@Pc(32) Class87 local32 = (Class87) Class124.aClass32_Sub21_7.method18273(local12, -878509456);
		if (local32.aString11.equals(local26)) {
			arg0.method26955(local12, 602703457);
		} else {
			arg0.method27004(local12, local26, 1744495686);
		}
	}

	@OriginalMember(owner = "client!abh", name = "lf", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method687(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class175 local2 = Class330.method27465(-1607413619);
		@Pc(8) Class93_Sub22 local8 = Class102.method2592(Class446.aClass446_102, local2.aClass24_2, (byte) 73);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		local8.aClass93_Sub41_Sub2_1.method22522(Class46.method894(arg0, -1758564069) + Class46.method894(arg1, -1948018325), (byte) -24);
		local8.aClass93_Sub41_Sub2_1.method22414(arg1, -543354089);
		local8.aClass93_Sub41_Sub2_1.method22414(arg0, 832412331);
		local2.method24363(local8, -1632121537);
	}

	@OriginalMember(owner = "client!abh", name = "kl", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;S)V")
	static void method688(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) short arg3) {
		arg0.anInt4073 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * -141980023;
	}

	@OriginalMember(owner = "client!abh", name = "<init>", descriptor = "()V")
	Class35() throws Throwable {
		throw new Error();
	}
}

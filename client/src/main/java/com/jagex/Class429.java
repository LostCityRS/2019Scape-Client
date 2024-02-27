package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mz")
public final class Class429 {

	@OriginalMember(owner = "client!mz", name = "iv", descriptor = "Lclient!adm;")
	public static Class79_Sub1_Sub2 aClass79_Sub1_Sub2_5;

	@OriginalMember(owner = "client!mz", name = "tk", descriptor = "I")
	public static int anInt4942;

	@OriginalMember(owner = "client!mz", name = "e", descriptor = "Lclient!mz;")
	public static final Class429 aClass429_2 = new Class429();

	@OriginalMember(owner = "client!mz", name = "n", descriptor = "Lclient!mz;")
	public static final Class429 aClass429_1 = new Class429();

	@OriginalMember(owner = "client!mz", name = "aon", descriptor = "(Lclient!yf;I)V")
	static void method28934(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(24) float local24 = Class464.method29463(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1]);
		@Pc(29) Class93_Sub1_Sub17 local29 = Class65.aClass123_Sub1_2.method8947(local13, -93215992);
		if (local29 == null) {
			throw new RuntimeException("");
		} else if (local29 instanceof Class93_Sub1_Sub17_Sub2) {
			((Class93_Sub1_Sub17_Sub2) local29).method23518(local24, -522679374);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mz", name = "e", descriptor = "(Ljava/lang/String;II)Lclient!abx;")
	public static Class49 method28935(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class49_Sub1 local3 = new Class49_Sub1();
		local3.aString58 = arg0;
		local3.anInt2384 = arg1 * -381473519;
		return local3;
	}

	@OriginalMember(owner = "client!mz", name = "vu", descriptor = "(Lclient!yf;B)V")
	static void method28936(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(15) int local15 = 0;
		if (Class633.method32485(local13, 250407149)) {
			local15 = Class616.method32271(local13, (byte) 8);
		}
		@Pc(29) Class93_Sub22 local29 = Class102.method2592(Class446.aClass446_123, client.aClass175_2.aClass24_2, (byte) 75);
		local29.aClass93_Sub41_Sub2_1.method22407(local15, (byte) -9);
		client.aClass175_2.method24363(local29, -1971146310);
	}

	@OriginalMember(owner = "client!mz", name = "<init>", descriptor = "()V")
	Class429() {
	}
}

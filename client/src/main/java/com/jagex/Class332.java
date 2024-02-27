package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class332 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!ib;")
	public static final Class332 aClass332_6 = new Class332(0, 104);

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!ib;")
	static final Class332 aClass332_2 = new Class332(1, 120);

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!ib;")
	static final Class332 aClass332_3 = new Class332(2, 136);

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!ib;")
	static final Class332 aClass332_5 = new Class332(3, 168);

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!ib;")
	static final Class332 aClass332_4 = new Class332(4, 72);

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "Lclient!ib;")
	static final Class332 aClass332_1 = new Class332(5, 256);

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public final int anInt4188;

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
	public final int anInt4189;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "(I)Lclient!ib;")
	public static Class332 method27480(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class25_Sub1.method16007(-767537114);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4188 * 595334117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Lclient!ib;")
	public static Class332 method27481(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class25_Sub1.method16007(-1145668119);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4188 * 595334117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "(I)Lclient!ib;")
	public static Class332 method27482(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class25_Sub1.method16007(-1121487001);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4188 * 595334117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "(I)Lclient!ib;")
	public static Class332 method27483(@OriginalArg(0) int arg0) {
		@Pc(2) Class332[] local2 = Class25_Sub1.method16007(1406667206);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4188 * 595334117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "fs", descriptor = "(Lclient!yf;B)V")
	static void method27484(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 2009938100);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class104.method20890(local16, local22, arg0, (byte) 70);
	}

	@OriginalMember(owner = "client!ib", name = "aql", descriptor = "(Lclient!yf;B)V")
	static void method27485(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!ib", name = "ps", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method27486(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray39 = Class499.method30329(local13, arg2, -1104938487);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "(Lclient!ov;I)F")
	public static float method27487(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat325, (double) local4.aFloat327);
		local4.method29713();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!ib", name = "ms", descriptor = "(Lclient!ax;I)V")
	static void method27488(@OriginalArg(0) Class175 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_82, arg0.aClass24_2, (byte) 93);
		arg0.method24363(local5, -1462283660);
		client.aBoolean638 = true;
	}

	@OriginalMember(owner = "client!ib", name = "bae", descriptor = "(Lclient!yf;I)V")
	static void method27489(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method16555(local12, -69207239);
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	Class332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4188 = arg0 * -514067987;
		this.anInt4189 = arg1 * -199949377;
	}
}

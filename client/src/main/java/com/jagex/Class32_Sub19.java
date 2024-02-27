package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aov")
public final class Class32_Sub19 extends Class32 {

	@OriginalMember(owner = "client!aov", name = "ph", descriptor = "Z")
	public static boolean aBoolean375;

	@OriginalMember(owner = "client!aov", name = "tp", descriptor = "(Lclient!hf;Lclient!yf;S)V")
	static void method17415(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) short arg2) {
		@Pc(12) int local12 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091];
		@Pc(27) int local27 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091] - 1;
		@Pc(29) int local29 = local27;
		if (arg0.anInt4042 * 1553054515 != 6 && arg0.anInt4042 * 1553054515 != 2) {
			throw new RuntimeException("");
		}
		@Pc(55) Class336 local55 = (Class336) Class162.aClass32_Sub3_2.method18273(arg0.anInt4078 * 371778301, 1269697311);
		if (arg0.aClass331_2 == null) {
			arg0.aClass331_2 = new Class331(local55, arg0.anInt4042 * 1553054515 == 6);
		}
		arg0.aClass331_2.aLong259 = Class388.method28430((byte) 127) * 6591543353939106377L;
		if (local55.aByteArray84 != null) {
			if (local27 < 0 || local27 >= local55.aByteArray84.length) {
				throw new RuntimeException("");
			}
			local29 = local55.aByteArray84[local27];
		}
		if (local55.aShortArray118 == null || local29 < 0 || local29 >= local55.aShortArray118.length) {
			throw new RuntimeException("");
		}
		arg0.aClass331_2.aShortArray113[local29] = (short) local12;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!aov", name = "pv", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method17416(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray34 = Class499.method30329(local13, arg2, 465206940);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!aov", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;Lclient!py;)V")
	public Class32_Sub19(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Class497 arg3) {
		super(arg0, arg1, arg2, Class667.aClass667_35, 64, new Class356(arg3));
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class338 {

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "Lclient!if;")
	static Class336 aClass336_1;

	@OriginalMember(owner = "client!ih", name = "lc", descriptor = "I")
	static int anInt4231;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "(Lclient!ald;)Ljava/lang/String;")
	public static String method27880(@OriginalArg(0) Packet arg0) {
		return Class445.method29238(arg0, 32767, (byte) -24);
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "(Lclient!if;)V")
	public static void method27881(@OriginalArg(0) Class336 arg0) {
		aClass336_1 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(Lclient!if;)V")
	public static void method27882(@OriginalArg(0) Class336 arg0) {
		aClass336_1 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(Lclient!ald;Ljava/lang/String;)I")
	public static int method27883(@OriginalArg(0) Packet arg0, @OriginalArg(1) String arg1) {
		@Pc(4) int local4 = arg0.pos * -1380987821;
		@Pc(8) byte[] local8 = Class623.method32438(arg1, -2113522262);
		arg0.pSmart1or2(local8.length);
		arg0.pos += aClass336_1.method27862(local8, 0, local8.length, arg0.data, arg0.pos * -1380987821, 1751577917) * 1034180571;
		return arg0.pos * -1380987821 - local4;
	}

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "(Lclient!sc;III)J")
	static long method27884(@OriginalArg(0) Interface60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) long local1 = 4194304L;
		@Pc(3) long local3 = Long.MIN_VALUE;
		@Pc(13) Class625 local13 = (Class625) client.aClass539_1.method30905(556454909).method18054(arg0.method13834((byte) 58), -71269024);
		@Pc(34) long local34 = (long) (arg1 | arg2 << 7 | arg0.method13819(1209453040) << 14 | arg0.method13820(712099038) << 20 | 0x40000000);
		if (local13.anInt5506 * 350558937 == 0) {
			local34 |= local3;
		}
		if (local13.anInt5526 * -1859673749 == 1) {
			local34 |= local1;
		}
		return local34 | (long) arg0.method13834((byte) 23) << 32;
	}

	@OriginalMember(owner = "client!ih", name = "po", descriptor = "(Lclient!yp;I)V")
	static void method27885(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class375.method28449(local11, local14, arg0, -1681701478);
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	Class338() throws Throwable {
		throw new Error();
	}
}

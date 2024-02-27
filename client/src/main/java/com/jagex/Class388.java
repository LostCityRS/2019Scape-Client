package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class388 {

	@OriginalMember(owner = "client!kt", name = "q", descriptor = "Lclient!df;")
	static Class225 aClass225_7;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_4 = new Class388(1);

	@OriginalMember(owner = "client!kt", name = "n", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_2 = new Class388(2);

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_3 = new Class388(2);

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_7 = new Class388(2);

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_5 = new Class388(1);

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_8 = new Class388(1);

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_6 = new Class388(1);

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_1 = new Class388(2);

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_9 = new Class388(1);

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_10 = new Class388(2);

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "Lclient!kt;")
	public static final Class388 aClass388_11 = new Class388(1);

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
	public final int anInt4812;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "()[Lclient!kt;")
	public static Class388[] method28427() {
		return new Class388[] { aClass388_4, aClass388_2, aClass388_3, aClass388_7, aClass388_5, aClass388_8, aClass388_6, aClass388_1, aClass388_9, aClass388_10, aClass388_11 };
	}

	@OriginalMember(owner = "client!kt", name = "n", descriptor = "()[Lclient!kt;")
	public static Class388[] method28428() {
		return new Class388[] { aClass388_4, aClass388_2, aClass388_3, aClass388_7, aClass388_5, aClass388_8, aClass388_6, aClass388_1, aClass388_9, aClass388_10, aClass388_11 };
	}

	@OriginalMember(owner = "client!kt", name = "av", descriptor = "(IIIII)V")
	public static void method28429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Class625.aLinkedList8.addLast(new Class619(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@OriginalMember(owner = "client!kt", name = "te", descriptor = "(B)J")
	static long method28430(@OriginalArg(0) byte arg0) {
		return (long) ((Class687.anInt6072 += 1452184077) * -336261947 - 1) << 32 | 0xFFFFFFFFL;
	}

	@OriginalMember(owner = "client!kt", name = "atx", descriptor = "(Lclient!yf;I)V")
	static void method28431(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!kt", name = "auf", descriptor = "(Lclient!yf;I)V")
	static void method28432(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub33_1.method16192(-2100375867) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!kt", name = "beu", descriptor = "(Lclient!yf;I)V")
	static void method28433(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		Class146.aClass344_3.method27622(local13, 537199301);
	}

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "(IZIZB)V")
	public static void method28434(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		Class271.method26398(0, Class50.aClass154_Sub1Array1.length - 1, arg0, arg1, arg2, arg3, 1370705227);
		Class50.anInt195 = 0;
		Class50.aClass678_1 = null;
	}

	@OriginalMember(owner = "client!kt", name = "az", descriptor = "(IIIIS)V")
	static void method28435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) short arg4) {
		@Pc(9) Class93_Sub1_Sub11 local9 = Class371.method28187(20, (long) arg1 << 32 | (long) arg0);
		local9.method21813(-1837156374);
		local9.anInt3020 = arg2 * 1415359557;
		local9.anInt3025 = arg3 * -302789657;
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(I)V")
	Class388(@OriginalArg(0) int arg0) {
		this.anInt4812 = arg0 * 108659629;
	}
}

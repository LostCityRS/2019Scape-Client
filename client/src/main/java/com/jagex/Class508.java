package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class508 {

	@OriginalMember(owner = "client!qk", name = "uj", descriptor = "I")
	static int anInt5365;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "Lclient!qk;")
	static final Class508 aClass508_7 = new Class508(0, false);

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "Lclient!qk;")
	public static final Class508 aClass508_6 = new Class508(1, false);

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "Lclient!qk;")
	static final Class508 aClass508_3 = new Class508(2, false);

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "Lclient!qk;")
	static final Class508 aClass508_4 = new Class508(3, false);

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "Lclient!qk;")
	static final Class508 aClass508_5 = new Class508(4, false);

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "Lclient!qk;")
	static final Class508 aClass508_1 = new Class508(5, true);

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "Lclient!qk;")
	static final Class508 aClass508_2 = new Class508(6, true);

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "Lclient!qk;")
	static final Class508 aClass508_8 = new Class508(7, true);

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "Lclient!qk;")
	static final Class508 aClass508_9 = new Class508(8, true);

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
	final int anInt5364;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Z")
	public final boolean aBoolean795;

	@OriginalMember(owner = "client!qk", name = "da", descriptor = "(Lclient!yf;B)V")
	static void method30413(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class371.method28181(local11, local14, arg0, 2140635851);
	}

	@OriginalMember(owner = "client!qk", name = "gj", descriptor = "(Lclient!yf;I)V")
	static void method30414(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1714311520);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class645.method32787(local16, local22, arg0, 1648088418);
	}

	@OriginalMember(owner = "client!qk", name = "mn", descriptor = "(I)Ljava/lang/String;")
	public static String method30415(@OriginalArg(0) int arg0) {
		return Class119.method8605("www", false, 1321286487);
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IZ)V")
	Class508(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt5364 = arg0 * -160892315;
		this.aBoolean795 = arg1;
	}
}

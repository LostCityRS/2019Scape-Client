package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cz")
public final class Class219 {

	@OriginalMember(owner = "client!cz", name = "m", descriptor = "I")
	public static final int anInt3661 = 4098;

	@OriginalMember(owner = "client!cz", name = "e", descriptor = "I")
	public static final int anInt3662 = 0;

	@OriginalMember(owner = "client!cz", name = "f", descriptor = "I")
	public static final int anInt3663 = -1;

	@OriginalMember(owner = "client!cz", name = "n", descriptor = "I")
	public static final int anInt3665 = 4318;

	@OriginalMember(owner = "client!cz", name = "k", descriptor = "I")
	public static final int anInt3667 = 32902;

	@OriginalMember(owner = "client!cz", name = "bq", descriptor = "I")
	public static int anInt3668;

	@OriginalMember(owner = "client!cz", name = "uk", descriptor = "I")
	static int anInt3669;

	@OriginalMember(owner = "client!cz", name = "w", descriptor = "I")
	public final int anInt3664;

	@OriginalMember(owner = "client!cz", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString157;

	@OriginalMember(owner = "client!cz", name = "u", descriptor = "I")
	public final int anInt3666;

	@OriginalMember(owner = "client!cz", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString156;

	@OriginalMember(owner = "client!cz", name = "p", descriptor = "J")
	public final long aLong247;

	@OriginalMember(owner = "client!cz", name = "n", descriptor = "(Lclient!py;IB)Lclient!cm;")
	public static Class100 method25602(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) Class100 local5 = (Class100) Class366.aClass240_80.method25932((long) arg1);
		if (local5 == null) {
			if (Class362.aBoolean738) {
				local5 = Class694.aClass104_14.method20511(Class203.method24662(arg0, arg1), true);
			} else {
				local5 = Class288.method26643(arg0.method30240(arg1, (byte) 108), -348649236);
			}
			Class366.aClass240_80.method25923(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!cz", name = "om", descriptor = "(Lclient!yf;B)V")
	static void method25603(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class528.method30577(local11, local14, arg0, (byte) 42);
	}

	@OriginalMember(owner = "client!cz", name = "bbk", descriptor = "(Lclient!yf;I)V")
	static void method25604(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!cz", name = "y", descriptor = "(I)Z")
	static boolean method25605(@OriginalArg(0) int arg0) {
		Class411.anInt4875 = 1757895756;
		Class411.aClass175_3 = client.aClass175_1;
		return Class507.method30409(Class411.aLong274 * 4457507688757033075L == -1L, true, "", "", Class411.aLong274 * 4457507688757033075L);
	}

	@OriginalMember(owner = "client!cz", name = "e", descriptor = "(Lclient!py;III)Lclient!aac;")
	public static Class5 method25606(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return Class446.method29078(arg0, arg1, arg2, null, 156544913);
	}

	@OriginalMember(owner = "client!cz", name = "v", descriptor = "(I)V")
	static void method25607(@OriginalArg(0) int arg0) {
		if (Class454.aClass93_Sub1_Sub8_1 != null) {
			Class454.aClass93_Sub1_Sub8_1 = null;
			Class269.method26366(Class301.anInt3972 * 1939408525, Class318.anInt4136 * -988861719, Class454.anInt5207 * -816478179, Class360.anInt4731 * 2144271703, (byte) 87);
		}
	}

	@OriginalMember(owner = "client!cz", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;JZ)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3664 = arg0 * 1737474285;
		this.aString157 = arg1;
		this.anInt3666 = arg2 * -812317051;
		this.aString156 = arg3;
		this.aLong247 = arg4 * -6340972683995439259L;
	}
}

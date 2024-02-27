package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zd")
public final class Class702 {

	@OriginalMember(owner = "client!zd", name = "e", descriptor = "Lclient!zd;")
	public static final Class702 aClass702_6 = new Class702("runescape", "RuneScape", 0, Class83.aClass83_6);

	@OriginalMember(owner = "client!zd", name = "n", descriptor = "Lclient!zd;")
	public static final Class702 aClass702_5 = new Class702("stellardawn", "Stellar Dawn", 1, Class83.aClass83_3);

	@OriginalMember(owner = "client!zd", name = "m", descriptor = "Lclient!zd;")
	static final Class702 aClass702_9 = new Class702("game3", "Game 3", 2, Class83.aClass83_6);

	@OriginalMember(owner = "client!zd", name = "k", descriptor = "Lclient!zd;")
	static final Class702 aClass702_7 = new Class702("game4", "Game 4", 3, Class83.aClass83_5);

	@OriginalMember(owner = "client!zd", name = "f", descriptor = "Lclient!zd;")
	static final Class702 aClass702_8 = new Class702("game5", "Game 5", 4, Class83.aClass83_8);

	@OriginalMember(owner = "client!zd", name = "w", descriptor = "Lclient!zd;")
	static final Class702 aClass702_10 = new Class702("oldscape", "RuneScape 2007", 5, Class83.aClass83_6);

	@OriginalMember(owner = "client!zd", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString250;

	@OriginalMember(owner = "client!zd", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString251;

	@OriginalMember(owner = "client!zd", name = "z", descriptor = "I")
	public final int anInt6114;

	@OriginalMember(owner = "client!zd", name = "m", descriptor = "(I)Lclient!zd;")
	public static Class702 method36899(@OriginalArg(0) int arg0) {
		@Pc(2) Class702[] local2 = Class520.method30524((byte) 32);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class702 local12 = local2[local4];
			if (arg0 == local12.anInt6114 * -1111983921) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zd", name = "k", descriptor = "(I)Lclient!zd;")
	public static Class702 method36900(@OriginalArg(0) int arg0) {
		@Pc(2) Class702[] local2 = Class520.method30524((byte) 94);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class702 local12 = local2[local4];
			if (arg0 == local12.anInt6114 * -1111983921) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zd", name = "bc", descriptor = "(IB)Z")
	static boolean method36901(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
	}

	@OriginalMember(owner = "client!zd", name = "sk", descriptor = "(Lclient!yf;B)V")
	static void method36902(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4048 * 1214995653;
	}

	@OriginalMember(owner = "client!zd", name = "n", descriptor = "([SI)[S")
	public static short[] method36903(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(8) short[] local8 = new short[arg0.length];
			System.arraycopy(arg0, 0, local8, 0, arg0.length);
			return local8;
		}
	}

	@OriginalMember(owner = "client!zd", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILclient!adi;)V")
	Class702(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83 arg3) {
		this.aString250 = arg0;
		this.aString251 = arg1;
		this.anInt6114 = arg2 * -542011857;
	}
}

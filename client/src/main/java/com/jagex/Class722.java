package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zy")
public final class Class722 {

	@OriginalMember(owner = "client!zy", name = "t", descriptor = "Lclient!zy;")
	public static final Class722 aClass722_10 = new Class722("runescape", "RuneScape", 0, Class91.aClass91_9);

	@OriginalMember(owner = "client!zy", name = "f", descriptor = "Lclient!zy;")
	public static final Class722 aClass722_6 = new Class722("stellardawn", "Stellar Dawn", 1, Class91.aClass91_2);

	@OriginalMember(owner = "client!zy", name = "e", descriptor = "Lclient!zy;")
	static final Class722 aClass722_7 = new Class722("game3", "Game 3", 2, Class91.aClass91_9);

	@OriginalMember(owner = "client!zy", name = "u", descriptor = "Lclient!zy;")
	static final Class722 aClass722_8 = new Class722("game4", "Game 4", 3, Class91.aClass91_4);

	@OriginalMember(owner = "client!zy", name = "l", descriptor = "Lclient!zy;")
	static final Class722 aClass722_9 = new Class722("game5", "Game 5", 4, Class91.aClass91_7);

	@OriginalMember(owner = "client!zy", name = "g", descriptor = "Lclient!zy;")
	static final Class722 aClass722_5 = new Class722("oldscape", "RuneScape 2007", 5, Class91.aClass91_9);

	@OriginalMember(owner = "client!zy", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString247;

	@OriginalMember(owner = "client!zy", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString248;

	@OriginalMember(owner = "client!zy", name = "o", descriptor = "I")
	public final int anInt5829;

	@OriginalMember(owner = "client!zy", name = "e", descriptor = "()[Lclient!zy;")
	static Class722[] method37337() {
		return new Class722[] { aClass722_6, aClass722_9, aClass722_8, aClass722_5, aClass722_10, aClass722_7 };
	}

	@OriginalMember(owner = "client!zy", name = "u", descriptor = "()[Lclient!zy;")
	static Class722[] method37338() {
		return new Class722[] { aClass722_6, aClass722_9, aClass722_8, aClass722_5, aClass722_10, aClass722_7 };
	}

	@OriginalMember(owner = "client!zy", name = "l", descriptor = "(I)Lclient!zy;")
	public static Class722 method37339(@OriginalArg(0) int arg0) {
		@Pc(2) Class722[] local2 = Class177.method24668(1767048064);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class722 local12 = local2[local4];
			if (local12.anInt5829 * 1531299647 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zy", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILclient!adx;)V")
	Class722(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class91 arg3) {
		this.aString247 = arg0;
		this.aString248 = arg1;
		this.anInt5829 = arg2 * -552490817;
	}
}

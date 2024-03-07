package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public class Class467 {

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	public static final int anInt5093 = 29;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
	public static final int anInt5094 = 2;

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
	public static final int anInt5095 = 26;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
	public static final int anInt5096 = 11;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	public static final int anInt5097 = 28;

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
	public static final int anInt5098 = 25;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	public static final int anInt5099 = 21;

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
	public static final int anInt5100 = 15;

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
	public static final int anInt5101 = 5;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
	public static final int anInt5102 = 20;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	public static final int anInt5103 = 9;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public static final int anInt5104 = 23;

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
	public static final int anInt5105 = 10;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	public static final int anInt5106 = 14;

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
	public static final int anInt5107 = 22;

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
	public static final int anInt5108 = 6;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
	public static final int anInt5109 = 24;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
	public static final int anInt5110 = 17;

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
	public static final int anInt5111 = 19;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	public static final int anInt5112 = 16;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	public static final int anInt5113 = 13;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	public static final int anInt5114 = 27;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	public static final int anInt5115 = 8;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
	public static final int anInt5116 = 1;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	public static final int anInt5117 = 3;

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
	public static final int anInt5118 = 4;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 31)
	Class467() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!oo", name = "agm", descriptor = "(Lclient!yf;I)V", line = 10680)
	static final void method29329(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = ((Class47) Class277.aClass32_Sub12_1.method18261(local12, -1822892454)).aString6;
	}

	@OriginalMember(owner = "client!oo", name = "arh", descriptor = "(Lclient!yf;B)V", line = 12957)
	static final void method29330(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(42) boolean local42 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		Class225.method25603(local13, local27, local42, 2128534619);
	}

	@OriginalMember(owner = "client!oo", name = "asd", descriptor = "(Lclient!yf;I)V", line = 13078)
	static final void method29331(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.options.method14363(Class51.options.aClass166_Sub33_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1 ? 1 : 0, (byte) 123);
		Class106_Sub1.method5135(-553042424);
		client.aBoolean601 = false;
	}
}

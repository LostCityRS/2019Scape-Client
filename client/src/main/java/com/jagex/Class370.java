package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public class Class370 {

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "Lclient!jw;")
	static final Class370 aClass370_15 = new Class370(0, Class74.aClass74_85, 2);

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "Lclient!jw;")
	static final Class370 aClass370_13 = new Class370(1, Class74.aClass74_85, Class74.aClass74_85, 2, 3);

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "Lclient!jw;")
	static final Class370 aClass370_7 = new Class370(2, Class74.aClass74_85, 3);

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "Lclient!jw;")
	static final Class370 aClass370_8 = new Class370(3, Class74.aClass74_85, Class74.aClass74_85, 3, 4);

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "Lclient!jw;")
	static final Class370 aClass370_9 = new Class370(4, Class74.aClass74_85, 4);

	@OriginalMember(owner = "client!jw", name = "w", descriptor = "Lclient!jw;")
	static final Class370 aClass370_10 = new Class370(5, Class74.aClass74_85, Class74.aClass74_85, 4, 5);

	@OriginalMember(owner = "client!jw", name = "l", descriptor = "Lclient!jw;")
	static final Class370 aClass370_22 = new Class370(6, Class74.aClass74_85, Class74.aClass74_85, 5, 98, true, true);

	@OriginalMember(owner = "client!jw", name = "u", descriptor = "Lclient!jw;")
	static final Class370 aClass370_11 = new Class370(7, Class74.aClass74_85, 99);

	@OriginalMember(owner = "client!jw", name = "z", descriptor = "Lclient!jw;")
	static final Class370 aClass370_12 = new Class370(8, Class74.aClass74_85, 100);

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "Lclient!jw;")
	static final Class370 aClass370_5 = new Class370(9, Class74.aClass74_104, Class74.aClass74_104, 0, 92, true, true);

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "Lclient!jw;")
	static final Class370 aClass370_14 = new Class370(10, Class74.aClass74_104, Class74.aClass74_104, 92, 93);

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "Lclient!jw;")
	static final Class370 aClass370_20 = new Class370(11, Class74.aClass74_104, Class74.aClass74_104, 94, 95);

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "Lclient!jw;")
	static final Class370 aClass370_16 = new Class370(12, Class74.aClass74_104, Class74.aClass74_104, 96, 97);

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "Lclient!jw;")
	static final Class370 aClass370_17 = new Class370(13, Class74.aClass74_104, 97);

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "Lclient!jw;")
	static final Class370 aClass370_18 = new Class370(14, Class74.aClass74_104, 97);

	@OriginalMember(owner = "client!jw", name = "s", descriptor = "Lclient!jw;")
	static final Class370 aClass370_19 = new Class370(15, Class74.aClass74_104, 100);

	@OriginalMember(owner = "client!jw", name = "y", descriptor = "Lclient!jw;")
	static final Class370 aClass370_6 = new Class370(16, Class74.aClass74_104, 100);

	@OriginalMember(owner = "client!jw", name = "q", descriptor = "Lclient!jw;")
	static final Class370 aClass370_21 = new Class370(17, Class74.aClass74_104, 100);

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "Lclient!acz;")
	final Class74 aClass74_177;

	@OriginalMember(owner = "client!jw", name = "x", descriptor = "I")
	public final int anInt4590;

	@OriginalMember(owner = "client!jw", name = "h", descriptor = "Lclient!acz;")
	final Class74 aClass74_178;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
	final int anInt4591;

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
	final int anInt4592;

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "Z")
	final boolean aBoolean736;

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "Z")
	final boolean aBoolean737;

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "([Ljava/lang/String;[IIII)V", line = 13)
	static void method27992(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(64) String local64 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local64;
				@Pc(78) int local78 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local78;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method27992(arg0, arg1, arg2, local10 - 1, -1781939446);
		method27992(arg0, arg1, local10 + 1, arg3, -1789319955);
	}

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "()[Lclient!jw;", line = 37)
	static Class370[] method27993() {
		return new Class370[] { aClass370_15, aClass370_13, aClass370_7, aClass370_8, aClass370_9, aClass370_10, aClass370_22, aClass370_11, aClass370_12, aClass370_5, aClass370_14, aClass370_20, aClass370_16, aClass370_17, aClass370_18, aClass370_19, aClass370_6, aClass370_21 };
	}

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "(I)[Lclient!jw;", line = 37)
	static Class370[] method27994(@OriginalArg(0) int arg0) {
		return new Class370[] { aClass370_15, aClass370_13, aClass370_7, aClass370_8, aClass370_9, aClass370_10, aClass370_22, aClass370_11, aClass370_12, aClass370_5, aClass370_14, aClass370_20, aClass370_16, aClass370_17, aClass370_18, aClass370_19, aClass370_6, aClass370_21 };
	}

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "()[Lclient!jw;", line = 37)
	static Class370[] method27995() {
		return new Class370[] { aClass370_15, aClass370_13, aClass370_7, aClass370_8, aClass370_9, aClass370_10, aClass370_22, aClass370_11, aClass370_12, aClass370_5, aClass370_14, aClass370_20, aClass370_16, aClass370_17, aClass370_18, aClass370_19, aClass370_6, aClass370_21 };
	}

	@OriginalMember(owner = "client!jw", name = "w", descriptor = "(Lclient!un;I)V", line = 40)
	static void method27996(@OriginalArg(0) Interface63 arg0, @OriginalArg(1) int arg1) {
		while (Class602.aLinkedList5.size() > 10) {
			Class602.aLinkedList5.remove();
		}
		Class602.aLinkedList5.add(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(ILclient!acz;I)V", line = 41)
	Class370(@OriginalArg(0) int arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(ILclient!acz;Lclient!acz;II)V", line = 45)
	Class370(@OriginalArg(0) int arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(ILclient!acz;Lclient!acz;IIZZ)V", line = 48)
	Class370(@OriginalArg(0) int arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4590 = arg0 * -1713782973;
		this.aClass74_177 = arg1;
		this.aClass74_178 = arg2;
		this.anInt4591 = arg3 * -780450739;
		this.anInt4592 = arg4 * -614044493;
		this.aBoolean736 = arg5;
		this.aBoolean737 = arg6;
	}

	@OriginalMember(owner = "client!jw", name = "ad", descriptor = "(I)Lclient!arm;", line = 1066)
	public static Class93_Sub1_Sub7 method27997(@OriginalArg(0) int arg0) {
		return Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4;
	}

	@OriginalMember(owner = "client!jw", name = "nj", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7358)
	static final void method27998(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray6 = Class499.method30149(local13, arg2, 166262505);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!jw", name = "adm", descriptor = "(Lclient!yf;I)V", line = 10180)
	static final void method27999(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(31) int local31 = client.aClass531ArrayArray1[local23][local13].method30429(1054603989);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local31 == 0 ? 1 : 0;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class313 implements Interface75 {

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "[Lclient!cm;")
	static Class99[] aClass99Array4;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "Lclient!hh;")
	public static final Class313 aClass313_2 = new Class313(0, 0);

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "Lclient!hh;")
	public static final Class313 aClass313_1 = new Class313(2, 1);

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!hh;")
	static final Class313 aClass313_3 = new Class313(1, 2);

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
	public final int anInt4019;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
	final int anInt4018;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "()[Lclient!hh;")
	static Class313[] method27476() {
		return new Class313[] { aClass313_2, aClass313_3, aClass313_1 };
	}

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "()[Lclient!hh;")
	static Class313[] method27477() {
		return new Class313[] { aClass313_2, aClass313_3, aClass313_1 };
	}

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "()[Lclient!hh;")
	static Class313[] method27478() {
		return new Class313[] { aClass313_2, aClass313_3, aClass313_1 };
	}

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "(I)V")
	static void method27479(@OriginalArg(0) int arg0) {
		if (Class149.anInt1525 * 1439733989 <= 0) {
			Class149.aString48 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Class149.aStringArray16.length; local7++) {
			if (Class149.aStringArray16[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == Class149.anInt1525 * 1439733989) {
					Class149.aString48 = Class149.aStringArray16[local7].substring(Class149.aStringArray16[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "oe", descriptor = "(Lclient!yp;I)V")
	static void method27480(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class11.method335(local11, local14, arg0, 580847247);
	}

	@OriginalMember(owner = "client!hh", name = "avv", descriptor = "(Lclient!yp;I)V")
	static void method27481(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		client.aShort158 = (short) arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		if (client.aShort158 <= 0) {
			client.aShort158 = 256;
		}
		client.aShort159 = (short) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (client.aShort159 <= 0) {
			client.aShort159 = 320;
		}
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method27482(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = Class68.method1249(arg0, arg1, (byte) 0);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "(IIII)I")
	static int method27483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(8) int local8 = 128 - arg2;
		@Pc(22) int local22 = (arg0 & 0x7F) * local8 + arg2 * (arg1 & 0x7F) >> 7;
		@Pc(36) int local36 = (arg1 & 0x380) * arg2 + (arg0 & 0x380) * local8 >> 7;
		@Pc(50) int local50 = (arg1 & 0xFC00) * arg2 + local8 * (arg0 & 0xFC00) >> 7;
		return local50 & 0xFC00 | local36 & 0x380 | local22 & 0x7F;
	}

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "(Lclient!he;Lclient!hx;B)V")
	static void method27484(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(77) int local77;
		if (arg1.anInt4094 * 2071556223 == -1) {
			@Pc(123) Class327[] local123 = arg0.method27454(-1799955895);
			for (local77 = 0; local77 < local123.length && arg1 != local123[local77]; local77++) {
			}
			if (local77 >= local123.length) {
				return;
			}
			Class718.method37247(local123, local77 + 1, local123, local77, local123.length - local77 - 1);
			local123[local123.length - 1] = arg1;
			return;
		}
		@Pc(15) Class327 local15 = arg0.method27456(arg1.anInt4082 * 254495303, 2036747717);
		if (local15 == null) {
			return;
		}
		if (local15.aClass327Array3 == local15.aClass327Array4) {
			local15.aClass327Array4 = new Class327[local15.aClass327Array3.length];
			local15.aClass327Array4[local15.aClass327Array4.length - 1] = arg1;
			Class718.method37247(local15.aClass327Array3, 0, local15.aClass327Array4, 0, arg1.anInt4094 * 2071556223);
			Class718.method37247(local15.aClass327Array3, arg1.anInt4094 * 2071556223 + 1, local15.aClass327Array4, arg1.anInt4094 * 2071556223, local15.aClass327Array3.length - arg1.anInt4094 * 2071556223 - 1);
			return;
		}
		local77 = 0;
		@Pc(80) Class327[] local80 = local15.aClass327Array4;
		while (local77 < local80.length && local80[local77] != arg1) {
			local77++;
		}
		if (local77 >= local80.length) {
			return;
		}
		Class718.method37247(local80, local77 + 1, local80, local77, local80.length - local77 - 1);
		local80[local15.aClass327Array4.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!hh", name = "gq", descriptor = "(I)V")
	static void method27485(@OriginalArg(0) int arg0) {
		@Pc(1) int[] local1 = Class51.anIntArray20;
		@Pc(3) int local3;
		for (local3 = 0; local3 < Class51.anInt191 * 44967471; local3++) {
			@Pc(14) Class120_Sub1_Sub1_Sub1_Sub2 local14 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local1[local3]];
			if (local14 != null) {
				local14.method18995(821185812);
			}
		}
		for (local3 = 0; local3 < client.anInt3453 * -1702559601; local3++) {
			@Pc(34) long local34 = (long) client.anIntArray304[local3];
			@Pc(39) Class80_Sub19 local39 = (Class80_Sub19) client.aClass24_18.method560(local34);
			if (local39 != null) {
				((Class120_Sub1_Sub1_Sub1) local39.anObject5).method18995(840593779);
			}
		}
		if (client.anInt3541 * -1330995431 != 0) {
			return;
		}
		for (local3 = 0; local3 < Class251.aClass254Array1.length; local3++) {
			@Pc(63) Class254 local63 = Class251.aClass254Array1[local3];
			if (local63.aBoolean775) {
				local63.method26399((byte) -40).method18995(-553269397);
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "nv", descriptor = "(II)Lclient!adt;")
	public static Class88 method27486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class88 local5 = (Class88) client.aClass243_69.method26282((long) arg0);
		if (local5 == null) {
			local5 = new Class88(Class688.aClass480_135, arg0);
		}
		return local5;
	}

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "(Lclient!oq;B)F")
	public static float method27487(@OriginalArg(0) Class466 arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat297, (double) local4.aFloat296);
		local4.method29557();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(II)V")
	Class313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4019 = arg0 * 66096393;
		this.anInt4018 = arg1 * -1510156523;
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt4018 * -1477590979;
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt4018 * -1477590979;
	}

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt4018 * -1477590979;
	}
}

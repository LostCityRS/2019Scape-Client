package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public class Class275 {

	@OriginalMember(owner = "client!ft", name = "fm", descriptor = "Lclient!px;")
	public static Class496 aClass496_1;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Lclient!ft;")
	static final Class275 aClass275_10 = new Class275();

	@OriginalMember(owner = "client!ft", name = "n", descriptor = "Lclient!ft;")
	static final Class275 aClass275_2 = new Class275();

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "Lclient!ft;")
	static final Class275 aClass275_3 = new Class275();

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Lclient!ft;")
	static final Class275 aClass275_4 = new Class275();

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Lclient!ft;")
	static final Class275 aClass275_11 = new Class275();

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "Lclient!ft;")
	static final Class275 aClass275_6 = new Class275();

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "Lclient!ft;")
	static final Class275 aClass275_1 = new Class275();

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "Lclient!ft;")
	static final Class275 aClass275_8 = new Class275();

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "Lclient!ft;")
	public static final Class275 aClass275_9 = new Class275();

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "Lclient!ft;")
	public static final Class275 aClass275_13 = new Class275();

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "Lclient!ft;")
	static final Class275 aClass275_5 = new Class275();

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Lclient!ft;")
	static final Class275 aClass275_7 = new Class275();

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "Lclient!ft;")
	static final Class275 aClass275_12 = new Class275();

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V", line = 18)
	Class275() {
	}

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "(I)V", line = 147)
	public static void method26341(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = Class330.aClass240_79;
		synchronized (Class330.aClass240_79) {
			Class330.aClass240_79.method25847((byte) -106);
		}
	}

	@OriginalMember(owner = "client!ft", name = "ej", descriptor = "(ZB)V", line = 819)
	static void method26342(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class611 local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20024(1927066028);
		@Pc(13) Class93_Sub1_Sub20 local13 = Class159_Sub1.method14518(local3.anInt5623 * 270611681, local3.anInt5624 * -1994307635);
		if (local13 == null) {
			local13 = Class159_Sub1.method14520(Class159_Sub1.aClass637_2.anInt5747 * 267023917);
		}
		if (Class602.aClass93_Sub1_Sub20_4 == local13 && !arg0) {
			return;
		}
		Class602.aClass93_Sub1_Sub20_4 = local13;
		@Pc(32) boolean local32 = Class159_Sub1.method14516(local13);
		if (local32) {
			Class159_Sub1.aBoolean348 = true;
			Class47.method905((byte) -109);
		}
	}

	@OriginalMember(owner = "client!ft", name = "el", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5733)
	static final void method26343(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4035 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * -719744481;
		Class354.method27694(arg0, -1174743804);
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class502.method30174(arg0.anInt3953 * -1549590237, -235547912);
		}
	}

	@OriginalMember(owner = "client!ft", name = "aay", descriptor = "(Lclient!yf;I)V", line = 9776)
	static final void method26344(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.aString144 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = client.aString144;
		}
	}
}

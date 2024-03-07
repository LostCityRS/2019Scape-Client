package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public class Class529 {

	@OriginalMember(owner = "client!rg", name = "pe", descriptor = "I")
	public static int userMembersStats;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!rg;")
	static final Class529 aClass529_3 = new Class529();

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Lclient!rg;")
	public static final Class529 aClass529_2 = new Class529();

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Lclient!rg;")
	public static final Class529 aClass529_1 = new Class529();

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!rg;")
	static final Class529 aClass529_4 = new Class529();

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 9)
	Class529() {
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)[Lclient!aaa;", line = 14)
	static Class3[] method30397(@OriginalArg(0) byte arg0) {
		return new Class3[] { Class3.aClass3_4, Class3.aClass3_1, Class3.aClass3_2, Class3.aClass3_3, Class3.aClass3_5 };
	}

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "(II)Lclient!zd;", line = 29)
	public static Class702 method30398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class702[] local2 = Class520.method30328((byte) -91);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class702 local12 = local2[local4];
			if (arg0 == local12.id * -1111983921) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "(IS)I", line = 43)
	static final int method30399(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		return arg0 < 7 ? 8 : 11;
	}

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "(I)Z", line = 226)
	static boolean method30400(@OriginalArg(0) int arg0) {
		Class411.target = -1680223351;
		Class411.connection = client.aClass175_2;
		return Class507.method30229(Class411.ssoKeyIdentifier * 4457507688757033075L == -1L, true, "", "", Class411.ssoKeyIdentifier * 4457507688757033075L);
	}

	@OriginalMember(owner = "client!rg", name = "ze", descriptor = "(Lclient!yf;I)V", line = 9534)
	static final void method30401(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(47) String local47 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(60) Class39 local60 = (Class39) Class19.aClass32_Sub7_5.method18261(local23, 493731023);
		if (local60.aClass519_2.getId() != local13) {
			throw new RuntimeException();
		} else if (local60.aClass519_1.getId() == Class519.aClass519_7.getId()) {
			@Pc(84) int[] local84 = local60.method764(local47, -1497248091);
			if (local33 < 0 || local84 == null || local84.length <= local33) {
				throw new RuntimeException();
			}
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local84[local33];
		} else {
			throw new RuntimeException();
		}
	}
}

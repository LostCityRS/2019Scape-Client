package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abq")
public class Class43 {

	@OriginalMember(owner = "client!abq", name = "e", descriptor = "Lclient!abq;")
	static final Class43 aClass43_2 = new Class43();

	@OriginalMember(owner = "client!abq", name = "n", descriptor = "Lclient!abq;")
	static final Class43 aClass43_3 = new Class43();

	@OriginalMember(owner = "client!abq", name = "m", descriptor = "Lclient!abq;")
	static final Class43 aClass43_4 = new Class43();

	@OriginalMember(owner = "client!abq", name = "k", descriptor = "Lclient!abq;")
	static final Class43 aClass43_1 = new Class43();

	@OriginalMember(owner = "client!abq", name = "<init>", descriptor = "()V", line = 9)
	Class43() {
	}

	@OriginalMember(owner = "client!abq", name = "e", descriptor = "(Lclient!rn;I)V", line = 16)
	public static void method842(@OriginalArg(0) Interface57 arg0, @OriginalArg(1) int arg1) {
		if (Class525.anInterface57_1 != null) {
			throw new IllegalStateException("");
		}
		Class525.anInterface57_1 = arg0;
	}

	@OriginalMember(owner = "client!abq", name = "ahc", descriptor = "(Lclient!yf;I)V", line = 10799)
	static final void method843(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.get(local12, 686249143);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.aBoolean20 ? 1 : 0;
	}

	@OriginalMember(owner = "client!abq", name = "atc", descriptor = "(Lclient!yf;I)V", line = 13261)
	static final void method844(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
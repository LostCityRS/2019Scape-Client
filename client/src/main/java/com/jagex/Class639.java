package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class Class639 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!wl;")
	static final Class639 aClass639_4 = new Class639(0);

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Lclient!wl;")
	static final Class639 aClass639_2 = new Class639(1);

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "Lclient!wl;")
	public static final Class639 aClass639_3 = new Class639(2);

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V", line = 29)
	Class639(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wl", name = "fg", descriptor = "(II)I", line = 979)
	public static int method32467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class159_Sub1.anInt1954 * -1423765151) {
			return Class159_Sub1.aBoolean357 ? 1 : 0;
		} else if (Class159_Sub1.anInt1945 * -1301134369 == arg0) {
			return Class159_Sub1.aBoolean350 ? 1 : 0;
		} else if (Class159_Sub1.anInt1957 * 778360671 == arg0) {
			return Class159_Sub1.aBoolean349 ? 1 : 0;
		} else {
			return -1;
		}
	}
}

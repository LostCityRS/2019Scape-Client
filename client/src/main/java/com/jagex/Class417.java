package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class417 {

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "Lclient!mh;")
	public static final Class417 aClass417_1 = new Class417(2);

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!mh;")
	public static final Class417 aClass417_2 = new Class417(3);

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!mh;")
	public static final Class417 aClass417_3 = new Class417(0);

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "Lclient!mh;")
	public static final Class417 aClass417_4 = new Class417(1);

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	public final int anInt4625;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I)V")
	Class417(@OriginalArg(0) int arg0) {
		this.anInt4625 = arg0;
	}
}

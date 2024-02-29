package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class Class415 {

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!me;")
	public static final Class415 aClass415_4 = new Class415(0);

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!me;")
	public static final Class415 aClass415_6 = new Class415(3);

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Lclient!me;")
	public static final Class415 aClass415_5 = new Class415(1);

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!me;")
	public static final Class415 aClass415_7 = new Class415(2);

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public final int anInt4761;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V", line = 11)
	Class415(@OriginalArg(0) int arg0) {
		this.anInt4761 = arg0;
	}
}

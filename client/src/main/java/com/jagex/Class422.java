package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class Class422 {

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "Lclient!mn;")
	public static final Class422 aClass422_2 = new Class422(0);

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "Lclient!mn;")
	public static final Class422 aClass422_1 = new Class422(1);

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "Lclient!mn;")
	public static final Class422 aClass422_3 = new Class422(3);

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "Lclient!mn;")
	public static final Class422 aClass422_4 = new Class422(2);

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
	public final int anInt4772;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V", line = 11)
	Class422(@OriginalArg(0) int arg0) {
		this.anInt4772 = arg0;
	}
}

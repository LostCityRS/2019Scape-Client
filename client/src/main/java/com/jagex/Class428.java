package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!my")
public final class Class428 {

	@OriginalMember(owner = "client!my", name = "t", descriptor = "Lclient!my;")
	public static final Class428 aClass428_5 = new Class428(3);

	@OriginalMember(owner = "client!my", name = "f", descriptor = "Lclient!my;")
	public static final Class428 aClass428_4 = new Class428(0);

	@OriginalMember(owner = "client!my", name = "e", descriptor = "Lclient!my;")
	public static final Class428 aClass428_7 = new Class428(2);

	@OriginalMember(owner = "client!my", name = "u", descriptor = "Lclient!my;")
	public static final Class428 aClass428_6 = new Class428(1);

	@OriginalMember(owner = "client!my", name = "l", descriptor = "I")
	public final int anInt4637;

	@OriginalMember(owner = "client!my", name = "<init>", descriptor = "(I)V")
	Class428(@OriginalArg(0) int arg0) {
		this.anInt4637 = arg0;
	}
}

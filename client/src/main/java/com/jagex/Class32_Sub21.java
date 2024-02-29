package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aoz")
public class Class32_Sub21 extends Class32 {

	@OriginalMember(owner = "client!aoz", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;)V", line = 12)
	public Class32_Sub21(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2) {
		super(arg0, arg1, arg2, Class667.aClass667_43, 64, new Class52(Class87.class));
	}

	@OriginalMember(owner = "client!aoz", name = "e", descriptor = "(B)[Lclient!iw;", line = 12)
	static Class351[] method17587(@OriginalArg(0) byte arg0) {
		return new Class351[] { Class351.aClass351_1, Class351.aClass351_2, Class351.aClass351_3 };
	}
}

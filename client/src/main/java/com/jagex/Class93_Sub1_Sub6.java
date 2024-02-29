package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ark")
public class Class93_Sub1_Sub6 extends Class93_Sub1 {

	@OriginalMember(owner = "client!ark", name = "l", descriptor = "Lclient!aue;")
	Class132_Sub1_Sub1_Sub4 aClass132_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ark", name = "<init>", descriptor = "(Lclient!aue;)V", line = 12551)
	public Class93_Sub1_Sub6(@OriginalArg(0) Class132_Sub1_Sub1_Sub4 arg0) {
		this.aClass132_Sub1_Sub1_Sub4_1 = arg0;
	}
}

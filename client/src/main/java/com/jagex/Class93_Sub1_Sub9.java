package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arq")
public class Class93_Sub1_Sub9 extends Class93_Sub1 {

	@OriginalMember(owner = "client!arq", name = "l", descriptor = "Lclient!aur;")
	Class132_Sub1_Sub1_Sub5 aClass132_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!arq", name = "<init>", descriptor = "(Lclient!aur;)V", line = 12559)
	public Class93_Sub1_Sub9(@OriginalArg(0) Class132_Sub1_Sub1_Sub5 arg0) {
		this.aClass132_Sub1_Sub1_Sub5_1 = arg0;
	}
}

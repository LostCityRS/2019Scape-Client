package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ari")
public final class Class80_Sub1_Sub6 extends Class80_Sub1 {

	@OriginalMember(owner = "client!ari", name = "i", descriptor = "Lclient!aue;")
	Class120_Sub1_Sub1_Sub4 aClass120_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ari", name = "<init>", descriptor = "(Lclient!aue;)V")
	public Class80_Sub1_Sub6(@OriginalArg(0) Class120_Sub1_Sub1_Sub4 arg0) {
		this.aClass120_Sub1_Sub1_Sub4_1 = arg0;
	}
}

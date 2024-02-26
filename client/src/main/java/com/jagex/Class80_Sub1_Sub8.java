package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arq")
public final class Class80_Sub1_Sub8 extends Class80_Sub1 {

	@OriginalMember(owner = "client!arq", name = "i", descriptor = "Lclient!aui;")
	Class120_Sub1_Sub1_Sub5 aClass120_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!arq", name = "b", descriptor = "(B)Z")
	static boolean method22029(@OriginalArg(0) byte arg0) {
		return Class630.anInt5553 * 721317679 > 0;
	}

	@OriginalMember(owner = "client!arq", name = "<init>", descriptor = "(Lclient!aui;)V")
	public Class80_Sub1_Sub8(@OriginalArg(0) Class120_Sub1_Sub1_Sub5 arg0) {
		this.aClass120_Sub1_Sub1_Sub5_1 = arg0;
	}
}

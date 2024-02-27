package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public interface Interface62 {

	@OriginalMember(owner = "client!td", name = "n", descriptor = "(Lclient!ash;)Z")
	boolean method31547(@OriginalArg(0) Class132_Sub1_Sub1 arg0);

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(Lclient!ash;I)Z")
	boolean method31548(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1);
}

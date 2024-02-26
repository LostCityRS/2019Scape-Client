package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class Class135 implements Interface35 {

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[Lclient!lf;")
	public final Class397[] aClass397Array3;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([Lclient!lf;)V")
	Class135(@OriginalArg(0) Class397[] arg0) {
		this.aClass397Array3 = arg0;
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public abstract class Class145 implements Interface34 {

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "[Lclient!lk;")
	public final Class400[] aClass400Array3;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "([Lclient!lk;)V", line = 7)
	Class145(@OriginalArg(0) Class400[] arg0) {
		this.aClass400Array3 = arg0;
	}
}

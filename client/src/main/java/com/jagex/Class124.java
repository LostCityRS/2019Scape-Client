package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class Class124 {

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!lb;")
	public Interface34 anInterface34_20;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!afa;")
	protected Class102_Sub1 aClass102_Sub1_19;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class124(@OriginalArg(0) Class102_Sub1 arg0) {
		this.aClass102_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "()V")
	public abstract void method10374();

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "()V")
	public abstract void method10375();

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "()V")
	public abstract void method10376();
}

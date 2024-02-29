package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jz")
public abstract class Class130 {

	@OriginalMember(owner = "client!jz", name = "n", descriptor = "Lclient!lz;")
	public Interface38 anInterface38_12;

	@OriginalMember(owner = "client!jz", name = "e", descriptor = "Lclient!afc;")
	protected Class104_Sub2 aClass104_Sub2_14;

	@OriginalMember(owner = "client!jz", name = "<init>", descriptor = "(Lclient!afc;)V", line = 10)
	Class130(@OriginalArg(0) Class104_Sub2 arg0) {
		this.aClass104_Sub2_14 = arg0;
	}

	@OriginalMember(owner = "client!jz", name = "n", descriptor = "()V")
	public abstract void method10024();

	@OriginalMember(owner = "client!jz", name = "e", descriptor = "()V")
	public abstract void method10025();

	@OriginalMember(owner = "client!jz", name = "m", descriptor = "()V")
	public abstract void method10026();

	@OriginalMember(owner = "client!jz", name = "k", descriptor = "()V")
	public abstract void method10027();
}

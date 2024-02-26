package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afb")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!afb", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub1(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!afb", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class132.method10372(true, -1982689620);
	}

	@OriginalMember(owner = "client!afb", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class132.method10372(true, 1931236785);
	}

	@OriginalMember(owner = "client!afb", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class132.method10372(true, 1858466911);
	}
}

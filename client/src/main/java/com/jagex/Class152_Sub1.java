package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ala")
public final class Class152_Sub1 extends Class152 implements Interface4 {

	@OriginalMember(owner = "client!ala", name = "r", descriptor = "S")
	static short aShort99;

	@OriginalMember(owner = "client!ala", name = "<init>", descriptor = "(Lclient!py;)V")
	Class152_Sub1(@OriginalArg(0) Class497 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ala", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27797(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class608(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ala", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;")
	@Override
	public Interface13 method27796(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class608(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ala", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27795(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class608(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ala", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27793(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class608(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ala", name = "o", descriptor = "(B)Ljava/lang/Class;")
	@Override
	public Class method27794(@OriginalArg(0) byte arg0) {
		return Class608.class;
	}

	@OriginalMember(owner = "client!ala", name = "x", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method27798() {
		return Class608.class;
	}
}

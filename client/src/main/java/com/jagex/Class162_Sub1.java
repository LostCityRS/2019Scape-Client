package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alo")
public class Class162_Sub1 extends Class162 implements Interface4 {

	@OriginalMember(owner = "client!alo", name = "<init>", descriptor = "(Lclient!py;)V", line = 76)
	Class162_Sub1(@OriginalArg(0) Class497 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alo", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 80)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class661(arg0, this);
	}

	@OriginalMember(owner = "client!alo", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 80)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class661(arg0, this);
	}

	@OriginalMember(owner = "client!alo", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 80)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class661(arg0, this);
	}

	@OriginalMember(owner = "client!alo", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 80)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class661(arg0, this);
	}

	@OriginalMember(owner = "client!alo", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 84)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return Class661.class;
	}

	@OriginalMember(owner = "client!alo", name = "x", descriptor = "()Ljava/lang/Class;", line = 84)
	@Override
	public Class method27705() {
		return Class661.class;
	}
}

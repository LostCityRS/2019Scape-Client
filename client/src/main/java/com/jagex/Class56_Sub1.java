package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apq")
public class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!apq", name = "<init>", descriptor = "(Lclient!py;I)V", line = 127)
	Class56_Sub1(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!apq", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 131)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class65(arg0, this);
	}

	@OriginalMember(owner = "client!apq", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 131)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class65(arg0, this);
	}

	@OriginalMember(owner = "client!apq", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 131)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class65(arg0, this);
	}

	@OriginalMember(owner = "client!apq", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 131)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class65(arg0, this);
	}

	@OriginalMember(owner = "client!apq", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 135)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return Class65.class;
	}

	@OriginalMember(owner = "client!apq", name = "x", descriptor = "()Ljava/lang/Class;", line = 135)
	@Override
	public Class method27705() {
		return Class65.class;
	}
}

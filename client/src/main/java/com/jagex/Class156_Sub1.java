package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ale")
public class Class156_Sub1 extends Class156 implements Interface4 {

	@OriginalMember(owner = "client!ale", name = "<init>", descriptor = "(Lclient!py;)V", line = 118)
	Class156_Sub1(@OriginalArg(0) Class497 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ale", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 122)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class596(arg0, this);
	}

	@OriginalMember(owner = "client!ale", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 122)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class596(arg0, this);
	}

	@OriginalMember(owner = "client!ale", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 122)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class596(arg0, this);
	}

	@OriginalMember(owner = "client!ale", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 122)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class596(arg0, this);
	}

	@OriginalMember(owner = "client!ale", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 126)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return Class596.class;
	}

	@OriginalMember(owner = "client!ale", name = "x", descriptor = "()Ljava/lang/Class;", line = 126)
	@Override
	public Class method27705() {
		return Class596.class;
	}
}

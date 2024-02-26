package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alm")
public final class Class156_Sub1 extends Class156 implements Interface3 {

	@OriginalMember(owner = "client!alm", name = "<init>", descriptor = "(Lclient!pf;)V")
	Class156_Sub1(@OriginalArg(0) Class480 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alm", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class613.class;
	}

	@OriginalMember(owner = "client!alm", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class613(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alm", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class613(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alm", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class613.class;
	}

	@OriginalMember(owner = "client!alm", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class613(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alm", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class613(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alm", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class613.class;
	}

	@OriginalMember(owner = "client!alm", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class613(arg0, this, arg1);
	}
}

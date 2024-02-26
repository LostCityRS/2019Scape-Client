package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alg")
public final class Class154_Sub1 extends Class154 implements Interface3 {

	@OriginalMember(owner = "client!alg", name = "p", descriptor = "(IB)V")
	public static void method14998(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(11, (long) arg0);
		local4.method22078(-1541480553);
	}

	@OriginalMember(owner = "client!alg", name = "<init>", descriptor = "(Lclient!pf;)V")
	Class154_Sub1(@OriginalArg(0) Class480 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alg", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class674.class;
	}

	@OriginalMember(owner = "client!alg", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class674(arg0, this);
	}

	@OriginalMember(owner = "client!alg", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class674.class;
	}

	@OriginalMember(owner = "client!alg", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class674(arg0, this);
	}

	@OriginalMember(owner = "client!alg", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class674.class;
	}

	@OriginalMember(owner = "client!alg", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class674(arg0, this);
	}

	@OriginalMember(owner = "client!alg", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class674(arg0, this);
	}

	@OriginalMember(owner = "client!alg", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class674(arg0, this);
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.util.Map;

@OriginalClass("client!ahx")
public final class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!ahx", name = "<init>", descriptor = "(Ljava/util/Map;)V")
	Class132_Sub1(@OriginalArg(0) Map arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahx", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class374.class;
	}

	@OriginalMember(owner = "client!ahx", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class374(arg0, this);
	}

	@OriginalMember(owner = "client!ahx", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class374(arg0, this);
	}

	@OriginalMember(owner = "client!ahx", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class374.class;
	}

	@OriginalMember(owner = "client!ahx", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class374.class;
	}

	@OriginalMember(owner = "client!ahx", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class374(arg0, this);
	}

	@OriginalMember(owner = "client!ahx", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class374(arg0, this);
	}

	@OriginalMember(owner = "client!ahx", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class374(arg0, this);
	}
}
